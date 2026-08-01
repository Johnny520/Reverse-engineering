package com.google.gson;

import com.google.gson.internal.AbstractC4053;
import com.google.gson.internal.C4054;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import io.ktor.util.C5043;
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
import p248.C8894;
import p275.C9073;
import p275.C9074;
import p276.C9075;
import p286.AbstractC9100;
import p287.AbstractC9156;
import p287.C9108;
import p287.C9124;
import p287.C9134;
import p287.C9136;
import p287.C9138;
import p287.C9147;
import p287.C9149;
import p287.C9150;
import p287.C9153;
import p287.C9161;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4085 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f11285;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f11286;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9153 f11287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8894 f11288;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f11289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ThreadLocal f11290;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Strictness f11291;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4077 f11292;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f11293;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f11294;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final List f11295;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C4077 f11284 = C4077.f11260;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final FieldNamingPolicy f11282 = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final ToNumberPolicy f11281 = ToNumberPolicy.DOUBLE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final ToNumberPolicy f11283 = ToNumberPolicy.LAZILY_PARSED_NUMBER;

    public C4085(C4054 c4054, InterfaceC4078 interfaceC4078, Map map, boolean z, C4077 c4077, Strictness strictness, boolean z2, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3, InterfaceC4079 interfaceC4079, InterfaceC4079 interfaceC40792, List list4) {
        this.f11290 = new ThreadLocal();
        this.f11289 = new ConcurrentHashMap();
        C8894 c8894 = new C8894(map, z2, list4);
        this.f11288 = c8894;
        this.f11285 = z;
        this.f11292 = c4077;
        this.f11291 = strictness;
        this.f11294 = list;
        this.f11295 = list2;
        this.f11293 = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC9156.f23309);
        C9149 c9149 = C9138.f23267;
        int i = 1;
        arrayList.add(interfaceC4079 == ToNumberPolicy.DOUBLE ? C9138.f23267 : new C9149(interfaceC4079, i));
        arrayList.add(c4054);
        arrayList.addAll(list3);
        arrayList.add(AbstractC9156.f23329);
        arrayList.add(AbstractC9156.f23331);
        arrayList.add(AbstractC9156.f23314);
        arrayList.add(AbstractC9156.f23313);
        arrayList.add(AbstractC9156.f23312);
        AbstractC4083 c4075 = longSerializationPolicy == LongSerializationPolicy.DEFAULT ? AbstractC9156.f23332 : new C4075();
        arrayList.add(new C9161(Long.TYPE, Long.class, c4075));
        int i2 = 0;
        arrayList.add(new C9161(Double.TYPE, Double.class, new C4076(i2)));
        arrayList.add(new C9161(Float.TYPE, Float.class, new C4076(i)));
        C9149 c91492 = C9147.f23288;
        arrayList.add(interfaceC40792 == ToNumberPolicy.LAZILY_PARSED_NUMBER ? C9147.f23288 : new C9149(new C9147(interfaceC40792), i2));
        arrayList.add(AbstractC9156.f23330);
        arrayList.add(AbstractC9156.f23334);
        arrayList.add(new C9108(AtomicLong.class, new C4074(c4075, i2).m7892(), i2));
        arrayList.add(new C9108(AtomicLongArray.class, new C4074(c4075, i).m7892(), i2));
        arrayList.add(AbstractC9156.f23335);
        arrayList.add(AbstractC9156.f23333);
        arrayList.add(AbstractC9156.f23326);
        arrayList.add(AbstractC9156.f23327);
        arrayList.add(new C9108(BigDecimal.class, AbstractC9156.f23325, i2));
        arrayList.add(new C9108(BigInteger.class, AbstractC9156.f23324, i2));
        arrayList.add(new C9108(LazilyParsedNumber.class, AbstractC9156.f23328, i2));
        arrayList.add(AbstractC9156.f23319);
        arrayList.add(AbstractC9156.f23318);
        arrayList.add(AbstractC9156.f23323);
        arrayList.add(AbstractC9156.f23320);
        arrayList.add(AbstractC9156.f23311);
        arrayList.add(AbstractC9156.f23322);
        arrayList.add(AbstractC9156.f23316);
        arrayList.add(C9150.f23296);
        arrayList.add(AbstractC9156.f23321);
        if (AbstractC9100.f23239) {
            arrayList.add(AbstractC9100.f23235);
            arrayList.add(AbstractC9100.f23236);
            arrayList.add(AbstractC9100.f23234);
        }
        arrayList.add(C9136.f23264);
        arrayList.add(AbstractC9156.f23317);
        arrayList.add(new C9134(c8894, i2));
        arrayList.add(new C9134(c8894, i));
        C9153 c9153 = new C9153(c8894);
        this.f11287 = c9153;
        arrayList.add(c9153);
        arrayList.add(AbstractC9156.f23308);
        arrayList.add(new C9124(c8894, interfaceC4078, c4054, c9153, list4));
        this.f11286 = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7895(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f11286 + ",instanceCreators:" + this.f11288 + "}";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7896(Object obj, Class cls, C9073 c9073) {
        AbstractC4083 abstractC4083M7899 = m7899(new C9075(cls));
        Strictness strictness = c9073.f23135;
        Strictness strictness2 = this.f11291;
        if (strictness2 != null) {
            c9073.f23135 = strictness2;
        } else if (strictness == Strictness.LEGACY_STRICT) {
            c9073.m14334(Strictness.LENIENT);
        }
        boolean z = c9073.f23136;
        boolean z2 = c9073.f23131;
        c9073.f23136 = this.f11285;
        c9073.f23131 = false;
        try {
            try {
                try {
                    abstractC4083M7899.mo7881(c9073, obj);
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e2.getMessage(), e2);
            }
        } finally {
            c9073.m14334(strictness);
            c9073.f23136 = z;
            c9073.f23131 = z2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String m7897(Object obj) {
        Class cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            m7896(obj, cls, m7898(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9073 m7898(Writer writer) {
        C9073 c9073 = new C9073(writer);
        c9073.m14338(this.f11292);
        c9073.f23136 = this.f11285;
        Strictness strictness = this.f11291;
        if (strictness == null) {
            strictness = Strictness.LEGACY_STRICT;
        }
        c9073.m14334(strictness);
        c9073.f23131 = false;
        return c9073;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4083 m7899(C9075 c9075) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f11289;
        AbstractC4083 abstractC4083 = (AbstractC4083) concurrentHashMap.get(c9075);
        if (abstractC4083 != null) {
            return abstractC4083;
        }
        ThreadLocal threadLocal = this.f11290;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC4083 abstractC40832 = (AbstractC4083) map.get(c9075);
            if (abstractC40832 != null) {
                return abstractC40832;
            }
            z = false;
        }
        try {
            C4073 c4073 = new C4073();
            map.put(c9075, c4073);
            Iterator it = this.f11286.iterator();
            AbstractC4083 abstractC4083Mo7880 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC4083Mo7880 = ((InterfaceC4081) it.next()).mo7880(this, c9075);
                if (abstractC4083Mo7880 != null) {
                    if (c4073.f11256 != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c4073.f11256 = abstractC4083Mo7880;
                    map.put(c9075, abstractC4083Mo7880);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC4083Mo7880 == null) {
                C5043.m9163(c9075, "GSON (2.13.1) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return abstractC4083Mo7880;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m7900(String str, Type type) {
        boolean z;
        Object objMo7882;
        C9075 c9075 = new C9075(type);
        C9074 c9074 = new C9074(new StringReader(str));
        Strictness strictness = this.f11291;
        c9074.m14374(strictness == null ? Strictness.LEGACY_STRICT : strictness);
        Strictness strictness2 = c9074.f23155;
        if (strictness != null) {
            c9074.f23155 = strictness;
        } else if (strictness2 == Strictness.LEGACY_STRICT) {
            c9074.m14374(Strictness.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        c9074.m14346();
                        z = false;
                    } catch (EOFException e) {
                        e = e;
                        z = true;
                    }
                    try {
                        AbstractC4083 abstractC4083M7899 = m7899(c9075);
                        Class cls = c9075.f23160;
                        objMo7882 = abstractC4083M7899.mo7882(c9074);
                        Class clsM7876 = AbstractC4053.m7876(cls);
                        if (objMo7882 != null && !clsM7876.isInstance(objMo7882)) {
                            throw new ClassCastException("Type adapter '" + abstractC4083M7899 + "' returned wrong type; requested " + cls + " but got instance of " + objMo7882.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                    } catch (EOFException e2) {
                        e = e2;
                        if (!z) {
                            throw new JsonSyntaxException(e);
                        }
                        c9074.m14374(strictness2);
                        objMo7882 = null;
                    }
                    if (objMo7882 != null) {
                        try {
                            if (c9074.m14346() != JsonToken.END_DOCUMENT) {
                                throw new JsonSyntaxException("JSON document was not fully consumed.");
                            }
                        } catch (MalformedJsonException e3) {
                            throw new JsonSyntaxException(e3);
                        } catch (IOException e4) {
                            throw new JsonIOException(e4);
                        }
                    }
                    return objMo7882;
                } finally {
                    c9074.m14374(strictness2);
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
    public C4085() {
        C4054 c4054 = C4054.f11217;
        Map map = Collections.EMPTY_MAP;
        LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        List list = Collections.EMPTY_LIST;
        this(c4054, f11282, map, true, f11284, null, true, longSerializationPolicy, list, list, list, f11281, f11283, list);
    }
}
