package com.google.protobuf;

import androidx.collection.C1123;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰世子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4437 implements InterfaceC4283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4437 f11592 = new C4437(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11593;

    public /* synthetic */ C4437(int i) {
        this.f11593 = i;
    }

    @Override // com.google.protobuf.InterfaceC4283
    public final boolean isSupported(Class cls) {
        switch (this.f11593) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.protobuf.InterfaceC4283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4284 mo8123(Class cls) {
        switch (this.f11593) {
            case 0:
                if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    C6755.m11869("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (InterfaceC4284) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
                } catch (Exception e) {
                    C1123.m1408("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
