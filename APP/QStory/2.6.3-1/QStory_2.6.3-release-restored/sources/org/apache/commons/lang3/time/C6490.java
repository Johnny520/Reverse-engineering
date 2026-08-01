package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6490 implements InterfaceC6483 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f15912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6490 f15911 = new C6490(true);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6490 f15910 = new C6490(false);

    public C6490(boolean z) {
        this.f15912 = z;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11601(Calendar calendar, Appendable appendable) throws IOException {
        int i = calendar.get(16) + calendar.get(15);
        if (i < 0) {
            appendable.append(SignatureVisitor.SUPER);
            i = -i;
        } else {
            appendable.append(SignatureVisitor.EXTENDS);
        }
        int i2 = i / 3600000;
        FastDatePrinter.appendDigits(appendable, i2);
        if (this.f15912) {
            appendable.append(':');
        }
        FastDatePrinter.appendDigits(appendable, (i / 60000) - (i2 * 60));
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11602() {
        return 5;
    }
}
