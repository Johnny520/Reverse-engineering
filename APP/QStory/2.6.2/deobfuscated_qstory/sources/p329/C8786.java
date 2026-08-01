package p329;

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
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.collections.AbstractC4343;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5543;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p007.ViewOnClickListenerC6139;
import p087.C7067;
import p193.C7827;
import p217.AbstractC7968;
import p230.C8052;
import p257.C8207;
import p257.C8232;
import p257.C8239;
import p343.C8831;
import p356.C8907;
import p356.C8909;
import top.suzhelan.qstory.hook.item.C5871;
import top.suzhelan.qstory.hook.item.mcp.config.C5866;
import top.suzhelan.qstory.hook.item.mcp.config.C5867;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8786 extends AbstractC3748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f24735;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24737 = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8786(C8909 c8909, C2473 c2473) {
        super(R.layout.dialog_mcp_server_config);
        this.f24736 = c8909;
        this.f24735 = c2473;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3748
    public final void onBind(Object obj, View view) {
        int i = this.f24737;
        Object obj2 = this.f24735;
        Object obj3 = this.f24736;
        final int i2 = 0;
        switch (i) {
            case 0:
                C8232 c8232 = (C8232) obj;
                "v";
                view.getClass();
                final C8909 c8909 = (C8909) obj3;
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
                dialogXRecycleView.setAdapter(c8909);
                C2467 c2467 = c2473.f7389;
                DialogXRecycleView dialogXRecycleView2 = c2473.f7406;
                if (dialogXRecycleView2 != dialogXRecycleView) {
                    if (dialogXRecycleView2 != null) {
                        dialogXRecycleView2.m4725(c2473);
                        c2473.f7406.removeOnItemTouchListener(c2467);
                        c2473.f7406.removeOnChildAttachStateChangeListener(c2473);
                        ArrayList arrayList = c2473.f7408;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            C2466 c2466 = (C2466) arrayList.get(0);
                            c2466.f7351.cancel();
                            C8787 c8787 = c2473.f7404;
                            AbstractC2484 abstractC2484 = c2466.f7341;
                            c8787.getClass();
                            AbstractC2464.m4857(abstractC2484);
                        }
                        arrayList.clear();
                        c2473.f7399 = null;
                        VelocityTracker velocityTracker = c2473.f7397;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            c2473.f7397 = null;
                        }
                        C2463 c2463 = c2473.f7390;
                        if (c2463 != null) {
                            c2463.f7335 = false;
                            c2473.f7390 = null;
                        }
                        if (c2473.f7400 != null) {
                            c2473.f7400 = null;
                        }
                    }
                    c2473.f7406 = dialogXRecycleView;
                    Resources resources = dialogXRecycleView.getResources();
                    c2473.f7391 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                    c2473.f7410 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                    c2473.f7405 = ViewConfiguration.get(c2473.f7406.getContext()).getScaledTouchSlop();
                    c2473.f7406.m4721(c2473);
                    c2473.f7406.addOnItemTouchListener(c2467);
                    c2473.f7406.addOnChildAttachStateChangeListener(c2473);
                    c2473.f7390 = new C2463(c2473);
                    c2473.f7400 = new GestureDetector(c2473.f7406.getContext(), c2473.f7390);
                }
                c8909.f25094 = new C0004(textView, 20, c8909);
                c8909.f25096 = new C6051(c2473, 13);
                textView.getClass();
                AbstractC3055.m6625(textView, c8909.m14529());
                textView2.getClass();
                C5866.f16023.getClass();
                String strM6668 = "{\n  \"mcpServers\": {\n    \"QStoryMcp\": {\n      \"url\": \"http://localhost:9000/mcp\",\n      \"transport\": \"streamable-http\"\n    }\n  }\n}";
                textView2.setText(strM6668);
                textView2.setOnClickListener(new ViewOnClickListenerC5561(textView2, 14, strM6668));
                viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪世苏兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) throws NoSuchMethodException {
                        int i3 = i2;
                        C8909 c89092 = c8909;
                        switch (i3) {
                            case 0:
                                ArrayList arrayList2 = c89092.f25095;
                                final boolean z = true;
                                arrayList2.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C5867 c5867 = (C5867) obj4;
                                        "it";
                                        c5867.getClass();
                                        return C5867.m11209(c5867, z, 0, 23);
                                    }
                                });
                                AbstractC7968.m13430(c89092, AbstractC4343.m8804(arrayList2));
                                C0004 c0004 = c89092.f25094;
                                if (c0004 != null) {
                                    c0004.invoke();
                                }
                                break;
                            default:
                                ArrayList arrayList3 = c89092.f25095;
                                final boolean z2 = false;
                                arrayList3.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C5867 c5867 = (C5867) obj4;
                                        "it";
                                        c5867.getClass();
                                        return C5867.m11209(c5867, z2, 0, 23);
                                    }
                                });
                                AbstractC7968.m13430(c89092, AbstractC4343.m8804(arrayList3));
                                C0004 c00042 = c89092.f25094;
                                if (c00042 != null) {
                                    c00042.invoke();
                                }
                                break;
                        }
                    }
                });
                final int i3 = 1;
                viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪世苏兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) throws NoSuchMethodException {
                        int i32 = i3;
                        C8909 c89092 = c8909;
                        switch (i32) {
                            case 0:
                                ArrayList arrayList2 = c89092.f25095;
                                final boolean z = true;
                                arrayList2.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C5867 c5867 = (C5867) obj4;
                                        "it";
                                        c5867.getClass();
                                        return C5867.m11209(c5867, z, 0, 23);
                                    }
                                });
                                AbstractC7968.m13430(c89092, AbstractC4343.m8804(arrayList2));
                                C0004 c0004 = c89092.f25094;
                                if (c0004 != null) {
                                    c0004.invoke();
                                }
                                break;
                            default:
                                ArrayList arrayList3 = c89092.f25095;
                                final boolean z2 = false;
                                arrayList3.replaceAll(new UnaryOperator() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏哲世兰
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        C5867 c5867 = (C5867) obj4;
                                        "it";
                                        c5867.getClass();
                                        return C5867.m11209(c5867, z2, 0, 23);
                                    }
                                });
                                AbstractC7968.m13430(c89092, AbstractC4343.m8804(arrayList3));
                                C0004 c00042 = c89092.f25094;
                                if (c00042 != null) {
                                    c00042.invoke();
                                }
                                break;
                        }
                    }
                });
                viewFindViewById2.setOnClickListener(new ViewOnClickListenerC3182(c8232, 26));
                viewFindViewById.setOnClickListener(new ViewOnClickListenerC5561(c8909, 13, c8232));
                break;
            case 1:
                C8239 c8239 = (C8239) obj;
                c8239.getClass();
                view.getClass();
                EditText editText = (EditText) view.findViewById(R.id.et_new_dir_name);
                TextView textView3 = (TextView) view.findViewById(R.id.btn_create_and_download);
                CustomRecycleView customRecycleView = (CustomRecycleView) view.findViewById(R.id.rv_dir_list);
                TextView textView4 = (TextView) view.findViewById(R.id.tv_empty_hint);
                C8052 c8052 = (C8052) obj3;
                editText.setText((String) c8052.f22227);
                textView3.setOnClickListener(new ViewOnClickListenerC5543(editText, c8239, c8052, 9));
                List list = (List) obj2;
                if (list.isEmpty()) {
                    customRecycleView.setVisibility(8);
                    textView4.setVisibility(0);
                } else {
                    customRecycleView.setVisibility(0);
                    textView4.setVisibility(8);
                    C8831 c8831 = new C8831(new C7067(c8239, 8, c8052), i2);
                    view.getContext();
                    customRecycleView.setLayoutManager(new LinearLayoutManager(1));
                    customRecycleView.setAdapter(c8831);
                    AbstractC7968.m13430(c8831, list);
                }
                break;
            default:
                "dialog";
                ((C8207) obj).getClass();
                "v";
                view.getClass();
                C7827 c7827 = (C7827) obj3;
                EditText editText2 = (EditText) view.findViewById(R.id.et_search);
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_clear);
                TextView textView5 = (TextView) view.findViewById(R.id.tv_selected_count);
                DialogXRecycleView dialogXRecycleView3 = (DialogXRecycleView) view.findViewById(R.id.rv_troop_list);
                Button button = (Button) view.findViewById(R.id.btn_quit);
                editText2.addTextChangedListener(new C5871(2, imageView, c7827));
                imageView.setOnClickListener(new ViewOnClickListenerC6139(editText2, 2));
                view.getContext();
                dialogXRecycleView3.setLayoutManager(new LinearLayoutManager(1));
                C8907 c8907 = (C8907) c7827.f21371;
                dialogXRecycleView3.setAdapter(c8907);
                c8907.f25090 = new C0755(c7827, textView5, button, 12);
                "troops";
                c8907.f25092 = (ArrayList) obj2;
                c8907.m14528();
                button.setOnClickListener(new ViewOnClickListenerC3182(c7827, 28));
                textView5.getClass();
                c7827.m13163(textView5, button);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8786(C8052 c8052, List list) {
        super(R.layout.dialog_download_dir);
        this.f24736 = c8052;
        this.f24735 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8786(C7827 c7827, ArrayList arrayList) {
        super(R.layout.dialog_manage_troops);
        this.f24736 = c7827;
        this.f24735 = arrayList;
    }
}
