package p091;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19208;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f19207 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f19206 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashSet f19205 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f19204 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f19203 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f19209 = new ArrayList();

    public C7194(String str) {
        this.f19208 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12410(C7194 c7194, String str, InterfaceC7190 interfaceC7190) {
        EmptyList emptyList = EmptyList.INSTANCE;
        c7194.getClass();
        interfaceC7190.getClass();
        emptyList.getClass();
        if (!c7194.f19205.add(str)) {
            StringBuilder sbM11550 = AbstractC6136.m11550("Element with name '", str, "' is already registered in ");
            sbM11550.append(c7194.f19208);
            throw new IllegalArgumentException(sbM11550.toString().toString());
        }
        c7194.f19206.add(str);
        c7194.f19204.add(interfaceC7190);
        c7194.f19203.add(emptyList);
        c7194.f19209.add(false);
    }
}
