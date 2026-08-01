package com.google.gson.internal;

import androidx.profileinstaller.AbstractC2442;
import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3249;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p175.AbstractC7739;
import p260.C8246;
import p269.AbstractC8268;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3222 implements InterfaceC3249, Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3222 f10872 = new C3222();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f10873;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f10874;

    public C3222() {
        List list = Collections.EMPTY_LIST;
        this.f10874 = list;
        this.f10873 = list;
    }

    public final Object clone() {
        try {
            return (C3222) super.clone();
        } catch (CloneNotSupportedException e) {
            C5925.m11304(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m7320(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            AbstractC7739 abstractC7739 = AbstractC8268.f22884;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f10874 : this.f10873).iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4578(it);
        }
        return false;
    }

    @Override // com.google.gson.InterfaceC3249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
        Class cls = c8246.f22815;
        boolean zM7320 = m7320(cls, true);
        boolean zM73202 = m7320(cls, false);
        if (zM7320 || zM73202) {
            return new C3223(this, zM73202, zM7320, c3253, c8246);
        }
        return null;
    }
}
