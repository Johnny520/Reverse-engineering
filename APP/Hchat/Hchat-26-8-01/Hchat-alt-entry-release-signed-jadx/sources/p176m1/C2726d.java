package p176m1;

import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import tf.C4173t;

/* JADX INFO: renamed from: m1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2726d {

    /* JADX INFO: renamed from: a */
    public final String f8827a;

    /* JADX INFO: renamed from: b */
    public final float f8828b;

    /* JADX INFO: renamed from: c */
    public final float f8829c;

    /* JADX INFO: renamed from: d */
    public final float f8830d;

    /* JADX INFO: renamed from: e */
    public final float f8831e;

    /* JADX INFO: renamed from: f */
    public final float f8832f;

    /* JADX INFO: renamed from: g */
    public final float f8833g;

    /* JADX INFO: renamed from: h */
    public final float f8834h;

    /* JADX INFO: renamed from: i */
    public final List f8835i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f8836j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2726d(String str, float f3, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i9) {
        str = (i9 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        f3 = (i9 & 2) != 0 ? 0.0f : f3;
        f10 = (i9 & 4) != 0 ? 0.0f : f10;
        f11 = (i9 & 8) != 0 ? 0.0f : f11;
        f12 = (i9 & 16) != 0 ? 1.0f : f12;
        f13 = (i9 & 32) != 0 ? 1.0f : f13;
        f14 = (i9 & 64) != 0 ? 0.0f : f14;
        f15 = (i9 & 128) != 0 ? 0.0f : f15;
        if ((i9 & Opcodes.ACC_NATIVE) != 0) {
            int i10 = AbstractC2735h0.f8909a;
            list = C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        this.f8827a = str;
        this.f8828b = f3;
        this.f8829c = f10;
        this.f8830d = f11;
        this.f8831e = f12;
        this.f8832f = f13;
        this.f8833g = f14;
        this.f8834h = f15;
        this.f8835i = list;
        this.f8836j = arrayList;
    }
}
