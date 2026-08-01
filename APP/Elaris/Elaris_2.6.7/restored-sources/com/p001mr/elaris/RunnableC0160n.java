package com.p001mr.elaris;

import android.content.Context;

/* JADX INFO: renamed from: com.mr.elaris.n */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0160n implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f134a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f135b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f136c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f137d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0160n(ClassLoader classLoader, Context context, Object obj, boolean z) {
        this.f134a = classLoader;
        this.f135b = context;
        this.f136c = obj;
        this.f137d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        MessageRepeater.repeat(this.f134a, this.f135b, this.f136c, this.f137d);
    }
}
