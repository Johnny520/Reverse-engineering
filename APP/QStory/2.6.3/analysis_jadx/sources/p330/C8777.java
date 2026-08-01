package p330;

import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.compose.C0004;
import androidx.compose.foundation.lazy.C0755;
import androidx.recyclerview.widget.AbstractC2464;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.C2463;
import androidx.recyclerview.widget.C2466;
import androidx.recyclerview.widget.C2467;
import androidx.recyclerview.widget.C2473;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.AbstractC3057;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.collections.AbstractC4344;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5544;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p009.ViewOnClickListenerC6181;
import p087.C7068;
import p193.C7828;
import p217.AbstractC7969;
import p230.C8053;
import p257.C8208;
import p257.C8233;
import p257.C8240;
import p287.AbstractC8405;
import p342.C8817;
import p354.C8886;
import p354.C8888;
import top.suzhelan.qstory.hook.item.C5877;
import top.suzhelan.qstory.hook.item.mcp.config.C5871;
import top.suzhelan.qstory.hook.item.mcp.config.C5872;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8777 extends AbstractC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f24729;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24730;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24731 = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8777(C8888 c8888, C2473 c2473) {
        super(R.layout.dialog_mcp_server_config);
        this.f24730 = c8888;
        this.f24729 = c2473;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3749
    public final void onBind(Object obj, View view) {
        int i = this.f24731;
        int i2 = 12;
        Object obj2 = this.f24729;
        Object obj3 = this.f24730;
        final int i3 = 0;
        switch (i) {
            case 0:
                C8233 c8233 = (C8233) obj;
                AbstractC8405.m13973("喵喵喵喵喵呜喵呜");
                view.getClass();
                final C8888 c8888 = (C8888) obj3;
                C2473 c2473 = (C2473) obj2;
                DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) view.findViewById(R.id.rv_mcp_config);
                TextView textView = (TextView) view.findViewById(R.id.tv_mcp_enabled_summary);
                TextView textView2 = (TextView) view.findViewById(R.id.tv_mcp_client_config);
                View viewFindViewById = view.findViewById(R.id.btn_mcp_save);
                View viewFindViewById2 = view.findViewById(R.id.btn_mcp_cancel);
                View viewFindViewById3 = view.findViewById(R.id.btn_mcp_enable_all);
                View viewFindViewById4 = view.findViewById(R.id.btn_mcp_disable_all);
                view.getContext();
                dialogXRecycleView.setLayoutManager(new LinearLayoutManager(1));
                dialogXRecycleView.setAdapter(c8888);
                C2467 c2467 = c2473.f7390;
                DialogXRecycleView dialogXRecycleView2 = c2473.f7407;
                if (dialogXRecycleView2 != dialogXRecycleView) {
                    if (dialogXRecycleView2 != null) {
                        dialogXRecycleView2.m4735(c2473);
                        c2473.f7407.removeOnItemTouchListener(c2467);
                        c2473.f7407.removeOnChildAttachStateChangeListener(c2473);
                        ArrayList arrayList = c2473.f7409;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            C2466 c2466 = (C2466) arrayList.get(0);
                            c2466.f7352.cancel();
                            C8778 c8778 = c2473.f7405;
                            AbstractC2484 abstractC2484 = c2466.f7342;
                            c8778.getClass();
                            AbstractC2464.m4867(abstractC2484);
                        }
                        arrayList.clear();
                        c2473.f7400 = null;
                        VelocityTracker velocityTracker = c2473.f7398;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            c2473.f7398 = null;
                        }
                        C2463 c2463 = c2473.f7391;
                        if (c2463 != null) {
                            c2463.f7336 = false;
                            c2473.f7391 = null;
                        }
                        if (c2473.f7401 != null) {
                            c2473.f7401 = null;
                        }
                    }
                    c2473.f7407 = dialogXRecycleView;
                    Resources resources = dialogXRecycleView.getResources();
                    c2473.f7392 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                    c2473.f7411 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                    c2473.f7406 = ViewConfiguration.get(c2473.f7407.getContext()).getScaledTouchSlop();
                    c2473.f7407.m4731(c2473);
                    c2473.f7407.addOnItemTouchListener(c2467);
                    c2473.f7407.addOnChildAttachStateChangeListener(c2473);
                    c2473.f7391 = new C2463(c2473);
                    c2473.f7401 = new GestureDetector(c2473.f7407.getContext(), c2473.f7391);
                }
                c8888.f25055 = new C0004(textView, 20, c8888);
                c8888.f25057 = new C6057(c2473, 12);
                textView.getClass();
                AbstractC3057.m6737(textView, c8888.m14539());
                textView2.getClass();
                C5871.f16030.getClass();
                String strM13972 = AbstractC8405.m13972(2297);
                textView2.setText(strM13972);
                textView2.setOnClickListener(new ViewOnClickListenerC5562(textView2, 14, strM13972));
                viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世苏兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) throws NoSuchMethodException {
                        int i4 = i3;
                        C8888 c88882 = c8888;
                        switch (i4) {
                            case 0:
                                ArrayList arrayList2 = c88882.f25056;
                                final boolean z = true;
                                arrayList2.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C5872 c5872 = (C5872) obj4;
                                        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜");
                                        c5872.getClass();
                                        return C5872.m11271(c5872, z, 0, 23);
                                    }
                                });
                                AbstractC7969.m13458(c88882, AbstractC4344.m8797(arrayList2));
                                C0004 c0004 = c88882.f25055;
                                if (c0004 != null) {
                                    c0004.invoke();
                                }
                                break;
                            default:
                                ArrayList arrayList3 = c88882.f25056;
                                final boolean z2 = false;
                                arrayList3.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C5872 c5872 = (C5872) obj4;
                                        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜");
                                        c5872.getClass();
                                        return C5872.m11271(c5872, z2, 0, 23);
                                    }
                                });
                                AbstractC7969.m13458(c88882, AbstractC4344.m8797(arrayList3));
                                C0004 c00042 = c88882.f25055;
                                if (c00042 != null) {
                                    c00042.invoke();
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
                        C8888 c88882 = c8888;
                        switch (i42) {
                            case 0:
                                ArrayList arrayList2 = c88882.f25056;
                                final boolean z = true;
                                arrayList2.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C5872 c5872 = (C5872) obj4;
                                        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜");
                                        c5872.getClass();
                                        return C5872.m11271(c5872, z, 0, 23);
                                    }
                                });
                                AbstractC7969.m13458(c88882, AbstractC4344.m8797(arrayList2));
                                C0004 c0004 = c88882.f25055;
                                if (c0004 != null) {
                                    c0004.invoke();
                                }
                                break;
                            default:
                                ArrayList arrayList3 = c88882.f25056;
                                final boolean z2 = false;
                                arrayList3.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C5872 c5872 = (C5872) obj4;
                                        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜");
                                        c5872.getClass();
                                        return C5872.m11271(c5872, z2, 0, 23);
                                    }
                                });
                                AbstractC7969.m13458(c88882, AbstractC4344.m8797(arrayList3));
                                C0004 c00042 = c88882.f25055;
                                if (c00042 != null) {
                                    c00042.invoke();
                                }
                                break;
                        }
                    }
                });
                viewFindViewById2.setOnClickListener(new ViewOnClickListenerC3183(c8233, 26));
                viewFindViewById.setOnClickListener(new ViewOnClickListenerC5562(c8888, 13, c8233));
                break;
            case 1:
                C8240 c8240 = (C8240) obj;
                c8240.getClass();
                view.getClass();
                EditText editText = (EditText) view.findViewById(R.id.et_new_dir_name);
                TextView textView3 = (TextView) view.findViewById(R.id.btn_create_and_download);
                CustomRecycleView customRecycleView = (CustomRecycleView) view.findViewById(R.id.rv_dir_list);
                TextView textView4 = (TextView) view.findViewById(R.id.tv_empty_hint);
                C8053 c8053 = (C8053) obj3;
                editText.setText((String) c8053.f22225);
                textView3.setOnClickListener(new ViewOnClickListenerC5544(editText, c8240, c8053, 9));
                List list = (List) obj2;
                if (list.isEmpty()) {
                    customRecycleView.setVisibility(8);
                    textView4.setVisibility(0);
                } else {
                    customRecycleView.setVisibility(0);
                    textView4.setVisibility(8);
                    C8817 c8817 = new C8817(new C7068(c8240, 8, c8053), i3);
                    view.getContext();
                    customRecycleView.setLayoutManager(new LinearLayoutManager(1));
                    customRecycleView.setAdapter(c8817);
                    AbstractC7969.m13458(c8817, list);
                }
                break;
            default:
                AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                ((C8208) obj).getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜喵呜");
                view.getClass();
                C7828 c7828 = (C7828) obj3;
                EditText editText2 = (EditText) view.findViewById(R.id.et_search);
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_clear);
                TextView textView5 = (TextView) view.findViewById(R.id.tv_selected_count);
                DialogXRecycleView dialogXRecycleView3 = (DialogXRecycleView) view.findViewById(R.id.rv_troop_list);
                Button button = (Button) view.findViewById(R.id.btn_quit);
                editText2.addTextChangedListener(new C5877(2, imageView, c7828));
                imageView.setOnClickListener(new ViewOnClickListenerC6181(editText2, 2));
                view.getContext();
                dialogXRecycleView3.setLayoutManager(new LinearLayoutManager(1));
                C8886 c8886 = (C8886) c7828.f21368;
                dialogXRecycleView3.setAdapter(c8886);
                c8886.f25051 = new C0755(c7828, textView5, button, i2);
                AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜");
                c8886.f25053 = (ArrayList) obj2;
                c8886.m14538();
                button.setOnClickListener(new ViewOnClickListenerC3183(c7828, 29));
                textView5.getClass();
                c7828.m13191(textView5, button);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8777(C8053 c8053, List list) {
        super(R.layout.dialog_download_dir);
        this.f24730 = c8053;
        this.f24729 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8777(C7828 c7828, ArrayList arrayList) {
        super(R.layout.dialog_manage_troops);
        this.f24730 = c7828;
        this.f24729 = arrayList;
    }
}
