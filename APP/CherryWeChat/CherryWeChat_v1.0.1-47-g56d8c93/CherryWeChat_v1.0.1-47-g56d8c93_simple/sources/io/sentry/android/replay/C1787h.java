package io.sentry.android.replay;

import java.util.Map;
import p000.AbstractC0073Bn;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1787h extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public static final C1787h f6493b = null;

    static {
        f6493b = new C1787h(1);
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r3) {
        Map.Entry r32 = (Map.Entry) r3;
        return ((String) r32.getKey()) + '=' + ((String) r32.getValue());
    }
}
