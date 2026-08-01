package androidx.compose.runtime.snapshots;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import io.ktor.http.cio.C3973;
import java.util.Collection;
import java.util.List;
import kotlin.C5175;
import p052.InterfaceC6557;
import p325.C8758;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1281 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f3752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3753;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3754;

    public /* synthetic */ C1281(C3973 c3973, int i) {
        this.f3754 = 1;
        this.f3753 = c3973;
        this.f3752 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f3754;
        Object obj2 = this.f3753;
        int i2 = this.f3752;
        switch (i) {
            case 0:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
            case 1:
                return Boolean.valueOf(((C3973) obj2).f12216[((Integer) obj).intValue()] == i2);
            default:
                C8758 c8758 = (C8758) obj;
                c8758.m14434(Integer.valueOf(i2), AbstractC2442.m4573(-3937791360413992359L, c8758, -3937627185289102759L));
                c8758.m14434((String) obj2, AbstractC3056.m6668(-3937627103684724135L));
                return C5175.f14739;
        }
    }

    public /* synthetic */ C1281(Object obj, int i, int i2) {
        this.f3754 = i2;
        this.f3752 = i;
        this.f3753 = obj;
    }
}
