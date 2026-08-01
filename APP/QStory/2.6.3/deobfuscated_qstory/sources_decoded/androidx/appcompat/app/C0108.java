package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.appcompat.widget.C0130;
import androidx.appcompat.widget.C0232;
import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.lazy.layout.C0690;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.internal.AbstractC1248;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1252;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.text.font.C1969;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.C2149;
import androidx.emoji2.text.flatbuffer.C2302;
import androidx.window.layout.C2598;
import com.alibaba.fastjson2.AbstractC2905;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C2968;
import com.bumptech.glide.load.engine.C2999;
import com.bumptech.glide.load.engine.C3008;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.load.resource.bitmap.AbstractC3038;
import com.bumptech.glide.load.resource.bitmap.C3033;
import com.bumptech.glide.request.C3048;
import com.google.protobuf.C3531;
import com.typesafe.config.impl.AbstractC3843;
import com.typesafe.config.impl.C3847;
import com.typesafe.config.impl.C3849;
import com.typesafe.config.impl.C3852;
import com.typesafe.config.impl.C3858;
import com.typesafe.config.impl.InterfaceC3845;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.server.application.InterfaceC4057;
import io.ktor.server.request.C4126;
import io.ktor.server.request.C4130;
import io.ktor.server.request.InterfaceC4127;
import io.ktor.server.response.C4133;
import io.ktor.server.response.C4135;
import io.ktor.server.response.InterfaceC4134;
import io.ktor.server.routing.C4156;
import io.ktor.util.C4211;
import io.ktor.utils.io.InterfaceC4252;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4437;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4427;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4439;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4450;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4651;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4851;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import okio.ByteString;
import okio.internal.C5569;
import okio.internal.C5570;
import p004.C6099;
import p004.C6107;
import p004.C6114;
import p004.InterfaceC6100;
import p004.InterfaceC6101;
import p004.InterfaceC6103;
import p007.C6142;
import p048.C6519;
import p052.InterfaceC6543;
import p075.C6961;
import p077.C6971;
import p082.C7030;
import p082.C7034;
import p082.C7035;
import p083.C7041;
import p083.InterfaceC7037;
import p098.C7240;
import p116.InterfaceC7338;
import p136.C7524;
import p136.C7525;
import p161.AbstractC7646;
import p162.AbstractC7653;
import p167.C7693;
import p167.C7697;
import p167.C7699;
import p167.C7700;
import p167.C7705;
import p167.InterfaceC7707;
import p199.C7866;
import p203.C7878;
import p203.C7879;
import p205.InterfaceC7896;
import p222.AbstractC7984;
import p222.AbstractC7989;
import p222.C7985;
import p236.C8097;
import p236.InterfaceC8095;
import p236.InterfaceC8102;
import p236.InterfaceC8112;
import p286.InterfaceC8394;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0108 implements InterfaceC3845, InterfaceC4127, InterfaceC4134, InterfaceC6100, InterfaceC7338 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static C0108 f317;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f318;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f319;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f320;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f321;

    public C0108(int i) {
        this.f321 = i;
        switch (i) {
            case 5:
                this.f319 = new AtomicReference(AbstractC1254.f3642);
                this.f320 = new Object();
                break;
            case 9:
                break;
            case 18:
                String string = UUID.randomUUID().toString();
                string.getClass();
                ByteString.Companion.getClass();
                this.f319 = C6114.m11510(string);
                this.f320 = C6142.f16819;
                this.f318 = new ArrayList();
                break;
            default:
                long[] jArr = AbstractC0290.f1007;
                this.f319 = new C0236();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static C0108 m354(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0108(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m355(Editable editable, KeyEvent keyEvent, boolean z) {
        C7700[] c7700Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c7700Arr = (C7700[]) editable.getSpans(selectionStart, selectionEnd, C7700.class)) != null && c7700Arr.length > 0) {
                for (C7700 c7700 : c7700Arr) {
                    int spanStart = editable.getSpanStart(c7700);
                    int spanEnd = editable.getSpanEnd(c7700);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // io.ktor.server.request.InterfaceC4129
    public C4126 getCookies() {
        return ((InterfaceC4127) this.f318).getCookies();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.reflect.jvm.internal.impl.types.AbstractC4914 m356(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451 r8, p082.C7034 r9, boolean r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f319
            androidx.compose.animation.core.飘花落叶言子哲楪苏世兰 r0 = (androidx.compose.animation.core.C0325) r0
            java.lang.Object r1 = r0.f1095
            飘花落叶言世楪苏哲兰子.飘花落叶言子楪世苏哲兰 r1 = (p083.C7041) r1
            r8.getClass()
            boolean r9 = r9.f18876
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰哲世苏 r2 = r8.f13081
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4439
            r4 = 0
            if (r3 == 0) goto L18
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰苏世哲 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4439) r3
            goto L19
        L18:
            r3 = r4
        L19:
            if (r3 == 0) goto L33
            java.lang.Class r3 = r3.f13069
            java.lang.Class r5 = java.lang.Void.TYPE
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L26
            goto L33
        L26:
            java.lang.String r3 = r3.getName()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(r3)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r3 = r3.getPrimitiveType()
            goto L34
        L33:
            r3 = r4
        L34:
            飘花落叶言世楪苏哲兰子.飘花落叶言子楪世哲苏兰 r5 = new 飘花落叶言世楪苏哲兰子.飘花落叶言子楪世哲苏兰
            r6 = 1
            r5.<init>(r0, r8, r6)
            if (r3 == 0) goto L70
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲苏世 r7 = r1.f18905
            飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲 r7 = r7.mo9061()
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r7 = r7.m12032(r3)
            飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏哲世兰 r8 = new 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏哲世兰
            飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏世兰哲 r10 = r7.getAnnotations()
            r0 = 2
            飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏世兰哲[] r0 = new p046.InterfaceC6481[r0]
            r1 = 0
            r0[r1] = r10
            r0[r6] = r5
            java.util.List r10 = kotlin.collections.AbstractC4347.m8846(r0)
            r8.<init>(r6, r10)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r7 = com.alibaba.fastjson2.AbstractC2905.m6341(r7, r8)
            r7.getClass()
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r7 = (kotlin.reflect.jvm.internal.impl.types.AbstractC4878) r7
            if (r9 == 0) goto L67
            return r7
        L67:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r8 = r7.mo9731(r6)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏世楪哲兰 r7 = kotlin.reflect.jvm.internal.impl.types.AbstractC4893.m9809(r7, r8)
            return r7
        L70:
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r8 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r0 = 6
            飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰 r8 = p316.C8667.m14361(r8, r9, r4, r0)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r7 = r7.m357(r2, r8)
            if (r9 == 0) goto L8f
            if (r10 == 0) goto L82
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L84
        L82:
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L84:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲苏世 r9 = r1.f18905
            飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲 r9 = r9.mo9061()
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r7 = r9.m12038(r8, r7, r5)
            return r7
        L8f:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲苏世 r8 = r1.f18905
            飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲 r8 = r8.mo9061()
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r8 = r8.m12038(r9, r7, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲苏世 r9 = r1.f18905
            飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲 r9 = r9.mo9061()
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r7 = r9.m12038(r10, r7, r5)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r7 = r7.mo9731(r6)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏世楪哲兰 r7 = kotlin.reflect.jvm.internal.impl.types.AbstractC4893.m9809(r8, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0108.m356(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏哲世兰, 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰, boolean):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏世楪哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public AbstractC4882 m357(AbstractC4437 abstractC4437, C7034 c7034) {
        C7041 c7041 = (C7041) ((C0325) this.f319).f1095;
        if (abstractC4437 instanceof C4439) {
            Class cls = ((C4439) abstractC4437).f13069;
            PrimitiveType primitiveType = cls.equals(Void.TYPE) ? null : JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            return primitiveType != null ? c7041.f18905.mo9061().m12027(primitiveType) : c7041.f18905.mo9061().m12028();
        }
        boolean z = false;
        if (!(abstractC4437 instanceof C4450)) {
            if (abstractC4437 instanceof C4451) {
                return m356((C4451) abstractC4437, c7034, false);
            }
            if (abstractC4437 instanceof C4427) {
                AbstractC4437 abstractC4437M8970 = ((C4427) abstractC4437).m8970();
                return abstractC4437M8970 != null ? m357(abstractC4437M8970, c7034) : c7041.f18905.mo9061().m12033();
            }
            if (abstractC4437 == null) {
                return c7041.f18905.mo9061().m12033();
            }
            C4211.m8596(abstractC4437, "Unsupported type: ");
            return null;
        }
        C4450 c4450 = (C4450) abstractC4437;
        Type type = c4450.f13079;
        if (!c7034.f18876 && c7034.f18879 != TypeUsage.SUPERTYPE) {
            z = true;
        }
        boolean zM8986 = c4450.m8986();
        if (!zM8986 && !z) {
            AbstractC4878 abstractC4878M391 = m391(c4450, c7034, null);
            return abstractC4878M391 != null ? abstractC4878M391 : C7240.m12470(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        AbstractC4878 abstractC4878M3912 = m391(c4450, c7034.m12370(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (abstractC4878M3912 == null) {
            return C7240.m12470(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        AbstractC4878 abstractC4878M3913 = m391(c4450, c7034.m12370(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), abstractC4878M3912);
        if (abstractC4878M3913 == null) {
            return C7240.m12470(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        if (!zM8986) {
            return AbstractC4893.m9809(abstractC4878M3912, abstractC4878M3913);
        }
        C7035 c7035 = new C7035(abstractC4878M3912, abstractC4878M3913);
        InterfaceC4851.f14133.m9598(abstractC4878M3912, abstractC4878M3913);
        return c7035;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public void m358(C7878 c7878, int i, int i2, int i3) {
        c7878.getClass();
        int i4 = c7878.f21744;
        int i5 = c7878.f21743;
        c7878.f21744 = 0;
        c7878.f21743 = 0;
        c7878.m13249(i2);
        c7878.m13250(i3);
        if (i4 < 0) {
            c7878.f21744 = 0;
        } else {
            c7878.f21744 = i4;
        }
        if (i5 < 0) {
            c7878.f21743 = 0;
        } else {
            c7878.f21743 = i5;
        }
        C7878 c78782 = (C7878) this.f318;
        c78782.f21689 = i;
        c78782.m13235();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public void m359() {
        try {
            AbstractC5062.m10056(m369(), ((JSONObject) this.f318).toString(), false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public void m360(LayoutDirection layoutDirection) {
        ((C1507) this.f318).f4286.f4289 = layoutDirection;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public void m361(long j) {
        ((C1507) this.f318).f4286.f4287 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public void m362(Object obj) {
        long jM2191 = AbstractC1254.m2191();
        if (jM2191 == AbstractC1248.f3623) {
            this.f318 = obj;
            return;
        }
        synchronized (this.f320) {
            C1252 c1252 = (C1252) ((AtomicReference) this.f319).get();
            int iM2185 = c1252.m2185(jM2191);
            if (iM2185 < 0) {
                ((AtomicReference) this.f319).set(c1252.m2184(obj, jM2191));
            } else {
                c1252.f3638[iM2185] = obj;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public void m363() {
        ((TypedArray) this.f320).recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public void m364(InterfaceC7896 interfaceC7896) {
        ((C1507) this.f318).f4286.f4290 = interfaceC7896;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public void m365(InterfaceC1601 interfaceC1601) {
        ((C1507) this.f318).f4286.f4288 = interfaceC1601;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean m366() throws Throwable {
        switch (this.f321) {
            case 11:
                List list = (List) this.f320;
                ByteBuffer byteBufferM13464 = AbstractC7984.m13464((ByteBuffer) this.f319);
                C2974 c2974 = (C2974) this.f318;
                if (byteBufferM13464 == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((InterfaceC8394) list.get(i)).mo6541(byteBufferM13464, c2974)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 12:
                List list2 = (List) this.f318;
                C3033 c3033 = (C3033) ((C2968) this.f319).f9385;
                c3033.reset();
                C2974 c29742 = (C2974) this.f320;
                c3033.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        if (((InterfaceC8394) list2.get(i2)).mo6540(c3033, c29742)) {
                            return true;
                        }
                    } finally {
                        c3033.reset();
                    }
                }
                return false;
            default:
                List list3 = (List) this.f320;
                C2968 c2968 = (C2968) this.f318;
                C2974 c29743 = (C2974) this.f319;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC8394 interfaceC8394 = (InterfaceC8394) list3.get(i3);
                    C3033 c30332 = null;
                    try {
                        C3033 c30333 = new C3033(new FileInputStream(c2968.m6440().getFileDescriptor()), c29743);
                        try {
                            boolean zMo6540 = interfaceC8394.mo6540(c30333, c29743);
                            c30333.m6548();
                            c2968.m6440();
                            if (zMo6540) {
                                return true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c30332 = c30333;
                            if (c30332 != null) {
                                c30332.m6548();
                            }
                            c2968.m6440();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean m367(CharSequence charSequence, int i, int i2, C7699 c7699) {
        if ((c7699.f20884 & 3) == 0) {
            C7693 c7693 = (C7693) this.f318;
            C2302 c2302M12995 = c7699.m12995();
            int iM4001 = c2302M12995.m4001(8);
            if (iM4001 != 0) {
                ((ByteBuffer) c2302M12995.f6464).getShort(iM4001 + c2302M12995.f6467);
            }
            c7693.getClass();
            ThreadLocal threadLocal = C7693.f20877;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = c7693.f20878.hasGlyph(sb.toString());
            int i3 = c7699.f20884 & 4;
            c7699.f20884 = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (c7699.f20884 & 3) == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long m368() {
        return ((C1507) this.f318).f4286.f4287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public String m369() {
        return AbstractC3933.m8315() + AbstractC8405.m13972(6) + ((String) this.f320) + AbstractC8405.m13973("喵呜喵呜呜呜喵喵") + ((String) this.f319); /* decoded: m13972(6)=/data/plugin/ */ /* decoded-inline: / */
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public LayoutDirection m370() {
        return ((C1507) this.f318).f4286.f4289;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ImageHeaderParser$ImageType m371() throws Throwable {
        switch (this.f321) {
            case 11:
                return AbstractC2905.m6296((List) this.f320, AbstractC7984.m13464((ByteBuffer) this.f319));
            case 12:
                List list = (List) this.f318;
                C3033 c3033 = (C3033) ((C2968) this.f319).f9385;
                c3033.reset();
                return AbstractC2905.m6297(list, c3033, (C2974) this.f320);
            default:
                List list2 = (List) this.f320;
                C2968 c2968 = (C2968) this.f318;
                C2974 c2974 = (C2974) this.f319;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC8394 interfaceC8394 = (InterfaceC8394) list2.get(i);
                    C3033 c30332 = null;
                    try {
                        C3033 c30333 = new C3033(new FileInputStream(c2968.m6440().getFileDescriptor()), c2974);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo6539 = interfaceC8394.mo6539(c30333);
                            c30333.m6548();
                            c2968.m6440();
                            if (imageHeaderParser$ImageTypeMo6539 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo6539;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c30332 = c30333;
                            if (c30332 != null) {
                                c30332.m6548();
                            }
                            c2968.m6440();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void m372(Object obj, String str) {
        ((JSONObject) this.f318).put(str, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public Object m373(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC7707 interfaceC7707) {
        int i4;
        char c;
        C7705 c7705 = new C7705((C7697) ((C0325) this.f320).f1094);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo9044 = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zMo9044) {
                SparseArray sparseArray = c7705.f20899.f20881;
                C7697 c7697 = sparseArray == null ? null : (C7697) sparseArray.get(iCodePointAt);
                if (c7705.f20901 == 2) {
                    if (c7697 != null) {
                        c7705.f20899 = c7697;
                        c7705.f20896++;
                    } else {
                        if (iCodePointAt == 65038) {
                            c7705.m13004();
                        } else if (iCodePointAt != 65039) {
                            C7697 c76972 = c7705.f20899;
                            if (c76972.f20880 != null) {
                                if (c7705.f20896 != 1) {
                                    c7705.f20898 = c76972;
                                    c7705.m13004();
                                } else if (c7705.m13003()) {
                                    c7705.f20898 = c7705.f20899;
                                    c7705.m13004();
                                } else {
                                    c7705.m13004();
                                }
                                c = 3;
                            } else {
                                c7705.m13004();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (c7697 == null) {
                    c7705.m13004();
                    c = 1;
                } else {
                    c7705.f20901 = 2;
                    c7705.f20899 = c7697;
                    c7705.f20896 = 1;
                    c = 2;
                }
                c7705.f20897 = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !m367(charSequence, i4, iCharCount, c7705.f20898.f20880)) {
                        zMo9044 = interfaceC7707.mo9044(charSequence, i4, iCharCount, c7705.f20898.f20880);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (c7705.f20901 == 2 && c7705.f20899.f20880 != null && ((c7705.f20896 > 1 || c7705.m13003()) && i5 < i3 && zMo9044 && (z || !m367(charSequence, i4, iCharCount, c7705.f20899.f20880)))) {
            interfaceC7707.mo9044(charSequence, i4, iCharCount, c7705.f20899.f20880);
        }
        return interfaceC7707.mo9043();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public void m374(Activity activity, C2598 c2598) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f318;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.f320;
        reentrantLock.lock();
        try {
            if (c2598.equals((C2598) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((C7525) ((C5856) this.f319).f16014).f20398.iterator();
            it.getClass();
            while (it.hasNext()) {
                C7524 c7524 = (C7524) it.next();
                if (c7524.f20395.equals(activity)) {
                    c7524.f20392 = c2598;
                    c7524.f20394.execute(new RunnableC0099(c7524, 19, c2598));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean m375(int i, C7866 c7866, C7879 c7879) {
        C2149 c2149 = (C2149) this.f320;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7879.f21695;
        int[] iArr = c7879.f21721;
        c2149.f6348 = constraintWidget$DimensionBehaviourArr[0];
        c2149.f6347 = constraintWidget$DimensionBehaviourArr[1];
        c2149.f6346 = c7879.m13275();
        c2149.f6345 = c7879.m13279();
        c2149.f6351 = false;
        c2149.f6352 = i;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c2149.f6348;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2;
        boolean z2 = c2149.f6347 == constraintWidget$DimensionBehaviour2;
        boolean z3 = z && c7879.f21753 > 0.0f;
        boolean z4 = z2 && c7879.f21753 > 0.0f;
        if (z3 && iArr[0] == 4) {
            c2149.f6348 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            c2149.f6347 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        c7866.m13224(c7879, c2149);
        c7879.m13249(c2149.f6344);
        c7879.m13250(c2149.f6343);
        c7879.f21714 = c2149.f6349;
        c7879.m13260(c2149.f6350);
        c2149.f6352 = 0;
        return c2149.f6351;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean m376() {
        if (((InterfaceC1333) this.f319).getValue() != this.f318) {
            return true;
        }
        C0108 c0108 = (C0108) this.f320;
        return c0108 != null && c0108.m376();
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC8095 mo377() {
        return ((InterfaceC4127) this.f318).mo377();
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC8102 mo378() {
        return ((InterfaceC4127) this.f318).mo378();
    }

    @Override // io.ktor.server.request.InterfaceC4127
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4130 mo379() {
        return (C4130) this.f320;
    }

    @Override // io.ktor.server.request.InterfaceC4129, io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC4057 mo381() {
        switch (this.f321) {
        }
        return (C4156) this.f319;
    }

    @Override // p004.InterfaceC6100
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC6101 mo382() {
        return (C6099) this.f320;
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0076 mo383() {
        return ((InterfaceC4134) this.f318).mo383();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ColorStateList m385(int i) {
        int resourceId;
        ColorStateList colorStateListM12919;
        TypedArray typedArray = (TypedArray) this.f320;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM12919 = AbstractC7653.m12919((Context) this.f319, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM12919;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC1601 m386() {
        return ((C1507) this.f318).f4286.f4288;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable m387(int i) {
        int resourceId;
        Drawable drawableM633;
        if (!((TypedArray) this.f320).hasValue(i) || (resourceId = ((TypedArray) this.f320).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0130 c0130M540 = C0130.m540();
        Context context = (Context) this.f319;
        synchronized (c0130M540) {
            drawableM633 = c0130M540.f572.m633(context, resourceId, true);
        }
        return drawableM633;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Typeface m388(int i, int i2, C0232 c0232) {
        int resourceId = ((TypedArray) this.f320).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f318) == null) {
            this.f318 = new TypedValue();
        }
        Context context = (Context) this.f319;
        TypedValue typedValue = (TypedValue) this.f318;
        ThreadLocal threadLocal = AbstractC7646.f20756;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC7646.m12912(context, resourceId, typedValue, i2, c0232, true, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC7896 m389() {
        return ((C1507) this.f318).f4286.f4290;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Drawable m390(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f320;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC3933.m8312((Context) this.f319, resourceId);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.reflect.jvm.internal.impl.types.AbstractC4878 m391(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4450 r21, p082.C7034 r22, kotlin.reflect.jvm.internal.impl.types.AbstractC4878 r23) {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0108.m391(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏兰哲世, 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰, kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏");
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean mo392() {
        return ((InterfaceC4134) this.f318).mo392();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object m393() {
        long jM2191 = AbstractC1254.m2191();
        if (jM2191 == AbstractC1248.f3623) {
            return this.f318;
        }
        C1252 c1252 = (C1252) ((AtomicReference) this.f319).get();
        int iM2185 = c1252.m2185(jM2191);
        if (iM2185 >= 0) {
            return c1252.f3638[iM2185];
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object m394(String str) {
        try {
            return ((JSONObject) this.f318).get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public Bitmap m395(BitmapFactory.Options options) throws Throwable {
        switch (this.f321) {
            case 11:
                return AbstractC3038.m6578(new C7985(AbstractC7984.m13464((ByteBuffer) this.f319)), options, this);
            case 12:
                C3033 c3033 = (C3033) ((C2968) this.f319).f9385;
                c3033.reset();
                return AbstractC3038.m6578(c3033, options, this);
            default:
                FileDescriptor fileDescriptor = ((C2968) this.f318).m6440().getFileDescriptor();
                int i = Build.VERSION.SDK_INT;
                Bitmap bitmapM6576 = null;
                if (i == 34) {
                    if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC3038.f9673.get()).booleanValue() : false) && AbstractC3038.m6577(this)) {
                        Bitmap.Config config = options.inPreferredConfig;
                        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                        AbstractC7989.m13471("", config == config2);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        try {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            if (bitmapDecodeFileDescriptor == null) {
                                if (bitmapDecodeFileDescriptor != null) {
                                }
                                options.inPreferredConfig = config2;
                                return bitmapM6576;
                            }
                            try {
                                bitmapM6576 = AbstractC3038.m6576(bitmapDecodeFileDescriptor);
                            } catch (Throwable th) {
                                th = th;
                                bitmapM6576 = bitmapDecodeFileDescriptor;
                                if (bitmapM6576 != null) {
                                    bitmapM6576.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                            break;
                            bitmapDecodeFileDescriptor.recycle();
                            options.inPreferredConfig = config2;
                            return bitmapM6576;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC4252 mo396() {
        return ((InterfaceC4127) this.f318).mo396();
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean mo397() {
        return ((InterfaceC4134) this.f318).mo397();
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo398(C8097 c8097) {
        c8097.getClass();
        ((InterfaceC4134) this.f318).mo398(c8097);
    }

    @Override // com.typesafe.config.impl.InterfaceC3845
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public AbstractC3843 mo300(AbstractC3843 abstractC3843, String str) {
        C3858 c3858 = (C3858) this.f319;
        C3849 c3849 = (C3849) this.f318;
        C3847 c3847 = (C3847) this.f320;
        C3858 c38582 = c3847.f12070;
        if (!(c38582 != null)) {
            C3852 c3852M8224 = c3847.m8223(null).m8224(abstractC3843, c3849);
            this.f320 = c3852M8224.f12079.m8223(null).m8223(c3858);
            return c3852M8224.f12078;
        }
        if (str.equals(c38582.f12086)) {
            C3847 c38472 = (C3847) this.f320;
            C3858 c38583 = c38472.f12070.f12085;
            if (c38583 != null) {
                C3852 c3852M82242 = c38472.m8223(c38583).m8224(abstractC3843, c3849);
                this.f320 = c3852M82242.f12079.m8223(null).m8223(c3858);
                return c3852M82242.f12078;
            }
        }
        return abstractC3843;
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8097 mo399() {
        return ((InterfaceC4134) this.f318).mo399();
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC8095 mo400() {
        return ((InterfaceC4127) this.f318).mo400();
    }

    @Override // p004.InterfaceC6100
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public InterfaceC6103 mo401() {
        return (C6107) this.f318;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public void m402(C7878 c7878) {
        ArrayList arrayList = (ArrayList) this.f319;
        arrayList.clear();
        int size = c7878.f21688.size();
        for (int i = 0; i < size; i++) {
            C7879 c7879 = (C7879) c7878.f21688.get(i);
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7879.f21695;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
            if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour2) {
                arrayList.add(c7879);
            }
        }
        c7878.f21690.f6337 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public void m403() {
        C0236 c0236 = (C0236) this.f319;
        String str = (String) this.f320;
        List list = (List) c0236.m758(str);
        if (list != null) {
            list.remove((InterfaceC6543) this.f318);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c0236.m755(str, list);
    }

    @Override // io.ktor.server.response.InterfaceC4134
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4135 mo380() {
        return (C4135) this.f320;
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: getCookies, reason: collision with other method in class */
    public C4133 mo404getCookies() {
        return ((InterfaceC4134) this.f318).mo404getCookies();
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC8112 mo384() {
        return ((InterfaceC4127) this.f318).mo384();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    private final void m352() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    private final void m353() {
    }

    public C0108(String str, String str2) {
        this.f321 = 20;
        this.f319 = str2;
        this.f320 = str;
        try {
            this.f318 = InterfaceC2916.m6374(AbstractC5062.m10028(m369()));
        } catch (Exception unused) {
            this.f318 = new JSONObject();
        }
    }

    public C0108(C4651 c4651, C6971 c6971) {
        this.f321 = 23;
        this.f319 = c4651;
        this.f320 = c6971;
        this.f318 = new ConcurrentHashMap();
    }

    public C0108(int i, int i2) {
        this.f321 = 3;
        this.f319 = AbstractC1367.m2477(i);
        this.f320 = AbstractC1367.m2477(i2);
        this.f318 = new C0690(i, 90, 200);
    }

    public C0108(C0325 c0325) {
        this.f321 = 19;
        this.f319 = c0325;
        C5569 c5569 = (C5569) c0325.f1094;
        c5569.getClass();
        this.f320 = new C6099(c5569);
        C5570 c5570 = (C5570) c0325.f1093;
        c5570.getClass();
        this.f318 = new C6107(c5570);
    }

    public C0108(C6519 c6519, Method[] methodArr, Method method) {
        this.f321 = 21;
        c6519.getClass();
        this.f319 = c6519;
        this.f320 = methodArr;
        this.f318 = method;
    }

    public C0108(C0325 c0325, InterfaceC7037 interfaceC7037) {
        this.f321 = 25;
        interfaceC7037.getClass();
        this.f319 = c0325;
        this.f320 = interfaceC7037;
        this.f318 = new C4871(new C7030());
    }

    public C0108(C4156 c4156, C4130 c4130, InterfaceC4127 interfaceC4127) {
        this.f321 = 15;
        c4130.getClass();
        interfaceC4127.getClass();
        this.f319 = c4156;
        this.f320 = c4130;
        this.f318 = interfaceC4127;
    }

    public C0108(C4156 c4156, C4135 c4135, InterfaceC4134 interfaceC4134) {
        this.f321 = 16;
        c4135.getClass();
        interfaceC4134.getClass();
        this.f319 = c4156;
        this.f320 = c4135;
        this.f318 = interfaceC4134;
    }

    public C0108(InterfaceC4496 interfaceC4496, List list, C0108 c0108) {
        this.f321 = 17;
        interfaceC4496.getClass();
        list.getClass();
        this.f319 = interfaceC4496;
        this.f320 = list;
        this.f318 = c0108;
    }

    public C0108(C1507 c1507) {
        this.f321 = 6;
        this.f318 = c1507;
        this.f319 = new C0113(this, 21);
    }

    public C0108(Context context, TypedArray typedArray) {
        this.f321 = 1;
        this.f319 = context;
        this.f320 = typedArray;
    }

    public C0108(Context context, LocationManager locationManager) {
        this.f321 = 0;
        this.f318 = new C0109();
        this.f319 = context;
        this.f320 = locationManager;
    }

    public C0108(C7878 c7878) {
        this.f321 = 7;
        this.f319 = new ArrayList();
        this.f320 = new C2149();
        this.f318 = c7878;
    }

    public C0108(C0325 c0325, C6961 c6961, C7693 c7693, Set set) {
        this.f321 = 28;
        this.f319 = c6961;
        this.f320 = c0325;
        this.f318 = c7693;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m373(str, 0, str.length(), 1, true, new C4485(str, 4));
        }
    }

    public C0108(List list, EmptySet emptySet, EmptyList emptyList, EmptySet emptySet2) {
        this.f321 = 24;
        emptySet.getClass();
        emptyList.getClass();
        emptySet2.getClass();
        this.f319 = list;
        this.f320 = emptySet;
        this.f318 = emptyList;
    }

    public C0108(C1969 c1969, C0108 c0108) {
        this.f321 = 29;
        this.f319 = c1969;
        this.f320 = c0108;
        this.f318 = c1969.f5852;
    }

    public C0108(C3531 c3531, ArrayList arrayList, C2974 c2974) {
        this.f321 = 12;
        AbstractC7989.m13469(c2974, "Argument must not be null");
        this.f320 = c2974;
        AbstractC7989.m13469(arrayList, "Argument must not be null");
        this.f318 = arrayList;
        this.f319 = new C2968(c3531, c2974);
    }

    public C0108(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C2974 c2974) {
        this.f321 = 13;
        AbstractC7989.m13469(c2974, "Argument must not be null");
        this.f319 = c2974;
        AbstractC7989.m13469(arrayList, "Argument must not be null");
        this.f320 = arrayList;
        this.f318 = new C2968(parcelFileDescriptor);
    }

    public /* synthetic */ C0108(Object obj, Object obj2, Object obj3, int i) {
        this.f321 = i;
        this.f319 = obj;
        this.f320 = obj2;
        this.f318 = obj3;
    }

    public C0108(C3847 c3847, C3849 c3849) {
        this.f321 = 14;
        this.f320 = c3847;
        this.f318 = c3849;
        this.f319 = c3847.f12070;
    }

    public C0108(C5856 c5856) {
        this.f321 = 27;
        this.f319 = c5856;
        this.f320 = new ReentrantLock();
        this.f318 = new WeakHashMap();
    }

    public C0108(C3008 c3008, C3048 c3048, C2999 c2999) {
        this.f321 = 10;
        this.f318 = c3008;
        this.f320 = c3048;
        this.f319 = c2999;
    }
}
