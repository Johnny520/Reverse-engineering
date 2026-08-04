package yyds;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛳᛲᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0534 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C0119 f2568;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f2569;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2570;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f2571;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0534(Context context, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f2570 = i;
        this.f2571 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0398 A[Catch: Exception -> 0x03fb, TryCatch #1 {Exception -> 0x03fb, blocks: (B:78:0x02eb, B:98:0x0394, B:100:0x0398, B:101:0x03f1, B:82:0x0303, B:92:0x0350, B:94:0x0358, B:95:0x0368, B:86:0x030d, B:88:0x0318, B:89:0x0332), top: B:142:0x02e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03f1 A[Catch: Exception -> 0x03fb, TRY_LEAVE, TryCatch #1 {Exception -> 0x03fb, blocks: (B:78:0x02eb, B:98:0x0394, B:100:0x0398, B:101:0x03f1, B:82:0x0303, B:92:0x0350, B:94:0x0358, B:95:0x0368, B:86:0x030d, B:88:0x0318, B:89:0x0332), top: B:142:0x02e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0114 A[Catch: Exception -> 0x015b, TryCatch #3 {Exception -> 0x015b, blocks: (B:8:0x0019, B:27:0x00cd, B:32:0x0114, B:34:0x0136, B:35:0x013f, B:12:0x0031, B:21:0x007d, B:23:0x0085, B:24:0x009f, B:15:0x003a, B:17:0x0045, B:18:0x005f), top: B:144:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136 A[Catch: Exception -> 0x015b, TryCatch #3 {Exception -> 0x015b, blocks: (B:8:0x0019, B:27:0x00cd, B:32:0x0114, B:34:0x0136, B:35:0x013f, B:12:0x0031, B:21:0x007d, B:23:0x0085, B:24:0x009f, B:15:0x003a, B:17:0x0045, B:18:0x005f), top: B:144:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0248 A[Catch: Exception -> 0x02ab, TryCatch #2 {Exception -> 0x02ab, blocks: (B:45:0x019b, B:65:0x0244, B:67:0x0248, B:68:0x02a1, B:49:0x01b3, B:59:0x0200, B:61:0x0208, B:62:0x0218, B:53:0x01bd, B:55:0x01c8, B:56:0x01e2), top: B:143:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a1 A[Catch: Exception -> 0x02ab, TRY_LEAVE, TryCatch #2 {Exception -> 0x02ab, blocks: (B:45:0x019b, B:65:0x0244, B:67:0x0248, B:68:0x02a1, B:49:0x01b3, B:59:0x0200, B:61:0x0208, B:62:0x0218, B:53:0x01bd, B:55:0x01c8, B:56:0x01e2), top: B:143:0x0195 }] */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        Object c2658;
        C0119 c0119M4659;
        Object c26582;
        C0119 c0119M46592;
        Object objM551;
        Object objM3955;
        C2646 c2646;
        Object c26583;
        C0119 c0119M46593;
        Object objM5512;
        Object objM39552;
        C2646 c26462;
        Object c26584;
        C0119 c0119M46594;
        Object objM5513;
        Object objM4670;
        String strM3285;
        int i = this.f2570;
        Context context = this.f2571;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        switch (i) {
            case 0:
                int i2 = this.f2569;
                Object obj2 = C2746.f13459;
                try {
                } catch (Exception e) {
                    C2336.f11496.m4358(AbstractC2328.m4341(-595883335517038L), e);
                    c2658 = new C2658(new Exception(AbstractC2328.m4341(-595930580157294L) + e.getMessage()));
                }
                if (i2 == 0) {
                    AbstractC1544.m3189(obj);
                    C2592.f12774.getClass();
                    c0119M4659 = C2592.m4659(context);
                    if (c0119M4659 == null) {
                        return new C2248(new C2658(new Exception(AbstractC2328.m4341(-595324989768558L))));
                    }
                    String strM4341 = AbstractC2328.m4341(-595367939441518L);
                    String strM43412 = AbstractC2328.m4341(-595423774016366L);
                    this.f2568 = c0119M4659;
                    this.f2569 = 1;
                    C1206 c1206 = AbstractC0221.f1238;
                    Object objM39553 = AbstractC2071.m3955(ExecutorC2482.f12272, new C0459(c0119M4659, strM4341, strM43412, null), this);
                    if (objM39553 != enumC1765) {
                        objM39553 = obj2;
                    }
                    if (objM39553 == enumC1765) {
                        return enumC1765;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            C0188.m800(AbstractC2328.m4341(-595960644928366L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                        c2658 = AbstractC2328.m4341(-595857565713262L) + new SimpleDateFormat(AbstractC2328.m4341(-595771666367342L), Locale.getDefault()).format(new Date());
                        return new C2248(c2658);
                    }
                    c0119M4659 = this.f2568;
                    AbstractC1544.m3189(obj);
                }
                C0119 c0119 = c0119M4659;
                C2592.f12774.getClass();
                String string = C2592.m4658().toString();
                AbstractC2328.m4341(-595432363950958L);
                byte[] bytes = string.getBytes(AbstractC0347.f1806);
                AbstractC2328.m4341(-595492493493102L);
                if (bytes.length > 16777216) {
                    throw new IllegalArgumentException(AbstractC2328.m4341(-595552623035246L).toString());
                }
                String strM43413 = AbstractC2328.m4341(-595629932446574L);
                String strM43414 = AbstractC2328.m4341(-595711536825198L);
                this.f2568 = null;
                this.f2569 = 2;
                c0119.getClass();
                C1206 c12062 = AbstractC0221.f1238;
                Object objM39554 = AbstractC2071.m3955(ExecutorC2482.f12272, new C2391(c0119, strM43414, strM43413, bytes, null), this);
                if (objM39554 == enumC1765) {
                    obj2 = objM39554;
                }
                if (obj2 == enumC1765) {
                    return enumC1765;
                }
                c2658 = AbstractC2328.m4341(-595857565713262L) + new SimpleDateFormat(AbstractC2328.m4341(-595771666367342L), Locale.getDefault()).format(new Date());
                return new C2248(c2658);
            case 1:
                int i3 = this.f2569;
                try {
                } catch (Exception e2) {
                    C2336.f11496.m4358(AbstractC2328.m4341(-788735957042030L), e2);
                    c26582 = new C2658(new Exception(AbstractC2328.m4341(-788774611747694L) + e2.getMessage()));
                }
                if (i3 == 0) {
                    AbstractC1544.m3189(obj);
                    C2592.f12774.getClass();
                    c0119M46592 = C2592.m4659(context);
                    if (c0119M46592 == null) {
                        return new C2248(new C2658(new Exception(AbstractC2328.m4341(-788211971031918L))));
                    }
                    String strM43415 = AbstractC2328.m4341(-788254920704878L);
                    String strM43416 = AbstractC2328.m4341(-788336525083502L);
                    this.f2568 = c0119M46592;
                    this.f2569 = 1;
                    objM551 = c0119M46592.m551(strM43415, strM43416, false, this);
                    if (objM551 == enumC1765) {
                        return enumC1765;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            C0188.m800(AbstractC2328.m4341(-788821856387950L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                        objM3955 = obj;
                        c2646 = (C2646) objM3955;
                        if (c2646 == null) {
                            C2133 c2133 = c2646.f13041;
                            c26582 = AbstractC2328.m4341(-788645762728814L) + new SimpleDateFormat(AbstractC2328.m4341(-788559863382894L), Locale.getDefault()).format((Date) c2133.f10555) + AbstractC2328.m4341(-788675827499886L) + (((Long) c2133.f10553).longValue() / 1024) + AbstractC2328.m4341(-788701597303662L);
                        } else {
                            c26582 = AbstractC2328.m4341(-788714482205550L);
                        }
                        return new C2248(c26582);
                    }
                    c0119M46592 = this.f2568;
                    AbstractC1544.m3189(obj);
                    objM551 = obj;
                }
                C0119 c01192 = c0119M46592;
                if (!((Boolean) objM551).booleanValue()) {
                    return new C2248(AbstractC2328.m4341(-788396654625646L));
                }
                String strM43417 = AbstractC2328.m4341(-788418129462126L);
                this.f2568 = null;
                this.f2569 = 2;
                c01192.getClass();
                C1206 c12063 = AbstractC0221.f1238;
                objM3955 = AbstractC2071.m3955(ExecutorC2482.f12272, new C0196(c01192, AbstractC2328.m4341(-788499733840750L), strM43417, null, 1), this);
                if (objM3955 == enumC1765) {
                    return enumC1765;
                }
                c2646 = (C2646) objM3955;
                if (c2646 == null) {
                }
                return new C2248(c26582);
            case 2:
                int i4 = this.f2569;
                try {
                } catch (Exception e3) {
                    C2336.f11496.m4358(AbstractC2328.m4341(-584325578523502L), e3);
                    c26583 = new C2658(new Exception(AbstractC2328.m4341(-584381413098350L) + e3.getMessage()));
                }
                if (i4 == 0) {
                    AbstractC1544.m3189(obj);
                    C2592.f12774.getClass();
                    c0119M46593 = C2592.m4659(context);
                    if (c0119M46593 == null) {
                        return new C2248(new C2658(new Exception(AbstractC2328.m4341(-583741462971246L))));
                    }
                    String strM43418 = AbstractC2328.m4341(-583784412644206L);
                    String strM43419 = AbstractC2328.m4341(-583878901924718L);
                    this.f2568 = c0119M46593;
                    this.f2569 = 1;
                    objM5512 = c0119M46593.m551(strM43418, strM43419, false, this);
                    if (objM5512 == enumC1765) {
                        return enumC1765;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            C0188.m800(AbstractC2328.m4341(-584445837607790L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                        objM39552 = obj;
                        c26462 = (C2646) objM39552;
                        if (c26462 == null) {
                            C2133 c21332 = c26462.f13041;
                            c26583 = AbstractC2328.m4341(-584218204341102L) + new SimpleDateFormat(AbstractC2328.m4341(-584132304995182L), Locale.getDefault()).format((Date) c21332.f10555) + AbstractC2328.m4341(-584248269112174L) + (((Long) c21332.f10553).longValue() / 1024) + AbstractC2328.m4341(-584274038915950L);
                        } else {
                            c26583 = AbstractC2328.m4341(-584286923817838L);
                        }
                        return new C2248(c26583);
                    }
                    c0119M46593 = this.f2568;
                    AbstractC1544.m3189(obj);
                    objM5512 = obj;
                }
                C0119 c01193 = c0119M46593;
                if (!((Boolean) objM5512).booleanValue()) {
                    return new C2248(AbstractC2328.m4341(-583939031466862L));
                }
                String strM434110 = AbstractC2328.m4341(-583977686172526L);
                this.f2568 = null;
                this.f2569 = 2;
                c01193.getClass();
                C1206 c12064 = AbstractC0221.f1238;
                objM39552 = AbstractC2071.m3955(ExecutorC2482.f12272, new C0196(c01193, AbstractC2328.m4341(-584072175453038L), strM434110, null, 1), this);
                if (objM39552 == enumC1765) {
                    return enumC1765;
                }
                c26462 = (C2646) objM39552;
                if (c26462 == null) {
                }
                return new C2248(c26583);
            default:
                int i5 = this.f2569;
                try {
                } catch (Exception e4) {
                    C2336.f11496.m4358(AbstractC2328.m4341(-737793349944174L), e4);
                    c26584 = new C2658(new Exception(AbstractC2328.m4341(-737840594584430L) + e4.getMessage()));
                }
                if (i5 == 0) {
                    AbstractC1544.m3189(obj);
                    C2592.f12774.getClass();
                    c0119M46594 = C2592.m4659(context);
                    if (c0119M46594 == null) {
                        return new C2248(new C2658(new Exception(AbstractC2328.m4341(-737166284718958L))));
                    }
                    String strM434111 = AbstractC2328.m4341(-737209234391918L);
                    String strM434112 = AbstractC2328.m4341(-737290838770542L);
                    this.f2568 = c0119M46594;
                    this.f2569 = 1;
                    objM5513 = c0119M46594.m551(strM434111, strM434112, false, this);
                    if (objM5513 == enumC1765) {
                        return enumC1765;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            C0188.m800(AbstractC2328.m4341(-737870659355502L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                        objM4670 = obj;
                        JSONObject jSONObject = new JSONObject((String) objM4670);
                        C2592.f12774.getClass();
                        C2396 c2396M4662 = C2592.m4662(jSONObject);
                        String str = new SimpleDateFormat(AbstractC2328.m4341(-737595781448558L), Locale.getDefault()).format(new Date(jSONObject.optLong(AbstractC2328.m4341(-737548536808302L), 0L)));
                        ArrayList arrayList = c2396M4662.f11815;
                        ArrayList arrayList2 = arrayList.isEmpty() ? arrayList : null;
                        strM3285 = arrayList2 != null ? AbstractC1595.m3285(arrayList2, AbstractC2328.m4341(-737681680794478L), AbstractC2328.m4341(-737690270729070L), null, new C2200(15), 28) : null;
                        if (strM3285 == null) {
                            strM3285 = AbstractC2328.m4341(-737737515369326L);
                        }
                        c26584 = AbstractC2328.m4341(-737741810336622L) + str + strM3285;
                        return new C2248(c26584);
                    }
                    c0119M46594 = this.f2568;
                    AbstractC1544.m3189(obj);
                    objM5513 = obj;
                }
                if (!((Boolean) objM5513).booleanValue()) {
                    return new C2248(new C2658(new Exception(AbstractC2328.m4341(-737350968312686L))));
                }
                C0119 c01194 = c0119M46594;
                C2592 c2592 = C2592.f12774;
                String strM434113 = AbstractC2328.m4341(-737385328051054L);
                String strM434114 = AbstractC2328.m4341(-737466932429678L);
                String strM434115 = AbstractC2328.m4341(-737527061971822L);
                this.f2568 = null;
                this.f2569 = 2;
                objM4670 = c2592.m4670(c01194, strM434113, strM434114, 16777216L, strM434115, this);
                if (objM4670 == enumC1765) {
                    return enumC1765;
                }
                JSONObject jSONObject2 = new JSONObject((String) objM4670);
                C2592.f12774.getClass();
                C2396 c2396M46622 = C2592.m4662(jSONObject2);
                String str2 = new SimpleDateFormat(AbstractC2328.m4341(-737595781448558L), Locale.getDefault()).format(new Date(jSONObject2.optLong(AbstractC2328.m4341(-737548536808302L), 0L)));
                ArrayList arrayList3 = c2396M46622.f11815;
                if (arrayList3.isEmpty()) {
                }
                if (arrayList2 != null) {
                }
                if (strM3285 == null) {
                }
                c26584 = AbstractC2328.m4341(-737741810336622L) + str2 + strM3285;
                return new C2248(c26584);
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        switch (this.f2570) {
            case 0:
                return new C0534(this.f2571, interfaceC0274, 0);
            case 1:
                return new C0534(this.f2571, interfaceC0274, 1);
            case 2:
                return new C0534(this.f2571, interfaceC0274, 2);
            default:
                return new C0534(this.f2571, interfaceC0274, 3);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f2570;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
        }
        return ((C0534) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
    }
}
