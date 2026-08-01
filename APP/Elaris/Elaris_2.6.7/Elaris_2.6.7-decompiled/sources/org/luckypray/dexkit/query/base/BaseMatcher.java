package org.luckypray.dexkit.query.base;

import p000.C0038c5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMatcher implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ int build$dexkit_android_release(C0038c5 c0038c5) {
        c0038c5.getClass();
        return innerBuild(c0038c5);
    }

    public abstract int innerBuild(C0038c5 c0038c5);
}
