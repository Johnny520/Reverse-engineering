package androidx.compose.foundation.text.input.internal;

import android.view.autofill.AutofillValue;
import androidx.appcompat.app.C0923;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.C1815;
import androidx.compose.p001ui.autofill.C2239;
import androidx.compose.p001ui.autofill.InterfaceC2246;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2831;
import androidx.compose.p001ui.text.input.C2844;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2861;
import androidx.compose.p001ui.text.input.InterfaceC2839;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.C6008;
import p050.AbstractC7176;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1715 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2810;

    public /* synthetic */ C1715(C1708 c1708, InterfaceC2779 interfaceC2779) {
        this.f2810 = 3;
        this.f2809 = c1708;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2810;
        StringBuilder sb = null;
        boolean z = true;
        Object obj2 = this.f2809;
        switch (i) {
            case 0:
                C1708 c1708 = (C1708) obj2;
                InterfaceC2230 interfaceC2230 = c1708.f2799.f3016;
                Boolean bool = Boolean.TRUE;
                ((AbstractC2182) interfaceC2230).setValue(bool);
                ((AbstractC2182) c1708.f2799.f3017).setValue(bool);
                C1781 c1781 = c1708.f2799;
                AutofillValue autofillValue = ((C2239) ((InterfaceC2246) obj)).f4404;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                C1708.m2255(c1781, (String) textValue, c1708.f2798);
                return bool;
            case 1:
                C1708 c17082 = (C1708) obj2;
                List list = (List) obj;
                if (c17082.f2799.m2425() != null) {
                    C1801 c1801M2425 = c17082.f2799.m2425();
                    c1801M2425.getClass();
                    list.add(c1801M2425.f3090);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                C1708 c17083 = (C1708) obj2;
                C1708.m2255(c17083.f2799, ((C2902) obj).f6474, c17083.f2798);
                return Boolean.TRUE;
            case 3:
                C1708 c17084 = (C1708) obj2;
                C2902 c2902 = (C2902) obj;
                if (c17084.f2798) {
                    C2831 c2831 = c17084.f2799.f3011;
                    if (c2831 != null) {
                        List listM12490 = AbstractC7176.m12490(new C2861(), new C2844(c2902, 1));
                        C1781 c17812 = c17084.f2799;
                        C0923 c0923 = c17812.f3012;
                        C1815 c1815 = c17812.f3021;
                        C2847 c2847M847 = c0923.m847(listM12490);
                        c2831.m4269(null, c2847M847);
                        c1815.invoke(c2847M847);
                    } else {
                        C2847 c2847 = c17084.f2800;
                        String str = c2847.f6292.f6474;
                        long j = c2847.f6291;
                        int i2 = C2869.f6347;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        c2902.getClass();
                        if (i4 >= i3) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i3);
                            sb.append((CharSequence) c2902);
                            sb.append((CharSequence) str, i4, str.length());
                        } else {
                            C5043.m9177("End index (", i4, ") is less than start index (", i3);
                        }
                        String string = sb.toString();
                        int length = c2902.f6474.length() + ((int) (c17084.f2800.f6291 >> 32));
                        c17084.f2799.f3021.invoke(new C2847(4, AbstractC2882.m4330(length, length), string));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((InputConnectionC1688) obj2).m2225((InterfaceC2839) obj);
                return C6008.f15084;
        }
    }

    public /* synthetic */ C1715(Object obj, int i) {
        this.f2810 = i;
        this.f2809 = obj;
    }
}
