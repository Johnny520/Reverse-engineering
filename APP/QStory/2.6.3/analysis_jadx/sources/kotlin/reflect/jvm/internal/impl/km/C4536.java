package kotlin.reflect.jvm.internal.impl.km;

import androidx.appcompat.widget.C0137;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5112;
import kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4513;
import kotlin.reflect.jvm.internal.impl.km.internal.C4512;
import p070.AbstractC6899;
import p070.C6902;
import p085.C7052;
import p085.C7054;
import p086.C7061;
import p086.InterfaceC7060;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4536 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13212 = {new MutablePropertyReference1Impl(C4536.class, "_hasSetter", "get_hasSetter()Z", 0), new MutablePropertyReference1Impl(C4536.class, "_hasGetter", "get_hasGetter()Z", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C4534 f13213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f13214;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4535 f13215;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4535 f13216;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f13218;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ArrayList f13219;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ArrayList f13220;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ArrayList f13221;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f13222;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f13223;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f13224;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList f13225;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C4526 f13226;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C4534 f13227;

    public C4536(int i, String str, int i2, int i3) {
        str.getClass();
        this.f13218 = i;
        this.f13217 = str;
        C6902 c6902 = AbstractC6899.f18368;
        c6902.getClass();
        C0137 c0137M9122 = AbstractC4513.m9122(new C4512(c6902, 1));
        C6902 c69022 = AbstractC6899.f18369;
        c69022.getClass();
        C0137 c0137M91222 = AbstractC4513.m9122(new C4512(c69022, 1));
        C4535 c4535 = new C4535(i2);
        InterfaceC5088[] interfaceC5088Arr = f13212;
        InterfaceC5088 interfaceC5088 = interfaceC5088Arr[1];
        int i4 = c0137M91222.f596;
        interfaceC5088.getClass();
        InterfaceC5112 interfaceC5112 = (InterfaceC5112) c0137M91222.f595;
        interfaceC5112.set(this, Integer.valueOf(((Number) interfaceC5112.get(this)).intValue() | i4));
        this.f13216 = c4535;
        this.f13215 = c0137M9122.m577(this, interfaceC5088Arr[0]) ? new C4535(i3) : null;
        this.f13214 = new ArrayList(0);
        this.f13223 = new ArrayList(0);
        new ArrayList(0);
        this.f13222 = new ArrayList();
        this.f13224 = new ArrayList(0);
        this.f13225 = new ArrayList(0);
        this.f13220 = new ArrayList(0);
        this.f13219 = new ArrayList(0);
        InterfaceC7060.f18960.getClass();
        List listM12378 = C7061.m12378();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM12378, 10));
        Iterator it = listM12378.iterator();
        while (it.hasNext()) {
            ((C7054) ((InterfaceC7060) it.next())).getClass();
            arrayList.add(new C7052());
        }
        this.f13221 = arrayList;
    }
}
