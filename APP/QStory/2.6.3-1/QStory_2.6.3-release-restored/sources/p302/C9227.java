package p302;

import android.text.TextUtils;
import androidx.activity.AbstractC0900;
import p091.C7787;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9227 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7787 f23618 = new C7787(21);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile byte[] f23619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f23620;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC9220 f23621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f23622;

    public C9227(String str, Object obj, InterfaceC9220 interfaceC9220) {
        if (TextUtils.isEmpty(str)) {
            C6755.m11869("Must not be null or empty");
            throw null;
        }
        this.f23620 = str;
        this.f23622 = obj;
        this.f23621 = interfaceC9220;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9227 m14524(Object obj, String str) {
        return new C9227(str, obj, f23618);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9227) {
            return this.f23620.equals(((C9227) obj).f23620);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23620.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m711(new StringBuilder("Option{key='"), this.f23620, "'}");
    }
}
