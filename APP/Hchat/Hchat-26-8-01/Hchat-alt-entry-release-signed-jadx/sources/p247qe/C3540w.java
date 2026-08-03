package p247qe;

import java.util.Set;
import java.util.function.Function;
import p246qd.AbstractC3506j;
import p246qd.C3499c;

/* JADX INFO: renamed from: qe.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3540w implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f11515b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3540w(Set set, int i9) {
        this.f11514a = i9;
        this.f11515b = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        AbstractC3506j abstractC3506j = (AbstractC3506j) obj;
        switch (this.f11514a) {
            case 0:
                abstractC3506j.getClass();
                if (!(abstractC3506j instanceof C3499c) || this.f11515b.contains(abstractC3506j)) {
                    return null;
                }
                return Boolean.TRUE;
            default:
                abstractC3506j.getClass();
                if (!(abstractC3506j instanceof C3499c) || this.f11515b.contains(abstractC3506j)) {
                    return null;
                }
                return abstractC3506j;
        }
    }
}
