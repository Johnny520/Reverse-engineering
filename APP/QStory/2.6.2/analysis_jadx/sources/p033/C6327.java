package p033;

import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.layout.C0707;
import androidx.compose.material.ripple.RunnableC1107;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3060;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.ComponentCallbacks2C3063;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.util.C3763;
import com.lxj.xpopup.core.AbstractC3780;
import com.lxj.xpopup.util.AbstractC3787;
import com.lxj.xpopup.widget.VerticalRecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC5544;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p035.AbstractC6340;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6327 extends AbstractC3780 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int f17431;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static String f17432 = AbstractC3056.m6668(-3937561979095614887L);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public HorizontalScrollView f17433;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public VerticalRecyclerView f17434;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ArrayList f17435;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C6331 f17436;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f17437;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final HashSet f17438;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f17439;

    public C6327(C3763 c3763) {
        super(c3763);
        this.f17439 = new ArrayList();
        this.f17437 = new ArrayList();
        this.f17438 = new HashSet();
        this.f17435 = new ArrayList();
    }

    @Override // com.lxj.xpopup.core.AbstractC3780, com.lxj.xpopup.core.AbstractC3775
    public int getImplLayoutId() {
        return R.layout.emo_list_panel;
    }

    @Override // com.lxj.xpopup.core.AbstractC3775
    public int getMaxHeight() {
        return (int) (AbstractC3787.m8115(getContext()) * 0.7f);
    }

    @Override // com.lxj.xpopup.core.AbstractC3775
    public int getPopupHeight() {
        return (int) (AbstractC3787.m8115(getContext()) * 0.7f);
    }

    @Override // com.lxj.xpopup.core.AbstractC3775
    public final void onCreate() {
        this.f17433 = (HorizontalScrollView) findViewById(R.id.emo_title);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.PathBar);
        for (String str : AbstractC6328.m11884()) {
            TextView textView = new TextView(getContext());
            textView.setText(str);
            textView.setTextColor(getResources().getColor(R.color.font_plugin, null));
            textView.setTextSize(24.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(AbstractC2904.m6267(getContext(), 10.0f), 0, AbstractC2904.m6267(getContext(), 10.0f), 0);
            linearLayout.addView(textView, layoutParams);
            textView.requestLayout();
            this.f17439.add(textView);
            textView.setOnClickListener(new ViewOnClickListenerC5561(this, 4, str));
            textView.setOnLongClickListener(new ViewOnLongClickListenerC5544(this, 1, str));
        }
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f17434 = (VerticalRecyclerView) findViewById(R.id.recyclerView);
        C6331 c6331 = new C6331(this, this.f17437);
        this.f17436 = c6331;
        this.f17434.setAdapter(c6331);
        m11883(f17432);
        this.f17434.addOnScrollListener(new C6332());
    }

    @Override // com.lxj.xpopup.core.AbstractC3775
    public final void onDismiss() {
        for (View view : this.f17438) {
            ComponentCallbacks2C3063 componentCallbacks2C3063M6720 = ComponentCallbacks2C3057.m6720(AbstractC6340.f17460);
            componentCallbacks2C3063M6720.getClass();
            componentCallbacks2C3063M6720.m6750(new C3060(view));
        }
        ComponentCallbacks2C3057.m6722(AbstractC6340.f17460).m6723();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11882(String str) {
        ArrayList arrayList = this.f17437;
        arrayList.clear();
        String str2 = AbstractC6328.f17440;
        File[] fileArrListFiles = new File(AbstractC0053.m146(new StringBuilder(), AbstractC6328.f17440, str)).listFiles();
        ArrayList arrayList2 = new ArrayList();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            C6326[] c6326Arr = new C6326[length];
            for (int i = 0; i < fileArrListFiles.length; i++) {
                C6326 c6326 = new C6326();
                c6326Arr[i] = c6326;
                File file = fileArrListFiles[i];
                c6326.f17430 = file;
                c6326.f17429 = file.lastModified();
            }
            Arrays.sort(c6326Arr, new C0707(6));
            for (int i2 = 0; i2 < length; i2++) {
                fileArrListFiles[i2] = c6326Arr[i2].f17430;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !file2.getName().endsWith(AbstractC3056.m6668(-3937589758944085415L))) {
                    C6329 c6329 = new C6329();
                    c6329.f17443 = 1;
                    file2.getName();
                    c6329.f17444 = file2.getAbsolutePath();
                    arrayList2.add(c6329);
                }
            }
        }
        this.f17435 = arrayList2;
        int size = (arrayList2.size() / 4) + 1;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ArrayList());
        }
        for (int i4 = 0; i4 < this.f17435.size(); i4++) {
            ((ArrayList) arrayList.get(i4 / 4)).add((C6329) this.f17435.get(i4));
        }
        this.f17436.m4781();
        this.f17434.postDelayed(new RunnableC1107(this, 17), 100L);
        f17432 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11883(String str) {
        ArrayList arrayListM11884 = AbstractC6328.m11884();
        if (arrayListM11884.isEmpty()) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f17439;
        if (zIsEmpty) {
            m11882((String) arrayListM11884.get(0));
            ((View) arrayList.get(0)).setBackground(getResources().getDrawable(R.drawable.menu_item_base, null));
            return;
        }
        if (!arrayListM11884.contains(str)) {
            m11882((String) arrayListM11884.get(0));
            ((View) arrayList.get(0)).setBackground(getResources().getDrawable(R.drawable.menu_item_base, null));
            return;
        }
        int i = 0;
        while (true) {
            if (i >= arrayListM11884.size()) {
                break;
            }
            if (((String) arrayListM11884.get(i)).equals(str)) {
                this.f17433.post(new RunnableC6334(this, i, 0));
                break;
            }
            i++;
        }
        m11882(str);
    }
}
