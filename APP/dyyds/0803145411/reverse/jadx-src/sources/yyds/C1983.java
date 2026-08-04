package yyds;

import com.bytedance.im.core.model.Message;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: renamed from: yyds.ᲀᛳᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1983 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final Set f9930 = AbstractC0068.m441(2, 5);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static long m3821(Message message) {
        Object c2658;
        try {
            c2658 = Long.valueOf(message.getOrderIndex());
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            c2658 = Long.MIN_VALUE;
        }
        return ((Number) c2658).longValue();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static ArrayList m3822(Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof Message)) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof Message) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:?, code lost:
    
        return yyds.EnumC2297.f11294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:?, code lost:
    
        return m3826(yyds.AbstractC2328.m4341(-687331779183470L).concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013d, code lost:
    
        if (r6 != null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0174  */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC2297 m3823(String str, boolean z) {
        Object c2658;
        Boolean bool;
        String str2;
        Long l;
        Object c26582;
        Object c26583;
        boolean z2;
        Object c26584;
        Object c26585;
        Object c26586;
        Long lValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC2328.m4341(-686356821607278L);
        if (AbstractC0473.m1313(str)) {
            return m3826(AbstractC2328.m4341(-686395476312942L));
        }
        Method method = AbstractC0606.f2915;
        Long l2 = null;
        if (method == null) {
            bool = null;
        } else {
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                c2658 = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            Throwable thM4249 = C2248.m4249(c2658);
            if (thM4249 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-686721893827438L) + method.getDeclaringClass().getName() + '.' + method.getName(), thM4249);
            }
            if (c2658 instanceof C2658) {
                c2658 = null;
            }
            bool = (Boolean) c2658;
        }
        if (AbstractC1544.m3188(bool, Boolean.FALSE)) {
            return m3826(AbstractC2328.m4341(-686434131018606L));
        }
        if (bool == null) {
            return m3826(AbstractC2328.m4341(-686477080691566L));
        }
        if (!bool.equals(Boolean.TRUE)) {
            C0188.m801();
            return null;
        }
        C2615.f12860.getClass();
        Object objM4699 = C2615.m4699();
        if (objM4699 == null) {
            return m3826(AbstractC2328.m4341(-686524325331822L));
        }
        if (z) {
            Long lM1692 = AbstractC0733.m1692(str);
            if (lM1692 == null) {
                m3824(AbstractC2328.m4341(-686803498206062L).concat(str));
            } else {
                if (lM1692.longValue() <= 0) {
                    lM1692 = null;
                }
                if (lM1692 != null) {
                    long jLongValue = lM1692.longValue();
                    C0591 c0591M3827 = m3827(objM4699, AbstractC0606.f2918, new Object[0]);
                    Object obj = c0591M3827.f2806;
                    if (!c0591M3827.f2805 || obj == null) {
                        m3824(AbstractC2328.m4341(-686850742846318L) + jLongValue);
                    } else {
                        C0591 c0591M38272 = m3827(obj, AbstractC0606.f2925, 0, lM1692);
                        if (c0591M38272.f2805) {
                            Object obj2 = c0591M38272.f2806;
                            str2 = obj2 instanceof String ? (String) obj2 : null;
                            if (str2 != null) {
                                if (AbstractC0473.m1313(str2)) {
                                    str2 = null;
                                }
                            }
                            m3824(AbstractC2328.m4341(-687001066701678L) + jLongValue);
                        } else {
                            m3824(AbstractC2328.m4341(-686923757290350L) + jLongValue);
                        }
                    }
                }
            }
        } else {
            str2 = !AbstractC0473.m1313(str) ? str : null;
        }
        if (str2 == null) {
            return EnumC2297.f11291;
        }
        C0591 c0591M38273 = m3827(objM4699, AbstractC0606.f2928, new Object[0]);
        Object obj3 = c0591M38273.f2806;
        if (!c0591M38273.f2805 || obj3 == null) {
            return m3826(AbstractC2328.m4341(-686640289448814L).concat(str2));
        }
        TimeZone timeZone = TimeZone.getDefault();
        AbstractC2328.m4341(-687649606763374L);
        AbstractC2328.m4341(-687610952057710L);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(5, 1);
        long timeInMillis2 = calendar.getTimeInMillis();
        Object obj4 = m3827(obj3, AbstractC0606.f2914, str2).f2806;
        Message message = obj4 instanceof Message ? (Message) obj4 : null;
        long j = 1;
        if (message != null) {
            long jM3825 = m3825(message);
            if (jM3825 < timeInMillis2 && timeInMillis <= jM3825) {
                return EnumC2297.f11292;
            }
            if (1 <= jM3825 && jM3825 < timeInMillis) {
                return EnumC2297.f11294;
            }
        }
        String strM4715 = C2615.m4715();
        C0591 c0591M38274 = m3827(obj3, AbstractC0606.f2954, str2, Long.valueOf(timeInMillis - 1), 200, null);
        if (!c0591M38274.f2805) {
            return m3826(AbstractC2328.m4341(-687069786178414L).concat(str2));
        }
        ArrayList arrayListM3822 = m3822(c0591M38274.f2806);
        if (arrayListM3822 == null) {
            return m3826(AbstractC2328.m4341(-687134210687854L).concat(str2));
        }
        long jLongValue2 = Long.MAX_VALUE;
        ArrayList<Message> arrayListM38222 = arrayListM3822;
        int i = 0;
        loop0: while (true) {
            if (!arrayListM38222.isEmpty()) {
                for (Message message2 : arrayListM38222) {
                    try {
                        c26582 = Boolean.valueOf(message2.isSelf());
                        l = l2;
                    } catch (Throwable th2) {
                        l = l2;
                        c26582 = new C2658(th2);
                    }
                    Object obj5 = Boolean.FALSE;
                    long j2 = j;
                    if (c26582 instanceof C2658) {
                        c26582 = obj5;
                    }
                    boolean zBooleanValue = ((Boolean) c26582).booleanValue();
                    if (!strM4715.equals(AbstractC2328.m4341(-687537937613678L))) {
                        try {
                            c26583 = Boolean.valueOf(AbstractC1544.m3188(String.valueOf(message2.getSender()), strM4715));
                        } catch (Throwable th3) {
                            c26583 = new C2658(th3);
                        }
                        Object obj6 = Boolean.FALSE;
                        if (c26583 instanceof C2658) {
                            c26583 = obj6;
                        }
                        z2 = ((Boolean) c26583).booleanValue();
                    }
                    if (zBooleanValue || z2) {
                        try {
                            c26584 = Boolean.valueOf(!message2.isDeleted());
                        } catch (Throwable th4) {
                            c26584 = new C2658(th4);
                        }
                        Object obj7 = Boolean.FALSE;
                        if (c26584 instanceof C2658) {
                            c26584 = obj7;
                        }
                        if (((Boolean) c26584).booleanValue()) {
                            try {
                                c26585 = Boolean.valueOf(f9930.contains(Integer.valueOf(message2.getMsgStatus())));
                            } catch (Throwable th5) {
                                c26585 = new C2658(th5);
                            }
                            Object obj8 = Boolean.FALSE;
                            if (c26585 instanceof C2658) {
                                c26585 = obj8;
                            }
                            if (((Boolean) c26585).booleanValue()) {
                                try {
                                    c26586 = Boolean.valueOf(message2.msgType != 1);
                                } catch (Throwable th6) {
                                    c26586 = new C2658(th6);
                                }
                                Object obj9 = Boolean.FALSE;
                                if (c26586 instanceof C2658) {
                                    c26586 = obj9;
                                }
                                if (((Boolean) c26586).booleanValue()) {
                                    long jM38252 = m3825(message2);
                                    if (timeInMillis <= jM38252 && jM38252 < timeInMillis2) {
                                        return EnumC2297.f11292;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    j = j2;
                    l2 = l;
                }
            }
            Long l3 = l2;
            long j3 = j;
            if (arrayListM38222.size() < 200) {
                return EnumC2297.f11294;
            }
            if (i > 0) {
                if (!arrayListM38222.isEmpty()) {
                    Iterator it = arrayListM38222.iterator();
                    while (it.hasNext()) {
                        long jM38253 = m3825((Message) it.next());
                        if (j3 > jM38253 || jM38253 >= timeInMillis) {
                        }
                    }
                    break loop0;
                }
                break;
            }
            int i2 = i + 1;
            if (i2 >= 100) {
                return m3826(AbstractC2328.m4341(-687215815066478L).concat(str2));
            }
            Iterator it2 = arrayListM38222.iterator();
            if (it2.hasNext()) {
                lValueOf = Long.valueOf(m3821((Message) it2.next()));
                while (it2.hasNext()) {
                    Long lValueOf2 = Long.valueOf(m3821((Message) it2.next()));
                    if (lValueOf.compareTo(lValueOf2) > 0) {
                        lValueOf = lValueOf2;
                    }
                }
            } else {
                lValueOf = l3;
            }
            if (lValueOf == null) {
                break;
            }
            long jLongValue3 = lValueOf.longValue();
            if (jLongValue3 <= Long.MIN_VALUE || jLongValue3 >= jLongValue2) {
                lValueOf = l3;
            }
            if (lValueOf == null) {
                break;
            }
            jLongValue2 = lValueOf.longValue();
            C0591 c0591M38275 = m3827(obj3, AbstractC0606.f2920, str2, lValueOf, Long.MIN_VALUE, 200);
            if (!c0591M38275.f2805) {
                return m3826(AbstractC2328.m4341(-687400498660206L).concat(str2));
            }
            arrayListM38222 = m3822(c0591M38275.f2806);
            if (arrayListM38222 == null) {
                return m3826(AbstractC2328.m4341(-687460628202350L).concat(str2));
            }
            j = j3;
            i = i2;
            l2 = l3;
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static void m3824(String str) {
        C2336.f11496.m4354(AbstractC2328.m4341(-687778455782254L).concat(str));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static long m3825(Message message) {
        Object c2658;
        try {
            c2658 = Long.valueOf(message.getCreatedAt());
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            c2658 = 0L;
        }
        return ((Number) c2658).longValue();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static EnumC2297 m3826(String str) {
        C2336.f11496.m4354(AbstractC2328.m4341(-687718326240110L).concat(str));
        return EnumC2297.f11291;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static C0591 m3827(Object obj, Method method, Object... objArr) {
        Object c2658;
        if (method == null || obj == null) {
            return new C0591();
        }
        try {
            method.setAccessible(true);
            c2658 = new C0591(method.invoke(obj, Arrays.copyOf(objArr, objArr.length)), true);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-687546527548270L) + method.getDeclaringClass().getName() + '.' + method.getName(), thM4249);
        }
        C0591 c0591 = new C0591();
        if (c2658 instanceof C2658) {
            c2658 = c0591;
        }
        return (C0591) c2658;
    }
}
