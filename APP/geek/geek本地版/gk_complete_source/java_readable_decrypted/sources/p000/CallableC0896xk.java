package p000;

import android.content.Context;
import com.github.megatronking.stringfog.Base64;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: xk */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0896xk implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f5168b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f5169c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0914y1 f5170d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5171e;

    public /* synthetic */ CallableC0896xk(String str, Context context, C0914y1 c0914y1, int i, int i2) {
        this.f5167a = i2;
        this.f5168b = str;
        this.f5169c = context;
        this.f5170d = c0914y1;
        this.f5171e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5167a) {
            case Base64.DEFAULT /* 0 */:
                return AbstractC0022al.m112a(this.f5168b, this.f5169c, this.f5170d, this.f5171e);
            default:
                try {
                    return AbstractC0022al.m112a(this.f5168b, this.f5169c, this.f5170d, this.f5171e);
                } catch (Throwable unused) {
                    return new C0970zk(-3);
                }
        }
    }
}
