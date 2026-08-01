package p265s1;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p376zd.C9987e;

/* JADX INFO: renamed from: s1.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7152v0 {
    /* JADX INFO: renamed from: a */
    public static final Shader m28231a(long j10, long j11, List list, List list2, int i10) {
        m28236f(list, list2);
        int iM28233c = m28233c(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), m28234d(list, iM28233c), m28235e(list2, list, iM28233c), AbstractC7156w0.m28245a(i10));
    }

    /* JADX INFO: renamed from: b */
    public static final Shader m28232b(long j10, float f10, List list, List list2, int i10) {
        m28236f(list, list2);
        int iM28233c = m28233c(list);
        return new RadialGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10, m28234d(list, iM28233c), m28235e(list2, list, iM28233c), AbstractC7156w0.m28245a(i10));
    }

    /* JADX INFO: renamed from: c */
    public static final int m28233c(List list) {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static final int[] m28234d(List list, int i10) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = AbstractC7138s1.m28205i(((C7128q1) list.get(i11)).m28139y());
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public static final float[] m28235e(List list, List list2, int i10) {
        if (i10 == 0) {
            if (list != null) {
                return AbstractC5081g0.m20549U0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int iM20802q = AbstractC5114x.m20802q(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < iM20802q; i12++) {
            long jM28139y = ((C7128q1) list2.get(i12)).m28139y();
            float fFloatValue = list != null ? ((Number) list.get(i12)).floatValue() : i12 / AbstractC5114x.m20802q(list2);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (C7128q1.m28132r(jM28139y) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? ((Number) list.get(AbstractC5114x.m20802q(list2))).floatValue() : 1.0f;
        return fArr;
    }

    /* JADX INFO: renamed from: f */
    public static final void m28236f(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            C9987e.m38645a("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            C9987e.m38645a("colors and colorStops arguments must have equal length.");
        }
    }
}
