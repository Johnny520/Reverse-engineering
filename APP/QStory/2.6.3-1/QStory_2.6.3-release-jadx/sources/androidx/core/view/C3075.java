package androidx.core.view;

import android.R;
import android.content.ClipData;
import android.os.Build;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C0984;
import androidx.core.view.C3075;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.InterfaceC3273;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.annotation.JSONCompiler$CompilerOption;
import com.alibaba.fastjson2.reader.C3603;
import com.alibaba.fastjson2.reader.C3604;
import com.alibaba.fastjson2.reader.C3612;
import com.alibaba.fastjson2.reader.C3613;
import com.alibaba.fastjson2.reader.C3616;
import com.alibaba.fastjson2.reader.C3617;
import com.alibaba.fastjson2.reader.C3635;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.InterfaceC3679;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.C3902;
import com.bumptech.glide.load.engine.C3831;
import com.bumptech.glide.load.engine.C3836;
import com.bumptech.glide.load.engine.C3837;
import com.bumptech.glide.load.engine.C3840;
import com.bumptech.glide.load.engine.RunnableC3847;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3876;
import com.google.android.material.button.InterfaceC3926;
import com.google.android.material.internal.InterfaceC3997;
import com.kongzue.dialogx.util.views.AbstractC4590;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation;
import io.ktor.http.cio.internals.C4787;
import io.ktor.util.C5043;
import io.ktor.websocket.C5098;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5934;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5252;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5424;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5524;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.C5529;
import kotlin.reflect.jvm.internal.impl.renderer.AbstractC5568;
import kotlin.reflect.jvm.internal.impl.renderer.AbstractC5573;
import kotlin.reflect.jvm.internal.impl.renderer.C5564;
import kotlin.reflect.jvm.internal.impl.renderer.C5565;
import kotlin.reflect.jvm.internal.impl.renderer.C5575;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5663;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5662;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5610;
import kotlin.reflect.jvm.internal.impl.storage.InterfaceC5674;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import kotlinx.serialization.protobuf.internal.AbstractC6355;
import kotlinx.serialization.protobuf.internal.C6348;
import kotlinx.serialization.protobuf.internal.ProtoWireType;
import net.bytebuddy.utility.JavaConstant;
import org.apache.commons.compress.archivers.zip.C6428;
import p023.AbstractC6957;
import p025.AbstractC7012;
import p034.AbstractC7082;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p082.AbstractC7699;
import p095.AbstractC7815;
import p095.AbstractC7818;
import p095.AbstractC7823;
import p095.AbstractC7825;
import p095.AbstractC7843;
import p095.C7808;
import p095.C7817;
import p095.C7819;
import p095.C7820;
import p095.C7821;
import p095.C7833;
import p095.C7835;
import p095.C7847;
import p119.InterfaceC8101;
import p209.C8657;
import p234.InterfaceC8802;
import p245.ExecutorServiceC8872;
import p294.C9192;
import p294.C9194;
import p295.InterfaceC9195;
import p295.InterfaceC9196;
import p295.InterfaceC9198;
import p295.InterfaceC9199;
import p373.C9732;
import p395.AbstractC9825;
import retrofit2.InterfaceC6619;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C3075 implements InterfaceC3094, InterfaceC3098, InterfaceC3273, InterfaceC8802, InterfaceC3876, InterfaceC3926, InterfaceC3997, InterfaceC8101, InterfaceC5294, InterfaceC5329, InterfaceC5662, InterfaceC5674, InterfaceC6619 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f6882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6883;

    public C3075(byte b, int i) {
        this.f6883 = i;
        switch (i) {
            case 21:
                this.f6882 = new Stack();
                break;
            case 26:
                this.f6882 = new ConcurrentHashMap(16);
                break;
            default:
                this.f6882 = new AtomicReference(null);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static Class m4697(Class cls) {
        if ("com.fasterxml.jackson.databind.JsonDeserializer$None".equals(cls.getName()) || !InterfaceC3621.class.isAssignableFrom(cls)) {
            return null;
        }
        return cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m4698(C9192 c9192, InterfaceC9196 interfaceC9196) {
        String strName = interfaceC9196.name();
        if (!strName.isEmpty()) {
            c9192.f23394 = strName;
        }
        String str = interfaceC9196.format();
        if (!str.isEmpty()) {
            String strTrim = str.trim();
            if (strTrim.indexOf(84) != -1 && !strTrim.contains("'T'")) {
                strTrim = strTrim.replace("T", "'T'");
            }
            c9192.f23393 = strTrim;
        }
        String strLabel = interfaceC9196.label();
        if (!strLabel.isEmpty()) {
            c9192.f23392 = strLabel.trim();
        }
        String strDefaultValue = interfaceC9196.defaultValue();
        if (!strDefaultValue.isEmpty()) {
            c9192.f23404 = strDefaultValue;
        }
        String strLocale = interfaceC9196.locale();
        if (!strLocale.isEmpty()) {
            String[] strArrSplit = strLocale.split(JavaConstant.Dynamic.DEFAULT_NAME);
            if (strArrSplit.length == 2) {
                c9192.f23401 = new Locale(strArrSplit[0], strArrSplit[1]);
            }
        }
        String[] strArrAlternateNames = interfaceC9196.alternateNames();
        if (strArrAlternateNames.length != 0) {
            if (c9192.f23406 == null) {
                c9192.f23406 = strArrAlternateNames;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet(strArrAlternateNames.length + c9192.f23406.length, 1.0f);
                Collections.addAll(linkedHashSet, strArrAlternateNames);
                Collections.addAll(linkedHashSet, c9192.f23406);
                c9192.f23406 = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
            }
        }
        boolean zDeserialize = interfaceC9196.deserialize();
        boolean z = !zDeserialize;
        if (!c9192.f23389) {
            c9192.f23389 = z;
        }
        for (JSONReader$Feature jSONReader$Feature : interfaceC9196.deserializeFeatures()) {
            c9192.f23390 |= jSONReader$Feature.mask;
            if (c9192.f23389 && zDeserialize && jSONReader$Feature == JSONReader$Feature.FieldBased) {
                c9192.f23389 = false;
            }
        }
        int iOrdinal = interfaceC9196.ordinal();
        if (iOrdinal != 0) {
            c9192.f23391 = iOrdinal;
        }
        if (interfaceC9196.value()) {
            c9192.f23390 |= 281474976710656L;
        }
        if (interfaceC9196.unwrapped()) {
            c9192.f23390 |= 562949953421312L;
        }
        if (interfaceC9196.required()) {
            c9192.f23396 = true;
        }
        String strTrim2 = interfaceC9196.schema().trim();
        if (!strTrim2.isEmpty()) {
            c9192.f23402 = strTrim2;
        }
        Class clsDeserializeUsing = interfaceC9196.deserializeUsing();
        if (InterfaceC3621.class.isAssignableFrom(clsDeserializeUsing)) {
            c9192.f23407 = clsDeserializeUsing;
        }
        String strTrim3 = interfaceC9196.arrayToMapKey().trim();
        if (!strTrim3.isEmpty()) {
            c9192.f23395 = strTrim3;
        }
        Class clsArrayToMapDuplicateHandler = interfaceC9196.arrayToMapDuplicateHandler();
        if (clsArrayToMapDuplicateHandler != Void.class) {
            c9192.f23397 = clsArrayToMapDuplicateHandler;
        }
        Class clsContentAs = interfaceC9196.contentAs();
        if (clsContentAs != Void.class) {
            c9192.f23398 = clsContentAs;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static /* synthetic */ void m4699(C3075 c3075, C6348 c6348, int i) {
        c3075.m4717(c6348, i, ProtoIntegerType.DEFAULT);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static C3075 m4700(C9732 c9732, int i) throws IOException {
        if (i < 0) {
            C6755.m11869(AbstractC7012.m12147(i, "totalNumberOfValues must be bigger than 0, is "));
            return null;
        }
        int i2 = c9732.read() + 1;
        if (i2 == 0) {
            C6755.m11866("Cannot read the size of the encoded tree, unexpected end of stream");
            return null;
        }
        byte[] bArrM15158 = AbstractC9825.m15158(c9732, i2);
        if (bArrM15158.length != i2) {
            throw new EOFException();
        }
        int[] iArr = new int[i];
        int i3 = 0;
        int iMax = 0;
        for (byte b : bArrM15158) {
            int i4 = ((b & 240) >> 4) + 1;
            if (i3 + i4 > i) {
                C6755.m11866("Number of values exceeds given total number of values");
                return null;
            }
            int i5 = (b & 15) + 1;
            int i6 = 0;
            while (i6 < i4) {
                iArr[i3] = i5;
                i6++;
                i3++;
            }
            iMax = Math.max(iMax, i5);
        }
        int[] iArr2 = new int[i];
        for (int i7 = 0; i7 < i; i7++) {
            iArr2[i7] = i7;
        }
        int[] iArr3 = new int[i];
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            for (int i10 = 0; i10 < i; i10++) {
                if (iArr[i10] == i9) {
                    iArr3[i8] = i9;
                    iArr2[i8] = i10;
                    i8++;
                }
            }
        }
        int[] iArr4 = new int[i];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i - 1; i14 >= 0; i14--) {
            i11 += i12;
            int i15 = iArr3[i14];
            if (i15 != i13) {
                i12 = 1 << (16 - i15);
                i13 = i15;
            }
            iArr4[iArr2[i14]] = i11;
        }
        C3075 c3075 = new C3075(iMax);
        for (int i16 = 0; i16 < i; i16++) {
            int i17 = iArr[i16];
            if (i17 > 0) {
                c3075.m4711(0, Integer.reverse(iArr4[i16] << 16), i17, i16);
            }
        }
        return c3075;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static /* synthetic */ List m4701(C3075 c3075, CharSequence charSequence, int i, int i2, InterfaceC7383 interfaceC7383, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return c3075.m4703(charSequence, i, i2, (i3 & 8) == 0, interfaceC7383);
    }

    @Override // p234.InterfaceC8802
    public Object create() {
        int i = this.f6883;
        Object obj = this.f6882;
        switch (i) {
            case 8:
                C0984 c0984 = (C0984) obj;
                return new RunnableC3847((C3836) c0984.f940, (C8657) c0984.f939);
            default:
                C3837 c3837 = (C3837) obj;
                return new C3831((ExecutorServiceC8872) c3837.f9884, (ExecutorServiceC8872) c3837.f9882, (ExecutorServiceC8872) c3837.f9883, (ExecutorServiceC8872) c3837.f9879, (C3840) c3837.f9878, (C3840) c3837.f9880, (C8657) c3837.f9881);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.InterfaceC5674
    public void lock() {
        ((ReentrantLock) this.f6882).lock();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3876
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.f6882;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    public String toString() {
        int i = this.f6883;
        Object obj = this.f6882;
        switch (i) {
            case 0:
                return "ContentInfoCompat{" + ((ContentInfo) obj) + "}";
            case 20:
                StringBuilder sb = new StringBuilder();
                C5424 c5424 = (C5424) obj;
                sb.append(c5424);
                sb.append(": ");
                sb.append(((Map) AbstractC7082.m12308(c5424.f13742, C5424.f13738[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.InterfaceC5674
    public void unlock() {
        ((ReentrantLock) this.f6882).unlock();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int m4702(C6428 c6428) throws IOException {
        int i = 0;
        while (true) {
            int iM15162 = (int) c6428.m15162(1);
            if (iM15162 == -1) {
                return -1;
            }
            int iM12133 = AbstractC7012.m12133(i, 2, 1, iM15162);
            int i2 = ((int[]) this.f6882)[iM12133];
            if (i2 != -2) {
                if (i2 != -1) {
                    return i2;
                }
                throw new IOException("The child " + iM15162 + " of node at index " + i + " is not defined");
            }
            i = iM12133;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public List m4703(CharSequence charSequence, int i, int i2, boolean z, InterfaceC7383 interfaceC7383) {
        charSequence.getClass();
        if (charSequence.length() == 0) {
            C6755.m11869("Couldn't search in char tree for empty string");
            return null;
        }
        C4787 c4787 = (C4787) this.f6882;
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (((Boolean) interfaceC7383.invoke(Character.valueOf(cCharAt), Integer.valueOf(cCharAt))).booleanValue()) {
                break;
            }
            C4787[] c4787Arr = c4787.f12521;
            C4787 c47872 = c4787Arr[cCharAt];
            if (c47872 == null) {
                c4787 = z ? c4787Arr[Character.toLowerCase(cCharAt)] : null;
                if (c4787 == null) {
                    return EmptyList.INSTANCE;
                }
            } else {
                c4787 = c47872;
            }
            i++;
        }
        return c4787.f12523;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public void m4704(Class cls, C9194 c9194) {
        if (cls == Void.TYPE || cls == Void.class) {
            return;
        }
        c9194.f23435 = cls;
        int i = 0;
        for (Annotation annotation : AbstractC3698.m6380(cls)) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            String name = clsAnnotationType.getName();
            if ("com.alibaba.fastjson.annotation.JSONPOJOBuilder".equals(name) || "com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder".equals(name)) {
                AbstractC3698.m6371(clsAnnotationType, new C3603(annotation, c9194, cls, i));
            } else {
                InterfaceC9199 interfaceC9199 = (InterfaceC9199) AbstractC3698.m6378(cls, InterfaceC9199.class);
                if (interfaceC9199 != null) {
                    c9194.f23434 = AbstractC3698.m6370(cls, interfaceC9199.buildMethod());
                    String strWithPrefix = interfaceC9199.withPrefix();
                    if (!strWithPrefix.isEmpty()) {
                        c9194.f23433 = strWithPrefix;
                    }
                }
            }
        }
        if (c9194.f23434 == null) {
            c9194.f23434 = AbstractC3698.m6370(cls, "build");
        }
        if (c9194.f23434 == null) {
            c9194.f23434 = AbstractC3698.m6370(cls, "create");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4705(C9192 c9192, Annotation[] annotationArr) {
        int i = 0;
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC9196 interfaceC9196 = (InterfaceC9196) AbstractC3698.m6379(annotation, InterfaceC9196.class);
            if (interfaceC9196 != null) {
                m4698(c9192, interfaceC9196);
                if (interfaceC9196 != annotation) {
                    if (clsAnnotationType == InterfaceC9198.class && ((InterfaceC9198) annotation).value() == JSONCompiler$CompilerOption.LAMBDA) {
                        c9192.f23390 |= 18014398509481984L;
                    }
                    boolean z = AbstractC3766.f9633;
                    String name = clsAnnotationType.getName();
                    if (name.equals("飘花落叶言楪哲子世兰苏.飘花落叶言子楪世苏兰哲")) {
                        if (AbstractC3766.f9632) {
                            AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, 7));
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonManagedReference")) {
                        if (z) {
                            c9192.f23390 |= JSONWriter$Feature.ReferenceDetection.mask;
                        }
                    } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonDeserialize")) {
                        if (z && z) {
                            AbstractC3698.m6371(annotation.getClass(), new C3613(this, annotation, c9192, 3));
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                        if (z) {
                            AbstractC3698.m6348(c9192, annotation);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                        if (z) {
                            AbstractC3698.m6349(c9192, annotation);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonSetter")) {
                        if (z) {
                            AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, 4));
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonAlias")) {
                        if (z) {
                            AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, 2));
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonAnyGetter")) {
                        if (z) {
                            c9192.f23390 |= 562949953421312L;
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                        if (z && z) {
                            AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, 1));
                        }
                    } else if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                        AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, i));
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonBackReference") && z) {
                        c9192.f23390 |= 2305843009213693952L;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public void m4706(Class cls, C9194 c9194) {
        C3635 c3635 = ((C3612) this.f6882).f8846;
        Class<InterfaceC3679> cls2 = (Class) c3635.f9012.get(cls);
        if (cls2 == null && "org.apache.commons.lang3.tuple.Triple".equals(cls.getName())) {
            c3635.m6192(cls);
            cls2 = InterfaceC3679.class;
        }
        int i = 4;
        if (cls2 != null && cls2 != cls) {
            for (Annotation annotation : AbstractC3698.m6380(cls2)) {
                AbstractC3698.m6371(annotation.annotationType(), new C3604(annotation, c9194, i));
            }
        }
        for (Annotation annotation2 : AbstractC3698.m6380(cls)) {
            AbstractC3698.m6371(annotation2.annotationType(), new C3604(annotation2, c9194, i));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public void mo4571() {
        View view = (View) this.f6882;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int m4707(FitSystemBarUtils$Orientation fitSystemBarUtils$Orientation) {
        int[] iArr = ((DialogXBaseRelativeLayout) this.f6882).f11975;
        int i = AbstractC4590.f12022[fitSystemBarUtils$Orientation.ordinal()];
        if (i == 1) {
            return iArr[0];
        }
        if (i == 2) {
            return iArr[1];
        }
        if (i == 3) {
            return iArr[2];
        }
        if (i != 4) {
            return 0;
        }
        return iArr[3];
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public void m4708(C9192 c9192, Class cls, Field field) {
        Class cls2;
        Field declaredField;
        if (cls != null && (cls2 = (Class) ((C3612) this.f6882).f8846.f9012.get(cls)) != null && cls2 != cls) {
            try {
                declaredField = cls2.getDeclaredField(field.getName());
            } catch (Exception unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                m4708(c9192, cls2, declaredField);
            }
        }
        m4705(c9192, AbstractC3698.m6380(field));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4709(C9194 c9194, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC9195 interfaceC9195 = (InterfaceC9195) AbstractC3698.m6379(annotation, InterfaceC9195.class);
            if (interfaceC9195 != null) {
                AbstractC3698.m6371(annotation.getClass(), new C3616(this, annotation, c9194, 1));
                if (interfaceC9195 != annotation) {
                    if (clsAnnotationType == InterfaceC9198.class && ((InterfaceC9198) annotation).value() == JSONCompiler$CompilerOption.LAMBDA) {
                        c9194.f23445 |= 18014398509481984L;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[PHI: r9
  0x007e: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v4 java.lang.String) binds: [B:28:0x0071, B:30:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4710(C9192 c9192, Class cls, Method method) {
        String str;
        char cCharAt;
        char cCharAt2;
        Method declaredMethod;
        Method methodM6357;
        String name = method.getName();
        int i = 0;
        String str2 = null;
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            Method methodM63572 = AbstractC3698.m6357(method, superclass);
            if (methodM63572 != null) {
                m4710(c9192, superclass, methodM63572);
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (cls2 != Serializable.class && (methodM6357 = AbstractC3698.m6357(method, cls2)) != null) {
                    m4710(c9192, superclass, methodM6357);
                }
            }
            Class cls3 = (Class) ((C3612) this.f6882).f8846.f9012.get(cls);
            if (cls3 != null && cls3 != cls) {
                try {
                    declaredMethod = cls3.getDeclaredMethod(name, method.getParameterTypes());
                } catch (Exception unused) {
                    declaredMethod = null;
                }
                if (declaredMethod != null) {
                    m4710(c9192, cls3, declaredMethod);
                }
            }
        }
        Annotation[] annotationArrM6380 = AbstractC3698.m6380(method);
        int length = annotationArrM6380.length;
        int i2 = 0;
        String strName = null;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                break;
            }
            Annotation annotation = annotationArrM6380[i2];
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC9196 interfaceC9196 = (InterfaceC9196) AbstractC3698.m6379(annotation, InterfaceC9196.class);
            if (interfaceC9196 != null) {
                m4698(c9192, interfaceC9196);
                strName = interfaceC9196.name();
                if (interfaceC9196 != annotation) {
                    if (clsAnnotationType == InterfaceC9198.class && ((InterfaceC9198) annotation).value() == JSONCompiler$CompilerOption.LAMBDA) {
                        c9192.f23390 |= 18014398509481984L;
                    }
                    boolean z = AbstractC3766.f9633;
                    String name2 = clsAnnotationType.getName();
                    if (name2.equals("飘花落叶言楪哲子世兰苏.飘花落叶言子楪世苏兰哲")) {
                        if (AbstractC3766.f9632) {
                            AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, 7));
                        }
                    } else if (name2.equals("com.fasterxml.jackson.databind.annotation.JsonDeserialize")) {
                        if (z && z) {
                            AbstractC3698.m6371(annotation.getClass(), new C3613(this, annotation, c9192, 3));
                        }
                    } else if (name2.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                        if (z) {
                            AbstractC3698.m6348(c9192, annotation);
                        }
                    } else if (name2.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                        if (z) {
                            AbstractC3698.m6349(c9192, annotation);
                        }
                    } else if (name2.equals("com.fasterxml.jackson.annotation.JsonAlias")) {
                        if (z) {
                            AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, 2));
                        }
                    } else if (name2.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                        if (z && z) {
                            AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, i3));
                        }
                    } else if (name2.equals("com.fasterxml.jackson.annotation.JsonAnySetter")) {
                        if (z) {
                            c9192.f23390 |= 562949953421312L;
                        }
                    } else if (name2.equals("com.alibaba.fastjson.annotation.JSONField")) {
                        AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, i));
                    }
                }
            }
            i2++;
        }
        String strM6347 = name.startsWith("set") ? AbstractC3698.m6347(name, null) : AbstractC3698.m6365(name, null);
        if (strM6347.length() <= 1 || (cCharAt = strM6347.charAt(0)) < 'A' || cCharAt > 'Z' || (cCharAt2 = strM6347.charAt(1)) < 'A' || cCharAt2 > 'Z' || !(strName == null || strName.isEmpty())) {
            str = null;
        } else {
            char[] charArray = strM6347.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            String str3 = new String(charArray);
            charArray[1] = (char) (charArray[1] + ' ');
            str2 = new String(charArray);
            str = str3;
        }
        AbstractC3698.m6384(cls, new C3617(this, strM6347, c9192, cls, str, str2));
        if (str != null && c9192.f23394 == null && c9192.f23406 == null) {
            c9192.f23406 = new String[]{str, str2};
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void m4711(int i, int i2, int i3, int i4) {
        int[] iArr = (int[]) this.f6882;
        if (i3 != 0) {
            iArr[i] = -2;
            m4711((i * 2) + 1 + (i2 & 1), i2 >>> 1, i3 - 1, i4);
        } else if (iArr[i] == -1) {
            iArr[i] = i4;
        } else {
            C6755.m11869(AbstractC0900.m707(AbstractC0900.m710(i, "Tree value at index ", " has already been assigned ("), ")", iArr[i]));
        }
    }

    @Override // androidx.core.view.InterfaceC3098
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void mo4712() {
        ((NestedScrollView) this.f6882).f7000.abortAnimation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public Object mo829(C7819 c7819, Object obj) {
        m4734(c7819, (StringBuilder) obj, "setter");
        return C6008.f15084;
    }

    @Override // androidx.core.view.InterfaceC3098
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float mo4713() {
        return -((NestedScrollView) this.f6882).getVerticalScrollFactorCompat();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public Object mo831(C7808 c7808, Object obj) {
        ((C5576) this.f6882).m10042(c7808, true, (StringBuilder) obj, true);
        return C6008.f15084;
    }

    @Override // androidx.core.view.InterfaceC3094
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ContentInfo mo4714() {
        return (ContentInfo) this.f6882;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void m4715(final Class cls, final C9194 c9194) {
        final int i;
        C3635 c3635 = ((C3612) this.f6882).f8846;
        Class<InterfaceC3679> cls2 = (Class) c3635.f9012.get(cls);
        if (cls2 == null && "org.apache.commons.lang3.tuple.Triple".equals(cls.getName())) {
            c3635.m6192(cls);
            cls2 = InterfaceC3679.class;
        }
        final int i2 = 0;
        final int i3 = 1;
        if (cls2 != null && cls2 != cls) {
            m4709(c9194, AbstractC3698.m6380(cls2));
            AbstractC3698.m6342(cls2, new Consumer(this) { // from class: com.alibaba.fastjson2.reader.飘花落叶言子苏世兰哲楪

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C3075 f8780;

                {
                    this.f8780 = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i4 = i2;
                    Class cls3 = cls;
                    C9194 c91942 = c9194;
                    C3075 c3075 = this.f8780;
                    switch (i4) {
                        case 0:
                            C3612.m6176((C3612) c3075.f6882, c91942, cls3, (Method) obj);
                            break;
                        case 1:
                            C3612.m6177((C3612) c3075.f6882, c91942, cls3, (Constructor) obj);
                            break;
                        case 2:
                            C3612.m6176((C3612) c3075.f6882, c91942, cls3, (Method) obj);
                            break;
                        default:
                            C3612.m6177((C3612) c3075.f6882, c91942, cls3, (Constructor) obj);
                            break;
                    }
                }
            });
            AbstractC3698.m6366(cls2, new Consumer(this) { // from class: com.alibaba.fastjson2.reader.飘花落叶言子苏世兰哲楪

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C3075 f8780;

                {
                    this.f8780 = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i4 = i3;
                    Class cls3 = cls;
                    C9194 c91942 = c9194;
                    C3075 c3075 = this.f8780;
                    switch (i4) {
                        case 0:
                            C3612.m6176((C3612) c3075.f6882, c91942, cls3, (Method) obj);
                            break;
                        case 1:
                            C3612.m6177((C3612) c3075.f6882, c91942, cls3, (Constructor) obj);
                            break;
                        case 2:
                            C3612.m6176((C3612) c3075.f6882, c91942, cls3, (Method) obj);
                            break;
                        default:
                            C3612.m6177((C3612) c3075.f6882, c91942, cls3, (Constructor) obj);
                            break;
                    }
                }
            });
        }
        Class cls3 = null;
        for (Class superclass = cls.getSuperclass(); superclass != null && superclass != Object.class && superclass != Enum.class; superclass = superclass.getSuperclass()) {
            C9194 c91942 = new C9194(AbstractC3766.m6947());
            m4715(superclass, c91942);
            Class[] clsArr = c91942.f23432;
            if (clsArr != null) {
                int length = clsArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        cls3 = superclass;
                        break;
                    } else if (clsArr[i4] == cls) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        if (cls3 != null) {
            m4715(cls3, c9194);
        }
        Annotation[] annotationArrM6380 = AbstractC3698.m6380(cls);
        m4709(c9194, annotationArrM6380);
        int length2 = annotationArrM6380.length;
        int i5 = 0;
        while (true) {
            i = 3;
            if (i5 >= length2) {
                break;
            }
            Annotation annotation = annotationArrM6380[i5];
            boolean z = AbstractC3766.f9633;
            String name = annotation.annotationType().getName();
            if (name.equals("com.fasterxml.jackson.databind.annotation.JsonDeserialize")) {
                if (z) {
                    AbstractC3698.m6371(annotation.getClass(), new C3616(this, annotation, c9194, i2));
                }
            } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                if (z) {
                    AbstractC3698.m6371(annotation.getClass(), new C3604(annotation, c9194, 8));
                }
            } else if (name.equals("com.fasterxml.jackson.annotation.JsonSubTypes")) {
                if (z) {
                    AbstractC3698.m6371(annotation.getClass(), new C3604(annotation, c9194, i));
                }
            } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeInfo")) {
                if (z) {
                    AbstractC3698.m6371(annotation.getClass(), new C3604(annotation, c9194, 5));
                }
            } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeName")) {
                if (z) {
                    AbstractC3698.m6371(annotation.getClass(), new C3604(annotation, c9194, 7));
                }
            } else if (name.equals("kotlin.Metadata")) {
                c9194.f23438 = true;
            } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                AbstractC3698.m6371(annotation.getClass(), new C3616(this, annotation, c9194, i3));
            }
            i5++;
        }
        if (AbstractC3687.f9263 >= 17 && c9194.f23432 == null && cls.isAnnotationPresent(InterfaceC9195.class)) {
            try {
                Method method = C3612.f8844;
                if (method == null) {
                    method = Class.class.getMethod("getPermittedSubclasses", null);
                    C3612.f8844 = method;
                }
                Class[] clsArr2 = (Class[]) method.invoke(cls, null);
                c9194.f23432 = clsArr2;
                c9194.f23451 = new String[clsArr2.length];
                while (i2 < clsArr2.length) {
                    Class cls4 = clsArr2[i2];
                    C9194 c91943 = new C9194(c3635);
                    m4706(cls4, c91943);
                    String simpleName = c91943.f23436;
                    if (simpleName == null || simpleName.isEmpty()) {
                        simpleName = cls4.getSimpleName();
                    }
                    c9194.f23451[i2] = simpleName;
                    i2++;
                }
                c9194.f23445 |= JSONReader$Feature.SupportAutoType.mask;
            } catch (Throwable unused) {
            }
        }
        final int i6 = 2;
        AbstractC3698.m6342(cls, new Consumer(this) { // from class: com.alibaba.fastjson2.reader.飘花落叶言子苏世兰哲楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3075 f8780;

            {
                this.f8780 = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i6;
                Class cls32 = cls;
                C9194 c919422 = c9194;
                C3075 c3075 = this.f8780;
                switch (i42) {
                    case 0:
                        C3612.m6176((C3612) c3075.f6882, c919422, cls32, (Method) obj);
                        break;
                    case 1:
                        C3612.m6177((C3612) c3075.f6882, c919422, cls32, (Constructor) obj);
                        break;
                    case 2:
                        C3612.m6176((C3612) c3075.f6882, c919422, cls32, (Method) obj);
                        break;
                    default:
                        C3612.m6177((C3612) c3075.f6882, c919422, cls32, (Constructor) obj);
                        break;
                }
            }
        });
        AbstractC3698.m6366(cls, new Consumer(this) { // from class: com.alibaba.fastjson2.reader.飘花落叶言子苏世兰哲楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3075 f8780;

            {
                this.f8780 = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i;
                Class cls32 = cls;
                C9194 c919422 = c9194;
                C3075 c3075 = this.f8780;
                switch (i42) {
                    case 0:
                        C3612.m6176((C3612) c3075.f6882, c919422, cls32, (Method) obj);
                        break;
                    case 1:
                        C3612.m6177((C3612) c3075.f6882, c919422, cls32, (Constructor) obj);
                        break;
                    case 2:
                        C3612.m6176((C3612) c3075.f6882, c919422, cls32, (Method) obj);
                        break;
                    default:
                        C3612.m6177((C3612) c3075.f6882, c919422, cls32, (Constructor) obj);
                        break;
                }
            }
        });
        if (c9194.f23454 == null && (c9194.f23445 & JSONReader$Feature.FieldBased.mask) == 0 && c9194.f23438) {
            AbstractC3693.m6336(cls, c9194);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public void m4716(C6348 c6348, long j, ProtoIntegerType protoIntegerType) {
        int i = AbstractC6355.f15610[protoIntegerType.ordinal()];
        if (i == 1) {
            ((C6348) this.f6882).m11321(Long.reverseBytes(j));
            return;
        }
        if (i == 2) {
            int i2 = C6348.f15588[Long.numberOfLeadingZeros(j)];
            c6348.m11323(i2 + 1);
            c6348.m11324(i2, j);
        } else {
            if (i != 3) {
                C5043.m9170();
                return;
            }
            long j2 = (j >> 63) ^ (j << 1);
            int i3 = C6348.f15588[Long.numberOfLeadingZeros(j2)];
            c6348.m11323(i3 + 1);
            c6348.m11324(i3, j2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void m4717(C6348 c6348, int i, ProtoIntegerType protoIntegerType) {
        int i2 = AbstractC6355.f15610[protoIntegerType.ordinal()];
        if (i2 == 1) {
            ((C6348) this.f6882).m11322(Integer.reverseBytes(i));
            return;
        }
        if (i2 == 2) {
            long j = i;
            c6348.getClass();
            int i3 = C6348.f15588[Long.numberOfLeadingZeros(j)];
            c6348.m11323(i3 + 1);
            c6348.m11324(i3, j);
            return;
        }
        if (i2 != 3) {
            C5043.m9170();
            return;
        }
        int i4 = (i << 1) ^ (i >> 31);
        c6348.m11323(5);
        if ((i4 & (-128)) != 0) {
            long j2 = i4;
            c6348.m11324(C6348.f15588[Long.numberOfLeadingZeros(j2)], j2);
        } else {
            byte[] bArr = c6348.f15590;
            int i5 = c6348.f15589;
            c6348.f15589 = i5 + 1;
            bArr[i5] = (byte) i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void m4718(AbstractC5542 abstractC5542) {
        if (!abstractC5542.mo9910()) {
            if (!(abstractC5542 instanceof C5529)) {
                String strValueOf = String.valueOf(abstractC5542.getClass());
                C6755.m11869(AbstractC0900.m711(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                return;
            } else {
                C5529 c5529 = (C5529) abstractC5542;
                m4718(c5529.f14098);
                m4718(c5529.f14094);
                return;
            }
        }
        int size = abstractC5542.size();
        int[] iArr = C5529.f14092;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f6882;
        if (stack.isEmpty() || ((AbstractC5542) stack.peek()).size() >= i) {
            stack.push(abstractC5542);
            return;
        }
        int i2 = iArr[iBinarySearch];
        AbstractC5542 c55292 = (AbstractC5542) stack.pop();
        while (!stack.isEmpty() && ((AbstractC5542) stack.peek()).size() < i2) {
            c55292 = new C5529((AbstractC5542) stack.pop(), c55292);
        }
        C5529 c55293 = new C5529(c55292, abstractC5542);
        while (!stack.isEmpty()) {
            int[] iArr2 = C5529.f14092;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, c55293.f14097);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC5542) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                c55293 = new C5529((AbstractC5542) stack.pop(), c55293);
            }
        }
        stack.push(c55293);
    }

    @Override // retrofit2.InterfaceC6619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object mo4719(Object obj) {
        return Optional.ofNullable(((InterfaceC6619) this.f6882).mo4719((AbstractC6957) obj));
    }

    @Override // p119.InterfaceC8101
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Iterable mo4720(Object obj) {
        int i = this.f6883;
        Object obj2 = this.f6882;
        switch (i) {
            case 17:
                return (Iterable) ((InterfaceC5934) obj2).invoke((InterfaceC5925) obj);
            default:
                C5252 c5252 = (C5252) obj2;
                Collection collectionMo10053 = ((AbstractC7818) obj).mo9560().mo10053();
                collectionMo10053.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionMo10053.iterator();
                while (it.hasNext()) {
                    InterfaceC5309 interfaceC5309Mo9770 = ((AbstractC5714) it.next()).mo10281().mo9770();
                    AbstractC7818 abstractC7818M9516 = null;
                    InterfaceC5309 interfaceC5309Mo9561 = interfaceC5309Mo9770 != null ? interfaceC5309Mo9770.mo9561() : null;
                    AbstractC7818 abstractC7818 = interfaceC5309Mo9561 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9561 : null;
                    if (abstractC7818 != null && (abstractC7818M9516 = c5252.m9516(abstractC7818)) == null) {
                        abstractC7818M9516 = abstractC7818;
                    }
                    if (abstractC7818M9516 != null) {
                        arrayList.add(abstractC7818M9516);
                    }
                }
                return arrayList;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo841(AbstractC7815 abstractC7815, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C5576 c5576 = (C5576) this.f6882;
        c5576.getClass();
        C5519 c5519 = abstractC7815.f19032;
        sb.append(c5576.m10025("package-fragment"));
        C5518 c5518 = c5519.f14041;
        c5518.getClass();
        String strM10037 = c5576.m10037(AbstractC3897.m7373(C5518.m9870(c5518)));
        if (strM10037.length() > 0) {
            sb.append(" ");
            sb.append(strM10037);
        }
        if (c5576.f14237.m10001()) {
            sb.append(" in ");
            c5576.m10014(abstractC7815.mo9587(), sb, false);
        }
        return C6008.f15084;
    }

    @Override // androidx.core.view.InterfaceC3094
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ClipData mo4721() {
        return ((ContentInfo) this.f6882).getClip();
    }

    @Override // androidx.core.view.InterfaceC3094
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo4722() {
        return ((ContentInfo) this.f6882).getSource();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo844(C7833 c7833, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C5576 c5576 = (C5576) this.f6882;
        c5576.getClass();
        C5519 c5519 = c7833.f19157;
        sb.append(c5576.m10025("package"));
        C5518 c5518 = c5519.f14041;
        c5518.getClass();
        String strM10037 = c5576.m10037(AbstractC3897.m7373(C5518.m9870(c5518)));
        if (strM10037.length() > 0) {
            sb.append(" ");
            sb.append(strM10037);
        }
        if (c5576.f14237.m10001()) {
            sb.append(" in context of ");
            c5576.m10014(c7833.f19160, sb, false);
        }
        return C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo845(C7847 c7847, Object obj) {
        boolean z;
        C7847 c7847Mo9577;
        boolean z2 = c7847.f19201;
        StringBuilder sb = (StringBuilder) obj;
        C5576 c5576 = (C5576) this.f6882;
        c5576.getClass();
        c5576.m10023(sb, c7847, null);
        C5575 c5575 = c5576.f14237;
        C5098 c5098 = c5575.f14222;
        InterfaceC5920[] interfaceC5920Arr = C5575.f14181;
        InterfaceC5920 interfaceC5920 = interfaceC5920Arr[13];
        c5098.getClass();
        interfaceC5920.getClass();
        if (((Boolean) c5098.f13151).booleanValue() || c7847.m12923().mo9568() != Modality.SEALED) {
            C5322 visibility = c7847.getVisibility();
            visibility.getClass();
            z = c5576.m10040(visibility, sb);
        }
        c5576.m10024(c7847, sb);
        C5098 c50982 = c5575.f14189;
        InterfaceC5920 interfaceC59202 = interfaceC5920Arr[40];
        c50982.getClass();
        interfaceC59202.getClass();
        boolean z3 = ((Boolean) c50982.f13151).booleanValue() || !z2 || z;
        if (z3) {
            sb.append(c5576.m10025("constructor"));
        }
        AbstractC7818 abstractC7818M12919 = c7847.mo9587();
        abstractC7818M12919.getClass();
        C5098 c50983 = c5575.f14197;
        InterfaceC5920 interfaceC59203 = interfaceC5920Arr[25];
        c50983.getClass();
        interfaceC59203.getClass();
        if (((Boolean) c50983.f13151).booleanValue()) {
            if (z3) {
                sb.append(" ");
            }
            c5576.m10014(abstractC7818M12919, sb, true);
            c5576.m10044(sb, c7847.getTypeParameters(), false);
        }
        List listMo9594 = c7847.mo9594();
        listMo9594.getClass();
        c5576.m10041(sb, listMo9594, c7847.mo9595());
        C5098 c50984 = c5575.f14220;
        InterfaceC5920 interfaceC59204 = interfaceC5920Arr[15];
        c50984.getClass();
        interfaceC59204.getClass();
        if (((Boolean) c50984.f13151).booleanValue() && !z2 && (c7847Mo9577 = abstractC7818M12919.mo9577()) != null) {
            List listMo95942 = c7847Mo9577.mo9594();
            listMo95942.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listMo95942) {
                C7808 c7808 = (C7808) ((InterfaceC5288) obj2);
                if (!c7808.m12849() && c7808.f19016 == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(c5576.m10025("this"));
                sb.append(AbstractC5176.m9369(arrayList, ", ", "(", ")", C5565.f14165, 24));
            }
        }
        C5098 c50985 = c5575.f14197;
        InterfaceC5920 interfaceC59205 = C5575.f14181[25];
        c50985.getClass();
        interfaceC59205.getClass();
        if (((Boolean) c50985.f13151).booleanValue()) {
            c5576.m10039(c7847.getTypeParameters(), sb);
        }
        return C6008.f15084;
    }

    @Override // androidx.core.view.InterfaceC3094
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int mo4723() {
        return ((ContentInfo) this.f6882).getFlags();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public Object mo848(Object obj, C7817 c7817) {
        ((C5576) this.f6882).m10014(c7817, (StringBuilder) obj, true);
        return C6008.f15084;
    }

    @Override // androidx.core.view.InterfaceC3098
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean mo4724(float f) {
        if (f == 0.0f) {
            return false;
        }
        mo4712();
        ((NestedScrollView) this.f6882).m4863((int) f);
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public Object mo850(C7835 c7835, Object obj) {
        ((StringBuilder) obj).append(c7835.getName());
        return C6008.f15084;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5662
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C5663 mo851(C5520 c5520) {
        C5663 c5663Mo851;
        c5520.getClass();
        InterfaceC5307 interfaceC5307 = (InterfaceC5307) this.f6882;
        C5519 c5519 = c5520.f14044;
        c5519.getClass();
        ArrayList<InterfaceC5298> arrayList = new ArrayList();
        interfaceC5307.mo9512(c5519, arrayList);
        for (InterfaceC5298 interfaceC5298 : arrayList) {
            if ((interfaceC5298 instanceof C5610) && (c5663Mo851 = ((C5610) interfaceC5298).f14264.mo851(c5520)) != null) {
                return c5663Mo851;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public Object mo852(AbstractC7825 abstractC7825, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C5576 c5576 = (C5576) this.f6882;
        c5576.getClass();
        c5576.m10023(sb, abstractC7825, null);
        C5322 c5322 = abstractC7825.f19097;
        c5322.getClass();
        c5576.m10040(c5322, sb);
        c5576.m10016(abstractC7825, sb);
        sb.append(c5576.m10025("typealias"));
        sb.append(" ");
        c5576.m10014(abstractC7825, sb, true);
        c5576.m10044(sb, abstractC7825.mo9574(), false);
        c5576.m10022(abstractC7825, sb);
        sb.append(" = ");
        sb.append(c5576.m10045(abstractC7825.mo10081()));
        return C6008.f15084;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public short mo4725() throws IOException {
        int i = ((InputStream) this.f6882).read();
        if (i != -1) {
            return (short) i;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public /* bridge */ /* synthetic */ Object mo854(InterfaceC5316 interfaceC5316, Object obj) {
        m4733(interfaceC5316, (StringBuilder) obj);
        return C6008.f15084;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public Object mo855(AbstractC7818 abstractC7818, Object obj) throws IOException {
        C7847 c7847Mo9577;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        C5576 c5576 = (C5576) this.f6882;
        C5575 c5575 = c5576.f14237;
        int i = 1;
        boolean z = abstractC7818.mo9569() == ClassKind.ENUM_ENTRY;
        if (!c5576.m10036()) {
            List listMo10098 = abstractC7818.mo10098();
            listMo10098.getClass();
            c5576.m10020(listMo10098, sb);
            c5576.m10023(sb, abstractC7818, null);
            if (!z) {
                C5322 visibility = abstractC7818.getVisibility();
                visibility.getClass();
                c5576.m10040(visibility, sb);
            }
            if ((abstractC7818.mo9569() != ClassKind.INTERFACE || abstractC7818.mo9568() != Modality.ABSTRACT) && (!abstractC7818.mo9569().isSingleton() || abstractC7818.mo9568() != Modality.FINAL)) {
                Modality modalityMo9568 = abstractC7818.mo9568();
                modalityMo9568.getClass();
                c5576.m10015(modalityMo9568, sb, C5576.m10003(abstractC7818));
            }
            c5576.m10016(abstractC7818, sb);
            c5576.m10017(sb, c5576.m10035().contains(DescriptorRendererModifier.INNER) && abstractC7818.mo9570(), "inner");
            c5576.m10017(sb, c5576.m10035().contains(DescriptorRendererModifier.DATA) && abstractC7818.mo9571(), "data");
            c5576.m10017(sb, c5576.m10035().contains(DescriptorRendererModifier.INLINE) && abstractC7818.isInline(), "inline");
            c5576.m10017(sb, c5576.m10035().contains(DescriptorRendererModifier.VALUE) && abstractC7818.mo9573(), "value");
            c5576.m10017(sb, c5576.m10035().contains(DescriptorRendererModifier.FUN) && abstractC7818.mo9576(), "fun");
            if (abstractC7818.mo9572()) {
                str = "companion object";
            } else {
                switch (AbstractC5568.f14171[abstractC7818.mo9569().ordinal()]) {
                    case 1:
                        str = "class";
                        break;
                    case 2:
                        str = "interface";
                        break;
                    case 3:
                        str = "enum class";
                        break;
                    case 4:
                        str = "object";
                        break;
                    case 5:
                        str = "annotation class";
                        break;
                    case 6:
                        str = "enum entry";
                        break;
                    default:
                        C5043.m9170();
                        return null;
                }
            }
            sb.append(c5576.m10025(str));
        }
        if (AbstractC7699.m12674(abstractC7818)) {
            C5098 c5098 = c5575.f14203;
            InterfaceC5920 interfaceC5920 = C5575.f14181[31];
            c5098.getClass();
            interfaceC5920.getClass();
            if (((Boolean) c5098.f13151).booleanValue()) {
                if (c5576.m10036()) {
                    sb.append("companion object");
                }
                C5576.m10006(sb);
                InterfaceC5331 interfaceC5331Mo9587 = abstractC7818.mo9587();
                if (interfaceC5331Mo9587 != null) {
                    sb.append("of ");
                    C5523 name = interfaceC5331Mo9587.getName();
                    name.getClass();
                    sb.append(c5576.m10013(name, false));
                }
            }
            if (c5576.m10034() || !AbstractC5227.m9466(abstractC7818.getName(), AbstractC5524.f14055)) {
                if (!c5576.m10036()) {
                    C5576.m10006(sb);
                }
                C5523 name2 = abstractC7818.getName();
                name2.getClass();
                sb.append(c5576.m10013(name2, true));
            }
        } else {
            if (!c5576.m10036()) {
                C5576.m10006(sb);
            }
            c5576.m10014(abstractC7818, sb, true);
        }
        if (!z) {
            List listMo9574 = abstractC7818.mo9574();
            listMo9574.getClass();
            c5576.m10044(sb, listMo9574, false);
            c5576.m10022(abstractC7818, sb);
            if (!abstractC7818.mo9569().isSingleton()) {
                C5098 c50982 = c5575.f14228;
                InterfaceC5920 interfaceC59202 = C5575.f14181[7];
                c50982.getClass();
                interfaceC59202.getClass();
                if (((Boolean) c50982.f13151).booleanValue() && (c7847Mo9577 = abstractC7818.mo9577()) != null) {
                    sb.append(" ");
                    c5576.m10023(sb, c7847Mo9577, null);
                    C5322 visibility2 = c7847Mo9577.getVisibility();
                    visibility2.getClass();
                    c5576.m10040(visibility2, sb);
                    sb.append(c5576.m10025("constructor"));
                    List listMo9594 = c7847Mo9577.mo9594();
                    listMo9594.getClass();
                    c5576.m10041(sb, listMo9594, c7847Mo9577.mo9595());
                }
            }
            C5098 c50983 = c5575.f14215;
            InterfaceC5920 interfaceC59203 = C5575.f14181[22];
            c50983.getClass();
            interfaceC59203.getClass();
            if (!((Boolean) c50983.f13151).booleanValue() && !AbstractC7359.m12577(abstractC7818.mo9584())) {
                Collection collectionMo10053 = abstractC7818.mo9560().mo10053();
                collectionMo10053.getClass();
                if (!collectionMo10053.isEmpty() && (collectionMo10053.size() != 1 || !AbstractC7359.m12581((AbstractC5714) collectionMo10053.iterator().next()))) {
                    C5576.m10006(sb);
                    sb.append(": ");
                    AbstractC5176.m9368(collectionMo10053, sb, ", ", null, null, new C5564(c5576, i), 60);
                }
            }
            c5576.m10039(listMo9574, sb);
        }
        return C6008.f15084;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int mo4726(byte[] bArr, int i) throws DefaultImageHeaderParser$Reader$EndOfFileException {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.f6882).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public Object mo857(C7820 c7820, Object obj) {
        m4734(c7820, (StringBuilder) obj, "getter");
        return C6008.f15084;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int mo4727() {
        return mo4725() | (mo4725() << 8);
    }

    @Override // androidx.profileinstaller.InterfaceC3273
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo4728() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // androidx.profileinstaller.InterfaceC3273
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void mo4729(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f6882).setResultCode(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public Object mo861(C7821 c7821, Object obj) {
        c7821.getClass();
        C5576.m10004((C5576) this.f6882, c7821, (StringBuilder) obj);
        return C6008.f15084;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public Object mo862(AbstractC7843 abstractC7843, Object obj) {
        ((C5576) this.f6882).m10046(abstractC7843, (StringBuilder) obj, true);
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public void m4730(C6348 c6348) {
        c6348.getClass();
        C6348 c63482 = (C6348) this.f6882;
        m4699(this, c63482, c6348.f15589);
        int i = c6348.f15589;
        c63482.m11323(i);
        AbstractC5179.m9403(c6348.f15590, c63482.f15589, c63482.f15590, 0, i);
        c63482.f15589 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public void mo4572() {
        View viewFindViewById;
        View view = (View) this.f6882;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC3043(viewFindViewById, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public void m4731(byte[] bArr) {
        bArr.getClass();
        C6348 c6348 = (C6348) this.f6882;
        m4699(this, c6348, bArr.length);
        int length = bArr.length;
        if (length == 0) {
            return;
        }
        c6348.m11323(length);
        AbstractC5179.m9403(bArr, c6348.f15589, c6348.f15590, 0, length);
        c6348.f15589 += length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public void m4732(int i, int i2, ProtoIntegerType protoIntegerType) {
        C6348 c6348 = (C6348) this.f6882;
        protoIntegerType.getClass();
        m4699(this, c6348, (protoIntegerType == ProtoIntegerType.FIXED ? ProtoWireType.i32 : ProtoWireType.VARINT).wireIntWithTag(i2));
        m4717(c6348, i, protoIntegerType);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bb  */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4733(InterfaceC5316 interfaceC5316, StringBuilder sb) {
        boolean z;
        C5576 c5576 = (C5576) this.f6882;
        C5575 c5575 = c5576.f14237;
        C5575 c55752 = c5576.f14237;
        if (!c5576.m10036()) {
            C5098 c5098 = c55752.f14225;
            InterfaceC5920[] interfaceC5920Arr = C5575.f14181;
            InterfaceC5920 interfaceC5920 = interfaceC5920Arr[5];
            c5098.getClass();
            interfaceC5920.getClass();
            if (!((Boolean) c5098.f13151).booleanValue()) {
                List listMo9596 = interfaceC5316.mo9596();
                listMo9596.getClass();
                c5576.m10020(listMo9596, sb);
                c5576.m10023(sb, interfaceC5316, null);
                C5322 visibility = interfaceC5316.getVisibility();
                visibility.getClass();
                c5576.m10040(visibility, sb);
                c5576.m10018(interfaceC5316, sb);
                C5098 c50982 = c55752.f14186;
                InterfaceC5920 interfaceC59202 = interfaceC5920Arr[44];
                c50982.getClass();
                interfaceC59202.getClass();
                if (((Boolean) c50982.f13151).booleanValue()) {
                    c5576.m10016(interfaceC5316, sb);
                }
                c5576.m10012(interfaceC5316, sb);
                C5098 c50983 = c55752.f14186;
                InterfaceC5920 interfaceC59203 = interfaceC5920Arr[44];
                c50983.getClass();
                interfaceC59203.getClass();
                if (((Boolean) c50983.f13151).booleanValue()) {
                    boolean z2 = false;
                    if (interfaceC5316.isOperator()) {
                        Collection collectionMo9589 = interfaceC5316.mo9589();
                        collectionMo9589.getClass();
                        Collection collection = collectionMo9589;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((InterfaceC5316) it.next()).isOperator()) {
                                    C5098 c50984 = c55752.f14188;
                                    InterfaceC5920 interfaceC59204 = C5575.f14181[39];
                                    c50984.getClass();
                                    interfaceC59204.getClass();
                                    if (((Boolean) c50984.f13151).booleanValue()) {
                                        break;
                                    }
                                    if (interfaceC5316.isInfix()) {
                                        Collection collectionMo95892 = interfaceC5316.mo9589();
                                        collectionMo95892.getClass();
                                        Collection collection2 = collectionMo95892;
                                        if (collection2.isEmpty()) {
                                            z2 = true;
                                        } else {
                                            Iterator it2 = collection2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    break;
                                                }
                                                if (((InterfaceC5316) it2.next()).isInfix()) {
                                                    C5098 c50985 = c55752.f14188;
                                                    InterfaceC5920 interfaceC59205 = C5575.f14181[39];
                                                    c50985.getClass();
                                                    interfaceC59205.getClass();
                                                    if (((Boolean) c50985.f13151).booleanValue()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c5576.m10017(sb, interfaceC5316.mo9598(), "tailrec");
                                    c5576.m10017(sb, interfaceC5316.isSuspend(), "suspend");
                                    c5576.m10017(sb, interfaceC5316.isInline(), "inline");
                                    c5576.m10017(sb, z2, "infix");
                                    c5576.m10017(sb, z, "operator");
                                }
                            }
                            z = false;
                            if (interfaceC5316.isInfix()) {
                            }
                            c5576.m10017(sb, interfaceC5316.mo9598(), "tailrec");
                            c5576.m10017(sb, interfaceC5316.isSuspend(), "suspend");
                            c5576.m10017(sb, interfaceC5316.isInline(), "inline");
                            c5576.m10017(sb, z2, "infix");
                            c5576.m10017(sb, z, "operator");
                        }
                        z = true;
                        if (interfaceC5316.isInfix()) {
                        }
                        c5576.m10017(sb, interfaceC5316.mo9598(), "tailrec");
                        c5576.m10017(sb, interfaceC5316.isSuspend(), "suspend");
                        c5576.m10017(sb, interfaceC5316.isInline(), "inline");
                        c5576.m10017(sb, z2, "infix");
                        c5576.m10017(sb, z, "operator");
                    } else {
                        z = false;
                        if (interfaceC5316.isInfix()) {
                        }
                        c5576.m10017(sb, interfaceC5316.mo9598(), "tailrec");
                        c5576.m10017(sb, interfaceC5316.isSuspend(), "suspend");
                        c5576.m10017(sb, interfaceC5316.isInline(), "inline");
                        c5576.m10017(sb, z2, "infix");
                        c5576.m10017(sb, z, "operator");
                    }
                } else {
                    c5576.m10017(sb, interfaceC5316.isSuspend(), "suspend");
                }
                c5576.m10024(interfaceC5316, sb);
                if (c5576.m10034()) {
                    if (interfaceC5316.mo9599()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC5316.mo9600()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(c5576.m10025("fun"));
            sb.append(" ");
            List typeParameters = interfaceC5316.getTypeParameters();
            typeParameters.getClass();
            c5576.m10044(sb, typeParameters, true);
            c5576.m10007(interfaceC5316, sb);
        }
        c5576.m10014(interfaceC5316, sb, true);
        List listMo9594 = interfaceC5316.mo9594();
        listMo9594.getClass();
        c5576.m10041(sb, listMo9594, interfaceC5316.mo9595());
        c5576.m10008(interfaceC5316, sb);
        AbstractC5714 returnType = interfaceC5316.getReturnType();
        C5098 c50986 = c5575.f14227;
        InterfaceC5920[] interfaceC5920Arr2 = C5575.f14181;
        InterfaceC5920 interfaceC59206 = interfaceC5920Arr2[10];
        c50986.getClass();
        interfaceC59206.getClass();
        if (!((Boolean) c50986.f13151).booleanValue()) {
            C5098 c50987 = c5575.f14226;
            InterfaceC5920 interfaceC59207 = interfaceC5920Arr2[9];
            c50987.getClass();
            interfaceC59207.getClass();
            if (((Boolean) c50987.f13151).booleanValue() || returnType == null) {
                sb.append(": ");
                sb.append(returnType == null ? "[NULL]" : c5576.m10045(returnType));
            } else {
                C5523 c5523 = AbstractC7359.f18265;
                if (!AbstractC7359.m12567(returnType, AbstractC7356.f18227)) {
                }
            }
        }
        List typeParameters2 = interfaceC5316.getTypeParameters();
        typeParameters2.getClass();
        c5576.m10039(typeParameters2, sb);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public void m4734(AbstractC7823 abstractC7823, StringBuilder sb, String str) {
        C5576 c5576 = (C5576) this.f6882;
        C5098 c5098 = c5576.f14237.f14202;
        InterfaceC5920 interfaceC5920 = C5575.f14181[32];
        c5098.getClass();
        interfaceC5920.getClass();
        int i = AbstractC5573.f14180[((PropertyAccessorRenderingPolicy) c5098.f13151).ordinal()];
        if (i == 1) {
            c5576.m10016(abstractC7823, sb);
            sb.append(str.concat(" for "));
            InterfaceC5305 interfaceC5305M12885 = abstractC7823.m12885();
            interfaceC5305M12885.getClass();
            C5576.m10004(c5576, interfaceC5305M12885, sb);
            return;
        }
        if (i == 2) {
            m4733(abstractC7823, sb);
        } else {
            if (i == 3) {
                return;
            }
            C5043.m9170();
        }
    }

    public C3075(C3902 c3902) {
        this.f6883 = 7;
        this.f6882 = Collections.unmodifiableMap(new HashMap(c3902.f10171));
    }

    public C3075(View view) {
        this.f6883 = 2;
        if (Build.VERSION.SDK_INT >= 30) {
            C3041 c3041 = new C3041(view, 1);
            c3041.f6834 = view;
            this.f6882 = c3041;
            return;
        }
        this.f6882 = new C3075(view, 1);
    }

    public C3075(int i) {
        this.f6883 = 28;
        if (i >= 0 && i <= 30) {
            int[] iArr = new int[(int) ((1 << (i + 1)) - 1)];
            Arrays.fill(iArr, -1);
            this.f6882 = iArr;
            return;
        }
        C6755.m11869(AbstractC7012.m12147(i, "depth must be bigger than 0 and not bigger than 30 but is "));
        throw null;
    }

    public /* synthetic */ C3075(Object obj, int i) {
        this.f6883 = i;
        this.f6882 = obj;
    }

    public C3075(InterfaceC6039 interfaceC6039, InterfaceC7380 interfaceC7380, InterfaceC7380 interfaceC73802) {
        this.f6883 = 25;
        this.f6882 = interfaceC7380;
    }

    public C3075(ContentInfo contentInfo) {
        this.f6883 = 0;
        contentInfo.getClass();
        this.f6882 = AbstractC3076.m4754(contentInfo);
    }
}
