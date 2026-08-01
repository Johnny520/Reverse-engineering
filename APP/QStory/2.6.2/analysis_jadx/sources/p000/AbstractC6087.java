package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.C1067;
import androidx.compose.runtime.tooling.C1294;
import androidx.compose.runtime.tooling.C1296;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C2495;
import com.kongzue.dialogx.util.views.C3761;
import com.materialkolor.dynamiccolor.C3806;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.server.routing.C4157;
import io.ktor.util.C4210;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC5186;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.AbstractC5089;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.C5003;
import kotlin.reflect.jvm.internal.C5012;
import kotlin.reflect.jvm.internal.C5015;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4409;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4651;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.reflect.jvm.internal.types.C4926;
import kotlin.reflect.jvm.internal.types.C4938;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5114;
import kotlin.text.AbstractC5143;
import lin.util.ReflectUtils.ReflectException;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.compress.archivers.zip.C5584;
import org.apache.commons.compress.archivers.zip.C5592;
import org.apache.commons.lang3.AbstractC5685;
import p046.InterfaceC6480;
import p048.C6511;
import p048.C6518;
import p052.InterfaceC6542;
import p061.AbstractC6858;
import p062.AbstractC6859;
import p065.C6867;
import p066.AbstractC6869;
import p079.AbstractC6988;
import p083.C7040;
import p083.InterfaceC7036;
import p132.AbstractC7504;
import p205.AbstractC7896;
import p236.AbstractC8114;
import p236.C8112;
import p236.C8115;
import p236.C8124;
import p241.C8139;
import p247.AbstractC8156;
import p377.AbstractC8985;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子楪苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static ResourcesLoader f16639;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Method f16640;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long f16641;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static double m11387(double d, double d2) {
        double d3 = (d + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        if (d4 <= 0.008856451679035631d) {
            d4 = ((d3 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d5 = d4 * 100.0d;
        double d6 = (d2 + 16.0d) / 116.0d;
        double d7 = d6 * d6 * d6;
        if (d7 <= 0.008856451679035631d) {
            d7 = ((116.0d * d6) - 16.0d) / 903.2962962962963d;
        }
        return m11388(d5, d7 * 100.0d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static double m11388(double d, double d2) {
        double dMax = Math.max(d, d2);
        if (dMax != d2) {
            d = d2;
        }
        return (dMax + 5.0d) / (d + 5.0d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static Object m11389(Object[] objArr, Class[] clsArr, Class cls) {
        try {
            return m11403(cls, clsArr).newInstance(objArr);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            C5919.m11252(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static C4157 m11390(String str) {
        str.getClass();
        if (str.equals("/")) {
            return C4157.f12592;
        }
        int i = 23;
        return new C4157(AbstractC5121.m10106(AbstractC5121.m10111(new C5114(AbstractC5121.m10111(AbstractC5143.m10158(str, new String[]{"/"}, 0), new C1067(str, i)), true, new C3806(22)), new C3806(i))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static MappedByteBuffer m11391(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static Object m11392(Class cls, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return m11389(objArr, clsArr, cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m11393(File file) {
        if (file == null || file.exists()) {
            return;
        }
        m11393(file.getParentFile());
        file.mkdir();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static double m11394(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dM13576 = AbstractC8156.m13576(d);
        double d3 = ((dM13576 + 5.0d) * d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dM11388 = m11388(d3, dM13576);
        double dAbs = Math.abs(dM11388 - d2);
        if (dM11388 < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dM13579 = ((AbstractC8156.m13579(d3 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (dM13579 < 0.0d || dM13579 > 100.0d) {
            return -1.0d;
        }
        return dM13579;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5003 m11395(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (C5003) AbstractC4395.f12971.mo8927((Class) genericDeclaration);
        }
        C4210.m8623("Non-class container of a type parameter is not supported: ", genericDeclaration, " (", typeVariable);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m11396() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC7504.m12695();
        }
        try {
            if (f16640 == null) {
                f16641 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f16640 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f16640.invoke(null, Long.valueOf(f16641))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            C5919.m11252(cause);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static void m11397(Resources resources, String str) {
        try {
            AssetManager assets = resources.getAssets();
            Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(assets, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static File m11398(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m11399(Throwable th) {
        boolean z = (th == null || (th instanceof Error) || (th instanceof RuntimeException)) ? false : true;
        Object[] objArr = {th};
        if (z) {
        } else {
            throw new IllegalArgumentException(AbstractC5685.m10995(objArr) ? "Not a checked exception: %s" : String.format("Not a checked exception: %s", objArr));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Bundle m11400(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.component1();
            Object objComponent2 = pair.component2();
            if (objComponent2 == null) {
                bundle.putString(str, null);
            } else if (objComponent2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objComponent2).booleanValue());
            } else if (objComponent2 instanceof Byte) {
                bundle.putByte(str, ((Number) objComponent2).byteValue());
            } else if (objComponent2 instanceof Character) {
                bundle.putChar(str, ((Character) objComponent2).charValue());
            } else if (objComponent2 instanceof Double) {
                bundle.putDouble(str, ((Number) objComponent2).doubleValue());
            } else if (objComponent2 instanceof Float) {
                bundle.putFloat(str, ((Number) objComponent2).floatValue());
            } else if (objComponent2 instanceof Integer) {
                bundle.putInt(str, ((Number) objComponent2).intValue());
            } else if (objComponent2 instanceof Long) {
                bundle.putLong(str, ((Number) objComponent2).longValue());
            } else if (objComponent2 instanceof Short) {
                bundle.putShort(str, ((Number) objComponent2).shortValue());
            } else if (objComponent2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objComponent2);
            } else if (objComponent2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objComponent2);
            } else if (objComponent2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objComponent2);
            } else if (objComponent2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objComponent2);
            } else if (objComponent2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objComponent2);
            } else if (objComponent2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) objComponent2);
            } else if (objComponent2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objComponent2);
            } else if (objComponent2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objComponent2);
            } else if (objComponent2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) objComponent2);
            } else if (objComponent2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) objComponent2);
            } else if (objComponent2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) objComponent2);
            } else if (objComponent2 instanceof Object[]) {
                Class<?> componentType = objComponent2.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) objComponent2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) objComponent2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) objComponent2);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objComponent2);
                }
            } else if (objComponent2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objComponent2);
            } else if (objComponent2 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objComponent2);
            } else if (objComponent2 instanceof Size) {
                bundle.putSize(str, (Size) objComponent2);
            } else {
                if (!(objComponent2 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objComponent2.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) objComponent2);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11401(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List m11402(Class cls) {
        cls.getClass();
        return AbstractC5121.m10106(AbstractC5121.m10105(AbstractC5121.m10112(cls, C5015.f14469), C5015.f14470));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Constructor m11403(Class cls, Class[] clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append("(");
        for (Class cls2 : clsArr) {
            sb.append(cls2.getName());
            sb.append(",");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.delete(sb.length() - 1, sb.length());
        }
        sb.append(")");
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == clsArr.length) {
                for (int i = 0; i < clsArr.length; i++) {
                    if (!AbstractC4921.m9890(parameterTypes[i], clsArr[i])) {
                        break;
                    }
                }
                constructor.setAccessible(true);
                return constructor;
            }
        }
        throw new ReflectException("找不到构造方法".concat(String.valueOf(sb)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static double m11404(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dM13576 = AbstractC8156.m13576(d);
        double d3 = ((dM13576 + 5.0d) / d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dM11388 = m11388(dM13576, d3);
        double dAbs = Math.abs(dM11388 - d2);
        if (dM11388 < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dM13579 = ((AbstractC8156.m13579(d3 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
        if (dM13579 < 0.0d || dM13579 > 100.0d) {
            return -1.0d;
        }
        return dM13579;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static ArrayList m11405(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                arrayList.add(childAt);
                arrayList.addAll(m11405(childAt));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final long m11406(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static long m11407(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC7896.m13300(i6);
                    C4210.m8612();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return AbstractC7896.m13297(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static long m11408(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC7896.m13300(i6);
                    C4210.m8612();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return AbstractC7896.m13297(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final String m11409(InterfaceC4480 interfaceC4480) {
        interfaceC4480.getClass();
        if (!AbstractC6869.m12080(interfaceC4480)) {
            InterfaceC4498 interfaceC4498Mo9038 = interfaceC4480.mo9038();
            AbstractC6988 abstractC6988 = interfaceC4498Mo9038 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4498Mo9038 : null;
            if (abstractC6988 != null && !abstractC6988.getName().f13700) {
                InterfaceC4480 interfaceC4480Mo9012 = interfaceC4480.mo9012();
                InterfaceC4470 interfaceC4470 = interfaceC4480Mo9012 instanceof InterfaceC4470 ? (InterfaceC4470) interfaceC4480Mo9012 : null;
                if (interfaceC4470 != null) {
                    String strM11410 = m11410(interfaceC4470, 3);
                    String str = C4409.f12983;
                    C4687 c4687M8955 = C4409.m8955(AbstractC4772.m9515(abstractC6988).f13692);
                    return AbstractC0053.m163(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, c4687M8955 != null ? C6867.m12060(c4687M8955) : AbstractC3932.m8304(abstractC6988, C4651.f13589), strM11410);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m11410(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483 r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r6 = r6 & 2
            if (r6 == 0) goto Le
            r1 = r2
        Le:
            r5.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r1 == 0) goto L30
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4494
            if (r1 == 0) goto L1f
            java.lang.String r1 = "<init>"
            goto L2d
        L1f:
            r1 = r5
            飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲世苏兰 r1 = (p079.AbstractC7008) r1
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r1 = r1.getName()
            java.lang.String r1 = r1.m9345()
            r1.getClass()
        L2d:
            r6.append(r1)
        L30:
            java.lang.String r1 = "("
            r6.append(r1)
            飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰苏世哲 r1 = r5.mo9042()
            飘花落叶言世苏楪兰子哲.飘花落叶言子楪世哲兰苏 r2 = p103.C7268.f19372
            if (r1 == 0) goto L4f
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r1 = r1.getType()
            r1.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰哲苏世 r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.C4637.f13552
            java.lang.Object r1 = io.ktor.client.plugins.AbstractC3932.m8310(r1, r3, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪哲苏世兰 r1 = (kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4644) r1
            r6.append(r1)
        L4f:
            java.util.List r1 = r5.mo9045()
            java.util.Iterator r1 = r1.iterator()
        L57:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世兰楪苏哲 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455) r3
            飘花落叶言世楪子苏兰哲.飘花落叶言子世兰楪苏哲 r3 = (p079.AbstractC6976) r3
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r3 = r3.getType()
            r3.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰哲苏世 r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.C4637.f13552
            java.lang.Object r3 = io.ktor.client.plugins.AbstractC3932.m8310(r3, r4, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪哲苏世兰 r3 = (kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4644) r3
            r6.append(r3)
            goto L57
        L78:
            java.lang.String r1 = ")"
            r6.append(r1)
            if (r0 == 0) goto Lbe
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4494
            if (r0 == 0) goto L84
            goto La6
        L84:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r0 = r5.getReturnType()
            r0.getClass()
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r1 = p049.AbstractC6529.f17924
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲兰苏 r1 = p049.AbstractC6526.f17886
            boolean r0 = p049.AbstractC6529.m11965(r0, r1)
            if (r0 == 0) goto Lac
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r0 = r5.getReturnType()
            r0.getClass()
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.AbstractC4916.m9850(r0)
            if (r0 != 0) goto Lac
            boolean r0 = r5 instanceof p079.C6990
            if (r0 != 0) goto Lac
        La6:
            java.lang.String r5 = "V"
            r6.append(r5)
            goto Lbe
        Lac:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r5 = r5.getReturnType()
            r5.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰哲苏世 r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.C4637.f13552
            java.lang.Object r5 = io.ktor.client.plugins.AbstractC3932.m8310(r5, r0, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪哲苏世兰 r5 = (kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4644) r5
            r6.append(r5)
        Lbe:
            java.lang.String r5 = r6.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC6087.m11410(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲, int):java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C0325 m11411(C0325 c0325, InterfaceC6480 interfaceC6480) {
        c0325.getClass();
        interfaceC6480.getClass();
        return interfaceC6480.isEmpty() ? c0325 : new C0325((C7040) c0325.f1095, (InterfaceC7036) c0325.f1096, AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new C5027(c0325, 22, interfaceC6480)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static C4926 m11412(Type type, InterfaceC5091 interfaceC5091, List list, boolean z) {
        return new C4926(interfaceC5091, list, z, EmptyList.INSTANCE, null, false, false, false, null, new C5012(2, type));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C8124 m11413(C8139 c8139) {
        c8139.getClass();
        C8115 c8115 = c8139.f22460;
        String[] strArr = AbstractC8114.f22415;
        String strM2403 = c8115.m2403("Content-Type");
        if (strM2403 == null) {
            return null;
        }
        C8124 c8124 = C8124.f22426;
        return C8112.m13553(strM2403);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m11414(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static double m11415(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C0325 m11416(C0325 c0325, InterfaceC4477 interfaceC4477, C4451 c4451, int i) {
        if ((i & 2) != 0) {
            c4451 = null;
        }
        c0325.getClass();
        return new C0325((C7040) c0325.f1095, c4451 != null ? new C2495(c0325, interfaceC4477, c4451, 0) : (InterfaceC7036) c0325.f1096, AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new C5027(c0325, 21, interfaceC4477)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static long m11417(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[PHI: r6
  0x005e: PHI (r6v29 int) = (r6v5 int), (r6v18 int), (r6v18 int), (r6v21 int), (r6v28 int), (r6v37 int), (r6v38 int) binds: [B:90:0x0149, B:65:0x00da, B:67:0x00e0, B:54:0x00b8, B:40:0x0083, B:28:0x0058, B:27:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m11418(int r16, byte[] r17, int r18) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC6087.m11418(int, byte[], int):java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static float m11419(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m11420(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static void m11421(String str, String str2) throws Exception {
        C5592 c5592;
        File file = new File(str2);
        if (!file.exists() && !file.mkdirs()) {
            throw new Exception("创建解压目标文件夹失败");
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                c5592 = new C5592(bufferedInputStream);
            } finally {
            }
            while (true) {
                try {
                    C5584 c5584M10900 = c5592.m10900();
                    if (c5584M10900 == null) {
                        c5592.close();
                        bufferedInputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    String str3 = str2 + File.separator + c5584M10900.getName();
                    if (c5584M10900.isDirectory()) {
                        m11393(new File(str3));
                    } else {
                        m11393(new File(str3).getParentFile());
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
                        try {
                            AbstractC8985.m14573(c5592, bufferedOutputStream);
                            bufferedOutputStream.close();
                        } finally {
                        }
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static C6518 m11422(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C6518(i, i2 - 1, 1);
        }
        C6518 c6518 = C6518.f17831;
        return C6518.f17831;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final boolean m11423(Throwable th, InterfaceC6542 interfaceC6542) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = AbstractC6858.f18305;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = AbstractC6859.f18306;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = EmptyList.INSTANCE;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            C1296 c1296 = (C1296) interfaceC6542.invoke();
            if (c1296 != null) {
                boolean z2 = c1296.f3783;
                List list = c1296.f3784;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1294) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                c1296.getClass();
                diagnosticComposeException = new DiagnosticComposeException(c1296);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            AbstractC5186.m10212(th, diagnosticComposeException);
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m11424(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(runnable, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0206, code lost:
    
        r5 = null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.reflect.InterfaceC5086 m11425(java.lang.reflect.Type r23, java.util.Map r24, kotlin.reflect.jvm.internal.TypeNullability r25, boolean r26, int r27) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC6087.m11425(java.lang.reflect.Type, java.util.Map, kotlin.reflect.jvm.internal.TypeNullability, boolean, int):kotlin.reflect.飘花落叶言子世楪苏兰哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static final C5084 m11426(Type type, Map map) {
        if (!(type instanceof WildcardType)) {
            C5084 c5084 = C5084.f14636;
            return AbstractC5089.m10096(m11425(type, map, null, false, 6));
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            C4210.m8605(type, "Wildcard types with many bounds are not supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            C5084 c50842 = C5084.f14636;
            Object objM8853 = AbstractC4346.m8853(lowerBounds);
            objM8853.getClass();
            InterfaceC5086 interfaceC5086M11425 = m11425((Type) objM8853, map, null, false, 6);
            interfaceC5086M11425.getClass();
            return new C5084(interfaceC5086M11425, KVariance.IN);
        }
        if (upperBounds.length != 1) {
            return C5084.f14636;
        }
        C5084 c50843 = C5084.f14636;
        Object objM88532 = AbstractC4346.m8853(upperBounds);
        objM88532.getClass();
        InterfaceC5086 interfaceC5086M114252 = m11425((Type) objM88532, map, null, false, 6);
        interfaceC5086M114252.getClass();
        return new C5084(interfaceC5086M114252, KVariance.OUT);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static C6511 m11427(C6518 c6518, int i) {
        c6518.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
        int i2 = c6518.f17822;
        int i3 = c6518.f17820;
        if (c6518.f17821 <= 0) {
            i = -i;
        }
        return new C6511(i2, i3, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static final C4938 m11428(C4926 c4926, Type type) {
        InterfaceC5091 interfaceC5091 = c4926.f14269;
        List<C5084> list = c4926.f14270;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        for (C5084 c5084 : list) {
            InterfaceC5086 interfaceC5086 = c5084.f14637;
            if (interfaceC5086 != null) {
                c5084 = new C5084(interfaceC5086, KVariance.OUT);
            }
            arrayList.add(c5084);
        }
        C4926 c4926M11412 = m11412(type, interfaceC5091, arrayList, true);
        C5012 c5012 = new C5012(3, type);
        boolean zEquals = c4926.equals(c4926M11412);
        Object c4938 = c4926;
        if (!zEquals) {
            c4938 = new C4938(c4926, c4926M11412, false, c5012);
        }
        return (C4938) c4938;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public abstract int mo11429(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public abstract C3761 mo11430(Activity activity);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public abstract boolean mo11431(float f, float f2);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public abstract boolean mo11432(View view);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public abstract int mo11433(View view);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract int mo11434();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public abstract int mo11435();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public abstract int mo11436();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public abstract int mo11437();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public abstract boolean mo11438(float f);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract int mo11439();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public abstract int mo11440(CoordinatorLayout coordinatorLayout);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract float mo11441(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract int mo11442(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public abstract void mo11443(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public abstract boolean mo11444(View view, float f);
}
