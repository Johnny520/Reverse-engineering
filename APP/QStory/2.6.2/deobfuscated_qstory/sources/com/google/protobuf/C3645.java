package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲苏兰世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3645 extends C3634 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f11315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3665 f11318;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11319;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11320;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11321;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final java.lang.reflect.Method f11322;

    public C3645(C3656 c3656, String str, Class cls, Class cls2) {
        super(cls, cls2, str);
        this.f11318 = c3656.m7878();
        this.f11317 = GeneratedMessage.getMethodOrDie(this.f11290, "valueOf", C3663.class);
        this.f11316 = GeneratedMessage.getMethodOrDie(this.f11290, "getValueDescriptor", new Class[0]);
        boolean zM7866 = c3656.m7866();
        this.f11315 = !zM7866;
        if (zM7866) {
            return;
        }
        String strM156 = AbstractC0053.m156("get", str, "Value");
        Class cls3 = Integer.TYPE;
        this.f11320 = GeneratedMessage.getMethodOrDie(cls, strM156, cls3);
        this.f11319 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("get", str, "Value"), cls3);
        this.f11321 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("set", str, "Value"), cls3, cls3);
        this.f11322 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("add", str, "Value"), cls3);
    }

    @Override // com.google.protobuf.C3634, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo7845(GeneratedMessage.AbstractC3304 abstractC3304) {
        ArrayList arrayList = new ArrayList();
        int iMo7852 = mo7852(abstractC3304);
        for (int i = 0; i < iMo7852; i++) {
            arrayList.add(mo7850(abstractC3304, i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.C3634, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7846(GeneratedMessage generatedMessage) {
        ArrayList arrayList = new ArrayList();
        int iMo7851 = mo7851(generatedMessage);
        for (int i = 0; i < iMo7851; i++) {
            arrayList.add(mo7853(i, generatedMessage));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.C3634, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Object mo7850(GeneratedMessage.AbstractC3304 abstractC3304, int i) {
        if (!this.f11315) {
            return GeneratedMessage.invokeOrDie(this.f11316, super.mo7850(abstractC3304, i), new Object[0]);
        }
        return this.f11318.m7895(((Integer) GeneratedMessage.invokeOrDie(this.f11319, abstractC3304, Integer.valueOf(i))).intValue());
    }

    @Override // com.google.protobuf.C3634, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo7842(GeneratedMessage.AbstractC3304 abstractC3304, Object obj) {
        if (this.f11315) {
            GeneratedMessage.invokeOrDie(this.f11322, abstractC3304, Integer.valueOf(((C3663) obj).f11381.getNumber()));
        } else {
            super.mo7842(abstractC3304, GeneratedMessage.invokeOrDie(this.f11317, null, obj));
        }
    }

    @Override // com.google.protobuf.C3634, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7843(GeneratedMessage.AbstractC3304 abstractC3304, int i, Object obj) {
        if (this.f11315) {
            GeneratedMessage.invokeOrDie(this.f11321, abstractC3304, Integer.valueOf(i), Integer.valueOf(((C3663) obj).f11381.getNumber()));
        } else {
            super.mo7843(abstractC3304, i, GeneratedMessage.invokeOrDie(this.f11317, null, obj));
        }
    }

    @Override // com.google.protobuf.C3634, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo7853(int i, GeneratedMessage generatedMessage) {
        if (!this.f11315) {
            return GeneratedMessage.invokeOrDie(this.f11316, super.mo7853(i, generatedMessage), new Object[0]);
        }
        return this.f11318.m7895(((Integer) GeneratedMessage.invokeOrDie(this.f11320, generatedMessage, Integer.valueOf(i))).intValue());
    }
}
