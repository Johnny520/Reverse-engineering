package l2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends android.text.style.CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7779d;

    public j(int r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.f7776a = r1
            r0.f7777b = r2
            r0.f7778c = r3
            r0.f7779d = r4
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r5) {
            r4 = this;
            float r0 = r4.f7778c
            int r1 = r4.f7776a
            float r2 = r4.f7779d
            float r3 = r4.f7777b
            r5.setShadowLayer(r2, r3, r0, r1)
            return
    }
}
