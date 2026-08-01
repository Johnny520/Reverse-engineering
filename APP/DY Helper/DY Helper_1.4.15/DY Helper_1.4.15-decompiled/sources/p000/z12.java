package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z12 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f12941;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f12942;

    /* JADX INFO: renamed from: γ */
    public final androidx.compose.p001ui.input.pointer.PointerInputEventHandler f12943;

    public z12(java.lang.Object r1, java.lang.Object r2, androidx.compose.p001ui.input.pointer.PointerInputEventHandler r3) {
            r0 = this;
            r0.<init>()
            r0.f12941 = r1
            r0.f12942 = r2
            r0.f12943 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L26
        L3:
            boolean r0 = r3 instanceof p000.z12
            if (r0 != 0) goto L8
            goto L28
        L8:
            z12 r3 = (p000.z12) r3
            java.lang.Object r0 = r3.f12941
            java.lang.Object r1 = r2.f12941
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L28
        L15:
            java.lang.Object r0 = r2.f12942
            java.lang.Object r1 = r3.f12942
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L28
        L20:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r2 = r2.f12943
            androidx.compose.ui.input.pointer.PointerInputEventHandler r3 = r3.f12943
            if (r2 != r3) goto L28
        L26:
            r2 = 1
            return r2
        L28:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f12941
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f12942
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 961
            androidx.compose.ui.input.pointer.PointerInputEventHandler r2 = r2.f12943
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r3 = this;
            e22 r0 = new e22
            java.lang.Object r1 = r3.f12942
            androidx.compose.ui.input.pointer.PointerInputEventHandler r2 = r3.f12943
            java.lang.Object r3 = r3.f12941
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r5) {
            r4 = this;
            e22 r5 = (p000.e22) r5
            java.lang.Object r0 = r5.f3384
            java.lang.Object r1 = r4.f12941
            boolean r0 = r0.equals(r1)
            r2 = 1
            r0 = r0 ^ r2
            r5.f3384 = r1
            java.lang.Object r1 = r5.f3385
            java.lang.Object r3 = r4.f12942
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L19
            r0 = r2
        L19:
            r5.f3385 = r3
            androidx.compose.ui.input.pointer.PointerInputEventHandler r1 = r5.f3386
            java.lang.Class r1 = r1.getClass()
            androidx.compose.ui.input.pointer.PointerInputEventHandler r4 = r4.f12943
            java.lang.Class r3 = r4.getClass()
            if (r1 == r3) goto L2a
            goto L2b
        L2a:
            r2 = r0
        L2b:
            if (r2 == 0) goto L30
            r5.m1837()
        L30:
            r5.f3386 = r4
            return
    }
}
