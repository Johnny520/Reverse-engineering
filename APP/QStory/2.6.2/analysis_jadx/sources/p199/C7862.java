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
import bsh.C2632;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import p007.AbstractC6136;
import p202.AbstractC7876;
import p203.C7882;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final SparseIntArray f21532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final SparseIntArray f21533;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f21534 = {0, 4, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f21537 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f21536 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f21535 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21533 = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f21532 = sparseIntArray2;
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
    public static int m13187(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C7869 m13188(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        C7869 c7869 = new C7869();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? AbstractC7861.f21525 : AbstractC7861.f21527);
        C7859 c7859 = c7869.f21645;
        C7858 c7858 = c7869.f21642;
        C7867 c7867 = c7869.f21644;
        C7866 c7866 = c7869.f21643;
        int[] iArr = f21534;
        String[] strArr = AbstractC7876.f21671;
        SparseIntArray sparseIntArray = f21533;
        if (z) {
            C7868 c7868 = new C7868();
            c7868.f21634 = new int[10];
            c7868.f21633 = new int[10];
            c7868.f21632 = 0;
            c7868.f21631 = new int[10];
            c7868.f21630 = new float[10];
            c7868.f21629 = 0;
            c7868.f21636 = new int[5];
            c7868.f21635 = new String[5];
            c7868.f21639 = 0;
            c7868.f21640 = new int[4];
            c7868.f21637 = new boolean[4];
            c7868.f21638 = 0;
            c7867.getClass();
            c7866.getClass();
            c7858.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f21532.get(index)) {
                    case 2:
                        i2 = indexCount;
                        c7868.m13201(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21571));
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
                        c7868.m13200(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 6:
                        i2 = indexCount;
                        c7868.m13201(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7866.f21565));
                        break;
                    case 7:
                        i2 = indexCount;
                        c7868.m13201(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7866.f21564));
                        break;
                    case 8:
                        i2 = indexCount;
                        c7868.m13201(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21570));
                        break;
                    case 11:
                        i2 = indexCount;
                        c7868.m13201(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21559));
                        break;
                    case 12:
                        i2 = indexCount;
                        c7868.m13201(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21555));
                        break;
                    case 13:
                        i2 = indexCount;
                        c7868.m13201(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21563));
                        break;
                    case 14:
                        i2 = indexCount;
                        c7868.m13201(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21558));
                        break;
                    case 15:
                        i2 = indexCount;
                        c7868.m13201(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21554));
                        break;
                    case 16:
                        i2 = indexCount;
                        c7868.m13201(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21562));
                        break;
                    case 17:
                        i2 = indexCount;
                        c7868.m13201(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7866.f21578));
                        break;
                    case 18:
                        i2 = indexCount;
                        c7868.m13201(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7866.f21577));
                        break;
                    case 19:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7866.f21576), 19);
                        break;
                    case 20:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7866.f21584), 20);
                        break;
                    case 21:
                        i2 = indexCount;
                        c7868.m13201(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c7866.f21579));
                        break;
                    case 22:
                        i2 = indexCount;
                        c7868.m13201(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c7859.f21521)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        c7868.m13201(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c7866.f21580));
                        break;
                    case 24:
                        i2 = indexCount;
                        c7868.m13201(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21574));
                        break;
                    case 27:
                        i2 = indexCount;
                        c7868.m13201(27, typedArrayObtainStyledAttributes.getInt(index, c7866.f21575));
                        break;
                    case 28:
                        i2 = indexCount;
                        c7868.m13201(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21573));
                        break;
                    case 31:
                        i2 = indexCount;
                        c7868.m13201(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21561));
                        break;
                    case 34:
                        i2 = indexCount;
                        c7868.m13201(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21572));
                        break;
                    case 37:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7866.f21585), 37);
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c7869.f21646);
                        c7869.f21646 = resourceId;
                        c7868.m13201(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7866.f21552), 39);
                        break;
                    case 40:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7866.f21556), 40);
                        break;
                    case 41:
                        i2 = indexCount;
                        c7868.m13201(41, typedArrayObtainStyledAttributes.getInt(index, c7866.f21553));
                        break;
                    case 42:
                        i2 = indexCount;
                        c7868.m13201(42, typedArrayObtainStyledAttributes.getInt(index, c7866.f21614));
                        break;
                    case 43:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7859.f21519), 43);
                        break;
                    case 44:
                        i2 = indexCount;
                        c7868.m13199(44, true);
                        c7868.m13202(typedArrayObtainStyledAttributes.getDimension(index, c7858.f21511), 44);
                        break;
                    case 45:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7858.f21509), 45);
                        break;
                    case 46:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7858.f21508), 46);
                        break;
                    case 47:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7858.f21507), 47);
                        break;
                    case 48:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7858.f21506), 48);
                        break;
                    case 49:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getDimension(index, c7858.f21505), 49);
                        break;
                    case 50:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getDimension(index, c7858.f21513), 50);
                        break;
                    case 51:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getDimension(index, c7858.f21516), 51);
                        break;
                    case 52:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getDimension(index, c7858.f21517), 52);
                        break;
                    case 53:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getDimension(index, c7858.f21514), 53);
                        break;
                    case 54:
                        i2 = indexCount;
                        c7868.m13201(54, typedArrayObtainStyledAttributes.getInt(index, c7866.f21613));
                        break;
                    case 55:
                        i2 = indexCount;
                        c7868.m13201(55, typedArrayObtainStyledAttributes.getInt(index, c7866.f21617));
                        break;
                    case 56:
                        i2 = indexCount;
                        c7868.m13201(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21618));
                        break;
                    case 57:
                        i2 = indexCount;
                        c7868.m13201(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21615));
                        break;
                    case 58:
                        i2 = indexCount;
                        c7868.m13201(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21616));
                        break;
                    case 59:
                        i2 = indexCount;
                        c7868.m13201(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21605));
                        break;
                    case 60:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7858.f21510), 60);
                        break;
                    case 62:
                        i2 = indexCount;
                        c7868.m13201(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21567));
                        break;
                    case 63:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7866.f21566), 63);
                        break;
                    case 64:
                        i2 = indexCount;
                        c7868.m13201(64, m13187(typedArrayObtainStyledAttributes, index, c7867.f21625));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c7868.m13200(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c7868.m13200(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        c7868.m13201(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7867.f21621), 67);
                        break;
                    case 68:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7859.f21518), 68);
                        break;
                    case 69:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        c7868.m13201(72, typedArrayObtainStyledAttributes.getInt(index, c7866.f21602));
                        break;
                    case 73:
                        i2 = indexCount;
                        c7868.m13201(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21601));
                        break;
                    case 74:
                        i2 = indexCount;
                        c7868.m13200(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        c7868.m13199(75, typedArrayObtainStyledAttributes.getBoolean(index, c7866.f21609));
                        break;
                    case 76:
                        i2 = indexCount;
                        c7868.m13201(76, typedArrayObtainStyledAttributes.getInt(index, c7867.f21623));
                        break;
                    case 77:
                        i2 = indexCount;
                        c7868.m13200(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        c7868.m13201(78, typedArrayObtainStyledAttributes.getInt(index, c7859.f21520));
                        break;
                    case 79:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7867.f21622), 79);
                        break;
                    case 80:
                        i2 = indexCount;
                        c7868.m13199(80, typedArrayObtainStyledAttributes.getBoolean(index, c7866.f21607));
                        break;
                    case 81:
                        i2 = indexCount;
                        c7868.m13199(81, typedArrayObtainStyledAttributes.getBoolean(index, c7866.f21610));
                        break;
                    case 82:
                        i2 = indexCount;
                        c7868.m13201(82, typedArrayObtainStyledAttributes.getInteger(index, c7867.f21624));
                        break;
                    case 83:
                        i2 = indexCount;
                        c7868.m13201(83, m13187(typedArrayObtainStyledAttributes, index, c7858.f21512));
                        break;
                    case 84:
                        i2 = indexCount;
                        c7868.m13201(84, typedArrayObtainStyledAttributes.getInteger(index, c7867.f21627));
                        break;
                    case 85:
                        i2 = indexCount;
                        c7868.m13202(typedArrayObtainStyledAttributes.getFloat(index, c7867.f21620), 85);
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c7867.f21628 = resourceId2;
                            c7868.m13201(89, resourceId2);
                            if (c7867.f21628 != -1) {
                                c7868.m13201(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c7867.f21626 = string;
                            c7868.m13200(90, string);
                            if (c7867.f21626.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c7867.f21628 = resourceId3;
                                c7868.m13201(89, resourceId3);
                                c7868.m13201(88, -2);
                            } else {
                                c7868.m13201(88, -1);
                            }
                        } else {
                            c7868.m13201(88, typedArrayObtainStyledAttributes.getInteger(index, c7867.f21628));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        c7868.m13201(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21560));
                        break;
                    case 94:
                        i2 = indexCount;
                        c7868.m13201(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7866.f21557));
                        break;
                    case 95:
                        i2 = indexCount;
                        m13191(c7868, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        m13191(c7868, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        c7868.m13201(97, typedArrayObtainStyledAttributes.getInt(index, c7866.f21606));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = AbstractC2163.f6379;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c7869.f21646 = typedArrayObtainStyledAttributes.getResourceId(index, c7869.f21646);
                        }
                        break;
                    case 99:
                        i2 = indexCount;
                        c7868.m13199(99, typedArrayObtainStyledAttributes.getBoolean(index, c7866.f21595));
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
                        c7867.getClass();
                        c7866.getClass();
                        c7858.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c7866.f21593 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21593);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        c7866.f21571 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21571);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        c7866.f21592 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21592);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        c7866.f21588 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21588);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        c7866.f21569 = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        c7866.f21565 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c7866.f21565);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        c7866.f21564 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c7866.f21564);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        c7866.f21570 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21570);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        c7866.f21587 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21587);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        c7866.f21586 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21586);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        c7866.f21559 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21559);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        c7866.f21555 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21555);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        c7866.f21563 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21563);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        c7866.f21558 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21558);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        c7866.f21554 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21554);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        c7866.f21562 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21562);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        c7866.f21578 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c7866.f21578);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        c7866.f21577 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c7866.f21577);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        c7866.f21576 = typedArrayObtainStyledAttributes.getFloat(index2, c7866.f21576);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        c7866.f21584 = typedArrayObtainStyledAttributes.getFloat(index2, c7866.f21584);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        c7866.f21579 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c7866.f21579);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, c7859.f21521);
                        c7859.f21521 = i8;
                        c7859.f21521 = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        c7866.f21580 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c7866.f21580);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        c7866.f21574 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21574);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        c7866.f21594 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21594);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        c7866.f21598 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21598);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        c7866.f21575 = typedArrayObtainStyledAttributes.getInt(index2, c7866.f21575);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        c7866.f21573 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21573);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        c7866.f21599 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21599);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        c7866.f21596 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21596);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        c7866.f21561 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21561);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        c7866.f21583 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21583);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        c7866.f21582 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21582);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        c7866.f21572 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21572);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        c7866.f21589 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21589);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        c7866.f21597 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21597);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        c7866.f21585 = typedArrayObtainStyledAttributes.getFloat(index2, c7866.f21585);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        c7869.f21646 = typedArrayObtainStyledAttributes.getResourceId(index2, c7869.f21646);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        c7866.f21552 = typedArrayObtainStyledAttributes.getFloat(index2, c7866.f21552);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        c7866.f21556 = typedArrayObtainStyledAttributes.getFloat(index2, c7866.f21556);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        c7866.f21553 = typedArrayObtainStyledAttributes.getInt(index2, c7866.f21553);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        c7866.f21614 = typedArrayObtainStyledAttributes.getInt(index2, c7866.f21614);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        c7859.f21519 = typedArrayObtainStyledAttributes.getFloat(index2, c7859.f21519);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        c7858.f21515 = true;
                        c7858.f21511 = typedArrayObtainStyledAttributes.getDimension(index2, c7858.f21511);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        c7858.f21509 = typedArrayObtainStyledAttributes.getFloat(index2, c7858.f21509);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        c7858.f21508 = typedArrayObtainStyledAttributes.getFloat(index2, c7858.f21508);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        c7858.f21507 = typedArrayObtainStyledAttributes.getFloat(index2, c7858.f21507);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        c7858.f21506 = typedArrayObtainStyledAttributes.getFloat(index2, c7858.f21506);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        c7858.f21505 = typedArrayObtainStyledAttributes.getDimension(index2, c7858.f21505);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        c7858.f21513 = typedArrayObtainStyledAttributes.getDimension(index2, c7858.f21513);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        c7858.f21516 = typedArrayObtainStyledAttributes.getDimension(index2, c7858.f21516);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        c7858.f21517 = typedArrayObtainStyledAttributes.getDimension(index2, c7858.f21517);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        c7858.f21514 = typedArrayObtainStyledAttributes.getDimension(index2, c7858.f21514);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        c7866.f21613 = typedArrayObtainStyledAttributes.getInt(index2, c7866.f21613);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        c7866.f21617 = typedArrayObtainStyledAttributes.getInt(index2, c7866.f21617);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        c7866.f21618 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21618);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        c7866.f21615 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21615);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        c7866.f21616 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21616);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        c7866.f21605 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21605);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        c7858.f21510 = typedArrayObtainStyledAttributes.getFloat(index2, c7858.f21510);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        c7866.f21568 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21568);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        c7866.f21567 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21567);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        c7866.f21566 = typedArrayObtainStyledAttributes.getFloat(index2, c7866.f21566);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        c7867.f21625 = m13187(typedArrayObtainStyledAttributes, index2, c7867.f21625);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c7867.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c7867.getClass();
                            i7++;
                        }
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c7867.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        c7867.f21621 = typedArrayObtainStyledAttributes.getFloat(index2, c7867.f21621);
                        break;
                    case 68:
                        i = indexCount2;
                        c7859.f21518 = typedArrayObtainStyledAttributes.getFloat(index2, c7859.f21518);
                        break;
                    case 69:
                        i = indexCount2;
                        c7866.f21604 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        c7866.f21603 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        c7866.f21602 = typedArrayObtainStyledAttributes.getInt(index2, c7866.f21602);
                        break;
                    case 73:
                        i = indexCount2;
                        c7866.f21601 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21601);
                        break;
                    case 74:
                        i = indexCount2;
                        c7866.f21612 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        c7866.f21609 = typedArrayObtainStyledAttributes.getBoolean(index2, c7866.f21609);
                        break;
                    case 76:
                        i = indexCount2;
                        c7867.f21623 = typedArrayObtainStyledAttributes.getInt(index2, c7867.f21623);
                        break;
                    case 77:
                        i = indexCount2;
                        c7866.f21608 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        c7859.f21520 = typedArrayObtainStyledAttributes.getInt(index2, c7859.f21520);
                        break;
                    case 79:
                        i = indexCount2;
                        c7867.f21622 = typedArrayObtainStyledAttributes.getFloat(index2, c7867.f21622);
                        break;
                    case 80:
                        i = indexCount2;
                        c7866.f21607 = typedArrayObtainStyledAttributes.getBoolean(index2, c7866.f21607);
                        break;
                    case 81:
                        i = indexCount2;
                        c7866.f21610 = typedArrayObtainStyledAttributes.getBoolean(index2, c7866.f21610);
                        break;
                    case 82:
                        i = indexCount2;
                        c7867.f21624 = typedArrayObtainStyledAttributes.getInteger(index2, c7867.f21624);
                        break;
                    case 83:
                        i = indexCount2;
                        c7858.f21512 = m13187(typedArrayObtainStyledAttributes, index2, c7858.f21512);
                        break;
                    case 84:
                        i = indexCount2;
                        c7867.f21627 = typedArrayObtainStyledAttributes.getInteger(index2, c7867.f21627);
                        break;
                    case 85:
                        i = indexCount2;
                        c7867.f21620 = typedArrayObtainStyledAttributes.getFloat(index2, c7867.f21620);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            c7867.f21628 = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c7867.f21626 = string2;
                            if (string2.indexOf("/") > 0) {
                                c7867.f21628 = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c7867.f21628);
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
                        c7866.f21590 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21590);
                        break;
                    case 92:
                        i = indexCount2;
                        c7866.f21591 = m13187(typedArrayObtainStyledAttributes, index2, c7866.f21591);
                        break;
                    case 93:
                        i = indexCount2;
                        c7866.f21560 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21560);
                        break;
                    case 94:
                        i = indexCount2;
                        c7866.f21557 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c7866.f21557);
                        break;
                    case 95:
                        i = indexCount2;
                        m13191(c7866, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        m13191(c7866, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c7866.f21606 = typedArrayObtainStyledAttributes.getInt(index2, c7866.f21606);
                        break;
                }
                i7++;
            }
            if (c7866.f21612 != null) {
                c7866.f21611 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c7869;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int[] m13189(C7855 c7855, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c7855.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC7860.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c7855.isInEditMode() && (c7855.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c7855.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f6383;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f6383.get(strTrim);
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
    public static void m13190(C7850 c7850, String str) {
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
        c7850.f21436 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13191(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p199.C7862.m13191(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13192(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C7869 c7869M13188 = m13188(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c7869M13188.f21643.f21581 = true;
                    }
                    this.f21535.put(Integer.valueOf(c7869M13188.f21646), c7869M13188);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13193(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        C7862 c7862 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c7862.f21535;
        map2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            C7850 c7850 = (C7850) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c7862.f21536 && id == -1) {
                C2632.m5294("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new C7869());
            }
            C7869 c7869 = (C7869) map2.get(Integer.valueOf(id));
            if (c7869 == null) {
                i = childCount;
                map = map2;
                i2 = i3;
            } else {
                C7859 c7859 = c7869.f21645;
                C7866 c7866 = c7869.f21643;
                C7858 c7858 = c7869.f21642;
                i = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap map4 = c7862.f21537;
                for (String str : map4.keySet()) {
                    C7854 c7854 = (C7854) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C7854(c7854, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new C7854(c7854, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbM11550 = AbstractC6136.m11550(" Custom Attribute \"", str, "\" not found on ");
                        sbM11550.append(cls.getName());
                        Log.e("TransitionLayout", sbM11550.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbM115502 = AbstractC6136.m11550(" Custom Attribute \"", str, "\" not found on ");
                        sbM115502.append(cls.getName());
                        Log.e("TransitionLayout", sbM115502.toString(), e3);
                    }
                    map4 = map5;
                }
                c7869.f21641 = map3;
                c7869.f21646 = id;
                c7866.f21594 = c7850.f21440;
                c7866.f21598 = c7850.f21439;
                c7866.f21599 = c7850.f21458;
                c7866.f21596 = c7850.f21457;
                c7866.f21597 = c7850.f21461;
                c7866.f21589 = c7850.f21462;
                c7866.f21588 = c7850.f21459;
                c7866.f21592 = c7850.f21460;
                c7866.f21593 = c7850.f21452;
                c7866.f21590 = c7850.f21451;
                c7866.f21591 = c7850.f21455;
                c7866.f21583 = c7850.f21446;
                c7866.f21582 = c7850.f21445;
                c7866.f21586 = c7850.f21449;
                c7866.f21587 = c7850.f21450;
                c7866.f21584 = c7850.f21438;
                c7866.f21585 = c7850.f21437;
                c7866.f21569 = c7850.f21436;
                c7866.f21568 = c7850.f21456;
                c7866.f21567 = c7850.f21453;
                c7866.f21566 = c7850.f21454;
                c7866.f21565 = c7850.f21419;
                c7866.f21564 = c7850.f21415;
                c7866.f21575 = c7850.f21416;
                c7866.f21576 = c7850.f21442;
                c7866.f21578 = c7850.f21444;
                c7866.f21577 = c7850.f21443;
                c7866.f21580 = ((ViewGroup.MarginLayoutParams) c7850).width;
                c7866.f21579 = ((ViewGroup.MarginLayoutParams) c7850).height;
                c7866.f21574 = ((ViewGroup.MarginLayoutParams) c7850).leftMargin;
                c7866.f21573 = ((ViewGroup.MarginLayoutParams) c7850).rightMargin;
                c7866.f21572 = ((ViewGroup.MarginLayoutParams) c7850).topMargin;
                c7866.f21571 = ((ViewGroup.MarginLayoutParams) c7850).bottomMargin;
                c7866.f21560 = c7850.f21427;
                c7866.f21556 = c7850.f21434;
                c7866.f21552 = c7850.f21435;
                c7866.f21614 = c7850.f21424;
                c7866.f21553 = c7850.f21433;
                c7866.f21607 = c7850.f21478;
                c7866.f21610 = c7850.f21477;
                c7866.f21613 = c7850.f21423;
                c7866.f21617 = c7850.f21426;
                c7866.f21618 = c7850.f21422;
                c7866.f21615 = c7850.f21418;
                c7866.f21616 = c7850.f21425;
                c7866.f21605 = c7850.f21421;
                c7866.f21604 = c7850.f21417;
                c7866.f21603 = c7850.f21420;
                c7866.f21608 = c7850.f21481;
                c7866.f21562 = c7850.f21448;
                c7866.f21559 = c7850.f21431;
                c7866.f21563 = c7850.f21447;
                c7866.f21558 = c7850.f21432;
                c7866.f21554 = c7850.f21430;
                c7866.f21555 = c7850.f21429;
                c7866.f21557 = c7850.f21428;
                c7866.f21606 = c7850.f21482;
                c7866.f21570 = c7850.getMarginEnd();
                c7866.f21561 = c7850.getMarginStart();
                c7859.f21521 = childAt.getVisibility();
                c7859.f21519 = childAt.getAlpha();
                c7858.f21510 = childAt.getRotation();
                c7858.f21509 = childAt.getRotationX();
                c7858.f21508 = childAt.getRotationY();
                c7858.f21507 = childAt.getScaleX();
                c7858.f21506 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c7858.f21505 = pivotX;
                    c7858.f21513 = pivotY;
                }
                c7858.f21516 = childAt.getTranslationX();
                c7858.f21517 = childAt.getTranslationY();
                c7858.f21514 = childAt.getTranslationZ();
                if (c7858.f21515) {
                    c7858.f21511 = childAt.getElevation();
                }
                if (childAt instanceof C7855) {
                    C7855 c7855 = (C7855) childAt;
                    c7866.f21609 = c7855.getAllowsGoneWidget();
                    c7866.f21611 = c7855.getReferencedIds();
                    c7866.f21602 = c7855.getType();
                    c7866.f21601 = c7855.getMargin();
                }
            }
            i3 = i2 + 1;
            c7862 = this;
            childCount = i;
            map2 = map;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13194(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        C7862 c7862 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c7862.f21535;
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
                if (c7862.f21536 && id == -1) {
                    C2632.m5294("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C7869 c7869 = (C7869) map2.get(Integer.valueOf(id));
                        if (c7869 != null) {
                            C7859 c7859 = c7869.f21645;
                            C7866 c7866 = c7869.f21643;
                            C7858 c7858 = c7869.f21642;
                            if (childAt instanceof C7855) {
                                c7866.f21600 = 1;
                                C7855 c7855 = (C7855) childAt;
                                c7855.setId(id);
                                c7855.setType(c7866.f21602);
                                c7855.setMargin(c7866.f21601);
                                c7855.setAllowsGoneWidget(c7866.f21609);
                                int[] iArr = c7866.f21611;
                                if (iArr != null) {
                                    c7855.setReferencedIds(iArr);
                                } else {
                                    String str = c7866.f21612;
                                    if (str != null) {
                                        int[] iArrM13189 = m13189(c7855, str);
                                        c7866.f21611 = iArrM13189;
                                        c7855.setReferencedIds(iArrM13189);
                                    }
                                }
                            }
                            C7850 c7850 = (C7850) childAt.getLayoutParams();
                            c7850.m13174();
                            c7869.m13203(c7850);
                            HashMap map3 = c7869.f21641;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                C7854 c7854 = (C7854) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strM152 = !c7854.f21497 ? AbstractC0053.m152("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iOrdinal = c7854.f21496.ordinal();
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iOrdinal) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strM152, cls3).invoke(childAt, Integer.valueOf(c7854.f21495));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strM152, cls2).invoke(childAt, Float.valueOf(c7854.f21494));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strM152, cls3).invoke(childAt, Integer.valueOf(c7854.f21498));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strM152, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c7854.f21498);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                StringBuilder sbM11550 = AbstractC6136.m11550(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM11550.append(cls.getName());
                                                Log.e("TransitionLayout", sbM11550.toString(), e);
                                            } catch (NoSuchMethodException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strM152, e);
                                            } catch (InvocationTargetException e3) {
                                                e = e3;
                                                StringBuilder sbM115502 = AbstractC6136.m11550(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM115502.append(cls.getName());
                                                Log.e("TransitionLayout", sbM115502.toString(), e);
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strM152, CharSequence.class).invoke(childAt, c7854.f21493);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strM152, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c7854.f21492));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strM152, cls2).invoke(childAt, Float.valueOf(c7854.f21494));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strM152, cls3).invoke(childAt, Integer.valueOf(c7854.f21495));
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
                            childAt.setLayoutParams(c7850);
                            if (c7859.f21520 == 0) {
                                childAt.setVisibility(c7859.f21521);
                            }
                            childAt.setAlpha(c7859.f21519);
                            childAt.setRotation(c7858.f21510);
                            childAt.setRotationX(c7858.f21509);
                            childAt.setRotationY(c7858.f21508);
                            childAt.setScaleX(c7858.f21507);
                            childAt.setScaleY(c7858.f21506);
                            if (c7858.f21512 != -1) {
                                if (((View) childAt.getParent()).findViewById(c7858.f21512) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c7858.f21505)) {
                                    childAt.setPivotX(c7858.f21505);
                                }
                                if (!Float.isNaN(c7858.f21513)) {
                                    childAt.setPivotY(c7858.f21513);
                                }
                            }
                            childAt.setTranslationX(c7858.f21516);
                            childAt.setTranslationY(c7858.f21517);
                            childAt.setTranslationZ(c7858.f21514);
                            if (c7858.f21515) {
                                childAt.setElevation(c7858.f21511);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                c7862 = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            c7862 = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C7869 c78692 = (C7869) map2.get(num);
            if (c78692 != null) {
                C7866 c78662 = c78692.f21643;
                if (c78662.f21600 == 1) {
                    Context context = constraintLayout.getContext();
                    C7855 c78552 = new C7855(context);
                    c78552.f21491 = new int[32];
                    c78552.f21488 = new HashMap();
                    c78552.f21490 = context;
                    C7882 c7882 = new C7882();
                    c7882.f21792 = 0;
                    c7882.f21791 = true;
                    c7882.f21790 = 0;
                    c7882.f21789 = false;
                    c78552.f21499 = c7882;
                    c78552.f21486 = c7882;
                    c78552.m13182();
                    c78552.setVisibility(8);
                    c78552.setId(num.intValue());
                    int[] iArr2 = c78662.f21611;
                    if (iArr2 != null) {
                        c78552.setReferencedIds(iArr2);
                    } else {
                        String str3 = c78662.f21612;
                        if (str3 != null) {
                            int[] iArrM131892 = m13189(c78552, str3);
                            c78662.f21611 = iArrM131892;
                            c78552.setReferencedIds(iArrM131892);
                        }
                    }
                    c78552.setType(c78662.f21602);
                    c78552.setMargin(c78662.f21601);
                    C7850 c7850M3913 = ConstraintLayout.m3913();
                    c78552.m13182();
                    c78692.m13203(c7850M3913);
                    constraintLayout.addView(c78552, c7850M3913);
                }
                if (c78662.f21581) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C7850 c7850M39132 = ConstraintLayout.m3913();
                    c78692.m13203(c7850M39132);
                    constraintLayout.addView(guideline, c7850M39132);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof AbstractC7853) {
                ((AbstractC7853) childAt2).mo13176(constraintLayout);
            }
        }
    }
}
