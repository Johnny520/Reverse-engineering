package androidx.compose.ui.text.input;

import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.core.view.C2225;
import androidx.core.view.InterfaceC2205;
import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4211;
import p009.AbstractC6183;
import p164.C7665;
import p195.AbstractC7834;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2023 implements InterfaceC2205 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f5961;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f5962;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f5963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f5964;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f5965;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5966 = 1;

    public C2023(C2068 c2068, long j) {
        String str = c2068.f6129;
        C2019 c2019 = new C2019((byte) 0, 0);
        c2019.f5957 = str;
        c2019.f5959 = -1;
        c2019.f5958 = -1;
        this.f5963 = c2019;
        this.f5964 = C2035.m3757(j);
        this.f5965 = C2035.m3750(j);
        this.f5962 = -1;
        this.f5961 = -1;
        int iM3757 = C2035.m3757(j);
        int iM3750 = C2035.m3750(j);
        if (iM3757 < 0 || iM3757 > str.length()) {
            C4211.m8614(AbstractC0053.m150(iM3757, "start (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iM3750 < 0 || iM3750 > str.length()) {
            C4211.m8614(AbstractC0053.m150(iM3750, "end (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iM3757 <= iM3750) {
            return;
        }
        C5925.m11310(AbstractC6183.m11591(iM3757, iM3750, "Do not set reversed range: ", " > "));
        throw null;
    }

    public String toString() {
        switch (this.f5966) {
            case 0:
                return ((C2019) this.f5963).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m3727(int i, int i2) {
        C2019 c2019 = (C2019) this.f5963;
        if (i < 0 || i > c2019.m3720()) {
            C4211.m8614(AbstractC0053.m150(i, "start (", ") offset is outside of text region "), c2019.m3720());
            return;
        }
        if (i2 < 0 || i2 > c2019.m3720()) {
            C4211.m8614(AbstractC0053.m150(i2, "end (", ") offset is outside of text region "), c2019.m3720());
        } else if (i > i2) {
            C5925.m11310(AbstractC6183.m11591(i, i2, "Do not set reversed range: ", " > "));
        } else {
            m3733(i);
            m3734(i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m3728(int i, int i2) {
        C2019 c2019 = (C2019) this.f5963;
        if (i < 0 || i > c2019.m3720()) {
            C4211.m8614(AbstractC0053.m150(i, "start (", ") offset is outside of text region "), c2019.m3720());
            return;
        }
        if (i2 < 0 || i2 > c2019.m3720()) {
            C4211.m8614(AbstractC0053.m150(i2, "end (", ") offset is outside of text region "), c2019.m3720());
        } else if (i >= i2) {
            C5925.m11310(AbstractC6183.m11591(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.f5962 = i;
            this.f5961 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m3729(int i, int i2, String str) {
        C2019 c2019 = (C2019) this.f5963;
        if (i < 0 || i > c2019.m3720()) {
            C4211.m8614(AbstractC0053.m150(i, "start (", ") offset is outside of text region "), c2019.m3720());
            return;
        }
        if (i2 < 0 || i2 > c2019.m3720()) {
            C4211.m8614(AbstractC0053.m150(i2, "end (", ") offset is outside of text region "), c2019.m3720());
            return;
        }
        if (i > i2) {
            C5925.m11310(AbstractC6183.m11591(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        c2019.m3724(i, i2, str);
        m3733(str.length() + i);
        m3734(str.length() + i);
        this.f5962 = -1;
        this.f5961 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2035 m3730() {
        int i = this.f5962;
        if (i != -1) {
            return new C2035(AbstractC2048.m3770(i, this.f5961));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public char m3731(int i) {
        C2019 c2019 = (C2019) this.f5963;
        C0920 c0920 = (C0920) c2019.f5956;
        if (c0920 == null) {
            return ((String) c2019.f5957).charAt(i);
        }
        if (i < c2019.f5959) {
            return ((String) c2019.f5957).charAt(i);
        }
        int iM1825 = c0920.f2613 - c0920.m1825();
        int i2 = c2019.f5959;
        if (i >= iM1825 + i2) {
            return ((String) c2019.f5957).charAt(i - ((iM1825 - c2019.f5958) + i2));
        }
        int i3 = i - i2;
        int i4 = c0920.f2612;
        char[] cArr = (char[]) c0920.f2610;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + c0920.f2611];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m3732(int i, int i2) {
        long jM3770 = AbstractC2048.m3770(i, i2);
        ((C2019) this.f5963).m3724(i, i2, "");
        long jM6738 = AbstractC3057.m6738(AbstractC2048.m3770(this.f5964, this.f5965), jM3770);
        m3733(C2035.m3757(jM6738));
        m3734(C2035.m3750(jM6738));
        int i3 = this.f5962;
        if (i3 != -1) {
            long jM67382 = AbstractC3057.m6738(AbstractC2048.m3770(i3, this.f5961), jM3770);
            if (C2035.m3752(jM67382)) {
                this.f5962 = -1;
                this.f5961 = -1;
            } else {
                this.f5962 = C2035.m3757(jM67382);
                this.f5961 = C2035.m3750(jM67382);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m3733(int i) {
        if (!(i >= 0)) {
            AbstractC7834.m13198("Cannot set selectionStart to a negative value: " + i);
        }
        this.f5964 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m3734(int i) {
        if (!(i >= 0)) {
            AbstractC7834.m13198("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f5965 = i;
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo303(View view, C2225 c2225) {
        View view2 = (View) this.f5963;
        C7665 c7665Mo4052 = c2225.f6521.mo4052(519);
        int i = this.f5964;
        if (i >= 0) {
            view2.getLayoutParams().height = i + c7665Mo4052.f20809;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f5965 + c7665Mo4052.f20810, this.f5962 + c7665Mo4052.f20809, this.f5961 + c7665Mo4052.f20808, view2.getPaddingBottom());
        return c2225;
    }

    public C2023(View view, int i, int i2, int i3, int i4) {
        this.f5964 = i;
        this.f5963 = view;
        this.f5965 = i2;
        this.f5962 = i3;
        this.f5961 = i4;
    }
}
