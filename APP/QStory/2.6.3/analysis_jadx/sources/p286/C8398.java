package p286;

import android.text.TextUtils;
import androidx.activity.AbstractC0053;
import p075.C6958;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C6958 f23273 = new C6958(21);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile byte[] f23274;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f23275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8391 f23276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f23277;

    public C8398(String str, Object obj, InterfaceC8391 interfaceC8391) {
        if (TextUtils.isEmpty(str)) {
            C5925.m11310("Must not be null or empty");
            throw null;
        }
        this.f23275 = str;
        this.f23277 = obj;
        this.f23276 = interfaceC8391;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8398 m13965(Object obj, String str) {
        return new C8398(str, obj, f23273);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8398) {
            return this.f23275.equals(((C8398) obj).f23275);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23275.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m151(new StringBuilder("Option{key='"), this.f23275, "'}");
    }
}
