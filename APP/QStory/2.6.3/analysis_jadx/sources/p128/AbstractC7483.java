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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p034.AbstractC6347;
import p075.C6958;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7483 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC7485[] f20252;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ArrayList f20253;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ArrayList f20254;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final Animator[] f20246 = new Animator[0];

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final int[] f20248 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C6958 f20247 = new C6958(3);

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final ThreadLocal f20245 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f20270 = getClass().getName();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f20268 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f20269 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public TimeInterpolator f20263 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ArrayList f20262 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f20266 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C0325 f20267 = new C0325(23);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C0325 f20264 = new C0325(23);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C7467 f20265 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int[] f20255 = f20248;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final ArrayList f20251 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Animator[] f20250 = f20246;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f20261 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f20260 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f20259 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public AbstractC7483 f20258 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public ArrayList f20257 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public ArrayList f20256 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C6958 f20249 = f20247;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12704(C0325 c0325, View view, C7469 c7469) {
        C0257 c0257 = (C0257) c0325.f1095;
        C0257 c02572 = (C0257) c0325.f1093;
        SparseArray sparseArray = (SparseArray) c0325.f1096;
        C0263 c0263 = (C0263) c0325.f1094;
        c0257.put(view, c7469);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC2270.f6594;
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
                if (c0263.m825(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0263.m823(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) c0263.m826(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c0263.m823(null, itemIdAtPosition);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m12705(C7469 c7469, C7469 c74692, String str) {
        Object obj = c7469.f20210.get(str);
        Object obj2 = c74692.f20210.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static C0257 m12706() {
        ThreadLocal threadLocal = f20245;
        C0257 c0257 = (C0257) threadLocal.get();
        if (c0257 != null) {
            return c0257;
        }
        C0257 c02572 = new C0257(0);
        threadLocal.set(c02572);
        return c02572;
    }

    public void cancel() {
        ArrayList arrayList = this.f20251;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f20250);
        this.f20250 = f20246;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f20250 = animatorArr;
        m12707(this, InterfaceC7482.f20243);
    }

    public final String toString() {
        return mo12670("");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public String mo12670(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f20269 != -1) {
            sb.append("dur(");
            sb.append(this.f20269);
            sb.append(") ");
        }
        if (this.f20268 != -1) {
            sb.append("dly(");
            sb.append(this.f20268);
            sb.append(") ");
        }
        if (this.f20263 != null) {
            sb.append("interp(");
            sb.append(this.f20263);
            sb.append(") ");
        }
        ArrayList arrayList = this.f20262;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20266;
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
    public void mo12672(long j) {
        this.f20269 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo12673() {
        m12708();
        C0257 c0257M12706 = m12706();
        for (Animator animator : this.f20256) {
            if (c0257M12706.containsKey(animator)) {
                m12708();
                if (animator != null) {
                    animator.addListener(new C2281(this, c0257M12706));
                    long j = this.f20269;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f20268;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f20263;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0188(this, 3));
                    animator.start();
                }
            }
        }
        this.f20256.clear();
        m12714();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo12674(View view) {
        if (this.f20260) {
            if (!this.f20259) {
                ArrayList arrayList = this.f20251;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f20250);
                this.f20250 = f20246;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f20250 = animatorArr;
                m12707(this, InterfaceC7482.f20240);
            }
            this.f20260 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public AbstractC7483 mo12675(InterfaceC7485 interfaceC7485) {
        AbstractC7483 abstractC7483;
        ArrayList arrayList = this.f20257;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC7485) && (abstractC7483 = this.f20258) != null) {
                abstractC7483.mo12675(interfaceC7485);
            }
            if (this.f20257.size() == 0) {
                this.f20257 = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo12676(View view) {
        if (this.f20259) {
            return;
        }
        ArrayList arrayList = this.f20251;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f20250);
        this.f20250 = f20246;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f20250 = animatorArr;
        m12707(this, InterfaceC7482.f20241);
        this.f20260 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m12707(AbstractC7483 abstractC7483, InterfaceC7482 interfaceC7482) {
        AbstractC7483 abstractC74832 = this.f20258;
        if (abstractC74832 != null) {
            abstractC74832.m12707(abstractC7483, interfaceC7482);
        }
        ArrayList arrayList = this.f20257;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f20257.size();
        InterfaceC7485[] interfaceC7485Arr = this.f20252;
        if (interfaceC7485Arr == null) {
            interfaceC7485Arr = new InterfaceC7485[size];
        }
        this.f20252 = null;
        InterfaceC7485[] interfaceC7485Arr2 = (InterfaceC7485[]) this.f20257.toArray(interfaceC7485Arr);
        for (int i = 0; i < size; i++) {
            interfaceC7482.mo11779(interfaceC7485Arr2[i], abstractC7483);
            interfaceC7485Arr2[i] = null;
        }
        this.f20252 = interfaceC7485Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m12708() {
        if (this.f20261 == 0) {
            m12707(this, InterfaceC7482.f20244);
            this.f20259 = false;
        }
        this.f20261++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public void mo12677(long j) {
        this.f20268 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public void mo12679(C6958 c6958) {
        if (c6958 == null) {
            this.f20249 = f20247;
        } else {
            this.f20249 = c6958;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public void mo12680(TimeInterpolator timeInterpolator) {
        this.f20263 = timeInterpolator;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo12661(C7469 c7469);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12709(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C7469 c7469 = new C7469(view);
            if (z) {
                mo12661(c7469);
            } else {
                mo12662(c7469);
            }
            c7469.f20208.add(this);
            mo12682(c7469);
            if (z) {
                m12704(this.f20267, view, c7469);
            } else {
                m12704(this.f20264, view, c7469);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m12709(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo12662(C7469 c7469);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m12710(InterfaceC7485 interfaceC7485) {
        if (this.f20257 == null) {
            this.f20257 = new ArrayList();
        }
        this.f20257.add(interfaceC7485);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7469 m12711(View view, boolean z) {
        C7467 c7467 = this.f20265;
        if (c7467 != null) {
            return c7467.m12711(view, z);
        }
        return (C7469) ((C0257) (z ? this.f20267 : this.f20264).f1095).get(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public String[] mo12663() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m12712(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f20262;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20266;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public boolean mo12702(C7469 c7469, C7469 c74692) {
        if (c7469 != null && c74692 != null) {
            String[] strArrMo12663 = mo12663();
            if (strArrMo12663 != null) {
                for (String str : strArrMo12663) {
                    if (m12705(c7469, c74692, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c7469.f20210.keySet().iterator();
                while (it.hasNext()) {
                    if (m12705(c7469, c74692, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo12683(ViewGroup viewGroup, C0325 c0325, C0325 c03252, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        C7469 c7469;
        Animator animator;
        C7469 c74692;
        C0257 c0257M12706 = m12706();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m12713().getClass();
        int i3 = 0;
        while (i3 < size) {
            C7469 c74693 = (C7469) arrayList.get(i3);
            C7469 c74694 = (C7469) arrayList2.get(i3);
            if (c74693 != null && !c74693.f20208.contains(this)) {
                c74693 = null;
            }
            if (c74694 != null && !c74694.f20208.contains(this)) {
                c74694 = null;
            }
            if ((c74693 != null || c74694 != null) && (c74693 == null || c74694 == null || mo12702(c74693, c74694))) {
                Animator animatorMo12664 = mo12664(viewGroup, c74693, c74694);
                if (animatorMo12664 != null) {
                    String str = this.f20270;
                    if (c74694 != null) {
                        view = c74694.f20209;
                        String[] strArrMo12663 = mo12663();
                        if (strArrMo12663 != null && strArrMo12663.length > 0) {
                            c74692 = new C7469(view);
                            C7469 c74695 = (C7469) ((C0257) c03252.f1095).get(view);
                            i = size;
                            if (c74695 != null) {
                                int i4 = 0;
                                while (i4 < strArrMo12663.length) {
                                    String str2 = strArrMo12663[i4];
                                    int i5 = i3;
                                    c74692.f20210.put(str2, c74695.f20210.get(str2));
                                    i4++;
                                    i3 = i5;
                                    c74695 = c74695;
                                }
                            }
                            i2 = i3;
                            int i6 = c0257M12706.f994;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorMo12664;
                                    break;
                                }
                                C7484 c7484 = (C7484) c0257M12706.get((Animator) c0257M12706.m862(i7));
                                if (c7484.f20274 != null && c7484.f20276 == view && c7484.f20275.equals(str) && c7484.f20274.equals(c74692)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorMo12664;
                            c74692 = null;
                        }
                        animatorMo12664 = animator;
                        c7469 = c74692;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c74693.f20209;
                        c7469 = null;
                    }
                    if (animatorMo12664 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C7484 c74842 = new C7484();
                        c74842.f20276 = view;
                        c74842.f20275 = str;
                        c74842.f20274 = c7469;
                        c74842.f20273 = windowId;
                        c74842.f20272 = this;
                        c74842.f20271 = animatorMo12664;
                        c0257M12706.put(animatorMo12664, c74842);
                        this.f20256.add(animatorMo12664);
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
                C7484 c74843 = (C7484) c0257M12706.get((Animator) this.f20256.get(sparseIntArray.keyAt(i8)));
                c74843.f20271.setStartDelay(c74843.f20271.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public Animator mo12664(ViewGroup viewGroup, C7469 c7469, C7469 c74692) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC7483 m12713() {
        C7467 c7467 = this.f20265;
        return c7467 != null ? c7467.m12713() : this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m12714() {
        int i = this.f20261 - 1;
        this.f20261 = i;
        if (i == 0) {
            m12707(this, InterfaceC7482.f20242);
            for (int i2 = 0; i2 < ((C0263) this.f20267.f1094).m828(); i2++) {
                View view = (View) ((C0263) this.f20267.f1094).m829(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C0263) this.f20264.f1094).m828(); i3++) {
                View view2 = (View) ((C0263) this.f20264.f1094).m829(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f20259 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r4 = r4.f20253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r4 = r4.f20254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (p128.C7469) r4.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p128.C7469 m12715(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            飘花落叶言子兰世哲楪苏.飘花落叶言子楪世苏哲兰 r0 = r4.f20265
            if (r0 == 0) goto L9
            飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲 r4 = r0.m12715(r5, r6)
            return r4
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f20254
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f20253
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲 r3 = (p128.C7469) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f20209
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
            java.util.ArrayList r4 = r4.f20253
            goto L35
        L33:
            java.util.ArrayList r4 = r4.f20254
        L35:
            java.lang.Object r4 = r4.get(r2)
            飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲 r4 = (p128.C7469) r4
            return r4
        L3c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.AbstractC7483.m12715(android.view.View, boolean):飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12716(ViewGroup viewGroup, boolean z) {
        m12717(z);
        ArrayList arrayList = this.f20262;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20266;
        if (size <= 0 && arrayList2.size() <= 0) {
            m12709(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C7469 c7469 = new C7469(viewFindViewById);
                if (z) {
                    mo12661(c7469);
                } else {
                    mo12662(c7469);
                }
                c7469.f20208.add(this);
                mo12682(c7469);
                if (z) {
                    m12704(this.f20267, viewFindViewById, c7469);
                } else {
                    m12704(this.f20264, viewFindViewById, c7469);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C7469 c74692 = new C7469(view);
            if (z) {
                mo12661(c74692);
            } else {
                mo12662(c74692);
            }
            c74692.f20208.add(this);
            mo12682(c74692);
            if (z) {
                m12704(this.f20267, view, c74692);
            } else {
                m12704(this.f20264, view, c74692);
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public AbstractC7483 clone() {
        try {
            AbstractC7483 abstractC7483 = (AbstractC7483) super.clone();
            abstractC7483.f20256 = new ArrayList();
            abstractC7483.f20267 = new C0325(23);
            abstractC7483.f20264 = new C0325(23);
            abstractC7483.f20254 = null;
            abstractC7483.f20253 = null;
            abstractC7483.f20258 = this;
            abstractC7483.f20257 = null;
            return abstractC7483;
        } catch (CloneNotSupportedException e) {
            C5925.m11313(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12717(boolean z) {
        if (z) {
            ((C0257) this.f20267.f1095).clear();
            ((SparseArray) this.f20267.f1096).clear();
            ((C0263) this.f20267.f1094).m827();
        } else {
            ((C0257) this.f20264.f1095).clear();
            ((SparseArray) this.f20264.f1096).clear();
            ((C0263) this.f20264.f1094).m827();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public void mo12678() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo12681(AbstractC6347 abstractC6347) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo12682(C7469 c7469) {
    }
}
