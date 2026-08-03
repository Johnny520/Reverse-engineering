package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3025 {

    /* JADX INFO: renamed from: ۥ */
    @Deprecated
    public static final int f41 = 128;

    /* JADX INFO: renamed from: ۥ۟ */
    @Deprecated
    public static final int f42 = 256;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Deprecated
    public static final int f4395 = 512;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Deprecated
    public static final int f4396 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Deprecated
    public static final int f4397 = 2048;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Deprecated
    public static final int f4398 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Deprecated
    public static final int f4399 = 8192;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f4400 = 16384;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f4401 = 32768;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f4402 = 65536;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f4403 = 131072;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f4404 = 262144;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f4405 = 524288;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f4406 = 1048576;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f4407 = 2097152;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f4408 = 4194304;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f4409 = 8388608;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f4410 = 16777216;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f4411 = 67108864;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f4412 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f4413 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f4414 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f4415 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f4416 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f4417 = 16;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f4418 = 32;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f4419 = 64;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f4420 = 128;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f4421 = 256;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f4422 = 512;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f4423 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f4424 = 2048;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f4425 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f4426 = -1;

    /* JADX INFO: renamed from: Yue.ۥۣۣ۟۟$ۥ */
    @InterfaceC7113(34)
    public static class C0030 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m89(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m90(AccessibilityEvent accessibilityEvent, boolean z) {
            accessibilityEvent.setAccessibilityDataSensitive(z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣ۟۟$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0031 {
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static void m87(AccessibilityEvent accessibilityEvent, C3068 c3068) {
        accessibilityEvent.appendRecord((AccessibilityRecord) c3068.m6176());
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static C3068 m88(AccessibilityEvent accessibilityEvent) {
        return new C3068(accessibilityEvent);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m5928(@InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m5929(@InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m5930(@InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C3068 m5931(AccessibilityEvent accessibilityEvent, int i) {
        return new C3068(accessibilityEvent.getRecord(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m5932(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m5933(@InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C0030.m89(accessibilityEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m5934(@InterfaceC6391 AccessibilityEvent accessibilityEvent, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            C0030.m90(accessibilityEvent, z);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m5935(@InterfaceC6391 AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setAction(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m5936(@InterfaceC6391 AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m5937(@InterfaceC6391 AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setMovementGranularity(i);
    }
}
