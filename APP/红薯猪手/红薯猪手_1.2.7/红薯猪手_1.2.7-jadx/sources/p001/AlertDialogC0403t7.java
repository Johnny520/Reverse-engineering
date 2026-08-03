package p001;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.List;
import p001.C0481z7;

/* JADX INFO: renamed from: ۟.t7 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SetTextI18n"})
public final class AlertDialogC0403t7 extends AbstractAlertDialogC0471ya {

    /* JADX INFO: renamed from: ۥۡ */
    public static final /* synthetic */ int f1111 = 0;

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public final List<C0250i3> f1817;

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public final int f1818;

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public final C0286kb f1819;

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public final C0286kb f1820;

    /* JADX INFO: renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public final C0286kb f1821;

    /* JADX INFO: renamed from: ۟.t7$a */
    public final class a extends AbstractC0351p7 {

        /* JADX INFO: renamed from: ۥ */
        public final View.OnClickListener f1112;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AlertDialogC0403t7 f1113;

        public a(AlertDialogC0403t7 alertDialogC0403t7, ViewOnClickListenerC0358q1 viewOnClickListenerC0358q1) {
            C0341oa.m915(new byte[]{-97, -31, 13, 80, 51, -86, -107, -2, 16, 86, 54, -125, -114}, new byte[]{-4, -115, 100, 51, 88, -26});
            this.f1113 = alertDialogC0403t7;
            this.f1112 = viewOnClickListenerC0358q1;
        }

        @Override // p001.AbstractC0351p7
        /* JADX INFO: renamed from: ۥ */
        public final void mo917(ViewGroup viewGroup, Object obj) {
            C0237h4.m1090(C0341oa.m915(new byte[]{-39, -28, 123, -25, 57, -82, -44, -18, 103}, new byte[]{-70, -117, 21, -109, 88, -57}), viewGroup);
            C0237h4.m1090(C0341oa.m915(new byte[]{-60, -110, -24}, new byte[]{-85, -16, -126, 10, -60, 68}), obj);
            viewGroup.removeView((View) obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p001.AbstractC0351p7
        /* JADX INFO: renamed from: ۥ۟ */
        public final int mo918() {
            return this.f1113.f1817.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p001.AbstractC0351p7
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final Object mo1187(ViewGroup viewGroup, int i) {
            C0456x8 c0456x8;
            C0237h4.m1090(C0341oa.m915(new byte[]{-128, 69, 36, -12, 92, 103, -115, 79, 56}, new byte[]{-29, 42, 74, -128, 61, 14}), viewGroup);
            C0476z2 c0476z2 = new C0476z2(viewGroup.getContext());
            c0476z2.setOnViewTapListener(new C0434w(this));
            String str = this.f1113.f1817.get(i).f853;
            if (C0432va.m1253(str, C0341oa.m915(new byte[]{30, -120, -22, -47}, new byte[]{108, -19, -125, -73, 86, 87}))) {
                String strSubstring = str.substring(0, C0432va.m1256(str, C0341oa.m915(new byte[]{-65, -52, 38, -38}, new byte[]{-51, -87, 79, -68, 2, -49}), 0, false, 6));
                C0237h4.m1089(C0341oa.m915(new byte[]{-51, -51, -11, 126, 109, -82, -41, -42, -16, 37, 55, -14, -112, -111}, new byte[]{-66, -72, -105, 13, 25, -36}), strSubstring);
                str = strSubstring + "webp";
            }
            Context context = c0476z2.getContext();
            if (C0481z7.f1906 == null) {
                synchronized (C0481z7.class) {
                    if (C0481z7.f1906 == null) {
                        C0481z7.f1906 = new C0481z7.b(context).m978();
                    }
                }
            }
            C0481z7 c0481z7 = C0481z7.f1906;
            c0481z7.getClass();
            if (str == null) {
                c0456x8 = new C0456x8(c0481z7, null);
            } else {
                if (str.trim().length() == 0) {
                    throw new IllegalArgumentException("Path must not be empty.");
                }
                c0456x8 = new C0456x8(c0481z7, Uri.parse(str));
            }
            c0456x8.f1867 = true;
            c0456x8.m964(c0476z2, null);
            viewGroup.addView(c0476z2);
            return c0476z2;
        }

        @Override // p001.AbstractC0351p7
        /* JADX INFO: renamed from: ۥ۟۠ */
        public final boolean mo1188(View view, Object obj) {
            C0237h4.m1090(C0341oa.m915(new byte[]{109, -93, 68, 109}, new byte[]{27, -54, 33, 26, 90, -77}), view);
            C0237h4.m1090(C0341oa.m915(new byte[]{-23, -94, 112, 5, 43, 54}, new byte[]{-122, -64, 26, 96, 72, 66}), obj);
            return C0237h4.m864(view, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0403t7(Activity activity, List list, int i) {
        super(activity, 0);
        C0341oa.m915(new byte[]{-80, -42, 85}, new byte[]{-45, -82, 33, 10, -103, -56});
        C0341oa.m915(new byte[]{119, -102, -115, 87, 39, 102, 118}, new byte[]{2, -24, -31, 27, 78, 21});
        this.f1817 = list;
        this.f1818 = i;
        this.f1819 = new C0286kb(new C0429v7(activity, this));
        this.f1820 = new C0286kb(new C0416u7(this));
        this.f1821 = new C0286kb(new C0455x7(activity, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0471ya
    /* JADX INFO: renamed from: ۥۣ۟ */
    public final View mo1046() {
        FrameLayout frameLayout = new FrameLayout(this.f1217);
        frameLayout.addView((TextView) this.f1819.m886());
        frameLayout.addView((C0138a3) this.f1821.m886());
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }
}
