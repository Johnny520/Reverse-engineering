package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.function.Consumer;
import p278.C8362;
import p278.C8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2776 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f8477;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2801 f8478;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Type f8479;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Class f8480;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C8364 f8481;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f8482;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ String f8483;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ String[] f8484;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8362 f8485;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f8486;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8487 = 1;

    public /* synthetic */ C2776(C2775 c2775, C8362 c8362, long j, Class cls, Type type, String str, String[] strArr, C8364 c8364, LinkedHashMap linkedHashMap, C2801 c2801) {
        this.f8477 = c2775;
        this.f8485 = c8362;
        this.f8486 = j;
        this.f8480 = cls;
        this.f8479 = type;
        this.f8483 = str;
        this.f8484 = strArr;
        this.f8481 = c8364;
        this.f8482 = linkedHashMap;
        this.f8478 = c2801;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f8487;
        long j = this.f8486;
        Object obj2 = this.f8477;
        switch (i) {
            case 0:
                String str = (String) obj2;
                Field field = (Field) obj;
                C8362 c8362 = this.f8485;
                c8362.m13848();
                c8362.f23045 = (field.getModifiers() & 1) == 0 && (JSONReader$Feature.FieldBased.mask & j) == 0;
                c8362.f23046 = j | c8362.f23046;
                c8362.f23049 = this.f8483;
                C2775.m5547(this.f8480, this.f8479, str, this.f8484, c8362, field, this.f8482, this.f8478);
                if (c8362.f23052) {
                    String name = c8362.f23050;
                    if (name == null || name.isEmpty()) {
                        name = field.getName();
                    }
                    C8364 c8364 = this.f8481;
                    String str2 = c8364.f23097;
                    if (str2 != null) {
                        JSONObject object = JSONObject.parseObject(str2);
                        object.getJSONArray("required").add(name);
                        c8364.f23097 = object.toString();
                    } else {
                        c8364.f23097 = JSONObject.of("required", (Object) JSONArray.of((Object) name)).toString();
                    }
                }
                break;
            default:
                C8362 c83622 = this.f8485;
                c83622.m13848();
                c83622.f23046 |= j;
                ((C2775) obj2).m5558(this.f8480, this.f8479, this.f8483, this.f8484, this.f8481, c83622, (Method) obj, this.f8482, this.f8478);
                break;
        }
    }

    public /* synthetic */ C2776(C2775 c2775, C8362 c8362, long j, String str, Class cls, Type type, String str2, String[] strArr, LinkedHashMap linkedHashMap, C2801 c2801, C8364 c8364) {
        this.f8485 = c8362;
        this.f8486 = j;
        this.f8483 = str;
        this.f8480 = cls;
        this.f8479 = type;
        this.f8477 = str2;
        this.f8484 = strArr;
        this.f8482 = linkedHashMap;
        this.f8478 = c2801;
        this.f8481 = c8364;
    }
}
