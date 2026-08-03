package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8472 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3519 = "WindowInsetsCompat";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public static final C8472 f25308;

    /* JADX INFO: renamed from: ۥ */
    public final C8482 f3520;

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ */
    @InterfaceC7113(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class C1542 {

        /* JADX INFO: renamed from: ۥ */
        public static Field f3521;

        /* JADX INFO: renamed from: ۥ۟ */
        public static Field f3522;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Field f25309;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean f25310;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3521 = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3522 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f25309 = declaredField3;
                declaredField3.setAccessible(true);
                f25310 = true;
            } catch (ReflectiveOperationException e) {
                Log.w(C8472.f3519, "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public static C8472 m4465(@InterfaceC6391 View view) {
            if (f25310 && view.isAttachedToWindow()) {
                try {
                    Object obj = f3521.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3522.get(obj);
                        Rect rect2 = (Rect) f25309.get(obj);
                        if (rect != null && rect2 != null) {
                            C8472 c8472M4466 = new C1543().m28314(C5450.m16959(rect)).m28316(C5450.m16959(rect2)).m4466();
                            c8472M4466.m28308(c8472M4466);
                            c8472M4466.m28279(view.getRootView());
                            return c8472M4466;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w(C8472.f3519, "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C8475 extends C8474 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8475() {
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo28326(int i, @InterfaceC6391 C5450 c5450) {
            this.f25317.setInsets(C8484.m4474(i), c5450.m16963());
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo28327(int i, @InterfaceC6391 C5450 c5450) {
            this.f25317.setInsetsIgnoringVisibility(C8484.m4474(i), c5450.m16963());
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo28328(int i, boolean z) {
            this.f25317.setVisible(C8484.m4474(i), z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8475(@InterfaceC6391 C8472 c8472) {
            super(c8472);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C8476 {

        /* JADX INFO: renamed from: ۥ */
        public final C8472 f3524;

        /* JADX INFO: renamed from: ۥ۟ */
        public C5450[] f3525;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8476() {
            this(new C8472((C8472) null));
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4469() {
            C5450[] c5450Arr = this.f3525;
            if (c5450Arr != null) {
                C5450 c5450M28281 = c5450Arr[C8483.m28356(1)];
                C5450 c5450M282812 = this.f3525[C8483.m28356(2)];
                if (c5450M282812 == null) {
                    c5450M282812 = this.f3524.m28281(2);
                }
                if (c5450M28281 == null) {
                    c5450M28281 = this.f3524.m28281(1);
                }
                mo28321(C5450.m2220(c5450M28281, c5450M282812));
                C5450 c5450 = this.f3525[C8483.m28356(16)];
                if (c5450 != null) {
                    mo28324(c5450);
                }
                C5450 c54502 = this.f3525[C8483.m28356(32)];
                if (c54502 != null) {
                    mo28323(c54502);
                }
                C5450 c54503 = this.f3525[C8483.m28356(64)];
                if (c54503 != null) {
                    mo28325(c54503);
                }
            }
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C8472 mo4468() {
            m4469();
            return this.f3524;
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo28322(@InterfaceC6490 C4429 c4429) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo28326(int i, @InterfaceC6391 C5450 c5450) {
            if (this.f3525 == null) {
                this.f3525 = new C5450[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f3525[C8483.m28356(i2)] = c5450;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo28327(int i, @InterfaceC6391 C5450 c5450) {
            if (i == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo28323(@InterfaceC6391 C5450 c5450) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo28320(@InterfaceC6391 C5450 c5450) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo28324(@InterfaceC6391 C5450 c5450) {
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo28321(@InterfaceC6391 C5450 c5450) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo28325(@InterfaceC6391 C5450 c5450) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public void mo28328(int i, boolean z) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8476(@InterfaceC6391 C8472 c8472) {
            this.f3524 = c8472;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C8479 extends C8478 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8479(@InterfaceC6391 C8472 c8472, @InterfaceC6391 WindowInsets windowInsets) {
            super(c8472, windowInsets);
        }

        @Override // Yue.C8472.C8477, Yue.C8472.C8482
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8479)) {
                return false;
            }
            C8479 c8479 = (C8479) obj;
            return Objects.equals(this.f25323, c8479.f25323) && Objects.equals(this.f25327, c8479.f25327);
        }

        @Override // Yue.C8472.C8482
        public int hashCode() {
            return this.f25323.hashCode();
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C8472 mo4471() {
            return C8472.m28276(this.f25323.consumeDisplayCutout());
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C4429 mo28350() {
            return C4429.m12890(this.f25323.getDisplayCutout());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8479(@InterfaceC6391 C8472 c8472, @InterfaceC6391 C8479 c8479) {
            super(c8472, c8479);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C8481 extends C8480 {

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        @InterfaceC6391
        public static final C8472 f25332 = C8472.m28276(WindowInsets.CONSUMED);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8481(@InterfaceC6391 C8472 c8472, @InterfaceC6391 WindowInsets windowInsets) {
            super(c8472, windowInsets);
        }

        @Override // Yue.C8472.C8477, Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public final void mo28333(@InterfaceC6391 View view) {
        }

        @Override // Yue.C8472.C8477, Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public C5450 mo28335(int i) {
            return C5450.m16961(this.f25323.getInsets(C8484.m4474(i)));
        }

        @Override // Yue.C8472.C8477, Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public C5450 mo28336(int i) {
            return C5450.m16961(this.f25323.getInsetsIgnoringVisibility(C8484.m4474(i)));
        }

        @Override // Yue.C8472.C8477, Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public boolean mo28340(int i) {
            return this.f25323.isVisible(C8484.m4474(i));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8481(@InterfaceC6391 C8472 c8472, @InterfaceC6391 C8481 c8481) {
            super(c8472, c8481);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C8482 {

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6391
        public static final C8472 f3526 = new C1543().m4466().m4463().m4464().m28278();

        /* JADX INFO: renamed from: ۥ */
        public final C8472 f3527;

        public C8482(@InterfaceC6391 C8472 c8472) {
            this.f3527 = c8472;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8482)) {
                return false;
            }
            C8482 c8482 = (C8482) obj;
            return mo28339() == c8482.mo28339() && mo28348() == c8482.mo28348() && C6499.m2995(mo28337(), c8482.mo28337()) && C6499.m2995(mo28347(), c8482.mo28347()) && C6499.m2995(mo28350(), c8482.mo28350());
        }

        public int hashCode() {
            return C6499.m2996(Boolean.valueOf(mo28339()), Boolean.valueOf(mo28348()), mo28337(), mo28347(), mo28350());
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C8472 mo4471() {
            return this.f3527;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C8472 mo4470() {
            return this.f3527;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ */
        public C8472 mo28346() {
            return this.f3527;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo28333(@InterfaceC6391 View view) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo28334(@InterfaceC6391 C8472 c8472) {
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public C4429 mo28350() {
            return null;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public C5450 mo28335(int i) {
            return C5450.f13398;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public C5450 mo28336(int i) {
            if ((i & 8) == 0) {
                return C5450.f13398;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public C5450 mo28351() {
            return mo28337();
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public C5450 mo28347() {
            return C5450.f13398;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public C5450 mo28352() {
            return mo28337();
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public C5450 mo28337() {
            return C5450.f13398;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public C5450 mo28353() {
            return mo28337();
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public C8472 mo28338(int i, int i2, int i3, int i4) {
            return f3526;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public boolean mo28348() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟ */
        public boolean mo28339() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public boolean mo28340(int i) {
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public void mo28341(C5450[] c5450Arr) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public void mo28342(@InterfaceC6391 C5450 c5450) {
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public void mo28343(@InterfaceC6490 C8472 c8472) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        public void mo28349(C5450 c5450) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final class C8483 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f3528 = 1;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f3529 = 1;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f25333 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f25334 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f25335 = 8;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f25336 = 16;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f25337 = 32;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f25338 = 64;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f25339 = 128;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f25340 = 256;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f25341 = 9;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f25342 = 256;

        /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۧ$ۥ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC1544 {
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ */
        public static int m4472() {
            return -1;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static int m4473() {
            return 4;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m28354() {
            return 128;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static int m28355() {
            return 8;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m28356(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static int m28357() {
            return 32;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static int m28358() {
            return 2;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static int m28359() {
            return 1;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static int m28360() {
            return 7;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static int m28361() {
            return 16;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static int m28362() {
            return 64;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static final class C8484 {
        private C8484() {
        }

        /* JADX INFO: renamed from: ۥ */
        public static int m4474(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f25308 = C8481.f25332;
        } else {
            f25308 = C8482.f3526;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC7113(20)
    public C8472(@InterfaceC6391 WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f3520 = new C8481(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f3520 = new C8480(this, windowInsets);
        } else if (i >= 28) {
            this.f3520 = new C8479(this, windowInsets);
        } else {
            this.f3520 = new C8478(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static C5450 m28275(@InterfaceC6391 C5450 c5450, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c5450.f1520 - i);
        int iMax2 = Math.max(0, c5450.f1521 - i2);
        int iMax3 = Math.max(0, c5450.f13399 - i3);
        int iMax4 = Math.max(0, c5450.f13400 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c5450 : C5450.m16958(iMax, iMax2, iMax3, iMax4);
    }

    @InterfaceC6391
    @InterfaceC7113(20)
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static C8472 m28276(@InterfaceC6391 WindowInsets windowInsets) {
        return m28277(windowInsets, null);
    }

    @InterfaceC6391
    @InterfaceC7113(20)
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static C8472 m28277(@InterfaceC6391 WindowInsets windowInsets, @InterfaceC6490 View view) {
        C8472 c8472 = new C8472((WindowInsets) C6740.m21415(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c8472.m28308(C8273.m27371(view));
            c8472.m28279(view.getRootView());
        }
        return c8472;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8472) {
            return C6499.m2995(this.f3520, ((C8472) obj).f3520);
        }
        return false;
    }

    public int hashCode() {
        C8482 c8482 = this.f3520;
        if (c8482 == null) {
            return 0;
        }
        return c8482.hashCode();
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public C8472 m4463() {
        return this.f3520.mo4471();
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public C8472 m4464() {
        return this.f3520.mo4470();
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C8472 m28278() {
        return this.f3520.mo28346();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m28279(@InterfaceC6391 View view) {
        this.f3520.mo28333(view);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C4429 m28280() {
        return this.f3520.mo28350();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C5450 m28281(int i) {
        return this.f3520.mo28335(i);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C5450 m28282(int i) {
        return this.f3520.mo28336(i);
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C5450 m28283() {
        return this.f3520.mo28351();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m28284() {
        return this.f3520.mo28347().f13400;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m28285() {
        return this.f3520.mo28347().f1520;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m28286() {
        return this.f3520.mo28347().f13399;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m28287() {
        return this.f3520.mo28347().f1521;
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C5450 m28288() {
        return this.f3520.mo28347();
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C5450 m28289() {
        return this.f3520.mo28352();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m28290() {
        return this.f3520.mo28337().f13400;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m28291() {
        return this.f3520.mo28337().f1520;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m28292() {
        return this.f3520.mo28337().f13399;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m28293() {
        return this.f3520.mo28337().f1521;
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C5450 m28294() {
        return this.f3520.mo28337();
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C5450 m28295() {
        return this.f3520.mo28353();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m28296() {
        C5450 c5450M28281 = m28281(C8483.m4472());
        C5450 c5450 = C5450.f13398;
        return (c5450M28281.equals(c5450) && m28282(C8483.m4472() ^ C8483.m28355()).equals(c5450) && m28280() == null) ? false : true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m28297() {
        return !this.f3520.mo28347().equals(C5450.f13398);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m28298() {
        return !this.f3520.mo28337().equals(C5450.f13398);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C8472 m28299(@InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, @InterfaceC5459(from = 0) int i3, @InterfaceC5459(from = 0) int i4) {
        return this.f3520.mo28338(i, i2, i3, i4);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C8472 m28300(@InterfaceC6391 C5450 c5450) {
        return m28299(c5450.f1520, c5450.f1521, c5450.f13399, c5450.f13400);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m28301() {
        return this.f3520.mo28348();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m28302() {
        return this.f3520.mo28339();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m28303(int i) {
        return this.f3520.mo28340(i);
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public C8472 m28304(int i, int i2, int i3, int i4) {
        return new C1543(this).m28316(C5450.m16958(i, i2, i3, i4)).m4466();
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C8472 m28305(@InterfaceC6391 Rect rect) {
        return new C1543(this).m28316(C5450.m16959(rect)).m4466();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m28306(C5450[] c5450Arr) {
        this.f3520.mo28341(c5450Arr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m28307(@InterfaceC6391 C5450 c5450) {
        this.f3520.mo28342(c5450);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m28308(@InterfaceC6490 C8472 c8472) {
        this.f3520.mo28343(c8472);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m28309(@InterfaceC6490 C5450 c5450) {
        this.f3520.mo28349(c5450);
    }

    @InterfaceC6490
    @InterfaceC7113(20)
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public WindowInsets m28310() {
        C8482 c8482 = this.f3520;
        if (c8482 instanceof C8477) {
            return ((C8477) c8482).f25323;
        }
        return null;
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(api = 20)
    public static class C8473 extends C8476 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static Field f25311;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean f25312;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Constructor<WindowInsets> f25313;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static boolean f25314;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public WindowInsets f25315;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C5450 f25316;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8473() {
            this.f25315 = m28319();
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        private static WindowInsets m28319() {
            if (!f25312) {
                try {
                    f25311 = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i(C8472.f3519, "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f25312 = true;
            }
            Field field = f25311;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i(C8472.f3519, "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f25314) {
                try {
                    f25313 = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i(C8472.f3519, "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f25314 = true;
            }
            Constructor<WindowInsets> constructor = f25313;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i(C8472.f3519, "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // Yue.C8472.C8476
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C8472 mo4468() {
            m4469();
            C8472 c8472M28276 = C8472.m28276(this.f25315);
            c8472M28276.m28306(this.f3525);
            c8472M28276.m28309(this.f25316);
            return c8472M28276;
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo28320(@InterfaceC6490 C5450 c5450) {
            this.f25316 = c5450;
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo28321(@InterfaceC6391 C5450 c5450) {
            WindowInsets windowInsets = this.f25315;
            if (windowInsets != null) {
                this.f25315 = windowInsets.replaceSystemWindowInsets(c5450.f1520, c5450.f1521, c5450.f13399, c5450.f13400);
            }
        }

        public C8473(@InterfaceC6391 C8472 c8472) {
            super(c8472);
            this.f25315 = c8472.m28310();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(api = 29)
    public static class C8474 extends C8476 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final WindowInsets.Builder f25317;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8474() {
            this.f25317 = C8493.m4483();
        }

        @Override // Yue.C8472.C8476
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C8472 mo4468() {
            m4469();
            C8472 c8472M28276 = C8472.m28276(this.f25317.build());
            c8472M28276.m28306(this.f3525);
            return c8472M28276;
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo28322(@InterfaceC6490 C4429 c4429) {
            this.f25317.setDisplayCutout(c4429 != null ? c4429.m12896() : null);
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo28323(@InterfaceC6391 C5450 c5450) {
            this.f25317.setMandatorySystemGestureInsets(c5450.m16963());
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo28320(@InterfaceC6391 C5450 c5450) {
            this.f25317.setStableInsets(c5450.m16963());
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo28324(@InterfaceC6391 C5450 c5450) {
            this.f25317.setSystemGestureInsets(c5450.m16963());
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo28321(@InterfaceC6391 C5450 c5450) {
            this.f25317.setSystemWindowInsets(c5450.m16963());
        }

        @Override // Yue.C8472.C8476
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo28325(@InterfaceC6391 C5450 c5450) {
            this.f25317.setTappableElementInsets(c5450.m16963());
        }

        public C8474(@InterfaceC6391 C8472 c8472) {
            WindowInsets.Builder builderM4483;
            super(c8472);
            WindowInsets windowInsetsM28310 = c8472.m28310();
            if (windowInsetsM28310 != null) {
                builderM4483 = C8492.m4482(windowInsetsM28310);
            } else {
                builderM4483 = C8493.m4483();
            }
            this.f25317 = builderM4483;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7113(21)
    public static class C8478 extends C8477 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public C5450 f25328;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8478(@InterfaceC6391 C8472 c8472, @InterfaceC6391 WindowInsets windowInsets) {
            super(c8472, windowInsets);
            this.f25328 = null;
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C8472 mo4470() {
            return C8472.m28276(this.f25323.consumeStableInsets());
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C8472 mo28346() {
            return C8472.m28276(this.f25323.consumeSystemWindowInsets());
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final C5450 mo28347() {
            if (this.f25328 == null) {
                this.f25328 = C5450.m16958(this.f25323.getStableInsetLeft(), this.f25323.getStableInsetTop(), this.f25323.getStableInsetRight(), this.f25323.getStableInsetBottom());
            }
            return this.f25328;
        }

        @Override // Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean mo28348() {
            return this.f25323.isConsumed();
        }

        @Override // Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public void mo28349(@InterfaceC6490 C5450 c5450) {
            this.f25328 = c5450;
        }

        public C8478(@InterfaceC6391 C8472 c8472, @InterfaceC6391 C8478 c8478) {
            super(c8472, c8478);
            this.f25328 = null;
            this.f25328 = c8478.f25328;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(20)
    public static class C8477 extends C8482 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static boolean f25318;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static Method f25319;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static Class<?> f25320;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static Field f25321;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static Field f25322;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public final WindowInsets f25323;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C5450[] f25324;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C5450 f25325;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C8472 f25326;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C5450 f25327;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8477(@InterfaceC6391 C8472 c8472, @InterfaceC6391 WindowInsets windowInsets) {
            super(c8472);
            this.f25325 = null;
            this.f25323 = windowInsets;
        }

        @InterfaceC6391
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        private C5450 m28329(int i, boolean z) {
            C5450 c5450M2220 = C5450.f13398;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    c5450M2220 = C5450.m2220(c5450M2220, m28344(i2, z));
                }
            }
            return c5450M2220;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        private C5450 m28330() {
            C8472 c8472 = this.f25326;
            return c8472 != null ? c8472.m28288() : C5450.f13398;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        private C5450 m28331(@InterfaceC6391 View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f25318) {
                m28332();
            }
            Method method = f25319;
            if (method != null && f25320 != null && f25321 != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w(C8472.f3519, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f25321.get(f25322.get(objInvoke));
                    if (rect != null) {
                        return C5450.m16959(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e(C8472.f3519, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        private static void m28332() {
            try {
                f25319 = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f25320 = cls;
                f25321 = cls.getDeclaredField("mVisibleInsets");
                f25322 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f25321.setAccessible(true);
                f25322.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e(C8472.f3519, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f25318 = true;
        }

        @Override // Yue.C8472.C8482
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f25327, ((C8477) obj).f25327);
            }
            return false;
        }

        @Override // Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo28333(@InterfaceC6391 View view) {
            C5450 c5450M28331 = m28331(view);
            if (c5450M28331 == null) {
                c5450M28331 = C5450.f13398;
            }
            mo28342(c5450M28331);
        }

        @Override // Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo28334(@InterfaceC6391 C8472 c8472) {
            c8472.m28308(this.f25326);
            c8472.m28307(this.f25327);
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C5450 mo28335(int i) {
            return m28329(i, false);
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C5450 mo28336(int i) {
            return m28329(i, true);
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final C5450 mo28337() {
            if (this.f25325 == null) {
                this.f25325 = C5450.m16958(this.f25323.getSystemWindowInsetLeft(), this.f25323.getSystemWindowInsetTop(), this.f25323.getSystemWindowInsetRight(), this.f25323.getSystemWindowInsetBottom());
            }
            return this.f25325;
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public C8472 mo28338(int i, int i2, int i3, int i4) {
            C1543 c1543 = new C1543(C8472.m28276(this.f25323));
            c1543.m28316(C8472.m28275(mo28337(), i, i2, i3, i4));
            c1543.m28314(C8472.m28275(mo28347(), i, i2, i3, i4));
            return c1543.m4466();
        }

        @Override // Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean mo28339() {
            return this.f25323.isRound();
        }

        @Override // Yue.C8472.C8482
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public boolean mo28340(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !m28345(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public void mo28341(C5450[] c5450Arr) {
            this.f25324 = c5450Arr;
        }

        @Override // Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void mo28342(@InterfaceC6391 C5450 c5450) {
            this.f25327 = c5450;
        }

        @Override // Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public void mo28343(@InterfaceC6490 C8472 c8472) {
            this.f25326 = c8472;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public C5450 m28344(int i, boolean z) {
            C5450 c5450M28288;
            int i2;
            if (i == 1) {
                return z ? C5450.m16958(0, Math.max(m28330().f1521, mo28337().f1521), 0, 0) : C5450.m16958(0, mo28337().f1521, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    C5450 c5450M28330 = m28330();
                    C5450 c5450Mo28347 = mo28347();
                    return C5450.m16958(Math.max(c5450M28330.f1520, c5450Mo28347.f1520), 0, Math.max(c5450M28330.f13399, c5450Mo28347.f13399), Math.max(c5450M28330.f13400, c5450Mo28347.f13400));
                }
                C5450 c5450Mo28337 = mo28337();
                C8472 c8472 = this.f25326;
                c5450M28288 = c8472 != null ? c8472.m28288() : null;
                int iMin = c5450Mo28337.f13400;
                if (c5450M28288 != null) {
                    iMin = Math.min(iMin, c5450M28288.f13400);
                }
                return C5450.m16958(c5450Mo28337.f1520, 0, c5450Mo28337.f13399, iMin);
            }
            if (i != 8) {
                if (i == 16) {
                    return mo28352();
                }
                if (i == 32) {
                    return mo28351();
                }
                if (i == 64) {
                    return mo28353();
                }
                if (i != 128) {
                    return C5450.f13398;
                }
                C8472 c84722 = this.f25326;
                C4429 c4429M28280 = c84722 != null ? c84722.m28280() : mo28350();
                return c4429M28280 != null ? C5450.m16958(c4429M28280.m12892(), c4429M28280.m12894(), c4429M28280.m12893(), c4429M28280.m12891()) : C5450.f13398;
            }
            C5450[] c5450Arr = this.f25324;
            c5450M28288 = c5450Arr != null ? c5450Arr[C8483.m28356(8)] : null;
            if (c5450M28288 != null) {
                return c5450M28288;
            }
            C5450 c5450Mo283372 = mo28337();
            C5450 c5450M283302 = m28330();
            int i3 = c5450Mo283372.f13400;
            if (i3 > c5450M283302.f13400) {
                return C5450.m16958(0, 0, 0, i3);
            }
            C5450 c5450 = this.f25327;
            return (c5450 == null || c5450.equals(C5450.f13398) || (i2 = this.f25327.f13400) <= c5450M283302.f13400) ? C5450.f13398 : C5450.m16958(0, 0, 0, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public boolean m28345(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !m28344(i, false).equals(C5450.f13398);
        }

        public C8477(@InterfaceC6391 C8472 c8472, @InterfaceC6391 C8477 c8477) {
            this(c8472, new WindowInsets(c8477.f25323));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC7113(29)
    public static class C8480 extends C8479 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public C5450 f25329;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public C5450 f25330;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public C5450 f25331;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8480(@InterfaceC6391 C8472 c8472, @InterfaceC6391 WindowInsets windowInsets) {
            super(c8472, windowInsets);
            this.f25329 = null;
            this.f25330 = null;
            this.f25331 = null;
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C5450 mo28351() {
            if (this.f25330 == null) {
                this.f25330 = C5450.m16961(this.f25323.getMandatorySystemGestureInsets());
            }
            return this.f25330;
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public C5450 mo28352() {
            if (this.f25329 == null) {
                this.f25329 = C5450.m16961(this.f25323.getSystemGestureInsets());
            }
            return this.f25329;
        }

        @Override // Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public C5450 mo28353() {
            if (this.f25331 == null) {
                this.f25331 = C5450.m16961(this.f25323.getTappableElementInsets());
            }
            return this.f25331;
        }

        @Override // Yue.C8472.C8477, Yue.C8472.C8482
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public C8472 mo28338(int i, int i2, int i3, int i4) {
            return C8472.m28276(this.f25323.inset(i, i2, i3, i4));
        }

        @Override // Yue.C8472.C8478, Yue.C8472.C8482
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        public void mo28349(@InterfaceC6490 C5450 c5450) {
        }

        public C8480(@InterfaceC6391 C8472 c8472, @InterfaceC6391 C8480 c8480) {
            super(c8472, c8480);
            this.f25329 = null;
            this.f25330 = null;
            this.f25331 = null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟ */
    public static final class C1543 {

        /* JADX INFO: renamed from: ۥ */
        public final C8476 f3523;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1543() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3523 = new C8475();
            } else if (i >= 29) {
                this.f3523 = new C8474();
            } else {
                this.f3523 = new C8473();
            }
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C8472 m4466() {
            return this.f3523.mo4468();
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C1543 m4467(@InterfaceC6490 C4429 c4429) {
            this.f3523.mo28322(c4429);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C1543 m28311(int i, @InterfaceC6391 C5450 c5450) {
            this.f3523.mo28326(i, c5450);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C1543 m28312(int i, @InterfaceC6391 C5450 c5450) {
            this.f3523.mo28327(i, c5450);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C1543 m28313(@InterfaceC6391 C5450 c5450) {
            this.f3523.mo28323(c5450);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C1543 m28314(@InterfaceC6391 C5450 c5450) {
            this.f3523.mo28320(c5450);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C1543 m28315(@InterfaceC6391 C5450 c5450) {
            this.f3523.mo28324(c5450);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C1543 m28316(@InterfaceC6391 C5450 c5450) {
            this.f3523.mo28321(c5450);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C1543 m28317(@InterfaceC6391 C5450 c5450) {
            this.f3523.mo28325(c5450);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public C1543 m28318(int i, boolean z) {
            this.f3523.mo28328(i, z);
            return this;
        }

        public C1543(@InterfaceC6391 C8472 c8472) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3523 = new C8475(c8472);
            } else if (i >= 29) {
                this.f3523 = new C8474(c8472);
            } else {
                this.f3523 = new C8473(c8472);
            }
        }
    }

    public C8472(@InterfaceC6490 C8472 c8472) {
        if (c8472 != null) {
            C8482 c8482 = c8472.f3520;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (c8482 instanceof C8481)) {
                this.f3520 = new C8481(this, (C8481) c8482);
            } else if (i >= 29 && (c8482 instanceof C8480)) {
                this.f3520 = new C8480(this, (C8480) c8482);
            } else if (i >= 28 && (c8482 instanceof C8479)) {
                this.f3520 = new C8479(this, (C8479) c8482);
            } else if (c8482 instanceof C8478) {
                this.f3520 = new C8478(this, (C8478) c8482);
            } else if (c8482 instanceof C8477) {
                this.f3520 = new C8477(this, (C8477) c8482);
            } else {
                this.f3520 = new C8482(this);
            }
            c8482.mo28334(this);
            return;
        }
        this.f3520 = new C8482(this);
    }
}
