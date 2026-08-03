package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3783 extends AbstractC3781 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f6966;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f6967;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f6968;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f6969;

    public C3783(char c, char c2, int i) {
        this.f6966 = i;
        this.f6967 = c2;
        boolean z = false;
        if (i <= 0 ? C5499.m17107(c, c2) >= 0 : C5499.m17107(c, c2) <= 0) {
            z = true;
        }
        this.f6968 = z;
        this.f6969 = z ? c : c2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6968;
    }

    @Override // Yue.AbstractC3781
    /* JADX INFO: renamed from: ۥ۟ */
    public char mo467() {
        int i = this.f6969;
        if (i != this.f6967) {
            this.f6969 = this.f6966 + i;
        } else {
            if (!this.f6968) {
                throw new NoSuchElementException();
            }
            this.f6968 = false;
        }
        return (char) i;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m10380() {
        return this.f6966;
    }
}
