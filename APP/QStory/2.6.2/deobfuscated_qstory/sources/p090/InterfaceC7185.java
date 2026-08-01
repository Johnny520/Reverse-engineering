package p090;

import androidx.compose.runtime.internal.C1245;
import p089.InterfaceC7183;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪哲子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7185 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    void mo6790(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    default void mo10670(InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7183.getClass();
        interfaceC7183.serialize(this, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    void mo6794(InterfaceC7190 interfaceC7190, int i);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    void mo6795(char c);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    default void m12409(InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7183.getClass();
        if (interfaceC7183.getDescriptor().mo12383()) {
            mo10670(interfaceC7183, obj);
        } else if (obj == null) {
            mo6799();
        } else {
            mo10670(interfaceC7183, obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    void mo6799();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    InterfaceC7187 mo6800(InterfaceC7190 interfaceC7190);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    C1245 mo10641();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    void mo6804(float f);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    void mo6806(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    InterfaceC7185 mo6808(InterfaceC7190 interfaceC7190);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    void mo6810(byte b);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    void mo6811(double d);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    void mo6812(short s);

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    void mo6813(String str);

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    default InterfaceC7187 mo10712(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return mo6800(interfaceC7190);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    void mo6817(long j);
}
