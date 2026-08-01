package androidx.compose.runtime.snapshots;

import androidx.profileinstaller.AbstractC3275;
import io.ktor.http.cio.C4806;
import java.util.Collection;
import java.util.List;
import kotlin.C6008;
import p068.InterfaceC7387;
import p303.AbstractC9234;
import p345.C9595;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2116 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f4098;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f4099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4100;

    public /* synthetic */ C2116(C4806 c4806, int i) {
        this.f4100 = 1;
        this.f4099 = c4806;
        this.f4098 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f4100;
        Object obj2 = this.f4099;
        int i2 = this.f4098;
        switch (i) {
            case 0:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
            case 1:
                return Boolean.valueOf(((C4806) obj2).f12565[((Integer) obj).intValue()] == i2);
            default:
                C9595 c9595 = (C9595) obj;
                c9595.m15027(Integer.valueOf(i2), AbstractC3275.m5142(2295, c9595, "喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"));
                c9595.m15027((String) obj2, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
                return C6008.f15084;
        }
    }

    public /* synthetic */ C2116(Object obj, int i, int i2) {
        this.f4100 = i2;
        this.f4098 = i;
        this.f4099 = obj;
    }
}
