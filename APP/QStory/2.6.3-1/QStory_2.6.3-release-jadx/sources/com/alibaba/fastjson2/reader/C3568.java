package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import androidx.compose.foundation.lazy.layout.C1548;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3755;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3733;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p025.AbstractC7012;
import p294.C9192;
import p313.AbstractC9420;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3568 extends C3605 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Constructor f8697;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Constructor f8698;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Constructor f8699;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Constructor f8700;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final List f8701;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3595 f8702;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final ArrayList f8703;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final long f8696 = AbstractC3693.m6334("@type");

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final long f8695 = AbstractC3693.m6334("message");

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final long f8694 = AbstractC3693.m6334("detailMessage");

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final long f8693 = AbstractC3693.m6334("localizedMessage");

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final long f8692 = AbstractC3693.m6334("cause");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final long f8691 = AbstractC3693.m6334("stackTrace");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final long f8690 = AbstractC3693.m6334("suppressedExceptions");

    public C3568(Class cls, List list, AbstractC3595... abstractC3595Arr) {
        int i;
        String[] strArrM14776;
        super(cls, null, cls.getName(), 0L, null, null, null, abstractC3595Arr);
        this.f8701 = list;
        Iterator it = list.iterator();
        Constructor constructor = null;
        Constructor constructor2 = null;
        Constructor constructor3 = null;
        Constructor constructor4 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Constructor constructor5 = (Constructor) it.next();
            if (constructor5 != null && constructor3 == null) {
                int parameterCount = constructor5.getParameterCount();
                if (parameterCount == 0) {
                    constructor = constructor5;
                } else {
                    Class<?>[] parameterTypes = constructor5.getParameterTypes();
                    Class<?> cls2 = parameterTypes[0];
                    if (parameterCount == 1) {
                        if (cls2 == String.class) {
                            constructor2 = constructor5;
                        } else if (Throwable.class.isAssignableFrom(cls2)) {
                            constructor4 = constructor5;
                        }
                    }
                    if (parameterCount == 2 && cls2 == String.class && Throwable.class.isAssignableFrom(parameterTypes[1])) {
                        constructor3 = constructor5;
                    }
                }
            }
        }
        this.f8700 = constructor;
        this.f8699 = constructor2;
        this.f8698 = constructor3;
        this.f8697 = constructor4;
        list.sort(new C1548(4));
        this.f8703 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Constructor constructor6 = (Constructor) it2.next();
            if (constructor6.getParameterCount() > 0) {
                strArrM14776 = AbstractC9420.m14776(constructor6);
                Parameter[] parameters = constructor6.getParameters();
                C9192 c9192 = new C9192();
                for (int i2 = 0; i2 < parameters.length && i2 < strArrM14776.length; i2++) {
                    c9192.m14424();
                    AbstractC3766.m6947().m6183(c9192, cls, constructor6, i2, parameters[i2]);
                    String str = c9192.f23394;
                    if (str != null) {
                        strArrM14776[i2] = str;
                    }
                }
            } else {
                strArrM14776 = null;
            }
            this.f8703.add(strArrM14776);
        }
        AbstractC3595 abstractC3595 = null;
        for (AbstractC3595 abstractC35952 : abstractC3595Arr) {
            if ("stackTrace".equals(abstractC35952.f8773) && abstractC35952.f8774 == StackTraceElement[].class) {
                abstractC3595 = abstractC35952;
            }
        }
        this.f8702 = abstractC3595;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰] */
    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object obj2;
        Object[] objArr;
        HashMap map;
        String str;
        int i;
        ?? r2;
        Object obj3;
        String str2;
        Throwable th;
        String str3;
        String str4;
        Object obj4;
        Object[] objArr2 = null;
        if (!abstractC3732.mo6708() && abstractC3732.mo6711()) {
            return null;
        }
        String strMo6744 = null;
        Throwable th2 = null;
        HashMap map2 = null;
        HashMap map3 = null;
        StackTraceElement[] stackTraceElementArr = null;
        String strMo6749 = null;
        int i2 = 0;
        while (true) {
            boolean zMo6712 = abstractC3732.mo6712();
            Class cls = this.f8795;
            if (zMo6712) {
                try {
                    Constructor constructor = this.f8698;
                    if (constructor == null || th2 == null || strMo6744 == null) {
                        Constructor constructor2 = this.f8699;
                        if (constructor2 == null || strMo6744 == null) {
                            Constructor constructor3 = this.f8697;
                            if (constructor3 != null && th2 != null) {
                                obj2 = (Throwable) constructor3.newInstance(th2);
                            } else if (constructor == null || (th2 == null && strMo6744 == null)) {
                                Constructor constructor4 = this.f8700;
                                obj2 = constructor4 != null ? (Throwable) constructor4.newInstance(objArr2) : constructor != null ? (Throwable) constructor.newInstance(strMo6744, th2) : constructor2 != null ? (Throwable) constructor2.newInstance(strMo6744) : constructor3 != null ? (Throwable) constructor3.newInstance(th2) : objArr2;
                            } else {
                                obj2 = (Throwable) constructor.newInstance(strMo6744, th2);
                            }
                        } else {
                            obj2 = (Throwable) constructor2.newInstance(strMo6744);
                        }
                    } else {
                        obj2 = (Throwable) constructor.newInstance(strMo6744, th2);
                    }
                    if (obj2 == null) {
                        int i3 = 0;
                        while (true) {
                            List list = this.f8701;
                            if (i3 < list.size()) {
                                String[] strArr = (String[]) this.f8703.get(i3);
                                if (strArr != null) {
                                    i = 0;
                                    if (strArr.length == 0) {
                                        obj3 = obj2;
                                        objArr = objArr2;
                                        str2 = strMo6744;
                                        th = th2;
                                        map = map3;
                                    } else {
                                        int length = strArr.length;
                                        objArr = objArr2;
                                        boolean z = true;
                                        int i4 = 0;
                                        while (true) {
                                            obj3 = obj2;
                                            str2 = strMo6744;
                                            th = th2;
                                            map = map3;
                                            if (i4 < length) {
                                                int i5 = length;
                                                String str5 = strArr[i4];
                                                if (str5 == null) {
                                                    z = false;
                                                } else {
                                                    switch (str5) {
                                                        case "cause":
                                                        case "message":
                                                            break;
                                                        case "errorIndex":
                                                            if (cls != DateTimeParseException.class && !map2.containsKey(str5)) {
                                                                z = false;
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            if (map2.containsKey(str5)) {
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                    i4++;
                                                    obj2 = obj3;
                                                    length = i5;
                                                    strMo6744 = str2;
                                                    th2 = th;
                                                    map3 = map;
                                                }
                                            }
                                        }
                                        if (z) {
                                            Object[] objArr3 = new Object[strArr.length];
                                            str = strMo6749;
                                            for (int i6 = 0; i6 < strArr.length; i6++) {
                                                str4 = strArr[i6];
                                                str4.getClass();
                                                switch (str4) {
                                                    case "cause":
                                                        obj4 = th;
                                                        break;
                                                    case "message":
                                                        obj4 = str2;
                                                        break;
                                                    case "errorIndex":
                                                        obj4 = map2.get(str4);
                                                        if (obj4 != null || cls != DateTimeParseException.class) {
                                                            break;
                                                        } else {
                                                            obj4 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        obj4 = map2.get(str4);
                                                        break;
                                                }
                                                objArr3[i6] = obj4;
                                            }
                                            Constructor constructor5 = (Constructor) list.get(i3);
                                            try {
                                                r2 = (Throwable) constructor5.newInstance(objArr3);
                                            } catch (Throwable th3) {
                                                StringBuilder sb = new StringBuilder("create error, objectClass ");
                                                sb.append(constructor5);
                                                String message = th3.getMessage();
                                                sb.append(", ");
                                                sb.append(message);
                                                throw new JSONException(sb.toString(), th3);
                                            }
                                        }
                                    }
                                    str3 = strMo6749;
                                } else {
                                    obj3 = obj2;
                                    objArr = objArr2;
                                    str2 = strMo6744;
                                    th = th2;
                                    map = map3;
                                    str3 = strMo6749;
                                }
                                i3++;
                                objArr2 = objArr;
                                obj2 = obj3;
                                strMo6749 = str3;
                                strMo6744 = str2;
                                th2 = th;
                                map3 = map;
                            }
                        }
                        objArr = objArr2;
                        map = map3;
                        str = strMo6749;
                        i = 0;
                        r2 = obj2;
                    } else {
                        objArr = objArr2;
                        map = map3;
                        str = strMo6749;
                        i = 0;
                        r2 = obj2;
                    }
                    if (r2 == 0) {
                        C1123.m1410(abstractC3732.mo6730(abstractC3732.mo6730("not support : ".concat(cls.getName()))));
                        return objArr;
                    }
                    if (stackTraceElementArr != null) {
                        int length2 = stackTraceElementArr.length;
                        int i7 = i;
                        for (int i8 = i7; i8 < length2; i8++) {
                            if (stackTraceElementArr[i8] == null) {
                                i7++;
                            }
                        }
                        if (stackTraceElementArr.length == 0 || i7 != stackTraceElementArr.length) {
                            r2.setStackTrace(stackTraceElementArr);
                        }
                    }
                    if (str != null) {
                        AbstractC3755 abstractC3755M6938 = AbstractC3755.m6938(str);
                        if (abstractC3732.f9545 == null) {
                            abstractC3732.f9545 = new ArrayList();
                        }
                        ArrayList arrayList = abstractC3732.f9545;
                        AbstractC3595 abstractC3595 = this.f8702;
                        arrayList.add(new C3733(abstractC3595, r2, abstractC3595.f8773, abstractC3755M6938));
                    }
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            ?? M6180 = m6180((String) entry.getKey());
                            if (M6180 != 0) {
                                M6180.mo6031(r2, entry.getValue());
                            }
                        }
                    }
                    if (map != null) {
                        for (Map.Entry entry2 : map.entrySet()) {
                            ?? M61802 = m6180((String) entry2.getKey());
                            if (M61802 != 0) {
                                M61802.m6132(abstractC3732, r2, (String) entry2.getValue());
                            }
                        }
                    }
                    return r2;
                } catch (Throwable th4) {
                    throw new JSONException("create Exception error, class " + cls.getName() + ", " + th4.getMessage(), th4);
                }
            }
            Object[] objArr4 = objArr2;
            String str6 = strMo6744;
            Throwable th5 = th2;
            HashMap map4 = map3;
            String str7 = strMo6749;
            long jMo6689 = abstractC3732.mo6689();
            if (i2 == 0 && jMo6689 == f8696 && abstractC3732.m6735(j)) {
                long jMo6799 = abstractC3732.mo6799();
                C3776 c3776 = abstractC3732.f9546;
                InterfaceC3621 interfaceC3621Mo6146 = mo6146(c3776, jMo6799);
                if (interfaceC3621Mo6146 == null) {
                    String strMo6660 = abstractC3732.mo6660();
                    InterfaceC3621 interfaceC3621M6189 = ((C3635) c3776.f9663).m6189(strMo6660, cls, c3776.f9665 | j);
                    if (interfaceC3621M6189 == null) {
                        C1123.m1410(abstractC3732.mo6730("No suitable ObjectReader found for" + strMo6660));
                        return objArr4;
                    }
                    interfaceC3621Mo6146 = interfaceC3621M6189;
                }
                if (interfaceC3621Mo6146 != this) {
                    return interfaceC3621Mo6146.mo6028(abstractC3732);
                }
            } else if (jMo6689 == f8695 || jMo6689 == f8694) {
                strMo6744 = abstractC3732.mo6744();
                strMo6749 = str7;
                th2 = th5;
                map3 = map4;
                i2++;
                objArr2 = objArr4;
            } else if (jMo6689 == f8693) {
                abstractC3732.mo6744();
            } else if (jMo6689 == f8692) {
                if (abstractC3732.mo6740()) {
                    abstractC3732.mo6749();
                } else {
                    th2 = (Throwable) abstractC3732.mo6700(Throwable.class);
                    strMo6749 = str7;
                    strMo6744 = str6;
                    map3 = map4;
                    i2++;
                    objArr2 = objArr4;
                }
            } else if (jMo6689 == f8691) {
                if (abstractC3732.mo6740()) {
                    strMo6749 = abstractC3732.mo6749();
                    strMo6744 = str6;
                    th2 = th5;
                    map3 = map4;
                    i2++;
                    objArr2 = objArr4;
                } else {
                    stackTraceElementArr = (StackTraceElement[]) abstractC3732.mo6700(StackTraceElement[].class);
                }
            } else if (jMo6689 != f8690) {
                AbstractC3595 abstractC3595Mo6025 = mo6025(jMo6689);
                if (map2 == null) {
                    map2 = new HashMap();
                }
                String strMo6664 = abstractC3595Mo6025 != null ? abstractC3595Mo6025.f8773 : abstractC3732.mo6664();
                if (abstractC3732.mo6740()) {
                    String strMo67492 = abstractC3732.mo6749();
                    map3 = map4 == null ? new HashMap() : map4;
                    map3.put(strMo6664, strMo67492);
                    strMo6749 = str7;
                    strMo6744 = str6;
                    th2 = th5;
                    i2++;
                    objArr2 = objArr4;
                } else {
                    map2.put(strMo6664, abstractC3595Mo6025 != null ? abstractC3595Mo6025.mo6033(abstractC3732) : abstractC3732.mo6684());
                }
            } else if (abstractC3732.mo6740()) {
                abstractC3732.mo6749();
            } else if (abstractC3732.mo6743() == -110) {
            } else {
                abstractC3732.mo6682(Throwable.class);
            }
            strMo6749 = str7;
            strMo6744 = str6;
            th2 = th5;
            map3 = map4;
            i2++;
            objArr2 = objArr4;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        InterfaceC3621 interfaceC3621;
        if (abstractC3732.mo6743() == -110) {
            C3776 c3776 = abstractC3732.f9546;
            if (abstractC3732.m6735(j)) {
                abstractC3732.mo6733();
                InterfaceC3621 interfaceC3621M6190 = ((C3635) c3776.f9663).m6190(abstractC3732.mo6799());
                if (interfaceC3621M6190 == null) {
                    String strMo6660 = abstractC3732.mo6660();
                    InterfaceC3621 interfaceC3621M6970 = c3776.m6970(null, strMo6660);
                    if (interfaceC3621M6970 == null) {
                        StringBuilder sbM12144 = AbstractC7012.m12144("autoType not support : ", strMo6660, ", offset ");
                        sbM12144.append(abstractC3732.f9539);
                        throw new JSONException(sbM12144.toString());
                    }
                    interfaceC3621 = interfaceC3621M6970;
                } else {
                    interfaceC3621 = interfaceC3621M6190;
                }
                return interfaceC3621.mo6027(abstractC3732, type, obj, 0L);
            }
            c3776.getClass();
        }
        return mo6023(abstractC3732, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo6067(Map map, long j) {
        if (map == null) {
            return null;
        }
        return mo6023(AbstractC3732.m6651(InterfaceC3749.m6935(map)), null, null, j);
    }
}
