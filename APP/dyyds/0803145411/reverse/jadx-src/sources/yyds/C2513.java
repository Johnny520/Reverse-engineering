package yyds;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲇᲀᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2513 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0119 f12380;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int[] f12381;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String[] f12382;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Set f12383;

    public C2513(C0119 c0119, int[] iArr, String[] strArr) {
        this.f12380 = c0119;
        this.f12381 = iArr;
        this.f12382 = strArr;
        if (iArr.length == strArr.length) {
            this.f12383 = !(strArr.length == 0) ? Collections.singleton(strArr[0]) : C1422.f6715;
        } else {
            C0188.m800("Check failed.");
            throw null;
        }
    }
}
