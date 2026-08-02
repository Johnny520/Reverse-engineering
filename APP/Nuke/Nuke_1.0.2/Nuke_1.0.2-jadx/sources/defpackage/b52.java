package defpackage;

import com.dokar.quickjs.QuickJs;
import com.dokar.quickjs.QuickJsException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b52 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ QuickJs i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b52(QuickJs quickJs, int i) {
        this.h = i;
        this.i = quickJs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) throws QuickJsException {
        int i = this.h;
        QuickJs quickJs = this.i;
        obj.getClass();
        switch (i) {
            case 0:
                quickJs.getTypeConverters().a(obj, te.n0(quickJs.getTypeConverters(), obj), d72.c(Integer.TYPE));
                break;
            case 1:
                quickJs.getTypeConverters().a(obj, te.n0(quickJs.getTypeConverters(), obj), d72.b());
                break;
            default:
                quickJs.getTypeConverters().a(obj, te.n0(quickJs.getTypeConverters(), obj), d72.b());
                break;
        }
        return obj;
    }
}
