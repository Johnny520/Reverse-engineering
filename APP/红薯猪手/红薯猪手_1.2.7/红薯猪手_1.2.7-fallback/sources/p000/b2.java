package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends p000.gb {

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public final java.lang.String f143;

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public final java.lang.String f144;

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public final p000.g3<java.lang.String, java.lang.Boolean> f145;

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public android.widget.EditText f146;

    public static final class a extends p000.o4 implements p000.f3<java.lang.Boolean> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.b2 f147;

        public a(p000.b2 r1) {
                r0 = this;
                r0.f147 = r1
                r0.<init>()
                return
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000.f3
        /* JADX INFO: renamed from: ۥ */
        public final java.lang.Boolean mo11() {
                r4 = this;
                ۟.b2 r0 = r4.f147
                ۟.g3<java.lang.String, java.lang.Boolean> r1 = r0.f145
                android.widget.EditText r0 = r0.f146
                r2 = 6
                if (r0 == 0) goto L2f
                android.text.Editable r0 = r0.getText()
                r3 = 12
                byte[] r3 = new byte[r3]
                r3 = {x0044: FILL_ARRAY_DATA , data: [-116, 43, 59, -101, 15, 101, -97, 102, 97, -31, 68, 52} // fill-array
                byte[] r2 = new byte[r2]
                r2 = {x004e: FILL_ARRAY_DATA , data: [-21, 78, 79, -49, 106, 29} // fill-array
                java.lang.String r2 = p000.oa.m332(r3, r2)
                p000.h4.m188(r2, r0)
                java.lang.CharSequence r0 = p000.va.m445(r0)
                java.lang.String r0 = r0.toString()
                java.lang.Object r0 = r1.mo12(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                return r0
            L2f:
                r0 = 9
                byte[] r0 = new byte[r0]
                r0 = {x0056: FILL_ARRAY_DATA , data: [-2, 99, -5, -19, -50, 49, -10, 94, -21} // fill-array
                byte[] r1 = new byte[r2]
                r1 = {x0060: FILL_ARRAY_DATA , data: [-109, 38, -97, -124, -70, 101} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                p000.h4.m191(r0)
                r0 = 0
                throw r0
        }
    }

    public b2(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, p000.g3<? super java.lang.String, java.lang.Boolean> r8) {
            r3 = this;
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x0060: FILL_ARRAY_DATA , data: [88, -16, 4} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0066: FILL_ARRAY_DATA , data: [59, -120, 112, -21, -103, 24} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r4)
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x006e: FILL_ARRAY_DATA , data: [-81, -68, 80, -35, -26} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x0076: FILL_ARRAY_DATA , data: [-37, -43, 36, -79, -125, 127} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r5)
            r0 = 9
            byte[] r0 = new byte[r0]
            r0 = {x007e: FILL_ARRAY_DATA , data: [-14, 33, 17, -125, -82, 110, -22, 49, 12} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x0088: FILL_ARRAY_DATA , data: [-122, 68, 105, -9, -8, 15} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r6)
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0090: FILL_ARRAY_DATA , data: [45, 34, 46, 39} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x0096: FILL_ARRAY_DATA , data: [69, 75, 64, 83, 76, 53} // fill-array
            p000.oa.m332(r0, r2)
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x009e: FILL_ARRAY_DATA , data: [-42, 121, 64, 6, -111, -37, -47, 101, 93, 13} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x00a8: FILL_ARRAY_DATA , data: [-91, 12, 50, 99, -48, -72} // fill-array
            p000.oa.m332(r0, r1)
            r3.<init>(r4, r5)
            r3.f143 = r6
            r3.f144 = r7
            r3.f145 = r8
            return
    }

    @Override // p000.gb, p000.ya, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto Lf
            r0 = 131080(0x20008, float:1.83682E-40)
            r2.clearFlags(r0)
        Lf:
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L19
            r0 = 5
            r2.setSoftInputMode(r0)
        L19:
            ۟.b2$a r2 = new ۟.b2$a
            r2.<init>(r1)
            r1.m175(r2)
            return
    }

    @Override // p000.gb
    /* JADX INFO: renamed from: ۥ۟ۦ */
    public final java.util.List<android.view.View> mo49() {
            r5 = this;
            android.widget.EditText r0 = new android.widget.EditText
            android.content.Context r1 = r5.f1218
            r0.<init>(r1)
            r1 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r1)
            r1 = 1
            r0.setFocusable(r1)
            r0.setFocusableInTouchMode(r1)
            r2 = 0
            r0.setBackgroundColor(r2)
            r0.setGravity(r1)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.weight = r3
            r0.setLayoutParams(r2)
            r0.setSelected(r1)
            java.lang.String r1 = r5.f143
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L38
            java.lang.String r1 = r5.f143
            r0.setText(r1)
        L38:
            r5.f146 = r0
            java.lang.String r1 = r5.f144
            r0.setHint(r1)
            android.widget.EditText r0 = r5.f146
            if (r0 == 0) goto L48
            java.util.List r0 = p000.jb.m214(r0)
            return r0
        L48:
            r0 = 9
            byte[] r0 = new byte[r0]
            r0 = {x005e: FILL_ARRAY_DATA , data: [-6, -120, -33, 96, 10, 1, -14, -75, -49} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x0068: FILL_ARRAY_DATA , data: [-105, -51, -69, 9, 126, 85} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m191(r0)
            r0 = 0
            throw r0
    }
}
