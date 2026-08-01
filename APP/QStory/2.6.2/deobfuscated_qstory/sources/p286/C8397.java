package p286;

import android.text.TextUtils;
import androidx.activity.AbstractC0053;
import p075.C6957;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8397 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C6957 f23274 = new C6957(21);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile byte[] f23275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f23276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8390 f23277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f23278;

    public C8397(String str, Object obj, InterfaceC8390 interfaceC8390) {
        if (TextUtils.isEmpty(str)) {
            C5919.m11249("Must not be null or empty");
            throw null;
        }
        this.f23276 = str;
        this.f23278 = obj;
        this.f23277 = interfaceC8390;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8397 m13948(Object obj, String str) {
        return new C8397(str, obj, f23274);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8397) {
            return this.f23276.equals(((C8397) obj).f23276);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23276.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m146(new StringBuilder("Option{key='"), this.f23276, "'}");
    }
}
