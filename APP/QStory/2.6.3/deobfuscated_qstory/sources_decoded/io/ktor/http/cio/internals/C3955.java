package io.ktor.http.cio.internals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3955[] f12176;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f12177;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f12178;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final char f12179;

    /* JADX WARN: Multi-variable type inference failed */
    public C3955(char c, List list, ArrayList arrayList) {
        list.getClass();
        this.f12179 = c;
        this.f12178 = list;
        this.f12177 = arrayList;
        C3955[] c3955Arr = new C3955[256];
        for (int i = 0; i < 256; i++) {
            Iterator it = this.f12177.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((C3955) next).f12179 == i) {
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
            c3955Arr[i] = obj;
        }
        this.f12176 = c3955Arr;
    }
}
