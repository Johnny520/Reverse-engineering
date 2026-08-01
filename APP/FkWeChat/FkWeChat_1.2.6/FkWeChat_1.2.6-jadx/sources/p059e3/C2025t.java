package p059e3;

import android.graphics.Typeface;
import androidx.compose.runtime.InterfaceC0564p5;

/* JADX INFO: renamed from: e3.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2025t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0564p5 f5617a;

    /* JADX INFO: renamed from: b */
    public final C2025t f5618b;

    /* JADX INFO: renamed from: c */
    public final Object f5619c;

    public C2025t(InterfaceC0564p5 interfaceC0564p5, C2025t c2025t) {
        this.f5617a = interfaceC0564p5;
        this.f5618b = c2025t;
        this.f5619c = interfaceC0564p5.getValue();
    }

    /* JADX INFO: renamed from: a */
    public final Typeface m7290a() {
        Object obj = this.f5619c;
        obj.getClass();
        return (Typeface) obj;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7291b() {
        if (this.f5617a.getValue() != this.f5619c) {
            return true;
        }
        C2025t c2025t = this.f5618b;
        return c2025t != null && c2025t.m7291b();
    }
}
