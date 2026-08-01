package p025;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.C3351;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import java.util.List;
import lin.xposed.hook.loader.config.AbstractC6386;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p042.AbstractC7140;
import p042.AbstractC7143;
import p233.InterfaceC8795;
import p353.AbstractC9632;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6992 implements InterfaceC8795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C7011 f17295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17296;

    public /* synthetic */ C6992(C7011 c7011, int i) {
        this.f17296 = i;
        this.f17295 = c7011;
    }

    @Override // p233.InterfaceC8795
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo12118(AbstractC3317 abstractC3317, int i, Object obj) {
        int i2 = this.f17296;
        final C7011 c7011 = this.f17295;
        switch (i2) {
            case 0:
                C6990 c6990 = (C6990) abstractC3317;
                "holder";
                c6990.getClass();
                final C7007 c7007 = c6990.f17293;
                ItemUiInfo itemUiInfo = obj instanceof ItemUiInfo ? (ItemUiInfo) obj : null;
                if (itemUiInfo != null) {
                    AbstractC7143 abstractC7143 = itemUiInfo.item;
                    final AbstractC7140 abstractC7140 = abstractC7143 instanceof AbstractC7140 ? (AbstractC7140) abstractC7143 : null;
                    if (abstractC7140 != null) {
                        View view = c7007.f17341;
                        TextView textView = c7007.f17340;
                        Switch r4 = c7007.f17338;
                        C7011.m12127(c7011, view, i, itemUiInfo);
                        if (textView != null) {
                            textView.setText(itemUiInfo.getItemName());
                        }
                        TextView textView2 = c7007.f17339;
                        if (textView2 != null) {
                            String strMo11794 = abstractC7140.mo11794();
                            if (strMo11794 != null) {
                                textView2.setText(strMo11794);
                                textView2.setVisibility(0);
                            } else {
                                textView2.setVisibility(8);
                            }
                        }
                        if (textView != null) {
                            textView.setTextColor(c7011.m14018().getColor(C0328R.color.text_color));
                        }
                        if (r4 != null) {
                            r4.setOnCheckedChangeListener(null);
                        }
                        if (r4 != null) {
                            r4.setChecked(abstractC7140.f17770.booleanValue());
                        }
                        if (r4 != null) {
                            r4.setClickable(true);
                        }
                        if (abstractC7140 instanceof AbstractC9632) {
                            AbstractC9632 abstractC9632 = (AbstractC9632) abstractC7140;
                            if (!abstractC9632.mo11810(AbstractC3888.m7268())) {
                                view.setVisibility(8);
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams";
                                layoutParams.getClass();
                                C3351 c3351 = (C3351) layoutParams;
                                ((ViewGroup.MarginLayoutParams) c3351).width = 0;
                                ((ViewGroup.MarginLayoutParams) c3351).height = 0;
                                view.setLayoutParams(c3351);
                            } else {
                                boolean zMo11811 = abstractC9632.mo11811(AbstractC3888.m7268());
                                View view2 = c7007.f17348;
                                if (!zMo11811) {
                                    if (view2 == null) {
                                        ViewStub viewStub = c7007.f17337;
                                        c7007.f17348 = viewStub != null ? viewStub.inflate() : null;
                                    }
                                    View view3 = c7007.f17348;
                                    if (view3 != null) {
                                        ((TextView) view3.findViewById(C0328R.id.limit_text)).setText("你的身份权限无法使用此功能");
                                    }
                                    if (r4 != null) {
                                        r4.setClickable(false);
                                    }
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setColor(c7011.m14018().getColor(C0328R.color.___res_0x2406048c));
                                    gradientDrawable.setAlpha(130);
                                    view.setBackground(gradientDrawable);
                                } else if (view2 != null) {
                                    view2.setVisibility(8);
                                }
                            }
                        }
                        c7007.f17345 = abstractC7140;
                        if ((abstractC7140.getExceptionCollectionToolInstance().f17775 != null ? !r11.isEmpty() : false) && textView != null) {
                            textView.setTextColor(c7011.m14018().getColor(C0328R.color.____res_0x2406048a));
                        }
                        if (r4 != null) {
                            r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世苏兰哲
                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                    "<unused var>";
                                    compoundButton.getClass();
                                    Boolean boolValueOf = Boolean.valueOf(z);
                                    AbstractC7140 abstractC71402 = abstractC7140;
                                    abstractC71402.f17770 = boolValueOf;
                                    AbstractC6386.m11449(abstractC71402);
                                    if (z) {
                                        try {
                                            abstractC71402.startLoadHook();
                                        } catch (Exception e) {
                                            abstractC71402.getExceptionCollectionToolInstance().m12391(e);
                                            TextView textView3 = c7007.f17340;
                                            if (textView3 != null) {
                                                textView3.setTextColor(c7011.m14018().getColor(C0328R.color.____res_0x2406048a));
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
                C6991 c6991 = (C6991) abstractC3317;
                "holder";
                c6991.getClass();
                C7007 c70072 = c6991.f17294;
                DirectoryUiInfo directoryUiInfo = obj instanceof DirectoryUiInfo ? (DirectoryUiInfo) obj : null;
                if (directoryUiInfo != null) {
                    C7011.m12127(c7011, c70072.f17341, i, directoryUiInfo);
                    TextView textView3 = c70072.f17343;
                    if (textView3 != null) {
                        textView3.setText(directoryUiInfo.getItemName());
                    }
                    c70072.f17341.setOnClickListener(new ViewOnClickListenerC4015(directoryUiInfo, 11));
                    break;
                }
                break;
            case 2:
                C6989 c6989 = (C6989) abstractC3317;
                "holder";
                c6989.getClass();
                C7007 c70073 = c6989.f17292;
                ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = obj instanceof ItemUiInfoGroupWrapper ? (ItemUiInfoGroupWrapper) obj : null;
                if (itemUiInfoGroupWrapper != null) {
                    C7011.m12127(c7011, c70073.f17341, i, itemUiInfoGroupWrapper);
                    TextView textView4 = c70073.f17347;
                    if (textView4 != null) {
                        textView4.setText(itemUiInfoGroupWrapper.getGroupName());
                    }
                    break;
                }
                break;
            default:
                C7008 c7008 = (C7008) abstractC3317;
                "holder";
                c7008.getClass();
                C7007 c70074 = c7008.f17349;
                OtherViewItemInfo otherViewItemInfo = obj instanceof OtherViewItemInfo ? (OtherViewItemInfo) obj : null;
                if (otherViewItemInfo != null) {
                    C7011.m12127(c7011, c70074.f17341, i, otherViewItemInfo);
                    TextView textView5 = c70074.f17336;
                    if (textView5 != null) {
                        textView5.setText(otherViewItemInfo.getLeftText());
                    }
                    TextView textView6 = c70074.f17344;
                    if (textView6 != null) {
                        textView6.setText(otherViewItemInfo.getTips());
                    }
                    c70074.f17341.setOnClickListener(otherViewItemInfo.getOnClick());
                    break;
                }
                break;
        }
    }

    @Override // p233.InterfaceC8795
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3317 mo12119(Context context, ViewGroup viewGroup) {
        switch (this.f17296) {
            case 0:
                "context";
                "parent";
                View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.item_withtips_layout, viewGroup, false);
                viewInflate.getClass();
                C7007 c7007 = new C7007(viewInflate);
                viewInflate.setOnClickListener(new ViewOnClickListenerC4015(c7007, 10));
                return new C6990(c7007);
            case 1:
                "context";
                "parent";
                View viewInflate2 = LayoutInflater.from(context).inflate(C0328R.layout.directory_item_root_layout, viewGroup, false);
                viewInflate2.getClass();
                return new C6991(new C7007(viewInflate2));
            case 2:
                "context";
                "parent";
                View viewInflate3 = LayoutInflater.from(context).inflate(C0328R.layout.group_name_layout, viewGroup, false);
                viewInflate3.getClass();
                return new C6989(new C7007(viewInflate3));
            default:
                "context";
                "parent";
                View viewInflate4 = LayoutInflater.from(context).inflate(C0328R.layout.main_base_item_layout, viewGroup, false);
                viewInflate4.getClass();
                return new C7008(new C7007(viewInflate4));
        }
    }

    @Override // p233.InterfaceC8795
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* bridge */ void mo12120(AbstractC3317 abstractC3317, int i, Object obj, List list) {
        switch (this.f17296) {
            case 0:
                super.mo12120((C6990) abstractC3317, i, obj, list);
                break;
            case 1:
                super.mo12120((C6991) abstractC3317, i, obj, list);
                break;
            case 2:
                super.mo12120((C6989) abstractC3317, i, obj, list);
                break;
            default:
                super.mo12120((C7008) abstractC3317, i, obj, list);
                break;
        }
    }
}
