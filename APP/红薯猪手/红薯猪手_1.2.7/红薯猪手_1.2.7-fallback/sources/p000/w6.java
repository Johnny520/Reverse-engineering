package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w6 extends p000.gb {

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public final java.lang.CharSequence f1123;

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public android.widget.TextView f1124;

    public w6(android.content.Context r4, java.lang.String r5, java.lang.CharSequence r6) {
            r3 = this;
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x0036: FILL_ARRAY_DATA , data: [-92, -16, 75} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x003c: FILL_ARRAY_DATA , data: [-57, -120, 63, -35, -22, -21} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r4)
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x0044: FILL_ARRAY_DATA , data: [-122, -12, -123, -102, 7} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x004c: FILL_ARRAY_DATA , data: [-14, -99, -15, -10, 98, -52} // fill-array
            p000.oa.m332(r0, r2)
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0054: FILL_ARRAY_DATA , data: [42, 0, -26, 55} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x005a: FILL_ARRAY_DATA , data: [73, 111, -120, 67, -27, 117} // fill-array
            p000.oa.m332(r0, r1)
            r3.<init>(r4, r5)
            r3.f1123 = r6
            return
    }

    @Override // p000.gb
    /* JADX INFO: renamed from: ۥ۟ۦ */
    public final java.util.List<android.view.View> mo49() {
            r6 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r6.f1218
            r0.<init>(r1)
            r1 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r1)
            r1 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r0.setTextColor(r1)
            java.lang.CharSequence r1 = r6.f1123
            r0.setText(r1)
            r1 = 0
            r2 = 1066192077(0x3f8ccccd, float:1.1)
            r0.setLineSpacing(r1, r2)
            int r1 = p000.ya.f1208
            r2 = 0
            r0.setPadding(r1, r2, r1, r1)
            int r1 = p000.o.f829
            p000.o.m317(r0)
            r1 = 7
            byte[] r1 = new byte[r1]
            r1 = {x008a: FILL_ARRAY_DATA , data: [-60, 51, -68, 57, -26, 22, -58} // fill-array
            r3 = 6
            byte[] r4 = new byte[r3]
            r4 = {x0092: FILL_ARRAY_DATA , data: [-8, 64, -39, 77, -53, 41} // fill-array
            p000.oa.m332(r1, r4)
            r6.f1124 = r0
            android.widget.ScrollView r0 = new android.widget.ScrollView
            android.content.Context r1 = r6.f1218
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r1.<init>(r4, r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.weight = r5
            r0.setLayoutParams(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r5 = r6.f1218
            r1.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r4, r4)
            r1.setLayoutParams(r5)
            r4 = 1
            r1.setOrientation(r4)
            android.widget.TextView r5 = r6.f1124
            if (r5 == 0) goto L74
            r1.addView(r5)
            r0.addView(r1)
            android.widget.ScrollView[] r1 = new android.widget.ScrollView[r4]
            r1[r2] = r0
            java.util.ArrayList r0 = p000.jb.m205(r1)
            return r0
        L74:
            r0 = 9
            byte[] r0 = new byte[r0]
            r0 = {x009a: FILL_ARRAY_DATA , data: [-52, 41, -51, 68, 8, 27, -56, 24, -33} // fill-array
            byte[] r1 = new byte[r3]
            r1 = {x00a4: FILL_ARRAY_DATA , data: [-95, 125, -88, 60, 124, 77} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m191(r0)
            r0 = 0
            throw r0
    }
}
