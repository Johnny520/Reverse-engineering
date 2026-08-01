package com.bumptech.glide.load.engine;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import androidx.core.view.C2242;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C2549;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4648;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4749;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4756;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4759;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4767;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4772;
import lin.xposed.hook.javaplugin.view.C5549;
import p046.C6477;
import p050.AbstractC6536;
import p052.InterfaceC6543;
import p079.AbstractC6989;
import p112.C7328;
import p218.AbstractC7971;
import p229.ExecutorServiceC8043;
import p257.C8198;
import p257.C8208;
import p257.C8223;
import p257.C8227;
import p257.C8240;
import p257.RunnableC8234;
import p261.AbstractC8248;
import p315.C8663;
import p323.C8707;
import p323.C8708;
import p344.AbstractC8824;
import p344.C8825;
import top.suzhelan.plugin.sdk.online.presenter.C5805;
import top.suzhelan.sticker.sdk.presenter.C5985;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;
import top.suzhelan.sticker.sdk.widget.FollowLinearLayout;
import top.yukonga.miuix.kmp.theme.ColorSchemeMode;
import top.yukonga.miuix.kmp.theme.ThemeColorSpec;
import top.yukonga.miuix.kmp.theme.ThemePaletteStyle;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3005 implements InterfaceC4643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f9533;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f9534;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f9535;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Object f9536;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f9537;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f9538;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f9539;

    public C3005(ColorSchemeMode colorSchemeMode) {
        C8825 c8825M14486 = AbstractC8824.m14486();
        long jM2880 = AbstractC1581.m2880(4280777463L);
        long j = C1599.f4694;
        long jM28802 = AbstractC1581.m2880(4278219741L);
        long jM28803 = AbstractC1581.m2880(4288268273L);
        long jM28804 = AbstractC1581.m2880(4293993762L);
        long jM28805 = AbstractC1581.m2880(4281206275L);
        long jM28806 = AbstractC1581.m2880(4294957782L);
        long jM28807 = AbstractC1581.m2880(4280630884L);
        long jM28808 = AbstractC1581.m2880(4284971411L);
        long jM28809 = AbstractC1581.m2880(4280630884L);
        long jM288010 = AbstractC1581.m2880(4284971155L);
        long jM288011 = AbstractC1581.m2880(4282669180L);
        long jM288012 = AbstractC1581.m2880(4281569252L);
        long jM288013 = AbstractC1581.m2880(4283453520L);
        long jM288014 = AbstractC1581.m2880(4282598211L);
        long jM288015 = AbstractC1581.m2880(4292467161L);
        long jM288016 = AbstractC1581.m2880(4282335039L);
        long jM288017 = AbstractC1581.m2880(4286151033L);
        long jM288018 = AbstractC1581.m2880(4282400832L);
        long jM288019 = AbstractC1581.m2880(4285559152L);
        long jM288020 = AbstractC1581.m2880(4282598211L);
        long jM288021 = AbstractC1581.m2880(4286348412L);
        long jM288022 = AbstractC1581.m2880(4283387727L);
        long jM288023 = AbstractC1581.m2880(4287993237L);
        long jM288024 = AbstractC1581.m2880(4281023316L);
        long jM288025 = AbstractC1581.m2880(4282878207L);
        long jM288026 = AbstractC1581.m2880(4283453520L);
        long jM288027 = AbstractC1581.m2880(4280558628L);
        long jM288028 = AbstractC1581.m2880(3875536895L);
        long jM288029 = AbstractC1581.m2880(4286086806L);
        long j2 = C1599.f4696;
        C8825 c8825 = new C8825(jM2880, j, jM28802, jM28803, jM28804, j, jM28805, jM28806, jM28807, jM28808, jM28809, jM288010, jM288011, jM288012, j, jM288013, j, jM288014, jM288015, jM288016, jM288017, jM288018, jM288019, jM288020, jM288021, jM288022, jM288023, jM288024, jM288025, jM288026, jM288027, jM288028, jM288029, j2, AbstractC1581.m2880(4294111986L), AbstractC1581.m2880(4280558628L), AbstractC1581.m2880(3439329279L), AbstractC1581.m2880(2164260863L), AbstractC1581.m2882(1728053247), AbstractC1581.m2880(4284900966L), AbstractC1581.m2880(4280558628L), AbstractC1581.m2880(3875536895L), AbstractC1581.m2880(4285756275L), AbstractC1581.m2880(4280558628L), AbstractC1581.m2880(4284900966L), AbstractC1581.m2880(4281150765L), AbstractC1581.m2880(4293519849L), AbstractC1581.m2880(4282400832L), AbstractC1581.m2880(4281940281L), C1599.m2950(0.6f, j2), AbstractC1581.m2882(1299876518), AbstractC1581.m2880(4284328703L), AbstractC1581.m2882(654311423));
        ThemeColorSpec themeColorSpec = ThemeColorSpec.Spec2021;
        ThemePaletteStyle themePaletteStyle = ThemePaletteStyle.TonalSpot;
        colorSchemeMode.getClass();
        themeColorSpec.getClass();
        themePaletteStyle.getClass();
        this.f9539 = AbstractC1367.m2474(colorSchemeMode);
        this.f9537 = AbstractC1367.m2474(c8825M14486);
        this.f9538 = AbstractC1367.m2474(c8825);
        this.f9534 = AbstractC1367.m2474(null);
        this.f9533 = AbstractC1367.m2474(themeColorSpec);
        this.f9535 = AbstractC1367.m2474(themePaletteStyle);
        this.f9536 = AbstractC1367.m2474(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m6487(Menu menu, MenuItemOption menuItemOption, InterfaceC6543 interfaceC6543) {
        if (interfaceC6543 != null && menu.findItem(menuItemOption.getId()) == null) {
            m6488(menu, menuItemOption);
        } else {
            if (interfaceC6543 != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m6488(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1599 m6489() {
        return (C1599) ((AbstractC1347) ((InterfaceC1395) this.f9534)).getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo981(C4691 c4691, C4749 c4749) {
        ((HashMap) this.f9537).put(c4691, new C4759(new C4756(c4749)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ThemeColorSpec m6490() {
        return (ThemeColorSpec) ((AbstractC1347) ((InterfaceC1395) this.f9533)).getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo982() {
        C4648 c4648 = (C4648) this.f9538;
        C4688 c4688 = (C4688) this.f9533;
        HashMap map = (HashMap) this.f9537;
        map.getClass();
        boolean zM9243 = false;
        if (c4688.equals(AbstractC6536.f17934)) {
            Object obj = map.get(C4691.m9330("value"));
            C4759 c4759 = obj instanceof C4759 ? (C4759) obj : null;
            if (c4759 != null) {
                Object obj2 = c4759.f13905;
                C4756 c4756 = obj2 instanceof C4756 ? (C4756) obj2 : null;
                if (c4756 != null) {
                    zM9243 = c4648.m9243(c4756.f13899.f13896);
                }
            }
        }
        if (zM9243 || c4648.m9243(c4688)) {
            return;
        }
        ((List) this.f9535).add(new C6477(((AbstractC6989) this.f9534).mo9025(), map, (InterfaceC4462) this.f9536));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public InterfaceC4644 mo984(C4691 c4691) {
        return new C0325((C4648) this.f9539, c4691, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m6491() {
        int bindingAdapterPosition;
        C2549 c2549 = (C2549) this.f9535;
        if (c2549 == null) {
            AbstractC4395.m8908("viewPager");
            throw null;
        }
        View childAt = c2549.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        C2549 c25492 = (C2549) this.f9535;
        if (c25492 == null) {
            AbstractC4395.m8908("viewPager");
            throw null;
        }
        AbstractC2484 abstractC2484M4716 = recyclerView.m4716(c25492.getCurrentItem());
        C8663 c8663 = abstractC2484M4716 instanceof C8663 ? (C8663) abstractC2484M4716 : null;
        if (c8663 == null || (bindingAdapterPosition = c8663.getBindingAdapterPosition()) == -1) {
            return;
        }
        C2549 c25493 = (C2549) this.f9535;
        if (c25493 == null) {
            AbstractC4395.m8908("viewPager");
            throw null;
        }
        if (bindingAdapterPosition != c25493.getCurrentItem()) {
            return;
        }
        FollowLinearLayout followLinearLayout = (FollowLinearLayout) this.f9534;
        if (followLinearLayout != null) {
            followLinearLayout.setFollowRecycleView((CustomRecycleView) c8663.m14360(R.id.rv_sticker_list));
        } else {
            AbstractC4395.m8908("rootView");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m6492() {
        C8227 c8227 = (C8227) this.f9537;
        c8227.m8053();
        if (c8227.m8055() != null) {
            AbstractC3738.m8028(c8227.m8055());
            return;
        }
        View viewM8051 = c8227.m8051(c8227.m8059(c8227.mo8044()) != 0 ? c8227.m8059(c8227.mo8044()) : c8227.mo8044() ? R.layout.layout_dialogx_fullscreen : R.layout.layout_dialogx_fullscreen_dark);
        c8227.f22708 = new C8223(c8227, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(c8227.f22701);
        }
        AbstractC3738.m8028(viewM8051);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo988(C4691 c4691, Object obj) {
        AbstractC4768 abstractC4768M9495 = C4767.m9495(obj, ((C4648) this.f9539).f13583);
        if (abstractC4768M9495 == null) {
            abstractC4768M9495 = new C4772("Unsupported annotation argument: " + c4691);
        }
        ((HashMap) this.f9537).put(c4691, abstractC4768M9495);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ThemePaletteStyle m6493() {
        return (ThemePaletteStyle) ((AbstractC1347) ((InterfaceC1395) this.f9535)).getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo989(C4691 c4691, C4688 c4688, C4691 c46912) {
        ((HashMap) this.f9537).put(c4691, new C4771(c4688, c46912));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m6494(String str) {
        C8198.m13710();
        ((C8240) this.f9537).m13764();
        C8208.m13729(str, "错误").mo13719("确定", new C5549(5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public InterfaceC4643 mo991(C4688 c4688, C4691 c4691) {
        ArrayList arrayList = new ArrayList();
        return new C1245(((C4648) this.f9539).mo9242(c4688, InterfaceC4462.f13091, arrayList), this, c4691, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m6495() {
        C8227 c8227 = (C8227) this.f9537;
        int i = 0;
        c8227.f22706 = new C8707(this, (byte) 0);
        if (c8227.f22708 != null) {
            AbstractC3738.m8030(new RunnableC8234(c8227, i));
        }
        C8708 c8708 = new C8708(this, 4);
        c8227.f22700 = c8708;
        if (c8227.f11584) {
            c8708.mo8066(c8227.f22701);
        }
    }

    public C3005(Activity activity, int i) {
        switch (i) {
            case 5:
                activity.getClass();
                this.f9539 = activity;
                C8227 c8227 = new C8227();
                c8227.f22703 = AbstractC8248.f22824;
                c8227.f22702 = -1.0f;
                c8227.f22705 = true;
                c8227.f22701 = c8227;
                c8227.f11582 = DialogX$THEME.AUTO;
                this.f9537 = c8227;
                this.f9538 = new C5805(this);
                break;
            default:
                this.f9539 = activity;
                C8240 c8240M13759 = C8240.m13759();
                c8240M13759.f11582 = DialogX$THEME.AUTO;
                this.f9537 = c8240M13759;
                this.f9538 = new C5985(this);
                break;
        }
    }

    public C3005(C4648 c4648, AbstractC6989 abstractC6989, C4688 c4688, List list, InterfaceC4462 interfaceC4462) {
        this.f9538 = c4648;
        this.f9534 = abstractC6989;
        this.f9533 = c4688;
        this.f9535 = list;
        this.f9536 = interfaceC4462;
        this.f9539 = c4648;
        this.f9537 = new HashMap();
    }

    public C3005(InterfaceC6543 interfaceC6543) {
        this.f9539 = interfaceC6543;
        this.f9537 = C7328.f19536;
        this.f9538 = null;
        this.f9534 = null;
        this.f9533 = null;
        this.f9535 = null;
        this.f9536 = null;
    }

    public C3005(ExecutorServiceC8043 executorServiceC8043, ExecutorServiceC8043 executorServiceC80432, ExecutorServiceC8043 executorServiceC80433, ExecutorServiceC8043 executorServiceC80434, C3008 c3008, C3008 c30082) {
        this.f9536 = AbstractC7971.m13461(150, new C2242(this, 9));
        this.f9539 = executorServiceC8043;
        this.f9537 = executorServiceC80432;
        this.f9538 = executorServiceC80433;
        this.f9534 = executorServiceC80434;
        this.f9533 = c3008;
        this.f9535 = c30082;
    }
}
