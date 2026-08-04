package yyds;

import com.p000ss.android.ugc.awemes.WardDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yyds.ᛳᲀᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0682 {

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final String[] f3243 = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C1303 f3244;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C2014 f3245;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2635 f3246;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final WardDatabase_Impl f3247;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final LinkedHashMap f3248;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final String[] f3249;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public InterfaceC2266 f3250;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final AtomicBoolean f3251;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final LinkedHashMap f3252;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final LinkedHashMap f3253;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean f3254;

    public native C0682(WardDatabase_Impl wardDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, C2635 c2635);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0089 -> B:19:0x008c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1588(InterfaceC2684 interfaceC2684, int i, AbstractC1320 abstractC1320) throws Throwable {
        C1204 c1204;
        String str;
        int i2;
        InterfaceC2349 interfaceC2349;
        int i3;
        String[] strArr;
        if (abstractC1320 instanceof C1204) {
            c1204 = (C1204) abstractC1320;
            int i4 = c1204.f5484;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1204.f5484 = i4 - Integer.MIN_VALUE;
            } else {
                c1204 = new C1204(this, abstractC1320);
            }
        }
        Object obj = c1204.f5487;
        int i5 = c1204.f5484;
        if (i5 == 0) {
            AbstractC1544.m3189(obj);
            str = this.f3249[i];
            i2 = 3;
            interfaceC2349 = interfaceC2684;
            i3 = 0;
            strArr = f3243;
            if (i3 < i2) {
            }
        } else {
            if (i5 != 1) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = c1204.f5489;
            i3 = c1204.f5485;
            String[] strArr2 = c1204.f5483;
            str = c1204.f5486;
            InterfaceC2349 interfaceC23492 = c1204.f5490;
            AbstractC1544.m3189(obj);
            strArr = strArr2;
            interfaceC2349 = interfaceC23492;
            i3++;
            if (i3 < i2) {
                String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i3]) + '`';
                c1204.f5490 = interfaceC2349;
                c1204.f5486 = str;
                c1204.f5483 = strArr;
                c1204.f5485 = i3;
                c1204.f5489 = i2;
                c1204.f5484 = 1;
                Object objM3234 = AbstractC1579.m3234(interfaceC2349, str2, c1204);
                EnumC1765 enumC1765 = EnumC1765.f8858;
                if (objM3234 == enumC1765) {
                    return enumC1765;
                }
                i3++;
                if (i3 < i2) {
                    return C2746.f13459;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1589(InterfaceC2349 interfaceC2349, AbstractC1320 abstractC1320) throws Throwable {
        C0258 c0258;
        if (abstractC1320 instanceof C0258) {
            c0258 = (C0258) abstractC1320;
            int i = c0258.f1413;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0258.f1413 = i - Integer.MIN_VALUE;
            } else {
                c0258 = new C0258(this, abstractC1320);
            }
        }
        Object objMo886 = c0258.f1414;
        int i2 = c0258.f1413;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i2 == 0) {
            AbstractC1544.m3189(objMo886);
            C1844 c1844 = new C1844(5);
            c0258.f1415 = interfaceC2349;
            c0258.f1413 = 1;
            objMo886 = interfaceC2349.mo886("SELECT * FROM room_table_modification_log WHERE invalidated = 1", c1844, c0258);
            if (objMo886 != enumC1765) {
            }
            return enumC1765;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) c0258.f1415;
            AbstractC1544.m3189(objMo886);
            return set;
        }
        interfaceC2349 = (InterfaceC2349) c0258.f1415;
        AbstractC1544.m3189(objMo886);
        Set set2 = (Set) objMo886;
        if (!set2.isEmpty()) {
            c0258.f1415 = set2;
            c0258.f1413 = 2;
            if (AbstractC1579.m3234(interfaceC2349, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", c0258) == enumC1765) {
                return enumC1765;
            }
        }
        return set2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1590(AbstractC1320 abstractC1320) throws Throwable {
        C1637 c1637;
        C2133 c2133;
        if (abstractC1320 instanceof C1637) {
            c1637 = (C1637) abstractC1320;
            int i = c1637.f8339;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1637.f8339 = i - Integer.MIN_VALUE;
            } else {
                c1637 = new C1637(this, abstractC1320);
            }
        }
        Object objM346 = c1637.f8340;
        int i2 = c1637.f8339;
        InterfaceC0274 interfaceC0274 = null;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC1544.m3189(objM346);
            WardDatabase_Impl wardDatabase_Impl = this.f3247;
            C2133 c21332 = wardDatabase_Impl.f499;
            boolean zM4056 = c21332.m4056();
            C1422 c1422 = C1422.f6715;
            if (!zM4056) {
                return c1422;
            }
            try {
                if (!this.f3251.compareAndSet(true, false)) {
                    c21332.m4049();
                    return c1422;
                }
                if (!((Boolean) this.f3250.mo731()).booleanValue()) {
                    c21332.m4049();
                    return c1422;
                }
                C2728 c2728 = new C2728(this, interfaceC0274, i3);
                c1637.f8341 = c21332;
                c1637.f8339 = 1;
                objM346 = wardDatabase_Impl.m346(false, c2728, c1637);
                EnumC1765 enumC1765 = EnumC1765.f8858;
                if (objM346 == enumC1765) {
                    return enumC1765;
                }
                c2133 = c21332;
            } catch (Throwable th) {
                th = th;
                c2133 = c21332;
                c2133.m4049();
                throw th;
            }
        } else {
            if (i2 != 1) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2133 = c1637.f8341;
            try {
                AbstractC1544.m3189(objM346);
            } catch (Throwable th2) {
                th = th2;
                c2133.m4049();
                throw th;
            }
        }
        Set set = (Set) objM346;
        if (!set.isEmpty()) {
            this.f3245.m3889(set);
            this.f3246.mo371(set);
        }
        c2133.m4049();
        return set;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m1591(InterfaceC2266 interfaceC2266, InterfaceC2266 interfaceC22662) {
        if (this.f3251.compareAndSet(false, true)) {
            interfaceC2266.mo731();
            C2454 c2454 = this.f3247.f497;
            InterfaceC0274 interfaceC0274 = null;
            if (c2454 == null) {
                c2454 = null;
            }
            AbstractC2071.m3959(c2454, new C1122(C1122.f5178), new C0219(this, interfaceC22662, interfaceC0274, 13), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1592(AbstractC1320 abstractC1320) throws Throwable {
        C1527 c1527;
        C2133 c2133;
        if (abstractC1320 instanceof C1527) {
            c1527 = (C1527) abstractC1320;
            int i = c1527.f7358;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1527.f7358 = i - Integer.MIN_VALUE;
            } else {
                c1527 = new C1527(this, abstractC1320);
            }
        }
        Object obj = c1527.f7359;
        int i2 = c1527.f7358;
        if (i2 == 0) {
            AbstractC1544.m3189(obj);
            WardDatabase_Impl wardDatabase_Impl = this.f3247;
            C2133 c21332 = wardDatabase_Impl.f499;
            if (c21332.m4056()) {
                try {
                    C1647 c1647 = new C1647(this, (InterfaceC0274) null);
                    c1527.f7360 = c21332;
                    c1527.f7358 = 1;
                    Object objM346 = wardDatabase_Impl.m346(false, c1647, c1527);
                    EnumC1765 enumC1765 = EnumC1765.f8858;
                    if (objM346 == enumC1765) {
                        return enumC1765;
                    }
                    c2133 = c21332;
                    c2133.m4049();
                } catch (Throwable th) {
                    th = th;
                    c2133 = c21332;
                    c2133.m4049();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2133 = c1527.f7360;
            try {
                AbstractC1544.m3189(obj);
                c2133.m4049();
            } catch (Throwable th2) {
                th = th2;
                c2133.m4049();
                throw th;
            }
        }
        return C2746.f13459;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e1 -> B:28:0x00e4). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1593(InterfaceC2684 interfaceC2684, int i, AbstractC1320 abstractC1320) throws Throwable {
        C0642 c0642;
        InterfaceC2349 interfaceC2349;
        int i2;
        int i3;
        String[] strArr;
        InterfaceC2349 interfaceC23492;
        int i4;
        String str;
        if (abstractC1320 instanceof C0642) {
            c0642 = (C0642) abstractC1320;
            int i5 = c0642.f3083;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0642.f3083 = i5 - Integer.MIN_VALUE;
            } else {
                c0642 = new C0642(this, abstractC1320);
            }
        }
        Object obj = c0642.f3089;
        int i6 = c0642.f3083;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i6 == 0) {
            AbstractC1544.m3189(obj);
            c0642.f3091 = interfaceC2684;
            c0642.f3086 = i;
            c0642.f3083 = 1;
            Object objM3234 = AbstractC1579.m3234(interfaceC2684, "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)", c0642);
            interfaceC2349 = interfaceC2684;
        } else if (i6 == 1) {
            i = c0642.f3086;
            InterfaceC2349 interfaceC23493 = c0642.f3091;
            AbstractC1544.m3189(obj);
            interfaceC2349 = interfaceC23493;
        } else {
            if (i6 != 2) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = c0642.f3088;
            i3 = c0642.f3090;
            i2 = c0642.f3086;
            strArr = c0642.f3084;
            str = c0642.f3087;
            InterfaceC2349 interfaceC23494 = c0642.f3091;
            AbstractC1544.m3189(obj);
            InterfaceC2349 interfaceC23495 = interfaceC23494;
            i3++;
            interfaceC23492 = interfaceC23495;
            if (i3 < i4) {
                return C2746.f13459;
            }
            String str2 = strArr[i3];
            String str3 = "CREATE " + (this.f3254 ? "TEMP" : "") + " TRIGGER IF NOT EXISTS `" + ("room_table_modification_trigger_" + str + '_' + str2) + "` AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i2 + " AND invalidated = 0; END";
            c0642.f3091 = interfaceC23492;
            c0642.f3087 = str;
            c0642.f3084 = strArr;
            c0642.f3086 = i2;
            c0642.f3090 = i3;
            c0642.f3088 = i4;
            c0642.f3083 = 2;
            Object objM32342 = AbstractC1579.m3234(interfaceC23492, str3, c0642);
            interfaceC23495 = interfaceC23492;
        }
        String str4 = this.f3249[i];
        i2 = i;
        i3 = 0;
        strArr = f3243;
        interfaceC23492 = interfaceC2349;
        i4 = 3;
        str = str4;
        if (i3 < i4) {
        }
    }
}
