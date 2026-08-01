package defpackage;

/* JADX INFO: renamed from: ᛲᛴᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0284 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f1566;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f1567;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f1568;

    public C0284(defpackage.C1564 r11) {
            r10 = this;
            r10.<init>()
            android.content.Context r0 = r11.f6922
            float r1 = r11.f6920
            android.app.ActivityManager r2 = r11.f6923
            boolean r3 = r2.isLowRamDevice()
            if (r3 == 0) goto L12
            r3 = 2097152(0x200000, float:2.938736E-39)
            goto L14
        L12:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L14:
            r10.f1566 = r3
            int r4 = r2.getMemoryClass()
            r5 = 1048576(0x100000, float:1.469368E-39)
            int r4 = r4 * r5
            boolean r5 = r2.isLowRamDevice()
            float r4 = (float) r4
            if (r5 == 0) goto L28
            r5 = 1051260355(0x3ea8f5c3, float:0.33)
            goto L2b
        L28:
            r5 = 1053609165(0x3ecccccd, float:0.4)
        L2b:
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)
            ᛶᲈᛱᲈ r11 = r11.f6921
            java.lang.Object r11 = r11.f5356
            android.util.DisplayMetrics r11 = (android.util.DisplayMetrics) r11
            int r5 = r11.widthPixels
            int r11 = r11.heightPixels
            int r5 = r5 * r11
            int r5 = r5 * 4
            float r11 = (float) r5
            float r5 = r11 * r1
            int r5 = java.lang.Math.round(r5)
            r6 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r6
            int r11 = java.lang.Math.round(r11)
            int r7 = r4 - r3
            int r8 = r11 + r5
            if (r8 > r7) goto L56
            r10.f1568 = r11
            r10.f1567 = r5
            goto L6b
        L56:
            float r11 = (float) r7
            float r5 = r1 + r6
            float r11 = r11 / r5
            float r6 = r6 * r11
            int r5 = java.lang.Math.round(r6)
            r10.f1568 = r5
            float r11 = r11 * r1
            int r11 = java.lang.Math.round(r11)
            r10.f1567 = r11
            r9 = r5
            r5 = r11
            r11 = r9
        L6b:
            r10 = 3
            java.lang.String r1 = "MemorySizeCalculator"
            boolean r10 = android.util.Log.isLoggable(r1, r10)
            if (r10 == 0) goto Ld6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r6 = "Calculation complete, Calculated memory cache size: "
            r10.<init>(r6)
            long r6 = (long) r11
            java.lang.String r11 = android.text.format.Formatter.formatFileSize(r0, r6)
            r10.append(r11)
            java.lang.String r11 = ", pool size: "
            r10.append(r11)
            long r5 = (long) r5
            java.lang.String r11 = android.text.format.Formatter.formatFileSize(r0, r5)
            r10.append(r11)
            java.lang.String r11 = ", byte array size: "
            r10.append(r11)
            long r5 = (long) r3
            java.lang.String r11 = android.text.format.Formatter.formatFileSize(r0, r5)
            r10.append(r11)
            java.lang.String r11 = ", memory class limited? "
            r10.append(r11)
            if (r8 <= r4) goto La6
            r11 = 1
            goto La7
        La6:
            r11 = 0
        La7:
            r10.append(r11)
            java.lang.String r11 = ", max size: "
            r10.append(r11)
            long r3 = (long) r4
            java.lang.String r11 = android.text.format.Formatter.formatFileSize(r0, r3)
            r10.append(r11)
            java.lang.String r11 = ", memoryClass: "
            r10.append(r11)
            int r11 = r2.getMemoryClass()
            r10.append(r11)
            java.lang.String r11 = ", isLowMemoryDevice: "
            r10.append(r11)
            boolean r11 = r2.isLowRamDevice()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r1, r10)
        Ld6:
            return
    }
}
