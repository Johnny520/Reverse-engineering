package org.slf4j.helpers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import p398.InterfaceC9141;
import p398.InterfaceC9142;

/* JADX INFO: renamed from: org.slf4j.helpers.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5748 implements InterfaceC9142 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f15742 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f15740 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final LinkedBlockingQueue f15741 = new LinkedBlockingQueue();

    @Override // p398.InterfaceC9142
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final synchronized InterfaceC9141 mo8276(String str) {
        C5749 c5749;
        c5749 = (C5749) this.f15740.get(str);
        if (c5749 == null) {
            c5749 = new C5749(str, this.f15741, this.f15742);
            this.f15740.put(str, c5749);
        }
        return c5749;
    }
}
