package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5686 {
    public C5686() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static <E> java.util.Set<E> m21247(@Yue.InterfaceC4418 java.util.Set<E> r1) {
            java.lang.String r0 = "builder"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۣۡۨۦ r1 = (Yue.C5680) r1
            java.util.Set r1 = r1.m21243()
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <E> java.util.Set<E> m21248(int r1, Yue.InterfaceC2825<? super java.util.Set<E>, Yue.C6593> r2) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = m21251(r1)
            r2.invoke(r1)
            java.util.Set r1 = m21247(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E> java.util.Set<E> m21249(Yue.InterfaceC2825<? super java.util.Set<E>, Yue.C6593> r1) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r1, r0)
            java.util.Set r0 = m21250()
            r1.invoke(r0)
            java.util.Set r1 = m21247(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <E> java.util.Set<E> m21250() {
            Yue.ۥۣۡۨۦ r0 = new Yue.ۥۣۡۨۦ
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <E> java.util.Set<E> m21251(int r1) {
            Yue.ۥۣۡۨۦ r0 = new Yue.ۥۣۡۨۦ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static <T> java.util.Set<T> m21252(T r1) {
            java.util.Set r1 = java.util.Collections.singleton(r1)
            java.lang.String r0 = "singleton(element)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> java.util.TreeSet<T> m21253(@Yue.InterfaceC4418 java.util.Comparator<? super T> r1, @Yue.InterfaceC4418 T... r2) {
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            java.util.Collection r1 = Yue.C0595.m3961(r2, r0)
            java.util.TreeSet r1 = (java.util.TreeSet) r1
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> java.util.TreeSet<T> m21254(@Yue.InterfaceC4418 T... r1) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = Yue.C0595.m3961(r1, r0)
            java.util.TreeSet r1 = (java.util.TreeSet) r1
            return r1
    }
}
