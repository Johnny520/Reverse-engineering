package p000a;

import android.content.Context;
import java.util.concurrent.Callable;
import p000a.C0314R6;

/* JADX INFO: renamed from: a.P6 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0279P6 implements Callable<C0314R6.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f969a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f970b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0225M6 f971c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f972d;

    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public CallableC0279P6(String str, Context context, C0225M6 c0225m6, int i) {
        this.f969a = str;
        this.f970b = context;
        this.f971c = c0225m6;
        this.f972d = i;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final C0314R6.a call() {
        try {
            return C0314R6.m857a(this.f969a, this.f970b, this.f971c, this.f972d);
        } catch (Throwable unused) {
            return new C0314R6.a(-3);
        }
    }
}
