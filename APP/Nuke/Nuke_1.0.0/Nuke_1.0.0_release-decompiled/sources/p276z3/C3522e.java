package p276z3;

import p112W2.InterfaceC1601c;
import p197m.C2559s;

/* JADX INFO: renamed from: z3.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3522e implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10978d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2559s f10979e;

    public /* synthetic */ C3522e(C2559s c2559s, int i5) {
        this.f10978d = i5;
        this.f10979e = c2559s;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        int i5 = this.f10978d;
        int iIntValue = ((Integer) obj).intValue();
        switch (i5) {
            case 0:
                if (!((Boolean) this.f10979e.mo4477c()).booleanValue()) {
                    iIntValue = -iIntValue;
                }
                return Integer.valueOf(iIntValue / 5);
            default:
                if (((Boolean) this.f10979e.mo4477c()).booleanValue()) {
                    iIntValue = -iIntValue;
                }
                return Integer.valueOf(iIntValue / 8);
        }
    }
}
