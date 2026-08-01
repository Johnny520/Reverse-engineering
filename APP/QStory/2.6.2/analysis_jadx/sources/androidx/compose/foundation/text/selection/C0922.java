package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.text.C2035;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.C5175;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.sync.C5379;
import p194.AbstractC7830;
import p194.C7831;
import p194.C7832;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0922 implements InterfaceC0917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public TextClassifier f2614;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7831 f2616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SelectedTextType f2617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Context f2618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4359 f2619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5379 f2615 = new C5379();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f2621 = AbstractC1367.m2465(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f2620 = new Object();

    public C0922(InterfaceC4359 interfaceC4359, Context context, SelectedTextType selectedTextType, C7831 c7831) {
        this.f2619 = interfaceC4359;
        this.f2618 = context;
        this.f2617 = selectedTextType;
        this.f2616 = c7831;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1849(androidx.compose.foundation.text.selection.C0922 r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0922.m1849(androidx.compose.foundation.text.selection.飘花落叶言子楪哲苏兰世, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m1850(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        if (charSequence.length() == 0 || C2035.m3742(j)) {
            return null;
        }
        return AbstractC5398.m10466(this.f2619, new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this, new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(charSequence, j, this, null), null), suspendLambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m1851(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        if (charSequence.length() == 0 || C2035.m3742(j)) {
            return C5175.f14739;
        }
        return AbstractC5398.m10466(this.f2619, new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this, new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this, charSequence, j, null), null), suspendLambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LocaleList m1852() {
        C7831 c7831 = this.f2616;
        if (c7831 == null) {
            return new LocaleList(((C7832) AbstractC7830.f21374.m13164().f21377.get(0)).f21378);
        }
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(c7831, 10));
        Iterator it = c7831.f21377.iterator();
        while (it.hasNext()) {
            arrayList.add(((C7832) it.next()).f21378);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
