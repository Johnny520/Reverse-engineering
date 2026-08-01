package com.google.gson.internal;

import androidx.profileinstaller.AbstractC3275;
import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4081;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p191.AbstractC8568;
import p276.C9075;
import p285.AbstractC9097;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4054 implements InterfaceC4081, Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4054 f11217 = new C4054();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f11218;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f11219;

    public C4054() {
        List list = Collections.EMPTY_LIST;
        this.f11219 = list;
        this.f11218 = list;
    }

    public final Object clone() {
        try {
            return (C4054) super.clone();
        } catch (CloneNotSupportedException e) {
            C6755.m11863(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m7879(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            AbstractC8568 abstractC8568 = AbstractC9097.f23229;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f11219 : this.f11218).iterator();
        if (it.hasNext()) {
            throw AbstractC3275.m5138(it);
        }
        return false;
    }

    @Override // com.google.gson.InterfaceC4081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4083 mo7880(C4085 c4085, C9075 c9075) {
        Class cls = c9075.f23160;
        boolean zM7879 = m7879(cls, true);
        boolean zM78792 = m7879(cls, false);
        if (zM7879 || zM78792) {
            return new C4055(this, zM78792, zM7879, c4085, c9075);
        }
        return null;
    }
}
