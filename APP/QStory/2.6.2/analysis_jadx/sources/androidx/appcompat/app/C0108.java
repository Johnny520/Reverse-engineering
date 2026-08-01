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
import androidx.compose.foundation.draganddrop.AbstractC0455;
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
import androidx.window.layout.C2597;
import com.alibaba.fastjson2.AbstractC2904;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C2967;
import com.bumptech.glide.load.engine.C2998;
import com.bumptech.glide.load.engine.C3007;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import com.bumptech.glide.load.resource.bitmap.AbstractC3037;
import com.bumptech.glide.load.resource.bitmap.C3032;
import com.bumptech.glide.request.C3047;
import com.google.protobuf.C3530;
import com.typesafe.config.impl.AbstractC3842;
import com.typesafe.config.impl.C3846;
import com.typesafe.config.impl.C3848;
import com.typesafe.config.impl.C3851;
import com.typesafe.config.impl.C3857;
import com.typesafe.config.impl.InterfaceC3844;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.server.application.InterfaceC4056;
import io.ktor.server.request.C4125;
import io.ktor.server.request.C4129;
import io.ktor.server.request.InterfaceC4126;
import io.ktor.server.response.C4132;
import io.ktor.server.response.C4134;
import io.ktor.server.response.InterfaceC4133;
import io.ktor.server.routing.C4155;
import io.ktor.util.C4210;
import io.ktor.utils.io.InterfaceC4251;
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
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4436;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4426;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4438;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4449;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4450;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4650;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4850;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import okio.ByteString;
import okio.internal.C5568;
import okio.internal.C5569;
import p005.C6108;
import p005.C6116;
import p005.C6123;
import p005.InterfaceC6109;
import p005.InterfaceC6110;
import p005.InterfaceC6112;
import p007.AbstractC6136;
import p015.C6215;
import p048.C6518;
import p052.InterfaceC6542;
import p075.C6960;
import p077.C6970;
import p082.C7029;
import p082.C7033;
import p082.C7034;
import p083.C7040;
import p083.InterfaceC7036;
import p098.C7239;
import p116.InterfaceC7337;
import p136.C7523;
import p136.C7524;
import p161.AbstractC7645;
import p162.AbstractC7652;
import p167.C7692;
import p167.C7696;
import p167.C7698;
import p167.C7699;
import p167.C7704;
import p167.InterfaceC7706;
import p199.C7865;
import p203.C7877;
import p203.C7878;
import p205.InterfaceC7895;
import p222.AbstractC7983;
import p222.AbstractC7988;
import p222.C7984;
import p236.C8096;
import p236.InterfaceC8094;
import p236.InterfaceC8101;
import p236.InterfaceC8111;
import p286.InterfaceC8393;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0108 implements InterfaceC3844, InterfaceC4126, InterfaceC4133, InterfaceC6109, InterfaceC7337 {

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
                this.f319 = new AtomicReference(AbstractC1254.f3641);
                this.f320 = new Object();
                break;
            case 9:
                break;
            case 19:
                String string = UUID.randomUUID().toString();
                string.getClass();
                ByteString.Companion.getClass();
                this.f319 = C6123.m11517(string);
                this.f320 = C6215.f17058;
                this.f318 = new ArrayList();
                break;
            default:
                long[] jArr = AbstractC0290.f1007;
                this.f319 = new C0236();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static C0108 m353(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0108(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m354(Editable editable, KeyEvent keyEvent, boolean z) {
        C7699[] c7699Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c7699Arr = (C7699[]) editable.getSpans(selectionStart, selectionEnd, C7699.class)) != null && c7699Arr.length > 0) {
                for (C7699 c7699 : c7699Arr) {
                    int spanStart = editable.getSpanStart(c7699);
                    int spanEnd = editable.getSpanEnd(c7699);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // io.ktor.server.request.InterfaceC4128
    public C4125 getCookies() {
        return ((InterfaceC4126) this.f318).getCookies();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.reflect.jvm.internal.impl.types.AbstractC4913 m355(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4450 r8, p082.C7033 r9, boolean r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f319
            androidx.compose.animation.core.飘花落叶言子哲楪苏世兰 r0 = (androidx.compose.animation.core.C0325) r0
            java.lang.Object r1 = r0.f1095
            飘花落叶言世楪苏哲兰子.飘花落叶言子楪世苏哲兰 r1 = (p083.C7040) r1
            r8.getClass()
            boolean r9 = r9.f18881
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰哲世苏 r2 = r8.f13077
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4438
            r4 = 0
            if (r3 == 0) goto L18
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰苏世哲 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4438) r3
            goto L19
        L18:
            r3 = r4
        L19:
            if (r3 == 0) goto L33
            java.lang.Class r3 = r3.f13065
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
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲苏世 r7 = r1.f18910
            飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲 r7 = r7.mo9071()
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r7 = r7.m11989(r3)
            飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏哲世兰 r8 = new 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏哲世兰
            飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏世兰哲 r10 = r7.getAnnotations()
            r0 = 2
            飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏世兰哲[] r0 = new p046.InterfaceC6480[r0]
            r1 = 0
            r0[r1] = r10
            r0[r6] = r5
            java.util.List r10 = kotlin.collections.AbstractC4346.m8850(r0)
            r8.<init>(r6, r10)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r7 = p175.AbstractC7738.m13034(r7, r8)
            r7.getClass()
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r7 = (kotlin.reflect.jvm.internal.impl.types.AbstractC4877) r7
            if (r9 == 0) goto L67
            return r7
        L67:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r8 = r7.mo9741(r6)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏世楪哲兰 r7 = kotlin.reflect.jvm.internal.impl.types.AbstractC4892.m9815(r7, r8)
            return r7
        L70:
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r8 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r0 = 6
            飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰 r8 = kotlin.reflect.jvm.internal.types.AbstractC4921.m9872(r8, r9, r4, r0)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r7 = r7.m356(r2, r8)
            if (r9 == 0) goto L8f
            if (r10 == 0) goto L82
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L84
        L82:
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L84:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲苏世 r9 = r1.f18910
            飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲 r9 = r9.mo9071()
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r7 = r9.m11995(r8, r7, r5)
            return r7
        L8f:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲苏世 r8 = r1.f18910
            飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲 r8 = r8.mo9071()
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r8 = r8.m11995(r9, r7, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲苏世 r9 = r1.f18910
            飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲 r9 = r9.mo9071()
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r7 = r9.m11995(r10, r7, r5)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r7 = r7.mo9741(r6)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏世楪哲兰 r7 = kotlin.reflect.jvm.internal.impl.types.AbstractC4892.m9815(r8, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0108.m355(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏哲世兰, 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰, boolean):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏世楪哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public AbstractC4881 m356(AbstractC4436 abstractC4436, C7033 c7033) {
        C7040 c7040 = (C7040) ((C0325) this.f319).f1095;
        if (abstractC4436 instanceof C4438) {
            Class cls = ((C4438) abstractC4436).f13065;
            PrimitiveType primitiveType = cls.equals(Void.TYPE) ? null : JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            return primitiveType != null ? c7040.f18910.mo9071().m11984(primitiveType) : c7040.f18910.mo9071().m11985();
        }
        boolean z = false;
        if (!(abstractC4436 instanceof C4449)) {
            if (abstractC4436 instanceof C4450) {
                return m355((C4450) abstractC4436, c7033, false);
            }
            if (abstractC4436 instanceof C4426) {
                AbstractC4436 abstractC4436M8980 = ((C4426) abstractC4436).m8980();
                return abstractC4436M8980 != null ? m356(abstractC4436M8980, c7033) : c7040.f18910.mo9071().m11990();
            }
            if (abstractC4436 == null) {
                return c7040.f18910.mo9071().m11990();
            }
            C4210.m8606(abstractC4436, "Unsupported type: ");
            return null;
        }
        C4449 c4449 = (C4449) abstractC4436;
        Type type = c4449.f13075;
        if (!c7033.f18881 && c7033.f18884 != TypeUsage.SUPERTYPE) {
            z = true;
        }
        boolean zM8996 = c4449.m8996();
        if (!zM8996 && !z) {
            AbstractC4877 abstractC4877M390 = m390(c4449, c7033, null);
            return abstractC4877M390 != null ? abstractC4877M390 : C7239.m12443(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        AbstractC4877 abstractC4877M3902 = m390(c4449, c7033.m12343(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (abstractC4877M3902 == null) {
            return C7239.m12443(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        AbstractC4877 abstractC4877M3903 = m390(c4449, c7033.m12343(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), abstractC4877M3902);
        if (abstractC4877M3903 == null) {
            return C7239.m12443(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        if (!zM8996) {
            return AbstractC4892.m9815(abstractC4877M3902, abstractC4877M3903);
        }
        C7034 c7034 = new C7034(abstractC4877M3902, abstractC4877M3903);
        InterfaceC4850.f14129.m9608(abstractC4877M3902, abstractC4877M3903);
        return c7034;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public void m357(C7877 c7877, int i, int i2, int i3) {
        c7877.getClass();
        int i4 = c7877.f21747;
        int i5 = c7877.f21746;
        c7877.f21747 = 0;
        c7877.f21746 = 0;
        c7877.m13221(i2);
        c7877.m13222(i3);
        if (i4 < 0) {
            c7877.f21747 = 0;
        } else {
            c7877.f21747 = i4;
        }
        if (i5 < 0) {
            c7877.f21746 = 0;
        } else {
            c7877.f21746 = i5;
        }
        C7877 c78772 = (C7877) this.f318;
        c78772.f21692 = i;
        c78772.m13207();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public void m358() {
        try {
            AbstractC0455.m1145(m368(), ((JSONObject) this.f318).toString(), false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public void m359(LayoutDirection layoutDirection) {
        ((C1507) this.f318).f4285.f4288 = layoutDirection;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public void m360(long j) {
        ((C1507) this.f318).f4285.f4286 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public void m361(Object obj) {
        long jM2181 = AbstractC1254.m2181();
        if (jM2181 == AbstractC1248.f3622) {
            this.f318 = obj;
            return;
        }
        synchronized (this.f320) {
            C1252 c1252 = (C1252) ((AtomicReference) this.f319).get();
            int iM2175 = c1252.m2175(jM2181);
            if (iM2175 < 0) {
                ((AtomicReference) this.f319).set(c1252.m2174(obj, jM2181));
            } else {
                c1252.f3637[iM2175] = obj;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public void m362() {
        ((TypedArray) this.f320).recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public void m363(InterfaceC7895 interfaceC7895) {
        ((C1507) this.f318).f4285.f4289 = interfaceC7895;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public void m364(InterfaceC1601 interfaceC1601) {
        ((C1507) this.f318).f4285.f4287 = interfaceC1601;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean m365() throws Throwable {
        switch (this.f321) {
            case 11:
                List list = (List) this.f320;
                ByteBuffer byteBufferM13436 = AbstractC7983.m13436((ByteBuffer) this.f319);
                C2973 c2973 = (C2973) this.f318;
                if (byteBufferM13436 == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((InterfaceC8393) list.get(i)).mo6481(byteBufferM13436, c2973)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 12:
                List list2 = (List) this.f318;
                C3032 c3032 = (C3032) ((C2967) this.f319).f9383;
                c3032.reset();
                C2973 c29732 = (C2973) this.f320;
                c3032.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        if (((InterfaceC8393) list2.get(i2)).mo6480(c3032, c29732)) {
                            return true;
                        }
                    } finally {
                        c3032.reset();
                    }
                }
                return false;
            default:
                List list3 = (List) this.f320;
                C2967 c2967 = (C2967) this.f318;
                C2973 c29733 = (C2973) this.f319;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC8393 interfaceC8393 = (InterfaceC8393) list3.get(i3);
                    C3032 c30322 = null;
                    try {
                        C3032 c30323 = new C3032(new FileInputStream(c2967.m6382().getFileDescriptor()), c29733);
                        try {
                            boolean zMo6480 = interfaceC8393.mo6480(c30323, c29733);
                            c30323.m6488();
                            c2967.m6382();
                            if (zMo6480) {
                                return true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c30322 = c30323;
                            if (c30322 != null) {
                                c30322.m6488();
                            }
                            c2967.m6382();
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
    public boolean m366(CharSequence charSequence, int i, int i2, C7698 c7698) {
        if ((c7698.f20889 & 3) == 0) {
            C7692 c7692 = (C7692) this.f318;
            C2302 c2302M12965 = c7698.m12965();
            int iM3991 = c2302M12965.m3991(8);
            if (iM3991 != 0) {
                ((ByteBuffer) c2302M12965.f6463).getShort(iM3991 + c2302M12965.f6466);
            }
            c7692.getClass();
            ThreadLocal threadLocal = C7692.f20882;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = c7692.f20883.hasGlyph(sb.toString());
            int i3 = c7698.f20889 & 4;
            c7698.f20889 = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (c7698.f20889 & 3) == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long m367() {
        return ((C1507) this.f318).f4285.f4286;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public String m368() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3932.m8313());
        sb.append(AbstractC3056.m6668(-3937561931850974631L));
        AbstractC6136.m11531(sb, (String) this.f320, -3937561854541563303L);
        sb.append((String) this.f319);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public LayoutDirection m369() {
        return ((C1507) this.f318).f4285.f4288;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ImageHeaderParser$ImageType m370() throws Throwable {
        switch (this.f321) {
            case 11:
                return AbstractC2904.m6245((List) this.f320, AbstractC7983.m13436((ByteBuffer) this.f319));
            case 12:
                List list = (List) this.f318;
                C3032 c3032 = (C3032) ((C2967) this.f319).f9383;
                c3032.reset();
                return AbstractC2904.m6246(list, c3032, (C2973) this.f320);
            default:
                List list2 = (List) this.f320;
                C2967 c2967 = (C2967) this.f318;
                C2973 c2973 = (C2973) this.f319;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC8393 interfaceC8393 = (InterfaceC8393) list2.get(i);
                    C3032 c30322 = null;
                    try {
                        C3032 c30323 = new C3032(new FileInputStream(c2967.m6382().getFileDescriptor()), c2973);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo6479 = interfaceC8393.mo6479(c30323);
                            c30323.m6488();
                            c2967.m6382();
                            if (imageHeaderParser$ImageTypeMo6479 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo6479;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c30322 = c30323;
                            if (c30322 != null) {
                                c30322.m6488();
                            }
                            c2967.m6382();
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
    public void m371(Object obj, String str) {
        ((JSONObject) this.f318).put(str, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public Object m372(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC7706 interfaceC7706) {
        int i4;
        char c;
        C7704 c7704 = new C7704((C7696) ((C0325) this.f320).f1094);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo9054 = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zMo9054) {
                SparseArray sparseArray = c7704.f20904.f20886;
                C7696 c7696 = sparseArray == null ? null : (C7696) sparseArray.get(iCodePointAt);
                if (c7704.f20906 == 2) {
                    if (c7696 != null) {
                        c7704.f20904 = c7696;
                        c7704.f20901++;
                    } else {
                        if (iCodePointAt == 65038) {
                            c7704.m12974();
                        } else if (iCodePointAt != 65039) {
                            C7696 c76962 = c7704.f20904;
                            if (c76962.f20885 != null) {
                                if (c7704.f20901 != 1) {
                                    c7704.f20903 = c76962;
                                    c7704.m12974();
                                } else if (c7704.m12973()) {
                                    c7704.f20903 = c7704.f20904;
                                    c7704.m12974();
                                } else {
                                    c7704.m12974();
                                }
                                c = 3;
                            } else {
                                c7704.m12974();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (c7696 == null) {
                    c7704.m12974();
                    c = 1;
                } else {
                    c7704.f20906 = 2;
                    c7704.f20904 = c7696;
                    c7704.f20901 = 1;
                    c = 2;
                }
                c7704.f20902 = iCodePointAt;
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
                    if (z || !m366(charSequence, i4, iCharCount, c7704.f20903.f20885)) {
                        zMo9054 = interfaceC7706.mo9054(charSequence, i4, iCharCount, c7704.f20903.f20885);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (c7704.f20906 == 2 && c7704.f20904.f20885 != null && ((c7704.f20901 > 1 || c7704.m12973()) && i5 < i3 && zMo9054 && (z || !m366(charSequence, i4, iCharCount, c7704.f20904.f20885)))) {
            interfaceC7706.mo9054(charSequence, i4, iCharCount, c7704.f20904.f20885);
        }
        return interfaceC7706.mo9053();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public void m373(Activity activity, C2597 c2597) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f318;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.f320;
        reentrantLock.lock();
        try {
            if (c2597.equals((C2597) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((C7524) ((C5851) this.f319).f16007).f20403.iterator();
            it.getClass();
            while (it.hasNext()) {
                C7523 c7523 = (C7523) it.next();
                if (c7523.f20400.equals(activity)) {
                    c7523.f20397 = c2597;
                    c7523.f20399.execute(new RunnableC0099(c7523, 19, c2597));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean m374(int i, C7865 c7865, C7878 c7878) {
        C2149 c2149 = (C2149) this.f320;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7878.f21698;
        int[] iArr = c7878.f21724;
        c2149.f6347 = constraintWidget$DimensionBehaviourArr[0];
        c2149.f6346 = constraintWidget$DimensionBehaviourArr[1];
        c2149.f6345 = c7878.m13247();
        c2149.f6344 = c7878.m13251();
        c2149.f6350 = false;
        c2149.f6351 = i;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c2149.f6347;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2;
        boolean z2 = c2149.f6346 == constraintWidget$DimensionBehaviour2;
        boolean z3 = z && c7878.f21756 > 0.0f;
        boolean z4 = z2 && c7878.f21756 > 0.0f;
        if (z3 && iArr[0] == 4) {
            c2149.f6347 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            c2149.f6346 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        c7865.m13196(c7878, c2149);
        c7878.m13221(c2149.f6343);
        c7878.m13222(c2149.f6342);
        c7878.f21717 = c2149.f6348;
        c7878.m13232(c2149.f6349);
        c2149.f6351 = 0;
        return c2149.f6350;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean m375() {
        if (((InterfaceC1333) this.f319).getValue() != this.f318) {
            return true;
        }
        C0108 c0108 = (C0108) this.f320;
        return c0108 != null && c0108.m375();
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC8094 mo376() {
        return ((InterfaceC4126) this.f318).mo376();
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC8101 mo377() {
        return ((InterfaceC4126) this.f318).mo377();
    }

    @Override // io.ktor.server.request.InterfaceC4126
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4129 mo378() {
        return (C4129) this.f320;
    }

    @Override // io.ktor.server.request.InterfaceC4128, io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC4056 mo380() {
        switch (this.f321) {
        }
        return (C4155) this.f319;
    }

    @Override // p005.InterfaceC6109
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC6110 mo381() {
        return (C6108) this.f320;
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0076 mo382() {
        return ((InterfaceC4133) this.f318).mo382();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ColorStateList m384(int i) {
        int resourceId;
        ColorStateList colorStateListM12890;
        TypedArray typedArray = (TypedArray) this.f320;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM12890 = AbstractC7652.m12890((Context) this.f319, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM12890;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC1601 m385() {
        return ((C1507) this.f318).f4285.f4287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable m386(int i) {
        int resourceId;
        Drawable drawableM632;
        if (!((TypedArray) this.f320).hasValue(i) || (resourceId = ((TypedArray) this.f320).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0130 c0130M539 = C0130.m539();
        Context context = (Context) this.f319;
        synchronized (c0130M539) {
            drawableM632 = c0130M539.f572.m632(context, resourceId, true);
        }
        return drawableM632;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Typeface m387(int i, int i2, C0232 c0232) {
        int resourceId = ((TypedArray) this.f320).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f318) == null) {
            this.f318 = new TypedValue();
        }
        Context context = (Context) this.f319;
        TypedValue typedValue = (TypedValue) this.f318;
        ThreadLocal threadLocal = AbstractC7645.f20761;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC7645.m12883(context, resourceId, typedValue, i2, c0232, true, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC7895 m388() {
        return ((C1507) this.f318).f4285.f4289;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Drawable m389(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f320;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC3054.m6607((Context) this.f319, resourceId);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.reflect.jvm.internal.impl.types.AbstractC4877 m390(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4449 r21, p082.C7033 r22, kotlin.reflect.jvm.internal.impl.types.AbstractC4877 r23) {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0108.m390(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏兰哲世, 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰, kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏");
    }

    @Override // com.typesafe.config.impl.InterfaceC3844
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public AbstractC3842 mo291(AbstractC3842 abstractC3842, String str) {
        C3857 c3857 = (C3857) this.f319;
        C3848 c3848 = (C3848) this.f318;
        C3846 c3846 = (C3846) this.f320;
        C3857 c38572 = c3846.f12065;
        if (!(c38572 != null)) {
            C3851 c3851M8237 = c3846.m8236(null).m8237(abstractC3842, c3848);
            this.f320 = c3851M8237.f12074.m8236(null).m8236(c3857);
            return c3851M8237.f12073;
        }
        if (str.equals(c38572.f12081)) {
            C3846 c38462 = (C3846) this.f320;
            C3857 c38573 = c38462.f12065.f12080;
            if (c38573 != null) {
                C3851 c3851M82372 = c38462.m8236(c38573).m8237(abstractC3842, c3848);
                this.f320 = c3851M82372.f12074.m8236(null).m8236(c3857);
                return c3851M82372.f12073;
            }
        }
        return abstractC3842;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object m391() {
        long jM2181 = AbstractC1254.m2181();
        if (jM2181 == AbstractC1248.f3622) {
            return this.f318;
        }
        C1252 c1252 = (C1252) ((AtomicReference) this.f319).get();
        int iM2175 = c1252.m2175(jM2181);
        if (iM2175 >= 0) {
            return c1252.f3637[iM2175];
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object m392(String str) {
        try {
            return ((JSONObject) this.f318).get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public Bitmap m393(BitmapFactory.Options options) throws Throwable {
        switch (this.f321) {
            case 11:
                return AbstractC3037.m6518(new C7984(AbstractC7983.m13436((ByteBuffer) this.f319)), options, this);
            case 12:
                C3032 c3032 = (C3032) ((C2967) this.f319).f9383;
                c3032.reset();
                return AbstractC3037.m6518(c3032, options, this);
            default:
                FileDescriptor fileDescriptor = ((C2967) this.f318).m6382().getFileDescriptor();
                int i = Build.VERSION.SDK_INT;
                Bitmap bitmapM6516 = null;
                if (i == 34) {
                    if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC3037.f9671.get()).booleanValue() : false) && AbstractC3037.m6517(this)) {
                        Bitmap.Config config = options.inPreferredConfig;
                        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                        AbstractC7988.m13443("", config == config2);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        try {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            if (bitmapDecodeFileDescriptor == null) {
                                if (bitmapDecodeFileDescriptor != null) {
                                }
                                options.inPreferredConfig = config2;
                                return bitmapM6516;
                            }
                            try {
                                bitmapM6516 = AbstractC3037.m6516(bitmapDecodeFileDescriptor);
                            } catch (Throwable th) {
                                th = th;
                                bitmapM6516 = bitmapDecodeFileDescriptor;
                                if (bitmapM6516 != null) {
                                    bitmapM6516.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                            break;
                            bitmapDecodeFileDescriptor.recycle();
                            options.inPreferredConfig = config2;
                            return bitmapM6516;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC4251 mo394() {
        return ((InterfaceC4126) this.f318).mo394();
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean mo395() {
        return ((InterfaceC4133) this.f318).mo395();
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo396(C8096 c8096) {
        c8096.getClass();
        ((InterfaceC4133) this.f318).mo396(c8096);
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean mo397() {
        return ((InterfaceC4133) this.f318).mo397();
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8096 mo398() {
        return ((InterfaceC4133) this.f318).mo398();
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC8094 mo399() {
        return ((InterfaceC4126) this.f318).mo399();
    }

    @Override // p005.InterfaceC6109
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public InterfaceC6112 mo400() {
        return (C6116) this.f318;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public void m401(C7877 c7877) {
        ArrayList arrayList = (ArrayList) this.f319;
        arrayList.clear();
        int size = c7877.f21691.size();
        for (int i = 0; i < size; i++) {
            C7878 c7878 = (C7878) c7877.f21691.get(i);
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7878.f21698;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
            if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour2) {
                arrayList.add(c7878);
            }
        }
        c7877.f21693.f6336 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public void m402() {
        C0236 c0236 = (C0236) this.f319;
        String str = (String) this.f320;
        List list = (List) c0236.m757(str);
        if (list != null) {
            list.remove((InterfaceC6542) this.f318);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c0236.m754(str, list);
    }

    @Override // io.ktor.server.response.InterfaceC4133
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4134 mo379() {
        return (C4134) this.f320;
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: getCookies, reason: collision with other method in class */
    public C4132 mo403getCookies() {
        return ((InterfaceC4133) this.f318).mo403getCookies();
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC8111 mo383() {
        return ((InterfaceC4126) this.f318).mo383();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    private final void m351() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    private final void m352() {
    }

    public C0108(String str, String str2) {
        this.f321 = 20;
        this.f319 = str2;
        this.f320 = str;
        try {
            this.f318 = InterfaceC2915.m6316(AbstractC0455.m1142(m368()));
        } catch (Exception unused) {
            this.f318 = new JSONObject();
        }
    }

    public C0108(C4650 c4650, C6970 c6970) {
        this.f321 = 23;
        this.f319 = c4650;
        this.f320 = c6970;
        this.f318 = new ConcurrentHashMap();
    }

    public C0108(int i, int i2) {
        this.f321 = 3;
        this.f319 = AbstractC1367.m2468(i);
        this.f320 = AbstractC1367.m2468(i2);
        this.f318 = new C0690(i, 90, 200);
    }

    public C0108(C0325 c0325) {
        this.f321 = 18;
        this.f319 = c0325;
        C5568 c5568 = (C5568) c0325.f1094;
        c5568.getClass();
        this.f320 = new C6108(c5568);
        C5569 c5569 = (C5569) c0325.f1093;
        c5569.getClass();
        this.f318 = new C6116(c5569);
    }

    public C0108(C6518 c6518, Method[] methodArr, Method method) {
        this.f321 = 21;
        c6518.getClass();
        this.f319 = c6518;
        this.f320 = methodArr;
        this.f318 = method;
    }

    public C0108(C0325 c0325, InterfaceC7036 interfaceC7036) {
        this.f321 = 25;
        interfaceC7036.getClass();
        this.f319 = c0325;
        this.f320 = interfaceC7036;
        this.f318 = new C4870(new C7029());
    }

    public C0108(C4155 c4155, C4129 c4129, InterfaceC4126 interfaceC4126) {
        this.f321 = 15;
        c4129.getClass();
        interfaceC4126.getClass();
        this.f319 = c4155;
        this.f320 = c4129;
        this.f318 = interfaceC4126;
    }

    public C0108(C4155 c4155, C4134 c4134, InterfaceC4133 interfaceC4133) {
        this.f321 = 16;
        c4134.getClass();
        interfaceC4133.getClass();
        this.f319 = c4155;
        this.f320 = c4134;
        this.f318 = interfaceC4133;
    }

    public C0108(InterfaceC4495 interfaceC4495, List list, C0108 c0108) {
        this.f321 = 17;
        interfaceC4495.getClass();
        list.getClass();
        this.f319 = interfaceC4495;
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

    public C0108(C7877 c7877) {
        this.f321 = 7;
        this.f319 = new ArrayList();
        this.f320 = new C2149();
        this.f318 = c7877;
    }

    public C0108(C0325 c0325, C6960 c6960, C7692 c7692, Set set) {
        this.f321 = 28;
        this.f319 = c6960;
        this.f320 = c0325;
        this.f318 = c7692;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m372(str, 0, str.length(), 1, true, new C4484(str, 4));
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
        this.f318 = c1969.f5851;
    }

    public C0108(C3530 c3530, ArrayList arrayList, C2973 c2973) {
        this.f321 = 12;
        AbstractC7988.m13441(c2973, "Argument must not be null");
        this.f320 = c2973;
        AbstractC7988.m13441(arrayList, "Argument must not be null");
        this.f318 = arrayList;
        this.f319 = new C2967(c3530, c2973);
    }

    public C0108(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C2973 c2973) {
        this.f321 = 13;
        AbstractC7988.m13441(c2973, "Argument must not be null");
        this.f319 = c2973;
        AbstractC7988.m13441(arrayList, "Argument must not be null");
        this.f320 = arrayList;
        this.f318 = new C2967(parcelFileDescriptor);
    }

    public /* synthetic */ C0108(Object obj, Object obj2, Object obj3, int i) {
        this.f321 = i;
        this.f319 = obj;
        this.f320 = obj2;
        this.f318 = obj3;
    }

    public C0108(C3846 c3846, C3848 c3848) {
        this.f321 = 14;
        this.f320 = c3846;
        this.f318 = c3848;
        this.f319 = c3846.f12065;
    }

    public C0108(C5851 c5851) {
        this.f321 = 27;
        this.f319 = c5851;
        this.f320 = new ReentrantLock();
        this.f318 = new WeakHashMap();
    }

    public C0108(C3007 c3007, C3047 c3047, C2998 c2998) {
        this.f321 = 10;
        this.f318 = c3007;
        this.f320 = c3047;
        this.f319 = c2998;
    }
}
