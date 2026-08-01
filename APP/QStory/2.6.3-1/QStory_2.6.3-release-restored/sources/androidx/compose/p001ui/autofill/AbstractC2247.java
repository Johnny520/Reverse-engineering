package androidx.compose.p001ui.autofill;

import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C0984;
import androidx.collection.C1083;
import androidx.collection.C1089;
import androidx.collection.C1091;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.platform.AbstractC2751;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2789;
import androidx.compose.p001ui.semantics.C2791;
import androidx.compose.p001ui.semantics.InterfaceC2784;
import androidx.compose.p001ui.spatial.C2796;
import androidx.compose.p001ui.state.ToggleableState;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.runtime.collection.C2059;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import p068.InterfaceC7381;
import p191.AbstractC8568;

/* JADX INFO: renamed from: androidx.compose.ui.autofill.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2247 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175 A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x0175: PHI (r6v33 androidx.compose.ui.autofill.飘花落叶言子楪苏兰哲世) = (r6v32 androidx.compose.ui.autofill.飘花落叶言子楪苏兰哲世), (r6v34 androidx.compose.ui.autofill.飘花落叶言子楪苏兰哲世) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r21v7 androidx.compose.ui.state.ToggleableState) = (r21v6 androidx.compose.ui.state.ToggleableState), (r21v8 androidx.compose.ui.state.ToggleableState) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r22v5 androidx.compose.ui.text.飘花落叶言子楪苏世哲兰) = (r22v4 androidx.compose.ui.text.飘花落叶言子楪苏世哲兰), (r22v6 androidx.compose.ui.text.飘花落叶言子楪苏世哲兰) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r23v5 androidx.compose.ui.autofill.飘花落叶言子楪世兰苏哲) = (r23v4 androidx.compose.ui.autofill.飘花落叶言子楪世兰苏哲), (r23v6 androidx.compose.ui.autofill.飘花落叶言子楪世兰苏哲) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r24v6 androidx.compose.ui.autofill.飘花落叶言子楪哲世兰苏) = (r24v5 androidx.compose.ui.autofill.飘花落叶言子楪哲世兰苏), (r24v7 androidx.compose.ui.autofill.飘花落叶言子楪哲世兰苏) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r26v8 androidx.compose.ui.semantics.飘花落叶言子楪苏世兰哲) = (r26v7 androidx.compose.ui.semantics.飘花落叶言子楪苏世兰哲), (r26v9 androidx.compose.ui.semantics.飘花落叶言子楪苏世兰哲) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004f, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3103(final ViewStructure viewStructure, InterfaceC2784 interfaceC2784, AutofillId autofillId, String str, C2796 c2796) {
        int i;
        char c;
        long j;
        long j2;
        long j3;
        boolean zBooleanValue;
        ToggleableState toggleableState;
        C2902 c2902;
        C2239 c2239;
        C2789 c2789;
        InterfaceC2251 interfaceC2251;
        boolean z;
        InterfaceC2244 interfaceC2244;
        Boolean bool;
        boolean z2;
        Integer num;
        InterfaceC2251 interfaceC22512;
        int i2;
        List list;
        boolean z3;
        String strM4180;
        String[] strArrM3104;
        String[] strArrM31042;
        C1083 c1083;
        long[] jArr;
        int i3;
        InterfaceC2251 interfaceC22513;
        long[] jArr2;
        C1083 c10832;
        ToggleableState toggleableState2;
        C2902 c29022;
        C2239 c22392;
        C2789 c27892;
        C2782 c2782 = AbstractC2778.f6079;
        C2782 c27822 = AbstractC2794.f6138;
        C2583 c2583 = (C2583) interfaceC2784;
        C2791 c2791M3814 = c2583.m3814();
        int i4 = 8;
        if (c2791M3814 == null || (c10832 = c2791M3814.f6124) == null) {
            i = 2;
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            toggleableState = null;
            c2902 = null;
            c2239 = null;
            c2789 = null;
            interfaceC2251 = null;
            z = false;
            interfaceC2244 = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            Object[] objArr = c10832.f1225;
            j = 128;
            Object[] objArr2 = c10832.f1224;
            long[] jArr3 = c10832.f1226;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                zBooleanValue = true;
                c = 7;
                int i5 = 0;
                interfaceC2251 = null;
                j2 = 255;
                z = false;
                toggleableState2 = null;
                c29022 = null;
                c22392 = null;
                interfaceC2244 = null;
                bool = null;
                c27892 = null;
                z2 = false;
                num = null;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr[i8];
                                Object obj2 = objArr2[i8];
                                C2782 c27823 = (C2782) obj;
                                if (AbstractC5227.m9466(c27823, AbstractC2778.f6081)) {
                                    obj2.getClass();
                                    interfaceC2251 = (InterfaceC2251) obj2;
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6079)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) AbstractC5176.m9374((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6089)) {
                                    obj2.getClass();
                                    interfaceC2244 = (InterfaceC2244) obj2;
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6080)) {
                                    obj2.getClass();
                                    c22392 = (C2239) obj2;
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6071)) {
                                    obj2.getClass();
                                    c29022 = (C2902) obj2;
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6095)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6057)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6058)) {
                                    z2 = true;
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6090)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6066)) {
                                    obj2.getClass();
                                    c27892 = (C2789) obj2;
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6068)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (AbstractC5227.m9466(c27823, AbstractC2778.f6059)) {
                                    obj2.getClass();
                                    toggleableState2 = (ToggleableState) obj2;
                                } else if (AbstractC5227.m9466(c27823, AbstractC2794.f6137)) {
                                    viewStructure.setClickable(true);
                                } else if (AbstractC5227.m9466(c27823, AbstractC2794.f6136)) {
                                    viewStructure.setLongClickable(true);
                                } else if (AbstractC5227.m9466(c27823, AbstractC2794.f6141)) {
                                    viewStructure.setFocusable(true);
                                } else if (AbstractC5227.m9466(c27823, AbstractC2794.f6153)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            } else {
                c = 7;
                j2 = 255;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                interfaceC2251 = null;
                z = false;
                toggleableState2 = null;
                c29022 = null;
                c22392 = null;
                interfaceC2244 = null;
                bool = null;
                c27892 = null;
                z2 = false;
                num = null;
            }
            toggleableState = toggleableState2;
            c2902 = c29022;
            c2239 = c22392;
            c2789 = c27892;
        }
        C2791 c2791M38142 = c2583.m3814();
        if (c2791M38142 != null && c2791M38142.f6123 && !c2791M38142.f6121) {
            c2791M38142 = c2791M38142.m4232();
            C1091 c1091 = new C1091(((C2059) ((C1089) c2583.m3817()).f1239).f3865);
            c1091.m1338(c2583.m3817());
            while (c1091.m1438()) {
                C2583 c25832 = (C2583) ((InterfaceC2784) c1091.m1337(c1091.f1349 - 1));
                C2791 c2791M38143 = c25832.m3814();
                if (c2791M38143 != null && !c2791M38143.f6123) {
                    c2791M38142.m4230(c2791M38143);
                    if (!c2791M38143.f6121) {
                        c1091.m1338(c25832.m3817());
                    }
                }
            }
        }
        if (c2791M38142 == null || (c1083 = c2791M38142.f6124) == null) {
            interfaceC22512 = interfaceC2251;
            i2 = 1;
            list = null;
        } else {
            Object[] objArr3 = c1083.f1225;
            Object[] objArr4 = c1083.f1224;
            long[] jArr4 = c1083.f1226;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                i2 = 1;
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr3[i14];
                                Object obj4 = objArr4[i14];
                                interfaceC22513 = interfaceC2251;
                                C2782 c27824 = (C2782) obj3;
                                jArr2 = jArr4;
                                if (AbstractC5227.m9466(c27824, AbstractC2778.f6097)) {
                                    viewStructure.setEnabled(false);
                                } else if (AbstractC5227.m9466(c27824, AbstractC2778.f6063)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                interfaceC22513 = interfaceC2251;
                                jArr2 = jArr4;
                            }
                            j5 >>= i10;
                            i13++;
                            jArr4 = jArr2;
                            interfaceC2251 = interfaceC22513;
                        }
                        interfaceC22512 = interfaceC2251;
                        jArr = jArr4;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        interfaceC22512 = interfaceC2251;
                        jArr = jArr4;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    jArr4 = jArr;
                    interfaceC2251 = interfaceC22512;
                }
            }
        }
        Integer numValueOf = Integer.valueOf(c2583.f5468);
        if (c2583.m3816() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        Integer numValueOf2 = interfaceC22512 != null ? Integer.valueOf(((C2241) interfaceC22512).f4406) : z ? Integer.valueOf(i2) : toggleableState != null ? Integer.valueOf(i) : null;
        if (numValueOf2 != null) {
            viewStructure.setAutofillType(numValueOf2.intValue());
        }
        if (c2902 != null) {
            String strM10712 = c2902.f6474;
            if (strM10712.length() >= 5000) {
                strM10712 = (Character.isHighSurrogate(strM10712.charAt(4999)) && Character.isLowSurrogate(strM10712.charAt(5000))) ? AbstractC5976.m10712(4999, strM10712) : AbstractC5976.m10712(5000, strM10712);
            }
            viewStructure.setAutofillValue(AutofillValue.forText(strM10712));
        }
        if (c2239 != null) {
            viewStructure.setAutofillValue(c2239.f4404);
        }
        if (interfaceC2244 != null && (strArrM31042 = m3104(interfaceC2244)) != null) {
            viewStructure.setAutofillHints(strArrM31042);
        }
        C0984 c0984 = c2796.f6168;
        int i15 = c2583.f5468;
        final C2249 c2249 = C2249.f4423;
        c0984.m1123(new InterfaceC7381() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p068.InterfaceC7381
            public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                invoke(((Number) obj5).intValue(), ((Number) obj6).intValue(), ((Number) obj7).intValue(), ((Number) obj8).intValue());
                return C6008.f15084;
            }

            public final void invoke(int i16, int i17, int i18, int i19) {
                c2249.getClass();
                viewStructure.setDimens(i16, i17, 0, 0, i18 - i16, i19 - i17);
            }
        }, i15);
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (toggleableState != null) {
            viewStructure.setCheckable(i2);
            viewStructure.setChecked(toggleableState == ToggleableState.f12On);
        } else if (bool != null && (c2789 == null || c2789.f6118 != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        InterfaceC2244.f4417.getClass();
        String str2 = (String) AbstractC5179.m9384(m3104(C2245.f4420));
        if (interfaceC2244 != null && (strArrM3104 = m3104(interfaceC2244)) != null) {
            boolean zM9396 = AbstractC5179.m9396(str2, strArrM3104);
            z3 = true;
            boolean z4 = zM9396;
            boolean z5 = (!z2 || z4) ? z3 : false;
            viewStructure.setDataIsSensitive((!z5 || zBooleanValue) ? z3 : false);
            viewStructure.setVisibility(c2583.f5439.f5630.m3944() ? 4 : 0);
            if (list != null) {
                int size = list.size();
                String strM708 = "";
                for (int i16 = 0; i16 < size; i16++) {
                    strM708 = AbstractC0900.m708(AbstractC0900.m700(strM708), ((C2902) list.get(i16)).f6474, '\n');
                }
                viewStructure.setText(strM708);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((C1089) c2583.m3817()).isEmpty() && c2789 != null && (strM4180 = AbstractC2751.m4180(c2789.f6118)) != null) {
                viewStructure.setClassName(strM4180);
            }
            if (z) {
                return;
            }
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (z5) {
                viewStructure.setInputType(129);
                return;
            }
            return;
        }
        z3 = true;
        if (z2) {
        }
        viewStructure.setDataIsSensitive((!z5 || zBooleanValue) ? z3 : false);
        viewStructure.setVisibility(c2583.f5439.f5630.m3944() ? 4 : 0);
        if (list != null) {
        }
        if (((C1089) c2583.m3817()).isEmpty()) {
            viewStructure.setClassName(strM4180);
        }
        if (z) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String[] m3104(InterfaceC2244 interfaceC2244) {
        interfaceC2244.getClass();
        return (String[]) ((C2240) interfaceC2244).f4405.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2240 m3105(String str) {
        return new C2240(AbstractC8568.m13614(str));
    }
}
