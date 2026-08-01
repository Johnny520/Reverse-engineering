package p087;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4395;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7088 extends C7129 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f19004;

    public C7088(String str, InterfaceC7079 interfaceC7079) {
        super(str, interfaceC7079, 1);
        this.f19004 = true;
    }

    @Override // p087.C7129
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7088) {
            InterfaceC7191 interfaceC7191 = (InterfaceC7191) obj;
            if (this.f19071.equals(interfaceC7191.mo12382())) {
                C7088 c7088 = (C7088) obj;
                if (c7088.f19004 && Arrays.equals((InterfaceC7191[]) this.f19076.getValue(), (InterfaceC7191[]) c7088.f19076.getValue())) {
                    int iMo12380 = interfaceC7191.mo12380();
                    int i = this.f19069;
                    if (i == iMo12380) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (AbstractC4395.m8907(mo12383(i2).mo12382(), interfaceC7191.mo12383(i2).mo12382()) && AbstractC4395.m8907(mo12383(i2).getKind(), interfaceC7191.mo12383(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p087.C7129
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p091.InterfaceC7191
    public final boolean isInline() {
        return this.f19004;
    }
}
