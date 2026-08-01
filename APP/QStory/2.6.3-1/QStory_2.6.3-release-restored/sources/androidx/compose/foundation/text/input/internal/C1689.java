package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.app.C0960;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.contextmenu.internal.AbstractC1629;
import androidx.compose.foundation.text.handwriting.AbstractC1675;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.platform.InterfaceC2693;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2859;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p183.C8542;
import p210.C8661;
import p210.C8662;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1689 implements InterfaceC2693 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1720 f2737;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C1781 f2738;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1701 f2741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f2742;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C1704 f2743;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC2698 f2745;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Rect f2747;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC7387 f2740 = new C1700(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC7387 f2739 = new C1700(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2847 f2744 = new C2847(4, C2869.f6348, "");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2859 f2748 = C2859.f6313;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f2749 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC6016 f2746 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new C1707(this, 3));

    public C1689(View view, InterfaceC7387 interfaceC7387, InterfaceC1701 interfaceC1701) {
        this.f2742 = view;
        this.f2741 = interfaceC1701;
        this.f2743 = new C1704(interfaceC7387, interfaceC1701);
    }

    @Override // androidx.compose.p001ui.platform.InterfaceC2693
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InputConnection mo2226(EditorInfo editorInfo) {
        int i;
        int i2;
        C2847 c2847 = this.f2744;
        String str = c2847.f6292.f6474;
        long j = c2847.f6291;
        C2859 c2859 = this.f2748;
        int i3 = c2859.f6315;
        int i4 = c2859.f6316;
        boolean z = c2859.f6319;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                C6755.m11870("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        C8661 c8661 = c2859.f6314;
        if (AbstractC5227.m9466(c8661, C8661.f21717)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(c8661, 10));
            Iterator it = c8661.f21719.iterator();
            while (it.hasNext()) {
                arrayList.add(((C8662) it.next()).f21720);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                C6755.m11870("Invalid Keyboard Type");
                return null;
            }
            i2 = DexMap.TYPE_STRING_DATA_ITEM;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (c2859.f6315 == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = c2859.f6318;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (c2859.f6317) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = C2869.f6347;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        AbstractC5894.m10579(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC1675.f2715 || i4 == 7 || i4 == 8) {
            AbstractC5894.m10576(editorInfo, false);
        } else {
            AbstractC5894.m10576(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(AbstractC7176.m12490(AbstractC1629.m2173(), AbstractC1629.m2159(), AbstractC1629.m2172(), AbstractC1629.m2170(), AbstractC1629.m2157(), AbstractC1629.m2156(), AbstractC1629.m2155()));
            editorInfo.setSupportedHandwritingGesturePreviews(AbstractC5179.m9404(new Class[]{AbstractC1629.m2173(), AbstractC1629.m2159(), AbstractC1629.m2172(), AbstractC1629.m2170()}));
        }
        InterfaceC7387 interfaceC7387 = AbstractC1690.f2750;
        if (C8542.m13568()) {
            C8542.m13569().m13576(editorInfo);
        }
        InputConnectionC1688 inputConnectionC1688 = new InputConnectionC1688(this.f2744, new C0960(this, 14), this.f2748.f6317, this.f2738, this.f2737, this.f2745);
        this.f2749.add(new WeakReference(inputConnectionC1688));
        return inputConnectionC1688;
    }
}
