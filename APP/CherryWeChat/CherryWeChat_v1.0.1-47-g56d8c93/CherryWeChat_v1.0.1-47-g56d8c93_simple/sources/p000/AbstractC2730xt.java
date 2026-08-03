package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1160i;

/* JADX INFO: renamed from: xt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2730xt {

    /* JADX INFO: renamed from: a */
    public final AbstractC1160i f9328a;

    /* JADX INFO: renamed from: b */
    public int f9329b;

    /* JADX INFO: renamed from: c */
    public final Rect f9330c;

    public AbstractC2730xt(AbstractC1160i r2) {
        this.f9329b = Integer.MIN_VALUE;
        this.f9330c = new Rect();
        this.f9328a = r2;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC2730xt m5296a(AbstractC1160i r1, int r2) {
        if (r2 == 0) goto L10;
        if (r2 != 1) goto L8;
        return new C2687wt(r1, 1);
    L8:
        throw new IllegalArgumentException("invalid orientation");
    L10:
        return new C2687wt(r1, 0);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo5251b(View r1);

    /* JADX INFO: renamed from: c */
    public abstract int mo5252c(View r1);

    /* JADX INFO: renamed from: d */
    public abstract int mo5253d(View r1);

    /* JADX INFO: renamed from: e */
    public abstract int mo5254e(View r1);

    /* JADX INFO: renamed from: f */
    public abstract int mo5255f();

    /* JADX INFO: renamed from: g */
    public abstract int mo5256g();

    /* JADX INFO: renamed from: h */
    public abstract int mo5257h();

    /* JADX INFO: renamed from: i */
    public abstract int mo5258i();

    /* JADX INFO: renamed from: j */
    public abstract int mo5259j();

    /* JADX INFO: renamed from: k */
    public abstract int mo5260k();

    /* JADX INFO: renamed from: l */
    public abstract int mo5261l();

    /* JADX INFO: renamed from: m */
    public abstract int mo5262m(View r1);

    /* JADX INFO: renamed from: n */
    public abstract int mo5263n(View r1);

    /* JADX INFO: renamed from: o */
    public abstract void mo5264o(int r1);
}
