package p116;

import androidx.appcompat.app.C0108;
import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7343 implements InterfaceC7344 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0236 f19575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0236 f19576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6557 f19577;

    public C7343(Map map, InterfaceC6557 interfaceC6557) {
        C0236 c0236;
        this.f19577 = interfaceC6557;
        if (map == null || map.isEmpty()) {
            c0236 = null;
        } else {
            c0236 = new C0236(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c0236.m754(entry.getKey(), entry.getValue());
            }
        }
        this.f19575 = c0236;
    }

    @Override // p116.InterfaceC7344
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7337 mo1471(String str, InterfaceC6542 interfaceC6542) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC3056.m6673(str.charAt(i))) {
                C0236 c0236 = this.f19576;
                if (c0236 == null) {
                    long[] jArr = AbstractC0290.f1007;
                    c0236 = new C0236();
                    this.f19576 = c0236;
                }
                Object objM756 = c0236.m756(str);
                if (objM756 == null) {
                    objM756 = new ArrayList();
                    c0236.m754(str, objM756);
                }
                ((List) objM756).add(interfaceC6542);
                return new C0108(c0236, str, interfaceC6542, 26);
            }
        }
        C5919.m11249("Registered key is empty or blank");
        return null;
    }

    @Override // p116.InterfaceC7344
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo1473(String str) {
        C0236 c0236 = this.f19575;
        List list = c0236 != null ? (List) c0236.m757(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c0236 != null) {
            List listSubList = list.subList(1, list.size());
            int iM748 = c0236.m748(str);
            if (iM748 < 0) {
                iM748 = ~iM748;
            }
            Object[] objArr = c0236.f879;
            Object obj = objArr[iM748];
            c0236.f880[iM748] = str;
            objArr[iM748] = listSubList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // p116.InterfaceC7344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map mo1474() {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p116.C7343.mo1474():java.util.Map");
    }

    @Override // p116.InterfaceC7344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1475(Object obj) {
        return ((Boolean) this.f19577.invoke(obj)).booleanValue();
    }
}
