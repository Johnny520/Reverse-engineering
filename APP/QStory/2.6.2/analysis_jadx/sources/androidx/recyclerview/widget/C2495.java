package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4437;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4576;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p081.InterfaceC7024;
import p083.C7040;
import p083.InterfaceC7036;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2495 implements InterfaceC7036 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f7467;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f7468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f7469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7472;

    public C2495(C0325 c0325, InterfaceC4499 interfaceC4499, InterfaceC7024 interfaceC7024, int i) {
        this.f7472 = 1;
        c0325.getClass();
        interfaceC7024.getClass();
        this.f7470 = c0325;
        this.f7469 = interfaceC4499;
        this.f7471 = i;
        ArrayList typeParameters = interfaceC7024.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.f7468 = linkedHashMap;
        this.f7467 = ((C7040) ((C0325) this.f7470).f1095).f18899.m9588(new C1012(this, 28));
    }

    public String toString() {
        switch (this.f7472) {
            case 0:
                return ((C2496) this.f7469).toString() + ", hidden list:" + ((ArrayList) this.f7468).size();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int m4928() {
        return ((C2454) this.f7470).f7303.getChildCount() - ((ArrayList) this.f7468).size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public View m4929(int i) {
        return ((C2454) this.f7470).f7303.getChildAt(m4935(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m4930(int i) {
        int iM4935 = m4935(i);
        ((C2496) this.f7469).m4947(iM4935);
        RecyclerView recyclerView = ((C2454) this.f7470).f7303;
        View childAt = recyclerView.getChildAt(iM4935);
        if (childAt != null) {
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(childAt);
            if (abstractC2484M4679 != null) {
                if (abstractC2484M4679.isTmpDetached() && !abstractC2484M4679.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC2484M4679);
                    C4210.m8613(recyclerView.m4700(), sb);
                    return;
                } else {
                    if (RecyclerView.f7176) {
                        Log.d("RecyclerView", "tmpDetach " + abstractC2484M4679);
                    }
                    abstractC2484M4679.addFlags(256);
                }
            }
        } else if (RecyclerView.f7175) {
            throw new IllegalArgumentException("No view at offset " + iM4935 + recyclerView.m4700());
        }
        recyclerView.detachViewFromParent(iM4935);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4931(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((C2454) this.f7470).f7303;
        int childCount = i < 0 ? recyclerView.getChildCount() : m4935(i);
        ((C2496) this.f7469).m4941(childCount, z);
        if (z) {
            m4939(view);
        }
        AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
        if (abstractC2484M4679 != null) {
            if (!abstractC2484M4679.isTmpDetached() && !abstractC2484M4679.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC2484M4679);
                C4210.m8613(recyclerView.m4700(), sb);
                return;
            } else {
                if (RecyclerView.f7176) {
                    Log.d("RecyclerView", "reAttach " + abstractC2484M4679);
                }
                abstractC2484M4679.clearTmpDetachFlag();
            }
        } else if (RecyclerView.f7175) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strM4700 = recyclerView.m4700();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strM4700);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m4932(View view, int i, boolean z) {
        RecyclerView recyclerView = ((C2454) this.f7470).f7303;
        int childCount = i < 0 ? recyclerView.getChildCount() : m4935(i);
        ((C2496) this.f7469).m4941(childCount, z);
        if (z) {
            m4939(view);
        }
        recyclerView.addView(view, childCount);
        AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
        AbstractC2450 abstractC2450 = recyclerView.f7193;
        if (abstractC2450 != null && abstractC2484M4679 != null) {
            abstractC2450.mo4792(abstractC2484M4679);
        }
        ArrayList arrayList = recyclerView.f7181;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC2517) recyclerView.f7181.get(size)).mo4870(view);
            }
        }
    }

    @Override // p083.InterfaceC7036
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC4462 mo4933(C4437 c4437) {
        c4437.getClass();
        C4576 c4576 = (C4576) ((C4847) this.f7467).invoke(c4437);
        return c4576 != null ? c4576 : ((InterfaceC7036) ((C0325) this.f7470).f1096).mo4933(c4437);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public View m4934(int i) {
        return ((C2454) this.f7470).f7303.getChildAt(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int m4935(int i) {
        C2496 c2496 = (C2496) this.f7469;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C2454) this.f7470).f7303.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM4944 = i - (i2 - c2496.m4944(i2));
            if (iM4944 == 0) {
                while (c2496.m4942(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM4944;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m4936(int i) {
        C2454 c2454 = (C2454) this.f7470;
        int i2 = this.f7471;
        if (i2 == 1) {
            C5919.m11250("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i2 == 2) {
            C5919.m11250("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iM4935 = m4935(i);
            View childAt = c2454.f7303.getChildAt(iM4935);
            if (childAt == null) {
                this.f7471 = 0;
                this.f7467 = null;
                return;
            }
            this.f7471 = 1;
            this.f7467 = childAt;
            if (((C2496) this.f7469).m4947(iM4935)) {
                m4937(childAt);
            }
            c2454.m4823(iM4935);
            this.f7471 = 0;
            this.f7467 = null;
        } catch (Throwable th) {
            this.f7471 = 0;
            this.f7467 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m4937(View view) {
        if (((ArrayList) this.f7468).remove(view)) {
            C2454 c2454 = (C2454) this.f7470;
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
            if (abstractC2484M4679 != null) {
                abstractC2484M4679.onLeftHiddenState(c2454.f7303);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int m4938() {
        return ((C2454) this.f7470).f7303.getChildCount();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m4939(View view) {
        ((ArrayList) this.f7468).add(view);
        C2454 c2454 = (C2454) this.f7470;
        AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
        if (abstractC2484M4679 != null) {
            abstractC2484M4679.onEnteredHiddenState(c2454.f7303);
        }
    }

    public C2495(C2454 c2454) {
        this.f7472 = 0;
        this.f7471 = 0;
        this.f7470 = c2454;
        this.f7469 = new C2496();
        this.f7468 = new ArrayList();
    }
}
