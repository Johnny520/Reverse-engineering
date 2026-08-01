package p180;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.RunnableC0946;
import androidx.collection.C1115;
import androidx.collection.C1130;
import androidx.core.view.AbstractC3076;
import androidx.viewpager2.widget.RunnableC3381;
import com.kongzue.dialogx.interfaces.RunnableC4574;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p069.AbstractC7390;
import p169.AbstractC8432;
import p169.C8425;
import p169.C8426;
import p169.C8428;
import p169.CallableC8427;
import p169.RunnableC8434;
import p177.AbstractC8471;
import p177.C8468;
import p177.C8474;
import p177.InterfaceC8469;
import p267.AbstractC9004;
import retrofit2.ExecutorC6612;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Paint f21146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1115 f21147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC7390 f21148;

    static {
        AbstractC9004.m14210("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f21148 = new C8499();
        } else if (i >= 29) {
            f21148 = new C8497();
        } else if (i >= 28) {
            f21148 = new C8498();
        } else {
            f21148 = new C8491();
        }
        f21147 = new C1115(16);
        f21146 = null;
        Trace.endSection();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Font m13491(Typeface typeface) {
        if (f21146 == null) {
            f21146 = new Paint();
        }
        f21146.setTextSize(10.0f);
        f21146.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f21146);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Typeface m13492(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m13493(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + SignatureVisitor.SUPER + str + SignatureVisitor.SUPER + i2 + SignatureVisitor.SUPER + i + SignatureVisitor.SUPER + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r7 = r12.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m13494(Context context, InterfaceC8469 interfaceC8469, Resources resources, int i, String str, int i2, int i3, AbstractC8471 abstractC8471, boolean z) {
        Typeface typefaceMo12632;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 21;
        int i5 = -3;
        if (interfaceC8469 instanceof C8474) {
            C8474 c8474 = (C8474) interfaceC8469;
            String str2 = c8474.f21095;
            typefaceMo12632 = null;
            int i6 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = m13492(str2)) == null) {
                ArrayList arrayList = c8474.f21098;
                if (arrayList.size() == 1) {
                    typefaceBuild = m13492(((C8428) arrayList.get(0)).f20947);
                } else if (Build.VERSION.SDK_INT < 31) {
                    typefaceBuild = null;
                } else {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            Typeface.CustomFallbackBuilder customFallbackBuilderM13511 = null;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= arrayList.size()) {
                                    break;
                                }
                                C8428 c8428 = (C8428) arrayList.get(i8);
                                if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(c8428.f20946)) {
                                    customFallbackBuilderM13511.setSystemFallback(c8428.f20947);
                                    break;
                                }
                                String str3 = c8428.f20947;
                                String str4 = c8428.f20946;
                                Font fontM13491 = m13491(m13492(str3));
                                if (fontM13491 == null) {
                                    Log.w("TypefaceCompat", "Unable identify the primary font for " + c8428.f20947 + ". Falling back to provider font.");
                                    break;
                                }
                                if (TextUtils.isEmpty(str4)) {
                                    fontFamilyBuild = AbstractC8495.m13504(fontM13491).build();
                                } else {
                                    try {
                                        AbstractC8495.m13528();
                                        AbstractC8495.m13503();
                                        fontFamilyBuild = AbstractC8495.m13527(AbstractC3076.m4750(fontM13491).setFontVariationSettings(str4).build()).build();
                                    } catch (IOException unused) {
                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                    }
                                }
                                if (customFallbackBuilderM13511 == null) {
                                    customFallbackBuilderM13511 = AbstractC8495.m13511(fontFamilyBuild);
                                } else {
                                    customFallbackBuilderM13511.addCustomFallback(fontFamilyBuild);
                                }
                                i8++;
                            }
                        } else {
                            if (m13492(((C8428) arrayList.get(i7)).f20947) == null) {
                                break;
                            }
                            i7++;
                        }
                    }
                    typefaceBuild = null;
                }
            }
            if (typefaceBuild != null) {
                if (abstractC8471 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0946(abstractC8471, i4, typefaceBuild));
                }
                f21147.m1391(m13493(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr4 = !z ? abstractC8471 != null : c8474.f21096 != 0;
            int i9 = z ? c8474.f21097 : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C6686 c6686 = new C6686(16, z2);
            c6686.f16359 = abstractC8471;
            ArrayList arrayList2 = c8474.f21098;
            ExecutorC6612 executorC6612 = new ExecutorC6612(handler);
            C5703 c5703 = new C5703(c6686, 17, executorC6612);
            int i10 = 10;
            if (objArr4 != true) {
                String strM13388 = AbstractC8432.m13388(i3, arrayList2);
                Typeface typeface = (Typeface) AbstractC8432.f20967.m1392(strM13388);
                if (typeface != null) {
                    executorC6612.execute(new RunnableC4574(i10, c6686, typeface, objArr2 == true ? 1 : 0));
                    typefaceMo12632 = typeface;
                } else {
                    C8426 c8426 = new C8426(c5703, objArr == true ? 1 : 0);
                    synchronized (AbstractC8432.f20965) {
                        try {
                            C1130 c1130 = AbstractC8432.f20964;
                            ArrayList arrayList3 = (ArrayList) c1130.get(strM13388);
                            if (arrayList3 != null) {
                                arrayList3.add(c8426);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c8426);
                                c1130.put(strM13388, arrayList4);
                                CallableC8427 callableC8427 = new CallableC8427(strM13388, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC8432.f20966;
                                C8426 c84262 = new C8426(strM13388, i6);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC8434 runnableC8434 = new RunnableC8434();
                                runnableC8434.f20971 = callableC8427;
                                runnableC8434.f20969 = c84262;
                                runnableC8434.f20970 = handler2;
                                threadPoolExecutor.execute(runnableC8434);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    C6755.m11869("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                C8428 c84282 = (C8428) arrayList2.get(0);
                C1115 c1115 = AbstractC8432.f20967;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{c84282}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strM133882 = AbstractC8432.m13388(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) AbstractC8432.f20967.m1392(strM133882);
                if (typeface2 != null) {
                    executorC6612.execute(new RunnableC4574(i10, c6686, typeface2, objArr3 == true ? 1 : 0));
                    typefaceMo12632 = typeface2;
                } else if (i9 == -1) {
                    Object[] objArr5 = {c84282};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr5[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    C8425 c8425M13387 = AbstractC8432.m13387(strM133882, context, Collections.unmodifiableList(arrayList6), i3);
                    c5703.m10310(c8425M13387);
                    typefaceMo12632 = c8425M13387.f20938;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    C8425 c8425 = (C8425) AbstractC8432.f20966.submit(new CallableC8427(strM133882, context, c84282, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    c5703.m10310(c8425);
                                    typefaceMo12632 = c8425.f20938;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused3) {
                        ((ExecutorC6612) c5703.f14510).execute(new RunnableC3381((C6686) c5703.f14509, i5, 2));
                    }
                }
            }
        } else {
            typefaceMo12632 = f21148.mo12632(context, (C8468) interfaceC8469, resources, i3);
            if (abstractC8471 != null) {
                if (typefaceMo12632 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0946(abstractC8471, i4, typefaceMo12632));
                } else {
                    abstractC8471.m13467(-3);
                }
            }
        }
        if (typefaceMo12632 != null) {
            f21147.m1391(m13493(resources, i, str, i2, i3), typefaceMo12632);
        }
        return typefaceMo12632;
    }
}
