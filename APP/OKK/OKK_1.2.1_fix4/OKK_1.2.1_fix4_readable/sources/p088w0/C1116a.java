package p088w0;

import android.graphics.Paint;
import android.graphics.Path;
import p085v.AbstractC1100a;

/* JADX INFO: renamed from: w0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1116a {

    /* JADX INFO: renamed from: i */
    public static final int[] f4271i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f4272j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f4273k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f4274l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f4275a;

    /* JADX INFO: renamed from: b */
    public final Paint f4276b;

    /* JADX INFO: renamed from: c */
    public final Paint f4277c;

    /* JADX INFO: renamed from: d */
    public int f4278d;

    /* JADX INFO: renamed from: e */
    public int f4279e;

    /* JADX INFO: renamed from: f */
    public int f4280f;

    /* JADX INFO: renamed from: g */
    public final Path f4281g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f4282h;

    public C1116a() {
        Paint paint = new Paint();
        this.f4282h = paint;
        Paint paint2 = new Paint();
        this.f4275a = paint2;
        this.f4278d = AbstractC1100a.m2595d(-16777216, 68);
        this.f4279e = AbstractC1100a.m2595d(-16777216, 20);
        this.f4280f = AbstractC1100a.m2595d(-16777216, 0);
        paint2.setColor(this.f4278d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f4276b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f4277c = new Paint(paint3);
    }
}
