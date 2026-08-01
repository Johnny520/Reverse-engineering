package p107;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f19547 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f19546 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashSet f19545 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f19544 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f19543 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f19549 = new ArrayList();

    public C8024(String str) {
        this.f19548 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12996(C8024 c8024, String str, InterfaceC8020 interfaceC8020) {
        EmptyList emptyList = EmptyList.INSTANCE;
        c8024.getClass();
        interfaceC8020.getClass();
        emptyList.getClass();
        if (!c8024.f19545.add(str)) {
            StringBuilder sbM12144 = AbstractC7012.m12144("Element with name '", str, "' is already registered in ");
            sbM12144.append(c8024.f19548);
            throw new IllegalArgumentException(sbM12144.toString().toString());
        }
        c8024.f19546.add(str);
        c8024.f19544.add(interfaceC8020);
        c8024.f19543.add(emptyList);
        c8024.f19549.add(false);
    }
}
