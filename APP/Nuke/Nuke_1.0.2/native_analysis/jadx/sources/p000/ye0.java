package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ye0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f13428a;

    public ye0(int i) {
        switch (i) {
            case 1:
                this.f13428a = new ArrayList(20);
                break;
            case 2:
                this.f13428a = new ArrayList();
                break;
            case 3:
                this.f13428a = new ArrayList(32);
                break;
            case 4:
                this.f13428a = new ArrayList();
                break;
            case 5:
                this.f13428a = new ArrayList();
                break;
            default:
                this.f13428a = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6249a(String str, String str2) {
        str.getClass();
        str2.getClass();
        n93.m3262c(str);
        n93.m3263d(str2, str);
        n93.m3260a(this, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public js0 m6250b() {
        return new js0((String[]) this.f13428a.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: c */
    public void m6251c() {
        this.f13428a.add(yx1.f13662c);
    }

    /* JADX INFO: renamed from: d */
    public void m6252d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f13428a.add(new zx1(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: e */
    public void m6253e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f13428a.add(new hy1(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: f */
    public synchronized j92 m6254f(Class cls) {
        int size = this.f13428a.size();
        for (int i = 0; i < size; i++) {
            k92 k92Var = (k92) this.f13428a.get(i);
            if (k92Var.f5409a.isAssignableFrom(cls)) {
                return k92Var.f5410b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public synchronized ArrayList m6255g(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (f33 f33Var : this.f13428a) {
            if ((f33Var.f2771a.isAssignableFrom(cls) && cls2.isAssignableFrom(f33Var.f2772b)) && !arrayList.contains(f33Var.f2772b)) {
                arrayList.add(f33Var.f2772b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public void m6256h(float f) {
        this.f13428a.add(new iy1(f));
    }

    /* JADX INFO: renamed from: i */
    public void m6257i(float f, float f2) {
        this.f13428a.add(new by1(f, f2));
    }

    /* JADX INFO: renamed from: j */
    public void m6258j(float f, float f2) {
        this.f13428a.add(new jy1(f, f2));
    }

    /* JADX INFO: renamed from: k */
    public void m6259k(float f, float f2) {
        this.f13428a.add(new cy1(f, f2));
    }

    /* JADX INFO: renamed from: l */
    public void m6260l(float f, float f2, float f3, float f4) {
        this.f13428a.add(new ey1(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: m */
    public void m6261m(float f, float f2, float f3, float f4) {
        this.f13428a.add(new my1(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: n */
    public void m6262n(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13428a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m6263o(float f) {
        this.f13428a.add(new oy1(f));
    }
}
