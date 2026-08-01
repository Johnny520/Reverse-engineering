package p059e3;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;
import p104h3.C2858k;
import p215oc.C5729x;
import p250r1.C6461k;
import p265s1.AbstractC7070e3;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7083h1;
import p265s1.C7080g3;
import p265s1.C7100k3;
import p265s1.InterfaceC7088i1;
import p290u1.AbstractC8488g;
import p319w2.C9103n;
import p319w2.C9148w;

/* JADX INFO: renamed from: e3.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2007b {
    /* JADX INFO: renamed from: a */
    public static final void m7253a(C9103n c9103n, InterfaceC7088i1 interfaceC7088i1, AbstractC7078g1 abstractC7078g1, float f10, C7080g3 c7080g3, C2858k c2858k, AbstractC8488g abstractC8488g, int i10) {
        interfaceC7088i1.mo27841n();
        if (c9103n.m35322B().size() <= 1 || (abstractC7078g1 instanceof C7100k3)) {
            m7254b(c9103n, interfaceC7088i1, abstractC7078g1, f10, c7080g3, c2858k, abstractC8488g, i10);
        } else {
            if (!(abstractC7078g1 instanceof AbstractC7070e3)) {
                C5729x.m23182a();
                return;
            }
            List listM35322B = c9103n.m35322B();
            int size = listM35322B.size();
            float fMax = 0.0f;
            float fMo35080a = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                C9148w c9148w = (C9148w) listM35322B.get(i11);
                fMo35080a += c9148w.m35583e().mo35080a();
                fMax = Math.max(fMax, c9148w.m35583e().mo35084e());
            }
            Shader shaderMo27856b = ((AbstractC7070e3) abstractC7078g1).mo27856b(C6461k.m25616d((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMo35080a)) & 4294967295L)));
            Matrix matrix = new Matrix();
            shaderMo27856b.getLocalMatrix(matrix);
            List listM35322B2 = c9103n.m35322B();
            int size2 = listM35322B2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C9148w c9148w2 = (C9148w) listM35322B2.get(i12);
                c9148w2.m35583e().mo35072D(interfaceC7088i1, AbstractC7083h1.m27895a(shaderMo27856b), f10, c7080g3, c2858k, abstractC8488g, i10);
                interfaceC7088i1.mo27832d(0.0f, c9148w2.m35583e().mo35080a());
                matrix.setTranslate(0.0f, -c9148w2.m35583e().mo35080a());
                shaderMo27856b.setLocalMatrix(matrix);
            }
        }
        interfaceC7088i1.mo27847w();
    }

    /* JADX INFO: renamed from: b */
    public static final void m7254b(C9103n c9103n, InterfaceC7088i1 interfaceC7088i1, AbstractC7078g1 abstractC7078g1, float f10, C7080g3 c7080g3, C2858k c2858k, AbstractC8488g abstractC8488g, int i10) {
        List listM35322B = c9103n.m35322B();
        int size = listM35322B.size();
        for (int i11 = 0; i11 < size; i11++) {
            C9148w c9148w = (C9148w) listM35322B.get(i11);
            c9148w.m35583e().mo35072D(interfaceC7088i1, abstractC7078g1, f10, c7080g3, c2858k, abstractC8488g, i10);
            interfaceC7088i1.mo27832d(0.0f, c9148w.m35583e().mo35080a());
        }
    }
}
