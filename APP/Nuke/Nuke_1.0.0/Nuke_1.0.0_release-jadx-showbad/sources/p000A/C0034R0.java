package p000A;

import me.dartcv.nuke.BuildConfig;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p153e1.C2014j;
import p153e1.EnumC2017m;

/* JADX INFO: renamed from: A.R0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0034R0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f158d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0391b0 f159e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0034R0(AbstractC0391b0 abstractC0391b0, int i5) {
        this.f158d = i5;
        this.f159e = abstractC0391b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        AbstractC0389a0 abstractC0389a0 = (AbstractC0389a0) obj;
        switch (this.f158d) {
            case 0:
                AbstractC0389a0.m660k(abstractC0389a0, this.f159e, 0, 0);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC0389a0.m658i(abstractC0389a0, this.f159e, 0, 0);
                break;
            case 2:
                AbstractC0389a0.m660k(abstractC0389a0, this.f159e, 0, 0);
                break;
            case 3:
                AbstractC0389a0.m660k(abstractC0389a0, this.f159e, 0, 0);
                break;
            case 4:
                EnumC2017m enumC2017mMo629e = abstractC0389a0.mo629e();
                EnumC2017m enumC2017m = EnumC2017m.f6742d;
                AbstractC0391b0 abstractC0391b0 = this.f159e;
                if (enumC2017mMo629e == enumC2017m || abstractC0389a0.mo630f() == 0) {
                    AbstractC0389a0.m657a(abstractC0389a0, abstractC0391b0);
                    abstractC0391b0.mo666i0(C2014j.m3702c(0L, abstractC0391b0.f1210h), 0.0f, null);
                } else {
                    int i5 = (int) 0;
                    long jMo630f = ((long) ((abstractC0389a0.mo630f() - abstractC0391b0.f1206d) - i5)) << 32;
                    AbstractC0389a0.m657a(abstractC0389a0, abstractC0391b0);
                    abstractC0391b0.mo666i0(C2014j.m3702c((((long) i5) & 4294967295L) | jMo630f, abstractC0391b0.f1210h), 0.0f, null);
                }
                return C0891q.f2780a;
            case 5:
                AbstractC0389a0.m660k(abstractC0389a0, this.f159e, 0, 0);
                break;
            case 6:
                AbstractC0389a0.m660k(abstractC0389a0, this.f159e, 0, 0);
                break;
            default:
                AbstractC0389a0.m658i(abstractC0389a0, this.f159e, 0, 0);
                break;
        }
        return C0891q.f2780a;
    }
}
