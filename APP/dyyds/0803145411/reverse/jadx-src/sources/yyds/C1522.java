package yyds;

/* JADX INFO: renamed from: yyds.ᛷᛳᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1522 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f7345;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f7346;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f7347;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f7348;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0238 f7349;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2133 f7350;

    public native C1522(String str, String str2, C2133 c2133, int i, C0238 c0238, InterfaceC0274 interfaceC0274);

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f8, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r1, r13) != r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x021a, code lost:
    
        if (yyds.AbstractC2071.m3955(r14, r0, r13) != r6) goto L78;
     */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        int iIntValue;
        C0380 c0380 = (C0380) this.f7350.f10555;
        int i = this.f7347;
        C0238 c0238 = this.f7349;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        try {
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC2328.m4341(-1430971006747502L), e);
            C1206 c1206 = AbstractC0221.f1238;
            C1158 c1158 = AbstractC1353.f6250;
            C0853 c0853 = new C0853(c0238, null, 13);
            this.f7347 = 11;
        }
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                String str = this.f7345;
                final String string = str != null ? AbstractC0473.m1314(str).toString() : null;
                final String string2 = AbstractC0473.m1314(this.f7346).toString();
                final int i2 = this.f7348;
                if (string != null) {
                    this.f7347 = 1;
                    c0380.getClass();
                    final String strM4341 = AbstractC2328.m4341(-1390881782006638L);
                    obj = AbstractC1960.m3774(c0380.f1954, this, new InterfaceC1549() { // from class: yyds.ᛸᛱᛲᛲ
                        @Override // yyds.InterfaceC1549
                        /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                        public final Object mo371(Object obj2) throws Exception {
                            String str2 = string;
                            int i3 = i2;
                            String str3 = string2;
                            AbstractC2328.m4341(-1410784660456302L);
                            InterfaceC1212 interfaceC1212Mo575 = ((InterfaceC0124) obj2).mo575(strM4341);
                            try {
                                interfaceC1212Mo575.mo434(1, str2);
                                interfaceC1212Mo575.mo434(2, str2);
                                long j = i3;
                                interfaceC1212Mo575.mo435(3, j);
                                interfaceC1212Mo575.mo435(4, j);
                                interfaceC1212Mo575.mo435(5, j);
                                interfaceC1212Mo575.mo435(6, j);
                                interfaceC1212Mo575.mo434(7, str3);
                                interfaceC1212Mo575.mo434(8, str3);
                                interfaceC1212Mo575.mo434(9, str3);
                                interfaceC1212Mo575.mo434(10, str3);
                                interfaceC1212Mo575.mo434(11, str3);
                                int i4 = interfaceC1212Mo575.mo433() ? (int) interfaceC1212Mo575.getLong(0) : 0;
                                interfaceC1212Mo575.close();
                                return Integer.valueOf(i4);
                            } catch (Throwable th) {
                                interfaceC1212Mo575.close();
                                throw th;
                            }
                        }
                    }, true, false);
                    if (obj == enumC1765) {
                    }
                    iIntValue = ((Number) obj).intValue();
                    C1206 c12062 = AbstractC0221.f1238;
                    C1158 c11582 = AbstractC1353.f6250;
                    C2793 c2793 = new C2793(c0238, iIntValue, null, 8);
                    this.f7347 = 10;
                    break;
                } else {
                    if (!AbstractC0473.m1313(string2)) {
                        if (i2 == 1) {
                            this.f7347 = 6;
                            c0380.getClass();
                            obj = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1387282599412590L), 16, string2), true, false);
                            if (obj == enumC1765) {
                            }
                            iIntValue = ((Number) obj).intValue();
                            C1206 c120622 = AbstractC0221.f1238;
                            C1158 c115822 = AbstractC1353.f6250;
                            C2793 c27932 = new C2793(c0238, iIntValue, null, 8);
                            this.f7347 = 10;
                        } else if (i2 == 2) {
                            this.f7347 = 7;
                            c0380.getClass();
                            obj = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1388472305353582L), 14, string2), true, false);
                            if (obj == enumC1765) {
                            }
                            iIntValue = ((Number) obj).intValue();
                            C1206 c1206222 = AbstractC0221.f1238;
                            C1158 c1158222 = AbstractC1353.f6250;
                            C2793 c279322 = new C2793(c0238, iIntValue, null, 8);
                            this.f7347 = 10;
                        } else if (i2 == 3) {
                            this.f7347 = 8;
                            c0380.getClass();
                            obj = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1389765090509678L), 18, string2), true, false);
                            if (obj == enumC1765) {
                            }
                            iIntValue = ((Number) obj).intValue();
                            C1206 c12062222 = AbstractC0221.f1238;
                            C1158 c11582222 = AbstractC1353.f6250;
                            C2793 c2793222 = new C2793(c0238, iIntValue, null, 8);
                            this.f7347 = 10;
                        } else {
                            this.f7347 = 9;
                            c0380.getClass();
                            obj = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1386346296542062L), 19, string2), true, false);
                            if (obj == enumC1765) {
                            }
                            iIntValue = ((Number) obj).intValue();
                            C1206 c120622222 = AbstractC0221.f1238;
                            C1158 c115822222 = AbstractC1353.f6250;
                            C2793 c27932222 = new C2793(c0238, iIntValue, null, 8);
                            this.f7347 = 10;
                        }
                    } else if (i2 == 1) {
                        this.f7347 = 2;
                        c0380.getClass();
                        obj = AbstractC1960.m3774(c0380.f1954, this, new C1302(AbstractC2328.m4341(-1385444353409902L), 13), true, false);
                        if (obj == enumC1765) {
                        }
                        iIntValue = ((Number) obj).intValue();
                        C1206 c1206222222 = AbstractC0221.f1238;
                        C1158 c1158222222 = AbstractC1353.f6250;
                        C2793 c279322222 = new C2793(c0238, iIntValue, null, 8);
                        this.f7347 = 10;
                    } else if (i2 == 2) {
                        this.f7347 = 3;
                        c0380.getClass();
                        obj = AbstractC1960.m3774(c0380.f1954, this, new C1302(AbstractC2328.m4341(-1385732116218734L), 15), true, false);
                        if (obj == enumC1765) {
                        }
                        iIntValue = ((Number) obj).intValue();
                        C1206 c12062222222 = AbstractC0221.f1238;
                        C1158 c11582222222 = AbstractC1353.f6250;
                        C2793 c2793222222 = new C2793(c0238, iIntValue, null, 8);
                        this.f7347 = 10;
                    } else if (i2 == 3) {
                        this.f7347 = 4;
                        c0380.getClass();
                        obj = AbstractC1960.m3774(c0380.f1954, this, new C1302(AbstractC2328.m4341(-1386122958242670L), 12), true, false);
                        if (obj == enumC1765) {
                        }
                        iIntValue = ((Number) obj).intValue();
                        C1206 c120622222222 = AbstractC0221.f1238;
                        C1158 c115822222222 = AbstractC1353.f6250;
                        C2793 c27932222222 = new C2793(c0238, iIntValue, null, 8);
                        this.f7347 = 10;
                    } else {
                        this.f7347 = 5;
                        c0380.getClass();
                        obj = AbstractC1960.m3774(c0380.f1954, this, new C1302(AbstractC2328.m4341(-1385306914456430L), 14), true, false);
                        if (obj == enumC1765) {
                        }
                        iIntValue = ((Number) obj).intValue();
                        C1206 c1206222222222 = AbstractC0221.f1238;
                        C1158 c1158222222222 = AbstractC1353.f6250;
                        C2793 c279322222222 = new C2793(c0238, iIntValue, null, 8);
                        this.f7347 = 10;
                    }
                    break;
                }
                return enumC1765;
            case 1:
                AbstractC1544.m3189(obj);
                iIntValue = ((Number) obj).intValue();
                C1206 c12062222222222 = AbstractC0221.f1238;
                C1158 c11582222222222 = AbstractC1353.f6250;
                C2793 c2793222222222 = new C2793(c0238, iIntValue, null, 8);
                this.f7347 = 10;
                break;
            case 2:
                AbstractC1544.m3189(obj);
                iIntValue = ((Number) obj).intValue();
                C1206 c120622222222222 = AbstractC0221.f1238;
                C1158 c115822222222222 = AbstractC1353.f6250;
                C2793 c27932222222222 = new C2793(c0238, iIntValue, null, 8);
                this.f7347 = 10;
                break;
            case 3:
                AbstractC1544.m3189(obj);
                iIntValue = ((Number) obj).intValue();
                C1206 c1206222222222222 = AbstractC0221.f1238;
                C1158 c1158222222222222 = AbstractC1353.f6250;
                C2793 c279322222222222 = new C2793(c0238, iIntValue, null, 8);
                this.f7347 = 10;
                break;
            case 4:
                AbstractC1544.m3189(obj);
                iIntValue = ((Number) obj).intValue();
                C1206 c12062222222222222 = AbstractC0221.f1238;
                C1158 c11582222222222222 = AbstractC1353.f6250;
                C2793 c2793222222222222 = new C2793(c0238, iIntValue, null, 8);
                this.f7347 = 10;
                break;
            case 5:
                AbstractC1544.m3189(obj);
                iIntValue = ((Number) obj).intValue();
                C1206 c120622222222222222 = AbstractC0221.f1238;
                C1158 c115822222222222222 = AbstractC1353.f6250;
                C2793 c27932222222222222 = new C2793(c0238, iIntValue, null, 8);
                this.f7347 = 10;
                break;
            case 6:
                AbstractC1544.m3189(obj);
                iIntValue = ((Number) obj).intValue();
                C1206 c1206222222222222222 = AbstractC0221.f1238;
                C1158 c1158222222222222222 = AbstractC1353.f6250;
                C2793 c279322222222222222 = new C2793(c0238, iIntValue, null, 8);
                this.f7347 = 10;
                break;
            case 7:
                AbstractC1544.m3189(obj);
                iIntValue = ((Number) obj).intValue();
                C1206 c12062222222222222222 = AbstractC0221.f1238;
                C1158 c11582222222222222222 = AbstractC1353.f6250;
                C2793 c2793222222222222222 = new C2793(c0238, iIntValue, null, 8);
                this.f7347 = 10;
                break;
            case 8:
                AbstractC1544.m3189(obj);
                iIntValue = ((Number) obj).intValue();
                C1206 c120622222222222222222 = AbstractC0221.f1238;
                C1158 c115822222222222222222 = AbstractC1353.f6250;
                C2793 c27932222222222222222 = new C2793(c0238, iIntValue, null, 8);
                this.f7347 = 10;
                break;
            case 9:
                AbstractC1544.m3189(obj);
                iIntValue = ((Number) obj).intValue();
                C1206 c1206222222222222222222 = AbstractC0221.f1238;
                C1158 c1158222222222222222222 = AbstractC1353.f6250;
                C2793 c279322222222222222222 = new C2793(c0238, iIntValue, null, 8);
                this.f7347 = 10;
                break;
            case 10:
                AbstractC1544.m3189(obj);
                return C2746.f13459;
            case 11:
                AbstractC1544.m3189(obj);
                return C2746.f13459;
            default:
                C0188.m800(AbstractC2328.m4341(-1430992481583982L));
                return null;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        return new C1522(this.f7345, this.f7346, this.f7350, this.f7348, this.f7349, interfaceC0274);
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C1522) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
