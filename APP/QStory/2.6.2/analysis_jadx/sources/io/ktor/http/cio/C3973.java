package io.ktor.http.cio;

import androidx.core.view.C2242;
import io.ktor.http.cio.internals.AbstractC3949;
import io.ktor.http.cio.internals.C3952;
import io.ktor.http.cio.internals.C3953;
import kotlin.NotImplementedError;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3973 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f12216;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f12217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3952 f12218;

    public C3973(C3952 c3952) {
        c3952.getClass();
        this.f12218 = c3952;
        this.f12216 = (int[]) AbstractC3974.f12219.mo8345();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int[] iArr = AbstractC3974.f12220;
        int i = this.f12217;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append((CharSequence) "");
            sb.append((CharSequence) m8389(i2));
            sb.append((CharSequence) " => ");
            sb.append((CharSequence) m8386(i2));
            sb.append((CharSequence) "\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3953 m8386(int i) {
        if (i < 0) {
            C5919.m11249("Failed requirement.");
            return null;
        }
        if (i >= this.f12217) {
            C5919.m11249("Failed requirement.");
            return null;
        }
        int i2 = i * 8;
        int[] iArr = this.f12216;
        return (C3953) this.f12218.subSequence(iArr[i2 + 4], iArr[i2 + 5]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8387() {
        this.f12217 = 0;
        int[] iArr = this.f12216;
        int[] iArr2 = AbstractC3974.f12220;
        this.f12216 = iArr2;
        if (iArr != iArr2) {
            AbstractC3974.f12219.mo8344(iArr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8388(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f12217;
        int i8 = i7 * 8;
        int[] iArr = this.f12216;
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
        this.f12217 = i7 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3953 m8389(int i) {
        if (i < 0) {
            C5919.m11249("Failed requirement.");
            return null;
        }
        if (i >= this.f12217) {
            C5919.m11249("Failed requirement.");
            return null;
        }
        int i2 = i * 8;
        int[] iArr = this.f12216;
        return (C3953) this.f12218.subSequence(iArr[i2 + 2], iArr[i2 + 3]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3953 m8390(String str) {
        C2242 c2242 = AbstractC3949.f12159;
        int iM8342 = AbstractC3949.m8342(str, 0, str.length());
        int i = this.f12217;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 8;
            int[] iArr = this.f12216;
            if (iArr[i3] == iM8342) {
                return (C3953) this.f12218.subSequence(iArr[i3 + 4], iArr[i3 + 5]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8391(int i) {
        C2242 c2242 = AbstractC3949.f12159;
        int iM8342 = AbstractC3949.m8342("Content-Length", 0, "Content-Length".length());
        int i2 = this.f12217;
        while (i < i2) {
            if (this.f12216[i * 8] == iM8342) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
