package p352;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p257.C8207;
import p319.C8684;
import p319.C8700;
import p343.C8831;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8881 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8207 f25030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8831 f25031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8880 f25032;

    public C8881(InterfaceC8880 interfaceC8880) {
        "onSelectTroopDialogListener";
        interfaceC8880.getClass();
        this.f25032 = interfaceC8880;
        this.f25031 = new C8831();
        C8207 c8207 = new C8207();
        "build(...)";
        this.f25030 = c8207;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14522() {
        String strM6668 = "\u9009\u62e9\u5f00\u542f\u7684\u7fa4";
        C8207 c8207 = this.f25030;
        c8207.f22615 = strM6668;
        c8207.mo13704();
        c8207.f22617 = new C8684(this);
        c8207.mo13704();
        c8207.mo13702("\u786e\u5b9a", new C8700(this, 3));
        c8207.m13714();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14523(ArrayList arrayList) {
        "uinList";
        C8831 c8831 = this.f25031;
        c8831.getClass();
        "uinList";
        LinkedHashMap linkedHashMap = (LinkedHashMap) c8831.f24839;
        linkedHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((String) it.next(), Boolean.TRUE);
        }
        c8831.m4781();
    }
}
