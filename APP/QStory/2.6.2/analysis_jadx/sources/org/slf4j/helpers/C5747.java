package org.slf4j.helpers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import p400.InterfaceC9156;
import p400.InterfaceC9157;

/* JADX INFO: renamed from: org.slf4j.helpers.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5747 implements InterfaceC9157 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f15742 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f15740 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final LinkedBlockingQueue f15741 = new LinkedBlockingQueue();

    @Override // p400.InterfaceC9157
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final synchronized InterfaceC9156 mo8286(String str) {
        C5748 c5748;
        c5748 = (C5748) this.f15740.get(str);
        if (c5748 == null) {
            c5748 = new C5748(str, this.f15741, this.f15742);
            this.f15740.put(str, c5748);
        }
        return c5748;
    }
}
