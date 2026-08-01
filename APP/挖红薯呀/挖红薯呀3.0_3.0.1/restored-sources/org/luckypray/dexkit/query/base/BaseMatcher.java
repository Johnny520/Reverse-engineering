package org.luckypray.dexkit.query.base;

import p000.C0938xt;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMatcher implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ int build$dexkit_android_release(C0938xt c0938xt) {
        c0938xt.getClass();
        return innerBuild(c0938xt);
    }

    public abstract int innerBuild(C0938xt c0938xt);
}
