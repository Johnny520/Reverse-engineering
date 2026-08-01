package p224;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.graphics.drawscope.C2344;
import androidx.compose.p001ui.graphics.drawscope.C2345;
import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8745 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC2340 f22278;

    public C8745(AbstractC2340 abstractC2340) {
        this.f22278 = abstractC2340;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C2345 c2345 = C2345.f4640;
            AbstractC2340 abstractC2340 = this.f22278;
            if (AbstractC5227.m9466(abstractC2340, c2345)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC2340 instanceof C2344)) {
                C5043.m9170();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            C2344 c2344 = (C2344) abstractC2340;
            textPaint.setStrokeWidth(c2344.f4639);
            textPaint.setStrokeMiter(c2344.f4638);
            int i = c2344.f4636;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = c2344.f4637;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
