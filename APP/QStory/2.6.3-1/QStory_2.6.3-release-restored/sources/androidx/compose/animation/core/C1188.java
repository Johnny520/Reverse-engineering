package androidx.compose.animation.core;

import androidx.window.area.AbstractC3400;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1188 implements InterfaceC1173 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC1189 f1501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC1189 f1502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC1189 f1503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f1504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1204 f1505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1172 f1506;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f1507;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f1508;

    public C1188(InterfaceC1180 interfaceC1180, InterfaceC1204 interfaceC1204, Object obj, AbstractC1189 abstractC1189) {
        C1172 c1172 = new C1172(((C1179) interfaceC1180).f1485);
        this.f1506 = c1172;
        this.f1505 = interfaceC1204;
        this.f1504 = obj;
        AbstractC1189 abstractC11892 = (AbstractC1189) interfaceC1204.mo1622().invoke(obj);
        this.f1503 = abstractC11892;
        this.f1502 = AbstractC1176.m1586(abstractC1189);
        InterfaceC7387 interfaceC7387Mo1621 = interfaceC1204.mo1621();
        if (c1172.f1444 == null) {
            c1172.f1444 = abstractC11892.mo1599();
        }
        AbstractC1189 abstractC11893 = c1172.f1444;
        if (abstractC11893 == null) {
            AbstractC5227.m9467("targetVector");
            throw null;
        }
        int iMo1600 = abstractC11893.mo1600();
        int i = 0;
        while (true) {
            AbstractC1189 abstractC11894 = c1172.f1444;
            InterfaceC1155 interfaceC1155 = c1172.f1447;
            if (i >= iMo1600) {
                if (abstractC11894 == null) {
                    AbstractC5227.m9467("targetVector");
                    throw null;
                }
                this.f1508 = interfaceC7387Mo1621.invoke(abstractC11894);
                if (c1172.f1445 == null) {
                    c1172.f1445 = abstractC11892.mo1599();
                }
                AbstractC1189 abstractC11895 = c1172.f1445;
                if (abstractC11895 == null) {
                    AbstractC5227.m9467("velocityVector");
                    throw null;
                }
                int iMo16002 = abstractC11895.mo1600();
                long jMax = 0;
                for (int i2 = 0; i2 < iMo16002; i2++) {
                    abstractC11892.getClass();
                    jMax = Math.max(jMax, interfaceC1155.mo1011(abstractC1189.mo1601(i2)));
                }
                this.f1507 = jMax;
                AbstractC1189 abstractC1189M1586 = AbstractC1176.m1586(this.f1506.m1558(jMax, this.f1503, abstractC1189));
                this.f1501 = abstractC1189M1586;
                int iMo16003 = abstractC1189M1586.mo1600();
                for (int i3 = 0; i3 < iMo16003; i3++) {
                    AbstractC1189 abstractC11896 = this.f1501;
                    float fMo1601 = abstractC11896.mo1601(i3);
                    float f = this.f1506.f1443;
                    abstractC11896.mo1597(AbstractC3400.m5631(fMo1601, -f, f), i3);
                }
                return;
            }
            if (abstractC11894 == null) {
                AbstractC5227.m9467("targetVector");
                throw null;
            }
            abstractC11894.mo1597(interfaceC1155.mo1012(abstractC11892.mo1601(i), abstractC1189.mo1601(i)), i);
            i++;
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo1559(long j) {
        if (m1560(j)) {
            return this.f1508;
        }
        InterfaceC7387 interfaceC7387Mo1621 = this.f1505.mo1621();
        C1172 c1172 = this.f1506;
        AbstractC1189 abstractC1189 = c1172.f1446;
        AbstractC1189 abstractC11892 = this.f1503;
        if (abstractC1189 == null) {
            c1172.f1446 = abstractC11892.mo1599();
        }
        AbstractC1189 abstractC11893 = c1172.f1446;
        if (abstractC11893 == null) {
            AbstractC5227.m9467("valueVector");
            throw null;
        }
        int iMo1600 = abstractC11893.mo1600();
        int i = 0;
        while (true) {
            AbstractC1189 abstractC11894 = c1172.f1446;
            if (i >= iMo1600) {
                if (abstractC11894 != null) {
                    return interfaceC7387Mo1621.invoke(abstractC11894);
                }
                AbstractC5227.m9467("valueVector");
                throw null;
            }
            if (abstractC11894 == null) {
                AbstractC5227.m9467("valueVector");
                throw null;
            }
            abstractC11894.mo1597(c1172.f1447.mo1010(abstractC11892.mo1601(i), this.f1502.mo1601(i), j), i);
            i++;
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC1189 mo1561(long j) {
        if (m1560(j)) {
            return this.f1501;
        }
        return this.f1506.m1558(j, this.f1503, this.f1502);
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC1204 mo1562() {
        return this.f1505;
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo1563() {
        return this.f1507;
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1564() {
        return false;
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo1565() {
        return this.f1508;
    }
}
