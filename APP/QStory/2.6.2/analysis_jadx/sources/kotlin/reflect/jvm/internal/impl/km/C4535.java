package kotlin.reflect.jvm.internal.impl.km;

import androidx.appcompat.widget.C0137;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5111;
import kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4512;
import kotlin.reflect.jvm.internal.impl.km.internal.C4511;
import p070.AbstractC6898;
import p070.C6901;
import p085.C7051;
import p085.C7053;
import p086.C7060;
import p086.InterfaceC7059;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4535 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13208 = {new MutablePropertyReference1Impl(C4535.class, "_hasSetter", "get_hasSetter()Z", 0), new MutablePropertyReference1Impl(C4535.class, "_hasGetter", "get_hasGetter()Z", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C4533 f13209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f13210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4534 f13211;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4534 f13212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f13214;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ArrayList f13215;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ArrayList f13216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ArrayList f13217;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f13218;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f13219;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f13220;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList f13221;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C4525 f13222;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C4533 f13223;

    public C4535(int i, String str, int i2, int i3) {
        str.getClass();
        this.f13214 = i;
        this.f13213 = str;
        C6901 c6901 = AbstractC6898.f18373;
        c6901.getClass();
        C0137 c0137M9132 = AbstractC4512.m9132(new C4511(c6901, 1));
        C6901 c69012 = AbstractC6898.f18374;
        c69012.getClass();
        C0137 c0137M91322 = AbstractC4512.m9132(new C4511(c69012, 1));
        C4534 c4534 = new C4534(i2);
        InterfaceC5087[] interfaceC5087Arr = f13208;
        InterfaceC5087 interfaceC5087 = interfaceC5087Arr[1];
        int i4 = c0137M91322.f596;
        interfaceC5087.getClass();
        InterfaceC5111 interfaceC5111 = (InterfaceC5111) c0137M91322.f595;
        interfaceC5111.set(this, Integer.valueOf(((Number) interfaceC5111.get(this)).intValue() | i4));
        this.f13212 = c4534;
        this.f13211 = c0137M9132.m576(this, interfaceC5087Arr[0]) ? new C4534(i3) : null;
        this.f13210 = new ArrayList(0);
        this.f13219 = new ArrayList(0);
        new ArrayList(0);
        this.f13218 = new ArrayList();
        this.f13220 = new ArrayList(0);
        this.f13221 = new ArrayList(0);
        this.f13216 = new ArrayList(0);
        this.f13215 = new ArrayList(0);
        InterfaceC7059.f18965.getClass();
        List listM12351 = C7060.m12351();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM12351, 10));
        Iterator it = listM12351.iterator();
        while (it.hasNext()) {
            ((C7053) ((InterfaceC7059) it.next())).getClass();
            arrayList.add(new C7051());
        }
        this.f13217 = arrayList;
    }
}
