package org.apache.commons.io.monitor;

import com.alibaba.fastjson2.C2942;
import java.util.function.Consumer;

/* JADX INFO: renamed from: org.apache.commons.io.monitor.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5632 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ FileEntry f15515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15516;

    public /* synthetic */ C5632(FileEntry fileEntry, int i) {
        this.f15516 = i;
        this.f15515 = fileEntry;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f15516;
        FileEntry fileEntry = this.f15515;
        switch (i) {
            case 0:
                if (obj != null) {
                    C2942.m6394();
                } else {
                    FileAlterationObserver.lambda$fireOnCreate$3(fileEntry, null);
                }
                break;
            default:
                if (obj != null) {
                    C2942.m6394();
                } else {
                    FileAlterationObserver.lambda$fireOnDelete$4(fileEntry, null);
                }
                break;
        }
    }
}
