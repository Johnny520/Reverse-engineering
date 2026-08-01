package p000;

/* JADX INFO: renamed from: in */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0401in {

    /* JADX INFO: renamed from: α */
    public java.lang.Object f5134;

    /* JADX INFO: renamed from: α */
    public boolean m2764(int r8, p000.x80 r9, java.lang.Object r10) {
            r7 = this;
            java.util.ArrayList r0 = r9.f12070
            r1 = 1
            if (r0 != 0) goto La
            r10 = 0
            r7.m2765(r8, r9, r10)
            return r1
        La:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L3f
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof p000.q80
            if (r6 == 0) goto L24
            boolean r6 = r5.equals(r10)
            if (r6 == 0) goto L35
            r7.m2765(r3, r9, r5)
            return r1
        L24:
            boolean r6 = r5 instanceof p000.x80
            if (r6 == 0) goto L38
            r6 = r5
            x80 r6 = (p000.x80) r6
            boolean r6 = r7.m2764(r8, r6, r10)
            if (r6 == 0) goto L35
            r7.m2765(r3, r9, r5)
            return r1
        L35:
            int r4 = r4 + 1
            goto L10
        L38:
            java.lang.String r7 = "Unexpected child source info "
            p000.C1080.m7278(r5, r7)
            r7 = 0
            return r7
        L3f:
            return r3
    }

    /* JADX INFO: renamed from: β */
    public void m2765(int r1, p000.x80 r2, java.lang.Object r3) {
            r0 = this;
            jn r2 = new jn
            r3 = 0
            r2.<init>(r1, r3, r3)
            java.lang.Object r0 = r0.f5134
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: γ */
    public android.graphics.RenderEffect m2766() {
            r1 = this;
            java.lang.Object r0 = r1.f5134
            android.graphics.RenderEffect r0 = (android.graphics.RenderEffect) r0
            if (r0 != 0) goto Lc
            android.graphics.RenderEffect r0 = r1.mo26()
            r1.f5134 = r0
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public void m2767() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ε */
    public abstract android.graphics.RenderEffect mo26();

    /* JADX INFO: renamed from: ζ */
    public boolean m2768() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: η */
    public void m2769(int r1, java.lang.Object r2, p000.x80 r3, java.lang.Object r4) {
            r0 = this;
            i2 r4 = p000.C0730qn.f9051
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 != 0) goto L9
            return
        L9:
            r2 = 0
            r0.m2765(r1, r3, r2)
            return
    }
}
