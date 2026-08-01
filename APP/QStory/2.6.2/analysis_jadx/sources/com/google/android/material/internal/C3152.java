package com.google.android.material.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p301.AbstractC8615;
import p301.C8612;
import p301.InterfaceC8609;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f10492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f10493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC3153 f10494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f10496 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashSet f10495 = new HashSet();

    public void setOnCheckedStateChangeListener(InterfaceC3153 interfaceC3153) {
        this.f10494 = interfaceC3153;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7185(InterfaceC3165 interfaceC3165, boolean z) {
        int id = interfaceC3165.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.f10495;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            interfaceC3165.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (interfaceC3165.isChecked()) {
            interfaceC3165.setChecked(false);
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7186() {
        InterfaceC3153 interfaceC3153 = this.f10494;
        if (interfaceC3153 != null) {
            new HashSet(this.f10495);
            AbstractC8615 abstractC8615 = ((C8612) interfaceC3153).f24086;
            InterfaceC8609 interfaceC8609 = abstractC8615.f24155;
            if (interfaceC8609 != null) {
                abstractC8615.f24152.m7188(abstractC8615);
                AbstractC8615 abstractC86152 = ((C8612) interfaceC8609).f24086;
                if (abstractC86152.f24152.f10493) {
                    abstractC86152.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7187() {
        if (!this.f10493) {
            return -1;
        }
        HashSet hashSet = this.f10495;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m7188(AbstractC8615 abstractC8615) {
        HashSet hashSet = new HashSet(this.f10495);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < abstractC8615.getChildCount(); i++) {
            View childAt = abstractC8615.getChildAt(i);
            if ((childAt instanceof InterfaceC3165) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m7189(InterfaceC3165 interfaceC3165) {
        int id = interfaceC3165.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.f10495;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        InterfaceC3165 interfaceC31652 = (InterfaceC3165) this.f10496.get(Integer.valueOf(m7187()));
        if (interfaceC31652 != null) {
            m7185(interfaceC31652, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!interfaceC3165.isChecked()) {
            interfaceC3165.setChecked(true);
        }
        return zAdd;
    }
}
