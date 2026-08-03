package p000a;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: renamed from: a.Ud */
/* JADX INFO: loaded from: classes.dex */
public final class C0375Ud {

    /* JADX INFO: renamed from: i */
    public static final int[] f1398i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f1399j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f1400k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f1401l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f1402a;

    /* JADX INFO: renamed from: b */
    public final Paint f1403b;

    /* JADX INFO: renamed from: c */
    public final Paint f1404c;

    /* JADX INFO: renamed from: d */
    public final int f1405d;

    /* JADX INFO: renamed from: e */
    public final int f1406e;

    /* JADX INFO: renamed from: f */
    public final int f1407f;

    /* JADX INFO: renamed from: g */
    public final Path f1408g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f1409h;

    public C0375Ud() {
        Paint paint = new Paint();
        this.f1409h = paint;
        Paint paint2 = new Paint();
        this.f1402a = paint2;
        this.f1405d = C0872v3.m2086d(-16777216, 68);
        this.f1406e = C0872v3.m2086d(-16777216, 20);
        this.f1407f = C0872v3.m2086d(-16777216, 0);
        paint2.setColor(this.f1405d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f1403b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f1404c = new Paint(paint3);
    }
}
