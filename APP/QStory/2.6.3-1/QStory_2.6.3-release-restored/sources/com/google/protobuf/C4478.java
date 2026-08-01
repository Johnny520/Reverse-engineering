package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.google.protobuf.GeneratedMessage;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲苏兰世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4478 extends C4467 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f11665;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11666;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11667;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4498 f11668;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11669;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11670;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11671;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final java.lang.reflect.Method f11672;

    public C4478(C4489 c4489, String str, Class cls, Class cls2) {
        super(cls, cls2, str);
        this.f11668 = c4489.m8424();
        this.f11667 = GeneratedMessage.getMethodOrDie(this.f11640, "valueOf", C4496.class);
        this.f11666 = GeneratedMessage.getMethodOrDie(this.f11640, "getValueDescriptor", new Class[0]);
        boolean zM8412 = c4489.m8412();
        this.f11665 = !zM8412;
        if (zM8412) {
            return;
        }
        String strM718 = AbstractC0900.m718("get", str, "Value");
        Class cls3 = Integer.TYPE;
        this.f11670 = GeneratedMessage.getMethodOrDie(cls, strM718, cls3);
        this.f11669 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("get", str, "Value"), cls3);
        this.f11671 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("set", str, "Value"), cls3, cls3);
        this.f11672 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("add", str, "Value"), cls3);
    }

    @Override // com.google.protobuf.C4467, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo8391(GeneratedMessage.AbstractC4137 abstractC4137) {
        ArrayList arrayList = new ArrayList();
        int iMo8398 = mo8398(abstractC4137);
        for (int i = 0; i < iMo8398; i++) {
            arrayList.add(mo8396(abstractC4137, i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.C4467, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo8392(GeneratedMessage generatedMessage) {
        ArrayList arrayList = new ArrayList();
        int iMo8397 = mo8397(generatedMessage);
        for (int i = 0; i < iMo8397; i++) {
            arrayList.add(mo8399(i, generatedMessage));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.C4467, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Object mo8396(GeneratedMessage.AbstractC4137 abstractC4137, int i) {
        if (!this.f11665) {
            return GeneratedMessage.invokeOrDie(this.f11666, super.mo8396(abstractC4137, i), new Object[0]);
        }
        return this.f11668.m8441(((Integer) GeneratedMessage.invokeOrDie(this.f11669, abstractC4137, Integer.valueOf(i))).intValue());
    }

    @Override // com.google.protobuf.C4467, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo8388(GeneratedMessage.AbstractC4137 abstractC4137, Object obj) {
        if (this.f11665) {
            GeneratedMessage.invokeOrDie(this.f11672, abstractC4137, Integer.valueOf(((C4496) obj).f11731.getNumber()));
        } else {
            super.mo8388(abstractC4137, GeneratedMessage.invokeOrDie(this.f11667, null, obj));
        }
    }

    @Override // com.google.protobuf.C4467, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo8389(GeneratedMessage.AbstractC4137 abstractC4137, int i, Object obj) {
        if (this.f11665) {
            GeneratedMessage.invokeOrDie(this.f11671, abstractC4137, Integer.valueOf(i), Integer.valueOf(((C4496) obj).f11731.getNumber()));
        } else {
            super.mo8389(abstractC4137, i, GeneratedMessage.invokeOrDie(this.f11667, null, obj));
        }
    }

    @Override // com.google.protobuf.C4467, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo8399(int i, GeneratedMessage generatedMessage) {
        if (!this.f11665) {
            return GeneratedMessage.invokeOrDie(this.f11666, super.mo8399(i, generatedMessage), new Object[0]);
        }
        return this.f11668.m8441(((Integer) GeneratedMessage.invokeOrDie(this.f11670, generatedMessage, Integer.valueOf(i))).intValue());
    }
}
