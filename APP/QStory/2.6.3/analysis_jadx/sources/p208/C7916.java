package p208;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import androidx.compose.ui.graphics.drawscope.C1509;
import androidx.compose.ui.graphics.drawscope.C1510;
import io.ktor.util.C4211;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7916 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC1505 f21933;

    public C7916(AbstractC1505 abstractC1505) {
        this.f21933 = abstractC1505;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C1510 c1510 = C1510.f4295;
            AbstractC1505 abstractC1505 = this.f21933;
            if (AbstractC4395.m8907(abstractC1505, c1510)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC1505 instanceof C1509)) {
                C4211.m8611();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            C1509 c1509 = (C1509) abstractC1505;
            textPaint.setStrokeWidth(c1509.f4294);
            textPaint.setStrokeMiter(c1509.f4293);
            int i = c1509.f4291;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = c1509.f4292;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
