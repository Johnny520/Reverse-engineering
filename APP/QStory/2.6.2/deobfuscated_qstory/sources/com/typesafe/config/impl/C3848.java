package com.typesafe.config.impl;

import androidx.appcompat.app.C0076;
import com.typesafe.config.ConfigException;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3848 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0076 f12068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3845 f12069;

    public C3848(AbstractC3845 abstractC3845) {
        this.f12069 = abstractC3845;
        this.f12068 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C0076 m8240(C0076 c0076, InterfaceC3860 interfaceC3860, AbstractC3842 abstractC3842) {
        Object obj = c0076.f227;
        C0076 c00762 = (C0076) c0076.f228;
        InterfaceC3860 interfaceC38602 = (InterfaceC3860) obj;
        if (interfaceC38602 != interfaceC3860) {
            throw new ConfigException.BugOrBroken("Can only replace() the top node we're resolving; had " + interfaceC38602 + " on top and tried to replace " + interfaceC3860 + " overall list was " + c0076);
        }
        Object obj2 = null;
        InterfaceC3860 interfaceC38603 = c00762 == null ? null : (InterfaceC3860) c00762.f227;
        if (abstractC3842 == 0 || !(abstractC3842 instanceof InterfaceC3860)) {
            if (interfaceC38603 == null) {
                return null;
            }
            return m8240(c00762, interfaceC38603, interfaceC38603.replaceChild((AbstractC3842) interfaceC3860, null));
        }
        int i = 20;
        if (interfaceC38603 == null) {
            return new C0076((InterfaceC3860) abstractC3842, i, obj2);
        }
        C0076 c0076M8240 = m8240(c00762, interfaceC38603, interfaceC38603.replaceChild((AbstractC3842) interfaceC3860, abstractC3842));
        return c0076M8240 != null ? new C0076((InterfaceC3860) abstractC3842, i, c0076M8240) : new C0076((InterfaceC3860) abstractC3842, i, obj2);
    }

    public final String toString() {
        return "ResolveSource(root=" + this.f12069 + ", pathFromRoot=" + this.f12068 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3848 m8241(InterfaceC3860 interfaceC3860) {
        boolean zM8253 = AbstractC3862.m8253();
        AbstractC3845 abstractC3845 = this.f12069;
        if (zM8253) {
            StringBuilder sb = new StringBuilder("pushing parent ");
            sb.append(interfaceC3860);
            sb.append(" ==root ");
            sb.append(interfaceC3860 == abstractC3845);
            sb.append(" onto ");
            sb.append(this);
            AbstractC3862.m8254(sb.toString());
        }
        int i = 20;
        C0076 c0076 = this.f12068;
        if (c0076 == null) {
            if (interfaceC3860 == abstractC3845) {
                return new C3848(abstractC3845, new C0076(interfaceC3860, i, (Object) null));
            }
            if (AbstractC3862.m8253() && abstractC3845.hasDescendant((AbstractC3842) interfaceC3860)) {
                AbstractC3862.m8254("***** BUG ***** tried to push parent " + interfaceC3860 + " without having a path to it in " + this);
            }
            return this;
        }
        InterfaceC3860 interfaceC38602 = (InterfaceC3860) c0076.f227;
        if (AbstractC3862.m8253() && interfaceC38602 != null && !interfaceC38602.hasDescendant((AbstractC3842) interfaceC3860)) {
            AbstractC3862.m8254("***** BUG ***** trying to push non-child of " + interfaceC38602 + ", non-child was " + interfaceC3860);
        }
        return new C3848(abstractC3845, new C0076(interfaceC3860, i, c0076));
    }

    public C3848(AbstractC3845 abstractC3845, C0076 c0076) {
        this.f12069 = abstractC3845;
        this.f12068 = c0076;
    }
}
