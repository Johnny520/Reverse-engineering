package Yue;

import Yue.C7180;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3680 implements InterfaceC3682 {

    /* JADX INFO: renamed from: ۥ */
    public final RectF f455 = new RectF();

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۡ$ۥ */
    public class C0221 implements C7180.InterfaceC1199 {
        public C0221() {
        }

        @Override // Yue.C7180.InterfaceC1199
        /* JADX INFO: renamed from: ۥ */
        public void mo748(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float fWidth = (rectF.width() - f2) - 1.0f;
            float fHeight = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C3680.this.f455.set(f4, f4, f3, f3);
                int iSave = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(C3680.this.f455, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C3680.this.f455, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C3680.this.f455, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C3680.this.f455, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(iSave);
                float f5 = (rectF.left + f3) - 1.0f;
                float f6 = rectF.top;
                canvas.drawRect(f5, f6, (rectF.right - f3) + 1.0f, f6 + f3, paint);
                float f7 = (rectF.left + f3) - 1.0f;
                float f8 = rectF.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF.right - f3) + 1.0f, f8, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ */
    public void mo749(InterfaceC3681 interfaceC3681, float f) {
        m10099(interfaceC3681).m22479(f);
        mo10088(interfaceC3681);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟ */
    public float mo750(InterfaceC3681 interfaceC3681) {
        return m10099(interfaceC3681).m22472();
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟ */
    public float mo10085(InterfaceC3681 interfaceC3681) {
        return m10099(interfaceC3681).m22473();
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public float mo10086(InterfaceC3681 interfaceC3681) {
        return m10099(interfaceC3681).m22475();
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo10087(InterfaceC3681 interfaceC3681) {
        m10099(interfaceC3681).m22476(interfaceC3681.mo10100());
        mo10088(interfaceC3681);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo10088(InterfaceC3681 interfaceC3681) {
        Rect rect = new Rect();
        m10099(interfaceC3681).m22471(rect);
        interfaceC3681.mo751((int) Math.ceil(mo10093(interfaceC3681)), (int) Math.ceil(mo10085(interfaceC3681)));
        interfaceC3681.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo10089(InterfaceC3681 interfaceC3681, float f) {
        m10099(interfaceC3681).m22480(f);
        mo10088(interfaceC3681);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo10090(InterfaceC3681 interfaceC3681, @InterfaceC6490 ColorStateList colorStateList) {
        m10099(interfaceC3681).m22478(colorStateList);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public ColorStateList mo10091(InterfaceC3681 interfaceC3681) {
        return m10099(interfaceC3681).m22469();
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo10092(InterfaceC3681 interfaceC3681) {
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public float mo10093(InterfaceC3681 interfaceC3681) {
        return m10099(interfaceC3681).m22474();
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo10094(InterfaceC3681 interfaceC3681, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C7180 c7180M10098 = m10098(context, colorStateList, f, f2, f3);
        c7180M10098.m22476(interfaceC3681.mo10100());
        interfaceC3681.mo752(c7180M10098);
        mo10088(interfaceC3681);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public float mo10095(InterfaceC3681 interfaceC3681) {
        return m10099(interfaceC3681).m22470();
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo10096(InterfaceC3681 interfaceC3681, float f) {
        m10099(interfaceC3681).m22481(f);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo10084() {
        C7180.f21649 = new C0221();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final C7180 m10098(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C7180(context.getResources(), colorStateList, f, f2, f3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final C7180 m10099(InterfaceC3681 interfaceC3681) {
        return (C7180) interfaceC3681.mo10102();
    }
}
