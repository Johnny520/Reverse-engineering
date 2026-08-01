package p019b4;

import android.view.View;
import p336x3.AbstractC9432w;

/* JADX INFO: renamed from: b4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0991a {

    /* JADX INFO: renamed from: a */
    public static final int f3055a = AbstractC0994d.f3059b;

    /* JADX INFO: renamed from: b */
    public static final int f3056b = AbstractC0994d.f3058a;

    /* JADX INFO: renamed from: a */
    public static final void m3677a(View view, InterfaceC0992b interfaceC0992b) {
        view.getClass();
        interfaceC0992b.getClass();
        m3678b(view).m3682a(interfaceC0992b);
    }

    /* JADX INFO: renamed from: b */
    public static final C0993c m3678b(View view) {
        int i10 = f3055a;
        C0993c c0993c = (C0993c) view.getTag(i10);
        if (c0993c != null) {
            return c0993c;
        }
        C0993c c0993c2 = new C0993c();
        view.setTag(i10, c0993c2);
        return c0993c2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3679c(View view) {
        view.getClass();
        Object tag = view.getTag(f3056b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m3680d(View view) {
        view.getClass();
        for (Object obj : AbstractC9432w.m36702a(view)) {
            if ((obj instanceof View) && m3679c((View) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final void m3681e(View view, InterfaceC0992b interfaceC0992b) {
        view.getClass();
        interfaceC0992b.getClass();
        m3678b(view).m3683b(interfaceC0992b);
    }
}
