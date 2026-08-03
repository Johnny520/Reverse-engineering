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
        C0237h4.m1090("text", str);
        C0237h4.m1090("desc", charSequence2);
        C0237h4.m1090("depend", str2);
        super(null, null, str, charSequence2, null, str2, interfaceC0222g32, null, null, null, false, 8019);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0261j0(String str, String str2, Set set) {
        super(null, str, str2, null, null, null, null, null, null, Boolean.valueOf(set.contains(str)), false, 7161);
        C0237h4.m1090("key", str);
        "text";
        C0237h4.m1090("parentValue", set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0261j0(EnumC0164c1 enumC0164c1, String str, String str2, String str3, InterfaceC0222g3 interfaceC0222g3, int i) {
        super(enumC0164c1, enumC0164c1.f728, str, str2, null, str3, interfaceC0222g3, null, null, null, false, 8016);
        if (i != 2) {
            C0237h4.m1090("data", enumC0164c1);
            "text";
            C0237h4.m1090("desc", str2);
            C0237h4.m1090("depend", str3);
            return;
        }
        C0237h4.m1090("data", enumC0164c1);
        "text";
        C0237h4.m1090("desc", str2);
        C0237h4.m1090("depend", str3);
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
        C0237h4.m1090("data", enumC0164c1);
        "text";
        C0237h4.m1090("desc", str4);
        C0237h4.m1090("depend", str5);
        super(enumC0164c1, enumC0164c1.f728, str, str4, null, str5, null, Boolean.valueOf(C0192e1.m846(enumC0164c1)), interfaceC0222g32, null, false, 7376);
    }
}
