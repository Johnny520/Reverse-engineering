package androidx.compose.ui.text.input;

import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.core.view.C2225;
import androidx.core.view.InterfaceC2205;
import com.bumptech.glide.AbstractC3055;
import io.ktor.util.C4210;
import p007.AbstractC6136;
import p164.C7664;
import p195.AbstractC7833;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2023 implements InterfaceC2205 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f5960;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f5961;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f5962;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f5963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f5964;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5965 = 1;

    public C2023(C2068 c2068, long j) {
        String str = c2068.f6128;
        C2019 c2019 = new C2019((byte) 0, 0);
        c2019.f5956 = str;
        c2019.f5958 = -1;
        c2019.f5957 = -1;
        this.f5962 = c2019;
        this.f5963 = C2035.m3747(j);
        this.f5964 = C2035.m3740(j);
        this.f5961 = -1;
        this.f5960 = -1;
        int iM3747 = C2035.m3747(j);
        int iM3740 = C2035.m3740(j);
        if (iM3747 < 0 || iM3747 > str.length()) {
            C4210.m8624(AbstractC0053.m148(iM3747, "start (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iM3740 < 0 || iM3740 > str.length()) {
            C4210.m8624(AbstractC0053.m148(iM3740, "end (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iM3747 <= iM3740) {
            return;
        }
        C5919.m11249(AbstractC6136.m11559(iM3747, iM3740, "Do not set reversed range: ", " > "));
        throw null;
    }

    public String toString() {
        switch (this.f5965) {
            case 0:
                return ((C2019) this.f5962).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m3717(int i, int i2) {
        C2019 c2019 = (C2019) this.f5962;
        if (i < 0 || i > c2019.m3710()) {
            C4210.m8624(AbstractC0053.m148(i, "start (", ") offset is outside of text region "), c2019.m3710());
            return;
        }
        if (i2 < 0 || i2 > c2019.m3710()) {
            C4210.m8624(AbstractC0053.m148(i2, "end (", ") offset is outside of text region "), c2019.m3710());
        } else if (i > i2) {
            C5919.m11249(AbstractC6136.m11559(i, i2, "Do not set reversed range: ", " > "));
        } else {
            m3723(i);
            m3724(i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m3718(int i, int i2) {
        C2019 c2019 = (C2019) this.f5962;
        if (i < 0 || i > c2019.m3710()) {
            C4210.m8624(AbstractC0053.m148(i, "start (", ") offset is outside of text region "), c2019.m3710());
            return;
        }
        if (i2 < 0 || i2 > c2019.m3710()) {
            C4210.m8624(AbstractC0053.m148(i2, "end (", ") offset is outside of text region "), c2019.m3710());
        } else if (i >= i2) {
            C5919.m11249(AbstractC6136.m11559(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.f5961 = i;
            this.f5960 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m3719(int i, int i2, String str) {
        C2019 c2019 = (C2019) this.f5962;
        if (i < 0 || i > c2019.m3710()) {
            C4210.m8624(AbstractC0053.m148(i, "start (", ") offset is outside of text region "), c2019.m3710());
            return;
        }
        if (i2 < 0 || i2 > c2019.m3710()) {
            C4210.m8624(AbstractC0053.m148(i2, "end (", ") offset is outside of text region "), c2019.m3710());
            return;
        }
        if (i > i2) {
            C5919.m11249(AbstractC6136.m11559(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        c2019.m3714(i, i2, str);
        m3723(str.length() + i);
        m3724(str.length() + i);
        this.f5961 = -1;
        this.f5960 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2035 m3720() {
        int i = this.f5961;
        if (i != -1) {
            return new C2035(AbstractC2048.m3760(i, this.f5960));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public char m3721(int i) {
        C2019 c2019 = (C2019) this.f5962;
        C0920 c0920 = (C0920) c2019.f5955;
        if (c0920 == null) {
            return ((String) c2019.f5956).charAt(i);
        }
        if (i < c2019.f5958) {
            return ((String) c2019.f5956).charAt(i);
        }
        int iM1815 = c0920.f2612 - c0920.m1815();
        int i2 = c2019.f5958;
        if (i >= iM1815 + i2) {
            return ((String) c2019.f5956).charAt(i - ((iM1815 - c2019.f5957) + i2));
        }
        int i3 = i - i2;
        int i4 = c0920.f2611;
        char[] cArr = (char[]) c0920.f2609;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + c0920.f2610];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m3722(int i, int i2) {
        long jM3760 = AbstractC2048.m3760(i, i2);
        ((C2019) this.f5962).m3714(i, i2, "");
        long jM6626 = AbstractC3055.m6626(AbstractC2048.m3760(this.f5963, this.f5964), jM3760);
        m3723(C2035.m3747(jM6626));
        m3724(C2035.m3740(jM6626));
        int i3 = this.f5961;
        if (i3 != -1) {
            long jM66262 = AbstractC3055.m6626(AbstractC2048.m3760(i3, this.f5960), jM3760);
            if (C2035.m3742(jM66262)) {
                this.f5961 = -1;
                this.f5960 = -1;
            } else {
                this.f5961 = C2035.m3747(jM66262);
                this.f5960 = C2035.m3740(jM66262);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m3723(int i) {
        if (!(i >= 0)) {
            AbstractC7833.m13170("Cannot set selectionStart to a negative value: " + i);
        }
        this.f5963 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m3724(int i) {
        if (!(i >= 0)) {
            AbstractC7833.m13170("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f5964 = i;
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo302(View view, C2225 c2225) {
        View view2 = (View) this.f5962;
        C7664 c7664Mo4042 = c2225.f6520.mo4042(519);
        int i = this.f5963;
        if (i >= 0) {
            view2.getLayoutParams().height = i + c7664Mo4042.f20814;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f5964 + c7664Mo4042.f20815, this.f5961 + c7664Mo4042.f20814, this.f5960 + c7664Mo4042.f20813, view2.getPaddingBottom());
        return c2225;
    }

    public C2023(View view, int i, int i2, int i3, int i4) {
        this.f5963 = i;
        this.f5962 = view;
        this.f5964 = i2;
        this.f5961 = i3;
        this.f5960 = i4;
    }
}
