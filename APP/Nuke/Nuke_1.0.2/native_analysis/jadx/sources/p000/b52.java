package p000;

import com.dokar.quickjs.QuickJs;
import com.dokar.quickjs.QuickJsException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b52 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f607h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ QuickJs f608i;

    public /* synthetic */ b52(QuickJs quickJs, int i) {
        this.f607h = i;
        this.f608i = quickJs;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) throws QuickJsException {
        int i = this.f607h;
        QuickJs quickJs = this.f608i;
        obj.getClass();
        switch (i) {
            case 0:
                quickJs.getTypeConverters().m6384a(obj, AbstractC0731te.m5225n0(quickJs.getTypeConverters(), obj), d72.m969c(Integer.TYPE));
                break;
            case 1:
                quickJs.getTypeConverters().m6384a(obj, AbstractC0731te.m5225n0(quickJs.getTypeConverters(), obj), d72.m968b());
                break;
            default:
                quickJs.getTypeConverters().m6384a(obj, AbstractC0731te.m5225n0(quickJs.getTypeConverters(), obj), d72.m968b());
                break;
        }
        return obj;
    }
}
