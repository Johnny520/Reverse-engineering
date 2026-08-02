package p000;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u91 {

    /* JADX INFO: renamed from: a */
    public final View f11157a;

    /* JADX INFO: renamed from: b */
    public final sz0 f11158b;

    /* JADX INFO: renamed from: e */
    public t91 f11161e;

    /* JADX INFO: renamed from: f */
    public b03 f11162f;

    /* JADX INFO: renamed from: g */
    public za3 f11163g;

    /* JADX INFO: renamed from: l */
    public Rect f11168l;

    /* JADX INFO: renamed from: m */
    public final n91 f11169m;

    /* JADX INFO: renamed from: c */
    public in0 f11159c = new nx0(16);

    /* JADX INFO: renamed from: d */
    public in0 f11160d = new nx0(17);

    /* JADX INFO: renamed from: h */
    public k03 f11164h = new k03("", f13.f2737b, 4);

    /* JADX INFO: renamed from: i */
    public xx0 f11165i = xx0.f13213g;

    /* JADX INFO: renamed from: j */
    public final ArrayList f11166j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final j71 f11167k = AbstractC0570p7.m3746B(i91.f4498i, new C0727ta(14, this));

    public u91(View view, C0342j9 c0342j9, sz0 sz0Var) {
        this.f11157a = view;
        this.f11158b = sz0Var;
        this.f11169m = new n91(c0342j9, sz0Var);
    }

    /* JADX INFO: renamed from: a */
    public final l62 m5475a(EditorInfo editorInfo) {
        int i;
        int i2;
        k03 k03Var = this.f11164h;
        String str = k03Var.f5296a.f10051i;
        long j = k03Var.f5297b;
        xx0 xx0Var = this.f11165i;
        int i3 = xx0Var.f13218e;
        int i4 = xx0Var.f13217d;
        boolean z = xx0Var.f13214a;
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
                C0676s.m4653l("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        kc1 kc1Var = xx0Var.f13219f;
        if (t11.m5086l(kc1Var, kc1.f5453j)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(kc1Var, 10));
            Iterator it = kc1Var.f5454h.iterator();
            while (it.hasNext()) {
                arrayList.add(((jc1) it.next()).f4962a);
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
                C0676s.m4653l("Invalid Keyboard Type");
                return null;
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (xx0Var.f13218e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = xx0Var.f13215b;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (xx0Var.f13216c) {
                editorInfo.inputType |= AIChatConfig.MaxOutputTokens;
            }
        }
        int i7 = f13.f2738c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        tp0.m5348L(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!bw2.f1059a || i4 == 7 || i4 == 8) {
            tp0.m5349M(editorInfo, false);
        } else {
            tp0.m5349M(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(AbstractC0179eu.m1435P(AbstractC0195f9.m1568h(), AbstractC0195f9.m1557A(), AbstractC0195f9.m1582v(), AbstractC0195f9.m1585y(), AbstractC0195f9.m1558B(), AbstractC0195f9.m1559C(), AbstractC0195f9.m1560D()));
            editorInfo.setSupportedHandwritingGesturePreviews(AbstractC0460mg.m3106u0(new Class[]{AbstractC0195f9.m1568h(), AbstractC0195f9.m1557A(), AbstractC0195f9.m1582v(), AbstractC0195f9.m1585y()}));
        }
        o91 o91Var = p91.f8043a;
        l62 l62Var = new l62(this.f11164h, new C0485n4(27, this), this.f11165i.f13216c, this.f11161e, this.f11162f, this.f11163g);
        this.f11166j.add(new WeakReference(l62Var));
        return l62Var;
    }
}
