package p000a;

import android.content.Context;
import java.util.concurrent.Callable;
import p000a.C0314R6;

/* JADX INFO: renamed from: a.N6 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0243N6 implements Callable<C0314R6.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f846a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f847b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0225M6 f848c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f849d;

    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public CallableC0243N6(String str, Context context, C0225M6 c0225m6, int i) {
        this.f846a = str;
        this.f847b = context;
        this.f848c = c0225m6;
        this.f849d = i;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final C0314R6.a call() {
        return C0314R6.m857a(this.f846a, this.f847b, this.f848c, this.f849d);
    }
}
