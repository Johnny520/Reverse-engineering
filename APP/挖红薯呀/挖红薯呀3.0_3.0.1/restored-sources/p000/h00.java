package p000;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h00 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2109d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2110e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f2111f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ h00(int i, Collection collection) {
        this.f2109d = 2;
        this.f2110e = i;
        this.f2111f = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f2109d;
        Object obj2 = this.f2111f;
        int i2 = this.f2110e;
        switch (i) {
            case 0:
                return m00.m2282o3((m00) obj2, i2, ((Boolean) obj).booleanValue());
            case 1:
                return vf0.m4510H1((Context) obj2, i2, (LinearLayout) obj);
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ h00(int i, int i2, Object obj) {
        this.f2109d = i2;
        this.f2111f = obj;
        this.f2110e = i;
    }
}
