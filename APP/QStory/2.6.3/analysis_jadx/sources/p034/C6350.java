package p034;

import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.layout.C0707;
import androidx.compose.material.ripple.RunnableC1107;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.ComponentCallbacks2C3064;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.util.C3764;
import com.lxj.xpopup.core.AbstractC3781;
import com.lxj.xpopup.util.AbstractC3788;
import com.lxj.xpopup.widget.VerticalRecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC5545;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p018.AbstractC6253;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6350 extends AbstractC3781 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int f17487 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static String f17488 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public HorizontalScrollView f17489;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public VerticalRecyclerView f17490;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ArrayList f17491;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C6352 f17492;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f17493;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final HashSet f17494;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f17495;

    public C6350(C3764 c3764) {
        super(c3764);
        this.f17495 = new ArrayList();
        this.f17493 = new ArrayList();
        this.f17494 = new HashSet();
        this.f17491 = new ArrayList();
    }

    @Override // com.lxj.xpopup.core.AbstractC3781, com.lxj.xpopup.core.AbstractC3776
    public int getImplLayoutId() {
        return R.layout.emo_list_panel;
    }

    @Override // com.lxj.xpopup.core.AbstractC3776
    public int getMaxHeight() {
        return (int) (AbstractC3788.m8102(getContext()) * 0.7f);
    }

    @Override // com.lxj.xpopup.core.AbstractC3776
    public int getPopupHeight() {
        return (int) (AbstractC3788.m8102(getContext()) * 0.7f);
    }

    @Override // com.lxj.xpopup.core.AbstractC3776
    public final void onCreate() {
        this.f17489 = (HorizontalScrollView) findViewById(R.id.emo_title);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.PathBar);
        for (String str : AbstractC6345.m11893()) {
            TextView textView = new TextView(getContext());
            textView.setText(str);
            textView.setTextColor(getResources().getColor(R.color.font_plugin, null));
            textView.setTextSize(24.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(AbstractC6253.m11754(getContext(), 10.0f), 0, AbstractC6253.m11754(getContext(), 10.0f), 0);
            linearLayout.addView(textView, layoutParams);
            textView.requestLayout();
            this.f17495.add(textView);
            textView.setOnClickListener(new ViewOnClickListenerC5562(this, 6, str));
            textView.setOnLongClickListener(new ViewOnLongClickListenerC5545(this, 1, str));
        }
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f17490 = (VerticalRecyclerView) findViewById(R.id.recyclerView);
        C6352 c6352 = new C6352(this, this.f17493);
        this.f17492 = c6352;
        this.f17490.setAdapter(c6352);
        m11936(f17488);
        this.f17490.addOnScrollListener(new C6349());
    }

    @Override // com.lxj.xpopup.core.AbstractC3776
    public final void onDismiss() {
        for (View view : this.f17494) {
            ComponentCallbacks2C3064 componentCallbacks2C3064M6765 = ComponentCallbacks2C3058.m6765(AbstractC6358.f17507);
            componentCallbacks2C3064M6765.getClass();
            componentCallbacks2C3064M6765.m6795(new C3061(view));
        }
        ComponentCallbacks2C3058.m6767(AbstractC6358.f17507).m6768();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11935(String str) {
        ArrayList arrayList = this.f17493;
        arrayList.clear();
        String str2 = AbstractC6345.f17478;
        File[] fileArrListFiles = new File(AbstractC0053.m151(new StringBuilder(), AbstractC6345.f17478, str)).listFiles();
        ArrayList arrayList2 = new ArrayList();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            C6346[] c6346Arr = new C6346[length];
            for (int i = 0; i < fileArrListFiles.length; i++) {
                C6346 c6346 = new C6346();
                c6346Arr[i] = c6346;
                File file = fileArrListFiles[i];
                c6346.f17480 = file;
                c6346.f17479 = file.lastModified();
            }
            Arrays.sort(c6346Arr, new C0707(7));
            for (int i2 = 0; i2 < length; i2++) {
                fileArrListFiles[i2] = c6346Arr[i2].f17480;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !file2.getName().endsWith(AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵呜呜"))) {
                    C6348 c6348 = new C6348();
                    c6348.f17485 = 1;
                    file2.getName();
                    c6348.f17486 = file2.getAbsolutePath();
                    arrayList2.add(c6348);
                }
            }
        }
        this.f17491 = arrayList2;
        int size = (arrayList2.size() / 4) + 1;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ArrayList());
        }
        for (int i4 = 0; i4 < this.f17491.size(); i4++) {
            ((ArrayList) arrayList.get(i4 / 4)).add((C6348) this.f17491.get(i4));
        }
        this.f17492.m4791();
        this.f17490.postDelayed(new RunnableC1107(this, 17), 100L);
        f17488 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11936(String str) {
        ArrayList arrayListM11893 = AbstractC6345.m11893();
        if (arrayListM11893.isEmpty()) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f17495;
        if (zIsEmpty) {
            m11935((String) arrayListM11893.get(0));
            ((View) arrayList.get(0)).setBackground(getResources().getDrawable(R.drawable.menu_item_base, null));
            return;
        }
        if (!arrayListM11893.contains(str)) {
            m11935((String) arrayListM11893.get(0));
            ((View) arrayList.get(0)).setBackground(getResources().getDrawable(R.drawable.menu_item_base, null));
            return;
        }
        int i = 0;
        while (true) {
            if (i >= arrayListM11893.size()) {
                break;
            }
            if (((String) arrayListM11893.get(i)).equals(str)) {
                this.f17489.post(new RunnableC6351(this, i, 0));
                break;
            }
            i++;
        }
        m11935(str);
    }
}
