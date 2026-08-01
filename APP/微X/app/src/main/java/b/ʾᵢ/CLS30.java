// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class CLS30 {
    public static void MTH950(Notification.Builder notification$Builder0) {
        notification$Builder0.setPriority(2);
    }

    public static Notification MTH951(Notification.Builder notification$Builder0) {
        return notification$Builder0.build();
    }

    public static void MTH952(Notification.Builder notification$Builder0, String s, PendingIntent pendingIntent0) {
        notification$Builder0.addAction(0x1080052, s, pendingIntent0);
    }

    public static void MTH953(ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0) {
        ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
    }

    public static ClipData MTH954(Intent intent0) {
        return intent0.getClipData();
    }

    public static void MTH955(Notification.Builder notification$Builder0) {
        notification$Builder0.setPriority(0);
    }

    public static void MTH956(View view0, Drawable drawable0) {
        view0.setBackground(drawable0);
    }

    public static void MTH957(View view0) {
        view0.setBackground(null);
    }
}

