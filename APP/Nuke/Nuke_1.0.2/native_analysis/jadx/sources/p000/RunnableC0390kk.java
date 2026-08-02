package p000;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import nuke.p003ui.HomeActivity;

/* JADX INFO: renamed from: kk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0390kk implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5604h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5605i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5606j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5607k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f5608l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f5609m;

    public /* synthetic */ RunnableC0390kk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f5604h = i;
        this.f5605i = obj;
        this.f5606j = obj2;
        this.f5607k = obj3;
        this.f5608l = obj4;
        this.f5609m = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wk1 wk1VarMo73C;
        int i = this.f5604h;
        Object obj = this.f5609m;
        Object obj2 = this.f5608l;
        Object obj3 = this.f5607k;
        Object obj4 = this.f5606j;
        Object obj5 = this.f5605i;
        switch (i) {
            case 0:
                m13 m13Var = (m13) obj5;
                d61 d61Var = (d61) obj4;
                String str = (String) obj3;
                e70 e70Var = (e70) obj2;
                xl0 xl0Var = (xl0) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    vr2 vr2VarM1126j = ds2.m1126j();
                    wk1 wk1Var = vr2VarM1126j instanceof wk1 ? (wk1) vr2VarM1126j : null;
                    if (wk1Var == null || (wk1VarMo73C = wk1Var.mo73C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        vr2 vr2VarM5787j = wk1VarMo73C.m5787j();
                        try {
                            m13 m13VarM6130k0 = xe1.m6130k0(m13Var, d61Var);
                            be0 be0Var = be0.f819h;
                            C0878x9 c0878x9 = new C0878x9(str, m13VarM6130k0, be0Var, be0Var, xl0Var, e70Var);
                            c0878x9.mo828c();
                            c0878x9.mo826a();
                            vr2.m5784q(vr2VarM5787j);
                            wk1VarMo73C.mo90w().mo3743k();
                            wk1VarMo73C.mo75c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            vr2.m5784q(vr2VarM5787j);
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
                in0 in0Var = lx2Var.f6374c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) in0Var.mo5j(resources)).booleanValue();
                in0 in0Var2 = lx2Var2.f6374c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                md0Var.mo3060b(lx2Var, lx2Var2, window, view, zBooleanValue, ((Boolean) in0Var2.mo5j(resources2)).booleanValue());
                return;
        }
    }
}
