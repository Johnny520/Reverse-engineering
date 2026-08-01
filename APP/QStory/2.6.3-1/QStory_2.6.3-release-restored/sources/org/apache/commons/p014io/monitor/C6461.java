package org.apache.commons.p014io.monitor;

import com.alibaba.fastjson2.C3775;
import java.util.function.Consumer;

/* JADX INFO: renamed from: org.apache.commons.io.monitor.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6461 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ FileAlterationObserver f15858;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15859;

    public /* synthetic */ C6461(FileAlterationObserver fileAlterationObserver, int i) {
        this.f15859 = i;
        this.f15858 = fileAlterationObserver;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f15859;
        FileAlterationObserver fileAlterationObserver = this.f15858;
        switch (i) {
            case 0:
                fileAlterationObserver.fireOnCreate((FileEntry) obj);
                break;
            case 1:
                if (obj != null) {
                    C3775.m6954();
                } else {
                    fileAlterationObserver.lambda$checkAndNotify$0(null);
                }
                break;
            default:
                if (obj != null) {
                    C3775.m6954();
                } else {
                    fileAlterationObserver.lambda$checkAndNotify$1(null);
                }
                break;
        }
    }
}
