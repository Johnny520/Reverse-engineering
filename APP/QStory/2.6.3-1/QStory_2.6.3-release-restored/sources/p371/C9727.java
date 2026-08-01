package p371;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p273.C9037;
import p338.C9532;
import p339.C9536;
import p358.C9646;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9727 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9037 f25426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9646 f25427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC9726 f25428;

    public C9727(InterfaceC9726 interfaceC9726) {
        "onSelectTroopDialogListener";
        interfaceC9726.getClass();
        this.f25428 = interfaceC9726;
        this.f25427 = new C9646();
        C9037 c9037 = new C9037();
        "build(...)";
        this.f25426 = c9037;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m15100() {
        String strM14531 = "选择开启的群";
        C9037 c9037 = this.f25426;
        c9037.f22959 = strM14531;
        c9037.mo14280();
        c9037.f22961 = new C9536(this);
        c9037.mo14280();
        c9037.mo14278("确定", new C9532(this, 3));
        c9037.m14290();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m15101(ArrayList arrayList) {
        "uinList";
        C9646 c9646 = this.f25427;
        c9646.getClass();
        "uinList";
        LinkedHashMap linkedHashMap = (LinkedHashMap) c9646.f25165;
        linkedHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((String) it.next(), Boolean.TRUE);
        }
        c9646.m5351();
    }
}
