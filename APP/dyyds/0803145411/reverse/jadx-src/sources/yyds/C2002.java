package yyds;

import com.p000ss.android.ugc.awemes.WardDatabase;

/* JADX INFO: renamed from: yyds.ᲀᛵᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2002 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f10016;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1549 f10017;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public /* synthetic */ Object f10018;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public EnumC2065 f10019;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ boolean f10020;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ WardDatabase f10021;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f10022;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2002(WardDatabase wardDatabase, InterfaceC0274 interfaceC0274, InterfaceC1549 interfaceC1549, boolean z, boolean z2) {
        super(2, interfaceC0274);
        this.f10022 = z;
        this.f10020 = z2;
        this.f10021 = wardDatabase;
        this.f10017 = interfaceC1549;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4 A[PHI: r0 r13
  0x00a4: PHI (r0v11 yyds.ᲈᛶᛷᲀ) = (r0v8 yyds.ᲈᛶᛷᲀ), (r0v16 yyds.ᲈᛶᛷᲀ) binds: [B:40:0x00a1, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r13v20 java.lang.Object) = (r13v18 java.lang.Object), (r13v0 java.lang.Object) binds: [B:40:0x00a1, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[RETURN] */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        EnumC2065 enumC2065;
        InterfaceC2684 interfaceC2684;
        EnumC2065 enumC20652;
        InterfaceC2684 interfaceC26842;
        InterfaceC2684 interfaceC26843;
        Object obj2;
        int i = this.f10016;
        InterfaceC1549 interfaceC1549 = this.f10017;
        WardDatabase wardDatabase = this.f10021;
        boolean z = this.f10020;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i == 0) {
            AbstractC1544.m3189(obj);
            InterfaceC2684 interfaceC26844 = (InterfaceC2684) this.f10018;
            if (!this.f10022) {
                return interfaceC1549.mo371(((InterfaceC1851) interfaceC26844).mo885());
            }
            enumC2065 = z ? EnumC2065.f10216 : EnumC2065.f10217;
            if (!z) {
                this.f10018 = interfaceC26844;
                this.f10019 = enumC2065;
                this.f10016 = 1;
                Boolean boolMo2546 = interfaceC26844.mo2546(this);
                if (boolMo2546 != enumC1765) {
                    interfaceC26842 = interfaceC26844;
                    obj = boolMo2546;
                }
                return enumC1765;
            }
            EnumC2065 enumC20653 = enumC2065;
            interfaceC2684 = interfaceC26844;
            enumC20652 = enumC20653;
            C2186 c2186 = new C2186(null, interfaceC1549, 1);
            this.f10018 = interfaceC2684;
            this.f10019 = null;
            this.f10016 = 3;
            obj = interfaceC2684.mo2547(enumC20652, c2186, this);
            if (obj != enumC1765) {
            }
            return enumC1765;
        }
        if (i != 1) {
            if (i == 2) {
                enumC2065 = this.f10019;
                interfaceC26843 = (InterfaceC2684) this.f10018;
                AbstractC1544.m3189(obj);
                enumC20652 = enumC2065;
                interfaceC2684 = interfaceC26843;
                C2186 c21862 = new C2186(null, interfaceC1549, 1);
                this.f10018 = interfaceC2684;
                this.f10019 = null;
                this.f10016 = 3;
                obj = interfaceC2684.mo2547(enumC20652, c21862, this);
                if (obj != enumC1765) {
                    if (!z) {
                    }
                }
                return enumC1765;
            }
            if (i != 3) {
                if (i != 4) {
                    C0188.m800("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.f10018;
                AbstractC1544.m3189(obj);
                if (!((Boolean) obj).booleanValue()) {
                    C0522 c0522 = wardDatabase.f503;
                    C0522 c05222 = c0522 != null ? c0522 : null;
                    c05222.f2516.m1591(c05222.f2517, c05222.f2514);
                }
                return obj2;
            }
            interfaceC2684 = (InterfaceC2684) this.f10018;
            AbstractC1544.m3189(obj);
            if (!z) {
                return obj;
            }
            this.f10018 = obj;
            this.f10016 = 4;
            Boolean boolMo25462 = interfaceC2684.mo2546(this);
            if (boolMo25462 != enumC1765) {
                Object obj3 = obj;
                obj = boolMo25462;
                obj2 = obj3;
                if (!((Boolean) obj).booleanValue()) {
                }
                return obj2;
            }
            return enumC1765;
        }
        enumC2065 = this.f10019;
        interfaceC26842 = (InterfaceC2684) this.f10018;
        AbstractC1544.m3189(obj);
        if (((Boolean) obj).booleanValue()) {
            enumC20652 = enumC2065;
            interfaceC2684 = interfaceC26842;
            C2186 c218622 = new C2186(null, interfaceC1549, 1);
            this.f10018 = interfaceC2684;
            this.f10019 = null;
            this.f10016 = 3;
            obj = interfaceC2684.mo2547(enumC20652, c218622, this);
            if (obj != enumC1765) {
            }
            return enumC1765;
        }
        C0522 c05223 = wardDatabase.f503;
        if (c05223 == null) {
            c05223 = null;
        }
        this.f10018 = interfaceC26842;
        this.f10019 = enumC2065;
        this.f10016 = 2;
        Object objM1592 = c05223.f2516.m1592(this);
        if (objM1592 != enumC1765) {
            objM1592 = C2746.f13459;
        }
        if (objM1592 != enumC1765) {
            interfaceC26843 = interfaceC26842;
            enumC20652 = enumC2065;
            interfaceC2684 = interfaceC26843;
            C2186 c2186222 = new C2186(null, interfaceC1549, 1);
            this.f10018 = interfaceC2684;
            this.f10019 = null;
            this.f10016 = 3;
            obj = interfaceC2684.mo2547(enumC20652, c2186222, this);
            if (obj != enumC1765) {
            }
        }
        return enumC1765;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        C2002 c2002 = new C2002(this.f10021, interfaceC0274, this.f10017, this.f10022, this.f10020);
        c2002.f10018 = obj;
        return c2002;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C2002) mo630((InterfaceC2684) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
