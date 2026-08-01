package kotlinx.serialization.protobuf.internal;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.window.area.AbstractC3400;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.serialization.SerializationException;
import p106.InterfaceC8018;
import p107.C8022;
import p107.C8027;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6359 extends C6353 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f15619;

    @Override // kotlinx.serialization.protobuf.internal.C6353, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8018 mo11235(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        AbstractC9019 kind = interfaceC8020.getKind();
        if (!AbstractC5227.m9466(kind, C8027.f19554) && !AbstractC5227.m9466(kind, C8027.f19552) && !(kind instanceof C8022)) {
            throw new SerializationException("Type " + interfaceC8020.getKind() + " cannot be directly child of oneof element");
        }
        long jM4825 = m4825();
        if (jM4825 == 19500 && AbstractC5227.m9466(this.f15602, interfaceC8020)) {
            return this;
        }
        if (AbstractC1298.m1710(jM4825)) {
            throw new SerializationException("An oneof element cannot be directly child of another oneof element");
        }
        return new C6353(this.f15608, AbstractC3400.m5635(this.f15603, jM4825), interfaceC8020);
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353, p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo11277(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (this.f15619) {
            return -1;
        }
        this.f15619 = true;
        return 0;
    }
}
