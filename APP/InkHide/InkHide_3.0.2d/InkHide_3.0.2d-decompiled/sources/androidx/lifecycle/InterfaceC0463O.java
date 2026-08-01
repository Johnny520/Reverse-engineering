package androidx.lifecycle;

import p018J.C0158c;

/* JADX INFO: renamed from: androidx.lifecycle.O */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0463O {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    default AbstractC0460L mo313e(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    default AbstractC0460L mo137h(Class cls, C0158c c0158c) {
        return mo313e(cls);
    }
}
