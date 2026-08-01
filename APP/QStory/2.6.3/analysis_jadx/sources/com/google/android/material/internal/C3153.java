package com.google.android.material.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p301.AbstractC8607;
import p301.C8604;
import p301.InterfaceC8601;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3153 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f10497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f10498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC3154 f10499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f10501 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashSet f10500 = new HashSet();

    public void setOnCheckedStateChangeListener(InterfaceC3154 interfaceC3154) {
        this.f10499 = interfaceC3154;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7172(InterfaceC3166 interfaceC3166, boolean z) {
        int id = interfaceC3166.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.f10500;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            interfaceC3166.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (interfaceC3166.isChecked()) {
            interfaceC3166.setChecked(false);
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7173() {
        InterfaceC3154 interfaceC3154 = this.f10499;
        if (interfaceC3154 != null) {
            new HashSet(this.f10500);
            AbstractC8607 abstractC8607 = ((C8604) interfaceC3154).f24077;
            InterfaceC8601 interfaceC8601 = abstractC8607.f24146;
            if (interfaceC8601 != null) {
                abstractC8607.f24143.m7175(abstractC8607);
                AbstractC8607 abstractC86072 = ((C8604) interfaceC8601).f24077;
                if (abstractC86072.f24143.f10498) {
                    abstractC86072.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7174() {
        if (!this.f10498) {
            return -1;
        }
        HashSet hashSet = this.f10500;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m7175(AbstractC8607 abstractC8607) {
        HashSet hashSet = new HashSet(this.f10500);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < abstractC8607.getChildCount(); i++) {
            View childAt = abstractC8607.getChildAt(i);
            if ((childAt instanceof InterfaceC3166) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m7176(InterfaceC3166 interfaceC3166) {
        int id = interfaceC3166.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.f10500;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        InterfaceC3166 interfaceC31662 = (InterfaceC3166) this.f10501.get(Integer.valueOf(m7174()));
        if (interfaceC31662 != null) {
            m7172(interfaceC31662, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!interfaceC3166.isChecked()) {
            interfaceC3166.setChecked(true);
        }
        return zAdd;
    }
}
