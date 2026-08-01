package p087;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4394;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7087 extends C7128 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f19009;

    public C7087(String str, InterfaceC7078 interfaceC7078) {
        super(str, interfaceC7078, 1);
        this.f19009 = true;
    }

    @Override // p087.C7128
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7087) {
            InterfaceC7190 interfaceC7190 = (InterfaceC7190) obj;
            if (this.f19076.equals(interfaceC7190.mo12355())) {
                C7087 c7087 = (C7087) obj;
                if (c7087.f19009 && Arrays.equals((InterfaceC7190[]) this.f19081.getValue(), (InterfaceC7190[]) c7087.f19081.getValue())) {
                    int iMo12353 = interfaceC7190.mo12353();
                    int i = this.f19074;
                    if (i == iMo12353) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (AbstractC4394.m8917(mo12356(i2).mo12355(), interfaceC7190.mo12356(i2).mo12355()) && AbstractC4394.m8917(mo12356(i2).getKind(), interfaceC7190.mo12356(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p087.C7128
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p091.InterfaceC7190
    public final boolean isInline() {
        return this.f19009;
    }
}
