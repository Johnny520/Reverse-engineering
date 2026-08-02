package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n30 extends m30 {

    /* JADX INFO: renamed from: j */
    public final d42 f6977j;

    /* JADX INFO: renamed from: k */
    public d42 f6978k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n30(r30 r30Var, o30 o30Var) {
        super(r30Var, o30Var);
        q30 q30Var = o30Var.f7459h;
        String str = o30Var.f7460i.f8714h;
        if (r30Var.equals(r30.f9340l)) {
            String str2 = q30Var.f8714h;
            str2.getClass();
            if (str2.equals("invoke") || str2.equals("invokeExact")) {
                this.f6977j = d42.m959b(str);
            } else {
                if (str != null) {
                    ConcurrentHashMap concurrentHashMap = d42.f1862l;
                    um2.m5516f("descriptor == null");
                    throw null;
                }
                ConcurrentHashMap concurrentHashMap2 = d42.f1862l;
                d42 d42VarM959b = (d42) concurrentHashMap2.get(str);
                if (d42VarM959b == null) {
                    d42VarM959b = d42.m959b(str);
                    d42 d42Var = (d42) concurrentHashMap2.putIfAbsent(d42VarM959b.f1863h, d42VarM959b);
                    if (d42Var != null) {
                        d42VarM959b = d42Var;
                    }
                }
                this.f6977j = d42VarM959b;
            }
        } else {
            if (r30Var.equals(r30.f9341m)) {
                String str3 = q30Var.f8714h;
                str3.getClass();
                switch (str3) {
                }
            }
            if (str != null) {
            }
        }
        this.f6978k = null;
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: a */
    public final o43 mo22a() {
        return this.f6977j.f1864i;
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: e */
    public final int mo626e(AbstractC0147dz abstractC0147dz) {
        m30 m30Var = (m30) abstractC0147dz;
        int iCompareTo = this.f6455h.compareTo(m30Var.f6455h);
        if (iCompareTo == 0) {
            iCompareTo = this.f6456i.f7459h.compareTo(m30Var.f6456i.f7459h);
        }
        return iCompareTo != 0 ? iCompareTo : this.f6977j.compareTo(((n30) abstractC0147dz).f6977j);
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: f */
    public final String mo24f() {
        return "method";
    }

    /* JADX INFO: renamed from: g */
    public final int m3232g(boolean z) {
        d42 d42Var = this.f6977j;
        if (!z) {
            if (this.f6978k == null) {
                o43 o43Var = this.f6455h.f9342h;
                d42Var.getClass();
                String str = "(" + o43Var.f7521h + d42Var.f1863h.substring(1);
                Object[] objArr = d42Var.f1865j.f5590i;
                int length = objArr.length;
                wu2 wu2Var = new wu2(length + 1);
                wu2Var.m2694f(0, o43Var);
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    wu2Var.m2694f(i2, objArr[i]);
                    i = i2;
                }
                wu2Var.f11990h = false;
                d42 d42Var2 = new d42(str, d42Var.f1864i, wu2Var);
                d42 d42Var3 = (d42) d42.f1862l.putIfAbsent(str, d42Var2);
                if (d42Var3 != null) {
                    d42Var2 = d42Var3;
                }
                this.f6978k = d42Var2;
            }
            d42Var = this.f6978k;
        }
        wu2 wu2Var2 = d42Var.f1865j;
        int length2 = wu2Var2.f5590i.length;
        int iM3507e = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            iM3507e += ((o43) wu2Var2.m2693e(i3)).m3507e();
        }
        return iM3507e;
    }
}
