package p088s0;

import android.app.Activity;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.p055lu.wxmask.bean.MaskItemBean;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import p003B0.AbstractC0055a;
import p009E0.C0103c;
import p011F0.C0119g;
import p069i.C0730z0;
import p096w0.C1032a;

/* JADX INFO: renamed from: s0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0995q {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f3575a;

    /* JADX INFO: renamed from: b */
    public final EditText f3576b;

    /* JADX INFO: renamed from: c */
    public final EditText f3577c;

    /* JADX INFO: renamed from: d */
    public final EditText f3578d;

    /* JADX INFO: renamed from: e */
    public final EditText f3579e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f3580f;

    /* JADX INFO: renamed from: g */
    public final Spinner f3581g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0995q(Activity activity, MaskItemBean maskItemBean) {
        int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, activity.getResources().getDisplayMetrics());
        LinearLayout linearLayout = new LinearLayout(activity);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setPadding(iApplyDimension, iApplyDimension, iApplyDimension, iApplyDimension);
        this.f3575a = linearLayout;
        EditText editText = new EditText(activity);
        editText.setHint("密友ID（抓取获得）");
        editText.setText(maskItemBean.getMaskId());
        this.f3576b = editText;
        EditText editText2 = new EditText(activity);
        editText2.setHint("备注（可空，仅用于显示）");
        editText2.setText(maskItemBean.getTagName());
        this.f3577c = editText2;
        EditText editText3 = new EditText(activity);
        editText3.setHint("糊脸提示，如：该用户已对您私密（拉黑），请联系对方解除~");
        int tipMode = maskItemBean.getTipMode();
        if (tipMode == 0) {
            editText3.setText(MaskItemBean.TipData.Companion.from(maskItemBean).getMess());
        } else if (tipMode != 10086) {
            editText3.setText("该用户已对您私密（拉黑），请联系对方解除~");
        } else {
            editText3.setText(MaskItemBean.TipData.Companion.from(maskItemBean).getMess());
            editText3.setVisibility(8);
        }
        this.f3578d = editText3;
        EditText editText4 = new EditText(activity);
        editText4.setHint("变脸对象，微信团队：weixin，订阅号：officialaccounts，微信运动：gh_43f2581f6fd6 等");
        editText4.setText(maskItemBean.getMapId());
        this.f3579e = editText4;
        ArrayList arrayList = new ArrayList(new C0119g(new C0103c[]{new C0103c(10086, "静默模式")}, true));
        this.f3580f = arrayList;
        Spinner spinner = new Spinner(activity);
        spinner.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C1032a c1032a = new C1032a();
        CopyOnWriteArrayList copyOnWriteArrayList = c1032a.f2596b;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(arrayList);
        spinner.setAdapter((SpinnerAdapter) c1032a);
        spinner.setVisibility(8);
        spinner.setOnItemSelectedListener(new C0730z0(2, this));
        this.f3581g = spinner;
        new LinearLayout.LayoutParams(-1, -2).topMargin = AbstractC0055a.m101b(4);
        linearLayout.addView(editText, -1, -2);
        linearLayout.addView(editText2, -1, -2);
        linearLayout.addView(spinner, -1, -2);
        linearLayout.addView(editText3, -1, -2);
    }
}
