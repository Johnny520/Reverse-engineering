package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,649:1\n13384#2,3:650\n13384#2,3:653\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n584#1:650,3\n603#1:653,3\n*E\n"})
public final class C3512 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final byte[] f349;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final int[] f350;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final byte[] f5925;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final int[] f5926;

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟ۢ۟۟.ۥ۟۠ۢ۠(int[], int, int, int, int, java.lang.Object):void */
    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, C4750.f10554};
        f349 = bArr;
        int[] iArr = new int[256];
        int i = 0;
        C3404.m7199(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            iArr[bArr[i2]] = i3;
            i2++;
            i3++;
        }
        f350 = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f5925 = bArr2;
        int[] iArr2 = new int[256];
        C3404.m7199(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i4 = 0;
        while (i < length2) {
            iArr2[bArr2[i]] = i4;
            i++;
            i4++;
        }
        f5926 = iArr2;
    }

    @InterfaceC4765
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m9404() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m9405() {
    }

    @InterfaceC4765
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m9406() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m9407() {
    }

    @InterfaceC4765
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m9408(int i) {
        if (i >= 0) {
            int[] iArr = f350;
            if (i < iArr.length && iArr[i] != -1) {
                return true;
            }
        }
        return false;
    }
}
