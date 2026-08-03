package p245qc;

/* JADX INFO: renamed from: qc.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3492b {

    /* JADX INFO: renamed from: a */
    public final int[] f11352a;

    /* JADX INFO: renamed from: b */
    public final String[] f11353b;

    /* JADX INFO: renamed from: c */
    public final int f11354c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3492b(int[] iArr, String[] strArr, int i9) {
        this.f11352a = iArr;
        this.f11353b = strArr;
        this.f11354c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Catch:");
        String[] strArr = this.f11353b;
        int length = strArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            sb2.append(' ');
            sb2.append(strArr[i9]);
            sb2.append("->");
            sb2.append(String.format("0x%04x", Integer.valueOf(this.f11352a[i9])));
        }
        int i10 = this.f11354c;
        if (i10 != -1) {
            sb2.append(" all->");
            sb2.append(String.format("0x%04x", Integer.valueOf(i10)));
        }
        return sb2.toString();
    }
}
