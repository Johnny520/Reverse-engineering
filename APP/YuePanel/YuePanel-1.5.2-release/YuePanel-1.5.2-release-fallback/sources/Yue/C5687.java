package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5687 extends Yue.C5686 {
    public C5687() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <E> java.util.Set<E> m21255(int r1, @Yue.InterfaceC0861 Yue.InterfaceC2825<? super java.util.Set<E>, Yue.C6593> r2) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = Yue.C5686.m21251(r1)
            r2.invoke(r1)
            java.util.Set r1 = Yue.C5686.m21247(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <E> java.util.Set<E> m21256(@Yue.InterfaceC0861 Yue.InterfaceC2825<? super java.util.Set<E>, Yue.C6593> r1) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r1, r0)
            java.util.Set r0 = Yue.C5686.m21250()
            r1.invoke(r0)
            java.util.Set r1 = Yue.C5686.m21247(r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static <T> java.util.Set<T> m21257() {
            Yue.ۥ۠۠ۨۢ r0 = Yue.C2148.f6738
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> java.util.HashSet<T> m21258() {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> java.util.HashSet<T> m21259(@Yue.InterfaceC4418 T... r2) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.HashSet r0 = new java.util.HashSet
            int r1 = r2.length
            int r1 = Yue.C3900.m15722(r1)
            r0.<init>(r1)
            java.util.Collection r2 = Yue.C0595.m3961(r2, r0)
            java.util.HashSet r2 = (java.util.HashSet) r2
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> java.util.LinkedHashSet<T> m21260() {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> java.util.LinkedHashSet<T> m21261(@Yue.InterfaceC4418 T... r2) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.length
            int r1 = Yue.C3900.m15722(r1)
            r0.<init>(r1)
            java.util.Collection r2 = Yue.C0595.m3961(r2, r0)
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21262() {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21263(@Yue.InterfaceC4418 T... r2) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.length
            int r1 = Yue.C3900.m15722(r1)
            r0.<init>(r1)
            java.util.Collection r2 = Yue.C0595.m3961(r2, r0)
            java.util.Set r2 = (java.util.Set) r2
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21264(@Yue.InterfaceC4418 java.util.Set<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 == r1) goto Lf
            goto L20
        Lf:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            java.util.Set r2 = Yue.C5686.m21252(r2)
            goto L20
        L1c:
            java.util.Set r2 = m21257()
        L20:
            return r2
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21265(java.util.Set<? extends T> r0) {
            if (r0 != 0) goto L6
            java.util.Set r0 = m21257()
        L6:
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21266() {
            java.util.Set r0 = m21257()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21267(@Yue.InterfaceC4418 T... r1) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto Ld
            java.util.Set r1 = Yue.C0595.m4010(r1)
            goto L11
        Ld:
            java.util.Set r1 = m21257()
        L11:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21268(@Yue.InterfaceC4543 T r0) {
            if (r0 == 0) goto L7
            java.util.Set r0 = Yue.C5686.m21252(r0)
            goto Lb
        L7:
            java.util.Set r0 = m21257()
        Lb:
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m21269(@Yue.InterfaceC4418 T... r1) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r1, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Collection r1 = Yue.C0595.m2747(r1, r0)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }
}
