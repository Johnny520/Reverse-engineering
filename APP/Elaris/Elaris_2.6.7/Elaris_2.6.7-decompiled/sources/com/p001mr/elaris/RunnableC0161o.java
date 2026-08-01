package com.p001mr.elaris;

import p000.C0534x9;

/* JADX INFO: renamed from: com.mr.elaris.o */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0161o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0534x9 f139b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0161o(ClassLoader classLoader, C0534x9 c0534x9) {
        this.f138a = classLoader;
        this.f139b = c0534x9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        MessageRepeater.repeat(this.f138a, this.f139b);
    }
}
