package p236s3;

import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: s3.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3197m implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9967d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f9968e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3197m(int i5, Object obj) {
        this.f9967d = i5;
        this.f9968e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, q3.d] */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f9967d) {
            case 0:
                int iIntValue = num.intValue();
                StringBuilder sb = new StringBuilder();
                ?? r12 = this.f9968e;
                sb.append(r12.mo5134e(iIntValue));
                sb.append(": ");
                sb.append(r12.mo5138j(iIntValue).mo5131b());
                return sb.toString();
            default:
                num.intValue();
                return this.f9968e;
        }
    }
}
