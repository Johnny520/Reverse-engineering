package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: zn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0968zn extends c32 {

    /* JADX INFO: renamed from: a */
    public byte[] f13959a;

    /* JADX INFO: renamed from: b */
    public int f13960b;

    @Override // p000.c32
    /* JADX INFO: renamed from: a */
    public final Object mo628a() {
        return Arrays.copyOf(this.f13959a, this.f13960b);
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: b */
    public final void mo629b(int i) {
        byte[] bArr = this.f13959a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f13959a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: d */
    public final int mo630d() {
        return this.f13960b;
    }
}
