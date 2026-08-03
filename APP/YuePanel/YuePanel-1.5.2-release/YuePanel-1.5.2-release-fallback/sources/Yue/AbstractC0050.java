package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0050<T> implements java.util.Iterator<T>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public Yue.EnumC5940 f112;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public T f113;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۡ$ۥ, reason: contains not printable characters */
    public /* synthetic */ class C0051 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f114 = null;

        static {
                Yue.ۥۢ۠۟۠[] r0 = Yue.EnumC5940.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.ۥۢ۠۟۠ r1 = Yue.EnumC5940.f21661     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                Yue.ۥۢ۠۟۠ r1 = Yue.EnumC5940.f21659     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                Yue.AbstractC0050.C0051.f114 = r0
                return
        }
    }

    public AbstractC0050() {
            r1 = this;
            r1.<init>()
            Yue.ۥۢ۠۟۠ r0 = Yue.EnumC5940.f21660
            r1.f112 = r0
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r3 = this;
            Yue.ۥۢ۠۟۠ r0 = r3.f112
            Yue.ۥۢ۠۟۠ r1 = Yue.EnumC5940.f21662
            if (r0 == r1) goto L1b
            int[] r1 = Yue.AbstractC0050.C0051.f114
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L19
            r2 = 2
            if (r0 == r2) goto L1a
            boolean r1 = r3.m397()
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Iterator
    public T next() {
            r1 = this;
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld
            Yue.ۥۢ۠۟۠ r0 = Yue.EnumC5940.f21660
            r1.f112 = r0
            T r0 = r1.f113
            return r0
        Ld:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract void mo394();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m395() {
            r1 = this;
            Yue.ۥۢ۠۟۠ r0 = Yue.EnumC5940.f21661
            r1.f112 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m396(T r1) {
            r0 = this;
            r0.f113 = r1
            Yue.ۥۢ۠۟۠ r1 = Yue.EnumC5940.f21659
            r0.f112 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m397() {
            r2 = this;
            Yue.ۥۢ۠۟۠ r0 = Yue.EnumC5940.f21662
            r2.f112 = r0
            r2.mo394()
            Yue.ۥۢ۠۟۠ r0 = r2.f112
            Yue.ۥۢ۠۟۠ r1 = Yue.EnumC5940.f21659
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }
}
