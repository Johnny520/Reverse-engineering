package p215;

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
import androidx.activity.AbstractC0900;
import androidx.constraintlayout.motion.widget.AbstractC2996;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import bsh.C3466;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import p025.AbstractC7012;
import p218.AbstractC8706;
import p219.C8712;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8692 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final SparseIntArray f21874;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final SparseIntArray f21875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f21876 = {0, 4, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f21879 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f21878 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f21877 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21875 = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f21874 = sparseIntArray2;
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
    public static int m13774(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C8699 m13775(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        C8699 c8699 = new C8699();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? AbstractC8691.f21867 : AbstractC8691.f21869);
        C8689 c8689 = c8699.f21987;
        C8688 c8688 = c8699.f21984;
        C8697 c8697 = c8699.f21986;
        C8696 c8696 = c8699.f21985;
        int[] iArr = f21876;
        String[] strArr = AbstractC8706.f22013;
        SparseIntArray sparseIntArray = f21875;
        if (z) {
            C8698 c8698 = new C8698();
            c8698.f21976 = new int[10];
            c8698.f21975 = new int[10];
            c8698.f21974 = 0;
            c8698.f21973 = new int[10];
            c8698.f21972 = new float[10];
            c8698.f21971 = 0;
            c8698.f21978 = new int[5];
            c8698.f21977 = new String[5];
            c8698.f21981 = 0;
            c8698.f21982 = new int[4];
            c8698.f21979 = new boolean[4];
            c8698.f21980 = 0;
            c8697.getClass();
            c8696.getClass();
            c8688.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f21874.get(index)) {
                    case 2:
                        i2 = indexCount;
                        c8698.m13788(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21913));
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
                        c8698.m13787(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 6:
                        i2 = indexCount;
                        c8698.m13788(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8696.f21907));
                        break;
                    case 7:
                        i2 = indexCount;
                        c8698.m13788(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8696.f21906));
                        break;
                    case 8:
                        i2 = indexCount;
                        c8698.m13788(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21912));
                        break;
                    case 11:
                        i2 = indexCount;
                        c8698.m13788(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21901));
                        break;
                    case 12:
                        i2 = indexCount;
                        c8698.m13788(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21897));
                        break;
                    case 13:
                        i2 = indexCount;
                        c8698.m13788(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21905));
                        break;
                    case 14:
                        i2 = indexCount;
                        c8698.m13788(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21900));
                        break;
                    case 15:
                        i2 = indexCount;
                        c8698.m13788(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21896));
                        break;
                    case 16:
                        i2 = indexCount;
                        c8698.m13788(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21904));
                        break;
                    case 17:
                        i2 = indexCount;
                        c8698.m13788(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8696.f21920));
                        break;
                    case 18:
                        i2 = indexCount;
                        c8698.m13788(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8696.f21919));
                        break;
                    case 19:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8696.f21918), 19);
                        break;
                    case 20:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8696.f21926), 20);
                        break;
                    case 21:
                        i2 = indexCount;
                        c8698.m13788(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c8696.f21921));
                        break;
                    case 22:
                        i2 = indexCount;
                        c8698.m13788(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c8689.f21863)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        c8698.m13788(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c8696.f21922));
                        break;
                    case 24:
                        i2 = indexCount;
                        c8698.m13788(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21916));
                        break;
                    case 27:
                        i2 = indexCount;
                        c8698.m13788(27, typedArrayObtainStyledAttributes.getInt(index, c8696.f21917));
                        break;
                    case 28:
                        i2 = indexCount;
                        c8698.m13788(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21915));
                        break;
                    case 31:
                        i2 = indexCount;
                        c8698.m13788(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21903));
                        break;
                    case 34:
                        i2 = indexCount;
                        c8698.m13788(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21914));
                        break;
                    case 37:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8696.f21927), 37);
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c8699.f21988);
                        c8699.f21988 = resourceId;
                        c8698.m13788(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8696.f21894), 39);
                        break;
                    case 40:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8696.f21898), 40);
                        break;
                    case 41:
                        i2 = indexCount;
                        c8698.m13788(41, typedArrayObtainStyledAttributes.getInt(index, c8696.f21895));
                        break;
                    case 42:
                        i2 = indexCount;
                        c8698.m13788(42, typedArrayObtainStyledAttributes.getInt(index, c8696.f21956));
                        break;
                    case 43:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8689.f21861), 43);
                        break;
                    case 44:
                        i2 = indexCount;
                        c8698.m13786(44, true);
                        c8698.m13789(typedArrayObtainStyledAttributes.getDimension(index, c8688.f21853), 44);
                        break;
                    case 45:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8688.f21851), 45);
                        break;
                    case 46:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8688.f21850), 46);
                        break;
                    case 47:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8688.f21849), 47);
                        break;
                    case 48:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8688.f21848), 48);
                        break;
                    case 49:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getDimension(index, c8688.f21847), 49);
                        break;
                    case 50:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getDimension(index, c8688.f21855), 50);
                        break;
                    case 51:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getDimension(index, c8688.f21858), 51);
                        break;
                    case 52:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getDimension(index, c8688.f21859), 52);
                        break;
                    case 53:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getDimension(index, c8688.f21856), 53);
                        break;
                    case 54:
                        i2 = indexCount;
                        c8698.m13788(54, typedArrayObtainStyledAttributes.getInt(index, c8696.f21955));
                        break;
                    case 55:
                        i2 = indexCount;
                        c8698.m13788(55, typedArrayObtainStyledAttributes.getInt(index, c8696.f21959));
                        break;
                    case 56:
                        i2 = indexCount;
                        c8698.m13788(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21960));
                        break;
                    case 57:
                        i2 = indexCount;
                        c8698.m13788(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21957));
                        break;
                    case 58:
                        i2 = indexCount;
                        c8698.m13788(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21958));
                        break;
                    case 59:
                        i2 = indexCount;
                        c8698.m13788(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21947));
                        break;
                    case 60:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8688.f21852), 60);
                        break;
                    case 62:
                        i2 = indexCount;
                        c8698.m13788(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21909));
                        break;
                    case 63:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8696.f21908), 63);
                        break;
                    case 64:
                        i2 = indexCount;
                        c8698.m13788(64, m13774(typedArrayObtainStyledAttributes, index, c8697.f21967));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c8698.m13787(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c8698.m13787(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        c8698.m13788(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8697.f21963), 67);
                        break;
                    case 68:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8689.f21860), 68);
                        break;
                    case 69:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        c8698.m13788(72, typedArrayObtainStyledAttributes.getInt(index, c8696.f21944));
                        break;
                    case 73:
                        i2 = indexCount;
                        c8698.m13788(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21943));
                        break;
                    case 74:
                        i2 = indexCount;
                        c8698.m13787(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        c8698.m13786(75, typedArrayObtainStyledAttributes.getBoolean(index, c8696.f21951));
                        break;
                    case 76:
                        i2 = indexCount;
                        c8698.m13788(76, typedArrayObtainStyledAttributes.getInt(index, c8697.f21965));
                        break;
                    case 77:
                        i2 = indexCount;
                        c8698.m13787(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        c8698.m13788(78, typedArrayObtainStyledAttributes.getInt(index, c8689.f21862));
                        break;
                    case 79:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8697.f21964), 79);
                        break;
                    case 80:
                        i2 = indexCount;
                        c8698.m13786(80, typedArrayObtainStyledAttributes.getBoolean(index, c8696.f21949));
                        break;
                    case 81:
                        i2 = indexCount;
                        c8698.m13786(81, typedArrayObtainStyledAttributes.getBoolean(index, c8696.f21952));
                        break;
                    case 82:
                        i2 = indexCount;
                        c8698.m13788(82, typedArrayObtainStyledAttributes.getInteger(index, c8697.f21966));
                        break;
                    case 83:
                        i2 = indexCount;
                        c8698.m13788(83, m13774(typedArrayObtainStyledAttributes, index, c8688.f21854));
                        break;
                    case 84:
                        i2 = indexCount;
                        c8698.m13788(84, typedArrayObtainStyledAttributes.getInteger(index, c8697.f21969));
                        break;
                    case 85:
                        i2 = indexCount;
                        c8698.m13789(typedArrayObtainStyledAttributes.getFloat(index, c8697.f21962), 85);
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c8697.f21970 = resourceId2;
                            c8698.m13788(89, resourceId2);
                            if (c8697.f21970 != -1) {
                                c8698.m13788(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c8697.f21968 = string;
                            c8698.m13787(90, string);
                            if (c8697.f21968.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c8697.f21970 = resourceId3;
                                c8698.m13788(89, resourceId3);
                                c8698.m13788(88, -2);
                            } else {
                                c8698.m13788(88, -1);
                            }
                        } else {
                            c8698.m13788(88, typedArrayObtainStyledAttributes.getInteger(index, c8697.f21970));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        c8698.m13788(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21902));
                        break;
                    case 94:
                        i2 = indexCount;
                        c8698.m13788(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8696.f21899));
                        break;
                    case 95:
                        i2 = indexCount;
                        m13778(c8698, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        m13778(c8698, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        c8698.m13788(97, typedArrayObtainStyledAttributes.getInt(index, c8696.f21948));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = AbstractC2996.f6725;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c8699.f21988 = typedArrayObtainStyledAttributes.getResourceId(index, c8699.f21988);
                        }
                        break;
                    case 99:
                        i2 = indexCount;
                        c8698.m13786(99, typedArrayObtainStyledAttributes.getBoolean(index, c8696.f21937));
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
                        c8697.getClass();
                        c8696.getClass();
                        c8688.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c8696.f21935 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21935);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        c8696.f21913 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21913);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        c8696.f21934 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21934);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        c8696.f21930 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21930);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        c8696.f21911 = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        c8696.f21907 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c8696.f21907);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        c8696.f21906 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c8696.f21906);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        c8696.f21912 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21912);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        c8696.f21929 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21929);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        c8696.f21928 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21928);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        c8696.f21901 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21901);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        c8696.f21897 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21897);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        c8696.f21905 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21905);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        c8696.f21900 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21900);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        c8696.f21896 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21896);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        c8696.f21904 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21904);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        c8696.f21920 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c8696.f21920);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        c8696.f21919 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c8696.f21919);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        c8696.f21918 = typedArrayObtainStyledAttributes.getFloat(index2, c8696.f21918);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        c8696.f21926 = typedArrayObtainStyledAttributes.getFloat(index2, c8696.f21926);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        c8696.f21921 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c8696.f21921);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, c8689.f21863);
                        c8689.f21863 = i8;
                        c8689.f21863 = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        c8696.f21922 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c8696.f21922);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        c8696.f21916 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21916);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        c8696.f21936 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21936);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        c8696.f21940 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21940);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        c8696.f21917 = typedArrayObtainStyledAttributes.getInt(index2, c8696.f21917);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        c8696.f21915 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21915);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        c8696.f21941 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21941);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        c8696.f21938 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21938);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        c8696.f21903 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21903);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        c8696.f21925 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21925);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        c8696.f21924 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21924);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        c8696.f21914 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21914);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        c8696.f21931 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21931);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        c8696.f21939 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21939);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        c8696.f21927 = typedArrayObtainStyledAttributes.getFloat(index2, c8696.f21927);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        c8699.f21988 = typedArrayObtainStyledAttributes.getResourceId(index2, c8699.f21988);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        c8696.f21894 = typedArrayObtainStyledAttributes.getFloat(index2, c8696.f21894);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        c8696.f21898 = typedArrayObtainStyledAttributes.getFloat(index2, c8696.f21898);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        c8696.f21895 = typedArrayObtainStyledAttributes.getInt(index2, c8696.f21895);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        c8696.f21956 = typedArrayObtainStyledAttributes.getInt(index2, c8696.f21956);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        c8689.f21861 = typedArrayObtainStyledAttributes.getFloat(index2, c8689.f21861);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        c8688.f21857 = true;
                        c8688.f21853 = typedArrayObtainStyledAttributes.getDimension(index2, c8688.f21853);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        c8688.f21851 = typedArrayObtainStyledAttributes.getFloat(index2, c8688.f21851);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        c8688.f21850 = typedArrayObtainStyledAttributes.getFloat(index2, c8688.f21850);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        c8688.f21849 = typedArrayObtainStyledAttributes.getFloat(index2, c8688.f21849);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        c8688.f21848 = typedArrayObtainStyledAttributes.getFloat(index2, c8688.f21848);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        c8688.f21847 = typedArrayObtainStyledAttributes.getDimension(index2, c8688.f21847);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        c8688.f21855 = typedArrayObtainStyledAttributes.getDimension(index2, c8688.f21855);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        c8688.f21858 = typedArrayObtainStyledAttributes.getDimension(index2, c8688.f21858);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        c8688.f21859 = typedArrayObtainStyledAttributes.getDimension(index2, c8688.f21859);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        c8688.f21856 = typedArrayObtainStyledAttributes.getDimension(index2, c8688.f21856);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        c8696.f21955 = typedArrayObtainStyledAttributes.getInt(index2, c8696.f21955);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        c8696.f21959 = typedArrayObtainStyledAttributes.getInt(index2, c8696.f21959);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        c8696.f21960 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21960);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        c8696.f21957 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21957);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        c8696.f21958 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21958);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        c8696.f21947 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21947);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        c8688.f21852 = typedArrayObtainStyledAttributes.getFloat(index2, c8688.f21852);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        c8696.f21910 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21910);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        c8696.f21909 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21909);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        c8696.f21908 = typedArrayObtainStyledAttributes.getFloat(index2, c8696.f21908);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        c8697.f21967 = m13774(typedArrayObtainStyledAttributes, index2, c8697.f21967);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c8697.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c8697.getClass();
                            i7++;
                        }
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c8697.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        c8697.f21963 = typedArrayObtainStyledAttributes.getFloat(index2, c8697.f21963);
                        break;
                    case 68:
                        i = indexCount2;
                        c8689.f21860 = typedArrayObtainStyledAttributes.getFloat(index2, c8689.f21860);
                        break;
                    case 69:
                        i = indexCount2;
                        c8696.f21946 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        c8696.f21945 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        c8696.f21944 = typedArrayObtainStyledAttributes.getInt(index2, c8696.f21944);
                        break;
                    case 73:
                        i = indexCount2;
                        c8696.f21943 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21943);
                        break;
                    case 74:
                        i = indexCount2;
                        c8696.f21954 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        c8696.f21951 = typedArrayObtainStyledAttributes.getBoolean(index2, c8696.f21951);
                        break;
                    case 76:
                        i = indexCount2;
                        c8697.f21965 = typedArrayObtainStyledAttributes.getInt(index2, c8697.f21965);
                        break;
                    case 77:
                        i = indexCount2;
                        c8696.f21950 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        c8689.f21862 = typedArrayObtainStyledAttributes.getInt(index2, c8689.f21862);
                        break;
                    case 79:
                        i = indexCount2;
                        c8697.f21964 = typedArrayObtainStyledAttributes.getFloat(index2, c8697.f21964);
                        break;
                    case 80:
                        i = indexCount2;
                        c8696.f21949 = typedArrayObtainStyledAttributes.getBoolean(index2, c8696.f21949);
                        break;
                    case 81:
                        i = indexCount2;
                        c8696.f21952 = typedArrayObtainStyledAttributes.getBoolean(index2, c8696.f21952);
                        break;
                    case 82:
                        i = indexCount2;
                        c8697.f21966 = typedArrayObtainStyledAttributes.getInteger(index2, c8697.f21966);
                        break;
                    case 83:
                        i = indexCount2;
                        c8688.f21854 = m13774(typedArrayObtainStyledAttributes, index2, c8688.f21854);
                        break;
                    case 84:
                        i = indexCount2;
                        c8697.f21969 = typedArrayObtainStyledAttributes.getInteger(index2, c8697.f21969);
                        break;
                    case 85:
                        i = indexCount2;
                        c8697.f21962 = typedArrayObtainStyledAttributes.getFloat(index2, c8697.f21962);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            c8697.f21970 = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c8697.f21968 = string2;
                            if (string2.indexOf("/") > 0) {
                                c8697.f21970 = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c8697.f21970);
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
                        c8696.f21932 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21932);
                        break;
                    case 92:
                        i = indexCount2;
                        c8696.f21933 = m13774(typedArrayObtainStyledAttributes, index2, c8696.f21933);
                        break;
                    case 93:
                        i = indexCount2;
                        c8696.f21902 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21902);
                        break;
                    case 94:
                        i = indexCount2;
                        c8696.f21899 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c8696.f21899);
                        break;
                    case 95:
                        i = indexCount2;
                        m13778(c8696, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        m13778(c8696, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c8696.f21948 = typedArrayObtainStyledAttributes.getInt(index2, c8696.f21948);
                        break;
                }
                i7++;
            }
            if (c8696.f21954 != null) {
                c8696.f21953 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c8699;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int[] m13776(C8685 c8685, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c8685.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC8690.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c8685.isInEditMode() && (c8685.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c8685.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f6729;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f6729.get(strTrim);
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
    public static void m13777(C8680 c8680, String str) {
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
        c8680.f21778 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m13778(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int iIndexOf = string.indexOf(61);
            int length = string.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                return;
            }
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if ("ratio".equalsIgnoreCase(strTrim)) {
                    if (obj instanceof C8680) {
                        C8680 c8680 = (C8680) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c8680).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c8680).height = 0;
                        }
                        m13777(c8680, strTrim2);
                        return;
                    }
                    if (obj instanceof C8696) {
                        ((C8696) obj).f21911 = strTrim2;
                        return;
                    } else {
                        if (obj instanceof C8698) {
                            ((C8698) obj).m13787(5, strTrim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f = Float.parseFloat(strTrim2);
                        if (obj instanceof C8680) {
                            C8680 c86802 = (C8680) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c86802).width = 0;
                                c86802.f21777 = f;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c86802).height = 0;
                                c86802.f21776 = f;
                                return;
                            }
                        }
                        if (obj instanceof C8696) {
                            C8696 c8696 = (C8696) obj;
                            if (i2 == 0) {
                                c8696.f21922 = 0;
                                c8696.f21894 = f;
                                return;
                            } else {
                                c8696.f21921 = 0;
                                c8696.f21898 = f;
                                return;
                            }
                        }
                        if (obj instanceof C8698) {
                            C8698 c8698 = (C8698) obj;
                            if (i2 == 0) {
                                c8698.m13788(23, 0);
                                c8698.m13789(f, 39);
                                return;
                            } else {
                                c8698.m13788(21, 0);
                                c8698.m13789(f, 40);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof C8680) {
                            C8680 c86803 = (C8680) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c86803).width = 0;
                                c86803.f21759 = fMax;
                                c86803.f21765 = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c86803).height = 0;
                                c86803.f21762 = fMax;
                                c86803.f21768 = 2;
                                return;
                            }
                        }
                        if (obj instanceof C8696) {
                            C8696 c86962 = (C8696) obj;
                            if (i2 == 0) {
                                c86962.f21922 = 0;
                                c86962.f21946 = fMax;
                                c86962.f21955 = 2;
                                return;
                            } else {
                                c86962.f21921 = 0;
                                c86962.f21945 = fMax;
                                c86962.f21959 = 2;
                                return;
                            }
                        }
                        if (obj instanceof C8698) {
                            C8698 c86982 = (C8698) obj;
                            if (i2 == 0) {
                                c86982.m13788(23, 0);
                                c86982.m13788(54, 2);
                                return;
                            } else {
                                c86982.m13788(21, 0);
                                c86982.m13788(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof C8680)) {
                C8680 c86804 = (C8680) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c86804).width = i4;
                    c86804.f21820 = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c86804).height = i4;
                    c86804.f21819 = z;
                    return;
                }
            }
            if (obj instanceof C8696) {
                C8696 c86963 = (C8696) obj;
                if (i2 == 0) {
                    c86963.f21922 = i4;
                    c86963.f21949 = z;
                    return;
                } else {
                    c86963.f21921 = i4;
                    c86963.f21952 = z;
                    return;
                }
            }
            if (obj instanceof C8698) {
                C8698 c86983 = (C8698) obj;
                if (i2 == 0) {
                    c86983.m13788(23, i4);
                    c86983.m13786(80, z);
                    return;
                } else {
                    c86983.m13788(21, i4);
                    c86983.m13786(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C8680)) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13779(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C8699 c8699M13775 = m13775(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c8699M13775.f21985.f21923 = true;
                    }
                    this.f21877.put(Integer.valueOf(c8699M13775.f21988), c8699M13775);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13780(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        C8692 c8692 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c8692.f21877;
        map2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            C8680 c8680 = (C8680) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c8692.f21878 && id == -1) {
                C3466.m5899("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new C8699());
            }
            C8699 c8699 = (C8699) map2.get(Integer.valueOf(id));
            if (c8699 == null) {
                i = childCount;
                map = map2;
                i2 = i3;
            } else {
                C8689 c8689 = c8699.f21987;
                C8696 c8696 = c8699.f21985;
                C8688 c8688 = c8699.f21984;
                i = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap map4 = c8692.f21879;
                for (String str : map4.keySet()) {
                    C8684 c8684 = (C8684) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C8684(c8684, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new C8684(c8684, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbM12144 = AbstractC7012.m12144(" Custom Attribute \"", str, "\" not found on ");
                        sbM12144.append(cls.getName());
                        Log.e("TransitionLayout", sbM12144.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbM121442 = AbstractC7012.m12144(" Custom Attribute \"", str, "\" not found on ");
                        sbM121442.append(cls.getName());
                        Log.e("TransitionLayout", sbM121442.toString(), e3);
                    }
                    map4 = map5;
                }
                c8699.f21983 = map3;
                c8699.f21988 = id;
                c8696.f21936 = c8680.f21782;
                c8696.f21940 = c8680.f21781;
                c8696.f21941 = c8680.f21800;
                c8696.f21938 = c8680.f21799;
                c8696.f21939 = c8680.f21803;
                c8696.f21931 = c8680.f21804;
                c8696.f21930 = c8680.f21801;
                c8696.f21934 = c8680.f21802;
                c8696.f21935 = c8680.f21794;
                c8696.f21932 = c8680.f21793;
                c8696.f21933 = c8680.f21797;
                c8696.f21925 = c8680.f21788;
                c8696.f21924 = c8680.f21787;
                c8696.f21928 = c8680.f21791;
                c8696.f21929 = c8680.f21792;
                c8696.f21926 = c8680.f21780;
                c8696.f21927 = c8680.f21779;
                c8696.f21911 = c8680.f21778;
                c8696.f21910 = c8680.f21798;
                c8696.f21909 = c8680.f21795;
                c8696.f21908 = c8680.f21796;
                c8696.f21907 = c8680.f21761;
                c8696.f21906 = c8680.f21757;
                c8696.f21917 = c8680.f21758;
                c8696.f21918 = c8680.f21784;
                c8696.f21920 = c8680.f21786;
                c8696.f21919 = c8680.f21785;
                c8696.f21922 = ((ViewGroup.MarginLayoutParams) c8680).width;
                c8696.f21921 = ((ViewGroup.MarginLayoutParams) c8680).height;
                c8696.f21916 = ((ViewGroup.MarginLayoutParams) c8680).leftMargin;
                c8696.f21915 = ((ViewGroup.MarginLayoutParams) c8680).rightMargin;
                c8696.f21914 = ((ViewGroup.MarginLayoutParams) c8680).topMargin;
                c8696.f21913 = ((ViewGroup.MarginLayoutParams) c8680).bottomMargin;
                c8696.f21902 = c8680.f21769;
                c8696.f21898 = c8680.f21776;
                c8696.f21894 = c8680.f21777;
                c8696.f21956 = c8680.f21766;
                c8696.f21895 = c8680.f21775;
                c8696.f21949 = c8680.f21820;
                c8696.f21952 = c8680.f21819;
                c8696.f21955 = c8680.f21765;
                c8696.f21959 = c8680.f21768;
                c8696.f21960 = c8680.f21764;
                c8696.f21957 = c8680.f21760;
                c8696.f21958 = c8680.f21767;
                c8696.f21947 = c8680.f21763;
                c8696.f21946 = c8680.f21759;
                c8696.f21945 = c8680.f21762;
                c8696.f21950 = c8680.f21823;
                c8696.f21904 = c8680.f21790;
                c8696.f21901 = c8680.f21773;
                c8696.f21905 = c8680.f21789;
                c8696.f21900 = c8680.f21774;
                c8696.f21896 = c8680.f21772;
                c8696.f21897 = c8680.f21771;
                c8696.f21899 = c8680.f21770;
                c8696.f21948 = c8680.f21824;
                c8696.f21912 = c8680.getMarginEnd();
                c8696.f21903 = c8680.getMarginStart();
                c8689.f21863 = childAt.getVisibility();
                c8689.f21861 = childAt.getAlpha();
                c8688.f21852 = childAt.getRotation();
                c8688.f21851 = childAt.getRotationX();
                c8688.f21850 = childAt.getRotationY();
                c8688.f21849 = childAt.getScaleX();
                c8688.f21848 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c8688.f21847 = pivotX;
                    c8688.f21855 = pivotY;
                }
                c8688.f21858 = childAt.getTranslationX();
                c8688.f21859 = childAt.getTranslationY();
                c8688.f21856 = childAt.getTranslationZ();
                if (c8688.f21857) {
                    c8688.f21853 = childAt.getElevation();
                }
                if (childAt instanceof C8685) {
                    C8685 c8685 = (C8685) childAt;
                    c8696.f21951 = c8685.getAllowsGoneWidget();
                    c8696.f21953 = c8685.getReferencedIds();
                    c8696.f21944 = c8685.getType();
                    c8696.f21943 = c8685.getMargin();
                }
            }
            i3 = i2 + 1;
            c8692 = this;
            childCount = i;
            map2 = map;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13781(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        C8692 c8692 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c8692.f21877;
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
                if (c8692.f21878 && id == -1) {
                    C3466.m5899("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C8699 c8699 = (C8699) map2.get(Integer.valueOf(id));
                        if (c8699 != null) {
                            C8689 c8689 = c8699.f21987;
                            C8696 c8696 = c8699.f21985;
                            C8688 c8688 = c8699.f21984;
                            if (childAt instanceof C8685) {
                                c8696.f21942 = 1;
                                C8685 c8685 = (C8685) childAt;
                                c8685.setId(id);
                                c8685.setType(c8696.f21944);
                                c8685.setMargin(c8696.f21943);
                                c8685.setAllowsGoneWidget(c8696.f21951);
                                int[] iArr = c8696.f21953;
                                if (iArr != null) {
                                    c8685.setReferencedIds(iArr);
                                } else {
                                    String str = c8696.f21954;
                                    if (str != null) {
                                        int[] iArrM13776 = m13776(c8685, str);
                                        c8696.f21953 = iArrM13776;
                                        c8685.setReferencedIds(iArrM13776);
                                    }
                                }
                            }
                            C8680 c8680 = (C8680) childAt.getLayoutParams();
                            c8680.m13761();
                            c8699.m13790(c8680);
                            HashMap map3 = c8699.f21983;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                C8684 c8684 = (C8684) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strM717 = !c8684.f21839 ? AbstractC0900.m717("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iOrdinal = c8684.f21838.ordinal();
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iOrdinal) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strM717, cls3).invoke(childAt, Integer.valueOf(c8684.f21837));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strM717, cls2).invoke(childAt, Float.valueOf(c8684.f21836));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strM717, cls3).invoke(childAt, Integer.valueOf(c8684.f21840));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strM717, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c8684.f21840);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                StringBuilder sbM12144 = AbstractC7012.m12144(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM12144.append(cls.getName());
                                                Log.e("TransitionLayout", sbM12144.toString(), e);
                                            } catch (NoSuchMethodException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strM717, e);
                                            } catch (InvocationTargetException e3) {
                                                e = e3;
                                                StringBuilder sbM121442 = AbstractC7012.m12144(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM121442.append(cls.getName());
                                                Log.e("TransitionLayout", sbM121442.toString(), e);
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strM717, CharSequence.class).invoke(childAt, c8684.f21835);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strM717, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c8684.f21834));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strM717, cls2).invoke(childAt, Float.valueOf(c8684.f21836));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strM717, cls3).invoke(childAt, Integer.valueOf(c8684.f21837));
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
                            childAt.setLayoutParams(c8680);
                            if (c8689.f21862 == 0) {
                                childAt.setVisibility(c8689.f21863);
                            }
                            childAt.setAlpha(c8689.f21861);
                            childAt.setRotation(c8688.f21852);
                            childAt.setRotationX(c8688.f21851);
                            childAt.setRotationY(c8688.f21850);
                            childAt.setScaleX(c8688.f21849);
                            childAt.setScaleY(c8688.f21848);
                            if (c8688.f21854 != -1) {
                                if (((View) childAt.getParent()).findViewById(c8688.f21854) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c8688.f21847)) {
                                    childAt.setPivotX(c8688.f21847);
                                }
                                if (!Float.isNaN(c8688.f21855)) {
                                    childAt.setPivotY(c8688.f21855);
                                }
                            }
                            childAt.setTranslationX(c8688.f21858);
                            childAt.setTranslationY(c8688.f21859);
                            childAt.setTranslationZ(c8688.f21856);
                            if (c8688.f21857) {
                                childAt.setElevation(c8688.f21853);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                c8692 = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            c8692 = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C8699 c86992 = (C8699) map2.get(num);
            if (c86992 != null) {
                C8696 c86962 = c86992.f21985;
                if (c86962.f21942 == 1) {
                    Context context = constraintLayout.getContext();
                    C8685 c86852 = new C8685(context);
                    c86852.f21833 = new int[32];
                    c86852.f21830 = new HashMap();
                    c86852.f21832 = context;
                    C8712 c8712 = new C8712();
                    c8712.f22134 = 0;
                    c8712.f22133 = true;
                    c8712.f22132 = 0;
                    c8712.f22131 = false;
                    c86852.f21841 = c8712;
                    c86852.f21828 = c8712;
                    c86852.m13769();
                    c86852.setVisibility(8);
                    c86852.setId(num.intValue());
                    int[] iArr2 = c86962.f21953;
                    if (iArr2 != null) {
                        c86852.setReferencedIds(iArr2);
                    } else {
                        String str3 = c86962.f21954;
                        if (str3 != null) {
                            int[] iArrM137762 = m13776(c86852, str3);
                            c86962.f21953 = iArrM137762;
                            c86852.setReferencedIds(iArrM137762);
                        }
                    }
                    c86852.setType(c86962.f21944);
                    c86852.setMargin(c86962.f21943);
                    C8680 c8680M4483 = ConstraintLayout.m4483();
                    c86852.m13769();
                    c86992.m13790(c8680M4483);
                    constraintLayout.addView(c86852, c8680M4483);
                }
                if (c86962.f21923) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C8680 c8680M44832 = ConstraintLayout.m4483();
                    c86992.m13790(c8680M44832);
                    constraintLayout.addView(guideline, c8680M44832);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof AbstractC8683) {
                ((AbstractC8683) childAt2).mo13763(constraintLayout);
            }
        }
    }
}
