package com.alibaba.fastjson2;

import androidx.collection.C0276;
import com.alibaba.fastjson2.reader.C2801;
import com.alibaba.fastjson2.reader.InterfaceC2787;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p291.C8532;
import p291.C8547;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2915 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    static JSONArray m6310(String str) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2942 c2942M6331 = AbstractC2932.m6331();
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, c2942M6331);
        try {
            if (abstractC2898M6047.mo6087()) {
                abstractC2898M6047.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            abstractC2898M6047.m6075(jSONArray);
            if (abstractC2898M6047.f9198 != null) {
                abstractC2898M6047.m6137(jSONArray);
            }
            if (abstractC2898M6047.f9191 != 26 && (c2942M6331.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
            }
            abstractC2898M6047.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                abstractC2898M6047.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    static Object m6311(String str, Class cls) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2801 c2801M6329 = AbstractC2932.m6329();
        C2942 c2942 = new C2942(c2801M6329);
        long j = JSONReader$Feature.FieldBased.mask;
        InterfaceC2787 interfaceC2787M5588 = c2801M6329.m5588(cls, false);
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, c2942);
        try {
            Object objMo5418 = interfaceC2787M5588.mo5418(abstractC2898M6047, cls, null, 0L);
            if (abstractC2898M6047.f9198 != null) {
                abstractC2898M6047.m6137(objMo5418);
            }
            if (abstractC2898M6047.f9191 != 26 && (c2942.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
            }
            abstractC2898M6047.close();
            return objMo5418;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    static Object m6312(String str, AbstractC2906 abstractC2906, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2942 c2942M6330 = AbstractC2932.m6330(jSONReader$FeatureArr);
        Type type = abstractC2906.f9252;
        InterfaceC2787 interfaceC2787M5588 = ((C2801) c2942M6330.f9316).m5588(type, (c2942M6330.f9318 & JSONReader$Feature.FieldBased.mask) != 0);
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, c2942M6330);
        try {
            Object objMo5418 = interfaceC2787M5588.mo5418(abstractC2898M6047, type, null, 0L);
            if (abstractC2898M6047.f9198 != null) {
                abstractC2898M6047.m6137(objMo5418);
            }
            if (abstractC2898M6047.f9191 != 26 && (c2942M6330.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
            }
            abstractC2898M6047.close();
            return objMo5418;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    static Object m6313(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) throws IOException {
        C2894 c2894;
        Object objMo5418;
        Object obj2;
        if (obj != null) {
            if (obj instanceof JSONObject) {
                return obj;
            }
            if (obj instanceof JSONArray) {
                return obj;
            }
            if (jSONWriter$FeatureArr == null) {
                String str = AbstractC2932.f9287;
                c2894 = new C2894(AbstractC2932.f9292);
            } else {
                String str2 = AbstractC2932.f9287;
                c2894 = new C2894(AbstractC2932.f9292, jSONWriter$FeatureArr);
            }
            Class<?> cls = obj.getClass();
            InterfaceC8531 interfaceC8531M5981 = c2894.m5981(cls, cls);
            if (interfaceC8531M5981 instanceof C8532) {
                JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.ReferenceDetection;
                long j = c2894.f9151;
                if ((jSONWriter$Feature.mask & j) == 0) {
                    C8532 c8532 = (C8532) interfaceC8531M5981;
                    if ((c8532.f23727 & JSONWriter$Feature.WriteClassName.mask) == 0) {
                        return c8532.mo14073(obj, j);
                    }
                }
            }
            try {
                AbstractC2896 abstractC2896M6011 = AbstractC2896.m6011(c2894);
                try {
                    interfaceC8531M5981.mo5634(abstractC2896M6011, obj, null, null, c2894.f9151);
                    String string = abstractC2896M6011.toString();
                    abstractC2896M6011.close();
                    if (string != null && !string.isEmpty()) {
                        C2801 c2801M6329 = AbstractC2932.m6329();
                        C2942 c2942 = new C2942(c2801M6329);
                        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(string, c2942);
                        try {
                            char c = abstractC2898M6047.f9191;
                            if ((c2942.f9318 & JSONReader$Feature.UseNativeObject.mask) == 0 && (c == '{' || c == '[')) {
                                if (c == '{') {
                                    JSONObject jSONObject = new JSONObject();
                                    abstractC2898M6047.mo6074(jSONObject, 0L);
                                    obj2 = jSONObject;
                                } else {
                                    JSONArray jSONArray = new JSONArray();
                                    abstractC2898M6047.m6075(jSONArray);
                                    obj2 = jSONArray;
                                }
                                objMo5418 = obj2;
                                if (abstractC2898M6047.f9198 != null) {
                                    abstractC2898M6047.m6137(obj2);
                                    objMo5418 = obj2;
                                }
                            } else {
                                objMo5418 = c2801M6329.m5588(Object.class, false).mo5418(abstractC2898M6047, null, null, 0L);
                            }
                            if (abstractC2898M6047.f9191 != 26 && (c2942.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
                            }
                            abstractC2898M6047.close();
                            return objMo5418;
                        } finally {
                        }
                    }
                } finally {
                }
            } catch (NullPointerException | NumberFormatException e) {
                C0276.m842("toJSONString error", e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    static String m6314(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) throws IOException {
        C2894 c2894 = new C2894(AbstractC2932.f9292, jSONWriter$FeatureArr);
        AbstractC2896 abstractC2896M6011 = AbstractC2896.m6011(c2894);
        try {
            if (obj == null) {
                abstractC2896M6011.mo5922();
            } else {
                abstractC2896M6011.f9166 = obj;
                abstractC2896M6011.f9164 = C2893.f9141;
                Class<?> cls = obj.getClass();
                c2894.f9152.m14087(cls, cls, (c2894.f9151 & JSONWriter$Feature.FieldBased.mask) != 0).mo5634(abstractC2896M6011, obj, null, null, 0L);
            }
            String string = abstractC2896M6011.toString();
            abstractC2896M6011.close();
            return string;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    static JSONArray m6315(String str, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2942 c2942M6330 = AbstractC2932.m6330(jSONReader$FeatureArr);
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, c2942M6330);
        try {
            if (abstractC2898M6047.mo6087()) {
                abstractC2898M6047.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            abstractC2898M6047.m6075(jSONArray);
            if (abstractC2898M6047.f9198 != null) {
                abstractC2898M6047.m6137(jSONArray);
            }
            if (abstractC2898M6047.f9191 != 26 && (c2942M6330.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
            }
            abstractC2898M6047.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                abstractC2898M6047.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    static JSONObject m6316(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2942 c2942M6331 = AbstractC2932.m6331();
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, c2942M6331);
        try {
            if (abstractC2898M6047.mo6087()) {
                abstractC2898M6047.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            abstractC2898M6047.mo6074(jSONObject, 0L);
            if (abstractC2898M6047.f9198 != null) {
                abstractC2898M6047.m6137(jSONObject);
            }
            if (abstractC2898M6047.f9191 != 26 && (c2942M6331.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
            }
            abstractC2898M6047.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                abstractC2898M6047.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    static String m6317(Object obj) {
        Object obj2;
        C8547 c8547 = AbstractC2932.f9292;
        C2894 c2894 = new C2894(c8547);
        try {
            AbstractC2896 abstractC2896M6011 = AbstractC2896.m6011(c2894);
            try {
                try {
                    if (obj == null) {
                        abstractC2896M6011.mo5922();
                    } else {
                        abstractC2896M6011.f9166 = obj;
                        abstractC2896M6011.f9164 = C2893.f9141;
                        Class<?> cls = obj.getClass();
                        if (cls != JSONObject.class || c2894.f9151 != 0) {
                            long j = JSONWriter$Feature.FieldBased.mask;
                            obj2 = obj;
                            try {
                                c8547.m14087(cls, cls, 0 != 0).mo5634(abstractC2896M6011, obj2, null, null, 0L);
                                String string = abstractC2896M6011.toString();
                                abstractC2896M6011.close();
                                return string;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    abstractC2896M6011.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        abstractC2896M6011.mo5951((JSONObject) obj);
                    }
                    obj2 = obj;
                    String string2 = abstractC2896M6011.toString();
                    abstractC2896M6011.close();
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
    static JSONObject m6318(InputStream inputStream) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        if (inputStream == null) {
            return null;
        }
        C2942 c2942M6331 = AbstractC2932.m6331();
        boolean[] zArr = AbstractC2898.f9177;
        C2901 c2901 = new C2901(c2942M6331, inputStream);
        try {
            if (c2901.mo6087()) {
                c2901.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            c2901.mo6074(jSONObject, 0L);
            if (c2901.f9198 != null) {
                c2901.m6137(jSONObject);
            }
            if (c2901.f9191 != 26 && (c2942M6331.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(c2901.mo6124("input not end"));
            }
            c2901.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                c2901.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
