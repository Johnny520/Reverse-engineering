package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6481 implements InterfaceC6483 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String[] f15896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f15897;

    public C6481(String[] strArr, int i) {
        this.f15897 = i;
        this.f15896 = strArr;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11601(Calendar calendar, Appendable appendable) throws IOException {
        appendable.append(this.f15896[calendar.get(this.f15897)]);
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11602() {
        String[] strArr = this.f15896;
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
