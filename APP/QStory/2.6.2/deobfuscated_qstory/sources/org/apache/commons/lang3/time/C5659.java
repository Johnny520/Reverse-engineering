package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5659 implements InterfaceC5652 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f15567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5659 f15566 = new C5659(true);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5659 f15565 = new C5659(false);

    public C5659(boolean z) {
        this.f15567 = z;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10985(Calendar calendar, Appendable appendable) throws IOException {
        int i = calendar.get(16) + calendar.get(15);
        if (i < 0) {
            appendable.append(SignatureVisitor.SUPER);
            i = -i;
        } else {
            appendable.append(SignatureVisitor.EXTENDS);
        }
        int i2 = i / 3600000;
        FastDatePrinter.appendDigits(appendable, i2);
        if (this.f15567) {
            appendable.append(':');
        }
        FastDatePrinter.appendDigits(appendable, (i / 60000) - (i2 * 60));
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo10986() {
        return 5;
    }
}
