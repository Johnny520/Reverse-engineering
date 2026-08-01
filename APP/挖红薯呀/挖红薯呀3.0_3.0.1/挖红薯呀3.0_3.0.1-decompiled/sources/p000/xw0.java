package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class xw0 implements InterfaceC0519no {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yw0 f7428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7429b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cx0 f7430c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xw0(yw0 yw0Var, Object obj, cx0 cx0Var) {
        this.f7428a = yw0Var;
        this.f7429b = obj;
        this.f7430c = cx0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0519no
    /* JADX INFO: renamed from: a */
    public final void mo35a() {
        yw0 yw0Var = this.f7428a;
        jh0 jh0Var = yw0Var.f7699e;
        Object obj = this.f7429b;
        Object objM1705k = jh0Var.m1705k(obj);
        cx0 cx0Var = this.f7430c;
        if (objM1705k == cx0Var) {
            Map map = yw0Var.f7698d;
            Map mapMo216c = cx0Var.mo216c();
            if (mapMo216c.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, mapMo216c);
            }
        }
    }
}
