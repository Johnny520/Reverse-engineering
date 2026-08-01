package lin.xposed.hook.view.main;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.animation.core.C0325;
import androidx.compose.ui.platform.RunnableC1898;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.fragment.app.C2332;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bsh.C2633;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import com.google.gson.C3252;
import com.google.gson.C3253;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import lin.xposed.hook.javaplugin.view.C5549;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import net.bytebuddy.description.method.MethodDescription;
import p006.C6117;
import p008.ViewOnClickListenerC6158;
import p009.AbstractC6183;
import p009.C6166;
import p009.C6170;
import p009.C6180;
import p009.ViewOnClickListenerC6181;
import p034.AbstractC6347;
import p036.AbstractC6358;
import p257.C8208;
import p287.AbstractC8405;
import p335.AbstractC8789;
import p345.C8834;
import p348.InterfaceC8843;
import p355.RunnableC8889;
import p396.C9113;
import top.sacz.xphelper.activity.BaseActivity;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5832;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0003R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010(¨\u00060"}, d2 = {"Llin/xposed/hook/view/main/MainSettingActivity;", "Ltop/sacz/xphelper/activity/BaseActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lkotlin/飘花落叶言子楪兰苏哲世;", "initView", "setTitleBarAttribute", "", "text", "setTitleCenterText", "(Ljava/lang/String;)V", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onResume", "Landroid/view/View;", "titleLayout", "Landroid/view/View;", "getTitleLayout", "()Landroid/view/View;", "setTitleLayout", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "centerText", "Landroid/widget/TextView;", "getCenterText", "()Landroid/widget/TextView;", "setCenterText", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "leftIcon", "Landroid/widget/ImageView;", "getLeftIcon", "()Landroid/widget/ImageView;", "setLeftIcon", "(Landroid/widget/ImageView;)V", "searchIcon", "Companion", "飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏兰世哲", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class MainSettingActivity extends BaseActivity {
    public static final int $stable = 8;
    public static final C6180 Companion = new C6180();
    private static boolean isSponsorDialog = true;
    public static ImageView setting_bar_right;
    public TextView centerText;
    public ImageView leftIcon;
    private ImageView searchIcon;
    public View titleLayout;

    public static final ImageView getSetting_bar_right() {
        Companion.getClass();
        ImageView imageView = setting_bar_right;
        if (imageView != null) {
            return imageView;
        }
        AbstractC4395.m8908(AbstractC8405.m13972(1298));
        throw null;
    }

    private final void initView() {
        String strM13972 = AbstractC8405.m13972(1303);
        ItemUiInfoManager.init();
        View viewFindViewById = findViewById(R.id.setting_title_bar);
        AbstractC8405.m13972(1280);
        viewFindViewById.getClass();
        setTitleLayout(viewFindViewById);
        C6180 c6180 = Companion;
        View viewFindViewById2 = findViewById(R.id.setting_title_bar_user_avatar);
        AbstractC8405.m13972(1280);
        viewFindViewById2.getClass();
        c6180.getClass();
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        setting_bar_right = (ImageView) viewFindViewById2;
        View viewFindViewById3 = getTitleLayout().findViewById(R.id.ic_top_left);
        AbstractC8405.m13972(1280);
        viewFindViewById3.getClass();
        setLeftIcon((ImageView) viewFindViewById3);
        View viewFindViewById4 = getTitleLayout().findViewById(R.id.title_center_text);
        AbstractC8405.m13972(1280);
        viewFindViewById4.getClass();
        setCenterText((TextView) viewFindViewById4);
        ((TextView) findViewById(R.id.tv_version)).setText(AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜喵喵~喵呜喵喵喵喵喵喵") + AbstractC6358.f17509 + AbstractC8405.m13972(1304));
        this.searchIcon = (ImageView) AbstractC6183.m11570(getTitleLayout(), R.id.ic_top_search, 1280);
        setTitleBarAttribute();
        String string = getString(R.string.app_name);
        AbstractC8405.m13972(1305);
        string.getClass();
        setTitleCenterText(string);
        AbstractC2313 supportFragmentManager = getSupportFragmentManager();
        AbstractC8405.m13972(1306);
        supportFragmentManager.getClass();
        C2332 c2332 = new C2332(supportFragmentManager);
        AbstractC8405.m13972(1307);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4375 = supportFragmentManager.m4375(strM13972);
        if (abstractComponentCallbacksC2338M4375 == null) {
            abstractComponentCallbacksC2338M4375 = new C6117();
        }
        c2332.m4431(R.id.itemList_container, abstractComponentCallbacksC2338M4375, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵"));
        c2332.m4428(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0() {
        Integer num = AbstractC3056.m6708().f24740;
        if (num != null && num.intValue() == 0 && isSponsorDialog) {
            C8834 c8834 = C8834.f24936;
            C3252 c3252 = new C3252();
            c3252.m7334();
            C3253 c3253M7335 = c3252.m7335();
            C0325 c0325 = new C0325(19);
            c0325.m971(AbstractC8405.m13972(2860));
            C8834.f24936.getClass();
            c0325.f1095 = C8834.m14491(false);
            ((ArrayList) c0325.f1094).add(new C9113(c3253M7335));
            Object objM548 = c0325.m970().m548(InterfaceC8843.class);
            AbstractC8405.m13972(2861);
            objM548.getClass();
            C8208 c8208 = new C8208();
            c8208.f22614 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜呜喵呜喵~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵喵呜~呜呜喵呜喵呜呜喵");
            c8208.mo13721();
            c8208.mo13720(false);
            c8208.mo13722(AbstractC8405.m13972(3140));
            c8208.mo13719(AbstractC8405.m13972(3141), new C5549(4));
            c8208.m13731();
            AbstractC8789.f24756.execute(new RunnableC8889(c8208, 0));
            isSponsorDialog = false;
        }
    }

    public static final void setSetting_bar_right(ImageView imageView) {
        Companion.getClass();
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        imageView.getClass();
        setting_bar_right = imageView;
    }

    private final void setTitleBarAttribute() {
        Companion.getClass();
        ImageView imageView = setting_bar_right;
        if (imageView == null) {
            AbstractC4395.m8908(AbstractC8405.m13972(1298));
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC5533(10));
        ImageView imageView2 = this.searchIcon;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new ViewOnClickListenerC3183(this, 12));
        } else {
            AbstractC4395.m8908(AbstractC8405.m13972(1308));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleBarAttribute$lambda$0(View view) {
        Context context = view.getContext();
        AbstractC8405.m13972(1309);
        context.getClass();
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        ViewOnClickListenerC6158 viewOnClickListenerC6158 = new ViewOnClickListenerC6158(context);
        View viewInflate = LayoutInflater.from(viewOnClickListenerC6158.getContext()).inflate(R.layout.user_info_templates, (ViewGroup) null, false);
        AbstractC8405.m13972(1279);
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        View viewFindViewById = viewGroup.findViewById(R.id.user_uin);
        AbstractC8405.m13972(1280);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewGroup.findViewById(R.id.user_name);
        AbstractC8405.m13972(1280);
        viewFindViewById2.getClass();
        viewOnClickListenerC6158.f16944 = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.user_identityName);
        AbstractC8405.m13972(1280);
        viewFindViewById3.getClass();
        viewOnClickListenerC6158.f16942 = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.user_label);
        AbstractC8405.m13972(1280);
        viewFindViewById4.getClass();
        viewOnClickListenerC6158.f16943 = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.user_avatar);
        AbstractC8405.m13972(1280);
        viewFindViewById5.getClass();
        viewOnClickListenerC6158.f16940 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.enter_sponsorship);
        AbstractC8405.m13972(1280);
        viewFindViewById6.getClass();
        viewOnClickListenerC6158.f16938 = (Button) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.refreshUserInformation);
        AbstractC8405.m13972(1280);
        viewFindViewById7.getClass();
        viewOnClickListenerC6158.f16941 = (Button) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.tv_sponsor_end_date);
        AbstractC8405.m13972(1280);
        viewFindViewById8.getClass();
        viewOnClickListenerC6158.f16939 = (TextView) viewFindViewById8;
        viewOnClickListenerC6158.m11558();
        viewOnClickListenerC6158.setContentView(viewGroup);
        viewOnClickListenerC6158.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleBarAttribute$lambda$1(MainSettingActivity mainSettingActivity, View view) {
        C6170.f16967.getClass();
        AbstractC8405.m13972(13);
        mainSettingActivity.getClass();
        Dialog dialog = new Dialog(mainSettingActivity, 605225662);
        View viewInflate = LayoutInflater.from(mainSettingActivity).inflate(R.layout.dialog_search, (ViewGroup) null);
        dialog.setContentView(viewInflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) mainSettingActivity.getResources().getDisplayMetrics().widthPixels) * 0.9d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setGravity(17);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawableResource(android.R.color.transparent);
        }
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_search);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_clear);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.layout_history);
        FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate.findViewById(R.id.flow_history);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_clear_history);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_results);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_results_title);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_no_results);
        flexboxLayout.getClass();
        linearLayout.getClass();
        textView.getClass();
        editText.getClass();
        C6170.m11562(flexboxLayout, linearLayout, textView, editText);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        editText.addTextChangedListener(new C6166(imageView, linearLayout, recyclerView, textView2, textView3, mainSettingActivity, dialog));
        imageView.setOnClickListener(new ViewOnClickListenerC6181(editText, 0));
        textView.setOnClickListener(new ViewOnClickListenerC5832(flexboxLayout, linearLayout, textView, editText, dialog));
        dialog.show();
        editText.requestFocus();
        Window window4 = dialog.getWindow();
        if (window4 != null) {
            window4.setSoftInputMode(5);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜喵呜~喵喵呜喵呜喵呜喵~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵喵");
        newBase.getClass();
        super.attachBaseContext(newBase);
    }

    public final TextView getCenterText() {
        TextView textView = this.centerText;
        if (textView != null) {
            return textView;
        }
        AbstractC4395.m8908(AbstractC8405.m13972(1300));
        throw null;
    }

    public final ImageView getLeftIcon() {
        ImageView imageView = this.leftIcon;
        if (imageView != null) {
            return imageView;
        }
        AbstractC4395.m8908(AbstractC8405.m13972(1301));
        throw null;
    }

    public final View getTitleLayout() {
        View view = this.titleLayout;
        if (view != null) {
            return view;
        }
        AbstractC4395.m8908(AbstractC8405.m13972(1299));
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC8405.m13972(1302);
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
    }

    @Override // top.sacz.xphelper.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root_layout);
        requestTranslucentStatusBar();
        if (AbstractC3056.m6708().f24740.intValue() < 0) {
            System.exit(0);
            C2633.m5339(AbstractC8405.m13972(1275));
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.setting_title_bar);
        Context context = viewGroup.getContext();
        AbstractC6347.m11925((Activity) context);
        int identifier = context.getResources().getIdentifier(AbstractC8405.m13972(48), AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"));
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        viewGroup.getLayoutParams().height += dimensionPixelSize;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + dimensionPixelSize, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1898(7), 500L);
    }

    public final void setCenterText(TextView textView) {
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        textView.getClass();
        this.centerText = textView;
    }

    public final void setLeftIcon(ImageView imageView) {
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        imageView.getClass();
        this.leftIcon = imageView;
    }

    public final void setTitleCenterText(String text) {
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜呜呜喵喵");
        text.getClass();
        getCenterText().setText(text);
    }

    public final void setTitleLayout(View view) {
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        view.getClass();
        this.titleLayout = view;
    }
}
