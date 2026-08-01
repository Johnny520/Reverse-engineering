package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5668 implements InterfaceC5652 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f15589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5668 f15588 = new C5668(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5668 f15587 = new C5668(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5668 f15586 = new C5668(6);

    public C5668(int i) {
        this.f15589 = i;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10985(Calendar calendar, Appendable appendable) throws IOException {
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
        int i3 = this.f15589;
        if (i3 < 5) {
            return;
        }
        if (i3 == 6) {
            appendable.append(':');
        }
        FastDatePrinter.appendDigits(appendable, (i / 60000) - (i2 * 60));
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo10986() {
        return this.f15589;
    }
}
