package p000;

import com.github.megatronking.stringfog.Base64;
import io.fastkv.FastKV;

/* JADX INFO: renamed from: tj */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0746tj implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4526a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastKV f4527b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f4528c;

    public /* synthetic */ RunnableC0746tj(FastKV fastKV, String str, int i) {
        this.f4526a = i;
        this.f4527b = fastKV;
        this.f4528c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4526a) {
            case Base64.DEFAULT /* 0 */:
                this.f4527b.lambda$removeOldFile$2(this.f4528c);
                break;
            case Base64.NO_PADDING /* 1 */:
                this.f4527b.lambda$remove$0(this.f4528c);
                break;
            default:
                this.f4527b.lambda$clearDeletedFiles$1(this.f4528c);
                break;
        }
    }
}
