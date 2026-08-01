package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5651 implements InterfaceC5653 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String[] f15551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f15552;

    public C5651(String[] strArr, int i) {
        this.f15552 = i;
        this.f15551 = strArr;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5653
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11042(Calendar calendar, Appendable appendable) throws IOException {
        appendable.append(this.f15551[calendar.get(this.f15552)]);
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5653
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11043() {
        String[] strArr = this.f15551;
        int length = strArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int length2 = strArr[length].length();
            if (length2 > i) {
                i = length2;
            }
        }
    }
}
