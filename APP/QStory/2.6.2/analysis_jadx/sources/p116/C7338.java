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
import kotlin.C5175;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p052.InterfaceC6557;
import p089.C7179;
import p131.AbstractC7503;
import top.suzhelan.qstory.ui.components.C5961;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7338 implements InterfaceC7339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4870 f19555;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6051 f19556;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0236 f19557;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC7344 f19558;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Map f19559;

    static {
        int i = 13;
        f19555 = new C4870(new C5961((byte) 0, 4), i, new C7179(1));
    }

    public C7338(Map map) {
        this.f19559 = map;
        long[] jArr = AbstractC0290.f1007;
        this.f19557 = new C0236();
        this.f19556 = new C6051(this, 5);
    }

    @Override // p116.InterfaceC7339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1472(Object obj, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(533563200);
        if ((i & 6) == 0) {
            i2 = (c1324.m2368(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2368(c1242) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2368(this) ? 256 : 128;
        }
        if (c1324.m2333(i2 & 1, (i2 & 147) != 146)) {
            c1324.m2385(obj);
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (objM2335 == c1353) {
                C6051 c6051 = this.f19556;
                if (!((Boolean) c6051.invoke(obj)).booleanValue()) {
                    C0276.m848(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.f19559.get(obj);
                C1334 c1334 = AbstractC7347.f19579;
                C7348 c7348 = new C7348(new C7343(map, c6051));
                c1324.m2376(c7348);
                objM2335 = c7348;
            }
            C7348 c73482 = (C7348) objM2335;
            int i3 = 8;
            AbstractC1367.m2477(new C0194[]{AbstractC7347.f19579.mo2418(c73482), AbstractC7503.f20374.mo2418(c73482)}, c1242, c1324, (i2 & 112) | 8);
            boolean zM2368 = c1324.m2368(this) | c1324.m2368(obj) | c1324.m2368(c73482);
            Object objM23352 = c1324.m2335();
            if (zM2368 || objM23352 == c1353) {
                objM23352 = new C0756(this, obj, c73482, i3);
                c1324.m2376(objM23352);
            }
            AbstractC1367.m2475(C5175.f14739, (InterfaceC6557) objM23352, c1324);
            if (c1324.f3849 && c1324.f3853.f3561 == c1324.f3848) {
                c1324.f3848 = -1;
                c1324.f3849 = false;
            }
            c1324.m2367(false);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0695(this, obj, c1242, i, 7);
        }
    }
}
