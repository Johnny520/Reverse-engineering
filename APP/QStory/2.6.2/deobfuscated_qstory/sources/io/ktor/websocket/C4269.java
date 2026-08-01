package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import p086.C7060;
import p086.InterfaceC7059;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4269 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12811;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f12812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12813 = 2;

    public C4269(String str) {
        str.getClass();
        this.f12811 = str;
        this.f12812 = new ArrayList(0);
        InterfaceC7059.f18965.getClass();
        List listM12351 = C7060.m12351();
        new ArrayList();
        Iterator it = listM12351.iterator();
        while (it.hasNext()) {
            ((InterfaceC7059) it.next()).getClass();
        }
    }

    public String toString() {
        int i = this.f12813;
        String str = this.f12811;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(' ');
                ArrayList arrayList = this.f12812;
                sb.append(arrayList.isEmpty() ? "" : ", ".concat(AbstractC4343.m8813(arrayList, ",", null, null, null, 62)));
                return sb.toString();
            case 1:
            default:
                return super.toString();
            case 2:
                return str;
        }
    }

    public C4269(ArrayList arrayList, String str) {
        this.f12812 = arrayList;
        this.f12811 = str;
    }

    public C4269(String str, ArrayList arrayList) {
        str.getClass();
        this.f12811 = str;
        this.f12812 = arrayList;
    }
}
