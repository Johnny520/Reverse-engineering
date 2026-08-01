// Decompiled by JEB v5.42.0.202606242140

package c.ˈˎ;

public final class CLS83 {
    public final byte[] FLD440;
    public final int FLD441;

    public CLS83(int v, byte[] arr_b) {
        this.FLD441 = v;
        this.FLD440 = arr_b;
    }

    public static CLS83[] MTH1909(byte[] arr_b, CLS87 ʿˊ0) {
        CLS86 ʿˊ$ـᵎ0 = ʿˊ0.MTH1933();
        CLS84[] arr_ʿˊ$ʻᵢ = ʿˊ$ـᵎ0.MTH1921();
        int v1 = 0;
        for(int v = 0; v < arr_ʿˊ$ʻᵢ.length; ++v) {
            v1 += arr_ʿˊ$ʻᵢ[v].MTH1915();
        }
        CLS83[] arr_ʻᵢ = new CLS83[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr_ʿˊ$ʻᵢ.length; ++v2) {
            CLS84 ʿˊ$ʻᵢ0 = arr_ʿˊ$ʻᵢ[v2];
            int v4 = 0;
            while(v4 < ʿˊ$ʻᵢ0.MTH1915()) {
                int v5 = ʿˊ$ʻᵢ0.MTH1914();
                arr_ʻᵢ[v3] = new CLS83(v5, new byte[ʿˊ$ـᵎ0.MTH1920() + v5]);
                ++v4;
                ++v3;
            }
        }
        int v6 = arr_ʻᵢ[0].FLD440.length - ʿˊ$ـᵎ0.MTH1920();
        int v7 = v6 - 1;
        int v9 = 0;
        for(int v8 = 0; v8 < v7; ++v8) {
            int v10 = 0;
            while(v10 < v3) {
                arr_ʻᵢ[v10].FLD440[v8] = arr_b[v9];
                ++v10;
                ++v9;
            }
        }
        boolean z = ʿˊ0.MTH1928() == 24;
        int v11 = 0;
        while(v11 < (z ? 8 : v3)) {
            arr_ʻᵢ[v11].FLD440[v7] = arr_b[v9];
            ++v11;
            ++v9;
        }
        while(v6 < arr_ʻᵢ[0].FLD440.length) {
            int v12 = 0;
            while(v12 < v3) {
                int v13 = z ? (v12 + 8) % v3 : v12;
                arr_ʻᵢ[v13].FLD440[(!z || v13 <= 7 ? v6 : v6 - 1)] = arr_b[v9];
                ++v12;
                ++v9;
            }
            ++v6;
        }
        if(v9 != arr_b.length) {
            throw new IllegalArgumentException();
        }
        return arr_ʻᵢ;
    }

    public byte[] MTH1910() {
        return this.FLD440;
    }

    public int MTH1911() {
        return this.FLD441;
    }
}

