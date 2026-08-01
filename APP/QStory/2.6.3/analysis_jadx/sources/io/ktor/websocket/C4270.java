package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import p086.C7061;
import p086.InterfaceC7060;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4270 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f12816;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12817 = 2;

    public C4270(String str) {
        str.getClass();
        this.f12815 = str;
        this.f12816 = new ArrayList(0);
        InterfaceC7060.f18960.getClass();
        List listM12378 = C7061.m12378();
        new ArrayList();
        Iterator it = listM12378.iterator();
        while (it.hasNext()) {
            ((InterfaceC7060) it.next()).getClass();
        }
    }

    public String toString() {
        int i = this.f12817;
        String str = this.f12815;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(' ');
                ArrayList arrayList = this.f12816;
                sb.append(arrayList.isEmpty() ? "" : ", ".concat(AbstractC4344.m8810(arrayList, ",", null, null, null, 62)));
                return sb.toString();
            case 1:
            default:
                return super.toString();
            case 2:
                return str;
        }
    }

    public C4270(ArrayList arrayList, String str) {
        this.f12816 = arrayList;
        this.f12815 = str;
    }

    public C4270(String str, ArrayList arrayList) {
        str.getClass();
        this.f12815 = str;
        this.f12816 = arrayList;
    }
}
