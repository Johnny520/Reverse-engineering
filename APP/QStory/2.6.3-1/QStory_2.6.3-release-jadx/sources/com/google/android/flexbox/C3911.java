package com.google.android.flexbox;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3911 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10245;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f10246;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3911 c3911 = (C3911) obj;
        int i = this.f10245;
        int i2 = c3911.f10245;
        return i != i2 ? i - i2 : this.f10246 - c3911.f10246;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.f10245);
        sb.append(", index=");
        return AbstractC0900.m716(sb, this.f10246, '}');
    }
}
