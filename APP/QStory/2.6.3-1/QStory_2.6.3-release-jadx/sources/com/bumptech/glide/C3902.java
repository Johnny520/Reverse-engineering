package com.bumptech.glide;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p049.AbstractC7162;
import p049.AbstractC7166;
import p303.AbstractC9234;
import p408.C9927;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f10171;

    public C3902(int i) {
        switch (i) {
            case 1:
                this.f10171 = new HashMap();
                new HashMap();
                break;
            case 2:
                this.f10171 = new HashMap();
                break;
            case 3:
                this.f10171 = new HashMap();
                break;
            default:
                this.f10171 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static JSONObject m7445(Method method) {
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
            jSONObject.put(AbstractC9234.m14531(786), name2);
            jSONObject.put(AbstractC9234.m14531(785), name);
            jSONObject.put(AbstractC9234.m14532("喵喵呜喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵~喵喵喵呜呜呜呜呜"), jSONArray);
            jSONObject.put(AbstractC9234.m14531(787), method.getReturnType().getName());
            return jSONObject;
        } catch (Exception e) {
            C6755.m11872(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Method[] m7446(String str) {
        C9927 c9927 = new C9927();
        c9927.m15246(str);
        return (Method[]) c9927.m15249().toArray(new Method[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m7447(Method method, String str) {
        this.f10171.put(str, method);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m7448(JSONObject jSONObject) {
        for (String str : jSONObject.keySet()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            String string = jSONObject2.getString(AbstractC9234.m14531(785));
            String string2 = jSONObject2.getString(AbstractC9234.m14531(786));
            String string3 = jSONObject2.getString(AbstractC9234.m14531(787));
            JSONArray jSONArray = jSONObject2.getJSONArray(AbstractC9234.m14532("喵喵呜喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵~喵喵喵呜呜呜呜呜"));
            int size = jSONArray.size();
            Class[] clsArr = new Class[size];
            for (int i = 0; i < size; i++) {
                clsArr[i] = AbstractC7166.m12425(jSONArray.getString(i));
            }
            this.f10171.put(str, AbstractC7162.m12409(string2, string, AbstractC7166.m12425(string3), clsArr));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Method m7449(String str) {
        return (Method) this.f10171.get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public JSONObject m7450() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.f10171.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), m7445((Method) entry.getValue()));
            } catch (Exception e) {
                C6755.m11872(e);
                return null;
            }
        }
        return jSONObject;
    }
}
