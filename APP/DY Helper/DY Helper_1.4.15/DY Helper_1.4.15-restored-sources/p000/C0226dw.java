package p000;

/* JADX INFO: renamed from: dw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0226dw extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* JADX INFO: renamed from: ε */
    public final p000.kn0 f3304;

    public C0226dw(p000.kn0 r1) {
            r0 = this;
            r0.<init>()
            r0.f3304 = r1
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            if (r2 == 0) goto L39
            t30 r0 = p000.t30.f10165
            kn0 r1 = r1.f3304
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 == 0) goto L12
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r2.setStyle(r1)
            return
        L12:
            boolean r0 = r1 instanceof p000.y02
            if (r0 == 0) goto L36
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
            y02 r1 = (p000.y02) r1
            float r1 = r1.f12420
            r2.setStrokeWidth(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            r2.setStrokeMiter(r1)
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.MITER
            r2.setStrokeJoin(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.BUTT
            r2.setStrokeCap(r1)
            r1 = 0
            r2.setPathEffect(r1)
            return
        L36:
            p000.C1080.m7272()
        L39:
            return
    }
}
