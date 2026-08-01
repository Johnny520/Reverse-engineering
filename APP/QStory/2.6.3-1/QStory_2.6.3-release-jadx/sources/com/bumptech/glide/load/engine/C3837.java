package com.bumptech.glide.load.engine;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import androidx.compose.animation.core.C1171;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.platform.actionmodecallback.MenuItemOption;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.C2080;
import androidx.core.view.C3075;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C3382;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5480;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5581;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5588;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5591;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5599;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5603;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5604;
import lin.xposed.hook.javaplugin.view.C6380;
import p062.C7306;
import p066.AbstractC7365;
import p068.InterfaceC7372;
import p095.AbstractC7818;
import p128.C8157;
import p234.AbstractC8800;
import p245.ExecutorServiceC8872;
import p273.C9027;
import p273.C9037;
import p273.C9052;
import p273.C9056;
import p273.C9069;
import p273.RunnableC9063;
import p277.AbstractC9077;
import p331.C9492;
import p339.C9536;
import p339.C9537;
import p360.AbstractC9653;
import p360.C9654;
import top.suzhelan.plugin.sdk.online.presenter.C6635;
import top.suzhelan.sticker.sdk.presenter.C6815;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;
import top.suzhelan.sticker.sdk.widget.FollowLinearLayout;
import top.yukonga.miuix.kmp.theme.ColorSchemeMode;
import top.yukonga.miuix.kmp.theme.ThemeColorSpec;
import top.yukonga.miuix.kmp.theme.ThemePaletteStyle;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3837 implements InterfaceC5475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f9878;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f9879;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f9880;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Object f9881;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f9882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f9883;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f9884;

    public C3837(ColorSchemeMode colorSchemeMode) {
        C9654 c9654M15045 = AbstractC9653.m15045();
        long jM3440 = AbstractC2416.m3440(4280777463L);
        long j = C2434.f5039;
        long jM34402 = AbstractC2416.m3440(4278219741L);
        long jM34403 = AbstractC2416.m3440(4288268273L);
        long jM34404 = AbstractC2416.m3440(4293993762L);
        long jM34405 = AbstractC2416.m3440(4281206275L);
        long jM34406 = AbstractC2416.m3440(4294957782L);
        long jM34407 = AbstractC2416.m3440(4280630884L);
        long jM34408 = AbstractC2416.m3440(4284971411L);
        long jM34409 = AbstractC2416.m3440(4280630884L);
        long jM344010 = AbstractC2416.m3440(4284971155L);
        long jM344011 = AbstractC2416.m3440(4282669180L);
        long jM344012 = AbstractC2416.m3440(4281569252L);
        long jM344013 = AbstractC2416.m3440(4283453520L);
        long jM344014 = AbstractC2416.m3440(4282598211L);
        long jM344015 = AbstractC2416.m3440(4292467161L);
        long jM344016 = AbstractC2416.m3440(4282335039L);
        long jM344017 = AbstractC2416.m3440(4286151033L);
        long jM344018 = AbstractC2416.m3440(4282400832L);
        long jM344019 = AbstractC2416.m3440(4285559152L);
        long jM344020 = AbstractC2416.m3440(4282598211L);
        long jM344021 = AbstractC2416.m3440(4286348412L);
        long jM344022 = AbstractC2416.m3440(4283387727L);
        long jM344023 = AbstractC2416.m3440(4287993237L);
        long jM344024 = AbstractC2416.m3440(4281023316L);
        long jM344025 = AbstractC2416.m3440(4282878207L);
        long jM344026 = AbstractC2416.m3440(4283453520L);
        long jM344027 = AbstractC2416.m3440(4280558628L);
        long jM344028 = AbstractC2416.m3440(3875536895L);
        long jM344029 = AbstractC2416.m3440(4286086806L);
        long j2 = C2434.f5041;
        C9654 c9654 = new C9654(jM3440, j, jM34402, jM34403, jM34404, j, jM34405, jM34406, jM34407, jM34408, jM34409, jM344010, jM344011, jM344012, j, jM344013, j, jM344014, jM344015, jM344016, jM344017, jM344018, jM344019, jM344020, jM344021, jM344022, jM344023, jM344024, jM344025, jM344026, jM344027, jM344028, jM344029, j2, AbstractC2416.m3440(4294111986L), AbstractC2416.m3440(4280558628L), AbstractC2416.m3440(3439329279L), AbstractC2416.m3440(2164260863L), AbstractC2416.m3442(1728053247), AbstractC2416.m3440(4284900966L), AbstractC2416.m3440(4280558628L), AbstractC2416.m3440(3875536895L), AbstractC2416.m3440(4285756275L), AbstractC2416.m3440(4280558628L), AbstractC2416.m3440(4284900966L), AbstractC2416.m3440(4281150765L), AbstractC2416.m3440(4293519849L), AbstractC2416.m3440(4282400832L), AbstractC2416.m3440(4281940281L), C2434.m3510(0.6f, j2), AbstractC2416.m3442(1299876518), AbstractC2416.m3440(4284328703L), AbstractC2416.m3442(654311423));
        ThemeColorSpec themeColorSpec = ThemeColorSpec.Spec2021;
        ThemePaletteStyle themePaletteStyle = ThemePaletteStyle.TonalSpot;
        colorSchemeMode.getClass();
        themeColorSpec.getClass();
        themePaletteStyle.getClass();
        this.f9884 = AbstractC2202.m3034(colorSchemeMode);
        this.f9882 = AbstractC2202.m3034(c9654M15045);
        this.f9883 = AbstractC2202.m3034(c9654);
        this.f9879 = AbstractC2202.m3034(null);
        this.f9878 = AbstractC2202.m3034(themeColorSpec);
        this.f9880 = AbstractC2202.m3034(themePaletteStyle);
        this.f9881 = AbstractC2202.m3034(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m7047(Menu menu, MenuItemOption menuItemOption, InterfaceC7372 interfaceC7372) {
        if (interfaceC7372 != null && menu.findItem(menuItemOption.getId()) == null) {
            m7048(menu, menuItemOption);
        } else {
            if (interfaceC7372 != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7048(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2434 m7049() {
        return (C2434) ((AbstractC2182) ((InterfaceC2230) this.f9879)).getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo1541(C5523 c5523, C5581 c5581) {
        ((HashMap) this.f9882).put(c5523, new C5591(new C5588(c5581)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ThemeColorSpec m7050() {
        return (ThemeColorSpec) ((AbstractC2182) ((InterfaceC2230) this.f9878)).getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo1542() {
        C5480 c5480 = (C5480) this.f9883;
        C5520 c5520 = (C5520) this.f9878;
        HashMap map = (HashMap) this.f9882;
        map.getClass();
        boolean zM9802 = false;
        if (c5520.equals(AbstractC7365.f18279)) {
            Object obj = map.get(C5523.m9889("value"));
            C5591 c5591 = obj instanceof C5591 ? (C5591) obj : null;
            if (c5591 != null) {
                Object obj2 = c5591.f14250;
                C5588 c5588 = obj2 instanceof C5588 ? (C5588) obj2 : null;
                if (c5588 != null) {
                    zM9802 = c5480.m9802(c5588.f14244.f14241);
                }
            }
        }
        if (zM9802 || c5480.m9802(c5520)) {
            return;
        }
        ((List) this.f9880).add(new C7306(((AbstractC7818) this.f9879).mo9584(), map, (InterfaceC5294) this.f9881));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public InterfaceC5476 mo1544(C5523 c5523) {
        return new C1171((C5480) this.f9884, c5523, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m7051() {
        int bindingAdapterPosition;
        C3382 c3382 = (C3382) this.f9880;
        if (c3382 == null) {
            AbstractC5227.m9467("viewPager");
            throw null;
        }
        View childAt = c3382.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        C3382 c33822 = (C3382) this.f9880;
        if (c33822 == null) {
            AbstractC5227.m9467("viewPager");
            throw null;
        }
        AbstractC3317 abstractC3317M5276 = recyclerView.m5276(c33822.getCurrentItem());
        C9492 c9492 = abstractC3317M5276 instanceof C9492 ? (C9492) abstractC3317M5276 : null;
        if (c9492 == null || (bindingAdapterPosition = c9492.getBindingAdapterPosition()) == -1) {
            return;
        }
        C3382 c33823 = (C3382) this.f9880;
        if (c33823 == null) {
            AbstractC5227.m9467("viewPager");
            throw null;
        }
        if (bindingAdapterPosition != c33823.getCurrentItem()) {
            return;
        }
        FollowLinearLayout followLinearLayout = (FollowLinearLayout) this.f9879;
        if (followLinearLayout != null) {
            followLinearLayout.setFollowRecycleView((CustomRecycleView) c9492.m14919(C0328R.id.rv_sticker_list));
        } else {
            AbstractC5227.m9467("rootView");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m7052() {
        C9056 c9056 = (C9056) this.f9882;
        c9056.m8612();
        if (c9056.m8614() != null) {
            AbstractC4570.m8587(c9056.m8614());
            return;
        }
        View viewM8610 = c9056.m8610(c9056.m8618(c9056.mo8603()) != 0 ? c9056.m8618(c9056.mo8603()) : c9056.mo8603() ? C0328R.layout.layout_dialogx_fullscreen : C0328R.layout.layout_dialogx_fullscreen_dark);
        c9056.f23053 = new C9052(c9056, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(c9056.f23046);
        }
        AbstractC4570.m8587(viewM8610);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo1548(C5523 c5523, Object obj) {
        AbstractC5600 abstractC5600M10054 = C5599.m10054(obj, ((C5480) this.f9884).f13928);
        if (abstractC5600M10054 == null) {
            abstractC5600M10054 = new C5604("Unsupported annotation argument: " + c5523);
        }
        ((HashMap) this.f9882).put(c5523, abstractC5600M10054);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ThemePaletteStyle m7053() {
        return (ThemePaletteStyle) ((AbstractC2182) ((InterfaceC2230) this.f9880)).getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo1549(C5523 c5523, C5520 c5520, C5523 c55232) {
        ((HashMap) this.f9882).put(c5523, new C5603(c5520, c55232));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m7054(String str) {
        C9027.m14269();
        ((C9069) this.f9882).m14323();
        C9037.m14288(str, "错误").mo14278("确定", new C6380(5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public InterfaceC5475 mo1551(C5520 c5520, C5523 c5523) {
        ArrayList arrayList = new ArrayList();
        return new C2080(((C5480) this.f9884).mo9801(c5520, InterfaceC5294.f13436, arrayList), this, c5523, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m7055() {
        C9056 c9056 = (C9056) this.f9882;
        int i = 0;
        c9056.f23051 = new C9536(this, (byte) 0);
        if (c9056.f23053 != null) {
            AbstractC4570.m8589(new RunnableC9063(c9056, i));
        }
        C9537 c9537 = new C9537(this, 4);
        c9056.f23045 = c9537;
        if (c9056.f11929) {
            c9537.mo8625(c9056.f23046);
        }
    }

    public C3837(Activity activity, int i) {
        switch (i) {
            case 5:
                activity.getClass();
                this.f9884 = activity;
                C9056 c9056 = new C9056();
                c9056.f23048 = AbstractC9077.f23169;
                c9056.f23047 = -1.0f;
                c9056.f23050 = true;
                c9056.f23046 = c9056;
                c9056.f11927 = DialogX$THEME.AUTO;
                this.f9882 = c9056;
                this.f9883 = new C6635(this);
                break;
            default:
                this.f9884 = activity;
                C9069 c9069M14318 = C9069.m14318();
                c9069M14318.f11927 = DialogX$THEME.AUTO;
                this.f9882 = c9069M14318;
                this.f9883 = new C6815(this);
                break;
        }
    }

    public C3837(C5480 c5480, AbstractC7818 abstractC7818, C5520 c5520, List list, InterfaceC5294 interfaceC5294) {
        this.f9883 = c5480;
        this.f9879 = abstractC7818;
        this.f9878 = c5520;
        this.f9880 = list;
        this.f9881 = interfaceC5294;
        this.f9884 = c5480;
        this.f9882 = new HashMap();
    }

    public C3837(InterfaceC7372 interfaceC7372) {
        this.f9884 = interfaceC7372;
        this.f9882 = C8157.f19881;
        this.f9883 = null;
        this.f9879 = null;
        this.f9878 = null;
        this.f9880 = null;
        this.f9881 = null;
    }

    public C3837(ExecutorServiceC8872 executorServiceC8872, ExecutorServiceC8872 executorServiceC88722, ExecutorServiceC8872 executorServiceC88723, ExecutorServiceC8872 executorServiceC88724, C3840 c3840, C3840 c38402) {
        this.f9881 = AbstractC8800.m14020(150, new C3075(this, 9));
        this.f9884 = executorServiceC8872;
        this.f9882 = executorServiceC88722;
        this.f9883 = executorServiceC88723;
        this.f9879 = executorServiceC88724;
        this.f9878 = c3840;
        this.f9880 = c38402;
    }
}
