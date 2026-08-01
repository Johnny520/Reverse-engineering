package p332;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.RunnableC0946;
import androidx.compose.foundation.lazy.C1594;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.scrollcapture.C2762;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2792;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.p001ui.semantics.C2791;
import androidx.compose.p001ui.semantics.C2793;
import androidx.compose.runtime.C2157;
import androidx.compose.runtime.collection.C2059;
import androidx.recyclerview.widget.AbstractC3290;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.C3358;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONObject;
import com.android.p002dx.command.dexer.DxContext;
import com.android.p002dx.dex.DexOptions;
import com.android.p002dx.dex.file.DexFile;
import com.android.p002dx.dex.p004cf.CfOptions;
import com.android.p002dx.dex.p004cf.CfTranslator;
import com.android.p002dx.p003cf.direct.DirectClassFile;
import com.android.p002dx.p003cf.direct.StdAttributeFactory;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import dalvik.system.InMemoryDexClassLoader;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.http.cio.AbstractC4789;
import io.ktor.http.cio.C4803;
import io.ktor.http.cio.internals.AbstractC4782;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.C5906;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5409;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.text.AbstractC5961;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p025.ViewOnClickListenerC7005;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p038.C7129;
import p038.C7133;
import p044.DialogC7148;
import p050.AbstractC7173;
import p052.AbstractC7187;
import p055.C7243;
import p063.C7321;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p091.C7787;
import p098.C7863;
import p128.C8157;
import p160.C8376;
import p169.C8428;
import p183.C8523;
import p183.C8527;
import p183.C8535;
import p191.AbstractC8568;
import p221.C8734;
import p252.AbstractC8940;
import p252.C8927;
import p252.C8934;
import p252.InterfaceC8924;
import p303.AbstractC9234;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9496 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static DialogC7148 f24798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24799;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static C7863 m14920(TypeUsage typeUsage, boolean z, C5409 c5409, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            c5409 = null;
        }
        typeUsage.getClass();
        return new C7863(typeUsage, z3, z2, c5409 != null ? AbstractC8568.m13614(c5409) : null, 34);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m14921(String str, String str2) {
        if (!new File(str).exists()) {
            AbstractC7014.m12151(AbstractC9234.m14531(568));
            return;
        }
        if (str2.trim().equals("")) {
            str2 = new SimpleDateFormat(AbstractC9234.m14531(569)).format(new Date());
        } else if (new File(AbstractC4765.m8874().concat(AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵呜喵喵喵呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵喵呜")), str2).exists()) {
            m14923(str, str2);
            return;
        }
        new Thread(new RunnableC0946(str, 11, str2)).start();
        f24798.dismiss();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C8734 m14922(C8157 c8157) {
        return new C8734(Math.round(c8157.f19885), Math.round(c8157.f19884), Math.round(c8157.f19883), Math.round(c8157.f19882));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m14923(final String str, final String str2) {
        Activity activityM7213 = AbstractC3887.m7213();
        final DialogC7148 dialogC7148 = new DialogC7148(activityM7213);
        final int i = 0;
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(activityM7213).inflate(C0328R.layout.save_voice_layout, (ViewGroup) null, false);
        TextView textView = (TextView) relativeLayout.findViewById(C0328R.id.save_voice_title);
        textView.setText(AbstractC9234.m14531(570) + str2);
        textView.setTextColor(activityM7213.getColor(C0328R.color.____res_0x2406048a));
        EditText editText = (EditText) relativeLayout.findViewById(C0328R.id.voice_name);
        editText.setText(str2);
        Button button = (Button) relativeLayout.findViewById(C0328R.id.yes_save_voice);
        button.setText(AbstractC9234.m14531(571));
        button.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏兰世哲
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                DialogC7148 dialogC71482 = dialogC7148;
                String str3 = str2;
                String str4 = str;
                switch (i2) {
                    case 0:
                        try {
                            AbstractC5894.m10609(str4, C7243.f17939 + str3);
                            dialogC71482.dismiss();
                            AbstractC7014.m12151(AbstractC9234.m14531(574));
                        } catch (IOException e) {
                            C6755.m11872(e);
                            return;
                        }
                        break;
                    default:
                        C9496.m14941(str4, str3);
                        dialogC71482.dismiss();
                        break;
                }
            }
        });
        Button button2 = (Button) relativeLayout.findViewById(C0328R.id.save_voice_close);
        button2.setText(AbstractC9234.m14531(572));
        final int i2 = 1;
        button2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏兰世哲
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                DialogC7148 dialogC71482 = dialogC7148;
                String str3 = str2;
                String str4 = str;
                switch (i22) {
                    case 0:
                        try {
                            AbstractC5894.m10609(str4, C7243.f17939 + str3);
                            dialogC71482.dismiss();
                            AbstractC7014.m12151(AbstractC9234.m14531(574));
                        } catch (IOException e) {
                            C6755.m11872(e);
                            return;
                        }
                        break;
                    default:
                        C9496.m14941(str4, str3);
                        dialogC71482.dismiss();
                        break;
                }
            }
        });
        editText.addTextChangedListener(new C7129(editText, str, dialogC7148, button, button2));
        dialogC7148.setContentView(relativeLayout);
        dialogC7148.show();
        f24798.dismiss();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static InterfaceC5192 m14924(InterfaceC5192 interfaceC5192, InterfaceC5192 interfaceC51922) {
        interfaceC51922.getClass();
        return interfaceC51922 == EmptyCoroutineContext.INSTANCE ? interfaceC5192 : (InterfaceC5192) interfaceC51922.fold(interfaceC5192, new C1594(16));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final Object m14925(C8927 c8927, long j, CharSequence charSequence, C4803 c4803, InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, SuspendLambda suspendLambda) {
        C6008 c6008 = C6008.f15084;
        if (charSequence != null && m14936(charSequence)) {
            Object objM8903 = AbstractC4789.m8903(interfaceC5084, interfaceC5079, suspendLambda);
            if (objM8903 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM8903;
            }
        } else if (j != -1) {
            Object objM9222 = AbstractC5076.m9222(interfaceC5084, interfaceC5079, j, suspendLambda);
            if (objM9222 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM9222;
            }
        } else {
            if ((c4803 == null || !c4803.f12560) && !(c4803 == null && AbstractC5227.m9466(c8927, C8927.f22705))) {
                AbstractC5078.m9251(interfaceC5079, new IllegalStateException("Failed to parse request body: request body length should be specified,\nchunked transfer encoding should be used or\nkeep-alive should be disabled (connection: close)"));
                return c6008;
            }
            Object objM92222 = AbstractC5076.m9222(interfaceC5084, interfaceC5079, Long.MAX_VALUE, suspendLambda);
            if (objM92222 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM92222;
            }
        }
        return c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final void m14926(C2788 c2788, int i, InterfaceC7387 interfaceC7387) {
        C2788 c27882;
        C2059 c2059 = new C2059(0, new C2788[16]);
        List listM4229 = c2788.m4229(false, false);
        while (true) {
            c2059.m2605(c2059.f3865, listM4229);
            while (true) {
                int i2 = c2059.f3865;
                if (i2 == 0) {
                    return;
                }
                c27882 = (C2788) c2059.m2613(i2 - 1);
                boolean zM4240 = AbstractC2792.m4240(c27882);
                C2791 c2791 = c27882.f6114;
                if (!zM4240) {
                    if (c2791.f6124.m1312(AbstractC2778.f6097)) {
                        continue;
                    } else {
                        AbstractC2629 abstractC2629M4215 = c27882.m4215();
                        if (abstractC2629M4215 == null) {
                            throw AbstractC0900.m699("Expected semantics node to have a coordinator.");
                        }
                        C8734 c8734M14922 = m14922(AbstractC2505.m3659(abstractC2629M4215, true));
                        if (c8734M14922.f22223 < c8734M14922.f22221 && c8734M14922.f22222 < c8734M14922.f22220) {
                            InterfaceC7383 interfaceC7383 = (InterfaceC7383) AbstractC2792.m4233(c2791, AbstractC2794.f6134);
                            C2793 c2793 = (C2793) AbstractC2792.m4233(c2791, AbstractC2778.f6082);
                            if (interfaceC7383 == null || c2793 == null || ((Number) c2793.f6126.invoke()).floatValue() <= 0.0f) {
                                break;
                            }
                            int i3 = 1 + i;
                            interfaceC7387.invoke(new C2762(c27882, i3, c8734M14922, abstractC2629M4215));
                            m14926(c27882, i3, interfaceC7387);
                        }
                    }
                }
            }
            listM4229 = c27882.m4229(false, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final void m14927(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m14928(C3358 c3358, AbstractC3290 abstractC3290, View view, View view2, AbstractC3352 abstractC3352, boolean z) {
        if (abstractC3352.m5557() == 0 || c3358.m5585() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC3352.m5543(view) - AbstractC3352.m5543(view2)) + 1;
        }
        return Math.min(abstractC3290.mo5406(), abstractC3290.mo5399(view2) - abstractC3290.mo5396(view));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[PHI: r6
  0x005e: PHI (r6v29 int) = (r6v5 int), (r6v18 int), (r6v18 int), (r6v21 int), (r6v28 int), (r6v37 int), (r6v38 int) binds: [B:90:0x0149, B:65:0x00da, B:67:0x00e0, B:54:0x00b8, B:40:0x0083, B:28:0x0058, B:27:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m14929(int i, byte[] bArr, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i;
        if (i6 < 0 || i2 > bArr.length || i6 > i2) {
            C3775.m6966("size=", bArr.length, " beginIndex=", i6, " endIndex=", i2);
            return null;
        }
        char[] cArr = new char[i2 - i6];
        int i7 = 0;
        while (i6 < i2) {
            byte b = bArr[i6];
            if (b >= 0) {
                int i8 = i7 + 1;
                cArr[i7] = (char) b;
                i6++;
                while (i6 < i2) {
                    byte b2 = bArr[i6];
                    if (b2 < 0) {
                        break;
                    }
                    i6++;
                    cArr[i8] = (char) b2;
                    i8++;
                }
                i7 = i8;
            } else {
                if ((b >> 5) == -2) {
                    int i9 = i6 + 1;
                    if (i2 <= i9) {
                        i3 = i7 + 1;
                        cArr[i7] = 65533;
                    } else {
                        byte b3 = bArr[i9];
                        if ((b3 & 192) == 128) {
                            int i10 = (b << 6) ^ (b3 ^ 3968);
                            if (i10 < 128) {
                                i3 = i7 + 1;
                                cArr[i7] = 65533;
                            } else {
                                cArr[i7] = (char) i10;
                                i3 = i7 + 1;
                            }
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = 65533;
                        }
                    }
                } else if ((b >> 4) == -2) {
                    int i11 = i6 + 2;
                    if (i2 <= i11) {
                        i3 = i7 + 1;
                        cArr[i7] = 65533;
                        int i12 = i6 + 1;
                        i5 = (i2 <= i12 || (bArr[i12] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b4 = bArr[i6 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i11];
                            if ((b5 & 192) == 128) {
                                int i13 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i13 < 2048) {
                                    i3 = i7 + 1;
                                    cArr[i7] = 65533;
                                } else if (55296 > i13 || i13 >= 57344) {
                                    cArr[i7] = (char) i13;
                                    i3 = i7 + 1;
                                } else {
                                    i3 = i7 + 1;
                                    cArr[i7] = 65533;
                                }
                                i5 = 3;
                            } else {
                                i3 = i7 + 1;
                                cArr[i7] = 65533;
                            }
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = 65533;
                        }
                    }
                } else if ((b >> 3) == -2) {
                    int i14 = i6 + 3;
                    if (i2 <= i14) {
                        i3 = i7 + 1;
                        cArr[i7] = 65533;
                        int i15 = i6 + 1;
                        if (i2 > i15 && (bArr[i15] & 192) == 128) {
                            int i16 = i6 + 2;
                            if (i2 > i16 && (bArr[i16] & 192) == 128) {
                                i5 = 3;
                            }
                        }
                    } else {
                        byte b6 = bArr[i6 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i6 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i14];
                                if ((b8 & 192) == 128) {
                                    int i17 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i17 > 1114111) {
                                        i3 = i7 + 1;
                                        cArr[i7] = 65533;
                                    } else if ((55296 > i17 || i17 >= 57344) && i17 >= 65536) {
                                        if (i17 != 65533) {
                                            cArr[i7] = (char) ((i17 >>> 10) + 55232);
                                            i4 = i7 + 2;
                                            cArr[i7 + 1] = (char) ((i17 & 1023) + 56320);
                                        } else {
                                            cArr[i7] = 65533;
                                            i4 = i7 + 1;
                                        }
                                        i3 = i4;
                                    } else {
                                        i3 = i7 + 1;
                                        cArr[i7] = 65533;
                                    }
                                    i5 = 4;
                                } else {
                                    i3 = i7 + 1;
                                    cArr[i7] = 65533;
                                    i5 = 3;
                                }
                            } else {
                                i3 = i7 + 1;
                                cArr[i7] = 65533;
                            }
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = 65533;
                        }
                    }
                } else {
                    i3 = i7 + 1;
                    cArr[i7] = 65533;
                    i6++;
                    i7 = i3;
                }
                i6 += i5;
                i7 = i3;
            }
        }
        return AbstractC5971.m10693(0, i7, cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m14930(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C5043.m9173(AbstractC0900.m709(i, i2, "fromIndex: ", ", toIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            C6755.m11869(AbstractC7012.m12150(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m14931(int i, int i2) {
        if (i < 0 || i > i2) {
            C8376.m13331(AbstractC7012.m12150(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m14932(int i, int i2) {
        if (i < 0 || i >= i2) {
            C8376.m13331(AbstractC7012.m12150(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m14933(DxContext dxContext, CfOptions cfOptions, DexOptions dexOptions, DexFile dexFile, InputStream inputStream) throws IOException {
        DxContext dxContext2;
        CfOptions cfOptions2;
        DexOptions dexOptions2;
        DexFile dexFile2;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        int i = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return i;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (!name.endsWith(ClassFileLocator.CLASS_FILE_EXTENSION) || name.startsWith("META-INF/")) {
                        dxContext2 = dxContext;
                        cfOptions2 = cfOptions;
                        dexOptions2 = dexOptions;
                        dexFile2 = dexFile;
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i2 = zipInputStream.read(bArr);
                            if (i2 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i2);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        DirectClassFile directClassFile = new DirectClassFile(byteArray, name, true);
                        directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
                        dxContext2 = dxContext;
                        cfOptions2 = cfOptions;
                        dexOptions2 = dexOptions;
                        dexFile2 = dexFile;
                        dexFile2.add(CfTranslator.translate(dxContext2, directClassFile, byteArray, cfOptions2, dexOptions2, dexFile2));
                        i++;
                    }
                    dxContext = dxContext2;
                    cfOptions = cfOptions2;
                    dexOptions = dexOptions2;
                    dexFile = dexFile2;
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static RelativeLayout m14934(Context context, String str) {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(C0328R.layout.save_voice_layout, (ViewGroup) null, false);
        EditText editText = (EditText) relativeLayout.findViewById(C0328R.id.voice_name);
        editText.setText("");
        editText.addTextChangedListener(new C7133(str));
        ((Button) relativeLayout.findViewById(C0328R.id.yes_save_voice)).setOnClickListener(new ViewOnClickListenerC7005(editText, str, 1));
        ((Button) relativeLayout.findViewById(C0328R.id.save_voice_close)).setOnClickListener(new ViewOnClickListenerC6365(11));
        return relativeLayout;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final JSONObject m14935() {
        String strM14532;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC9234.m14532("喵喵呜喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), AbstractC7017.m12166());
        jSONObject.put(AbstractC9234.m14531(3280), AbstractC7187.f17854);
        jSONObject.put(AbstractC9234.m14531(3281), AbstractC9234.m14532("喵呜喵喵喵喵喵呜~喵呜喵呜呜喵呜呜~喵呜喵喵呜呜喵喵~喵呜喵喵喵呜呜喵~喵呜喵呜喵呜呜喵"));
        String strM14531 = AbstractC9234.m14531(3282);
        try {
            Field field = XposedBridge.class.getField(AbstractC9234.m14532("喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵喵~喵喵呜呜呜呜喵呜"));
            field.setAccessible(true);
            Object obj = field.get(null);
            AbstractC9234.m14531(1559);
            obj.getClass();
            strM14532 = (String) obj;
        } catch (Exception unused) {
            strM14532 = AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜喵呜喵喵喵喵~呜喵喵喵呜呜呜呜~呜呜呜呜呜喵呜喵~呜呜喵喵呜喵喵呜");
        }
        jSONObject.put(strM14531, strM14532);
        jSONObject.put(AbstractC9234.m14531(3283), Build.BRAND);
        jSONObject.put(AbstractC9234.m14531(3284), Build.DISPLAY);
        jSONObject.put(AbstractC9234.m14531(3285), Build.VERSION.RELEASE);
        jSONObject.put(AbstractC9234.m14531(3286), Integer.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put(AbstractC9234.m14531(3287), Build.MODEL);
        return jSONObject;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final boolean m14936(CharSequence charSequence) {
        if (AbstractC4782.m8892(charSequence, "chunked")) {
            return true;
        }
        if (AbstractC4782.m8892(charSequence, "identity")) {
            return false;
        }
        Iterator it = AbstractC5976.m10703(charSequence, new String[]{","}, 6).iterator();
        boolean z = false;
        while (it.hasNext()) {
            String lowerCase = AbstractC5976.m10714((String) it.next()).toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("chunked")) {
                if (z) {
                    C5043.m9163(charSequence, "Double-chunked TE is not supported: ");
                    return false;
                }
                z = true;
            } else if (!lowerCase.equals("identity")) {
                C6755.m11869("Unsupported transfer encoding ".concat(lowerCase));
                return false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static C5906 m14937(InterfaceC5312 interfaceC5312, InterfaceC7372 interfaceC7372) {
        if (interfaceC7372 != null) {
            return new C5906(interfaceC7372, interfaceC5312);
        }
        C6755.m11869("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final boolean m14938(InterfaceC5305 interfaceC5305) {
        interfaceC5305.getClass();
        return interfaceC5305.getGetter() == null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ Object m14939(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return m14940(cls, map, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Object m14940(Class cls, Map map, List list) {
        cls.getClass();
        list.getClass();
        InterfaceC6016 interfaceC6016M10773 = AbstractC6019.m10773(new C2157(map, 12));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C7321(cls, map, AbstractC6019.m10773(new C5860(cls, 17, map)), interfaceC6016M10773, list));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m14941(String str, String str2) {
        String str3 = C7243.f17939 + str2 + AbstractC9234.m14532("喵呜喵呜呜喵呜呜~喵呜喵喵喵呜喵喵~喵呜喵呜喵喵呜呜");
        while (new File(str3).exists()) {
            str3 = C7243.f17939 + str2 + AbstractC9234.m14532("喵呜喵呜呜喵呜呜") + (Integer.parseInt(str3.substring(str3.lastIndexOf(AbstractC9234.m14532("喵呜喵呜呜喵呜呜")) + 1, str3.lastIndexOf(AbstractC9234.m14532("喵呜喵呜呜喵呜喵")))) + 1) + AbstractC9234.m14532("喵呜喵呜呜喵呜喵");
        }
        try {
            AbstractC5894.m10609(str, str3);
            AbstractC7014.m12151(AbstractC9234.m14531(573) + str3);
        } catch (IOException e) {
            C6755.m11872(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final void m14942(int i, int i2, int i3, long j, byte[] bArr) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = AbstractC5961.f15018[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m14943(Context context, String str) {
        AbstractC3888.m7247(context);
        try {
            f24798 = new DialogC7148(context);
            f24798.setContentView(m14934(context, str));
            f24798.show();
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(567);
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final InterfaceC8924 m14944(C8934 c8934) {
        C8934 c89342 = new C8934(2);
        for (String str : ((Map) c8934.f4240).keySet()) {
            List listM2976 = c8934.m2976(str);
            if (listM2976 == null) {
                listM2976 = EmptyList.INSTANCE;
            }
            String strM14136 = AbstractC8940.m14136(0, 0, str, 15);
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM2976, 10));
            Iterator it = listM2976.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8940.m14136(0, 0, (String) it.next(), 11));
            }
            c89342.mo2969(strM14136, arrayList);
        }
        return c89342.build();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m14945(C3358 c3358, AbstractC3290 abstractC3290, View view, View view2, AbstractC3352 abstractC3352, boolean z) {
        if (abstractC3352.m5557() == 0 || c3358.m5585() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c3358.m5585();
        }
        return (int) (((abstractC3290.mo5399(view2) - abstractC3290.mo5396(view)) / (Math.abs(AbstractC3352.m5543(view) - AbstractC3352.m5543(view2)) + 1)) * c3358.m5585());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m14946(C3358 c3358, AbstractC3290 abstractC3290, View view, View view2, AbstractC3352 abstractC3352, boolean z, boolean z2) {
        if (abstractC3352.m5557() == 0 || c3358.m5585() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c3358.m5585() - Math.max(AbstractC3352.m5543(view), AbstractC3352.m5543(view2))) - 1) : Math.max(0, Math.min(AbstractC3352.m5543(view), AbstractC3352.m5543(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC3290.mo5399(view2) - abstractC3290.mo5396(view)) / (Math.abs(AbstractC3352.m5543(view) - AbstractC3352.m5543(view2)) + 1))) + (abstractC3290.mo5405() - abstractC3290.mo5396(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static InMemoryDexClassLoader m14947(ClassLoader classLoader, String str) throws IOException {
        DexOptions dexOptions = new DexOptions();
        CfOptions cfOptions = new CfOptions();
        DxContext dxContext = new DxContext();
        DexFile dexFile = new DexFile(dexOptions);
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            int iM14933 = m14933(dxContext, cfOptions, dexOptions, dexFile, fileInputStream);
            fileInputStream.close();
            if (iM14933 == 0) {
                C6755.m11866(AbstractC0900.m717("No class file found in jar ", str));
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dexFile.writeTo(byteArrayOutputStream, null, true);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArray), classLoader);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C8527 m14948(Context context) {
        ProviderInfo providerInfo;
        C8428 c8428;
        ApplicationInfo applicationInfo;
        int i = 6;
        C7787 c8523 = Build.VERSION.SDK_INT >= 28 ? new C8523(i) : new C7787(i);
        PackageManager packageManager = context.getPackageManager();
        AbstractC7173.m12429(packageManager, "Package manager required to locate emoji font provider");
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
            c8428 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo12822 = c8523.mo12822(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo12822) {
                    arrayList.add(signature.toByteArray());
                }
                c8428 = new C8428(str, str2, "emojicompat-emoji-font", null, null, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c8428 = null;
            }
        }
        if (c8428 == null) {
            return null;
        }
        return new C8527(new C8535(context, c8428));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InMemoryDexClassLoader m14949(ClassLoader classLoader, String str) throws IOException {
        DexOptions dexOptions = new DexOptions();
        CfOptions cfOptions = new CfOptions();
        DxContext dxContext = new DxContext();
        DexFile dexFile = new DexFile(dexOptions);
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        int iM14933 = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (name.equals("classes.jar") || (name.startsWith("libs/") && name.endsWith(".jar"))) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = zipInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        iM14933 += m14933(dxContext, cfOptions, dexOptions, dexFile, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    }
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        zipInputStream.close();
        if (iM14933 == 0) {
            C6755.m11866(AbstractC0900.m717("No class file found in aar ", str));
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            dexFile.writeTo(byteArrayOutputStream2, null, true);
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            byteArrayOutputStream2.close();
            return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArray), classLoader);
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static InMemoryDexClassLoader m14950(String str, byte[] bArr, ClassLoader classLoader) throws IOException {
        DexOptions dexOptions = new DexOptions();
        CfOptions cfOptions = new CfOptions();
        DxContext dxContext = new DxContext();
        String strM696 = AbstractC0900.m696(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), ClassFileLocator.CLASS_FILE_EXTENSION);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DexFile dexFile = new DexFile(dexOptions);
            DirectClassFile directClassFile = new DirectClassFile(bArr, strM696, true);
            directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
            dexFile.add(CfTranslator.translate(dxContext, directClassFile, bArr, cfOptions, dexOptions, dexFile));
            dexFile.writeTo(byteArrayOutputStream, null, true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArray), classLoader);
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ViewPropertyAnimator m14951(View view, int i) {
        switch (this.f24799) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
