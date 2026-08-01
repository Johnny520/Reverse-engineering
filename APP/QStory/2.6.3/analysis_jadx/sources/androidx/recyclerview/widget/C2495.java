package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4438;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4577;
import kotlin.reflect.jvm.internal.impl.storage.C4848;
import p081.InterfaceC7025;
import p083.C7041;
import p083.InterfaceC7037;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2495 implements InterfaceC7037 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f7468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f7469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f7470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7472;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7473;

    public C2495(C0325 c0325, InterfaceC4500 interfaceC4500, InterfaceC7025 interfaceC7025, int i) {
        this.f7473 = 1;
        c0325.getClass();
        interfaceC7025.getClass();
        this.f7471 = c0325;
        this.f7470 = interfaceC4500;
        this.f7472 = i;
        ArrayList typeParameters = interfaceC7025.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.f7469 = linkedHashMap;
        this.f7468 = ((C7041) ((C0325) this.f7471).f1095).f18894.m9578(new C1012(this, 28));
    }

    public String toString() {
        switch (this.f7473) {
            case 0:
                return ((C2496) this.f7470).toString() + ", hidden list:" + ((ArrayList) this.f7469).size();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int m4938() {
        return ((C2454) this.f7471).f7304.getChildCount() - ((ArrayList) this.f7469).size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public View m4939(int i) {
        return ((C2454) this.f7471).f7304.getChildAt(m4945(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m4940(int i) {
        int iM4945 = m4945(i);
        ((C2496) this.f7470).m4957(iM4945);
        RecyclerView recyclerView = ((C2454) this.f7471).f7304;
        View childAt = recyclerView.getChildAt(iM4945);
        if (childAt != null) {
            AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(childAt);
            if (abstractC2484M4689 != null) {
                if (abstractC2484M4689.isTmpDetached() && !abstractC2484M4689.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC2484M4689);
                    C4211.m8603(recyclerView.m4710(), sb);
                    return;
                } else {
                    if (RecyclerView.f7177) {
                        Log.d("RecyclerView", "tmpDetach " + abstractC2484M4689);
                    }
                    abstractC2484M4689.addFlags(256);
                }
            }
        } else if (RecyclerView.f7176) {
            throw new IllegalArgumentException("No view at offset " + iM4945 + recyclerView.m4710());
        }
        recyclerView.detachViewFromParent(iM4945);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4941(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((C2454) this.f7471).f7304;
        int childCount = i < 0 ? recyclerView.getChildCount() : m4945(i);
        ((C2496) this.f7470).m4951(childCount, z);
        if (z) {
            m4949(view);
        }
        AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(view);
        if (abstractC2484M4689 != null) {
            if (!abstractC2484M4689.isTmpDetached() && !abstractC2484M4689.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC2484M4689);
                C4211.m8603(recyclerView.m4710(), sb);
                return;
            } else {
                if (RecyclerView.f7177) {
                    Log.d("RecyclerView", "reAttach " + abstractC2484M4689);
                }
                abstractC2484M4689.clearTmpDetachFlag();
            }
        } else if (RecyclerView.f7176) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strM4710 = recyclerView.m4710();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strM4710);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m4942(View view, int i, boolean z) {
        RecyclerView recyclerView = ((C2454) this.f7471).f7304;
        int childCount = i < 0 ? recyclerView.getChildCount() : m4945(i);
        ((C2496) this.f7470).m4951(childCount, z);
        if (z) {
            m4949(view);
        }
        recyclerView.addView(view, childCount);
        AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(view);
        AbstractC2450 abstractC2450 = recyclerView.f7194;
        if (abstractC2450 != null && abstractC2484M4689 != null) {
            abstractC2450.mo4802(abstractC2484M4689);
        }
        ArrayList arrayList = recyclerView.f7182;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC2517) recyclerView.f7182.get(size)).mo4880(view);
            }
        }
    }

    @Override // p083.InterfaceC7037
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC4463 mo4943(C4438 c4438) {
        c4438.getClass();
        C4577 c4577 = (C4577) ((C4848) this.f7468).invoke(c4438);
        return c4577 != null ? c4577 : ((InterfaceC7037) ((C0325) this.f7471).f1096).mo4943(c4438);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public View m4944(int i) {
        return ((C2454) this.f7471).f7304.getChildAt(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int m4945(int i) {
        C2496 c2496 = (C2496) this.f7470;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C2454) this.f7471).f7304.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM4954 = i - (i2 - c2496.m4954(i2));
            if (iM4954 == 0) {
                while (c2496.m4952(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM4954;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m4946(int i) {
        C2454 c2454 = (C2454) this.f7471;
        int i2 = this.f7472;
        if (i2 == 1) {
            C5925.m11311("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i2 == 2) {
            C5925.m11311("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iM4945 = m4945(i);
            View childAt = c2454.f7304.getChildAt(iM4945);
            if (childAt == null) {
                this.f7472 = 0;
                this.f7468 = null;
                return;
            }
            this.f7472 = 1;
            this.f7468 = childAt;
            if (((C2496) this.f7470).m4957(iM4945)) {
                m4947(childAt);
            }
            c2454.m4833(iM4945);
            this.f7472 = 0;
            this.f7468 = null;
        } catch (Throwable th) {
            this.f7472 = 0;
            this.f7468 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m4947(View view) {
        if (((ArrayList) this.f7469).remove(view)) {
            C2454 c2454 = (C2454) this.f7471;
            AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(view);
            if (abstractC2484M4689 != null) {
                abstractC2484M4689.onLeftHiddenState(c2454.f7304);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int m4948() {
        return ((C2454) this.f7471).f7304.getChildCount();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m4949(View view) {
        ((ArrayList) this.f7469).add(view);
        C2454 c2454 = (C2454) this.f7471;
        AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(view);
        if (abstractC2484M4689 != null) {
            abstractC2484M4689.onEnteredHiddenState(c2454.f7304);
        }
    }

    public C2495(C2454 c2454) {
        this.f7473 = 0;
        this.f7472 = 0;
        this.f7471 = c2454;
        this.f7470 = new C2496();
        this.f7469 = new ArrayList();
    }
}
