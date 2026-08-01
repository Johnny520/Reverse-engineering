package com.typesafe.config.impl;

import androidx.appcompat.app.C0076;
import com.typesafe.config.ConfigException;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3849 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0076 f12073;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3846 f12074;

    public C3849(AbstractC3846 abstractC3846) {
        this.f12074 = abstractC3846;
        this.f12073 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C0076 m8227(C0076 c0076, InterfaceC3861 interfaceC3861, AbstractC3843 abstractC3843) {
        Object obj = c0076.f227;
        C0076 c00762 = (C0076) c0076.f228;
        InterfaceC3861 interfaceC38612 = (InterfaceC3861) obj;
        if (interfaceC38612 != interfaceC3861) {
            throw new ConfigException.BugOrBroken("Can only replace() the top node we're resolving; had " + interfaceC38612 + " on top and tried to replace " + interfaceC3861 + " overall list was " + c0076);
        }
        Object obj2 = null;
        InterfaceC3861 interfaceC38613 = c00762 == null ? null : (InterfaceC3861) c00762.f227;
        if (abstractC3843 == 0 || !(abstractC3843 instanceof InterfaceC3861)) {
            if (interfaceC38613 == null) {
                return null;
            }
            return m8227(c00762, interfaceC38613, interfaceC38613.replaceChild((AbstractC3843) interfaceC3861, null));
        }
        int i = 20;
        if (interfaceC38613 == null) {
            return new C0076((InterfaceC3861) abstractC3843, i, obj2);
        }
        C0076 c0076M8227 = m8227(c00762, interfaceC38613, interfaceC38613.replaceChild((AbstractC3843) interfaceC3861, abstractC3843));
        return c0076M8227 != null ? new C0076((InterfaceC3861) abstractC3843, i, c0076M8227) : new C0076((InterfaceC3861) abstractC3843, i, obj2);
    }

    public final String toString() {
        return "ResolveSource(root=" + this.f12074 + ", pathFromRoot=" + this.f12073 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3849 m8228(InterfaceC3861 interfaceC3861) {
        boolean zM8240 = AbstractC3863.m8240();
        AbstractC3846 abstractC3846 = this.f12074;
        if (zM8240) {
            StringBuilder sb = new StringBuilder("pushing parent ");
            sb.append(interfaceC3861);
            sb.append(" ==root ");
            sb.append(interfaceC3861 == abstractC3846);
            sb.append(" onto ");
            sb.append(this);
            AbstractC3863.m8241(sb.toString());
        }
        int i = 20;
        C0076 c0076 = this.f12073;
        if (c0076 == null) {
            if (interfaceC3861 == abstractC3846) {
                return new C3849(abstractC3846, new C0076(interfaceC3861, i, (Object) null));
            }
            if (AbstractC3863.m8240() && abstractC3846.hasDescendant((AbstractC3843) interfaceC3861)) {
                AbstractC3863.m8241("***** BUG ***** tried to push parent " + interfaceC3861 + " without having a path to it in " + this);
            }
            return this;
        }
        InterfaceC3861 interfaceC38612 = (InterfaceC3861) c0076.f227;
        if (AbstractC3863.m8240() && interfaceC38612 != null && !interfaceC38612.hasDescendant((AbstractC3843) interfaceC3861)) {
            AbstractC3863.m8241("***** BUG ***** trying to push non-child of " + interfaceC38612 + ", non-child was " + interfaceC3861);
        }
        return new C3849(abstractC3846, new C0076(interfaceC3861, i, c0076));
    }

    public C3849(AbstractC3846 abstractC3846, C0076 c0076) {
        this.f12074 = abstractC3846;
        this.f12073 = c0076;
    }
}
