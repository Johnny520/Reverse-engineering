package p144k;

import p057e1.C0808c;
import p071f1.AbstractC0996c0;
import p071f1.C1012k0;
import p071f1.InterfaceC1026r0;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: k.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2196o0 implements InterfaceC1026r0 {

    /* JADX INFO: renamed from: b */
    public static final C2196o0 f7284b = new C2196o0(0);

    /* JADX INFO: renamed from: c */
    public static final C2196o0 f7285c = new C2196o0(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7286a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [k.o0.<clinit>():void] */
    public /* synthetic */ C2196o0(int i9) {
        this.f7286a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1026r0
    /* JADX INFO: renamed from: a */
    public final AbstractC0996c0 mo2612a(long j3, EnumC4243m enumC4243m, InterfaceC4233c interfaceC4233c) {
        switch (this.f7286a) {
            case 0:
                float fMo1590G0 = interfaceC4233c.mo1590G0(AbstractC2225y.f7371a);
                return new C1012k0(new C0808c(0.0f, -fMo1590G0, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) + fMo1590G0));
            default:
                float fMo1590G02 = interfaceC4233c.mo1590G0(AbstractC2225y.f7371a);
                return new C1012k0(new C0808c(-fMo1590G02, 0.0f, Float.intBitsToFloat((int) (j3 >> 32)) + fMo1590G02, Float.intBitsToFloat((int) (j3 & 4294967295L))));
        }
    }
}
