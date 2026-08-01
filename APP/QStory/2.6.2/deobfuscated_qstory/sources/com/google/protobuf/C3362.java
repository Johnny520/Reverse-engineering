package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲兰苏子楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3362 implements InterfaceC3531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C3359 f11003;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C3360 f11004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f11006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC3402 f11007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC3531 f11008;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C3361 f11009;

    public C3362(List list, InterfaceC3531 interfaceC3531, boolean z) {
        InterfaceC3402 interfaceC3402;
        if (list instanceof InterfaceC3402) {
            interfaceC3402 = (InterfaceC3402) list;
        } else {
            C3379 c3379Mo7499 = C3379.f11022.mo7499(list.size());
            c3379Mo7499.addAll(list);
            interfaceC3402 = c3379Mo7499;
        }
        this.f11007 = interfaceC3402;
        this.f11008 = interfaceC3531;
        this.f11005 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7471(GeneratedMessage generatedMessage) {
        Charset charset = AbstractC3401.f11054;
        generatedMessage.getClass();
        m7489();
        this.f11007.add(generatedMessage);
        ArrayList arrayList = this.f11006;
        if (arrayList != null) {
            arrayList.add(null);
        }
        m7481();
        m7480();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7472(int i, GeneratedMessage generatedMessage) {
        Charset charset = AbstractC3401.f11054;
        generatedMessage.getClass();
        m7489();
        this.f11007.add(i, generatedMessage);
        ArrayList arrayList = this.f11006;
        if (arrayList != null) {
            arrayList.add(i, null);
        }
        m7481();
        m7480();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC3304 m7473(GeneratedMessage generatedMessage) {
        m7489();
        m7488();
        C3341 c3341 = new C3341(generatedMessage, this, this.f11005);
        this.f11007.add(null);
        this.f11006.add(c3341);
        m7481();
        m7480();
        return c3341.m7394();
    }

    @Override // com.google.protobuf.InterfaceC3531
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7395() {
        m7481();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC3304 m7474(int i, GeneratedMessage generatedMessage) {
        m7489();
        m7488();
        C3341 c3341 = new C3341(generatedMessage, this, this.f11005);
        this.f11007.add(i, null);
        this.f11006.add(i, c3341);
        m7481();
        m7480();
        return c3341.m7394();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7475(Iterable iterable) {
        int size;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            GeneratedMessage generatedMessage = (GeneratedMessage) it.next();
            Charset charset = AbstractC3401.f11054;
            generatedMessage.getClass();
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return;
            } else {
                size = collection.size();
            }
        } else {
            size = -1;
        }
        m7489();
        if (size >= 0) {
            List list = this.f11007;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            m7471((GeneratedMessage) it2.next());
        }
        m7481();
        m7480();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7476(int i, GeneratedMessage generatedMessage) {
        C3341 c3341;
        Charset charset = AbstractC3401.f11054;
        generatedMessage.getClass();
        m7489();
        this.f11007.set(i, generatedMessage);
        ArrayList arrayList = this.f11006;
        if (arrayList != null && (c3341 = (C3341) arrayList.set(i, null)) != null) {
            c3341.f10966 = null;
        }
        m7481();
        m7480();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7477(int i) {
        C3341 c3341;
        m7489();
        this.f11007.remove(i);
        ArrayList arrayList = this.f11006;
        if (arrayList != null && (c3341 = (C3341) arrayList.remove(i)) != null) {
            c3341.f10966 = null;
        }
        m7481();
        m7480();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C3360 m7478() {
        if (this.f11004 == null) {
            this.f11004 = new C3360(this);
        }
        return this.f11004;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final GeneratedMessage m7479(int i, boolean z) {
        ArrayList arrayList = this.f11006;
        if (arrayList == null) {
            return (GeneratedMessage) this.f11007.get(i);
        }
        C3341 c3341 = (C3341) arrayList.get(i);
        return c3341 == null ? (GeneratedMessage) this.f11007.get(i) : z ? c3341.m7397() : c3341.m7393();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m7480() {
        C3360 c3360 = this.f11004;
        if (c3360 != null) {
            c3360.m7469();
        }
        C3359 c3359 = this.f11003;
        if (c3359 != null) {
            c3359.m7468();
        }
        C3361 c3361 = this.f11009;
        if (c3361 != null) {
            c3361.m7470();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7481() {
        InterfaceC3531 interfaceC3531;
        if (!this.f11005 || (interfaceC3531 = this.f11008) == null) {
            return;
        }
        interfaceC3531.mo7395();
        this.f11005 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC3441 m7482(int i) {
        ArrayList arrayList = this.f11006;
        if (arrayList == null) {
            return (InterfaceC3441) this.f11007.get(i);
        }
        C3341 c3341 = (C3341) arrayList.get(i);
        return c3341 == null ? (InterfaceC3441) this.f11007.get(i) : c3341.m7392();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3361 m7483() {
        if (this.f11009 == null) {
            this.f11009 = new C3361(this);
        }
        return this.f11009;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7484() {
        this.f11007 = C3379.f11022;
        ArrayList<C3341> arrayList = this.f11006;
        if (arrayList != null) {
            for (C3341 c3341 : arrayList) {
                if (c3341 != null) {
                    c3341.f10966 = null;
                }
            }
            this.f11006 = null;
        }
        m7481();
        m7480();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC3402 m7485() {
        this.f11005 = true;
        InterfaceC3402 interfaceC3402 = this.f11007;
        boolean z = ((AbstractC3547) interfaceC3402).f11194;
        if (!z && this.f11006 == null) {
            return interfaceC3402;
        }
        int i = 0;
        if (!z) {
            int i2 = 0;
            while (true) {
                int size = this.f11007.size();
                InterfaceC3402 interfaceC34022 = this.f11007;
                if (i2 >= size) {
                    return interfaceC34022;
                }
                InterfaceC3452 interfaceC3452 = (InterfaceC3452) interfaceC34022.get(i2);
                C3341 c3341 = (C3341) this.f11006.get(i2);
                if (c3341 != null && c3341.m7397() != interfaceC3452) {
                    break;
                }
                i2++;
            }
        }
        m7489();
        while (true) {
            int size2 = this.f11007.size();
            InterfaceC3402 interfaceC34023 = this.f11007;
            if (i >= size2) {
                ((AbstractC3547) interfaceC34023).m7800();
                return this.f11007;
            }
            interfaceC34023.set(i, m7479(i, true));
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC3304 m7486(int i) {
        m7488();
        C3341 c3341 = (C3341) this.f11006.get(i);
        if (c3341 == null) {
            C3341 c33412 = new C3341((GeneratedMessage) this.f11007.get(i), this, this.f11005);
            this.f11006.set(i, c33412);
            c3341 = c33412;
        }
        return c3341.m7394();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3359 m7487() {
        if (this.f11003 == null) {
            this.f11003 = new C3359(this);
        }
        return this.f11003;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7488() {
        if (this.f11006 == null) {
            this.f11006 = new ArrayList(this.f11007.size());
            for (int i = 0; i < this.f11007.size(); i++) {
                this.f11006.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7489() {
        InterfaceC3402 interfaceC3402 = this.f11007;
        if (((AbstractC3547) interfaceC3402).f11194) {
            return;
        }
        this.f11007 = interfaceC3402.mo7499(interfaceC3402.size());
    }
}
