package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.1")
public abstract class AbstractC0092<E> extends Yue.AbstractC0041<E> implements java.util.Set<E>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.AbstractC0092.C0093 f175 = null;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۢ$ۥ, reason: contains not printable characters */
    public static final class C0093 {
        public C0093() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0093(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final boolean m513(@Yue.InterfaceC4418 java.util.Set<?> r3, @Yue.InterfaceC4418 java.util.Set<?> r4) {
                r2 = this;
                java.lang.String r0 = "c"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "other"
                Yue.C3329.m13906(r4, r0)
                int r0 = r3.size()
                int r1 = r4.size()
                if (r0 == r1) goto L16
                r3 = 0
                return r3
            L16:
                boolean r3 = r3.containsAll(r4)
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int m514(@Yue.InterfaceC4418 java.util.Collection<?> r4) {
                r3 = this;
                java.lang.String r0 = "c"
                Yue.C3329.m13906(r4, r0)
                java.util.Iterator r4 = r4.iterator()
                r0 = 0
                r1 = r0
            Lb:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r4.next()
                if (r2 == 0) goto L1c
                int r2 = r2.hashCode()
                goto L1d
            L1c:
                r2 = r0
            L1d:
                int r1 = r1 + r2
                goto Lb
            L1f:
                return r1
        }
    }

    static {
            Yue.ۥۣ۟۟ۢ$ۥ r0 = new Yue.ۥۣ۟۟ۢ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.AbstractC0092.f175 = r0
            return
    }

    public AbstractC0092() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof java.util.Set
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            Yue.ۥۣ۟۟ۢ$ۥ r0 = Yue.AbstractC0092.f175
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r0.m513(r1, r2)
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            Yue.ۥۣ۟۟ۢ$ۥ r0 = Yue.AbstractC0092.f175
            int r0 = r0.m514(r1)
            return r0
    }

    @Override // Yue.AbstractC0041, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
