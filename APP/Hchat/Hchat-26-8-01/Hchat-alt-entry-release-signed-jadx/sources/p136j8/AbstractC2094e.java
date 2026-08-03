package p136j8;

import android.content.ContentValues;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ng.C3010h;
import ng.C3019q;
import p025bc.AbstractC0255e;
import p054dg.C0791j;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p119i2.C1955z;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: j8.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2094e {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f6999a = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m5190a(Object obj) {
        String[] strArr = {"getMsgId", "getMsgID", "getId"};
        int i9 = 0;
        while (true) {
            if (i9 >= 3) {
                String[] strArr2 = {"field_msgId", "msgId", "msgID", "id"};
                for (int i10 = 0; i10 < 4; i10++) {
                    Long lM5192c = m5192c(KavaReflector.readField(obj, strArr2[i10]));
                    if (lM5192c != null) {
                        if (!(lM5192c.longValue() > 0)) {
                            lM5192c = null;
                        }
                        if (lM5192c != null) {
                            return lM5192c.longValue();
                        }
                    }
                }
                return 0L;
            }
            Long lM5192c2 = m5192c(KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), strArr[i9], new Class[0]), obj, new Object[0]));
            if (lM5192c2 != null) {
                Long l10 = lM5192c2.longValue() > 0 ? lM5192c2 : null;
                if (l10 != null) {
                    return l10.longValue();
                }
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Integer m5191b(Long l10) {
        if (l10 == null) {
            return null;
        }
        long jLongValue = l10.longValue();
        if (jLongValue <= 0) {
            return null;
        }
        if (1 <= jLongValue && jLongValue < 601) {
            jLongValue *= 1000;
        }
        if (jLongValue > 2147483647L) {
            jLongValue = 2147483647L;
        }
        return Integer.valueOf((int) jLongValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Long m5192c(Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return AbstractC3156t.m6743g0(AbstractC3149m.m6703R0((String) obj).toString());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020e A[PHI: r11
  0x020e: PHI (r11v7 java.lang.Integer) = 
  (r11v5 java.lang.Integer)
  (r11v8 java.lang.Integer)
  (r11v8 java.lang.Integer)
  (r11v8 java.lang.Integer)
  (r11v8 java.lang.Integer)
 binds: [B:142:0x0247, B:166:0x020e, B:129:0x020c, B:139:0x023c, B:133:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0198 A[PHI: r7
  0x0198: PHI (r7v28 java.lang.Integer) = (r7v3 java.lang.Integer), (r7v6 java.lang.Integer), (r7v11 java.lang.Integer), (r7v14 java.lang.Integer) binds: [B:96:0x0196, B:105:0x01b3, B:114:0x01e3, B:146:0x0250] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m5193d(Object obj, String str, long j3, List list, int i9) {
        Integer numValueOf;
        long j4;
        Iterable iterable;
        Integer numValueOf2;
        Integer num;
        Integer num2;
        C2114y c2114y;
        int iMin;
        Object objInvoke;
        ContentValues contentValues;
        Integer numM5191b;
        Object field;
        Integer num3;
        str.getClass();
        list.getClass();
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        long j5 = 0;
        ConcurrentHashMap concurrentHashMap = f6999a;
        if (!zM6721t0 && (num3 = (Integer) concurrentHashMap.get("file:".concat(str))) != null) {
            numValueOf = Integer.valueOf(num3.intValue());
        } else if (j3 > 0) {
            Integer num4 = (Integer) concurrentHashMap.get("msg:" + j3);
            numValueOf = num4 != null ? Integer.valueOf(num4.intValue()) : null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            Long lValueOf = Long.valueOf(j3);
            if (j3 <= 0) {
                lValueOf = null;
            }
            long jLongValue = lValueOf != null ? lValueOf.longValue() : m5190a(obj);
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                for (Field field2 : KavaReflector.declaredFields(superclass)) {
                    long j10 = j5;
                    Class<?> type = field2.getType();
                    if (!type.isPrimitive() && !type.isArray() && !type.equals(String.class) && !Number.class.isAssignableFrom(type) && (field = KavaReflector.readField(field2, obj)) != null && field != obj) {
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() == field) {
                                    break;
                                }
                            }
                            if (AbstractC0921a.m2263z("com.tencent.mm.storage.", field, false)) {
                                arrayList.add(field);
                            } else {
                                arrayList.add(field);
                            }
                        } else if ((AbstractC0921a.m2263z("com.tencent.mm.storage.", field, false) || jLongValue > j10) && (jLongValue <= j10 || m5190a(field) == jLongValue)) {
                            arrayList.add(field);
                        }
                    }
                    j5 = j10;
                }
            }
            j4 = j5;
            iterable = arrayList;
        } else {
            j4 = 0;
            iterable = C4173t.f13710g;
        }
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                numValueOf2 = null;
                break;
            }
            Object next = it2.next();
            String[] strArr = {"getVoiceLength", "getVoiceLen", "getDuration"};
            int i10 = 0;
            while (true) {
                if (i10 >= 3) {
                    String[] strArr2 = {"field_voiceLength", "voiceLength", "VoiceLength", "duration", "field_duration"};
                    int i11 = 0;
                    while (true) {
                        if (i11 >= 5) {
                            numValueOf2 = null;
                            break;
                        }
                        Integer numM5191b2 = m5191b(m5192c(KavaReflector.readField(next, strArr2[i11])));
                        if (numM5191b2 != null) {
                            numValueOf2 = Integer.valueOf(numM5191b2.intValue());
                            break;
                        }
                        i11++;
                    }
                } else {
                    Method methodFindMethod = KavaReflector.findMethod(next.getClass(), strArr[i10], new Class[0]);
                    if (methodFindMethod != null) {
                        Class<?>[] parameterTypes = methodFindMethod.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length != 0) {
                            methodFindMethod = null;
                        }
                        if (methodFindMethod != null && (numM5191b = m5191b(m5192c(KavaReflector.invoke(methodFindMethod, next, new Object[0])))) != null) {
                            numValueOf2 = Integer.valueOf(numM5191b.intValue());
                            break;
                        }
                    }
                    i10++;
                }
            }
            if (numValueOf2 != null) {
                break;
            }
        }
        if (numValueOf2 != null) {
            num2 = numValueOf2;
        } else {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    numValueOf2 = null;
                    break;
                }
                numValueOf2 = m5194e((String) it3.next(), str);
                if (numValueOf2 != null) {
                    break;
                }
            }
            if (numValueOf2 == null) {
                C3010h c3010h = new C3010h(new C0791j(new C0795n(iterable, 6), new C1955z(9), C3019q.f9816n));
                while (true) {
                    if (!c3010h.hasNext()) {
                        numValueOf2 = null;
                        break;
                    }
                    numValueOf2 = m5194e((String) c3010h.next(), str);
                    if (numValueOf2 != null) {
                        break;
                    }
                }
                if (numValueOf2 == null) {
                    C2105p c2105pMedia = WeChatApis.media();
                    if (c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null) {
                        num = null;
                    } else {
                        Method method = c2114y.f7061a.voiceInfoQueryMethod;
                        if (TextUtils.isEmpty(str) || method == null || !KavaReflector.isStatic(method)) {
                            num = null;
                            numValueOf2 = Integer.valueOf(iMin);
                            if (!(iMin > 0)) {
                            }
                        } else {
                            try {
                                num = null;
                                try {
                                    objInvoke = KavaReflector.invoke(method, null, str);
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                                num = null;
                            }
                            if (objInvoke != null && (contentValues = (ContentValues) KavaReflector.invoke(c2114y.m5327w(objInvoke.getClass()), objInvoke, new Object[0])) != null) {
                                Object obj2 = contentValues.get("VoiceLength");
                                long jLongValue2 = obj2 instanceof Number ? ((Number) obj2).longValue() : Long.parseLong(String.valueOf(obj2));
                                iMin = jLongValue2 > j4 ? (int) Math.min(2147483647L, jLongValue2) : 0;
                                numValueOf2 = Integer.valueOf(iMin);
                                if (!(iMin > 0)) {
                                }
                            }
                        }
                    }
                    num2 = num;
                }
            }
        }
        if (num2 == null) {
            return i9;
        }
        int iIntValue = num2.intValue();
        if (iIntValue > 0) {
            if (concurrentHashMap.size() > 2048) {
                concurrentHashMap.clear();
            }
            if (!AbstractC3149m.m6721t0(str)) {
                concurrentHashMap.put("file:".concat(str), Integer.valueOf(iIntValue));
            }
            if (j3 > j4) {
                concurrentHashMap.put(AbstractC0255e.m1018g(j3, "msg:"), Integer.valueOf(iIntValue));
            }
        }
        return num2.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Integer m5194e(String str, String str2) {
        String string;
        String strM6706U0 = AbstractC3149m.m6706U0(str, '\n', '\r');
        if (!AbstractC3149m.m6721t0(strM6706U0)) {
            boolean z9 = false;
            if (AbstractC3149m.m6718q0(strM6706U0, '<', 0, 6) < 0) {
                List listM6691F0 = AbstractC3149m.m6691F0(strM6706U0, new char[]{':'}, 6);
                if (listM6691F0.size() >= 3) {
                    String string2 = AbstractC3149m.m6703R0((String) listM6691F0.get(0)).toString();
                    String str3 = (String) AbstractC4166m.m8425w1(1, listM6691F0);
                    Integer numM5191b = m5191b((str3 == null || (string = AbstractC3149m.m6703R0(str3).toString()) == null) ? null : AbstractC3156t.m6743g0(string));
                    if (numM5191b != null) {
                        if (!AbstractC3149m.m6721t0(str2) && !AbstractC3149m.m6721t0(string2) && !string2.equals(str2) && !AbstractC3156t.m6733W(str2, string2, false) && !AbstractC3156t.m6733W(string2, str2, false)) {
                            if (!AbstractC3149m.m6710i0(string2, '/') && !AbstractC3149m.m6710i0(string2, '\\')) {
                                z9 = true;
                            }
                            if (z9) {
                            }
                        }
                        return numM5191b;
                    }
                }
            }
        }
        return null;
    }
}
