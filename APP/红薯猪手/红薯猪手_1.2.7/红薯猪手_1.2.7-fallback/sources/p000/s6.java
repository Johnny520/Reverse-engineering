package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s6 extends p000.o4 implements p000.g3<org.json.JSONObject, java.lang.Object> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final p000.s6 f974 = null;

    static {
            ۟.s6 r0 = new ۟.s6
            r0.<init>()
            p000.s6.f974 = r0
            return
    }

    public s6() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final java.lang.Object mo12(org.json.JSONObject r17) {
            r16 = this;
            r0 = r17
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r1 = 2
            byte[] r1 = new byte[r1]
            r1 = {x0124: FILL_ARRAY_DATA , data: [-116, 109} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x012a: FILL_ARRAY_DATA , data: [-27, 25, -73, -50, 53, -43} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r0)
            boolean r1 = p000.y2.f1188
            r1 = 4
            byte[] r3 = new byte[r1]
            r3 = {x0132: FILL_ARRAY_DATA , data: [15, 106, 49, -109} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {x0138: FILL_ARRAY_DATA , data: [101, 25, 94, -3, 16, -101} // fill-array
            p000.oa.m332(r3, r4)
            byte[] r3 = new byte[r1]
            r3 = {x0140: FILL_ARRAY_DATA , data: [117, -124, 20, 105} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {x0146: FILL_ARRAY_DATA , data: [17, -27, 96, 8, 44, 88} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            org.json.JSONObject r3 = r0.optJSONObject(r3)
            r4 = 5
            r5 = 0
            if (r3 == 0) goto L50
            byte[] r6 = new byte[r4]
            r6 = {x014e: FILL_ARRAY_DATA , data: [119, 84, 26, 85, -36} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x0156: FILL_ARRAY_DATA , data: [25, 59, 110, 48, -81, 5} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r7)
            org.json.JSONArray r3 = r3.optJSONArray(r6)
            goto L51
        L50:
            r3 = r5
        L51:
            if (r3 == 0) goto L123
            int r6 = p000.o.f829
            boolean r6 = p000.o.m311(r3)
            r7 = 0
            r8 = 1
            if (r6 != r8) goto L5f
            r6 = r8
            goto L60
        L5f:
            r6 = r7
        L60:
            if (r6 == 0) goto L123
            int r6 = p000.o.m314(r3)
        L66:
            r9 = -1
            if (r9 >= r6) goto L123
            org.json.JSONObject r9 = r3.optJSONObject(r6)
            if (r9 == 0) goto L11e
            java.lang.String r10 = p000.y2.f1192
            int r10 = r10.length()
            if (r10 <= 0) goto L79
            r10 = r8
            goto L7a
        L79:
            r10 = r7
        L7a:
            java.lang.String r11 = "compile(...)"
            java.lang.String r12 = "pattern"
            java.lang.String r13 = ""
            r14 = 66
            if (r10 == 0) goto Ld5
            byte[] r10 = new byte[r1]
            r10 = {x015e: FILL_ARRAY_DATA , data: [127, -121, 36, 14} // fill-array
            byte[] r15 = new byte[r2]
            r15 = {x0164: FILL_ARRAY_DATA , data: [10, -12, 65, 124, 42, 51} // fill-array
            java.lang.String r10 = p000.oa.m332(r10, r15)
            org.json.JSONObject r10 = r9.optJSONObject(r10)
            if (r10 == 0) goto Lad
            r15 = 8
            byte[] r15 = new byte[r15]
            r15 = {x016c: FILL_ARRAY_DATA , data: [-27, 50, -51, 51, 29, -98, -26, 62} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x0174: FILL_ARRAY_DATA , data: [-117, 91, -82, 88, 115, -1} // fill-array
            java.lang.String r1 = p000.oa.m332(r15, r1)
            java.lang.String r1 = r10.optString(r1)
            goto Lae
        Lad:
            r1 = r5
        Lae:
            if (r1 != 0) goto Lb1
            r1 = r13
        Lb1:
            int r10 = r1.length()
            if (r10 <= 0) goto Lb9
            r10 = r8
            goto Lba
        Lb9:
            r10 = r7
        Lba:
            if (r10 == 0) goto Ld5
            java.lang.String r10 = p000.y2.f1192
            ۟.u8[] r15 = p000.u8.f1081
            p000.h4.m189(r12, r10)
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10, r14)
            p000.h4.m188(r11, r10)
            java.util.regex.Matcher r1 = r10.matcher(r1)
            boolean r1 = r1.find()
            if (r1 == 0) goto Ld5
            goto L11b
        Ld5:
            java.lang.String r1 = p000.y2.f1191
            int r1 = r1.length()
            if (r1 <= 0) goto Ldf
            r1 = r8
            goto Le0
        Ldf:
            r1 = r7
        Le0:
            if (r1 == 0) goto L11e
            byte[] r1 = new byte[r4]
            r1 = {x017c: FILL_ARRAY_DATA , data: [-9, 66, 123, -87, 59} // fill-array
            byte[] r10 = new byte[r2]
            r10 = {x0184: FILL_ARRAY_DATA , data: [-125, 43, 15, -59, 94, 4} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r10)
            java.lang.String r1 = r9.optString(r1)
            if (r1 != 0) goto Lf7
            goto Lf8
        Lf7:
            r13 = r1
        Lf8:
            int r1 = r13.length()
            if (r1 <= 0) goto L100
            r1 = r8
            goto L101
        L100:
            r1 = r7
        L101:
            if (r1 == 0) goto L11e
            java.lang.String r1 = p000.y2.f1191
            ۟.u8[] r9 = p000.u8.f1081
            p000.h4.m189(r12, r1)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r14)
            p000.h4.m188(r11, r1)
            java.util.regex.Matcher r1 = r1.matcher(r13)
            boolean r1 = r1.find()
            if (r1 == 0) goto L11e
        L11b:
            r3.remove(r6)
        L11e:
            int r6 = r6 + (-1)
            r1 = 4
            goto L66
        L123:
            return r0
    }
}
