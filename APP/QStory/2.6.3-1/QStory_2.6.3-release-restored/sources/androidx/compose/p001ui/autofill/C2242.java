package androidx.compose.p001ui.autofill;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0960;
import androidx.collection.C1083;
import androidx.collection.C1092;
import androidx.compose.p001ui.focus.C2287;
import androidx.compose.p001ui.focus.InterfaceC2319;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2786;
import androidx.compose.p001ui.semantics.C2791;
import androidx.compose.p001ui.spatial.C2796;
import kotlin.C6008;
import p068.InterfaceC7381;

/* JADX INFO: renamed from: androidx.compose.ui.autofill.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2242 extends AbstractC2252 implements InterfaceC2319 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f4407;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2796 f4408;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C1092 f4409;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f4410;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Rect f4411 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AutofillId f4412;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2786 f4413;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f4414;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0960 f4415;

    public C2242(C0960 c0960, C2786 c2786, ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, C2796 c2796, String str) {
        this.f4415 = c0960;
        this.f4413 = c2786;
        this.f4414 = viewTreeObserverOnGlobalLayoutListenerC2719;
        this.f4408 = c2796;
        this.f4407 = str;
        viewTreeObserverOnGlobalLayoutListenerC2719.setImportantForAutofill(1);
        AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC2719.getAutofillId();
        if (autofillId == null) {
            throw AbstractC0900.m699("Required value was null.");
        }
        this.f4412 = autofillId;
        this.f4409 = new C1092();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3101(final C2583 c2583) {
        this.f4408.f6168.m1123(new InterfaceC7381() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p068.InterfaceC7381
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return C6008.f15084;
            }

            public final void invoke(int i, int i2, int i3, int i4) {
                this.this$0.f4411.set(i, i2, i3, i4);
                C2242 c2242 = this.this$0;
                C0960 c0960 = c2242.f4415;
                ((AutofillManager) c0960.f702).requestAutofill(c2242.f4414, ((C2583) c2583).f5468, c2242.f4411);
            }
        }, c2583.f5468);
    }

    @Override // androidx.compose.p001ui.focus.InterfaceC2319
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo3102(C2287 c2287, C2287 c22872) {
        C2583 c2583M3906;
        C2791 c2791M3814;
        C2583 c2583M39062;
        C2791 c2791M38142;
        if (c2287 != null && (c2583M39062 = AbstractC2620.m3906(c2287)) != null && (c2791M38142 = c2583M39062.m3814()) != null) {
            C1083 c1083 = c2791M38142.f6124;
            if (c1083.m1313(AbstractC2794.f6152) || c1083.m1313(AbstractC2794.f6151)) {
                ((AutofillManager) this.f4415.f702).notifyViewExited(this.f4414, c2583M39062.f5468);
            }
        }
        if (c22872 == null || (c2583M3906 = AbstractC2620.m3906(c22872)) == null || (c2791M3814 = c2583M3906.m3814()) == null) {
            return;
        }
        C1083 c10832 = c2791M3814.f6124;
        if (c10832.m1313(AbstractC2794.f6152) || c10832.m1313(AbstractC2794.f6151)) {
            final int i = c2583M3906.f5468;
            this.f4408.f6168.m1123(new InterfaceC7381() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // p068.InterfaceC7381
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                    return C6008.f15084;
                }

                public final void invoke(int i2, int i3, int i4, int i5) {
                    C2242 c2242 = this.this$0;
                    C0960 c0960 = c2242.f4415;
                    ((AutofillManager) c0960.f702).notifyViewEntered(c2242.f4414, i, new Rect(i2, i3, i4, i5));
                }
            }, i);
        }
    }
}
