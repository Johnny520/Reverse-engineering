package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v7 extends p000.o4 implements p000.f3<android.widget.TextView> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f1097;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ p000.t7 f1098;

    public v7(android.app.Activity r1, p000.t7 r2) {
            r0 = this;
            r0.f1097 = r1
            r0.f1098 = r2
            r0.<init>()
            return
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.f3
    /* JADX INFO: renamed from: ۥ */
    public final android.widget.TextView mo11() {
            r6 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r6.f1097
            r0.<init>(r1)
            ۟.t7 r1 = r6.f1098
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r3 = 1
            r2.gravity = r3
            r4 = 1112014848(0x42480000, float:50.0)
            float r4 = p000.c4.m107(r3, r4)
            int r4 = (int) r4
            r5 = 0
            r2.setMargins(r5, r4, r5, r5)
            r0.setLayoutParams(r2)
            r2 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r2)
            r2 = 9
            byte[] r2 = new byte[r2]
            r2 = {x006c: FILL_ARRAY_DATA , data: [66, 116, -63, -23, -93, -116, 36, 119, -62} // fill-array
            r4 = 6
            byte[] r4 = new byte[r4]
            r4 = {x0076: FILL_ARRAY_DATA , data: [97, 50, -121, -84, -26, -55} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r4)
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setTextColor(r2)
            r2 = 17
            r0.setGravity(r2)
            java.util.List<۟.i3> r2 = r1.f1043
            int r2 = r2.size()
            if (r2 <= r3) goto L6b
            int r2 = r1.f1044
            int r2 = r2 + r3
            java.util.List<۟.i3> r1 = r1.f1043
            int r1 = r1.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "/"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.setText(r1)
        L6b:
            return r0
    }
}
