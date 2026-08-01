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
import kotlin.C5176;
import kotlin.collections.AbstractC4345;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.sync.C5380;
import p194.AbstractC7831;
import p194.C7832;
import p194.C7833;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0922 implements InterfaceC0917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public TextClassifier f2615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7832 f2617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SelectedTextType f2618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Context f2619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4360 f2620;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5380 f2616 = new C5380();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f2622 = AbstractC1367.m2474(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f2621 = new Object();

    public C0922(InterfaceC4360 interfaceC4360, Context context, SelectedTextType selectedTextType, C7832 c7832) {
        this.f2620 = interfaceC4360;
        this.f2619 = context;
        this.f2618 = selectedTextType;
        this.f2617 = c7832;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1859(androidx.compose.foundation.text.selection.C0922 r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0922.m1859(androidx.compose.foundation.text.selection.飘花落叶言子楪哲苏兰世, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m1860(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        if (charSequence.length() == 0 || C2035.m3752(j)) {
            return null;
        }
        return AbstractC5399.m10470(this.f2620, new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this, new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(charSequence, j, this, null), null), suspendLambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m1861(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        if (charSequence.length() == 0 || C2035.m3752(j)) {
            return C5176.f14739;
        }
        return AbstractC5399.m10470(this.f2620, new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this, new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this, charSequence, j, null), null), suspendLambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LocaleList m1862() {
        C7832 c7832 = this.f2617;
        if (c7832 == null) {
            return new LocaleList(((C7833) AbstractC7831.f21371.m13192().f21374.get(0)).f21375);
        }
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(c7832, 10));
        Iterator it = c7832.f21374.iterator();
        while (it.hasNext()) {
            arrayList.add(((C7833) it.next()).f21375);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
