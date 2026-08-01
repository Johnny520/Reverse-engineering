package androidx.window.area;

import android.os.Binder;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.layout.C3432;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3397 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f8061 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3432 f8062;

    public C3397(C3432 c3432, Binder binder, WindowAreaComponent windowAreaComponent) {
        this.f8062 = c3432;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3397)) {
            return false;
        }
        C3397 c3397 = (C3397) obj;
        return this.f8062.equals(c3397.f8062) && AbstractC5227.m9466(this.f8061.entrySet(), c3397.f8061.entrySet());
    }

    public final int hashCode() {
        return this.f8061.entrySet().hashCode() + ((C3398.f8063.hashCode() + (this.f8062.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WindowAreaInfo{ Metrics: " + this.f8062 + ", type: " + C3398.f8063 + ", Capabilities: " + this.f8061.entrySet() + " }";
    }
}
