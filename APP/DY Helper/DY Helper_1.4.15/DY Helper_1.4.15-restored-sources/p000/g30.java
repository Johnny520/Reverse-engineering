package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum g30 extends java.lang.Enum {

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ p000.g30[] f4219 = null;

    /* JADX INFO: renamed from: ε */
    public final p000.EnumC0491kx f4220;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f4221;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f4222;

    static {
            g30 r0 = new g30
            java.lang.String r6 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"
            java.lang.String r5 = p000.jf0.m2957(r6)
            java.lang.String r1 = "PLAY_H264"
            r2 = 0
            kx r3 = p000.EnumC0491kx.f6195
            java.lang.String r4 = "play_addr_h264"
            r0.<init>(r1, r2, r3, r4, r5)
            g30 r1 = new g30
            java.lang.String r11 = "play_addr"
            java.lang.String r12 = p000.jf0.m2957(r6)
            java.lang.String r8 = "PLAY"
            r9 = 1
            kx r10 = p000.EnumC0491kx.f6196
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            g30 r2 = new g30
            java.lang.String r11 = "play_addr_265"
            java.lang.String r12 = p000.jf0.m2957(r6)
            java.lang.String r8 = "PLAY_H265"
            r9 = 2
            kx r10 = p000.EnumC0491kx.f6197
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            g30 r3 = new g30
            java.lang.String r9 = "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"
            java.lang.String r8 = p000.jf0.m2957(r9)
            java.lang.String r4 = "PLAY_LOWBR"
            r5 = 3
            kx r6 = p000.EnumC0491kx.f6198
            java.lang.String r7 = "play_addr_lowbr"
            r3.<init>(r4, r5, r6, r7, r8)
            g30 r4 = new g30
            java.lang.String r14 = "bit_rate"
            java.lang.String r15 = "java.util.List"
            java.lang.String r11 = "BIT_RATE"
            r12 = 4
            kx r13 = p000.EnumC0491kx.f6199
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            g30 r5 = new g30
            java.lang.String r14 = "download_addr"
            java.lang.String r15 = p000.jf0.m2957(r9)
            java.lang.String r11 = "DOWNLOAD"
            r12 = 5
            kx r13 = p000.EnumC0491kx.f6200
            r10 = r5
            r10.<init>(r11, r12, r13, r14, r15)
            g30 r6 = new g30
            java.lang.String r14 = "new_download_addr"
            java.lang.String r15 = p000.jf0.m2957(r9)
            java.lang.String r11 = "NEW_DOWNLOAD"
            r12 = 6
            kx r13 = p000.EnumC0491kx.f6201
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            g30 r7 = new g30
            java.lang.String r11 = "has_watermark"
            java.lang.String r12 = "boolean"
            java.lang.String r8 = "HAS_WATERMARK"
            r9 = 7
            kx r10 = p000.EnumC0491kx.f6202
            r7.<init>(r8, r9, r10, r11, r12)
            g30[] r0 = new p000.g30[]{r0, r1, r2, r3, r4, r5, r6, r7}
            p000.g30.f4219 = r0
            return
    }

    g30(java.lang.String r1, int r2, p000.EnumC0491kx r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f4220 = r3
            r0.f4221 = r4
            r0.f4222 = r5
            return
    }

    public static p000.g30 valueOf(java.lang.String r1) {
            java.lang.Class<g30> r0 = p000.g30.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            g30 r1 = (p000.g30) r1
            return r1
    }

    public static p000.g30[] values() {
            g30[] r0 = p000.g30.f4219
            java.lang.Object r0 = r0.clone()
            g30[] r0 = (p000.g30[]) r0
            return r0
    }
}
