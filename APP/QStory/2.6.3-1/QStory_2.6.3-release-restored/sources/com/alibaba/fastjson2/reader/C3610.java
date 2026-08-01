package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.function.Consumer;
import p294.C9192;
import p294.C9194;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3610 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f8824;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3635 f8825;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Type f8826;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Class f8827;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C9194 f8828;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f8829;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ String f8830;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ String[] f8831;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9192 f8832;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f8833;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8834 = 1;

    public /* synthetic */ C3610(C3609 c3609, C9192 c9192, long j, Class cls, Type type, String str, String[] strArr, C9194 c9194, LinkedHashMap linkedHashMap, C3635 c3635) {
        this.f8824 = c3609;
        this.f8832 = c9192;
        this.f8833 = j;
        this.f8827 = cls;
        this.f8826 = type;
        this.f8830 = str;
        this.f8831 = strArr;
        this.f8828 = c9194;
        this.f8829 = linkedHashMap;
        this.f8825 = c3635;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f8834;
        long j = this.f8833;
        Object obj2 = this.f8824;
        switch (i) {
            case 0:
                String str = (String) obj2;
                Field field = (Field) obj;
                C9192 c9192 = this.f8832;
                c9192.m14424();
                c9192.f23389 = (field.getModifiers() & 1) == 0 && (JSONReader$Feature.FieldBased.mask & j) == 0;
                c9192.f23390 = j | c9192.f23390;
                c9192.f23393 = this.f8830;
                C3609.m6152(this.f8827, this.f8826, str, this.f8831, c9192, field, this.f8829, this.f8825);
                if (c9192.f23396) {
                    String name = c9192.f23394;
                    if (name == null || name.isEmpty()) {
                        name = field.getName();
                    }
                    C9194 c9194 = this.f8828;
                    String str2 = c9194.f23441;
                    if (str2 != null) {
                        JSONObject object = JSONObject.parseObject(str2);
                        object.getJSONArray("required").add(name);
                        c9194.f23441 = object.toString();
                    } else {
                        c9194.f23441 = JSONObject.m9of("required", (Object) JSONArray.m0of((Object) name)).toString();
                    }
                }
                break;
            default:
                C9192 c91922 = this.f8832;
                c91922.m14424();
                c91922.f23390 |= j;
                ((C3609) obj2).m6163(this.f8827, this.f8826, this.f8830, this.f8831, this.f8828, c91922, (Method) obj, this.f8829, this.f8825);
                break;
        }
    }

    public /* synthetic */ C3610(C3609 c3609, C9192 c9192, long j, String str, Class cls, Type type, String str2, String[] strArr, LinkedHashMap linkedHashMap, C3635 c3635, C9194 c9194) {
        this.f8832 = c9192;
        this.f8833 = j;
        this.f8830 = str;
        this.f8827 = cls;
        this.f8826 = type;
        this.f8824 = str2;
        this.f8831 = strArr;
        this.f8829 = linkedHashMap;
        this.f8825 = c3635;
        this.f8828 = c9194;
    }
}
