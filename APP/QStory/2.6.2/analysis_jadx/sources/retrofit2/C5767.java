package retrofit2;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.vector.C1562;
import com.bumptech.glide.AbstractC3055;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import lin.xposed.hook.javaplugin.C5553;
import okio.ByteString;
import p005.C6101;
import p013.C6177;
import p015.AbstractC6201;
import p015.AbstractC6206;
import p015.C6195;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.C6205;
import p015.C6215;
import p015.C6217;
import p015.C6220;
import p015.C6221;
import p015.C6222;
import p017.AbstractC6233;
import p017.AbstractC6238;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5767 implements InterfaceC5777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5788 f15828;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6200 f15829;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Throwable f15830;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f15831;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public volatile boolean f15832;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C6177 f15833;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f15834;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object[] f15835;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5755 f15836;

    public C5767(C5755 c5755, Object obj, Object[] objArr, C6200 c6200, InterfaceC5788 interfaceC5788) {
        this.f15836 = c5755;
        this.f15834 = obj;
        this.f15835 = objArr;
        this.f15829 = c6200;
        this.f15828 = interfaceC5788;
    }

    @Override // retrofit2.InterfaceC5777
    public final void cancel() {
        C6177 c6177;
        this.f15832 = true;
        synchronized (this) {
            c6177 = this.f15833;
        }
        if (c6177 != null) {
            c6177.cancel();
        }
    }

    public final Object clone() {
        return new C5767(this.f15836, this.f15834, this.f15835, this.f15829, this.f15828);
    }

    @Override // retrofit2.InterfaceC5777
    public final C5754 execute() {
        C6177 c6177M11102;
        synchronized (this) {
            if (this.f15831) {
                throw new IllegalStateException("Already executed.");
            }
            this.f15831 = true;
            c6177M11102 = m11102();
        }
        if (this.f15832) {
            c6177M11102.cancel();
        }
        return m11101(c6177M11102.m11615());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5754 m11101(C6204 c6204) throws IOException {
        AbstractC6201 abstractC6201 = c6204.f17009;
        C6205 c6205M11649 = c6204.m11649();
        c6205M11649.f17023 = new C5768(abstractC6201.mo11108(), abstractC6201.mo11109());
        C6204 c6204M11651 = c6205M11649.m11651();
        boolean z = c6204M11651.f17003;
        int i = c6204M11651.f17005;
        if (i < 200 || i >= 300) {
            try {
                abstractC6201.mo11110().mo11475(new C6101());
                abstractC6201.mo11108();
                abstractC6201.mo11109();
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new C5754(c6204M11651, null);
            } finally {
                abstractC6201.close();
            }
        }
        if (i == 204 || i == 205) {
            if (z) {
                return new C5754(c6204M11651, null);
            }
            C5919.m11249("rawResponse must be successful response");
            return null;
        }
        C5769 c5769 = new C5769(abstractC6201);
        try {
            Object objMo4149 = this.f15828.mo4149(c5769);
            if (z) {
                return new C5754(c6204M11651, objMo4149);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = c5769.f15839;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6177 m11102() throws IOException {
        C6177 c6177 = this.f15833;
        if (c6177 != null) {
            return c6177;
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
            C6177 c6177M11103 = m11103();
            this.f15833 = c6177M11103;
            return c6177M11103;
        } catch (IOException | Error | RuntimeException e) {
            AbstractC5784.m11127(e);
            this.f15830 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6177 m11103() {
        C6221 c6221;
        C6222 c6222M11664;
        C5755 c5755 = this.f15836;
        AbstractC5784[] abstractC5784Arr = c5755.f15766;
        Object[] objArr = this.f15835;
        int length = objArr.length;
        if (length != abstractC5784Arr.length) {
            C5919.m11249(AbstractC0053.m147(AbstractC0053.m148(length, "Argument count (", ") doesn't match expected count ("), ")", abstractC5784Arr.length));
            return null;
        }
        C5758 c5758 = new C5758(c5755.f15760, c5755.f15761, c5755.f15759, c5755.f15758, c5755.f15765, c5755.f15764, c5755.f15768, c5755.f15769);
        if (c5755.f15767) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC5784Arr[i].mo11094(c5758, objArr[i]);
        }
        C6221 c62212 = c5758.f15777;
        if (c62212 != null) {
            c6222M11664 = c62212.m11664();
        } else {
            String str = c5758.f15778;
            C6222 c6222 = c5758.f15779;
            c6222.getClass();
            str.getClass();
            try {
                c6221 = new C6221(0);
                c6221.m11667(c6222, str);
            } catch (IllegalArgumentException unused) {
                c6221 = null;
            }
            c6222M11664 = c6221 != null ? c6221.m11664() : null;
            if (c6222M11664 == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(c6222);
                C5553.m10819(sb, ", Relative: ", c5758.f15778);
                return null;
            }
        }
        AbstractC6206 c5762 = c5758.f15783;
        if (c5762 == null) {
            C4870 c4870 = c5758.f15785;
            if (c4870 != null) {
                c5762 = new C6220((ArrayList) c4870.f14160, (ArrayList) c4870.f14161);
            } else {
                C0108 c0108 = c5758.f15784;
                if (c0108 != null) {
                    ArrayList arrayList2 = (ArrayList) c0108.f318;
                    if (arrayList2.isEmpty()) {
                        C5919.m11250("Multipart body must have at least one part.");
                        return null;
                    }
                    c5762 = new C6215((ByteString) c0108.f319, (C6217) c0108.f320, AbstractC6238.m11711(arrayList2));
                } else if (c5758.f15781) {
                    int i2 = AbstractC6206.f17028;
                    AbstractC6233.m11691(0L, 0L, 0L);
                    c5762 = new C6195(null, 0, new byte[0]);
                }
            }
        }
        C6217 c6217 = c5758.f15782;
        C1562 c1562 = c5758.f15775;
        if (c6217 != null) {
            if (c5762 != null) {
                c5762 = new C5762(c5762, c6217);
            } else {
                c1562.m2830("Content-Type", c6217.f17101);
            }
        }
        C1245 c1245 = c5758.f15776;
        c1245.getClass();
        c1245.f3619 = c6222M11664;
        c1245.f3617 = c1562.m2828().m11678();
        c1245.m2148(c5758.f15780, c5762);
        c1245.f3618 = ((AbstractC3055) c1245.f3618).mo6649(AbstractC4395.f12971.mo8927(C5782.class), new C5782(c5755.f15763, this.f15834, c5755.f15762, arrayList));
        C6198 c6198 = new C6198(c1245);
        C6200 c6200 = this.f15829;
        c6200.getClass();
        return new C6177(c6200, c6198);
    }

    @Override // retrofit2.InterfaceC5777
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final synchronized C6198 mo11104() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m11102().f16880;
    }

    @Override // retrofit2.InterfaceC5777
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo11105() {
        boolean z = true;
        if (this.f15832) {
            return true;
        }
        synchronized (this) {
            try {
                C6177 c6177 = this.f15833;
                if (c6177 == null || !c6177.f16873) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // retrofit2.InterfaceC5777
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo11106(InterfaceC5794 interfaceC5794) {
        C6177 c6177;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f15831) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f15831 = true;
                c6177 = this.f15833;
                th = this.f15830;
                if (c6177 == null && th == null) {
                    try {
                        C6177 c6177M11103 = m11103();
                        this.f15833 = c6177M11103;
                        c6177 = c6177M11103;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC5784.m11127(th);
                        this.f15830 = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC5794.onFailure(this, th);
            return;
        }
        if (this.f15832) {
            c6177.cancel();
        }
        c6177.m11616(new C4870(3, this, interfaceC5794, false));
    }

    @Override // retrofit2.InterfaceC5777
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final InterfaceC5777 mo11107clone() {
        return new C5767(this.f15836, this.f15834, this.f15835, this.f15829, this.f15828);
    }
}
