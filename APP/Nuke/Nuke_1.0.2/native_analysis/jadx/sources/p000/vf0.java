package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf0 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11922h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11923i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f11924j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f11925k;

    public /* synthetic */ vf0(int i, String str, wf0 wf0Var) {
        this.f11923i = i;
        this.f11924j = str;
        this.f11925k = wf0Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f11922h;
        Object obj = this.f11925k;
        int i2 = this.f11923i;
        Object obj2 = this.f11924j;
        switch (i) {
            case 0:
                String str = (String) obj2;
                wf0 wf0Var = (wf0) obj;
                yo2[] yo2VarArr = new yo2[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    yo2VarArr[i3] = up0.m5545j(str + '.' + wf0Var.f517e[i3], yv2.f13635j, new yo2[0]);
                }
                return yo2VarArr;
            default:
                qv0 qv0Var = (qv0) obj2;
                try {
                    qv0Var.f9183D.m6353k(i2, (cg0) obj);
                    break;
                } catch (IOException e) {
                    cg0 cg0Var = cg0.PROTOCOL_ERROR;
                    qv0Var.m4281b(cg0Var, cg0Var, e);
                }
                return a83.f116a;
        }
    }

    public /* synthetic */ vf0(qv0 qv0Var, int i, cg0 cg0Var) {
        this.f11924j = qv0Var;
        this.f11923i = i;
        this.f11925k = cg0Var;
    }
}
