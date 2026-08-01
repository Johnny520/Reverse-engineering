package p386;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.RunnableC0062;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p215.C7955;
import p215.C7958;
import p216.C7959;
import p217.AbstractC7969;
import p257.C8212;
import p257.C8240;
import p343.C8819;
import p385.C9069;
import top.suzhelan.plugin.sdk.online.presenter.C5806;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9075 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public ProgressBar f25427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public CustomRecycleView f25428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public View f25429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f25432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f25433;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Handler f25435;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public RunnableC0062 f25436;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public List f25437;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f25438;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public TextView f25439;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public TextView f25440;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8819 f25443;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C4871 f25444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8240 f25431 = C8240.m13759();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5806 f25430 = new C5806(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f25441 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f25442 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f25434 = 20;

    public C9075(Context context) {
        this.f25432 = context;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f25435 = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m14650(C9075 c9075) {
        int i;
        if (c9075.f25433 || (i = c9075.f25441) >= c9075.f25442) {
            return;
        }
        c9075.f25433 = true;
        c9075.f25430.m11221(i + 1, c9075.f25434, new C9077(c9075, 4), new C9077(c9075, 5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14651(C9069 c9069, boolean z) {
        ArrayList arrayList;
        this.f25441 = c9069.getPage();
        this.f25442 = c9069.getTotalPages();
        if (z) {
            ProgressBar progressBar = this.f25427;
            if (progressBar == null) {
                AbstractC4395.m8908("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            this.f25437 = c9069.getList();
            TextView textView = this.f25440;
            if (textView == null) {
                AbstractC4395.m8908("tvTitle");
                throw null;
            }
            textView.setText("我的消息 (" + c9069.getList().size() + "/" + c9069.getTotal() + ")");
            C8819 c8819 = this.f25443;
            if (c8819 == null) {
                AbstractC4395.m8908("adapter");
                throw null;
            }
            AbstractC7969.m13458(c8819, c9069.getList());
        } else {
            C8819 c88192 = this.f25443;
            if (c88192 == null) {
                AbstractC4395.m8908("adapter");
                throw null;
            }
            List list = c9069.getList();
            list.getClass();
            if (!list.isEmpty()) {
                c88192.f22042.getClass();
                int size = c88192.f22042.size();
                List list2 = c88192.f22042;
                if (list2 instanceof ArrayList) {
                    arrayList = (ArrayList) list2;
                } else {
                    arrayList = new ArrayList(c88192.f22042);
                    c88192.f22042 = arrayList;
                }
                if (arrayList.addAll(list)) {
                    c88192.m4807(size, list.size());
                }
            }
            this.f25433 = false;
        }
        int i = this.f25441;
        int i2 = this.f25442;
        C4871 c4871 = this.f25444;
        if (i >= i2) {
            if (c4871 == null) {
                AbstractC4395.m8908("helper");
                throw null;
            }
            ((C7959) c4871.f14164).m13450(new C7955(true));
            return;
        }
        if (c4871 == null) {
            AbstractC4395.m8908("helper");
            throw null;
        }
        ((C7959) c4871.f14164).m13450(new C7955(false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14652(String str, boolean z) {
        if (z) {
            ProgressBar progressBar = this.f25427;
            if (progressBar == null) {
                AbstractC4395.m8908("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            C8212.m13737(str);
            return;
        }
        this.f25433 = false;
        C4871 c4871 = this.f25444;
        if (c4871 == null) {
            AbstractC4395.m8908("helper");
            throw null;
        }
        ((C7959) c4871.f14164).m13450(new C7958(new Throwable(str)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14653(String str) {
        ProgressBar progressBar = this.f25427;
        if (progressBar == null) {
            AbstractC4395.m8908("isLoading");
            throw null;
        }
        progressBar.setVisibility(8);
        C8212.m13737(str);
    }
}
