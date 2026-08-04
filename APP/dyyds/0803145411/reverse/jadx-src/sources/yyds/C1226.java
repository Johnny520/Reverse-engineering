package yyds;

import android.app.Dialog;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: yyds.ᛵᲇᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1226 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1226 f5638;

    static {
        AbstractC2328.m4341(-572188000945006L);
        AbstractC2328.m4341(-572265310356334L);
        AbstractC2328.m4341(-572342619767662L);
        AbstractC2328.m4341(-572441404015470L);
        f5638 = new C1226();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Object m2491(Context context, String str, boolean z, AbstractC1320 abstractC1320) {
        if (z) {
            C1509.f7142.getClass();
            if (((Boolean) C1509.f7117.m1579(C1509.f7179[112])).booleanValue()) {
                File file = new File(str);
                String parent = file.getParent();
                if (parent == null) {
                    parent = AbstractC2328.m4341(-572183705977710L);
                }
                String str2 = parent;
                String name = file.getName();
                C1206 c1206 = AbstractC0221.f1238;
                return AbstractC2071.m3955(AbstractC1353.f6250, new C1126(context, str2, name, null, 4), abstractC1320);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static Object m2492(C1226 c1226, Context context, String str, String str2, String str3, AbstractC1861 abstractC1861) {
        String strM4341 = AbstractC2328.m4341(-571234518205294L);
        String strM43412 = AbstractC2328.m4341(-571311827616622L);
        c1226.getClass();
        C2701 c2701 = C2701.f13261;
        C1221 c1221 = C1221.f5600;
        String strM43413 = AbstractC2328.m4341(-571187273565038L);
        c1221.getClass();
        String strM2480 = C1221.m2480(str3, strM43413);
        c2701.getClass();
        return c1226.m2493(context, str, str2, C2701.m4803(strM2480), strM4341, strM43412, abstractC1861);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0159, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r1, r4) == r12) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2493(Context context, String str, String str2, String str3, String str4, String str5, AbstractC1320 abstractC1320) throws Throwable {
        C2215 c2215;
        String str6;
        Object obj;
        Context context2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Context context3;
        Context context4;
        C1158 c1158;
        C2243 c2243;
        C1939 c1939;
        String str14 = str;
        String str15 = str2;
        if (abstractC1320 instanceof C2215) {
            c2215 = (C2215) abstractC1320;
            int i = c2215.f10960;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2215.f10960 = i - Integer.MIN_VALUE;
            } else {
                c2215 = new C2215(this, abstractC1320);
            }
        }
        Object objM3955 = c2215.f10958;
        int i2 = c2215.f10960;
        int i3 = 1;
        InterfaceC0274 interfaceC0274 = null;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            if (str14 == null || AbstractC0473.m1313(str14) || str15 == null || AbstractC0473.m1313(str15)) {
                C1206 c1206 = AbstractC0221.f1238;
                C1158 c11582 = AbstractC1353.f6250;
                C0266 c0266 = new C0266(2, null, 6);
                c2215.f10965 = null;
                c2215.f10961 = null;
                c2215.f10957 = null;
                c2215.f10959 = null;
                c2215.f10964 = null;
                c2215.f10960 = 1;
            } else {
                c2215.f10965 = context;
                c2215.f10961 = str14;
                c2215.f10957 = str15;
                str6 = str4;
                c2215.f10959 = str6;
                c2215.f10964 = str5;
                c2215.f10960 = 2;
                Object objM2491 = m2491(context, str3, true, c2215);
                if (objM2491 != enumC1765) {
                    obj = objM2491;
                    context2 = context;
                    str7 = str5;
                    str8 = (String) obj;
                    if (str8 != null) {
                    }
                }
            }
            return enumC1765;
        }
        if (i2 == 1) {
            AbstractC1544.m3189(objM3955);
            return Boolean.FALSE;
        }
        if (i2 == 2) {
            str7 = c2215.f10964;
            String str16 = c2215.f10959;
            str15 = c2215.f10957;
            String str17 = c2215.f10961;
            context2 = c2215.f10965;
            AbstractC1544.m3189(objM3955);
            obj = objM3955;
            str6 = str16;
            str14 = str17;
            str8 = (String) obj;
            if (str8 != null) {
                return Boolean.FALSE;
            }
            C1206 c12062 = AbstractC0221.f1238;
            C1158 c11583 = AbstractC1353.f6250;
            C0266 c02662 = new C0266(2, null, 7);
            c2215.f10965 = context2;
            c2215.f10961 = str14;
            c2215.f10957 = str15;
            c2215.f10959 = str6;
            c2215.f10964 = str7;
            c2215.f10962 = str8;
            c2215.f10960 = 3;
            if (AbstractC2071.m3955(c11583, c02662, c2215) != enumC1765) {
                str9 = str7;
                str10 = str14;
                str11 = str15;
                str12 = str6;
                str13 = str8;
                context3 = context2;
                c2215.f10965 = context3;
                c2215.f10961 = null;
                c2215.f10957 = null;
                c2215.f10959 = null;
                c2215.f10964 = null;
                c2215.f10962 = null;
                c2215.f10960 = 4;
                C1206 c12063 = AbstractC0221.f1238;
                Context context5 = context3;
                objM3955 = AbstractC2071.m3955(ExecutorC2482.f12272, new C1408(str10, str11, context5, str12, str9, str13, null), c2215);
                if (objM3955 != enumC1765) {
                }
            }
            return enumC1765;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    C0188.m800(AbstractC2328.m4341(-571389137027950L));
                    return null;
                }
                c1939 = c2215.f10963;
                AbstractC1544.m3189(objM3955);
                return Boolean.valueOf(c1939.f9755);
            }
            context4 = c2215.f10965;
            AbstractC1544.m3189(objM3955);
            C1939 c19392 = (C1939) objM3955;
            C1206 c12064 = AbstractC0221.f1238;
            c1158 = AbstractC1353.f6250;
            c2243 = new C2243(context4, c19392, interfaceC0274, i3);
            c2215.f10965 = null;
            c2215.f10961 = null;
            c2215.f10957 = null;
            c2215.f10959 = null;
            c2215.f10964 = null;
            c2215.f10962 = null;
            c2215.f10963 = c19392;
            c2215.f10960 = 5;
            if (AbstractC2071.m3955(c1158, c2243, c2215) != enumC1765) {
                c1939 = c19392;
                return Boolean.valueOf(c1939.f9755);
            }
            return enumC1765;
        }
        String str18 = c2215.f10962;
        String str19 = c2215.f10964;
        String str20 = c2215.f10959;
        String str21 = c2215.f10957;
        String str22 = c2215.f10961;
        context3 = c2215.f10965;
        AbstractC1544.m3189(objM3955);
        str13 = str18;
        str9 = str19;
        str12 = str20;
        str11 = str21;
        str10 = str22;
        c2215.f10965 = context3;
        c2215.f10961 = null;
        c2215.f10957 = null;
        c2215.f10959 = null;
        c2215.f10964 = null;
        c2215.f10962 = null;
        c2215.f10960 = 4;
        C1206 c120632 = AbstractC0221.f1238;
        Context context52 = context3;
        objM3955 = AbstractC2071.m3955(ExecutorC2482.f12272, new C1408(str10, str11, context52, str12, str9, str13, null), c2215);
        if (objM3955 != enumC1765) {
            context4 = context52;
            C1939 c193922 = (C1939) objM3955;
            C1206 c120642 = AbstractC0221.f1238;
            c1158 = AbstractC1353.f6250;
            c2243 = new C2243(context4, c193922, interfaceC0274, i3);
            c2215.f10965 = null;
            c2215.f10961 = null;
            c2215.f10957 = null;
            c2215.f10959 = null;
            c2215.f10964 = null;
            c2215.f10962 = null;
            c2215.f10963 = c193922;
            c2215.f10960 = 5;
            if (AbstractC2071.m3955(c1158, c2243, c2215) != enumC1765) {
            }
        }
        return enumC1765;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [android.app.Dialog, android.content.Context, java.lang.Object, java.lang.String, yyds.ᛱᛳᛵᛱ, yyds.ᛲᛱᛶᛸ, yyds.ᲀᲈᲁᛷ] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String, yyds.ᛲᛱᛶᛸ] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [android.app.Dialog, android.content.Context, java.lang.String, yyds.ᛱᛳᛵᛱ, yyds.ᛲᛱᛶᛸ, yyds.ᲀᲈᲁᛷ] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.app.Dialog, java.lang.String, yyds.ᛱᛳᛵᛱ, yyds.ᛲᛱᛶᛸ, yyds.ᲀᲈᲁᛷ] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2494(Context context, Dialog dialog, String str, String str2, boolean z, AbstractC1320 abstractC1320) throws Throwable {
        C2727 c2727;
        Dialog dialog2;
        String str3;
        Context context2;
        boolean z2;
        Object obj;
        String str4;
        ?? r12;
        Dialog dialog3;
        Context context3;
        String str5;
        C2143 c2143;
        boolean z3;
        C0093 c0093;
        C0093 c00932;
        boolean z4;
        C2143 c21432;
        C2143 c21433;
        Object objM3955;
        InterfaceC2213 interfaceC2213M1960;
        C2576 c2576;
        InterfaceC2213 interfaceC2213M19602;
        C2576 c25762;
        C1014 c1014;
        boolean z5;
        Context context4;
        ?? r122;
        if (abstractC1320 instanceof C2727) {
            c2727 = (C2727) abstractC1320;
            int i = c2727.f13402;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2727.f13402 = i - Integer.MIN_VALUE;
            } else {
                c2727 = new C2727(this, abstractC1320);
            }
        }
        Object obj2 = c2727.f13393;
        int i2 = c2727.f13402;
        int i3 = 11;
        C2746 c2746 = C2746.f13459;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        switch (i2) {
            case 0:
                AbstractC1544.m3189(obj2);
                c2727.f13403 = context;
                dialog2 = dialog;
                c2727.f13398 = dialog2;
                str3 = str2;
                c2727.f13394 = str3;
                c2727.f13395 = z;
                c2727.f13402 = 1;
                Object objM2491 = m2491(context, str, true, c2727);
                if (objM2491 != enumC1765) {
                    context2 = context;
                    z2 = z;
                    obj = objM2491;
                    str4 = (String) obj;
                    if (str4 != null) {
                        if (z2) {
                            C1221 c1221 = C1221.f5600;
                            c2727.f13403 = null;
                            c2727.f13398 = null;
                            c2727.f13394 = null;
                            c2727.f13396 = null;
                            c2727.f13395 = z2;
                            c2727.f13402 = 2;
                            if (c1221.m2488(context2, str4, str3, c2727) == enumC1765) {
                            }
                        } else {
                            C2143 c21434 = new C2143();
                            C1206 c1206 = AbstractC0221.f1238;
                            C1158 c1158 = AbstractC1353.f6250;
                            C2361 c2361 = new C2361(context2, str4, c21434, null, 1);
                            r12 = 0;
                            c2727.f13403 = context2;
                            c2727.f13398 = dialog2;
                            c2727.f13394 = str3;
                            c2727.f13396 = str4;
                            c2727.f13401 = c21434;
                            c2727.f13395 = z2;
                            c2727.f13402 = 3;
                            Object objM39552 = AbstractC2071.m3955(c1158, c2361, c2727);
                            if (objM39552 != enumC1765) {
                                dialog3 = dialog2;
                                obj2 = objM39552;
                                context3 = context2;
                                str5 = str3;
                                c2143 = c21434;
                                z3 = z2;
                                c0093 = (C0093) obj2;
                                try {
                                    try {
                                        C1221 c12212 = C1221.f5600;
                                        C0219 c0219 = new C0219(c0093, r12, 8);
                                        c2727.f13403 = context3;
                                        c2727.f13398 = dialog3;
                                        c2727.f13394 = r12;
                                        c2727.f13396 = r12;
                                        c2727.f13401 = c2143;
                                        c2727.f13399 = c0093;
                                        c2727.f13395 = z3;
                                        c2727.f13402 = 4;
                                        c12212.getClass();
                                        C1206 c12062 = AbstractC0221.f1238;
                                        ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
                                        c21433 = c2143;
                                        try {
                                            C1328 c1328 = new C1328(str4, context3, str5, c21433, c0219, null);
                                            c21432 = c21433;
                                        } catch (CancellationException e) {
                                            e = e;
                                            c21432 = c21433;
                                        }
                                    } catch (CancellationException e2) {
                                        e = e2;
                                        c21432 = c2143;
                                    }
                                    try {
                                        objM3955 = AbstractC2071.m3955(executorC2482, c1328, c2727);
                                        if (objM3955 != enumC1765) {
                                            c00932 = c0093;
                                            z4 = z3;
                                            obj2 = objM3955;
                                            r12 = r12;
                                            try {
                                                try {
                                                    C1014 c10142 = (C1014) obj2;
                                                    C0948 c0948 = C0948.f4411;
                                                    C1206 c12063 = AbstractC0221.f1238;
                                                    interfaceC2213M19602 = AbstractC0879.m1960(c0948, AbstractC1353.f6250);
                                                    c25762 = new C2576(c00932, dialog3, r12, i3);
                                                    c2727.f13403 = context3;
                                                    c2727.f13398 = r12;
                                                    c2727.f13394 = r12;
                                                    c2727.f13396 = r12;
                                                    c2727.f13401 = r12;
                                                    c2727.f13399 = r12;
                                                    c2727.f13400 = c10142;
                                                    c2727.f13395 = z4;
                                                    c2727.f13402 = 5;
                                                    if (AbstractC2071.m3955(interfaceC2213M19602, c25762, c2727) != enumC1765) {
                                                        boolean z6 = z4;
                                                        c1014 = c10142;
                                                        z5 = z6;
                                                        context4 = context3;
                                                        r122 = r12;
                                                        C1206 c12064 = AbstractC0221.f1238;
                                                        C1158 c11582 = AbstractC1353.f6250;
                                                        C2576 c25763 = new C2576(c1014, context4, r122, 9);
                                                        c2727.f13403 = r122;
                                                        c2727.f13398 = r122;
                                                        c2727.f13394 = r122;
                                                        c2727.f13396 = r122;
                                                        c2727.f13401 = r122;
                                                        c2727.f13399 = r122;
                                                        c2727.f13400 = r122;
                                                        c2727.f13395 = z5;
                                                        c2727.f13402 = 7;
                                                        if (AbstractC2071.m3955(c11582, c25763, c2727) != enumC1765) {
                                                        }
                                                    }
                                                } catch (CancellationException e3) {
                                                    e = e3;
                                                    c21432.m4091();
                                                    throw e;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                C0948 c09482 = C0948.f4411;
                                                C1206 c12065 = AbstractC0221.f1238;
                                                interfaceC2213M1960 = AbstractC0879.m1960(c09482, AbstractC1353.f6250);
                                                c2576 = new C2576(c00932, dialog3, r12, i3);
                                                c2727.f13403 = r12;
                                                c2727.f13398 = r12;
                                                c2727.f13394 = r12;
                                                c2727.f13396 = r12;
                                                c2727.f13401 = r12;
                                                c2727.f13399 = r12;
                                                c2727.f13400 = th;
                                                c2727.f13395 = z4;
                                                c2727.f13402 = 6;
                                                if (AbstractC2071.m3955(interfaceC2213M1960, c2576, c2727) != enumC1765) {
                                                }
                                            }
                                        }
                                    } catch (CancellationException e4) {
                                        e = e4;
                                        c00932 = c0093;
                                        z4 = z3;
                                        c21432.m4091();
                                        throw e;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    c00932 = c0093;
                                    z4 = z3;
                                    C0948 c094822 = C0948.f4411;
                                    C1206 c120652 = AbstractC0221.f1238;
                                    interfaceC2213M1960 = AbstractC0879.m1960(c094822, AbstractC1353.f6250);
                                    c2576 = new C2576(c00932, dialog3, r12, i3);
                                    c2727.f13403 = r12;
                                    c2727.f13398 = r12;
                                    c2727.f13394 = r12;
                                    c2727.f13396 = r12;
                                    c2727.f13401 = r12;
                                    c2727.f13399 = r12;
                                    c2727.f13400 = th;
                                    c2727.f13395 = z4;
                                    c2727.f13402 = 6;
                                    if (AbstractC2071.m3955(interfaceC2213M1960, c2576, c2727) != enumC1765) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                }
            case 1:
                z2 = c2727.f13395;
                str3 = c2727.f13394;
                Dialog dialog4 = c2727.f13398;
                context2 = c2727.f13403;
                AbstractC1544.m3189(obj2);
                obj = obj2;
                dialog2 = dialog4;
                str4 = (String) obj;
                if (str4 != null) {
                }
            case 2:
                AbstractC1544.m3189(obj2);
                return c2746;
            case 3:
                z2 = c2727.f13395;
                c2143 = c2727.f13401;
                str4 = c2727.f13396;
                str5 = c2727.f13394;
                dialog3 = c2727.f13398;
                context3 = c2727.f13403;
                AbstractC1544.m3189(obj2);
                r12 = 0;
                z3 = z2;
                c0093 = (C0093) obj2;
                C1221 c122122 = C1221.f5600;
                C0219 c02192 = new C0219(c0093, r12, 8);
                c2727.f13403 = context3;
                c2727.f13398 = dialog3;
                c2727.f13394 = r12;
                c2727.f13396 = r12;
                c2727.f13401 = c2143;
                c2727.f13399 = c0093;
                c2727.f13395 = z3;
                c2727.f13402 = 4;
                c122122.getClass();
                C1206 c120622 = AbstractC0221.f1238;
                ExecutorC2482 executorC24822 = ExecutorC2482.f12272;
                c21433 = c2143;
                C1328 c13282 = new C1328(str4, context3, str5, c21433, c02192, null);
                c21432 = c21433;
                objM3955 = AbstractC2071.m3955(executorC24822, c13282, c2727);
                if (objM3955 != enumC1765) {
                }
            case 4:
                z4 = c2727.f13395;
                c00932 = c2727.f13399;
                c21432 = c2727.f13401;
                dialog3 = c2727.f13398;
                Context context5 = c2727.f13403;
                try {
                    AbstractC1544.m3189(obj2);
                    context3 = context5;
                    r12 = 0;
                    C1014 c101422 = (C1014) obj2;
                    C0948 c09483 = C0948.f4411;
                    C1206 c120632 = AbstractC0221.f1238;
                    interfaceC2213M19602 = AbstractC0879.m1960(c09483, AbstractC1353.f6250);
                    c25762 = new C2576(c00932, dialog3, r12, i3);
                    c2727.f13403 = context3;
                    c2727.f13398 = r12;
                    c2727.f13394 = r12;
                    c2727.f13396 = r12;
                    c2727.f13401 = r12;
                    c2727.f13399 = r12;
                    c2727.f13400 = c101422;
                    c2727.f13395 = z4;
                    c2727.f13402 = 5;
                    if (AbstractC2071.m3955(interfaceC2213M19602, c25762, c2727) != enumC1765) {
                    }
                } catch (CancellationException e5) {
                    e = e5;
                    r12 = 0;
                    c21432.m4091();
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    r12 = 0;
                    C0948 c0948222 = C0948.f4411;
                    C1206 c1206522 = AbstractC0221.f1238;
                    interfaceC2213M1960 = AbstractC0879.m1960(c0948222, AbstractC1353.f6250);
                    c2576 = new C2576(c00932, dialog3, r12, i3);
                    c2727.f13403 = r12;
                    c2727.f13398 = r12;
                    c2727.f13394 = r12;
                    c2727.f13396 = r12;
                    c2727.f13401 = r12;
                    c2727.f13399 = r12;
                    c2727.f13400 = th;
                    c2727.f13395 = z4;
                    c2727.f13402 = 6;
                    if (AbstractC2071.m3955(interfaceC2213M1960, c2576, c2727) != enumC1765) {
                    }
                }
            case 5:
                z5 = c2727.f13395;
                c1014 = (C1014) c2727.f13400;
                context4 = c2727.f13403;
                AbstractC1544.m3189(obj2);
                r122 = 0;
                C1206 c120642 = AbstractC0221.f1238;
                C1158 c115822 = AbstractC1353.f6250;
                C2576 c257632 = new C2576(c1014, context4, r122, 9);
                c2727.f13403 = r122;
                c2727.f13398 = r122;
                c2727.f13394 = r122;
                c2727.f13396 = r122;
                c2727.f13401 = r122;
                c2727.f13399 = r122;
                c2727.f13400 = r122;
                c2727.f13395 = z5;
                c2727.f13402 = 7;
                return AbstractC2071.m3955(c115822, c257632, c2727) != enumC1765 ? c2746 : enumC1765;
            case 6:
                Throwable th4 = (Throwable) c2727.f13400;
                AbstractC1544.m3189(obj2);
                throw th4;
            case 7:
                AbstractC1544.m3189(obj2);
                return c2746;
            default:
                C0188.m800(AbstractC2328.m4341(-570981115134830L));
                return null;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object m2495(Context context, Dialog dialog, Aweme aweme, String str, String str2, String str3, boolean z, AbstractC1861 abstractC1861) throws Throwable {
        InterfaceC0274 interfaceC0274 = null;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (str == null || AbstractC0473.m1313(str)) {
            C1206 c1206 = AbstractC0221.f1238;
            Object objM3955 = AbstractC2071.m3955(AbstractC1353.f6250, new C1114(str3, interfaceC0274, 1), abstractC1861);
            if (objM3955 == enumC1765) {
                return objM3955;
            }
        } else {
            Object objM2494 = m2494(context, dialog, C0469.m1262(str2, aweme, null, 12), str, z, abstractC1861);
            if (objM2494 == enumC1765) {
                return objM2494;
            }
        }
        return C2746.f13459;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object m2496(Context context, Aweme aweme, Dialog dialog, AbstractC1861 abstractC1861) throws Throwable {
        Map map = C2609.f12814;
        Object objM2495 = m2495(context, dialog, aweme, C2609.m4692(aweme), AbstractC2328.m4341(-570929575527278L), AbstractC2328.m4341(-570946755396462L), false, abstractC1861);
        return objM2495 == EnumC1765.f8858 ? objM2495 : C2746.f13459;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
    
        if (yyds.AbstractC2071.m3955(r10, r11, r0) == r7) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2497(Context context, String str, String str2, AbstractC1320 abstractC1320) throws Throwable {
        C2382 c2382;
        String str3;
        Context context2;
        String str4;
        Context context3;
        C1158 c1158;
        C2243 c2243;
        C1939 c1939;
        if (abstractC1320 instanceof C2382) {
            c2382 = (C2382) abstractC1320;
            int i = c2382.f11740;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2382.f11740 = i - Integer.MIN_VALUE;
            } else {
                c2382 = new C2382(this, abstractC1320);
            }
        }
        Object objM2491 = c2382.f11741;
        int i2 = c2382.f11740;
        InterfaceC0274 interfaceC0274 = null;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i2 == 0) {
            AbstractC1544.m3189(objM2491);
            if (str == null || AbstractC0473.m1313(str)) {
                C1206 c1206 = AbstractC0221.f1238;
                C1158 c11582 = AbstractC1353.f6250;
                C0266 c0266 = new C0266(2, null, 4);
                c2382.f11742 = null;
                c2382.f11738 = null;
                c2382.f11740 = 1;
            } else {
                C2701 c2701 = C2701.f13261;
                C1221 c1221 = C1221.f5600;
                String strM4341 = AbstractC2328.m4341(-571904533103470L);
                c1221.getClass();
                String strM2480 = C1221.m2480(str2, strM4341);
                c2701.getClass();
                String strM4803 = C2701.m4803(strM2480);
                c2382.f11742 = context;
                c2382.f11738 = str;
                c2382.f11740 = 2;
                objM2491 = m2491(context, strM4803, true, c2382);
                if (objM2491 != enumC1765) {
                    str3 = (String) objM2491;
                    if (str3 != null) {
                    }
                }
            }
            return enumC1765;
        }
        if (i2 == 1) {
            AbstractC1544.m3189(objM2491);
            return Boolean.FALSE;
        }
        if (i2 == 2) {
            str = c2382.f11738;
            context = c2382.f11742;
            AbstractC1544.m3189(objM2491);
            str3 = (String) objM2491;
            if (str3 != null) {
                return Boolean.FALSE;
            }
            C1206 c12062 = AbstractC0221.f1238;
            C1158 c11583 = AbstractC1353.f6250;
            C0266 c02662 = new C0266(2, null, 5);
            c2382.f11742 = context;
            c2382.f11738 = str;
            c2382.f11736 = str3;
            c2382.f11740 = 3;
            if (AbstractC2071.m3955(c11583, c02662, c2382) != enumC1765) {
                context2 = context;
                str4 = str3;
                C1206 c12063 = AbstractC0221.f1238;
                ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
                C2361 c2361 = new C2361(context2, str4, str, null);
                c2382.f11742 = context2;
                c2382.f11738 = null;
                c2382.f11736 = null;
                c2382.f11740 = 4;
                objM2491 = AbstractC2071.m3955(executorC2482, c2361, c2382);
                if (objM2491 != enumC1765) {
                }
            }
            return enumC1765;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    C0188.m800(AbstractC2328.m4341(-571921712972654L));
                    return null;
                }
                c1939 = c2382.f11737;
                AbstractC1544.m3189(objM2491);
                return Boolean.valueOf(c1939.f9755);
            }
            context3 = c2382.f11742;
            AbstractC1544.m3189(objM2491);
            C1939 c19392 = (C1939) objM2491;
            C1206 c12064 = AbstractC0221.f1238;
            c1158 = AbstractC1353.f6250;
            c2243 = new C2243(context3, c19392, interfaceC0274, 0);
            c2382.f11742 = null;
            c2382.f11738 = null;
            c2382.f11736 = null;
            c2382.f11737 = c19392;
            c2382.f11740 = 5;
            if (AbstractC2071.m3955(c1158, c2243, c2382) != enumC1765) {
                c1939 = c19392;
                return Boolean.valueOf(c1939.f9755);
            }
            return enumC1765;
        }
        str4 = c2382.f11736;
        str = c2382.f11738;
        context2 = c2382.f11742;
        AbstractC1544.m3189(objM2491);
        C1206 c120632 = AbstractC0221.f1238;
        ExecutorC2482 executorC24822 = ExecutorC2482.f12272;
        C2361 c23612 = new C2361(context2, str4, str, null);
        c2382.f11742 = context2;
        c2382.f11738 = null;
        c2382.f11736 = null;
        c2382.f11740 = 4;
        objM2491 = AbstractC2071.m3955(executorC24822, c23612, c2382);
        if (objM2491 != enumC1765) {
            context3 = context2;
            C1939 c193922 = (C1939) objM2491;
            C1206 c120642 = AbstractC0221.f1238;
            c1158 = AbstractC1353.f6250;
            c2243 = new C2243(context3, c193922, interfaceC0274, 0);
            c2382.f11742 = null;
            c2382.f11738 = null;
            c2382.f11736 = null;
            c2382.f11737 = c193922;
            c2382.f11740 = 5;
            if (AbstractC2071.m3955(c1158, c2243, c2382) != enumC1765) {
            }
        }
        return enumC1765;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object m2498(Context context, Aweme aweme, Dialog dialog, AbstractC1861 abstractC1861) throws Throwable {
        Map map = C2609.f12814;
        String strM4682 = C2609.m4682(aweme);
        String strM4341 = AbstractC2328.m4341(-570878035919726L);
        String strM43412 = AbstractC2328.m4341(-570895215788910L);
        C1509.f7142.getClass();
        Object objM2495 = m2495(context, dialog, aweme, strM4682, strM4341, strM43412, ((Boolean) C1509.f7275.m1579(C1509.f7179[111])).booleanValue(), abstractC1861);
        return objM2495 == EnumC1765.f8858 ? objM2495 : C2746.f13459;
    }
}
