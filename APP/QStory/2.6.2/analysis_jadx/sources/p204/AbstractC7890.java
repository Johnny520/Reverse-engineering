package p204;

import androidx.collection.C0282;
import p187.AbstractC7771;
import p205.AbstractC7906;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7890 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object[] f21859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float[] f21861 = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C0282 f21860 = new C0282(0);

    static {
        Object[] objArr = new Object[0];
        f21859 = objArr;
        synchronized (objArr) {
            f21860.m857(115, new C7889(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f21860.m857(130, new C7889(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f21860.m857(150, new C7889(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f21860.m857(180, new C7889(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f21860.m857(200, new C7889(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f21860.f992[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC7906.m13331("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13287(float f, C7889 c7889) {
        synchronized (f21859) {
            C0282 c0282M859 = f21860.clone();
            c0282M859.m857((int) (f * 100.0f), c7889);
            f21860 = c0282M859;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC7891 m13288(float f) {
        float f2;
        InterfaceC7891 c7889;
        float[] fArr = f21861;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        InterfaceC7891 interfaceC7891 = (InterfaceC7891) f21860.m858(i);
        if (interfaceC7891 != null) {
            return interfaceC7891;
        }
        C0282 c0282 = f21860;
        int iM13096 = AbstractC7771.m13096(c0282.f992, c0282.f991, i);
        if (iM13096 >= 0) {
            return (InterfaceC7891) f21860.m856(iM13096);
        }
        int i2 = -(iM13096 + 1);
        int i3 = i2 - 1;
        if (i2 >= f21860.f991) {
            C7889 c78892 = new C7889(new float[]{1.0f}, new float[]{f});
            m13287(f, c78892);
            return c78892;
        }
        if (i3 < 0) {
            c7889 = new C7889(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = f21860.f992[i3] / 100.0f;
            c7889 = (InterfaceC7891) f21860.m856(i3);
        }
        float f3 = f21860.f992[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        InterfaceC7891 interfaceC78912 = (InterfaceC7891) f21860.m856(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fMo13285 = c7889.mo13285(f4);
            fArr2[i4] = ((interfaceC78912.mo13285(f4) - fMo13285) * fMax) + fMo13285;
        }
        C7889 c78893 = new C7889(fArr, fArr2);
        m13287(f, c78893);
        return c78893;
    }
}
