package com.google.gson.internal;

import androidx.profileinstaller.AbstractC2442;
import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.InterfaceC3248;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p175.AbstractC7738;
import p260.C8245;
import p269.AbstractC8267;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3221 implements InterfaceC3248, Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3221 f10867 = new C3221();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f10868;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f10869;

    public C3221() {
        List list = Collections.EMPTY_LIST;
        this.f10869 = list;
        this.f10868 = list;
    }

    public final Object clone() {
        try {
            return (C3221) super.clone();
        } catch (CloneNotSupportedException e) {
            C5919.m11243(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m7333(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            AbstractC7738 abstractC7738 = AbstractC8267.f22885;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f10869 : this.f10868).iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4568(it);
        }
        return false;
    }

    @Override // com.google.gson.InterfaceC3248
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3250 mo7334(C3252 c3252, C8245 c8245) {
        Class cls = c8245.f22816;
        boolean zM7333 = m7333(cls, true);
        boolean zM73332 = m7333(cls, false);
        if (zM7333 || zM73332) {
            return new C3222(this, zM73332, zM7333, c3252, c8245);
        }
        return null;
    }
}
