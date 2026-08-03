package p000;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: renamed from: Ox */
/* JADX INFO: loaded from: classes.dex */
public final class C0642Ox {

    /* JADX INFO: renamed from: i */
    public static final int[] f2050i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f2051j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f2052k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f2053l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f2054a;

    /* JADX INFO: renamed from: b */
    public final Paint f2055b;

    /* JADX INFO: renamed from: c */
    public final Paint f2056c;

    /* JADX INFO: renamed from: d */
    public final int f2057d;

    /* JADX INFO: renamed from: e */
    public final int f2058e;

    /* JADX INFO: renamed from: f */
    public final int f2059f;

    /* JADX INFO: renamed from: g */
    public final Path f2060g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f2061h;

    public C0642Ox() {
        Paint paint = new Paint();
        this.f2061h = paint;
        Paint paint2 = new Paint();
        this.f2054a = paint2;
        this.f2057d = AbstractC2797za.m5367e(-16777216, 68);
        this.f2058e = AbstractC2797za.m5367e(-16777216, 20);
        this.f2059f = AbstractC2797za.m5367e(-16777216, 0);
        paint2.setColor(this.f2057d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f2055b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f2056c = new Paint(paint3);
    }
}
