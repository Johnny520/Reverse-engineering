package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6499 implements InterfaceC6483 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f15934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6499 f15933 = new C6499(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6499 f15932 = new C6499(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6499 f15931 = new C6499(6);

    public C6499(int i) {
        this.f15934 = i;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11601(Calendar calendar, Appendable appendable) throws IOException {
        int i = calendar.get(16) + calendar.get(15);
        if (i == 0) {
            appendable.append("Z");
            return;
        }
        if (i < 0) {
            appendable.append(SignatureVisitor.SUPER);
            i = -i;
        } else {
            appendable.append(SignatureVisitor.EXTENDS);
        }
        int i2 = i / 3600000;
        FastDatePrinter.appendDigits(appendable, i2);
        int i3 = this.f15934;
        if (i3 < 5) {
            return;
        }
        if (i3 == 6) {
            appendable.append(':');
        }
        FastDatePrinter.appendDigits(appendable, (i / 60000) - (i2 * 60));
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11602() {
        return this.f15934;
    }
}
