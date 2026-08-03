package p001;

import p001.C0178d1;

/* JADX INFO: renamed from: ۟.y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0470y9 extends AbstractC0335o4 implements InterfaceC0222g3<String, Boolean> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0344p0 f1215;

    public C0470y9(C0344p0 c0344p0) {
        this.f1215 = c0344p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Boolean mo984(String str) {
        String str2 = str;
        C0237h4.m1090(C0341oa.m915(new byte[]{-113, -13, -114, -71}, new byte[]{-5, -106, -10, -51, 92, -30}), str2);
        Integer numM1234 = C0393sa.m1234(C0432va.m1260(str2).toString());
        int i = 30;
        int iIntValue = numM1234 != null ? numM1234.intValue() : 30;
        if (iIntValue < 1) {
            i = 1;
        } else if (iIntValue <= 30) {
            i = iIntValue;
        }
        this.f1215.m916(String.valueOf(i));
        C0286kb c0286kb = C0178d1.f750;
        InterfaceC0451x3 interfaceC0451x3M841 = C0178d1.b.m841();
        C0344p0 c0344p0 = this.f1215;
        interfaceC0451x3M841.mo850(c0344p0.f1018, c0344p0.f1735);
        int i2 = C0330o.f1000;
        StringBuilder sbM924 = C0372r2.m924(C0341oa.m915(new byte[]{-56, -110, -92, -28, 107, 16, -54, -104, -72, -24, 125, 20, 23}, new byte[]{45, 37, 22, 12, -59, -82}), Integer.valueOf(i));
        sbM924.append(C0341oa.m915(new byte[]{52, 94, 71}, new byte[]{-47, -6, -18, -29, 27, -15}));
        String string = sbM924.toString();
        C0237h4.m1089(C0341oa.m915(new byte[]{66, -33, 27, -122, -88, 38, 88, -41, 96, -36, -12, 97, 31}, new byte[]{54, -80, 72, -14, -38, 79}), string);
        C0330o.m1173(0, string);
        return Boolean.TRUE;
    }
}
