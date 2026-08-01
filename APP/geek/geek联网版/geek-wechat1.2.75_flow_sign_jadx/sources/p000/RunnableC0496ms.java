package p000;

import com.github.megatronking.stringfog.Base64;
import io.fastkv.MPFastKV;

/* JADX INFO: renamed from: ms */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0496ms implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MPFastKV f3191b;

    public /* synthetic */ RunnableC0496ms(MPFastKV mPFastKV, int i) {
        this.f3190a = i;
        this.f3191b = mPFastKV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3190a) {
            case Base64.DEFAULT /* 0 */:
                this.f3191b.loadData();
                break;
            default:
                this.f3191b.updateFile();
                break;
        }
    }
}
