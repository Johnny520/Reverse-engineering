package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C3508 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean f11052;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f11053;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f11054;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Field f11055;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۤ$ۥ, reason: contains not printable characters */
    public interface InterfaceC3509 {
        boolean superDispatchKeyEvent(@Yue.InterfaceC4410 android.view.KeyEvent r1);
    }

    static {
            return
    }

    public C3508() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m14383(android.app.ActionBar r3, android.view.KeyEvent r4) {
            boolean r0 = Yue.C3508.f11052
            if (r0 != 0) goto L19
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.NoSuchMethodException -> L16
            java.lang.String r1 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r2 = android.view.KeyEvent.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L16
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L16
            Yue.C3508.f11053 = r0     // Catch: java.lang.NoSuchMethodException -> L16
        L16:
            r0 = 1
            Yue.C3508.f11052 = r0
        L19:
            java.lang.reflect.Method r0 = Yue.C3508.f11053
            r1 = 0
            if (r0 == 0) goto L30
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L30
            java.lang.Object r3 = r0.invoke(r3, r4)     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L29
            return r1
        L29:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L30
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L30
            return r3
        L30:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m14384(android.app.Activity r5, android.view.KeyEvent r6) {
            r5.onUserInteraction()
            android.view.Window r0 = r5.getWindow()
            r1 = 8
            boolean r1 = r0.hasFeature(r1)
            r2 = 1
            if (r1 == 0) goto L25
            android.app.ActionBar r1 = r5.getActionBar()
            int r3 = r6.getKeyCode()
            r4 = 82
            if (r3 != r4) goto L25
            if (r1 == 0) goto L25
            boolean r1 = m14383(r1, r6)
            if (r1 == 0) goto L25
            return r2
        L25:
            boolean r1 = r0.superDispatchKeyEvent(r6)
            if (r1 == 0) goto L2c
            return r2
        L2c:
            android.view.View r0 = r0.getDecorView()
            boolean r1 = Yue.C6794.m26111(r0, r6)
            if (r1 == 0) goto L37
            return r2
        L37:
            if (r0 == 0) goto L3e
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            goto L3f
        L3e:
            r0 = 0
        L3f:
            boolean r5 = r6.dispatch(r5, r0, r5)
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m14385(android.app.Dialog r3, android.view.KeyEvent r4) {
            android.content.DialogInterface$OnKeyListener r0 = m14388(r3)
            r1 = 1
            if (r0 == 0) goto L12
            int r2 = r4.getKeyCode()
            boolean r0 = r0.onKey(r3, r2, r4)
            if (r0 == 0) goto L12
            return r1
        L12:
            android.view.Window r0 = r3.getWindow()
            boolean r2 = r0.superDispatchKeyEvent(r4)
            if (r2 == 0) goto L1d
            return r1
        L1d:
            android.view.View r0 = r0.getDecorView()
            boolean r2 = Yue.C6794.m26111(r0, r4)
            if (r2 == 0) goto L28
            return r1
        L28:
            if (r0 == 0) goto L2f
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            goto L30
        L2f:
            r0 = 0
        L30:
            boolean r3 = r4.dispatch(r3, r0, r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m14386(@Yue.InterfaceC4410 android.view.View r0, @Yue.InterfaceC4410 android.view.KeyEvent r1) {
            boolean r0 = Yue.C6794.m26112(r0, r1)
            return r0
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m14387(@Yue.InterfaceC4410 Yue.C3508.InterfaceC3509 r3, @Yue.InterfaceC4544 android.view.View r4, @Yue.InterfaceC4544 android.view.Window.Callback r5, @Yue.InterfaceC4410 android.view.KeyEvent r6) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r3 = r3.superDispatchKeyEvent(r6)
            return r3
        Lf:
            boolean r1 = r5 instanceof android.app.Activity
            if (r1 == 0) goto L1a
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r3 = m14384(r5, r6)
            return r3
        L1a:
            boolean r1 = r5 instanceof android.app.Dialog
            if (r1 == 0) goto L25
            android.app.Dialog r5 = (android.app.Dialog) r5
            boolean r3 = m14385(r5, r6)
            return r3
        L25:
            if (r4 == 0) goto L2d
            boolean r4 = Yue.C6794.m26111(r4, r6)
            if (r4 != 0) goto L33
        L2d:
            boolean r3 = r3.superDispatchKeyEvent(r6)
            if (r3 == 0) goto L34
        L33:
            r0 = 1
        L34:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static android.content.DialogInterface.OnKeyListener m14388(android.app.Dialog r3) {
            boolean r0 = Yue.C3508.f11054
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.Class<android.app.Dialog> r1 = android.app.Dialog.class
            java.lang.String r2 = "mOnKeyListener"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            Yue.C3508.f11055 = r1     // Catch: java.lang.NoSuchFieldException -> L12
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            Yue.C3508.f11054 = r0
        L14:
            java.lang.reflect.Field r0 = Yue.C3508.f11055
            if (r0 == 0) goto L1f
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L1f
            android.content.DialogInterface$OnKeyListener r3 = (android.content.DialogInterface.OnKeyListener) r3     // Catch: java.lang.IllegalAccessException -> L1f
            return r3
        L1f:
            r3 = 0
            return r3
    }
}
