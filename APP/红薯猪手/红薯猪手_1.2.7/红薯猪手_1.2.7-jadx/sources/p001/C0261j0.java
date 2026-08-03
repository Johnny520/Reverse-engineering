package p001;

import java.util.Set;

/* JADX INFO: renamed from: ۟.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0261j0 extends C0344p0 {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (null ۟.c1)
  (null java.lang.String)
  (null java.lang.CharSequence)
  (null java.lang.CharSequence)
  (null java.lang.String)
  (null java.lang.String)
  (null ۟.g3)
  (null java.lang.Boolean)
  (null ۟.g3)
  (null java.lang.Boolean)
  true
  (4095 int)
 A[MD:(۟.c1, java.lang.String, java.lang.CharSequence, java.lang.CharSequence, java.lang.String, java.lang.String, ۟.g3, java.lang.Boolean, ۟.g3, java.lang.Boolean, boolean, int):void (m)] call: ۟.p0.<init>(۟.c1, java.lang.String, java.lang.CharSequence, java.lang.CharSequence, java.lang.String, java.lang.String, ۟.g3, java.lang.Boolean, ۟.g3, java.lang.Boolean, boolean, int):void type: SUPER */
    public /* synthetic */ C0261j0() {
        super(null, null, null, null, null, null, null, null, null, null, true, 4095);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0261j0(String str, CharSequence charSequence, InterfaceC0222g3 interfaceC0222g3, int i) {
        CharSequence charSequence2 = (i & 2) != 0 ? "" : charSequence;
        String str2 = (i & 4) != 0 ? "" : null;
        InterfaceC0222g3 interfaceC0222g32 = (i & 8) != 0 ? null : interfaceC0222g3;
        C0237h4.m1090(C0341oa.m915(new byte[]{114, -19, -36, 60}, new byte[]{6, -120, -92, 72, 43, 109}), str);
        C0237h4.m1090(C0341oa.m915(new byte[]{43, 71, 47, 8}, new byte[]{79, 34, 92, 107, 5, 30}), charSequence2);
        C0237h4.m1090(C0341oa.m915(new byte[]{-25, -57, 59, 22, -20, -121}, new byte[]{-125, -94, 75, 115, -126, -29}), str2);
        super(null, null, str, charSequence2, null, str2, interfaceC0222g32, null, null, null, false, 8019);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0261j0(String str, String str2, Set set) {
        super(null, str, str2, null, null, null, null, null, null, Boolean.valueOf(set.contains(str)), false, 7161);
        C0237h4.m1090(C0341oa.m915(new byte[]{88, -85, 42}, new byte[]{51, -50, 83, 28, -114, -52}), str);
        C0341oa.m915(new byte[]{124, 108, -9, -128}, new byte[]{8, 9, -113, -12, 22, 62});
        C0237h4.m1090(C0341oa.m915(new byte[]{64, 92, -77, -1, -3, 29, 102, 92, -83, -17, -10}, new byte[]{48, 61, -63, -102, -109, 105}), set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0261j0(EnumC0164c1 enumC0164c1, String str, String str2, String str3, InterfaceC0222g3 interfaceC0222g3, int i) {
        super(enumC0164c1, enumC0164c1.f728, str, str2, null, str3, interfaceC0222g3, null, null, null, false, 8016);
        if (i != 2) {
            C0237h4.m1090(C0341oa.m915(new byte[]{-23, 121, -90, -30}, new byte[]{-115, 24, -46, -125, -110, -18}), enumC0164c1);
            C0341oa.m915(new byte[]{-58, 33, -29, 4}, new byte[]{-78, 68, -101, 112, 119, -123});
            C0237h4.m1090(C0341oa.m915(new byte[]{-77, 19, 62, 92}, new byte[]{-41, 118, 77, 63, 71, -89}), str2);
            C0237h4.m1090(C0341oa.m915(new byte[]{-65, -20, -51, -43, 22, 37}, new byte[]{-37, -119, -67, -80, 120, 65}), str3);
            return;
        }
        C0237h4.m1090(C0341oa.m915(new byte[]{-36, 76, 32, 119}, new byte[]{-72, 45, 84, 22, -103, -125}), enumC0164c1);
        C0341oa.m915(new byte[]{-52, 41, -84, -70}, new byte[]{-72, 76, -44, -50, -113, -55});
        C0237h4.m1090(C0341oa.m915(new byte[]{123, -53, 84, 111}, new byte[]{31, -82, 39, 12, -100, -42}), str2);
        C0237h4.m1090(C0341oa.m915(new byte[]{-112, 55, 126, 0, 105, 120}, new byte[]{-12, 82, 14, 101, 7, 28}), str3);
        super(enumC0164c1, enumC0164c1.f728, str, str2, C0192e1.m847(enumC0164c1), str3, interfaceC0222g3, null, null, null, false, 8000);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0261j0(EnumC0164c1 enumC0164c1, String str, String str2, InterfaceC0222g3 interfaceC0222g3, int i, int i2) {
        this(enumC0164c1, str, (i & 4) != 0 ? "" : null, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : interfaceC0222g3, 1);
        if (i2 != 2) {
        } else {
            this(enumC0164c1, str, (i & 4) != 0 ? "" : null, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : interfaceC0222g3, 2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0261j0(EnumC0164c1 enumC0164c1, String str, String str2, InterfaceC0222g3 interfaceC0222g3, String str3, int i) {
        String str4 = (i & 4) != 0 ? "" : str2;
        InterfaceC0222g3 interfaceC0222g32 = (i & 8) != 0 ? null : interfaceC0222g3;
        String str5 = (i & 16) != 0 ? "" : str3;
        C0237h4.m1090(C0341oa.m915(new byte[]{26, -81, 62, 18}, new byte[]{126, -50, 74, 115, -41, -31}), enumC0164c1);
        C0341oa.m915(new byte[]{35, 87, 44, -105}, new byte[]{87, 50, 84, -29, 103, 33});
        C0237h4.m1090(C0341oa.m915(new byte[]{32, 120, 22, 107}, new byte[]{68, 29, 101, 8, 90, 48}), str4);
        C0237h4.m1090(C0341oa.m915(new byte[]{9, -99, 19, 13, 60, 80}, new byte[]{109, -8, 99, 104, 82, 52}), str5);
        super(enumC0164c1, enumC0164c1.f728, str, str4, null, str5, null, Boolean.valueOf(C0192e1.m846(enumC0164c1)), interfaceC0222g32, null, false, 7376);
    }
}
