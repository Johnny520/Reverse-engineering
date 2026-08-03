package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w9 extends p000.o4 implements p000.f3<java.lang.Boolean> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.b2 f1148;

    public w9(p000.b2 r1) {
            r0 = this;
            r0.f1148 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.f3
    /* JADX INFO: renamed from: ۥ */
    public final java.lang.Boolean mo11() {
            r8 = this;
            ۟.b2 r0 = r8.f1148
            r1 = 1
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 52
            r1[r2] = r3
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x0078: FILL_ARRAY_DATA , data: [72, 4, 6, -47, 2, 34} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            r0.getClass()
            r3 = 4
            byte[] r3 = new byte[r3]
            r3 = {x0080: FILL_ARRAY_DATA , data: [90, -13, -63, -26} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {x0086: FILL_ARRAY_DATA , data: [46, -106, -71, -110, 58, 103} // fill-array
            p000.oa.m332(r3, r4)
            android.widget.EditText r3 = r0.f146
            r4 = 9
            r5 = 0
            if (r3 == 0) goto L66
            android.text.Editable r6 = r3.getText()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r3.setText(r1)
            android.widget.EditText r0 = r0.f146
            if (r0 == 0) goto L54
            android.text.Editable r1 = r0.getText()
            int r1 = r1.length()
            r0.setSelection(r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L54:
            byte[] r0 = new byte[r4]
            r0 = {x008e: FILL_ARRAY_DATA , data: [-23, 21, -39, 42, 84, -63, -31, 40, -55} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x0098: FILL_ARRAY_DATA , data: [-124, 80, -67, 67, 32, -107} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m191(r0)
            throw r5
        L66:
            byte[] r0 = new byte[r4]
            r0 = {x00a0: FILL_ARRAY_DATA , data: [26, 60, -59, 104, 30, 120, 18, 1, -43} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x00aa: FILL_ARRAY_DATA , data: [119, 121, -95, 1, 106, 44} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m191(r0)
            throw r5
    }
}
