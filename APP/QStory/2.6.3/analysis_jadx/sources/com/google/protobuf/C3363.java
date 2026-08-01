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
public final class C3363 implements InterfaceC3532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C3360 f11008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C3361 f11009;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f11011;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC3403 f11012;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC3532 f11013;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C3362 f11014;

    public C3363(List list, InterfaceC3532 interfaceC3532, boolean z) {
        InterfaceC3403 interfaceC3403;
        if (list instanceof InterfaceC3403) {
            interfaceC3403 = (InterfaceC3403) list;
        } else {
            C3380 c3380Mo7486 = C3380.f11027.mo7486(list.size());
            c3380Mo7486.addAll(list);
            interfaceC3403 = c3380Mo7486;
        }
        this.f11012 = interfaceC3403;
        this.f11013 = interfaceC3532;
        this.f11010 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7458(GeneratedMessage generatedMessage) {
        Charset charset = AbstractC3402.f11059;
        generatedMessage.getClass();
        m7476();
        this.f11012.add(generatedMessage);
        ArrayList arrayList = this.f11011;
        if (arrayList != null) {
            arrayList.add(null);
        }
        m7468();
        m7467();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7459(int i, GeneratedMessage generatedMessage) {
        Charset charset = AbstractC3402.f11059;
        generatedMessage.getClass();
        m7476();
        this.f11012.add(i, generatedMessage);
        ArrayList arrayList = this.f11011;
        if (arrayList != null) {
            arrayList.add(i, null);
        }
        m7468();
        m7467();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC3305 m7460(GeneratedMessage generatedMessage) {
        m7476();
        m7475();
        C3342 c3342 = new C3342(generatedMessage, this, this.f11010);
        this.f11012.add(null);
        this.f11011.add(c3342);
        m7468();
        m7467();
        return c3342.m7381();
    }

    @Override // com.google.protobuf.InterfaceC3532
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7382() {
        m7468();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC3305 m7461(int i, GeneratedMessage generatedMessage) {
        m7476();
        m7475();
        C3342 c3342 = new C3342(generatedMessage, this, this.f11010);
        this.f11012.add(i, null);
        this.f11011.add(i, c3342);
        m7468();
        m7467();
        return c3342.m7381();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7462(Iterable iterable) {
        int size;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            GeneratedMessage generatedMessage = (GeneratedMessage) it.next();
            Charset charset = AbstractC3402.f11059;
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
        m7476();
        if (size >= 0) {
            List list = this.f11012;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            m7458((GeneratedMessage) it2.next());
        }
        m7468();
        m7467();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7463(int i, GeneratedMessage generatedMessage) {
        C3342 c3342;
        Charset charset = AbstractC3402.f11059;
        generatedMessage.getClass();
        m7476();
        this.f11012.set(i, generatedMessage);
        ArrayList arrayList = this.f11011;
        if (arrayList != null && (c3342 = (C3342) arrayList.set(i, null)) != null) {
            c3342.f10971 = null;
        }
        m7468();
        m7467();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7464(int i) {
        C3342 c3342;
        m7476();
        this.f11012.remove(i);
        ArrayList arrayList = this.f11011;
        if (arrayList != null && (c3342 = (C3342) arrayList.remove(i)) != null) {
            c3342.f10971 = null;
        }
        m7468();
        m7467();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C3361 m7465() {
        if (this.f11009 == null) {
            this.f11009 = new C3361(this);
        }
        return this.f11009;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final GeneratedMessage m7466(int i, boolean z) {
        ArrayList arrayList = this.f11011;
        if (arrayList == null) {
            return (GeneratedMessage) this.f11012.get(i);
        }
        C3342 c3342 = (C3342) arrayList.get(i);
        return c3342 == null ? (GeneratedMessage) this.f11012.get(i) : z ? c3342.m7384() : c3342.m7380();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m7467() {
        C3361 c3361 = this.f11009;
        if (c3361 != null) {
            c3361.m7456();
        }
        C3360 c3360 = this.f11008;
        if (c3360 != null) {
            c3360.m7455();
        }
        C3362 c3362 = this.f11014;
        if (c3362 != null) {
            c3362.m7457();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7468() {
        InterfaceC3532 interfaceC3532;
        if (!this.f11010 || (interfaceC3532 = this.f11013) == null) {
            return;
        }
        interfaceC3532.mo7382();
        this.f11010 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC3442 m7469(int i) {
        ArrayList arrayList = this.f11011;
        if (arrayList == null) {
            return (InterfaceC3442) this.f11012.get(i);
        }
        C3342 c3342 = (C3342) arrayList.get(i);
        return c3342 == null ? (InterfaceC3442) this.f11012.get(i) : c3342.m7379();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3362 m7470() {
        if (this.f11014 == null) {
            this.f11014 = new C3362(this);
        }
        return this.f11014;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7471() {
        this.f11012 = C3380.f11027;
        ArrayList<C3342> arrayList = this.f11011;
        if (arrayList != null) {
            for (C3342 c3342 : arrayList) {
                if (c3342 != null) {
                    c3342.f10971 = null;
                }
            }
            this.f11011 = null;
        }
        m7468();
        m7467();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC3403 m7472() {
        this.f11010 = true;
        InterfaceC3403 interfaceC3403 = this.f11012;
        boolean z = ((AbstractC3548) interfaceC3403).f11199;
        if (!z && this.f11011 == null) {
            return interfaceC3403;
        }
        int i = 0;
        if (!z) {
            int i2 = 0;
            while (true) {
                int size = this.f11012.size();
                InterfaceC3403 interfaceC34032 = this.f11012;
                if (i2 >= size) {
                    return interfaceC34032;
                }
                InterfaceC3453 interfaceC3453 = (InterfaceC3453) interfaceC34032.get(i2);
                C3342 c3342 = (C3342) this.f11011.get(i2);
                if (c3342 != null && c3342.m7384() != interfaceC3453) {
                    break;
                }
                i2++;
            }
        }
        m7476();
        while (true) {
            int size2 = this.f11012.size();
            InterfaceC3403 interfaceC34033 = this.f11012;
            if (i >= size2) {
                ((AbstractC3548) interfaceC34033).m7787();
                return this.f11012;
            }
            interfaceC34033.set(i, m7466(i, true));
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC3305 m7473(int i) {
        m7475();
        C3342 c3342 = (C3342) this.f11011.get(i);
        if (c3342 == null) {
            C3342 c33422 = new C3342((GeneratedMessage) this.f11012.get(i), this, this.f11010);
            this.f11011.set(i, c33422);
            c3342 = c33422;
        }
        return c3342.m7381();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3360 m7474() {
        if (this.f11008 == null) {
            this.f11008 = new C3360(this);
        }
        return this.f11008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7475() {
        if (this.f11011 == null) {
            this.f11011 = new ArrayList(this.f11012.size());
            for (int i = 0; i < this.f11012.size(); i++) {
                this.f11011.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7476() {
        InterfaceC3403 interfaceC3403 = this.f11012;
        if (((AbstractC3548) interfaceC3403).f11199) {
            return;
        }
        this.f11012 = interfaceC3403.mo7486(interfaceC3403.size());
    }
}
