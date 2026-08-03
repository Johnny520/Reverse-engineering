package a;

/* JADX INFO: loaded from: classes.dex */
public class F4 extends a.Ta {
    public static final /* synthetic */ int z = 0;
    public a.F4.a y;

    public static final class a extends a.Ta.b {
        public final android.graphics.RectF q;

        public a(a.F4.a r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.RectF r1 = r1.q
                r0.q = r1
                return
        }

        public a(a.Vd r1, android.graphics.RectF r2) {
                r0 = this;
                r0.<init>(r1)
                r0.q = r2
                return
        }

        @Override // a.Ta.b, android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                a.F4$b r0 = new a.F4$b
                r0.<init>(r1)
                r0.y = r1
                r0.invalidateSelf()
                return r0
        }
    }

    @android.annotation.TargetApi(18)
    public static class b extends a.F4 {
        @Override // a.Ta
        public final void f(android.graphics.Canvas r2) {
                r1 = this;
                a.F4$a r0 = r1.y
                android.graphics.RectF r0 = r0.q
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Le
                super.f(r2)
                return
            Le:
                r2.save()
                a.F4$a r0 = r1.y
                android.graphics.RectF r0 = r0.q
                r2.clipOutRect(r0)
                super.f(r2)
                r2.restore()
                return
        }
    }

    @Override // a.Ta, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
            r2 = this;
            a.F4$a r0 = new a.F4$a
            a.F4$a r1 = r2.y
            r0.<init>(r1)
            r2.y = r0
            return r2
    }

    public final void o(float r3, float r4, float r5, float r6) {
            r2 = this;
            a.F4$a r0 = r2.y
            android.graphics.RectF r0 = r0.q
            float r1 = r0.left
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
            float r1 = r0.top
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
            float r1 = r0.right
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
            float r1 = r0.bottom
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            r0.set(r3, r4, r5, r6)
            r2.invalidateSelf()
            return
    }
}
