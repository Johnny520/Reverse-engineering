package com.google.android.material.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p317.AbstractC9436;
import p317.C9433;
import p317.InterfaceC9430;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3985 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f10842;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f10843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC3986 f10844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f10846 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashSet f10845 = new HashSet();

    public void setOnCheckedStateChangeListener(InterfaceC3986 interfaceC3986) {
        this.f10844 = interfaceC3986;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7731(InterfaceC3998 interfaceC3998, boolean z) {
        int id = interfaceC3998.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.f10845;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            interfaceC3998.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (interfaceC3998.isChecked()) {
            interfaceC3998.setChecked(false);
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7732() {
        InterfaceC3986 interfaceC3986 = this.f10844;
        if (interfaceC3986 != null) {
            new HashSet(this.f10845);
            AbstractC9436 abstractC9436 = ((C9433) interfaceC3986).f24422;
            InterfaceC9430 interfaceC9430 = abstractC9436.f24491;
            if (interfaceC9430 != null) {
                abstractC9436.f24488.m7734(abstractC9436);
                AbstractC9436 abstractC94362 = ((C9433) interfaceC9430).f24422;
                if (abstractC94362.f24488.f10843) {
                    abstractC94362.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7733() {
        if (!this.f10843) {
            return -1;
        }
        HashSet hashSet = this.f10845;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m7734(AbstractC9436 abstractC9436) {
        HashSet hashSet = new HashSet(this.f10845);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < abstractC9436.getChildCount(); i++) {
            View childAt = abstractC9436.getChildAt(i);
            if ((childAt instanceof InterfaceC3998) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m7735(InterfaceC3998 interfaceC3998) {
        int id = interfaceC3998.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.f10845;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        InterfaceC3998 interfaceC39982 = (InterfaceC3998) this.f10846.get(Integer.valueOf(m7733()));
        if (interfaceC39982 != null) {
            m7731(interfaceC39982, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!interfaceC3998.isChecked()) {
            interfaceC3998.setChecked(true);
        }
        return zAdd;
    }
}
