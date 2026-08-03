package org.luckypray.dexkit.query.base;

import com.google.flatbuffers.C0733b;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseQuery implements IQuery {
    public BaseQuery() {
    }

    public static final /* synthetic */ int access$innerBuild(BaseQuery r02, C0733b r1) {
        return r02.innerBuild(r1);
    }

    private final int build$dexkit_android_release(C0733b r2) {
        AbstractC0307g.m703e(r2, "fbb");
        return access$innerBuild(this, r2);
    }

    public abstract int innerBuild(C0733b r1);
}
