package retrofit2;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.compose.runtime.internal.C2080;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import lin.xposed.hook.javaplugin.C6385;
import okio.ByteString;
import p020.C6921;
import p023.AbstractC6957;
import p023.AbstractC6962;
import p023.C6951;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.C6961;
import p023.C6971;
import p023.C6973;
import p023.C6976;
import p023.C6977;
import p023.C6978;
import p027.C7032;
import p029.AbstractC7054;
import p029.AbstractC7059;
import p050.AbstractC7176;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6598 implements InterfaceC6608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6619 f16173;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6956 f16174;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Throwable f16175;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f16176;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public volatile boolean f16177;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C7032 f16178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f16179;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object[] f16180;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6586 f16181;

    public C6598(C6586 c6586, Object obj, Object[] objArr, C6956 c6956, InterfaceC6619 interfaceC6619) {
        this.f16181 = c6586;
        this.f16179 = obj;
        this.f16180 = objArr;
        this.f16174 = c6956;
        this.f16173 = interfaceC6619;
    }

    @Override // retrofit2.InterfaceC6608
    public final void cancel() {
        C7032 c7032;
        this.f16177 = true;
        synchronized (this) {
            c7032 = this.f16178;
        }
        if (c7032 != null) {
            c7032.cancel();
        }
    }

    public final Object clone() {
        return new C6598(this.f16181, this.f16179, this.f16180, this.f16174, this.f16173);
    }

    @Override // retrofit2.InterfaceC6608
    public final C6585 execute() {
        C7032 c7032M11718;
        synchronized (this) {
            if (this.f16176) {
                throw new IllegalStateException("Already executed.");
            }
            this.f16176 = true;
            c7032M11718 = m11718();
        }
        if (this.f16177) {
            c7032M11718.cancel();
        }
        return m11717(c7032M11718.m12193());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6585 m11717(C6960 c6960) throws IOException {
        AbstractC6957 abstractC6957 = c6960.f17115;
        C6961 c6961M12079 = c6960.m12079();
        c6961M12079.f17129 = new C6599(abstractC6957.mo11724(), abstractC6957.mo11725());
        C6960 c6960M12081 = c6961M12079.m12081();
        boolean z = c6960M12081.f17109;
        int i = c6960M12081.f17111;
        if (i < 200 || i >= 300) {
            try {
                abstractC6957.mo11726().mo12048(new C6921());
                abstractC6957.mo11724();
                abstractC6957.mo11725();
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new C6585(c6960M12081, null);
            } finally {
                abstractC6957.close();
            }
        }
        if (i == 204 || i == 205) {
            if (z) {
                return new C6585(c6960M12081, null);
            }
            C6755.m11869("rawResponse must be successful response");
            return null;
        }
        C6600 c6600 = new C6600(abstractC6957);
        try {
            Object objMo4719 = this.f16173.mo4719(c6600);
            if (z) {
                return new C6585(c6960M12081, objMo4719);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = c6600.f16184;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7032 m11718() throws IOException {
        C7032 c7032 = this.f16178;
        if (c7032 != null) {
            return c7032;
        }
        Throwable th = this.f16175;
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
            C7032 c7032M11719 = m11719();
            this.f16178 = c7032M11719;
            return c7032M11719;
        } catch (IOException | Error | RuntimeException e) {
            AbstractC6615.m11743(e);
            this.f16175 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7032 m11719() {
        C6977 c6977;
        C6978 c6978M12094;
        C6586 c6586 = this.f16181;
        AbstractC6615[] abstractC6615Arr = c6586.f16111;
        Object[] objArr = this.f16180;
        int length = objArr.length;
        if (length != abstractC6615Arr.length) {
            C6755.m11869(AbstractC0900.m707(AbstractC0900.m710(length, "Argument count (", ") doesn't match expected count ("), ")", abstractC6615Arr.length));
            return null;
        }
        C6589 c6589 = new C6589(c6586.f16105, c6586.f16106, c6586.f16104, c6586.f16103, c6586.f16110, c6586.f16109, c6586.f16113, c6586.f16114);
        if (c6586.f16112) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC6615Arr[i].mo11710(c6589, objArr[i]);
        }
        C6977 c69772 = c6589.f16122;
        if (c69772 != null) {
            c6978M12094 = c69772.m12094();
        } else {
            String str = c6589.f16123;
            C6978 c6978 = c6589.f16124;
            c6978.getClass();
            str.getClass();
            try {
                c6977 = new C6977(0);
                c6977.m12097(c6978, str);
            } catch (IllegalArgumentException unused) {
                c6977 = null;
            }
            c6978M12094 = c6977 != null ? c6977.m12094() : null;
            if (c6978M12094 == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(c6978);
                C6385.m11435(sb, ", Relative: ", c6589.f16123);
                return null;
            }
        }
        AbstractC6962 c6593 = c6589.f16128;
        if (c6593 == null) {
            C5703 c5703 = c6589.f16130;
            if (c5703 != null) {
                c6593 = new C6976((ArrayList) c5703.f14509, (ArrayList) c5703.f14510);
            } else {
                C0955 c0955 = c6589.f16129;
                if (c0955 != null) {
                    ArrayList arrayList2 = (ArrayList) c0955.f663;
                    if (arrayList2.isEmpty()) {
                        C6755.m11870("Multipart body must have at least one part.");
                        return null;
                    }
                    c6593 = new C6971((ByteString) c0955.f664, (C6973) c0955.f665, AbstractC7059.m12262(arrayList2));
                } else if (c6589.f16126) {
                    int i2 = AbstractC6962.f17134;
                    AbstractC7054.m12240(0L, 0L, 0L);
                    c6593 = new C6951(null, 0, new byte[0]);
                }
            }
        }
        C6973 c6973 = c6589.f16127;
        C2397 c2397 = c6589.f16120;
        if (c6973 != null) {
            if (c6593 != null) {
                c6593 = new C6593(c6593, c6973);
            } else {
                c2397.m3400("Content-Type", c6973.f17207);
            }
        }
        C2080 c2080 = c6589.f16121;
        c2080.getClass();
        c2080.f3965 = c6978M12094;
        c2080.f3963 = c2397.m3398().m12108();
        c2080.m2718(c6589.f16125, c6593);
        c2080.f3964 = ((AbstractC7176) c2080.f3964).mo12251(AbstractC5228.f13320.mo9476(C6613.class), new C6613(c6586.f16108, this.f16179, c6586.f16107, arrayList));
        C6954 c6954 = new C6954(c2080);
        C6956 c6956 = this.f16174;
        c6956.getClass();
        return new C7032(c6956, c6954);
    }

    @Override // retrofit2.InterfaceC6608
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final synchronized C6954 mo11720() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m11718().f17430;
    }

    @Override // retrofit2.InterfaceC6608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo11721() {
        boolean z = true;
        if (this.f16177) {
            return true;
        }
        synchronized (this) {
            try {
                C7032 c7032 = this.f16178;
                if (c7032 == null || !c7032.f17423) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // retrofit2.InterfaceC6608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo11722(InterfaceC6625 interfaceC6625) {
        C7032 c7032;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f16176) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f16176 = true;
                c7032 = this.f16178;
                th = this.f16175;
                if (c7032 == null && th == null) {
                    try {
                        C7032 c7032M11719 = m11719();
                        this.f16178 = c7032M11719;
                        c7032 = c7032M11719;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC6615.m11743(th);
                        this.f16175 = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC6625.onFailure(this, th);
            return;
        }
        if (this.f16177) {
            c7032.cancel();
        }
        c7032.m12194(new C5703(3, this, interfaceC6625, false));
    }

    @Override // retrofit2.InterfaceC6608
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final InterfaceC6608 mo11723clone() {
        return new C6598(this.f16181, this.f16179, this.f16180, this.f16174, this.f16173);
    }
}
