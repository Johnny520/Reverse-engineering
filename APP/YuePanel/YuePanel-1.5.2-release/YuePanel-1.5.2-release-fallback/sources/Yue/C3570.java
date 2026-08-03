package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3570 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f11380 = "LayoutInflaterCompatHC";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Field f11381;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f11382;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۨۥ$ۥ, reason: contains not printable characters */
    public static class LayoutInflaterFactory2C3571 implements android.view.LayoutInflater.Factory2 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Yue.InterfaceC3572 f11383;

        public LayoutInflaterFactory2C3571(Yue.InterfaceC3572 r1) {
                r0 = this;
                r0.<init>()
                r0.f11383 = r1
                return
        }

        @Override // android.view.LayoutInflater.Factory2
        public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
                r1 = this;
                Yue.ۥ۠ۦۨۦ r0 = r1.f11383
                android.view.View r2 = r0.onCreateView(r2, r3, r4, r5)
                return r2
        }

        @Override // android.view.LayoutInflater.Factory
        public android.view.View onCreateView(java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
                r2 = this;
                Yue.ۥ۠ۦۨۦ r0 = r2.f11383
                r1 = 0
                android.view.View r3 = r0.onCreateView(r1, r3, r4, r5)
                return r3
        }

        @Yue.InterfaceC4410
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class r1 = r2.getClass()
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                java.lang.String r1 = "{"
                r0.append(r1)
                Yue.ۥ۠ۦۨۦ r1 = r2.f11383
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C3570() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m14501(android.view.LayoutInflater r7, android.view.LayoutInflater.Factory2 r8) {
            java.lang.Class<android.view.LayoutInflater> r0 = android.view.LayoutInflater.class
            boolean r1 = Yue.C3570.f11382
            java.lang.String r2 = "; inflation may have unexpected results."
            java.lang.String r3 = "LayoutInflaterCompatHC"
            if (r1 != 0) goto L35
            r1 = 1
            java.lang.String r4 = "mFactory2"
            java.lang.reflect.Field r4 = r0.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L17
            Yue.C3570.f11381 = r4     // Catch: java.lang.NoSuchFieldException -> L17
            r4.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L17
            goto L33
        L17:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "forceSetFactory2 Could not find field 'mFactory2' on class "
            r5.append(r6)
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            android.util.Log.e(r3, r0, r4)
        L33:
            Yue.C3570.f11382 = r1
        L35:
            java.lang.reflect.Field r0 = Yue.C3570.f11381
            if (r0 == 0) goto L55
            r0.set(r7, r8)     // Catch: java.lang.IllegalAccessException -> L3d
            goto L55
        L3d:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "forceSetFactory2 could not set the Factory2 on LayoutInflater "
            r0.append(r1)
            r0.append(r7)
            r0.append(r2)
            java.lang.String r7 = r0.toString()
            android.util.Log.e(r3, r7, r8)
        L55:
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.InterfaceC3572 m14502(android.view.LayoutInflater r1) {
            android.view.LayoutInflater$Factory r1 = r1.getFactory()
            boolean r0 = r1 instanceof Yue.C3570.LayoutInflaterFactory2C3571
            if (r0 == 0) goto Ld
            Yue.ۥ۠ۦۨۥ$ۥ r1 = (Yue.C3570.LayoutInflaterFactory2C3571) r1
            Yue.ۥ۠ۦۨۦ r1 = r1.f11383
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m14503(@Yue.InterfaceC4410 android.view.LayoutInflater r1, @Yue.InterfaceC4410 Yue.InterfaceC3572 r2) {
            Yue.ۥ۠ۦۨۥ$ۥ r0 = new Yue.ۥ۠ۦۨۥ$ۥ
            r0.<init>(r2)
            r1.setFactory2(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m14504(@Yue.InterfaceC4410 android.view.LayoutInflater r0, @Yue.InterfaceC4410 android.view.LayoutInflater.Factory2 r1) {
            r0.setFactory2(r1)
            return
    }
}
