package defpackage;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class d30 {
    public static final int[] i = null;
    public static final float[] j = null;
    public static final int[] k = null;
    public static final float[] l = null;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final int d;
    public final int e;
    public final int f;
    public final Path g;
    public final Paint h;

    static {
        i = new int[3];
        j = new float[]{0.0f, 0.5f, 1.0f};
        k = new int[4];
        l = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    }

    public d30() {
        this.g = new Path();
        Paint r0 = new Paint();
        this.h = r0;
        Paint r1 = new Paint();
        this.a = r1;
        this.d = ib.d(-16777216, 68);
        this.e = ib.d(-16777216, 20);
        this.f = ib.d(-16777216, 0);
        r1.setColor(this.d);
        r0.setColor(0);
        Paint r02 = new Paint(4);
        this.b = r02;
        r02.setStyle(Paint.Style.FILL);
        this.c = new Paint(r02);
    }
}
