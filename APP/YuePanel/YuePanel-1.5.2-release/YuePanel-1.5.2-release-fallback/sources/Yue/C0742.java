package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0742 implements org.slf4j.spi.MDCAdapter {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> f2072;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۦۡ$ۥ, reason: contains not printable characters */
    public class C0743 extends java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0742 f2073;

        public C0743(Yue.C0742 r1) {
                r0 = this;
                r0.f2073 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.InheritableThreadLocal
        public /* bridge */ /* synthetic */ java.util.Map<java.lang.String, java.lang.String> childValue(java.util.Map<java.lang.String, java.lang.String> r1) {
                r0 = this;
                java.util.Map r1 = (java.util.Map) r1
                java.util.Map r1 = r0.m4587(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.util.Map<java.lang.String, java.lang.String> m4587(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>(r2)
                return r0
        }
    }

    public C0742() {
            r1 = this;
            r1.<init>()
            Yue.ۥ۟ۢۦۡ$ۥ r0 = new Yue.ۥ۟ۢۦۡ$ۥ
            r0.<init>(r1)
            r1.f2072 = r0
            return
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
            r1 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r1.f2072
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L12
            r0.clear()
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r1.f2072
            r0.remove()
        L12:
            return
    }

    @Override // org.slf4j.spi.MDCAdapter
    public java.lang.String get(java.lang.String r2) {
            r1 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r1.f2072
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L13
            if (r2 == 0) goto L13
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void put(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L1a
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r2.f2072
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L16
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r1 = r2.f2072
            r1.set(r0)
        L16:
            r0.put(r3, r4)
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "key cannot be null"
            r3.<init>(r4)
            throw r3
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void remove(java.lang.String r2) {
            r1 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r1.f2072
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto Ld
            r0.remove(r2)
        Ld:
            return
    }

    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo4584(java.util.Map<java.lang.String, java.lang.String> r3) {
            r2 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r2.f2072
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r3)
            r0.set(r1)
            return
    }

    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.String> mo4585() {
            r2 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r2.f2072
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L10
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            return r1
        L10:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.Set<java.lang.String> m4586() {
            r1 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r1.f2072
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto Lf
            java.util.Set r0 = r0.keySet()
            return r0
        Lf:
            r0 = 0
            return r0
    }
}
