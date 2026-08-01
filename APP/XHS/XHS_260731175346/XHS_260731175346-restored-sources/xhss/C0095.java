package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲁᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0095 extends java.io.IOException {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f452;

    public C0095(int r3) {
            r2 = this;
            switch(r3) {
                case 1: goto L2d;
                case 2: goto L2a;
                case 3: goto L27;
                case 4: goto L24;
                case 5: goto L21;
                case 6: goto L1e;
                case 7: goto L1b;
                case 8: goto L18;
                case 9: goto L15;
                case 10: goto L12;
                case 11: goto Lf;
                case 12: goto Lc;
                case 13: goto L9;
                case 14: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "null"
            goto L2f
        L6:
            java.lang.String r0 = "HTTP_1_1_REQUIRED"
            goto L2f
        L9:
            java.lang.String r0 = "INADEQUATE_SECURITY"
            goto L2f
        Lc:
            java.lang.String r0 = "ENHANCE_YOUR_CALM"
            goto L2f
        Lf:
            java.lang.String r0 = "CONNECT_ERROR"
            goto L2f
        L12:
            java.lang.String r0 = "COMPRESSION_ERROR"
            goto L2f
        L15:
            java.lang.String r0 = "CANCEL"
            goto L2f
        L18:
            java.lang.String r0 = "REFUSED_STREAM"
            goto L2f
        L1b:
            java.lang.String r0 = "FRAME_SIZE_ERROR"
            goto L2f
        L1e:
            java.lang.String r0 = "STREAM_CLOSED"
            goto L2f
        L21:
            java.lang.String r0 = "SETTINGS_TIMEOUT"
            goto L2f
        L24:
            java.lang.String r0 = "FLOW_CONTROL_ERROR"
            goto L2f
        L27:
            java.lang.String r0 = "INTERNAL_ERROR"
            goto L2f
        L2a:
            java.lang.String r0 = "PROTOCOL_ERROR"
            goto L2f
        L2d:
            java.lang.String r0 = "NO_ERROR"
        L2f:
            java.lang.String r1 = "stream was reset: "
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            r2.f452 = r3
            return
    }
}
