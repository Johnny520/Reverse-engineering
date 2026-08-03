package Yue;

import Yue.AbstractC7800;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C1643;
import androidx.constraintlayout.widget.C8778;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5641 extends AbstractC5616 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final String f13743 = "KeyTimeCycle";

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final String f13744 = "KeyTimeCycle";

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f13745 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public String f13746;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f13747 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public float f13748 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public float f13749 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float f13750 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float f13751 = Float.NaN;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f13752 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public float f13753 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float f13754 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public float f13755 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public float f13756 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public float f13757 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f13758 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public float f13759 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int f13760 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public float f13761 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public float f13762 = 0.0f;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۨ$ۥ */
    public static class C0822 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f1590 = 1;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f1591 = 2;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f13763 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f13764 = 5;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f13765 = 6;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f13766 = 8;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f13767 = 7;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f13768 = 9;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f13769 = 10;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f13770 = 12;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f13771 = 13;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f13772 = 14;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final int f13773 = 15;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final int f13774 = 16;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final int f13775 = 17;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final int f13776 = 18;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f13777 = 19;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f13778 = 20;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final int f13779 = 21;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static SparseIntArray f13780;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f13780 = sparseIntArray;
            sparseIntArray.append(C8778.C8789.f29041, 1);
            f13780.append(C8778.C8789.f29050, 2);
            f13780.append(C8778.C8789.f29046, 4);
            f13780.append(C8778.C8789.f29047, 5);
            f13780.append(C8778.C8789.f29048, 6);
            f13780.append(C8778.C8789.f29044, 7);
            f13780.append(C8778.C8789.f29056, 8);
            f13780.append(C8778.C8789.f29055, 9);
            f13780.append(C8778.C8789.f29054, 10);
            f13780.append(C8778.C8789.f29052, 12);
            f13780.append(C8778.C8789.f29051, 13);
            f13780.append(C8778.C8789.f29045, 14);
            f13780.append(C8778.C8789.f29042, 15);
            f13780.append(C8778.C8789.f29043, 16);
            f13780.append(C8778.C8789.f29049, 17);
            f13780.append(C8778.C8789.f29053, 18);
            f13780.append(C8778.C8789.f29059, 20);
            f13780.append(C8778.C8789.f29058, 21);
            f13780.append(C8778.C8789.f29060, 19);
        }

        /* JADX INFO: renamed from: ۥ */
        public static void m2347(C5641 c5641, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f13780.get(index)) {
                    case 1:
                        c5641.f13748 = typedArray.getFloat(index, c5641.f13748);
                        break;
                    case 2:
                        c5641.f13749 = typedArray.getDimension(index, c5641.f13749);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f13780.get(index));
                        break;
                    case 4:
                        c5641.f13750 = typedArray.getFloat(index, c5641.f13750);
                        break;
                    case 5:
                        c5641.f13751 = typedArray.getFloat(index, c5641.f13751);
                        break;
                    case 6:
                        c5641.f13752 = typedArray.getFloat(index, c5641.f13752);
                        break;
                    case 7:
                        c5641.f13754 = typedArray.getFloat(index, c5641.f13754);
                        break;
                    case 8:
                        c5641.f13753 = typedArray.getFloat(index, c5641.f13753);
                        break;
                    case 9:
                        c5641.f13746 = typedArray.getString(index);
                        break;
                    case 10:
                        if (C6273.f15610) {
                            int resourceId = typedArray.getResourceId(index, c5641.f1572);
                            c5641.f1572 = resourceId;
                            if (resourceId == -1) {
                                c5641.f13602 = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c5641.f13602 = typedArray.getString(index);
                        } else {
                            c5641.f1572 = typedArray.getResourceId(index, c5641.f1572);
                        }
                        break;
                    case 12:
                        c5641.f1571 = typedArray.getInt(index, c5641.f1571);
                        break;
                    case 13:
                        c5641.f13747 = typedArray.getInteger(index, c5641.f13747);
                        break;
                    case 14:
                        c5641.f13755 = typedArray.getFloat(index, c5641.f13755);
                        break;
                    case 15:
                        c5641.f13756 = typedArray.getDimension(index, c5641.f13756);
                        break;
                    case 16:
                        c5641.f13757 = typedArray.getDimension(index, c5641.f13757);
                        break;
                    case 17:
                        c5641.f13758 = typedArray.getDimension(index, c5641.f13758);
                        break;
                    case 18:
                        c5641.f13759 = typedArray.getFloat(index, c5641.f13759);
                        break;
                    case 19:
                        c5641.f13760 = typedArray.getInt(index, c5641.f13760);
                        break;
                    case 20:
                        c5641.f13761 = typedArray.getFloat(index, c5641.f13761);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            c5641.f13762 = typedArray.getDimension(index, c5641.f13762);
                        } else {
                            c5641.f13762 = typedArray.getFloat(index, c5641.f13762);
                        }
                        break;
                }
            }
        }
    }

    public C5641() {
        this.f13603 = 3;
        this.f13604 = new HashMap<>();
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ */
    public void mo2325(HashMap<String, AbstractC7544> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2326(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f13748)) {
            hashSet.add(AbstractC5616.f13584);
        }
        if (!Float.isNaN(this.f13749)) {
            hashSet.add(AbstractC5616.f13585);
        }
        if (!Float.isNaN(this.f13750)) {
            hashSet.add(AbstractC5616.f13586);
        }
        if (!Float.isNaN(this.f13751)) {
            hashSet.add(AbstractC5616.f13587);
        }
        if (!Float.isNaN(this.f13752)) {
            hashSet.add(AbstractC5616.f13588);
        }
        if (!Float.isNaN(this.f13756)) {
            hashSet.add(AbstractC5616.f13597);
        }
        if (!Float.isNaN(this.f13757)) {
            hashSet.add(AbstractC5616.f13598);
        }
        if (!Float.isNaN(this.f13758)) {
            hashSet.add(AbstractC5616.f13599);
        }
        if (!Float.isNaN(this.f13753)) {
            hashSet.add(AbstractC5616.f13591);
        }
        if (!Float.isNaN(this.f13754)) {
            hashSet.add(AbstractC5616.f13592);
        }
        if (!Float.isNaN(this.f13755)) {
            hashSet.add(AbstractC5616.f13593);
        }
        if (!Float.isNaN(this.f13759)) {
            hashSet.add("progress");
        }
        if (this.f13604.size() > 0) {
            Iterator<String> it = this.f13604.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo17406(Context context, AttributeSet attributeSet) {
        C0822.m2347(this, context.obtainStyledAttributes(attributeSet, C8778.C8789.f29040));
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo17408(HashMap<String, Integer> map) {
        if (this.f13747 == -1) {
            return;
        }
        if (!Float.isNaN(this.f13748)) {
            map.put(AbstractC5616.f13584, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13749)) {
            map.put(AbstractC5616.f13585, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13750)) {
            map.put(AbstractC5616.f13586, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13751)) {
            map.put(AbstractC5616.f13587, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13752)) {
            map.put(AbstractC5616.f13588, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13756)) {
            map.put(AbstractC5616.f13597, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13757)) {
            map.put(AbstractC5616.f13598, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13758)) {
            map.put(AbstractC5616.f13599, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13753)) {
            map.put(AbstractC5616.f13591, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13754)) {
            map.put(AbstractC5616.f13592, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13754)) {
            map.put(AbstractC5616.f13593, Integer.valueOf(this.f13747));
        }
        if (!Float.isNaN(this.f13759)) {
            map.put("progress", Integer.valueOf(this.f13747));
        }
        if (this.f13604.size() > 0) {
            Iterator<String> it = this.f13604.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f13747));
            }
        }
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo17409(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                this.f13746 = obj.toString();
                break;
            case "rotationX":
                this.f13751 = m17411(obj);
                break;
            case "rotationY":
                this.f13752 = m17411(obj);
                break;
            case "translationX":
                this.f13756 = m17411(obj);
                break;
            case "translationY":
                this.f13757 = m17411(obj);
                break;
            case "progress":
                this.f13759 = m17411(obj);
                break;
            case "scaleX":
                this.f13754 = m17411(obj);
                break;
            case "scaleY":
                this.f13755 = m17411(obj);
                break;
            case "rotation":
                this.f13750 = m17411(obj);
                break;
            case "elevation":
                this.f13749 = m17411(obj);
                break;
            case "transitionPathRotate":
                this.f13753 = m17411(obj);
                break;
            case "alpha":
                this.f13748 = m17411(obj);
                break;
            case "curveFit":
                this.f13747 = m17412(obj);
                break;
            case "mTranslationZ":
                this.f13758 = m17411(obj);
                break;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m17547(HashMap<String, AbstractC7800> map) {
        for (String str : map.keySet()) {
            AbstractC7800 abstractC7800 = map.get(str);
            if (!str.startsWith(AbstractC5616.f13601)) {
                switch (str) {
                    case "rotationX":
                        if (Float.isNaN(this.f13751)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13751, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "rotationY":
                        if (Float.isNaN(this.f13752)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13752, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "translationX":
                        if (Float.isNaN(this.f13756)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13756, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "translationY":
                        if (Float.isNaN(this.f13757)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13757, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "translationZ":
                        if (Float.isNaN(this.f13758)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13758, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "progress":
                        if (Float.isNaN(this.f13759)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13759, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "scaleX":
                        if (Float.isNaN(this.f13754)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13754, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "scaleY":
                        if (Float.isNaN(this.f13755)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13755, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "rotation":
                        if (Float.isNaN(this.f13750)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13750, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "elevation":
                        if (Float.isNaN(this.f13749)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13749, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "transitionPathRotate":
                        if (Float.isNaN(this.f13753)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13753, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    case "alpha":
                        if (Float.isNaN(this.f13748)) {
                            break;
                        } else {
                            abstractC7800.mo24771(this.f1571, this.f13748, this.f13761, this.f13760, this.f13762);
                            break;
                        }
                        break;
                    default:
                        Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                        break;
                }
            } else {
                C1643 c1643 = this.f13604.get(str.substring(7));
                if (c1643 != null) {
                    ((AbstractC7800.C1366) abstractC7800).m24776(this.f1571, c1643, this.f13761, this.f13760, this.f13762);
                }
            }
        }
    }
}
