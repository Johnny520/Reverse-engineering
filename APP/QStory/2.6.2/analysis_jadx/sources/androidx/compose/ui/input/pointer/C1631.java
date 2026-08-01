package androidx.compose.ui.input.pointer;

import androidx.collection.C0244;
import androidx.collection.C0254;
import androidx.collection.C0263;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.jvm.internal.AbstractC4394;
import p232.C8064;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1631 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f4766;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f4767;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f4768;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f4769;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1695 f4770;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0244 f4765 = new C0244();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1651 f4772 = new C1651();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0254 f4771 = new C0254(10);

    public C1631(InterfaceC1695 interfaceC1695) {
        this.f4770 = interfaceC1695;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3002(AbstractC2128 abstractC2128) {
        if (this.f4769) {
            this.f4766 = true;
            this.f4765.m774(abstractC2128);
            return;
        }
        C1651 c1651 = this.f4772;
        C0244 c0244 = c1651.f4844;
        c0244.m778();
        c0244.m774(c1651);
        while (c0244.m877()) {
            C1651 c16512 = (C1651) c0244.m776(c0244.f1004 - 1);
            int i = 0;
            while (true) {
                C1224 c1224 = c16512.f4845;
                if (i < c1224.f3519) {
                    C1647 c1647 = (C1647) c1224.f3520[i];
                    if (AbstractC4394.m8917(c1647.f4829, abstractC2128)) {
                        c16512.f4845.m2045(c1647);
                        c1647.m3028();
                    } else {
                        c0244.m774(c1647);
                        i++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3003() {
        if (this.f4769) {
            this.f4768 = true;
            return;
        }
        C1651 c1651 = this.f4772;
        C1224 c1224 = c1651.f4845;
        Object[] objArr = c1224.f3520;
        int i = c1224.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            ((C1647) objArr[i2]).m3028();
        }
        if (this.f4767) {
            this.f4767 = true;
        } else {
            c1651.f4845.m2042();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m3004(C8064 c8064, boolean z) {
        C0263 c0263 = (C0263) c8064.f22248;
        InterfaceC1695 interfaceC1695 = this.f4770;
        C1651 c1651 = this.f4772;
        boolean zMo3030 = c1651.mo3030(c0263, interfaceC1695, c8064, z);
        C1224 c1224 = c1651.f4845;
        if (!zMo3030) {
            return false;
        }
        boolean z2 = true;
        this.f4769 = true;
        Object[] objArr = c1224.f3520;
        int i = c1224.f3519;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((C1647) objArr[i2]).m3026(c8064, z) || z3;
        }
        Object[] objArr2 = c1224.f3520;
        int i3 = c1224.f3519;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((C1647) objArr2[i4]).m3027(c8064) || z4;
        }
        c1651.mo3029(c8064);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.f4769 = false;
        if (this.f4766) {
            this.f4766 = false;
            C0244 c0244 = this.f4765;
            int i5 = c0244.f1004;
            for (int i6 = 0; i6 < i5; i6++) {
                m3002((AbstractC2128) c0244.m880(i6));
            }
            c0244.m778();
        }
        if (this.f4768) {
            this.f4768 = false;
            m3003();
        }
        if (this.f4767) {
            this.f4767 = false;
            c1651.f4845.m2042();
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3005(long r19, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.C1631.m3005(long, java.util.List, boolean):void");
    }
}
