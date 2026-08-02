package defpackage;

import com.dokar.quickjs.binding.JsObject;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bw0 extends tw2 implements nn0 {
    public ArrayList l;
    public int m;
    public /* synthetic */ r92 n;
    public /* synthetic */ boolean o;
    public final /* synthetic */ jw0 p;
    public final /* synthetic */ tw0 q;
    public final /* synthetic */ hg2 r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw0(jw0 jw0Var, tw0 tw0Var, hg2 hg2Var, t00 t00Var) {
        super(3, t00Var);
        this.p = jw0Var;
        this.q = tw0Var;
        this.r = hg2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        tw0 tw0Var = this.q;
        hg2 hg2Var = this.r;
        bw0 bw0Var = new bw0(this.p, tw0Var, hg2Var, (t00) obj3);
        bw0Var.n = (r92) obj;
        bw0Var.o = zBooleanValue;
        return bw0Var.r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws Throwable {
        ArrayList arrayListB;
        Object objZ;
        r92 r92Var = this.n;
        boolean z = this.o;
        int i = this.m;
        if (i == 0) {
            fg1.T(obj);
            js0 js0Var = r92Var.m;
            u92 u92Var = r92Var.n;
            int i2 = r92Var.k;
            jw0 jw0Var = this.p;
            arrayListB = jw0.b(jw0Var, js0Var);
            tw0 tw0Var = this.q;
            if (tw0Var.i && (200 > i2 || i2 >= 300)) {
                String strG = hk1.g(i2, "The download returned HTTP status ", ".");
                Map mapSingletonMap = Collections.singletonMap("status", new Integer(i2));
                mapSingletonMap.getClass();
                c80.p("HTTP_STATUS", strG, 0, mapSingletonMap, null, 20);
                return null;
            }
            if (u92Var.c() > tw0Var.f) {
                c80.p("QUOTA_EXCEEDED", "Download exceeds the size limit.", 0, null, null, 28);
                return null;
            }
            dq1 dq1Var = jw0Var.b;
            InputStream inputStreamB = u92Var.b();
            long j = tw0Var.f;
            boolean z2 = tw0Var.g;
            boolean z3 = tw0Var.h;
            this.n = r92Var;
            this.l = arrayListB;
            this.o = z;
            this.m = 1;
            objZ = dq1Var.Z(this.r, inputStreamB, j, z2, z3, this);
            k20 k20Var = k20.h;
            if (objZ == k20Var) {
                return k20Var;
            }
        } else {
            if (i != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList = this.l;
            fg1.T(obj);
            arrayListB = arrayList;
            objZ = obj;
        }
        ow1 ow1Var = new ow1("status", new Integer(r92Var.k));
        ow1 ow1Var2 = new ow1("statusText", r92Var.j);
        yw0 yw0Var = r92Var.h.a;
        Set set = mw0.a;
        xw0 xw0VarF = yw0Var.f();
        xw0VarF.h = null;
        return new JsObject(we1.q0(ow1Var, ow1Var2, new ow1("url", xw0VarF.b().i), new ow1("redirected", Boolean.valueOf(z)), new ow1("headers", mw0.b(arrayListB)), new ow1("file", ((gg2) objZ).a())));
    }
}
