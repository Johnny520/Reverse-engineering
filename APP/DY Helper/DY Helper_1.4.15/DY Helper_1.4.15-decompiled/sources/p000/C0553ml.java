package p000;

/* JADX INFO: renamed from: ml */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0553ml {

    /* JADX INFO: renamed from: α */
    public final android.view.View f7197;

    /* JADX INFO: renamed from: β */
    public final android.view.ViewGroup.LayoutParams f7198;

    public C0553ml(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.<init>()
            r0.f7197 = r1
            r0.f7198 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.C0553ml
            if (r0 != 0) goto L8
            goto L1f
        L8:
            ml r3 = (p000.C0553ml) r3
            android.view.View r0 = r2.f7197
            android.view.View r1 = r3.f7197
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            android.view.ViewGroup$LayoutParams r2 = r2.f7198
            android.view.ViewGroup$LayoutParams r3 = r3.f7198
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.view.View r0 = r1.f7197
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.view.ViewGroup$LayoutParams r1 = r1.f7198
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChildSnapshot(view="
            r0.<init>(r1)
            android.view.View r1 = r2.f7197
            r0.append(r1)
            java.lang.String r1 = ", layoutParams="
            r0.append(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.f7198
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
