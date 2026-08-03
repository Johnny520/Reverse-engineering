package p332wb;

import p085fg.InterfaceC1231l;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.ch */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4784ch implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16340g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f16341h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f16342i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4784ch(int i9, InterfaceC1231l interfaceC1231l) {
        this.f16341h = i9;
        this.f16342i = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.f16340g) {
            case 0:
                str.getClass();
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, str);
                this.f16342i.invoke(Integer.valueOf(numM6741e0 != null ? numM6741e0.intValue() : this.f16341h));
                break;
            default:
                str.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length = str.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char cCharAt = str.charAt(i9);
                    if (Character.isDigit(cCharAt)) {
                        sb2.append(cCharAt);
                    }
                }
                String strM6701P0 = AbstractC3149m.m6701P0(2, sb2.toString());
                Integer numM6741e02 = AbstractC3156t.m6741e0(10, strM6701P0);
                if (strM6701P0.length() == 0 || (numM6741e02 != null && numM6741e02.intValue() <= this.f16341h)) {
                    this.f16342i.invoke(strM6701P0);
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4784ch(InterfaceC1231l interfaceC1231l, int i9) {
        this.f16342i = interfaceC1231l;
        this.f16341h = i9;
    }
}
