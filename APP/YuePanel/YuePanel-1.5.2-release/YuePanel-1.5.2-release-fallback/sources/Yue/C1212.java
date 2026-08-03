package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1212 extends Yue.C1210 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۥۡۥ$ۥ, reason: contains not printable characters */
    public static final class C1213<T> implements java.util.Iterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.Enumeration<T> f3757;

        public C1213(java.util.Enumeration<T> r1) {
                r0 = this;
                r0.f3757 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Enumeration<T> r0 = r1.f3757
                boolean r0 = r0.hasMoreElements()
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                java.util.Enumeration<T> r0 = r1.f3757
                java.lang.Object r0 = r0.nextElement()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    public C1212() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static <T> java.util.Iterator<T> m6235(@Yue.InterfaceC4418 java.util.Enumeration<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۟ۥۡۥ$ۥ r0 = new Yue.ۥ۟ۥۡۥ$ۥ
            r0.<init>(r1)
            return r0
    }
}
