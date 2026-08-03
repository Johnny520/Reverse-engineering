package p268s2;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import gg.AbstractC1416l;
import okio.C3193a;
import p101h1.AbstractC1566c;
import p101h1.C1569f;
import p101h1.C1570g;

/* JADX INFO: renamed from: s2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3921a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: g */
    public final AbstractC1566c f12873g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3921a(AbstractC1566c abstractC1566c) {
        this.f12873g = abstractC1566c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C1569f c1569f = C1569f.f5225b;
            AbstractC1566c abstractC1566c = this.f12873g;
            if (AbstractC1416l.m3825a(abstractC1566c, c1569f)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC1566c instanceof C1570g)) {
                C3193a.m6822k();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            C1570g c1570g = (C1570g) abstractC1566c;
            textPaint.setStrokeWidth(c1570g.f5226b);
            textPaint.setStrokeMiter(c1570g.f5227c);
            int i9 = c1570g.f5229e;
            textPaint.setStrokeJoin(i9 == 0 ? Paint.Join.MITER : i9 == 1 ? Paint.Join.ROUND : i9 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i10 = c1570g.f5228d;
            textPaint.setStrokeCap(i10 == 0 ? Paint.Cap.BUTT : i10 == 1 ? Paint.Cap.ROUND : i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
