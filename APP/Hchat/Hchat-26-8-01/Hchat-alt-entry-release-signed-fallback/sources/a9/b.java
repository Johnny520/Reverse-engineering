package a9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends android.text.style.ClickableSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f81g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f82h;

    public b(fg.a r2) {
            r1 = this;
            r0 = 0
            r1.f81g = r0
            r2.getClass()
            r1.<init>()
            r1.f82h = r2
            return
    }

    public b(i2.m r2) {
            r1 = this;
            r0 = 1
            r1.f81g = r0
            r1.<init>()
            r1.f82h = r2
            return
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r0 = r1.f81g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r1.f82h
            i2.m r2 = (i2.m) r2
            r2.getClass()
            return
        Ld:
            r2.getClass()
            java.lang.Object r2 = r1.f82h
            fg.a r2 = (fg.a) r2
            r2.invoke()
            return
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            int r0 = r1.f81g
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.updateDrawState(r2)
            return
        L9:
            r2.getClass()
            r0 = 0
            r2.setUnderlineText(r0)
            return
    }
}
