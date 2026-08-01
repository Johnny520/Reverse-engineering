package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class lq0 extends AbstractC0414l0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3579d;

    /* JADX INFO: renamed from: e */
    public final gq0 f3580e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lq0(gq0 gq0Var, int i) {
        this.f3579d = i;
        this.f3580e = gq0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p
    /* JADX INFO: renamed from: a */
    public final int mo6a() {
        int i = this.f3579d;
        gq0 gq0Var = this.f3580e;
        switch (i) {
            case 0:
                gq0Var.getClass();
                break;
            default:
                gq0Var.getClass();
                break;
        }
        return gq0Var.f2038e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.f3579d;
        gq0 gq0Var = this.f3580e;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = gq0Var.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && gq0Var.containsKey(entry.getKey());
            default:
                return gq0Var.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3579d) {
            case 0:
                l91 l91Var = this.f3580e.f2037d;
                m91[] m91VarArr = new m91[8];
                for (int i = 0; i < 8; i++) {
                    m91VarArr[i] = new n91(0);
                }
                return new mq0(l91Var, m91VarArr);
            default:
                l91 l91Var2 = this.f3580e.f2037d;
                m91[] m91VarArr2 = new m91[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    m91VarArr2[i2] = new n91(1);
                }
                return new mq0(l91Var2, m91VarArr2);
        }
    }
}
