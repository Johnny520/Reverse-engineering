package p086r0;

import org.json.JSONArray;
import org.json.JSONObject;
import p009E0.C0109i;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0514f;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: r0.t0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0942t0 implements InterfaceC0193a, InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3358b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0942t0(int i2, Object obj) {
        this.f3357a = i2;
        this.f3358b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        Object obj = this.f3358b;
        try {
            AbstractC0514f.f1622b.mo1012c(obj, "notifyDataSetInvalidated", new Object[0]);
        } catch (Throwable unused) {
        }
        try {
            AbstractC0514f.f1622b.mo1012c(obj, "notifyDataSetChanged", new Object[0]);
        } catch (Throwable unused2) {
        }
        return C0109i.f404a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) {
        switch (this.f3357a) {
            case 1:
                String str = (String) obj;
                AbstractC0223g.m415b(str);
                return AbstractC1135r.m2504z(str) + ":" + AbstractC1135r.m2483e(((JSONObject) this.f3358b).opt(str));
            default:
                return AbstractC1135r.m2483e(((JSONArray) this.f3358b).opt(((Integer) obj).intValue()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0942t0(C0842H0 c0842h0, Object obj) {
        this.f3357a = 0;
        this.f3358b = obj;
    }
}
