package p103;

import java.util.Iterator;
import p105.InterfaceC8013;
import p106.InterfaceC8016;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7934 implements InterfaceC8013 {
    @Override // p105.InterfaceC8013
    public Object deserialize(InterfaceC8016 interfaceC8016) {
        return m12961(interfaceC8016, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m12961(InterfaceC8016 interfaceC8016, Object obj) {
        Object objMo12950 = obj != null ? mo12950(obj) : mo12958();
        int iMo12957 = mo12957(objMo12950);
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(getDescriptor());
        interfaceC8018Mo11235.getClass();
        while (true) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(getDescriptor());
            if (iMo11277 == -1) {
                interfaceC8018Mo11235.mo11237(getDescriptor());
                return mo12959(objMo12950);
            }
            mo12948(interfaceC8018Mo11235, iMo11277 + iMo12957, objMo12950);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract int mo12949(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Iterator mo12956(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract int mo12957(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo12958();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract Object mo12959(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract Object mo12950(Object obj);
}
