package p116;

import androidx.appcompat.app.C0108;
import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p175.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7344 implements InterfaceC7345 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0236 f19570;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0236 f19571;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6558 f19572;

    public C7344(Map map, InterfaceC6558 interfaceC6558) {
        C0236 c0236;
        this.f19572 = interfaceC6558;
        if (map == null || map.isEmpty()) {
            c0236 = null;
        } else {
            c0236 = new C0236(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c0236.m755(entry.getKey(), entry.getValue());
            }
        }
        this.f19570 = c0236;
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7338 mo1481(String str, InterfaceC6543 interfaceC6543) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC7739.m13064(str.charAt(i))) {
                C0236 c0236 = this.f19571;
                if (c0236 == null) {
                    long[] jArr = AbstractC0290.f1007;
                    c0236 = new C0236();
                    this.f19571 = c0236;
                }
                Object objM757 = c0236.m757(str);
                if (objM757 == null) {
                    objM757 = new ArrayList();
                    c0236.m755(str, objM757);
                }
                ((List) objM757).add(interfaceC6543);
                return new C0108(c0236, str, interfaceC6543, 26);
            }
        }
        C5925.m11310("Registered key is empty or blank");
        return null;
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo1483(String str) {
        C0236 c0236 = this.f19570;
        List list = c0236 != null ? (List) c0236.m758(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c0236 != null) {
            List listSubList = list.subList(1, list.size());
            int iM749 = c0236.m749(str);
            if (iM749 < 0) {
                iM749 = ~iM749;
            }
            Object[] objArr = c0236.f879;
            Object obj = objArr[iM749];
            c0236.f880[iM749] = str;
            objArr[iM749] = listSubList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map mo1484() {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p116.C7344.mo1484():java.util.Map");
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1485(Object obj) {
        return ((Boolean) this.f19572.invoke(obj)).booleanValue();
    }
}
