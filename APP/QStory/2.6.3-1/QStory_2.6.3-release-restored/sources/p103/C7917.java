package p103;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5227;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7917 extends C7958 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f19349;

    public C7917(String str, InterfaceC7908 interfaceC7908) {
        super(str, interfaceC7908, 1);
        this.f19349 = true;
    }

    @Override // p103.C7958
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7917) {
            InterfaceC8020 interfaceC8020 = (InterfaceC8020) obj;
            if (this.f19416.equals(interfaceC8020.mo12941())) {
                C7917 c7917 = (C7917) obj;
                if (c7917.f19349 && Arrays.equals((InterfaceC8020[]) this.f19421.getValue(), (InterfaceC8020[]) c7917.f19421.getValue())) {
                    int iMo12939 = interfaceC8020.mo12939();
                    int i = this.f19414;
                    if (i == iMo12939) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (AbstractC5227.m9466(mo12942(i2).mo12941(), interfaceC8020.mo12942(i2).mo12941()) && AbstractC5227.m9466(mo12942(i2).getKind(), interfaceC8020.mo12942(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p103.C7958
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p107.InterfaceC8020
    public final boolean isInline() {
        return this.f19349;
    }
}
