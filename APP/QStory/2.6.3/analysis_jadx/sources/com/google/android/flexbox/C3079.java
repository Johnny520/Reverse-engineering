package com.google.android.flexbox;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3079 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f9900;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f9901;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3079 c3079 = (C3079) obj;
        int i = this.f9900;
        int i2 = c3079.f9900;
        return i != i2 ? i - i2 : this.f9901 - c3079.f9901;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.f9900);
        sb.append(", index=");
        return AbstractC0053.m156(sb, this.f9901, '}');
    }
}
