package yyds;

import java.util.UUID;

/* JADX INFO: renamed from: yyds.ᛴᲇᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0978 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final /* synthetic */ long f4473;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f4474;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f4475;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f4476;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f4477;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final /* synthetic */ C2133 f4478;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final /* synthetic */ String f4479;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f4480;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ String f4481;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f4482;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f4483;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0485 f4484;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final /* synthetic */ String f4485;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0978(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, String str8, String str9, C2133 c2133, C0485 c0485, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f4474 = str;
        this.f4476 = str2;
        this.f4483 = str3;
        this.f4481 = str4;
        this.f4482 = str5;
        this.f4475 = str6;
        this.f4473 = j;
        this.f4477 = str7;
        this.f4485 = str8;
        this.f4479 = str9;
        this.f4478 = c2133;
        this.f4484 = c0485;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011d, code lost:
    
        if (r0 != r8) goto L40;
     */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        Object objM3955;
        final int i;
        Object objM39552;
        int i2 = this.f4480;
        C0485 c0485 = this.f4484;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        try {
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC2328.m4341(-256598099002222L), e);
            C1206 c1206 = AbstractC0221.f1238;
            C1158 c1158 = AbstractC1353.f6250;
            C1533 c1533 = new C1533(c0485, null, 1);
            this.f4480 = 3;
            objM3955 = AbstractC2071.m3955(c1158, c1533, this);
        }
        if (i2 == 0) {
            AbstractC1544.m3189(obj);
            String strM4341 = this.f4474;
            int length = strM4341.length();
            String str = this.f4481;
            String str2 = this.f4482;
            if (length == 0) {
                strM4341 = (str2.equals(AbstractC2328.m4341(-256477839917934L)) && str.equals(AbstractC2328.m4341(-256490724819822L))) ? AbstractC2328.m4341(-256503609721710L) : str2.equals(AbstractC2328.m4341(-256525084558190L)) ? AbstractC2328.m4341(-256537969460078L) : AbstractC2328.m4341(-256563739263854L);
            }
            String str3 = strM4341;
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append('_');
            sb.append(UUID.randomUUID());
            final C2770 c2770 = new C2770(sb.toString(), this.f4476, this.f4483, str, str2, this.f4475, this.f4473, System.currentTimeMillis(), this.f4477, this.f4485, this.f4479, str3);
            final C0380 c0380 = (C0380) this.f4478.f10555;
            this.f4480 = 1;
            i = 0;
            if (AbstractC1960.m3774(c0380.f1954, this, new InterfaceC1549() { // from class: yyds.ᛷᛴᲈᛵ
                @Override // yyds.InterfaceC1549
                /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                public final Object mo371(Object obj2) throws Exception {
                    InterfaceC1212 interfaceC1212Mo575;
                    long j;
                    int i3 = i;
                    C2770 c27702 = c2770;
                    C0380 c03802 = c0380;
                    InterfaceC0124 interfaceC0124 = (InterfaceC0124) obj2;
                    switch (i3) {
                        case 0:
                            AbstractC2328.m4341(-1403732324156270L);
                            C1586 c1586 = c03802.f1955;
                            interfaceC1212Mo575 = interfaceC0124.mo575(AbstractC2328.m4341(-20495156806510L));
                            try {
                                C1586.m3255(interfaceC1212Mo575, c27702);
                                interfaceC1212Mo575.mo433();
                                AbstractC0797.m1819(interfaceC1212Mo575, null);
                                if (AbstractC0578.m1457(interfaceC0124) == 0) {
                                    j = -1;
                                } else {
                                    interfaceC1212Mo575 = interfaceC0124.mo575("SELECT last_insert_rowid()");
                                    try {
                                        interfaceC1212Mo575.mo433();
                                        long j2 = interfaceC1212Mo575.getLong(0);
                                        AbstractC0797.m1819(interfaceC1212Mo575, null);
                                        j = j2;
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                }
                                return Long.valueOf(j);
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            AbstractC2328.m4341(-1403886942978926L);
                            C0135 c0135 = c03802.f1956;
                            interfaceC1212Mo575 = interfaceC0124.mo575(AbstractC2328.m4341(-300904981627758L));
                            try {
                                c0135.m608(interfaceC1212Mo575, c27702);
                                interfaceC1212Mo575.mo433();
                                AbstractC0797.m1819(interfaceC1212Mo575, null);
                                return Integer.valueOf(AbstractC0578.m1457(interfaceC0124));
                            } finally {
                            }
                    }
                }
            }, false, true) == enumC1765) {
            }
            return enumC1765;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC1544.m3189(obj);
                objM39552 = obj;
                return C2746.f13459;
            }
            if (i2 != 3) {
                C0188.m800(AbstractC2328.m4341(-256619573838702L));
                return null;
            }
            AbstractC1544.m3189(obj);
            objM3955 = obj;
            return C2746.f13459;
        }
        AbstractC1544.m3189(obj);
        i = 0;
        C1206 c12062 = AbstractC0221.f1238;
        C1158 c11582 = AbstractC1353.f6250;
        C1533 c15332 = new C1533(c0485, null, i);
        this.f4480 = 2;
        objM39552 = AbstractC2071.m3955(c11582, c15332, this);
        if (objM39552 == enumC1765) {
            return enumC1765;
        }
        return C2746.f13459;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        return new C0978(this.f4474, this.f4476, this.f4483, this.f4481, this.f4482, this.f4475, this.f4473, this.f4477, this.f4485, this.f4479, this.f4478, this.f4484, interfaceC0274);
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C0978) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
