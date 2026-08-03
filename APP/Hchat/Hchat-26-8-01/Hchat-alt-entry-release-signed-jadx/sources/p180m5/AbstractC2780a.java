package p180m5;

import com.alibaba.fastjson2.JSONB;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: m5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2780a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f9020a = {100, 101, JSONB.Constants.BC_STR_ASCII_FIX_MAX, 10, 0, 0, 0, 0};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m6158a(byte[] bArr) {
        if (bArr.length < 8) {
            return -1;
        }
        int i9 = 0;
        while (true) {
            byte[] bArr2 = f9020a;
            if (i9 >= 4) {
                for (int i10 = 4; i10 < 7; i10++) {
                    byte b10 = bArr[i10];
                    if (b10 < 48 || b10 > 57) {
                        return -1;
                    }
                }
                if (bArr[7] != bArr2[7]) {
                    return -1;
                }
                return (bArr[6] - JSONB.Constants.BC_INT32_BYTE_MIN) + AbstractC3199a.m6853z(bArr[5], 48, 10, (bArr[4] - JSONB.Constants.BC_INT32_BYTE_MIN) * 100);
            }
            if (bArr[i9] != bArr2[i9]) {
                return -1;
            }
            i9++;
        }
    }
}
