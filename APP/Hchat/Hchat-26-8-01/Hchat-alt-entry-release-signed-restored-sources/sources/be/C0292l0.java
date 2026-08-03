package be;

import java.util.HashSet;
import java.util.function.Function;
import p246qd.AbstractC3506j;
import p246qd.C3499c;

/* JADX INFO: renamed from: be.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0292l0 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HashSet f850b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0292l0(HashSet hashSet, int i9) {
        this.f849a = i9;
        this.f850b = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        AbstractC3506j abstractC3506j = (AbstractC3506j) obj;
        switch (this.f849a) {
            case 0:
                abstractC3506j.getClass();
                if (abstractC3506j instanceof C3499c) {
                    this.f850b.add(abstractC3506j.mo7350l());
                }
                break;
            default:
                abstractC3506j.getClass();
                if (abstractC3506j instanceof C3499c) {
                    this.f850b.add(abstractC3506j.mo7350l());
                }
                break;
        }
        return null;
    }
}
