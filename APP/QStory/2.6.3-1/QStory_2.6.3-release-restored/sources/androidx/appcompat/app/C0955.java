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
import androidx.appcompat.widget.C0977;
import androidx.appcompat.widget.C1079;
import androidx.collection.AbstractC1137;
import androidx.collection.C1083;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.lazy.layout.C1531;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.text.font.C2803;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.internal.AbstractC2083;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2087;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.C2982;
import androidx.emoji2.text.flatbuffer.C3135;
import androidx.window.layout.C3431;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C3800;
import com.bumptech.glide.load.engine.C3831;
import com.bumptech.glide.load.engine.C3840;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.load.resource.bitmap.AbstractC3870;
import com.bumptech.glide.load.resource.bitmap.C3865;
import com.bumptech.glide.request.C3880;
import com.google.protobuf.C4363;
import com.typesafe.config.impl.AbstractC4675;
import com.typesafe.config.impl.C4679;
import com.typesafe.config.impl.C4681;
import com.typesafe.config.impl.C4684;
import com.typesafe.config.impl.C4690;
import com.typesafe.config.impl.InterfaceC4677;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.request.C4958;
import io.ktor.server.request.C4962;
import io.ktor.server.request.InterfaceC4959;
import io.ktor.server.response.C4965;
import io.ktor.server.response.C4967;
import io.ktor.server.response.InterfaceC4966;
import io.ktor.server.routing.C4988;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.InterfaceC5084;
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
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.C5170;
import kotlin.collections.C5173;
import kotlin.collections.C5174;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5241;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5269;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5259;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5270;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5271;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5282;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5283;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5454;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5483;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5712;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5683;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.sequences.C5948;
import okio.ByteString;
import okio.internal.C6399;
import okio.internal.C6400;
import p020.C6928;
import p020.C6936;
import p020.C6943;
import p020.InterfaceC6929;
import p020.InterfaceC6930;
import p020.InterfaceC6932;
import p023.C6971;
import p050.AbstractC7176;
import p062.C7311;
import p062.C7314;
import p062.InterfaceC7307;
import p062.InterfaceC7310;
import p064.C7348;
import p065.AbstractC7355;
import p065.AbstractC7359;
import p065.C7361;
import p065.C7362;
import p068.InterfaceC7372;
import p082.AbstractC7699;
import p091.C7790;
import p093.C7800;
import p095.AbstractC7818;
import p097.InterfaceC7856;
import p098.AbstractC7861;
import p098.C7859;
import p098.C7862;
import p098.C7863;
import p098.C7864;
import p099.C7868;
import p099.C7870;
import p099.InterfaceC7866;
import p114.C8069;
import p117.InterfaceC8083;
import p132.InterfaceC8167;
import p152.C8353;
import p152.C8354;
import p160.C8376;
import p177.AbstractC8475;
import p178.AbstractC8482;
import p183.C8522;
import p183.C8526;
import p183.C8528;
import p183.C8529;
import p183.C8534;
import p183.InterfaceC8536;
import p215.C8695;
import p219.C8707;
import p219.C8708;
import p221.InterfaceC8725;
import p238.AbstractC8813;
import p238.AbstractC8818;
import p238.C8814;
import p252.C8926;
import p252.InterfaceC8924;
import p252.InterfaceC8931;
import p252.InterfaceC8941;
import p302.InterfaceC9223;
import p332.C9496;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0955 implements InterfaceC4677, InterfaceC4959, InterfaceC4966, InterfaceC6929, InterfaceC8167 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static C0955 f662;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f664;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f665;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f666;

    public C0955(int i) {
        this.f666 = i;
        switch (i) {
            case 5:
                this.f664 = new AtomicReference(AbstractC2089.f3987);
                this.f665 = new Object();
                break;
            case 9:
                break;
            case 18:
                String string = UUID.randomUUID().toString();
                string.getClass();
                ByteString.Companion.getClass();
                this.f664 = C6943.m12069(string);
                this.f665 = C6971.f17164;
                this.f663 = new ArrayList();
                break;
            default:
                long[] jArr = AbstractC1137.f1352;
                this.f664 = new C1083();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static C0955 m914(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0955(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m915(Editable editable, KeyEvent keyEvent, boolean z) {
        C8529[] c8529Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c8529Arr = (C8529[]) editable.getSpans(selectionStart, selectionEnd, C8529.class)) != null && c8529Arr.length > 0) {
                for (C8529 c8529 : c8529Arr) {
                    int spanStart = editable.getSpanStart(c8529);
                    int spanEnd = editable.getSpanEnd(c8529);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // io.ktor.server.request.InterfaceC4961
    public C4958 getCookies() {
        return ((InterfaceC4959) this.f663).getCookies();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5746 m916(C5283 c5283, C7863 c7863, boolean z) {
        PrimitiveType primitiveType;
        C1171 c1171 = (C1171) this.f664;
        C7870 c7870 = (C7870) c1171.f1440;
        c5283.getClass();
        boolean z2 = c7863.f19221;
        AbstractC5269 abstractC5269 = c5283.f13426;
        C5271 c5271 = abstractC5269 instanceof C5271 ? (C5271) abstractC5269 : null;
        if (c5271 != null) {
            Class cls = c5271.f13414;
            primitiveType = cls.equals(Void.TYPE) ? null : JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
        }
        C7868 c7868 = new C7868(c1171, c5283, true);
        if (primitiveType == null) {
            AbstractC5714 abstractC5714M917 = m917(abstractC5269, C9496.m14920(TypeUsage.COMMON, z2, null, 6));
            if (z2) {
                return c7870.f19250.mo9620().m12597(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, abstractC5714M917, c7868);
            }
            return AbstractC5725.m10368(c7870.f19250.mo9620().m12597(Variance.INVARIANT, abstractC5714M917, c7868), c7870.f19250.mo9620().m12597(Variance.OUT_VARIANCE, abstractC5714M917, c7868).mo10290(true));
        }
        AbstractC5710 abstractC5710M12591 = c7870.f19250.mo9620().m12591(primitiveType);
        AbstractC5714 abstractC5714M6901 = AbstractC3738.m6901(abstractC5710M12591, new C7314(1, AbstractC5179.m9405(new InterfaceC7310[]{abstractC5710M12591.getAnnotations(), c7868})));
        abstractC5714M6901.getClass();
        AbstractC5710 abstractC5710 = (AbstractC5710) abstractC5714M6901;
        return z2 ? abstractC5710 : AbstractC5725.m10368(abstractC5710, abstractC5710.mo10290(true));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public AbstractC5714 m917(AbstractC5269 abstractC5269, C7863 c7863) {
        C7870 c7870 = (C7870) ((C1171) this.f664).f1440;
        if (abstractC5269 instanceof C5271) {
            Class cls = ((C5271) abstractC5269).f13414;
            PrimitiveType primitiveType = cls.equals(Void.TYPE) ? null : JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            return primitiveType != null ? c7870.f19250.mo9620().m12586(primitiveType) : c7870.f19250.mo9620().m12587();
        }
        boolean z = false;
        if (!(abstractC5269 instanceof C5282)) {
            if (abstractC5269 instanceof C5283) {
                return m916((C5283) abstractC5269, c7863, false);
            }
            if (abstractC5269 instanceof C5259) {
                AbstractC5269 abstractC5269M9529 = ((C5259) abstractC5269).m9529();
                return abstractC5269M9529 != null ? m917(abstractC5269M9529, c7863) : c7870.f19250.mo9620().m12592();
            }
            if (abstractC5269 == null) {
                return c7870.f19250.mo9620().m12592();
            }
            C5043.m9155(abstractC5269, "Unsupported type: ");
            return null;
        }
        C5282 c5282 = (C5282) abstractC5269;
        Type type = c5282.f13424;
        if (!c7863.f19221 && c7863.f19224 != TypeUsage.SUPERTYPE) {
            z = true;
        }
        boolean zM9545 = c5282.m9545();
        if (!zM9545 && !z) {
            AbstractC5710 abstractC5710M951 = m951(c5282, c7863, null);
            return abstractC5710M951 != null ? abstractC5710M951 : C8069.m13029(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        AbstractC5710 abstractC5710M9512 = m951(c5282, c7863.m12929(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (abstractC5710M9512 == null) {
            return C8069.m13029(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        AbstractC5710 abstractC5710M9513 = m951(c5282, c7863.m12929(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), abstractC5710M9512);
        if (abstractC5710M9513 == null) {
            return C8069.m13029(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        if (!zM9545) {
            return AbstractC5725.m10368(abstractC5710M9512, abstractC5710M9513);
        }
        C7864 c7864 = new C7864(abstractC5710M9512, abstractC5710M9513);
        InterfaceC5683.f14478.m10157(abstractC5710M9512, abstractC5710M9513);
        return c7864;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public void m918(C8707 c8707, int i, int i2, int i3) {
        c8707.getClass();
        int i4 = c8707.f22089;
        int i5 = c8707.f22088;
        c8707.f22089 = 0;
        c8707.f22088 = 0;
        c8707.m13808(i2);
        c8707.m13809(i3);
        if (i4 < 0) {
            c8707.f22089 = 0;
        } else {
            c8707.f22089 = i4;
        }
        if (i5 < 0) {
            c8707.f22088 = 0;
        } else {
            c8707.f22088 = i5;
        }
        C8707 c87072 = (C8707) this.f663;
        c87072.f22034 = i;
        c87072.m13794();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public void m919() {
        try {
            AbstractC5894.m10615(m929(), ((JSONObject) this.f663).toString(), false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public void m920(LayoutDirection layoutDirection) {
        ((C2342) this.f663).f4631.f4634 = layoutDirection;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public void m921(long j) {
        ((C2342) this.f663).f4631.f4632 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public void m922(Object obj) {
        long jM2751 = AbstractC2089.m2751();
        if (jM2751 == AbstractC2083.f3968) {
            this.f663 = obj;
            return;
        }
        synchronized (this.f665) {
            C2087 c2087 = (C2087) ((AtomicReference) this.f664).get();
            int iM2745 = c2087.m2745(jM2751);
            if (iM2745 < 0) {
                ((AtomicReference) this.f664).set(c2087.m2744(obj, jM2751));
            } else {
                c2087.f3983[iM2745] = obj;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public void m923() {
        ((TypedArray) this.f665).recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public void m924(InterfaceC8725 interfaceC8725) {
        ((C2342) this.f663).f4631.f4635 = interfaceC8725;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public void m925(InterfaceC2436 interfaceC2436) {
        ((C2342) this.f663).f4631.f4633 = interfaceC2436;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean m926() throws Throwable {
        switch (this.f666) {
            case 11:
                List list = (List) this.f665;
                ByteBuffer byteBufferM14023 = AbstractC8813.m14023((ByteBuffer) this.f664);
                C3806 c3806 = (C3806) this.f663;
                if (byteBufferM14023 == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((InterfaceC9223) list.get(i)).mo7101(byteBufferM14023, c3806)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 12:
                List list2 = (List) this.f663;
                C3865 c3865 = (C3865) ((C3800) this.f664).f9730;
                c3865.reset();
                C3806 c38062 = (C3806) this.f665;
                c3865.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        if (((InterfaceC9223) list2.get(i2)).mo7100(c3865, c38062)) {
                            return true;
                        }
                    } finally {
                        c3865.reset();
                    }
                }
                return false;
            default:
                List list3 = (List) this.f665;
                C3800 c3800 = (C3800) this.f663;
                C3806 c38063 = (C3806) this.f664;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC9223 interfaceC9223 = (InterfaceC9223) list3.get(i3);
                    C3865 c38652 = null;
                    try {
                        C3865 c38653 = new C3865(new FileInputStream(c3800.m7000().getFileDescriptor()), c38063);
                        try {
                            boolean zMo7100 = interfaceC9223.mo7100(c38653, c38063);
                            c38653.m7108();
                            c3800.m7000();
                            if (zMo7100) {
                                return true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c38652 = c38653;
                            if (c38652 != null) {
                                c38652.m7108();
                            }
                            c3800.m7000();
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
    public boolean m927(CharSequence charSequence, int i, int i2, C8528 c8528) {
        if ((c8528.f21229 & 3) == 0) {
            C8522 c8522 = (C8522) this.f663;
            C3135 c3135M13554 = c8528.m13554();
            int iM4561 = c3135M13554.m4561(8);
            if (iM4561 != 0) {
                ((ByteBuffer) c3135M13554.f6809).getShort(iM4561 + c3135M13554.f6812);
            }
            c8522.getClass();
            ThreadLocal threadLocal = C8522.f21222;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = c8522.f21223.hasGlyph(sb.toString());
            int i3 = c8528.f21229 & 4;
            c8528.f21229 = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (c8528.f21229 & 3) == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long m928() {
        return ((C2342) this.f663).f4631.f4632;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public String m929() {
        return AbstractC4765.m8874() + "/data/plugin/" + ((String) this.f665) + "/" + ((String) this.f664);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public LayoutDirection m930() {
        return ((C2342) this.f663).f4631.f4634;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ImageHeaderParser$ImageType m931() throws Throwable {
        switch (this.f666) {
            case 11:
                return AbstractC3738.m6856((List) this.f665, AbstractC8813.m14023((ByteBuffer) this.f664));
            case 12:
                List list = (List) this.f663;
                C3865 c3865 = (C3865) ((C3800) this.f664).f9730;
                c3865.reset();
                return AbstractC3738.m6857(list, c3865, (C3806) this.f665);
            default:
                List list2 = (List) this.f665;
                C3800 c3800 = (C3800) this.f663;
                C3806 c3806 = (C3806) this.f664;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC9223 interfaceC9223 = (InterfaceC9223) list2.get(i);
                    C3865 c38652 = null;
                    try {
                        C3865 c38653 = new C3865(new FileInputStream(c3800.m7000().getFileDescriptor()), c3806);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo7099 = interfaceC9223.mo7099(c38653);
                            c38653.m7108();
                            c3800.m7000();
                            if (imageHeaderParser$ImageTypeMo7099 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo7099;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c38652 = c38653;
                            if (c38652 != null) {
                                c38652.m7108();
                            }
                            c3800.m7000();
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
    public void m932(Object obj, String str) {
        ((JSONObject) this.f663).put(str, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public Object m933(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC8536 interfaceC8536) {
        int i4;
        char c;
        C8534 c8534 = new C8534((C8526) ((C1171) this.f665).f1439);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo9603 = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zMo9603) {
                SparseArray sparseArray = c8534.f21244.f21226;
                C8526 c8526 = sparseArray == null ? null : (C8526) sparseArray.get(iCodePointAt);
                if (c8534.f21246 == 2) {
                    if (c8526 != null) {
                        c8534.f21244 = c8526;
                        c8534.f21241++;
                    } else {
                        if (iCodePointAt == 65038) {
                            c8534.m13563();
                        } else if (iCodePointAt != 65039) {
                            C8526 c85262 = c8534.f21244;
                            if (c85262.f21225 != null) {
                                if (c8534.f21241 != 1) {
                                    c8534.f21243 = c85262;
                                    c8534.m13563();
                                } else if (c8534.m13562()) {
                                    c8534.f21243 = c8534.f21244;
                                    c8534.m13563();
                                } else {
                                    c8534.m13563();
                                }
                                c = 3;
                            } else {
                                c8534.m13563();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (c8526 == null) {
                    c8534.m13563();
                    c = 1;
                } else {
                    c8534.f21246 = 2;
                    c8534.f21244 = c8526;
                    c8534.f21241 = 1;
                    c = 2;
                }
                c8534.f21242 = iCodePointAt;
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
                    if (z || !m927(charSequence, i4, iCharCount, c8534.f21243.f21225)) {
                        zMo9603 = interfaceC8536.mo9603(charSequence, i4, iCharCount, c8534.f21243.f21225);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (c8534.f21246 == 2 && c8534.f21244.f21225 != null && ((c8534.f21241 > 1 || c8534.m13562()) && i5 < i3 && zMo9603 && (z || !m927(charSequence, i4, iCharCount, c8534.f21244.f21225)))) {
            interfaceC8536.mo9603(charSequence, i4, iCharCount, c8534.f21244.f21225);
        }
        return interfaceC8536.mo9602();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public void m934(Activity activity, C3431 c3431) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f663;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.f665;
        reentrantLock.lock();
        try {
            if (c3431.equals((C3431) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((C8354) ((C6686) this.f664).f16359).f20743.iterator();
            it.getClass();
            while (it.hasNext()) {
                C8353 c8353 = (C8353) it.next();
                if (c8353.f20740.equals(activity)) {
                    c8353.f20737 = c3431;
                    c8353.f20739.execute(new RunnableC0946(c8353, 19, c3431));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean m935(int i, C8695 c8695, C8708 c8708) {
        C2982 c2982 = (C2982) this.f665;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8708.f22040;
        int[] iArr = c8708.f22066;
        c2982.f6693 = constraintWidget$DimensionBehaviourArr[0];
        c2982.f6692 = constraintWidget$DimensionBehaviourArr[1];
        c2982.f6691 = c8708.m13834();
        c2982.f6690 = c8708.m13838();
        c2982.f6696 = false;
        c2982.f6697 = i;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c2982.f6693;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2;
        boolean z2 = c2982.f6692 == constraintWidget$DimensionBehaviour2;
        boolean z3 = z && c8708.f22098 > 0.0f;
        boolean z4 = z2 && c8708.f22098 > 0.0f;
        if (z3 && iArr[0] == 4) {
            c2982.f6693 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            c2982.f6692 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        c8695.m13783(c8708, c2982);
        c8708.m13808(c2982.f6689);
        c8708.m13809(c2982.f6688);
        c8708.f22059 = c2982.f6694;
        c8708.m13819(c2982.f6695);
        c2982.f6697 = 0;
        return c2982.f6696;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean m936() {
        if (((InterfaceC2168) this.f664).getValue() != this.f663) {
            return true;
        }
        C0955 c0955 = (C0955) this.f665;
        return c0955 != null && c0955.m936();
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC8924 mo937() {
        return ((InterfaceC4959) this.f663).mo937();
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC8931 mo938() {
        return ((InterfaceC4959) this.f663).mo938();
    }

    @Override // io.ktor.server.request.InterfaceC4959
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4962 mo939() {
        return (C4962) this.f665;
    }

    @Override // io.ktor.server.request.InterfaceC4961, io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC4889 mo941() {
        switch (this.f666) {
        }
        return (C4988) this.f664;
    }

    @Override // p020.InterfaceC6929
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC6930 mo942() {
        return (C6928) this.f665;
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0923 mo943() {
        return ((InterfaceC4966) this.f663).mo943();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ColorStateList m945(int i) {
        int resourceId;
        ColorStateList colorStateListM13478;
        TypedArray typedArray = (TypedArray) this.f665;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM13478 = AbstractC8482.m13478((Context) this.f664, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM13478;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC2436 m946() {
        return ((C2342) this.f663).f4631.f4633;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable m947(int i) {
        int resourceId;
        Drawable drawableM1193;
        if (!((TypedArray) this.f665).hasValue(i) || (resourceId = ((TypedArray) this.f665).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0977 c0977M1100 = C0977.m1100();
        Context context = (Context) this.f664;
        synchronized (c0977M1100) {
            drawableM1193 = c0977M1100.f917.m1193(context, resourceId, true);
        }
        return drawableM1193;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Typeface m948(int i, int i2, C1079 c1079) {
        int resourceId = ((TypedArray) this.f665).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f663) == null) {
            this.f663 = new TypedValue();
        }
        Context context = (Context) this.f664;
        TypedValue typedValue = (TypedValue) this.f663;
        ThreadLocal threadLocal = AbstractC8475.f21101;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC8475.m13471(context, resourceId, typedValue, i2, c1079, true, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC8725 m949() {
        return ((C2342) this.f663).f4631.f4635;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Drawable m950(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f665;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC4765.m8871((Context) this.f664, resourceId);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5710 m951(C5282 c5282, C7863 c7863, AbstractC5710 abstractC5710) {
        C5706 c5706M10358;
        boolean z;
        boolean z2;
        InterfaceC5705 interfaceC5705Mo9560;
        InterfaceC5705 interfaceC5705;
        Iterator it;
        List list;
        boolean z3;
        AbstractC5702 c5717;
        Object next;
        List listM9356;
        C0955 c0955;
        InterfaceC5705 interfaceC57052;
        AbstractC5702 abstractC5702M12927;
        AbstractC7818 abstractC7818M12598;
        Variance varianceMo9562;
        C0955 c09552 = this;
        C7863 c78632 = c7863;
        TypeUsage typeUsage = c78632.f19224;
        JavaTypeFlexibility javaTypeFlexibility = c78632.f19223;
        boolean z4 = c78632.f19221;
        C1171 c1171 = (C1171) c09552.f664;
        C7870 c7870 = (C7870) c1171.f1440;
        if (abstractC5710 == null || (c5706M10358 = abstractC5710.mo10282()) == null) {
            c5706M10358 = AbstractC5725.m10358(new C7868(c1171, c5282, false));
        }
        InterfaceC7856 interfaceC7856 = c5282.f13423;
        Type type = c5282.f13424;
        if (interfaceC7856 == null) {
            C5043.m9155(type, "Type not found: ");
            return null;
        }
        boolean z5 = false;
        InterfaceC5705 interfaceC57053 = null;
        if (interfaceC7856 instanceof C5284) {
            C5284 c5284 = (C5284) interfaceC7856;
            z2 = true;
            C5519 c5519M9549 = c5284.m9549();
            if (c5519M9549 == null) {
                throw new AssertionError("Class type should have a FQ name: " + interfaceC7856);
            }
            if (z4 && c5519M9549.equals(AbstractC7861.f19213)) {
                C7362 c7362 = c7870.f19251;
                C7361 c7361 = c7362.f18274;
                InterfaceC5920 interfaceC5920 = C7362.f18272[0];
                c7361.getClass();
                interfaceC5920.getClass();
                C5523 c5523M9889 = C5523.m9889(AbstractC5894.m10594(interfaceC5920.getName()));
                z = z4;
                InterfaceC5309 interfaceC5309Mo9714 = ((InterfaceC8083) c7362.f18275.getValue()).mo9714(c5523M9889, NoLookupLocation.FROM_REFLECTION);
                abstractC7818M12598 = interfaceC5309Mo9714 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9714 : null;
                if (abstractC7818M12598 == null) {
                    abstractC7818M12598 = c7362.f18276.m1527(new C5520(AbstractC7355.f18199, c5523M9889), AbstractC7176.m12487(1));
                }
            } else {
                z = z4;
                AbstractC7359 abstractC7359Mo9620 = c7870.f19250.mo9620();
                abstractC7359Mo9620.getClass();
                C5520 c5520M9505 = C5242.m9505(c5519M9549);
                abstractC7818M12598 = c5520M9505 != null ? abstractC7359Mo9620.m12598(c5520M9505.m9886()) : null;
                if (abstractC7818M12598 == null) {
                    abstractC7818M12598 = null;
                } else if (C5242.f13338.containsKey(AbstractC7699.m12660(abstractC7818M12598))) {
                    if (javaTypeFlexibility == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || typeUsage == TypeUsage.SUPERTYPE) {
                        abstractC7818M12598 = C5241.m9497(abstractC7818M12598);
                    } else {
                        AbstractC5269 abstractC5269 = (AbstractC5269) AbstractC5176.m9371(c5282.m9546());
                        C5259 c5259 = abstractC5269 instanceof C5259 ? (C5259) abstractC5269 : null;
                        if (c5259 != null && c5259.m9529() != null) {
                            Type[] upperBounds = c5259.f13390.getUpperBounds();
                            upperBounds.getClass();
                            if (AbstractC5227.m9466(AbstractC5179.m9387(upperBounds), Object.class)) {
                                C5518 c5518M12660 = AbstractC7699.m12660(abstractC7818M12598);
                                String str = C5242.f13332;
                                C5519 c5519M9506 = C5242.m9506(c5518M12660);
                                if (c5519M9506 == null) {
                                    C9620.m15031(abstractC7818M12598, "Given class ", " is not a read-only collection");
                                    return null;
                                }
                                AbstractC7818 abstractC7818M125982 = AbstractC5605.m10058(abstractC7818M12598).m12598(c5519M9506);
                                abstractC7818M125982.getClass();
                                List parameters = abstractC7818M125982.mo9560().getParameters();
                                parameters.getClass();
                                InterfaceC5295 interfaceC5295 = (InterfaceC5295) AbstractC5176.m9371(parameters);
                                if (interfaceC5295 != null && (varianceMo9562 = interfaceC5295.mo9562()) != null && varianceMo9562 != Variance.OUT_VARIANCE) {
                                }
                            }
                        }
                    }
                }
            }
            if (abstractC7818M12598 == null) {
                C6686 c6686 = c7870.f19254;
                c6686.getClass();
                C6686 c66862 = (C6686) c6686.f16359;
                if (c66862 == null) {
                    AbstractC5227.m9467("resolver");
                    throw null;
                }
                abstractC7818M12598 = c66862.m11819(c5284);
            }
            if (abstractC7818M12598 == null || (interfaceC5705Mo9560 = abstractC7818M12598.mo9560()) == null) {
                C5043.m9155(type, "Type not found: ");
                return null;
            }
        } else {
            z = z4;
            z2 = true;
            if (!(interfaceC7856 instanceof C5270)) {
                C8376.m13333(interfaceC7856, "Unknown classifier kind: ");
                return null;
            }
            InterfaceC5295 interfaceC5295Mo5503 = ((InterfaceC7866) c09552.f665).mo5503((C5270) interfaceC7856);
            interfaceC5705Mo9560 = interfaceC5295Mo5503 != null ? interfaceC5295Mo5503.mo9560() : null;
        }
        if (interfaceC5705Mo9560 == null) {
            return null;
        }
        boolean z6 = (javaTypeFlexibility == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || z || typeUsage == TypeUsage.SUPERTYPE) ? false : z2;
        if (AbstractC5227.m9466(abstractC5710 != null ? abstractC5710.mo10281() : null, interfaceC5705Mo9560) && !c5282.m9545() && z6) {
            return abstractC5710.mo10290(z2);
        }
        boolean z7 = z2;
        if (!c5282.m9545()) {
            if (c5282.m9546().isEmpty()) {
                List parameters2 = interfaceC5705Mo9560.getParameters();
                parameters2.getClass();
                if (parameters2.isEmpty()) {
                    z7 = false;
                }
            }
        }
        List<InterfaceC5295> parameters3 = interfaceC5705Mo9560.getParameters();
        parameters3.getClass();
        if (!z7) {
            interfaceC5705 = interfaceC5705Mo9560;
            if (parameters3.size() == c5282.m9546().size()) {
                C5174 c5174M9346 = AbstractC5176.m9346(c5282.m9546());
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(c5174M9346, 10));
                Iterator it2 = c5174M9346.iterator();
                while (true) {
                    C5170 c5170 = (C5170) it2;
                    if (!c5170.f13264.hasNext()) {
                        listM9356 = AbstractC5176.m9356(arrayList);
                        break;
                    }
                    C5173 c5173 = (C5173) c5170.next();
                    int i = c5173.f13269;
                    AbstractC5269 abstractC52692 = (AbstractC5269) c5173.f13268;
                    parameters3.size();
                    InterfaceC5295 interfaceC52952 = (InterfaceC5295) parameters3.get(i);
                    C7863 c7863M14920 = C9496.m14920(TypeUsage.COMMON, z5, null, 7);
                    interfaceC52952.getClass();
                    if (abstractC52692 instanceof C5259) {
                        C5259 c52592 = (C5259) abstractC52692;
                        AbstractC5269 abstractC5269M9529 = c52592.m9529();
                        Type[] upperBounds2 = c52592.f13390.getUpperBounds();
                        upperBounds2.getClass();
                        Variance variance = !AbstractC5227.m9466(AbstractC5179.m9387(upperBounds2), Object.class) ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
                        if (abstractC5269M9529 == null || !(interfaceC52952.mo9562() == Variance.INVARIANT || variance == interfaceC52952.mo9562())) {
                            it = it2;
                            list = parameters3;
                            z3 = false;
                            c5717 = AbstractC5749.m10410(interfaceC52952, c7863M14920);
                        } else {
                            if (c52592.m9529() == null) {
                                C6755.m11869("Nullability annotations on unbounded wildcards aren't supported");
                                return null;
                            }
                            Iterator it3 = new C7868(c1171, c52592, false).iterator();
                            while (true) {
                                C5948 c5948 = (C5948) it3;
                                if (!c5948.hasNext()) {
                                    it = it2;
                                    list = parameters3;
                                    next = null;
                                    break;
                                }
                                next = c5948.next();
                                InterfaceC7307 interfaceC7307 = (InterfaceC7307) next;
                                C5519[] c5519Arr = AbstractC5454.f13875;
                                it = it2;
                                int length = c5519Arr.length;
                                list = parameters3;
                                int i2 = 0;
                                while (i2 < length) {
                                    int i3 = length;
                                    int i4 = i2;
                                    if (AbstractC5227.m9466(interfaceC7307.mo9737(), c5519Arr[i2])) {
                                        break;
                                    }
                                    i2 = i4 + 1;
                                    length = i3;
                                }
                                it2 = it;
                                parameters3 = list;
                            }
                            InterfaceC7307 interfaceC73072 = (InterfaceC7307) next;
                            z3 = false;
                            AbstractC5714 abstractC5714M917 = c09552.m917(abstractC5269M9529, C9496.m14920(TypeUsage.COMMON, false, null, 7));
                            if (interfaceC73072 != null) {
                                ArrayList arrayListM9348 = AbstractC5176.m9348(abstractC5714M917.getAnnotations(), interfaceC73072);
                                abstractC5714M917 = AbstractC3738.m6901(abstractC5714M917, arrayListM9348.isEmpty() ? C7311.f18113 : new C7314(0, arrayListM9348));
                            }
                            c5717 = AbstractC3738.m6883(abstractC5714M917, variance, interfaceC52952);
                        }
                    } else {
                        it = it2;
                        list = parameters3;
                        z3 = false;
                        c5717 = new C5717(c09552.m917(abstractC52692, c7863M14920), Variance.INVARIANT);
                    }
                    arrayList.add(c5717);
                    it2 = it;
                    parameters3 = list;
                    z5 = z3;
                }
            } else {
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(parameters3, 10));
                for (InterfaceC5295 interfaceC52953 : parameters3) {
                    ErrorTypeKind errorTypeKind = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                    String strM9894 = interfaceC52953.getName().m9894();
                    strM9894.getClass();
                    arrayList2.add(new C5717(C8069.m13029(errorTypeKind, strM9894)));
                }
                listM9356 = AbstractC5176.m9356(arrayList2);
            }
        } else {
            ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(parameters3, 10));
            for (InterfaceC5295 interfaceC52954 : parameters3) {
                if (AbstractC3738.m6865(interfaceC52954, interfaceC57053, c78632.f19220)) {
                    abstractC5702M12927 = AbstractC5749.m10410(interfaceC52954, c78632);
                    c0955 = c09552;
                    interfaceC57052 = interfaceC5705Mo9560;
                } else {
                    InterfaceC5705 interfaceC57054 = interfaceC5705Mo9560;
                    c0955 = c09552;
                    interfaceC57052 = interfaceC57054;
                    abstractC5702M12927 = C7859.m12927(interfaceC52954, C7863.m12928(c7863, null, c5282.m9545(), null, null, 59), (C5703) c0955.f663, new C5712(c7870.f19239, new C7862(c09552, interfaceC52954, c7863, interfaceC57054, c5282)));
                }
                arrayList3.add(abstractC5702M12927);
                c78632 = c7863;
                c09552 = c0955;
                interfaceC5705Mo9560 = interfaceC57052;
                interfaceC57053 = null;
            }
            interfaceC5705 = interfaceC5705Mo9560;
            listM9356 = arrayList3;
        }
        return AbstractC5725.m10377(listM9356, c5706M10358, interfaceC5705, z6);
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean mo952() {
        return ((InterfaceC4966) this.f663).mo952();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object m953() {
        long jM2751 = AbstractC2089.m2751();
        if (jM2751 == AbstractC2083.f3968) {
            return this.f663;
        }
        C2087 c2087 = (C2087) ((AtomicReference) this.f664).get();
        int iM2745 = c2087.m2745(jM2751);
        if (iM2745 >= 0) {
            return c2087.f3983[iM2745];
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object m954(String str) {
        try {
            return ((JSONObject) this.f663).get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public Bitmap m955(BitmapFactory.Options options) throws Throwable {
        switch (this.f666) {
            case 11:
                return AbstractC3870.m7138(new C8814(AbstractC8813.m14023((ByteBuffer) this.f664)), options, this);
            case 12:
                C3865 c3865 = (C3865) ((C3800) this.f664).f9730;
                c3865.reset();
                return AbstractC3870.m7138(c3865, options, this);
            default:
                FileDescriptor fileDescriptor = ((C3800) this.f663).m7000().getFileDescriptor();
                int i = Build.VERSION.SDK_INT;
                Bitmap bitmapM7136 = null;
                if (i == 34) {
                    if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC3870.f10018.get()).booleanValue() : false) && AbstractC3870.m7137(this)) {
                        Bitmap.Config config = options.inPreferredConfig;
                        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                        AbstractC8818.m14030("", config == config2);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        try {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            if (bitmapDecodeFileDescriptor == null) {
                                if (bitmapDecodeFileDescriptor != null) {
                                }
                                options.inPreferredConfig = config2;
                                return bitmapM7136;
                            }
                            try {
                                bitmapM7136 = AbstractC3870.m7136(bitmapDecodeFileDescriptor);
                            } catch (Throwable th) {
                                th = th;
                                bitmapM7136 = bitmapDecodeFileDescriptor;
                                if (bitmapM7136 != null) {
                                    bitmapM7136.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                            break;
                            bitmapDecodeFileDescriptor.recycle();
                            options.inPreferredConfig = config2;
                            return bitmapM7136;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC5084 mo956() {
        return ((InterfaceC4959) this.f663).mo956();
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean mo957() {
        return ((InterfaceC4966) this.f663).mo957();
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo958(C8926 c8926) {
        c8926.getClass();
        ((InterfaceC4966) this.f663).mo958(c8926);
    }

    @Override // com.typesafe.config.impl.InterfaceC4677
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public AbstractC4675 mo860(AbstractC4675 abstractC4675, String str) {
        C4690 c4690 = (C4690) this.f664;
        C4681 c4681 = (C4681) this.f663;
        C4679 c4679 = (C4679) this.f665;
        C4690 c46902 = c4679.f12415;
        if (!(c46902 != null)) {
            C4684 c4684M8783 = c4679.m8782(null).m8783(abstractC4675, c4681);
            this.f665 = c4684M8783.f12424.m8782(null).m8782(c4690);
            return c4684M8783.f12423;
        }
        if (str.equals(c46902.f12431)) {
            C4679 c46792 = (C4679) this.f665;
            C4690 c46903 = c46792.f12415.f12430;
            if (c46903 != null) {
                C4684 c4684M87832 = c46792.m8782(c46903).m8783(abstractC4675, c4681);
                this.f665 = c4684M87832.f12424.m8782(null).m8782(c4690);
                return c4684M87832.f12423;
            }
        }
        return abstractC4675;
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8926 mo959() {
        return ((InterfaceC4966) this.f663).mo959();
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC8924 mo960() {
        return ((InterfaceC4959) this.f663).mo960();
    }

    @Override // p020.InterfaceC6929
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public InterfaceC6932 mo961() {
        return (C6936) this.f663;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public void m962(C8707 c8707) {
        ArrayList arrayList = (ArrayList) this.f664;
        arrayList.clear();
        int size = c8707.f22033.size();
        for (int i = 0; i < size; i++) {
            C8708 c8708 = (C8708) c8707.f22033.get(i);
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8708.f22040;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
            if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour2) {
                arrayList.add(c8708);
            }
        }
        c8707.f22035.f6682 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public void m963() {
        C1083 c1083 = (C1083) this.f664;
        String str = (String) this.f665;
        List list = (List) c1083.m1318(str);
        if (list != null) {
            list.remove((InterfaceC7372) this.f663);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c1083.m1315(str, list);
    }

    @Override // io.ktor.server.response.InterfaceC4966
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4967 mo940() {
        return (C4967) this.f665;
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: getCookies, reason: collision with other method in class */
    public C4965 mo964getCookies() {
        return ((InterfaceC4966) this.f663).mo964getCookies();
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC8941 mo944() {
        return ((InterfaceC4959) this.f663).mo944();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    private final void m912() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    private final void m913() {
    }

    public C0955(String str, String str2) {
        this.f666 = 20;
        this.f664 = str2;
        this.f665 = str;
        try {
            this.f663 = InterfaceC3749.m6934(AbstractC5894.m10587(m929()));
        } catch (Exception unused) {
            this.f663 = new JSONObject();
        }
    }

    public C0955(C5483 c5483, C7800 c7800) {
        this.f666 = 23;
        this.f664 = c5483;
        this.f665 = c7800;
        this.f663 = new ConcurrentHashMap();
    }

    public C0955(int i, int i2) {
        this.f666 = 3;
        this.f664 = AbstractC2202.m3037(i);
        this.f665 = AbstractC2202.m3037(i2);
        this.f663 = new C1531(i, 90, 200);
    }

    public C0955(C1171 c1171) {
        this.f666 = 19;
        this.f664 = c1171;
        C6399 c6399 = (C6399) c1171.f1439;
        c6399.getClass();
        this.f665 = new C6928(c6399);
        C6400 c6400 = (C6400) c1171.f1438;
        c6400.getClass();
        this.f663 = new C6936(c6400);
    }

    public C0955(C7348 c7348, Method[] methodArr, Method method) {
        this.f666 = 21;
        c7348.getClass();
        this.f664 = c7348;
        this.f665 = methodArr;
        this.f663 = method;
    }

    public C0955(C1171 c1171, InterfaceC7866 interfaceC7866) {
        this.f666 = 25;
        interfaceC7866.getClass();
        this.f664 = c1171;
        this.f665 = interfaceC7866;
        this.f663 = new C5703(new C7859());
    }

    public C0955(C4988 c4988, C4962 c4962, InterfaceC4959 interfaceC4959) {
        this.f666 = 15;
        c4962.getClass();
        interfaceC4959.getClass();
        this.f664 = c4988;
        this.f665 = c4962;
        this.f663 = interfaceC4959;
    }

    public C0955(C4988 c4988, C4967 c4967, InterfaceC4966 interfaceC4966) {
        this.f666 = 16;
        c4967.getClass();
        interfaceC4966.getClass();
        this.f664 = c4988;
        this.f665 = c4967;
        this.f663 = interfaceC4966;
    }

    public C0955(InterfaceC5328 interfaceC5328, List list, C0955 c0955) {
        this.f666 = 17;
        interfaceC5328.getClass();
        list.getClass();
        this.f664 = interfaceC5328;
        this.f665 = list;
        this.f663 = c0955;
    }

    public C0955(C2342 c2342) {
        this.f666 = 6;
        this.f663 = c2342;
        this.f664 = new C0960(this, 21);
    }

    public C0955(Context context, TypedArray typedArray) {
        this.f666 = 1;
        this.f664 = context;
        this.f665 = typedArray;
    }

    public C0955(Context context, LocationManager locationManager) {
        this.f666 = 0;
        this.f663 = new C0956();
        this.f664 = context;
        this.f665 = locationManager;
    }

    public C0955(C8707 c8707) {
        this.f666 = 7;
        this.f664 = new ArrayList();
        this.f665 = new C2982();
        this.f663 = c8707;
    }

    public C0955(C1171 c1171, C7790 c7790, C8522 c8522, Set set) {
        this.f666 = 28;
        this.f664 = c7790;
        this.f665 = c1171;
        this.f663 = c8522;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m933(str, 0, str.length(), 1, true, new C5317(str, 4));
        }
    }

    public C0955(List list, EmptySet emptySet, EmptyList emptyList, EmptySet emptySet2) {
        this.f666 = 24;
        emptySet.getClass();
        emptyList.getClass();
        emptySet2.getClass();
        this.f664 = list;
        this.f665 = emptySet;
        this.f663 = emptyList;
    }

    public C0955(C2803 c2803, C0955 c0955) {
        this.f666 = 29;
        this.f664 = c2803;
        this.f665 = c0955;
        this.f663 = c2803.f6197;
    }

    public C0955(C4363 c4363, ArrayList arrayList, C3806 c3806) {
        this.f666 = 12;
        AbstractC8818.m14028(c3806, "Argument must not be null");
        this.f665 = c3806;
        AbstractC8818.m14028(arrayList, "Argument must not be null");
        this.f663 = arrayList;
        this.f664 = new C3800(c4363, c3806);
    }

    public C0955(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C3806 c3806) {
        this.f666 = 13;
        AbstractC8818.m14028(c3806, "Argument must not be null");
        this.f664 = c3806;
        AbstractC8818.m14028(arrayList, "Argument must not be null");
        this.f665 = arrayList;
        this.f663 = new C3800(parcelFileDescriptor);
    }

    public /* synthetic */ C0955(Object obj, Object obj2, Object obj3, int i) {
        this.f666 = i;
        this.f664 = obj;
        this.f665 = obj2;
        this.f663 = obj3;
    }

    public C0955(C4679 c4679, C4681 c4681) {
        this.f666 = 14;
        this.f665 = c4679;
        this.f663 = c4681;
        this.f664 = c4679.f12415;
    }

    public C0955(C6686 c6686) {
        this.f666 = 27;
        this.f664 = c6686;
        this.f665 = new ReentrantLock();
        this.f663 = new WeakHashMap();
    }

    public C0955(C3840 c3840, C3880 c3880, C3831 c3831) {
        this.f666 = 10;
        this.f663 = c3840;
        this.f665 = c3880;
        this.f664 = c3831;
    }
}
