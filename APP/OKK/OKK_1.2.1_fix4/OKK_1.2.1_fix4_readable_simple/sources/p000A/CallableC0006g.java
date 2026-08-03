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

    public /* synthetic */ CallableC0006g(String r1, Context r2, C0005f r3, int r4, int r5) {
        this.f15a = r5;
        this.f16b = r1;
        this.f17c = r2;
        this.f18d = r3;
        this.f19e = r4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch(this.f15a) {
            case 0: goto L9;
            default: goto L10;
        };
    L10:
        return AbstractC0009j.m17a(this.f16b, this.f17c, this.f18d, this.f19e);
    L7:
        return new C0008i(-3);
    L9:
        return AbstractC0009j.m17a(this.f16b, this.f17c, this.f18d, this.f19e);
    }
}
