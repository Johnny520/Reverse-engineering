package p091;

import java.util.List;
import kotlin.collections.EmptyList;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7191 {
    default List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    AbstractC8190 getKind();

    default boolean isInline() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    String mo12379(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    int mo12380();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    int mo12381(String str);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    default boolean mo12410() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    String mo12382();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    InterfaceC7191 mo12383(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    List mo12384(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    boolean mo12385(int i);
}
