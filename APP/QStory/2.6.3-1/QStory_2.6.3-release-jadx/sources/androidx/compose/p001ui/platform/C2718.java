package androidx.compose.p001ui.platform;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.AbstractC0927;
import androidx.collection.AbstractC1081;
import androidx.collection.AbstractC1116;
import androidx.collection.C1083;
import androidx.collection.C1094;
import androidx.collection.C1095;
import androidx.collection.C1099;
import androidx.collection.C1129;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.focus.C2313;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.platform.accessibility.AbstractC2648;
import androidx.compose.p001ui.semantics.AbstractC2777;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2792;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2774;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2785;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.p001ui.semantics.C2789;
import androidx.compose.p001ui.semantics.C2790;
import androidx.compose.p001ui.semantics.C2791;
import androidx.compose.p001ui.semantics.C2793;
import androidx.compose.p001ui.state.ToggleableState;
import androidx.compose.p001ui.text.AbstractC2901;
import androidx.compose.p001ui.text.AbstractC2904;
import androidx.compose.p001ui.text.C2863;
import androidx.compose.p001ui.text.C2864;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2881;
import androidx.compose.p001ui.text.C2884;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.C2903;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.p001ui.viewinterop.AbstractC2909;
import androidx.core.os.AbstractC3006;
import androidx.core.widget.AbstractC3129;
import androidx.lifecycle.C3219;
import androidx.lifecycle.Lifecycle$State;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.util.C5043;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.C6008;
import kotlin.InterfaceC6000;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import net.bytebuddy.jar.asm.Opcodes;
import p025.AbstractC7012;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p128.C8157;
import p128.C8158;
import p140.C8242;
import p160.C8376;
import p171.C8436;
import p171.C8439;
import p191.AbstractC8568;
import p203.AbstractC8601;
import p209.C8648;
import p209.C8657;
import p210.C8661;
import p221.InterfaceC8725;
import p225.C8749;
import p225.C8753;
import p225.C8756;
import p225.C8760;
import p225.InterfaceC8752;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2718 extends C6686 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC2720 f5756;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2718(ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720) {
        super(15);
        this.f5756 = viewOnAttachStateChangeListenerC2720;
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C6686
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C8436 mo4065(int i) {
        ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = this.f5756;
        if (i != 1) {
            if (i == 2) {
                return mo4066(viewOnAttachStateChangeListenerC2720.f5868);
            }
            C6755.m11869(AbstractC7012.m12147(i, "Unknown focus type: "));
            return null;
        }
        int i2 = viewOnAttachStateChangeListenerC2720.f5867;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo4066(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0c36  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0c93  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [androidx.compose.ui.platform.飘花落叶言子楪兰哲世苏] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v5, types: [androidx.compose.ui.platform.飘花落叶言子楪兰哲世苏] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [飘花落叶言子哲世苏楪兰.飘花落叶言子楪世兰哲苏] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r2v1, types: [飘花落叶言子哲世苏楪兰.飘花落叶言子楪世兰哲苏] */
    /* JADX WARN: Type inference failed for: r2v110 */
    /* JADX WARN: Type inference failed for: r2v111 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v38, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v82, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v84, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v86, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v88, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v89, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v90, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v91, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r47v1 */
    /* JADX WARN: Type inference failed for: r47v2, types: [java.lang.Throwable, 飘花落叶言子哲世苏楪兰.飘花落叶言子楪世兰哲苏] */
    /* JADX WARN: Type inference failed for: r47v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r6v177 */
    /* JADX WARN: Type inference failed for: r6v85 */
    /* JADX WARN: Type inference failed for: r6v86, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v87, types: [飘花落叶言子哲世苏楪兰.飘花落叶言子楪世兰哲苏] */
    /* JADX WARN: Type inference failed for: r8v92 */
    @Override // top.suzhelan.qstory.hook.item.chat.C6686
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C8436 mo4066(int i) {
        ?? r47;
        AccessibilityManager accessibilityManager;
        C1129 c1129;
        AccessibilityNodeInfo accessibilityNodeInfo;
        C1095 c1095;
        ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719;
        C1083 c1083;
        Resources resources;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        C2789 c2789;
        C2791 c2791;
        ?? r40;
        C2788 c2788;
        ?? r0;
        ?? r4;
        ?? r2;
        C2791 c27912;
        C2789 c27892;
        int i2;
        int i3;
        ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC27202;
        boolean z;
        ?? r12;
        C2788 c2788M4228;
        boolean z2;
        C2583 c2583;
        ArrayList arrayList;
        CharSequence charSequenceM13398;
        C2790 c2790;
        C2774 c2774;
        C2793 c2793;
        C2793 c27932;
        int i4;
        int iM1358;
        ?? r22;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27192;
        int iM13582;
        String str;
        ?? r8;
        AbstractC2909 abstractC2909M4183;
        C2776 c2776;
        boolean zBooleanValue;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        int i5;
        C2788 c27882;
        int i6;
        ?? r122;
        C8436 c8436;
        Float fValueOf = Float.valueOf(0.0f);
        ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC27203 = this.f5756;
        AccessibilityManager accessibilityManager2 = viewOnAttachStateChangeListenerC27203.f5881;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27193 = viewOnAttachStateChangeListenerC27203.f5877;
        if (((C3219) viewTreeObserverOnGlobalLayoutListenerC27193.getComposeViewContext().f5942.getLifecycle()).f7364 == Lifecycle$State.DESTROYED) {
            c8436 = !accessibilityManager2.isEnabled() ? new C8436(AccessibilityNodeInfo.obtain()) : null;
            i3 = i;
            r122 = viewOnAttachStateChangeListenerC27203;
            r8 = c8436;
        } else {
            C2785 c2785 = (C2785) viewOnAttachStateChangeListenerC27203.m4137().m1393(i);
            if (c2785 == null) {
                if (!accessibilityManager2.isEnabled()) {
                    c8436 = new C8436(AccessibilityNodeInfo.obtain());
                }
                i3 = i;
                r122 = viewOnAttachStateChangeListenerC27203;
                r8 = c8436;
            } else {
                C2788 c27883 = c2785.f6106;
                C2791 c2791M4227 = c27883.m4227();
                C2583 c25832 = c27883.f6115;
                boolean zM9466 = AbstractC5227.m9466(AbstractC2792.m4233(c2791M4227, AbstractC2778.f6090), Boolean.TRUE);
                if (!zM9466) {
                    ?? Obtain = AccessibilityNodeInfo.obtain();
                    ?? c84362 = new C8436(Obtain);
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 34) {
                        AbstractC3129.m4882(Obtain, zM9466);
                        r47 = 0;
                    } else {
                        r47 = 0;
                        c84362.m13397(64, zM9466);
                    }
                    if (i == -1) {
                        Object parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC27193.getParentForAccessibility();
                        ?? r1 = parentForAccessibility instanceof View ? (View) parentForAccessibility : r47;
                        c84362.f20974 = -1;
                        Obtain.setParent(r1);
                    } else {
                        C2788 c2788M42282 = c27883.m4228();
                        ?? ValueOf = c2788M42282 != null ? Integer.valueOf(c2788M42282.f6112) : r47;
                        if (ValueOf == 0) {
                            ?? r23 = r47;
                            AbstractC8765.m13981("semanticsNode " + i + " has null parent");
                            C5043.m9161();
                            return r23;
                        }
                        int iIntValue = ValueOf.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC27193.getSemanticsOwner().m4211().f6112) {
                            iIntValue = -1;
                        }
                        c84362.f20974 = iIntValue;
                        Obtain.setParent(viewTreeObserverOnGlobalLayoutListenerC27193, iIntValue);
                    }
                    c84362.f20973 = i;
                    Obtain.setSource(viewTreeObserverOnGlobalLayoutListenerC27193, i);
                    c84362.m13401(viewOnAttachStateChangeListenerC27203.m4147(c2785));
                    C1095 c10952 = viewOnAttachStateChangeListenerC27203.f5886;
                    C1129 c11292 = viewOnAttachStateChangeListenerC27203.f5872;
                    Resources resources2 = viewTreeObserverOnGlobalLayoutListenerC27193.getContext().getResources();
                    c84362.m13402("android.view.View");
                    C2791 c27913 = c27883.f6114;
                    C1083 c10832 = c27913.f6124;
                    if (c10832.m1312(AbstractC2778.f6071)) {
                        c84362.m13402("android.widget.EditText");
                    }
                    if (c10832.m1312(AbstractC2778.f6063)) {
                        c84362.m13402("android.widget.TextView");
                    }
                    C2789 c27893 = (C2789) AbstractC2792.m4233(c27913, AbstractC2778.f6066);
                    if (c27893 != null) {
                        int i8 = c27893.f6118;
                        if (c27883.m4219()) {
                            accessibilityManager = accessibilityManager2;
                            i6 = 4;
                            c1129 = c11292;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i6 = 4;
                            c1129 = c11292;
                            if (C2788.m4212(4, c27883).isEmpty()) {
                            }
                        }
                        if (i8 == i6) {
                            Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(C0328R.string.tab));
                        } else if (i8 == 2) {
                            Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(C0328R.string.switch_role));
                        } else {
                            String strM4180 = AbstractC2751.m4180(i8);
                            if (i8 != 5 || c27883.m4224() || c27913.f6123) {
                                c84362.m13402(strM4180);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        c1129 = c11292;
                    }
                    Obtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC27193.getContext().getPackageName());
                    Obtain.setImportantForAccessibility(AbstractC2792.m4239(c27883));
                    boolean zM4876 = i7 >= 34 ? AbstractC3129.m4876(accessibilityManager) : true;
                    List listM4212 = C2788.m4212(4, c27883);
                    int size = listM4212.size();
                    boolean z3 = zM4876;
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        accessibilityNodeInfo = c84362.f20975;
                        if (i10 >= size) {
                            break;
                        }
                        int i11 = size;
                        C2788 c27884 = (C2788) listM4212.get(i10);
                        List list = listM4212;
                        AbstractC1116 abstractC1116M4137 = viewOnAttachStateChangeListenerC27203.m4137();
                        int i12 = i10;
                        int i13 = c27884.f6112;
                        if (abstractC1116M4137.m1394(i13)) {
                            AbstractC2909 abstractC2909 = viewTreeObserverOnGlobalLayoutListenerC27193.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c27884.f6115);
                            if (i13 != -1) {
                                if (abstractC2909 != null) {
                                    Obtain.addChild(abstractC2909);
                                } else {
                                    C2785 c27852 = (C2785) viewOnAttachStateChangeListenerC27203.m4137().m1393(i13);
                                    boolean zM94662 = (c27852 == null || (c27882 = c27852.f6106) == null) ? false : AbstractC5227.m9466(AbstractC2792.m4233(c27882.m4227(), AbstractC2778.f6090), Boolean.TRUE);
                                    if (z3 || !zM94662) {
                                        accessibilityNodeInfo.addChild(viewTreeObserverOnGlobalLayoutListenerC27193, i13);
                                    }
                                }
                                c10952.m1356(i13, i9);
                                i9++;
                            }
                        }
                        i10 = i12 + 1;
                        listM4212 = list;
                        size = i11;
                    }
                    if (i == viewOnAttachStateChangeListenerC27203.f5868) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c84362.m13393(C8439.f20984);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c84362.m13393(C8439.f20976);
                    }
                    C2902 c2902M4189 = AbstractC2751.m4189(c27883);
                    if (c2902M4189 != null) {
                        viewTreeObserverOnGlobalLayoutListenerC27193.getFontFamilyResolver();
                        InterfaceC8725 density = viewTreeObserverOnGlobalLayoutListenerC27193.getDensity();
                        C8657 c8657 = viewOnAttachStateChangeListenerC27203.f5852;
                        String str2 = c2902M4189.f6474;
                        viewTreeObserverOnGlobalLayoutListenerC2719 = viewTreeObserverOnGlobalLayoutListenerC27193;
                        List list2 = c2902M4189.f6476;
                        SpannableString spannableString = new SpannableString(str2);
                        ArrayList arrayList5 = c2902M4189.f6475;
                        if (arrayList5 != null) {
                            int size2 = arrayList5.size();
                            viewOnAttachStateChangeListenerC2720 = viewOnAttachStateChangeListenerC27203;
                            int i14 = 0;
                            Obtain = Obtain;
                            while (i14 < size2) {
                                ArrayList arrayList6 = arrayList5;
                                C2884 c2884 = (C2884) arrayList5.get(i14);
                                int i15 = i14;
                                C2881 c2881 = (C2881) c2884.f6422;
                                int i16 = size2;
                                int i17 = c2884.f6421;
                                int i18 = c2884.f6420;
                                C1095 c10953 = c10952;
                                long jMo13976 = c2881.f6403.mo13976();
                                Resources resources3 = resources2;
                                AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo;
                                long j = c2881.f6402;
                                C2822 c2822 = c2881.f6401;
                                C2824 c2824 = c2881.f6400;
                                C8756 c8756 = c2881.f6412;
                                C2789 c27894 = c27893;
                                C8661 c8661 = c2881.f6409;
                                C2791 c27914 = c27913;
                                ?? r402 = Obtain;
                                long j2 = c2881.f6410;
                                C8760 c8760 = c2881.f6405;
                                InterfaceC8752 c8749 = c2881.f6403;
                                C2788 c27885 = c27883;
                                C1083 c10833 = c10832;
                                if (!C2434.m3509(jMo13976, c8749.mo13976())) {
                                    c8749 = jMo13976 != 16 ? new C8749(jMo13976) : C8753.f22290;
                                }
                                AbstractC5894.m10577(spannableString, c8749.mo13976(), i17, i18);
                                SpannableString spannableString2 = spannableString;
                                AbstractC5894.m10580(spannableString2, j, density, i17, i18);
                                if (c2822 == null && c2824 == null) {
                                    i5 = 33;
                                } else {
                                    i5 = 33;
                                    spannableString2.setSpan(new StyleSpan(AbstractC1298.m1729(c2822 == null ? C2822.f6221 : c2822, c2824 != null ? c2824.f6225 : 0)), i17, i18, 33);
                                }
                                if (c8760 != null) {
                                    int i19 = c8760.f22307;
                                    if ((i19 | 1) == i19) {
                                        spannableString2.setSpan(new UnderlineSpan(), i17, i18, i5);
                                    }
                                    if ((i19 | 2) == i19) {
                                        spannableString2.setSpan(new StrikethroughSpan(), i17, i18, i5);
                                    }
                                }
                                if (c8756 != null) {
                                    spannableString2.setSpan(new ScaleXSpan(c8756.f22298), i17, i18, i5);
                                }
                                AbstractC5894.m10575(spannableString2, c8661, i17, i18);
                                if (j2 != 16) {
                                    spannableString2.setSpan(new BackgroundColorSpan(AbstractC2416.m3433(j2)), i17, i18, i5);
                                }
                                i14 = i15 + 1;
                                spannableString = spannableString2;
                                c27883 = c27885;
                                arrayList5 = arrayList6;
                                size2 = i16;
                                c10952 = c10953;
                                resources2 = resources3;
                                accessibilityNodeInfo = accessibilityNodeInfo3;
                                c27893 = c27894;
                                Obtain = r402;
                                c27913 = c27914;
                                c10832 = c10833;
                            }
                        } else {
                            viewOnAttachStateChangeListenerC2720 = viewOnAttachStateChangeListenerC27203;
                        }
                        c1095 = c10952;
                        SpannableString spannableString3 = spannableString;
                        c1083 = c10832;
                        resources = resources2;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        c2789 = c27893;
                        c2791 = c27913;
                        r40 = Obtain;
                        c2788 = c27883;
                        int length = str2.length();
                        if (list2 != null) {
                            arrayList2 = new ArrayList(list2.size());
                            int size3 = list2.size();
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj = list2.get(i20);
                                C2884 c28842 = (C2884) obj;
                                if ((c28842.f6422 instanceof C2863) && AbstractC2901.m4362(0, length, c28842.f6421, c28842.f6420)) {
                                    arrayList2.add(obj);
                                }
                            }
                        } else {
                            arrayList2 = EmptyList.INSTANCE;
                        }
                        arrayList2.getClass();
                        int size4 = arrayList2.size();
                        for (int i21 = 0; i21 < size4; i21++) {
                            C2884 c28843 = (C2884) arrayList2.get(i21);
                            C2863 c2863 = (C2863) c28843.f6422;
                            int i22 = c28843.f6421;
                            int i23 = c28843.f6420;
                            if (!(c2863 instanceof C2863)) {
                                C5043.m9170();
                                return r47;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(c2863.f6324).build(), i22, i23, 33);
                        }
                        int length2 = str2.length();
                        if (list2 != null) {
                            arrayList3 = new ArrayList(list2.size());
                            int size5 = list2.size();
                            for (int i24 = 0; i24 < size5; i24++) {
                                Object obj2 = list2.get(i24);
                                C2884 c28844 = (C2884) obj2;
                                if ((c28844.f6422 instanceof C2864) && AbstractC2901.m4362(0, length2, c28844.f6421, c28844.f6420)) {
                                    arrayList3.add(obj2);
                                }
                            }
                        } else {
                            arrayList3 = EmptyList.INSTANCE;
                        }
                        arrayList3.getClass();
                        int size6 = arrayList3.size();
                        for (int i25 = 0; i25 < size6; i25++) {
                            C2884 c28845 = (C2884) arrayList3.get(i25);
                            C2864 c2864 = (C2864) c28845.f6422;
                            int i26 = c28845.f6421;
                            int i27 = c28845.f6420;
                            WeakHashMap weakHashMap = (WeakHashMap) c8657.f21713;
                            Object uRLSpan = weakHashMap.get(c2864);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(c2864.f6325);
                                weakHashMap.put(c2864, uRLSpan);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan, i26, i27, 33);
                        }
                        int length3 = str2.length();
                        if (list2 != null) {
                            arrayList4 = new ArrayList(list2.size());
                            int size7 = list2.size();
                            for (int i28 = 0; i28 < size7; i28++) {
                                Object obj3 = list2.get(i28);
                                C2884 c28846 = (C2884) obj3;
                                if ((c28846.f6422 instanceof AbstractC2904) && AbstractC2901.m4362(0, length3, c28846.f6421, c28846.f6420)) {
                                    arrayList4.add(obj3);
                                }
                            }
                        } else {
                            arrayList4 = EmptyList.INSTANCE;
                        }
                        arrayList4.getClass();
                        int size8 = arrayList4.size();
                        for (int i29 = 0; i29 < size8; i29++) {
                            C2884 c28847 = (C2884) arrayList4.get(i29);
                            int i30 = c28847.f6421;
                            Object obj4 = c28847.f6422;
                            int i31 = c28847.f6420;
                            if (i30 != i31) {
                                AbstractC2904 abstractC2904 = (AbstractC2904) obj4;
                                if (abstractC2904 instanceof C2903) {
                                    obj4.getClass();
                                    C2903 c2903 = (C2903) obj4;
                                    C2884 c28848 = new C2884(c2903, i30, i31);
                                    WeakHashMap weakHashMap2 = (WeakHashMap) c8657.f21711;
                                    Object uRLSpan2 = weakHashMap2.get(c28848);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(c2903.f6478);
                                        weakHashMap2.put(c28848, uRLSpan2);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan2, i30, i31, 33);
                                } else {
                                    WeakHashMap weakHashMap3 = (WeakHashMap) c8657.f21712;
                                    Object c8648 = weakHashMap3.get(c28847);
                                    if (c8648 == null) {
                                        c8648 = new C8648(abstractC2904);
                                        weakHashMap3.put(c28847, c8648);
                                    }
                                    spannableString3.setSpan((ClickableSpan) c8648, i30, i31, 33);
                                }
                            }
                        }
                        r0 = (SpannableString) ViewOnAttachStateChangeListenerC2720.m4116(spannableString3);
                    } else {
                        c1095 = c10952;
                        viewOnAttachStateChangeListenerC2720 = viewOnAttachStateChangeListenerC27203;
                        viewTreeObserverOnGlobalLayoutListenerC2719 = viewTreeObserverOnGlobalLayoutListenerC27193;
                        c1083 = c10832;
                        resources = resources2;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        c2789 = c27893;
                        c2791 = c27913;
                        r40 = Obtain;
                        c2788 = c27883;
                        r0 = r47;
                    }
                    c84362.m13395(r0);
                    C2782 c2782 = AbstractC2778.f6061;
                    C1083 c10834 = c1083;
                    if (c10834.m1312(c2782)) {
                        ?? r24 = r40;
                        r24.setContentInvalid(true);
                        c27912 = c2791;
                        AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setError((CharSequence) AbstractC2792.m4233(c27912, c2782));
                        r2 = r24;
                        r4 = accessibilityNodeInfo4;
                    } else {
                        r4 = accessibilityNodeInfo2;
                        r2 = r40;
                        c27912 = c2791;
                    }
                    Resources resources4 = resources;
                    String strM4192 = AbstractC2751.m4192(c2788, resources4);
                    if (Build.VERSION.SDK_INT >= 30) {
                        AbstractC3006.m4515(r4, strM4192);
                    } else {
                        r4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strM4192);
                    }
                    r4.setCheckable(AbstractC2751.m4191(c2788));
                    ToggleableState toggleableState = (ToggleableState) AbstractC2792.m4233(c27912, AbstractC2778.f6059);
                    if (toggleableState != null) {
                        if (toggleableState == ToggleableState.f12On) {
                            r4.setChecked(true);
                        } else if (toggleableState == ToggleableState.Off) {
                            r4.setChecked(false);
                        }
                    }
                    Boolean bool = (Boolean) AbstractC2792.m4233(c27912, AbstractC2778.f6068);
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (c2789 == null) {
                            c27892 = c2789;
                            i2 = 4;
                        } else {
                            c27892 = c2789;
                            i2 = 4;
                            if (c27892.f6118 == 4) {
                                r2.setSelected(zBooleanValue2);
                            }
                        }
                        r4.setChecked(zBooleanValue2);
                    } else {
                        c27892 = c2789;
                        i2 = 4;
                    }
                    if (!c27912.f6123 || C2788.m4212(i2, c2788).isEmpty()) {
                        List list3 = (List) AbstractC2792.m4233(c27912, AbstractC2778.f6079);
                        r4.setContentDescription(list3 != null ? (String) AbstractC5176.m9374(list3) : r47);
                    }
                    String str3 = (String) AbstractC2792.m4233(c27912, AbstractC2778.f6065);
                    if (str3 != null) {
                        C2788 c2788M42283 = c2788;
                        while (true) {
                            if (c2788M42283 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            C2791 c27915 = c2788M42283.f6114;
                            C2782 c27822 = AbstractC2777.f6054;
                            if (c27915.f6124.m1312(c27822)) {
                                zBooleanValue = ((Boolean) c27915.m4231(c27822)).booleanValue();
                                break;
                            }
                            c2788M42283 = c2788M42283.m4228();
                        }
                        if (zBooleanValue) {
                            r2.setViewIdResourceName(str3);
                        }
                    }
                    if (((C6008) AbstractC2792.m4233(c27912, AbstractC2778.f6092)) != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            r4.setHeading(true);
                        } else {
                            c84362.m13397(2, true);
                        }
                    }
                    if (((C6008) AbstractC2792.m4233(c27912, AbstractC2778.f6096)) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            r2.setTextEntryKey(true);
                        } else {
                            c84362.m13397(8, true);
                        }
                    }
                    i3 = i;
                    if (i3 != -1) {
                        int iM13583 = c1095.m1358(c2788.f6112);
                        if (iM13583 != -1) {
                            r2.setDrawingOrder(iM13583);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    r2.setPassword(c10834.m1312(AbstractC2778.f6058));
                    Object objM4233 = AbstractC2792.m4233(c27912, AbstractC2778.f6056);
                    Boolean bool2 = Boolean.TRUE;
                    r2.setEditable(AbstractC5227.m9466(objM4233, bool2));
                    Integer num = (Integer) AbstractC2792.m4233(c27912, AbstractC2778.f6057);
                    r4.setMaxTextLength(num != null ? num.intValue() : -1);
                    r4.setEnabled(AbstractC2751.m4179(c2788));
                    C2782 c27823 = AbstractC2778.f6095;
                    r4.setFocusable(c10834.m1312(c27823));
                    if (r2.isFocusable()) {
                        r4.setFocused(((Boolean) c27912.m4231(c27823)).booleanValue());
                        if (r2.isFocused()) {
                            c84362.m13394(2);
                            ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC27204 = viewOnAttachStateChangeListenerC2720;
                            viewOnAttachStateChangeListenerC27204.f5867 = i3;
                            viewOnAttachStateChangeListenerC27202 = viewOnAttachStateChangeListenerC27204;
                        } else {
                            r12 = viewOnAttachStateChangeListenerC2720;
                            z = true;
                            c84362.m13394(1);
                            r4.setVisibleToUser(!AbstractC2792.m4240(c2788));
                            if (c2788.m4219()) {
                                c2788M4228 = c2788;
                            } else {
                                c2788M4228 = c2788.m4228();
                                c2788M4228.getClass();
                            }
                            if (c2788M4228.m4220().m13075()) {
                                z2 = false;
                            } else {
                                z2 = false;
                                r4.setVisibleToUser(false);
                            }
                            if (AbstractC2792.m4233(c27912, AbstractC2778.f6094) == null) {
                                C3775.m6954();
                                return null;
                            }
                            r4.setClickable(z2);
                            C2776 c27762 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6137);
                            if (c27762 != null) {
                                boolean zM94663 = AbstractC5227.m9466(AbstractC2792.m4233(c27912, AbstractC2778.f6068), bool2);
                                boolean z4 = (c27892 != null && c27892.f6118 == 4) || (c27892 != null && c27892.f6118 == 3);
                                r4.setClickable(!z4 || (z4 && !zM94663));
                                if (AbstractC2751.m4179(c2788) && r2.isClickable()) {
                                    c84362.m13393(new C8439(16, c27762.f6052));
                                }
                            }
                            r4.setLongClickable(false);
                            C2776 c27763 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6136);
                            if (c27763 != null) {
                                r4.setLongClickable(true);
                                if (AbstractC2751.m4179(c2788)) {
                                    c84362.m13393(new C8439(32, c27763.f6052));
                                }
                            }
                            C2776 c27764 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6147);
                            if (c27764 != null) {
                                c84362.m13393(new C8439(16384, c27764.f6052));
                            }
                            if (AbstractC2751.m4179(c2788)) {
                                C2776 c27765 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6153);
                                if (c27765 != null) {
                                    c84362.m13393(new C8439(2097152, c27765.f6052));
                                }
                                C2776 c27766 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6150);
                                if (c27766 != null) {
                                    c84362.m13393(new C8439(R.id.accessibilityActionImeEnter, c27766.f6052));
                                }
                                C2776 c27767 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6148);
                                if (c27767 != null) {
                                    c84362.m13393(new C8439(65536, c27767.f6052));
                                }
                                C2776 c27768 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6140);
                                if (c27768 != null && r2.isFocused()) {
                                    ClipDescription primaryClipDescription = viewTreeObserverOnGlobalLayoutListenerC2719.m4111getClipboardManager().m4154().getPrimaryClipDescription();
                                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                        c84362.m13393(new C8439(32768, c27768.f6052));
                                    }
                                }
                            }
                            String strM4122 = ViewOnAttachStateChangeListenerC2720.m4122(c2788);
                            if (strM4122 == null || strM4122.length() == 0) {
                                c2583 = c25832;
                                arrayList = new ArrayList();
                                arrayList.add("androidx.compose.ui.semantics.id");
                                charSequenceM13398 = c84362.m13398();
                                if (charSequenceM13398 != null && charSequenceM13398.length() != 0 && c10834.m1312(AbstractC2794.f6138)) {
                                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (c10834.m1312(AbstractC2778.f6065)) {
                                    arrayList.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (c10834.m1312(AbstractC2778.f6055)) {
                                    arrayList.add("androidx.compose.ui.semantics.shapeType");
                                    arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                    arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                    arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                }
                                r2.setAvailableExtraData(arrayList);
                                c2790 = (C2790) AbstractC2792.m4233(c27912, AbstractC2778.f6077);
                                if (c2790 != null) {
                                    C2782 c27824 = AbstractC2794.f6155;
                                    if (c10834.m1312(c27824)) {
                                        c84362.m13402("android.widget.SeekBar");
                                    } else {
                                        c84362.m13402("android.widget.ProgressBar");
                                    }
                                    if (c2790 != C2790.f6119) {
                                        r2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, fValueOf.floatValue(), fValueOf.floatValue(), 0.0f));
                                    }
                                    if (c10834.m1312(c27824) && AbstractC2751.m4179(c2788)) {
                                        float fFloatValue = fValueOf.floatValue();
                                        float fFloatValue2 = fValueOf.floatValue();
                                        if (fFloatValue < fFloatValue2) {
                                            fFloatValue = fFloatValue2;
                                        }
                                        if (0.0f < fFloatValue) {
                                            c84362.m13393(C8439.f20983);
                                        }
                                        float fFloatValue3 = fValueOf.floatValue();
                                        float fFloatValue4 = fValueOf.floatValue();
                                        if (fFloatValue3 > fFloatValue4) {
                                            fFloatValue3 = fFloatValue4;
                                        }
                                        if (0.0f > fFloatValue3) {
                                            c84362.m13393(C8439.f20987);
                                        }
                                    }
                                }
                                if (AbstractC2751.m4179(c2788) && (c2776 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6155)) != null) {
                                    c84362.m13393(new C8439(R.id.accessibilityActionSetProgress, c2776.f6052));
                                }
                                c2774 = (C2774) AbstractC2792.m4233(c2788.m4227(), AbstractC2778.f6074);
                                if (c2774 == null) {
                                    c84362.m13399(C8242.m13202(c2774.f6048, c2774.f6047, 0));
                                } else {
                                    ArrayList arrayList7 = new ArrayList();
                                    if (AbstractC2792.m4233(c2788.m4227(), AbstractC2778.f6075) != null) {
                                        List listM42122 = C2788.m4212(4, c2788);
                                        int size9 = listM42122.size();
                                        for (int i32 = 0; i32 < size9; i32++) {
                                            C2788 c27886 = (C2788) listM42122.get(i32);
                                            if (c27886.m4227().f6124.m1312(AbstractC2778.f6068)) {
                                                arrayList7.add(c27886);
                                            }
                                        }
                                    }
                                    if (!arrayList7.isEmpty()) {
                                        boolean zM4008 = AbstractC2648.m4008(arrayList7);
                                        c84362.m13399(C8242.m13202(zM4008 ? 1 : arrayList7.size(), zM4008 ? arrayList7.size() : 1, 0));
                                    }
                                }
                                AbstractC2648.m4007(c2788, c84362);
                                c2793 = (C2793) AbstractC2792.m4233(c27912, AbstractC2778.f6085);
                                C2776 c27769 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6135);
                                if (c2793 != null && c27769 != null) {
                                    if (AbstractC2792.m4233(c2788.m4227(), AbstractC2778.f6074) == null && AbstractC2792.m4233(c2788.m4227(), AbstractC2778.f6075) == null) {
                                        c84362.m13402("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) c2793.f6126.invoke()).floatValue() > 0.0f) {
                                        c84362.m13396(true);
                                    }
                                    if (AbstractC2751.m4179(c2788)) {
                                        if (ViewOnAttachStateChangeListenerC2720.m4119(c2793)) {
                                            c84362.m13393(C8439.f20983);
                                            c84362.m13393(c2583.f5445 == LayoutDirection.Rtl ? C8439.f20978 : C8439.f20982);
                                        }
                                        if (ViewOnAttachStateChangeListenerC2720.m4120(c2793)) {
                                            c84362.m13393(C8439.f20987);
                                            c84362.m13393(c2583.f5445 == LayoutDirection.Rtl ? C8439.f20982 : C8439.f20978);
                                        }
                                    }
                                }
                                c27932 = (C2793) AbstractC2792.m4233(c27912, AbstractC2778.f6082);
                                if (c27932 != null && c27769 != null) {
                                    if (AbstractC2792.m4233(c2788.m4227(), AbstractC2778.f6074) == null && AbstractC2792.m4233(c2788.m4227(), AbstractC2778.f6075) == null) {
                                        c84362.m13402("android.widget.ScrollView");
                                    }
                                    if (((Number) c27932.f6126.invoke()).floatValue() > 0.0f) {
                                        c84362.m13396(true);
                                    }
                                    if (AbstractC2751.m4179(c2788)) {
                                        if (ViewOnAttachStateChangeListenerC2720.m4119(c27932)) {
                                            c84362.m13393(C8439.f20983);
                                            c84362.m13393(C8439.f20981);
                                        }
                                        if (ViewOnAttachStateChangeListenerC2720.m4120(c27932)) {
                                            c84362.m13393(C8439.f20987);
                                            c84362.m13393(C8439.f20979);
                                        }
                                    }
                                }
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 29) {
                                    C2791 c27916 = c2788.f6114;
                                    C2789 c27895 = (C2789) AbstractC2792.m4233(c27916, AbstractC2778.f6066);
                                    if (AbstractC2751.m4179(c2788) && (c27895 == null || c27895.f6118 != 8)) {
                                        C2776 c277610 = (C2776) AbstractC2792.m4233(c27916, AbstractC2794.f6132);
                                        if (c277610 != null) {
                                            c84362.m13393(new C8439(R.id.accessibilityActionPageUp, c277610.f6052));
                                        }
                                        C2776 c277611 = (C2776) AbstractC2792.m4233(c27916, AbstractC2794.f6130);
                                        if (c277611 != null) {
                                            c84362.m13393(new C8439(R.id.accessibilityActionPageDown, c277611.f6052));
                                        }
                                        C2776 c277612 = (C2776) AbstractC2792.m4233(c27916, AbstractC2794.f6131);
                                        if (c277612 != null) {
                                            c84362.m13393(new C8439(R.id.accessibilityActionPageLeft, c277612.f6052));
                                        }
                                        C2776 c277613 = (C2776) AbstractC2792.m4233(c27916, AbstractC2794.f6129);
                                        if (c277613 != null) {
                                            c84362.m13393(new C8439(R.id.accessibilityActionPageRight, c277613.f6052));
                                        }
                                    }
                                }
                                CharSequence charSequence = (CharSequence) AbstractC2792.m4233(c27912, AbstractC2778.f6076);
                                if (i4 < 28) {
                                    r4.setPaneTitle(charSequence);
                                } else {
                                    r4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                }
                                if (AbstractC2751.m4179(c2788)) {
                                    C2776 c277614 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6139);
                                    if (c277614 != null) {
                                        c84362.m13393(new C8439(262144, c277614.f6052));
                                    }
                                    C2776 c277615 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6143);
                                    if (c277615 != null) {
                                        c84362.m13393(new C8439(Opcodes.ASM8, c277615.f6052));
                                    }
                                    C2776 c277616 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6144);
                                    if (c277616 != null) {
                                        c84362.m13393(new C8439(1048576, c277616.f6052));
                                    }
                                    C2782 c27825 = AbstractC2794.f6142;
                                    if (c10834.m1312(c27825)) {
                                        List list4 = (List) c27912.m4231(c27825);
                                        int size10 = list4.size();
                                        C1094 c1094 = ViewOnAttachStateChangeListenerC2720.f5851;
                                        if (size10 >= c1094.f1330) {
                                            C6755.m11870(AbstractC0900.m707(new StringBuilder("Can't have more than "), " custom actions for one widget", c1094.f1330));
                                            return r47;
                                        }
                                        C1129 c11293 = new C1129(0);
                                        C1099 c1099M1298 = AbstractC1081.m1298();
                                        C1129 c11294 = c1129;
                                        if (AbstractC8601.m13683(c11294.f1337, c11294.f1336, i3) >= 0) {
                                            C1099 c1099 = (C1099) c11294.m1419(i3);
                                            int[] iArr = c1094.f1331;
                                            int i33 = c1094.f1330;
                                            int[] iArrCopyOf = new int[16];
                                            int i34 = 0;
                                            int i35 = 0;
                                            while (i34 < i33) {
                                                int i36 = iArr[i34];
                                                int i37 = i33;
                                                int i38 = i35 + 1;
                                                int i39 = i34;
                                                if (iArrCopyOf.length < i38) {
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i38, (iArrCopyOf.length * 3) / 2));
                                                }
                                                iArrCopyOf[i35] = i36;
                                                i34 = i39 + 1;
                                                i35 = i38;
                                                i33 = i37;
                                            }
                                            ArrayList arrayList8 = new ArrayList();
                                            if (list4.size() > 0) {
                                                AbstractC0900.m697(list4.get(0));
                                                c1099.getClass();
                                                throw r47;
                                            }
                                            if (arrayList8.size() > 0) {
                                                AbstractC0900.m697(arrayList8.get(0));
                                                if (i35 <= 0) {
                                                    C8376.m13331("Index must be between 0 and size");
                                                    return r47;
                                                }
                                                int i40 = iArrCopyOf[0];
                                                throw r47;
                                            }
                                        } else if (list4.size() > 0) {
                                            AbstractC0900.m697(list4.get(0));
                                            c1094.m1416(0);
                                            throw r47;
                                        }
                                        r12.f5873.m1418(i3, c11293);
                                        c11294.m1418(i3, c1099M1298);
                                    }
                                }
                                boolean zM4178 = AbstractC2751.m4178(c2788, resources4);
                                if (Build.VERSION.SDK_INT < 28) {
                                    r4.setScreenReaderFocusable(zM4178);
                                } else {
                                    c84362.m13397(1, zM4178);
                                }
                                iM1358 = r12.f5855.m1358(i3);
                                if (iM1358 == -1) {
                                    AbstractC2909 abstractC2909M41832 = AbstractC2751.m4183(viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui(), iM1358);
                                    if (abstractC2909M41832 != null) {
                                        r4.setTraversalBefore(abstractC2909M41832);
                                        viewTreeObserverOnGlobalLayoutListenerC27192 = viewTreeObserverOnGlobalLayoutListenerC2719;
                                    } else {
                                        viewTreeObserverOnGlobalLayoutListenerC27192 = viewTreeObserverOnGlobalLayoutListenerC2719;
                                        r4.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC27192, iM1358);
                                    }
                                    ?? r25 = r47;
                                    r12.m4149(i3, c84362, r12.f5857, r25);
                                    r22 = r25;
                                } else {
                                    r22 = r47;
                                    viewTreeObserverOnGlobalLayoutListenerC27192 = viewTreeObserverOnGlobalLayoutListenerC2719;
                                }
                                iM13582 = r12.f5854.m1358(i3);
                                if (iM13582 != -1 && (abstractC2909M4183 = AbstractC2751.m4183(viewTreeObserverOnGlobalLayoutListenerC27192.getAndroidViewsHandler$ui(), iM13582)) != null) {
                                    r4.setTraversalAfter(abstractC2909M4183);
                                    r12.m4149(i3, c84362, r12.f5856, r22);
                                }
                                str = (String) AbstractC2792.m4233(c27912, AbstractC2777.m4202());
                                if (str != null) {
                                    c84362.m13402(str);
                                }
                                r8 = c84362;
                                r122 = r12;
                            } else {
                                r2.setTextSelection(r12.m4144(c2788), r12.m4143(c2788));
                                C2776 c277617 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6156);
                                c84362.m13393(new C8439(131072, (String) (c277617 != null ? c277617.f6052 : r47)));
                                c84362.m13394(256);
                                c84362.m13394(512);
                                r4.setMovementGranularities(11);
                                List list5 = (List) AbstractC2792.m4233(c27912, AbstractC2778.f6079);
                                if ((list5 == null || list5.isEmpty()) && c10834.m1312(AbstractC2794.f6138) && (!c10834.m1312(AbstractC2778.f6071) || AbstractC5227.m9466(AbstractC2792.m4233(c27912, c27823), bool2))) {
                                    c2583 = c25832;
                                    C2583 c2583M4175 = AbstractC2751.m4175(c2583, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
                                        /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
                                        @Override // p068.InterfaceC7387
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final Boolean invoke(C2583 c25833) {
                                            boolean z5;
                                            C2791 c2791M3814 = c25833.m3814();
                                            if (c2791M3814 != null) {
                                                if (c2791M3814.f6123) {
                                                    z5 = c2791M3814.f6124.m1312(AbstractC2778.f6071);
                                                }
                                            }
                                            return Boolean.valueOf(z5);
                                        }
                                    });
                                    if (c2583M4175 == null) {
                                        r4.setMovementGranularities(r2.getMovementGranularities() | 20);
                                    } else {
                                        C2791 c2791M3814 = c2583M4175.m3814();
                                        if (c2791M3814 != null ? AbstractC5227.m9466(AbstractC2792.m4233(c2791M3814, c27823), bool2) : false) {
                                        }
                                    }
                                }
                                arrayList = new ArrayList();
                                arrayList.add("androidx.compose.ui.semantics.id");
                                charSequenceM13398 = c84362.m13398();
                                if (charSequenceM13398 != null) {
                                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (c10834.m1312(AbstractC2778.f6065)) {
                                }
                                if (c10834.m1312(AbstractC2778.f6055)) {
                                }
                                r2.setAvailableExtraData(arrayList);
                                c2790 = (C2790) AbstractC2792.m4233(c27912, AbstractC2778.f6077);
                                if (c2790 != null) {
                                }
                                if (AbstractC2751.m4179(c2788)) {
                                    c84362.m13393(new C8439(R.id.accessibilityActionSetProgress, c2776.f6052));
                                }
                                c2774 = (C2774) AbstractC2792.m4233(c2788.m4227(), AbstractC2778.f6074);
                                if (c2774 == null) {
                                }
                                AbstractC2648.m4007(c2788, c84362);
                                c2793 = (C2793) AbstractC2792.m4233(c27912, AbstractC2778.f6085);
                                C2776 c277692 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6135);
                                if (c2793 != null) {
                                    if (AbstractC2792.m4233(c2788.m4227(), AbstractC2778.f6074) == null) {
                                        c84362.m13402("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) c2793.f6126.invoke()).floatValue() > 0.0f) {
                                    }
                                    if (AbstractC2751.m4179(c2788)) {
                                    }
                                }
                                c27932 = (C2793) AbstractC2792.m4233(c27912, AbstractC2778.f6082);
                                if (c27932 != null) {
                                    if (AbstractC2792.m4233(c2788.m4227(), AbstractC2778.f6074) == null) {
                                        c84362.m13402("android.widget.ScrollView");
                                    }
                                    if (((Number) c27932.f6126.invoke()).floatValue() > 0.0f) {
                                    }
                                    if (AbstractC2751.m4179(c2788)) {
                                    }
                                }
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 29) {
                                }
                                CharSequence charSequence2 = (CharSequence) AbstractC2792.m4233(c27912, AbstractC2778.f6076);
                                if (i4 < 28) {
                                }
                                if (AbstractC2751.m4179(c2788)) {
                                }
                                boolean zM41782 = AbstractC2751.m4178(c2788, resources4);
                                if (Build.VERSION.SDK_INT < 28) {
                                }
                                iM1358 = r12.f5855.m1358(i3);
                                if (iM1358 == -1) {
                                }
                                iM13582 = r12.f5854.m1358(i3);
                                if (iM13582 != -1) {
                                    r4.setTraversalAfter(abstractC2909M4183);
                                    r12.m4149(i3, c84362, r12.f5856, r22);
                                }
                                str = (String) AbstractC2792.m4233(c27912, AbstractC2777.m4202());
                                if (str != null) {
                                }
                                r8 = c84362;
                                r122 = r12;
                            }
                        }
                    } else {
                        viewOnAttachStateChangeListenerC27202 = viewOnAttachStateChangeListenerC2720;
                    }
                    z = true;
                    r12 = viewOnAttachStateChangeListenerC27202;
                    r4.setVisibleToUser(!AbstractC2792.m4240(c2788));
                    if (c2788.m4219()) {
                    }
                    if (c2788M4228.m4220().m13075()) {
                    }
                    if (AbstractC2792.m4233(c27912, AbstractC2778.f6094) == null) {
                    }
                } else if (!(Build.VERSION.SDK_INT >= 34 ? AbstractC3129.m4876(accessibilityManager2) : true)) {
                    i3 = i;
                    r122 = viewOnAttachStateChangeListenerC27203;
                    r8 = 0;
                }
            }
        }
        if (r122.f5864) {
            if (i3 == r122.f5868) {
                r122.f5866 = r8;
            }
            if (i3 == r122.f5867) {
                r122.f5865 = r8;
            }
        }
        return r8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x017f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a  */
    @Override // top.suzhelan.qstory.hook.item.chat.C6686
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo4067(int i, int i2, Bundle bundle) {
        C2788 c2788;
        int i3;
        AbstractC0927 abstractC0927;
        int iM4144;
        int i4;
        C2867 c2867M4182;
        InterfaceC7372 interfaceC7372;
        InterfaceC7372 interfaceC73722;
        InterfaceC7372 interfaceC73723;
        InterfaceC7372 interfaceC73724;
        InterfaceC7372 interfaceC73725;
        InterfaceC7372 interfaceC73726;
        InterfaceC7372 interfaceC73727;
        InterfaceC7372 interfaceC73728;
        InterfaceC7372 interfaceC73729;
        InterfaceC7387 interfaceC7387;
        C2776 c2776;
        C2788 c27882;
        long jMo3636;
        float f;
        float f2;
        float f3;
        float f4;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        C2776 c27762;
        InterfaceC7387 interfaceC73872;
        InterfaceC7372 interfaceC737210;
        long j;
        InterfaceC7372 interfaceC737211;
        float fIntBitsToFloat;
        InterfaceC7372 interfaceC737212;
        InterfaceC7387 interfaceC73873;
        InterfaceC7372 interfaceC737213;
        InterfaceC7372 interfaceC737214;
        InterfaceC7372 interfaceC737215;
        InterfaceC7372 interfaceC737216;
        List list;
        ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = this.f5756;
        AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC2720.f5881;
        Float fValueOf = Float.valueOf(0.0f);
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = viewOnAttachStateChangeListenerC2720.f5877;
        C2785 c2785 = (C2785) viewOnAttachStateChangeListenerC2720.m4137().m1393(i);
        if (c2785 != null && (c2788 = c2785.f6106) != null) {
            C2583 c2583 = c2788.f6115;
            int i5 = c2788.f6112;
            C2791 c2791 = c2788.f6114;
            Object objM4233 = AbstractC2792.m4233(c2791, AbstractC2778.f6090);
            C1083 c1083 = c2791.f6124;
            Boolean bool = Boolean.TRUE;
            if (AbstractC5227.m9466(objM4233, bool)) {
                if (Build.VERSION.SDK_INT >= 34 ? AbstractC3129.m4876(accessibilityManager) : true) {
                }
            } else {
                if (i2 == 64) {
                    if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = viewOnAttachStateChangeListenerC2720.f5868) == i) {
                        return false;
                    }
                    if (i3 != Integer.MIN_VALUE) {
                        ViewOnAttachStateChangeListenerC2720.m4121(viewOnAttachStateChangeListenerC2720, i3, 65536, null, 12);
                    }
                    viewOnAttachStateChangeListenerC2720.f5868 = i;
                    viewTreeObserverOnGlobalLayoutListenerC2719.invalidate();
                    ViewOnAttachStateChangeListenerC2720.m4121(viewOnAttachStateChangeListenerC2720, i, 32768, null, 12);
                    return true;
                }
                if (i2 == 128) {
                    if (viewOnAttachStateChangeListenerC2720.f5868 != i) {
                        return false;
                    }
                    viewOnAttachStateChangeListenerC2720.f5868 = Integer.MIN_VALUE;
                    viewOnAttachStateChangeListenerC2720.f5866 = null;
                    viewTreeObserverOnGlobalLayoutListenerC2719.invalidate();
                    ViewOnAttachStateChangeListenerC2720.m4121(viewOnAttachStateChangeListenerC2720, i, 65536, null, 12);
                    return true;
                }
                if (i2 == 256 || i2 == 512) {
                    if (bundle != null) {
                        int i6 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                        boolean z = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                        boolean z2 = i2 == 256;
                        Integer num = viewOnAttachStateChangeListenerC2720.f5870;
                        if (num == null || i5 != num.intValue()) {
                            viewOnAttachStateChangeListenerC2720.f5871 = -1;
                            viewOnAttachStateChangeListenerC2720.f5870 = Integer.valueOf(i5);
                        }
                        String strM4122 = ViewOnAttachStateChangeListenerC2720.m4122(c2788);
                        if (strM4122 != null && strM4122.length() != 0) {
                            String strM41222 = ViewOnAttachStateChangeListenerC2720.m4122(c2788);
                            if (strM41222 == null || strM41222.length() == 0) {
                                abstractC0927 = null;
                                if (abstractC0927 != null) {
                                    int iM4143 = viewOnAttachStateChangeListenerC2720.m4143(c2788);
                                    if (iM4143 == -1) {
                                        iM4143 = z2 ? 0 : strM4122.length();
                                    }
                                    int[] iArrMo864 = z2 ? abstractC0927.mo864(iM4143) : abstractC0927.mo868(iM4143);
                                    if (iArrMo864 != null) {
                                        int i7 = iArrMo864[0];
                                        int i8 = iArrMo864[1];
                                        if (z && !c1083.m1312(AbstractC2778.f6079) && c1083.m1312(AbstractC2778.f6071)) {
                                            iM4144 = viewOnAttachStateChangeListenerC2720.m4144(c2788);
                                            if (iM4144 == -1) {
                                                iM4144 = z2 ? i7 : i8;
                                            }
                                            i4 = z2 ? i8 : i7;
                                        } else {
                                            iM4144 = z2 ? i8 : i7;
                                            i4 = iM4144;
                                        }
                                        viewOnAttachStateChangeListenerC2720.f5862 = new C2722(c2788, z2 ? 256 : 512, i6, i7, i8, SystemClock.uptimeMillis());
                                        viewOnAttachStateChangeListenerC2720.m4125(c2788, iM4144, i4, true);
                                        return true;
                                    }
                                }
                            } else {
                                if (i6 == 1) {
                                    Locale locale = viewTreeObserverOnGlobalLayoutListenerC2719.getContext().getResources().getConfiguration().locale;
                                    if (C2715.f5741 == null) {
                                        C2715 c2715 = new C2715(0);
                                        c2715.f5743 = BreakIterator.getCharacterInstance(locale);
                                        C2715.f5741 = c2715;
                                    }
                                    C2715 c27152 = C2715.f5741;
                                    c27152.getClass();
                                    c27152.m4051(strM41222);
                                    abstractC0927 = c27152;
                                } else if (i6 == 2) {
                                    Locale locale2 = viewTreeObserverOnGlobalLayoutListenerC2719.getContext().getResources().getConfiguration().locale;
                                    if (C2715.f5742 == null) {
                                        C2715 c27153 = new C2715(1);
                                        c27153.f5743 = BreakIterator.getWordInstance(locale2);
                                        C2715.f5742 = c27153;
                                    }
                                    C2715 c27154 = C2715.f5742;
                                    c27154.getClass();
                                    c27154.m4051(strM41222);
                                    abstractC0927 = c27154;
                                } else if (i6 == 4) {
                                    if (c1083.m1312(AbstractC2794.f6138) && (c2867M4182 = AbstractC2751.m4182(c2791)) != null) {
                                        if (i6 == 4) {
                                            if (C2714.f5737 == null) {
                                                C2714.f5737 = new C2714();
                                            }
                                            C2714 c2714 = C2714.f5737;
                                            c2714.getClass();
                                            c2714.f576 = strM41222;
                                            c2714.f5740 = c2867M4182;
                                            abstractC0927 = c2714;
                                        } else {
                                            if (C2713.f5733 == null) {
                                                C2713 c2713 = new C2713();
                                                new Rect();
                                                C2713.f5733 = c2713;
                                            }
                                            C2713 c27132 = C2713.f5733;
                                            c27132.getClass();
                                            c27132.f576 = strM41222;
                                            c27132.f5736 = c2867M4182;
                                            c27132.f5735 = c2788;
                                            abstractC0927 = c27132;
                                        }
                                    }
                                } else if (i6 == 8) {
                                    if (C2712.f5731 == null) {
                                        C2712.f5731 = new C2712();
                                    }
                                    C2712 c2712 = C2712.f5731;
                                    c2712.getClass();
                                    c2712.f576 = strM41222;
                                    abstractC0927 = c2712;
                                } else if (i6 != 16) {
                                }
                                if (abstractC0927 != null) {
                                }
                            }
                        }
                    }
                } else if (i2 == 16384) {
                    C2776 c27763 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6147);
                    if (c27763 != null && (interfaceC7372 = (InterfaceC7372) c27763.f6051) != null) {
                        return ((Boolean) interfaceC7372.invoke()).booleanValue();
                    }
                } else {
                    if (i2 == 131072) {
                        boolean zM4125 = viewOnAttachStateChangeListenerC2720.m4125(c2788, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                        if (zM4125) {
                            ViewOnAttachStateChangeListenerC2720.m4121(viewOnAttachStateChangeListenerC2720, viewOnAttachStateChangeListenerC2720.m4130(i5), 0, null, 12);
                        }
                        return zM4125;
                    }
                    if (AbstractC2751.m4179(c2788)) {
                        if (i2 == 1) {
                            if (viewTreeObserverOnGlobalLayoutListenerC2719.isInTouchMode()) {
                                viewTreeObserverOnGlobalLayoutListenerC2719.requestFocusFromTouch();
                            }
                            C2776 c27764 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6141);
                            if (c27764 != null && (interfaceC73722 = (InterfaceC7372) c27764.f6051) != null) {
                                return ((Boolean) interfaceC73722.invoke()).booleanValue();
                            }
                        } else if (i2 != 2) {
                            switch (i2) {
                                case 16:
                                    C2776 c27765 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6137);
                                    Boolean bool2 = (c27765 == null || (interfaceC73723 = (InterfaceC7372) c27765.f6051) == null) ? null : (Boolean) interfaceC73723.invoke();
                                    ViewOnAttachStateChangeListenerC2720.m4121(viewOnAttachStateChangeListenerC2720, i, 1, null, 12);
                                    if (bool2 != null) {
                                        return bool2.booleanValue();
                                    }
                                    break;
                                case 32:
                                    C2776 c27766 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6136);
                                    if (c27766 != null && (interfaceC73724 = (InterfaceC7372) c27766.f6051) != null) {
                                        return ((Boolean) interfaceC73724.invoke()).booleanValue();
                                    }
                                    break;
                                case 4096:
                                case 8192:
                                    boolean z3 = i2 == 4096;
                                    boolean z4 = i2 == 8192;
                                    boolean z5 = i2 == 16908345;
                                    boolean z6 = i2 == 16908347;
                                    boolean z7 = i2 == 16908344;
                                    boolean z8 = i2 == 16908346;
                                    boolean z9 = z5 || z6 || z3 || z4;
                                    boolean z10 = z7 || z8 || z3 || z4;
                                    if (z3 || z4) {
                                        C2790 c2790 = (C2790) AbstractC2792.m4233(c2791, AbstractC2778.f6077);
                                        C2776 c27767 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6155);
                                        if (c2790 == null || c27767 == null) {
                                            long jM13078 = AbstractC2505.m3660(c2583.f5439.f5631).m13078();
                                            ArrayList arrayList = new ArrayList();
                                            C2776 c27768 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6128);
                                            Float f5 = (c27768 == null || (interfaceC73873 = (InterfaceC7387) c27768.f6051) == null || !((Boolean) interfaceC73873.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                            C2776 c27769 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6135);
                                            if (c27769 != null) {
                                                InterfaceC6000 interfaceC6000 = c27769.f6051;
                                                C2793 c2793 = (C2793) AbstractC2792.m4233(c2791, AbstractC2778.f6085);
                                                if (c2793 == null || !z9) {
                                                    j = jM13078;
                                                } else {
                                                    if (f5 != null) {
                                                        fIntBitsToFloat = f5.floatValue();
                                                        j = jM13078;
                                                    } else {
                                                        j = jM13078;
                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                                    }
                                                    if (z5 || z4) {
                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                    }
                                                    if (c2583.f5445 == LayoutDirection.Rtl && (z5 || z6)) {
                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                    }
                                                    if (ViewOnAttachStateChangeListenerC2720.m4123(c2793, fIntBitsToFloat)) {
                                                        C2782 c2782 = AbstractC2794.f6131;
                                                        if (c1083.m1312(c2782) || c1083.m1312(AbstractC2794.f6129)) {
                                                            C2776 c277610 = fIntBitsToFloat > 0.0f ? (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6129) : (C2776) AbstractC2792.m4233(c2791, c2782);
                                                            if (c277610 != null && (interfaceC737212 = (InterfaceC7372) c277610.f6051) != null) {
                                                                return ((Boolean) interfaceC737212.invoke()).booleanValue();
                                                            }
                                                        } else {
                                                            InterfaceC7383 interfaceC7383 = (InterfaceC7383) interfaceC6000;
                                                            if (interfaceC7383 != null) {
                                                                return ((Boolean) interfaceC7383.invoke(Float.valueOf(fIntBitsToFloat), fValueOf)).booleanValue();
                                                            }
                                                        }
                                                    }
                                                }
                                                C2793 c27932 = (C2793) AbstractC2792.m4233(c2791, AbstractC2778.f6082);
                                                if (c27932 != null && z10) {
                                                    float fFloatValue = f5 != null ? f5.floatValue() : Float.intBitsToFloat((int) (j & 4294967295L));
                                                    if (z7 || z4) {
                                                        fFloatValue = -fFloatValue;
                                                    }
                                                    if (ViewOnAttachStateChangeListenerC2720.m4123(c27932, fFloatValue)) {
                                                        C2782 c27822 = AbstractC2794.f6132;
                                                        if (c1083.m1312(c27822) || c1083.m1312(AbstractC2794.f6130)) {
                                                            C2776 c277611 = fFloatValue > 0.0f ? (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6130) : (C2776) AbstractC2792.m4233(c2791, c27822);
                                                            if (c277611 != null && (interfaceC737211 = (InterfaceC7372) c277611.f6051) != null) {
                                                                return ((Boolean) interfaceC737211.invoke()).booleanValue();
                                                            }
                                                        } else {
                                                            InterfaceC7383 interfaceC73832 = (InterfaceC7383) interfaceC6000;
                                                            if (interfaceC73832 != null) {
                                                                return ((Boolean) interfaceC73832.invoke(fValueOf, Float.valueOf(fFloatValue))).booleanValue();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            float fFloatValue2 = fValueOf.floatValue();
                                            float fFloatValue3 = fValueOf.floatValue();
                                            if (fFloatValue2 < fFloatValue3) {
                                                fFloatValue2 = fFloatValue3;
                                            }
                                            float fFloatValue4 = fValueOf.floatValue();
                                            float fFloatValue5 = fValueOf.floatValue();
                                            if (fFloatValue4 > fFloatValue5) {
                                                fFloatValue4 = fFloatValue5;
                                            }
                                            float f6 = (fFloatValue2 - fFloatValue4) / 20.0f;
                                            if (z4) {
                                                f6 = -f6;
                                            }
                                            InterfaceC7387 interfaceC73874 = (InterfaceC7387) c27767.f6051;
                                            if (interfaceC73874 != null) {
                                                return ((Boolean) interfaceC73874.invoke(Float.valueOf(0.0f + f6))).booleanValue();
                                            }
                                        }
                                    }
                                    break;
                                case 32768:
                                    C2776 c277612 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6140);
                                    if (c277612 != null && (interfaceC73725 = (InterfaceC7372) c277612.f6051) != null) {
                                        return ((Boolean) interfaceC73725.invoke()).booleanValue();
                                    }
                                    break;
                                case 65536:
                                    C2776 c277613 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6148);
                                    if (c277613 != null && (interfaceC73726 = (InterfaceC7372) c277613.f6051) != null) {
                                        return ((Boolean) interfaceC73726.invoke()).booleanValue();
                                    }
                                    break;
                                case 262144:
                                    C2776 c277614 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6139);
                                    if (c277614 != null && (interfaceC73727 = (InterfaceC7372) c277614.f6051) != null) {
                                        return ((Boolean) interfaceC73727.invoke()).booleanValue();
                                    }
                                    break;
                                case Opcodes.ASM8 /* 524288 */:
                                    C2776 c277615 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6143);
                                    if (c277615 != null && (interfaceC73728 = (InterfaceC7372) c277615.f6051) != null) {
                                        return ((Boolean) interfaceC73728.invoke()).booleanValue();
                                    }
                                    break;
                                case 1048576:
                                    C2776 c277616 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6144);
                                    if (c277616 != null && (interfaceC73729 = (InterfaceC7372) c277616.f6051) != null) {
                                        return ((Boolean) interfaceC73729.invoke()).booleanValue();
                                    }
                                    break;
                                case 2097152:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    C2776 c277617 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6153);
                                    if (c277617 != null && (interfaceC7387 = (InterfaceC7387) c277617.f6051) != null) {
                                        if (string == null) {
                                            string = "";
                                        }
                                        return ((Boolean) interfaceC7387.invoke(new C2902(string))).booleanValue();
                                    }
                                    break;
                                case R.id.accessibilityActionShowOnScreen:
                                    C2788 c2788M4228 = c2788.m4228();
                                    if (c2788M4228 != null) {
                                        c2776 = (C2776) AbstractC2792.m4233(c2788M4228.f6114, AbstractC2794.f6135);
                                        while (c2776 == null && c2788M4228 != null) {
                                            c2788M4228 = c2788M4228.m4228();
                                            if (c2788M4228 != null) {
                                                c2776 = (C2776) AbstractC2792.m4233(c2788M4228.f6114, AbstractC2794.f6135);
                                            }
                                        }
                                        if (c2788M4228 == null) {
                                            C8157 c8157M4226 = c2788.m4226();
                                            return viewTreeObserverOnGlobalLayoutListenerC2719.requestRectangleOnScreen(new Rect((int) Math.floor(c8157M4226.f19885), (int) Math.floor(c8157M4226.f19884), AbstractC7390.m12617((float) Math.ceil(c8157M4226.f19883)), AbstractC7390.m12617((float) Math.ceil(c8157M4226.f19882))));
                                        }
                                        long jM13085 = 0;
                                        boolean z11 = false;
                                        while (c2788M4228 != null) {
                                            C2583 c25832 = c2788M4228.f6115;
                                            C2791 c27912 = c2788M4228.f6114;
                                            C2776 c277618 = (C2776) AbstractC2792.m4233(c27912, AbstractC2794.f6135);
                                            if (c277618 != null) {
                                                C8157 c8157M3660 = AbstractC2505.m3660(c25832.f5439.f5631);
                                                InterfaceC2530 interfaceC2530Mo3640 = c25832.f5439.f5631.mo3640();
                                                C8157 c8157M13083 = c8157M3660.m13083(interfaceC2530Mo3640 != null ? ((AbstractC2629) interfaceC2530Mo3640).mo3636(0L) : 0L);
                                                AbstractC2629 abstractC2629M4215 = c2788.m4215();
                                                if (abstractC2629M4215 == null) {
                                                    jMo3636 = 0;
                                                    long jM13084 = C8158.m13084(jMo3636, jM13085);
                                                    AbstractC2629 abstractC2629M42152 = c2788.m4215();
                                                    c27882 = c2788;
                                                    C8157 c8157M13629 = AbstractC8568.m13629(jM13084, AbstractC1298.m1700(abstractC2629M42152 == null ? abstractC2629M42152.f5343 : 0L));
                                                    f = c8157M13629.f19885 - c8157M13083.f19885;
                                                    f2 = c8157M13629.f19883 - c8157M13083.f19883;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                        f = 0.0f;
                                                    } else if (Math.abs(f) >= Math.abs(f2)) {
                                                        f = f2;
                                                    }
                                                    f3 = c8157M13629.f19884 - c8157M13083.f19884;
                                                    f4 = c8157M13629.f19882 - c8157M13083.f19882;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                        f3 = 0.0f;
                                                    } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                        f3 = f4;
                                                    }
                                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                                    if (C8158.m13087(jFloatToRawIntBits, 0L)) {
                                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                                                        if (c2583.f5445 == LayoutDirection.Rtl) {
                                                            fIntBitsToFloat2 = -fIntBitsToFloat2;
                                                        }
                                                        jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                                                    } else {
                                                        jFloatToRawIntBits2 = jFloatToRawIntBits;
                                                    }
                                                    InterfaceC7383 interfaceC73833 = (InterfaceC7383) c277618.f6051;
                                                    z11 = (interfaceC73833 == null && ((Boolean) interfaceC73833.invoke(Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))))).booleanValue()) || z11;
                                                    jM13085 = C8158.m13085(jM13085, jFloatToRawIntBits);
                                                } else {
                                                    if (!abstractC2629M4215.mo3842().f6624) {
                                                        abstractC2629M4215 = null;
                                                    }
                                                    if (abstractC2629M4215 != null) {
                                                        jMo3636 = abstractC2629M4215.mo3636(0L);
                                                    }
                                                    long jM130842 = C8158.m13084(jMo3636, jM13085);
                                                    AbstractC2629 abstractC2629M421522 = c2788.m4215();
                                                    c27882 = c2788;
                                                    C8157 c8157M136292 = AbstractC8568.m13629(jM130842, AbstractC1298.m1700(abstractC2629M421522 == null ? abstractC2629M421522.f5343 : 0L));
                                                    f = c8157M136292.f19885 - c8157M13083.f19885;
                                                    f2 = c8157M136292.f19883 - c8157M13083.f19883;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                    }
                                                    f3 = c8157M136292.f19884 - c8157M13083.f19884;
                                                    f4 = c8157M136292.f19882 - c8157M13083.f19882;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                    }
                                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                                    if (C8158.m13087(jFloatToRawIntBits, 0L)) {
                                                    }
                                                    InterfaceC7383 interfaceC738332 = (InterfaceC7383) c277618.f6051;
                                                    if (interfaceC738332 == null) {
                                                        jM13085 = C8158.m13085(jM13085, jFloatToRawIntBits);
                                                    } else {
                                                        jM13085 = C8158.m13085(jM13085, jFloatToRawIntBits);
                                                    }
                                                }
                                            } else {
                                                c27882 = c2788;
                                            }
                                            c2788M4228 = c2788M4228.m4228();
                                            c2788 = c27882;
                                        }
                                        return z11;
                                    }
                                    c2776 = null;
                                    break;
                                case R.id.accessibilityActionSetProgress:
                                    if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && (c27762 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6155)) != null && (interfaceC73872 = (InterfaceC7387) c27762.f6051) != null) {
                                        return ((Boolean) interfaceC73872.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                    break;
                                case R.id.accessibilityActionImeEnter:
                                    C2776 c277619 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6150);
                                    if (c277619 != null && (interfaceC737210 = (InterfaceC7372) c277619.f6051) != null) {
                                        return ((Boolean) interfaceC737210.invoke()).booleanValue();
                                    }
                                    break;
                                default:
                                    switch (i2) {
                                        case R.id.accessibilityActionScrollUp:
                                        case R.id.accessibilityActionScrollLeft:
                                        case R.id.accessibilityActionScrollDown:
                                        case R.id.accessibilityActionScrollRight:
                                            break;
                                        default:
                                            switch (i2) {
                                                case R.id.accessibilityActionPageUp:
                                                    C2776 c277620 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6132);
                                                    if (c277620 != null && (interfaceC737213 = (InterfaceC7372) c277620.f6051) != null) {
                                                        return ((Boolean) interfaceC737213.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageDown:
                                                    C2776 c277621 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6130);
                                                    if (c277621 != null && (interfaceC737214 = (InterfaceC7372) c277621.f6051) != null) {
                                                        return ((Boolean) interfaceC737214.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageLeft:
                                                    C2776 c277622 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6131);
                                                    if (c277622 != null && (interfaceC737215 = (InterfaceC7372) c277622.f6051) != null) {
                                                        return ((Boolean) interfaceC737215.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageRight:
                                                    C2776 c277623 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6129);
                                                    if (c277623 != null && (interfaceC737216 = (InterfaceC7372) c277623.f6051) != null) {
                                                        return ((Boolean) interfaceC737216.invoke()).booleanValue();
                                                    }
                                                    break;
                                                default:
                                                    C1129 c1129 = (C1129) viewOnAttachStateChangeListenerC2720.f5873.m1419(i);
                                                    if (c1129 != null && ((CharSequence) c1129.m1419(i2)) != null && (list = (List) AbstractC2792.m4233(c2791, AbstractC2794.f6142)) != null && list.size() > 0) {
                                                        list.get(0).getClass();
                                                        C3775.m6954();
                                                        return false;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else if (AbstractC5227.m9466(AbstractC2792.m4233(c2791, AbstractC2778.f6095), bool)) {
                            ((C2313) viewTreeObserverOnGlobalLayoutListenerC2719.getFocusOwner()).m3201(8, false, true);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C6686
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void mo4068(int i, C8436 c8436, String str, Bundle bundle) {
        this.f5756.m4149(i, c8436, str, bundle);
    }
}
