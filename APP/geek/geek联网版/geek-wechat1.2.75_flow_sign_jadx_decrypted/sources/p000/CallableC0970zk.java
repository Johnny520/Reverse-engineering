package p000;

import android.content.Context;
import com.github.megatronking.stringfog.Base64;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: zk */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0970zk implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f5595b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f5596c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0914y1 f5597d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5598e;

    public /* synthetic */ CallableC0970zk(String str, Context context, C0914y1 c0914y1, int i, int i2) {
        this.f5594a = i2;
        this.f5595b = str;
        this.f5596c = context;
        this.f5597d = c0914y1;
        this.f5598e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5594a) {
            case Base64.DEFAULT /* 0 */:
                return AbstractC0108cl.m650a(this.f5595b, this.f5596c, this.f5597d, this.f5598e);
            default:
                try {
                    return AbstractC0108cl.m650a(this.f5595b, this.f5596c, this.f5597d, this.f5598e);
                } catch (Throwable unused) {
                    return new C0072bl(-3);
                }
        }
    }
}
