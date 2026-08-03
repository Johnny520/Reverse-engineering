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
            C0237h4.m1090("listData", list);
            this.f686 = alertDialogC0147ac;
            this.f685 = list;
        }

        public final int getItemCount() {
            return this.f685.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            final c cVar = (c) viewHolder;
            C0237h4.m1090("holder", cVar);
            final C0264j3 c0264j3 = this.f685.get(i);
            final AlertDialogC0147ac alertDialogC0147ac = this.f686;
            if (!C0406ta.m1245(c0264j3.f1524)) {
                C0373r3.m926(cVar.f687, "setImageUrl", c0264j3.f1524);
            } else {
                cVar.f687.setImageDrawable(null);
            }
            cVar.f1320.setText(c0264j3.f1523);
            cVar.f688.setText(c0264j3.f1525);
            StringBuilder sb = new StringBuilder();
            C0372r2.m925(c0264j3.f1526, new C0175cc(sb));
            C0372r2.m925(c0264j3.f1527, new C0189dc(sb));
            int i2 = C0330o.f1000;
            String str = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Long.valueOf(c0264j3.f1529));
            C0237h4.m1089("format(...)", str);
            sb.append("<br>" + str);
            TextView textView = cVar.f1319;
            String string = sb.toString();
            C0237h4.m1089("toString(...)", string);
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
                    C0237h4.m1090("this$0", alertDialogC0147ac2);
                    C0237h4.m1090("$this_apply", cVar2);
                    C0237h4.m1090("$itemInfo", c0264j32);
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
            C0237h4.m1090("parent", viewGroup);
            RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            int i2 = AbstractAlertDialogC0471ya.f1885;
            relativeLayout.setPadding(0, i2, 0, 0);
            String str = C0283k8.f1632.f1591;
            C0237h4.m1089("XYImageViewCls", str);
            Object objM1214 = C0373r3.m1214(str, new Object[]{viewGroup.getContext()});
            if (objM1214 != null) {
                String strM915 = "setId";
                int i3 = AlertDialogC0147ac.f1313;
                C0373r3.m926(objM1214, strM915, 6);
            }
            C0237h4.m1088("null cannot be cast to non-null type android.view.View", objM1214);
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
            "itemView";
            int i = AlertDialogC0147ac.f1313;
            a.m1006();
            View viewFindViewById = relativeLayout.findViewById(6);
            C0237h4.m1089("findViewById(...)", viewFindViewById);
            this.f687 = (ImageView) viewFindViewById;
            a.m814();
            View viewFindViewById2 = relativeLayout.findViewById(C0133zz.f658f);
            C0237h4.m1089("findViewById(...)", viewFindViewById2);
            this.f688 = (TextView) viewFindViewById2;
            a.m1005();
            View viewFindViewById3 = relativeLayout.findViewById(1639);
            C0237h4.m1089("findViewById(...)", viewFindViewById3);
            this.f1319 = (TextView) viewFindViewById3;
            a.m1007();
            View viewFindViewById4 = relativeLayout.findViewById(1638);
            C0237h4.m1089("findViewById(...)", viewFindViewById4);
            this.f1320 = (TextView) viewFindViewById4;
            a.m813();
            View viewFindViewById5 = relativeLayout.findViewById(26214);
            C0237h4.m1089("findViewById(...)", viewFindViewById5);
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
                this.f691.setText("取消管理");
                AlertDialogC0147ac alertDialogC0147ac2 = AlertDialogC0147ac.this;
                alertDialogC0147ac2.f1486.setText("删除");
                alertDialogC0147ac2.m1083(new C0217fc(alertDialogC0147ac2));
            } else {
                this.f691.setText("多选管理");
                AlertDialogC0147ac alertDialogC0147ac3 = AlertDialogC0147ac.this;
                alertDialogC0147ac3.f1486.setText("返回");
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
        super(context, "访问用户历史");
        "cxt";
        C0237h4.m1090("listData", list);
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
            C0330o.m1173(0, "本地浏览历史记录为空");
        } else {
            AbstractAlertDialogC0230gb.m1077(this);
            Button buttonM1079 = m1079();
            buttonM1079.setText("多选管理");
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
