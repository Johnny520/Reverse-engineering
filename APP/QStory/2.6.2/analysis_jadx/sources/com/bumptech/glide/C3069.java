package com.bumptech.glide;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p032.AbstractC6314;
import p032.AbstractC6318;
import p394.C9127;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3069 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f9821;

    public C3069(int i) {
        switch (i) {
            case 1:
                this.f9821 = new HashMap();
                new HashMap();
                break;
            case 2:
                this.f9821 = new HashMap();
                break;
            case 3:
                this.f9821 = new HashMap();
                break;
            default:
                this.f9821 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static JSONObject m6898(Method method) {
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
            jSONObject.put(AbstractC3056.m6668(-3937637020764210599L), name2);
            jSONObject.put(AbstractC3056.m6668(-3937637145318262183L), name);
            jSONObject.put(AbstractC3056.m6668(-3937636986404472231L), jSONArray);
            jSONObject.put(AbstractC3056.m6668(-3937636973519570343L), method.getReturnType().getName());
            return jSONObject;
        } catch (Exception e) {
            C5919.m11252(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Method[] m6899(String str) {
        C9127 c9127 = new C9127();
        c9127.m14688(str);
        return (Method[]) c9127.m14695().toArray(new Method[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m6900(Method method, String str) {
        this.f9821.put(str, method);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m6901(JSONObject jSONObject) {
        for (String str : jSONObject.keySet()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            String string = jSONObject2.getString(AbstractC3056.m6668(-3937637145318262183L));
            String string2 = jSONObject2.getString(AbstractC3056.m6668(-3937637020764210599L));
            String string3 = jSONObject2.getString(AbstractC3056.m6668(-3937636973519570343L));
            JSONArray jSONArray = jSONObject2.getJSONArray(AbstractC3056.m6668(-3937636986404472231L));
            int size = jSONArray.size();
            Class[] clsArr = new Class[size];
            for (int i = 0; i < size; i++) {
                clsArr[i] = AbstractC6318.m11838(jSONArray.getString(i));
            }
            this.f9821.put(str, AbstractC6314.m11822(string2, string, AbstractC6318.m11838(string3), clsArr));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Method m6902(String str) {
        return (Method) this.f9821.get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public JSONObject m6903() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.f9821.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), m6898((Method) entry.getValue()));
            } catch (Exception e) {
                C5919.m11252(e);
                return null;
            }
        }
        return jSONObject;
    }
}
