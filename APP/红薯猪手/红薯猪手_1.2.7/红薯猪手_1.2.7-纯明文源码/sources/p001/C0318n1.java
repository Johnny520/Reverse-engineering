package p001;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p001.AlertDialogC0177d0;

/* JADX INFO: renamed from: ۟.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0318n1 extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int f1714 = 0;

    /* JADX INFO: renamed from: ۥ */
    public final List<C0344p0> f984;

    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC0208f3<C0433vb> f985;

    /* JADX INFO: renamed from: ۟.n1$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static void m902() {
            int i = C0318n1.f1714;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m903() {
            int i = C0318n1.f1714;
        }
    }

    /* JADX INFO: renamed from: ۟.n1$b */
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: ۥ */
        public final TextView f986;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C0241h8 f987;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            "view";
            int i = C0318n1.f1714;
            a.m903();
            View viewFindViewById = view.findViewById(6);
            C0237h4.m1089("findViewById(...)", viewFindViewById);
            this.f986 = (TextView) viewFindViewById;
            a.m902();
            View viewFindViewById2 = view.findViewById(1638);
            C0237h4.m1089("findViewById(...)", viewFindViewById2);
            this.f987 = (C0241h8) viewFindViewById2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends ۟.p0> */
    /* JADX WARN: Multi-variable type inference failed */
    public C0318n1(List<? extends C0344p0> list) {
        C0237h4.m1090("listData", list);
        this.f984 = list;
    }

    public final int getItemCount() {
        return this.f984.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getItemViewType(int i) {
        C0344p0 c0344p0 = this.f984.get(i);
        if (c0344p0.f1019) {
            return 4;
        }
        if (TextUtils.isEmpty(c0344p0.f1736)) {
            return c0344p0.f1737 ? 2 : 1;
        }
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        b bVar = (b) viewHolder;
        C0237h4.m1090("holder", bVar);
        C0344p0 c0344p0 = this.f984.get(i);
        bVar.f986.setText(c0344p0.f1733);
        if (c0344p0.f1741 == null) {
            bVar.f987.setVisibility(8);
            return;
        }
        bVar.f987.setVisibility(0);
        bVar.f987.setOnCheckedChangeListener(null);
        C0241h8 c0241h8 = bVar.f987;
        Boolean bool = c0344p0.f1741;
        C0237h4.m865(bool);
        c0241h8.m867(bool.booleanValue());
        bVar.f987.setOnCheckedChangeListener(new C0460y(c0344p0, this, 1));
        ((RecyclerView.ViewHolder) bVar).itemView.setOnClickListener(new ViewOnClickListenerC0304m1(bVar, c0344p0, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0237h4.m1090("parent", viewGroup);
        if (i == 4) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractAlertDialogC0471ya.f1878));
            view.setBackgroundColor(Color.parseColor("#EEEEEE"));
            return new b(view);
        }
        RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i2 = AbstractAlertDialogC0471ya.f1878;
        int i3 = AbstractAlertDialogC0471ya.f1877;
        relativeLayout.setPadding(i2, i3, i2, i3);
        StateListDrawable stateListDrawable = new StateListDrawable();
        ColorDrawable colorDrawable = new ColorDrawable(-1);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(C0407tb.m943(-1)));
        stateListDrawable.addState(new int[]{-16842919}, colorDrawable);
        relativeLayout.setBackground(stateListDrawable);
        TextView textView = new TextView(viewGroup.getContext());
        textView.setId(6);
        textView.setTextColor(-12303292);
        textView.setTextSize(AbstractAlertDialogC0471ya.f1879);
        textView.setGravity(16);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, AbstractAlertDialogC0471ya.f1216);
        layoutParams.addRule(9);
        textView.setLayoutParams(layoutParams);
        relativeLayout.addView(textView);
        C0241h8 c0241h8 = new C0241h8(viewGroup.getContext());
        c0241h8.setId(1638);
        c0241h8.setCircle(false);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C0407tb.m1249(20.0f), C0407tb.m1249(20.0f));
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, AbstractAlertDialogC0471ya.f1886, AbstractAlertDialogC0471ya.f1885, 0);
        c0241h8.setLayoutParams(layoutParams2);
        relativeLayout.addView(c0241h8);
        if (i == 2) {
            textView.setTextSize(13.0f);
            textView.setTextColor(AbstractAlertDialogC0471ya.f1884);
            int i4 = i3 / 2;
            relativeLayout.setPadding(i2, i4, i2, i4);
        }
        return new b(relativeLayout);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m901(AlertDialogC0177d0.a aVar) {
        this.f985 = aVar;
    }
}
