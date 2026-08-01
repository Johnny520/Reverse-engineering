package p007;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.C2518;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import java.util.List;
import lin.xposed.hook.loader.config.AbstractC5554;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p026.AbstractC6293;
import p026.AbstractC6296;
import p217.InterfaceC7965;
import p336.AbstractC8805;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6129 implements InterfaceC7965 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6148 f16708;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16709;

    public /* synthetic */ C6129(C6148 c6148, int i) {
        this.f16709 = i;
        this.f16708 = c6148;
    }

    @Override // p217.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo11521(AbstractC2484 abstractC2484, int i, Object obj) {
        int i2 = this.f16709;
        final C6148 c6148 = this.f16708;
        switch (i2) {
            case 0:
                C6127 c6127 = (C6127) abstractC2484;
                AbstractC3056.m6668(-3937690694970508711L);
                c6127.getClass();
                final C6144 c6144 = c6127.f16706;
                ItemUiInfo itemUiInfo = obj instanceof ItemUiInfo ? (ItemUiInfo) obj : null;
                if (itemUiInfo != null) {
                    AbstractC6296 abstractC6296 = itemUiInfo.item;
                    final AbstractC6293 abstractC6293 = abstractC6296 instanceof AbstractC6293 ? (AbstractC6293) abstractC6296 : null;
                    if (abstractC6293 != null) {
                        View view = c6144.f16749;
                        TextView textView = c6144.f16748;
                        Switch r4 = c6144.f16746;
                        C6148.m11560(c6148, view, i, itemUiInfo);
                        if (textView != null) {
                            textView.setText(itemUiInfo.getItemName());
                        }
                        TextView textView2 = c6144.f16747;
                        if (textView2 != null) {
                            String strMo11178 = abstractC6293.mo11178();
                            if (strMo11178 != null) {
                                textView2.setText(strMo11178);
                                textView2.setVisibility(0);
                            } else {
                                textView2.setVisibility(8);
                            }
                        }
                        if (textView != null) {
                            textView.setTextColor(c6148.m13431().getColor(R.color.text_color));
                        }
                        if (r4 != null) {
                            r4.setOnCheckedChangeListener(null);
                        }
                        if (r4 != null) {
                            r4.setChecked(abstractC6293.f17376.booleanValue());
                        }
                        if (r4 != null) {
                            r4.setClickable(true);
                        }
                        if (abstractC6293 instanceof AbstractC8805) {
                            AbstractC8805 abstractC8805 = (AbstractC8805) abstractC6293;
                            if (!abstractC8805.mo11255(AbstractC3054.m6612())) {
                                view.setVisibility(8);
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                AbstractC3056.m6668(-3937690274063713703L);
                                layoutParams.getClass();
                                C2518 c2518 = (C2518) layoutParams;
                                ((ViewGroup.MarginLayoutParams) c2518).width = 0;
                                ((ViewGroup.MarginLayoutParams) c2518).height = 0;
                                view.setLayoutParams(c2518);
                            } else {
                                boolean zMo11257 = abstractC8805.mo11257(AbstractC3054.m6612());
                                View view2 = c6144.f16756;
                                if (!zMo11257) {
                                    if (view2 == null) {
                                        ViewStub viewStub = c6144.f16745;
                                        c6144.f16756 = viewStub != null ? viewStub.inflate() : null;
                                    }
                                    View view3 = c6144.f16756;
                                    if (view3 != null) {
                                        ((TextView) view3.findViewById(R.id.limit_text)).setText(AbstractC3056.m6668(-3937674795001578919L));
                                    }
                                    if (r4 != null) {
                                        r4.setClickable(false);
                                    }
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setColor(c6148.m13431().getColor(R.color.___res_0x2406048c));
                                    gradientDrawable.setAlpha(130);
                                    view.setBackground(gradientDrawable);
                                } else if (view2 != null) {
                                    view2.setVisibility(8);
                                }
                            }
                        }
                        c6144.f16753 = abstractC6293;
                        if ((abstractC6293.getExceptionCollectionToolInstance().f17381 != null ? !r11.isEmpty() : false) && textView != null) {
                            textView.setTextColor(c6148.m13431().getColor(R.color.____res_0x2406048a));
                        }
                        if (r4 != null) {
                            r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪世苏兰哲
                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                    AbstractC3056.m6668(-3937690725035279783L);
                                    compoundButton.getClass();
                                    Boolean boolValueOf = Boolean.valueOf(z);
                                    AbstractC6293 abstractC62932 = abstractC6293;
                                    abstractC62932.f17376 = boolValueOf;
                                    AbstractC5554.m10833(abstractC62932);
                                    if (z) {
                                        try {
                                            abstractC62932.startLoadHook();
                                        } catch (Exception e) {
                                            abstractC62932.getExceptionCollectionToolInstance().m11804(e);
                                            TextView textView3 = c6144.f16748;
                                            if (textView3 != null) {
                                                textView3.setTextColor(c6148.m13431().getColor(R.color.____res_0x2406048a));
                                            }
                                        }
                                    }
                                }
                            });
                        }
                        break;
                    }
                }
                break;
            case 1:
                C6128 c6128 = (C6128) abstractC2484;
                AbstractC3056.m6668(-3937690694970508711L);
                c6128.getClass();
                C6144 c61442 = c6128.f16707;
                DirectoryUiInfo directoryUiInfo = obj instanceof DirectoryUiInfo ? (DirectoryUiInfo) obj : null;
                if (directoryUiInfo != null) {
                    C6148.m11560(c6148, c61442.f16749, i, directoryUiInfo);
                    TextView textView3 = c61442.f16751;
                    if (textView3 != null) {
                        textView3.setText(directoryUiInfo.getItemName());
                    }
                    c61442.f16749.setOnClickListener(new ViewOnClickListenerC3182(directoryUiInfo, 9));
                    break;
                }
                break;
            case 2:
                C6126 c6126 = (C6126) abstractC2484;
                AbstractC3056.m6668(-3937690694970508711L);
                c6126.getClass();
                C6144 c61443 = c6126.f16705;
                ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = obj instanceof ItemUiInfoGroupWrapper ? (ItemUiInfoGroupWrapper) obj : null;
                if (itemUiInfoGroupWrapper != null) {
                    C6148.m11560(c6148, c61443.f16749, i, itemUiInfoGroupWrapper);
                    TextView textView4 = c61443.f16755;
                    if (textView4 != null) {
                        textView4.setText(itemUiInfoGroupWrapper.getGroupName());
                    }
                    break;
                }
                break;
            default:
                C6145 c6145 = (C6145) abstractC2484;
                AbstractC3056.m6668(-3937690694970508711L);
                c6145.getClass();
                C6144 c61444 = c6145.f16757;
                OtherViewItemInfo otherViewItemInfo = obj instanceof OtherViewItemInfo ? (OtherViewItemInfo) obj : null;
                if (otherViewItemInfo != null) {
                    C6148.m11560(c6148, c61444.f16749, i, otherViewItemInfo);
                    TextView textView5 = c61444.f16744;
                    if (textView5 != null) {
                        textView5.setText(otherViewItemInfo.getLeftText());
                    }
                    TextView textView6 = c61444.f16752;
                    if (textView6 != null) {
                        textView6.setText(otherViewItemInfo.getTips());
                    }
                    c61444.f16749.setOnClickListener(otherViewItemInfo.getOnClick());
                    break;
                }
                break;
        }
    }

    @Override // p217.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2484 mo11522(Context context, ViewGroup viewGroup) {
        switch (this.f16709) {
            case 0:
                AbstractC3056.m6668(-3937616005489231271L);
                AbstractC3056.m6668(-3937690699265476007L);
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_withtips_layout, viewGroup, false);
                viewInflate.getClass();
                C6144 c6144 = new C6144(viewInflate);
                viewInflate.setOnClickListener(new ViewOnClickListenerC3182(c6144, 8));
                return new C6127(c6144);
            case 1:
                AbstractC3056.m6668(-3937616005489231271L);
                AbstractC3056.m6668(-3937690699265476007L);
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.directory_item_root_layout, viewGroup, false);
                viewInflate2.getClass();
                return new C6128(new C6144(viewInflate2));
            case 2:
                AbstractC3056.m6668(-3937616005489231271L);
                AbstractC3056.m6668(-3937690699265476007L);
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.group_name_layout, viewGroup, false);
                viewInflate3.getClass();
                return new C6126(new C6144(viewInflate3));
            default:
                AbstractC3056.m6668(-3937616005489231271L);
                AbstractC3056.m6668(-3937690699265476007L);
                View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.main_base_item_layout, viewGroup, false);
                viewInflate4.getClass();
                return new C6145(new C6144(viewInflate4));
        }
    }

    @Override // p217.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* bridge */ void mo11523(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        switch (this.f16709) {
            case 0:
                super.mo11523((C6127) abstractC2484, i, obj, list);
                break;
            case 1:
                super.mo11523((C6128) abstractC2484, i, obj, list);
                break;
            case 2:
                super.mo11523((C6126) abstractC2484, i, obj, list);
                break;
            default:
                super.mo11523((C6145) abstractC2484, i, obj, list);
                break;
        }
    }
}
