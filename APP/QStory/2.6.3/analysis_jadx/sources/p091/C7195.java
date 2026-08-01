package p091;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import p009.AbstractC6183;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f19202 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f19201 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashSet f19200 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f19199 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f19198 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f19204 = new ArrayList();

    public C7195(String str) {
        this.f19203 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12437(C7195 c7195, String str, InterfaceC7191 interfaceC7191) {
        EmptyList emptyList = EmptyList.INSTANCE;
        c7195.getClass();
        interfaceC7191.getClass();
        emptyList.getClass();
        if (!c7195.f19200.add(str)) {
            StringBuilder sbM11585 = AbstractC6183.m11585("Element with name '", str, "' is already registered in ");
            sbM11585.append(c7195.f19203);
            throw new IllegalArgumentException(sbM11585.toString().toString());
        }
        c7195.f19201.add(str);
        c7195.f19199.add(interfaceC7191);
        c7195.f19198.add(emptyList);
        c7195.f19204.add(false);
    }
}
