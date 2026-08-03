package Yue;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4425 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f888 = 3840;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f889 = 2160;

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۢۨ$ۥ */
    @InterfaceC7113(23)
    public static class C0404 {
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public static C0405 m1375(@InterfaceC6391 Context context, @InterfaceC6391 Display display) {
            Display.Mode mode = display.getMode();
            Point pointM1373 = C4425.m1373(context, display);
            return (pointM1373 == null || m12886(mode, pointM1373)) ? new C0405(mode, true) : new C0405(mode, pointM1373);
        }

        @InterfaceC6391
        @SuppressLint({"ArrayReturn"})
        /* JADX INFO: renamed from: ۥ۟ */
        public static C0405[] m1376(@InterfaceC6391 Context context, @InterfaceC6391 Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            C0405[] c0405Arr = new C0405[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point pointM1373 = C4425.m1373(context, display);
            if (pointM1373 == null || m12886(mode, pointM1373)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    c0405Arr[i] = new C0405(supportedModes[i], m12887(supportedModes[i], mode));
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    c0405Arr[i2] = m12887(supportedModes[i2], mode) ? new C0405(supportedModes[i2], pointM1373) : new C0405(supportedModes[i2], false);
                }
            }
            return c0405Arr;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m12885(@InterfaceC6391 Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m12886(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m12887(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static Point m1373(@InterfaceC6391 Context context, @InterfaceC6391 Display display) {
        Point pointM12884 = Build.VERSION.SDK_INT < 28 ? m12884("sys.display-size", display) : m12884("vendor.display-size", display);
        if (pointM12884 != null) {
            return pointM12884;
        }
        if (m12881(context) && m12880(display)) {
            return new Point(f888, f889);
        }
        return null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static Point m1374(@InterfaceC6391 Context context, @InterfaceC6391 Display display) {
        Point pointM1373 = m1373(context, display);
        if (pointM1373 != null) {
            return pointM1373;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C0405 m12877(@InterfaceC6391 Context context, @InterfaceC6391 Display display) {
        return C0404.m1375(context, display);
    }

    @InterfaceC6391
    @SuppressLint({"ArrayReturn"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C0405[] m12878(@InterfaceC6391 Context context, @InterfaceC6391 Display display) {
        return C0404.m1376(context, display);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m12879(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m12880(@InterfaceC6391 Display display) {
        return C0404.m12885(display);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m12881(@InterfaceC6391 Context context) {
        return m12882(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m12882(@InterfaceC6391 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Point m12883(@InterfaceC6391 String str) throws NumberFormatException {
        String[] strArrSplit = str.trim().split("x", -1);
        if (strArrSplit.length == 2) {
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            if (i > 0 && i2 > 0) {
                return new Point(i, i2);
            }
        }
        throw new NumberFormatException();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Point m12884(@InterfaceC6391 String str, @InterfaceC6391 Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String strM12879 = m12879(str);
        if (!TextUtils.isEmpty(strM12879) && strM12879 != null) {
            try {
                return m12883(strM12879);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۢۨ$ۥ۟ */
    public static final class C0405 {

        /* JADX INFO: renamed from: ۥ */
        public final Display.Mode f890;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Point f891;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean f9160;

        /* JADX INFO: renamed from: Yue.ۥ۠۟ۢۨ$ۥ۟$ۥ, reason: contains not printable characters */
        @InterfaceC7113(23)
        public static class C4426 {
            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static int m1379(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static int m1380(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0405(@InterfaceC6391 Point point) {
            C6740.m21416(point, "physicalSize == null");
            this.f891 = point;
            this.f890 = null;
            this.f9160 = true;
        }

        /* JADX INFO: renamed from: ۥ */
        public int m1377() {
            return this.f891.y;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m1378() {
            return this.f891.x;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m12888() {
            return this.f9160;
        }

        @InterfaceC6490
        @InterfaceC7113(23)
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Display.Mode m12889() {
            return this.f890;
        }

        @InterfaceC7113(23)
        public C0405(@InterfaceC6391 Display.Mode mode, boolean z) {
            C6740.m21416(mode, "mode == null, can't wrap a null reference");
            this.f891 = new Point(C4426.m1380(mode), C4426.m1379(mode));
            this.f890 = mode;
            this.f9160 = z;
        }

        @InterfaceC7113(23)
        public C0405(@InterfaceC6391 Display.Mode mode, @InterfaceC6391 Point point) {
            C6740.m21416(mode, "mode == null, can't wrap a null reference");
            C6740.m21416(point, "physicalSize == null");
            this.f891 = point;
            this.f890 = mode;
            this.f9160 = true;
        }
    }
}
