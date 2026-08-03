package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b4 extends p000.f<android.widget.ImageView> {
    public b4(p000.z7 r7, android.widget.ImageView r8, p000.w8 r9, java.lang.String r10, p000.f0 r11, boolean r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // p000.f
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void mo63() {
            r1 = this;
            r0 = 1
            r1.f324 = r0
            return
    }

    @Override // p000.f
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void mo64(android.graphics.Bitmap r8, ۟.z7.e r9) {
            r7 = this;
            if (r8 == 0) goto L1c
            ۟.f$a r0 = r7.f315
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 != 0) goto Le
            return
        Le:
            ۟.z7 r0 = r7.f313
            android.content.Context r2 = r0.f1252
            boolean r6 = r0.f1260
            boolean r5 = r7.f316
            r3 = r8
            r4 = r9
            p000.a8.m33(r1, r2, r3, r4, r5, r6)
            return
        L1c:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r0 = 0
            r9[r0] = r7
            java.lang.String r0 = "Attempted to complete action with no result!\n%s"
            java.lang.String r9 = java.lang.String.format(r0, r9)
            r8.<init>(r9)
            throw r8
    }

    @Override // p000.f
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void mo65() {
            r2 = this;
            ۟.f$a r0 = r2.f315
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            int r1 = r2.f319
            if (r1 == 0) goto L13
            r0.setImageResource(r1)
            goto L1a
        L13:
            android.graphics.drawable.Drawable r1 = r2.f320
            if (r1 == 0) goto L1a
            r0.setImageDrawable(r1)
        L1a:
            return
    }
}
