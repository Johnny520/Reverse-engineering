package p001;

import android.app.Activity;

/* JADX INFO: renamed from: ۟.ec */
/* JADX INFO: loaded from: classes.dex */
public final class C0203ec extends AbstractC0335o4 implements InterfaceC0222g3<Activity, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0352p8 f771;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ C0352p8 f772;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ AlertDialogC0147ac f1425;

    public C0203ec(AlertDialogC0147ac alertDialogC0147ac, C0352p8 c0352p8, C0352p8 c0352p82) {
        this.f771 = c0352p8;
        this.f772 = c0352p82;
        this.f1425 = alertDialogC0147ac;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(Activity activity) {
        String string;
        String strM915;
        C0237h4.m1090("it", activity);
        if (this.f771.f1028 != this.f772.f1028) {
            StringBuilder sbM924 = C0372r2.m924("想删除", Integer.valueOf(this.f771.f1028));
            sbM924.append("个，但只删除成功");
            sbM924.append(this.f772.f1028);
            sbM924.append("个");
            string = sbM924.toString();
            strM915 = "toString(...)";
        } else {
            StringBuilder sbM9242 = C0372r2.m924("已移除", Integer.valueOf(this.f771.f1028));
            sbM9242.append("个");
            string = sbM9242.toString();
            strM915 = "toString(...)";
        }
        C0237h4.m1089(strM915, string);
        int i = C0330o.f1000;
        C0330o.m1173(0, string);
        AlertDialogC0147ac alertDialogC0147ac = this.f1425;
        int i2 = AlertDialogC0147ac.f1313;
        alertDialogC0147ac.m1004().notifyDataSetChanged();
        return C0433vb.f1163;
    }
}
