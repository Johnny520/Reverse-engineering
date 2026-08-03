package p001;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tendcloud.tenddata.C0133zz;
import java.text.SimpleDateFormat;
import java.util.List;
import p001.AlertDialogC0147ac;

/* JADX INFO: renamed from: ۟.ac */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0147ac extends AbstractAlertDialogC0230gb {

    /* JADX INFO: renamed from: ۥۡۤ, reason: contains not printable characters */
    public static final /* synthetic */ int f1313 = 0;

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public final List<C0264j3> f1314;

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public final C0286kb f1315;

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public final C0286kb f1316;

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public boolean f1317;

    /* JADX INFO: renamed from: ۟.ac$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static void m813() {
            int i = AlertDialogC0147ac.f1313;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m814() {
            int i = AlertDialogC0147ac.f1313;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m1005() {
            int i = AlertDialogC0147ac.f1313;
        }

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public static void m1006() {
            int i = AlertDialogC0147ac.f1313;
        }

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public static void m1007() {
            int i = AlertDialogC0147ac.f1313;
        }
    }

    /* JADX INFO: renamed from: ۟.ac$b */
    public final class b extends RecyclerView.Adapter<c> {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final /* synthetic */ int f1318 = 0;

        /* JADX INFO: renamed from: ۥ */
        public final List<C0264j3> f685;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AlertDialogC0147ac f686;

        public b(AlertDialogC0147ac alertDialogC0147ac, List<C0264j3> list) {
            C0237h4.m1090(C0341oa.m915(new byte[]{-21, 19, 126, 41, 90, 49, -13, 27}, new byte[]{-121, 122, 13, 93, 30, 80}), list);
            this.f686 = alertDialogC0147ac;
            this.f685 = list;
        }

        public final int getItemCount() {
            return this.f685.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            final c cVar = (c) viewHolder;
            C0237h4.m1090(C0341oa.m915(new byte[]{94, 7, -20, 2, 123, 57}, new byte[]{54, 104, -128, 102, 30, 75}), cVar);
            final C0264j3 c0264j3 = this.f685.get(i);
            final AlertDialogC0147ac alertDialogC0147ac = this.f686;
            if (!C0406ta.m1245(c0264j3.f1524)) {
                C0373r3.m926(cVar.f687, C0341oa.m915(new byte[]{5, -13, 108, 0, 86, 66, 17, -13, 77, 59, 87}, new byte[]{118, -106, 24, 73, 59, 35}), c0264j3.f1524);
            } else {
                cVar.f687.setImageDrawable(null);
            }
            cVar.f1320.setText(c0264j3.f1523);
            cVar.f688.setText(c0264j3.f1525);
            StringBuilder sb = new StringBuilder();
            C0372r2.m925(c0264j3.f1526, new C0175cc(sb));
            C0372r2.m925(c0264j3.f1527, new C0189dc(sb));
            int i2 = C0330o.f1000;
            String str = new SimpleDateFormat(C0341oa.m915(new byte[]{21, -64, 19, 126, -60, 95, 33, -108, 14, 99, -55, 90, 36, -125, 7, 106}, new byte[]{108, -71, 106, 7, -23, 18})).format(Long.valueOf(c0264j3.f1529));
            C0237h4.m1089(C0341oa.m915(new byte[]{93, 24, -115, 119, 54, -120, 19, 89, -47, 52, 126}, new byte[]{59, 119, -1, 26, 87, -4}), str);
            sb.append("<br>" + str);
            TextView textView = cVar.f1319;
            String string = sb.toString();
            C0237h4.m1089(C0341oa.m915(new byte[]{111, 40, -80, 85, -96, -3, 117, 32, -53, 15, -4, -70, 50}, new byte[]{27, 71, -29, 33, -46, -108}), string);
            textView.setText(C0330o.m1175(string));
            if (alertDialogC0147ac.f1317) {
                cVar.f1321.setVisibility(0);
                cVar.f1321.m867(c0264j3.f870);
                cVar.f1321.setOnCheckedChangeListener(new C0434w(c0264j3));
            } else {
                cVar.f1321.setVisibility(8);
            }
            ((RecyclerView.ViewHolder) cVar).itemView.setOnClickListener(new View.OnClickListener() { // from class: ۟.bc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AlertDialogC0147ac alertDialogC0147ac2 = alertDialogC0147ac;
                    AlertDialogC0147ac.c cVar2 = cVar;
                    C0264j3 c0264j32 = c0264j3;
                    C0237h4.m1090(C0341oa.m915(new byte[]{-8, 28, -107, -36, 82, 127}, new byte[]{-116, 116, -4, -81, 118, 79}), alertDialogC0147ac2);
                    C0237h4.m1090(C0341oa.m915(new byte[]{6, 95, -114, 99, -57, -80, 67, 91, -106, 102, -51}, new byte[]{34, 43, -26, 10, -76, -17}), cVar2);
                    C0237h4.m1090(C0341oa.m915(new byte[]{39, -40, -45, 124, 46, 41, 109, -41, -56}, new byte[]{3, -79, -89, 25, 67, 96}), c0264j32);
                    if (alertDialogC0147ac2.f1317) {
                        cVar2.f1321.m867(!c0264j32.f870);
                        return;
                    }
                    C0325n8 c0325n8 = C0325n8.f994;
                    String str2 = c0264j32.f871;
                    c0325n8.getClass();
                    C0325n8.m1160(str2);
                }
            });
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            C0237h4.m1090(C0341oa.m915(new byte[]{-71, -84, 64, -89, 38, 121}, new byte[]{-55, -51, 50, -62, 72, 13}), viewGroup);
            RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            int i2 = AbstractAlertDialogC0471ya.f1885;
            relativeLayout.setPadding(0, i2, 0, 0);
            String str = C0283k8.f1632.f1591;
            C0237h4.m1089(C0341oa.m915(new byte[]{24, -85, 70, -93, 31, -45, 37, -92, 102, -85, 9, -9, 44, -127}, new byte[]{64, -14, 15, -50, 126, -76}), str);
            Object objM1214 = C0373r3.m1214(str, new Object[]{viewGroup.getContext()});
            if (objM1214 != null) {
                String strM915 = C0341oa.m915(new byte[]{-45, -42, -25, -29, -41}, new byte[]{-96, -77, -109, -86, -77, -23});
                int i3 = AlertDialogC0147ac.f1313;
                C0373r3.m926(objM1214, strM915, 6);
            }
            C0237h4.m1088(C0341oa.m915(new byte[]{73, -91, 124, 27, -11, -17, 70, -66, 126, 24, -95, -84, 69, -75, 48, 20, -76, -1, 83, -16, 100, 24, -11, -30, 72, -66, 61, 25, -96, -32, 75, -16, 100, 14, -91, -23, 7, -79, 126, 19, -89, -29, 78, -76, 62, 1, -68, -23, 80, -2, 70, 30, -80, -5}, new byte[]{39, -48, 16, 119, -43, -116}), objM1214);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) C0167c4.m1038(1, 100.0f), (int) C0167c4.m1038(1, 100.0f));
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            int i4 = AbstractAlertDialogC0471ya.f1886;
            layoutParams.setMargins(i2, i4, i2, 0);
            relativeLayout.addView((View) objM1214, layoutParams);
            TextView textView = new TextView(viewGroup.getContext());
            int i5 = AlertDialogC0147ac.f1313;
            textView.setId(1638);
            textView.setTextSize(15.0f);
            textView.setTextColor(-16777216);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(1, 6);
            layoutParams2.addRule(10);
            textView.setLayoutParams(layoutParams2);
            textView.setGravity(8388611);
            textView.setMaxLines(3);
            textView.setPadding(0, i4, 0, 0);
            relativeLayout.addView(textView);
            TextView textView2 = new TextView(viewGroup.getContext());
            textView2.setId(1639);
            textView2.setTextSize(12.0f);
            textView2.setTextColor(-7829368);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(1, 6);
            layoutParams3.addRule(3, 1638);
            textView2.setLayoutParams(layoutParams3);
            textView2.setPadding(0, i2, i4, 0);
            relativeLayout.addView(textView2);
            TextView textView3 = new TextView(viewGroup.getContext());
            textView3.setId(C0133zz.f658f);
            textView3.setTextSize(12.0f);
            textView3.setTextColor(-7829368);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(1, 6);
            layoutParams4.addRule(3, 1639);
            textView3.setLayoutParams(layoutParams4);
            textView3.setMaxLines(4);
            textView3.setPadding(0, i4, i4, 0);
            relativeLayout.addView(textView3);
            View c0241h8 = new C0241h8(viewGroup.getContext());
            c0241h8.setId(26214);
            c0241h8.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams5.addRule(11);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(0, 0, i2, 0);
            c0241h8.setLayoutParams(layoutParams5);
            relativeLayout.addView(c0241h8);
            return new c(relativeLayout);
        }

        /* JADX INFO: renamed from: ۥ */
        public final List<C0264j3> m815() {
            return this.f685;
        }
    }

    /* JADX INFO: renamed from: ۟.ac$c */
    public final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: ۥ */
        public final ImageView f687;

        /* JADX INFO: renamed from: ۥ۟ */
        public final TextView f688;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final TextView f1319;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final TextView f1320;

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public final C0241h8 f1321;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RelativeLayout relativeLayout) {
            super(relativeLayout);
            C0341oa.m915(new byte[]{3, 17, 18, 6, 92, 17, 15, 18}, new byte[]{106, 101, 119, 107, 10, 120});
            int i = AlertDialogC0147ac.f1313;
            a.m1006();
            View viewFindViewById = relativeLayout.findViewById(6);
            C0237h4.m1089(C0341oa.m915(new byte[]{46, 73, 117, 89, -36, 81, 45, 87, 89, 68, -61, 92, 96, 14, 53, 19, -93}, new byte[]{72, 32, 27, 61, -118, 56}), viewFindViewById);
            this.f687 = (ImageView) viewFindViewById;
            a.m814();
            View viewFindViewById2 = relativeLayout.findViewById(C0133zz.f658f);
            C0237h4.m1089(C0341oa.m915(new byte[]{-47, 88, 93, -80, -114, 55, -46, 70, 113, -83, -111, 58, -97, 31, 29, -6, -15}, new byte[]{-73, 49, 51, -44, -40, 94}), viewFindViewById2);
            this.f688 = (TextView) viewFindViewById2;
            a.m1005();
            View viewFindViewById3 = relativeLayout.findViewById(1639);
            C0237h4.m1089(C0341oa.m915(new byte[]{-71, -116, -52, -6, 8, -76, -70, -110, -32, -25, 23, -71, -9, -53, -116, -80, 119}, new byte[]{-33, -27, -94, -98, 94, -35}), viewFindViewById3);
            this.f1319 = (TextView) viewFindViewById3;
            a.m1007();
            View viewFindViewById4 = relativeLayout.findViewById(1638);
            C0237h4.m1089(C0341oa.m915(new byte[]{40, -73, 45, 18, -114, 66, 43, -87, 1, 15, -111, 79, 102, -16, 109, 88, -15}, new byte[]{78, -34, 67, 118, -40, 43}), viewFindViewById4);
            this.f1320 = (TextView) viewFindViewById4;
            a.m813();
            View viewFindViewById5 = relativeLayout.findViewById(26214);
            C0237h4.m1089(C0341oa.m915(new byte[]{-91, -58, -38, 74, 69, 39, -90, -40, -10, 87, 90, 42, -21, -127, -102, 0, 58}, new byte[]{-61, -81, -76, 46, 19, 78}), viewFindViewById5);
            this.f1321 = (C0241h8) viewFindViewById5;
        }
    }

    /* JADX INFO: renamed from: ۟.ac$d */
    public static final class d extends AbstractC0335o4 implements InterfaceC0208f3<b> {
        public d() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final b mo7() {
            AlertDialogC0147ac alertDialogC0147ac = AlertDialogC0147ac.this;
            return new b(alertDialogC0147ac, alertDialogC0147ac.f1314);
        }
    }

    /* JADX INFO: renamed from: ۟.ac$e */
    public static final class e extends AbstractC0335o4 implements InterfaceC0208f3<Boolean> {

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ Button f691;

        public e(Button button) {
            this.f691 = button;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final Boolean mo7() {
            AlertDialogC0147ac alertDialogC0147ac = AlertDialogC0147ac.this;
            alertDialogC0147ac.f1317 = !alertDialogC0147ac.f1317;
            alertDialogC0147ac.m1004().notifyDataSetChanged();
            if (AlertDialogC0147ac.this.f1317) {
                this.f691.setText(C0341oa.m915(new byte[]{22, 120, -108, -80, 96, 126, 20, 89, -93, -79, 70, 112}, new byte[]{-13, -9, 2, 86, -42, -10}));
                AlertDialogC0147ac alertDialogC0147ac2 = AlertDialogC0147ac.this;
                alertDialogC0147ac2.f1486.setText(C0341oa.m915(new byte[]{-35, -109, -99, -3, -23, -46}, new byte[]{56, 27, 61, 20, 112, 118}));
                alertDialogC0147ac2.m1083(new C0217fc(alertDialogC0147ac2));
            } else {
                this.f691.setText(C0341oa.m915(new byte[]{-24, -110, 71, -118, 56, -63, -22, -104, 124, -124, 40, -50}, new byte[]{13, 54, -35, 99, -72, 72}));
                AlertDialogC0147ac alertDialogC0147ac3 = AlertDialogC0147ac.this;
                alertDialogC0147ac3.f1486.setText(C0341oa.m915(new byte[]{-21, -33, -103, 3, -82, 55}, new byte[]{3, 96, 13, -26, 53, -87}));
                alertDialogC0147ac3.m1083(C0277k2.f902);
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: ۟.ac$f */
    public static final class f extends AbstractC0335o4 implements InterfaceC0208f3<RecyclerView> {
        public f() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final RecyclerView mo7() {
            RecyclerView recyclerView = new RecyclerView(AlertDialogC0147ac.this.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            recyclerView.setLayoutParams(layoutParams);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.addItemDecoration(new C0269j8());
            return recyclerView;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0147ac(Context context, List<C0264j3> list) {
        super(context, C0341oa.m915(new byte[]{-37, -114, 10, -102, 32, 87, -44, -76, 29, -107, 63, 78, -42, -82, 51, -106, 56, 75}, new byte[]{51, 32, -75, 115, -73, -7}));
        C0341oa.m915(new byte[]{7, -104, -62}, new byte[]{100, -32, -74, 39, -29, 10});
        C0237h4.m1090(C0341oa.m915(new byte[]{6, -38, 48, -38, -48, -7, 30, -46}, new byte[]{106, -77, 67, -82, -108, -104}), list);
        this.f1314 = list;
        this.f1315 = new C0286kb(new d());
        this.f1316 = new C0286kb(new f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0230gb, p001.AbstractAlertDialogC0471ya, android.app.AlertDialog, android.app.Dialog
    @SuppressLint({"NotifyDataSetChanged"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((RecyclerView) this.f1316.m886()).setAdapter(m1004());
        m858();
        if (!(!m1004().m815().isEmpty())) {
            int i = C0330o.f1000;
            C0330o.m1173(0, C0341oa.m915(new byte[]{86, 54, 30, -61, 88, -101, 86, 31, 61, -50, 99, -93, 85, 36, 52, -61, 75, -103, 88, 4, 2, -61, 121, -66, 84, 18, 8, -63, 109, -111}, new byte[]{-80, -86, -78, 38, -60, 43}));
        } else {
            AbstractAlertDialogC0230gb.m1077(this);
            Button buttonM1079 = m1079();
            buttonM1079.setText(C0341oa.m915(new byte[]{-32, -78, 44, 32, -58, 12, -30, -72, 23, 46, -42, 3}, new byte[]{5, 22, -74, -55, 70, -123}));
            m1082(new e(buttonM1079));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0230gb
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final List<View> mo1003() {
        return C0272jb.m874((RecyclerView) this.f1316.m886());
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final b m1004() {
        return (b) this.f1315.m886();
    }
}
