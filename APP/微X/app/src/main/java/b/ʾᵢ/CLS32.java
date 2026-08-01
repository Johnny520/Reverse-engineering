// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Iterator;

public final class CLS32 {
    public static void MTH1039(NotificationManager notificationManager0, String s) {
        notificationManager0.deleteNotificationChannel(s);
    }

    public static Iterator MTH1040(DirectoryStream directoryStream0) {
        return directoryStream0.iterator();
    }

    public static void MTH1041(Notification.Builder notification$Builder0, String s) {
        notification$Builder0.setChannelId(s);
    }

    public static long MTH1042(ChronoUnit chronoUnit0, Instant instant0, Instant instant1) {
        return chronoUnit0.between(instant0, instant1);
    }

    public static void MTH1043(Vibrator vibrator0, VibrationEffect vibrationEffect0) {
        vibrator0.vibrate(vibrationEffect0);
    }

    public static Path MTH1044(File file0) {
        return file0.toPath();
    }

    public static boolean MTH1045(Path path0, LinkOption[] arr_linkOption) {
        return Files.isDirectory(path0, arr_linkOption);
    }

    public static VibrationEffect MTH1046(long v) {
        return VibrationEffect.createOneShot(v, -1);
    }

    public static void MTH1047(DirectoryStream directoryStream0) {
        directoryStream0.close();
    }

    public static NotificationChannel MTH1048(NotificationManager notificationManager0, String s) {
        return notificationManager0.getNotificationChannel(s);
    }

    public static DirectoryStream MTH1049(Path path0) {
        return Files.newDirectoryStream(path0);
    }

    public static ChronoUnit MTH1050() {
        return ChronoUnit.DAYS;
    }

    public static Instant MTH1051(Date date0) {
        return date0.toInstant();
    }
}

