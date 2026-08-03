package Yue;

import Yue.AbstractC7544;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C1643;
import androidx.constraintlayout.widget.C8778;
import com.google.flatbuffers.reflection.BaseType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5617 extends AbstractC5616 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final String f13605 = "KeyAttribute";

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final String f13606 = "KeyAttribute";

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f13607 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public String f13608;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f13609 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f13610 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public float f13611 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float f13612 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float f13613 = Float.NaN;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f13614 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public float f13615 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float f13616 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public float f13617 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public float f13618 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public float f13619 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f13620 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public float f13621 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public float f13622 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public float f13623 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public float f13624 = Float.NaN;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥ۠$ۥ */
    public static class C0816 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f1573 = 1;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f1574 = 2;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f13625 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f13626 = 5;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f13627 = 6;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f13628 = 8;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f13629 = 7;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f13630 = 9;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f13631 = 10;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f13632 = 12;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f13633 = 13;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f13634 = 14;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final int f13635 = 15;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final int f13636 = 16;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final int f13637 = 17;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final int f13638 = 18;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f13639 = 19;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f13640 = 20;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static SparseIntArray f13641;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f13641 = sparseIntArray;
            sparseIntArray.append(C8778.C8789.f28988, 1);
            f13641.append(C8778.C8789.f28999, 2);
            f13641.append(C8778.C8789.f28995, 4);
            f13641.append(C8778.C8789.f28996, 5);
            f13641.append(C8778.C8789.f28997, 6);
            f13641.append(C8778.C8789.f28989, 19);
            f13641.append(C8778.C8789.f28990, 20);
            f13641.append(C8778.C8789.f28993, 7);
            f13641.append(C8778.C8789.f29005, 8);
            f13641.append(C8778.C8789.f29004, 9);
            f13641.append(C8778.C8789.f29003, 10);
            f13641.append(C8778.C8789.f29001, 12);
            f13641.append(C8778.C8789.f29000, 13);
            f13641.append(C8778.C8789.f28994, 14);
            f13641.append(C8778.C8789.f28991, 15);
            f13641.append(C8778.C8789.f28992, 16);
            f13641.append(C8778.C8789.f28998, 17);
            f13641.append(C8778.C8789.f29002, 18);
        }

        /* JADX INFO: renamed from: ۥ */
        public static void m2327(C5617 c5617, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f13641.get(index)) {
                    case 1:
                        c5617.f13611 = typedArray.getFloat(index, c5617.f13611);
                        break;
                    case 2:
                        c5617.f13612 = typedArray.getDimension(index, c5617.f13612);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f13641.get(index));
                        break;
                    case 4:
                        c5617.f13613 = typedArray.getFloat(index, c5617.f13613);
                        break;
                    case 5:
                        c5617.f13614 = typedArray.getFloat(index, c5617.f13614);
                        break;
                    case 6:
                        c5617.f13615 = typedArray.getFloat(index, c5617.f13615);
                        break;
                    case 7:
                        c5617.f13619 = typedArray.getFloat(index, c5617.f13619);
                        break;
                    case 8:
                        c5617.f13618 = typedArray.getFloat(index, c5617.f13618);
                        break;
                    case 9:
                        c5617.f13608 = typedArray.getString(index);
                        break;
                    case 10:
                        if (C6273.f15610) {
                            int resourceId = typedArray.getResourceId(index, c5617.f1572);
                            c5617.f1572 = resourceId;
                            if (resourceId == -1) {
                                c5617.f13602 = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c5617.f13602 = typedArray.getString(index);
                        } else {
                            c5617.f1572 = typedArray.getResourceId(index, c5617.f1572);
                        }
                        break;
                    case 12:
                        c5617.f1571 = typedArray.getInt(index, c5617.f1571);
                        break;
                    case 13:
                        c5617.f13609 = typedArray.getInteger(index, c5617.f13609);
                        break;
                    case 14:
                        c5617.f13620 = typedArray.getFloat(index, c5617.f13620);
                        break;
                    case 15:
                        c5617.f13621 = typedArray.getDimension(index, c5617.f13621);
                        break;
                    case 16:
                        c5617.f13622 = typedArray.getDimension(index, c5617.f13622);
                        break;
                    case 17:
                        c5617.f13623 = typedArray.getDimension(index, c5617.f13623);
                        break;
                    case 18:
                        c5617.f13624 = typedArray.getFloat(index, c5617.f13624);
                        break;
                    case 19:
                        c5617.f13616 = typedArray.getDimension(index, c5617.f13616);
                        break;
                    case 20:
                        c5617.f13617 = typedArray.getDimension(index, c5617.f13617);
                        break;
                }
            }
        }
    }

    public C5617() {
        this.f13603 = 1;
        this.f13604 = new HashMap<>();
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ */
    public void mo2325(HashMap<String, AbstractC7544> map) {
        for (String str : map.keySet()) {
            AbstractC7544 abstractC7544 = map.get(str);
            if (!str.startsWith(AbstractC5616.f13601)) {
                switch (str) {
                    case "rotationX":
                        if (Float.isNaN(this.f13614)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13614);
                            break;
                        }
                        break;
                    case "rotationY":
                        if (Float.isNaN(this.f13615)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13615);
                            break;
                        }
                        break;
                    case "translationX":
                        if (Float.isNaN(this.f13621)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13621);
                            break;
                        }
                        break;
                    case "translationY":
                        if (Float.isNaN(this.f13622)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13622);
                            break;
                        }
                        break;
                    case "translationZ":
                        if (Float.isNaN(this.f13623)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13623);
                            break;
                        }
                        break;
                    case "progress":
                        if (Float.isNaN(this.f13624)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13624);
                            break;
                        }
                        break;
                    case "scaleX":
                        if (Float.isNaN(this.f13619)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13619);
                            break;
                        }
                        break;
                    case "scaleY":
                        if (Float.isNaN(this.f13620)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13620);
                            break;
                        }
                        break;
                    case "transformPivotX":
                        if (Float.isNaN(this.f13614)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13616);
                            break;
                        }
                        break;
                    case "transformPivotY":
                        if (Float.isNaN(this.f13615)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13617);
                            break;
                        }
                        break;
                    case "rotation":
                        if (Float.isNaN(this.f13613)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13613);
                            break;
                        }
                        break;
                    case "elevation":
                        if (Float.isNaN(this.f13612)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13612);
                            break;
                        }
                        break;
                    case "transitionPathRotate":
                        if (Float.isNaN(this.f13618)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13618);
                            break;
                        }
                        break;
                    case "alpha":
                        if (Float.isNaN(this.f13611)) {
                            break;
                        } else {
                            abstractC7544.mo23650(this.f1571, this.f13611);
                            break;
                        }
                        break;
                    default:
                        Log.v("KeyAttributes", "UNKNOWN addValues \"" + str + "\"");
                        break;
                }
            } else {
                C1643 c1643 = this.f13604.get(str.substring(7));
                if (c1643 != null) {
                    ((AbstractC7544.C1295) abstractC7544).m23654(this.f1571, c1643);
                }
            }
        }
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2326(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f13611)) {
            hashSet.add(AbstractC5616.f13584);
        }
        if (!Float.isNaN(this.f13612)) {
            hashSet.add(AbstractC5616.f13585);
        }
        if (!Float.isNaN(this.f13613)) {
            hashSet.add(AbstractC5616.f13586);
        }
        if (!Float.isNaN(this.f13614)) {
            hashSet.add(AbstractC5616.f13587);
        }
        if (!Float.isNaN(this.f13615)) {
            hashSet.add(AbstractC5616.f13588);
        }
        if (!Float.isNaN(this.f13616)) {
            hashSet.add(AbstractC5616.f13589);
        }
        if (!Float.isNaN(this.f13617)) {
            hashSet.add(AbstractC5616.f13590);
        }
        if (!Float.isNaN(this.f13621)) {
            hashSet.add(AbstractC5616.f13597);
        }
        if (!Float.isNaN(this.f13622)) {
            hashSet.add(AbstractC5616.f13598);
        }
        if (!Float.isNaN(this.f13623)) {
            hashSet.add(AbstractC5616.f13599);
        }
        if (!Float.isNaN(this.f13618)) {
            hashSet.add(AbstractC5616.f13591);
        }
        if (!Float.isNaN(this.f13619)) {
            hashSet.add(AbstractC5616.f13592);
        }
        if (!Float.isNaN(this.f13620)) {
            hashSet.add(AbstractC5616.f13593);
        }
        if (!Float.isNaN(this.f13624)) {
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
        C0816.m2327(this, context.obtainStyledAttributes(attributeSet, C8778.C8789.f28987));
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo17408(HashMap<String, Integer> map) {
        if (this.f13609 == -1) {
            return;
        }
        if (!Float.isNaN(this.f13611)) {
            map.put(AbstractC5616.f13584, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13612)) {
            map.put(AbstractC5616.f13585, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13613)) {
            map.put(AbstractC5616.f13586, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13614)) {
            map.put(AbstractC5616.f13587, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13615)) {
            map.put(AbstractC5616.f13588, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13616)) {
            map.put(AbstractC5616.f13589, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13617)) {
            map.put(AbstractC5616.f13590, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13621)) {
            map.put(AbstractC5616.f13597, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13622)) {
            map.put(AbstractC5616.f13598, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13623)) {
            map.put(AbstractC5616.f13599, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13618)) {
            map.put(AbstractC5616.f13591, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13619)) {
            map.put(AbstractC5616.f13592, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13620)) {
            map.put(AbstractC5616.f13593, Integer.valueOf(this.f13609));
        }
        if (!Float.isNaN(this.f13624)) {
            map.put("progress", Integer.valueOf(this.f13609));
        }
        if (this.f13604.size() > 0) {
            Iterator<String> it = this.f13604.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f13609));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo17409(String str, Object obj) {
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    b = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b = 1;
                }
                break;
            case -1249320806:
                if (str.equals(AbstractC5616.f13587)) {
                    b = 2;
                }
                break;
            case -1249320805:
                if (str.equals(AbstractC5616.f13588)) {
                    b = 3;
                }
                break;
            case -1225497657:
                if (str.equals(AbstractC5616.f13597)) {
                    b = 4;
                }
                break;
            case -1225497656:
                if (str.equals(AbstractC5616.f13598)) {
                    b = 5;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    b = 6;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    b = 7;
                }
                break;
            case -908189618:
                if (str.equals(AbstractC5616.f13592)) {
                    b = 8;
                }
                break;
            case -908189617:
                if (str.equals(AbstractC5616.f13593)) {
                    b = 9;
                }
                break;
            case -40300674:
                if (str.equals(AbstractC5616.f13586)) {
                    b = 10;
                }
                break;
            case -4379043:
                if (str.equals(AbstractC5616.f13585)) {
                    b = 11;
                }
                break;
            case 37232917:
                if (str.equals(AbstractC5616.f13591)) {
                    b = 12;
                }
                break;
            case 92909918:
                if (str.equals(AbstractC5616.f13584)) {
                    b = 13;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b = 14;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    b = 15;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b = BaseType.Union;
                }
                break;
        }
        switch (b) {
            case 0:
                this.f13624 = m17411(obj);
                break;
            case 1:
                this.f13608 = obj.toString();
                break;
            case 2:
                this.f13614 = m17411(obj);
                break;
            case 3:
                this.f13615 = m17411(obj);
                break;
            case 4:
                this.f13621 = m17411(obj);
                break;
            case 5:
                this.f13622 = m17411(obj);
                break;
            case 6:
                this.f13616 = m17411(obj);
                break;
            case 7:
                this.f13617 = m17411(obj);
                break;
            case 8:
                this.f13619 = m17411(obj);
                break;
            case 9:
                this.f13620 = m17411(obj);
                break;
            case 10:
                this.f13613 = m17411(obj);
                break;
            case 11:
                this.f13612 = m17411(obj);
                break;
            case 12:
                this.f13618 = m17411(obj);
                break;
            case 13:
                this.f13611 = m17411(obj);
                break;
            case 14:
                this.f13609 = m17412(obj);
                break;
            case 15:
                this.f13623 = m17411(obj);
                break;
            case 16:
                this.f13610 = m17410(obj);
                break;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int m17444() {
        return this.f13609;
    }
}
