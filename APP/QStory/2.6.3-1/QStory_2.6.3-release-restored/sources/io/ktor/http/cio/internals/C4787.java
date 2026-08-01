package io.ktor.http.cio.internals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4787[] f12521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f12522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f12523;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final char f12524;

    /* JADX WARN: Multi-variable type inference failed */
    public C4787(char c, List list, ArrayList arrayList) {
        list.getClass();
        this.f12524 = c;
        this.f12523 = list;
        this.f12522 = arrayList;
        C4787[] c4787Arr = new C4787[256];
        for (int i = 0; i < 256; i++) {
            Iterator it = this.f12522.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((C4787) next).f12524 == i) {
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
            c4787Arr[i] = obj;
        }
        this.f12521 = c4787Arr;
    }
}
