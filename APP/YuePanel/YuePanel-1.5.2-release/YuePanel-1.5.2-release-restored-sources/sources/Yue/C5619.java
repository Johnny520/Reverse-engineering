package Yue;

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

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5619 extends AbstractC5616 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final String f13642 = "KeyCycle";

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final String f13643 = "KeyCycle";

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int f13644 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public String f13645 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f13646 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f13647 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public float f13648 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float f13649 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float f13650 = Float.NaN;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f13651 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public float f13652 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float f13653 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public float f13654 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public float f13655 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public float f13656 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f13657 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public float f13658 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public float f13659 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public float f13660 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public float f13661 = Float.NaN;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public float f13662 = Float.NaN;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۢ$ۥ */
    public static class C0817 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f1576 = 1;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f1577 = 2;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f13663 = 3;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f13664 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f13665 = 5;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f13666 = 6;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f13667 = 7;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f13668 = 8;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f13669 = 9;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f13670 = 10;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f13671 = 11;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f13672 = 12;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final int f13673 = 13;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final int f13674 = 14;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final int f13675 = 15;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final int f13676 = 16;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f13677 = 17;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f13678 = 18;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final int f13679 = 19;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final int f13680 = 20;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static SparseIntArray f13681;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f13681 = sparseIntArray;
            sparseIntArray.append(C8778.C8789.f29020, 1);
            f13681.append(C8778.C8789.f29018, 2);
            f13681.append(C8778.C8789.f29021, 3);
            f13681.append(C8778.C8789.f29017, 4);
            f13681.append(C8778.C8789.f29025, 5);
            f13681.append(C8778.C8789.f29024, 6);
            f13681.append(C8778.C8789.f29023, 7);
            f13681.append(C8778.C8789.f29026, 8);
            f13681.append(C8778.C8789.f29007, 9);
            f13681.append(C8778.C8789.f29016, 10);
            f13681.append(C8778.C8789.f29012, 11);
            f13681.append(C8778.C8789.f29013, 12);
            f13681.append(C8778.C8789.f29014, 13);
            f13681.append(C8778.C8789.f29022, 14);
            f13681.append(C8778.C8789.f29010, 15);
            f13681.append(C8778.C8789.f29011, 16);
            f13681.append(C8778.C8789.f29008, 17);
            f13681.append(C8778.C8789.f29009, 18);
            f13681.append(C8778.C8789.f29015, 19);
            f13681.append(C8778.C8789.f29019, 20);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2331(C5619 c5619, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f13681.get(index)) {
                    case 1:
                        if (C6273.f15610) {
                            int resourceId = typedArray.getResourceId(index, c5619.f1572);
                            c5619.f1572 = resourceId;
                            if (resourceId == -1) {
                                c5619.f13602 = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c5619.f13602 = typedArray.getString(index);
                        } else {
                            c5619.f1572 = typedArray.getResourceId(index, c5619.f1572);
                        }
                        break;
                    case 2:
                        c5619.f1571 = typedArray.getInt(index, c5619.f1571);
                        break;
                    case 3:
                        c5619.f13645 = typedArray.getString(index);
                        break;
                    case 4:
                        c5619.f13646 = typedArray.getInteger(index, c5619.f13646);
                        break;
                    case 5:
                        c5619.f13647 = typedArray.getInt(index, c5619.f13647);
                        break;
                    case 6:
                        c5619.f13648 = typedArray.getFloat(index, c5619.f13648);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            c5619.f13649 = typedArray.getDimension(index, c5619.f13649);
                        } else {
                            c5619.f13649 = typedArray.getFloat(index, c5619.f13649);
                        }
                        break;
                    case 8:
                        c5619.f13651 = typedArray.getInt(index, c5619.f13651);
                        break;
                    case 9:
                        c5619.f13652 = typedArray.getFloat(index, c5619.f13652);
                        break;
                    case 10:
                        c5619.f13653 = typedArray.getDimension(index, c5619.f13653);
                        break;
                    case 11:
                        c5619.f13654 = typedArray.getFloat(index, c5619.f13654);
                        break;
                    case 12:
                        c5619.f13656 = typedArray.getFloat(index, c5619.f13656);
                        break;
                    case 13:
                        c5619.f13657 = typedArray.getFloat(index, c5619.f13657);
                        break;
                    case 14:
                        c5619.f13655 = typedArray.getFloat(index, c5619.f13655);
                        break;
                    case 15:
                        c5619.f13658 = typedArray.getFloat(index, c5619.f13658);
                        break;
                    case 16:
                        c5619.f13659 = typedArray.getFloat(index, c5619.f13659);
                        break;
                    case 17:
                        c5619.f13660 = typedArray.getDimension(index, c5619.f13660);
                        break;
                    case 18:
                        c5619.f13661 = typedArray.getDimension(index, c5619.f13661);
                        break;
                    case 19:
                        c5619.f13662 = typedArray.getDimension(index, c5619.f13662);
                        break;
                    case 20:
                        c5619.f13650 = typedArray.getFloat(index, c5619.f13650);
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f13681.get(index));
                        break;
                }
            }
        }
    }

    public C5619() {
        this.f13603 = 4;
        this.f13604 = new HashMap<>();
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ */
    public void mo2325(HashMap<String, AbstractC7544> map) {
        AbstractC7544 abstractC7544;
        C4308.m12439("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            abstractC7544 = map.get(str);
            str.hashCode();
            switch (str) {
                case "rotationX":
                    abstractC7544.mo23650(this.f1571, this.f13656);
                    break;
                case "rotationY":
                    abstractC7544.mo23650(this.f1571, this.f13657);
                    break;
                case "translationX":
                    abstractC7544.mo23650(this.f1571, this.f13660);
                    break;
                case "translationY":
                    abstractC7544.mo23650(this.f1571, this.f13661);
                    break;
                case "translationZ":
                    abstractC7544.mo23650(this.f1571, this.f13662);
                    break;
                case "progress":
                    abstractC7544.mo23650(this.f1571, this.f13650);
                    break;
                case "scaleX":
                    abstractC7544.mo23650(this.f1571, this.f13658);
                    break;
                case "scaleY":
                    abstractC7544.mo23650(this.f1571, this.f13659);
                    break;
                case "rotation":
                    abstractC7544.mo23650(this.f1571, this.f13654);
                    break;
                case "elevation":
                    abstractC7544.mo23650(this.f1571, this.f13653);
                    break;
                case "transitionPathRotate":
                    abstractC7544.mo23650(this.f1571, this.f13655);
                    break;
                case "alpha":
                    abstractC7544.mo23650(this.f1571, this.f13652);
                    break;
                case "waveOffset":
                    abstractC7544.mo23650(this.f1571, this.f13649);
                    break;
                default:
                    Log.v("KeyCycle", "WARNING KeyCycle UNKNOWN  " + str);
                    break;
            }
        }
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2326(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f13652)) {
            hashSet.add(AbstractC5616.f13584);
        }
        if (!Float.isNaN(this.f13653)) {
            hashSet.add(AbstractC5616.f13585);
        }
        if (!Float.isNaN(this.f13654)) {
            hashSet.add(AbstractC5616.f13586);
        }
        if (!Float.isNaN(this.f13656)) {
            hashSet.add(AbstractC5616.f13587);
        }
        if (!Float.isNaN(this.f13657)) {
            hashSet.add(AbstractC5616.f13588);
        }
        if (!Float.isNaN(this.f13658)) {
            hashSet.add(AbstractC5616.f13592);
        }
        if (!Float.isNaN(this.f13659)) {
            hashSet.add(AbstractC5616.f13593);
        }
        if (!Float.isNaN(this.f13655)) {
            hashSet.add(AbstractC5616.f13591);
        }
        if (!Float.isNaN(this.f13660)) {
            hashSet.add(AbstractC5616.f13597);
        }
        if (!Float.isNaN(this.f13661)) {
            hashSet.add(AbstractC5616.f13598);
        }
        if (!Float.isNaN(this.f13662)) {
            hashSet.add(AbstractC5616.f13599);
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
        C0817.m2331(this, context.obtainStyledAttributes(attributeSet, C8778.C8789.f29006));
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo17409(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                this.f13645 = obj.toString();
                break;
            case "rotationX":
                this.f13656 = m17411(obj);
                break;
            case "rotationY":
                this.f13657 = m17411(obj);
                break;
            case "translationX":
                this.f13660 = m17411(obj);
                break;
            case "translationY":
                this.f13661 = m17411(obj);
                break;
            case "progress":
                this.f13650 = m17411(obj);
                break;
            case "scaleX":
                this.f13658 = m17411(obj);
                break;
            case "scaleY":
                this.f13659 = m17411(obj);
                break;
            case "rotation":
                this.f13654 = m17411(obj);
                break;
            case "elevation":
                this.f13653 = m17411(obj);
                break;
            case "transitionPathRotate":
                this.f13655 = m17411(obj);
                break;
            case "alpha":
                this.f13652 = m17411(obj);
                break;
            case "waveOffset":
                this.f13649 = m17411(obj);
                break;
            case "wavePeriod":
                this.f13648 = m17411(obj);
                break;
            case "curveFit":
                this.f13646 = m17412(obj);
                break;
            case "mTranslationZ":
                this.f13662 = m17411(obj);
                break;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m17480(HashMap<String, AbstractC5620> map) {
        for (String str : map.keySet()) {
            if (str.startsWith(AbstractC5616.f13601)) {
                C1643 c1643 = this.f13604.get(str.substring(7));
                if (c1643 != null && c1643.m29270() == C1643.EnumC8766.FLOAT_TYPE) {
                    map.get(str).m17485(this.f1571, this.f13647, this.f13651, this.f13648, this.f13649, c1643.m29271(), c1643);
                }
            } else {
                float fM17481 = m17481(str);
                if (!Float.isNaN(fM17481)) {
                    map.get(str).m17484(this.f1571, this.f13647, this.f13651, this.f13648, this.f13649, fM17481);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public float m17481(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return this.f13656;
            case "rotationY":
                return this.f13657;
            case "translationX":
                return this.f13660;
            case "translationY":
                return this.f13661;
            case "translationZ":
                return this.f13662;
            case "progress":
                return this.f13650;
            case "scaleX":
                return this.f13658;
            case "scaleY":
                return this.f13659;
            case "rotation":
                return this.f13654;
            case "elevation":
                return this.f13653;
            case "transitionPathRotate":
                return this.f13655;
            case "alpha":
                return this.f13652;
            case "waveOffset":
                return this.f13649;
            default:
                Log.v("KeyCycle", "WARNING! KeyCycle UNKNOWN  " + str);
                return Float.NaN;
        }
    }
}
