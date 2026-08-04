package yyds;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛱᛳᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0096 extends View {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList f710;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String[] f711;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public ValueAnimator f712;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Paint f713;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096(Context context) {
        super(context, null);
        AbstractC2328.m4341(-1330052160193390L);
        this.f711 = new String[]{AbstractC2328.m4341(-1330086519931758L), AbstractC2328.m4341(-1330095109866350L), AbstractC2328.m4341(-1330107994768238L), AbstractC2328.m4341(-1330116584702830L), AbstractC2328.m4341(-1330129469604718L), AbstractC2328.m4341(-1330142354506606L), AbstractC2328.m4341(-1330155239408494L), AbstractC2328.m4341(-1330172419277678L)};
        Paint paint = new Paint(1);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f713 = paint;
        this.f710 = new ArrayList();
        float f = getResources().getDisplayMetrics().density;
        float f2 = getResources().getDisplayMetrics().scaledDensity;
        for (int i = 0; i < 11; i++) {
            ArrayList arrayList = this.f710;
            String[] strArr = this.f711;
            C1510 c1510 = AbstractC2497.f12305;
            int length = strArr.length;
            AbstractC0638 abstractC0638 = AbstractC2497.f12306;
            arrayList.add(new C2333(strArr[abstractC0638.m1531(length)], c1510.m3134(), c1510.m3134(), ((c1510.m3134() * 10.0f) + 15.0f) * f2, abstractC0638.m1531(18) + 16, c1510.m3134() * 6.2831855f, (c1510.m3134() * 0.5f) + 0.35f, ((c1510.m3134() * 6.0f) + 4.0f) * f, ((c1510.m3134() * 7.0f) + 5.0f) * f, (c1510.m3134() * 8.0f) + 5.0f));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC2328.m4341(-1330185304179566L);
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fUptimeMillis = SystemClock.uptimeMillis() / 1000.0f;
        for (C2333 c2333 : this.f710) {
            float f = c2333.f11487;
            float f2 = c2333.f11491;
            float f3 = c2333.f11490;
            float fSin = ((float) Math.sin((fUptimeMillis * f) + f3)) * c2333.f11482;
            float f4 = f * fUptimeMillis;
            float fCos = ((float) Math.cos((1.3f * f3) + (0.9f * f4))) * c2333.f11483;
            float fSin2 = ((float) Math.sin((f4 * 0.7f) + f3)) * c2333.f11488;
            Paint paint = this.f713;
            paint.setTextSize(f2);
            paint.setAlpha(c2333.f11484);
            canvas.save();
            canvas.translate((c2333.f11486 * width) + fSin, (c2333.f11489 * height) + fCos);
            canvas.rotate(fSin2);
            canvas.drawText(c2333.f11485, 0.0f, f2 * 0.35f, paint);
            canvas.restore();
        }
    }
}
