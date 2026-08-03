package Yue;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C8770;
import java.util.HashMap;

/* JADX INFO: renamed from: Yue.ۥ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4375 implements InterfaceC6837 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f8975 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f8976 = "DesignTool";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final HashMap<Pair<Integer, Integer>, String> f8977;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final HashMap<String, String> f8978;

    /* JADX INFO: renamed from: ۥ */
    public final C6273 f848;

    /* JADX INFO: renamed from: ۥ۟ */
    public C6283 f849;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String f8979 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String f8980 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f8981 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f8982 = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> map = new HashMap<>();
        f8977 = map;
        HashMap<String, String> map2 = new HashMap<>();
        f8978 = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public C4375(C6273 c6273) {
        this.f848 = c6273;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m12662(int i, C8770 c8770, View view, HashMap<String, String> map, int i2, int i3) {
        String str = f8977.get(Pair.create(Integer.valueOf(i2), Integer.valueOf(i3)));
        String str2 = map.get(str);
        if (str2 != null) {
            String str3 = f8978.get(str);
            c8770.m29376(view.getId(), i2, Integer.parseInt(str2), i3, str3 != null ? m12663(i, map.get(str3)) : 0);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m12663(int i, String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, iIndexOf)).intValue() * i) / 160.0f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m12664(int i, C8770 c8770, View view, HashMap<String, String> map) {
        String str = map.get("layout_editor_absoluteX");
        if (str != null) {
            c8770.m29428(view.getId(), m12663(i, str));
        }
        String str2 = map.get("layout_editor_absoluteY");
        if (str2 != null) {
            c8770.m29429(view.getId(), m12663(i, str2));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m12665(C8770 c8770, View view, HashMap<String, String> map, int i) {
        String str = map.get(i == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i == 0) {
                c8770.m29437(view.getId(), Float.parseFloat(str));
            } else if (i == 1) {
                c8770.m29457(view.getId(), Float.parseFloat(str));
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m12666(int i, C8770 c8770, View view, HashMap<String, String> map, int i2) {
        String str = map.get(i2 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iM12663 = !str.equalsIgnoreCase("wrap_content") ? m12663(i, str) : -2;
            if (i2 == 0) {
                c8770.m29387(view.getId(), iM12663);
            } else {
                c8770.m29380(view.getId(), iM12663);
            }
        }
    }

    @Override // Yue.InterfaceC6837
    /* JADX INFO: renamed from: ۥ */
    public long mo1332() {
        return this.f848.getTransitionTimeMs();
    }

    @Override // Yue.InterfaceC6837
    /* JADX INFO: renamed from: ۥ۟ */
    public int mo1333(int i, String str, Object obj, float[] fArr, int i2, float[] fArr2, int i3) {
        C6269 c6269;
        View view = (View) obj;
        if (i != 0) {
            C6273 c6273 = this.f848;
            if (c6273.f15620 == null || view == null || (c6269 = c6273.f15629.get(view)) == null) {
                return -1;
            }
        } else {
            c6269 = null;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            int iM19485 = this.f848.f15620.m19485() / 16;
            c6269.m19312(fArr2, iM19485);
            return iM19485;
        }
        if (i == 2) {
            int iM194852 = this.f848.f15620.m19485() / 16;
            c6269.m19311(fArr2, null);
            return iM194852;
        }
        if (i != 3) {
            return -1;
        }
        this.f848.f15620.m19485();
        return c6269.m19316(str, fArr2, i3);
    }

    @Override // Yue.InterfaceC6837
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo12667(Object obj, int i, int i2, float f, float f2) {
        C6273 c6273 = this.f848;
        if (c6273.f15620 == null) {
            return false;
        }
        C6269 c6269 = c6273.f15629.get(obj);
        C6273 c62732 = this.f848;
        int i3 = (int) (c62732.f15632 * 100.0f);
        if (c6269 == null) {
            return false;
        }
        View view = (View) obj;
        if (!c62732.f15620.m19504(view, i3)) {
            return false;
        }
        float fM19323 = c6269.m19323(2, f, f2);
        float fM193232 = c6269.m19323(5, f, f2);
        this.f848.f15620.m19520(view, i3, "motion:percentX", Float.valueOf(fM19323));
        this.f848.f15620.m19520(view, i3, "motion:percentY", Float.valueOf(fM193232));
        this.f848.m19408();
        this.f848.m19388(true);
        this.f848.invalidate();
        return true;
    }

    @Override // Yue.InterfaceC6837
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo12668(float f) {
        C6273 c6273 = this.f848;
        if (c6273.f15620 == null) {
            c6273.f15620 = this.f849;
        }
        c6273.setProgress(f);
        this.f848.m19388(true);
        this.f848.requestLayout();
        this.f848.invalidate();
    }

    @Override // Yue.InterfaceC6837
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Boolean mo12669(Object obj, Object obj2, float f, float f2, String[] strArr, float[] fArr) {
        if (!(obj instanceof AbstractC5640)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        this.f848.f15629.get(view).m19333(view, (AbstractC5640) obj, f, f2, strArr, fArr);
        this.f848.m19408();
        this.f848.f15637 = true;
        return Boolean.TRUE;
    }

    @Override // Yue.InterfaceC6837
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo12670(Object obj, int i, String str, Object obj2) {
        C6283 c6283 = this.f848.f15620;
        if (c6283 != null) {
            c6283.m19520((View) obj, i, str, obj2);
            C6273 c6273 = this.f848;
            c6273.f15635 = i / 100.0f;
            c6273.f15633 = 0.0f;
            c6273.m19408();
            this.f848.m19388(true);
        }
    }

    @Override // Yue.InterfaceC6837
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo12671(int i, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap map = (HashMap) obj2;
        int iM19403 = this.f848.m19403(str);
        C8770 c8770M19480 = this.f848.f15620.m19480(iM19403);
        if (c8770M19480 == null) {
            return;
        }
        c8770M19480.m29369(view.getId());
        m12666(i, c8770M19480, view, map, 0);
        m12666(i, c8770M19480, view, map, 1);
        m12662(i, c8770M19480, view, map, 6, 6);
        m12662(i, c8770M19480, view, map, 6, 7);
        m12662(i, c8770M19480, view, map, 7, 7);
        m12662(i, c8770M19480, view, map, 7, 6);
        m12662(i, c8770M19480, view, map, 1, 1);
        m12662(i, c8770M19480, view, map, 1, 2);
        m12662(i, c8770M19480, view, map, 2, 2);
        m12662(i, c8770M19480, view, map, 2, 1);
        m12662(i, c8770M19480, view, map, 3, 3);
        m12662(i, c8770M19480, view, map, 3, 4);
        m12662(i, c8770M19480, view, map, 4, 3);
        m12662(i, c8770M19480, view, map, 4, 4);
        m12662(i, c8770M19480, view, map, 5, 5);
        m12665(c8770M19480, view, map, 0);
        m12665(c8770M19480, view, map, 1);
        m12664(i, c8770M19480, view, map);
        this.f848.m19419(iM19403, c8770M19480);
        this.f848.requestLayout();
    }

    @Override // Yue.InterfaceC6837
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float mo12672(Object obj, int i, float f, float f2) {
        return this.f848.f15629.get((View) obj).m19323(i, f, f2);
    }

    @Override // Yue.InterfaceC6837
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Object mo12673(Object obj, float f, float f2) {
        C6269 c6269;
        View view = (View) obj;
        C6273 c6273 = this.f848;
        if (c6273.f15620 == null) {
            return -1;
        }
        if (view == null || (c6269 = c6273.f15629.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return c6269.m19324(viewGroup.getWidth(), viewGroup.getHeight(), f, f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m12674(boolean z) {
        this.f848.m19386(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m12675(String str) {
        C6273 c6273 = this.f848;
        if (c6273.f15620 == null) {
            c6273.f15620 = this.f849;
        }
        int iM19403 = c6273.m19403(str);
        System.out.println(" dumping  " + str + " (" + iM19403 + ")");
        try {
            this.f848.f15620.m19480(iM19403).m29397(this.f848.f15620, new int[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m12676(Object obj, float[] fArr) {
        C6283 c6283 = this.f848.f15620;
        if (c6283 == null) {
            return -1;
        }
        int iM19485 = c6283.m19485() / 16;
        C6269 c6269 = this.f848.f15629.get(obj);
        if (c6269 == null) {
            return 0;
        }
        c6269.m19311(fArr, null);
        return iM19485;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m12677(Object obj, float[] fArr, int i) {
        C6273 c6273 = this.f848;
        if (c6273.f15620 == null) {
            return -1;
        }
        C6269 c6269 = c6273.f15629.get(obj);
        if (c6269 == null) {
            return 0;
        }
        c6269.m19312(fArr, i);
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m12678(Object obj, float[] fArr) {
        C6283 c6283 = this.f848.f15620;
        if (c6283 == null) {
            return;
        }
        int iM19485 = c6283.m19485() / 16;
        C6269 c6269 = this.f848.f15629.get(obj);
        if (c6269 == null) {
            return;
        }
        c6269.m19314(fArr, iM19485);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String m12679() {
        int endState = this.f848.getEndState();
        if (this.f8982 == endState) {
            return this.f8980;
        }
        String strM19396 = this.f848.m19396(endState);
        if (strM19396 != null) {
            this.f8980 = strM19396;
            this.f8982 = endState;
        }
        return strM19396;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m12680(Object obj, int i, int[] iArr) {
        C6269 c6269 = this.f848.f15629.get((View) obj);
        if (c6269 == null) {
            return 0;
        }
        return c6269.m19322(i, iArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int m12681(Object obj, int[] iArr, float[] fArr) {
        C6269 c6269 = this.f848.f15629.get((View) obj);
        if (c6269 == null) {
            return 0;
        }
        return c6269.m19329(iArr, fArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Object m12682(int i, int i2, int i3) {
        C6273 c6273 = this.f848;
        C6283 c6283 = c6273.f15620;
        if (c6283 == null) {
            return null;
        }
        return c6283.m19490(c6273.getContext(), i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Object m12683(Object obj, int i, int i2) {
        if (this.f848.f15620 == null) {
            return null;
        }
        int id = ((View) obj).getId();
        C6273 c6273 = this.f848;
        return c6273.f15620.m19490(c6273.getContext(), i, id, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public float m12684() {
        return this.f848.getProgress();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public String m12685() {
        int startState = this.f848.getStartState();
        if (this.f8981 == startState) {
            return this.f8979;
        }
        String strM19396 = this.f848.m19396(startState);
        if (strM19396 != null) {
            this.f8979 = strM19396;
            this.f8981 = startState;
        }
        return this.f848.m19396(startState);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public String m12686() {
        if (this.f8979 != null && this.f8980 != null) {
            float fM12684 = m12684();
            if (fM12684 <= 0.01f) {
                return this.f8979;
            }
            if (fM12684 >= 0.99f) {
                return this.f8980;
            }
        }
        return this.f8979;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m12687() {
        return (this.f8979 == null || this.f8980 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m12688(Object obj, String str, Object obj2) {
        if (obj instanceof AbstractC5616) {
            ((AbstractC5616) obj).mo17409(str, obj2);
            this.f848.m19408();
            this.f848.f15637 = true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m12689(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f8979 == str) {
            return;
        }
        this.f8979 = str;
        this.f8980 = null;
        C6273 c6273 = this.f848;
        if (c6273.f15620 == null) {
            c6273.f15620 = this.f849;
        }
        int iM19403 = c6273.m19403(str);
        this.f8981 = iM19403;
        if (iM19403 != 0) {
            if (iM19403 == this.f848.getStartState()) {
                this.f848.setProgress(0.0f);
            } else if (iM19403 == this.f848.getEndState()) {
                this.f848.setProgress(1.0f);
            } else {
                this.f848.m19416(iM19403);
                this.f848.setProgress(1.0f);
            }
        }
        this.f848.requestLayout();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m12690(String str, String str2) {
        C6273 c6273 = this.f848;
        if (c6273.f15620 == null) {
            c6273.f15620 = this.f849;
        }
        int iM19403 = c6273.m19403(str);
        int iM194032 = this.f848.m19403(str2);
        this.f848.m19411(iM19403, iM194032);
        this.f8981 = iM19403;
        this.f8982 = iM194032;
        this.f8979 = str;
        this.f8980 = str2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m12691(Object obj, int i) {
        C6269 c6269 = this.f848.f15629.get(obj);
        if (c6269 != null) {
            c6269.m19335(i);
            this.f848.invalidate();
        }
    }
}
