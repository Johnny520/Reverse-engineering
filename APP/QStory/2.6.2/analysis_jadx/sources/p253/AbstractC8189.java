package p253;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.ui.draganddrop.C1426;
import androidx.compose.ui.graphics.vector.C1543;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import io.ktor.util.C4210;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4327;
import kotlin.collections.C4349;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4605;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4777;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.text.AbstractC5131;
import kotlin.text.AbstractC5143;
import kotlin.text.C5145;
import kotlin.text.C5147;
import kotlin.text.C5150;
import kotlin.text.InterfaceC5149;
import kotlinx.io.AbstractC5477;
import kotlinx.io.C5476;
import kotlinx.io.InterfaceC5480;
import kotlinx.io.InterfaceC5483;
import net.bytebuddy.pool.TypePool;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.C5727;
import p007.AbstractC6136;
import p010.C6158;
import p015.C6217;
import p030.C6308;
import p049.AbstractC6529;
import p074.AbstractC6944;
import p074.C6945;
import p086.C7062;
import p086.InterfaceC7063;
import p101.C7252;
import p101.C7254;
import p101.InterfaceC7253;
import p103.C7273;
import p144.C7546;
import p162.AbstractC7652;
import p175.AbstractC7738;
import p236.AbstractC8110;
import p236.C8104;
import p236.InterfaceC8094;
import p236.InterfaceC8101;
import p251.AbstractC8174;
import p347.C8854;
import p347.C8855;
import p347.C8858;
import p396.C9142;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪兰苏哲世子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8189 implements InterfaceC8101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C1543 f22565;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final long m13654(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static String m13655(String str, boolean z) {
        if (!z) {
            return AbstractC0053.m156("\"", str, "\"");
        }
        StringBuilder sb = new StringBuilder("\"");
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                sb2.append("\\f");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    default:
                        sb2.append(cCharAt);
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        sb.append(sb2.toString());
        sb.append("\"");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final List m13656(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : m13660(list.get(0)) : EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static ArrayList m13657(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4349(objArr, true));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static List m13658(Object obj) {
        return obj != null ? m13660(obj) : EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static List m13659(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return EmptyList.INSTANCE;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static List m13660(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static int m13661(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static void m13662() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static void m13663() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final InterfaceC7063 m13664(Collection collection, C7062 c7062) {
        Iterator it = collection.iterator();
        InterfaceC7063 interfaceC7063 = null;
        while (it.hasNext()) {
            InterfaceC7063 interfaceC70632 = (InterfaceC7063) it.next();
            if (AbstractC4394.m8917(interfaceC70632.getType(), c7062)) {
                if (interfaceC7063 != null) {
                    C7546.m12745(c7062, "Multiple extensions handle the same extension type: ");
                    return null;
                }
                interfaceC7063 = interfaceC70632;
            }
        }
        if (interfaceC7063 != null) {
            return interfaceC7063;
        }
        C7546.m12745(c7062, "No extensions handle the extension type: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static String m13665(String str, boolean z) {
        int i;
        char c = '$';
        if (str.indexOf(36) < 0) {
            return m13655(str, z);
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < length) {
            if (str.charAt(i2) == c) {
                char c2 = '\\';
                if (!z) {
                    int i4 = 0;
                    for (int i5 = i2 - 1; i5 >= 0 && str.charAt(i5) == '\\'; i5--) {
                        i4++;
                    }
                    if ((i4 & 1) == 1) {
                    }
                }
                int i6 = i2 + 1;
                if (i6 < length) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt == '{') {
                        int i7 = i2 + 2;
                        int length2 = str.length();
                        int i8 = 1;
                        int i9 = i7;
                        while (i9 < length2) {
                            char cCharAt2 = str.charAt(i9);
                            if (cCharAt2 == '\"') {
                                while (true) {
                                    i9++;
                                    if (i9 >= str.length()) {
                                        i9 = -1;
                                        break;
                                    }
                                    char cCharAt3 = str.charAt(i9);
                                    if (cCharAt3 != c2) {
                                        if (cCharAt3 == '\"') {
                                            break;
                                        }
                                    } else {
                                        i9++;
                                    }
                                }
                                if (i9 < 0) {
                                    break;
                                }
                                i9++;
                            } else if (cCharAt2 == '\'') {
                                int iM13686 = m13686(i9 + 1, str);
                                if (iM13686 < 0) {
                                    break;
                                }
                                i9 = iM13686 + 1;
                            } else {
                                if (cCharAt2 == '/' && (i = i9 + 1) < length2) {
                                    char cCharAt4 = str.charAt(i);
                                    if (cCharAt4 == '/') {
                                        i9 += 2;
                                        while (i9 < length2) {
                                            char cCharAt5 = str.charAt(i9);
                                            if (cCharAt5 == '\n' || cCharAt5 == '\r') {
                                                break;
                                            }
                                            i9++;
                                        }
                                    } else {
                                        char c3 = TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH;
                                        if (cCharAt4 == '*') {
                                            int i10 = i9 + 2;
                                            while (true) {
                                                int i11 = i10 + 1;
                                                if (i11 >= str.length()) {
                                                    i10 = -1;
                                                    break;
                                                }
                                                if (str.charAt(i10) == c3 && str.charAt(i11) == '/') {
                                                    break;
                                                }
                                                i10 = i11;
                                                c3 = TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH;
                                            }
                                            if (i10 < 0) {
                                                break;
                                            }
                                            i9 = i10 + 2;
                                        }
                                    }
                                    c2 = '\\';
                                }
                                if (cCharAt2 == '{') {
                                    i8++;
                                } else if (cCharAt2 == '}' && i8 - 1 == 0) {
                                    break;
                                }
                                i9++;
                                c2 = '\\';
                            }
                        }
                        i9 = -1;
                        if (i9 < 0) {
                            i2 = i6;
                        } else {
                            String strSubstring = str.substring(i3, i2);
                            if (!strSubstring.isEmpty()) {
                                arrayList.add(m13655(strSubstring, z));
                            }
                            arrayList.add("String.valueOf(" + str.substring(i7, i9).trim() + ")");
                            i3 = i9 + 1;
                            i2 = i3;
                            z2 = true;
                        }
                        c = '$';
                    } else if (cCharAt != c && Character.isJavaIdentifierStart(cCharAt)) {
                        int i12 = i2 + 2;
                        while (i12 < length) {
                            char cCharAt6 = str.charAt(i12);
                            if (cCharAt6 == c || !Character.isJavaIdentifierPart(cCharAt6)) {
                                break;
                            }
                            i12++;
                        }
                        String strSubstring2 = str.substring(i3, i2);
                        if (!strSubstring2.isEmpty()) {
                            arrayList.add(m13655(strSubstring2, z));
                        }
                        arrayList.add("String.valueOf(" + str.substring(i6, i12) + ")");
                        i2 = i12;
                        i3 = i2;
                        z2 = true;
                    }
                }
                i2 = i6;
            }
            i2++;
        }
        if (!z2) {
            return m13655(str, z);
        }
        String strSubstring3 = str.substring(i3);
        if (!strSubstring3.isEmpty()) {
            arrayList.add(m13655(strSubstring3, z));
        }
        if (arrayList.isEmpty()) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder("(");
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (i13 > 0) {
                sb2.append(" + ");
            }
            sb2.append((String) arrayList.get(i13));
        }
        sb.append(sb2.toString());
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final void m13666(String str, long j, String str2, int i) {
        AbstractC6136.m11546(-3937706981486495143L, -3937277815469376935L, str);
        str2.getClass();
        C8858 c8858 = new C8858(Long.parseLong(str), j, str2, i);
        C6308 c6308 = C6308.f17386;
        C8854 c8854 = new C8854(c6308.m11813(C8858.Companion.serializer(), c8858));
        C6158 c6158 = new C6158();
        C8855 c8855 = C8854.Companion;
        c6158.m11582(c6308.m11813(c8855.serializer(), c8854));
        AbstractC0455.m1141(AbstractC3056.m6668(-3937277570656241063L), c6308.m11813(c8855.serializer(), c8854));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC7253 m13667(String str, List list) {
        C7254 c7254;
        list.getClass();
        C7273 c7273 = new C7273();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c7254 = C7254.f19341;
            if (!zHasNext) {
                break;
            }
            InterfaceC7253 interfaceC7253 = (InterfaceC7253) it.next();
            if (interfaceC7253 != c7254) {
                if (interfaceC7253 instanceof C7252) {
                    InterfaceC7253[] interfaceC7253Arr = ((C7252) interfaceC7253).f19338;
                    interfaceC7253Arr.getClass();
                    List listAsList = Arrays.asList(interfaceC7253Arr);
                    listAsList.getClass();
                    c7273.addAll(listAsList);
                } else {
                    c7273.add(interfaceC7253);
                }
            }
        }
        int i = c7273.f19379;
        return i != 0 ? i != 1 ? new C7252(str, (InterfaceC7253[]) c7273.toArray(new InterfaceC7253[0])) : (InterfaceC7253) c7273.get(0) : c7254;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C4777 m13668(C4686 c4686, C4844 c4844, InterfaceC4485 interfaceC4485, InputStream inputStream) throws IOException {
        ProtoBuf$PackageFragment from;
        c4686.getClass();
        interfaceC4485.getClass();
        try {
            C6945 c6945 = C6945.f18543;
            C6945 c6945M6855 = AbstractC3065.m6855(inputStream);
            C6945 c69452 = C6945.f18543;
            int i = c6945M6855.f18414;
            c69452.getClass();
            int i2 = c69452.f18414;
            int i3 = c6945M6855.f18415;
            int i4 = c69452.f18415;
            if (i3 == 0) {
                if (i4 == 0 && i == i2) {
                    C4725 c4725 = new C4725();
                    AbstractC6944.m12209(c4725);
                    from = ProtoBuf$PackageFragment.parseFrom(inputStream, c4725);
                }
                from = null;
            } else if (i3 != i4 || i > i2) {
                from = null;
            } else {
                C4725 c47252 = new C4725();
                AbstractC6944.m12209(c47252);
                from = ProtoBuf$PackageFragment.parseFrom(inputStream, c47252);
            }
            Pair pair = new Pair(from, c6945M6855);
            inputStream.close();
            ProtoBuf$PackageFragment protoBuf$PackageFragment = (ProtoBuf$PackageFragment) pair.component1();
            C6945 c69453 = (C6945) pair.component2();
            if (protoBuf$PackageFragment != null) {
                return new C4777(c4686, c4844, interfaceC4485, protoBuf$PackageFragment, c69453);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + c69452 + ", actual " + c69453 + ". Please update Kotlin");
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m13669(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i = 0;
        if (size < 0) {
            C5919.m11249(AbstractC0053.m161(size, "fromIndex (0) is greater than toIndex (", ")."));
            return 0;
        }
        if (size > size2) {
            C4210.m8628("toIndex (", size, ") is greater than size (", size2);
            return 0;
        }
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iM13040 = AbstractC7738.m13040((Comparable) arrayList.get(i3), comparable);
            if (iM13040 < 0) {
                i = i3 + 1;
            } else {
                if (iM13040 <= 0) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ArrayList m13670(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4349(objArr, true));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m13671(int i) {
        return i == 10 ? "newline" : i == 9 ? "tab" : i == -1 ? "end of file" : (i < 0 || i > 31) ? String.format("%c", Integer.valueOf(i)) : String.format("control character 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final long m13672(C1426 c1426) {
        float x = c1426.f4102.getX();
        float y = c1426.f4102.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static int m13673(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static boolean m13674(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m13675(int i, String str) {
        int i2 = i + 2;
        return i2 < str.length() && str.charAt(i) == '\"' && str.charAt(i + 1) == '\"' && str.charAt(i2) == '\"';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final Bundle m13676(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        C5919.m11249(AbstractC0053.m156("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m13677(InterfaceC4479 interfaceC4479) {
        interfaceC4479.getClass();
        if (!AbstractC4605.f13450.contains(interfaceC4479.getName())) {
            return false;
        }
        if (AbstractC4343.m8789(AbstractC4605.f13451, AbstractC4772.m9511(interfaceC4479)) && interfaceC4479.mo9045().isEmpty()) {
            return true;
        }
        if (!AbstractC6529.m11969(interfaceC4479)) {
            return false;
        }
        Collection collectionMo9040 = interfaceC4479.mo9040();
        collectionMo9040.getClass();
        Collection<InterfaceC4479> collection = collectionMo9040;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC4479 interfaceC44792 : collection) {
            interfaceC44792.getClass();
            if (m13677(interfaceC44792)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static ColorStateList m13678(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM12890;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM12890 = AbstractC7652.m12890(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM12890;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C6217 m13679(String str) {
        str.getClass();
        InterfaceC5149 interfaceC5149MatchAt = C6217.f17098.matchAt(str, 0);
        if (interfaceC5149MatchAt == null) {
            C5919.m11249(AbstractC6136.m11558('\"', "No subtype found for: \"", str));
            return null;
        }
        C5147 c5147 = (C5147) interfaceC5149MatchAt;
        String str2 = (String) ((C4327) c5147.m10177()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((C4327) c5147.m10177()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = c5147.m10176().f17820;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new C6217(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            InterfaceC5149 interfaceC5149MatchAt2 = C6217.f17097.matchAt(str, i2);
            if (interfaceC5149MatchAt2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            C5147 c51472 = (C5147) interfaceC5149MatchAt2;
            C5150 c5150 = c51472.f14697;
            C5145 c5145M10178 = c5150.m10178(1);
            String str3 = c5145M10178 != null ? c5145M10178.f14690 : null;
            if (str3 == null) {
                i = c51472.m10176().f17820;
            } else {
                C5145 c5145M101782 = c5150.m10178(2);
                String strM160 = c5145M101782 != null ? c5145M101782.f14690 : null;
                if (strM160 == null) {
                    C5145 c5145M101783 = c5150.m10178(3);
                    c5145M101783.getClass();
                    strM160 = c5145M101783.f14690;
                } else if (AbstractC5143.m10146(strM160, '\'') && AbstractC5143.m10155(strM160, '\'') && strM160.length() > 2) {
                    strM160 = AbstractC0053.m160(1, 1, strM160);
                }
                arrayList.add(str3);
                arrayList.add(strM160);
                i = c51472.m10176().f17820;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Set m13680() {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String m13681(File file) {
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AbstractC3056.m6668(-3937560909648758183L));
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i = fileInputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    fileInputStream.close();
                    return new BigInteger(1, messageDigest.digest()).toString(16).toUpperCase();
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static ColorStateList m13682(Context context, C0108 c0108, int i) {
        int resourceId;
        ColorStateList colorStateListM12890;
        TypedArray typedArray = (TypedArray) c0108.f320;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM12890 = AbstractC7652.m12890(context, resourceId)) == null) ? c0108.m384(i) : colorStateListM12890;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Drawable m13683(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM6607;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM6607 = AbstractC3054.m6607(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM6607;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m13684(CharsetDecoder charsetDecoder, InterfaceC5480 interfaceC5480) {
        charsetDecoder.getClass();
        interfaceC5480.getClass();
        StringBuilder sb = new StringBuilder((int) Math.min(2147483647L, interfaceC5480.mo10600().f15142));
        Charset charset = charsetDecoder.charset();
        charset.getClass();
        if (charset.equals(AbstractC5131.f14688)) {
            sb.append((CharSequence) AbstractC5477.m10626(interfaceC5480));
        } else {
            long j = interfaceC5480.mo10600().f15142;
            byte[] bArrM10625 = AbstractC5477.m10625(interfaceC5480, -1);
            Charset charset2 = charsetDecoder.charset();
            charset2.getClass();
            sb.append((CharSequence) new String(bArrM10625, charset2));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static ListBuilder m13685() {
        return new ListBuilder(0, 1, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m13686(int i, String str) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
            } else {
                if (cCharAt == '\'') {
                    return i;
                }
                if (cCharAt == '\n' || cCharAt == '\r') {
                    return -1;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C5727 m13687(DexKitBridge dexKitBridge, C9142 c9142) {
        dexKitBridge.getClass();
        int iM7302 = c9142.m7302(10);
        int i = iM7302 != 0 ? c9142.f10849.getInt(iM7302 + c9142.f10850) : 0;
        if ((i & 131072) > 0) {
            i = (i ^ 131072) | 32;
        }
        int i2 = i;
        int iM73022 = c9142.m7302(4);
        int i3 = iM73022 != 0 ? c9142.f10849.getInt(iM73022 + c9142.f10850) : 0;
        int iM73023 = c9142.m7302(6);
        int i4 = iM73023 != 0 ? c9142.f10849.getInt(iM73023 + c9142.f10850) : 0;
        int iM73024 = c9142.m7302(8);
        int i5 = iM73024 != 0 ? c9142.f10849.getInt(iM73024 + c9142.f10850) : 0;
        int iM73025 = c9142.m7302(12);
        String strM7300 = iM73025 != 0 ? c9142.m7300(iM73025 + c9142.f10850) : null;
        if (strM7300 == null) {
            strM7300 = "";
        }
        String str = strM7300;
        int iM73026 = c9142.m7302(14);
        int i6 = iM73026 != 0 ? c9142.f10849.getInt(iM73026 + c9142.f10850) : 0;
        ArrayList arrayList = new ArrayList();
        int iM73027 = c9142.m7302(16);
        int iM7298 = iM73027 != 0 ? c9142.m7298(iM73027) : 0;
        for (int i7 = 0; i7 < iM7298; i7++) {
            int iM73028 = c9142.m7302(16);
            arrayList.add(Integer.valueOf(iM73028 != 0 ? c9142.f10849.getInt((i7 * 4) + c9142.m7299(iM73028)) : 0));
        }
        return new C5727(dexKitBridge, i3, i4, i5, i2, str, i6, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC8094 m13688(C8104 c8104) {
        C8104 c81042 = new C8104(2);
        for (String str : ((Map) c8104.f3894).keySet()) {
            List listM2406 = c8104.m2406(str);
            if (listM2406 == null) {
                listM2406 = EmptyList.INSTANCE;
            }
            String strM13548 = AbstractC8110.m13548(0, 0, str, 15);
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM2406, 10));
            Iterator it = listM2406.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8110.m13548(0, 0, (String) it.next(), 11));
            }
            c81042.mo2399(strM13548, arrayList);
        }
        return c81042.build();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m13689(CharsetEncoder charsetEncoder, InterfaceC5483 interfaceC5483, CharSequence charSequence, int i, int i2) {
        charsetEncoder.getClass();
        interfaceC5483.getClass();
        charSequence.getClass();
        if (i >= i2) {
            return;
        }
        do {
            byte[] bArrM13624 = AbstractC8174.m13624(charsetEncoder, charSequence, i, i2);
            ((C5476) interfaceC5483).write(bArrM13624, 0, bArrM13624.length);
            int length = bArrM13624.length;
            if (length < 0) {
                C5919.m11250("Check failed.");
                return;
            }
            i += length;
        } while (i < i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract String mo10004();
}
