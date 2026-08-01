package p128;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.appcompat.widget.C0188;
import androidx.collection.C0257;
import androidx.collection.C0263;
import androidx.compose.animation.core.C0325;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2281;
import io.ktor.client.plugins.AbstractC3932;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p075.C6957;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7482 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC7484[] f20257;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ArrayList f20258;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ArrayList f20259;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final Animator[] f20251 = new Animator[0];

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final int[] f20253 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C6957 f20252 = new C6957(3);

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final ThreadLocal f20250 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f20275 = getClass().getName();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f20273 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f20274 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public TimeInterpolator f20268 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ArrayList f20267 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f20271 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C0325 f20272 = new C0325(23);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C0325 f20269 = new C0325(23);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C7466 f20270 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int[] f20260 = f20253;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final ArrayList f20256 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Animator[] f20255 = f20251;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f20266 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f20265 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f20264 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public AbstractC7482 f20263 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public ArrayList f20262 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public ArrayList f20261 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C6957 f20254 = f20252;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12675(C0325 c0325, View view, C7468 c7468) {
        C0257 c0257 = (C0257) c0325.f1095;
        C0257 c02572 = (C0257) c0325.f1093;
        SparseArray sparseArray = (SparseArray) c0325.f1096;
        C0263 c0263 = (C0263) c0325.f1094;
        c0257.put(view, c7468);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (c02572.containsKey(transitionName)) {
                c02572.put(transitionName, null);
            } else {
                c02572.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0263.m824(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0263.m822(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) c0263.m825(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c0263.m822(null, itemIdAtPosition);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m12676(C7468 c7468, C7468 c74682, String str) {
        Object obj = c7468.f20215.get(str);
        Object obj2 = c74682.f20215.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static C0257 m12677() {
        ThreadLocal threadLocal = f20250;
        C0257 c0257 = (C0257) threadLocal.get();
        if (c0257 != null) {
            return c0257;
        }
        C0257 c02572 = new C0257(0);
        threadLocal.set(c02572);
        return c02572;
    }

    public void cancel() {
        ArrayList arrayList = this.f20256;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f20255);
        this.f20255 = f20251;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f20255 = animatorArr;
        m12678(this, InterfaceC7481.f20248);
    }

    public final String toString() {
        return mo12643("");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public String mo12643(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f20274 != -1) {
            sb.append("dur(");
            sb.append(this.f20274);
            sb.append(") ");
        }
        if (this.f20273 != -1) {
            sb.append("dly(");
            sb.append(this.f20273);
            sb.append(") ");
        }
        if (this.f20268 != null) {
            sb.append("interp(");
            sb.append(this.f20268);
            sb.append(") ");
        }
        ArrayList arrayList = this.f20267;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20271;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public void mo12645(long j) {
        this.f20274 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo12646() {
        m12679();
        C0257 c0257M12677 = m12677();
        for (Animator animator : this.f20261) {
            if (c0257M12677.containsKey(animator)) {
                m12679();
                if (animator != null) {
                    animator.addListener(new C2281(this, c0257M12677));
                    long j = this.f20274;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f20273;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f20268;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0188(this, 3));
                    animator.start();
                }
            }
        }
        this.f20261.clear();
        m12685();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo12647(View view) {
        if (this.f20265) {
            if (!this.f20264) {
                ArrayList arrayList = this.f20256;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f20255);
                this.f20255 = f20251;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f20255 = animatorArr;
                m12678(this, InterfaceC7481.f20245);
            }
            this.f20265 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public AbstractC7482 mo12648(InterfaceC7484 interfaceC7484) {
        AbstractC7482 abstractC7482;
        ArrayList arrayList = this.f20262;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC7484) && (abstractC7482 = this.f20263) != null) {
                abstractC7482.mo12648(interfaceC7484);
            }
            if (this.f20262.size() == 0) {
                this.f20262 = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo12649(View view) {
        if (this.f20264) {
            return;
        }
        ArrayList arrayList = this.f20256;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f20255);
        this.f20255 = f20251;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f20255 = animatorArr;
        m12678(this, InterfaceC7481.f20246);
        this.f20265 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m12678(AbstractC7482 abstractC7482, InterfaceC7481 interfaceC7481) {
        AbstractC7482 abstractC74822 = this.f20263;
        if (abstractC74822 != null) {
            abstractC74822.m12678(abstractC7482, interfaceC7481);
        }
        ArrayList arrayList = this.f20262;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f20262.size();
        InterfaceC7484[] interfaceC7484Arr = this.f20257;
        if (interfaceC7484Arr == null) {
            interfaceC7484Arr = new InterfaceC7484[size];
        }
        this.f20257 = null;
        InterfaceC7484[] interfaceC7484Arr2 = (InterfaceC7484[]) this.f20262.toArray(interfaceC7484Arr);
        for (int i = 0; i < size; i++) {
            interfaceC7481.mo11762(interfaceC7484Arr2[i], abstractC7482);
            interfaceC7484Arr2[i] = null;
        }
        this.f20257 = interfaceC7484Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m12679() {
        if (this.f20266 == 0) {
            m12678(this, InterfaceC7481.f20249);
            this.f20264 = false;
        }
        this.f20266++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public void mo12650(long j) {
        this.f20273 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public void mo12652(C6957 c6957) {
        if (c6957 == null) {
            this.f20254 = f20252;
        } else {
            this.f20254 = c6957;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public void mo12653(TimeInterpolator timeInterpolator) {
        this.f20268 = timeInterpolator;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo12634(C7468 c7468);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12680(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C7468 c7468 = new C7468(view);
            if (z) {
                mo12634(c7468);
            } else {
                mo12635(c7468);
            }
            c7468.f20213.add(this);
            mo12655(c7468);
            if (z) {
                m12675(this.f20272, view, c7468);
            } else {
                m12675(this.f20269, view, c7468);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m12680(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo12635(C7468 c7468);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m12681(InterfaceC7484 interfaceC7484) {
        if (this.f20262 == null) {
            this.f20262 = new ArrayList();
        }
        this.f20262.add(interfaceC7484);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7468 m12682(View view, boolean z) {
        C7466 c7466 = this.f20270;
        if (c7466 != null) {
            return c7466.m12682(view, z);
        }
        return (C7468) ((C0257) (z ? this.f20272 : this.f20269).f1095).get(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public String[] mo12636() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m12683(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f20267;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20271;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public boolean mo12673(C7468 c7468, C7468 c74682) {
        if (c7468 != null && c74682 != null) {
            String[] strArrMo12636 = mo12636();
            if (strArrMo12636 != null) {
                for (String str : strArrMo12636) {
                    if (m12676(c7468, c74682, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c7468.f20215.keySet().iterator();
                while (it.hasNext()) {
                    if (m12676(c7468, c74682, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo12656(ViewGroup viewGroup, C0325 c0325, C0325 c03252, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        C7468 c7468;
        Animator animator;
        C7468 c74682;
        C0257 c0257M12677 = m12677();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m12684().getClass();
        int i3 = 0;
        while (i3 < size) {
            C7468 c74683 = (C7468) arrayList.get(i3);
            C7468 c74684 = (C7468) arrayList2.get(i3);
            if (c74683 != null && !c74683.f20213.contains(this)) {
                c74683 = null;
            }
            if (c74684 != null && !c74684.f20213.contains(this)) {
                c74684 = null;
            }
            if ((c74683 != null || c74684 != null) && (c74683 == null || c74684 == null || mo12673(c74683, c74684))) {
                Animator animatorMo12637 = mo12637(viewGroup, c74683, c74684);
                if (animatorMo12637 != null) {
                    String str = this.f20275;
                    if (c74684 != null) {
                        view = c74684.f20214;
                        String[] strArrMo12636 = mo12636();
                        if (strArrMo12636 != null && strArrMo12636.length > 0) {
                            c74682 = new C7468(view);
                            C7468 c74685 = (C7468) ((C0257) c03252.f1095).get(view);
                            i = size;
                            if (c74685 != null) {
                                int i4 = 0;
                                while (i4 < strArrMo12636.length) {
                                    String str2 = strArrMo12636[i4];
                                    int i5 = i3;
                                    c74682.f20215.put(str2, c74685.f20215.get(str2));
                                    i4++;
                                    i3 = i5;
                                    c74685 = c74685;
                                }
                            }
                            i2 = i3;
                            int i6 = c0257M12677.f994;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorMo12637;
                                    break;
                                }
                                C7483 c7483 = (C7483) c0257M12677.get((Animator) c0257M12677.m861(i7));
                                if (c7483.f20279 != null && c7483.f20281 == view && c7483.f20280.equals(str) && c7483.f20279.equals(c74682)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorMo12637;
                            c74682 = null;
                        }
                        animatorMo12637 = animator;
                        c7468 = c74682;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c74683.f20214;
                        c7468 = null;
                    }
                    if (animatorMo12637 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C7483 c74832 = new C7483();
                        c74832.f20281 = view;
                        c74832.f20280 = str;
                        c74832.f20279 = c7468;
                        c74832.f20278 = windowId;
                        c74832.f20277 = this;
                        c74832.f20276 = animatorMo12637;
                        c0257M12677.put(animatorMo12637, c74832);
                        this.f20261.add(animatorMo12637);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                C7483 c74833 = (C7483) c0257M12677.get((Animator) this.f20261.get(sparseIntArray.keyAt(i8)));
                c74833.f20276.setStartDelay(c74833.f20276.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public Animator mo12637(ViewGroup viewGroup, C7468 c7468, C7468 c74682) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC7482 m12684() {
        C7466 c7466 = this.f20270;
        return c7466 != null ? c7466.m12684() : this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m12685() {
        int i = this.f20266 - 1;
        this.f20266 = i;
        if (i == 0) {
            m12678(this, InterfaceC7481.f20247);
            for (int i2 = 0; i2 < ((C0263) this.f20272.f1094).m827(); i2++) {
                View view = (View) ((C0263) this.f20272.f1094).m828(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C0263) this.f20269.f1094).m827(); i3++) {
                View view2 = (View) ((C0263) this.f20269.f1094).m828(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f20264 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r4 = r4.f20258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r4 = r4.f20259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (p128.C7468) r4.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p128.C7468 m12686(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            飘花落叶言子兰世哲楪苏.飘花落叶言子楪世苏哲兰 r0 = r4.f20270
            if (r0 == 0) goto L9
            飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲 r4 = r0.m12686(r5, r6)
            return r4
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f20259
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f20258
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲 r3 = (p128.C7468) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f20214
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r4 = r4.f20258
            goto L35
        L33:
            java.util.ArrayList r4 = r4.f20259
        L35:
            java.lang.Object r4 = r4.get(r2)
            飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲 r4 = (p128.C7468) r4
            return r4
        L3c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.AbstractC7482.m12686(android.view.View, boolean):飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12687(ViewGroup viewGroup, boolean z) {
        m12688(z);
        ArrayList arrayList = this.f20267;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20271;
        if (size <= 0 && arrayList2.size() <= 0) {
            m12680(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C7468 c7468 = new C7468(viewFindViewById);
                if (z) {
                    mo12634(c7468);
                } else {
                    mo12635(c7468);
                }
                c7468.f20213.add(this);
                mo12655(c7468);
                if (z) {
                    m12675(this.f20272, viewFindViewById, c7468);
                } else {
                    m12675(this.f20269, viewFindViewById, c7468);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C7468 c74682 = new C7468(view);
            if (z) {
                mo12634(c74682);
            } else {
                mo12635(c74682);
            }
            c74682.f20213.add(this);
            mo12655(c74682);
            if (z) {
                m12675(this.f20272, view, c74682);
            } else {
                m12675(this.f20269, view, c74682);
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public AbstractC7482 clone() {
        try {
            AbstractC7482 abstractC7482 = (AbstractC7482) super.clone();
            abstractC7482.f20261 = new ArrayList();
            abstractC7482.f20272 = new C0325(23);
            abstractC7482.f20269 = new C0325(23);
            abstractC7482.f20259 = null;
            abstractC7482.f20258 = null;
            abstractC7482.f20263 = this;
            abstractC7482.f20262 = null;
            return abstractC7482;
        } catch (CloneNotSupportedException e) {
            C5919.m11252(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12688(boolean z) {
        if (z) {
            ((C0257) this.f20272.f1095).clear();
            ((SparseArray) this.f20272.f1096).clear();
            ((C0263) this.f20272.f1094).m826();
        } else {
            ((C0257) this.f20269.f1095).clear();
            ((SparseArray) this.f20269.f1096).clear();
            ((C0263) this.f20269.f1094).m826();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public void mo12651() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo12654(AbstractC3932 abstractC3932) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo12655(C7468 c7468) {
    }
}
