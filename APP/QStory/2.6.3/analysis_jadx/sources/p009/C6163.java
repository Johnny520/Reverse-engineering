package p009;

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
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import java.util.List;
import lin.xposed.hook.loader.config.AbstractC5555;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p026.AbstractC6311;
import p026.AbstractC6314;
import p217.InterfaceC7966;
import p287.AbstractC8405;
import p337.AbstractC8803;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6163 implements InterfaceC7966 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6182 f16950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16951;

    public /* synthetic */ C6163(C6182 c6182, int i) {
        this.f16951 = i;
        this.f16950 = c6182;
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo11559(AbstractC2484 abstractC2484, int i, Object obj) {
        int i2 = this.f16951;
        final C6182 c6182 = this.f16950;
        switch (i2) {
            case 0:
                C6161 c6161 = (C6161) abstractC2484;
                AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                c6161.getClass();
                final C6178 c6178 = c6161.f16948;
                ItemUiInfo itemUiInfo = obj instanceof ItemUiInfo ? (ItemUiInfo) obj : null;
                if (itemUiInfo != null) {
                    AbstractC6314 abstractC6314 = itemUiInfo.item;
                    final AbstractC6311 abstractC6311 = abstractC6314 instanceof AbstractC6311 ? (AbstractC6311) abstractC6314 : null;
                    if (abstractC6311 != null) {
                        View view = c6178.f16996;
                        TextView textView = c6178.f16995;
                        Switch r4 = c6178.f16993;
                        C6182.m11568(c6182, view, i, itemUiInfo);
                        if (textView != null) {
                            textView.setText(itemUiInfo.getItemName());
                        }
                        TextView textView2 = c6178.f16994;
                        if (textView2 != null) {
                            String strMo11235 = abstractC6311.mo11235();
                            if (strMo11235 != null) {
                                textView2.setText(strMo11235);
                                textView2.setVisibility(0);
                            } else {
                                textView2.setVisibility(8);
                            }
                        }
                        if (textView != null) {
                            textView.setTextColor(c6182.m13459().getColor(R.color.text_color));
                        }
                        if (r4 != null) {
                            r4.setOnCheckedChangeListener(null);
                        }
                        if (r4 != null) {
                            r4.setChecked(abstractC6311.f17425.booleanValue());
                        }
                        if (r4 != null) {
                            r4.setClickable(true);
                        }
                        if (abstractC6311 instanceof AbstractC8803) {
                            AbstractC8803 abstractC8803 = (AbstractC8803) abstractC6311;
                            if (!abstractC8803.mo11251(AbstractC3056.m6708())) {
                                view.setVisibility(8);
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                AbstractC8405.m13972(1297);
                                layoutParams.getClass();
                                C2518 c2518 = (C2518) layoutParams;
                                ((ViewGroup.MarginLayoutParams) c2518).width = 0;
                                ((ViewGroup.MarginLayoutParams) c2518).height = 0;
                                view.setLayoutParams(c2518);
                            } else {
                                boolean zMo11252 = abstractC8803.mo11252(AbstractC3056.m6708());
                                View view2 = c6178.f17003;
                                if (!zMo11252) {
                                    if (view2 == null) {
                                        ViewStub viewStub = c6178.f16992;
                                        c6178.f17003 = viewStub != null ? viewStub.inflate() : null;
                                    }
                                    View view3 = c6178.f17003;
                                    if (view3 != null) {
                                        ((TextView) view3.findViewById(R.id.limit_text)).setText(AbstractC8405.m13972(1118));
                                    }
                                    if (r4 != null) {
                                        r4.setClickable(false);
                                    }
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setColor(c6182.m13459().getColor(R.color.___res_0x2406048c));
                                    gradientDrawable.setAlpha(130);
                                    view.setBackground(gradientDrawable);
                                } else if (view2 != null) {
                                    view2.setVisibility(8);
                                }
                            }
                        }
                        c6178.f17000 = abstractC6311;
                        if ((abstractC6311.getExceptionCollectionToolInstance().f17430 != null ? !r11.isEmpty() : false) && textView != null) {
                            textView.setTextColor(c6182.m13459().getColor(R.color.____res_0x2406048a));
                        }
                        if (r4 != null) {
                            r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世苏兰哲
                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                    AbstractC8405.m13972(1293);
                                    compoundButton.getClass();
                                    Boolean boolValueOf = Boolean.valueOf(z);
                                    AbstractC6311 abstractC63112 = abstractC6311;
                                    abstractC63112.f17425 = boolValueOf;
                                    AbstractC5555.m10890(abstractC63112);
                                    if (z) {
                                        try {
                                            abstractC63112.startLoadHook();
                                        } catch (Exception e) {
                                            abstractC63112.getExceptionCollectionToolInstance().m11832(e);
                                            TextView textView3 = c6178.f16995;
                                            if (textView3 != null) {
                                                textView3.setTextColor(c6182.m13459().getColor(R.color.____res_0x2406048a));
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
                C6162 c6162 = (C6162) abstractC2484;
                AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                c6162.getClass();
                C6178 c61782 = c6162.f16949;
                DirectoryUiInfo directoryUiInfo = obj instanceof DirectoryUiInfo ? (DirectoryUiInfo) obj : null;
                if (directoryUiInfo != null) {
                    C6182.m11568(c6182, c61782.f16996, i, directoryUiInfo);
                    TextView textView3 = c61782.f16998;
                    if (textView3 != null) {
                        textView3.setText(directoryUiInfo.getItemName());
                    }
                    c61782.f16996.setOnClickListener(new ViewOnClickListenerC3183(directoryUiInfo, 11));
                    break;
                }
                break;
            case 2:
                C6160 c6160 = (C6160) abstractC2484;
                AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                c6160.getClass();
                C6178 c61783 = c6160.f16947;
                ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = obj instanceof ItemUiInfoGroupWrapper ? (ItemUiInfoGroupWrapper) obj : null;
                if (itemUiInfoGroupWrapper != null) {
                    C6182.m11568(c6182, c61783.f16996, i, itemUiInfoGroupWrapper);
                    TextView textView4 = c61783.f17002;
                    if (textView4 != null) {
                        textView4.setText(itemUiInfoGroupWrapper.getGroupName());
                    }
                    break;
                }
                break;
            default:
                C6179 c6179 = (C6179) abstractC2484;
                AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                c6179.getClass();
                C6178 c61784 = c6179.f17004;
                OtherViewItemInfo otherViewItemInfo = obj instanceof OtherViewItemInfo ? (OtherViewItemInfo) obj : null;
                if (otherViewItemInfo != null) {
                    C6182.m11568(c6182, c61784.f16996, i, otherViewItemInfo);
                    TextView textView5 = c61784.f16991;
                    if (textView5 != null) {
                        textView5.setText(otherViewItemInfo.getLeftText());
                    }
                    TextView textView6 = c61784.f16999;
                    if (textView6 != null) {
                        textView6.setText(otherViewItemInfo.getTips());
                    }
                    c61784.f16996.setOnClickListener(otherViewItemInfo.getOnClick());
                    break;
                }
                break;
        }
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2484 mo11560(Context context, ViewGroup viewGroup) {
        switch (this.f16951) {
            case 0:
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_withtips_layout, viewGroup, false);
                viewInflate.getClass();
                C6178 c6178 = new C6178(viewInflate);
                viewInflate.setOnClickListener(new ViewOnClickListenerC3183(c6178, 10));
                return new C6161(c6178);
            case 1:
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.directory_item_root_layout, viewGroup, false);
                viewInflate2.getClass();
                return new C6162(new C6178(viewInflate2));
            case 2:
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.group_name_layout, viewGroup, false);
                viewInflate3.getClass();
                return new C6160(new C6178(viewInflate3));
            default:
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.main_base_item_layout, viewGroup, false);
                viewInflate4.getClass();
                return new C6179(new C6178(viewInflate4));
        }
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* bridge */ void mo11561(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        switch (this.f16951) {
            case 0:
                super.mo11561((C6161) abstractC2484, i, obj, list);
                break;
            case 1:
                super.mo11561((C6162) abstractC2484, i, obj, list);
                break;
            case 2:
                super.mo11561((C6160) abstractC2484, i, obj, list);
                break;
            default:
                super.mo11561((C6179) abstractC2484, i, obj, list);
                break;
        }
    }
}
