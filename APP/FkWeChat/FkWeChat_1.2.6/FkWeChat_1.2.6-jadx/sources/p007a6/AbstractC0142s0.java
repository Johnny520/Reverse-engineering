package p007a6;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p010a9.InterfaceC0188p;
import p038ce.InterfaceC1519a;
import p077f6.InterfaceC2320l;
import p172l8.C4700i0;
import p354y5.AbstractC9599v;

/* JADX INFO: renamed from: a6.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0142s0 {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m347a(String str, InterfaceC1519a interfaceC1519a, String str2, int i10, int i11, InterfaceC0572r interfaceC0572r, int i12) {
        m348b(str, interfaceC1519a, str2, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1), i11);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m348b(final String str, final InterfaceC1519a interfaceC1519a, String str2, InterfaceC0572r interfaceC0572r, final int i10, final int i11) {
        int i12;
        str.getClass();
        interfaceC1519a.getClass();
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-2115533566);
        if ((i10 & 6) == 0) {
            i12 = (interfaceC0572rMo2181q.mo2162U(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2162U(str2) ? 256 : 128;
        }
        if (interfaceC0572rMo2181q.mo2144C((i12 & Opcodes.LXOR) != 130, i12 & 1)) {
            if (i13 != 0) {
                str2 = null;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-2115533566, i12, -1, "com.mikepenz.markdown.compose.elements.MarkdownInlineImage (MarkdownInlineImage.kt:10)");
            }
            ((InterfaceC2320l) interfaceC0572rMo2181q.mo2142A(AbstractC9599v.m37564u())).mo8479a(str, interfaceC0572rMo2181q, i12 & 14);
            interfaceC0572rMo2181q.mo2163V(489809314);
            interfaceC0572rMo2181q.mo2152K();
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        final String str3 = str2;
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: a6.r0
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC0142s0.m347a(str, interfaceC1519a, str3, i10, i11, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
