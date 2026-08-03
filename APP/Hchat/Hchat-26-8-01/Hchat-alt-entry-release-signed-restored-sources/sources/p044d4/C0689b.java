package p044d4;

import bsh.loader.BshLoaderHelper;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import p083fe.C1214a;
import p084ff.C1215a;
import p199nd.AbstractC2963b0;
import p246qd.AbstractC3506j;
import p246qd.C3499c;

/* JADX INFO: renamed from: d4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0689b implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2098a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2099b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2100c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2101d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0689b(C1215a c1215a, String str, byte[] bArr) {
        this.f2098a = 1;
        this.f2101d = c1215a;
        this.f2099b = str;
        this.f2100c = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2098a) {
            case 0:
                return BshLoaderHelper.lambda$getClassByCode$0((String) this.f2099b, (byte[]) this.f2100c, (ClassLoader) this.f2101d, (String) obj);
            case 1:
                return ((C1215a) this.f2101d).m3352e((String) this.f2099b, (byte[]) this.f2100c, ((Integer) obj).intValue());
            case 2:
                C1214a c1214a = (C1214a) this.f2099b;
                AbstractC3506j abstractC3506j = (AbstractC3506j) this.f2100c;
                return c1214a.m3345l(abstractC3506j, abstractC3506j, (AbstractC3506j) ((List) this.f2101d).get(((Integer) obj).intValue()));
            default:
                Collection<AbstractC3506j> collection = (Collection) this.f2099b;
                AbstractC2963b0 abstractC2963b0 = (AbstractC2963b0) this.f2100c;
                AbstractC3506j abstractC3506j2 = (AbstractC3506j) this.f2101d;
                AbstractC3506j abstractC3506j3 = (AbstractC3506j) obj;
                abstractC3506j3.getClass();
                if (!(abstractC3506j3 instanceof C3499c)) {
                    return null;
                }
                String strMo7350l = abstractC3506j3.mo7350l();
                for (AbstractC3506j abstractC3506j4 : collection) {
                    if (abstractC3506j4.mo7350l().equals(strMo7350l)) {
                        abstractC3506j3.mo7347B(abstractC3506j4.mo7348i());
                        return null;
                    }
                }
                abstractC2963b0.m6383L("Unknown type variable: " + strMo7350l + " in type: " + String.valueOf(abstractC3506j2));
                return null;
        }
    }

    public /* synthetic */ C0689b(Object obj, Object obj2, Object obj3, int i9) {
        this.f2098a = i9;
        this.f2099b = obj;
        this.f2100c = obj2;
        this.f2101d = obj3;
    }
}
