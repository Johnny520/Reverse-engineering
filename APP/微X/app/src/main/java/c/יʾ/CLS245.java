// Decompiled by JEB v5.42.0.202606242140

package c.יʾ;

public final class CLS245 {
    public final int FLD970;
    public final byte[] FLD971;

    public CLS245(int v, byte[] arr_b) {
        this.FLD970 = v;
        this.FLD971 = arr_b;
    }

    public int MTH3251() {
        return this.FLD970;
    }

    public byte[] MTH3252() {
        return this.FLD971;
    }

    public static CLS245[] MTH3253(byte[] arr_b, CLS242 ˈᴵ0) {
        CLS239 ˈᴵ$ʾʻ0 = ˈᴵ0.MTH3230();
        CLS241[] arr_ˈᴵ$ﾞⁱ = ˈᴵ$ʾʻ0.MTH3218();
        int v1 = 0;
        for(int v = 0; v < arr_ˈᴵ$ﾞⁱ.length; ++v) {
            v1 += arr_ˈᴵ$ﾞⁱ[v].MTH3222();
        }
        CLS245[] arr_ﾞⁱ = new CLS245[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr_ˈᴵ$ﾞⁱ.length; ++v2) {
            CLS241 ˈᴵ$ﾞⁱ0 = arr_ˈᴵ$ﾞⁱ[v2];
            int v4 = 0;
            while(v4 < ˈᴵ$ﾞⁱ0.MTH3222()) {
                int v5 = ˈᴵ$ﾞⁱ0.MTH3223();
                arr_ﾞⁱ[v3] = new CLS245(v5, new byte[ˈᴵ$ʾʻ0.MTH3219() + v5]);
                ++v4;
                ++v3;
            }
        }
        int v6 = arr_ﾞⁱ[0].FLD971.length - ˈᴵ$ʾʻ0.MTH3219();
        int v7 = v6 - 1;
        int v9 = 0;
        for(int v8 = 0; v8 < v7; ++v8) {
            int v10 = 0;
            while(v10 < v3) {
                arr_ﾞⁱ[v10].FLD971[v8] = arr_b[v9];
                ++v10;
                ++v9;
            }
        }
        boolean z = ˈᴵ0.MTH3228() == 24;
        int v11 = 0;
        while(v11 < (z ? 8 : v3)) {
            arr_ﾞⁱ[v11].FLD971[v7] = arr_b[v9];
            ++v11;
            ++v9;
        }
        while(v6 < arr_ﾞⁱ[0].FLD971.length) {
            int v12 = 0;
            while(v12 < v3) {
                int v13 = z ? (v12 + 8) % v3 : v12;
                arr_ﾞⁱ[v13].FLD971[(!z || v13 <= 7 ? v6 : v6 - 1)] = arr_b[v9];
                ++v12;
                ++v9;
            }
            ++v6;
        }
        if(v9 != arr_b.length) {
            throw new IllegalArgumentException();
        }
        return arr_ﾞⁱ;
    }
}

