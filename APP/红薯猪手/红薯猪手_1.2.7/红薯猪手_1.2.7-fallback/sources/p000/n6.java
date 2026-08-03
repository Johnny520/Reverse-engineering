package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n6 extends p000.o4 implements p000.g3<org.json.JSONObject, java.lang.Object> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.f6 f821;

    public n6(p000.f6 r1) {
            r0 = this;
            r0.f821 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final java.lang.Object mo12(org.json.JSONObject r15) {
            r14 = this;
            org.json.JSONObject r15 = (org.json.JSONObject) r15
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0106: FILL_ARRAY_DATA , data: [67, -68} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x010c: FILL_ARRAY_DATA , data: [42, -56, -91, -45, 35, 47} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r15)
            ۟.f6 r0 = r14.f821
            java.util.ArrayList<۟.i3> r2 = p000.f6.f344
            r0.getClass()
            r0 = 4
            byte[] r2 = new byte[r0]
            r2 = {x0114: FILL_ARRAY_DATA , data: [-45, -82, 68, 55} // fill-array
            byte[] r3 = new byte[r1]
            r3 = {x011a: FILL_ARRAY_DATA , data: [-73, -49, 48, 86, -24, 16} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            org.json.JSONArray r2 = r15.optJSONArray(r2)
            if (r2 == 0) goto L105
            int r3 = p000.o.f829
            boolean r3 = p000.o.m311(r2)
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L3d
            r3 = r5
            goto L3e
        L3d:
            r3 = r4
        L3e:
            if (r3 == 0) goto L105
            int r3 = p000.o.m314(r2)
        L44:
            r6 = -1
            if (r6 >= r3) goto L105
            org.json.JSONObject r6 = r2.optJSONObject(r3)
            if (r6 == 0) goto L101
            boolean r7 = p000.y2.f1188
            if (r7 == 0) goto L101
            java.lang.String r7 = p000.y2.f1192
            int r7 = r7.length()
            if (r7 <= 0) goto L5b
            r7 = r5
            goto L5c
        L5b:
            r7 = r4
        L5c:
            java.lang.String r8 = "compile(...)"
            java.lang.String r9 = "pattern"
            java.lang.String r10 = ""
            r11 = 66
            if (r7 == 0) goto Lb7
            byte[] r7 = new byte[r0]
            r7 = {x0122: FILL_ARRAY_DATA , data: [79, 120, 108, -89} // fill-array
            byte[] r12 = new byte[r1]
            r12 = {x0128: FILL_ARRAY_DATA , data: [58, 11, 9, -43, -116, -13} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r12)
            org.json.JSONObject r7 = r6.optJSONObject(r7)
            if (r7 == 0) goto L8f
            r12 = 8
            byte[] r12 = new byte[r12]
            r12 = {x0130: FILL_ARRAY_DATA , data: [5, 49, 112, -2, 2, 118, 6, 61} // fill-array
            byte[] r13 = new byte[r1]
            r13 = {x0138: FILL_ARRAY_DATA , data: [107, 88, 19, -107, 108, 23} // fill-array
            java.lang.String r12 = p000.oa.m332(r12, r13)
            java.lang.String r7 = r7.optString(r12)
            goto L90
        L8f:
            r7 = 0
        L90:
            if (r7 != 0) goto L93
            r7 = r10
        L93:
            int r12 = r7.length()
            if (r12 <= 0) goto L9b
            r12 = r5
            goto L9c
        L9b:
            r12 = r4
        L9c:
            if (r12 == 0) goto Lb7
            java.lang.String r12 = p000.y2.f1192
            ۟.u8[] r13 = p000.u8.f1081
            p000.h4.m189(r9, r12)
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12, r11)
            p000.h4.m188(r8, r12)
            java.util.regex.Matcher r7 = r12.matcher(r7)
            boolean r7 = r7.find()
            if (r7 == 0) goto Lb7
            goto Lfe
        Lb7:
            java.lang.String r7 = p000.y2.f1191
            int r7 = r7.length()
            if (r7 <= 0) goto Lc1
            r7 = r5
            goto Lc2
        Lc1:
            r7 = r4
        Lc2:
            if (r7 == 0) goto L101
            r7 = 5
            byte[] r7 = new byte[r7]
            r7 = {x0140: FILL_ARRAY_DATA , data: [31, -99, -115, -94, 92} // fill-array
            byte[] r12 = new byte[r1]
            r12 = {x0148: FILL_ARRAY_DATA , data: [107, -12, -7, -50, 57, 86} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r12)
            java.lang.String r6 = r6.optString(r7)
            if (r6 != 0) goto Lda
            goto Ldb
        Lda:
            r10 = r6
        Ldb:
            int r6 = r10.length()
            if (r6 <= 0) goto Le3
            r6 = r5
            goto Le4
        Le3:
            r6 = r4
        Le4:
            if (r6 == 0) goto L101
            java.lang.String r6 = p000.y2.f1191
            ۟.u8[] r7 = p000.u8.f1081
            p000.h4.m189(r9, r6)
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r11)
            p000.h4.m188(r8, r6)
            java.util.regex.Matcher r6 = r6.matcher(r10)
            boolean r6 = r6.find()
            if (r6 == 0) goto L101
        Lfe:
            r2.remove(r3)
        L101:
            int r3 = r3 + (-1)
            goto L44
        L105:
            return r15
    }
}
