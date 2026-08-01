package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.activity.AbstractC0892;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.InterfaceC2230;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5177;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p210.AbstractC8660;
import p210.C8661;
import p210.C8662;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1760 implements InterfaceC1755 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public TextClassifier f2960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8661 f2962;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SelectedTextType f2963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Context f2964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5192 f2965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6212 f2961 = new C6212();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC2230 f2967 = AbstractC2202.m3034(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f2966 = new Object();

    public C1760(InterfaceC5192 interfaceC5192, Context context, SelectedTextType selectedTextType, C8661 c8661) {
        this.f2965 = interfaceC5192;
        this.f2964 = context;
        this.f2963 = selectedTextType;
        this.f2962 = c8661;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2419(C1760 c1760, CharSequence charSequence, long j, TextClassifier textClassifier, ContinuationImpl continuationImpl) {
        PlatformSelectionBehaviorsImpl$classifyText$1 platformSelectionBehaviorsImpl$classifyText$1;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        Object obj;
        TextClassification textClassificationClassifyText;
        long j3;
        CharSequence charSequence3;
        boolean z;
        Object obj2;
        C6212 c6212 = c1760.f2961;
        InterfaceC2230 interfaceC2230 = c1760.f2967;
        if (continuationImpl instanceof PlatformSelectionBehaviorsImpl$classifyText$1) {
            platformSelectionBehaviorsImpl$classifyText$1 = (PlatformSelectionBehaviorsImpl$classifyText$1) continuationImpl;
            int i = platformSelectionBehaviorsImpl$classifyText$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                platformSelectionBehaviorsImpl$classifyText$1.label = i - Integer.MIN_VALUE;
            } else {
                platformSelectionBehaviorsImpl$classifyText$1 = new PlatformSelectionBehaviorsImpl$classifyText$1(c1760, continuationImpl);
            }
        }
        Object obj3 = platformSelectionBehaviorsImpl$classifyText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = platformSelectionBehaviorsImpl$classifyText$1.label;
        C6008 c6008 = C6008.f15084;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj3);
                platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence;
                platformSelectionBehaviorsImpl$classifyText$1.L$1 = textClassifier;
                platformSelectionBehaviorsImpl$classifyText$1.L$2 = c6212;
                j2 = j;
                platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
                platformSelectionBehaviorsImpl$classifyText$1.label = 1;
                if (c6212.m10986(platformSelectionBehaviorsImpl$classifyText$1) != coroutineSingletons) {
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    obj = c6212;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = platformSelectionBehaviorsImpl$classifyText$1.J$0;
                InterfaceC6215 interfaceC6215 = (InterfaceC6215) platformSelectionBehaviorsImpl$classifyText$1.L$2;
                textClassificationClassifyText = (TextClassification) platformSelectionBehaviorsImpl$classifyText$1.L$1;
                charSequence3 = (CharSequence) platformSelectionBehaviorsImpl$classifyText$1.L$0;
                AbstractC6017.m10769(obj3);
                obj2 = interfaceC6215;
                try {
                    ((AbstractC2182) interfaceC2230).setValue(new C1729(charSequence3, j3, textClassificationClassifyText));
                    return c6008;
                } finally {
                }
            }
            j2 = platformSelectionBehaviorsImpl$classifyText$1.J$0;
            InterfaceC6215 interfaceC62152 = (InterfaceC6215) platformSelectionBehaviorsImpl$classifyText$1.L$2;
            textClassifier2 = (TextClassifier) platformSelectionBehaviorsImpl$classifyText$1.L$1;
            charSequence2 = (CharSequence) platformSelectionBehaviorsImpl$classifyText$1.L$0;
            AbstractC6017.m10769(obj3);
            obj = interfaceC62152;
            C1729 c1729 = (C1729) ((AbstractC2182) interfaceC2230).getValue();
            if (c1729 != null) {
                C2169 c2169 = AbstractC1757.f2954;
                if (C2869.m4313(j2, c1729.f2877)) {
                    z = AbstractC5227.m9466(charSequence2, c1729.f2878);
                    if (z) {
                        return c6008;
                    }
                }
                if (z) {
                }
            }
            ((C6212) obj).m10991(null);
            AbstractC0892.m684();
            textClassificationClassifyText = textClassifier2.classifyText(AbstractC0892.m688(charSequence2, C2869.m4317(j2), C2869.m4310(j2)).setDefaultLocales(c1760.m2422()).build());
            platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence2;
            platformSelectionBehaviorsImpl$classifyText$1.L$1 = textClassificationClassifyText;
            platformSelectionBehaviorsImpl$classifyText$1.L$2 = c6212;
            platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
            platformSelectionBehaviorsImpl$classifyText$1.label = 2;
            if (c6212.m10986(platformSelectionBehaviorsImpl$classifyText$1) != coroutineSingletons) {
                j3 = j2;
                charSequence3 = charSequence2;
                obj2 = c6212;
                ((AbstractC2182) interfaceC2230).setValue(new C1729(charSequence3, j3, textClassificationClassifyText));
                return c6008;
            }
            return coroutineSingletons;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m2420(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        if (charSequence.length() == 0 || C2869.m4312(j)) {
            return null;
        }
        return AbstractC6231.m11029(this.f2965, new C0120xa7a7d588(this, new C0122xcb45b7e0(charSequence, j, this, null), null), suspendLambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m2421(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        if (charSequence.length() == 0 || C2869.m4312(j)) {
            return C6008.f15084;
        }
        return AbstractC6231.m11029(this.f2965, new C0120xa7a7d588(this, new C0119x101d3cd6(this, charSequence, j, null), null), suspendLambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LocaleList m2422() {
        C8661 c8661 = this.f2962;
        if (c8661 == null) {
            return new LocaleList(((C8662) AbstractC8660.f21716.m13751().f21719.get(0)).f21720);
        }
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(c8661, 10));
        Iterator it = c8661.f21719.iterator();
        while (it.hasNext()) {
            arrayList.add(((C8662) it.next()).f21720);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
