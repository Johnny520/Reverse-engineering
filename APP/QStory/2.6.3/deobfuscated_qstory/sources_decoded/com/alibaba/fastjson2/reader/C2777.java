package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.function.Consumer;
import p278.C8363;
import p278.C8365;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2777 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f8479;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2802 f8480;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Type f8481;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Class f8482;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C8365 f8483;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f8484;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ String f8485;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ String[] f8486;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8363 f8487;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f8488;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8489 = 1;

    public /* synthetic */ C2777(C2776 c2776, C8363 c8363, long j, Class cls, Type type, String str, String[] strArr, C8365 c8365, LinkedHashMap linkedHashMap, C2802 c2802) {
        this.f8479 = c2776;
        this.f8487 = c8363;
        this.f8488 = j;
        this.f8482 = cls;
        this.f8481 = type;
        this.f8485 = str;
        this.f8486 = strArr;
        this.f8483 = c8365;
        this.f8484 = linkedHashMap;
        this.f8480 = c2802;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f8489;
        long j = this.f8488;
        Object obj2 = this.f8479;
        switch (i) {
            case 0:
                String str = (String) obj2;
                Field field = (Field) obj;
                C8363 c8363 = this.f8487;
                c8363.m13865();
                c8363.f23044 = (field.getModifiers() & 1) == 0 && (JSONReader$Feature.FieldBased.mask & j) == 0;
                c8363.f23045 = j | c8363.f23045;
                c8363.f23048 = this.f8485;
                C2776.m5592(this.f8482, this.f8481, str, this.f8486, c8363, field, this.f8484, this.f8480);
                if (c8363.f23051) {
                    String name = c8363.f23049;
                    if (name == null || name.isEmpty()) {
                        name = field.getName();
                    }
                    C8365 c8365 = this.f8483;
                    String str2 = c8365.f23096;
                    if (str2 != null) {
                        JSONObject object = JSONObject.parseObject(str2);
                        object.getJSONArray("required").add(name);
                        c8365.f23096 = object.toString();
                    } else {
                        c8365.f23096 = JSONObject.of("required", (Object) JSONArray.of((Object) name)).toString();
                    }
                }
                break;
            default:
                C8363 c83632 = this.f8487;
                c83632.m13865();
                c83632.f23045 |= j;
                ((C2776) obj2).m5603(this.f8482, this.f8481, this.f8485, this.f8486, this.f8483, c83632, (Method) obj, this.f8484, this.f8480);
                break;
        }
    }

    public /* synthetic */ C2777(C2776 c2776, C8363 c8363, long j, String str, Class cls, Type type, String str2, String[] strArr, LinkedHashMap linkedHashMap, C2802 c2802, C8365 c8365) {
        this.f8487 = c8363;
        this.f8488 = j;
        this.f8485 = str;
        this.f8482 = cls;
        this.f8481 = type;
        this.f8479 = str2;
        this.f8486 = strArr;
        this.f8484 = linkedHashMap;
        this.f8480 = c2802;
        this.f8483 = c8365;
    }
}
