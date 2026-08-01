package p079;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4692;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import lin.xposed.hook.javaplugin.C5554;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7018 extends AbstractC7002 implements InterfaceC4495 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f18856;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7018(AbstractC6989 abstractC6989, InterfaceC4495 interfaceC4495, InterfaceC6481 interfaceC6481, boolean z, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4462 interfaceC4462) {
        super(callableMemberDescriptor$Kind, abstractC6989, interfaceC4495, interfaceC4462, AbstractC4692.f13707, interfaceC6481);
        if (abstractC6989 == null) {
            m12358(0);
            throw null;
        }
        if (interfaceC6481 == null) {
            m12358(1);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12358(2);
            throw null;
        }
        if (interfaceC4462 == null) {
            m12358(3);
            throw null;
        }
        this.f18856 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m12358(int r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p079.C7018.m12358(int):void");
    }

    @Override // p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C7018 mo9002() {
        C7018 c7018 = (C7018) super.mo9002();
        if (c7018 != null) {
            return c7018;
        }
        m12358(19);
        throw null;
    }

    @Override // p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC6989 mo9028() {
        AbstractC6989 abstractC6989 = (AbstractC6989) super.mo9028();
        if (abstractC6989 != null) {
            return abstractC6989;
        }
        m12358(17);
        throw null;
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4464
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7018 mo9005(C4919 c4919) {
        if (c4919 != null) {
            return (C7018) super.mo9005(c4919);
        }
        m12358(20);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m12362(List list, C4490 c4490) {
        if (list == null) {
            m12358(13);
            throw null;
        }
        if (c4490 != null) {
            m12363(list, c4490, mo9028().mo9015());
        } else {
            m12358(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12363(java.util.List r12, kotlin.reflect.jvm.internal.impl.descriptors.C4490 r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L61
            if (r13 == 0) goto L5b
            if (r14 == 0) goto L55
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰 r1 = r11.mo9028()
            boolean r2 = r1.mo9011()
            if (r2 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r1 = r1.mo9028()
            boolean r2 = r1 instanceof p079.AbstractC6989
            if (r2 == 0) goto L21
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰 r1 = (p079.AbstractC6989) r1
            飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰苏世哲 r1 = r1.mo12307()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰 r1 = r11.mo9028()
            java.util.List r2 = r1.mo9539()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.mo9539()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L43
        L38:
            r11 = 15
            m12358(r11)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            if (r1 == 0) goto L4f
            goto L36
        L43:
            r8 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r9 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            r3 = 0
            r2 = r11
            r7 = r12
            r10 = r13
            r6 = r14
            r2.mo12297(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L4f:
            r11 = 16
            m12358(r11)
            throw r0
        L55:
            r11 = 12
            m12358(r11)
            throw r0
        L5b:
            r11 = 11
            m12358(r11)
            throw r0
        L61:
            r11 = 10
            m12358(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p079.C7018.m12363(java.util.List, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲世苏兰, java.util.List):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final AbstractC6989 m12364() {
        AbstractC6989 abstractC6989Mo9028 = mo9028();
        if (abstractC6989Mo9028 != null) {
            return abstractC6989Mo9028;
        }
        m12358(18);
        throw null;
    }

    @Override // p079.AbstractC7002
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: merged with bridge method [inline-methods] */
    public C7018 mo9144(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4499 interfaceC4499, InterfaceC4484 interfaceC4484, InterfaceC4462 interfaceC4462, C4691 c4691, InterfaceC6481 interfaceC6481) {
        if (interfaceC4499 == null) {
            m12358(23);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12358(24);
            throw null;
        }
        if (interfaceC6481 == null) {
            m12358(25);
            throw null;
        }
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind2 = CallableMemberDescriptor$Kind.DECLARATION;
        if (callableMemberDescriptor$Kind == callableMemberDescriptor$Kind2 || callableMemberDescriptor$Kind == CallableMemberDescriptor$Kind.SYNTHESIZED) {
            return new C7018((AbstractC6989) interfaceC4499, this, interfaceC6481, this.f18856, callableMemberDescriptor$Kind2, interfaceC4462);
        }
        C5554.m10888("Attempt at creating a constructor that is not a declaration: \ncopy from: ", this, "\nnewOwner: ", interfaceC4499, "\nkind: ", callableMemberDescriptor$Kind);
        return null;
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9027(InterfaceC4497 interfaceC4497, Object obj) {
        return interfaceC4497.mo285(this, obj);
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4480 mo9029(AbstractC6989 abstractC6989, Modality modality, C4490 c4490, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) {
        return (C7018) m12333(abstractC6989, modality, c4490, callableMemberDescriptor$Kind);
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9030() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m12358(21);
        throw null;
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo9031(Collection collection) {
        if (collection != null) {
            return;
        }
        m12358(22);
        throw null;
    }
}
