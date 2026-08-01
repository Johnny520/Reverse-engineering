package p090;

import androidx.compose.runtime.internal.C1245;
import p089.InterfaceC7184;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪哲子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7186 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    void mo10645(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    default void mo10705(InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7184.getClass();
        interfaceC7184.serialize(this, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    void mo10706(InterfaceC7191 interfaceC7191, int i);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    void mo10707(char c);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    default void m12436(InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7184.getClass();
        if (interfaceC7184.getDescriptor().mo12410()) {
            mo10705(interfaceC7184, obj);
        } else if (obj == null) {
            mo10709();
        } else {
            mo10705(interfaceC7184, obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    void mo10709();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    InterfaceC7188 mo10710(InterfaceC7191 interfaceC7191);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    C1245 mo10646();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    void mo10712(float f);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    void mo10714(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    InterfaceC7186 mo10716(InterfaceC7191 interfaceC7191);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    void mo10647(byte b);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    void mo10717(double d);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    void mo10648(short s);

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    void mo10649(String str);

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    default InterfaceC7188 mo10769(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return mo10710(interfaceC7191);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    void mo10651(long j);
}
