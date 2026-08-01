package androidx.compose.runtime.internal;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0042 extends p000.ga1 implements p000.InterfaceC0120co {

    /* JADX INFO: renamed from: θ */
    public static final androidx.compose.runtime.internal.C0042 f857 = null;

    static {
            androidx.compose.runtime.internal.α r0 = new androidx.compose.runtime.internal.α
            z52 r1 = p000.z52.f12983
            r2 = 0
            r0.<init>(r1, r2)
            androidx.compose.runtime.internal.C0042.f857 = r0
            return
    }

    @Override // p000.ga1, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.ak1
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            ak1 r2 = (p000.ak1) r2
            boolean r1 = super.containsKey(r2)
            return r1
    }

    @Override // p000.ga1, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.i72
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            i72 r2 = (p000.i72) r2
            boolean r1 = super.containsValue(r2)
            return r1
    }

    @Override // p000.ga1, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.ak1
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            ak1 r2 = (p000.ak1) r2
            java.lang.Object r1 = super.get(r2)
            i72 r1 = (p000.i72) r1
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof p000.ak1
            if (r0 != 0) goto L5
            return r3
        L5:
            ak1 r2 = (p000.ak1) r2
            i72 r3 = (p000.i72) r3
            java.lang.Object r1 = super.getOrDefault(r2, r3)
            i72 r1 = (p000.i72) r1
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final androidx.compose.runtime.internal.C0042 m354(p000.ak1 r4, p000.i72 r5) {
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 0
            z52 r2 = r3.f4297
            v r4 = r2.m7111(r0, r1, r4, r5)
            if (r4 != 0) goto Le
            return r3
        Le:
            androidx.compose.runtime.internal.α r5 = new androidx.compose.runtime.internal.α
            java.lang.Object r0 = r4.f11045
            z52 r0 = (p000.z52) r0
            int r3 = r3.f4298
            int r4 = r4.f11044
            int r3 = r3 + r4
            r5.<init>(r0, r3)
            return r5
    }
}
