package p000a;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import p000a.C0354Ta;
import p000a.C0866ug;

/* JADX INFO: renamed from: a.n9 */
/* JADX INFO: loaded from: classes.dex */
public class C0726n9 implements InterfaceC0217Lg {

    /* JADX INFO: renamed from: a */
    public static C0726n9 f2847a;

    /* JADX INFO: renamed from: A */
    public static void m1659A(View view, C0354Ta c0354Ta) {
        C0170J5 c0170j5 = c0354Ta.f1310a.f1335b;
        if (c0170j5 == null || !c0170j5.f599a) {
            return;
        }
        float fM2017i = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            fM2017i += C0866ug.d.m2017i((View) parent);
        }
        C0354Ta.b bVar = c0354Ta.f1310a;
        if (bVar.f1345l != fM2017i) {
            bVar.f1345l = fM2017i;
            c0354Ta.m970n();
        }
    }

    /* JADX INFO: renamed from: B */
    public static final void m1660B(Object... objArr) {
        C0908x1.m2197e(Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m1661d(TextView textView, int i) {
        if (textView.getVisibility() != 0 || textView.getHeight() <= 0) {
            return false;
        }
        Rect rect = new Rect();
        return textView.getGlobalVisibleRect(rect) && rect.top < i;
    }

    /* JADX INFO: renamed from: e */
    public static void m1662e(StringBuilder sb, Object obj, InterfaceC0064D7 interfaceC0064D7) {
        if (interfaceC0064D7 != null) {
            sb.append((CharSequence) interfaceC0064D7.mo53f(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1663f(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1664g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m1665h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m1666i(Context context, String str) {
        int iM2214c;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strM2215d = C0927y1.m2215d(str);
            if (strM2215d != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerM2235c = C0946z1.m2235c(context);
                    iM2214c = C0946z1.m2233a(appOpsManagerM2235c, strM2215d, Binder.getCallingUid(), packageName);
                    if (iM2214c == 0) {
                        iM2214c = C0946z1.m2233a(appOpsManagerM2235c, strM2215d, iMyUid, C0946z1.m2234b(context));
                    }
                } else {
                    iM2214c = C0927y1.m2214c((AppOpsManager) C0927y1.m2212a(context, AppOpsManager.class), strM2215d, packageName);
                }
                if (iM2214c != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static int m1667j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: k */
    public static final void m1668k(View view, C0105Fc c0105Fc) {
        if (view instanceof TextView) {
            c0105Fc.mo53f(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C0631i9.m1481d(childAt, "getChildAt(...)");
                m1668k(childAt, c0105Fc);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static C0889w1 m1669l(int i) {
        if (i != 0 && i == 1) {
            return new C0079E4();
        }
        return new C0014Ad();
    }

    /* JADX INFO: renamed from: m */
    public static final void m1670m(Object... objArr) {
        C0631i9.m1482e(Arrays.copyOf(objArr, objArr.length), "args");
    }

    /* JADX INFO: renamed from: n */
    public static String m1671n(ByteBuffer byteBuffer) throws UTFDataFormatException {
        char c;
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining() && (c = (char) (byteBuffer.get() & 255)) != 0) {
            if (c < 128) {
                sb.append(c);
            } else if ((c & 224) == 192) {
                byte b = byteBuffer.get();
                if ((b & 192) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb.append((char) (((c & 31) << 6) | (b & 63)));
            } else {
                if ((c & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                if ((b2 & 192) != 128 || (b3 & 192) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb.append((char) (((c & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63)));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m1672o(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            int i = 0;
            while (i < str.length()) {
                int iCodePointAt = Character.codePointAt(str, i);
                StringBuilder sb2 = new StringBuilder("\\u");
                String hexString = Integer.toHexString(iCodePointAt);
                if (hexString.startsWith("0")) {
                    hexString = hexString.substring(1);
                }
                if (hexString.length() <= 4) {
                    int length = hexString.length();
                    StringBuilder sb3 = new StringBuilder();
                    for (int i2 = 0; i2 < 4 - length; i2++) {
                        sb3.append("0");
                    }
                    sb2.append(sb3.toString());
                }
                sb2.append(hexString);
                sb.append(sb2.toString());
                if (Character.isHighSurrogate(str.charAt(i))) {
                    i++;
                }
                i++;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static View m1673p(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final TextView m1674q(View view, InterfaceC0064D7 interfaceC0064D7) {
        if ((view instanceof TextView) && ((Boolean) interfaceC0064D7.mo53f(view)).booleanValue()) {
            return (TextView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C0631i9.m1481d(childAt, "getChildAt(...)");
            TextView textViewM1674q = m1674q(childAt, interfaceC0064D7);
            if (textViewM1674q != null) {
                return textViewM1674q;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: r */
    public static final Class m1675r(InterfaceC0764p9 interfaceC0764p9) {
        C0631i9.m1482e(interfaceC0764p9, "<this>");
        Class<?> clsMo1151a = ((InterfaceC0473a3) interfaceC0764p9).mo1151a();
        if (clsMo1151a.isPrimitive()) {
            String name = clsMo1151a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo1151a;
    }

    /* JADX INFO: renamed from: s */
    public static SharedPreferences m1676s(String str) {
        Context context = C0889w1.f3488p;
        C0631i9.m1479b(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 4);
        C0631i9.m1479b(sharedPreferences);
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: t */
    public static final void m1677t(Object... objArr) {
        C0908x1.m2194b(Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: u */
    public static C0652jb m1678u(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    C0652jb c0652jb = new C0652jb();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c0652jb.f1105d = byteBufferDuplicate;
                    c0652jb.f1102a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0652jb.f1103b = i6;
                    c0652jb.f1104c = ((ByteBuffer) c0652jb.f1105d).getShort(i6);
                    return c0652jb;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: v */
    public static final String m1679v(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        C0631i9.m1481d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: w */
    public static int m1680w(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: z */
    public static Set m1681z(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C0495b6.f1840a;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            C0631i9.m1481d(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C0480aa.m1169C(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    @Override // p000a.InterfaceC0217Lg
    /* JADX INFO: renamed from: b */
    public void mo595b() {
    }

    @Override // p000a.InterfaceC0217Lg
    /* JADX INFO: renamed from: c */
    public void mo554c() {
    }

    /* JADX INFO: renamed from: x */
    public void mo1682x(boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public void mo1683y(boolean z) {
        throw null;
    }
}
