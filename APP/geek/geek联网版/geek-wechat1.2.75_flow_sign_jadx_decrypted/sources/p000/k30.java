package p000;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class k30 {

    /* JADX INFO: renamed from: i */
    public static final int[] f2764i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f2765j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f2766k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f2767l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f2768a;

    /* JADX INFO: renamed from: b */
    public final Paint f2769b;

    /* JADX INFO: renamed from: c */
    public final Paint f2770c;

    /* JADX INFO: renamed from: d */
    public final int f2771d;

    /* JADX INFO: renamed from: e */
    public final int f2772e;

    /* JADX INFO: renamed from: f */
    public final int f2773f;

    /* JADX INFO: renamed from: g */
    public final Path f2774g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f2775h;

    public k30() {
        Paint paint = new Paint();
        this.f2775h = paint;
        Paint paint2 = new Paint();
        this.f2768a = paint2;
        this.f2771d = AbstractC0627qb.m2144d(-16777216, 68);
        this.f2772e = AbstractC0627qb.m2144d(-16777216, 20);
        this.f2773f = AbstractC0627qb.m2144d(-16777216, 0);
        paint2.setColor(this.f2771d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f2769b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f2770c = new Paint(paint3);
    }
}
