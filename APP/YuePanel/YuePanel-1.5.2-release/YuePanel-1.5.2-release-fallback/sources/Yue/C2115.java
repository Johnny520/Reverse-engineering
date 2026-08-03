package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2115 extends android.text.Editable.Factory {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.Object f6655 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("INSTANCE_LOCK")
    public static volatile android.text.Editable.Factory f6656;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public static java.lang.Class<?> f6657;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C2115.f6655 = r0
            return
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    public C2115() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<Yue.ۥ۠۠ۦۡ> r1 = Yue.C2115.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Throwable -> L12
            Yue.C2115.f6657 = r0     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public static android.text.Editable.Factory getInstance() {
            android.text.Editable$Factory r0 = Yue.C2115.f6656
            if (r0 != 0) goto L19
            java.lang.Object r0 = Yue.C2115.f6655
            monitor-enter(r0)
            android.text.Editable$Factory r1 = Yue.C2115.f6656     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            Yue.ۥ۠۠ۦۡ r1 = new Yue.ۥ۠۠ۦۡ     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            Yue.C2115.f6656 = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            android.text.Editable$Factory r0 = Yue.C2115.f6656
            return r0
    }

    @Override // android.text.Editable.Factory
    public android.text.Editable newEditable(@Yue.InterfaceC4410 java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Class<?> r0 = Yue.C2115.f6657
            if (r0 == 0) goto L9
            Yue.ۥۣۢ۟ۨ r2 = Yue.C5841.m21704(r0, r2)
            return r2
        L9:
            android.text.Editable r2 = super.newEditable(r2)
            return r2
    }
}
