package io.ktor.http.cio.internals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3954 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3954[] f12172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f12173;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f12174;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final char f12175;

    /* JADX WARN: Multi-variable type inference failed */
    public C3954(char c, List list, ArrayList arrayList) {
        list.getClass();
        this.f12175 = c;
        this.f12174 = list;
        this.f12173 = arrayList;
        C3954[] c3954Arr = new C3954[256];
        for (int i = 0; i < 256; i++) {
            Iterator it = this.f12173.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((C3954) next).f12175 == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            c3954Arr[i] = obj;
        }
        this.f12172 = c3954Arr;
    }
}
