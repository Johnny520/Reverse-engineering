package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1210 extends Yue.C1208 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۥۡۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    public static final class C1211<T> implements java.lang.Iterable<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2823<java.util.Iterator<T>> f3756;

        public C1211(Yue.InterfaceC2823<? extends java.util.Iterator<? extends T>> r1) {
                r0 = this;
                r0.f3756 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Iterable
        @Yue.InterfaceC4418
        public java.util.Iterator<T> iterator() {
                r1 = this;
                Yue.ۥۣ۠۠ۨ<java.util.Iterator<T>> r0 = r1.f3756
                java.lang.Object r0 = r0.invoke()
                java.util.Iterator r0 = (java.util.Iterator) r0
                return r0
        }
    }

    public C1210() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <T> java.lang.Iterable<T> m6230(Yue.InterfaceC2823<? extends java.util.Iterator<? extends T>> r1) {
            java.lang.String r0 = "iterator"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۟ۥۡۤ$ۥ r0 = new Yue.ۥ۟ۥۡۤ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static <T> int m6231(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lf
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r1.size()
        Lf:
            return r2
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final <T> java.lang.Integer m6232(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L14
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6233(@Yue.InterfaceC4418 java.lang.Iterable<? extends java.lang.Iterable<? extends T>> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r2.next()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            Yue.C1216.m6247(r0, r1)
            goto Le
        L1e:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final <T, R> Yue.C4677<java.util.List<T>, java.util.List<R>> m6234(@Yue.InterfaceC4418 java.lang.Iterable<? extends Yue.C4677<? extends T, ? extends R>> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            r0 = 10
            int r0 = m6231(r4, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r4.next()
            Yue.ۥۣۡۦ۠ r0 = (Yue.C4677) r0
            java.lang.Object r3 = r0.m18540()
            r1.add(r3)
            java.lang.Object r0 = r0.m18541()
            r2.add(r0)
            goto L19
        L34:
            Yue.ۥۣۡۦ۠ r4 = Yue.C6456.m23777(r1, r2)
            return r4
    }
}
