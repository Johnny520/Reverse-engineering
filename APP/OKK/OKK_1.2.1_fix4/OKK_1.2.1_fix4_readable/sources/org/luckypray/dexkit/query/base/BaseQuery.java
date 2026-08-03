package org.luckypray.dexkit.query.base;

import com.google.flatbuffers.C0733b;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseQuery implements IQuery {
    private final int build$dexkit_android_release(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        return innerBuild(c0733b);
    }

    public abstract int innerBuild(C0733b c0733b);
}
