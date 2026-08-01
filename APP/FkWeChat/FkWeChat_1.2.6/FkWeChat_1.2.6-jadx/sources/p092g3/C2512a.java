package p092g3;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p024b9.AbstractC1061t;
import p215oc.C5729x;
import p290u1.AbstractC8488g;
import p290u1.C8491j;
import p290u1.C8492k;

/* JADX INFO: renamed from: g3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2512a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: q */
    public final AbstractC8488g f6783q;

    public C2512a(AbstractC8488g abstractC8488g) {
        this.f6783q = abstractC8488g;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            AbstractC8488g abstractC8488g = this.f6783q;
            if (AbstractC1061t.m3842c(abstractC8488g, C8491j.f28345a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC8488g instanceof C8492k)) {
                C5729x.m23182a();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((C8492k) this.f6783q).m32670f());
            textPaint.setStrokeMiter(((C8492k) this.f6783q).m32668d());
            textPaint.setStrokeJoin(AbstractC2513b.m9020b(((C8492k) this.f6783q).m32667c()));
            textPaint.setStrokeCap(AbstractC2513b.m9019a(((C8492k) this.f6783q).m32666b()));
            ((C8492k) this.f6783q).m32669e();
            textPaint.setPathEffect(null);
        }
    }
}
