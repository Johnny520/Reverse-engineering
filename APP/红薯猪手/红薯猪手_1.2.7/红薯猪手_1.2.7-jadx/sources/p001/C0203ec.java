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
        C0237h4.m1090(C0341oa.m915(new byte[]{39, -7}, new byte[]{78, -115, 39, -82, 124, 4}), activity);
        if (this.f771.f1028 != this.f772.f1028) {
            StringBuilder sbM924 = C0372r2.m924(C0341oa.m915(new byte[]{-86, -42, -61, -44, 74, 63, -91, -52, -44}, new byte[]{76, 85, 112, 49, -62, -97}), Integer.valueOf(this.f771.f1028));
            sbM924.append(C0341oa.m915(new byte[]{78, 61, 85, 48, -99, 38, 78, 56, 121, 58, -82, 0, 79, 13, 95, 54, -72, 14, 76, 13, 111, 58, -85, 53}, new byte[]{-86, -123, -1, -33, 33, -86}));
            sbM924.append(this.f772.f1028);
            sbM924.append(C0341oa.m915(new byte[]{91, -63, -12}, new byte[]{-65, 121, 94, 46, 67, -72}));
            string = sbM924.toString();
            strM915 = C0341oa.m915(new byte[]{111, 12, 9, 64, 83, -28, 117, 4, 114, 26, 15, -93, 50}, new byte[]{27, 99, 90, 52, 33, -115});
        } else {
            StringBuilder sbM9242 = C0372r2.m924(C0341oa.m915(new byte[]{-99, 82, -122, -46, 41, 86, -111, 124, -112}, new byte[]{120, -27, 52, 53, -114, -19}), Integer.valueOf(this.f771.f1028));
            sbM9242.append(C0341oa.m915(new byte[]{-38, -103, 45}, new byte[]{62, 33, -121, -45, -77, -92}));
            string = sbM9242.toString();
            strM915 = C0341oa.m915(new byte[]{24, 89, 96, 120, 90, -14, 2, 81, 27, 34, 6, -75, 69}, new byte[]{108, 54, 51, 12, 40, -101});
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
