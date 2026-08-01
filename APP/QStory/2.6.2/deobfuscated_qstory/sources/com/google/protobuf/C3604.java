package com.google.protobuf;

import androidx.collection.C0276;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰世子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3604 implements InterfaceC3450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3604 f11242 = new C3604(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11243;

    public /* synthetic */ C3604(int i) {
        this.f11243 = i;
    }

    @Override // com.google.protobuf.InterfaceC3450
    public final boolean isSupported(Class cls) {
        switch (this.f11243) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.protobuf.InterfaceC3450
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC3451 mo7577(Class cls) {
        switch (this.f11243) {
            case 0:
                if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    C5919.m11249("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (InterfaceC3451) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
                } catch (Exception e) {
                    C0276.m847("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
