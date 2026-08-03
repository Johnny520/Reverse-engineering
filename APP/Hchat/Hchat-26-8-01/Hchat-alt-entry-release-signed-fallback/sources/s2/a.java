package s2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1.c f12330g;

    public a(h1.c r1) {
            r0 = this;
            r0.<init>()
            r0.f12330g = r1
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r5) {
            r4 = this;
            if (r5 == 0) goto L5d
            h1.f r0 = h1.f.f5043b
            h1.c r1 = r4.f12330g
            boolean r0 = gg.l.a(r1, r0)
            if (r0 == 0) goto L12
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r5.setStyle(r0)
            return
        L12:
            boolean r0 = r1 instanceof h1.g
            if (r0 == 0) goto L5a
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r0)
            h1.g r1 = (h1.g) r1
            float r0 = r1.f5044b
            r5.setStrokeWidth(r0)
            float r0 = r1.f5045c
            r5.setStrokeMiter(r0)
            int r0 = r1.f5047e
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L30
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L3c
        L30:
            if (r0 != r3) goto L35
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L3c
        L35:
            if (r0 != r2) goto L3a
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L3c
        L3a:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
        L3c:
            r5.setStrokeJoin(r0)
            int r0 = r1.f5046d
            if (r0 != 0) goto L46
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto L52
        L46:
            if (r0 != r3) goto L4b
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L52
        L4b:
            if (r0 != r2) goto L50
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            goto L52
        L50:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
        L52:
            r5.setStrokeCap(r0)
            r0 = 0
            r5.setPathEffect(r0)
            return
        L5a:
            okio.a.k()
        L5d:
            return
    }
}
