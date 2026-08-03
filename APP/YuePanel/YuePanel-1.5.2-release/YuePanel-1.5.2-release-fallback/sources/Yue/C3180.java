package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3180 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f10527 = "ICUCompat";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f10528;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f10529;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C3181 {
        public C3181() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.String m13584(java.util.Locale r0) {
                java.lang.String r0 = r0.getScript()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C3182 {
        public C3182() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.icu.util.ULocale m13585(java.lang.Object r0) {
                android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
                android.icu.util.ULocale r0 = android.icu.util.ULocale.addLikelySubtags(r0)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.icu.util.ULocale m13586(java.util.Locale r0) {
                android.icu.util.ULocale r0 = android.icu.util.ULocale.forLocale(r0)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.lang.String m13587(java.lang.Object r0) {
                android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
                java.lang.String r0 = r0.getScript()
                return r0
        }
    }

    static {
            return
    }

    public C3180() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m13581(java.util.Locale r4) {
            java.lang.String r0 = "ICUCompat"
            java.lang.String r4 = r4.toString()
            java.lang.reflect.Method r1 = Yue.C3180.f10529     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            if (r1 == 0) goto L21
            java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
            return r1
        L16:
            r1 = move-exception
            goto L1a
        L18:
            r1 = move-exception
            goto L1e
        L1a:
            android.util.Log.w(r0, r1)
            goto L21
        L1e:
            android.util.Log.w(r0, r1)
        L21:
            return r4
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String m13582(java.lang.String r3) {
            java.lang.String r0 = "ICUCompat"
            r1 = 0
            java.lang.reflect.Method r2 = Yue.C3180.f10528     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14
            if (r2 == 0) goto L1d
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14
            java.lang.Object r3 = r2.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14
            return r3
        L12:
            r3 = move-exception
            goto L16
        L14:
            r3 = move-exception
            goto L1a
        L16:
            android.util.Log.w(r0, r3)
            goto L1d
        L1a:
            android.util.Log.w(r0, r3)
        L1d:
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String m13583(@Yue.InterfaceC4410 java.util.Locale r0) {
            android.icu.util.ULocale r0 = Yue.C3180.C3182.m13586(r0)
            android.icu.util.ULocale r0 = Yue.C3180.C3182.m13585(r0)
            java.lang.String r0 = Yue.C3180.C3182.m13587(r0)
            return r0
    }
}
