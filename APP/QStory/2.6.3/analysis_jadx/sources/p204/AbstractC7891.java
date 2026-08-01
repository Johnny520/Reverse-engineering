package p204;

import androidx.collection.C0282;
import p187.AbstractC7772;
import p205.AbstractC7907;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7891 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object[] f21856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float[] f21858 = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C0282 f21857 = new C0282(0);

    static {
        Object[] objArr = new Object[0];
        f21856 = objArr;
        synchronized (objArr) {
            f21857.m858(115, new C7890(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f21857.m858(130, new C7890(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f21857.m858(150, new C7890(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f21857.m858(180, new C7890(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f21857.m858(200, new C7890(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f21857.f992[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC7907.m13359("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13315(float f, C7890 c7890) {
        synchronized (f21856) {
            C0282 c0282M860 = f21857.clone();
            c0282M860.m858((int) (f * 100.0f), c7890);
            f21857 = c0282M860;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC7892 m13316(float f) {
        float f2;
        InterfaceC7892 c7890;
        float[] fArr = f21858;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        InterfaceC7892 interfaceC7892 = (InterfaceC7892) f21857.m859(i);
        if (interfaceC7892 != null) {
            return interfaceC7892;
        }
        C0282 c0282 = f21857;
        int iM13124 = AbstractC7772.m13124(c0282.f992, c0282.f991, i);
        if (iM13124 >= 0) {
            return (InterfaceC7892) f21857.m857(iM13124);
        }
        int i2 = -(iM13124 + 1);
        int i3 = i2 - 1;
        if (i2 >= f21857.f991) {
            C7890 c78902 = new C7890(new float[]{1.0f}, new float[]{f});
            m13315(f, c78902);
            return c78902;
        }
        if (i3 < 0) {
            c7890 = new C7890(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = f21857.f992[i3] / 100.0f;
            c7890 = (InterfaceC7892) f21857.m857(i3);
        }
        float f3 = f21857.f992[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        InterfaceC7892 interfaceC78922 = (InterfaceC7892) f21857.m857(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fMo13313 = c7890.mo13313(f4);
            fArr2[i4] = ((interfaceC78922.mo13313(f4) - fMo13313) * fMax) + fMo13313;
        }
        C7890 c78903 = new C7890(fArr, fArr2);
        m13315(f, c78903);
        return c78903;
    }
}
