package p050;

import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.lazy.layout.C1548;
import androidx.compose.material.ripple.RunnableC1945;
import com.bumptech.glide.C3893;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.ComponentCallbacks2C3896;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.util.C4596;
import com.lxj.xpopup.core.AbstractC4613;
import com.lxj.xpopup.util.AbstractC4620;
import com.lxj.xpopup.widget.VerticalRecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC6376;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p034.AbstractC7082;
import p052.AbstractC7187;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7179 extends AbstractC4613 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int f17832 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static String f17833 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public HorizontalScrollView f17834;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public VerticalRecyclerView f17835;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ArrayList f17836;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C7181 f17837;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f17838;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final HashSet f17839;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f17840;

    public C7179(C4596 c4596) {
        super(c4596);
        this.f17840 = new ArrayList();
        this.f17838 = new ArrayList();
        this.f17839 = new HashSet();
        this.f17836 = new ArrayList();
    }

    @Override // com.lxj.xpopup.core.AbstractC4613, com.lxj.xpopup.core.AbstractC4608
    public int getImplLayoutId() {
        return C0328R.layout.emo_list_panel;
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public int getMaxHeight() {
        return (int) (AbstractC4620.m8661(getContext()) * 0.7f);
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public int getPopupHeight() {
        return (int) (AbstractC4620.m8661(getContext()) * 0.7f);
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public final void onCreate() {
        this.f17834 = (HorizontalScrollView) findViewById(C0328R.id.emo_title);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0328R.id.PathBar);
        for (String str : AbstractC7174.m12452()) {
            TextView textView = new TextView(getContext());
            textView.setText(str);
            textView.setTextColor(getResources().getColor(C0328R.color.font_plugin, null));
            textView.setTextSize(24.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(AbstractC7082.m12313(getContext(), 10.0f), 0, AbstractC7082.m12313(getContext(), 10.0f), 0);
            linearLayout.addView(textView, layoutParams);
            textView.requestLayout();
            this.f17840.add(textView);
            textView.setOnClickListener(new ViewOnClickListenerC6392(this, 6, str));
            textView.setOnLongClickListener(new ViewOnLongClickListenerC6376(this, 1, str));
        }
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f17835 = (VerticalRecyclerView) findViewById(C0328R.id.recyclerView);
        C7181 c7181 = new C7181(this, this.f17838);
        this.f17837 = c7181;
        this.f17835.setAdapter(c7181);
        m12495(f17833);
        this.f17835.addOnScrollListener(new C7178());
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public final void onDismiss() {
        for (View view : this.f17839) {
            ComponentCallbacks2C3896 componentCallbacks2C3896M7325 = ComponentCallbacks2C3890.m7325(AbstractC7187.f17852);
            componentCallbacks2C3896M7325.getClass();
            componentCallbacks2C3896M7325.m7355(new C3893(view));
        }
        ComponentCallbacks2C3890.m7327(AbstractC7187.f17852).m7328();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12494(String str) {
        ArrayList arrayList = this.f17838;
        arrayList.clear();
        String str2 = AbstractC7174.f17823;
        File[] fileArrListFiles = new File(AbstractC0900.m711(new StringBuilder(), AbstractC7174.f17823, str)).listFiles();
        ArrayList arrayList2 = new ArrayList();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            C7175[] c7175Arr = new C7175[length];
            for (int i = 0; i < fileArrListFiles.length; i++) {
                C7175 c7175 = new C7175();
                c7175Arr[i] = c7175;
                File file = fileArrListFiles[i];
                c7175.f17825 = file;
                c7175.f17824 = file.lastModified();
            }
            Arrays.sort(c7175Arr, new C1548(7));
            for (int i2 = 0; i2 < length; i2++) {
                fileArrListFiles[i2] = c7175Arr[i2].f17825;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !file2.getName().endsWith(".bak")) {
                    C7177 c7177 = new C7177();
                    c7177.f17830 = 1;
                    file2.getName();
                    c7177.f17831 = file2.getAbsolutePath();
                    arrayList2.add(c7177);
                }
            }
        }
        this.f17836 = arrayList2;
        int size = (arrayList2.size() / 4) + 1;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ArrayList());
        }
        for (int i4 = 0; i4 < this.f17836.size(); i4++) {
            ((ArrayList) arrayList.get(i4 / 4)).add((C7177) this.f17836.get(i4));
        }
        this.f17837.m5351();
        this.f17835.postDelayed(new RunnableC1945(this, 17), 100L);
        f17833 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12495(String str) {
        ArrayList arrayListM12452 = AbstractC7174.m12452();
        if (arrayListM12452.isEmpty()) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f17840;
        if (zIsEmpty) {
            m12494((String) arrayListM12452.get(0));
            ((View) arrayList.get(0)).setBackground(getResources().getDrawable(C0328R.drawable.menu_item_base, null));
            return;
        }
        if (!arrayListM12452.contains(str)) {
            m12494((String) arrayListM12452.get(0));
            ((View) arrayList.get(0)).setBackground(getResources().getDrawable(C0328R.drawable.menu_item_base, null));
            return;
        }
        int i = 0;
        while (true) {
            if (i >= arrayListM12452.size()) {
                break;
            }
            if (((String) arrayListM12452.get(i)).equals(str)) {
                this.f17834.post(new RunnableC7180(this, i, 0));
                break;
            }
            i++;
        }
        m12494(str);
    }
}
