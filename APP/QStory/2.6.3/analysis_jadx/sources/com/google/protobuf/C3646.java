package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲苏兰世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3646 extends C3635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f11320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3666 f11323;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11324;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11325;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11326;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final java.lang.reflect.Method f11327;

    public C3646(C3657 c3657, String str, Class cls, Class cls2) {
        super(cls, cls2, str);
        this.f11323 = c3657.m7865();
        this.f11322 = GeneratedMessage.getMethodOrDie(this.f11295, "valueOf", C3664.class);
        this.f11321 = GeneratedMessage.getMethodOrDie(this.f11295, "getValueDescriptor", new Class[0]);
        boolean zM7853 = c3657.m7853();
        this.f11320 = !zM7853;
        if (zM7853) {
            return;
        }
        String strM158 = AbstractC0053.m158("get", str, "Value");
        Class cls3 = Integer.TYPE;
        this.f11325 = GeneratedMessage.getMethodOrDie(cls, strM158, cls3);
        this.f11324 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("get", str, "Value"), cls3);
        this.f11326 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("set", str, "Value"), cls3, cls3);
        this.f11327 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("add", str, "Value"), cls3);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo7832(GeneratedMessage.AbstractC3305 abstractC3305) {
        ArrayList arrayList = new ArrayList();
        int iMo7839 = mo7839(abstractC3305);
        for (int i = 0; i < iMo7839; i++) {
            arrayList.add(mo7837(abstractC3305, i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7833(GeneratedMessage generatedMessage) {
        ArrayList arrayList = new ArrayList();
        int iMo7838 = mo7838(generatedMessage);
        for (int i = 0; i < iMo7838; i++) {
            arrayList.add(mo7840(i, generatedMessage));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Object mo7837(GeneratedMessage.AbstractC3305 abstractC3305, int i) {
        if (!this.f11320) {
            return GeneratedMessage.invokeOrDie(this.f11321, super.mo7837(abstractC3305, i), new Object[0]);
        }
        return this.f11323.m7882(((Integer) GeneratedMessage.invokeOrDie(this.f11324, abstractC3305, Integer.valueOf(i))).intValue());
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo7829(GeneratedMessage.AbstractC3305 abstractC3305, Object obj) {
        if (this.f11320) {
            GeneratedMessage.invokeOrDie(this.f11327, abstractC3305, Integer.valueOf(((C3664) obj).f11386.getNumber()));
        } else {
            super.mo7829(abstractC3305, GeneratedMessage.invokeOrDie(this.f11322, null, obj));
        }
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7830(GeneratedMessage.AbstractC3305 abstractC3305, int i, Object obj) {
        if (this.f11320) {
            GeneratedMessage.invokeOrDie(this.f11326, abstractC3305, Integer.valueOf(i), Integer.valueOf(((C3664) obj).f11386.getNumber()));
        } else {
            super.mo7830(abstractC3305, i, GeneratedMessage.invokeOrDie(this.f11322, null, obj));
        }
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo7840(int i, GeneratedMessage generatedMessage) {
        if (!this.f11320) {
            return GeneratedMessage.invokeOrDie(this.f11321, super.mo7840(i, generatedMessage), new Object[0]);
        }
        return this.f11323.m7882(((Integer) GeneratedMessage.invokeOrDie(this.f11325, generatedMessage, Integer.valueOf(i))).intValue());
    }
}
