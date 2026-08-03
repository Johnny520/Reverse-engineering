package p000;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: v9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2618v9 {

    /* JADX INFO: renamed from: a */
    public final RectF f9074a = new RectF();

    /* JADX INFO: renamed from: b */
    public final Paint f9075b;

    /* JADX INFO: renamed from: c */
    public final Paint f9076c;

    /* JADX INFO: renamed from: d */
    public final Paint f9077d;

    /* JADX INFO: renamed from: e */
    public float f9078e;

    /* JADX INFO: renamed from: f */
    public float f9079f;

    /* JADX INFO: renamed from: g */
    public float f9080g;

    /* JADX INFO: renamed from: h */
    public float f9081h;

    /* JADX INFO: renamed from: i */
    public int[] f9082i;

    /* JADX INFO: renamed from: j */
    public int f9083j;

    /* JADX INFO: renamed from: k */
    public float f9084k;

    /* JADX INFO: renamed from: l */
    public float f9085l;

    /* JADX INFO: renamed from: m */
    public float f9086m;

    /* JADX INFO: renamed from: n */
    public boolean f9087n;

    /* JADX INFO: renamed from: o */
    public Path f9088o;

    /* JADX INFO: renamed from: p */
    public float f9089p;

    /* JADX INFO: renamed from: q */
    public float f9090q;

    /* JADX INFO: renamed from: r */
    public int f9091r;

    /* JADX INFO: renamed from: s */
    public int f9092s;

    /* JADX INFO: renamed from: t */
    public int f9093t;

    /* JADX INFO: renamed from: u */
    public int f9094u;

    public C2618v9() {
        Paint paint = new Paint();
        this.f9075b = paint;
        Paint paint2 = new Paint();
        this.f9076c = paint2;
        Paint paint3 = new Paint();
        this.f9077d = paint3;
        this.f9078e = 0.0f;
        this.f9079f = 0.0f;
        this.f9080g = 0.0f;
        this.f9081h = 5.0f;
        this.f9089p = 1.0f;
        this.f9093t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m5129a(int i) {
        this.f9083j = i;
        this.f9094u = this.f9082i[i];
    }
}
