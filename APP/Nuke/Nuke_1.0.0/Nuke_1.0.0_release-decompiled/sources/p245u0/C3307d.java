package p245u0;

import java.util.ArrayList;
import java.util.List;
import p061L2.C0981u;

/* JADX INFO: renamed from: u0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3307d {

    /* JADX INFO: renamed from: a */
    public final String f10254a;

    /* JADX INFO: renamed from: b */
    public final float f10255b;

    /* JADX INFO: renamed from: c */
    public final float f10256c;

    /* JADX INFO: renamed from: d */
    public final float f10257d;

    /* JADX INFO: renamed from: e */
    public final float f10258e;

    /* JADX INFO: renamed from: f */
    public final float f10259f;

    /* JADX INFO: renamed from: g */
    public final float f10260g;

    /* JADX INFO: renamed from: h */
    public final float f10261h;

    /* JADX INFO: renamed from: i */
    public final List f10262i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f10263j;

    public C3307d(String str, float f2, float f5, float f6, float f7, float f8, float f9, float f10, List list, int i5) {
        str = (i5 & 1) != 0 ? "" : str;
        f2 = (i5 & 2) != 0 ? 0.0f : f2;
        f5 = (i5 & 4) != 0 ? 0.0f : f5;
        f6 = (i5 & 8) != 0 ? 0.0f : f6;
        f7 = (i5 & 16) != 0 ? 1.0f : f7;
        f8 = (i5 & 32) != 0 ? 1.0f : f8;
        f9 = (i5 & 64) != 0 ? 0.0f : f9;
        f10 = (i5 & 128) != 0 ? 0.0f : f10;
        if ((i5 & 256) != 0) {
            int i6 = AbstractC3300G.f10208a;
            list = C0981u.f3047d;
        }
        ArrayList arrayList = new ArrayList();
        this.f10254a = str;
        this.f10255b = f2;
        this.f10256c = f5;
        this.f10257d = f6;
        this.f10258e = f7;
        this.f10259f = f8;
        this.f10260g = f9;
        this.f10261h = f10;
        this.f10262i = list;
        this.f10263j = arrayList;
    }
}
