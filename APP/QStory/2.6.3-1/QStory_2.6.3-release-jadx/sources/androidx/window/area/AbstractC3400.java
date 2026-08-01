package androidx.window.area;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.compose.animation.core.C1171;
import androidx.compose.p001ui.graphics.vector.C2378;
import androidx.compose.p001ui.text.font.C2811;
import androidx.compose.p001ui.text.font.C2812;
import androidx.compose.p001ui.text.font.C2814;
import androidx.compose.p001ui.text.font.C2828;
import androidx.core.util.C3020;
import androidx.lifecycle.AbstractC3258;
import bsh.C3466;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.resource.bitmap.C3869;
import com.bumptech.glide.load.resource.bitmap.C3874;
import com.google.android.material.chip.Chip;
import com.google.android.material.datepicker.AbstractC3953;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.http.cio.internals.C4785;
import io.ktor.http.cio.internals.C4788;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.AbstractC6017;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.C5170;
import kotlin.collections.C5173;
import kotlin.collections.C5174;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.AbstractC5904;
import kotlin.reflect.jvm.internal.C5821;
import kotlin.reflect.jvm.internal.C5902;
import kotlin.reflect.jvm.internal.InterfaceC5843;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5471;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5356;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.protobuf.C5557;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6262;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.C6192;
import kotlinx.serialization.protobuf.internal.C6357;
import net.bytebuddy.pool.TypePool;
import p023.C6985;
import p023.C6986;
import p029.AbstractC7059;
import p050.AbstractC7176;
import p064.C7341;
import p064.C7348;
import p068.InterfaceC7383;
import p083.C7716;
import p083.C7722;
import p086.AbstractC7741;
import p086.InterfaceC7737;
import p087.AbstractC7742;
import p097.InterfaceC7857;
import p099.C7868;
import p191.AbstractC8568;
import p221.C8728;
import p221.C8730;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC6662;
import top.suzhelan.qstory.p015ui.views.CustomChipGroup;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2378 f8065;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C7868 m5620(C1171 c1171, InterfaceC7857 interfaceC7857) {
        c1171.getClass();
        interfaceC7857.getClass();
        return new C7868(c1171, interfaceC7857, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m5621(int i, String str) {
        int iM5643 = m5643(str, 0, i, false);
        Matcher matcher = C6985.f17268.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iM10729 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM5643 < i) {
            int iM56432 = m5643(str, iM5643 + 1, i, true);
            matcher.region(iM5643, iM56432);
            if (i3 == -1 && matcher.usePattern(C6985.f17268).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(C6985.f17269).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i4 = Integer.parseInt(strGroup4);
            } else if (iM10729 == -1) {
                Pattern pattern = C6985.f17271;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iM10729 = AbstractC5976.m10729(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i2 == -1 && matcher.usePattern(C6985.f17270).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
            }
            iM5643 = m5643(str, iM56432 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            C6755.m11869("Failed requirement.");
            return 0L;
        }
        if (iM10729 == -1) {
            C6755.m11869("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            C6755.m11869("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            C6755.m11869("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            C6755.m11869("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            C6755.m11869("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC7059.f17512);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iM10729 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final long m5622(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        C8730[] c8730Arr = C8728.f22212;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m5623(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static InterfaceC5189 m5624(InterfaceC5189 interfaceC5189) {
        InterfaceC5189<Object> interfaceC5189Intercepted;
        interfaceC5189.getClass();
        ContinuationImpl continuationImpl = interfaceC5189 instanceof ContinuationImpl ? (ContinuationImpl) interfaceC5189 : null;
        return (continuationImpl == null || (interfaceC5189Intercepted = continuationImpl.intercepted()) == null) ? interfaceC5189 : interfaceC5189Intercepted;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static String m5625(long j, Locale locale) {
        return AbstractC3953.m7692("yMMMd", locale).format(new Date(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static Object m5626(InterfaceC7383 interfaceC7383, Object obj, final InterfaceC5189 interfaceC5189) {
        interfaceC7383.getClass();
        final InterfaceC5192 context = interfaceC5189.getContext();
        Object obj2 = context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(interfaceC5189) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC5189);
                interfaceC5189.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                AbstractC6017.m10769(result);
                return result;
            }
        } : new ContinuationImpl(interfaceC5189, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC5189, context);
                interfaceC5189.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                AbstractC6017.m10769(result);
                return result;
            }
        };
        AbstractC5220.m9447(2, interfaceC7383);
        return interfaceC7383.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static C7348 m5627(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C7348(i, i2 - 1, 1);
        }
        C7348 c7348 = C7348.f18172;
        return C7348.f18172;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static C7341 m5628(C7348 c7348, int i) {
        c7348.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
        int i2 = c7348.f18163;
        int i3 = c7348.f18161;
        if (c7348.f18162 <= 0) {
            i = -i;
        }
        return new C7341(i2, i3, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final Object m5629(C6192 c6192, boolean z, C6192 c61922, InterfaceC7383 interfaceC7383) throws Throwable {
        Object c6262;
        Object objM11148;
        try {
            if (interfaceC7383 instanceof BaseContinuationImpl) {
                AbstractC5220.m9447(2, interfaceC7383);
                c6262 = interfaceC7383.invoke(c61922, c6192);
            } else {
                c6262 = m5626(interfaceC7383, c61922, c6192);
            }
        } catch (DispatchException e) {
            c6192.m11147(new C6262(e.getCause(), false));
            throw e.getCause();
        } catch (Throwable th) {
            c6262 = new C6262(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c6262 == coroutineSingletons || (objM11148 = c6192.m11148(c6262)) == AbstractC6231.f15379) {
            return coroutineSingletons;
        }
        c6192.mo10944();
        if (!(objM11148 instanceof C6262)) {
            return AbstractC6231.m11039(objM11148);
        }
        if (!z) {
            Throwable th2 = ((C6262) objM11148).f15420;
            if ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == c6192) {
                if (c6262 instanceof C6262) {
                    throw ((C6262) c6262).f15420;
                }
                return c6262;
            }
        }
        throw ((C6262) objM11148).f15420;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final void m5630(C4785 c4785, C4788 c4788) {
        int i = c4788.f12526;
        int i2 = c4788.f12525;
        if (i >= i2 || !AbstractC8568.m13623(c4785.charAt(i))) {
            return;
        }
        do {
            i++;
            if (i >= i2) {
                break;
            }
        } while (AbstractC8568.m13623(c4785.charAt(i)));
        c4788.f12526 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static float m5631(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static double m5632(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m5633(CustomChipGroup customChipGroup, ArrayList arrayList, View view) {
        customChipGroup.removeAllViews();
        if (arrayList.isEmpty()) {
            customChipGroup.setVisibility(8);
            return;
        }
        customChipGroup.setVisibility(0);
        Context context = view.getContext();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Chip chip = new Chip(context, null);
            chip.setText(str);
            chip.setCloseIconVisible(true);
            chip.setOnCloseIconClickListener(new ViewOnClickListenerC6662(arrayList, str, customChipGroup, view, 3));
            customChipGroup.addView(chip);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m5634(Ref$ObjectRef ref$ObjectRef, ImageView imageView, File file, View view) {
        if (((CharSequence) ref$ObjectRef.element).length() == 0) {
            imageView.setImageResource(0);
            return;
        }
        File file2 = new File(file, (String) ref$ObjectRef.element);
        if (!file2.exists()) {
            imageView.setImageResource(0);
            return;
        }
        C3894 c3894M7359 = ComponentCallbacks2C3890.m7325(view.getContext()).m7359(file2);
        c3894M7359.getClass();
        ((C3894) c3894M7359.m7183(C3869.f10012, new C3874())).m7349(imageView);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6357 m5635(C6357 c6357, long j) {
        return new C6357(j == 19500 ? c6357.m11346() : c6357.m11347());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m5636(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return true;
        }
        Class cls3 = null;
        try {
            if (cls2.equals(Boolean.class)) {
                cls3 = Boolean.TYPE;
            } else if (cls2.equals(Integer.class)) {
                cls3 = Integer.TYPE;
            } else if (cls2.equals(Long.class)) {
                cls3 = Long.TYPE;
            } else if (cls2.equals(Byte.class)) {
                cls3 = Byte.TYPE;
            } else if (cls2.equals(Short.class)) {
                cls3 = Short.TYPE;
            } else if (cls2.equals(Float.class)) {
                cls3 = Float.TYPE;
            } else if (cls2.equals(Double.class)) {
                cls3 = Double.TYPE;
            } else if (cls2.equals(Character.class)) {
                cls3 = Character.TYPE;
            }
        } catch (Exception unused) {
        }
        if (cls.equals(cls3)) {
            return true;
        }
        return cls.isAssignableFrom(cls2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static String m5637(long j, Locale locale) {
        return AbstractC3953.m7692("MMMd", locale).format(new Date(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Set m5638() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final long m5639(double d) {
        return m5622((float) d, 4294967296L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final long m5640(int i) {
        return m5622(i, 4294967296L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5471 m5641(ProtoBuf$Property protoBuf$Property, InterfaceC7737 interfaceC7737, C6986 c6986, boolean z, boolean z2, boolean z3) {
        protoBuf$Property.getClass();
        interfaceC7737.getClass();
        C5557 c5557 = AbstractC7742.f18774;
        c5557.getClass();
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC7741.m12763(protoBuf$Property, c5557);
        if (jvmProtoBuf$JvmPropertySignature == null) {
            return null;
        }
        if (z) {
            C5558 c5558 = C7722.f18692;
            C7716 c7716M12729 = C7722.m12729(protoBuf$Property, interfaceC7737, c6986, z3);
            if (c7716M12729 == null) {
                return null;
            }
            return AbstractC3888.m7272(c7716M12729);
        }
        if (!z2 || !jvmProtoBuf$JvmPropertySignature.hasSyntheticMethod()) {
            return null;
        }
        JvmProtoBuf$JvmMethodSignature syntheticMethod = jvmProtoBuf$JvmPropertySignature.getSyntheticMethod();
        syntheticMethod.getClass();
        return new C5471(interfaceC7737.getString(syntheticMethod.getName()).concat(interfaceC7737.getString(syntheticMethod.getDesc())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static int m5643(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static AbstractC3258 m5644(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                C3466.m5899(AbstractC0900.m714(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (AbstractC3258) objNewInstance;
            } catch (IllegalAccessException e) {
                C1123.m1408(AbstractC0900.m714(cls, "Cannot create an instance of "), e);
                return null;
            } catch (InstantiationException e2) {
                C1123.m1408(AbstractC0900.m714(cls, "Cannot create an instance of "), e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            C1123.m1408(AbstractC0900.m714(cls, "Cannot create an instance of "), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C3020 m5645(Long l, Long l2) {
        if (l == null && l2 == null) {
            return new C3020(null, null);
        }
        if (l == null) {
            return new C3020(null, m5646(l2.longValue()));
        }
        if (l2 == null) {
            return new C3020(m5646(l.longValue()), null);
        }
        Calendar calendarM7688 = AbstractC3953.m7688();
        Calendar calendarM7694 = AbstractC3953.m7694(null);
        calendarM7694.setTimeInMillis(l.longValue());
        Calendar calendarM76942 = AbstractC3953.m7694(null);
        calendarM76942.setTimeInMillis(l2.longValue());
        return calendarM7694.get(1) == calendarM76942.get(1) ? calendarM7694.get(1) == calendarM7688.get(1) ? new C3020(m5637(l.longValue(), Locale.getDefault()), m5637(l2.longValue(), Locale.getDefault())) : new C3020(m5637(l.longValue(), Locale.getDefault()), m5625(l2.longValue(), Locale.getDefault())) : new C3020(m5625(l.longValue(), Locale.getDefault()), m5625(l2.longValue(), Locale.getDefault()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String m5646(long j) {
        Calendar calendarM7688 = AbstractC3953.m7688();
        Calendar calendarM7694 = AbstractC3953.m7694(null);
        calendarM7694.setTimeInMillis(j);
        return calendarM7688.get(1) == calendarM7694.get(1) ? m5637(j, Locale.getDefault()) : m5625(j, Locale.getDefault());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final int m5647(C4785 c4785, C4788 c4788) {
        int i = c4788.f12526;
        int i2 = c4788.f12525;
        if (i < i2 && !AbstractC8568.m13623(c4785.charAt(i))) {
            do {
                i++;
                if (i >= i2) {
                    break;
                }
            } while (!AbstractC8568.m13623(c4785.charAt(i)));
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Object m5648(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static long m5649(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m5650(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static InterfaceC5189 m5651(final InterfaceC7383 interfaceC7383, final Object obj, final InterfaceC5189 interfaceC5189) {
        interfaceC7383.getClass();
        interfaceC5189.getClass();
        if (interfaceC7383 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) interfaceC7383).create(obj, interfaceC5189);
        }
        final InterfaceC5192 context = interfaceC5189.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(interfaceC5189, interfaceC7383, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ InterfaceC7383 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC5189);
                this.$this_createCoroutineUnintercepted$inlined = interfaceC7383;
                this.$receiver$inlined = obj;
                interfaceC5189.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        C6755.m11870("This coroutine had already completed");
                        return null;
                    }
                    this.label = 2;
                    AbstractC6017.m10769(result);
                    return result;
                }
                this.label = 1;
                AbstractC6017.m10769(result);
                this.$this_createCoroutineUnintercepted$inlined.getClass();
                InterfaceC7383 interfaceC73832 = this.$this_createCoroutineUnintercepted$inlined;
                AbstractC5220.m9447(2, interfaceC73832);
                return interfaceC73832.invoke(this.$receiver$inlined, this);
            }
        } : new ContinuationImpl(interfaceC5189, context, interfaceC7383, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ InterfaceC7383 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC5189, context);
                this.$this_createCoroutineUnintercepted$inlined = interfaceC7383;
                this.$receiver$inlined = obj;
                interfaceC5189.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        C6755.m11870("This coroutine had already completed");
                        return null;
                    }
                    this.label = 2;
                    AbstractC6017.m10769(result);
                    return result;
                }
                this.label = 1;
                AbstractC6017.m10769(result);
                this.$this_createCoroutineUnintercepted$inlined.getClass();
                InterfaceC7383 interfaceC73832 = this.$this_createCoroutineUnintercepted$inlined;
                AbstractC5220.m9447(2, interfaceC73832);
                return interfaceC73832.invoke(this.$receiver$inlined, this);
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C2828 m5652(Context context) {
        C2812 c2812 = new C2812();
        context.getApplicationContext();
        return new C2828(c2812, new C2811(Build.VERSION.SDK_INT >= 31 ? C2814.f6210.m4260(context) : 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m5653(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return (((long) i) & 4294967295L) < (((long) i2) & 4294967295L) ? -1 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C5902 m5654(List list, C5902 c5902, InterfaceC5843 interfaceC5843, ClassLoader classLoader) {
        list.getClass();
        ArrayList<C5821> arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5356 c5356 = (C5356) it.next();
            String str = c5356.f13523;
            KVariance kVarianceM8852 = AbstractC4765.m8852(c5356.f13521);
            AbstractC5377.f13599.m1137(c5356, AbstractC5377.f13608[52]);
            arrayList.add(new C5821(interfaceC5843, str, kVarianceM8852));
        }
        C5174 c5174M9346 = AbstractC5176.m9346(list);
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(c5174M9346, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        Iterator it2 = c5174M9346.iterator();
        while (true) {
            C5170 c5170 = (C5170) it2;
            if (!c5170.f13264.hasNext()) {
                break;
            }
            C5173 c5173 = (C5173) c5170.next();
            Pair pair = new Pair(Integer.valueOf(((C5356) c5173.f13268).f13522), arrayList.get(c5173.f13269));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        C5902 c59022 = new C5902(arrayList, linkedHashMap, c5902);
        int i = 0;
        for (C5821 c5821 : arrayList) {
            int i2 = i + 1;
            ArrayList arrayList2 = ((C5356) list.get(i)).f13520;
            ?? arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(AbstractC4765.m8849((C5366) it3.next(), classLoader, c59022, null));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = AbstractC7176.m12487(AbstractC5904.f14963);
            }
            c5821.getClass();
            c5821.f14741 = arrayList3;
            i = i2;
        }
        return c59022;
    }
}
