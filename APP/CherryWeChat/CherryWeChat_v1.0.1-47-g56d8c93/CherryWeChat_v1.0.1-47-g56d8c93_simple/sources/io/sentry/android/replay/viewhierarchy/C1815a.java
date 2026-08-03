package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import java.lang.reflect.Method;
import p000.AbstractC0073Bn;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1815a extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public static final C1815a f6575b = null;

    static {
        f6575b = new C1815a(0);
    }

    /* JADX INFO: renamed from: c */
    public static Method m3985c() {
        Method r1 = LayoutNode.class.getDeclaredMethod("getSemanticsConfiguration", null);     // Catch: Throwable -> L5
        r1.setAccessible(true);     // Catch: Throwable -> L5
        return r1;
    L5:
        return null;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6a() {
        return m3985c();
    }
}
