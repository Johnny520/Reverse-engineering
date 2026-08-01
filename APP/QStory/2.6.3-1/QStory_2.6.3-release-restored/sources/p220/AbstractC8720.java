package p220;

import androidx.collection.C1129;
import p203.AbstractC8601;
import p221.AbstractC8736;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8720 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object[] f22201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float[] f22203 = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C1129 f22202 = new C1129(0);

    static {
        Object[] objArr = new Object[0];
        f22201 = objArr;
        synchronized (objArr) {
            f22202.m1418(115, new C8719(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f22202.m1418(130, new C8719(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f22202.m1418(150, new C8719(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f22202.m1418(180, new C8719(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f22202.m1418(200, new C8719(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f22202.f1337[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC8736.m13918("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13874(float f, C8719 c8719) {
        synchronized (f22201) {
            C1129 c1129M1420 = f22202.clone();
            c1129M1420.m1418((int) (f * 100.0f), c8719);
            f22202 = c1129M1420;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC8721 m13875(float f) {
        float f2;
        InterfaceC8721 c8719;
        float[] fArr = f22203;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        InterfaceC8721 interfaceC8721 = (InterfaceC8721) f22202.m1419(i);
        if (interfaceC8721 != null) {
            return interfaceC8721;
        }
        C1129 c1129 = f22202;
        int iM13683 = AbstractC8601.m13683(c1129.f1337, c1129.f1336, i);
        if (iM13683 >= 0) {
            return (InterfaceC8721) f22202.m1417(iM13683);
        }
        int i2 = -(iM13683 + 1);
        int i3 = i2 - 1;
        if (i2 >= f22202.f1336) {
            C8719 c87192 = new C8719(new float[]{1.0f}, new float[]{f});
            m13874(f, c87192);
            return c87192;
        }
        if (i3 < 0) {
            c8719 = new C8719(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = f22202.f1337[i3] / 100.0f;
            c8719 = (InterfaceC8721) f22202.m1417(i3);
        }
        float f3 = f22202.f1337[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        InterfaceC8721 interfaceC87212 = (InterfaceC8721) f22202.m1417(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fMo13872 = c8719.mo13872(f4);
            fArr2[i4] = ((interfaceC87212.mo13872(f4) - fMo13872) * fMax) + fMo13872;
        }
        C8719 c87193 = new C8719(fArr, fArr2);
        m13874(f, c87193);
        return c87193;
    }
}
