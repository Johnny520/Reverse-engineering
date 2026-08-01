package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.app.C0113;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.contextmenu.internal.AbstractC0789;
import androidx.compose.foundation.text.handwriting.AbstractC0835;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.platform.InterfaceC1858;
import androidx.compose.ui.platform.InterfaceC1863;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2025;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p034.AbstractC6347;
import p052.InterfaceC6558;
import p167.C7713;
import p194.C7832;
import p194.C7833;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0851 implements InterfaceC1858 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0882 f2392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0943 f2393;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0863 f2396;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f2397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0866 f2398;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC1863 f2400;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Rect f2402;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC6558 f2395 = new C0862(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC6558 f2394 = new C0862(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2013 f2399 = new C2013(4, C2035.f6003, "");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2025 f2403 = C2025.f5968;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f2404 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC5184 f2401 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new C0869(this, 3));

    public C0851(View view, InterfaceC6558 interfaceC6558, InterfaceC0863 interfaceC0863) {
        this.f2397 = view;
        this.f2396 = interfaceC0863;
        this.f2398 = new C0866(interfaceC6558, interfaceC0863);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1858
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InputConnection mo1666(EditorInfo editorInfo) {
        int i;
        int i2;
        C2013 c2013 = this.f2399;
        String str = c2013.f5947.f6129;
        long j = c2013.f5946;
        C2025 c2025 = this.f2403;
        int i3 = c2025.f5970;
        int i4 = c2025.f5971;
        boolean z = c2025.f5974;
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
                C5925.m11311("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        C7832 c7832 = c2025.f5969;
        if (AbstractC4395.m8907(c7832, C7832.f21372)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(c7832, 10));
            Iterator it = c7832.f21374.iterator();
            while (it.hasNext()) {
                arrayList.add(((C7833) it.next()).f21375);
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
                C5925.m11311("Invalid Keyboard Type");
                return null;
            }
            i2 = DexMap.TYPE_STRING_DATA_ITEM;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (c2025.f5970 == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = c2025.f5973;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (c2025.f5972) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = C2035.f6002;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        AbstractC5062.m10020(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC0835.f2370 || i4 == 7 || i4 == 8) {
            AbstractC5062.m10017(editorInfo, false);
        } else {
            AbstractC5062.m10017(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(AbstractC6347.m11931(AbstractC0789.m1613(), AbstractC0789.m1599(), AbstractC0789.m1612(), AbstractC0789.m1610(), AbstractC0789.m1597(), AbstractC0789.m1596(), AbstractC0789.m1595()));
            editorInfo.setSupportedHandwritingGesturePreviews(AbstractC4347.m8845(new Class[]{AbstractC0789.m1613(), AbstractC0789.m1599(), AbstractC0789.m1612(), AbstractC0789.m1610()}));
        }
        InterfaceC6558 interfaceC6558 = AbstractC0852.f2405;
        if (C7713.m13009()) {
            C7713.m13010().m13017(editorInfo);
        }
        InputConnectionC0850 inputConnectionC0850 = new InputConnectionC0850(this.f2399, new C0113(this, 14), this.f2403.f5972, this.f2393, this.f2392, this.f2400);
        this.f2404.add(new WeakReference(inputConnectionC0850));
        return inputConnectionC0850;
    }
}
