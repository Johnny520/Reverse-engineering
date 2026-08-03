package p000A;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: A.g */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0006g implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f16b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f17c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0005f f18d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f19e;

    public /* synthetic */ CallableC0006g(String str, Context context, C0005f c0005f, int i2, int i3) {
        this.f15a = i3;
        this.f16b = str;
        this.f17c = context;
        this.f18d = c0005f;
        this.f19e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15a) {
            case 0:
                return AbstractC0009j.m17a(this.f16b, this.f17c, this.f18d, this.f19e);
            default:
                try {
                    return AbstractC0009j.m17a(this.f16b, this.f17c, this.f18d, this.f19e);
                } catch (Throwable unused) {
                    return new C0008i(-3);
                }
        }
    }
}
