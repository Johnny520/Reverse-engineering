package p000;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class d30 {

    /* JADX INFO: renamed from: i */
    public static final int[] f1349i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f1350j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f1351k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f1352l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f1353a;

    /* JADX INFO: renamed from: b */
    public final Paint f1354b;

    /* JADX INFO: renamed from: c */
    public final Paint f1355c;

    /* JADX INFO: renamed from: d */
    public final int f1356d;

    /* JADX INFO: renamed from: e */
    public final int f1357e;

    /* JADX INFO: renamed from: f */
    public final int f1358f;

    /* JADX INFO: renamed from: g */
    public final Path f1359g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f1360h;

    public d30() {
        Paint paint = new Paint();
        this.f1360h = paint;
        Paint paint2 = new Paint();
        this.f1353a = paint2;
        this.f1356d = AbstractC0329ib.m1428d(-16777216, 68);
        this.f1357e = AbstractC0329ib.m1428d(-16777216, 20);
        this.f1358f = AbstractC0329ib.m1428d(-16777216, 0);
        paint2.setColor(this.f1356d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f1354b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f1355c = new Paint(paint3);
    }
}
