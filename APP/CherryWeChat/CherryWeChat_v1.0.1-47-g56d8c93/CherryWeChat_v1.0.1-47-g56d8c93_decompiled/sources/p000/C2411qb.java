package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.github.cherrywechat.lua.api.CherryMessageAPI;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: qb */
/* JADX INFO: loaded from: classes.dex */
public final class C2411qb {

    /* JADX INFO: renamed from: d */
    public static final int[] f8451d = {0, 4, 8};

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f8452e;

    /* JADX INFO: renamed from: f */
    public static final SparseIntArray f8453f;

    /* JADX INFO: renamed from: a */
    public final HashMap f8454a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final boolean f8455b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f8456c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8452e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f8453f = sparseIntArray2;
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

    /* JADX INFO: renamed from: c */
    public static int[] m4848c(C2348p5 c2348p5, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c2348p5.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC0553Mu.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c2348p5.isInEditMode() && (c2348p5.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c2348p5.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f3883m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f3883m.get(strTrim);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: d */
    public static C2188lb m4849d(Context context, AttributeSet attributeSet, boolean z) {
        C2188lb c2188lb = new C2188lb();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? AbstractC0639Ou.f2036c : AbstractC0639Ou.f2034a);
        String[] strArr = AbstractC0585Nj.f1897b;
        C2317ob c2317ob = c2188lb.f7633b;
        C2368pb c2368pb = c2188lb.f7636e;
        C2274nb c2274nb = c2188lb.f7634c;
        C2231mb c2231mb = c2188lb.f7635d;
        int[] iArr = f8451d;
        SparseIntArray sparseIntArray = f8452e;
        int i = 3;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            C2141kb c2141kb = new C2141kb();
            c2141kb.f7487a = new int[10];
            c2141kb.f7488b = new int[10];
            c2141kb.f7489c = 0;
            c2141kb.f7490d = new int[10];
            c2141kb.f7491e = new float[10];
            c2141kb.f7492f = 0;
            c2141kb.f7493g = new int[5];
            c2141kb.f7494h = new String[5];
            c2141kb.f7495i = 0;
            c2141kb.f7496j = new int[4];
            c2141kb.f7497k = new boolean[4];
            c2141kb.f7498l = 0;
            c2274nb.getClass();
            c2231mb.getClass();
            c2368pb.getClass();
            int i2 = 0;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f8453f.get(index)) {
                    case 2:
                        c2141kb.m4329b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7812I));
                        continue;
                        i2++;
                        i = 3;
                        break;
                    case 3:
                    case 4:
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
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
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 5:
                        c2141kb.m4330c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2++;
                        i = 3;
                        break;
                    case 6:
                        c2141kb.m4329b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2231mb.f7806C));
                        break;
                    case 7:
                        c2141kb.m4329b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2231mb.f7807D));
                        break;
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        c2141kb.m4329b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7813J));
                        break;
                    case 11:
                        c2141kb.m4329b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7819P));
                        break;
                    case 12:
                        c2141kb.m4329b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7820Q));
                        break;
                    case 13:
                        c2141kb.m4329b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7816M));
                        break;
                    case 14:
                        c2141kb.m4329b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7818O));
                        break;
                    case 15:
                        c2141kb.m4329b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7821R));
                        break;
                    case 16:
                        c2141kb.m4329b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7817N));
                        break;
                    case 17:
                        c2141kb.m4329b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2231mb.f7836d));
                        break;
                    case 18:
                        c2141kb.m4329b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2231mb.f7838e));
                        break;
                    case 19:
                        c2141kb.m4328a(19, typedArrayObtainStyledAttributes.getFloat(index, c2231mb.f7840f));
                        break;
                    case LuaJitConsts.LUA_MINSTACK /* 20 */:
                        c2141kb.m4328a(20, typedArrayObtainStyledAttributes.getFloat(index, c2231mb.f7867w));
                        break;
                    case 21:
                        c2141kb.m4329b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c2231mb.f7834c));
                        break;
                    case 22:
                        c2141kb.m4329b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c2317ob.f8160a)]);
                        break;
                    case 23:
                        c2141kb.m4329b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c2231mb.f7832b));
                        break;
                    case 24:
                        c2141kb.m4329b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7809F));
                        break;
                    case 27:
                        c2141kb.m4329b(27, typedArrayObtainStyledAttributes.getInt(index, c2231mb.f7808E));
                        break;
                    case 28:
                        c2141kb.m4329b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7810G));
                        break;
                    case 31:
                        c2141kb.m4329b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7814K));
                        break;
                    case 34:
                        c2141kb.m4329b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7811H));
                        break;
                    case 37:
                        c2141kb.m4328a(37, typedArrayObtainStyledAttributes.getFloat(index, c2231mb.f7868x));
                        break;
                    case 38:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c2188lb.f7632a);
                        c2188lb.f7632a = resourceId;
                        c2141kb.m4329b(38, resourceId);
                        break;
                    case 39:
                        c2141kb.m4328a(39, typedArrayObtainStyledAttributes.getFloat(index, c2231mb.f7824U));
                        break;
                    case 40:
                        c2141kb.m4328a(40, typedArrayObtainStyledAttributes.getFloat(index, c2231mb.f7823T));
                        break;
                    case 41:
                        c2141kb.m4329b(41, typedArrayObtainStyledAttributes.getInt(index, c2231mb.f7825V));
                        break;
                    case 42:
                        c2141kb.m4329b(42, typedArrayObtainStyledAttributes.getInt(index, c2231mb.f7826W));
                        break;
                    case 43:
                        c2141kb.m4328a(43, typedArrayObtainStyledAttributes.getFloat(index, c2317ob.f8162c));
                        break;
                    case 44:
                        c2141kb.m4331d(44, true);
                        c2141kb.m4328a(44, typedArrayObtainStyledAttributes.getDimension(index, c2368pb.f8333m));
                        break;
                    case 45:
                        c2141kb.m4328a(45, typedArrayObtainStyledAttributes.getFloat(index, c2368pb.f8322b));
                        break;
                    case 46:
                        c2141kb.m4328a(46, typedArrayObtainStyledAttributes.getFloat(index, c2368pb.f8323c));
                        break;
                    case 47:
                        c2141kb.m4328a(47, typedArrayObtainStyledAttributes.getFloat(index, c2368pb.f8324d));
                        break;
                    case CherryMessageAPI.Type.LOCATION /* 48 */:
                        c2141kb.m4328a(48, typedArrayObtainStyledAttributes.getFloat(index, c2368pb.f8325e));
                        break;
                    case 49:
                        c2141kb.m4328a(49, typedArrayObtainStyledAttributes.getDimension(index, c2368pb.f8326f));
                        break;
                    case 50:
                        c2141kb.m4328a(50, typedArrayObtainStyledAttributes.getDimension(index, c2368pb.f8327g));
                        break;
                    case 51:
                        c2141kb.m4328a(51, typedArrayObtainStyledAttributes.getDimension(index, c2368pb.f8329i));
                        break;
                    case 52:
                        c2141kb.m4328a(52, typedArrayObtainStyledAttributes.getDimension(index, c2368pb.f8330j));
                        break;
                    case 53:
                        c2141kb.m4328a(53, typedArrayObtainStyledAttributes.getDimension(index, c2368pb.f8331k));
                        break;
                    case 54:
                        c2141kb.m4329b(54, typedArrayObtainStyledAttributes.getInt(index, c2231mb.f7827X));
                        break;
                    case 55:
                        c2141kb.m4329b(55, typedArrayObtainStyledAttributes.getInt(index, c2231mb.f7828Y));
                        break;
                    case 56:
                        c2141kb.m4329b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7829Z));
                        break;
                    case 57:
                        c2141kb.m4329b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7831a0));
                        break;
                    case 58:
                        c2141kb.m4329b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7833b0));
                        break;
                    case 59:
                        c2141kb.m4329b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7835c0));
                        break;
                    case 60:
                        c2141kb.m4328a(60, typedArrayObtainStyledAttributes.getFloat(index, c2368pb.f8321a));
                        break;
                    case 62:
                        c2141kb.m4329b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7804A));
                        break;
                    case 63:
                        c2141kb.m4328a(63, typedArrayObtainStyledAttributes.getFloat(index, c2231mb.f7805B));
                        break;
                    case 64:
                        c2141kb.m4329b(64, m4850f(typedArrayObtainStyledAttributes, index, c2274nb.f8000a));
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c2141kb.m4330c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c2141kb.m4330c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        c2141kb.m4329b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        c2141kb.m4328a(67, typedArrayObtainStyledAttributes.getFloat(index, c2274nb.f8004e));
                        break;
                    case 68:
                        c2141kb.m4328a(68, typedArrayObtainStyledAttributes.getFloat(index, c2317ob.f8163d));
                        break;
                    case 69:
                        c2141kb.m4328a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        c2141kb.m4328a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        break;
                    case 72:
                        c2141kb.m4329b(72, typedArrayObtainStyledAttributes.getInt(index, c2231mb.f7841f0));
                        break;
                    case 73:
                        c2141kb.m4329b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7843g0));
                        break;
                    case 74:
                        c2141kb.m4330c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        c2141kb.m4331d(75, typedArrayObtainStyledAttributes.getBoolean(index, c2231mb.f7857n0));
                        break;
                    case 76:
                        c2141kb.m4329b(76, typedArrayObtainStyledAttributes.getInt(index, c2274nb.f8002c));
                        break;
                    case 77:
                        c2141kb.m4330c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        c2141kb.m4329b(78, typedArrayObtainStyledAttributes.getInt(index, c2317ob.f8161b));
                        break;
                    case 79:
                        c2141kb.m4328a(79, typedArrayObtainStyledAttributes.getFloat(index, c2274nb.f8003d));
                        break;
                    case 80:
                        c2141kb.m4331d(80, typedArrayObtainStyledAttributes.getBoolean(index, c2231mb.f7853l0));
                        break;
                    case 81:
                        c2141kb.m4331d(81, typedArrayObtainStyledAttributes.getBoolean(index, c2231mb.f7855m0));
                        break;
                    case 82:
                        c2141kb.m4329b(82, typedArrayObtainStyledAttributes.getInteger(index, c2274nb.f8001b));
                        break;
                    case 83:
                        c2141kb.m4329b(83, m4850f(typedArrayObtainStyledAttributes, index, c2368pb.f8328h));
                        break;
                    case 84:
                        c2141kb.m4329b(84, typedArrayObtainStyledAttributes.getInteger(index, c2274nb.f8006g));
                        break;
                    case 85:
                        c2141kb.m4328a(85, typedArrayObtainStyledAttributes.getFloat(index, c2274nb.f8005f));
                        break;
                    case 86:
                        int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c2274nb.f8008i = resourceId2;
                            c2141kb.m4329b(89, resourceId2);
                            if (c2274nb.f8008i != -1) {
                                c2141kb.m4329b(88, -2);
                            }
                        } else if (i3 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c2274nb.f8007h = string;
                            c2141kb.m4330c(90, string);
                            if (c2274nb.f8007h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c2274nb.f8008i = resourceId3;
                                c2141kb.m4329b(89, resourceId3);
                                c2141kb.m4329b(88, -2);
                            } else {
                                c2141kb.m4329b(88, -1);
                            }
                        } else {
                            c2141kb.m4329b(88, typedArrayObtainStyledAttributes.getInteger(index, c2274nb.f8008i));
                        }
                        break;
                    case 87:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 93:
                        c2141kb.m4329b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7815L));
                        break;
                    case 94:
                        c2141kb.m4329b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2231mb.f7822S));
                        break;
                    case 95:
                        m4851g(c2141kb, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        m4851g(c2141kb, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        c2141kb.m4329b(97, typedArrayObtainStyledAttributes.getInt(index, c2231mb.f7859o0));
                        break;
                    case 98:
                        int i4 = AbstractC2114js.f7434q;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == i) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c2188lb.f7632a = typedArrayObtainStyledAttributes.getResourceId(index, c2188lb.f7632a);
                        }
                        break;
                    case 99:
                        c2141kb.m4331d(99, typedArrayObtainStyledAttributes.getBoolean(index, c2231mb.f7842g));
                        break;
                }
                i2++;
                i = 3;
            }
        } else {
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount2; i5++) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    c2274nb.getClass();
                    c2231mb.getClass();
                    c2368pb.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        c2231mb.f7860p = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7860p);
                        break;
                    case 2:
                        c2231mb.f7812I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7812I);
                        break;
                    case 3:
                        c2231mb.f7858o = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7858o);
                        break;
                    case 4:
                        c2231mb.f7856n = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7856n);
                        break;
                    case 5:
                        c2231mb.f7869y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        c2231mb.f7806C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c2231mb.f7806C);
                        break;
                    case 7:
                        c2231mb.f7807D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c2231mb.f7807D);
                        break;
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        c2231mb.f7813J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7813J);
                        break;
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        c2231mb.f7866v = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7866v);
                        break;
                    case 10:
                        c2231mb.f7865u = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7865u);
                        break;
                    case 11:
                        c2231mb.f7819P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7819P);
                        break;
                    case 12:
                        c2231mb.f7820Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7820Q);
                        break;
                    case 13:
                        c2231mb.f7816M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7816M);
                        break;
                    case 14:
                        c2231mb.f7818O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7818O);
                        break;
                    case 15:
                        c2231mb.f7821R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7821R);
                        break;
                    case 16:
                        c2231mb.f7817N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7817N);
                        break;
                    case 17:
                        c2231mb.f7836d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c2231mb.f7836d);
                        break;
                    case 18:
                        c2231mb.f7838e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c2231mb.f7838e);
                        break;
                    case 19:
                        c2231mb.f7840f = typedArrayObtainStyledAttributes.getFloat(index2, c2231mb.f7840f);
                        break;
                    case LuaJitConsts.LUA_MINSTACK /* 20 */:
                        c2231mb.f7867w = typedArrayObtainStyledAttributes.getFloat(index2, c2231mb.f7867w);
                        break;
                    case 21:
                        c2231mb.f7834c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c2231mb.f7834c);
                        break;
                    case 22:
                        int i6 = typedArrayObtainStyledAttributes.getInt(index2, c2317ob.f8160a);
                        c2317ob.f8160a = i6;
                        c2317ob.f8160a = iArr[i6];
                        break;
                    case 23:
                        c2231mb.f7832b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c2231mb.f7832b);
                        break;
                    case 24:
                        c2231mb.f7809F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7809F);
                        break;
                    case 25:
                        c2231mb.f7844h = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7844h);
                        break;
                    case 26:
                        c2231mb.f7846i = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7846i);
                        break;
                    case 27:
                        c2231mb.f7808E = typedArrayObtainStyledAttributes.getInt(index2, c2231mb.f7808E);
                        break;
                    case 28:
                        c2231mb.f7810G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7810G);
                        break;
                    case 29:
                        c2231mb.f7848j = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7848j);
                        break;
                    case 30:
                        c2231mb.f7850k = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7850k);
                        break;
                    case 31:
                        c2231mb.f7814K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7814K);
                        break;
                    case 32:
                        c2231mb.f7863s = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7863s);
                        break;
                    case 33:
                        c2231mb.f7864t = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7864t);
                        break;
                    case 34:
                        c2231mb.f7811H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7811H);
                        break;
                    case 35:
                        c2231mb.f7854m = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7854m);
                        break;
                    case 36:
                        c2231mb.f7852l = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7852l);
                        break;
                    case 37:
                        c2231mb.f7868x = typedArrayObtainStyledAttributes.getFloat(index2, c2231mb.f7868x);
                        break;
                    case 38:
                        c2188lb.f7632a = typedArrayObtainStyledAttributes.getResourceId(index2, c2188lb.f7632a);
                        break;
                    case 39:
                        c2231mb.f7824U = typedArrayObtainStyledAttributes.getFloat(index2, c2231mb.f7824U);
                        break;
                    case 40:
                        c2231mb.f7823T = typedArrayObtainStyledAttributes.getFloat(index2, c2231mb.f7823T);
                        break;
                    case 41:
                        c2231mb.f7825V = typedArrayObtainStyledAttributes.getInt(index2, c2231mb.f7825V);
                        break;
                    case 42:
                        c2231mb.f7826W = typedArrayObtainStyledAttributes.getInt(index2, c2231mb.f7826W);
                        break;
                    case 43:
                        c2317ob.f8162c = typedArrayObtainStyledAttributes.getFloat(index2, c2317ob.f8162c);
                        break;
                    case 44:
                        c2368pb.f8332l = true;
                        c2368pb.f8333m = typedArrayObtainStyledAttributes.getDimension(index2, c2368pb.f8333m);
                        break;
                    case 45:
                        c2368pb.f8322b = typedArrayObtainStyledAttributes.getFloat(index2, c2368pb.f8322b);
                        break;
                    case 46:
                        c2368pb.f8323c = typedArrayObtainStyledAttributes.getFloat(index2, c2368pb.f8323c);
                        break;
                    case 47:
                        c2368pb.f8324d = typedArrayObtainStyledAttributes.getFloat(index2, c2368pb.f8324d);
                        break;
                    case CherryMessageAPI.Type.LOCATION /* 48 */:
                        c2368pb.f8325e = typedArrayObtainStyledAttributes.getFloat(index2, c2368pb.f8325e);
                        break;
                    case 49:
                        c2368pb.f8326f = typedArrayObtainStyledAttributes.getDimension(index2, c2368pb.f8326f);
                        break;
                    case 50:
                        c2368pb.f8327g = typedArrayObtainStyledAttributes.getDimension(index2, c2368pb.f8327g);
                        break;
                    case 51:
                        c2368pb.f8329i = typedArrayObtainStyledAttributes.getDimension(index2, c2368pb.f8329i);
                        break;
                    case 52:
                        c2368pb.f8330j = typedArrayObtainStyledAttributes.getDimension(index2, c2368pb.f8330j);
                        break;
                    case 53:
                        c2368pb.f8331k = typedArrayObtainStyledAttributes.getDimension(index2, c2368pb.f8331k);
                        break;
                    case 54:
                        c2231mb.f7827X = typedArrayObtainStyledAttributes.getInt(index2, c2231mb.f7827X);
                        break;
                    case 55:
                        c2231mb.f7828Y = typedArrayObtainStyledAttributes.getInt(index2, c2231mb.f7828Y);
                        break;
                    case 56:
                        c2231mb.f7829Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7829Z);
                        break;
                    case 57:
                        c2231mb.f7831a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7831a0);
                        break;
                    case 58:
                        c2231mb.f7833b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7833b0);
                        break;
                    case 59:
                        c2231mb.f7835c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7835c0);
                        break;
                    case 60:
                        c2368pb.f8321a = typedArrayObtainStyledAttributes.getFloat(index2, c2368pb.f8321a);
                        break;
                    case 61:
                        c2231mb.f7870z = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7870z);
                        break;
                    case 62:
                        c2231mb.f7804A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7804A);
                        break;
                    case 63:
                        c2231mb.f7805B = typedArrayObtainStyledAttributes.getFloat(index2, c2231mb.f7805B);
                        break;
                    case 64:
                        c2274nb.f8000a = m4850f(typedArrayObtainStyledAttributes, index2, c2274nb.f8000a);
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c2274nb.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c2274nb.getClass();
                        }
                        break;
                    case 66:
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c2274nb.getClass();
                        break;
                    case 67:
                        c2274nb.f8004e = typedArrayObtainStyledAttributes.getFloat(index2, c2274nb.f8004e);
                        break;
                    case 68:
                        c2317ob.f8163d = typedArrayObtainStyledAttributes.getFloat(index2, c2317ob.f8163d);
                        break;
                    case 69:
                        c2231mb.f7837d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        c2231mb.f7839e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        c2231mb.f7841f0 = typedArrayObtainStyledAttributes.getInt(index2, c2231mb.f7841f0);
                        break;
                    case 73:
                        c2231mb.f7843g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7843g0);
                        break;
                    case 74:
                        c2231mb.f7849j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        c2231mb.f7857n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c2231mb.f7857n0);
                        break;
                    case 76:
                        c2274nb.f8002c = typedArrayObtainStyledAttributes.getInt(index2, c2274nb.f8002c);
                        break;
                    case 77:
                        c2231mb.f7851k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        c2317ob.f8161b = typedArrayObtainStyledAttributes.getInt(index2, c2317ob.f8161b);
                        break;
                    case 79:
                        c2274nb.f8003d = typedArrayObtainStyledAttributes.getFloat(index2, c2274nb.f8003d);
                        break;
                    case 80:
                        c2231mb.f7853l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c2231mb.f7853l0);
                        break;
                    case 81:
                        c2231mb.f7855m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c2231mb.f7855m0);
                        break;
                    case 82:
                        c2274nb.f8001b = typedArrayObtainStyledAttributes.getInteger(index2, c2274nb.f8001b);
                        break;
                    case 83:
                        c2368pb.f8328h = m4850f(typedArrayObtainStyledAttributes, index2, c2368pb.f8328h);
                        break;
                    case 84:
                        c2274nb.f8006g = typedArrayObtainStyledAttributes.getInteger(index2, c2274nb.f8006g);
                        break;
                    case 85:
                        c2274nb.f8005f = typedArrayObtainStyledAttributes.getFloat(index2, c2274nb.f8005f);
                        break;
                    case 86:
                        int i7 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i7 == 1) {
                            c2274nb.f8008i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i7 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c2274nb.f8007h = string2;
                            if (string2.indexOf("/") > 0) {
                                c2274nb.f8008i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c2274nb.f8008i);
                        }
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 91:
                        c2231mb.f7861q = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7861q);
                        break;
                    case 92:
                        c2231mb.f7862r = m4850f(typedArrayObtainStyledAttributes, index2, c2231mb.f7862r);
                        break;
                    case 93:
                        c2231mb.f7815L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7815L);
                        break;
                    case 94:
                        c2231mb.f7822S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2231mb.f7822S);
                        break;
                    case 95:
                        m4851g(c2231mb, typedArrayObtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        m4851g(c2231mb, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        c2231mb.f7859o0 = typedArrayObtainStyledAttributes.getInt(index2, c2231mb.f7859o0);
                        break;
                }
            }
            if (c2231mb.f7849j0 != null) {
                c2231mb.f7847i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c2188lb;
    }

    /* JADX INFO: renamed from: f */
    public static int m4850f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4851g(Object obj, TypedArray typedArray, int i, int i2) {
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
                    if (obj instanceof C1452gb) {
                        C1452gb c1452gb = (C1452gb) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c1452gb).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1452gb).height = 0;
                        }
                        m4852h(c1452gb, strTrim2);
                        return;
                    }
                    if (obj instanceof C2231mb) {
                        ((C2231mb) obj).f7869y = strTrim2;
                        return;
                    } else {
                        if (obj instanceof C2141kb) {
                            ((C2141kb) obj).m4330c(5, strTrim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f = Float.parseFloat(strTrim2);
                        if (obj instanceof C1452gb) {
                            C1452gb c1452gb2 = (C1452gb) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c1452gb2).width = 0;
                                c1452gb2.f5087H = f;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c1452gb2).height = 0;
                                c1452gb2.f5088I = f;
                                return;
                            }
                        }
                        if (obj instanceof C2231mb) {
                            C2231mb c2231mb = (C2231mb) obj;
                            if (i2 == 0) {
                                c2231mb.f7832b = 0;
                                c2231mb.f7824U = f;
                                return;
                            } else {
                                c2231mb.f7834c = 0;
                                c2231mb.f7823T = f;
                                return;
                            }
                        }
                        if (obj instanceof C2141kb) {
                            C2141kb c2141kb = (C2141kb) obj;
                            if (i2 == 0) {
                                c2141kb.m4329b(23, 0);
                                c2141kb.m4328a(39, f);
                                return;
                            } else {
                                c2141kb.m4329b(21, 0);
                                c2141kb.m4328a(40, f);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof C1452gb) {
                            C1452gb c1452gb3 = (C1452gb) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c1452gb3).width = 0;
                                c1452gb3.f5097R = fMax;
                                c1452gb3.f5091L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c1452gb3).height = 0;
                                c1452gb3.f5098S = fMax;
                                c1452gb3.f5092M = 2;
                                return;
                            }
                        }
                        if (obj instanceof C2231mb) {
                            C2231mb c2231mb2 = (C2231mb) obj;
                            if (i2 == 0) {
                                c2231mb2.f7832b = 0;
                                c2231mb2.f7837d0 = fMax;
                                c2231mb2.f7827X = 2;
                                return;
                            } else {
                                c2231mb2.f7834c = 0;
                                c2231mb2.f7839e0 = fMax;
                                c2231mb2.f7828Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof C2141kb) {
                            C2141kb c2141kb2 = (C2141kb) obj;
                            if (i2 == 0) {
                                c2141kb2.m4329b(23, 0);
                                c2141kb2.m4329b(54, 2);
                                return;
                            } else {
                                c2141kb2.m4329b(21, 0);
                                c2141kb2.m4329b(55, 2);
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
            if (!(obj instanceof C1452gb)) {
                C1452gb c1452gb4 = (C1452gb) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c1452gb4).width = i4;
                    c1452gb4.f5102W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c1452gb4).height = i4;
                    c1452gb4.f5103X = z;
                    return;
                }
            }
            if (obj instanceof C2231mb) {
                C2231mb c2231mb3 = (C2231mb) obj;
                if (i2 == 0) {
                    c2231mb3.f7832b = i4;
                    c2231mb3.f7853l0 = z;
                    return;
                } else {
                    c2231mb3.f7834c = i4;
                    c2231mb3.f7855m0 = z;
                    return;
                }
            }
            if (obj instanceof C2141kb) {
                C2141kb c2141kb3 = (C2141kb) obj;
                if (i2 == 0) {
                    c2141kb3.m4329b(23, i4);
                    c2141kb3.m4331d(80, z);
                    return;
                } else {
                    c2141kb3.m4329b(21, i4);
                    c2141kb3.m4331d(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C1452gb)) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m4852h(C1452gb c1452gb, String str) {
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
        c1452gb.f5086G = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m4853a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f8456c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (this.f8455b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C2188lb c2188lb = (C2188lb) map.get(Integer.valueOf(id));
                    if (c2188lb != null) {
                        C2317ob c2317ob = c2188lb.f7633b;
                        C2231mb c2231mb = c2188lb.f7635d;
                        C2368pb c2368pb = c2188lb.f7636e;
                        if (childAt instanceof C2348p5) {
                            c2231mb.f7845h0 = 1;
                            C2348p5 c2348p5 = (C2348p5) childAt;
                            c2348p5.setId(id);
                            c2348p5.setType(c2231mb.f7841f0);
                            c2348p5.setMargin(c2231mb.f7843g0);
                            c2348p5.setAllowsGoneWidget(c2231mb.f7857n0);
                            int[] iArr = c2231mb.f7847i0;
                            if (iArr != null) {
                                c2348p5.setReferencedIds(iArr);
                            } else {
                                String str = c2231mb.f7849j0;
                                if (str != null) {
                                    int[] iArrM4848c = m4848c(c2348p5, str);
                                    c2231mb.f7847i0 = iArrM4848c;
                                    c2348p5.setReferencedIds(iArrM4848c);
                                }
                            }
                        }
                        C1452gb c1452gb = (C1452gb) childAt.getLayoutParams();
                        c1452gb.m2781a();
                        c2188lb.m4425a(c1452gb);
                        HashMap map2 = c2188lb.f7637f;
                        Class<?> cls = childAt.getClass();
                        for (String strM420r : map2.keySet()) {
                            C1321db c1321db = (C1321db) map2.get(strM420r);
                            if (!c1321db.f4783a) {
                                strM420r = AbstractC0213Ey.m420r("set", strM420r);
                            }
                            try {
                                int iM424v = AbstractC0213Ey.m424v(c1321db.f4784b);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (iM424v) {
                                    case 0:
                                        cls.getMethod(strM420r, cls3).invoke(childAt, Integer.valueOf(c1321db.f4785c));
                                        break;
                                    case 1:
                                        cls.getMethod(strM420r, cls2).invoke(childAt, Float.valueOf(c1321db.f4786d));
                                        break;
                                    case 2:
                                        cls.getMethod(strM420r, cls3).invoke(childAt, Integer.valueOf(c1321db.f4789g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strM420r, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c1321db.f4789g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(strM420r, CharSequence.class).invoke(childAt, c1321db.f4787e);
                                        break;
                                    case 5:
                                        cls.getMethod(strM420r, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1321db.f4788f));
                                        break;
                                    case 6:
                                        cls.getMethod(strM420r, cls2).invoke(childAt, Float.valueOf(c1321db.f4786d));
                                        break;
                                    case 7:
                                        cls.getMethod(strM420r, cls3).invoke(childAt, Integer.valueOf(c1321db.f4785c));
                                        break;
                                }
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                            }
                        }
                        childAt.setLayoutParams(c1452gb);
                        if (c2317ob.f8161b == 0) {
                            childAt.setVisibility(c2317ob.f8160a);
                        }
                        childAt.setAlpha(c2317ob.f8162c);
                        childAt.setRotation(c2368pb.f8321a);
                        childAt.setRotationX(c2368pb.f8322b);
                        childAt.setRotationY(c2368pb.f8323c);
                        childAt.setScaleX(c2368pb.f8324d);
                        childAt.setScaleY(c2368pb.f8325e);
                        if (c2368pb.f8328h != -1) {
                            if (((View) childAt.getParent()).findViewById(c2368pb.f8328h) != null) {
                                float bottom = (r5.getBottom() + r5.getTop()) / 2.0f;
                                float right = (r5.getRight() + r5.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(c2368pb.f8326f)) {
                                childAt.setPivotX(c2368pb.f8326f);
                            }
                            if (!Float.isNaN(c2368pb.f8327g)) {
                                childAt.setPivotY(c2368pb.f8327g);
                            }
                        }
                        childAt.setTranslationX(c2368pb.f8329i);
                        childAt.setTranslationY(c2368pb.f8330j);
                        childAt.setTranslationZ(c2368pb.f8331k);
                        if (c2368pb.f8332l) {
                            childAt.setElevation(c2368pb.f8333m);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C2188lb c2188lb2 = (C2188lb) map.get(num);
            if (c2188lb2 != null) {
                C2231mb c2231mb2 = c2188lb2.f7635d;
                if (c2231mb2.f7845h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C2348p5 c2348p52 = new C2348p5(context);
                    c2348p52.f4872a = new int[32];
                    c2348p52.f4878g = new HashMap();
                    c2348p52.f4874c = context;
                    C2399q5 c2399q5 = new C2399q5();
                    c2399q5.f8407s0 = 0;
                    c2399q5.f8408t0 = true;
                    c2399q5.f8409u0 = 0;
                    c2399q5.f8410v0 = false;
                    c2348p52.f8227j = c2399q5;
                    c2348p52.f4875d = c2399q5;
                    c2348p52.m2654i();
                    c2348p52.setVisibility(8);
                    c2348p52.setId(num.intValue());
                    int[] iArr2 = c2231mb2.f7847i0;
                    if (iArr2 != null) {
                        c2348p52.setReferencedIds(iArr2);
                    } else {
                        String str2 = c2231mb2.f7849j0;
                        if (str2 != null) {
                            int[] iArrM4848c2 = m4848c(c2348p52, str2);
                            c2231mb2.f7847i0 = iArrM4848c2;
                            c2348p52.setReferencedIds(iArrM4848c2);
                        }
                    }
                    c2348p52.setType(c2231mb2.f7841f0);
                    c2348p52.setMargin(c2231mb2.f7843g0);
                    C1452gb c1452gbM2123g = ConstraintLayout.m2123g();
                    c2348p52.m2654i();
                    c2188lb2.m4425a(c1452gbM2123g);
                    constraintLayout.addView(c2348p52, c1452gbM2123g);
                }
                if (c2231mb2.f7830a) {
                    View c2106jk = new C2106jk(constraintLayout.getContext());
                    c2106jk.setId(num.intValue());
                    C1452gb c1452gbM2123g2 = ConstraintLayout.m2123g();
                    c2188lb2.m4425a(c1452gbM2123g2);
                    constraintLayout.addView(c2106jk, c1452gbM2123g2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof AbstractC1364eb) {
                ((AbstractC1364eb) childAt2).mo1834e(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4854b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        int i3;
        C2411qb c2411qb = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c2411qb.f8456c;
        map2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            C1452gb c1452gb = (C1452gb) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c2411qb.f8455b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new C2188lb());
            }
            C2188lb c2188lb = (C2188lb) map2.get(Integer.valueOf(id));
            if (c2188lb == null) {
                i = childCount;
                map = map2;
                i2 = i4;
            } else {
                C2317ob c2317ob = c2188lb.f7633b;
                C2231mb c2231mb = c2188lb.f7635d;
                C2368pb c2368pb = c2188lb.f7636e;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map4 = c2411qb.f8454a;
                for (String str : map4.keySet()) {
                    int i5 = childCount;
                    C1321db c1321db = (C1321db) map4.get(str);
                    HashMap map5 = map2;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i3 = i4;
                            try {
                                map3.put(str, new C1321db(c1321db, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                        } else {
                            i3 = i4;
                            map3.put(str, new C1321db(c1321db, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                        i3 = i4;
                    }
                    map2 = map5;
                    childCount = i5;
                    i4 = i3;
                }
                i = childCount;
                map = map2;
                i2 = i4;
                c2188lb.f7637f = map3;
                c2188lb.f7632a = id;
                c2231mb.f7844h = c1452gb.f5114e;
                c2231mb.f7846i = c1452gb.f5116f;
                c2231mb.f7848j = c1452gb.f5118g;
                c2231mb.f7850k = c1452gb.f5120h;
                c2231mb.f7852l = c1452gb.f5122i;
                c2231mb.f7854m = c1452gb.f5124j;
                c2231mb.f7856n = c1452gb.f5126k;
                c2231mb.f7858o = c1452gb.f5128l;
                c2231mb.f7860p = c1452gb.f5130m;
                c2231mb.f7861q = c1452gb.f5132n;
                c2231mb.f7862r = c1452gb.f5134o;
                c2231mb.f7863s = c1452gb.f5140s;
                c2231mb.f7864t = c1452gb.f5141t;
                c2231mb.f7865u = c1452gb.f5142u;
                c2231mb.f7866v = c1452gb.f5143v;
                c2231mb.f7867w = c1452gb.f5084E;
                c2231mb.f7868x = c1452gb.f5085F;
                c2231mb.f7869y = c1452gb.f5086G;
                c2231mb.f7870z = c1452gb.f5136p;
                c2231mb.f7804A = c1452gb.f5138q;
                c2231mb.f7805B = c1452gb.f5139r;
                c2231mb.f7806C = c1452gb.f5099T;
                c2231mb.f7807D = c1452gb.f5100U;
                c2231mb.f7808E = c1452gb.f5101V;
                c2231mb.f7840f = c1452gb.f5110c;
                c2231mb.f7836d = c1452gb.f5106a;
                c2231mb.f7838e = c1452gb.f5108b;
                c2231mb.f7832b = ((ViewGroup.MarginLayoutParams) c1452gb).width;
                c2231mb.f7834c = ((ViewGroup.MarginLayoutParams) c1452gb).height;
                c2231mb.f7809F = ((ViewGroup.MarginLayoutParams) c1452gb).leftMargin;
                c2231mb.f7810G = ((ViewGroup.MarginLayoutParams) c1452gb).rightMargin;
                c2231mb.f7811H = ((ViewGroup.MarginLayoutParams) c1452gb).topMargin;
                c2231mb.f7812I = ((ViewGroup.MarginLayoutParams) c1452gb).bottomMargin;
                c2231mb.f7815L = c1452gb.f5083D;
                c2231mb.f7823T = c1452gb.f5088I;
                c2231mb.f7824U = c1452gb.f5087H;
                c2231mb.f7826W = c1452gb.f5090K;
                c2231mb.f7825V = c1452gb.f5089J;
                c2231mb.f7853l0 = c1452gb.f5102W;
                c2231mb.f7855m0 = c1452gb.f5103X;
                c2231mb.f7827X = c1452gb.f5091L;
                c2231mb.f7828Y = c1452gb.f5092M;
                c2231mb.f7829Z = c1452gb.f5095P;
                c2231mb.f7831a0 = c1452gb.f5096Q;
                c2231mb.f7833b0 = c1452gb.f5093N;
                c2231mb.f7835c0 = c1452gb.f5094O;
                c2231mb.f7837d0 = c1452gb.f5097R;
                c2231mb.f7839e0 = c1452gb.f5098S;
                c2231mb.f7851k0 = c1452gb.f5104Y;
                c2231mb.f7817N = c1452gb.f5145x;
                c2231mb.f7819P = c1452gb.f5147z;
                c2231mb.f7816M = c1452gb.f5144w;
                c2231mb.f7818O = c1452gb.f5146y;
                c2231mb.f7821R = c1452gb.f5080A;
                c2231mb.f7820Q = c1452gb.f5081B;
                c2231mb.f7822S = c1452gb.f5082C;
                c2231mb.f7859o0 = c1452gb.f5105Z;
                c2231mb.f7813J = c1452gb.getMarginEnd();
                c2231mb.f7814K = c1452gb.getMarginStart();
                c2317ob.f8160a = childAt.getVisibility();
                c2317ob.f8162c = childAt.getAlpha();
                c2368pb.f8321a = childAt.getRotation();
                c2368pb.f8322b = childAt.getRotationX();
                c2368pb.f8323c = childAt.getRotationY();
                c2368pb.f8324d = childAt.getScaleX();
                c2368pb.f8325e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c2368pb.f8326f = pivotX;
                    c2368pb.f8327g = pivotY;
                }
                c2368pb.f8329i = childAt.getTranslationX();
                c2368pb.f8330j = childAt.getTranslationY();
                c2368pb.f8331k = childAt.getTranslationZ();
                if (c2368pb.f8332l) {
                    c2368pb.f8333m = childAt.getElevation();
                }
                if (childAt instanceof C2348p5) {
                    C2348p5 c2348p5 = (C2348p5) childAt;
                    c2231mb.f7857n0 = c2348p5.getAllowsGoneWidget();
                    c2231mb.f7847i0 = c2348p5.getReferencedIds();
                    c2231mb.f7841f0 = c2348p5.getType();
                    c2231mb.f7843g0 = c2348p5.getMargin();
                }
            }
            i4 = i2 + 1;
            c2411qb = this;
            map2 = map;
            childCount = i;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4855e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C2188lb c2188lbM4849d = m4849d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c2188lbM4849d.f7635d.f7830a = true;
                    }
                    this.f8456c.put(Integer.valueOf(c2188lbM4849d.f7632a), c2188lbM4849d);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
