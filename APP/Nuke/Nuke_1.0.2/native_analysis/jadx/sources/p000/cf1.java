package p000;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cf1 extends AbstractC0372k2 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1501h;

    /* JADX INFO: renamed from: i */
    public final Object f1502i;

    public /* synthetic */ cf1(int i, Object obj) {
        this.f1501h = i;
        this.f1502i = obj;
    }

    @Override // p000.AbstractC0372k2
    /* JADX INFO: renamed from: a */
    public final int mo529a() {
        int i = this.f1501h;
        Object obj = this.f1502i;
        switch (i) {
            case 0:
                return ((Matcher) ((kj1) obj).f5594i).groupCount() + 1;
            default:
                zy1 zy1Var = (zy1) obj;
                zy1Var.getClass();
                return zy1Var.f14151i;
        }
    }

    /* JADX INFO: renamed from: b */
    public af1 m767b(int i) {
        Matcher matcher = (Matcher) ((kj1) this.f1502i).f5594i;
        c11 c11VarM799X = ci0.m799X(matcher.start(i), matcher.end(i));
        if (c11VarM799X.f25h < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new af1(strGroup, c11VarM799X);
    }

    @Override // p000.AbstractC0372k2, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f1501h) {
            case 0:
                if (obj == null ? true : obj instanceof af1) {
                    return super.contains((af1) obj);
                }
                return false;
            default:
                return ((zy1) this.f1502i).containsValue(obj);
        }
    }

    @Override // p000.AbstractC0372k2, java.util.Collection
    public boolean isEmpty() {
        switch (this.f1501h) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1501h) {
            case 0:
                return new r33(new bj0(new C0497ng(1, new c11(0, size() - 1, 1)), new C0792v(16, this), 1));
            default:
                h43 h43Var = ((zy1) this.f1502i).f14150h;
                i43[] i43VarArr = new i43[8];
                for (int i = 0; i < 8; i++) {
                    i43VarArr[i] = new j43(2);
                }
                return new iz1(h43Var, i43VarArr);
        }
    }
}
