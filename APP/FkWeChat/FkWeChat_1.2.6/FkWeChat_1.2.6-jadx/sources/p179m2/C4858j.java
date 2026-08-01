package p179m2;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: m2.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4858j implements InterfaceC4853i {

    /* JADX INFO: renamed from: b */
    public static final a f14455b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f14456c = 8;

    /* JADX INFO: renamed from: a */
    public final AccessibilityManager f14457a;

    public C4858j(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.f14457a = (AccessibilityManager) systemService;
    }

    /* JADX INFO: renamed from: m2.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
