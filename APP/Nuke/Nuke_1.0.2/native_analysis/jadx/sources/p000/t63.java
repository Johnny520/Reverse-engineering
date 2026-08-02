package p000;

import java.util.Arrays;
import kotlin.UByteArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t63 extends c32 {

    /* JADX INFO: renamed from: a */
    public byte[] f10584a;

    /* JADX INFO: renamed from: b */
    public int f10585b;

    @Override // p000.c32
    /* JADX INFO: renamed from: a */
    public final Object mo628a() {
        return new UByteArray(Arrays.copyOf(this.f10584a, this.f10585b));
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: b */
    public final void mo629b(int i) {
        byte[] bArr = this.f10584a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f10584a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: d */
    public final int mo630d() {
        return this.f10585b;
    }
}
