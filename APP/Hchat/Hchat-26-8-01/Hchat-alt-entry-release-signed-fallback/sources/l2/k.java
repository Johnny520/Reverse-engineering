package l2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends android.text.style.CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7781b;

    public k(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f7780a = r1
            r0.f7781b = r2
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            boolean r0 = r1.f7780a
            r2.setUnderlineText(r0)
            boolean r0 = r1.f7781b
            r2.setStrikeThruText(r0)
            return
    }
}
