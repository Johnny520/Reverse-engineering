package com.bumptech.glide;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.widget.ImageView;
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0171;
import androidx.collection.AbstractC0290;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2013;
import androidx.core.os.AbstractC2173;
import androidx.core.widget.AbstractC2291;
import bsh.C2632;
import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.ktor.server.request.InterfaceC4128;
import io.ktor.util.C4210;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.AbstractC5184;
import kotlin.C5178;
import kotlin.C5180;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.C5015;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4895;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4850;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.javaplugin.C5553;
import okio.ByteString;
import p005.C6101;
import p015.AbstractC6201;
import p015.C6204;
import p015.C6205;
import p017.C6235;
import p052.InterfaceC6553;
import p069.InterfaceC6895;
import p105.AbstractC7302;
import p105.C7300;
import p105.C7304;
import p126.C7422;
import p175.AbstractC7738;
import p236.AbstractC8114;
import p236.C8113;
import p251.SharedPreferencesC8175;
import p253.AbstractC8188;
import p284.InterfaceC8384;
import p284.InterfaceC8385;
import p331.C8799;
import p342.C8821;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3054 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static void m6573(InterfaceC8384 interfaceC8384, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        interfaceC8384.writeByte(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            interfaceC8384.writeByte((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static Object m6574(InterfaceC6553 interfaceC6553, Object obj, final InterfaceC4356 interfaceC4356) {
        interfaceC6553.getClass();
        final InterfaceC4359 context = interfaceC4356.getContext();
        Object obj2 = context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(interfaceC4356) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC4356);
                interfaceC4356.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                AbstractC5184.m10206(result);
                return result;
            }
        } : new ContinuationImpl(interfaceC4356, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC4356, context);
                interfaceC4356.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                AbstractC5184.m10206(result);
                return result;
            }
        };
        AbstractC4387.m8898(2, interfaceC6553);
        return interfaceC6553.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static void m6575(InterfaceC8384 interfaceC8384, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        interfaceC8384.writeByte(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            interfaceC8384.writeByte((byte) j);
            j >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static void m6576(InterfaceC8384 interfaceC8384, int i, long j) {
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((j >> 63) ^ j)) >> 3;
        interfaceC8384.writeByte(i | ((iNumberOfLeadingZeros - 1) << 5));
        while (iNumberOfLeadingZeros > 0) {
            interfaceC8384.writeByte((byte) j);
            j >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m6577(String str, String str2) throws Exception {
        File file = new File(str2);
        if (!file.exists() && !file.mkdir()) {
            throw new Exception(AbstractC3056.m6668(-3937556073515582887L));
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
            if (nextEntry.isDirectory()) {
                StringBuilder sbM149 = AbstractC0053.m149(str2);
                sbM149.append(File.separator);
                sbM149.append(nextEntry.getName());
                m6605(new File(sbM149.toString()));
            } else {
                StringBuilder sbM1492 = AbstractC0053.m149(str2);
                sbM1492.append(File.separator);
                sbM1492.append(nextEntry.getName());
                String string = sbM1492.toString();
                m6605(new File(string).getParentFile());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(string));
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = zipInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                }
                bufferedOutputStream.close();
            }
            zipInputStream.closeEntry();
        }
        zipInputStream.close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m6578(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final ExtractedText m6579(C2013 c2013) {
        ExtractedText extractedText = new ExtractedText();
        String str = c2013.f5946.f6128;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c2013.f5945;
        extractedText.selectionStart = C2035.m3747(j);
        extractedText.selectionEnd = C2035.m3740(j);
        extractedText.flags = !AbstractC5143.m10172(c2013.f5946.f6128, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C6204 m6580(C6204 c6204) {
        c6204.getClass();
        C6205 c6205M11649 = c6204.m11649();
        AbstractC6201 abstractC6201 = c6204.f17009;
        c6205M11649.f17023 = new C6235(abstractC6201.mo11108(), abstractC6201.mo11109());
        return c6205M11649.m11651();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C5178 m6581(String str) {
        str.getClass();
        AbstractC3056.m6677(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC4394.m8915(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iDigit) & 4294967295L) + j2;
            if (Long.compareUnsigned(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        return new C5178(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C5180 m6582(String str) {
        int i;
        AbstractC3056.m6677(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC4394.m8915(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new C5180(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p089.InterfaceC7183 m6583(androidx.compose.runtime.internal.C1245 r5, kotlin.reflect.InterfaceC5086 r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC3054.m6583(androidx.compose.runtime.internal.飘花落叶言子楪世苏兰哲, kotlin.reflect.飘花落叶言子世楪苏兰哲, boolean):飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Object m6584(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        Set setM8800;
        if (!z) {
            if (r4 != null && (setM8800 = AbstractC4343.m8800(AbstractC0455.m1157(set, r4))) != null) {
                set = setM8800;
            }
            return AbstractC4343.m8819(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (AbstractC4394.m8917(r1, r2) && AbstractC4394.m8917(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.types.AbstractC4881 m6585(kotlin.reflect.jvm.internal.impl.types.AbstractC4881 r7, java.util.ArrayList r8) {
        /*
            java.util.List r0 = r7.mo9736()
            r0.size()
            r8.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.AbstractC4344.m8832(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L19:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r8.next()
            飘花落叶言世苏楪子哲兰.飘花落叶言子楪世兰苏哲 r1 = (p105.C7300) r1
            r1.getClass()
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r3 = r1.f19447
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r4 = r1.f19448
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲苏兰楪 r1 = r1.f19449
            kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪哲世兰苏 r5 = kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4850.f14129
            r5.m9608(r4, r3)
            boolean r5 = kotlin.jvm.internal.AbstractC4394.m8917(r4, r3)
            if (r5 != 0) goto L91
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r1.mo9013()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r5 != r6) goto L43
            goto L91
        L43:
            boolean r5 = p049.AbstractC6529.m11975(r4)
            if (r5 == 0) goto L5f
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r1.mo9013()
            if (r5 == r6) goto L5f
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲 r2 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.mo9013()
            if (r4 != r1) goto L5b
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L5b:
            r2.<init>(r3, r4)
            goto L96
        L5f:
            if (r3 == 0) goto L8b
            boolean r2 = p049.AbstractC6529.m11979(r3)
            if (r2 == 0) goto L7b
            boolean r2 = r3.mo9735()
            if (r2 == 0) goto L7b
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲 r2 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.mo9013()
            if (r6 != r1) goto L77
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L77:
            r2.<init>(r4, r6)
            goto L96
        L7b:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲 r2 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.mo9013()
            if (r4 != r1) goto L87
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L87:
            r2.<init>(r3, r4)
            goto L96
        L8b:
            r7 = 140(0x8c, float:1.96E-43)
            p049.AbstractC6529.m11977(r7)
            throw r2
        L91:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲 r2 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲
            r2.<init>(r4)
        L96:
            r0.add(r2)
            goto L19
        L9b:
            r8 = 6
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r7 = kotlin.reflect.jvm.internal.impl.types.AbstractC4892.m9827(r7, r0, r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC3054.m6585(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲, java.util.ArrayList):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m6586(C0236 c0236, Object obj) {
        boolean zM872;
        long[] jArr = c0236.f881;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = c0236.f880[i4];
                        Object obj3 = c0236.f879[i4];
                        if (obj3 instanceof C0235) {
                            C0235 c0235 = (C0235) obj3;
                            c0235.m745(obj);
                            zM872 = c0235.m872();
                        } else {
                            zM872 = obj3 == obj;
                        }
                        if (zM872) {
                            c0236.m758(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final boolean m6587(C0236 c0236, Object obj, Object obj2) {
        Object objM756 = c0236.m756(obj);
        if (objM756 == null) {
            return false;
        }
        if (!(objM756 instanceof C0235)) {
            if (!objM756.equals(obj2)) {
                return false;
            }
            c0236.m757(obj);
            return true;
        }
        C0235 c0235 = (C0235) objM756;
        boolean zM745 = c0235.m745(obj2);
        if (zM745 && c0235.m872()) {
            c0236.m757(obj);
        }
        return zM745;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m6588(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static void m6589(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static void m6590(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC2291.m4294(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final void m6591(C7422 c7422, int i, Object obj, int i2, Object obj2) {
        int i3 = c7422.f20126 - c7422.f20124[c7422.f20123 - 1].f18408;
        Object[] objArr = c7422.f20125;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final void m6592(C7422 c7422, int i, Object obj) {
        c7422.f20125[(c7422.f20126 - c7422.f20124[c7422.f20123 - 1].f18408) + i] = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static void m6593(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC2173.m3946(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            AbstractC2173.m3946(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            m6589(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            m6589(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m6589(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        m6589(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static void m6594(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m6595(long j, C6101 c6101, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            C5919.m11249("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((ByteString) arrayList4.get(i8)).size() < i7) {
                C5919.m11249("Failed requirement.");
                return;
            }
        }
        ByteString byteString = (ByteString) arrayList.get(i2);
        ByteString byteString2 = (ByteString) arrayList4.get(i3 - 1);
        if (i7 == byteString.size()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            ByteString byteString3 = (ByteString) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            byteString = byteString3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (byteString.getByte(i7) == byteString2.getByte(i7)) {
            int iMin = Math.min(byteString.size(), byteString2.size());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && byteString.getByte(i11) == byteString2.getByte(i11); i11++) {
                i10++;
            }
            long j3 = (c6101.f16657 / 4) + j + 2 + ((long) i10) + 1;
            c6101.m11463(-i10);
            c6101.m11463(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c6101.m11463(byteString.getByte(i7) & Opcodes.CONST_METHOD_TYPE);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((ByteString) arrayList4.get(i4)).size()) {
                    c6101.m11463(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    C5919.m11250("Check failed.");
                    return;
                }
            }
            C6101 c61012 = new C6101();
            c6101.m11463(((int) ((c61012.f16657 / 4) + j3)) * (-1));
            m6595(j3, c61012, i12, arrayList4, i4, i3, arrayList5);
            c6101.mo11495(c61012);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((ByteString) arrayList4.get(i14 - 1)).getByte(i7) != ((ByteString) arrayList4.get(i14)).getByte(i7)) {
                i13++;
            }
        }
        long j4 = (c6101.f16657 / 4) + j + 2 + ((long) (i13 * 2));
        c6101.m11463(i13);
        c6101.m11463(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int i16 = ((ByteString) arrayList4.get(i15)).getByte(i7);
            if (i15 == i4 || i16 != ((ByteString) arrayList4.get(i15 - 1)).getByte(i7)) {
                c6101.m11463(i16 & Opcodes.CONST_METHOD_TYPE);
            }
        }
        C6101 c61013 = new C6101();
        int i17 = i4;
        while (i17 < i3) {
            byte b = ((ByteString) arrayList4.get(i17)).getByte(i7);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i19 = i3;
                    break;
                } else if (b != ((ByteString) arrayList4.get(i19)).getByte(i7)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i7 + 1 == ((ByteString) arrayList4.get(i17)).size()) {
                c6101.m11463(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
            } else {
                c6101.m11463(((int) ((c61013.f16657 / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
                m6595(j2, c61013, i7 + 1, arrayList, i17, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i17 = i6;
            arrayList5 = arrayList3;
        }
        c6101.mo11495(c61013);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7304 m6596(AbstractC4881 abstractC4881) {
        Variance varianceM9864;
        C7300 c7300;
        abstractC4881.getClass();
        if (abstractC4881.mo9778() instanceof AbstractC4895) {
            C7304 c7304M6596 = m6596(AbstractC4892.m9832(abstractC4881));
            C7304 c7304M65962 = m6596(AbstractC4892.m9813(abstractC4881));
            return new C7304(AbstractC4892.m9830(AbstractC4892.m9815(AbstractC4892.m9832((AbstractC4881) c7304M6596.f19453), AbstractC4892.m9813((AbstractC4881) c7304M65962.f19453)), abstractC4881), AbstractC4892.m9830(AbstractC4892.m9815(AbstractC4892.m9832((AbstractC4881) c7304M6596.f19452), AbstractC4892.m9813((AbstractC4881) c7304M65962.f19452)), abstractC4881));
        }
        InterfaceC4872 interfaceC4872Mo9732 = abstractC4881.mo9732();
        if (abstractC4881.mo9732() instanceof InterfaceC6895) {
            interfaceC4872Mo9732.getClass();
            AbstractC4869 abstractC4869Mo9730 = ((InterfaceC6895) interfaceC4872Mo9732).mo9730();
            AbstractC4881 abstractC4881Mo9751 = abstractC4869Mo9730.mo9751();
            abstractC4881Mo9751.getClass();
            AbstractC4881 abstractC4881M9855 = AbstractC4916.m9855(abstractC4881Mo9751, abstractC4881.mo9735());
            abstractC4881M9855.getClass();
            int i = AbstractC7302.f19450[abstractC4869Mo9730.mo9752().ordinal()];
            if (i == 2) {
                return new C7304(abstractC4881M9855, AbstractC7738.m13053(abstractC4881).m11990());
            }
            if (i != 3) {
                C5553.m10827(abstractC4869Mo9730, "Only nontrivial projections should have been captured, not: ");
                return null;
            }
            AbstractC4881 abstractC4881M98552 = AbstractC4916.m9855(AbstractC7738.m13053(abstractC4881).m11988(), abstractC4881.mo9735());
            abstractC4881M98552.getClass();
            return new C7304(abstractC4881M98552, abstractC4881M9855);
        }
        if (abstractC4881.mo9736().isEmpty() || abstractC4881.mo9736().size() != interfaceC4872Mo9732.getParameters().size()) {
            return new C7304(abstractC4881, abstractC4881);
        }
        ArrayList<C7300> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listMo9736 = abstractC4881.mo9736();
        List parameters = interfaceC4872Mo9732.getParameters();
        parameters.getClass();
        Iterator it = AbstractC4343.m8797(listMo9736, parameters).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    for (C7300 c73002 : arrayList) {
                        c73002.getClass();
                        if (!InterfaceC4850.f14129.m9608(c73002.f19448, c73002.f19447)) {
                            break;
                        }
                    }
                    z = false;
                }
                return new C7304(z ? AbstractC7738.m13053(abstractC4881).m11988() : m6585(abstractC4881, arrayList), m6585(abstractC4881, arrayList2));
            }
            Pair pair = (Pair) it.next();
            AbstractC4869 abstractC4869 = (AbstractC4869) pair.component1();
            InterfaceC4462 interfaceC4462 = (InterfaceC4462) pair.component2();
            interfaceC4462.getClass();
            Variance varianceMo9013 = interfaceC4462.mo9013();
            if (varianceMo9013 == null) {
                C4918.m9865(35);
                throw null;
            }
            if (abstractC4869 == null) {
                C4918.m9865(36);
                throw null;
            }
            C4918 c4918 = C4918.f14244;
            if (abstractC4869.mo9750()) {
                varianceM9864 = Variance.OUT_VARIANCE;
                if (varianceM9864 == null) {
                    C4918.m9865(37);
                    throw null;
                }
            } else {
                varianceM9864 = C4918.m9864(varianceMo9013, abstractC4869.mo9752());
            }
            int i2 = AbstractC7302.f19450[varianceM9864.ordinal()];
            if (i2 == 1) {
                AbstractC4881 abstractC4881Mo97512 = abstractC4869.mo9751();
                abstractC4881Mo97512.getClass();
                AbstractC4881 abstractC4881Mo97513 = abstractC4869.mo9751();
                abstractC4881Mo97513.getClass();
                c7300 = new C7300(interfaceC4462, abstractC4881Mo97512, abstractC4881Mo97513);
            } else if (i2 == 2) {
                AbstractC4881 abstractC4881Mo97514 = abstractC4869.mo9751();
                abstractC4881Mo97514.getClass();
                c7300 = new C7300(interfaceC4462, abstractC4881Mo97514, AbstractC4772.m9509(interfaceC4462).m11990());
            } else {
                if (i2 != 3) {
                    C4210.m8621();
                    return null;
                }
                AbstractC4877 abstractC4877M11988 = AbstractC4772.m9509(interfaceC4462).m11988();
                AbstractC4881 abstractC4881Mo97515 = abstractC4869.mo9751();
                abstractC4881Mo97515.getClass();
                c7300 = new C7300(interfaceC4462, abstractC4877M11988, abstractC4881Mo97515);
            }
            if (abstractC4869.mo9750()) {
                arrayList.add(c7300);
                arrayList2.add(c7300);
            } else {
                C7304 c7304M65963 = m6596(c7300.f19448);
                AbstractC4881 abstractC48812 = (AbstractC4881) c7304M65963.f19453;
                AbstractC4881 abstractC48813 = (AbstractC4881) c7304M65963.f19452;
                C7304 c7304M65964 = m6596(c7300.f19447);
                AbstractC4881 abstractC48814 = (AbstractC4881) c7304M65964.f19453;
                AbstractC4881 abstractC48815 = (AbstractC4881) c7304M65964.f19452;
                InterfaceC4462 interfaceC44622 = c7300.f19449;
                C7300 c73003 = new C7300(interfaceC44622, abstractC48813, abstractC48814);
                C7300 c73004 = new C7300(interfaceC44622, abstractC48812, abstractC48815);
                arrayList.add(c73003);
                arrayList2.add(c73004);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m6597(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m6598(C0236 c0236, Object obj, Object obj2) {
        int iM748 = c0236.m748(obj);
        boolean z = iM748 < 0;
        Object obj3 = z ? null : c0236.f879[iM748];
        if (obj3 != null) {
            if (obj3 instanceof C0235) {
                ((C0235) obj3).m740(obj2);
            } else if (obj3 != obj2) {
                C0235 c0235 = new C0235();
                c0235.m740(obj3);
                c0235.m740(obj2);
                obj2 = c0235;
            }
            obj2 = obj3;
        }
        if (!z) {
            c0236.f879[iM748] = obj2;
            return;
        }
        int i = ~iM748;
        c0236.f880[i] = obj;
        c0236.f879[i] = obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m6599(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(AbstractC4346.m8856(parameterTypes, "(", ")", C5015.f14449, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(AbstractC4430.m8986(returnType));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List m6600(InterfaceC4128 interfaceC4128) {
        interfaceC4128.getClass();
        String[] strArr = AbstractC8114.f22415;
        return AbstractC4343.m8817(AbstractC4921.m9883(m6609(interfaceC4128, "Accept-Encoding")), new C8113());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final boolean m6601(InterfaceC4472 interfaceC4472) {
        interfaceC4472.getClass();
        return interfaceC4472.getGetter() == null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static InterfaceC4356 m6602(InterfaceC4356 interfaceC4356) {
        InterfaceC4356<Object> interfaceC4356Intercepted;
        interfaceC4356.getClass();
        ContinuationImpl continuationImpl = interfaceC4356 instanceof ContinuationImpl ? (ContinuationImpl) interfaceC4356 : null;
        return (continuationImpl == null || (interfaceC4356Intercepted = continuationImpl.intercepted()) == null) ? interfaceC4356 : interfaceC4356Intercepted;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int m6603(InterfaceC8385 interfaceC8385, int i) {
        int i2 = 0;
        for (int i3 = i; i3 >= 0; i3--) {
            i2 = (i2 >>> 8) | ((interfaceC8385.readByte() & DefaultClassResolver.NAME) << 24);
        }
        return i2 >> ((3 - i) * 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static int m6604(InterfaceC8385 interfaceC8385, int i, boolean z) {
        int i2 = 0;
        if (z) {
            while (i >= 0) {
                i2 = ((interfaceC8385.readByte() & DefaultClassResolver.NAME) << 24) | (i2 >>> 8);
                i--;
            }
            return i2;
        }
        for (int i3 = i; i3 >= 0; i3--) {
            i2 = (i2 >>> 8) | ((interfaceC8385.readByte() & DefaultClassResolver.NAME) << 24);
        }
        return i2 >>> ((3 - i) * 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m6605(File file) {
        if (file == null || file.exists()) {
            return;
        }
        m6605(file.getParentFile());
        file.mkdir();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final String m6606(InterfaceC4128 interfaceC4128) {
        interfaceC4128.getClass();
        return AbstractC5143.m10137((String) ((C1245) AbstractC8188.m13653(interfaceC4128)).f3616, '?');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Drawable m6607(Context context, int i) {
        return C0171.m630().m633(context, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Object m6608(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String m6609(InterfaceC4128 interfaceC4128, String str) {
        interfaceC4128.getClass();
        return interfaceC4128.mo383().mo8366(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m6610(SharedPreferencesC8175 sharedPreferencesC8175, String str) {
        Log.i("FastKV", sharedPreferencesC8175.f22521 + " " + str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String m6611(InterfaceC4128 interfaceC4128) {
        interfaceC4128.getClass();
        return (String) ((C1245) AbstractC8188.m13653(interfaceC4128)).f3616;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C8799 m6612() {
        C8799 c8799 = new C8799();
        c8799.f24761 = AbstractC3056.m6668(-3937561652678100391L);
        c8799.f24760 = AbstractC3056.m6668(-3937706809687803303L);
        c8799.f24759 = 0;
        c8799.f24758 = AbstractC3056.m6668(-3937706809687803303L);
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, AbstractC3056.m6668(-3937706766738130343L));
        return c87992 == null ? c8799 : c87992;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ImageView.ScaleType m6613(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C0236 m6614() {
        long[] jArr = AbstractC0290.f1007;
        return new C0236();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m6615(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        if (file.isDirectory()) {
            StringBuilder sbM149 = AbstractC0053.m149(str);
            sbM149.append(file.getName());
            sbM149.append(AbstractC3056.m6668(-3937561854541563303L));
            String string = sbM149.toString();
            zipOutputStream.putNextEntry(new ZipEntry(string));
            for (File file2 : file.listFiles()) {
                m6615(file2, string, zipOutputStream);
            }
            return;
        }
        StringBuilder sbM1492 = AbstractC0053.m149(str);
        sbM1492.append(file.getName());
        zipOutputStream.putNextEntry(new ZipEntry(sbM1492.toString()));
        byte[] bArr = new byte[10240];
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 10240);
        while (true) {
            int i = bufferedInputStream.read(bArr, 0, 10240);
            if (i == -1) {
                bufferedInputStream.close();
                fileInputStream.close();
                return;
            }
            zipOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m6616(String str, String str2) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            C2632.m5294(AbstractC3056.m6668(-3937555785752774055L));
            return;
        }
        if (!file.isDirectory()) {
            C2632.m5294(AbstractC3056.m6668(-3937555837292381607L));
            return;
        }
        File file2 = new File(str2);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
        m6615(file, AbstractC3056.m6668(-3937561979095614887L), zipOutputStream);
        zipOutputStream.close();
        fileOutputStream.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC4356 m6617(final InterfaceC6553 interfaceC6553, final Object obj, final InterfaceC4356 interfaceC4356) {
        interfaceC6553.getClass();
        interfaceC4356.getClass();
        if (interfaceC6553 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) interfaceC6553).create(obj, interfaceC4356);
        }
        final InterfaceC4359 context = interfaceC4356.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(interfaceC4356, interfaceC6553, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ InterfaceC6553 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC4356);
                this.$this_createCoroutineUnintercepted$inlined = interfaceC6553;
                this.$receiver$inlined = obj;
                interfaceC4356.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        C5919.m11250("This coroutine had already completed");
                        return null;
                    }
                    this.label = 2;
                    AbstractC5184.m10206(result);
                    return result;
                }
                this.label = 1;
                AbstractC5184.m10206(result);
                this.$this_createCoroutineUnintercepted$inlined.getClass();
                InterfaceC6553 interfaceC65532 = this.$this_createCoroutineUnintercepted$inlined;
                AbstractC4387.m8898(2, interfaceC65532);
                return interfaceC65532.invoke(this.$receiver$inlined, this);
            }
        } : new ContinuationImpl(interfaceC4356, context, interfaceC6553, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ InterfaceC6553 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC4356, context);
                this.$this_createCoroutineUnintercepted$inlined = interfaceC6553;
                this.$receiver$inlined = obj;
                interfaceC4356.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        C5919.m11250("This coroutine had already completed");
                        return null;
                    }
                    this.label = 2;
                    AbstractC5184.m10206(result);
                    return result;
                }
                this.label = 1;
                AbstractC5184.m10206(result);
                this.$this_createCoroutineUnintercepted$inlined.getClass();
                InterfaceC6553 interfaceC65532 = this.$this_createCoroutineUnintercepted$inlined;
                AbstractC4387.m8898(2, interfaceC65532);
                return interfaceC65532.invoke(this.$receiver$inlined, this);
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m6618(SharedPreferencesC8175 sharedPreferencesC8175, String str) {
        Log.e("FastKV", sharedPreferencesC8175.f22521 + " " + str);
    }
}
