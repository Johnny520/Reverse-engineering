package p000a;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p000a.C0354Ta;

/* JADX INFO: renamed from: a.F4 */
/* JADX INFO: loaded from: classes.dex */
public class C0097F4 extends C0354Ta {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f308z = 0;

    /* JADX INFO: renamed from: y */
    public a f309y;

    /* JADX INFO: renamed from: a.F4$b */
    @TargetApi(18)
    public static class b extends C0097F4 {
        @Override // p000a.C0354Ta
        /* JADX INFO: renamed from: f */
        public final void mo260f(Canvas canvas) {
            if (this.f309y.f310q.isEmpty()) {
                super.mo260f(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f309y.f310q);
            super.mo260f(canvas);
            canvas.restore();
        }
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f309y = new a(this.f309y);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final void m259o(float f, float f2, float f3, float f4) {
        RectF rectF = this.f309y.f310q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: a.F4$a */
    public static final class a extends C0354Ta.b {

        /* JADX INFO: renamed from: q */
        public final RectF f310q;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(C0393Vd c0393Vd, RectF rectF) {
            super(c0393Vd);
            this.f310q = rectF;
        }

        @Override // p000a.C0354Ta.b, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.f309y = this;
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.f310q = aVar.f310q;
        }
    }
}
