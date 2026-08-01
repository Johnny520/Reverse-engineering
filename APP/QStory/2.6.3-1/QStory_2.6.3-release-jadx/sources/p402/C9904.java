package p402;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.RunnableC0909;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p231.C8784;
import p231.C8787;
import p232.C8788;
import p233.AbstractC8798;
import p273.C9041;
import p273.C9069;
import p359.C9648;
import p401.C9898;
import top.suzhelan.plugin.sdk.online.presenter.C6636;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public ProgressBar f25772;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public CustomRecycleView f25773;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public View f25774;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f25777;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f25778;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Handler f25780;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public RunnableC0909 f25781;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public List f25782;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f25783;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public TextView f25784;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public TextView f25785;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C9648 f25788;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C5703 f25789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9069 f25776 = C9069.m14318();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6636 f25775 = new C6636(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f25786 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f25787 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f25779 = 20;

    public C9904(Context context) {
        this.f25777 = context;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f25780 = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m15209(C9904 c9904) {
        int i;
        if (c9904.f25778 || (i = c9904.f25786) >= c9904.f25787) {
            return;
        }
        c9904.f25778 = true;
        c9904.f25775.m11780(i + 1, c9904.f25779, new C9906(c9904, 4), new C9906(c9904, 5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m15210(C9898 c9898, boolean z) {
        ArrayList arrayList;
        this.f25786 = c9898.getPage();
        this.f25787 = c9898.getTotalPages();
        if (z) {
            ProgressBar progressBar = this.f25772;
            if (progressBar == null) {
                AbstractC5227.m9467("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            this.f25782 = c9898.getList();
            TextView textView = this.f25785;
            if (textView == null) {
                AbstractC5227.m9467("tvTitle");
                throw null;
            }
            textView.setText("我的消息 (" + c9898.getList().size() + "/" + c9898.getTotal() + ")");
            C9648 c9648 = this.f25788;
            if (c9648 == null) {
                AbstractC5227.m9467("adapter");
                throw null;
            }
            AbstractC8798.m14017(c9648, c9898.getList());
        } else {
            C9648 c96482 = this.f25788;
            if (c96482 == null) {
                AbstractC5227.m9467("adapter");
                throw null;
            }
            List list = c9898.getList();
            list.getClass();
            if (!list.isEmpty()) {
                c96482.f22387.getClass();
                int size = c96482.f22387.size();
                List list2 = c96482.f22387;
                if (list2 instanceof ArrayList) {
                    arrayList = (ArrayList) list2;
                } else {
                    arrayList = new ArrayList(c96482.f22387);
                    c96482.f22387 = arrayList;
                }
                if (arrayList.addAll(list)) {
                    c96482.m5367(size, list.size());
                }
            }
            this.f25778 = false;
        }
        int i = this.f25786;
        int i2 = this.f25787;
        C5703 c5703 = this.f25789;
        if (i >= i2) {
            if (c5703 == null) {
                AbstractC5227.m9467("helper");
                throw null;
            }
            ((C8788) c5703.f14509).m14009(new C8784(true));
            return;
        }
        if (c5703 == null) {
            AbstractC5227.m9467("helper");
            throw null;
        }
        ((C8788) c5703.f14509).m14009(new C8784(false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m15211(String str, boolean z) {
        if (z) {
            ProgressBar progressBar = this.f25772;
            if (progressBar == null) {
                AbstractC5227.m9467("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            C9041.m14296(str);
            return;
        }
        this.f25778 = false;
        C5703 c5703 = this.f25789;
        if (c5703 == null) {
            AbstractC5227.m9467("helper");
            throw null;
        }
        ((C8788) c5703.f14509).m14009(new C8787(new Throwable(str)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m15212(String str) {
        ProgressBar progressBar = this.f25772;
        if (progressBar == null) {
            AbstractC5227.m9467("isLoading");
            throw null;
        }
        progressBar.setVisibility(8);
        C9041.m14296(str);
    }
}
