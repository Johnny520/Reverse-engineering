package defpackage;

/* JADX INFO: renamed from: ᛱᲁᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0179 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String f1215;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f1216;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f1217;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final long f1218;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f1219;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final long f1220;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final long f1221;

    public C0179(long r3, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, long r9, long r11) {
            r2 = this;
            r0 = -966015738879534(0xfffc9169ef0961d2, double:NaN)
            r0 = -966037213716014(0xfffc9164ef0961d2, double:NaN)
            r0 = -966071573454382(0xfffc915cef0961d2, double:NaN)
            r0 = -966114523127342(0xfffc9152ef0961d2, double:NaN)
            r2.<init>()
            r2.f1218 = r3
            r2.f1219 = r5
            r2.f1217 = r6
            r2.f1216 = r7
            r2.f1215 = r8
            r2.f1220 = r9
            r2.f1221 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L52
        L3:
            boolean r0 = r5 instanceof defpackage.C0179
            if (r0 != 0) goto L8
            goto L50
        L8:
            ᛱᲁᛳᲀ r5 = (defpackage.C0179) r5
            long r0 = r4.f1218
            long r2 = r5.f1218
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L50
        L13:
            java.lang.String r0 = r4.f1219
            java.lang.String r1 = r5.f1219
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L1e
            goto L50
        L1e:
            java.lang.String r0 = r4.f1217
            java.lang.String r1 = r5.f1217
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L29
            goto L50
        L29:
            java.lang.String r0 = r4.f1216
            java.lang.String r1 = r5.f1216
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L34
            goto L50
        L34:
            java.lang.String r0 = r4.f1215
            java.lang.String r1 = r5.f1215
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L50
        L3f:
            long r0 = r4.f1220
            long r2 = r5.f1220
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L48
            goto L50
        L48:
            long r0 = r4.f1221
            long r4 = r5.f1221
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L52
        L50:
            r4 = 0
            return r4
        L52:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f1218
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f1219
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r4.f1217
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r4.f1216
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r4.f1215
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            long r2 = r4.f1220
            int r2 = java.lang.Long.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r0 = r4.f1221
            int r4 = java.lang.Long.hashCode(r0)
            int r4 = r4 + r2
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -966333566459438(0xfffc911fef0961d2, double:NaN)
            java.lang.String r1 = "TtsHistoryItem(id="
            r0.<init>(r1)
            long r1 = r4.f1218
            r0.append(r1)
            r1 = -966415170838062(0xfffc910cef0961d2, double:NaN)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.String r1 = r4.f1219
            r2 = -966449530576430(0xfffc9104ef0961d2, double:NaN)
            r0.append(r1); r0.append(", voiceId=")
            java.lang.String r1 = r4.f1217
            r2 = -966496775216686(0xfffc90f9ef0961d2, double:NaN)
            r0.append(r1); r0.append(", voiceName=")
            java.lang.String r1 = r4.f1216
            r2 = -966552609791534(0xfffc90ecef0961d2, double:NaN)
            r0.append(r1); r0.append(", audioFilePath=")
            java.lang.String r1 = r4.f1215
            r2 = -966625624235566(0xfffc90dbef0961d2, double:NaN)
            r0.append(r1); r0.append(", duration=")
            long r1 = r4.f1220
            r0.append(r1)
            r1 = -966677163843118(0xfffc90cfef0961d2, double:NaN)
            java.lang.String r1 = ", createTime="
            r0.append(r1)
            long r1 = r4.f1221
            r0.append(r1)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
