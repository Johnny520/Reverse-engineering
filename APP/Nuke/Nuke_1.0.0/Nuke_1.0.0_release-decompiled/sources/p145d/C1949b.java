package p145d;

import p030F1.C0438c;
import p135b.C1809A;

/* JADX INFO: renamed from: d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1949b {

    /* JADX INFO: renamed from: a */
    public final C0438c f6617a;

    /* JADX INFO: renamed from: b */
    public final C1809A f6618b;

    public C1949b(C0438c c0438c, C1809A c1809a) {
        this.f6617a = c0438c;
        this.f6618b = c1809a;
        if ((c0438c == null ? c1809a : c0438c) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }
}
