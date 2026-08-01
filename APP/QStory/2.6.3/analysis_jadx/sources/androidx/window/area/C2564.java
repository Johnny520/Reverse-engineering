package androidx.window.area;

import android.os.Binder;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.layout.C2599;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2564 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f7716 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2599 f7717;

    public C2564(C2599 c2599, Binder binder, WindowAreaComponent windowAreaComponent) {
        this.f7717 = c2599;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2564)) {
            return false;
        }
        C2564 c2564 = (C2564) obj;
        return this.f7717.equals(c2564.f7717) && AbstractC4395.m8907(this.f7716.entrySet(), c2564.f7716.entrySet());
    }

    public final int hashCode() {
        return this.f7716.entrySet().hashCode() + ((C2565.f7718.hashCode() + (this.f7717.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WindowAreaInfo{ Metrics: " + this.f7717 + ", type: " + C2565.f7718 + ", Capabilities: " + this.f7716.entrySet() + " }";
    }
}
