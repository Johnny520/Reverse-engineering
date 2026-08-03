package com.google.android.material.carousel;

import com.google.android.material.carousel.C1277b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0310R2;
import p000a.C0888w0;

/* JADX INFO: renamed from: com.google.android.material.carousel.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1278c {

    /* JADX INFO: renamed from: a */
    public final C1277b f5585a;

    /* JADX INFO: renamed from: b */
    public final List<C1277b> f5586b;

    /* JADX INFO: renamed from: c */
    public final List<C1277b> f5587c;

    /* JADX INFO: renamed from: d */
    public final float[] f5588d;

    /* JADX INFO: renamed from: e */
    public final float[] f5589e;

    /* JADX INFO: renamed from: f */
    public final float f5590f;

    /* JADX INFO: renamed from: g */
    public final float f5591g;

    public C1278c(C1277b c1277b, ArrayList arrayList, ArrayList arrayList2) {
        this.f5585a = c1277b;
        this.f5586b = Collections.unmodifiableList(arrayList);
        this.f5587c = Collections.unmodifiableList(arrayList2);
        float f = ((C1277b) arrayList.get(arrayList.size() - 1)).m3157b().f5577a - c1277b.m3157b().f5577a;
        this.f5590f = f;
        float f2 = c1277b.m3159d().f5577a - ((C1277b) arrayList2.get(arrayList2.size() - 1)).m3159d().f5577a;
        this.f5591g = f2;
        this.f5588d = m3164d(f, arrayList, true);
        this.f5589e = m3164d(f2, arrayList2, false);
    }

    /* JADX INFO: renamed from: d */
    public static float[] m3164d(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            C1277b c1277b = (C1277b) arrayList.get(i2);
            C1277b c1277b2 = (C1277b) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? c1277b2.m3157b().f5577a - c1277b.m3157b().f5577a : c1277b.m3159d().f5577a - c1277b2.m3159d().f5577a) / f);
            i++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: e */
    public static C1277b m3165e(C1277b c1277b, int i, int i2, float f, int i3, int i4, float f2) {
        ArrayList arrayList = new ArrayList(c1277b.f5565b);
        arrayList.add(i2, (C1277b.b) arrayList.remove(i));
        C1277b.a aVar = new C1277b.a(c1277b.f5564a, f2);
        float f3 = f;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            C1277b.b bVar = (C1277b.b) arrayList.get(i5);
            float f4 = bVar.f5580d;
            aVar.m3161b((f4 / 2.0f) + f3, bVar.f5579c, f4, i5 >= i3 && i5 <= i4, bVar.f5581e, bVar.f5582f, 0.0f, 0.0f);
            f3 += bVar.f5580d;
            i5++;
        }
        return aVar.m3163d();
    }

    /* JADX INFO: renamed from: f */
    public static C1277b m3166f(C1277b c1277b, float f, float f2, boolean z, float f3) {
        int i;
        List<C1277b.b> list = c1277b.f5565b;
        ArrayList arrayList = new ArrayList(list);
        float f4 = c1277b.f5564a;
        C1277b.a aVar = new C1277b.a(f4, f2);
        Iterator<C1277b.b> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().f5581e) {
                i2++;
            }
        }
        float size = f / (list.size() - i2);
        float f5 = z ? f : 0.0f;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            C1277b.b bVar = (C1277b.b) arrayList.get(i3);
            if (bVar.f5581e) {
                i = i3;
                aVar.m3161b(bVar.f5578b, bVar.f5579c, bVar.f5580d, false, true, bVar.f5582f, 0.0f, 0.0f);
            } else {
                i = i3;
                boolean z2 = i >= c1277b.f5566c && i <= c1277b.f5567d;
                float f6 = bVar.f5580d - size;
                float fM856a = AbstractC0310R2.m856a(f6, f4, f3);
                float f7 = (f6 / 2.0f) + f5;
                float f8 = f7 - bVar.f5578b;
                float f9 = f8;
                if (!z) {
                    f8 = 0.0f;
                }
                if (z) {
                    f9 = 0.0f;
                }
                aVar.m3161b(f7, fM856a, f6, z2, false, bVar.f5582f, f8, f9);
                f5 += f6;
            }
            i3 = i + 1;
        }
        return aVar.m3163d();
    }

    /* JADX INFO: renamed from: a */
    public final C1277b m3167a() {
        return this.f5587c.get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: b */
    public final C1277b m3168b(float f, float f2, float f3) {
        float fM2113b;
        List<C1277b> list;
        float[] fArr;
        float[] fArr2;
        float f4 = this.f5590f;
        float f5 = f2 + f4;
        float f6 = this.f5591g;
        float f7 = f3 - f6;
        float f8 = m3169c().m3156a().f5583g;
        float f9 = m3167a().m3158c().f5584h;
        if (f4 == f8) {
            f5 += f8;
        }
        if (f6 == f9) {
            f7 -= f9;
        }
        if (f < f5) {
            fM2113b = C0888w0.m2113b(1.0f, 0.0f, f2, f5, f);
            list = this.f5586b;
            fArr = this.f5588d;
        } else {
            if (f <= f7) {
                return this.f5585a;
            }
            fM2113b = C0888w0.m2113b(0.0f, 1.0f, f7, f3, f);
            list = this.f5587c;
            fArr = this.f5589e;
        }
        int size = list.size();
        float f10 = fArr[0];
        int i = 1;
        while (true) {
            if (i >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f11 = fArr[i];
            if (fM2113b <= f11) {
                fArr2 = new float[]{C0888w0.m2113b(0.0f, 1.0f, f10, f11, fM2113b), i - 1, i};
                break;
            }
            i++;
            f10 = f11;
        }
        C1277b c1277b = list.get((int) fArr2[1]);
        C1277b c1277b2 = list.get((int) fArr2[2]);
        float f12 = fArr2[0];
        if (c1277b.f5564a != c1277b2.f5564a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<C1277b.b> list2 = c1277b.f5565b;
        int size2 = list2.size();
        List<C1277b.b> list3 = c1277b2.f5565b;
        if (size2 != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            C1277b.b bVar = list2.get(i2);
            C1277b.b bVar2 = list3.get(i2);
            arrayList.add(new C1277b.b(C0888w0.m2112a(bVar.f5577a, bVar2.f5577a, f12), C0888w0.m2112a(bVar.f5578b, bVar2.f5578b, f12), C0888w0.m2112a(bVar.f5579c, bVar2.f5579c, f12), C0888w0.m2112a(bVar.f5580d, bVar2.f5580d, f12), false, 0.0f, 0.0f, 0.0f));
        }
        return new C1277b(c1277b.f5564a, arrayList, C0888w0.m2114c(c1277b.f5566c, c1277b2.f5566c, f12), C0888w0.m2114c(c1277b.f5567d, c1277b2.f5567d, f12));
    }

    /* JADX INFO: renamed from: c */
    public final C1277b m3169c() {
        return this.f5586b.get(r0.size() - 1);
    }
}
