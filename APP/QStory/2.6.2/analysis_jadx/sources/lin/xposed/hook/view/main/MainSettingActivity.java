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
import bsh.C2632;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import com.google.gson.C3251;
import com.google.gson.C3252;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import lin.xposed.hook.javaplugin.view.C5548;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import net.bytebuddy.description.method.MethodDescription;
import p007.C6132;
import p007.C6133;
import p007.C6149;
import p007.ViewOnClickListenerC6139;
import p008.C6150;
import p011.ViewOnClickListenerC6162;
import p035.AbstractC6340;
import p257.C8207;
import p331.C8799;
import p335.AbstractC8804;
import p342.C8821;
import p348.InterfaceC8861;
import p349.C8865;
import p352.RunnableC8872;
import p398.C9152;
import top.sacz.xphelper.activity.BaseActivity;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5839;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0003R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010(¨\u00060"}, d2 = {"Llin/xposed/hook/view/main/MainSettingActivity;", "Ltop/sacz/xphelper/activity/BaseActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lkotlin/飘花落叶言子楪兰苏哲世;", "initView", "setTitleBarAttribute", "", "text", "setTitleCenterText", "(Ljava/lang/String;)V", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onResume", "Landroid/view/View;", "titleLayout", "Landroid/view/View;", "getTitleLayout", "()Landroid/view/View;", "setTitleLayout", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "centerText", "Landroid/widget/TextView;", "getCenterText", "()Landroid/widget/TextView;", "setCenterText", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "leftIcon", "Landroid/widget/ImageView;", "getLeftIcon", "()Landroid/widget/ImageView;", "setLeftIcon", "(Landroid/widget/ImageView;)V", "searchIcon", "Companion", "飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲兰世", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class MainSettingActivity extends BaseActivity {
    public static final int $stable = 8;
    public static final C6149 Companion = new C6149();
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
        AbstractC4394.m8918(AbstractC3056.m6668(-3937689866041820583L));
        throw null;
    }

    private final void initView() {
        String strM6668 = AbstractC3056.m6668(-3937689526739404199L);
        ItemUiInfoManager.init();
        View viewFindViewById = findViewById(R.id.setting_title_bar);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById.getClass();
        setTitleLayout(viewFindViewById);
        C6149 c6149 = Companion;
        View viewFindViewById2 = findViewById(R.id.setting_title_bar_user_avatar);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById2.getClass();
        c6149.getClass();
        AbstractC3056.m6668(-3937689840272016807L);
        setting_bar_right = (ImageView) viewFindViewById2;
        View viewFindViewById3 = getTitleLayout().findViewById(R.id.ic_top_left);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById3.getClass();
        setLeftIcon((ImageView) viewFindViewById3);
        View viewFindViewById4 = getTitleLayout().findViewById(R.id.title_center_text);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById4.getClass();
        setCenterText((TextView) viewFindViewById4);
        ((TextView) findViewById(R.id.tv_version)).setText(AbstractC3056.m6668(-3937664852152288679L) + AbstractC6340.f17462 + AbstractC3056.m6668(-3937689458019927463L));
        View viewFindViewById5 = getTitleLayout().findViewById(R.id.ic_top_search);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById5.getClass();
        this.searchIcon = (ImageView) viewFindViewById5;
        setTitleBarAttribute();
        String string = getString(R.string.app_name);
        AbstractC3056.m6668(-3937689380710516135L);
        string.getClass();
        setTitleCenterText(string);
        AbstractC2313 supportFragmentManager = getSupportFragmentManager();
        AbstractC3056.m6668(-3937689307696072103L);
        supportFragmentManager.getClass();
        C2332 c2332 = new C2332(supportFragmentManager);
        AbstractC3056.m6668(-3937689200321889703L);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4365 = supportFragmentManager.m4365(strM6668);
        if (abstractComponentCallbacksC2338M4365 == null) {
            abstractComponentCallbacksC2338M4365 = new C6150();
        }
        c2332.m4421(R.id.itemList_container, abstractComponentCallbacksC2338M4365, AbstractC3056.m6668(-3937689157372216743L));
        c2332.m4418(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0() {
        C8799 c8799 = new C8799();
        c8799.f24761 = AbstractC3056.m6668(-3937561652678100391L);
        c8799.f24760 = AbstractC3056.m6668(-3937706809687803303L);
        int i = 0;
        c8799.f24759 = 0;
        c8799.f24758 = AbstractC3056.m6668(-3937706809687803303L);
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, AbstractC3056.m6668(-3937706766738130343L));
        if (c87992 != null) {
            c8799 = c87992;
        }
        Integer num = c8799.f24759;
        if (num != null && num.intValue() == 0 && isSponsorDialog) {
            C8865 c8865 = C8865.f24976;
            C3251 c3251 = new C3251();
            c3251.m7347();
            C3252 c3252M7348 = c3251.m7348();
            C0325 c0325 = new C0325(19);
            c0325.m971(AbstractC3056.m6668(-3937274572769068455L));
            C8865.f24976.getClass();
            c0325.f1095 = C8865.m14511(false);
            ((ArrayList) c0325.f1094).add(new C9152(c3252M7348));
            Object objM547 = c0325.m970().m547(InterfaceC8861.class);
            AbstractC3056.m6668(-3937274383790507431L);
            objM547.getClass();
            C8207 c8207 = new C8207();
            c8207.f22615 = AbstractC3056.m6668(-3937326790981453223L);
            c8207.mo13704();
            c8207.mo13703(false);
            c8207.mo13705(AbstractC3056.m6668(-3937326700787140007L));
            c8207.mo13702(AbstractC3056.m6668(-3937326464563938727L), new C5548(4));
            c8207.m13714();
            AbstractC8804.f24777.execute(new RunnableC8872(c8207, i));
            isSponsorDialog = false;
        }
    }

    public static final void setSetting_bar_right(ImageView imageView) {
        Companion.getClass();
        AbstractC3056.m6668(-3937689840272016807L);
        imageView.getClass();
        setting_bar_right = imageView;
    }

    private final void setTitleBarAttribute() {
        Companion.getClass();
        ImageView imageView = setting_bar_right;
        if (imageView == null) {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937689866041820583L));
            throw null;
        }
        int i = 10;
        imageView.setOnClickListener(new ViewOnClickListenerC5532(i));
        ImageView imageView2 = this.searchIcon;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new ViewOnClickListenerC3182(this, i));
        } else {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937689054293001639L));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleBarAttribute$lambda$0(View view) {
        Context context = view.getContext();
        AbstractC3056.m6668(-3937689067177903527L);
        context.getClass();
        AbstractC3056.m6668(-3937616005489231271L);
        ViewOnClickListenerC6162 viewOnClickListenerC6162 = new ViewOnClickListenerC6162(context);
        View viewInflate = LayoutInflater.from(viewOnClickListenerC6162.getContext()).inflate(R.layout.user_info_templates, (ViewGroup) null, false);
        AbstractC3056.m6668(-3937691730057627047L);
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        View viewFindViewById = viewGroup.findViewById(R.id.user_uin);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewGroup.findViewById(R.id.user_name);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById2.getClass();
        viewOnClickListenerC6162.f16789 = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.user_identityName);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById3.getClass();
        viewOnClickListenerC6162.f16787 = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.user_label);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById4.getClass();
        viewOnClickListenerC6162.f16788 = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.user_avatar);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById5.getClass();
        viewOnClickListenerC6162.f16785 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.enter_sponsorship);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById6.getClass();
        viewOnClickListenerC6162.f16783 = (Button) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.refreshUserInformation);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById7.getClass();
        viewOnClickListenerC6162.f16786 = (Button) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.tv_sponsor_end_date);
        AbstractC3056.m6668(-3937691541079066023L);
        viewFindViewById8.getClass();
        viewOnClickListenerC6162.f16784 = (TextView) viewFindViewById8;
        viewOnClickListenerC6162.m11584();
        viewOnClickListenerC6162.setContentView(viewGroup);
        viewOnClickListenerC6162.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleBarAttribute$lambda$1(MainSettingActivity mainSettingActivity, View view) {
        C6132.f16715.getClass();
        AbstractC3056.m6668(-3937561390685095335L);
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
        C6132.m11524(flexboxLayout, linearLayout, textView, editText);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        editText.addTextChangedListener(new C6133(imageView, linearLayout, recyclerView, textView2, textView3, mainSettingActivity, dialog));
        imageView.setOnClickListener(new ViewOnClickListenerC6139(editText, 0));
        textView.setOnClickListener(new ViewOnClickListenerC5839(flexboxLayout, linearLayout, textView, editText, dialog));
        dialog.show();
        editText.requestFocus();
        Window window4 = dialog.getWindow();
        if (window4 != null) {
            window4.setSoftInputMode(5);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        AbstractC3056.m6668(-3937689586868946343L);
        newBase.getClass();
        super.attachBaseContext(newBase);
    }

    public final TextView getCenterText() {
        TextView textView = this.centerText;
        if (textView != null) {
            return textView;
        }
        AbstractC4394.m8918(AbstractC3056.m6668(-3937689754372670887L));
        throw null;
    }

    public final ImageView getLeftIcon() {
        ImageView imageView = this.leftIcon;
        if (imageView != null) {
            return imageView;
        }
        AbstractC4394.m8918(AbstractC3056.m6668(-3937689664178357671L));
        throw null;
    }

    public final View getTitleLayout() {
        View view = this.titleLayout;
        if (view != null) {
            return view;
        }
        AbstractC4394.m8918(AbstractC3056.m6668(-3937689737192801703L));
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC3056.m6668(-3937689621228684711L);
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
    }

    @Override // top.sacz.xphelper.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root_layout);
        requestTranslucentStatusBar();
        C8799 c8799 = new C8799();
        c8799.f24761 = AbstractC3056.m6668(-3937561652678100391L);
        c8799.f24760 = AbstractC3056.m6668(-3937706809687803303L);
        c8799.f24759 = 0;
        c8799.f24758 = AbstractC3056.m6668(-3937706809687803303L);
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, AbstractC3056.m6668(-3937706766738130343L));
        if (c87992 != null) {
            c8799 = c87992;
        }
        if (c8799.f24759.intValue() < 0) {
            System.exit(0);
            C2632.m5294(AbstractC3056.m6668(-3937692378597688743L));
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.setting_title_bar);
        Context context = viewGroup.getContext();
        AbstractC3055.m6621((Activity) context);
        int identifier = context.getResources().getIdentifier(AbstractC3056.m6668(-3937556271084078503L), AbstractC3056.m6668(-3937556348393489831L), AbstractC3056.m6668(-3937556374163293607L));
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        viewGroup.getLayoutParams().height += dimensionPixelSize;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + dimensionPixelSize, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1898(6), 500L);
    }

    public final void setCenterText(TextView textView) {
        AbstractC3056.m6668(-3937689840272016807L);
        textView.getClass();
        this.centerText = textView;
    }

    public final void setLeftIcon(ImageView imageView) {
        AbstractC3056.m6668(-3937689840272016807L);
        imageView.getClass();
        this.leftIcon = imageView;
    }

    public final void setTitleCenterText(String text) {
        AbstractC3056.m6668(-3937689599753848231L);
        text.getClass();
        getCenterText().setText(text);
    }

    public final void setTitleLayout(View view) {
        AbstractC3056.m6668(-3937689840272016807L);
        view.getClass();
        this.titleLayout = view;
    }
}
