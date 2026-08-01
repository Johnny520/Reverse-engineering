package io.ktor.http.cio;

import androidx.core.view.C2242;
import io.ktor.http.cio.internals.AbstractC3950;
import io.ktor.http.cio.internals.C3953;
import io.ktor.http.cio.internals.C3954;
import kotlin.NotImplementedError;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3974 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f12220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f12221;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3953 f12222;

    public C3974(C3953 c3953) {
        c3953.getClass();
        this.f12222 = c3953;
        this.f12220 = (int[]) AbstractC3975.f12223.mo8335();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int[] iArr = AbstractC3975.f12224;
        int i = this.f12221;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append((CharSequence) "");
            sb.append((CharSequence) m8379(i2));
            sb.append((CharSequence) " => ");
            sb.append((CharSequence) m8376(i2));
            sb.append((CharSequence) "\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3954 m8376(int i) {
        if (i < 0) {
            C5925.m11310("Failed requirement.");
            return null;
        }
        if (i >= this.f12221) {
            C5925.m11310("Failed requirement.");
            return null;
        }
        int i2 = i * 8;
        int[] iArr = this.f12220;
        return (C3954) this.f12222.subSequence(iArr[i2 + 4], iArr[i2 + 5]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8377() {
        this.f12221 = 0;
        int[] iArr = this.f12220;
        int[] iArr2 = AbstractC3975.f12224;
        this.f12220 = iArr2;
        if (iArr != iArr2) {
            AbstractC3975.f12223.mo8334(iArr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8378(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f12221;
        int i8 = i7 * 8;
        int[] iArr = this.f12220;
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
        this.f12221 = i7 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3954 m8379(int i) {
        if (i < 0) {
            C5925.m11310("Failed requirement.");
            return null;
        }
        if (i >= this.f12221) {
            C5925.m11310("Failed requirement.");
            return null;
        }
        int i2 = i * 8;
        int[] iArr = this.f12220;
        return (C3954) this.f12222.subSequence(iArr[i2 + 2], iArr[i2 + 3]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3954 m8380(String str) {
        C2242 c2242 = AbstractC3950.f12163;
        int iM8332 = AbstractC3950.m8332(str, 0, str.length());
        int i = this.f12221;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 8;
            int[] iArr = this.f12220;
            if (iArr[i3] == iM8332) {
                return (C3954) this.f12222.subSequence(iArr[i3 + 4], iArr[i3 + 5]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8381(int i) {
        C2242 c2242 = AbstractC3950.f12163;
        int iM8332 = AbstractC3950.m8332("Content-Length", 0, "Content-Length".length());
        int i2 = this.f12221;
        while (i < i2) {
            if (this.f12220[i * 8] == iM8332) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
