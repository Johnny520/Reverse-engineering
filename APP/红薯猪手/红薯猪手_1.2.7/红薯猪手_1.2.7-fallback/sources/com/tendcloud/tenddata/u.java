package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class u {
    private static final java.lang.String a = "RC4/ECB/NoPadding";
    private static final java.lang.String b = "ARCFOUR";
    private static final java.lang.String c = "r5czusfu0wjcaz4pp01v2k7qte55xc25fngq4ylby2civ230vdy6uy6goz9w4kgfqjk31l8khfzfvbxj7emcprjyy8nngf0r9dvxzwbhm2uw7ljre52jt95lg0knyp8e5c4go44s3z5ciy58h0tuosmwhupa62rdnkeicgdba6w6f0kenp0xac7so8j1vdbjpqwyprx2ouenv22isustwnpltt9ui5plnijd4bq4013o3mzdkllozn26zwds9x38";
    private static final byte[] d = null;

    static {
            java.lang.String r0 = "r5czusfu0wjcaz4pp01v2k7qte55xc25fngq4ylby2civ230vdy6uy6goz9w4kgfqjk31l8khfzfvbxj7emcprjyy8nngf0r9dvxzwbhm2uw7ljre52jt95lg0knyp8e5c4go44s3z5ciy58h0tuosmwhupa62rdnkeicgdba6w6f0kenp0xac7so8j1vdbjpqwyprx2ouenv22isustwnpltt9ui5plnijd4bq4013o3mzdkllozn26zwds9x38"
            byte[] r0 = r0.getBytes()
            com.tendcloud.tenddata.u.d = r0
            return
    }

    public u() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] a(byte[] r4) {
            java.lang.String r0 = "RC4/ECB/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            byte[] r2 = com.tendcloud.tenddata.u.d
            java.lang.String r3 = "ARCFOUR"
            r1.<init>(r2, r3)
            r2 = 1
            r0.init(r2, r1)
            byte[] r4 = r0.doFinal(r4)
            return r4
    }

    public static byte[] a(byte[] r3, java.lang.String r4) {
            java.lang.String r0 = "RC4/ECB/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            byte[] r4 = r4.getBytes()
            java.lang.String r2 = "ARCFOUR"
            r1.<init>(r4, r2)
            r4 = 1
            r0.init(r4, r1)
            byte[] r3 = r0.doFinal(r3)
            return r3
    }

    public static byte[] b(byte[] r4) {
            java.lang.String r0 = "RC4/ECB/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            byte[] r2 = com.tendcloud.tenddata.u.d
            java.lang.String r3 = "ARCFOUR"
            r1.<init>(r2, r3)
            r2 = 2
            r0.init(r2, r1)
            byte[] r4 = r0.doFinal(r4)
            return r4
    }

    public static byte[] b(byte[] r3, java.lang.String r4) {
            java.lang.String r0 = "RC4/ECB/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            byte[] r4 = r4.getBytes()
            java.lang.String r2 = "ARCFOUR"
            r1.<init>(r4, r2)
            r4 = 2
            r0.init(r4, r1)
            byte[] r3 = r0.doFinal(r3)
            return r3
    }
}
