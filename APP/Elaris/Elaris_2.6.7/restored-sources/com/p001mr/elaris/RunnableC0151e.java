package com.p001mr.elaris;

import p000.AbstractC0497v4;

/* JADX INFO: renamed from: com.mr.elaris.e */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0151e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f119a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0151e(ClassLoader classLoader) {
        this.f119a = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zBool = HookEntry.CONFIG.bool(Prefs.KEY_BLOCK_AVATAR_PENDANT);
        ClassLoader classLoader = this.f119a;
        if (zBool) {
            AbstractC0497v4.m1102u(classLoader);
        }
        if (HookEntry.CONFIG.bool(Prefs.KEY_BLOCK_PROFILE_CARD_DECOR)) {
            AbstractC0497v4.m1104w(classLoader);
        }
        if (HookEntry.CONFIG.bool(Prefs.KEY_ALLOW_FORBID_CARD)) {
            AbstractC0497v4.m1099r(classLoader);
        }
    }
}
