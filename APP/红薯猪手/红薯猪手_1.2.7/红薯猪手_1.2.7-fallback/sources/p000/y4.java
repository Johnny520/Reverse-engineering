package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y4 extends p000.o4 implements p000.f3<android.widget.TextView> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f1198;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f1199;

    public y4(android.app.Activity r1, java.lang.String r2) {
            r0 = this;
            r0.f1198 = r1
            r0.f1199 = r2
            r0.<init>()
            return
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.f3
    /* JADX INFO: renamed from: ۥ */
    public final android.widget.TextView mo11() {
            r4 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r4.f1198
            r0.<init>(r1)
            java.lang.String r1 = r4.f1199
            r2 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r2)
            r0.setText(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r0.setTextColor(r1)
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r2 = 1
            r3 = 1097859072(0x41700000, float:15.0)
            float r1 = android.util.TypedValue.applyDimension(r2, r3, r1)
            int r1 = (int) r1
            r2 = 0
            r0.setPadding(r2, r1, r2, r2)
            return r0
    }
}
