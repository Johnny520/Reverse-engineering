package org.slf4j.helpers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import p414.InterfaceC9970;
import p414.InterfaceC9971;

/* JADX INFO: renamed from: org.slf4j.helpers.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6578 implements InterfaceC9971 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f16087 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f16085 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final LinkedBlockingQueue f16086 = new LinkedBlockingQueue();

    @Override // p414.InterfaceC9971
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final synchronized InterfaceC9970 mo8835(String str) {
        C6579 c6579;
        c6579 = (C6579) this.f16085.get(str);
        if (c6579 == null) {
            c6579 = new C6579(str, this.f16086, this.f16087);
            this.f16085.put(str, c6579);
        }
        return c6579;
    }
}
