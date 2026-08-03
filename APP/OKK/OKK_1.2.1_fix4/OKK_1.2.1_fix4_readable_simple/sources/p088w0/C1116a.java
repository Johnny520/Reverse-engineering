package p088w0;

import android.graphics.Paint;
import android.graphics.Path;
import p085v.AbstractC1100a;

/* JADX INFO: renamed from: w0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1116a {

    /* JADX INFO: renamed from: i */
    public static final int[] f4271i = null;

    /* JADX INFO: renamed from: j */
    public static final float[] f4272j = null;

    /* JADX INFO: renamed from: k */
    public static final int[] f4273k = null;

    /* JADX INFO: renamed from: l */
    public static final float[] f4274l = null;

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
    public final Path f4281g;

    /* JADX INFO: renamed from: h */
    public final Paint f4282h;

    static {
        f4271i = new int[3];
        f4272j = new float[]{0.0f, 0.5f, 1.0f};
        f4273k = new int[4];
        f4274l = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    }

    public C1116a() {
        this.f4281g = new Path();
        Paint r02 = new Paint();
        this.f4282h = r02;
        Paint r1 = new Paint();
        this.f4275a = r1;
        this.f4278d = AbstractC1100a.m2595d(-16777216, 68);
        this.f4279e = AbstractC1100a.m2595d(-16777216, 20);
        this.f4280f = AbstractC1100a.m2595d(-16777216, 0);
        r1.setColor(this.f4278d);
        r02.setColor(0);
        Paint r03 = new Paint(4);
        this.f4276b = r03;
        r03.setStyle(Paint.Style.FILL);
        this.f4277c = new Paint(r03);
    }
}
