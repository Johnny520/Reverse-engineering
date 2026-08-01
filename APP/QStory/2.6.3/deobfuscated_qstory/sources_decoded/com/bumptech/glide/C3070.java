package com.bumptech.glide;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p033.AbstractC6333;
import p033.AbstractC6337;
import p287.AbstractC8405;
import p392.C9098;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3070 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f9826;

    public C3070(int i) {
        switch (i) {
            case 1:
                this.f9826 = new HashMap();
                new HashMap();
                break;
            case 2:
                this.f9826 = new HashMap();
                break;
            case 3:
                this.f9826 = new HashMap();
                break;
            default:
                this.f9826 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static JSONObject m6885(Method method) {
        try {
            method.setAccessible(true);
            JSONObject jSONObject = new JSONObject();
            String name = method.getName();
            String name2 = method.getDeclaringClass().getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            JSONArray jSONArray = new JSONArray();
            for (Class<?> cls : parameterTypes) {
                jSONArray.add(cls.getName());
            }
            jSONObject.put(AbstractC8405.m13972(786), name2); /* decoded: m13972(786)=DeclareClass */
            jSONObject.put(AbstractC8405.m13972(785), name); /* decoded: m13972(785)=MethodName */
            jSONObject.put(AbstractC8405.m13973("喵喵呜喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵~喵喵喵呜呜呜呜呜"), jSONArray); /* decoded-inline: Params */
            jSONObject.put(AbstractC8405.m13972(787), method.getReturnType().getName()); /* decoded: m13972(787)=ReturnType */
            return jSONObject;
        } catch (Exception e) {
            C5925.m11313(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Method[] m6886(String str) {
        C9098 c9098 = new C9098();
        c9098.m14687(str);
        return (Method[]) c9098.m14690().toArray(new Method[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m6887(Method method, String str) {
        this.f9826.put(str, method);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m6888(JSONObject jSONObject) {
        for (String str : jSONObject.keySet()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            String string = jSONObject2.getString(AbstractC8405.m13972(785)); /* decoded: m13972(785)=MethodName */
            String string2 = jSONObject2.getString(AbstractC8405.m13972(786)); /* decoded: m13972(786)=DeclareClass */
            String string3 = jSONObject2.getString(AbstractC8405.m13972(787)); /* decoded: m13972(787)=ReturnType */
            JSONArray jSONArray = jSONObject2.getJSONArray(AbstractC8405.m13973("喵喵呜喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵~喵喵喵呜呜呜呜呜")); /* decoded-inline: Params */
            int size = jSONArray.size();
            Class[] clsArr = new Class[size];
            for (int i = 0; i < size; i++) {
                clsArr[i] = AbstractC6337.m11866(jSONArray.getString(i));
            }
            this.f9826.put(str, AbstractC6333.m11850(string2, string, AbstractC6337.m11866(string3), clsArr));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Method m6889(String str) {
        return (Method) this.f9826.get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public JSONObject m6890() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.f9826.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), m6885((Method) entry.getValue()));
            } catch (Exception e) {
                C5925.m11313(e);
                return null;
            }
        }
        return jSONObject;
    }
}
