package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6504 extends AbstractC6507 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6504 f15941 = new C6504("(Z|(?:[+-]\\d{2}))");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6504 f15940 = new C6504("(Z|(?:[+-]\\d{2}\\d{2}))");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6504 f15939 = new C6504("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

    public C6504(String str) {
        this.f15946 = Pattern.compile(str);
    }

    @Override // org.apache.commons.lang3.time.AbstractC6507
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11607(Calendar calendar, String str) {
        calendar.setTimeZone(AbstractC6487.m11604(str));
    }
}
