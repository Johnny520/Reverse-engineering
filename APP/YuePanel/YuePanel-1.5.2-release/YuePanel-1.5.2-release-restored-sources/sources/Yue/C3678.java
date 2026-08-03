package Yue;

import Yue.C7180;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(17)
public class C3678 extends C3680 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟۟$ۥ */
    public class C0220 implements C7180.InterfaceC1199 {
        public C0220() {
        }

        @Override // Yue.C7180.InterfaceC1199
        /* JADX INFO: renamed from: ۥ */
        public void mo748(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // Yue.C3680, Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo10084() {
        C7180.f21649 = new C0220();
    }
}
