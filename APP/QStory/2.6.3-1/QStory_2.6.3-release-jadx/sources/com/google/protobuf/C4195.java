package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲兰苏子楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4195 implements InterfaceC4364 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C4192 f11353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C4193 f11354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f11356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC4235 f11357;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC4364 f11358;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C4194 f11359;

    public C4195(List list, InterfaceC4364 interfaceC4364, boolean z) {
        InterfaceC4235 interfaceC4235;
        if (list instanceof InterfaceC4235) {
            interfaceC4235 = (InterfaceC4235) list;
        } else {
            C4212 c4212Mo8045 = C4212.f11372.mo8045(list.size());
            c4212Mo8045.addAll(list);
            interfaceC4235 = c4212Mo8045;
        }
        this.f11357 = interfaceC4235;
        this.f11358 = interfaceC4364;
        this.f11355 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m8017(GeneratedMessage generatedMessage) {
        Charset charset = AbstractC4234.f11404;
        generatedMessage.getClass();
        m8035();
        this.f11357.add(generatedMessage);
        ArrayList arrayList = this.f11356;
        if (arrayList != null) {
            arrayList.add(null);
        }
        m8027();
        m8026();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8018(int i, GeneratedMessage generatedMessage) {
        Charset charset = AbstractC4234.f11404;
        generatedMessage.getClass();
        m8035();
        this.f11357.add(i, generatedMessage);
        ArrayList arrayList = this.f11356;
        if (arrayList != null) {
            arrayList.add(i, null);
        }
        m8027();
        m8026();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC4137 m8019(GeneratedMessage generatedMessage) {
        m8035();
        m8034();
        C4174 c4174 = new C4174(generatedMessage, this, this.f11355);
        this.f11357.add(null);
        this.f11356.add(c4174);
        m8027();
        m8026();
        return c4174.m7940();
    }

    @Override // com.google.protobuf.InterfaceC4364
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7941() {
        m8027();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC4137 m8020(int i, GeneratedMessage generatedMessage) {
        m8035();
        m8034();
        C4174 c4174 = new C4174(generatedMessage, this, this.f11355);
        this.f11357.add(i, null);
        this.f11356.add(i, c4174);
        m8027();
        m8026();
        return c4174.m7940();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8021(Iterable iterable) {
        int size;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            GeneratedMessage generatedMessage = (GeneratedMessage) it.next();
            Charset charset = AbstractC4234.f11404;
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
        m8035();
        if (size >= 0) {
            List list = this.f11357;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            m8017((GeneratedMessage) it2.next());
        }
        m8027();
        m8026();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m8022(int i, GeneratedMessage generatedMessage) {
        C4174 c4174;
        Charset charset = AbstractC4234.f11404;
        generatedMessage.getClass();
        m8035();
        this.f11357.set(i, generatedMessage);
        ArrayList arrayList = this.f11356;
        if (arrayList != null && (c4174 = (C4174) arrayList.set(i, null)) != null) {
            c4174.f11316 = null;
        }
        m8027();
        m8026();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m8023(int i) {
        C4174 c4174;
        m8035();
        this.f11357.remove(i);
        ArrayList arrayList = this.f11356;
        if (arrayList != null && (c4174 = (C4174) arrayList.remove(i)) != null) {
            c4174.f11316 = null;
        }
        m8027();
        m8026();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C4193 m8024() {
        if (this.f11354 == null) {
            this.f11354 = new C4193(this);
        }
        return this.f11354;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final GeneratedMessage m8025(int i, boolean z) {
        ArrayList arrayList = this.f11356;
        if (arrayList == null) {
            return (GeneratedMessage) this.f11357.get(i);
        }
        C4174 c4174 = (C4174) arrayList.get(i);
        return c4174 == null ? (GeneratedMessage) this.f11357.get(i) : z ? c4174.m7943() : c4174.m7939();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m8026() {
        C4193 c4193 = this.f11354;
        if (c4193 != null) {
            c4193.m8015();
        }
        C4192 c4192 = this.f11353;
        if (c4192 != null) {
            c4192.m8014();
        }
        C4194 c4194 = this.f11359;
        if (c4194 != null) {
            c4194.m8016();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m8027() {
        InterfaceC4364 interfaceC4364;
        if (!this.f11355 || (interfaceC4364 = this.f11358) == null) {
            return;
        }
        interfaceC4364.mo7941();
        this.f11355 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC4274 m8028(int i) {
        ArrayList arrayList = this.f11356;
        if (arrayList == null) {
            return (InterfaceC4274) this.f11357.get(i);
        }
        C4174 c4174 = (C4174) arrayList.get(i);
        return c4174 == null ? (InterfaceC4274) this.f11357.get(i) : c4174.m7938();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4194 m8029() {
        if (this.f11359 == null) {
            this.f11359 = new C4194(this);
        }
        return this.f11359;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m8030() {
        this.f11357 = C4212.f11372;
        ArrayList<C4174> arrayList = this.f11356;
        if (arrayList != null) {
            for (C4174 c4174 : arrayList) {
                if (c4174 != null) {
                    c4174.f11316 = null;
                }
            }
            this.f11356 = null;
        }
        m8027();
        m8026();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC4235 m8031() {
        this.f11355 = true;
        InterfaceC4235 interfaceC4235 = this.f11357;
        boolean z = ((AbstractC4380) interfaceC4235).f11544;
        if (!z && this.f11356 == null) {
            return interfaceC4235;
        }
        int i = 0;
        if (!z) {
            int i2 = 0;
            while (true) {
                int size = this.f11357.size();
                InterfaceC4235 interfaceC42352 = this.f11357;
                if (i2 >= size) {
                    return interfaceC42352;
                }
                InterfaceC4285 interfaceC4285 = (InterfaceC4285) interfaceC42352.get(i2);
                C4174 c4174 = (C4174) this.f11356.get(i2);
                if (c4174 != null && c4174.m7943() != interfaceC4285) {
                    break;
                }
                i2++;
            }
        }
        m8035();
        while (true) {
            int size2 = this.f11357.size();
            InterfaceC4235 interfaceC42353 = this.f11357;
            if (i >= size2) {
                ((AbstractC4380) interfaceC42353).m8346();
                return this.f11357;
            }
            interfaceC42353.set(i, m8025(i, true));
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC4137 m8032(int i) {
        m8034();
        C4174 c4174 = (C4174) this.f11356.get(i);
        if (c4174 == null) {
            C4174 c41742 = new C4174((GeneratedMessage) this.f11357.get(i), this, this.f11355);
            this.f11356.set(i, c41742);
            c4174 = c41742;
        }
        return c4174.m7940();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C4192 m8033() {
        if (this.f11353 == null) {
            this.f11353 = new C4192(this);
        }
        return this.f11353;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m8034() {
        if (this.f11356 == null) {
            this.f11356 = new ArrayList(this.f11357.size());
            for (int i = 0; i < this.f11357.size(); i++) {
                this.f11356.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m8035() {
        InterfaceC4235 interfaceC4235 = this.f11357;
        if (((AbstractC4380) interfaceC4235).f11544) {
            return;
        }
        this.f11357 = interfaceC4235.mo8045(interfaceC4235.size());
    }
}
