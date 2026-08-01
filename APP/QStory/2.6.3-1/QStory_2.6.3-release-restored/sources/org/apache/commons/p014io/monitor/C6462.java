package org.apache.commons.p014io.monitor;

import com.alibaba.fastjson2.C3775;
import java.util.function.Consumer;

/* JADX INFO: renamed from: org.apache.commons.io.monitor.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6462 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ FileEntry f15860;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15861;

    public /* synthetic */ C6462(FileEntry fileEntry, int i) {
        this.f15861 = i;
        this.f15860 = fileEntry;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f15861;
        FileEntry fileEntry = this.f15860;
        switch (i) {
            case 0:
                if (obj != null) {
                    C3775.m6954();
                } else {
                    FileAlterationObserver.lambda$fireOnCreate$3(fileEntry, null);
                }
                break;
            default:
                if (obj != null) {
                    C3775.m6954();
                } else {
                    FileAlterationObserver.lambda$fireOnDelete$4(fileEntry, null);
                }
                break;
        }
    }
}
