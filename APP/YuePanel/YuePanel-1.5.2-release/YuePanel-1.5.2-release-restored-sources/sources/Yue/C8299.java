package Yue;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥۢۤۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8299 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3388 = "ViewConfigCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f3389 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f24724 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f24725 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f24726 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Method f24727;

    /* JADX INFO: renamed from: Yue.ۥۢۤۥ۟$ۥ */
    @InterfaceC7113(26)
    public static class C1473 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float m4273(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static float m4274(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥ۟$ۥ۟ */
    @InterfaceC7113(28)
    public static class C1474 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m4275(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m4276(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥ۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static class C8300 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m4277(@InterfaceC6391 ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m4278(@InterfaceC6391 ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m4271(Resources resources, int i, InterfaceC7680<Integer> interfaceC7680, int i2) {
        int dimensionPixelSize;
        return i != -1 ? (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize : interfaceC7680.get().intValue();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static float m4272(ViewConfiguration viewConfiguration, Context context) {
        if (f24727 != null) {
            try {
                return ((Integer) r0.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
                Log.i(f3388, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m27592(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m27593(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return m27592(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m27594(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return m27592(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static float m27595(@InterfaceC6391 ViewConfiguration viewConfiguration, @InterfaceC6391 Context context) {
        return C1473.m4273(viewConfiguration);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m27596(@InterfaceC6391 ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? C1474.m4275(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m27597(@InterfaceC6391 Context context, @InterfaceC6391 final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C8300.m4277(viewConfiguration, i, i2, i3);
        }
        if (!m27602(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iM27593 = m27593(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return m4271(resources, iM27593, new InterfaceC7680() { // from class: Yue.ۥۢۤۤۨ
            @Override // Yue.InterfaceC7680
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m27598(@InterfaceC6391 Context context, @InterfaceC6391 final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C8300.m4278(viewConfiguration, i, i2, i3);
        }
        if (!m27602(i, i2, i3)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iM27594 = m27594(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return m4271(resources, iM27594, new InterfaceC7680() { // from class: Yue.ۥۢۤۥ
            @Override // Yue.InterfaceC7680
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m27599(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static float m27600(@InterfaceC6391 ViewConfiguration viewConfiguration, @InterfaceC6391 Context context) {
        return C1473.m4274(viewConfiguration);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m27601(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m27602(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static boolean m27603(@InterfaceC6391 ViewConfiguration viewConfiguration, @InterfaceC6391 Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1474.m4276(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iM27592 = m27592(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iM27592 != 0 && resources.getBoolean(iM27592);
    }
}
