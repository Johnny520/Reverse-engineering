package p088;

import com.bumptech.glide.AbstractC3066;
import java.util.Map;
import p087.C7077;
import p087.C7135;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7150 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7150 f19112 = new C7150();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7151 f19111 = C7151.f19114;

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        AbstractC3066.m6850(interfaceC7187);
        return new C7152((Map) new C7077(C7135.f19089, C7171.f19139, 1).deserialize(interfaceC7187));
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f19111;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C7152 c7152 = (C7152) obj;
        c7152.getClass();
        AbstractC3066.m6852(interfaceC7186);
        new C7077(C7135.f19089, C7171.f19139, 1).serialize(interfaceC7186, c7152);
    }
}
