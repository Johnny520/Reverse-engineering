package lin.xposed.hook.view.main;

import android.R;
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
import androidx.compose.animation.core.C1171;
import androidx.compose.p001ui.platform.RunnableC2733;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.C3165;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bsh.C3466;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import com.google.gson.C4084;
import com.google.gson.C4085;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import lin.xposed.hook.javaplugin.view.C6380;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import net.bytebuddy.description.method.MethodDescription;
import p022.C6946;
import p024.ViewOnClickListenerC6987;
import p025.AbstractC7012;
import p025.C6995;
import p025.C6999;
import p025.C7009;
import p025.ViewOnClickListenerC7010;
import p050.AbstractC7176;
import p052.AbstractC7187;
import p273.C9037;
import p303.AbstractC9234;
import p351.AbstractC9618;
import p361.C9663;
import p364.InterfaceC9672;
import p371.RunnableC9718;
import p412.C9942;
import top.sacz.xphelper.activity.BaseActivity;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC6662;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0003R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010(¨\u00060"}, m151d2 = {"Llin/xposed/hook/view/main/MainSettingActivity;", "Ltop/sacz/xphelper/activity/BaseActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lkotlin/飘花落叶言子楪兰苏哲世;", "initView", "setTitleBarAttribute", "", "text", "setTitleCenterText", "(Ljava/lang/String;)V", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onResume", "Landroid/view/View;", "titleLayout", "Landroid/view/View;", "getTitleLayout", "()Landroid/view/View;", "setTitleLayout", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "centerText", "Landroid/widget/TextView;", "getCenterText", "()Landroid/widget/TextView;", "setCenterText", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "leftIcon", "Landroid/widget/ImageView;", "getLeftIcon", "()Landroid/widget/ImageView;", "setLeftIcon", "(Landroid/widget/ImageView;)V", "searchIcon", "Companion", "飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏兰世哲", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class MainSettingActivity extends BaseActivity {
    public static final int $stable = 8;
    public static final C7009 Companion = new C7009();
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
        AbstractC5227.m9467(AbstractC9234.m14531(1298));
        throw null;
    }

    private final void initView() {
        String strM14531 = AbstractC9234.m14531(1303);
        ItemUiInfoManager.init();
        View viewFindViewById = findViewById(C0328R.id.setting_title_bar);
        AbstractC9234.m14531(1280);
        viewFindViewById.getClass();
        setTitleLayout(viewFindViewById);
        C7009 c7009 = Companion;
        View viewFindViewById2 = findViewById(C0328R.id.setting_title_bar_user_avatar);
        AbstractC9234.m14531(1280);
        viewFindViewById2.getClass();
        c7009.getClass();
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        setting_bar_right = (ImageView) viewFindViewById2;
        View viewFindViewById3 = getTitleLayout().findViewById(C0328R.id.ic_top_left);
        AbstractC9234.m14531(1280);
        viewFindViewById3.getClass();
        setLeftIcon((ImageView) viewFindViewById3);
        View viewFindViewById4 = getTitleLayout().findViewById(C0328R.id.title_center_text);
        AbstractC9234.m14531(1280);
        viewFindViewById4.getClass();
        setCenterText((TextView) viewFindViewById4);
        ((TextView) findViewById(C0328R.id.tv_version)).setText(AbstractC9234.m14532("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜喵喵~喵呜喵喵喵喵喵喵") + AbstractC7187.f17854 + AbstractC9234.m14531(1304));
        this.searchIcon = (ImageView) AbstractC7012.m12129(getTitleLayout(), C0328R.id.ic_top_search, 1280);
        setTitleBarAttribute();
        String string = getString(C0328R.string.app_name);
        AbstractC9234.m14531(1305);
        string.getClass();
        setTitleCenterText(string);
        AbstractC3146 supportFragmentManager = getSupportFragmentManager();
        AbstractC9234.m14531(1306);
        supportFragmentManager.getClass();
        C3165 c3165 = new C3165(supportFragmentManager);
        AbstractC9234.m14531(1307);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M4935 = supportFragmentManager.m4935(strM14531);
        if (abstractComponentCallbacksC3171M4935 == null) {
            abstractComponentCallbacksC3171M4935 = new C6946();
        }
        c3165.m4991(C0328R.id.itemList_container, abstractComponentCallbacksC3171M4935, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵"));
        c3165.m4988(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0() {
        Integer num = AbstractC3888.m7268().f25085;
        if (num != null && num.intValue() == 0 && isSponsorDialog) {
            C9663 c9663 = C9663.f25281;
            C4084 c4084 = new C4084();
            c4084.m7893();
            C4085 c4085M7894 = c4084.m7894();
            C1171 c1171 = new C1171(19);
            c1171.m1531(AbstractC9234.m14531(2860));
            C9663.f25281.getClass();
            c1171.f1440 = C9663.m15050(false);
            ((ArrayList) c1171.f1439).add(new C9942(c4085M7894));
            Object objM1108 = c1171.m1530().m1108(InterfaceC9672.class);
            AbstractC9234.m14531(2861);
            objM1108.getClass();
            C9037 c9037 = new C9037();
            c9037.f22959 = AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜呜喵呜喵~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵喵呜~呜呜喵呜喵呜呜喵");
            c9037.mo14280();
            c9037.mo14279(false);
            c9037.mo14281(AbstractC9234.m14531(3140));
            c9037.mo14278(AbstractC9234.m14531(3141), new C6380(4));
            c9037.m14290();
            AbstractC9618.f25101.execute(new RunnableC9718(c9037, 0));
            isSponsorDialog = false;
        }
    }

    public static final void setSetting_bar_right(ImageView imageView) {
        Companion.getClass();
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        imageView.getClass();
        setting_bar_right = imageView;
    }

    private final void setTitleBarAttribute() {
        Companion.getClass();
        ImageView imageView = setting_bar_right;
        if (imageView == null) {
            AbstractC5227.m9467(AbstractC9234.m14531(1298));
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC6365(10));
        ImageView imageView2 = this.searchIcon;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new ViewOnClickListenerC4015(this, 12));
        } else {
            AbstractC5227.m9467(AbstractC9234.m14531(1308));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleBarAttribute$lambda$0(View view) {
        Context context = view.getContext();
        AbstractC9234.m14531(1309);
        context.getClass();
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        ViewOnClickListenerC6987 viewOnClickListenerC6987 = new ViewOnClickListenerC6987(context);
        View viewInflate = LayoutInflater.from(viewOnClickListenerC6987.getContext()).inflate(C0328R.layout.user_info_templates, (ViewGroup) null, false);
        AbstractC9234.m14531(1279);
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        View viewFindViewById = viewGroup.findViewById(C0328R.id.user_uin);
        AbstractC9234.m14531(1280);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewGroup.findViewById(C0328R.id.user_name);
        AbstractC9234.m14531(1280);
        viewFindViewById2.getClass();
        viewOnClickListenerC6987.f17289 = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(C0328R.id.user_identityName);
        AbstractC9234.m14531(1280);
        viewFindViewById3.getClass();
        viewOnClickListenerC6987.f17287 = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(C0328R.id.user_label);
        AbstractC9234.m14531(1280);
        viewFindViewById4.getClass();
        viewOnClickListenerC6987.f17288 = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(C0328R.id.user_avatar);
        AbstractC9234.m14531(1280);
        viewFindViewById5.getClass();
        viewOnClickListenerC6987.f17285 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(C0328R.id.enter_sponsorship);
        AbstractC9234.m14531(1280);
        viewFindViewById6.getClass();
        viewOnClickListenerC6987.f17283 = (Button) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(C0328R.id.refreshUserInformation);
        AbstractC9234.m14531(1280);
        viewFindViewById7.getClass();
        viewOnClickListenerC6987.f17286 = (Button) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(C0328R.id.tv_sponsor_end_date);
        AbstractC9234.m14531(1280);
        viewFindViewById8.getClass();
        viewOnClickListenerC6987.f17284 = (TextView) viewFindViewById8;
        viewOnClickListenerC6987.m12117();
        viewOnClickListenerC6987.setContentView(viewGroup);
        viewOnClickListenerC6987.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleBarAttribute$lambda$1(MainSettingActivity mainSettingActivity, View view) {
        C6999.f17312.getClass();
        AbstractC9234.m14531(13);
        mainSettingActivity.getClass();
        Dialog dialog = new Dialog(mainSettingActivity, 605225662);
        View viewInflate = LayoutInflater.from(mainSettingActivity).inflate(C0328R.layout.dialog_search, (ViewGroup) null);
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
            window3.setBackgroundDrawableResource(R.color.transparent);
        }
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        EditText editText = (EditText) viewInflate.findViewById(C0328R.id.et_search);
        ImageView imageView = (ImageView) viewInflate.findViewById(C0328R.id.iv_clear);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(C0328R.id.layout_history);
        FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate.findViewById(C0328R.id.flow_history);
        TextView textView = (TextView) viewInflate.findViewById(C0328R.id.tv_clear_history);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C0328R.id.rv_results);
        TextView textView2 = (TextView) viewInflate.findViewById(C0328R.id.tv_results_title);
        TextView textView3 = (TextView) viewInflate.findViewById(C0328R.id.tv_no_results);
        flexboxLayout.getClass();
        linearLayout.getClass();
        textView.getClass();
        editText.getClass();
        C6999.m12121(flexboxLayout, linearLayout, textView, editText);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        editText.addTextChangedListener(new C6995(imageView, linearLayout, recyclerView, textView2, textView3, mainSettingActivity, dialog));
        imageView.setOnClickListener(new ViewOnClickListenerC7010(editText, 0));
        textView.setOnClickListener(new ViewOnClickListenerC6662(flexboxLayout, linearLayout, textView, editText, dialog));
        dialog.show();
        editText.requestFocus();
        Window window4 = dialog.getWindow();
        if (window4 != null) {
            window4.setSoftInputMode(5);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜喵呜~喵喵呜喵呜喵呜喵~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵喵");
        newBase.getClass();
        super.attachBaseContext(newBase);
    }

    public final TextView getCenterText() {
        TextView textView = this.centerText;
        if (textView != null) {
            return textView;
        }
        AbstractC5227.m9467(AbstractC9234.m14531(1300));
        throw null;
    }

    public final ImageView getLeftIcon() {
        ImageView imageView = this.leftIcon;
        if (imageView != null) {
            return imageView;
        }
        AbstractC5227.m9467(AbstractC9234.m14531(1301));
        throw null;
    }

    public final View getTitleLayout() {
        View view = this.titleLayout;
        if (view != null) {
            return view;
        }
        AbstractC5227.m9467(AbstractC9234.m14531(1299));
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC9234.m14531(1302);
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
    }

    @Override // top.sacz.xphelper.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0328R.layout.root_layout);
        requestTranslucentStatusBar();
        if (AbstractC3888.m7268().f25085.intValue() < 0) {
            System.exit(0);
            C3466.m5899(AbstractC9234.m14531(1275));
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(C0328R.id.setting_title_bar);
        Context context = viewGroup.getContext();
        AbstractC7176.m12484((Activity) context);
        int identifier = context.getResources().getIdentifier(AbstractC9234.m14531(48), AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"));
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        viewGroup.getLayoutParams().height += dimensionPixelSize;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + dimensionPixelSize, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2733(7), 500L);
    }

    public final void setCenterText(TextView textView) {
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        textView.getClass();
        this.centerText = textView;
    }

    public final void setLeftIcon(ImageView imageView) {
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        imageView.getClass();
        this.leftIcon = imageView;
    }

    public final void setTitleCenterText(String text) {
        AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜呜呜喵喵");
        text.getClass();
        getCenterText().setText(text);
    }

    public final void setTitleLayout(View view) {
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        view.getClass();
        this.titleLayout = view;
    }
}
