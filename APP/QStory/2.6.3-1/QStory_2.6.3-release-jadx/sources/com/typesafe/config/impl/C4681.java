package com.typesafe.config.impl;

import androidx.appcompat.app.C0923;
import com.typesafe.config.ConfigException;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4681 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0923 f12418;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4678 f12419;

    public C4681(AbstractC4678 abstractC4678) {
        this.f12419 = abstractC4678;
        this.f12418 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C0923 m8786(C0923 c0923, InterfaceC4693 interfaceC4693, AbstractC4675 abstractC4675) {
        Object obj = c0923.f572;
        C0923 c09232 = (C0923) c0923.f573;
        InterfaceC4693 interfaceC46932 = (InterfaceC4693) obj;
        if (interfaceC46932 != interfaceC4693) {
            throw new ConfigException.BugOrBroken("Can only replace() the top node we're resolving; had " + interfaceC46932 + " on top and tried to replace " + interfaceC4693 + " overall list was " + c0923);
        }
        Object obj2 = null;
        InterfaceC4693 interfaceC46933 = c09232 == null ? null : (InterfaceC4693) c09232.f572;
        if (abstractC4675 == 0 || !(abstractC4675 instanceof InterfaceC4693)) {
            if (interfaceC46933 == null) {
                return null;
            }
            return m8786(c09232, interfaceC46933, interfaceC46933.replaceChild((AbstractC4675) interfaceC4693, null));
        }
        int i = 20;
        if (interfaceC46933 == null) {
            return new C0923((InterfaceC4693) abstractC4675, i, obj2);
        }
        C0923 c0923M8786 = m8786(c09232, interfaceC46933, interfaceC46933.replaceChild((AbstractC4675) interfaceC4693, abstractC4675));
        return c0923M8786 != null ? new C0923((InterfaceC4693) abstractC4675, i, c0923M8786) : new C0923((InterfaceC4693) abstractC4675, i, obj2);
    }

    public final String toString() {
        return "ResolveSource(root=" + this.f12419 + ", pathFromRoot=" + this.f12418 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4681 m8787(InterfaceC4693 interfaceC4693) {
        boolean zM8799 = AbstractC4695.m8799();
        AbstractC4678 abstractC4678 = this.f12419;
        if (zM8799) {
            StringBuilder sb = new StringBuilder("pushing parent ");
            sb.append(interfaceC4693);
            sb.append(" ==root ");
            sb.append(interfaceC4693 == abstractC4678);
            sb.append(" onto ");
            sb.append(this);
            AbstractC4695.m8800(sb.toString());
        }
        int i = 20;
        C0923 c0923 = this.f12418;
        if (c0923 == null) {
            if (interfaceC4693 == abstractC4678) {
                return new C4681(abstractC4678, new C0923(interfaceC4693, i, (Object) null));
            }
            if (AbstractC4695.m8799() && abstractC4678.hasDescendant((AbstractC4675) interfaceC4693)) {
                AbstractC4695.m8800("***** BUG ***** tried to push parent " + interfaceC4693 + " without having a path to it in " + this);
            }
            return this;
        }
        InterfaceC4693 interfaceC46932 = (InterfaceC4693) c0923.f572;
        if (AbstractC4695.m8799() && interfaceC46932 != null && !interfaceC46932.hasDescendant((AbstractC4675) interfaceC4693)) {
            AbstractC4695.m8800("***** BUG ***** trying to push non-child of " + interfaceC46932 + ", non-child was " + interfaceC4693);
        }
        return new C4681(abstractC4678, new C0923(interfaceC4693, i, c0923));
    }

    public C4681(AbstractC4678 abstractC4678, C0923 c0923) {
        this.f12419 = abstractC4678;
        this.f12418 = c0923;
    }
}
