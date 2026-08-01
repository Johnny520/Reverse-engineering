package p144;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.appcompat.widget.C1035;
import androidx.collection.C1104;
import androidx.collection.C1110;
import androidx.compose.animation.core.C1171;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3114;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p050.AbstractC7176;
import p091.C7787;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8312 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC8314[] f20597;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ArrayList f20598;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ArrayList f20599;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final Animator[] f20591 = new Animator[0];

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final int[] f20593 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C7787 f20592 = new C7787(3);

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final ThreadLocal f20590 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f20615 = getClass().getName();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f20613 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f20614 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public TimeInterpolator f20608 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ArrayList f20607 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f20611 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C1171 f20612 = new C1171(23);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C1171 f20609 = new C1171(23);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C8296 f20610 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int[] f20600 = f20593;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final ArrayList f20596 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Animator[] f20595 = f20591;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f20606 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f20605 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f20604 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public AbstractC8312 f20603 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public ArrayList f20602 = null;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public ArrayList f20601 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C7787 f20594 = f20592;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13263(C1171 c1171, View view, C8298 c8298) {
        C1104 c1104 = (C1104) c1171.f1440;
        C1104 c11042 = (C1104) c1171.f1438;
        SparseArray sparseArray = (SparseArray) c1171.f1441;
        C1110 c1110 = (C1110) c1171.f1439;
        c1104.put(view, c8298);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (c11042.containsKey(transitionName)) {
                c11042.put(transitionName, null);
            } else {
                c11042.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1110.m1385(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1110.m1383(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) c1110.m1386(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1110.m1383(null, itemIdAtPosition);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m13264(C8298 c8298, C8298 c82982, String str) {
        Object obj = c8298.f20555.get(str);
        Object obj2 = c82982.f20555.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static C1104 m13265() {
        ThreadLocal threadLocal = f20590;
        C1104 c1104 = (C1104) threadLocal.get();
        if (c1104 != null) {
            return c1104;
        }
        C1104 c11042 = new C1104(0);
        threadLocal.set(c11042);
        return c11042;
    }

    public void cancel() {
        ArrayList arrayList = this.f20596;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f20595);
        this.f20595 = f20591;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f20595 = animatorArr;
        m13266(this, InterfaceC8311.f20588);
    }

    public final String toString() {
        return mo13229("");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public String mo13229(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f20614 != -1) {
            sb.append("dur(");
            sb.append(this.f20614);
            sb.append(") ");
        }
        if (this.f20613 != -1) {
            sb.append("dly(");
            sb.append(this.f20613);
            sb.append(") ");
        }
        if (this.f20608 != null) {
            sb.append("interp(");
            sb.append(this.f20608);
            sb.append(") ");
        }
        ArrayList arrayList = this.f20607;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20611;
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
    public void mo13231(long j) {
        this.f20614 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo13232() {
        m13267();
        C1104 c1104M13265 = m13265();
        for (Animator animator : this.f20601) {
            if (c1104M13265.containsKey(animator)) {
                m13267();
                if (animator != null) {
                    animator.addListener(new C3114(this, c1104M13265));
                    long j = this.f20614;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f20613;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f20608;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C1035(this, 3));
                    animator.start();
                }
            }
        }
        this.f20601.clear();
        m13273();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo13233(View view) {
        if (this.f20605) {
            if (!this.f20604) {
                ArrayList arrayList = this.f20596;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f20595);
                this.f20595 = f20591;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f20595 = animatorArr;
                m13266(this, InterfaceC8311.f20585);
            }
            this.f20605 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public AbstractC8312 mo13234(InterfaceC8314 interfaceC8314) {
        AbstractC8312 abstractC8312;
        ArrayList arrayList = this.f20602;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC8314) && (abstractC8312 = this.f20603) != null) {
                abstractC8312.mo13234(interfaceC8314);
            }
            if (this.f20602.size() == 0) {
                this.f20602 = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo13235(View view) {
        if (this.f20604) {
            return;
        }
        ArrayList arrayList = this.f20596;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f20595);
        this.f20595 = f20591;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f20595 = animatorArr;
        m13266(this, InterfaceC8311.f20586);
        this.f20605 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m13266(AbstractC8312 abstractC8312, InterfaceC8311 interfaceC8311) {
        AbstractC8312 abstractC83122 = this.f20603;
        if (abstractC83122 != null) {
            abstractC83122.m13266(abstractC8312, interfaceC8311);
        }
        ArrayList arrayList = this.f20602;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f20602.size();
        InterfaceC8314[] interfaceC8314Arr = this.f20597;
        if (interfaceC8314Arr == null) {
            interfaceC8314Arr = new InterfaceC8314[size];
        }
        this.f20597 = null;
        InterfaceC8314[] interfaceC8314Arr2 = (InterfaceC8314[]) this.f20602.toArray(interfaceC8314Arr);
        for (int i = 0; i < size; i++) {
            interfaceC8311.mo12338(interfaceC8314Arr2[i], abstractC8312);
            interfaceC8314Arr2[i] = null;
        }
        this.f20597 = interfaceC8314Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m13267() {
        if (this.f20606 == 0) {
            m13266(this, InterfaceC8311.f20589);
            this.f20604 = false;
        }
        this.f20606++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public void mo13236(long j) {
        this.f20613 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public void mo13238(C7787 c7787) {
        if (c7787 == null) {
            this.f20594 = f20592;
        } else {
            this.f20594 = c7787;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public void mo13239(TimeInterpolator timeInterpolator) {
        this.f20608 = timeInterpolator;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo13220(C8298 c8298);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13268(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C8298 c8298 = new C8298(view);
            if (z) {
                mo13220(c8298);
            } else {
                mo13221(c8298);
            }
            c8298.f20553.add(this);
            mo13241(c8298);
            if (z) {
                m13263(this.f20612, view, c8298);
            } else {
                m13263(this.f20609, view, c8298);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m13268(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo13221(C8298 c8298);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m13269(InterfaceC8314 interfaceC8314) {
        if (this.f20602 == null) {
            this.f20602 = new ArrayList();
        }
        this.f20602.add(interfaceC8314);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8298 m13270(View view, boolean z) {
        C8296 c8296 = this.f20610;
        if (c8296 != null) {
            return c8296.m13270(view, z);
        }
        return (C8298) ((C1104) (z ? this.f20612 : this.f20609).f1440).get(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public String[] mo13222() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m13271(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f20607;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20611;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public boolean mo13261(C8298 c8298, C8298 c82982) {
        if (c8298 != null && c82982 != null) {
            String[] strArrMo13222 = mo13222();
            if (strArrMo13222 != null) {
                for (String str : strArrMo13222) {
                    if (m13264(c8298, c82982, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c8298.f20555.keySet().iterator();
                while (it.hasNext()) {
                    if (m13264(c8298, c82982, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo13242(ViewGroup viewGroup, C1171 c1171, C1171 c11712, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        C8298 c8298;
        Animator animator;
        C8298 c82982;
        C1104 c1104M13265 = m13265();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m13272().getClass();
        int i3 = 0;
        while (i3 < size) {
            C8298 c82983 = (C8298) arrayList.get(i3);
            C8298 c82984 = (C8298) arrayList2.get(i3);
            if (c82983 != null && !c82983.f20553.contains(this)) {
                c82983 = null;
            }
            if (c82984 != null && !c82984.f20553.contains(this)) {
                c82984 = null;
            }
            if ((c82983 != null || c82984 != null) && (c82983 == null || c82984 == null || mo13261(c82983, c82984))) {
                Animator animatorMo13223 = mo13223(viewGroup, c82983, c82984);
                if (animatorMo13223 != null) {
                    String str = this.f20615;
                    if (c82984 != null) {
                        view = c82984.f20554;
                        String[] strArrMo13222 = mo13222();
                        if (strArrMo13222 != null && strArrMo13222.length > 0) {
                            c82982 = new C8298(view);
                            C8298 c82985 = (C8298) ((C1104) c11712.f1440).get(view);
                            i = size;
                            if (c82985 != null) {
                                int i4 = 0;
                                while (i4 < strArrMo13222.length) {
                                    String str2 = strArrMo13222[i4];
                                    int i5 = i3;
                                    c82982.f20555.put(str2, c82985.f20555.get(str2));
                                    i4++;
                                    i3 = i5;
                                    c82985 = c82985;
                                }
                            }
                            i2 = i3;
                            int i6 = c1104M13265.f1339;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorMo13223;
                                    break;
                                }
                                C8313 c8313 = (C8313) c1104M13265.get((Animator) c1104M13265.m1422(i7));
                                if (c8313.f20619 != null && c8313.f20621 == view && c8313.f20620.equals(str) && c8313.f20619.equals(c82982)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorMo13223;
                            c82982 = null;
                        }
                        animatorMo13223 = animator;
                        c8298 = c82982;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c82983.f20554;
                        c8298 = null;
                    }
                    if (animatorMo13223 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C8313 c83132 = new C8313();
                        c83132.f20621 = view;
                        c83132.f20620 = str;
                        c83132.f20619 = c8298;
                        c83132.f20618 = windowId;
                        c83132.f20617 = this;
                        c83132.f20616 = animatorMo13223;
                        c1104M13265.put(animatorMo13223, c83132);
                        this.f20601.add(animatorMo13223);
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
                C8313 c83133 = (C8313) c1104M13265.get((Animator) this.f20601.get(sparseIntArray.keyAt(i8)));
                c83133.f20616.setStartDelay(c83133.f20616.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public Animator mo13223(ViewGroup viewGroup, C8298 c8298, C8298 c82982) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC8312 m13272() {
        C8296 c8296 = this.f20610;
        return c8296 != null ? c8296.m13272() : this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m13273() {
        int i = this.f20606 - 1;
        this.f20606 = i;
        if (i == 0) {
            m13266(this, InterfaceC8311.f20587);
            for (int i2 = 0; i2 < ((C1110) this.f20612.f1439).m1388(); i2++) {
                View view = (View) ((C1110) this.f20612.f1439).m1389(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C1110) this.f20609.f1439).m1388(); i3++) {
                View view2 = (View) ((C1110) this.f20609.f1439).m1389(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f20604 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r4 = r4.f20598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r4 = r4.f20599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (p144.C8298) r4.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C8298 m13274(View view, boolean z) {
        C8296 c8296 = this.f20610;
        if (c8296 != null) {
            return c8296.m13274(view, z);
        }
        ArrayList arrayList = z ? this.f20599 : this.f20598;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C8298 c8298 = (C8298) arrayList.get(i);
            if (c8298 == null) {
                return null;
            }
            if (c8298.f20554 == view) {
                break;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13275(ViewGroup viewGroup, boolean z) {
        m13276(z);
        ArrayList arrayList = this.f20607;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20611;
        if (size <= 0 && arrayList2.size() <= 0) {
            m13268(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C8298 c8298 = new C8298(viewFindViewById);
                if (z) {
                    mo13220(c8298);
                } else {
                    mo13221(c8298);
                }
                c8298.f20553.add(this);
                mo13241(c8298);
                if (z) {
                    m13263(this.f20612, viewFindViewById, c8298);
                } else {
                    m13263(this.f20609, viewFindViewById, c8298);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C8298 c82982 = new C8298(view);
            if (z) {
                mo13220(c82982);
            } else {
                mo13221(c82982);
            }
            c82982.f20553.add(this);
            mo13241(c82982);
            if (z) {
                m13263(this.f20612, view, c82982);
            } else {
                m13263(this.f20609, view, c82982);
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public AbstractC8312 clone() {
        try {
            AbstractC8312 abstractC8312 = (AbstractC8312) super.clone();
            abstractC8312.f20601 = new ArrayList();
            abstractC8312.f20612 = new C1171(23);
            abstractC8312.f20609 = new C1171(23);
            abstractC8312.f20599 = null;
            abstractC8312.f20598 = null;
            abstractC8312.f20603 = this;
            abstractC8312.f20602 = null;
            return abstractC8312;
        } catch (CloneNotSupportedException e) {
            C6755.m11872(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13276(boolean z) {
        if (z) {
            ((C1104) this.f20612.f1440).clear();
            ((SparseArray) this.f20612.f1441).clear();
            ((C1110) this.f20612.f1439).m1387();
        } else {
            ((C1104) this.f20609.f1440).clear();
            ((SparseArray) this.f20609.f1441).clear();
            ((C1110) this.f20609.f1439).m1387();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public void mo13237() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo13240(AbstractC7176 abstractC7176) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo13241(C8298 c8298) {
    }
}
