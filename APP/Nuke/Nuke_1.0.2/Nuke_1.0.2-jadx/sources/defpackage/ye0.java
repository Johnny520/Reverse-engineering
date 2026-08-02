package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ye0 {
    public final ArrayList a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ye0(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList(20);
                break;
            case 2:
                this.a = new ArrayList();
                break;
            case 3:
                this.a = new ArrayList(32);
                break;
            case 4:
                this.a = new ArrayList();
                break;
            case 5:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        n93.c(str);
        n93.d(str2, str);
        n93.a(this, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public js0 b() {
        return new js0((String[]) this.a.toArray(new String[0]));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        this.a.add(yx1.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new zx1(f, f2, f3, f4, f5, f6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new hy1(f, f2, f3, f4, f5, f6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized j92 f(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            k92 k92Var = (k92) this.a.get(i);
            if (k92Var.a.isAssignableFrom(cls)) {
                return k92Var.b;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized ArrayList g(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (f33 f33Var : this.a) {
            if ((f33Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(f33Var.b)) && !arrayList.contains(f33Var.b)) {
                arrayList.add(f33Var.b);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(float f) {
        this.a.add(new iy1(f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(float f, float f2) {
        this.a.add(new by1(f, f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j(float f, float f2) {
        this.a.add(new jy1(f, f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(float f, float f2) {
        this.a.add(new cy1(f, f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(float f, float f2, float f3, float f4) {
        this.a.add(new ey1(f, f2, f3, f4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void m(float f, float f2, float f3, float f4) {
        this.a.add(new my1(f, f2, f3, f4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void n(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o(float f) {
        this.a.add(new oy1(f));
    }
}
