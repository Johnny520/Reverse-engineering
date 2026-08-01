package p000;

import com.github.megatronking.stringfog.Base64;
import io.fastkv.FastKV;

/* JADX INFO: renamed from: rj */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0673rj implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4287a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastKV f4288b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f4289c;

    public /* synthetic */ RunnableC0673rj(FastKV fastKV, String str, int i) {
        this.f4287a = i;
        this.f4288b = fastKV;
        this.f4289c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4287a) {
            case Base64.DEFAULT /* 0 */:
                this.f4288b.lambda$removeOldFile$2(this.f4289c);
                break;
            case Base64.NO_PADDING /* 1 */:
                this.f4288b.lambda$remove$0(this.f4289c);
                break;
            default:
                this.f4288b.lambda$clearDeletedFiles$1(this.f4289c);
                break;
        }
    }
}
