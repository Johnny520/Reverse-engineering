package p175;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0194;
import androidx.appcompat.widget.ViewOnTouchListenerC0179;
import androidx.collection.C0276;
import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.AbstractC1081;
import androidx.compose.foundation.AbstractC1092;
import androidx.compose.foundation.text.selection.AbstractC0921;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.ui.contentcapture.ViewOnAttachStateChangeListenerC1421;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.vector.C1543;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1945;
import androidx.compose.ui.semantics.C1950;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.text.C2031;
import androidx.core.widget.AbstractC2294;
import com.alibaba.fastjson2.C2941;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.load.engine.C3004;
import com.davemorrissey.labs.subscaleview.R;
import com.esotericsoftware.kryo.util.C3075;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import io.ktor.http.cio.C3957;
import io.ktor.util.C4210;
import io.ktor.utils.io.jvm.javaio.C4221;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4337;
import kotlin.collections.C4340;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4683;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4895;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4850;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.io.C5475;
import net.bytebuddy.description.type.TypeDescription;
import okhttp3.TlsVersion;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.C5723;
import p015.C6192;
import p015.C6219;
import p015.C6223;
import p015.C6226;
import p017.AbstractC6238;
import p032.AbstractC6317;
import p033.AbstractC6325;
import p046.InterfaceC6480;
import p049.AbstractC6529;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p057.AbstractC6853;
import p057.InterfaceC6850;
import p070.InterfaceC6907;
import p075.C6957;
import p079.AbstractC6988;
import p089.C7179;
import p095.C7206;
import p095.ExecutorC7207;
import p153.C7598;
import p164.C7663;
import p165.C7676;
import p167.C7693;
import p167.C7697;
import p167.C7705;
import p175.AbstractC7738;
import p236.AbstractC8099;
import p236.C8100;
import p236.C8104;
import p251.AbstractC8174;
import p253.AbstractC8189;
import p261.AbstractC8247;
import p314.AbstractC8669;
import p325.C8762;
import p345.AbstractC8838;
import p345.AbstractC8840;
import p345.AbstractC8842;
import p345.AbstractC8844;
import p345.AbstractC8845;
import p345.C8839;
import p345.C8847;
import p396.C9135;
import top.suzhelan.qstory.hook.item.C5919;
import top.yukonga.miuix.kmp.theme.ColorSchemeMode;
import top.yukonga.miuix.kmp.utils.C6054;
import top.yukonga.miuix.kmp.utils.C6073;

/* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7738 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1543 f21003;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static C4221 m13019(InputStream inputStream, InterfaceC6850 interfaceC6850) {
        C7206 c7206 = AbstractC5394.f15030;
        ExecutorC7207 executorC7207 = ExecutorC7207.f19230;
        executorC7207.getClass();
        interfaceC6850.getClass();
        return new C4221(new C5475(inputStream), executorC7207);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static void m13020(Activity activity, View view, boolean z) {
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        FrameLayout frameLayout = new FrameLayout(activity);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 16;
        layoutParams.format = -2;
        layoutParams.type = 1003;
        layoutParams.flags = 201327872;
        layoutParams.softInputMode = 16;
        if (!z) {
            view.setOnTouchListener(new ViewOnTouchListenerC0179(activity, 3));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        windowManager.addView(frameLayout, layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static C4221 m13021(InputStream inputStream) {
        C7206 c7206 = AbstractC5394.f15030;
        ExecutorC7207 executorC7207 = ExecutorC7207.f19230;
        C3957 c3957 = AbstractC6853.f18300;
        inputStream.getClass();
        executorC7207.getClass();
        c3957.getClass();
        return new C4221(new C5475(inputStream), executorC7207);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final long m13022(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final void m13023(C8100 c8100, String str) {
        c8100.getClass();
        str.getClass();
        c8100.m13542(AbstractC5143.m10164(str) ? EmptyList.INSTANCE : str.equals("/") ? AbstractC8099.f22377 : new ArrayList(AbstractC5143.m10147(str, new char[]{'/'})));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static int m13024(Context context, int i, int i2) {
        TypedValue typedValueM13597 = AbstractC8174.m13597(context.getTheme(), i);
        return (typedValueM13597 == null || typedValueM13597.type != 16) ? i2 : typedValueM13597.data;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final String[] m13025(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 != null) {
            return strArrD1;
        }
        throw new InconsistentKotlinMetadataException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static C7676 m13026(Context context) {
        TypedValue typedValueM13597 = AbstractC8174.m13597(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = AbstractC8669.f24441;
        TypedArray typedArrayObtainStyledAttributes = typedValueM13597 == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueM13597.resourceId, iArr);
        C7676 c7676 = new C7676();
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
            c7676.f20849 = Math.sqrt(f);
            c7676.f20847 = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            c7676.f20848 = f2;
            c7676.f20847 = false;
            typedArrayObtainStyledAttributes.recycle();
            return c7676;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static TimeInterpolator m13027(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            C5919.m11249("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m13029(strValueOf, "cubic-bezier") && !m13029(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m13029(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(m13048(strArrSplit, 0), m13048(strArrSplit, 1), m13048(strArrSplit, 2), m13048(strArrSplit, 3));
            }
            C2941.m6334(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!m13029(strValueOf, "path")) {
            C5919.m11249("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strM160 = AbstractC0053.m160(1, 5, strValueOf);
        Path path = new Path();
        try {
            C7663.m12907(AbstractC5061.m10044(strM160), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            C0276.m847("Error in parsing ".concat(strM160), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final boolean m13028(AbstractC4881 abstractC4881, AbstractC4881 abstractC48812) {
        abstractC4881.getClass();
        abstractC48812.getClass();
        return InterfaceC4850.f14129.m9608(abstractC4881, abstractC48812);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m13029(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final boolean m13030(InterfaceC4462 interfaceC4462, InterfaceC4872 interfaceC4872, Set set) {
        interfaceC4462.getClass();
        List<AbstractC4881> upperBounds = interfaceC4462.getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (AbstractC4881 abstractC4881 : upperBounds) {
            abstractC4881.getClass();
            if (m13039(abstractC4881, interfaceC4462.mo9035().mo9732(), set) && (interfaceC4872 == null || AbstractC4394.m8917(abstractC4881.mo9732(), interfaceC4872))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static Activity m13031() {
        try {
        } catch (Exception unused) {
        }
        for (Object obj : ((Map) AbstractC6317.m11836(AbstractC6317.m11832(Class.forName("android.app.ActivityThread"), "sCurrentActivityThread").get(null), "mActivities")).values()) {
            if (!((Boolean) AbstractC6317.m11831(Boolean.TYPE, "paused", obj)).booleanValue()) {
                Activity activity = (Activity) AbstractC6317.m11832(obj.getClass(), "activity").get(obj);
                AbstractC3065.m6858(activity);
                return activity;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final AbstractC4881 m13032(InterfaceC4462 interfaceC4462) {
        Object obj;
        interfaceC4462.getClass();
        List upperBounds = interfaceC4462.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List upperBounds2 = interfaceC4462.getUpperBounds();
        upperBounds2.getClass();
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC4476 interfaceC4476Mo9221 = ((AbstractC4881) next).mo9732().mo9221();
            AbstractC6988 abstractC6988 = interfaceC4476Mo9221 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9221 : null;
            if (abstractC6988 != null && abstractC6988.mo9020() != ClassKind.INTERFACE && abstractC6988.mo9020() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        AbstractC4881 abstractC4881 = (AbstractC4881) obj;
        if (abstractC4881 != null) {
            return abstractC4881;
        }
        List upperBounds3 = interfaceC4462.getUpperBounds();
        upperBounds3.getClass();
        Object objM8827 = AbstractC4343.m8827(upperBounds3);
        objM8827.getClass();
        return (AbstractC4881) objM8827;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final AbstractC4913 m13033(AbstractC4881 abstractC4881) {
        AbstractC4913 abstractC4913M9828;
        abstractC4881.getClass();
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        if (abstractC4913Mo9778 instanceof AbstractC4895) {
            AbstractC4895 abstractC4895 = (AbstractC4895) abstractC4913Mo9778;
            AbstractC4877 abstractC4877M9828 = abstractC4895.f14212;
            if (!abstractC4877M9828.mo9732().getParameters().isEmpty() && abstractC4877M9828.mo9732().mo9221() != null) {
                List parameters = abstractC4877M9828.mo9732().getParameters();
                parameters.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C4884((InterfaceC4462) it.next()));
                }
                abstractC4877M9828 = AbstractC4892.m9828(abstractC4877M9828, arrayList, null, 2);
            }
            AbstractC4877 abstractC4877M98282 = abstractC4895.f14213;
            if (!abstractC4877M98282.mo9732().getParameters().isEmpty() && abstractC4877M98282.mo9732().mo9221() != null) {
                List parameters2 = abstractC4877M98282.mo9732().getParameters();
                parameters2.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C4884((InterfaceC4462) it2.next()));
                }
                abstractC4877M98282 = AbstractC4892.m9828(abstractC4877M98282, arrayList2, null, 2);
            }
            abstractC4913M9828 = AbstractC4892.m9815(abstractC4877M9828, abstractC4877M98282);
        } else {
            if (!(abstractC4913Mo9778 instanceof AbstractC4877)) {
                C4210.m8621();
                return null;
            }
            AbstractC4877 abstractC4877 = (AbstractC4877) abstractC4913Mo9778;
            boolean zIsEmpty = abstractC4877.mo9732().getParameters().isEmpty();
            abstractC4913M9828 = abstractC4877;
            if (!zIsEmpty) {
                InterfaceC4476 interfaceC4476Mo9221 = abstractC4877.mo9732().mo9221();
                abstractC4913M9828 = abstractC4877;
                if (interfaceC4476Mo9221 != null) {
                    List parameters3 = abstractC4877.mo9732().getParameters();
                    parameters3.getClass();
                    ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C4884((InterfaceC4462) it3.next()));
                    }
                    abstractC4913M9828 = AbstractC4892.m9828(abstractC4877, arrayList3, null, 2);
                }
            }
        }
        return AbstractC4892.m9830(abstractC4913M9828, abstractC4913Mo9778);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final AbstractC4881 m13034(AbstractC4881 abstractC4881, InterfaceC6480 interfaceC6480) {
        return (abstractC4881.getAnnotations().isEmpty() && interfaceC6480.isEmpty()) ? abstractC4881 : abstractC4881.mo9778().mo9776(AbstractC4892.m9821(abstractC4881.mo9733(), interfaceC6480));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final long m13035(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static float m13036(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2294.m4301(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final AbstractC4913 m13037(AbstractC4881 abstractC4881) {
        abstractC4881.getClass();
        AbstractC4913 abstractC4913M9856 = AbstractC4916.m9856(abstractC4881, true);
        abstractC4913M9856.getClass();
        return abstractC4913M9856;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static void m13038(Context context) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid != Process.myPid()) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m13039(AbstractC4881 abstractC4881, InterfaceC4872 interfaceC4872, Set set) {
        boolean zM13039;
        if (AbstractC4394.m8917(abstractC4881.mo9732(), interfaceC4872)) {
            return true;
        }
        InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
        InterfaceC4495 interfaceC4495 = interfaceC4476Mo9221 instanceof InterfaceC4495 ? (InterfaceC4495) interfaceC4476Mo9221 : null;
        List listMo9025 = interfaceC4495 != null ? interfaceC4495.mo9025() : null;
        Iterable iterableM8796 = AbstractC4343.m8796(abstractC4881.mo9736());
        if (!(iterableM8796 instanceof Collection) || !((Collection) iterableM8796).isEmpty()) {
            Iterator it = iterableM8796.iterator();
            do {
                C4337 c4337 = (C4337) it;
                if (c4337.f12915.hasNext()) {
                    C4340 c4340 = (C4340) c4337.next();
                    int i = c4340.f12920;
                    AbstractC4869 abstractC4869 = (AbstractC4869) c4340.f12919;
                    InterfaceC4462 interfaceC4462 = listMo9025 != null ? (InterfaceC4462) AbstractC4343.m8831(i, listMo9025) : null;
                    if ((interfaceC4462 == null || set == null || !set.contains(interfaceC4462)) && !abstractC4869.mo9750()) {
                        AbstractC4881 abstractC4881Mo9751 = abstractC4869.mo9751();
                        abstractC4881Mo9751.getClass();
                        zM13039 = m13039(abstractC4881Mo9751, interfaceC4872, set);
                    } else {
                        zM13039 = false;
                    }
                }
            } while (!zM13039);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m13040(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C1945 m13041(InterfaceC6557... interfaceC6557Arr) {
        if (interfaceC6557Arr.length > 0) {
            return new C1945(interfaceC6557Arr, 2);
        }
        C5919.m11249("Failed requirement.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m13042(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & DefaultClassResolver.NAME);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m13043(C8100 c8100, StringBuilder sb) throws IOException {
        int i;
        List listM13660;
        sb.append(c8100.m13543().f22324);
        String str = c8100.m13543().f22324;
        int iHashCode = str.hashCode();
        if (iHashCode != -1081572750) {
            if (iHashCode != 3143036) {
                if (iHashCode == 92611469 && str.equals("about")) {
                    CharSequence charSequence = c8100.f22384;
                    sb.append(":");
                    sb.append(charSequence);
                    return;
                }
            } else if (str.equals("file")) {
                CharSequence charSequence2 = c8100.f22384;
                String strM13045 = m13045(c8100);
                sb.append("://");
                sb.append(charSequence2);
                if (!AbstractC5143.m10146(strM13045, '/')) {
                    sb.append('/');
                }
                sb.append((CharSequence) strM13045);
                return;
            }
        } else if (str.equals("mailto")) {
            StringBuilder sb2 = new StringBuilder();
            String str2 = c8100.f22380;
            String str3 = c8100.f22379;
            if (str2 != null) {
                sb2.append(str2);
                if (str3 != null) {
                    sb2.append(':');
                    sb2.append(str3);
                }
                sb2.append("@");
            }
            CharSequence string = sb2.toString();
            CharSequence charSequence3 = c8100.f22384;
            sb.append(":");
            sb.append(string);
            sb.append(charSequence3);
            return;
        }
        sb.append("://");
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        String str4 = c8100.f22380;
        String str5 = c8100.f22379;
        if (str4 != null) {
            sb4.append(str4);
            if (str5 != null) {
                sb4.append(':');
                sb4.append(str5);
            }
            sb4.append("@");
        }
        sb3.append(sb4.toString());
        sb3.append(c8100.f22384);
        int i2 = c8100.f22382;
        if (i2 != 0 && i2 != c8100.m13543().f22323) {
            sb3.append(":");
            sb3.append(String.valueOf(c8100.f22382));
        }
        sb.append(sb3.toString());
        String strM130452 = m13045(c8100);
        C8104 c8104 = c8100.f22387;
        boolean z = c8100.f22383;
        strM130452.getClass();
        c8104.getClass();
        if (!AbstractC5143.m10164(strM130452) && !AbstractC5138.m10125(strM130452, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) strM130452);
        if (!((Map) c8104.f3894).isEmpty() || z) {
            sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
        Set setMo2408 = c8104.mo2408();
        ArrayList arrayList = new ArrayList();
        Iterator it = setMo2408.iterator();
        while (true) {
            i = 10;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str6 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listM13660 = AbstractC8189.m13660(new Pair(str6, null));
            } else {
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Pair(str6, (String) it2.next()));
                }
                listM13660 = arrayList2;
            }
            AbstractC4343.m8794(listM13660, arrayList);
        }
        AbstractC4343.m8829(arrayList, sb, "&", null, null, new C7179(i), 60);
        if (c8100.f22386.length() > 0) {
            sb.append('#');
            sb.append(c8100.f22386);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m13044(final C3004 c3004, C8847 c8847, boolean z, InterfaceC1373 interfaceC1373, final int i) {
        final C8847 c88472;
        final boolean z2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) c3004.f9535;
        InterfaceC1395 interfaceC13952 = (InterfaceC1395) c3004.f9536;
        InterfaceC1395 interfaceC13953 = (InterfaceC1395) c3004.f9534;
        InterfaceC1395 interfaceC13954 = (InterfaceC1395) c3004.f9537;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1319431875);
        int i2 = (c1324.m2350(c3004) ? 4 : 2) | i | 400;
        if (c1324.m2333(i2 & 1, (i2 & 1171) != 1170)) {
            c1324.m2331();
            if ((i & 1) == 0 || c1324.m2343()) {
                c88472 = (C8847) c1324.m2373(AbstractC8844.f24933);
                z2 = true;
            } else {
                c1324.m2329();
                c88472 = c8847;
                z2 = z;
            }
            c1324.m2364();
            int i3 = AbstractC8845.f24934[((ColorSchemeMode) ((AbstractC1347) interfaceC13954).getValue()).ordinal()];
            C8839 c8839M12007 = null;
            C1353 c1353 = C1369.f3973;
            switch (i3) {
                case 1:
                    c1324.m2382(-472105063);
                    Boolean bool = (Boolean) ((AbstractC1347) interfaceC13953).getValue();
                    if (bool == null) {
                        c1324.m2382(677508490);
                        zBooleanValue = AbstractC1072.m1979(c1324);
                        c1324.m2367(false);
                    } else {
                        c1324.m2382(677508180);
                        c1324.m2367(false);
                        zBooleanValue = bool.booleanValue();
                    }
                    c8839M12007 = zBooleanValue ? (C8839) ((AbstractC1347) interfaceC13952).getValue() : (C8839) ((AbstractC1347) interfaceC1395).getValue();
                    c1324.m2367(false);
                    break;
                case 2:
                    c1324.m2382(677512192);
                    c1324.m2367(false);
                    c8839M12007 = (C8839) ((AbstractC1347) interfaceC1395).getValue();
                    break;
                case 3:
                    c1324.m2382(677513631);
                    c1324.m2367(false);
                    c8839M12007 = (C8839) ((AbstractC1347) interfaceC13952).getValue();
                    break;
                case 4:
                    c1324.m2382(-471854118);
                    Boolean bool2 = (Boolean) ((AbstractC1347) interfaceC13953).getValue();
                    if (bool2 == null) {
                        c1324.m2382(677516394);
                        zBooleanValue2 = AbstractC1072.m1979(c1324);
                        c1324.m2367(false);
                    } else {
                        c1324.m2382(677516084);
                        c1324.m2367(false);
                        zBooleanValue2 = bool2.booleanValue();
                    }
                    C1599 c1599M6431 = c3004.m6431();
                    if (c1599M6431 == null) {
                        c1324.m2382(-471779688);
                        c1324.m2367(false);
                    } else {
                        c1324.m2382(-471779687);
                        long j = c1599M6431.f4699;
                        boolean zM2350 = c1324.m2350(c3004.m6431()) | c1324.m2369(zBooleanValue2) | c1324.m2352(c3004.m6432().ordinal()) | c1324.m2352(c3004.m6433().ordinal());
                        Object objM2335 = c1324.m2335();
                        if (zM2350 || objM2335 == c1353) {
                            objM2335 = AbstractC8840.m14476(j, c3004.m6432(), c3004.m6433(), zBooleanValue2);
                            c1324.m2376(objM2335);
                        }
                        c8839M12007 = (C8839) objM2335;
                        c1324.m2367(false);
                    }
                    if (c8839M12007 == null) {
                        c1324.m2382(677523703);
                        C8839 c8839M120072 = AbstractC6560.m12007(zBooleanValue2, c1324);
                        c1324.m2367(false);
                        c8839M12007 = c8839M120072;
                    } else {
                        c1324.m2382(677517689);
                        c1324.m2367(false);
                    }
                    c1324.m2367(false);
                    break;
                case 5:
                    c1324.m2382(-471498579);
                    C1599 c1599M64312 = c3004.m6431();
                    if (c1599M64312 == null) {
                        c1324.m2382(-471490179);
                        c1324.m2367(false);
                    } else {
                        c1324.m2382(-471490178);
                        long j2 = c1599M64312.f4699;
                        boolean zM23502 = c1324.m2350(c3004.m6431()) | c1324.m2352(c3004.m6432().ordinal()) | c1324.m2352(c3004.m6433().ordinal());
                        Object objM23352 = c1324.m2335();
                        if (zM23502 || objM23352 == c1353) {
                            objM23352 = AbstractC8840.m14476(j2, c3004.m6432(), c3004.m6433(), false);
                            c1324.m2376(objM23352);
                        }
                        c8839M12007 = (C8839) objM23352;
                        c1324.m2367(false);
                    }
                    if (c8839M12007 == null) {
                        c1324.m2382(677532888);
                        C8839 c8839M120073 = AbstractC6560.m12007(false, c1324);
                        c1324.m2367(false);
                        c8839M12007 = c8839M120073;
                    } else {
                        c1324.m2382(677527029);
                        c1324.m2367(false);
                    }
                    c1324.m2367(false);
                    break;
                case 6:
                    c1324.m2382(-471213937);
                    C1599 c1599M64313 = c3004.m6431();
                    if (c1599M64313 == null) {
                        c1324.m2382(-471205506);
                        c1324.m2367(false);
                    } else {
                        c1324.m2382(-471205505);
                        long j3 = c1599M64313.f4699;
                        boolean zM23503 = c1324.m2350(c3004.m6431()) | c1324.m2352(c3004.m6432().ordinal()) | c1324.m2352(c3004.m6433().ordinal());
                        Object objM23353 = c1324.m2335();
                        if (zM23503 || objM23353 == c1353) {
                            objM23353 = AbstractC8840.m14476(j3, c3004.m6432(), c3004.m6433(), true);
                            c1324.m2376(objM23353);
                        }
                        c8839M12007 = (C8839) objM23353;
                        c1324.m2367(false);
                    }
                    if (c8839M12007 == null) {
                        c1324.m2382(677542039);
                        c8839M12007 = AbstractC6560.m12007(true, c1324);
                    } else {
                        c1324.m2382(677536211);
                    }
                    c1324.m2367(false);
                    c1324.m2367(false);
                    break;
                default:
                    c1324.m2382(677506653);
                    c1324.m2367(false);
                    C4210.m8621();
                    return;
            }
            Object objM23354 = c1324.m2335();
            if (objM23354 == c1353) {
                C8839 c8839 = new C8839(((C1599) ((AbstractC1347) c8839M12007.f24879).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24878).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24877).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24876).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24875).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24874).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24893).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24892).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24896).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24897).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24894).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24895).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24887).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24886).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24890).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24891).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24888).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24889).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24881).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24880).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24884).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24885).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24882).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24883).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24867).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24866).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24865).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24864).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24863).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24862).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24873).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24872).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24871).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24870).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24869).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24868).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24859).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24858).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24861).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24860).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24856).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24857).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24853).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24852).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24855).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24854).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24850).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24851).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24899).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24898).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24901).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24902).getValue()).f4699, ((C1599) ((AbstractC1347) c8839M12007.f24900).getValue()).f4699);
                c1324.m2376(c8839);
                objM23354 = c8839;
            }
            C8839 c88392 = (C8839) objM23354;
            C1334 c1334 = AbstractC8838.f24849;
            c88392.getClass();
            InterfaceC1395 interfaceC13955 = c88392.f24872;
            c8839M12007.getClass();
            ((AbstractC1347) c88392.f24879).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24879).getValue()).f4699));
            ((AbstractC1347) c88392.f24878).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24878).getValue()).f4699));
            ((AbstractC1347) c88392.f24877).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24877).getValue()).f4699));
            ((AbstractC1347) c88392.f24876).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24876).getValue()).f4699));
            ((AbstractC1347) c88392.f24875).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24875).getValue()).f4699));
            ((AbstractC1347) c88392.f24874).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24874).getValue()).f4699));
            ((AbstractC1347) c88392.f24893).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24893).getValue()).f4699));
            ((AbstractC1347) c88392.f24892).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24892).getValue()).f4699));
            ((AbstractC1347) c88392.f24896).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24896).getValue()).f4699));
            ((AbstractC1347) c88392.f24897).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24897).getValue()).f4699));
            ((AbstractC1347) c88392.f24894).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24894).getValue()).f4699));
            ((AbstractC1347) c88392.f24895).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24895).getValue()).f4699));
            ((AbstractC1347) c88392.f24887).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24887).getValue()).f4699));
            ((AbstractC1347) c88392.f24886).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24886).getValue()).f4699));
            ((AbstractC1347) c88392.f24890).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24890).getValue()).f4699));
            ((AbstractC1347) c88392.f24891).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24891).getValue()).f4699));
            ((AbstractC1347) c88392.f24888).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24888).getValue()).f4699));
            ((AbstractC1347) c88392.f24889).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24889).getValue()).f4699));
            ((AbstractC1347) c88392.f24881).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24881).getValue()).f4699));
            ((AbstractC1347) c88392.f24880).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24880).getValue()).f4699));
            ((AbstractC1347) c88392.f24884).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24884).getValue()).f4699));
            ((AbstractC1347) c88392.f24885).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24885).getValue()).f4699));
            ((AbstractC1347) c88392.f24882).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24882).getValue()).f4699));
            ((AbstractC1347) c88392.f24883).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24883).getValue()).f4699));
            ((AbstractC1347) c88392.f24867).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24867).getValue()).f4699));
            ((AbstractC1347) c88392.f24866).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24866).getValue()).f4699));
            ((AbstractC1347) c88392.f24865).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24865).getValue()).f4699));
            ((AbstractC1347) c88392.f24864).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24864).getValue()).f4699));
            ((AbstractC1347) c88392.f24863).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24863).getValue()).f4699));
            ((AbstractC1347) c88392.f24862).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24862).getValue()).f4699));
            ((AbstractC1347) c88392.f24873).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24873).getValue()).f4699));
            ((AbstractC1347) interfaceC13955).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24872).getValue()).f4699));
            ((AbstractC1347) c88392.f24871).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24871).getValue()).f4699));
            ((AbstractC1347) c88392.f24870).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24870).getValue()).f4699));
            ((AbstractC1347) c88392.f24869).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24869).getValue()).f4699));
            ((AbstractC1347) c88392.f24868).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24868).getValue()).f4699));
            ((AbstractC1347) c88392.f24859).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24859).getValue()).f4699));
            ((AbstractC1347) c88392.f24858).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24858).getValue()).f4699));
            ((AbstractC1347) c88392.f24861).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24861).getValue()).f4699));
            ((AbstractC1347) c88392.f24860).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24860).getValue()).f4699));
            ((AbstractC1347) c88392.f24856).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24856).getValue()).f4699));
            ((AbstractC1347) c88392.f24857).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24857).getValue()).f4699));
            ((AbstractC1347) c88392.f24853).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24853).getValue()).f4699));
            ((AbstractC1347) c88392.f24852).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24852).getValue()).f4699));
            ((AbstractC1347) c88392.f24855).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24855).getValue()).f4699));
            ((AbstractC1347) c88392.f24854).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24854).getValue()).f4699));
            ((AbstractC1347) c88392.f24850).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24850).getValue()).f4699));
            ((AbstractC1347) c88392.f24851).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24851).getValue()).f4699));
            ((AbstractC1347) c88392.f24899).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24899).getValue()).f4699));
            ((AbstractC1347) c88392.f24898).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24898).getValue()).f4699));
            ((AbstractC1347) c88392.f24901).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24901).getValue()).f4699));
            ((AbstractC1347) c88392.f24902).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24902).getValue()).f4699));
            ((AbstractC1347) c88392.f24900).setValue(new C1599(((C1599) ((AbstractC1347) c8839M12007.f24900).getValue()).f4699));
            Object objM23355 = c1324.m2335();
            if (objM23355 == c1353) {
                C2031 c2031 = (C2031) ((AbstractC1347) c88472.f24943).getValue();
                C2031 c20312 = (C2031) ((AbstractC1347) c88472.f24942).getValue();
                C2031 c20313 = (C2031) ((AbstractC1347) c88472.f24941).getValue();
                C2031 c20314 = (C2031) ((AbstractC1347) c88472.f24940).getValue();
                C2031 c20315 = (C2031) ((AbstractC1347) c88472.f24939).getValue();
                C2031 c20316 = (C2031) ((AbstractC1347) c88472.f24938).getValue();
                C2031 c20317 = (C2031) ((AbstractC1347) c88472.f24947).getValue();
                C2031 c20318 = (C2031) ((AbstractC1347) c88472.f24946).getValue();
                C2031 c20319 = (C2031) ((AbstractC1347) c88472.f24950).getValue();
                C2031 c203110 = (C2031) ((AbstractC1347) c88472.f24951).getValue();
                C2031 c203111 = (C2031) ((AbstractC1347) c88472.f24948).getValue();
                C2031 c203112 = (C2031) ((AbstractC1347) c88472.f24949).getValue();
                C2031 c203113 = (C2031) ((AbstractC1347) c88472.f24945).getValue();
                C2031 c203114 = (C2031) ((AbstractC1347) c88472.f24944).getValue();
                c2031.getClass();
                c20312.getClass();
                c20313.getClass();
                c20314.getClass();
                c20315.getClass();
                c20316.getClass();
                c20317.getClass();
                c20318.getClass();
                c20319.getClass();
                c203110.getClass();
                c203111.getClass();
                c203112.getClass();
                c203113.getClass();
                c203114.getClass();
                C8847 c88473 = new C8847(c2031, c20312, c20313, c20314, c20315, c20316, c20317, c20318, c20319, c203110, c203111, c203112, c203113, c203114);
                c1324.m2376(c88473);
                objM23355 = c88473;
            }
            C8847 c88474 = (C8847) objM23355;
            C1334 c13342 = AbstractC8844.f24933;
            c88474.getClass();
            c88472.getClass();
            C2031 c203115 = (C2031) ((AbstractC1347) c88472.f24943).getValue();
            c203115.getClass();
            ((AbstractC1347) c88474.f24943).setValue(c203115);
            C2031 c203116 = (C2031) ((AbstractC1347) c88472.f24942).getValue();
            c203116.getClass();
            ((AbstractC1347) c88474.f24942).setValue(c203116);
            C2031 c203117 = (C2031) ((AbstractC1347) c88472.f24941).getValue();
            c203117.getClass();
            ((AbstractC1347) c88474.f24941).setValue(c203117);
            C2031 c203118 = (C2031) ((AbstractC1347) c88472.f24940).getValue();
            c203118.getClass();
            ((AbstractC1347) c88474.f24940).setValue(c203118);
            C2031 c203119 = (C2031) ((AbstractC1347) c88472.f24939).getValue();
            c203119.getClass();
            ((AbstractC1347) c88474.f24939).setValue(c203119);
            C2031 c203120 = (C2031) ((AbstractC1347) c88472.f24938).getValue();
            c203120.getClass();
            ((AbstractC1347) c88474.f24938).setValue(c203120);
            C2031 c203121 = (C2031) ((AbstractC1347) c88472.f24947).getValue();
            c203121.getClass();
            ((AbstractC1347) c88474.f24947).setValue(c203121);
            C2031 c203122 = (C2031) ((AbstractC1347) c88472.f24946).getValue();
            c203122.getClass();
            ((AbstractC1347) c88474.f24946).setValue(c203122);
            C2031 c203123 = (C2031) ((AbstractC1347) c88472.f24950).getValue();
            c203123.getClass();
            ((AbstractC1347) c88474.f24950).setValue(c203123);
            C2031 c203124 = (C2031) ((AbstractC1347) c88472.f24951).getValue();
            c203124.getClass();
            ((AbstractC1347) c88474.f24951).setValue(c203124);
            C2031 c203125 = (C2031) ((AbstractC1347) c88472.f24948).getValue();
            c203125.getClass();
            ((AbstractC1347) c88474.f24948).setValue(c203125);
            C2031 c203126 = (C2031) ((AbstractC1347) c88472.f24949).getValue();
            c203126.getClass();
            ((AbstractC1347) c88474.f24949).setValue(c203126);
            C2031 c203127 = (C2031) ((AbstractC1347) c88472.f24945).getValue();
            c203127.getClass();
            ((AbstractC1347) c88474.f24945).setValue(c203127);
            C2031 c203128 = (C2031) ((AbstractC1347) c88472.f24944).getValue();
            c203128.getClass();
            ((AbstractC1347) c88474.f24944).setValue(c203128);
            boolean zM2351 = c1324.m2351(((C1599) ((AbstractC1347) interfaceC13955).getValue()).f4699);
            Object objM23356 = c1324.m2335();
            if (zM2351 || objM23356 == c1353) {
                objM23356 = new C6054(((C1599) ((AbstractC1347) interfaceC13955).getValue()).f4699);
                c1324.m2376(objM23356);
            }
            AbstractC1367.m2477(new C0194[]{AbstractC8838.f24849.mo2418(c88392), AbstractC8844.f24933.mo2418(c88474), AbstractC1092.f3220.mo2418((C6054) objM23356), AbstractC8840.f24903.mo2418((ColorSchemeMode) ((AbstractC1347) interfaceC13954).getValue()), AbstractC1081.f3210.mo2418(C6073.f16618), AbstractC8842.f24905.mo2418(Boolean.valueOf(z2))}, AbstractC1254.m2179(797156861, new C8762(8), c1324), c1324, 56);
        } else {
            c1324.m2329();
            c88472 = c8847;
            z2 = z;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553(c88472, z2, i) { // from class: 飘花落叶言苏哲兰楪子世.飘花落叶言子楪世兰哲苏

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C8847 f24842;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ boolean f24843;

                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2460 = AbstractC1367.m2460(3073);
                    AbstractC7738.m13044(this.f24844, this.f24842, this.f24843, (InterfaceC1373) obj, iM2460);
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final String m13045(C8100 c8100) {
        List list = c8100.f22385;
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) AbstractC4343.m8827(list)).length() == 0 ? "/" : (String) AbstractC4343.m8827(list) : AbstractC4343.m8813(list, "/", null, null, null, 62);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static float m13046(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2294.m4302(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C4690 m13047(InterfaceC6907 interfaceC6907, int i) {
        interfaceC6907.getClass();
        return C4690.m9341(interfaceC6907.getString(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static float m13048(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        C3075.m6914("Motion easing control point value must be between 0 and 1; instead got: ", f);
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static String m13049(String str) {
        FileInputStream fileInputStream;
        MessageDigest messageDigest;
        byte[] bArr;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                bArr = new byte[8192];
            } finally {
            }
        } catch (Exception e) {
            System.err.println("[BeanShell] GetMd5ByFilePath: " + e);
            return null;
        }
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                String strM13042 = m13042(messageDigest.digest());
                fileInputStream.close();
                return strM13042;
            }
            messageDigest.update(bArr, 0, i);
            System.err.println("[BeanShell] GetMd5ByFilePath: " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C6223 m13050(SSLSession sSLSession) throws IOException {
        List listM11709;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            C5919.m11250("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            C5919.m11246("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        C6226 c6226M11655 = C6226.f17145.m11655(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            C5919.m11250("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            C5919.m11246("tlsVersion == NONE");
            return null;
        }
        TlsVersion.Companion.getClass();
        TlsVersion tlsVersionM11643 = C6192.m11643(protocol);
        try {
            listM11709 = AbstractC6238.m11709(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listM11709 = EmptyList.INSTANCE;
        }
        return new C6223(tlsVersionM11643, c6226M11655, AbstractC6238.m11709(sSLSession.getLocalCertificates()), new C6219(0, listM11709));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4687 m13051(InterfaceC6907 interfaceC6907, int i) {
        interfaceC6907.getClass();
        return AbstractC4683.m9315(interfaceC6907.mo12137(i), interfaceC6907.mo12136(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static ArrayList m13052(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                arrayList.add(childAt);
                arrayList.addAll(m13052(childAt));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final AbstractC6529 m13053(AbstractC4881 abstractC4881) {
        abstractC4881.getClass();
        AbstractC6529 abstractC6529Mo9503 = abstractC4881.mo9732().mo9503();
        abstractC6529Mo9503.getClass();
        return abstractC6529Mo9503;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4884 m13054(AbstractC4881 abstractC4881, Variance variance, InterfaceC4462 interfaceC4462) {
        abstractC4881.getClass();
        variance.getClass();
        if ((interfaceC4462 != null ? interfaceC4462.mo9013() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new C4884(abstractC4881, variance);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C7697 m13055(Context context) {
        ProviderInfo providerInfo;
        C7598 c7598;
        ApplicationInfo applicationInfo;
        int i = 6;
        C6957 c7693 = Build.VERSION.SDK_INT >= 28 ? new C7693(i) : new C6957(i);
        PackageManager packageManager = context.getPackageManager();
        AbstractC6560.m12036(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c7598 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo12238 = c7693.mo12238(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo12238) {
                    arrayList.add(signature.toByteArray());
                }
                c7598 = new C7598(str, str2, "emojicompat-emoji-font", null, null, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c7598 = null;
            }
        }
        if (c7598 == null) {
            return null;
        }
        return new C7697(new C7705(context, c7598));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final void m13056(AbstractC4881 abstractC4881, AbstractC4877 abstractC4877, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
        if (interfaceC4476Mo9221 instanceof InterfaceC4462) {
            if (!AbstractC4394.m8917(abstractC4881.mo9732(), abstractC4877.mo9732())) {
                linkedHashSet.add(interfaceC4476Mo9221);
                return;
            }
            for (AbstractC4881 abstractC48812 : ((InterfaceC4462) interfaceC4476Mo9221).getUpperBounds()) {
                abstractC48812.getClass();
                m13056(abstractC48812, abstractC4877, linkedHashSet, set);
            }
            return;
        }
        InterfaceC4476 interfaceC4476Mo92212 = abstractC4881.mo9732().mo9221();
        InterfaceC4495 interfaceC4495 = interfaceC4476Mo92212 instanceof InterfaceC4495 ? (InterfaceC4495) interfaceC4476Mo92212 : null;
        List listMo9025 = interfaceC4495 != null ? interfaceC4495.mo9025() : null;
        int i = 0;
        for (AbstractC4869 abstractC4869 : abstractC4881.mo9736()) {
            int i2 = i + 1;
            InterfaceC4462 interfaceC4462 = listMo9025 != null ? (InterfaceC4462) AbstractC4343.m8831(i, listMo9025) : null;
            if ((interfaceC4462 == null || set == null || !set.contains(interfaceC4462)) && !abstractC4869.mo9750() && !AbstractC4343.m8789(linkedHashSet, abstractC4869.mo9751().mo9732().mo9221()) && !AbstractC4394.m8917(abstractC4869.mo9751().mo9732(), abstractC4877.mo9732())) {
                AbstractC4881 abstractC4881Mo9751 = abstractC4869.mo9751();
                abstractC4881Mo9751.getClass();
                m13056(abstractC4881Mo9751, abstractC4877, linkedHashSet, set);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C5723 m13057(DexKitBridge dexKitBridge, C9135 c9135) {
        dexKitBridge.getClass();
        int iM7302 = c9135.m7302(4);
        int i = iM7302 != 0 ? c9135.f10849.getInt(iM7302 + c9135.f10850) : 0;
        int iM73022 = c9135.m7302(6);
        int i2 = iM73022 != 0 ? c9135.f10849.getInt(iM73022 + c9135.f10850) : 0;
        int iM73023 = c9135.m7302(8);
        if (iM73023 != 0) {
            c9135.m7300(iM73023 + c9135.f10850);
        }
        int iM73024 = c9135.m7302(10);
        int i3 = iM73024 != 0 ? c9135.f10849.getInt(iM73024 + c9135.f10850) : 0;
        int iM73025 = c9135.m7302(12);
        String strM7300 = iM73025 != 0 ? c9135.m7300(iM73025 + c9135.f10850) : null;
        if (strM7300 == null) {
            strM7300 = "";
        }
        String str = strM7300;
        int iM73026 = c9135.m7302(14);
        int i4 = iM73026 != 0 ? c9135.f10849.getInt(iM73026 + c9135.f10850) : 0;
        Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
        ArrayList arrayList = new ArrayList();
        int iM73027 = c9135.m7302(16);
        int iM7298 = iM73027 != 0 ? c9135.m7298(iM73027) : 0;
        for (int i5 = 0; i5 < iM7298; i5++) {
            int iM73028 = c9135.m7302(16);
            arrayList.add(Integer.valueOf(iM73028 != 0 ? c9135.f10849.getInt((i5 * 4) + c9135.m7299(iM73028)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM73029 = c9135.m7302(18);
        int iM72982 = iM73029 != 0 ? c9135.m7298(iM73029) : 0;
        for (int i6 = 0; i6 < iM72982; i6++) {
            int iM730210 = c9135.m7302(18);
            arrayList2.add(Integer.valueOf(iM730210 != 0 ? c9135.f10849.getInt((i6 * 4) + c9135.m7299(iM730210)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM730211 = c9135.m7302(20);
        int iM72983 = iM730211 != 0 ? c9135.m7298(iM730211) : 0;
        for (int i7 = 0; i7 < iM72983; i7++) {
            int iM730212 = c9135.m7302(20);
            arrayList3.add(Integer.valueOf(iM730212 != 0 ? c9135.f10849.getInt((i7 * 4) + c9135.m7299(iM730212)) : 0));
        }
        return new C5723(dexKitBridge, i, i2, i3, str, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m13058(View view) {
        AbstractC3737 abstractC3737 = (AbstractC3737) view.getTag();
        if (abstractC3737 == null || abstractC3737.m8071() == null) {
            return;
        }
        ((WindowManager) abstractC3737.m8071().getSystemService("window")).removeViewImmediate((View) view.getParent());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m13059(ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C1950 c1950;
        C1953 c1953;
        C1941 c1941;
        InterfaceC6557 interfaceC6557;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseM1842 = AbstractC0921.m1842(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM1842 != null && (value = viewTranslationResponseM1842.getValue("android:text")) != null && (text = value.getText()) != null && (c1950 = (C1950) viewOnAttachStateChangeListenerC1421.m2537().m832((int) jKeyAt)) != null && (c1953 = c1950.f5760) != null && (c1941 = (C1941) AbstractC1957.m3663(c1953.f5768, AbstractC1959.f5808)) != null && (interfaceC6557 = (InterfaceC6557) c1941.f5705) != null) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract boolean mo13060(Class cls);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public abstract String[] mo13061(Class cls);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public abstract Method mo13062(Class cls, Field field);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract Constructor mo13063(Class cls);
}
