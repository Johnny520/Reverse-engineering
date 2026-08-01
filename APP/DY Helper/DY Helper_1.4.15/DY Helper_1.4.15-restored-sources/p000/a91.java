package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class a91 implements p000.InterfaceC0907vf {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Class f147;

    public a91(java.lang.Class r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f147 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.a91
            if (r0 == 0) goto L12
            a91 r2 = (p000.a91) r2
            java.lang.Class r2 = r2.f147
            java.lang.Class r1 = r1.f147
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Class r0 = r0.f147
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r1.f147
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // p000.InterfaceC0907vf
    /* JADX INFO: renamed from: α */
    public final java.lang.Class mo50() {
            r0 = this;
            java.lang.Class r0 = r0.f147
            return r0
    }
}
