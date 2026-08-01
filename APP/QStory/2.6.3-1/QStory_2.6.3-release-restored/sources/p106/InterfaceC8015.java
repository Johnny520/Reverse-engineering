package p106;

import androidx.compose.runtime.internal.C2080;
import p105.InterfaceC8013;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪哲子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8015 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    void mo11204(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    default void mo11264(InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8013.getClass();
        interfaceC8013.serialize(this, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    void mo11265(InterfaceC8020 interfaceC8020, int i);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    void mo11266(char c);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    default void m12995(InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8013.getClass();
        if (interfaceC8013.getDescriptor().mo12969()) {
            mo11264(interfaceC8013, obj);
        } else if (obj == null) {
            mo11268();
        } else {
            mo11264(interfaceC8013, obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    void mo11268();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    InterfaceC8017 mo11269(InterfaceC8020 interfaceC8020);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    C2080 mo11205();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    void mo11271(float f);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    void mo11273(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    InterfaceC8015 mo11275(InterfaceC8020 interfaceC8020);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    void mo11206(byte b);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    void mo11276(double d);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    void mo11207(short s);

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    void mo11208(String str);

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    default InterfaceC8017 mo11328(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return mo11269(interfaceC8020);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    void mo11210(long j);
}
