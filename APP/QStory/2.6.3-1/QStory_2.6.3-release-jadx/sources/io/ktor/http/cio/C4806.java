package io.ktor.http.cio;

import androidx.core.view.C3075;
import io.ktor.http.cio.internals.AbstractC4782;
import io.ktor.http.cio.internals.C4785;
import io.ktor.http.cio.internals.C4786;
import kotlin.NotImplementedError;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4806 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f12565;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f12566;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4785 f12567;

    public C4806(C4785 c4785) {
        c4785.getClass();
        this.f12567 = c4785;
        this.f12565 = (int[]) AbstractC4807.f12568.mo8894();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int[] iArr = AbstractC4807.f12569;
        int i = this.f12566;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append((CharSequence) "");
            sb.append((CharSequence) m8938(i2));
            sb.append((CharSequence) " => ");
            sb.append((CharSequence) m8935(i2));
            sb.append((CharSequence) "\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4786 m8935(int i) {
        if (i < 0) {
            C6755.m11869("Failed requirement.");
            return null;
        }
        if (i >= this.f12566) {
            C6755.m11869("Failed requirement.");
            return null;
        }
        int i2 = i * 8;
        int[] iArr = this.f12565;
        return (C4786) this.f12567.subSequence(iArr[i2 + 4], iArr[i2 + 5]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8936() {
        this.f12566 = 0;
        int[] iArr = this.f12565;
        int[] iArr2 = AbstractC4807.f12569;
        this.f12565 = iArr2;
        if (iArr != iArr2) {
            AbstractC4807.f12568.mo8893(iArr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8937(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f12566;
        int i8 = i7 * 8;
        int[] iArr = this.f12565;
        if (i8 >= iArr.length) {
            throw new NotImplementedError("An operation is not implemented: Implement headers overflow");
        }
        iArr[i8] = i;
        iArr[i8 + 1] = i2;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = i4;
        iArr[i8 + 4] = i5;
        iArr[i8 + 5] = i6;
        iArr[i8 + 6] = -1;
        iArr[i8 + 7] = -1;
        this.f12566 = i7 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4786 m8938(int i) {
        if (i < 0) {
            C6755.m11869("Failed requirement.");
            return null;
        }
        if (i >= this.f12566) {
            C6755.m11869("Failed requirement.");
            return null;
        }
        int i2 = i * 8;
        int[] iArr = this.f12565;
        return (C4786) this.f12567.subSequence(iArr[i2 + 2], iArr[i2 + 3]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4786 m8939(String str) {
        C3075 c3075 = AbstractC4782.f12508;
        int iM8891 = AbstractC4782.m8891(str, 0, str.length());
        int i = this.f12566;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 8;
            int[] iArr = this.f12565;
            if (iArr[i3] == iM8891) {
                return (C4786) this.f12567.subSequence(iArr[i3 + 4], iArr[i3 + 5]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8940(int i) {
        C3075 c3075 = AbstractC4782.f12508;
        int iM8891 = AbstractC4782.m8891("Content-Length", 0, "Content-Length".length());
        int i2 = this.f12566;
        while (i < i2) {
            if (this.f12565[i * 8] == iM8891) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
