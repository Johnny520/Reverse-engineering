package p385;

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
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p215.C7954;
import p215.C7957;
import p216.C7958;
import p217.AbstractC7968;
import p257.C8211;
import p257.C8226;
import p261.AbstractC8247;
import p341.C8816;
import p388.C9102;
import top.suzhelan.plugin.sdk.online.presenter.C5805;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9088 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public ProgressBar f25377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public CustomRecycleView f25378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public View f25379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5805 f25380;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8226 f25381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f25382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f25383;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f25384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Handler f25385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public RunnableC0062 f25386;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public List f25387;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f25388;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public TextView f25389;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public TextView f25390;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f25391;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f25392;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8816 f25393;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C4870 f25394;

    public C9088(Context context) {
        this.f25382 = context;
        C8226 c8226 = new C8226();
        c8226.f22704 = AbstractC8247.f22825;
        c8226.f22703 = -1.0f;
        c8226.f22706 = true;
        c8226.f22702 = c8226;
        this.f25381 = c8226;
        this.f25380 = new C5805(this);
        this.f25391 = 1;
        this.f25392 = 1;
        this.f25384 = 20;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f25385 = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m14593(C9088 c9088) {
        int i;
        if (c9088.f25383 || (i = c9088.f25391) >= c9088.f25392) {
            return;
        }
        c9088.f25383 = true;
        c9088.f25380.m11164(i + 1, c9088.f25384, new C9090(c9088, 4), new C9090(c9088, 5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14594(C9102 c9102, boolean z) {
        ArrayList arrayList;
        this.f25391 = c9102.getPage();
        this.f25392 = c9102.getTotalPages();
        if (z) {
            ProgressBar progressBar = this.f25377;
            if (progressBar == null) {
                AbstractC4394.m8918("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            this.f25387 = c9102.getList();
            TextView textView = this.f25390;
            if (textView == null) {
                AbstractC4394.m8918("tvTitle");
                throw null;
            }
            textView.setText("我的消息 (" + c9102.getList().size() + "/" + c9102.getTotal() + ")");
            C8816 c8816 = this.f25393;
            if (c8816 == null) {
                AbstractC4394.m8918("adapter");
                throw null;
            }
            AbstractC7968.m13430(c8816, c9102.getList());
        } else {
            C8816 c88162 = this.f25393;
            if (c88162 == null) {
                AbstractC4394.m8918("adapter");
                throw null;
            }
            List list = c9102.getList();
            list.getClass();
            if (!list.isEmpty()) {
                c88162.f22045.getClass();
                int size = c88162.f22045.size();
                List list2 = c88162.f22045;
                if (list2 instanceof ArrayList) {
                    arrayList = (ArrayList) list2;
                } else {
                    arrayList = new ArrayList(c88162.f22045);
                    c88162.f22045 = arrayList;
                }
                if (arrayList.addAll(list)) {
                    c88162.m4797(size, list.size());
                }
            }
            this.f25383 = false;
        }
        int i = this.f25391;
        int i2 = this.f25392;
        C4870 c4870 = this.f25394;
        if (i >= i2) {
            if (c4870 == null) {
                AbstractC4394.m8918("helper");
                throw null;
            }
            ((C7958) c4870.f14160).m13422(new C7954(true));
            return;
        }
        if (c4870 == null) {
            AbstractC4394.m8918("helper");
            throw null;
        }
        ((C7958) c4870.f14160).m13422(new C7954(false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14595(String str, boolean z) {
        if (z) {
            ProgressBar progressBar = this.f25377;
            if (progressBar == null) {
                AbstractC4394.m8918("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            C8211.m13720(str);
            return;
        }
        this.f25383 = false;
        C4870 c4870 = this.f25394;
        if (c4870 == null) {
            AbstractC4394.m8918("helper");
            throw null;
        }
        ((C7958) c4870.f14160).m13422(new C7957(new Throwable(str)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14596(String str) {
        ProgressBar progressBar = this.f25377;
        if (progressBar == null) {
            AbstractC4394.m8918("isLoading");
            throw null;
        }
        progressBar.setVisibility(8);
        C8211.m13720(str);
    }
}
