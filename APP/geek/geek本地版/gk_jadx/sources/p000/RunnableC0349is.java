package p000;

import com.github.megatronking.stringfog.Base64;
import io.fastkv.MPFastKV;

/* JADX INFO: renamed from: is */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0349is implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2499a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MPFastKV f2500b;

    public /* synthetic */ RunnableC0349is(MPFastKV mPFastKV, int i) {
        this.f2499a = i;
        this.f2500b = mPFastKV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2499a) {
            case Base64.DEFAULT /* 0 */:
                this.f2500b.loadData();
                break;
            default:
                this.f2500b.updateFile();
                break;
        }
    }
}
