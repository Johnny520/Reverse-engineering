package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cf1 extends k2 {
    public final /* synthetic */ int h;
    public final Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ cf1(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2
    public final int a() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                return ((Matcher) ((kj1) obj).i).groupCount() + 1;
            default:
                zy1 zy1Var = (zy1) obj;
                zy1Var.getClass();
                return zy1Var.i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public af1 b(int i) {
        Matcher matcher = (Matcher) ((kj1) this.i).i;
        c11 c11VarX = ci0.X(matcher.start(i), matcher.end(i));
        if (c11VarX.h < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new af1(strGroup, c11VarX);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.h) {
            case 0:
                if (obj == null ? true : obj instanceof af1) {
                    return super.contains((af1) obj);
                }
                return false;
            default:
                return ((zy1) this.i).containsValue(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2, java.util.Collection
    public boolean isEmpty() {
        switch (this.h) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                return new r33(new bj0(new ng(1, new c11(0, size() - 1, 1)), new v(16, this), 1));
            default:
                h43 h43Var = ((zy1) this.i).h;
                i43[] i43VarArr = new i43[8];
                for (int i = 0; i < 8; i++) {
                    i43VarArr[i] = new j43(2);
                }
                return new iz1(h43Var, i43VarArr);
        }
    }
}
