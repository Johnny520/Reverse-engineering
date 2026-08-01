package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0113;
import androidx.collection.C0236;
import androidx.collection.C0245;
import androidx.compose.ui.focus.C1452;
import androidx.compose.ui.focus.InterfaceC1484;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1951;
import androidx.compose.ui.semantics.C1956;
import androidx.compose.ui.spatial.C1961;
import kotlin.C5175;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: androidx.compose.ui.autofill.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1407 extends AbstractC1417 implements InterfaceC1484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f4061;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1961 f4062;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0245 f4063;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f4064;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Rect f4065 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AutofillId f4066;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1951 f4067;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f4068;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0113 f4069;

    public C1407(C0113 c0113, C1951 c1951, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C1961 c1961, String str) {
        this.f4069 = c0113;
        this.f4067 = c1951;
        this.f4068 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f4062 = c1961;
        this.f4061 = str;
        viewTreeObserverOnGlobalLayoutListenerC1884.setImportantForAutofill(1);
        AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC1884.getAutofillId();
        if (autofillId == null) {
            throw AbstractC0053.m139("Required value was null.");
        }
        this.f4066 = autofillId;
        this.f4063 = new C0245();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2531(final C1748 c1748) {
        this.f4062.f5822.m562(new InterfaceC6551() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p052.InterfaceC6551
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return C5175.f14739;
            }

            public final void invoke(int i, int i2, int i3, int i4) {
                this.this$0.f4065.set(i, i2, i3, i4);
                C1407 c1407 = this.this$0;
                C0113 c0113 = c1407.f4069;
                ((AutofillManager) c0113.f357).requestAutofill(c1407.f4068, ((C1748) c1748).f5122, c1407.f4065);
            }
        }, c1748.f5122);
    }

    @Override // androidx.compose.ui.focus.InterfaceC1484
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2532(C1452 c1452, C1452 c14522) {
        C1748 c1748M3336;
        C1956 c1956M3244;
        C1748 c1748M33362;
        C1956 c1956M32442;
        if (c1452 != null && (c1748M33362 = AbstractC1785.m3336(c1452)) != null && (c1956M32442 = c1748M33362.m3244()) != null) {
            C0236 c0236 = c1956M32442.f5778;
            if (c0236.m752(AbstractC1959.f5806) || c0236.m752(AbstractC1959.f5805)) {
                ((AutofillManager) this.f4069.f357).notifyViewExited(this.f4068, c1748M33362.f5122);
            }
        }
        if (c14522 == null || (c1748M3336 = AbstractC1785.m3336(c14522)) == null || (c1956M3244 = c1748M3336.m3244()) == null) {
            return;
        }
        C0236 c02362 = c1956M3244.f5778;
        if (c02362.m752(AbstractC1959.f5806) || c02362.m752(AbstractC1959.f5805)) {
            final int i = c1748M3336.f5122;
            this.f4062.f5822.m562(new InterfaceC6551() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // p052.InterfaceC6551
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                    return C5175.f14739;
                }

                public final void invoke(int i2, int i3, int i4, int i5) {
                    C1407 c1407 = this.this$0;
                    C0113 c0113 = c1407.f4069;
                    ((AutofillManager) c0113.f357).notifyViewEntered(c1407.f4068, i, new Rect(i2, i3, i4, i5));
                }
            }, i);
        }
    }
}
