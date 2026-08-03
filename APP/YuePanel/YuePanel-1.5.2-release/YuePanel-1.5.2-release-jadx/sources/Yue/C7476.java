package Yue;

import androidx.recyclerview.widget.C8973;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7476 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final HashMap<String, Boolean> f2908;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final HashMap<String, List<Integer>> f22620;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22621;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22622;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22623;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22624;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22625;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22626;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22627;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22628;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22629;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22630;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22631;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22632;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22633;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22634;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22635;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22636;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22637;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22638;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22639;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22640;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22641;

    /* JADX INFO: renamed from: ۥ */
    public long f2909 = System.currentTimeMillis();

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۡۧ$ۥ */
    public class C1272 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22642;

        public C1272() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f22642;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(7183811209083300844L);
            f22642 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                long jLongValue = ((Long) methodHookParam.args[1]).longValue();
                Object[] objArr = methodHookParam.args;
                Object obj = objArr[0];
                ((Integer) objArr[5]).intValue();
                C7476.m3675(C7476.this, obj, jLongValue, methodHookParam.args[6]);
            }
        }
    }

    static {
        NativeUtil.classesInit0(152);
        f2908 = new LinkedHashMap();
        f22620 = new LinkedHashMap();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m3675(C7476 c7476, Object obj, long j, Object obj2);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟ */
    public final native boolean m3676(String str, int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native void m23437(String str, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m23438(Object obj, Object obj2, int i) {
        if (i == -1) {
            return;
        }
        try {
            if (this.f2909 + C8973.AbstractC8977.f30287 >= System.currentTimeMillis()) {
                return;
            }
            ArrayList arrayList = new ArrayList((List) XposedHelpers.callMethod(obj, yue_xin_awa(10), new Object[0]));
            List list = (List) C5898.m18284(XposedHelpers.getObjectField(obj, yue_xin_awa(11)), yue_xin_awa(12), List.class);
            if (list == null) {
                return;
            }
            ArrayList arrayList2 = new ArrayList(list);
            int i2 = 1;
            if (arrayList2.size() <= 1) {
                if (arrayList2.size() == 1 && ((Integer) arrayList2.get(0)).intValue() == 0) {
                    arrayList2.set(0, 1);
                }
                i2 = 0;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    Object obj3 = arrayList.get(iIntValue + 1 + i2);
                    int i4 = iIntValue + i2;
                    Object obj4 = arrayList.get(i4);
                    String strYue_xin_awa = yue_xin_awa(13);
                    Class cls = Integer.TYPE;
                    int iIntValue2 = ((Integer) C5898.m18284(obj3, strYue_xin_awa, cls)).intValue();
                    int iIntValue3 = ((Integer) C5898.m18284(obj4, yue_xin_awa(13), cls)).intValue();
                    if (i == i4) {
                        ((Integer) C5898.m18284(XposedHelpers.callMethod(obj, yue_xin_awa(8), new Object[0]), yue_xin_awa(20), cls)).intValue();
                        XposedHelpers.callMethod(obj2, yue_xin_awa(16), new Object[]{Float.valueOf(((iIntValue2 + 1000) / r13.intValue()) * 100.0f)});
                        C6334.m19811(yue_xin_awa(17) + C7817.m24800(iIntValue3) + yue_xin_awa(18) + C7817.m24800(iIntValue2) + yue_xin_awa(19));
                        this.f2909 = System.currentTimeMillis();
                        return;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m23439(Object obj, long j, Object obj2) {
        int i;
        try {
            int i2 = 0;
            Object objCallMethod = XposedHelpers.callMethod(obj, yue_xin_awa(8), new Object[0]);
            C4805 c4805M14538 = new C4805().m14538(obj);
            C4805 c4805M145382 = new C4805().m14538(objCallMethod);
            String name = C3270.m342().getClass().getName();
            String str = (String) c4805M14538.m14540(String.class).m1709(yue_xin_awa(9));
            List list = (List) XposedHelpers.callMethod(obj, yue_xin_awa(10), new Object[0]);
            List list2 = (List) C5898.m18284(XposedHelpers.getObjectField(obj, yue_xin_awa(11)), yue_xin_awa(12), List.class);
            if (list2 != null && list != null) {
                ArrayList arrayList = new ArrayList(list);
                new ArrayList(list2);
                int i3 = 0;
                while (true) {
                    i = 13;
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    Object obj3 = arrayList.get(i3);
                    if (((Integer) C5898.m18284(obj3, yue_xin_awa(13), Integer.TYPE)).intValue() == 0) {
                        list.remove(obj3);
                        f2908.put(str, Boolean.TRUE);
                    }
                    i3++;
                }
                while (i2 < list.size()) {
                    Object obj4 = list.get(i2);
                    int i4 = i2 + 1;
                    Object obj5 = i4 >= list.size() ? list.get(i2) : list.get(i4);
                    Class<?> cls = Integer.TYPE;
                    int iIntValue = ((Integer) c4805M145382.m14540(cls).m1709(yue_xin_awa(14))).intValue();
                    int iIntValue2 = ((Integer) C5898.m18284(obj4, yue_xin_awa(i), cls)).intValue();
                    int iIntValue3 = ((Integer) C5898.m18284(obj5, yue_xin_awa(i), cls)).intValue();
                    if (iIntValue3 != iIntValue2) {
                        iIntValue = iIntValue3;
                    }
                    long j2 = iIntValue2;
                    if (j >= j2) {
                        long j3 = iIntValue;
                        if (j <= j3) {
                            if (f2908.containsKey(str) && !name.equals(yue_xin_awa(15))) {
                                i2 = i4;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((Integer) it.next()).intValue() == i2) {
                                    if (m3676(str, i2)) {
                                        return;
                                    }
                                    XposedHelpers.callMethod(obj2, yue_xin_awa(16), new Object[]{Float.valueOf((iIntValue / r12.intValue()) * 100.0f)});
                                    C6334.m19811(yue_xin_awa(17) + C7817.m24800(j2) + yue_xin_awa(18) + C7817.m24800(j3) + yue_xin_awa(19));
                                    m23437(str, i2);
                                }
                            }
                            return;
                        }
                    }
                    i2 = i4;
                    i = 13;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
