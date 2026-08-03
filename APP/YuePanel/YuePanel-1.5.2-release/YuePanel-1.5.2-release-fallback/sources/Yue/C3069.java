package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3069 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10025;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10026;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10027;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۣ$ۥ, reason: contains not printable characters */
    public class C3070 extends de.robv.android.xposed.XC_MethodHook {
        public C3070() {
                r0 = this;
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
                r1 = this;
                java.lang.Object r2 = r2.thisObject
                android.view.View r2 = (android.view.View) r2
                android.content.Context r2 = r2.getContext()
                boolean r0 = r2 instanceof android.app.Activity
                if (r0 == 0) goto L21
                android.app.Activity r2 = (android.app.Activity) r2
                Yue.C0421.m1613(r2)
                android.app.Application r2 = r2.getApplication()
                android.content.Context r0 = Yue.C0421.m1605()
                if (r0 != 0) goto L1e
                Yue.C0421.m1617(r2)
            L1e:
                Yue.C5375.m20256(r2)
            L21:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۣ$ۥ۟, reason: contains not printable characters */
    public class C3071 extends de.robv.android.xposed.XC_MethodHook {
        public C3071() {
                r0 = this;
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
                r2 = this;
                java.lang.Object[] r3 = r3.args
                r0 = 0
                r3 = r3[r0]
                android.view.MotionEvent r3 = (android.view.MotionEvent) r3
                int r0 = r3.getAction()
                if (r0 == 0) goto L14
                int r0 = r3.getAction()
                r1 = 1
                if (r0 != r1) goto L1e
            L14:
                Yue.C6246.m23286(r3)
                android.content.Context r3 = Yue.C0421.m1605()
                Yue.C5375.m20256(r3)
            L1e:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۣ$ۥ۟۟, reason: contains not printable characters */
    public class C3072 extends de.robv.android.xposed.XC_MethodHook {
        public C3072() {
                r0 = this;
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
                r2 = this;
                java.lang.Object[] r3 = r3.args
                r0 = 0
                r3 = r3[r0]
                android.view.MotionEvent r3 = (android.view.MotionEvent) r3
                int r0 = r3.getAction()
                if (r0 == 0) goto L14
                int r0 = r3.getAction()
                r1 = 1
                if (r0 != r1) goto L1e
            L14:
                Yue.C6246.m23286(r3)
                android.content.Context r3 = Yue.C0421.m1605()
                Yue.C5375.m20256(r3)
            L1e:
                return
        }
    }

    static {
            r0 = 286(0x11e, float:4.01E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C3069() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native void m12953(java.lang.ClassLoader r0);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native void m12954(java.lang.ClassLoader r0);
}
