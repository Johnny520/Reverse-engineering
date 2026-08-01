package p316;

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
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.RunnableC0099;
import androidx.compose.foundation.lazy.C0753;
import androidx.compose.runtime.C1322;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.scrollcapture.C1927;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1956;
import androidx.compose.ui.semantics.C1958;
import androidx.recyclerview.widget.AbstractC2457;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.C2525;
import com.alibaba.fastjson2.JSONObject;
import com.android.dx.cf.direct.DirectClassFile;
import com.android.dx.cf.direct.StdAttributeFactory;
import com.android.dx.command.dexer.DxContext;
import com.android.dx.dex.DexOptions;
import com.android.dx.dex.cf.CfOptions;
import com.android.dx.dex.cf.CfTranslator;
import com.android.dx.dex.file.DexFile;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import dalvik.system.InMemoryDexClassLoader;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.http.cio.AbstractC3957;
import io.ktor.http.cio.C3971;
import io.ktor.http.cio.internals.AbstractC3950;
import io.ktor.util.C4211;
import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.AbstractC4246;
import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
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
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.C5074;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4577;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.text.AbstractC5129;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import p009.ViewOnClickListenerC6176;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p022.C6300;
import p022.C6304;
import p028.DialogC6319;
import p034.AbstractC6344;
import p036.AbstractC6358;
import p039.C6414;
import p047.C6492;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p075.C6958;
import p082.C7034;
import p112.C7328;
import p144.C7547;
import p153.C7599;
import p167.C7694;
import p167.C7698;
import p167.C7706;
import p175.AbstractC7739;
import p205.C7905;
import p236.AbstractC8111;
import p236.C8098;
import p236.C8105;
import p236.InterfaceC8095;
import p287.AbstractC8405;
import p316.C8667;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8667 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static DialogC6319 f24453;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24454;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static C7034 m14361(TypeUsage typeUsage, boolean z, C4577 c4577, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            c4577 = null;
        }
        typeUsage.getClass();
        return new C7034(typeUsage, z3, z2, c4577 != null ? AbstractC7739.m13055(c4577) : null, 34);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m14362(String str, String str2) {
        if (!new File(str).exists()) {
            AbstractC6185.m11592(AbstractC8405.m13972(568));
            return;
        }
        if (str2.trim().equals("")) {
            str2 = new SimpleDateFormat(AbstractC8405.m13972(569)).format(new Date());
        } else if (new File(AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵喵呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵喵呜")), str2).exists()) {
            m14364(str, str2);
            return;
        }
        new Thread(new RunnableC0099(str, 11, str2)).start();
        f24453.dismiss();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C7905 m14363(C7328 c7328) {
        return new C7905(Math.round(c7328.f19540), Math.round(c7328.f19539), Math.round(c7328.f19538), Math.round(c7328.f19537));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m14364(final String str, final String str2) {
        Activity activityM6653 = AbstractC3055.m6653();
        final DialogC6319 dialogC6319 = new DialogC6319(activityM6653);
        final int i = 0;
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(activityM6653).inflate(R.layout.save_voice_layout, (ViewGroup) null, false);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.save_voice_title);
        textView.setText(AbstractC8405.m13972(570) + str2);
        textView.setTextColor(activityM6653.getColor(R.color.____res_0x2406048a));
        EditText editText = (EditText) relativeLayout.findViewById(R.id.voice_name);
        editText.setText(str2);
        Button button = (Button) relativeLayout.findViewById(R.id.yes_save_voice);
        button.setText(AbstractC8405.m13972(571));
        button.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏兰世哲
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                DialogC6319 dialogC63192 = dialogC6319;
                String str3 = str2;
                String str4 = str;
                switch (i2) {
                    case 0:
                        try {
                            AbstractC5062.m10050(str4, C6414.f17594 + str3);
                            dialogC63192.dismiss();
                            AbstractC6185.m11592(AbstractC8405.m13972(574));
                        } catch (IOException e) {
                            C5925.m11313(e);
                            return;
                        }
                        break;
                    default:
                        C8667.m14382(str4, str3);
                        dialogC63192.dismiss();
                        break;
                }
            }
        });
        Button button2 = (Button) relativeLayout.findViewById(R.id.save_voice_close);
        button2.setText(AbstractC8405.m13972(572));
        final int i2 = 1;
        button2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏兰世哲
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                DialogC6319 dialogC63192 = dialogC6319;
                String str3 = str2;
                String str4 = str;
                switch (i22) {
                    case 0:
                        try {
                            AbstractC5062.m10050(str4, C6414.f17594 + str3);
                            dialogC63192.dismiss();
                            AbstractC6185.m11592(AbstractC8405.m13972(574));
                        } catch (IOException e) {
                            C5925.m11313(e);
                            return;
                        }
                        break;
                    default:
                        C8667.m14382(str4, str3);
                        dialogC63192.dismiss();
                        break;
                }
            }
        });
        editText.addTextChangedListener(new C6300(editText, str, dialogC6319, button, button2));
        dialogC6319.setContentView(relativeLayout);
        dialogC6319.show();
        f24453.dismiss();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static InterfaceC4360 m14365(InterfaceC4360 interfaceC4360, InterfaceC4360 interfaceC43602) {
        interfaceC43602.getClass();
        return interfaceC43602 == EmptyCoroutineContext.INSTANCE ? interfaceC4360 : (InterfaceC4360) interfaceC43602.fold(interfaceC4360, new C0753(16));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final Object m14366(C8098 c8098, long j, CharSequence charSequence, C3971 c3971, InterfaceC4252 interfaceC4252, InterfaceC4247 interfaceC4247, SuspendLambda suspendLambda) {
        C5176 c5176 = C5176.f14739;
        if (charSequence != null && m14377(charSequence)) {
            Object objM8344 = AbstractC3957.m8344(interfaceC4252, interfaceC4247, suspendLambda);
            if (objM8344 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM8344;
            }
        } else if (j != -1) {
            Object objM8663 = AbstractC4244.m8663(interfaceC4252, interfaceC4247, j, suspendLambda);
            if (objM8663 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM8663;
            }
        } else {
            if ((c3971 == null || !c3971.f12215) && !(c3971 == null && AbstractC4395.m8907(c8098, C8098.f22360))) {
                AbstractC4246.m8692(interfaceC4247, new IllegalStateException("Failed to parse request body: request body length should be specified,\nchunked transfer encoding should be used or\nkeep-alive should be disabled (connection: close)"));
                return c5176;
            }
            Object objM86632 = AbstractC4244.m8663(interfaceC4252, interfaceC4247, Long.MAX_VALUE, suspendLambda);
            if (objM86632 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM86632;
            }
        }
        return c5176;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final void m14367(C1953 c1953, int i, InterfaceC6558 interfaceC6558) {
        C1953 c19532;
        C1224 c1224 = new C1224(0, new C1953[16]);
        List listM3669 = c1953.m3669(false, false);
        while (true) {
            c1224.m2045(c1224.f3520, listM3669);
            while (true) {
                int i2 = c1224.f3520;
                if (i2 == 0) {
                    return;
                }
                c19532 = (C1953) c1224.m2053(i2 - 1);
                boolean zM3680 = AbstractC1957.m3680(c19532);
                C1956 c1956 = c19532.f5769;
                if (!zM3680) {
                    if (c1956.f5779.m752(AbstractC1943.f5752)) {
                        continue;
                    } else {
                        AbstractC1794 abstractC1794M3655 = c19532.m3655();
                        if (abstractC1794M3655 == null) {
                            throw AbstractC0053.m139("Expected semantics node to have a coordinator.");
                        }
                        C7905 c7905M14363 = m14363(AbstractC1670.m3099(abstractC1794M3655, true));
                        if (c7905M14363.f21878 < c7905M14363.f21876 && c7905M14363.f21877 < c7905M14363.f21875) {
                            InterfaceC6554 interfaceC6554 = (InterfaceC6554) AbstractC1957.m3673(c1956, AbstractC1959.f5789);
                            C1958 c1958 = (C1958) AbstractC1957.m3673(c1956, AbstractC1943.f5737);
                            if (interfaceC6554 == null || c1958 == null || ((Number) c1958.f5781.invoke()).floatValue() <= 0.0f) {
                                break;
                            }
                            int i3 = 1 + i;
                            interfaceC6558.invoke(new C1927(c19532, i3, c7905M14363, abstractC1794M3655));
                            m14367(c19532, i3, interfaceC6558);
                        }
                    }
                }
            }
            listM3669 = c19532.m3669(false, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final void m14368(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m14369(C2525 c2525, AbstractC2457 abstractC2457, View view, View view2, AbstractC2519 abstractC2519, boolean z) {
        if (abstractC2519.m4997() == 0 || c2525.m5025() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC2519.m4983(view) - AbstractC2519.m4983(view2)) + 1;
        }
        return Math.min(abstractC2457.mo4846(), abstractC2457.mo4839(view2) - abstractC2457.mo4836(view));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[PHI: r6
  0x005e: PHI (r6v29 int) = (r6v5 int), (r6v18 int), (r6v18 int), (r6v21 int), (r6v28 int), (r6v37 int), (r6v38 int) binds: [B:90:0x0149, B:65:0x00da, B:67:0x00e0, B:54:0x00b8, B:40:0x0083, B:28:0x0058, B:27:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m14370(int r16, byte[] r17, int r18) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p316.C8667.m14370(int, byte[], int):java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m14371(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C4211.m8614(AbstractC0053.m149(i, i2, "fromIndex: ", ", toIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            C5925.m11310(AbstractC6183.m11591(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m14372(int i, int i2) {
        if (i < 0 || i > i2) {
            C7547.m12772(AbstractC6183.m11591(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m14373(int i, int i2) {
        if (i < 0 || i >= i2) {
            C7547.m12772(AbstractC6183.m11591(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m14374(DxContext dxContext, CfOptions cfOptions, DexOptions dexOptions, DexFile dexFile, InputStream inputStream) throws IOException {
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
    public static RelativeLayout m14375(Context context, String str) {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.save_voice_layout, (ViewGroup) null, false);
        EditText editText = (EditText) relativeLayout.findViewById(R.id.voice_name);
        editText.setText("");
        editText.addTextChangedListener(new C6304(str));
        ((Button) relativeLayout.findViewById(R.id.yes_save_voice)).setOnClickListener(new ViewOnClickListenerC6176(editText, str, 1));
        ((Button) relativeLayout.findViewById(R.id.save_voice_close)).setOnClickListener(new ViewOnClickListenerC5533(11));
        return relativeLayout;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final JSONObject m14376() {
        String strM13973;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC8405.m13973("喵喵呜喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), AbstractC6188.m11607());
        jSONObject.put(AbstractC8405.m13972(3280), AbstractC6358.f17509);
        jSONObject.put(AbstractC8405.m13972(3281), AbstractC8405.m13973("喵呜喵喵喵喵喵呜~喵呜喵呜呜喵呜呜~喵呜喵喵呜呜喵喵~喵呜喵喵喵呜呜喵~喵呜喵呜喵呜呜喵"));
        String strM13972 = AbstractC8405.m13972(3282);
        try {
            Field field = XposedBridge.class.getField(AbstractC8405.m13973("喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵喵~喵喵呜呜呜呜喵呜"));
            field.setAccessible(true);
            Object obj = field.get(null);
            AbstractC8405.m13972(1559);
            obj.getClass();
            strM13973 = (String) obj;
        } catch (Exception unused) {
            strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜喵呜喵喵喵喵~呜喵喵喵呜呜呜呜~呜呜呜呜呜喵呜喵~呜呜喵喵呜喵喵呜");
        }
        jSONObject.put(strM13972, strM13973);
        jSONObject.put(AbstractC8405.m13972(3283), Build.BRAND);
        jSONObject.put(AbstractC8405.m13972(3284), Build.DISPLAY);
        jSONObject.put(AbstractC8405.m13972(3285), Build.VERSION.RELEASE);
        jSONObject.put(AbstractC8405.m13972(3286), Integer.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put(AbstractC8405.m13972(3287), Build.MODEL);
        return jSONObject;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final boolean m14377(CharSequence charSequence) {
        if (AbstractC3950.m8333(charSequence, "chunked")) {
            return true;
        }
        if (AbstractC3950.m8333(charSequence, "identity")) {
            return false;
        }
        Iterator it = AbstractC5144.m10144(charSequence, new String[]{","}, 6).iterator();
        boolean z = false;
        while (it.hasNext()) {
            String lowerCase = AbstractC5144.m10155((String) it.next()).toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("chunked")) {
                if (z) {
                    C4211.m8604(charSequence, "Double-chunked TE is not supported: ");
                    return false;
                }
                z = true;
            } else if (!lowerCase.equals("identity")) {
                C5925.m11310("Unsupported transfer encoding ".concat(lowerCase));
                return false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static C5074 m14378(InterfaceC4480 interfaceC4480, InterfaceC6543 interfaceC6543) {
        if (interfaceC6543 != null) {
            return new C5074(interfaceC6543, interfaceC4480);
        }
        C5925.m11310("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final boolean m14379(InterfaceC4473 interfaceC4473) {
        interfaceC4473.getClass();
        return interfaceC4473.getGetter() == null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ Object m14380(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return m14381(cls, map, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Object m14381(Class cls, Map map, List list) {
        cls.getClass();
        list.getClass();
        InterfaceC5184 interfaceC5184M10214 = AbstractC5187.m10214(new C1322(map, 12));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C6492(cls, map, AbstractC5187.m10214(new C5028(cls, 17, map)), interfaceC5184M10214, list));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m14382(String str, String str2) {
        String str3 = C6414.f17594 + str2 + AbstractC8405.m13973("喵呜喵呜呜喵呜呜~喵呜喵喵喵呜喵喵~喵呜喵呜喵喵呜呜");
        while (new File(str3).exists()) {
            str3 = C6414.f17594 + str2 + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + (Integer.parseInt(str3.substring(str3.lastIndexOf(AbstractC8405.m13973("喵呜喵呜呜喵呜呜")) + 1, str3.lastIndexOf(AbstractC8405.m13973("喵呜喵呜呜喵呜喵")))) + 1) + AbstractC8405.m13973("喵呜喵呜呜喵呜喵");
        }
        try {
            AbstractC5062.m10050(str, str3);
            AbstractC6185.m11592(AbstractC8405.m13972(573) + str3);
        } catch (IOException e) {
            C5925.m11313(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final void m14383(int i, int i2, int i3, long j, byte[] bArr) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = AbstractC5129.f14673[(int) ((j >> (i4 << 3)) & 255)];
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
    public static void m14384(Context context, String str) {
        AbstractC3056.m6687(context);
        try {
            f24453 = new DialogC6319(context);
            f24453.setContentView(m14375(context, str));
            f24453.show();
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(567);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final InterfaceC8095 m14385(C8105 c8105) {
        C8105 c81052 = new C8105(2);
        for (String str : ((Map) c8105.f3895).keySet()) {
            List listM2416 = c8105.m2416(str);
            if (listM2416 == null) {
                listM2416 = EmptyList.INSTANCE;
            }
            String strM13577 = AbstractC8111.m13577(0, 0, str, 15);
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM2416, 10));
            Iterator it = listM2416.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8111.m13577(0, 0, (String) it.next(), 11));
            }
            c81052.mo2409(strM13577, arrayList);
        }
        return c81052.build();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m14386(C2525 c2525, AbstractC2457 abstractC2457, View view, View view2, AbstractC2519 abstractC2519, boolean z) {
        if (abstractC2519.m4997() == 0 || c2525.m5025() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c2525.m5025();
        }
        return (int) (((abstractC2457.mo4839(view2) - abstractC2457.mo4836(view)) / (Math.abs(AbstractC2519.m4983(view) - AbstractC2519.m4983(view2)) + 1)) * c2525.m5025());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m14387(C2525 c2525, AbstractC2457 abstractC2457, View view, View view2, AbstractC2519 abstractC2519, boolean z, boolean z2) {
        if (abstractC2519.m4997() == 0 || c2525.m5025() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c2525.m5025() - Math.max(AbstractC2519.m4983(view), AbstractC2519.m4983(view2))) - 1) : Math.max(0, Math.min(AbstractC2519.m4983(view), AbstractC2519.m4983(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC2457.mo4839(view2) - abstractC2457.mo4836(view)) / (Math.abs(AbstractC2519.m4983(view) - AbstractC2519.m4983(view2)) + 1))) + (abstractC2457.mo4845() - abstractC2457.mo4836(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static InMemoryDexClassLoader m14388(ClassLoader classLoader, String str) throws IOException {
        DexOptions dexOptions = new DexOptions();
        CfOptions cfOptions = new CfOptions();
        DxContext dxContext = new DxContext();
        DexFile dexFile = new DexFile(dexOptions);
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            int iM14374 = m14374(dxContext, cfOptions, dexOptions, dexFile, fileInputStream);
            fileInputStream.close();
            if (iM14374 == 0) {
                C5925.m11307(AbstractC0053.m157("No class file found in jar ", str));
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
    public static C7698 m14389(Context context) {
        ProviderInfo providerInfo;
        C7599 c7599;
        ApplicationInfo applicationInfo;
        int i = 6;
        C6958 c7694 = Build.VERSION.SDK_INT >= 28 ? new C7694(i) : new C6958(i);
        PackageManager packageManager = context.getPackageManager();
        AbstractC6344.m11870(packageManager, "Package manager required to locate emoji font provider");
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
            c7599 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo12263 = c7694.mo12263(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo12263) {
                    arrayList.add(signature.toByteArray());
                }
                c7599 = new C7599(str, str2, "emojicompat-emoji-font", null, null, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c7599 = null;
            }
        }
        if (c7599 == null) {
            return null;
        }
        return new C7698(new C7706(context, c7599));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InMemoryDexClassLoader m14390(ClassLoader classLoader, String str) throws IOException {
        DexOptions dexOptions = new DexOptions();
        CfOptions cfOptions = new CfOptions();
        DxContext dxContext = new DxContext();
        DexFile dexFile = new DexFile(dexOptions);
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        int iM14374 = 0;
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
                        iM14374 += m14374(dxContext, cfOptions, dexOptions, dexFile, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
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
        if (iM14374 == 0) {
            C5925.m11307(AbstractC0053.m157("No class file found in aar ", str));
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
    public static InMemoryDexClassLoader m14391(String str, byte[] bArr, ClassLoader classLoader) throws IOException {
        DexOptions dexOptions = new DexOptions();
        CfOptions cfOptions = new CfOptions();
        DxContext dxContext = new DxContext();
        String strM136 = AbstractC0053.m136(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), ClassFileLocator.CLASS_FILE_EXTENSION);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DexFile dexFile = new DexFile(dexOptions);
            DirectClassFile directClassFile = new DirectClassFile(bArr, strM136, true);
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
    public final ViewPropertyAnimator m14392(View view, int i) {
        switch (this.f24454) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
