package p101;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import p102.C7892;
import p102.InterfaceC7893;

/* JADX INFO: renamed from: 飘花落叶言世楪苏子兰哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7888 implements InterfaceC7893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7892 f19302 = new C7892(AbstractC5228.f13320.mo9476(C7888.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f19303 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f19304;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7888.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C7888 c7888 = (C7888) obj;
        return this.f19304 == c7888.f19304 && AbstractC5227.m9466(this.f19303, c7888.f19303);
    }

    @Override // p102.InterfaceC7893
    public final C7892 getType() {
        return f19302;
    }

    public final int hashCode() {
        return this.f19303.hashCode() + (Boolean.hashCode(this.f19304) * 31);
    }
}
