package p346;

import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.compose.C0851;
import androidx.compose.foundation.lazy.C1596;
import androidx.recyclerview.widget.AbstractC3297;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.C3296;
import androidx.recyclerview.widget.C3299;
import androidx.recyclerview.widget.C3300;
import androidx.recyclerview.widget.C3306;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.AbstractC3889;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.collections.AbstractC5176;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC6375;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p025.ViewOnClickListenerC7010;
import p103.C7897;
import p209.C8657;
import p233.AbstractC8798;
import p246.C8882;
import p273.C9037;
import p273.C9062;
import p273.C9069;
import p303.AbstractC9234;
import p358.C9646;
import p370.C9715;
import p370.C9717;
import top.suzhelan.qstory.hook.item.C6707;
import top.suzhelan.qstory.hook.item.mcp.config.C6701;
import top.suzhelan.qstory.hook.item.mcp.config.C6702;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9606 extends AbstractC4581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f25074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f25075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25076 = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9606(C9717 c9717, C3306 c3306) {
        super(C0328R.layout.dialog_mcp_server_config);
        this.f25075 = c9717;
        this.f25074 = c3306;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4581
    public final void onBind(Object obj, View view) {
        int i = this.f25076;
        int i2 = 12;
        Object obj2 = this.f25074;
        Object obj3 = this.f25075;
        final int i3 = 0;
        switch (i) {
            case 0:
                C9062 c9062 = (C9062) obj;
                AbstractC9234.m14532("喵喵喵喵喵呜喵呜");
                view.getClass();
                final C9717 c9717 = (C9717) obj3;
                C3306 c3306 = (C3306) obj2;
                DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) view.findViewById(C0328R.id.rv_mcp_config);
                TextView textView = (TextView) view.findViewById(C0328R.id.tv_mcp_enabled_summary);
                TextView textView2 = (TextView) view.findViewById(C0328R.id.tv_mcp_client_config);
                View viewFindViewById = view.findViewById(C0328R.id.btn_mcp_save);
                View viewFindViewById2 = view.findViewById(C0328R.id.btn_mcp_cancel);
                View viewFindViewById3 = view.findViewById(C0328R.id.btn_mcp_enable_all);
                View viewFindViewById4 = view.findViewById(C0328R.id.btn_mcp_disable_all);
                view.getContext();
                dialogXRecycleView.setLayoutManager(new LinearLayoutManager(1));
                dialogXRecycleView.setAdapter(c9717);
                C3300 c3300 = c3306.f7735;
                DialogXRecycleView dialogXRecycleView2 = c3306.f7752;
                if (dialogXRecycleView2 != dialogXRecycleView) {
                    if (dialogXRecycleView2 != null) {
                        dialogXRecycleView2.m5295(c3306);
                        c3306.f7752.removeOnItemTouchListener(c3300);
                        c3306.f7752.removeOnChildAttachStateChangeListener(c3306);
                        ArrayList arrayList = c3306.f7754;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            C3299 c3299 = (C3299) arrayList.get(0);
                            c3299.f7697.cancel();
                            C9607 c9607 = c3306.f7750;
                            AbstractC3317 abstractC3317 = c3299.f7687;
                            c9607.getClass();
                            AbstractC3297.m5427(abstractC3317);
                        }
                        arrayList.clear();
                        c3306.f7745 = null;
                        VelocityTracker velocityTracker = c3306.f7743;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            c3306.f7743 = null;
                        }
                        C3296 c3296 = c3306.f7736;
                        if (c3296 != null) {
                            c3296.f7681 = false;
                            c3306.f7736 = null;
                        }
                        if (c3306.f7746 != null) {
                            c3306.f7746 = null;
                        }
                    }
                    c3306.f7752 = dialogXRecycleView;
                    Resources resources = dialogXRecycleView.getResources();
                    c3306.f7737 = resources.getDimension(C0328R.dimen.item_touch_helper_swipe_escape_velocity);
                    c3306.f7756 = resources.getDimension(C0328R.dimen.item_touch_helper_swipe_escape_max_velocity);
                    c3306.f7751 = ViewConfiguration.get(c3306.f7752.getContext()).getScaledTouchSlop();
                    c3306.f7752.m5291(c3306);
                    c3306.f7752.addOnItemTouchListener(c3300);
                    c3306.f7752.addOnChildAttachStateChangeListener(c3306);
                    c3306.f7736 = new C3296(c3306);
                    c3306.f7746 = new GestureDetector(c3306.f7752.getContext(), c3306.f7736);
                }
                c9717.f25400 = new C0851(textView, 20, c9717);
                c9717.f25402 = new C6886(c3306, 12);
                textView.getClass();
                AbstractC3889.m7297(textView, c9717.m15098());
                textView2.getClass();
                C6701.f16375.getClass();
                String strM14531 = AbstractC9234.m14531(2297);
                textView2.setText(strM14531);
                textView2.setOnClickListener(new ViewOnClickListenerC6392(textView2, 14, strM14531));
                viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世苏兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) throws NoSuchMethodException {
                        int i4 = i3;
                        C9717 c97172 = c9717;
                        switch (i4) {
                            case 0:
                                ArrayList arrayList2 = c97172.f25401;
                                final boolean z = true;
                                arrayList2.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C6702 c6702 = (C6702) obj4;
                                        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜");
                                        c6702.getClass();
                                        return C6702.m11830(c6702, z, 0, 23);
                                    }
                                });
                                AbstractC8798.m14017(c97172, AbstractC5176.m9356(arrayList2));
                                C0851 c0851 = c97172.f25400;
                                if (c0851 != null) {
                                    c0851.invoke();
                                }
                                break;
                            default:
                                ArrayList arrayList3 = c97172.f25401;
                                final boolean z2 = false;
                                arrayList3.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C6702 c6702 = (C6702) obj4;
                                        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜");
                                        c6702.getClass();
                                        return C6702.m11830(c6702, z2, 0, 23);
                                    }
                                });
                                AbstractC8798.m14017(c97172, AbstractC5176.m9356(arrayList3));
                                C0851 c08512 = c97172.f25400;
                                if (c08512 != null) {
                                    c08512.invoke();
                                }
                                break;
                        }
                    }
                });
                final int i4 = 1;
                viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世苏兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) throws NoSuchMethodException {
                        int i42 = i4;
                        C9717 c97172 = c9717;
                        switch (i42) {
                            case 0:
                                ArrayList arrayList2 = c97172.f25401;
                                final boolean z = true;
                                arrayList2.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C6702 c6702 = (C6702) obj4;
                                        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜");
                                        c6702.getClass();
                                        return C6702.m11830(c6702, z, 0, 23);
                                    }
                                });
                                AbstractC8798.m14017(c97172, AbstractC5176.m9356(arrayList2));
                                C0851 c0851 = c97172.f25400;
                                if (c0851 != null) {
                                    c0851.invoke();
                                }
                                break;
                            default:
                                ArrayList arrayList3 = c97172.f25401;
                                final boolean z2 = false;
                                arrayList3.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C6702 c6702 = (C6702) obj4;
                                        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜");
                                        c6702.getClass();
                                        return C6702.m11830(c6702, z2, 0, 23);
                                    }
                                });
                                AbstractC8798.m14017(c97172, AbstractC5176.m9356(arrayList3));
                                C0851 c08512 = c97172.f25400;
                                if (c08512 != null) {
                                    c08512.invoke();
                                }
                                break;
                        }
                    }
                });
                viewFindViewById2.setOnClickListener(new ViewOnClickListenerC4015(c9062, 26));
                viewFindViewById.setOnClickListener(new ViewOnClickListenerC6392(c9717, 13, c9062));
                break;
            case 1:
                C9069 c9069 = (C9069) obj;
                c9069.getClass();
                view.getClass();
                EditText editText = (EditText) view.findViewById(C0328R.id.et_new_dir_name);
                TextView textView3 = (TextView) view.findViewById(C0328R.id.btn_create_and_download);
                CustomRecycleView customRecycleView = (CustomRecycleView) view.findViewById(C0328R.id.rv_dir_list);
                TextView textView4 = (TextView) view.findViewById(C0328R.id.tv_empty_hint);
                C8882 c8882 = (C8882) obj3;
                editText.setText((String) c8882.f22570);
                textView3.setOnClickListener(new ViewOnClickListenerC6375(editText, c9069, c8882, 9));
                List list = (List) obj2;
                if (list.isEmpty()) {
                    customRecycleView.setVisibility(8);
                    textView4.setVisibility(0);
                } else {
                    customRecycleView.setVisibility(0);
                    textView4.setVisibility(8);
                    C9646 c9646 = new C9646(new C7897(c9069, 8, c8882), i3);
                    view.getContext();
                    customRecycleView.setLayoutManager(new LinearLayoutManager(1));
                    customRecycleView.setAdapter(c9646);
                    AbstractC8798.m14017(c9646, list);
                }
                break;
            default:
                AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                ((C9037) obj).getClass();
                AbstractC9234.m14532("喵喵喵喵喵呜喵呜");
                view.getClass();
                C8657 c8657 = (C8657) obj3;
                EditText editText2 = (EditText) view.findViewById(C0328R.id.et_search);
                ImageView imageView = (ImageView) view.findViewById(C0328R.id.iv_clear);
                TextView textView5 = (TextView) view.findViewById(C0328R.id.tv_selected_count);
                DialogXRecycleView dialogXRecycleView3 = (DialogXRecycleView) view.findViewById(C0328R.id.rv_troop_list);
                Button button = (Button) view.findViewById(C0328R.id.btn_quit);
                editText2.addTextChangedListener(new C6707(2, imageView, c8657));
                imageView.setOnClickListener(new ViewOnClickListenerC7010(editText2, 2));
                view.getContext();
                dialogXRecycleView3.setLayoutManager(new LinearLayoutManager(1));
                C9715 c9715 = (C9715) c8657.f21713;
                dialogXRecycleView3.setAdapter(c9715);
                c9715.f25396 = new C1596(c8657, textView5, button, i2);
                AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜");
                c9715.f25398 = (ArrayList) obj2;
                c9715.m15097();
                button.setOnClickListener(new ViewOnClickListenerC4015(c8657, 29));
                textView5.getClass();
                c8657.m13750(textView5, button);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9606(C8882 c8882, List list) {
        super(C0328R.layout.dialog_download_dir);
        this.f25075 = c8882;
        this.f25074 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9606(C8657 c8657, ArrayList arrayList) {
        super(C0328R.layout.dialog_manage_troops);
        this.f25075 = c8657;
        this.f25074 = arrayList;
    }
}
