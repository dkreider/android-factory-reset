package androidadministration.com.deviceadministrator;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Daniel Kreider on 01/02/18.
 */

public class DeviceAdministrator extends DeviceAdminReceiver {

    @Override
    public void onDisabled(Context context, Intent intent) {

        super.onDisabled(context, intent);
        Toast.makeText(context, "Device admin has been disabled.", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onEnabled(Context context, Intent intent) {

        super.onEnabled(context, intent);
        Toast.makeText(context, "Device admin has been enabled.", Toast.LENGTH_SHORT).show();

    }
}
