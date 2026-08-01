package p000;

import com.github.megatronking.stringfog.Base64;
import io.fastkv.FastKV;

/* JADX INFO: renamed from: sj */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0710sj implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4440a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastKV f4441b;

    public /* synthetic */ RunnableC0710sj(FastKV fastKV, int i) {
        this.f4440a = i;
        this.f4441b = fastKV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4440a) {
            case Base64.DEFAULT /* 0 */:
                this.f4441b.writeToCFile();
                break;
            default:
                this.f4441b.loadData();
                break;
        }
    }
}
