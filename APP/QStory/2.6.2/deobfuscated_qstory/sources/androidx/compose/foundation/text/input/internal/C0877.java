package androidx.compose.foundation.text.input.internal;

import android.view.autofill.AutofillValue;
import androidx.appcompat.app.C0076;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.C0977;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.autofill.C1404;
import androidx.compose.ui.autofill.InterfaceC1411;
import androidx.compose.ui.semantics.InterfaceC1944;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C1997;
import androidx.compose.ui.text.input.C2010;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2027;
import androidx.compose.ui.text.input.InterfaceC2005;
import io.ktor.util.C4210;
import java.util.List;
import kotlin.C5175;
import p052.InterfaceC6557;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0877 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2463;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2464;

    public /* synthetic */ C0877(C0870 c0870, InterfaceC1944 interfaceC1944) {
        this.f2464 = 3;
        this.f2463 = c0870;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2464;
        StringBuilder sb = null;
        boolean z = true;
        Object obj2 = this.f2463;
        switch (i) {
            case 0:
                C0870 c0870 = (C0870) obj2;
                InterfaceC1395 interfaceC1395 = c0870.f2453.f2670;
                Boolean bool = Boolean.TRUE;
                ((AbstractC1347) interfaceC1395).setValue(bool);
                ((AbstractC1347) c0870.f2453.f2671).setValue(bool);
                C0943 c0943 = c0870.f2453;
                AutofillValue autofillValue = ((C1404) ((InterfaceC1411) obj)).f4058;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                C0870.m1685(c0943, (String) textValue, c0870.f2452);
                return bool;
            case 1:
                C0870 c08702 = (C0870) obj2;
                List list = (List) obj;
                if (c08702.f2453.m1855() != null) {
                    C0963 c0963M1855 = c08702.f2453.m1855();
                    c0963M1855.getClass();
                    list.add(c0963M1855.f2744);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                C0870 c08703 = (C0870) obj2;
                C0870.m1685(c08703.f2453, ((C2068) obj).f6128, c08703.f2452);
                return Boolean.TRUE;
            case 3:
                C0870 c08704 = (C0870) obj2;
                C2068 c2068 = (C2068) obj;
                if (c08704.f2452) {
                    C1997 c1997 = c08704.f2453.f2665;
                    if (c1997 != null) {
                        List listM13659 = AbstractC8189.m13659(new C2027(), new C2010(c2068, 1));
                        C0943 c09432 = c08704.f2453;
                        C0076 c0076 = c09432.f2666;
                        C0977 c0977 = c09432.f2675;
                        C2013 c2013M286 = c0076.m286(listM13659);
                        c1997.m3699(null, c2013M286);
                        c0977.invoke(c2013M286);
                    } else {
                        C2013 c2013 = c08704.f2454;
                        String str = c2013.f5946.f6128;
                        long j = c2013.f5945;
                        int i2 = C2035.f6001;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        c2068.getClass();
                        if (i4 >= i3) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i3);
                            sb.append((CharSequence) c2068);
                            sb.append((CharSequence) str, i4, str.length());
                        } else {
                            C4210.m8628("End index (", i4, ") is less than start index (", i3);
                        }
                        String string = sb.toString();
                        int length = c2068.f6128.length() + ((int) (c08704.f2454.f5945 >> 32));
                        c08704.f2453.f2675.invoke(new C2013(4, AbstractC2048.m3760(length, length), string));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((InputConnectionC0850) obj2).m1655((InterfaceC2005) obj);
                return C5175.f14739;
        }
    }

    public /* synthetic */ C0877(Object obj, int i) {
        this.f2464 = i;
        this.f2463 = obj;
    }
}
