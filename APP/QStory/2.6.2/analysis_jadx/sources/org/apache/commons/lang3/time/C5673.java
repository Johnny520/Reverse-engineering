package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5673 extends AbstractC5676 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5673 f15596 = new C5673("(Z|(?:[+-]\\d{2}))");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5673 f15595 = new C5673("(Z|(?:[+-]\\d{2}\\d{2}))");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5673 f15594 = new C5673("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

    public C5673(String str) {
        this.f15601 = Pattern.compile(str);
    }

    @Override // org.apache.commons.lang3.time.AbstractC5676
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo10991(Calendar calendar, String str) {
        calendar.setTimeZone(AbstractC5656.m10988(str));
    }
}
