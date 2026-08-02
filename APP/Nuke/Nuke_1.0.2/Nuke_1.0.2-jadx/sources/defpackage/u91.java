package defpackage;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u91 {
    public final View a;
    public final sz0 b;
    public t91 e;
    public b03 f;
    public za3 g;
    public Rect l;
    public final n91 m;
    public in0 c = new nx0(16);
    public in0 d = new nx0(17);
    public k03 h = new k03("", f13.b, 4);
    public xx0 i = xx0.g;
    public final ArrayList j = new ArrayList();
    public final j71 k = p7.B(i91.i, new ta(14, this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u91(View view, j9 j9Var, sz0 sz0Var) {
        this.a = view;
        this.b = sz0Var;
        this.m = new n91(j9Var, sz0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l62 a(EditorInfo editorInfo) {
        int i;
        int i2;
        k03 k03Var = this.h;
        String str = k03Var.a.i;
        long j = k03Var.b;
        xx0 xx0Var = this.i;
        int i3 = xx0Var.e;
        int i4 = xx0Var.d;
        boolean z = xx0Var.a;
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
                s.l("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        kc1 kc1Var = xx0Var.f;
        if (t11.l(kc1Var, kc1.j)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(eu.B(kc1Var, 10));
            Iterator it = kc1Var.h.iterator();
            while (it.hasNext()) {
                arrayList.add(((jc1) it.next()).a);
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
                s.l("Invalid Keyboard Type");
                return null;
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (xx0Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = xx0Var.b;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (xx0Var.c) {
                editorInfo.inputType |= AIChatConfig.MaxOutputTokens;
            }
        }
        int i7 = f13.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        tp0.L(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!bw2.a || i4 == 7 || i4 == 8) {
            tp0.M(editorInfo, false);
        } else {
            tp0.M(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(eu.P(f9.h(), f9.A(), f9.v(), f9.y(), f9.B(), f9.C(), f9.D()));
            editorInfo.setSupportedHandwritingGesturePreviews(mg.u0(new Class[]{f9.h(), f9.A(), f9.v(), f9.y()}));
        }
        o91 o91Var = p91.a;
        l62 l62Var = new l62(this.h, new n4(27, this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(l62Var));
        return l62Var;
    }
}
