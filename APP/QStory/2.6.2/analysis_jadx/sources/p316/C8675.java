package p316;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.window.BackEvent;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.C0753;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.C2242;
import androidx.recyclerview.widget.AbstractC2457;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.C2525;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import io.ktor.http.cio.C3970;
import io.ktor.http.cio.internals.C3953;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.AbstractC4977;
import kotlin.reflect.jvm.internal.C4991;
import kotlin.reflect.jvm.internal.impl.descriptors.C4469;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.types.C4927;
import kotlin.reflect.jvm.internal.types.C4928;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.javaplugin.C5553;
import lin.xposed.hook.view.main.itemview.info.BaseItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p015.C6195;
import p015.C6217;
import p017.AbstractC6233;
import p026.AbstractC6293;
import p048.C6516;
import p048.C6518;
import p049.AbstractC6525;
import p066.AbstractC6878;
import p079.AbstractC6988;
import p087.C7141;
import p089.InterfaceC7183;
import p101.C7252;
import p101.C7254;
import p101.C7264;
import p101.InterfaceC7253;
import p103.C7273;
import p119.C7373;
import p144.C7550;
import p175.AbstractC7738;
import p205.C7894;
import p205.InterfaceC7895;
import p354.C8889;
import p354.C8890;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.api.C5817;
import top.suzhelan.qstory.hook.api.InterfaceC5808;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8675 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24462;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final void m14343(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final void m14344(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final boolean m14345(AbstractC4881 abstractC4881) {
        InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
        if (interfaceC4476Mo9221 != null) {
            if (AbstractC6878.m12128(interfaceC4476Mo9221) && AbstractC6878.m12127(interfaceC4476Mo9221) && !AbstractC4772.m9515((AbstractC6988) interfaceC4476Mo9221).equals(AbstractC6525.f17854)) {
                return true;
            }
            InterfaceC4476 interfaceC4476Mo92212 = abstractC4881.mo9732().mo9221();
            if (interfaceC4476Mo92212 != null && (interfaceC4476Mo92212 instanceof AbstractC6988) && (((AbstractC6988) interfaceC4476Mo92212).mo9030() instanceof C4469) && !AbstractC4916.m9850(abstractC4881)) {
                return true;
            }
        }
        InterfaceC4476 interfaceC4476Mo92213 = abstractC4881.mo9732().mo9221();
        InterfaceC4462 interfaceC4462 = interfaceC4476Mo92213 instanceof InterfaceC4462 ? (InterfaceC4462) interfaceC4476Mo92213 : null;
        return interfaceC4462 != null && m14345(AbstractC7738.m13032(interfaceC4462));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static C4690 m14346(C4690 c4690, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!c4690.f13700) {
            String strM9344 = c4690.m9344();
            if (AbstractC5138.m10125(strM9344, str, false) && strM9344.length() != str.length() && ('a' > (cCharAt = strM9344.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return C4690.m9340(str2.concat(AbstractC5143.m10160(strM9344, str)));
                }
                if (!z) {
                    return c4690;
                }
                String strM10160 = AbstractC5143.m10160(strM9344, str);
                if (strM10160.length() != 0 && AbstractC3056.m6674(0, strM10160)) {
                    if (strM10160.length() != 1 && AbstractC3056.m6674(1, strM10160)) {
                        Iterator it = new C6518(0, strM10160.length() - 1, 1).iterator();
                        while (true) {
                            C6516 c6516 = (C6516) it;
                            if (!c6516.f17827) {
                                next = null;
                                break;
                            }
                            next = c6516.next();
                            if (!AbstractC3056.m6674(((Number) next).intValue(), strM10160)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strM10160 = AbstractC3056.m6707(strM10160.substring(0, iIntValue)).concat(strM10160.substring(iIntValue));
                        } else {
                            strM10160 = AbstractC3056.m6707(strM10160);
                        }
                    } else if (strM10160.length() != 0 && 'A' <= (cCharAt2 = strM10160.charAt(0)) && cCharAt2 < '[') {
                        strM10160 = Character.toLowerCase(cCharAt2) + strM10160.substring(1);
                    }
                }
                if (C4690.m9339(strM10160)) {
                    return C4690.m9340(strM10160);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static C3970 m14347(C3953 c3953) {
        int i;
        C3970 c3970 = null;
        if (c3953 == null) {
            return null;
        }
        int i2 = 9;
        List listM4131 = C2242.m4131(C3970.f12206, c3953, 0, 0, new C0753(i2), 6);
        if (listM4131.size() == 1) {
            return (C3970) ((Pair) listM4131.get(0)).getSecond();
        }
        int length = c3953.length();
        ArrayList arrayList = null;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            while (true) {
                char cCharAt = c3953.charAt(i3);
                if (cCharAt != ' ' && cCharAt != ',') {
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3++;
                if (i3 >= length) {
                    i = i3;
                    break;
                }
            }
            while (i < length) {
                char cCharAt2 = c3953.charAt(i);
                if (cCharAt2 == ' ' || cCharAt2 == ',') {
                    break;
                }
                i++;
            }
            Pair pair = (Pair) AbstractC4343.m8815(C3970.f12206.m4133(c3953, i4, i, true, new C0753(i2)));
            if (pair == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c3953.subSequence(i4, i).toString());
            } else if (c3970 == null) {
                c3970 = (C3970) pair.getSecond();
            } else {
                i3 = i;
                c3970 = new C3970(c3970.f12211 || ((C3970) pair.getSecond()).f12211, c3970.f12210 || ((C3970) pair.getSecond()).f12210, c3970.f12209 || ((C3970) pair.getSecond()).f12209, EmptyList.INSTANCE);
            }
            i3 = i;
        }
        if (c3970 == null) {
            c3970 = C3970.f12207;
        }
        return arrayList == null ? c3970 : new C3970(c3970.f12211, c3970.f12210, c3970.f12209, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m14348(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m14349(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        C5919.m11249("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
                if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m14350(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m14349(r9, r10, r11)
            boolean r1 = m14349(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L72
            if (r0 != 0) goto Lf
            goto L72
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3b
            if (r9 == r3) goto L34
            if (r9 == r4) goto L2d
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L71
            goto L41
        L29:
            top.suzhelan.qstory.hook.item.C5919.m11249(r0)
            return r2
        L2d:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L71
            goto L41
        L34:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L71
            goto L41
        L3b:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L71
        L41:
            if (r9 == r5) goto L71
            if (r9 != r4) goto L46
            goto L71
        L46:
            int r11 = m14356(r9, r10, r11)
            if (r9 == r5) goto L66
            if (r9 == r3) goto L61
            if (r9 == r4) goto L5c
            if (r9 != r1) goto L58
            int r9 = r12.bottom
            int r10 = r10.bottom
        L56:
            int r9 = r9 - r10
            goto L6b
        L58:
            top.suzhelan.qstory.hook.item.C5919.m11249(r0)
            return r2
        L5c:
            int r9 = r12.right
            int r10 = r10.right
            goto L56
        L61:
            int r9 = r10.top
            int r10 = r12.top
            goto L56
        L66:
            int r9 = r10.left
            int r10 = r12.left
            goto L56
        L6b:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L72
        L71:
            return r6
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p316.C8675.m14350(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m14351(AbstractC6293 abstractC6293, InterfaceC5808 interfaceC5808) {
        AbstractC3056.m6668(-3937712899951429031L);
        AbstractC3056.m6668(-3937712938606134695L);
        C5817.f15949.put(abstractC6293, interfaceC5808);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m14352(ArrayList arrayList, BaseItemUiInfo baseItemUiInfo, String str) {
        if (baseItemUiInfo instanceof DirectoryUiInfo) {
            StringBuilder sbM149 = AbstractC0053.m149(str);
            sbM149.append(AbstractC3056.m6668(-3937343756102272423L));
            sbM149.append(arrayList.size());
            sbM149.append(SignatureVisitor.SUPER);
            DirectoryUiInfo directoryUiInfo = (DirectoryUiInfo) baseItemUiInfo;
            sbM149.append(directoryUiInfo.getItemName());
            arrayList.add(new C8890(sbM149.toString(), directoryUiInfo));
            return;
        }
        if (baseItemUiInfo instanceof ItemUiInfo) {
            StringBuilder sbM1492 = AbstractC0053.m149(str);
            sbM1492.append(AbstractC3056.m6668(-3937343704562664871L));
            sbM1492.append(arrayList.size());
            sbM1492.append(SignatureVisitor.SUPER);
            ItemUiInfo itemUiInfo = (ItemUiInfo) baseItemUiInfo;
            sbM1492.append(itemUiInfo.getItemName());
            arrayList.add(new C8889(sbM1492.toString(), itemUiInfo));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m14353(Object[] objArr, int i, int i2, AbstractC4347 abstractC4347) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC4347) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7550 m14354(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new C7550(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final InterfaceC7183 m14355(InterfaceC7183 interfaceC7183) {
        interfaceC7183.getClass();
        return interfaceC7183.getDescriptor().mo12383() ? interfaceC7183 : new C7141(interfaceC7183);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int m14356(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                C5919.m11249("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static int m14357(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        C5919.m11249("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static boolean m14358(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                C5919.m11249("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final boolean m14359(InterfaceC9156 interfaceC9156) {
        interfaceC9156.getClass();
        return interfaceC9156.isTraceEnabled();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C6195 m14360(String str, C6217 c6217) {
        str.getClass();
        Pair pairM6676 = AbstractC3056.m6676(c6217);
        Charset charset = (Charset) pairM6676.component1();
        C6217 c62172 = (C6217) pairM6676.component2();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        AbstractC6233.m11691(bytes.length, 0L, length);
        return new C6195(c62172, length, bytes);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m14361(Context context, String str) {
        try {
            ((ClipboardManager) context.getSystemService(AbstractC3056.m6668(-3937556494422377895L))).setPrimaryClip(ClipData.newPlainText(AbstractC3056.m6668(-3937556537372050855L), str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int m14362(C1988 c1988, int i) {
        boolean z = c1988.compareTo(C1988.f5874) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4928 m14363(InterfaceC5092 interfaceC5092, C4686 c4686) {
        c4686.getClass();
        interfaceC5092.getClass();
        return new C4928(interfaceC5092, c4686.f13692.f13689, new C4927(interfaceC5092, c4686), new C4927(c4686, interfaceC5092));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static InterfaceC7253 m14364(String str, Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC4881) it.next()).mo9734());
        }
        C7273 c7273M6248 = AbstractC2904.m6248(arrayList);
        int i = c7273M6248.f19379;
        InterfaceC7253 c7252 = i != 0 ? i != 1 ? new C7252(str, (InterfaceC7253[]) c7273M6248.toArray(new InterfaceC7253[0])) : (InterfaceC7253) c7273M6248.get(0) : C7254.f19341;
        return c7273M6248.f19379 <= 1 ? c7252 : new C7264(c7252);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C7373 m14365(C7373 c7373, LayoutDirection layoutDirection, C2031 c2031, InterfaceC7895 interfaceC7895, InterfaceC1996 interfaceC1996) {
        if (c7373 != null && layoutDirection == c7373.f19982 && AbstractC2048.m3762(c2031, layoutDirection).equals(c7373.f19981) && interfaceC7895.mo1246() == c7373.f19980.f21867 && interfaceC1996 == c7373.f19979) {
            return c7373;
        }
        C7373 c73732 = C7373.f19976;
        if (c73732 != null && layoutDirection == c73732.f19982 && AbstractC2048.m3762(c2031, layoutDirection).equals(c73732.f19981) && interfaceC7895.mo1246() == c73732.f19980.f21867 && interfaceC1996 == c73732.f19979) {
            return c73732;
        }
        C7373 c73733 = new C7373(layoutDirection, AbstractC2048.m3762(c2031, layoutDirection), new C7894(interfaceC7895.mo1246(), interfaceC7895.mo1247()), interfaceC1996);
        C7373.f19976 = c73733;
        return c73733;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p047.InterfaceC6488 m14366(kotlin.reflect.jvm.internal.AbstractC4977 r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p316.C8675.m14366(kotlin.reflect.jvm.internal.飘花落叶言子兰楪哲世苏, boolean):飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m14367(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return (((long) i) & 4294967295L) < (((long) i2) & 4294967295L) ? -1 : 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m14368(C2525 c2525, AbstractC2457 abstractC2457, View view, View view2, AbstractC2519 abstractC2519, boolean z, boolean z2) {
        if (abstractC2519.m4987() == 0 || c2525.m5015() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c2525.m5015() - Math.max(AbstractC2519.m4973(view), AbstractC2519.m4973(view2))) - 1) : Math.max(0, Math.min(AbstractC2519.m4973(view), AbstractC2519.m4973(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC2457.mo4829(view2) - abstractC2457.mo4826(view)) / (Math.abs(AbstractC2519.m4973(view) - AbstractC2519.m4973(view2)) + 1))) + (abstractC2457.mo4835() - abstractC2457.mo4826(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m14369(C2525 c2525, AbstractC2457 abstractC2457, View view, View view2, AbstractC2519 abstractC2519, boolean z) {
        if (abstractC2519.m4987() == 0 || c2525.m5015() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c2525.m5015();
        }
        return (int) (((abstractC2457.mo4829(view2) - abstractC2457.mo4826(view)) / (Math.abs(AbstractC2519.m4973(view) - AbstractC2519.m4973(view2)) + 1)) * c2525.m5015());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m14370(AbstractC4977 abstractC4977) {
        if (abstractC4977.mo9962().f14382 instanceof C4991) {
            return;
        }
        C5553.m10815(abstractC4977, "Only top-level properties are supported for now: ");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m14371(C2525 c2525, AbstractC2457 abstractC2457, View view, View view2, AbstractC2519 abstractC2519, boolean z) {
        if (abstractC2519.m4987() == 0 || c2525.m5015() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC2519.m4973(view) - AbstractC2519.m4973(view2)) + 1;
        }
        return Math.min(abstractC2457.mo4836(), abstractC2457.mo4829(view2) - abstractC2457.mo4826(view));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ViewPropertyAnimator m14372(View view, int i) {
        switch (this.f24462) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
