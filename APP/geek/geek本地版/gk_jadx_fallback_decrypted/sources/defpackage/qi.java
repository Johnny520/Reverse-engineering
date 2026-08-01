package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qi extends defpackage.a80 {
    public final defpackage.pi w;

    public qi(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            pi r0 = new pi
            r0.<init>(r2)
            r1.w = r0
            return
    }

    @Override // defpackage.a80
    public final void C(boolean r2) {
            r1 = this;
            ei r0 = defpackage.ei.j
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto La
            return
        La:
            pi r0 = r1.w
            r0.C(r2)
            return
    }

    @Override // defpackage.a80
    public final void D(boolean r3) {
            r2 = this;
            pi r0 = r2.w
            ei r1 = defpackage.ei.j
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 != 0) goto Le
            r0.y = r3
            return
        Le:
            r0.D(r3)
            return
    }

    @Override // defpackage.a80
    public final android.text.InputFilter[] l(android.text.InputFilter[] r2) {
            r1 = this;
            ei r0 = defpackage.ei.j
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto La
            return r2
        La:
            pi r0 = r1.w
            android.text.InputFilter[] r2 = r0.l(r2)
            return r2
    }
}
