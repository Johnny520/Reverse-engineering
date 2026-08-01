package retrofit2;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.vector.C1562;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import lin.xposed.hook.javaplugin.C5554;
import okio.ByteString;
import p004.C6092;
import p007.AbstractC6128;
import p007.AbstractC6133;
import p007.C6122;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p007.C6132;
import p007.C6142;
import p007.C6144;
import p007.C6147;
import p007.C6148;
import p007.C6149;
import p011.C6203;
import p013.AbstractC6225;
import p013.AbstractC6230;
import p034.AbstractC6347;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5768 implements InterfaceC5778 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5789 f15828;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6127 f15829;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Throwable f15830;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f15831;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public volatile boolean f15832;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C6203 f15833;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f15834;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object[] f15835;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5756 f15836;

    public C5768(C5756 c5756, Object obj, Object[] objArr, C6127 c6127, InterfaceC5789 interfaceC5789) {
        this.f15836 = c5756;
        this.f15834 = obj;
        this.f15835 = objArr;
        this.f15829 = c6127;
        this.f15828 = interfaceC5789;
    }

    @Override // retrofit2.InterfaceC5778
    public final void cancel() {
        C6203 c6203;
        this.f15832 = true;
        synchronized (this) {
            c6203 = this.f15833;
        }
        if (c6203 != null) {
            c6203.cancel();
        }
    }

    public final Object clone() {
        return new C5768(this.f15836, this.f15834, this.f15835, this.f15829, this.f15828);
    }

    @Override // retrofit2.InterfaceC5778
    public final C5755 execute() {
        C6203 c6203M11159;
        synchronized (this) {
            if (this.f15831) {
                throw new IllegalStateException("Already executed.");
            }
            this.f15831 = true;
            c6203M11159 = m11159();
        }
        if (this.f15832) {
            c6203M11159.cancel();
        }
        return m11158(c6203M11159.m11634());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5755 m11158(C6131 c6131) throws IOException {
        AbstractC6128 abstractC6128 = c6131.f16770;
        C6132 c6132M11520 = c6131.m11520();
        c6132M11520.f16784 = new C5769(abstractC6128.mo11165(), abstractC6128.mo11166());
        C6131 c6131M11522 = c6132M11520.m11522();
        boolean z = c6131M11522.f16764;
        int i = c6131M11522.f16766;
        if (i < 200 || i >= 300) {
            try {
                abstractC6128.mo11167().mo11489(new C6092());
                abstractC6128.mo11165();
                abstractC6128.mo11166();
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new C5755(c6131M11522, null);
            } finally {
                abstractC6128.close();
            }
        }
        if (i == 204 || i == 205) {
            if (z) {
                return new C5755(c6131M11522, null);
            }
            C5925.m11310("rawResponse must be successful response");
            return null;
        }
        C5770 c5770 = new C5770(abstractC6128);
        try {
            Object objMo4159 = this.f15828.mo4159(c5770);
            if (z) {
                return new C5755(c6131M11522, objMo4159);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = c5770.f15839;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6203 m11159() throws IOException {
        C6203 c6203 = this.f15833;
        if (c6203 != null) {
            return c6203;
        }
        Throwable th = this.f15830;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            C6203 c6203M11160 = m11160();
            this.f15833 = c6203M11160;
            return c6203M11160;
        } catch (IOException | Error | RuntimeException e) {
            AbstractC5785.m11184(e);
            this.f15830 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6203 m11160() {
        C6148 c6148;
        C6149 c6149M11535;
        C5756 c5756 = this.f15836;
        AbstractC5785[] abstractC5785Arr = c5756.f15766;
        Object[] objArr = this.f15835;
        int length = objArr.length;
        if (length != abstractC5785Arr.length) {
            C5925.m11310(AbstractC0053.m147(AbstractC0053.m150(length, "Argument count (", ") doesn't match expected count ("), ")", abstractC5785Arr.length));
            return null;
        }
        C5759 c5759 = new C5759(c5756.f15760, c5756.f15761, c5756.f15759, c5756.f15758, c5756.f15765, c5756.f15764, c5756.f15768, c5756.f15769);
        if (c5756.f15767) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC5785Arr[i].mo11151(c5759, objArr[i]);
        }
        C6148 c61482 = c5759.f15777;
        if (c61482 != null) {
            c6149M11535 = c61482.m11535();
        } else {
            String str = c5759.f15778;
            C6149 c6149 = c5759.f15779;
            c6149.getClass();
            str.getClass();
            try {
                c6148 = new C6148(0);
                c6148.m11538(c6149, str);
            } catch (IllegalArgumentException unused) {
                c6148 = null;
            }
            c6149M11535 = c6148 != null ? c6148.m11535() : null;
            if (c6149M11535 == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(c6149);
                C5554.m10876(sb, ", Relative: ", c5759.f15778);
                return null;
            }
        }
        AbstractC6133 c5763 = c5759.f15783;
        if (c5763 == null) {
            C4871 c4871 = c5759.f15785;
            if (c4871 != null) {
                c5763 = new C6147((ArrayList) c4871.f14164, (ArrayList) c4871.f14165);
            } else {
                C0108 c0108 = c5759.f15784;
                if (c0108 != null) {
                    ArrayList arrayList2 = (ArrayList) c0108.f318;
                    if (arrayList2.isEmpty()) {
                        C5925.m11311("Multipart body must have at least one part.");
                        return null;
                    }
                    c5763 = new C6142((ByteString) c0108.f319, (C6144) c0108.f320, AbstractC6230.m11703(arrayList2));
                } else if (c5759.f15781) {
                    int i2 = AbstractC6133.f16789;
                    AbstractC6225.m11681(0L, 0L, 0L);
                    c5763 = new C6122(null, 0, new byte[0]);
                }
            }
        }
        C6144 c6144 = c5759.f15782;
        C1562 c1562 = c5759.f15775;
        if (c6144 != null) {
            if (c5763 != null) {
                c5763 = new C5763(c5763, c6144);
            } else {
                c1562.m2840("Content-Type", c6144.f16862);
            }
        }
        C1245 c1245 = c5759.f15776;
        c1245.getClass();
        c1245.f3620 = c6149M11535;
        c1245.f3618 = c1562.m2838().m11549();
        c1245.m2158(c5759.f15780, c5763);
        c1245.f3619 = ((AbstractC6347) c1245.f3619).mo11692(AbstractC4396.f12975.mo8917(C5783.class), new C5783(c5756.f15763, this.f15834, c5756.f15762, arrayList));
        C6125 c6125 = new C6125(c1245);
        C6127 c6127 = this.f15829;
        c6127.getClass();
        return new C6203(c6127, c6125);
    }

    @Override // retrofit2.InterfaceC5778
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final synchronized C6125 mo11161() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m11159().f17085;
    }

    @Override // retrofit2.InterfaceC5778
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo11162() {
        boolean z = true;
        if (this.f15832) {
            return true;
        }
        synchronized (this) {
            try {
                C6203 c6203 = this.f15833;
                if (c6203 == null || !c6203.f17078) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // retrofit2.InterfaceC5778
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo11163(InterfaceC5795 interfaceC5795) {
        C6203 c6203;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f15831) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f15831 = true;
                c6203 = this.f15833;
                th = this.f15830;
                if (c6203 == null && th == null) {
                    try {
                        C6203 c6203M11160 = m11160();
                        this.f15833 = c6203M11160;
                        c6203 = c6203M11160;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC5785.m11184(th);
                        this.f15830 = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC5795.onFailure(this, th);
            return;
        }
        if (this.f15832) {
            c6203.cancel();
        }
        c6203.m11635(new C4871(3, this, interfaceC5795, false));
    }

    @Override // retrofit2.InterfaceC5778
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final InterfaceC5778 mo11164clone() {
        return new C5768(this.f15836, this.f15834, this.f15835, this.f15829, this.f15828);
    }
}
