package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.text.C1850;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5270;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5409;
import kotlin.reflect.jvm.internal.impl.storage.C5680;
import p097.InterfaceC7854;
import p099.C7870;
import p099.InterfaceC7866;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3328 implements InterfaceC7866 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f7813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f7814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f7815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7816;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7817;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7818;

    public C3328(C1171 c1171, InterfaceC5332 interfaceC5332, InterfaceC7854 interfaceC7854, int i) {
        this.f7818 = 1;
        c1171.getClass();
        interfaceC7854.getClass();
        this.f7816 = c1171;
        this.f7815 = interfaceC5332;
        this.f7817 = i;
        ArrayList typeParameters = interfaceC7854.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.f7814 = linkedHashMap;
        this.f7813 = ((C7870) ((C1171) this.f7816).f1440).f19239.m10137(new C1850(this, 28));
    }

    public String toString() {
        switch (this.f7818) {
            case 0:
                return ((C3329) this.f7815).toString() + ", hidden list:" + ((ArrayList) this.f7814).size();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int m5498() {
        return ((C3287) this.f7816).f7649.getChildCount() - ((ArrayList) this.f7814).size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public View m5499(int i) {
        return ((C3287) this.f7816).f7649.getChildAt(m5505(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m5500(int i) {
        int iM5505 = m5505(i);
        ((C3329) this.f7815).m5517(iM5505);
        RecyclerView recyclerView = ((C3287) this.f7816).f7649;
        View childAt = recyclerView.getChildAt(iM5505);
        if (childAt != null) {
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(childAt);
            if (abstractC3317M5249 != null) {
                if (abstractC3317M5249.isTmpDetached() && !abstractC3317M5249.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC3317M5249);
                    C5043.m9162(recyclerView.m5270(), sb);
                    return;
                } else {
                    if (RecyclerView.f7522) {
                        Log.d("RecyclerView", "tmpDetach " + abstractC3317M5249);
                    }
                    abstractC3317M5249.addFlags(256);
                }
            }
        } else if (RecyclerView.f7521) {
            throw new IllegalArgumentException("No view at offset " + iM5505 + recyclerView.m5270());
        }
        recyclerView.detachViewFromParent(iM5505);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m5501(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((C3287) this.f7816).f7649;
        int childCount = i < 0 ? recyclerView.getChildCount() : m5505(i);
        ((C3329) this.f7815).m5511(childCount, z);
        if (z) {
            m5509(view);
        }
        AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
        if (abstractC3317M5249 != null) {
            if (!abstractC3317M5249.isTmpDetached() && !abstractC3317M5249.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC3317M5249);
                C5043.m9162(recyclerView.m5270(), sb);
                return;
            } else {
                if (RecyclerView.f7522) {
                    Log.d("RecyclerView", "reAttach " + abstractC3317M5249);
                }
                abstractC3317M5249.clearTmpDetachFlag();
            }
        } else if (RecyclerView.f7521) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strM5270 = recyclerView.m5270();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strM5270);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m5502(View view, int i, boolean z) {
        RecyclerView recyclerView = ((C3287) this.f7816).f7649;
        int childCount = i < 0 ? recyclerView.getChildCount() : m5505(i);
        ((C3329) this.f7815).m5511(childCount, z);
        if (z) {
            m5509(view);
        }
        recyclerView.addView(view, childCount);
        AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
        AbstractC3283 abstractC3283 = recyclerView.f7539;
        if (abstractC3283 != null && abstractC3317M5249 != null) {
            abstractC3283.mo5362(abstractC3317M5249);
        }
        ArrayList arrayList = recyclerView.f7527;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC3350) recyclerView.f7527.get(size)).mo5440(view);
            }
        }
    }

    @Override // p099.InterfaceC7866
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC5295 mo5503(C5270 c5270) {
        c5270.getClass();
        C5409 c5409 = (C5409) ((C5680) this.f7813).invoke(c5270);
        return c5409 != null ? c5409 : ((InterfaceC7866) ((C1171) this.f7816).f1441).mo5503(c5270);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public View m5504(int i) {
        return ((C3287) this.f7816).f7649.getChildAt(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int m5505(int i) {
        C3329 c3329 = (C3329) this.f7815;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C3287) this.f7816).f7649.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM5514 = i - (i2 - c3329.m5514(i2));
            if (iM5514 == 0) {
                while (c3329.m5512(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM5514;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m5506(int i) {
        C3287 c3287 = (C3287) this.f7816;
        int i2 = this.f7817;
        if (i2 == 1) {
            C6755.m11870("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i2 == 2) {
            C6755.m11870("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iM5505 = m5505(i);
            View childAt = c3287.f7649.getChildAt(iM5505);
            if (childAt == null) {
                this.f7817 = 0;
                this.f7813 = null;
                return;
            }
            this.f7817 = 1;
            this.f7813 = childAt;
            if (((C3329) this.f7815).m5517(iM5505)) {
                m5507(childAt);
            }
            c3287.m5393(iM5505);
            this.f7817 = 0;
            this.f7813 = null;
        } catch (Throwable th) {
            this.f7817 = 0;
            this.f7813 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m5507(View view) {
        if (((ArrayList) this.f7814).remove(view)) {
            C3287 c3287 = (C3287) this.f7816;
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
            if (abstractC3317M5249 != null) {
                abstractC3317M5249.onLeftHiddenState(c3287.f7649);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int m5508() {
        return ((C3287) this.f7816).f7649.getChildCount();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m5509(View view) {
        ((ArrayList) this.f7814).add(view);
        C3287 c3287 = (C3287) this.f7816;
        AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
        if (abstractC3317M5249 != null) {
            abstractC3317M5249.onEnteredHiddenState(c3287.f7649);
        }
    }

    public C3328(C3287 c3287) {
        this.f7818 = 0;
        this.f7817 = 0;
        this.f7816 = c3287;
        this.f7815 = new C3329();
        this.f7814 = new ArrayList();
    }
}
