package p000;

/* JADX INFO: renamed from: v8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0831v8 implements InterfaceC0794u8 {

    /* JADX INFO: renamed from: d */
    public final float f6441d;

    /* JADX INFO: renamed from: e */
    public final boolean f6442e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0904ww f6443f;

    /* JADX INFO: renamed from: g */
    public final float f6444g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0831v8(float f, boolean z, C0717s8 c0717s8) {
        this.f6441d = f;
        this.f6442e = z;
        this.f6443f = c0717s8;
        this.f6444g = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0794u8
    /* JADX INFO: renamed from: a */
    public final float mo3374a() {
        return this.f6444g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0794u8
    /* JADX INFO: renamed from: b */
    public final void mo3375b(zd0 zd0Var, int i, int[] iArr, k50 k50Var, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length == 0) {
            return;
        }
        int iMo641F = zd0Var.mo641F(this.f6441d);
        if (this.f6442e && k50Var == k50.f3016e) {
            int length = iArr.length - 1;
            i2 = 0;
            i3 = 0;
            while (-1 < length) {
                int i4 = iArr[length];
                int iMin = Math.min(i2, i - i4);
                iArr2[length] = iMin;
                int iMin2 = Math.min(iMo641F, (i - iMin) - i4);
                int i5 = iArr2[length] + i4 + iMin2;
                length--;
                i3 = iMin2;
                i2 = i5;
            }
        } else {
            int length2 = iArr.length;
            i2 = 0;
            i3 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                int i8 = iArr[i6];
                int iMin3 = Math.min(i2, i - i8);
                iArr2[i7] = iMin3;
                int iMin4 = Math.min(iMo641F, (i - iMin3) - i8);
                int i9 = iArr2[i7] + i8 + iMin4;
                i6++;
                i3 = iMin4;
                i2 = i9;
                i7++;
            }
        }
        int i10 = i2 - i3;
        InterfaceC0904ww interfaceC0904ww = this.f6443f;
        if (interfaceC0904ww == null || i10 >= i) {
            return;
        }
        int iIntValue = ((Number) interfaceC0904ww.invoke(Integer.valueOf(i - i10), k50Var)).intValue();
        int length3 = iArr2.length;
        for (int i11 = 0; i11 < length3; i11++) {
            iArr2[i11] = iArr2[i11] + iIntValue;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0831v8)) {
            return false;
        }
        C0831v8 c0831v8 = (C0831v8) obj;
        return C0520np.m2732b(this.f6441d, c0831v8.f6441d) && this.f6442e == c0831v8.f6442e && p30.m3002l(this.f6443f, c0831v8.f6443f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM4145c = AbstractC0748t1.m4145c(Float.hashCode(this.f6441d) * 31, 31, this.f6442e);
        InterfaceC0904ww interfaceC0904ww = this.f6443f;
        return iM4145c + (interfaceC0904ww == null ? 0 : interfaceC0904ww.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6442e ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) C0520np.m2733c(this.f6441d));
        sb.append(", ");
        sb.append(this.f6443f);
        sb.append(')');
        return sb.toString();
    }
}
