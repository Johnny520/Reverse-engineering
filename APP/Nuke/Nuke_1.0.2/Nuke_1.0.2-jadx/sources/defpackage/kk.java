package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kk implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ kk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
        this.m = obj5;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // java.lang.Runnable
    public final void run() {
        wk1 wk1VarC;
        int i = this.h;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                m13 m13Var = (m13) obj5;
                d61 d61Var = (d61) obj4;
                String str = (String) obj3;
                e70 e70Var = (e70) obj2;
                xl0 xl0Var = (xl0) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    vr2 vr2VarJ = ds2.j();
                    wk1 wk1Var = vr2VarJ instanceof wk1 ? (wk1) vr2VarJ : null;
                    if (wk1Var == null || (wk1VarC = wk1Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        vr2 vr2VarJ2 = wk1VarC.j();
                        try {
                            m13 m13VarK0 = xe1.k0(m13Var, d61Var);
                            be0 be0Var = be0.h;
                            x9 x9Var = new x9(str, m13VarK0, be0Var, be0Var, xl0Var, e70Var);
                            x9Var.c();
                            x9Var.a();
                            vr2.q(vr2VarJ2);
                            wk1VarC.w().k();
                            wk1VarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            vr2.q(vr2VarJ2);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            default:
                md0 md0Var = (md0) obj5;
                lx2 lx2Var = (lx2) obj4;
                lx2 lx2Var2 = (lx2) obj3;
                View view = (View) obj;
                Window window = ((HomeActivity) obj2).getWindow();
                window.getClass();
                in0 in0Var = lx2Var.c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) in0Var.j(resources)).booleanValue();
                in0 in0Var2 = lx2Var2.c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                md0Var.b(lx2Var, lx2Var2, window, view, zBooleanValue, ((Boolean) in0Var2.j(resources2)).booleanValue());
                return;
        }
    }
}
