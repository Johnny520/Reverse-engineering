package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class uc0 {

    /* JADX INFO: renamed from: α */
    public java.util.ArrayList f10691;

    public uc0() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            r2.f10691 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public p000.vc0 m5839() {
            r2 = this;
            vc0 r0 = new vc0
            java.util.ArrayList r2 = r2.f10691
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r2 = r2.toArray(r1)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.<init>(r2)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public void m5840() {
            r1 = this;
            r0 = 0
            r1.f10691 = r0
            return
    }

    /* JADX INFO: renamed from: γ */
    public void m5841(java.lang.String r3) {
            r2 = this;
            java.util.ArrayList r2 = r2.f10691
            r0 = 0
        L3:
            int r1 = r2.size()
            if (r0 >= r1) goto L20
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L1d
            r2.remove(r0)
            r2.remove(r0)
            int r0 = r0 + (-2)
        L1d:
            int r0 = r0 + 2
            goto L3
        L20:
            return
    }
}
