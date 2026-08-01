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
import com.bumptech.glide.AbstractC3054;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;
import p167.C7712;
import p194.C7831;
import p194.C7832;
import p253.AbstractC8189;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0851 implements InterfaceC1858 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0882 f2391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0943 f2392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0863 f2395;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f2396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0866 f2397;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC1863 f2399;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Rect f2401;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC6557 f2394 = new C0862(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC6557 f2393 = new C0862(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2013 f2398 = new C2013(4, C2035.f6002, "");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2025 f2402 = C2025.f5967;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f2403 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC5183 f2400 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new C0869(this, 3));

    public C0851(View view, InterfaceC6557 interfaceC6557, InterfaceC0863 interfaceC0863) {
        this.f2396 = view;
        this.f2395 = interfaceC0863;
        this.f2397 = new C0866(interfaceC6557, interfaceC0863);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1858
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InputConnection mo1656(EditorInfo editorInfo) {
        int i;
        int i2;
        C2013 c2013 = this.f2398;
        String str = c2013.f5946.f6128;
        long j = c2013.f5945;
        C2025 c2025 = this.f2402;
        int i3 = c2025.f5969;
        int i4 = c2025.f5970;
        boolean z = c2025.f5973;
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
                C5919.m11250("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        C7831 c7831 = c2025.f5968;
        if (AbstractC4394.m8917(c7831, C7831.f21375)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(c7831, 10));
            Iterator it = c7831.f21377.iterator();
            while (it.hasNext()) {
                arrayList.add(((C7832) it.next()).f21378);
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
                C5919.m11250("Invalid Keyboard Type");
                return null;
            }
            i2 = DexMap.TYPE_STRING_DATA_ITEM;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (c2025.f5969 == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = c2025.f5972;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (c2025.f5971) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = C2035.f6001;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        AbstractC3054.m6593(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC0835.f2369 || i4 == 7 || i4 == 8) {
            AbstractC3054.m6590(editorInfo, false);
        } else {
            AbstractC3054.m6590(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(AbstractC8189.m13659(AbstractC0789.m1603(), AbstractC0789.m1589(), AbstractC0789.m1602(), AbstractC0789.m1600(), AbstractC0789.m1587(), AbstractC0789.m1586(), AbstractC0789.m1585()));
            editorInfo.setSupportedHandwritingGesturePreviews(AbstractC4346.m8852(new Class[]{AbstractC0789.m1603(), AbstractC0789.m1589(), AbstractC0789.m1602(), AbstractC0789.m1600()}));
        }
        InterfaceC6557 interfaceC6557 = AbstractC0852.f2404;
        if (C7712.m12979()) {
            C7712.m12980().m12987(editorInfo);
        }
        InputConnectionC0850 inputConnectionC0850 = new InputConnectionC0850(this.f2398, new C0113(this, 14), this.f2402.f5971, this.f2392, this.f2391, this.f2399);
        this.f2403.add(new WeakReference(inputConnectionC0850));
        return inputConnectionC0850;
    }
}
