package p000;

import com.dokar.quickjs.binding.JsObject;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bw0 extends tw2 implements nn0 {

    /* JADX INFO: renamed from: l */
    public ArrayList f1044l;

    /* JADX INFO: renamed from: m */
    public int f1045m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ r92 f1046n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ boolean f1047o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ jw0 f1048p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ tw0 f1049q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ hg2 f1050r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw0(jw0 jw0Var, tw0 tw0Var, hg2 hg2Var, t00 t00Var) {
        super(3, t00Var);
        this.f1048p = jw0Var;
        this.f1049q = tw0Var;
        this.f1050r = hg2Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        tw0 tw0Var = this.f1049q;
        hg2 hg2Var = this.f1050r;
        bw0 bw0Var = new bw0(this.f1048p, tw0Var, hg2Var, (t00) obj3);
        bw0Var.f1046n = (r92) obj;
        bw0Var.f1047o = zBooleanValue;
        return bw0Var.mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws Throwable {
        ArrayList arrayListM2583b;
        Object objM1101Z;
        r92 r92Var = this.f1046n;
        boolean z = this.f1047o;
        int i = this.f1045m;
        if (i == 0) {
            fg1.m1627T(obj);
            js0 js0Var = r92Var.f9461m;
            u92 u92Var = r92Var.f9462n;
            int i2 = r92Var.f9459k;
            jw0 jw0Var = this.f1048p;
            arrayListM2583b = jw0.m2583b(jw0Var, js0Var);
            tw0 tw0Var = this.f1049q;
            if (tw0Var.f10984i && (200 > i2 || i2 >= 300)) {
                String strM2208g = hk1.m2208g(i2, "The download returned HTTP status ", ".");
                Map mapSingletonMap = Collections.singletonMap("status", new Integer(i2));
                mapSingletonMap.getClass();
                c80.m672p("HTTP_STATUS", strM2208g, 0, mapSingletonMap, null, 20);
                return null;
            }
            if (u92Var.mo273c() > tw0Var.f10981f) {
                c80.m672p("QUOTA_EXCEEDED", "Download exceeds the size limit.", 0, null, null, 28);
                return null;
            }
            dq1 dq1Var = jw0Var.f5239b;
            InputStream inputStreamM5476b = u92Var.m5476b();
            long j = tw0Var.f10981f;
            boolean z2 = tw0Var.f10982g;
            boolean z3 = tw0Var.f10983h;
            this.f1046n = r92Var;
            this.f1044l = arrayListM2583b;
            this.f1047o = z;
            this.f1045m = 1;
            objM1101Z = dq1Var.m1101Z(this.f1050r, inputStreamM5476b, j, z2, z3, this);
            k20 k20Var = k20.f5323h;
            if (objM1101Z == k20Var) {
                return k20Var;
            }
        } else {
            if (i != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList = this.f1044l;
            fg1.m1627T(obj);
            arrayListM2583b = arrayList;
            objM1101Z = obj;
        }
        ow1 ow1Var = new ow1("status", new Integer(r92Var.f9459k));
        ow1 ow1Var2 = new ow1("statusText", r92Var.f9458j);
        yw0 yw0Var = r92Var.f9456h.f5390a;
        Set set = mw0.f6903a;
        xw0 xw0VarM6360f = yw0Var.m6360f();
        xw0VarM6360f.f13207h = null;
        return new JsObject(we1.m5876q0(ow1Var, ow1Var2, new ow1("url", xw0VarM6360f.m6193b().f13649i), new ow1("redirected", Boolean.valueOf(z)), new ow1("headers", mw0.m3215b(arrayListM2583b)), new ow1("file", ((gg2) objM1101Z).m1909a())));
    }
}
