package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3727;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9291 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C9291 f23770;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f23774;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f23775;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f23776;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23777;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f23778;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final char[] f23779;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f23780;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final byte[] f23781;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f23782;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public volatile InterfaceC9352 f23783;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public volatile InterfaceC9352 f23784;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final long f23785;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Field f23786;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final byte[] f23787;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f23788;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final byte[] f23772 = InterfaceC3745.m6915("JO10");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final long f23773 = AbstractC3693.m6334("JO10");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C9291 f23771 = new C9291(Object.class, null, JSONObject.class, JSONObject.class, 0);

    static {
        Class cls = AbstractC3700.f9396;
        if (cls == null) {
            f23770 = null;
        } else {
            f23770 = new C9291(Object.class, null, cls, cls, 0L);
        }
    }

    public C9291(Type type, String str, Class cls, Type type2, long j) {
        long jObjectFieldOffset;
        this.f23776 = type;
        this.f23775 = str;
        this.f23777 = cls;
        this.f23778 = type2;
        this.f23785 = j;
        if (type == null) {
            this.f23774 = true;
        } else {
            this.f23774 = !C9368.m14664(AbstractC3700.m6504(type));
        }
        this.f23782 = (j & Long.MIN_VALUE) != 0;
        String strM6503 = AbstractC3700.m6503(cls);
        String str2 = "\"@type\":\"" + cls.getName() + "\"";
        this.f23779 = str2.toCharArray();
        this.f23781 = str2.getBytes(StandardCharsets.UTF_8);
        boolean zEquals = "JO1".equals(strM6503);
        this.f23787 = InterfaceC3745.m6915(strM6503);
        this.f23788 = AbstractC3693.m6334(strM6503);
        if (zEquals) {
            Field fieldM6373 = AbstractC3698.m6373(cls, "map");
            this.f23786 = fieldM6373;
            if (fieldM6373 != null) {
                fieldM6373.setAccessible(true);
                jObjectFieldOffset = AbstractC3687.f9266.objectFieldOffset(fieldM6373);
            }
            this.f23780 = jObjectFieldOffset;
        }
        this.f23786 = null;
        jObjectFieldOffset = -1;
        this.f23780 = jObjectFieldOffset;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m14580(Object obj, AbstractC3730 abstractC3730, long j) {
        if (obj == null) {
            abstractC3730.mo6591("null");
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            abstractC3730.mo6591(str);
            return str;
        }
        if (m14583(obj, j)) {
            String string = obj.toString();
            abstractC3730.mo6591(string);
            return string;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (abstractC3730.f9517) {
                abstractC3730.f9517 = false;
            } else {
                abstractC3730.mo6542();
            }
            abstractC3730.mo6533(iIntValue);
            return null;
        }
        boolean z = obj instanceof Long;
        boolean z2 = abstractC3730.f9517;
        if (!z) {
            if (z2) {
                abstractC3730.f9517 = false;
            } else {
                abstractC3730.mo6542();
            }
            abstractC3730.mo6597(obj);
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        if (z2) {
            abstractC3730.f9517 = false;
        } else {
            abstractC3730.mo6542();
        }
        abstractC3730.mo6523(jLongValue);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C9291 m14581(Type type, String str, Class cls) {
        Type type2;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                Type type3 = actualTypeArguments[0];
                type2 = actualTypeArguments[1];
            } else {
                type2 = null;
            }
        }
        return new C9291(type2, str, cls, type, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C9291 m14582(Class cls) {
        return cls == JSONObject.class ? f23771 : cls == AbstractC3700.f9396 ? f23770 : new C9291(null, null, cls, cls, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m14583(Object obj, long j) {
        return ((j & (JSONWriter$Feature.WriteNonStringKeyAsString.mask | JSONWriter$Feature.BrowserCompatible.mask)) == 0 || !C9368.m14663(obj.getClass()) || (obj instanceof Temporal) || (obj instanceof Date)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        boolean z;
        int i;
        Class<?> cls;
        boolean z2;
        Type type2;
        C9368 c9368;
        int i2;
        boolean z3;
        boolean z4;
        InterfaceC9352 interfaceC9352M14665;
        int i3;
        Type type3;
        boolean z5;
        String strM6641;
        String strM6647;
        String strM66472;
        Object obj3;
        boolean z6;
        Object obj4;
        C9368 c93682;
        boolean z7;
        if ((type == this.f23778 && abstractC3730.m6624(j, this.f23777, obj)) || abstractC3730.m6618(obj, type, j)) {
            Field field = this.f23786;
            if (field != null) {
                long j2 = this.f23780;
                if (j2 != -1) {
                    z7 = AbstractC3687.f9266.getObject(obj, j2) instanceof LinkedHashMap;
                } else {
                    try {
                        z7 = field.get(obj) instanceof LinkedHashMap;
                    } catch (IllegalAccessException unused) {
                        z7 = false;
                    }
                }
                if (z7) {
                    abstractC3730.mo6603(this.f23788, this.f23787);
                } else {
                    abstractC3730.mo6603(f23773, f23772);
                }
            } else {
                z7 = false;
                if (z7) {
                }
            }
        }
        Map map = (Map) obj;
        C3728 c3728 = abstractC3730.f9523;
        abstractC3730.mo6557();
        Type type4 = this.f23776;
        boolean z8 = true;
        if (type != this.f23778 && (type instanceof ParameterizedType)) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                type4 = actualTypeArguments[1];
            }
        }
        Type type5 = type4;
        long j3 = c3728.f9498;
        long j4 = 0;
        boolean z9 = ((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask) & j3) != 0;
        boolean z10 = (JSONWriter$Feature.FieldBased.mask & j3) != 0;
        C9368 c93683 = c3728.f9499;
        boolean z11 = (JSONWriter$Feature.ReferenceDetection.mask & j3) != 0;
        Class<?> cls2 = null;
        InterfaceC9352 interfaceC9352 = null;
        int i4 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            long j5 = j4;
            Object value = entry.getValue();
            if (value != null) {
                z = z10;
                C9368 c93684 = c93683;
                i = i4;
                cls = cls2;
                boolean z12 = key instanceof String;
                if (z12 || (JSONWriter$Feature.WriteClassName.mask & j3) == j5) {
                    z2 = z12;
                    type2 = type5;
                    c9368 = c93684;
                    abstractC3730.mo6577(z2 ? (String) key : key.toString());
                } else if (key == null) {
                    abstractC3730.mo6527();
                    z2 = z12;
                    type2 = type5;
                    c9368 = c93684;
                } else {
                    if (z11) {
                        abstractC3730.m6631(JSONWriter$Feature.ReferenceDetection, false);
                    }
                    Class<?> cls3 = key.getClass();
                    z2 = z12;
                    type2 = type5;
                    c9368 = c93684;
                    c93684.m14665(cls3, cls3, z).mo6238(abstractC3730, key, null, null, 0L);
                    if (z11) {
                        abstractC3730.m6631(JSONWriter$Feature.ReferenceDetection, true);
                    }
                }
                Class<?> cls4 = this.f23782 ? (Class) this.f23776 : value.getClass();
                if (cls4 == String.class) {
                    abstractC3730.mo6577((String) value);
                } else if (cls4 == Integer.class) {
                    abstractC3730.mo6531((Integer) value);
                } else if (cls4 == Long.class) {
                    abstractC3730.mo6522((Long) value);
                } else {
                    boolean z13 = cls4 != this.f23776 ? !(!z11 || C9368.m14664(cls4)) : z11 && this.f23774;
                    if (!z13) {
                        i2 = i;
                        z3 = false;
                        z4 = false;
                    } else if (value == obj) {
                        abstractC3730.mo6580("..");
                    } else {
                        if (z2) {
                            strM6647 = abstractC3730.m6647(value, (String) key);
                        } else if (C9368.m14663(key.getClass())) {
                            strM6647 = abstractC3730.m6647(value, key.toString());
                        } else {
                            if (map.size() == 1 || (map instanceof SortedMap) || (map instanceof LinkedHashMap)) {
                                z3 = false;
                                i2 = i;
                                strM6641 = abstractC3730.m6641(i2, value);
                                z4 = false;
                            } else {
                                z3 = false;
                                abstractC3730.m6631(JSONWriter$Feature.ReferenceDetection, false);
                                z13 = false;
                                strM6641 = null;
                                i2 = i;
                                z4 = true;
                            }
                            if (strM6641 != null) {
                                abstractC3730.mo6580(strM6641);
                                abstractC3730.m6643(value);
                                type3 = type2;
                                i3 = i2;
                                z5 = true;
                            }
                        }
                        strM6641 = strM6647;
                        i2 = i;
                        z3 = false;
                        z4 = false;
                        if (strM6641 != null) {
                        }
                    }
                    boolean z14 = z13;
                    if (cls4 == this.f23776 && this.f23783 != null) {
                        interfaceC9352M14665 = this.f23783;
                    } else if (cls == cls4) {
                        i3 = i2;
                        interfaceC9352M14665 = interfaceC9352;
                        type3 = type2;
                        interfaceC9352M14665.mo6238(abstractC3730, value, key, type3, this.f23785);
                        if (z4) {
                            z5 = true;
                            if (z14) {
                                abstractC3730.m6643(value);
                            }
                        } else {
                            z5 = true;
                            abstractC3730.m6631(JSONWriter$Feature.ReferenceDetection, true);
                        }
                    } else {
                        interfaceC9352M14665 = cls4 == JSONObject.class ? f23771 : cls4 == AbstractC3700.f9396 ? f23770 : (cls4 == JSONArray.class || cls4 == AbstractC3700.f9395) ? C9271.f23702 : c9368.m14665(cls4, cls4, z);
                        if (interfaceC9352 == null) {
                            interfaceC9352 = interfaceC9352M14665;
                            cls = cls4;
                        }
                        if (cls4 == this.f23776) {
                            this.f23783 = interfaceC9352M14665;
                        }
                    }
                    i3 = i2;
                    type3 = type2;
                    interfaceC9352M14665.mo6238(abstractC3730, value, key, type3, this.f23785);
                    if (z4) {
                    }
                }
                i2 = i;
                z3 = false;
                type3 = type2;
                i3 = i2;
                z5 = true;
            } else if (z9) {
                if (key instanceof String) {
                    abstractC3730.mo6577((String) key);
                    z6 = z10;
                    c93682 = c93683;
                    i = i4;
                    cls = cls2;
                } else {
                    Class<?> cls5 = key.getClass();
                    boolean z15 = (!z11 || C9368.m14664(cls5)) ? false : z8;
                    if (z15) {
                        abstractC3730.m6641(i4, entry);
                        strM66472 = abstractC3730.m6647(key, "key");
                    } else {
                        strM66472 = null;
                    }
                    if (strM66472 != null) {
                        abstractC3730.mo6580(strM66472);
                        z6 = z10;
                        c93682 = c93683;
                        i = i4;
                        cls = cls2;
                        obj4 = entry;
                        obj3 = key;
                    } else {
                        InterfaceC9352 interfaceC9352M146652 = c93683.m14665(cls5, cls5, z10);
                        C9368 c93685 = c93683;
                        obj3 = key;
                        z6 = z10;
                        cls = cls2;
                        obj4 = entry;
                        c93682 = c93685;
                        i = i4;
                        interfaceC9352M146652.mo6238(abstractC3730, obj3, null, null, 0L);
                    }
                    if (z15) {
                        abstractC3730.m6643(obj4);
                        abstractC3730.m6643(obj3);
                    }
                }
                abstractC3730.mo6527();
                type2 = type5;
                z = z6;
                c9368 = c93682;
                i2 = i;
                z3 = false;
                type3 = type2;
                i3 = i2;
                z5 = true;
            } else {
                cls = cls2;
                z = z10;
                i2 = i4;
                type2 = type5;
                z3 = false;
                c9368 = c93683;
                type3 = type2;
                i3 = i2;
                z5 = true;
            }
            j4 = j5;
            c93683 = c9368;
            type5 = type3;
            cls2 = cls;
            z8 = z5;
            i4 = i3 + 1;
            z10 = z;
        }
        abstractC3730.mo6554();
    }

    @Override // p307.AbstractC9280, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo14577(AbstractC3730 abstractC3730, Object obj, Type type, long j) {
        AbstractC3730 abstractC37302;
        Map map = (Map) obj;
        abstractC3730.mo6557();
        boolean z = (abstractC3730.f9523.f9498 & JSONWriter$Feature.WriteNulls.mask) != 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                abstractC3730.mo6577(str);
                Class<?> cls = value.getClass();
                if (cls == String.class) {
                    abstractC3730.mo6577((String) value);
                    abstractC37302 = abstractC3730;
                } else {
                    abstractC37302 = abstractC3730;
                    abstractC3730.m6637(cls).mo6238(abstractC37302, value, str, this.f23776, this.f23785);
                }
                abstractC3730 = abstractC37302;
            } else if (z) {
                abstractC3730.mo6577(str);
                abstractC3730.mo6527();
            }
        }
        abstractC3730.mo6554();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x017b A[Catch: all -> 0x016e, TryCatch #6 {all -> 0x016e, blocks: (B:94:0x0153, B:103:0x0173, B:105:0x017b, B:106:0x0183, B:108:0x0187, B:110:0x0190, B:109:0x018c), top: B:257:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0183 A[Catch: all -> 0x016e, TryCatch #6 {all -> 0x016e, blocks: (B:94:0x0153, B:103:0x0173, B:105:0x017b, B:106:0x0183, B:108:0x0187, B:110:0x0190, B:109:0x018c), top: B:257:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0171 A[SYNTHETIC] */
    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) throws Throwable {
        Object obj3;
        Object obj4;
        String strM14580;
        boolean z;
        C9368 c9368;
        boolean zM14663;
        InterfaceC9352 interfaceC9352M6637;
        InterfaceC9352 interfaceC9352;
        Object obj5;
        Object obj6;
        long j2;
        String string;
        AbstractC3730 abstractC37302;
        int length;
        boolean z2;
        Object obj7;
        Throwable th;
        long j3;
        String strM6647;
        if (abstractC3730.f9516) {
            mo6238(abstractC3730, obj, obj2, type, j);
            return;
        }
        DecimalFormat decimalFormat = null;
        int i = 1;
        if (!mo14656(abstractC3730)) {
            Map treeMap = (Map) obj;
            boolean zM6632 = abstractC3730.m6632();
            boolean z3 = (type == this.f23778 && abstractC3730.m6624(j, this.f23777, obj)) || abstractC3730.m6618(obj, type, j);
            if (!z3 && treeMap.isEmpty()) {
                abstractC3730.mo6571('{', '}');
                return;
            }
            abstractC3730.mo6557();
            if (z3) {
                if (abstractC3730.f9521) {
                    abstractC3730.mo6534(this.f23781);
                } else {
                    abstractC3730.mo6526(this.f23779);
                }
            }
            long j4 = abstractC3730.f9523.f9498 | j;
            long j5 = JSONWriter$Feature.MapSortField.mask;
            JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.SortMapEntriesByKeys;
            if (((j5 | jSONWriter$Feature.mask) & j4) != 0 && !(treeMap instanceof SortedMap) && (treeMap.getClass() != LinkedHashMap.class || (jSONWriter$Feature.mask & j4) != 0)) {
                treeMap = new TreeMap(treeMap);
            }
            C9368 c93682 = abstractC3730.f9523.f9499;
            for (Map.Entry entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                Object key = entry.getKey();
                if (value != null) {
                    if ((JSONWriter$Feature.NotWriteEmptyArray.mask & j4) != 0) {
                        if (!(value instanceof Collection) || !((Collection) value).isEmpty()) {
                            if (!value.getClass().isArray() || Array.getLength(value) != 0) {
                            }
                        }
                    }
                    if (this.f23784 != null) {
                        obj4 = key;
                        obj3 = value;
                        this.f23784.mo6239(abstractC3730, obj4, null, null, 0L);
                        strM14580 = decimalFormat;
                    } else {
                        obj3 = value;
                        obj4 = key;
                        strM14580 = m14580(obj4, abstractC3730, j4);
                    }
                    abstractC3730.mo6539();
                    Class<?> cls = this.f23782 ? (Class) this.f23776 : obj3.getClass();
                    if (cls == String.class) {
                        abstractC3730.mo6577((String) obj3);
                    } else if (cls == Integer.class) {
                        abstractC3730.mo6531((Integer) obj3);
                    } else if (cls == Long.class) {
                        c93682.getClass();
                        abstractC3730.mo6522((Long) obj3);
                    } else if (cls == Boolean.class) {
                        abstractC3730.mo6549(((Boolean) obj3).booleanValue());
                    } else if (cls == BigDecimal.class) {
                        c93682.getClass();
                        abstractC3730.mo6550((BigDecimal) obj3, j4, decimalFormat);
                    } else {
                        if (cls == this.f23776) {
                            if (this.f23783 != null) {
                                interfaceC9352M6637 = this.f23783;
                                z = zM6632;
                                c9368 = c93682;
                            } else {
                                String str = this.f23775;
                                if (str != null) {
                                    C3728 c3728 = abstractC3730.f9523;
                                    c9368 = c93682;
                                    z = zM6632;
                                    InterfaceC9352 interfaceC9352M14665 = c3728.f9499.m14665(cls, cls, (JSONWriter$Feature.FieldBased.mask & c3728.f9498) != 0);
                                    if (cls == LocalDateTime.class && interfaceC9352M14665 == C9289.f23768) {
                                        decimalFormat = null;
                                        interfaceC9352M14665 = new C9289(str, null);
                                    } else {
                                        decimalFormat = null;
                                    }
                                    interfaceC9352M6637 = interfaceC9352M14665;
                                } else {
                                    z = zM6632;
                                    c9368 = c93682;
                                    interfaceC9352M6637 = abstractC3730.m6637(cls);
                                }
                                this.f23783 = interfaceC9352M6637;
                            }
                            zM14663 = C9368.m14663(obj3.getClass());
                        } else {
                            z = zM6632;
                            c9368 = c93682;
                            if (cls == JSONObject.class) {
                                interfaceC9352M6637 = f23771;
                            } else if (cls == AbstractC3700.f9396) {
                                interfaceC9352M6637 = f23770;
                            } else if (cls == JSONArray.class || cls == AbstractC3700.f9395) {
                                interfaceC9352M6637 = C9271.f23702;
                            } else {
                                InterfaceC9352 interfaceC9352M66372 = abstractC3730.m6637(cls);
                                zM14663 = C9368.m14663(cls);
                                interfaceC9352M6637 = interfaceC9352M66372;
                            }
                            zM14663 = false;
                        }
                        boolean z4 = (!z || strM14580 == null || zM14663) ? false : true;
                        if (z4) {
                            Object obj8 = obj3;
                            if (obj8 == obj) {
                                abstractC3730.mo6580("..");
                            } else {
                                String strM66472 = abstractC3730.m6647(obj8, strM14580);
                                if (strM66472 != null) {
                                    abstractC3730.mo6580(strM66472);
                                    abstractC3730.m6643(obj8);
                                } else {
                                    interfaceC9352 = interfaceC9352M6637;
                                    obj5 = obj4;
                                    obj6 = obj8;
                                }
                            }
                            c93682 = c9368;
                            zM6632 = z;
                        } else {
                            interfaceC9352 = interfaceC9352M6637;
                            obj5 = obj4;
                            obj6 = obj3;
                        }
                        interfaceC9352.mo6239(abstractC3730, obj6, obj5, this.f23776, this.f23785);
                        if (z4) {
                            abstractC3730.m6643(obj6);
                        }
                        c93682 = c9368;
                        zM6632 = z;
                    }
                } else if ((JSONWriter$Feature.WriteNulls.mask & j4) != 0) {
                    m14580(key, abstractC3730, j4);
                    abstractC3730.mo6539();
                    abstractC3730.mo6527();
                }
            }
            abstractC3730.mo6554();
            return;
        }
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        abstractC3730.mo6557();
        C3728 c37282 = abstractC3730.f9523;
        Map treeMap2 = (Map) obj;
        long j6 = j | c37282.f9498;
        long j7 = JSONWriter$Feature.MapSortField.mask;
        JSONWriter$Feature jSONWriter$Feature2 = JSONWriter$Feature.SortMapEntriesByKeys;
        long j8 = 0;
        if (((j7 | jSONWriter$Feature2.mask) & j6) != 0 && !(treeMap2 instanceof SortedMap) && (treeMap2.getClass() != LinkedHashMap.class || (jSONWriter$Feature2.mask & j6) != 0)) {
            treeMap2 = new TreeMap(treeMap2);
        }
        long j9 = JSONWriter$Feature.WriteNulls.mask;
        long j10 = c37282.f9498;
        boolean z5 = (j9 & j10) != 0;
        boolean z6 = (JSONWriter$Feature.ReferenceDetection.mask & j10) != 0;
        for (Map.Entry entry2 : treeMap2.entrySet()) {
            Object value2 = entry2.getValue();
            if (value2 != null || z5) {
                Object key2 = entry2.getKey();
                if (key2 == null) {
                    string = null;
                } else if (key2 instanceof String) {
                    string = (String) key2;
                } else {
                    if ((key2 instanceof Integer) || (key2 instanceof Long)) {
                        j2 = j8;
                        string = key2.toString();
                    } else if (m14583(key2, j6)) {
                        string = key2.toString();
                    } else {
                        try {
                            AbstractC3730 abstractC3730M6616 = AbstractC3730.m6616(c37282);
                            try {
                                abstractC3730M6616.f9513 = key2;
                                abstractC3730M6616.f9511 = C3727.f9488;
                                Class<?> cls2 = key2.getClass();
                                abstractC37302 = abstractC3730M6616;
                                try {
                                    c37282.m6586(cls2, cls2).mo6239(abstractC37302, key2, null, null, 0L);
                                    try {
                                        String string2 = abstractC37302.toString();
                                        abstractC37302.close();
                                        if (string2 == null || (length = string2.length()) <= i) {
                                            j2 = j8;
                                        } else {
                                            char c = abstractC3730.f9515 ? '\'' : '\"';
                                            j2 = j8;
                                            if (string2.charAt(0) == c) {
                                                int i2 = length - 1;
                                                if (string2.charAt(i2) == c) {
                                                    string = string2.substring(i, i2);
                                                }
                                            }
                                        }
                                        string = string2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Throwable th3 = th;
                                        try {
                                            abstractC37302.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    key2 = key2;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                abstractC37302 = abstractC3730M6616;
                            }
                        } catch (NullPointerException | NumberFormatException e) {
                            throw new JSONException("JSON#toJSONString cannot serialize '" + key2 + "'", e);
                        }
                    }
                    if (z6 || (strM6647 = abstractC3730.m6647(value2, string)) == null) {
                        if (value2 != null) {
                            try {
                                z2 = z5;
                                if ((abstractC3730.m6638(j6) & JSONWriter$Feature.WriteNulls.mask) == j2) {
                                    if (z6) {
                                        abstractC3730.m6643(value2);
                                    }
                                    z5 = z2;
                                    j8 = j2;
                                    i = 1;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj7 = value2;
                                if (z6) {
                                }
                                throw th;
                            }
                        } else {
                            z2 = z5;
                        }
                        abstractC3730.mo6591(string);
                        abstractC3730.mo6539();
                        if (value2 != null) {
                            abstractC3730.mo6527();
                            j3 = j6;
                            obj7 = value2;
                        } else {
                            j3 = j6;
                            obj7 = value2;
                            try {
                                abstractC3730.m6637(this.f23782 ? (Class) this.f23776 : value2.getClass()).mo6239(abstractC3730, obj7, obj2, type, this.f23785);
                            } catch (Throwable th8) {
                                th = th8;
                                if (z6) {
                                    abstractC3730.m6643(obj7);
                                }
                                throw th;
                            }
                        }
                        if (z6) {
                            abstractC3730.m6643(obj7);
                        }
                        j6 = j3;
                        j8 = j2;
                        i = 1;
                        z5 = z2;
                    } else {
                        abstractC3730.mo6591(string);
                        abstractC3730.mo6539();
                        abstractC3730.mo6580(strM6647);
                        abstractC3730.m6643(value2);
                        j8 = j2;
                    }
                }
                j2 = j8;
                if (z6) {
                }
                if (value2 != null) {
                }
                abstractC3730.mo6591(string);
                abstractC3730.mo6539();
                if (value2 != null) {
                }
                if (z6) {
                }
                j6 = j3;
                j8 = j2;
                i = 1;
                z5 = z2;
            }
        }
        abstractC3730.mo6554();
    }
}
