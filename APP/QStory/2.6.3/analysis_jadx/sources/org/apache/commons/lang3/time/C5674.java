package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5674 extends AbstractC5677 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5674 f15596 = new C5674("(Z|(?:[+-]\\d{2}))");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5674 f15595 = new C5674("(Z|(?:[+-]\\d{2}\\d{2}))");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5674 f15594 = new C5674("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

    public C5674(String str) {
        this.f15601 = Pattern.compile(str);
    }

    @Override // org.apache.commons.lang3.time.AbstractC5677
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11048(Calendar calendar, String str) {
        calendar.setTimeZone(AbstractC5657.m11045(str));
    }
}
