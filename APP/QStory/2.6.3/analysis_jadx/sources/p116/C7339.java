package p116;

import androidx.appcompat.widget.C0194;
import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import androidx.collection.C0276;
import androidx.compose.foundation.lazy.C0756;
import androidx.compose.foundation.lazy.layout.C0695;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import java.util.Map;
import kotlin.C5176;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p052.InterfaceC6558;
import p089.C7180;
import p131.AbstractC7504;
import top.suzhelan.qstory.ui.components.C5967;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7339 implements InterfaceC7340 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4871 f19550;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6057 f19551;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0236 f19552;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC7345 f19553;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Map f19554;

    static {
        int i = 13;
        f19550 = new C4871(new C5967((byte) 0, 4), i, new C7180(1));
    }

    public C7339(Map map) {
        this.f19554 = map;
        long[] jArr = AbstractC0290.f1007;
        this.f19552 = new C0236();
        this.f19551 = new C6057(this, 5);
    }

    @Override // p116.InterfaceC7340
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1482(Object obj, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(533563200);
        if ((i & 6) == 0) {
            i2 = (c1324.m2378(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(c1242) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2378(this) ? 256 : 128;
        }
        if (c1324.m2343(i2 & 1, (i2 & 147) != 146)) {
            c1324.m2395(obj);
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (objM2345 == c1353) {
                C6057 c6057 = this.f19551;
                if (!((Boolean) c6057.invoke(obj)).booleanValue()) {
                    C0276.m849(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.f19554.get(obj);
                C1334 c1334 = AbstractC7348.f19574;
                C7349 c7349 = new C7349(new C7344(map, c6057));
                c1324.m2386(c7349);
                objM2345 = c7349;
            }
            C7349 c73492 = (C7349) objM2345;
            int i3 = 8;
            AbstractC1367.m2486(new C0194[]{AbstractC7348.f19574.mo2428(c73492), AbstractC7504.f20369.mo2428(c73492)}, c1242, c1324, (i2 & 112) | 8);
            boolean zM2378 = c1324.m2378(this) | c1324.m2378(obj) | c1324.m2378(c73492);
            Object objM23452 = c1324.m2345();
            if (zM2378 || objM23452 == c1353) {
                objM23452 = new C0756(this, obj, c73492, i3);
                c1324.m2386(objM23452);
            }
            AbstractC1367.m2484(C5176.f14739, (InterfaceC6558) objM23452, c1324);
            if (c1324.f3850 && c1324.f3854.f3562 == c1324.f3849) {
                c1324.f3849 = -1;
                c1324.f3850 = false;
            }
            c1324.m2377(false);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0695(this, obj, c1242, i, 7);
        }
    }
}
