package p141c1;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p027E4.C0330q;
import p117X2.AbstractC1665j;
import p222q0.AbstractC2902c;
import p222q0.C2905f;
import p222q0.C2906g;

/* JADX INFO: renamed from: c1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1888a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: d */
    public final AbstractC2902c f6413d;

    public C1888a(AbstractC2902c abstractC2902c) {
        this.f6413d = abstractC2902c;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C2905f c2905f = C2905f.f9190b;
            AbstractC2902c abstractC2902c = this.f6413d;
            if (AbstractC1665j.m2981a(abstractC2902c, c2905f)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC2902c instanceof C2906g)) {
                throw new C0330q();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            C2906g c2906g = (C2906g) abstractC2902c;
            textPaint.setStrokeWidth(c2906g.f9191b);
            textPaint.setStrokeMiter(c2906g.f9192c);
            int i5 = c2906g.f9194e;
            textPaint.setStrokeJoin(i5 == 0 ? Paint.Join.MITER : i5 == 1 ? Paint.Join.ROUND : i5 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i6 = c2906g.f9193d;
            textPaint.setStrokeCap(i6 == 0 ? Paint.Cap.BUTT : i6 == 1 ? Paint.Cap.ROUND : i6 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
