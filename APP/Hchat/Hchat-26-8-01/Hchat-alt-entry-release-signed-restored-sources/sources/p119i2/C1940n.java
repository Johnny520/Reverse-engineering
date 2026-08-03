package p119i2;

import android.graphics.Path;
import p068eh.AbstractC0921a;
import p071f1.C1009j;
import p085fg.InterfaceC1231l;
import p133j2.C2061k;
import p204o2.AbstractC3042a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3967n;

/* JADX INFO: renamed from: i2.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1940n implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6576g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6577h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f6578i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6579j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1940n(int i9, int i10, InterfaceC1231l interfaceC1231l) {
        this.f6577h = i9;
        this.f6578i = i10;
        this.f6579j = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f6576g) {
            case 0:
                C1009j c1009j = (C1009j) this.f6579j;
                C1947r c1947r = (C1947r) obj;
                C1914a c1914a = c1947r.f6596a;
                int iM4838d = c1947r.m4838d(this.f6577h);
                int iM4838d2 = c1947r.m4838d(this.f6578i);
                CharSequence charSequence = c1914a.f6460e;
                if (iM4838d < 0 || iM4838d > iM4838d2 || iM4838d2 > charSequence.length()) {
                    StringBuilder sbM2256s = AbstractC0921a.m2256s(iM4838d, iM4838d2, "start(", ") or end(", ") is out of range [0..");
                    sbM2256s.append(charSequence.length());
                    sbM2256s.append("], or start > end!");
                    AbstractC3042a.m6486a(sbM2256s.toString());
                }
                Path path = new Path();
                C2061k c2061k = c1914a.f6459d;
                c2061k.f6920f.getSelectionPath(iM4838d, iM4838d2, path);
                int i9 = c2061k.f6922h;
                if (i9 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i9);
                }
                C1009j c1009j2 = new C1009j(path);
                c1009j2.m2607i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c1947r.f6601f)) & 4294967295L));
                C1009j.m2599a(c1009j, c1009j2);
                break;
            default:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f6579j;
                String str = (String) obj;
                str.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str.charAt(i10);
                    if (Character.isDigit(cCharAt)) {
                        sb2.append(cCharAt);
                    }
                }
                String strM6701P0 = AbstractC3149m.m6701P0(this.f6577h, sb2.toString());
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, strM6701P0);
                if (strM6701P0.length() == 0 || (numM6741e0 != null && numM6741e0.intValue() <= this.f6578i)) {
                    interfaceC1231l.invoke(strM6701P0);
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1940n(C1009j c1009j, int i9, int i10) {
        this.f6579j = c1009j;
        this.f6577h = i9;
        this.f6578i = i10;
    }
}
