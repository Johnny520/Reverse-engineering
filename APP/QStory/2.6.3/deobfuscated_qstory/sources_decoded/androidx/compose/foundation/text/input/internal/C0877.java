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
import io.ktor.util.C4211;
import java.util.List;
import kotlin.C5176;
import p034.AbstractC6347;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0877 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2465;

    public /* synthetic */ C0877(C0870 c0870, InterfaceC1944 interfaceC1944) {
        this.f2465 = 3;
        this.f2464 = c0870;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2465;
        StringBuilder sb = null;
        boolean z = true;
        Object obj2 = this.f2464;
        switch (i) {
            case 0:
                C0870 c0870 = (C0870) obj2;
                InterfaceC1395 interfaceC1395 = c0870.f2454.f2671;
                Boolean bool = Boolean.TRUE;
                ((AbstractC1347) interfaceC1395).setValue(bool);
                ((AbstractC1347) c0870.f2454.f2672).setValue(bool);
                C0943 c0943 = c0870.f2454;
                AutofillValue autofillValue = ((C1404) ((InterfaceC1411) obj)).f4059;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                C0870.m1695(c0943, (String) textValue, c0870.f2453);
                return bool;
            case 1:
                C0870 c08702 = (C0870) obj2;
                List list = (List) obj;
                if (c08702.f2454.m1865() != null) {
                    C0963 c0963M1865 = c08702.f2454.m1865();
                    c0963M1865.getClass();
                    list.add(c0963M1865.f2745);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                C0870 c08703 = (C0870) obj2;
                C0870.m1695(c08703.f2454, ((C2068) obj).f6129, c08703.f2453);
                return Boolean.TRUE;
            case 3:
                C0870 c08704 = (C0870) obj2;
                C2068 c2068 = (C2068) obj;
                if (c08704.f2453) {
                    C1997 c1997 = c08704.f2454.f2666;
                    if (c1997 != null) {
                        List listM11931 = AbstractC6347.m11931(new C2027(), new C2010(c2068, 1));
                        C0943 c09432 = c08704.f2454;
                        C0076 c0076 = c09432.f2667;
                        C0977 c0977 = c09432.f2676;
                        C2013 c2013M287 = c0076.m287(listM11931);
                        c1997.m3709(null, c2013M287);
                        c0977.invoke(c2013M287);
                    } else {
                        C2013 c2013 = c08704.f2455;
                        String str = c2013.f5947.f6129;
                        long j = c2013.f5946;
                        int i2 = C2035.f6002;
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
                            C4211.m8618("End index (", i4, ") is less than start index (", i3);
                        }
                        String string = sb.toString();
                        int length = c2068.f6129.length() + ((int) (c08704.f2455.f5946 >> 32));
                        c08704.f2454.f2676.invoke(new C2013(4, AbstractC2048.m3770(length, length), string));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((InputConnectionC0850) obj2).m1665((InterfaceC2005) obj);
                return C5176.f14739;
        }
    }

    public /* synthetic */ C0877(Object obj, int i) {
        this.f2465 = i;
        this.f2464 = obj;
    }
}
