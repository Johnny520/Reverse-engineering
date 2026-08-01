package androidx.window.area;

import android.os.Binder;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.layout.C2598;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2564 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f7715 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2598 f7716;

    public C2564(C2598 c2598, Binder binder, WindowAreaComponent windowAreaComponent) {
        this.f7716 = c2598;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2564)) {
            return false;
        }
        C2564 c2564 = (C2564) obj;
        return this.f7716.equals(c2564.f7716) && AbstractC4394.m8917(this.f7715.entrySet(), c2564.f7715.entrySet());
    }

    public final int hashCode() {
        return this.f7715.entrySet().hashCode() + ((C2568.f7724.hashCode() + (this.f7716.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WindowAreaInfo{ Metrics: " + this.f7716 + ", type: " + C2568.f7724 + ", Capabilities: " + this.f7715.entrySet() + " }";
    }
}
