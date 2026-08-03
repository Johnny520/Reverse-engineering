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
            "clickListener";
            this.f1113 = alertDialogC0403t7;
            this.f1112 = viewOnClickListenerC0358q1;
        }

        @Override // p001.AbstractC0351p7
        /* JADX INFO: renamed from: ۥ */
        public final void mo917(ViewGroup viewGroup, Object obj) {
            C0237h4.m1090("container", viewGroup);
            C0237h4.m1090("obj", obj);
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
            C0237h4.m1090("container", viewGroup);
            C0476z2 c0476z2 = new C0476z2(viewGroup.getContext());
            c0476z2.setOnViewTapListener(new C0434w(this));
            String str = this.f1113.f1817.get(i).f853;
            if (C0432va.m1253(str, "reif")) {
                String strSubstring = str.substring(0, C0432va.m1256(str, "reif", 0, false, 6));
                C0237h4.m1089("substring(...)", strSubstring);
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
            C0237h4.m1090("view", view);
            C0237h4.m1090("object", obj);
            return C0237h4.m864(view, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0403t7(Activity activity, List list, int i) {
        super(activity, 0);
        "cxt";
        "urlList";
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
