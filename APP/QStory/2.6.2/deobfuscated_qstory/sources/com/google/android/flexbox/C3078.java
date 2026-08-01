package com.google.android.flexbox;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3078 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f9895;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f9896;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3078 c3078 = (C3078) obj;
        int i = this.f9895;
        int i2 = c3078.f9895;
        return i != i2 ? i - i2 : this.f9896 - c3078.f9896;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.f9895);
        sb.append(", index=");
        return AbstractC0053.m154(sb, this.f9896, '}');
    }
}
