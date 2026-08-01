package org.apache.commons.io.monitor;

import com.alibaba.fastjson2.C2941;
import java.util.function.Consumer;

/* JADX INFO: renamed from: org.apache.commons.io.monitor.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5630 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ FileAlterationObserver f15513;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15514;

    public /* synthetic */ C5630(FileAlterationObserver fileAlterationObserver, int i) {
        this.f15514 = i;
        this.f15513 = fileAlterationObserver;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f15514;
        FileAlterationObserver fileAlterationObserver = this.f15513;
        switch (i) {
            case 0:
                fileAlterationObserver.fireOnCreate((FileEntry) obj);
                break;
            case 1:
                if (obj != null) {
                    C2941.m6336();
                } else {
                    fileAlterationObserver.lambda$checkAndNotify$0(null);
                }
                break;
            default:
                if (obj != null) {
                    C2941.m6336();
                } else {
                    fileAlterationObserver.lambda$checkAndNotify$1(null);
                }
                break;
        }
    }
}
