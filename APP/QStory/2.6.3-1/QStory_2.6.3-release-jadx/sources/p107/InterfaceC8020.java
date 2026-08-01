package p107;

import java.util.List;
import kotlin.collections.EmptyList;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8020 {
    default List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    AbstractC9019 getKind();

    default boolean isInline() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    String mo12938(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    int mo12939();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    int mo12940(String str);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    default boolean mo12969() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    String mo12941();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    InterfaceC8020 mo12942(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    List mo12943(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    boolean mo12944(int i);
}
