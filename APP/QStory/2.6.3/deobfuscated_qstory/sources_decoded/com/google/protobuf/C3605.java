package com.google.protobuf;

import androidx.collection.C0276;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰世子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3605 implements InterfaceC3451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3605 f11247 = new C3605(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11248;

    public /* synthetic */ C3605(int i) {
        this.f11248 = i;
    }

    @Override // com.google.protobuf.InterfaceC3451
    public final boolean isSupported(Class cls) {
        switch (this.f11248) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.protobuf.InterfaceC3451
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC3452 mo7564(Class cls) {
        switch (this.f11248) {
            case 0:
                if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    C5925.m11310("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (InterfaceC3452) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
                } catch (Exception e) {
                    C0276.m848("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
