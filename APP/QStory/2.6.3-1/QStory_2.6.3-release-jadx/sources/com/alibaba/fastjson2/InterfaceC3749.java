package com.alibaba.fastjson2;

import androidx.collection.C1123;
import com.alibaba.fastjson2.reader.C3635;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p307.C9353;
import p307.C9368;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3749 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    static JSONArray m6928(String str) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C3776 c3776M6949 = AbstractC3766.m6949();
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, c3776M6949);
        try {
            if (abstractC3732M6652.mo6693()) {
                abstractC3732M6652.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            abstractC3732M6652.m6681(jSONArray);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(jSONArray);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776M6949.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                abstractC3732M6652.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    static Object m6929(String str, Class cls) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C3635 c3635M6947 = AbstractC3766.m6947();
        C3776 c3776 = new C3776(c3635M6947);
        long j = JSONReader$Feature.FieldBased.mask;
        InterfaceC3621 interfaceC3621M6193 = c3635M6947.m6193(cls, false);
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, c3776);
        try {
            Object objMo6023 = interfaceC3621M6193.mo6023(abstractC3732M6652, cls, null, 0L);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(objMo6023);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return objMo6023;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    static Object m6930(String str, AbstractC3740 abstractC3740, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C3776 c3776M6948 = AbstractC3766.m6948(jSONReader$FeatureArr);
        Type type = abstractC3740.f9599;
        InterfaceC3621 interfaceC3621M6193 = ((C3635) c3776M6948.f9663).m6193(type, (c3776M6948.f9665 & JSONReader$Feature.FieldBased.mask) != 0);
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, c3776M6948);
        try {
            Object objMo6023 = interfaceC3621M6193.mo6023(abstractC3732M6652, type, null, 0L);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(objMo6023);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776M6948.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return objMo6023;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    static Object m6931(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) throws IOException {
        C3728 c3728;
        Object objMo6023;
        Object obj2;
        if (obj != null) {
            if (obj instanceof JSONObject) {
                return obj;
            }
            if (obj instanceof JSONArray) {
                return obj;
            }
            if (jSONWriter$FeatureArr == null) {
                String str = AbstractC3766.f9634;
                c3728 = new C3728(AbstractC3766.f9639);
            } else {
                String str2 = AbstractC3766.f9634;
                c3728 = new C3728(AbstractC3766.f9639, jSONWriter$FeatureArr);
            }
            Class<?> cls = obj.getClass();
            InterfaceC9352 interfaceC9352M6586 = c3728.m6586(cls, cls);
            if (interfaceC9352M6586 instanceof C9353) {
                JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.ReferenceDetection;
                long j = c3728.f9498;
                if ((jSONWriter$Feature.mask & j) == 0) {
                    C9353 c9353 = (C9353) interfaceC9352M6586;
                    if ((c9353.f24063 & JSONWriter$Feature.WriteClassName.mask) == 0) {
                        return c9353.mo14651(obj, j);
                    }
                }
            }
            try {
                AbstractC3730 abstractC3730M6616 = AbstractC3730.m6616(c3728);
                try {
                    interfaceC9352M6586.mo6239(abstractC3730M6616, obj, null, null, c3728.f9498);
                    String string = abstractC3730M6616.toString();
                    abstractC3730M6616.close();
                    if (string != null && !string.isEmpty()) {
                        C3635 c3635M6947 = AbstractC3766.m6947();
                        C3776 c3776 = new C3776(c3635M6947);
                        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(string, c3776);
                        try {
                            char c = abstractC3732M6652.f9538;
                            if ((c3776.f9665 & JSONReader$Feature.UseNativeObject.mask) == 0 && (c == '{' || c == '[')) {
                                if (c == '{') {
                                    JSONObject jSONObject = new JSONObject();
                                    abstractC3732M6652.mo6680(jSONObject, 0L);
                                    obj2 = jSONObject;
                                } else {
                                    JSONArray jSONArray = new JSONArray();
                                    abstractC3732M6652.m6681(jSONArray);
                                    obj2 = jSONArray;
                                }
                                objMo6023 = obj2;
                                if (abstractC3732M6652.f9545 != null) {
                                    abstractC3732M6652.m6742(obj2);
                                    objMo6023 = obj2;
                                }
                            } else {
                                objMo6023 = c3635M6947.m6193(Object.class, false).mo6023(abstractC3732M6652, null, null, 0L);
                            }
                            if (abstractC3732M6652.f9538 != 26 && (c3776.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
                            }
                            abstractC3732M6652.close();
                            return objMo6023;
                        } finally {
                        }
                    }
                } finally {
                }
            } catch (NullPointerException | NumberFormatException e) {
                C1123.m1403("toJSONString error", e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    static String m6932(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) throws IOException {
        C3728 c3728 = new C3728(AbstractC3766.f9639, jSONWriter$FeatureArr);
        AbstractC3730 abstractC3730M6616 = AbstractC3730.m6616(c3728);
        try {
            if (obj == null) {
                abstractC3730M6616.mo6527();
            } else {
                abstractC3730M6616.f9513 = obj;
                abstractC3730M6616.f9511 = C3727.f9488;
                Class<?> cls = obj.getClass();
                c3728.f9499.m14665(cls, cls, (c3728.f9498 & JSONWriter$Feature.FieldBased.mask) != 0).mo6239(abstractC3730M6616, obj, null, null, 0L);
            }
            String string = abstractC3730M6616.toString();
            abstractC3730M6616.close();
            return string;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    static JSONArray m6933(String str, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C3776 c3776M6948 = AbstractC3766.m6948(jSONReader$FeatureArr);
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, c3776M6948);
        try {
            if (abstractC3732M6652.mo6693()) {
                abstractC3732M6652.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            abstractC3732M6652.m6681(jSONArray);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(jSONArray);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776M6948.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                abstractC3732M6652.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    static JSONObject m6934(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C3776 c3776M6949 = AbstractC3766.m6949();
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, c3776M6949);
        try {
            if (abstractC3732M6652.mo6693()) {
                abstractC3732M6652.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            abstractC3732M6652.mo6680(jSONObject, 0L);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(jSONObject);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776M6949.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                abstractC3732M6652.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    static String m6935(Object obj) {
        Object obj2;
        C9368 c9368 = AbstractC3766.f9639;
        C3728 c3728 = new C3728(c9368);
        try {
            AbstractC3730 abstractC3730M6616 = AbstractC3730.m6616(c3728);
            try {
                try {
                    if (obj == null) {
                        abstractC3730M6616.mo6527();
                    } else {
                        abstractC3730M6616.f9513 = obj;
                        abstractC3730M6616.f9511 = C3727.f9488;
                        Class<?> cls = obj.getClass();
                        if (cls != JSONObject.class || c3728.f9498 != 0) {
                            long j = JSONWriter$Feature.FieldBased.mask;
                            obj2 = obj;
                            try {
                                c9368.m14665(cls, cls, 0 != 0).mo6239(abstractC3730M6616, obj2, null, null, 0L);
                                String string = abstractC3730M6616.toString();
                                abstractC3730M6616.close();
                                return string;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    abstractC3730M6616.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        abstractC3730M6616.mo6556((JSONObject) obj);
                    }
                    obj2 = obj;
                    String string2 = abstractC3730M6616.toString();
                    abstractC3730M6616.close();
                    return string2;
                } catch (Throwable th4) {
                    th = th4;
                    obj2 = obj;
                }
            } catch (NullPointerException e) {
                e = e;
                throw new JSONException("JSON#toJSONString cannot serialize '" + obj2 + "'", e);
            } catch (NumberFormatException e2) {
                e = e2;
                throw new JSONException("JSON#toJSONString cannot serialize '" + obj2 + "'", e);
            }
        } catch (NullPointerException | NumberFormatException e3) {
            e = e3;
            obj2 = obj;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    static JSONObject m6936(InputStream inputStream) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        if (inputStream == null) {
            return null;
        }
        C3776 c3776M6949 = AbstractC3766.m6949();
        boolean[] zArr = AbstractC3732.f9524;
        C3735 c3735 = new C3735(c3776M6949, inputStream);
        try {
            if (c3735.mo6693()) {
                c3735.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            c3735.mo6680(jSONObject, 0L);
            if (c3735.f9545 != null) {
                c3735.m6742(jSONObject);
            }
            if (c3735.f9538 != 26 && (c3776M6949.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(c3735.mo6730("input not end"));
            }
            c3735.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                c3735.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
