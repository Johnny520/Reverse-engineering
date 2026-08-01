package com.google.gson;

import com.google.gson.internal.AbstractC3221;
import com.google.gson.internal.C3222;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import io.ktor.util.C4211;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p232.C8065;
import p259.C8244;
import p259.C8245;
import p260.C8246;
import p270.AbstractC8271;
import p271.AbstractC8327;
import p271.C8279;
import p271.C8295;
import p271.C8305;
import p271.C8307;
import p271.C8309;
import p271.C8318;
import p271.C8320;
import p271.C8321;
import p271.C8324;
import p271.C8332;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f10940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f10941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8324 f10942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8065 f10943;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f10944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ThreadLocal f10945;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Strictness f10946;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3245 f10947;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f10948;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f10949;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final List f10950;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C3245 f10939 = C3245.f10915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final FieldNamingPolicy f10937 = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final ToNumberPolicy f10936 = ToNumberPolicy.DOUBLE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final ToNumberPolicy f10938 = ToNumberPolicy.LAZILY_PARSED_NUMBER;

    public C3253(C3222 c3222, InterfaceC3246 interfaceC3246, Map map, boolean z, C3245 c3245, Strictness strictness, boolean z2, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3, InterfaceC3247 interfaceC3247, InterfaceC3247 interfaceC32472, List list4) {
        this.f10945 = new ThreadLocal();
        this.f10944 = new ConcurrentHashMap();
        C8065 c8065 = new C8065(map, z2, list4);
        this.f10943 = c8065;
        this.f10940 = z;
        this.f10947 = c3245;
        this.f10946 = strictness;
        this.f10949 = list;
        this.f10950 = list2;
        this.f10948 = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC8327.f22964);
        C8320 c8320 = C8309.f22922;
        int i = 1;
        arrayList.add(interfaceC3247 == ToNumberPolicy.DOUBLE ? C8309.f22922 : new C8320(interfaceC3247, i));
        arrayList.add(c3222);
        arrayList.addAll(list3);
        arrayList.add(AbstractC8327.f22984);
        arrayList.add(AbstractC8327.f22986);
        arrayList.add(AbstractC8327.f22969);
        arrayList.add(AbstractC8327.f22968);
        arrayList.add(AbstractC8327.f22967);
        AbstractC3251 c3243 = longSerializationPolicy == LongSerializationPolicy.DEFAULT ? AbstractC8327.f22987 : new C3243();
        arrayList.add(new C8332(Long.TYPE, Long.class, c3243));
        int i2 = 0;
        arrayList.add(new C8332(Double.TYPE, Double.class, new C3244(i2)));
        arrayList.add(new C8332(Float.TYPE, Float.class, new C3244(i)));
        C8320 c83202 = C8318.f22943;
        arrayList.add(interfaceC32472 == ToNumberPolicy.LAZILY_PARSED_NUMBER ? C8318.f22943 : new C8320(new C8318(interfaceC32472), i2));
        arrayList.add(AbstractC8327.f22985);
        arrayList.add(AbstractC8327.f22989);
        arrayList.add(new C8279(AtomicLong.class, new C3242(c3243, i2).m7333(), i2));
        arrayList.add(new C8279(AtomicLongArray.class, new C3242(c3243, i).m7333(), i2));
        arrayList.add(AbstractC8327.f22990);
        arrayList.add(AbstractC8327.f22988);
        arrayList.add(AbstractC8327.f22981);
        arrayList.add(AbstractC8327.f22982);
        arrayList.add(new C8279(BigDecimal.class, AbstractC8327.f22980, i2));
        arrayList.add(new C8279(BigInteger.class, AbstractC8327.f22979, i2));
        arrayList.add(new C8279(LazilyParsedNumber.class, AbstractC8327.f22983, i2));
        arrayList.add(AbstractC8327.f22974);
        arrayList.add(AbstractC8327.f22973);
        arrayList.add(AbstractC8327.f22978);
        arrayList.add(AbstractC8327.f22975);
        arrayList.add(AbstractC8327.f22966);
        arrayList.add(AbstractC8327.f22977);
        arrayList.add(AbstractC8327.f22971);
        arrayList.add(C8321.f22951);
        arrayList.add(AbstractC8327.f22976);
        if (AbstractC8271.f22894) {
            arrayList.add(AbstractC8271.f22890);
            arrayList.add(AbstractC8271.f22891);
            arrayList.add(AbstractC8271.f22889);
        }
        arrayList.add(C8307.f22919);
        arrayList.add(AbstractC8327.f22972);
        arrayList.add(new C8305(c8065, i2));
        arrayList.add(new C8305(c8065, i));
        C8324 c8324 = new C8324(c8065);
        this.f10942 = c8324;
        arrayList.add(c8324);
        arrayList.add(AbstractC8327.f22963);
        arrayList.add(new C8295(c8065, interfaceC3246, c3222, c8324, list4));
        this.f10941 = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7336(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f10941 + ",instanceCreators:" + this.f10943 + "}";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7337(Object obj, Class cls, C8244 c8244) {
        AbstractC3251 abstractC3251M7340 = m7340(new C8246(cls));
        Strictness strictness = c8244.f22790;
        Strictness strictness2 = this.f10946;
        if (strictness2 != null) {
            c8244.f22790 = strictness2;
        } else if (strictness == Strictness.LEGACY_STRICT) {
            c8244.m13775(Strictness.LENIENT);
        }
        boolean z = c8244.f22791;
        boolean z2 = c8244.f22786;
        c8244.f22791 = this.f10940;
        c8244.f22786 = false;
        try {
            try {
                try {
                    abstractC3251M7340.mo7322(c8244, obj);
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e2.getMessage(), e2);
            }
        } finally {
            c8244.m13775(strictness);
            c8244.f22791 = z;
            c8244.f22786 = z2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String m7338(Object obj) {
        Class cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            m7337(obj, cls, m7339(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8244 m7339(Writer writer) {
        C8244 c8244 = new C8244(writer);
        c8244.m13779(this.f10947);
        c8244.f22791 = this.f10940;
        Strictness strictness = this.f10946;
        if (strictness == null) {
            strictness = Strictness.LEGACY_STRICT;
        }
        c8244.m13775(strictness);
        c8244.f22786 = false;
        return c8244;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC3251 m7340(C8246 c8246) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f10944;
        AbstractC3251 abstractC3251 = (AbstractC3251) concurrentHashMap.get(c8246);
        if (abstractC3251 != null) {
            return abstractC3251;
        }
        ThreadLocal threadLocal = this.f10945;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC3251 abstractC32512 = (AbstractC3251) map.get(c8246);
            if (abstractC32512 != null) {
                return abstractC32512;
            }
            z = false;
        }
        try {
            C3241 c3241 = new C3241();
            map.put(c8246, c3241);
            Iterator it = this.f10941.iterator();
            AbstractC3251 abstractC3251Mo7321 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC3251Mo7321 = ((InterfaceC3249) it.next()).mo7321(this, c8246);
                if (abstractC3251Mo7321 != null) {
                    if (c3241.f10911 != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c3241.f10911 = abstractC3251Mo7321;
                    map.put(c8246, abstractC3251Mo7321);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC3251Mo7321 == null) {
                C4211.m8604(c8246, "GSON (2.13.1) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return abstractC3251Mo7321;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m7341(String str, Type type) {
        boolean z;
        Object objMo7323;
        C8246 c8246 = new C8246(type);
        C8245 c8245 = new C8245(new StringReader(str));
        Strictness strictness = this.f10946;
        c8245.m13815(strictness == null ? Strictness.LEGACY_STRICT : strictness);
        Strictness strictness2 = c8245.f22810;
        if (strictness != null) {
            c8245.f22810 = strictness;
        } else if (strictness2 == Strictness.LEGACY_STRICT) {
            c8245.m13815(Strictness.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        c8245.m13787();
                        z = false;
                    } catch (EOFException e) {
                        e = e;
                        z = true;
                    }
                    try {
                        AbstractC3251 abstractC3251M7340 = m7340(c8246);
                        Class cls = c8246.f22815;
                        objMo7323 = abstractC3251M7340.mo7323(c8245);
                        Class clsM7317 = AbstractC3221.m7317(cls);
                        if (objMo7323 != null && !clsM7317.isInstance(objMo7323)) {
                            throw new ClassCastException("Type adapter '" + abstractC3251M7340 + "' returned wrong type; requested " + cls + " but got instance of " + objMo7323.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                    } catch (EOFException e2) {
                        e = e2;
                        if (!z) {
                            throw new JsonSyntaxException(e);
                        }
                        c8245.m13815(strictness2);
                        objMo7323 = null;
                    }
                    if (objMo7323 != null) {
                        try {
                            if (c8245.m13787() != JsonToken.END_DOCUMENT) {
                                throw new JsonSyntaxException("JSON document was not fully consumed.");
                            }
                        } catch (MalformedJsonException e3) {
                            throw new JsonSyntaxException(e3);
                        } catch (IOException e4) {
                            throw new JsonIOException(e4);
                        }
                    }
                    return objMo7323;
                } finally {
                    c8245.m13815(strictness2);
                }
            } catch (AssertionError e5) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e5.getMessage(), e5);
            }
        } catch (IOException e6) {
            throw new JsonSyntaxException(e6);
        } catch (IllegalStateException e7) {
            throw new JsonSyntaxException(e7);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3253() {
        C3222 c3222 = C3222.f10872;
        Map map = Collections.EMPTY_MAP;
        LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        List list = Collections.EMPTY_LIST;
        this(c3222, f10937, map, true, f10939, null, true, longSerializationPolicy, list, list, list, f10936, f10938, list);
    }
}
