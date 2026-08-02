package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qx0 {

    /* JADX INFO: renamed from: a */
    public final String f9273a;

    /* JADX INFO: renamed from: b */
    public final float f9274b;

    /* JADX INFO: renamed from: c */
    public final float f9275c;

    /* JADX INFO: renamed from: d */
    public final float f9276d;

    /* JADX INFO: renamed from: e */
    public final float f9277e;

    /* JADX INFO: renamed from: f */
    public final float f9278f;

    /* JADX INFO: renamed from: g */
    public final float f9279g;

    /* JADX INFO: renamed from: h */
    public final float f9280h;

    /* JADX INFO: renamed from: i */
    public final List f9281i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f9282j;

    public qx0(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & 256) != 0) {
            int i2 = s93.f9998a;
            list = be0.f819h;
        }
        ArrayList arrayList = new ArrayList();
        this.f9273a = str;
        this.f9274b = f;
        this.f9275c = f2;
        this.f9276d = f3;
        this.f9277e = f4;
        this.f9278f = f5;
        this.f9279g = f6;
        this.f9280h = f7;
        this.f9281i = list;
        this.f9282j = arrayList;
    }
}
