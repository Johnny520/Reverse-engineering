package yyds;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛵᛶᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1112 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f5123;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5124;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5125;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f5126;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f5127;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f5128;

    public native C1112(C2133 c2133, String str, int i, C1279 c1279, InterfaceC0274 interfaceC0274);

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f5125;
        C2746 c2746 = C2746.f13459;
        int i2 = 0;
        final int i3 = this.f5124;
        Object obj2 = this.f5126;
        Object obj3 = this.f5128;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        Object obj4 = this.f5127;
        InterfaceC0274 interfaceC0274 = null;
        switch (i) {
            case 0:
                C0144 c0144 = (C0144) obj4;
                File file = (File) obj2;
                C2355 c2355 = (C2355) obj3;
                int i4 = this.f5123;
                if (i4 == 0) {
                    AbstractC1544.m3189(obj);
                    C1206 c1206 = AbstractC0221.f1238;
                    ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
                    C2576 c2576 = new C2576(c2355, file, interfaceC0274, i2);
                    this.f5123 = 1;
                    obj = AbstractC2071.m3955(executorC2482, c2576, this);
                    if (obj == enumC1765) {
                        return enumC1765;
                    }
                } else {
                    if (i4 != 1) {
                        C0188.m800(AbstractC2328.m4341(-190331048592238L));
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                }
                String str = (String) obj;
                c2355.f11568.put(file.getAbsolutePath(), str);
                if (c0144.m784() != i3) {
                    return c2746;
                }
                c0144.f885.setText(str);
                return c2746;
            default:
                C1279 c1279 = (C1279) obj4;
                int i5 = this.f5123;
                int i6 = 10;
                try {
                } catch (Exception e) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1486105501926254L), e);
                    C1206 c12062 = AbstractC0221.f1238;
                    C1158 c1158 = AbstractC1353.f6250;
                    C0853 c0853 = new C0853(c1279, interfaceC0274, i6);
                    this.f5123 = 3;
                    if (AbstractC2071.m3955(c1158, c0853, this) != enumC1765) {
                        return c2746;
                    }
                }
                if (i5 == 0) {
                    AbstractC1544.m3189(obj);
                    C0380 c0380 = (C0380) ((C2133) obj3).f10555;
                    final String string = AbstractC0473.m1314((String) obj2).toString();
                    this.f5123 = 1;
                    c0380.getClass();
                    final String strM4341 = AbstractC2328.m4341(-1395962728317806L);
                    obj = AbstractC1960.m3774(c0380.f1954, this, new InterfaceC1549() { // from class: yyds.ᛶᛳᲇᲈ
                        @Override // yyds.InterfaceC1549
                        /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                        public final Object mo371(Object obj5) throws Exception {
                            int i7 = i3;
                            String str2 = string;
                            AbstractC2328.m4341(-1411497625027438L);
                            InterfaceC1212 interfaceC1212Mo575 = ((InterfaceC0124) obj5).mo575(strM4341);
                            long j = i7;
                            try {
                                interfaceC1212Mo575.mo435(1, j);
                                interfaceC1212Mo575.mo435(2, j);
                                interfaceC1212Mo575.mo435(3, j);
                                interfaceC1212Mo575.mo435(4, j);
                                interfaceC1212Mo575.mo434(5, str2);
                                interfaceC1212Mo575.mo434(6, str2);
                                interfaceC1212Mo575.mo434(7, str2);
                                interfaceC1212Mo575.mo434(8, str2);
                                interfaceC1212Mo575.mo434(9, str2);
                                ArrayList arrayList = new ArrayList();
                                while (interfaceC1212Mo575.mo433()) {
                                    arrayList.add(new C2210(interfaceC1212Mo575.mo430(0), (int) interfaceC1212Mo575.getLong(1)));
                                }
                                return arrayList;
                            } finally {
                                interfaceC1212Mo575.close();
                            }
                        }
                    }, true, false);
                    if (obj == enumC1765) {
                    }
                    return enumC1765;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        AbstractC1544.m3189(obj);
                        return c2746;
                    }
                    if (i5 == 3) {
                        AbstractC1544.m3189(obj);
                        return c2746;
                    }
                    C0188.m800(AbstractC2328.m4341(-1486126976762734L));
                    return null;
                }
                AbstractC1544.m3189(obj);
                List<C2210> list = (List) obj;
                ArrayList arrayList = new ArrayList(AbstractC0055.m419(list, 10));
                for (C2210 c2210 : list) {
                    arrayList.add(new C2236(c2210.f10942, c2210.f10943));
                }
                C1206 c12063 = AbstractC0221.f1238;
                C1158 c11582 = AbstractC1353.f6250;
                C2576 c25762 = new C2576(c1279, arrayList, interfaceC0274, 14);
                this.f5123 = 2;
                if (AbstractC2071.m3955(c11582, c25762, this) != enumC1765) {
                    return c2746;
                }
                return enumC1765;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f5125;
        Object obj2 = this.f5127;
        Object obj3 = this.f5126;
        Object obj4 = this.f5128;
        switch (i) {
            case 0:
                return new C1112((C2355) obj4, (File) obj3, (C0144) obj2, this.f5124, interfaceC0274);
            default:
                return new C1112((C2133) obj4, (String) obj3, this.f5124, (C1279) obj2, interfaceC0274);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f5125;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
        }
        return ((C1112) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1112(C2355 c2355, File file, C0144 c0144, int i, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f5125 = 0;
        this.f5128 = c2355;
        this.f5126 = file;
        this.f5127 = c0144;
        this.f5124 = i;
    }
}
