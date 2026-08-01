package p199;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0053;
import androidx.constraintlayout.motion.widget.AbstractC2163;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import bsh.C2633;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import p009.AbstractC6183;
import p202.AbstractC7877;
import p203.C7883;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final SparseIntArray f21529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final SparseIntArray f21530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f21531 = {0, 4, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f21534 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f21533 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f21532 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21530 = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f21529 = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m13215(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C7870 m13216(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        C7870 c7870 = new C7870();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? AbstractC7862.f21522 : AbstractC7862.f21524);
        C7860 c7860 = c7870.f21642;
        C7859 c7859 = c7870.f21639;
        C7868 c7868 = c7870.f21641;
        C7867 c7867 = c7870.f21640;
        int[] iArr = f21531;
        String[] strArr = AbstractC7877.f21668;
        SparseIntArray sparseIntArray = f21530;
        if (z) {
            C7869 c7869 = new C7869();
            c7869.f21631 = new int[10];
            c7869.f21630 = new int[10];
            c7869.f21629 = 0;
            c7869.f21628 = new int[10];
            c7869.f21627 = new float[10];
            c7869.f21626 = 0;
            c7869.f21633 = new int[5];
            c7869.f21632 = new String[5];
            c7869.f21636 = 0;
            c7869.f21637 = new int[4];
            c7869.f21634 = new boolean[4];
            c7869.f21635 = 0;
            c7868.getClass();
            c7867.getClass();
            c7859.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f21529.get(index)) {
                    case 2:
                        i2 = indexCount;
                        c7869.m13229(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21568));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        c7869.m13228(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 6:
                        i2 = indexCount;
                        c7869.m13229(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7867.f21562));
                        break;
                    case 7:
                        i2 = indexCount;
                        c7869.m13229(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7867.f21561));
                        break;
                    case 8:
                        i2 = indexCount;
                        c7869.m13229(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21567));
                        break;
                    case 11:
                        i2 = indexCount;
                        c7869.m13229(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21556));
                        break;
                    case 12:
                        i2 = indexCount;
                        c7869.m13229(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21552));
                        break;
                    case 13:
                        i2 = indexCount;
                        c7869.m13229(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21560));
                        break;
                    case 14:
                        i2 = indexCount;
                        c7869.m13229(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21555));
                        break;
                    case 15:
                        i2 = indexCount;
                        c7869.m13229(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21551));
                        break;
                    case 16:
                        i2 = indexCount;
                        c7869.m13229(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21559));
                        break;
                    case 17:
                        i2 = indexCount;
                        c7869.m13229(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7867.f21575));
                        break;
                    case 18:
                        i2 = indexCount;
                        c7869.m13229(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7867.f21574));
                        break;
                    case 19:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7867.f21573), 19);
                        break;
                    case 20:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7867.f21581), 20);
                        break;
                    case 21:
                        i2 = indexCount;
                        c7869.m13229(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c7867.f21576));
                        break;
                    case 22:
                        i2 = indexCount;
                        c7869.m13229(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c7860.f21518)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        c7869.m13229(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c7867.f21577));
                        break;
                    case 24:
                        i2 = indexCount;
                        c7869.m13229(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21571));
                        break;
                    case 27:
                        i2 = indexCount;
                        c7869.m13229(27, typedArrayObtainStyledAttributes.getInt(index, c7867.f21572));
                        break;
                    case 28:
                        i2 = indexCount;
                        c7869.m13229(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21570));
                        break;
                    case 31:
                        i2 = indexCount;
                        c7869.m13229(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21558));
                        break;
                    case 34:
                        i2 = indexCount;
                        c7869.m13229(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21569));
                        break;
                    case 37:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7867.f21582), 37);
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c7870.f21643);
                        c7870.f21643 = resourceId;
                        c7869.m13229(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7867.f21549), 39);
                        break;
                    case 40:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7867.f21553), 40);
                        break;
                    case 41:
                        i2 = indexCount;
                        c7869.m13229(41, typedArrayObtainStyledAttributes.getInt(index, c7867.f21550));
                        break;
                    case 42:
                        i2 = indexCount;
                        c7869.m13229(42, typedArrayObtainStyledAttributes.getInt(index, c7867.f21611));
                        break;
                    case 43:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7860.f21516), 43);
                        break;
                    case 44:
                        i2 = indexCount;
                        c7869.m13227(44, true);
                        c7869.m13230(typedArrayObtainStyledAttributes.getDimension(index, c7859.f21508), 44);
                        break;
                    case 45:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7859.f21506), 45);
                        break;
                    case 46:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7859.f21505), 46);
                        break;
                    case 47:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7859.f21504), 47);
                        break;
                    case 48:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7859.f21503), 48);
                        break;
                    case 49:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getDimension(index, c7859.f21502), 49);
                        break;
                    case 50:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getDimension(index, c7859.f21510), 50);
                        break;
                    case 51:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getDimension(index, c7859.f21513), 51);
                        break;
                    case 52:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getDimension(index, c7859.f21514), 52);
                        break;
                    case 53:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getDimension(index, c7859.f21511), 53);
                        break;
                    case 54:
                        i2 = indexCount;
                        c7869.m13229(54, typedArrayObtainStyledAttributes.getInt(index, c7867.f21610));
                        break;
                    case 55:
                        i2 = indexCount;
                        c7869.m13229(55, typedArrayObtainStyledAttributes.getInt(index, c7867.f21614));
                        break;
                    case 56:
                        i2 = indexCount;
                        c7869.m13229(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21615));
                        break;
                    case 57:
                        i2 = indexCount;
                        c7869.m13229(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21612));
                        break;
                    case 58:
                        i2 = indexCount;
                        c7869.m13229(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21613));
                        break;
                    case 59:
                        i2 = indexCount;
                        c7869.m13229(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21602));
                        break;
                    case 60:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7859.f21507), 60);
                        break;
                    case 62:
                        i2 = indexCount;
                        c7869.m13229(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21564));
                        break;
                    case 63:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7867.f21563), 63);
                        break;
                    case 64:
                        i2 = indexCount;
                        c7869.m13229(64, m13215(typedArrayObtainStyledAttributes, index, c7868.f21622));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c7869.m13228(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c7869.m13228(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        c7869.m13229(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7868.f21618), 67);
                        break;
                    case 68:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7860.f21515), 68);
                        break;
                    case 69:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        c7869.m13229(72, typedArrayObtainStyledAttributes.getInt(index, c7867.f21599));
                        break;
                    case 73:
                        i2 = indexCount;
                        c7869.m13229(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21598));
                        break;
                    case 74:
                        i2 = indexCount;
                        c7869.m13228(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        c7869.m13227(75, typedArrayObtainStyledAttributes.getBoolean(index, c7867.f21606));
                        break;
                    case 76:
                        i2 = indexCount;
                        c7869.m13229(76, typedArrayObtainStyledAttributes.getInt(index, c7868.f21620));
                        break;
                    case 77:
                        i2 = indexCount;
                        c7869.m13228(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        c7869.m13229(78, typedArrayObtainStyledAttributes.getInt(index, c7860.f21517));
                        break;
                    case 79:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7868.f21619), 79);
                        break;
                    case 80:
                        i2 = indexCount;
                        c7869.m13227(80, typedArrayObtainStyledAttributes.getBoolean(index, c7867.f21604));
                        break;
                    case 81:
                        i2 = indexCount;
                        c7869.m13227(81, typedArrayObtainStyledAttributes.getBoolean(index, c7867.f21607));
                        break;
                    case 82:
                        i2 = indexCount;
                        c7869.m13229(82, typedArrayObtainStyledAttributes.getInteger(index, c7868.f21621));
                        break;
                    case 83:
                        i2 = indexCount;
                        c7869.m13229(83, m13215(typedArrayObtainStyledAttributes, index, c7859.f21509));
                        break;
                    case 84:
                        i2 = indexCount;
                        c7869.m13229(84, typedArrayObtainStyledAttributes.getInteger(index, c7868.f21624));
                        break;
                    case 85:
                        i2 = indexCount;
                        c7869.m13230(typedArrayObtainStyledAttributes.getFloat(index, c7868.f21617), 85);
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c7868.f21625 = resourceId2;
                            c7869.m13229(89, resourceId2);
                            if (c7868.f21625 != -1) {
                                c7869.m13229(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c7868.f21623 = string;
                            c7869.m13228(90, string);
                            if (c7868.f21623.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c7868.f21625 = resourceId3;
                                c7869.m13229(89, resourceId3);
                                c7869.m13229(88, -2);
                            } else {
                                c7869.m13229(88, -1);
                            }
                        } else {
                            c7869.m13229(88, typedArrayObtainStyledAttributes.getInteger(index, c7868.f21625));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        c7869.m13229(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21557));
                        break;
                    case 94:
                        i2 = indexCount;
                        c7869.m13229(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7867.f21554));
                        break;
                    case 95:
                        i2 = indexCount;
                        m13219(c7869, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        m13219(c7869, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        c7869.m13229(97, typedArrayObtainStyledAttributes.getInt(index, c7867.f21603));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = AbstractC2163.f6380;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c7870.f21643 = typedArrayObtainStyledAttributes.getResourceId(index, c7870.f21643);
                        }
                        break;
                    case 99:
                        i2 = indexCount;
                        c7869.m13227(99, typedArrayObtainStyledAttributes.getBoolean(index, c7867.f21592));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c7868.getClass();
                        c7867.getClass();
                        c7859.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c7867.f21590 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21590);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        c7867.f21568 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21568);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        c7867.f21589 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21589);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        c7867.f21585 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21585);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        c7867.f21566 = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        c7867.f21562 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c7867.f21562);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        c7867.f21561 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c7867.f21561);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        c7867.f21567 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21567);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        c7867.f21584 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21584);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        c7867.f21583 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21583);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        c7867.f21556 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21556);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        c7867.f21552 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21552);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        c7867.f21560 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21560);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        c7867.f21555 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21555);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        c7867.f21551 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21551);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        c7867.f21559 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21559);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        c7867.f21575 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c7867.f21575);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        c7867.f21574 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c7867.f21574);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        c7867.f21573 = typedArrayObtainStyledAttributes.getFloat(index2, c7867.f21573);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        c7867.f21581 = typedArrayObtainStyledAttributes.getFloat(index2, c7867.f21581);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        c7867.f21576 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c7867.f21576);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, c7860.f21518);
                        c7860.f21518 = i8;
                        c7860.f21518 = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        c7867.f21577 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c7867.f21577);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        c7867.f21571 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21571);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        c7867.f21591 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21591);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        c7867.f21595 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21595);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        c7867.f21572 = typedArrayObtainStyledAttributes.getInt(index2, c7867.f21572);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        c7867.f21570 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21570);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        c7867.f21596 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21596);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        c7867.f21593 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21593);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        c7867.f21558 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21558);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        c7867.f21580 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21580);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        c7867.f21579 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21579);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        c7867.f21569 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21569);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        c7867.f21586 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21586);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        c7867.f21594 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21594);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        c7867.f21582 = typedArrayObtainStyledAttributes.getFloat(index2, c7867.f21582);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        c7870.f21643 = typedArrayObtainStyledAttributes.getResourceId(index2, c7870.f21643);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        c7867.f21549 = typedArrayObtainStyledAttributes.getFloat(index2, c7867.f21549);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        c7867.f21553 = typedArrayObtainStyledAttributes.getFloat(index2, c7867.f21553);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        c7867.f21550 = typedArrayObtainStyledAttributes.getInt(index2, c7867.f21550);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        c7867.f21611 = typedArrayObtainStyledAttributes.getInt(index2, c7867.f21611);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        c7860.f21516 = typedArrayObtainStyledAttributes.getFloat(index2, c7860.f21516);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        c7859.f21512 = true;
                        c7859.f21508 = typedArrayObtainStyledAttributes.getDimension(index2, c7859.f21508);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        c7859.f21506 = typedArrayObtainStyledAttributes.getFloat(index2, c7859.f21506);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        c7859.f21505 = typedArrayObtainStyledAttributes.getFloat(index2, c7859.f21505);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        c7859.f21504 = typedArrayObtainStyledAttributes.getFloat(index2, c7859.f21504);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        c7859.f21503 = typedArrayObtainStyledAttributes.getFloat(index2, c7859.f21503);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        c7859.f21502 = typedArrayObtainStyledAttributes.getDimension(index2, c7859.f21502);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        c7859.f21510 = typedArrayObtainStyledAttributes.getDimension(index2, c7859.f21510);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        c7859.f21513 = typedArrayObtainStyledAttributes.getDimension(index2, c7859.f21513);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        c7859.f21514 = typedArrayObtainStyledAttributes.getDimension(index2, c7859.f21514);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        c7859.f21511 = typedArrayObtainStyledAttributes.getDimension(index2, c7859.f21511);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        c7867.f21610 = typedArrayObtainStyledAttributes.getInt(index2, c7867.f21610);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        c7867.f21614 = typedArrayObtainStyledAttributes.getInt(index2, c7867.f21614);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        c7867.f21615 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21615);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        c7867.f21612 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21612);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        c7867.f21613 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21613);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        c7867.f21602 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21602);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        c7859.f21507 = typedArrayObtainStyledAttributes.getFloat(index2, c7859.f21507);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        c7867.f21565 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21565);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        c7867.f21564 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21564);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        c7867.f21563 = typedArrayObtainStyledAttributes.getFloat(index2, c7867.f21563);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        c7868.f21622 = m13215(typedArrayObtainStyledAttributes, index2, c7868.f21622);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c7868.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c7868.getClass();
                            i7++;
                        }
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c7868.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        c7868.f21618 = typedArrayObtainStyledAttributes.getFloat(index2, c7868.f21618);
                        break;
                    case 68:
                        i = indexCount2;
                        c7860.f21515 = typedArrayObtainStyledAttributes.getFloat(index2, c7860.f21515);
                        break;
                    case 69:
                        i = indexCount2;
                        c7867.f21601 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        c7867.f21600 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        c7867.f21599 = typedArrayObtainStyledAttributes.getInt(index2, c7867.f21599);
                        break;
                    case 73:
                        i = indexCount2;
                        c7867.f21598 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21598);
                        break;
                    case 74:
                        i = indexCount2;
                        c7867.f21609 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        c7867.f21606 = typedArrayObtainStyledAttributes.getBoolean(index2, c7867.f21606);
                        break;
                    case 76:
                        i = indexCount2;
                        c7868.f21620 = typedArrayObtainStyledAttributes.getInt(index2, c7868.f21620);
                        break;
                    case 77:
                        i = indexCount2;
                        c7867.f21605 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        c7860.f21517 = typedArrayObtainStyledAttributes.getInt(index2, c7860.f21517);
                        break;
                    case 79:
                        i = indexCount2;
                        c7868.f21619 = typedArrayObtainStyledAttributes.getFloat(index2, c7868.f21619);
                        break;
                    case 80:
                        i = indexCount2;
                        c7867.f21604 = typedArrayObtainStyledAttributes.getBoolean(index2, c7867.f21604);
                        break;
                    case 81:
                        i = indexCount2;
                        c7867.f21607 = typedArrayObtainStyledAttributes.getBoolean(index2, c7867.f21607);
                        break;
                    case 82:
                        i = indexCount2;
                        c7868.f21621 = typedArrayObtainStyledAttributes.getInteger(index2, c7868.f21621);
                        break;
                    case 83:
                        i = indexCount2;
                        c7859.f21509 = m13215(typedArrayObtainStyledAttributes, index2, c7859.f21509);
                        break;
                    case 84:
                        i = indexCount2;
                        c7868.f21624 = typedArrayObtainStyledAttributes.getInteger(index2, c7868.f21624);
                        break;
                    case 85:
                        i = indexCount2;
                        c7868.f21617 = typedArrayObtainStyledAttributes.getFloat(index2, c7868.f21617);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            c7868.f21625 = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c7868.f21623 = string2;
                            if (string2.indexOf("/") > 0) {
                                c7868.f21625 = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c7868.f21625);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        c7867.f21587 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21587);
                        break;
                    case 92:
                        i = indexCount2;
                        c7867.f21588 = m13215(typedArrayObtainStyledAttributes, index2, c7867.f21588);
                        break;
                    case 93:
                        i = indexCount2;
                        c7867.f21557 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21557);
                        break;
                    case 94:
                        i = indexCount2;
                        c7867.f21554 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7867.f21554);
                        break;
                    case 95:
                        i = indexCount2;
                        m13219(c7867, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        m13219(c7867, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c7867.f21603 = typedArrayObtainStyledAttributes.getInt(index2, c7867.f21603);
                        break;
                }
                i7++;
            }
            if (c7867.f21609 != null) {
                c7867.f21608 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c7870;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int[] m13217(C7856 c7856, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c7856.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC7861.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c7856.isInEditMode() && (c7856.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c7856.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f6384;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f6384.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m13218(C7851 c7851, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c7851.f21433 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13219(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p199.C7863.m13219(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13220(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C7870 c7870M13216 = m13216(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c7870M13216.f21640.f21578 = true;
                    }
                    this.f21532.put(Integer.valueOf(c7870M13216.f21643), c7870M13216);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13221(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        C7863 c7863 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c7863.f21532;
        map2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            C7851 c7851 = (C7851) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c7863.f21533 && id == -1) {
                C2633.m5339("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new C7870());
            }
            C7870 c7870 = (C7870) map2.get(Integer.valueOf(id));
            if (c7870 == null) {
                i = childCount;
                map = map2;
                i2 = i3;
            } else {
                C7860 c7860 = c7870.f21642;
                C7867 c7867 = c7870.f21640;
                C7859 c7859 = c7870.f21639;
                i = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap map4 = c7863.f21534;
                for (String str : map4.keySet()) {
                    C7855 c7855 = (C7855) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C7855(c7855, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new C7855(c7855, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbM11585 = AbstractC6183.m11585(" Custom Attribute \"", str, "\" not found on ");
                        sbM11585.append(cls.getName());
                        Log.e("TransitionLayout", sbM11585.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbM115852 = AbstractC6183.m11585(" Custom Attribute \"", str, "\" not found on ");
                        sbM115852.append(cls.getName());
                        Log.e("TransitionLayout", sbM115852.toString(), e3);
                    }
                    map4 = map5;
                }
                c7870.f21638 = map3;
                c7870.f21643 = id;
                c7867.f21591 = c7851.f21437;
                c7867.f21595 = c7851.f21436;
                c7867.f21596 = c7851.f21455;
                c7867.f21593 = c7851.f21454;
                c7867.f21594 = c7851.f21458;
                c7867.f21586 = c7851.f21459;
                c7867.f21585 = c7851.f21456;
                c7867.f21589 = c7851.f21457;
                c7867.f21590 = c7851.f21449;
                c7867.f21587 = c7851.f21448;
                c7867.f21588 = c7851.f21452;
                c7867.f21580 = c7851.f21443;
                c7867.f21579 = c7851.f21442;
                c7867.f21583 = c7851.f21446;
                c7867.f21584 = c7851.f21447;
                c7867.f21581 = c7851.f21435;
                c7867.f21582 = c7851.f21434;
                c7867.f21566 = c7851.f21433;
                c7867.f21565 = c7851.f21453;
                c7867.f21564 = c7851.f21450;
                c7867.f21563 = c7851.f21451;
                c7867.f21562 = c7851.f21416;
                c7867.f21561 = c7851.f21412;
                c7867.f21572 = c7851.f21413;
                c7867.f21573 = c7851.f21439;
                c7867.f21575 = c7851.f21441;
                c7867.f21574 = c7851.f21440;
                c7867.f21577 = ((ViewGroup.MarginLayoutParams) c7851).width;
                c7867.f21576 = ((ViewGroup.MarginLayoutParams) c7851).height;
                c7867.f21571 = ((ViewGroup.MarginLayoutParams) c7851).leftMargin;
                c7867.f21570 = ((ViewGroup.MarginLayoutParams) c7851).rightMargin;
                c7867.f21569 = ((ViewGroup.MarginLayoutParams) c7851).topMargin;
                c7867.f21568 = ((ViewGroup.MarginLayoutParams) c7851).bottomMargin;
                c7867.f21557 = c7851.f21424;
                c7867.f21553 = c7851.f21431;
                c7867.f21549 = c7851.f21432;
                c7867.f21611 = c7851.f21421;
                c7867.f21550 = c7851.f21430;
                c7867.f21604 = c7851.f21475;
                c7867.f21607 = c7851.f21474;
                c7867.f21610 = c7851.f21420;
                c7867.f21614 = c7851.f21423;
                c7867.f21615 = c7851.f21419;
                c7867.f21612 = c7851.f21415;
                c7867.f21613 = c7851.f21422;
                c7867.f21602 = c7851.f21418;
                c7867.f21601 = c7851.f21414;
                c7867.f21600 = c7851.f21417;
                c7867.f21605 = c7851.f21478;
                c7867.f21559 = c7851.f21445;
                c7867.f21556 = c7851.f21428;
                c7867.f21560 = c7851.f21444;
                c7867.f21555 = c7851.f21429;
                c7867.f21551 = c7851.f21427;
                c7867.f21552 = c7851.f21426;
                c7867.f21554 = c7851.f21425;
                c7867.f21603 = c7851.f21479;
                c7867.f21567 = c7851.getMarginEnd();
                c7867.f21558 = c7851.getMarginStart();
                c7860.f21518 = childAt.getVisibility();
                c7860.f21516 = childAt.getAlpha();
                c7859.f21507 = childAt.getRotation();
                c7859.f21506 = childAt.getRotationX();
                c7859.f21505 = childAt.getRotationY();
                c7859.f21504 = childAt.getScaleX();
                c7859.f21503 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c7859.f21502 = pivotX;
                    c7859.f21510 = pivotY;
                }
                c7859.f21513 = childAt.getTranslationX();
                c7859.f21514 = childAt.getTranslationY();
                c7859.f21511 = childAt.getTranslationZ();
                if (c7859.f21512) {
                    c7859.f21508 = childAt.getElevation();
                }
                if (childAt instanceof C7856) {
                    C7856 c7856 = (C7856) childAt;
                    c7867.f21606 = c7856.getAllowsGoneWidget();
                    c7867.f21608 = c7856.getReferencedIds();
                    c7867.f21599 = c7856.getType();
                    c7867.f21598 = c7856.getMargin();
                }
            }
            i3 = i2 + 1;
            c7863 = this;
            childCount = i;
            map2 = map;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13222(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        C7863 c7863 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c7863.f21532;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c7863.f21533 && id == -1) {
                    C2633.m5339("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C7870 c7870 = (C7870) map2.get(Integer.valueOf(id));
                        if (c7870 != null) {
                            C7860 c7860 = c7870.f21642;
                            C7867 c7867 = c7870.f21640;
                            C7859 c7859 = c7870.f21639;
                            if (childAt instanceof C7856) {
                                c7867.f21597 = 1;
                                C7856 c7856 = (C7856) childAt;
                                c7856.setId(id);
                                c7856.setType(c7867.f21599);
                                c7856.setMargin(c7867.f21598);
                                c7856.setAllowsGoneWidget(c7867.f21606);
                                int[] iArr = c7867.f21608;
                                if (iArr != null) {
                                    c7856.setReferencedIds(iArr);
                                } else {
                                    String str = c7867.f21609;
                                    if (str != null) {
                                        int[] iArrM13217 = m13217(c7856, str);
                                        c7867.f21608 = iArrM13217;
                                        c7856.setReferencedIds(iArrM13217);
                                    }
                                }
                            }
                            C7851 c7851 = (C7851) childAt.getLayoutParams();
                            c7851.m13202();
                            c7870.m13231(c7851);
                            HashMap map3 = c7870.f21638;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                C7855 c7855 = (C7855) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strM157 = !c7855.f21494 ? AbstractC0053.m157("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iOrdinal = c7855.f21493.ordinal();
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iOrdinal) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strM157, cls3).invoke(childAt, Integer.valueOf(c7855.f21492));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strM157, cls2).invoke(childAt, Float.valueOf(c7855.f21491));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strM157, cls3).invoke(childAt, Integer.valueOf(c7855.f21495));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strM157, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c7855.f21495);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                StringBuilder sbM11585 = AbstractC6183.m11585(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM11585.append(cls.getName());
                                                Log.e("TransitionLayout", sbM11585.toString(), e);
                                            } catch (NoSuchMethodException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strM157, e);
                                            } catch (InvocationTargetException e3) {
                                                e = e3;
                                                StringBuilder sbM115852 = AbstractC6183.m11585(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM115852.append(cls.getName());
                                                Log.e("TransitionLayout", sbM115852.toString(), e);
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strM157, CharSequence.class).invoke(childAt, c7855.f21490);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strM157, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c7855.f21489));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strM157, cls2).invoke(childAt, Float.valueOf(c7855.f21491));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strM157, cls3).invoke(childAt, Integer.valueOf(c7855.f21492));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e4) {
                                    e = e4;
                                    map = map3;
                                } catch (NoSuchMethodException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (InvocationTargetException e6) {
                                    e = e6;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i2 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i2;
                            childAt.setLayoutParams(c7851);
                            if (c7860.f21517 == 0) {
                                childAt.setVisibility(c7860.f21518);
                            }
                            childAt.setAlpha(c7860.f21516);
                            childAt.setRotation(c7859.f21507);
                            childAt.setRotationX(c7859.f21506);
                            childAt.setRotationY(c7859.f21505);
                            childAt.setScaleX(c7859.f21504);
                            childAt.setScaleY(c7859.f21503);
                            if (c7859.f21509 != -1) {
                                if (((View) childAt.getParent()).findViewById(c7859.f21509) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c7859.f21502)) {
                                    childAt.setPivotX(c7859.f21502);
                                }
                                if (!Float.isNaN(c7859.f21510)) {
                                    childAt.setPivotY(c7859.f21510);
                                }
                            }
                            childAt.setTranslationX(c7859.f21513);
                            childAt.setTranslationY(c7859.f21514);
                            childAt.setTranslationZ(c7859.f21511);
                            if (c7859.f21512) {
                                childAt.setElevation(c7859.f21508);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                c7863 = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            c7863 = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C7870 c78702 = (C7870) map2.get(num);
            if (c78702 != null) {
                C7867 c78672 = c78702.f21640;
                if (c78672.f21597 == 1) {
                    Context context = constraintLayout.getContext();
                    C7856 c78562 = new C7856(context);
                    c78562.f21488 = new int[32];
                    c78562.f21485 = new HashMap();
                    c78562.f21487 = context;
                    C7883 c7883 = new C7883();
                    c7883.f21789 = 0;
                    c7883.f21788 = true;
                    c7883.f21787 = 0;
                    c7883.f21786 = false;
                    c78562.f21496 = c7883;
                    c78562.f21483 = c7883;
                    c78562.m13210();
                    c78562.setVisibility(8);
                    c78562.setId(num.intValue());
                    int[] iArr2 = c78672.f21608;
                    if (iArr2 != null) {
                        c78562.setReferencedIds(iArr2);
                    } else {
                        String str3 = c78672.f21609;
                        if (str3 != null) {
                            int[] iArrM132172 = m13217(c78562, str3);
                            c78672.f21608 = iArrM132172;
                            c78562.setReferencedIds(iArrM132172);
                        }
                    }
                    c78562.setType(c78672.f21599);
                    c78562.setMargin(c78672.f21598);
                    C7851 c7851M3923 = ConstraintLayout.m3923();
                    c78562.m13210();
                    c78702.m13231(c7851M3923);
                    constraintLayout.addView(c78562, c7851M3923);
                }
                if (c78672.f21578) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C7851 c7851M39232 = ConstraintLayout.m3923();
                    c78702.m13231(c7851M39232);
                    constraintLayout.addView(guideline, c7851M39232);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof AbstractC7854) {
                ((AbstractC7854) childAt2).mo13204(constraintLayout);
            }
        }
    }
}
