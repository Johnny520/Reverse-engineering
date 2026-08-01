package androidx.compose.p001ui.text.input;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.text.C2902;
import androidx.window.area.AbstractC3400;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2849 implements InterfaceC2839 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2902 f6296;

    public C2849(String str, int i) {
        this.f6296 = new C2902(str);
        this.f6295 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2849)) {
            return false;
        }
        C2849 c2849 = (C2849) obj;
        return AbstractC5227.m9466(this.f6296.f6474, c2849.f6296.f6474) && this.f6295 == c2849.f6295;
    }

    public final int hashCode() {
        return (this.f6296.f6474.hashCode() * 31) + this.f6295;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f6296.f6474);
        sb.append("', newCursorPosition=");
        return AbstractC0900.m716(sb, this.f6295, ')');
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2839
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2252(C2857 c2857) {
        int i = c2857.f6307;
        C2902 c2902 = this.f6296;
        if (i != -1) {
            int i2 = c2857.f6306;
            String str = c2902.f6474;
            String str2 = c2902.f6474;
            c2857.m4289(i, i2, str);
            if (str2.length() > 0) {
                c2857.m4288(i, str2.length() + i);
            }
        } else {
            int i3 = c2857.f6309;
            int i4 = c2857.f6310;
            String str3 = c2902.f6474;
            String str4 = c2902.f6474;
            c2857.m4289(i3, i4, str3);
            if (str4.length() > 0) {
                c2857.m4288(i3, str4.length() + i3);
            }
        }
        int i5 = c2857.f6309;
        int i6 = c2857.f6310;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.f6295;
        int iM5650 = AbstractC3400.m5650(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c2902.f6474.length(), 0, ((C2853) c2857.f6308).m4280());
        c2857.m4287(iM5650, iM5650);
    }
}
