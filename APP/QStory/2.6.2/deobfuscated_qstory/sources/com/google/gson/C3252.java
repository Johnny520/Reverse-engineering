package com.google.gson;

import com.google.gson.internal.AbstractC3220;
import com.google.gson.internal.C3221;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import io.ktor.util.C4210;
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
import p232.C8064;
import p259.C8243;
import p259.C8244;
import p260.C8245;
import p270.AbstractC8270;
import p271.AbstractC8326;
import p271.C8278;
import p271.C8294;
import p271.C8304;
import p271.C8306;
import p271.C8308;
import p271.C8317;
import p271.C8319;
import p271.C8320;
import p271.C8323;
import p271.C8331;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3252 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f10935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f10936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8323 f10937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8064 f10938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f10939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ThreadLocal f10940;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Strictness f10941;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3244 f10942;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f10943;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f10944;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final List f10945;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C3244 f10934 = C3244.f10910;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final FieldNamingPolicy f10932 = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final ToNumberPolicy f10931 = ToNumberPolicy.DOUBLE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final ToNumberPolicy f10933 = ToNumberPolicy.LAZILY_PARSED_NUMBER;

    public C3252(C3221 c3221, InterfaceC3245 interfaceC3245, Map map, boolean z, C3244 c3244, Strictness strictness, boolean z2, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3, InterfaceC3246 interfaceC3246, InterfaceC3246 interfaceC32462, List list4) {
        this.f10940 = new ThreadLocal();
        this.f10939 = new ConcurrentHashMap();
        C8064 c8064 = new C8064(map, z2, list4);
        this.f10938 = c8064;
        this.f10935 = z;
        this.f10942 = c3244;
        this.f10941 = strictness;
        this.f10944 = list;
        this.f10945 = list2;
        this.f10943 = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC8326.f22965);
        C8319 c8319 = C8308.f22923;
        int i = 1;
        arrayList.add(interfaceC3246 == ToNumberPolicy.DOUBLE ? C8308.f22923 : new C8319(interfaceC3246, i));
        arrayList.add(c3221);
        arrayList.addAll(list3);
        arrayList.add(AbstractC8326.f22985);
        arrayList.add(AbstractC8326.f22987);
        arrayList.add(AbstractC8326.f22970);
        arrayList.add(AbstractC8326.f22969);
        arrayList.add(AbstractC8326.f22968);
        AbstractC3250 c3242 = longSerializationPolicy == LongSerializationPolicy.DEFAULT ? AbstractC8326.f22988 : new C3242();
        arrayList.add(new C8331(Long.TYPE, Long.class, c3242));
        int i2 = 0;
        arrayList.add(new C8331(Double.TYPE, Double.class, new C3243(i2)));
        arrayList.add(new C8331(Float.TYPE, Float.class, new C3243(i)));
        C8319 c83192 = C8317.f22944;
        arrayList.add(interfaceC32462 == ToNumberPolicy.LAZILY_PARSED_NUMBER ? C8317.f22944 : new C8319(new C8317(interfaceC32462), i2));
        arrayList.add(AbstractC8326.f22986);
        arrayList.add(AbstractC8326.f22990);
        arrayList.add(new C8278(AtomicLong.class, new C3241(c3242, i2).m7346(), i2));
        arrayList.add(new C8278(AtomicLongArray.class, new C3241(c3242, i).m7346(), i2));
        arrayList.add(AbstractC8326.f22991);
        arrayList.add(AbstractC8326.f22989);
        arrayList.add(AbstractC8326.f22982);
        arrayList.add(AbstractC8326.f22983);
        arrayList.add(new C8278(BigDecimal.class, AbstractC8326.f22981, i2));
        arrayList.add(new C8278(BigInteger.class, AbstractC8326.f22980, i2));
        arrayList.add(new C8278(LazilyParsedNumber.class, AbstractC8326.f22984, i2));
        arrayList.add(AbstractC8326.f22975);
        arrayList.add(AbstractC8326.f22974);
        arrayList.add(AbstractC8326.f22979);
        arrayList.add(AbstractC8326.f22976);
        arrayList.add(AbstractC8326.f22967);
        arrayList.add(AbstractC8326.f22978);
        arrayList.add(AbstractC8326.f22972);
        arrayList.add(C8320.f22952);
        arrayList.add(AbstractC8326.f22977);
        if (AbstractC8270.f22895) {
            arrayList.add(AbstractC8270.f22891);
            arrayList.add(AbstractC8270.f22892);
            arrayList.add(AbstractC8270.f22890);
        }
        arrayList.add(C8306.f22920);
        arrayList.add(AbstractC8326.f22973);
        arrayList.add(new C8304(c8064, i2));
        arrayList.add(new C8304(c8064, i));
        C8323 c8323 = new C8323(c8064);
        this.f10937 = c8323;
        arrayList.add(c8323);
        arrayList.add(AbstractC8326.f22964);
        arrayList.add(new C8294(c8064, interfaceC3245, c3221, c8323, list4));
        this.f10936 = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7349(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f10936 + ",instanceCreators:" + this.f10938 + "}";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7350(Object obj, Class cls, C8243 c8243) {
        AbstractC3250 abstractC3250M7353 = m7353(new C8245(cls));
        Strictness strictness = c8243.f22791;
        Strictness strictness2 = this.f10941;
        if (strictness2 != null) {
            c8243.f22791 = strictness2;
        } else if (strictness == Strictness.LEGACY_STRICT) {
            c8243.m13761(Strictness.LENIENT);
        }
        boolean z = c8243.f22792;
        boolean z2 = c8243.f22787;
        c8243.f22792 = this.f10935;
        c8243.f22787 = false;
        try {
            try {
                try {
                    abstractC3250M7353.mo7335(c8243, obj);
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e2.getMessage(), e2);
            }
        } finally {
            c8243.m13761(strictness);
            c8243.f22792 = z;
            c8243.f22787 = z2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String m7351(Object obj) {
        Class cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            m7350(obj, cls, m7352(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8243 m7352(Writer writer) {
        C8243 c8243 = new C8243(writer);
        c8243.m13758(this.f10942);
        c8243.f22792 = this.f10935;
        Strictness strictness = this.f10941;
        if (strictness == null) {
            strictness = Strictness.LEGACY_STRICT;
        }
        c8243.m13761(strictness);
        c8243.f22787 = false;
        return c8243;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC3250 m7353(C8245 c8245) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f10939;
        AbstractC3250 abstractC3250 = (AbstractC3250) concurrentHashMap.get(c8245);
        if (abstractC3250 != null) {
            return abstractC3250;
        }
        ThreadLocal threadLocal = this.f10940;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC3250 abstractC32502 = (AbstractC3250) map.get(c8245);
            if (abstractC32502 != null) {
                return abstractC32502;
            }
            z = false;
        }
        try {
            C3240 c3240 = new C3240();
            map.put(c8245, c3240);
            Iterator it = this.f10936.iterator();
            AbstractC3250 abstractC3250Mo7334 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC3250Mo7334 = ((InterfaceC3248) it.next()).mo7334(this, c8245);
                if (abstractC3250Mo7334 != null) {
                    if (c3240.f10906 != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c3240.f10906 = abstractC3250Mo7334;
                    map.put(c8245, abstractC3250Mo7334);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC3250Mo7334 == null) {
                C4210.m8614(c8245, "GSON (2.13.1) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return abstractC3250Mo7334;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m7354(String str, Type type) {
        boolean z;
        Object objMo7336;
        C8245 c8245 = new C8245(type);
        C8244 c8244 = new C8244(new StringReader(str));
        Strictness strictness = this.f10941;
        c8244.m13798(strictness == null ? Strictness.LEGACY_STRICT : strictness);
        Strictness strictness2 = c8244.f22811;
        if (strictness != null) {
            c8244.f22811 = strictness;
        } else if (strictness2 == Strictness.LEGACY_STRICT) {
            c8244.m13798(Strictness.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        c8244.m13770();
                        z = false;
                    } catch (EOFException e) {
                        e = e;
                        z = true;
                    }
                    try {
                        AbstractC3250 abstractC3250M7353 = m7353(c8245);
                        Class cls = c8245.f22816;
                        objMo7336 = abstractC3250M7353.mo7336(c8244);
                        Class clsM7330 = AbstractC3220.m7330(cls);
                        if (objMo7336 != null && !clsM7330.isInstance(objMo7336)) {
                            throw new ClassCastException("Type adapter '" + abstractC3250M7353 + "' returned wrong type; requested " + cls + " but got instance of " + objMo7336.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                    } catch (EOFException e2) {
                        e = e2;
                        if (!z) {
                            throw new JsonSyntaxException(e);
                        }
                        c8244.m13798(strictness2);
                        objMo7336 = null;
                    }
                    if (objMo7336 != null) {
                        try {
                            if (c8244.m13770() != JsonToken.END_DOCUMENT) {
                                throw new JsonSyntaxException("JSON document was not fully consumed.");
                            }
                        } catch (MalformedJsonException e3) {
                            throw new JsonSyntaxException(e3);
                        } catch (IOException e4) {
                            throw new JsonIOException(e4);
                        }
                    }
                    return objMo7336;
                } finally {
                    c8244.m13798(strictness2);
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
    public C3252() {
        C3221 c3221 = C3221.f10867;
        Map map = Collections.EMPTY_MAP;
        LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        List list = Collections.EMPTY_LIST;
        this(c3221, f10932, map, true, f10934, null, true, longSerializationPolicy, list, list, list, f10931, f10933, list);
    }
}
