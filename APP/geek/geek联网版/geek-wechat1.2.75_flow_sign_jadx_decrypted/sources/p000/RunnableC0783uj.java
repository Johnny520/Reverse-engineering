package p000;

import com.github.megatronking.stringfog.Base64;
import io.fastkv.FastKV;

/* JADX INFO: renamed from: uj */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0783uj implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastKV f4831b;

    public /* synthetic */ RunnableC0783uj(FastKV fastKV, int i) {
        this.f4830a = i;
        this.f4831b = fastKV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4830a) {
            case Base64.DEFAULT /* 0 */:
                this.f4831b.writeToCFile();
                break;
            default:
                this.f4831b.loadData();
                break;
        }
    }
}
