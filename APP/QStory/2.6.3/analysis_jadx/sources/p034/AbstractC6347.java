package p034;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.activity.AbstractC0053;
import androidx.activity.compose.C0002;
import androidx.appcompat.app.RunnableC0099;
import androidx.collection.C0276;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.core.widget.AbstractC2294;
import com.alibaba.fastjson2.C2942;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3061;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.ComponentCallbacks2C3064;
import com.davemorrissey.labs.subscaleview.R;
import com.esotericsoftware.kryo.util.C3076;
import com.kongzue.dialogx.util.C3764;
import com.lxj.xpopup.core.C3784;
import io.ktor.util.C4211;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4350;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.AbstractC5067;
import kotlin.reflect.jvm.internal.C5004;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4565;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4641;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.types.C4928;
import kotlin.reflect.jvm.internal.types.C4929;
import kotlinx.serialization.SerializationException;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p010.C6189;
import p022.DialogInterfaceOnDismissListenerC6299;
import p031.C6327;
import p036.AbstractC6358;
import p053.AbstractC6561;
import p079.AbstractC6989;
import p079.AbstractC7002;
import p087.C7127;
import p088.AbstractC7176;
import p088.C7152;
import p089.InterfaceC7184;
import p090.InterfaceC7187;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p164.C7664;
import p165.C7677;
import p175.AbstractC7739;
import p204.AbstractC7891;
import p204.InterfaceC7892;
import p205.C7894;
import p205.C7900;
import p236.AbstractC8115;
import p236.C8113;
import p236.C8116;
import p236.C8125;
import p241.C8140;
import p263.C8255;
import p287.AbstractC8405;
import p314.AbstractC8661;
import p329.AbstractC8765;
import p349.C8848;
import p349.C8849;
import p349.C8852;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6347 implements InterfaceC7187, InterfaceC7189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C6350 f17481 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String f17482 = "";

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static boolean m11894(InputDevice inputDevice, int i) {
        return (inputDevice.getSources() & i) == i && inputDevice.getMotionRange(0, i) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static double m11895(C8255 c8255, double[] dArr, double[] dArr2) {
        double d;
        int iMin = Math.min(dArr.length - 1, dArr2.length);
        double d2 = c8255.f22856;
        int i = 0;
        while (true) {
            if (i >= iMin) {
                d = d2;
                break;
            }
            if (d2 < dArr[i] || d2 >= dArr[i + 1]) {
                i++;
            } else {
                d = dArr2[i] % 360.0d;
                if (d < 0.0d) {
                    d += 360.0d;
                }
            }
        }
        if (Math.min(dArr.length - 1, dArr2.length) <= 0) {
            d = 0.0d;
        }
        double d3 = (d2 + d) % 360.0d;
        return d3 < 0.0d ? d3 + 360.0d : d3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static float m11896(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        C3076.m6901("Motion easing control point value must be between 0 and 1; instead got: ", f);
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C4929 m11897(InterfaceC5093 interfaceC5093, C4687 c4687) {
        c4687.getClass();
        interfaceC5093.getClass();
        return new C4929(interfaceC5093, c4687.f13696.f13693, new C4928(interfaceC5093, c4687), new C4928(c4687, interfaceC5093));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static float m11898(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2294.m4312(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m11899(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m11900(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static int m11901(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static String m11902(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + AbstractC6561.m12064(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC6561.m12064(Float.intBitsToFloat(i)) + ", " + AbstractC6561.m12064(Float.intBitsToFloat(i2)) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static final C5004 m11903(AbstractC6989 abstractC6989) {
        Class clsM10072 = AbstractC5067.m10072(abstractC6989);
        C5004 c5004 = (C5004) (clsM10072 != null ? AbstractC4396.f12975.mo8917(clsM10072) : null);
        if (c5004 != null) {
            return c5004;
        }
        C4211.m8594(abstractC6989.mo9028(), "Type parameter container is not resolved: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7894 m11904(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        InterfaceC7892 interfaceC7892M13316 = AbstractC7891.m13316(f);
        if (interfaceC7892M13316 == null) {
            interfaceC7892M13316 = new C7900(f);
        }
        return new C7894(f2, f, interfaceC7892M13316);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C7152 m11905(C7152 c7152, AbstractC7176 abstractC7176) {
        return AbstractC8765.m14467(new C0002(c7152, 22, abstractC7176));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m11906(Context context) {
        AbstractC3056.m6687(context);
        C6350 c6350 = new C6350(new C3764(context, 1));
        f17481 = c6350;
        C3784 c3784 = new C3784();
        c3784.f11814 = true;
        c6350.popupInfo = c3784;
        c6350.show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m11907(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812) {
        interfaceC4481.getClass();
        interfaceC44812.getClass();
        if (!(interfaceC44812 instanceof C4565) || !(interfaceC4481 instanceof InterfaceC4484)) {
            return false;
        }
        C4565 c4565 = (C4565) interfaceC44812;
        c4565.mo9035().size();
        InterfaceC4484 interfaceC4484 = (InterfaceC4484) interfaceC4481;
        interfaceC4484.mo9035().size();
        List listMo9035 = ((AbstractC7002) c4565.mo9002()).mo9035();
        listMo9035.getClass();
        List listMo90352 = interfaceC4484.mo9002().mo9035();
        listMo90352.getClass();
        for (Pair pair : AbstractC4344.m8821(listMo9035, listMo90352)) {
            InterfaceC4456 interfaceC4456 = (InterfaceC4456) pair.component1();
            InterfaceC4456 interfaceC44562 = (InterfaceC4456) pair.component2();
            interfaceC4456.getClass();
            boolean z = m11917((InterfaceC4484) interfaceC44812, interfaceC4456) instanceof C4641;
            interfaceC44562.getClass();
            if (z != (m11917(interfaceC4484, interfaceC44562) instanceof C4641)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static float[] m11908(float[] fArr, int i) {
        if (i < 0) {
            C5925.m11306();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C8125 m11909(C8140 c8140) {
        c8140.getClass();
        C8116 c8116 = c8140.f22458;
        String[] strArr = AbstractC8115.f22413;
        String strM2413 = c8116.m2413("Content-Type");
        if (strM2413 == null) {
            return null;
        }
        C8125 c8125 = C8125.f22424;
        return C8113.m13582(strM2413);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p164.C7664[] m11910(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.AbstractC6347.m11910(java.lang.String):飘花落叶言子哲楪苏世兰.飘花落叶言子楪世哲兰苏[]");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static ListBuilder m11911() {
        return new ListBuilder(0, 1, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static ArrayList m11912(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4350(objArr, true));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m11913(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i = 0;
        if (size < 0) {
            C5925.m11310(AbstractC0053.m162(size, "fromIndex (0) is greater than toIndex (", ")."));
            return 0;
        }
        if (size > size2) {
            C4211.m8618("toIndex (", size, ") is greater than size (", size2);
            return 0;
        }
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iM6717 = AbstractC3056.m6717((Comparable) arrayList.get(i3), comparable);
            if (iM6717 < 0) {
                i = i3 + 1;
            } else {
                if (iM6717 <= 0) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m11914(ArrayList arrayList, ArrayList arrayList2, Activity activity) {
        new AlertDialog.Builder(activity, m11899(activity) ? 2 : 3).setTitle(AbstractC8405.m13972(356)).setItems((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterfaceOnClickListenerC6339(arrayList, arrayList2, activity, 0)).setOnDismissListener(new DialogInterfaceOnDismissListenerC6299(1)).show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m11915(Context context, String str, String str2) {
        f17482 = "";
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.emo_pre_save, (ViewGroup) null);
        final ImageView imageView = (ImageView) linearLayout.findViewById(R.id.emo_pre_container);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C6348 c6348 = new C6348();
        c6348.f17483 = str;
        c6348.f17485 = 2;
        c6348.f17484 = str2.toUpperCase(Locale.ROOT);
        if (str.startsWith(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵"))) {
            AbstractC6343.f17476.submit(new RunnableC0099(c6348, 12, new RunnableC0099(c6348, 13, imageView)));
        } else {
            c6348.f17486 = str;
            ((C3062) ComponentCallbacks2C3058.m6765(AbstractC6358.f17507).m6799(new File(c6348.f17486)).m6614()).m6789(imageView);
        }
        ArrayList<String> arrayListM11893 = AbstractC6345.m11893();
        RadioGroup radioGroup = (RadioGroup) linearLayout.findViewById(R.id.emo_pre_list_choser);
        for (String str3 : arrayListM11893) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(str3);
            radioButton.setTextSize(16.0f);
            radioButton.setTextColor(context.getResources().getColor(R.color.font_plugin, null));
            radioButton.setOnCheckedChangeListener(new C6342(str3, 0));
            radioGroup.addView(radioButton);
        }
        ((Button) linearLayout.findViewById(R.id.createNew)).setOnClickListener(new ViewOnClickListenerC5562(context, 5, radioGroup));
        new AlertDialog.Builder(context, m11899(context) ? 2 : 3).setTitle(AbstractC8405.m13972(355)).setView(linearLayout).setNeutralButton(AbstractC8405.m13973("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵喵喵~呜呜呜呜喵呜喵喵"), new DialogInterfaceOnClickListenerC6341(c6348, str2)).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世兰苏哲
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ComponentCallbacks2C3064 componentCallbacks2C3064M6765 = ComponentCallbacks2C3058.m6765(AbstractC6358.f17507);
                componentCallbacks2C3064M6765.getClass();
                componentCallbacks2C3064M6765.m6795(new C3061(imageView));
            }
        }).show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static ArrayList m11916(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4350(objArr, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773.m9505(r0).equals(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773.m9505(r2)) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4645 m11917(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484 r6, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456 r7) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.AbstractC6347.m11917(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世兰楪苏哲):kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪哲苏世兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static final Object m11918(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        Set setM8788;
        if (!z) {
            if (r4 != null && (setM8788 = AbstractC4344.m8788(AbstractC7739.m13053(set, r4))) != null) {
                set = setM8788;
            }
            return AbstractC4344.m8782(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (AbstractC4395.m8907(r1, r2) && AbstractC4395.m8907(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static C7677 m11919(Context context) {
        TypedValue typedValueM12040 = AbstractC6561.m12040(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = AbstractC8661.f24432;
        TypedArray typedArrayObtainStyledAttributes = typedValueM12040 == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueM12040.resourceId, iArr);
        C7677 c7677 = new C7677();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            c7677.f20844 = Math.sqrt(f);
            c7677.f20842 = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            c7677.f20843 = f2;
            c7677.f20842 = false;
            typedArrayObtainStyledAttributes.recycle();
            return c7677;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static void m11920() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static void m11921() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static int m11922(Context context, int i, int i2) {
        TypedValue typedValueM12040 = AbstractC6561.m12040(context.getTheme(), i);
        return (typedValueM12040 == null || typedValueM12040.type != 16) ? i2 : typedValueM12040.data;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static TimeInterpolator m11923(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            C5925.m11310("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m11929(strValueOf, "cubic-bezier") && !m11929(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m11929(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(m11896(strArrSplit, 0), m11896(strArrSplit, 1), m11896(strArrSplit, 2), m11896(strArrSplit, 3));
            }
            C2942.m6392(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!m11929(strValueOf, "path")) {
            C5925.m11310("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strM161 = AbstractC0053.m161(1, 5, strValueOf);
        Path path = new Path();
        try {
            C7664.m12936(m11910(strM161), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            C0276.m848("Error in parsing ".concat(strM161), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static final List m11924(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : m11928(list.get(0)) : EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static void m11925(Activity activity) {
        Window window = activity.getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1792);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static final void m11926(String str, long j, String str2, int i) {
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜");
        str.getClass();
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵呜喵呜");
        str2.getClass();
        C8852 c8852 = new C8852(Long.parseLong(str), j, str2, i);
        C6327 c6327 = C6327.f17435;
        C8848 c8848 = new C8848(c6327.m11841(C8852.Companion.serializer(), c8852));
        C6189 c6189 = new C6189();
        C8849 c8849 = C8848.Companion;
        c6189.m11613(c6327.m11841(c8849.serializer(), c8848));
        AbstractC0455.m1152(AbstractC8405.m13972(2831), c6327.m11841(c8849.serializer(), c8848));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static float m11927(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2294.m4311(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static List m11928(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static boolean m11929(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static List m11930(Object obj) {
        return obj != null ? m11928(obj) : EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static List m11931(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return EmptyList.INSTANCE;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public boolean mo10652(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return mo10691();
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public byte mo10653(C7127 c7127, int i) {
        c7127.getClass();
        return mo10700();
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public InterfaceC7187 mo10654(C7127 c7127, int i) {
        c7127.getClass();
        return mo10689(c7127.mo12383(i));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public double mo10655(C7127 c7127, int i) {
        c7127.getClass();
        return mo10696();
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public boolean mo10658() {
        return true;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public char mo10660(C7127 c7127, int i) {
        c7127.getClass();
        return mo10690();
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public String mo10662() {
        m11932();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract Object mo11691(InterfaceC5093 interfaceC5093);

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract int mo10665();

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public abstract long mo10668();

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public short mo10669(C7127 c7127, int i) {
        c7127.getClass();
        return mo10698();
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public float mo10670(C7127 c7127, int i) {
        c7127.getClass();
        return mo10697();
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public int mo10671(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return mo10665();
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public int mo10672(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        m11932();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo10674(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        interfaceC7184.getClass();
        return mo10657(interfaceC7184);
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo10675(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        if (interfaceC7184.getDescriptor().mo12410() || mo10658()) {
            return mo10657(interfaceC7184);
        }
        return null;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC7189 mo10676(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo10678(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void m11932() {
        throw new SerializationException(AbstractC4396.f12975.mo8917(getClass()) + " can't retrieve untyped values");
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public String mo10686(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return mo10662();
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC7187 mo10689(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        return this;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public char mo10690() {
        m11932();
        throw null;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo10691() {
        m11932();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public abstract void mo11933();

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public double mo10696() {
        m11932();
        throw null;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public float mo10697() {
        m11932();
        throw null;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public abstract short mo10698();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public abstract AbstractC6347 mo11692(InterfaceC5093 interfaceC5093, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public abstract void mo11934();

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public long mo10699(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return mo10668();
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public abstract byte mo10700();
}
