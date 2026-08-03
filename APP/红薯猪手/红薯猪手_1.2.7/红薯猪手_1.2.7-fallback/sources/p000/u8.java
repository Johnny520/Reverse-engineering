package p000;

/* JADX INFO: loaded from: classes.dex */
public enum u8 extends java.lang.Enum<p000.u8> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ p000.u8[] f1081 = null;

    static {
            ۟.u8 r0 = new ۟.u8
            java.lang.String r1 = "IGNORE_CASE"
            r2 = 0
            r3 = 2
            r0.<init>(r1, r2, r3)
            ۟.u8 r1 = new ۟.u8
            java.lang.String r4 = "MULTILINE"
            r5 = 1
            r6 = 8
            r1.<init>(r4, r5, r6)
            ۟.u8 r4 = new ۟.u8
            java.lang.String r6 = "LITERAL"
            r7 = 16
            r4.<init>(r6, r3, r7)
            ۟.u8 r6 = new ۟.u8
            java.lang.String r7 = "UNIX_LINES"
            r8 = 3
            r6.<init>(r7, r8, r5)
            ۟.u8 r7 = new ۟.u8
            java.lang.String r9 = "COMMENTS"
            r10 = 4
            r7.<init>(r9, r10, r10)
            ۟.u8 r9 = new ۟.u8
            java.lang.String r11 = "DOT_MATCHES_ALL"
            r12 = 5
            r13 = 32
            r9.<init>(r11, r12, r13)
            ۟.u8 r11 = new ۟.u8
            java.lang.String r13 = "CANON_EQ"
            r14 = 6
            r15 = 128(0x80, float:1.8E-43)
            r11.<init>(r13, r14, r15)
            r13 = 7
            ۟.u8[] r13 = new p000.u8[r13]
            r13[r2] = r0
            r13[r5] = r1
            r13[r3] = r4
            r13[r8] = r6
            r13[r10] = r7
            r13[r12] = r9
            r13[r14] = r11
            p000.u8.f1081 = r13
            ۟.q2 r0 = new ۟.q2
            r0.<init>(r13)
            return
    }

    u8() {
            r0 = this;
            r0 = 0
            throw r0
    }

    u8(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static p000.u8 valueOf(java.lang.String r1) {
            java.lang.Class<۟.u8> r0 = p000.u8.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ۟.u8 r1 = (p000.u8) r1
            return r1
    }

    public static p000.u8[] values() {
            ۟.u8[] r0 = p000.u8.f1081
            java.lang.Object r0 = r0.clone()
            ۟.u8[] r0 = (p000.u8[]) r0
            return r0
    }
}
