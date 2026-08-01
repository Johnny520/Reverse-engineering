package com.alibaba.fastjson2;

import androidx.collection.C0276;
import com.alibaba.fastjson2.reader.C2802;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p291.C8524;
import p291.C8539;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2916 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    static JSONArray m6368(String str) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2943 c2943M6389 = AbstractC2933.m6389();
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(str, c2943M6389);
        try {
            if (abstractC2899M6092.mo6133()) {
                abstractC2899M6092.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            abstractC2899M6092.m6121(jSONArray);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(jSONArray);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943M6389.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                abstractC2899M6092.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    static Object m6369(String str, Class cls) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2802 c2802M6387 = AbstractC2933.m6387();
        C2943 c2943 = new C2943(c2802M6387);
        long j = JSONReader$Feature.FieldBased.mask;
        InterfaceC2788 interfaceC2788M5633 = c2802M6387.m5633(cls, false);
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(str, c2943);
        try {
            Object objMo5463 = interfaceC2788M5633.mo5463(abstractC2899M6092, cls, null, 0L);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(objMo5463);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
            return objMo5463;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    static Object m6370(String str, AbstractC2907 abstractC2907, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2943 c2943M6388 = AbstractC2933.m6388(jSONReader$FeatureArr);
        Type type = abstractC2907.f9254;
        InterfaceC2788 interfaceC2788M5633 = ((C2802) c2943M6388.f9318).m5633(type, (c2943M6388.f9320 & JSONReader$Feature.FieldBased.mask) != 0);
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(str, c2943M6388);
        try {
            Object objMo5463 = interfaceC2788M5633.mo5463(abstractC2899M6092, type, null, 0L);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(objMo5463);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943M6388.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
            return objMo5463;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    static Object m6371(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) throws IOException {
        C2895 c2895;
        Object objMo5463;
        Object obj2;
        if (obj != null) {
            if (obj instanceof JSONObject) {
                return obj;
            }
            if (obj instanceof JSONArray) {
                return obj;
            }
            if (jSONWriter$FeatureArr == null) {
                String str = AbstractC2933.f9289;
                c2895 = new C2895(AbstractC2933.f9294);
            } else {
                String str2 = AbstractC2933.f9289;
                c2895 = new C2895(AbstractC2933.f9294, jSONWriter$FeatureArr);
            }
            Class<?> cls = obj.getClass();
            InterfaceC8523 interfaceC8523M6026 = c2895.m6026(cls, cls);
            if (interfaceC8523M6026 instanceof C8524) {
                JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.ReferenceDetection;
                long j = c2895.f9153;
                if ((jSONWriter$Feature.mask & j) == 0) {
                    C8524 c8524 = (C8524) interfaceC8523M6026;
                    if ((c8524.f23718 & JSONWriter$Feature.WriteClassName.mask) == 0) {
                        return c8524.mo14092(obj, j);
                    }
                }
            }
            try {
                AbstractC2897 abstractC2897M6056 = AbstractC2897.m6056(c2895);
                try {
                    interfaceC8523M6026.mo5679(abstractC2897M6056, obj, null, null, c2895.f9153);
                    String string = abstractC2897M6056.toString();
                    abstractC2897M6056.close();
                    if (string != null && !string.isEmpty()) {
                        C2802 c2802M6387 = AbstractC2933.m6387();
                        C2943 c2943 = new C2943(c2802M6387);
                        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(string, c2943);
                        try {
                            char c = abstractC2899M6092.f9193;
                            if ((c2943.f9320 & JSONReader$Feature.UseNativeObject.mask) == 0 && (c == '{' || c == '[')) {
                                if (c == '{') {
                                    JSONObject jSONObject = new JSONObject();
                                    abstractC2899M6092.mo6120(jSONObject, 0L);
                                    obj2 = jSONObject;
                                } else {
                                    JSONArray jSONArray = new JSONArray();
                                    abstractC2899M6092.m6121(jSONArray);
                                    obj2 = jSONArray;
                                }
                                objMo5463 = obj2;
                                if (abstractC2899M6092.f9200 != null) {
                                    abstractC2899M6092.m6182(obj2);
                                    objMo5463 = obj2;
                                }
                            } else {
                                objMo5463 = c2802M6387.m5633(Object.class, false).mo5463(abstractC2899M6092, null, null, 0L);
                            }
                            if (abstractC2899M6092.f9193 != 26 && (c2943.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
                            }
                            abstractC2899M6092.close();
                            return objMo5463;
                        } finally {
                        }
                    }
                } finally {
                }
            } catch (NullPointerException | NumberFormatException e) {
                C0276.m843("toJSONString error", e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    static String m6372(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) throws IOException {
        C2895 c2895 = new C2895(AbstractC2933.f9294, jSONWriter$FeatureArr);
        AbstractC2897 abstractC2897M6056 = AbstractC2897.m6056(c2895);
        try {
            if (obj == null) {
                abstractC2897M6056.mo5967();
            } else {
                abstractC2897M6056.f9168 = obj;
                abstractC2897M6056.f9166 = C2894.f9143;
                Class<?> cls = obj.getClass();
                c2895.f9154.m14106(cls, cls, (c2895.f9153 & JSONWriter$Feature.FieldBased.mask) != 0).mo5679(abstractC2897M6056, obj, null, null, 0L);
            }
            String string = abstractC2897M6056.toString();
            abstractC2897M6056.close();
            return string;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    static JSONArray m6373(String str, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2943 c2943M6388 = AbstractC2933.m6388(jSONReader$FeatureArr);
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(str, c2943M6388);
        try {
            if (abstractC2899M6092.mo6133()) {
                abstractC2899M6092.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            abstractC2899M6092.m6121(jSONArray);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(jSONArray);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943M6388.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                abstractC2899M6092.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    static JSONObject m6374(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2943 c2943M6389 = AbstractC2933.m6389();
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(str, c2943M6389);
        try {
            if (abstractC2899M6092.mo6133()) {
                abstractC2899M6092.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            abstractC2899M6092.mo6120(jSONObject, 0L);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(jSONObject);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943M6389.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                abstractC2899M6092.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    static String m6375(Object obj) {
        Object obj2;
        C8539 c8539 = AbstractC2933.f9294;
        C2895 c2895 = new C2895(c8539);
        try {
            AbstractC2897 abstractC2897M6056 = AbstractC2897.m6056(c2895);
            try {
                try {
                    if (obj == null) {
                        abstractC2897M6056.mo5967();
                    } else {
                        abstractC2897M6056.f9168 = obj;
                        abstractC2897M6056.f9166 = C2894.f9143;
                        Class<?> cls = obj.getClass();
                        if (cls != JSONObject.class || c2895.f9153 != 0) {
                            long j = JSONWriter$Feature.FieldBased.mask;
                            obj2 = obj;
                            try {
                                c8539.m14106(cls, cls, 0 != 0).mo5679(abstractC2897M6056, obj2, null, null, 0L);
                                String string = abstractC2897M6056.toString();
                                abstractC2897M6056.close();
                                return string;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    abstractC2897M6056.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        abstractC2897M6056.mo5996((JSONObject) obj);
                    }
                    obj2 = obj;
                    String string2 = abstractC2897M6056.toString();
                    abstractC2897M6056.close();
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
    static JSONObject m6376(InputStream inputStream) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        if (inputStream == null) {
            return null;
        }
        C2943 c2943M6389 = AbstractC2933.m6389();
        boolean[] zArr = AbstractC2899.f9179;
        C2902 c2902 = new C2902(c2943M6389, inputStream);
        try {
            if (c2902.mo6133()) {
                c2902.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            c2902.mo6120(jSONObject, 0L);
            if (c2902.f9200 != null) {
                c2902.m6182(jSONObject);
            }
            if (c2902.f9193 != 26 && (c2943M6389.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(c2902.mo6170("input not end"));
            }
            c2902.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                c2902.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
