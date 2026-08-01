package lin.xposed.hook.javaplugin.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.fragment.app.C2358;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.engine.C3013;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.AbstractC5062;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.AutoLoadPlugin;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.dialog.PluginDialog;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import lin.xposed.hook.javaplugin.online.upload.UploadPlugin;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p221.C7976;
import p257.C8205;
import p257.C8208;
import p287.AbstractC8405;
import p323.C8719;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginItemView extends LinearLayout implements View.OnClickListener, Runnable, View.OnLongClickListener {
    private boolean animating;
    protected final CheckBox autoLoadCheckbox;
    private final ImageView iconView;
    protected final RelativeLayout infoView;
    private boolean isCooldown;
    private boolean isShowing;
    private PluginDialog.PluginLoadCallback loadCallback;
    private PluginDialog pluginDialog;
    protected PluginInfo pluginInfo;
    protected final Switch pluginSwitch;
    private final LinearLayout previewLayout;
    protected final ProgressBar progressBar;

    public PluginItemView(Context context) {
        super(context);
        this.isShowing = false;
        this.animating = false;
        this.isCooldown = false;
        LayoutInflater.from(context).inflate(R.layout.plugin_item_view, this);
        this.infoView = (RelativeLayout) findViewById(R.id.plugin_info_layout);
        this.pluginSwitch = (Switch) findViewById(R.id.plugin_switch);
        this.autoLoadCheckbox = (CheckBox) findViewById(R.id.plugin_auto_load);
        this.progressBar = (ProgressBar) findViewById(R.id.plugin_progress_bar);
        this.previewLayout = (LinearLayout) findViewById(R.id.previewsContainer);
        this.iconView = (ImageView) findViewById(R.id.pluginIcon);
    }

    private void copyTextToClipboard(String str) {
        try {
            ((ClipboardManager) getContext().getSystemService(AbstractC8405.m13972(46))).setPrimaryClip(ClipData.newPlainText(AbstractC8405.m13972(755), str));
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(756);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
            AbstractC6185.m11592(AbstractC8405.m13972(103));
        }
    }

    private String getUploadInfo() {
        return AbstractC8405.m13972(750) + this.pluginInfo.getPluginName() + AbstractC8405.m13972(751) + this.pluginInfo.getPluginVersion() + AbstractC8405.m13972(752) + this.pluginInfo.getPluginAuthor() + AbstractC8405.m13972(753);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$bindPluginInfoData$1(View view) {
        AbstractC6185.m11592(AbstractC8405.m13972(763));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$bindPluginInfoData$2(PluginInfo pluginInfo, CompoundButton compoundButton, boolean z) {
        if (z) {
            AutoLoadPlugin.addAutoLoadPlugin(pluginInfo);
        } else {
            AutoLoadPlugin.removeAutoloadPlugin(pluginInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindPluginInfoData$3() {
        this.pluginSwitch.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindPluginInfoData$4() {
        this.isCooldown = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$bindPluginInfoData$5(CompoundButton compoundButton, boolean z) {
        int i = 0;
        int i2 = 1;
        try {
            if (!z) {
                notificationLoad(true);
                stopRunPlugin();
                notificationLoad(false);
            } else if (this.isCooldown) {
                AbstractC6185.m11592(AbstractC8405.m13972(761));
                new Handler(Looper.getMainLooper()).post(new RunnableC5539(this, i));
            } else {
                this.isCooldown = true;
                new Thread(this).start();
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC5539(this, i2), 3000L);
            }
        } catch (Exception e) {
            AbstractC6185.m11592(Log.getStackTraceString(e));
            String strM13972 = AbstractC8405.m13972(762);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$bindPluginInfoData$6(PluginInfo pluginInfo, View view) {
        showCopyDialog(pluginInfo.getPluginDesc());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$bindPluginInfoData$7(PluginInfo pluginInfo, File file, View view) {
        Context context = getContext();
        context.getClass();
        String strM13972 = AbstractC8405.m13972(759);
        String str = AbstractC8405.m13972(760) + pluginInfo.getPluginName();
        file.getClass();
        ImageView imageView = new ImageView(context);
        int i = (int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
        imageView.setPadding(i, 0, i, 0);
        ((C3062) ComponentCallbacks2C3058.m6764(imageView).m6799(file).m6614()).m6789(imageView);
        C8208 c8208M13729 = C8208.m13729(str, strM13972);
        c8208M13729.f22616 = new C8719(imageView, 3);
        c8208M13729.mo13721();
        c8208M13729.mo13719("确定", new C5549(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notificationError$0() {
        this.pluginSwitch.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notificationLoad$10(boolean z) {
        Switch r0 = this.pluginSwitch;
        if (z) {
            r0.setVisibility(4);
            this.progressBar.setVisibility(0);
        } else {
            r0.setVisibility(0);
            this.progressBar.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClick$8(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.infoView.getLayoutParams();
        layoutParams.height = iIntValue;
        this.infoView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClick$9(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.infoView.getLayoutParams();
        layoutParams.height = iIntValue;
        this.infoView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onLongClick$11(C8205 c8205, CharSequence charSequence, int i) {
        if (i == 0) {
            showUploadDialog();
            return false;
        }
        if (i != 1) {
            return false;
        }
        showDeleteDialog();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showCopyDialog$16(String str, C8208 c8208, View view) {
        copyTextToClipboard(str);
        AbstractC6185.m11592(AbstractC8405.m13972(757));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDeleteDialog$13() {
        PluginDialog pluginDialog = this.pluginDialog;
        if (pluginDialog != null) {
            pluginDialog.switchToLocalScript();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showDeleteDialog$14(C8208 c8208, View view) {
        PluginManager.stopPlugin(this.pluginInfo);
        AbstractC5062.m10052(new File(this.pluginInfo.getPluginLocalPath()));
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC5539(this, 2), 300L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showDeleteDialog$15(C8208 c8208, View view) {
        AbstractC6185.m11592(AbstractC8405.m13972(758));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showUploadDialog$12(C8208 c8208, View view) {
        new UploadPlugin().upload(this.pluginInfo);
        return false;
    }

    private void showCopyDialog(String str) {
        C8208 c8208 = new C8208();
        c8208.f22614 = AbstractC8405.m13972(754);
        c8208.mo13721();
        c8208.f22626 = str;
        c8208.mo13721();
        c8208.mo13719(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜喵呜喵喵喵呜~呜呜呜呜喵呜呜呜~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜喵呜~呜呜喵呜呜喵呜喵"), new C5547(this, 0, str));
        c8208.f22629 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜");
        c8208.mo13721();
        c8208.m13731();
    }

    private void showDeleteDialog() {
        C8208 c8208 = new C8208();
        c8208.f22614 = AbstractC8405.m13972(747);
        c8208.mo13721();
        c8208.f22626 = AbstractC8405.m13972(748) + this.pluginInfo.getPluginName() + AbstractC8405.m13972(749);
        c8208.mo13721();
        int i = 0;
        c8208.mo13719(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new C5548(this, i));
        String strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵");
        C5549 c5549 = new C5549(i);
        c8208.f22629 = strM13973;
        c8208.f22622 = c5549;
        c8208.mo13721();
        c8208.m13731();
    }

    private void showUploadDialog() {
        C8208 c8208 = new C8208();
        c8208.f22614 = AbstractC8405.m13972(746);
        c8208.mo13721();
        c8208.f22626 = getUploadInfo();
        c8208.mo13721();
        c8208.mo13719(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new C5548(this, 1));
        c8208.f22629 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵");
        c8208.mo13721();
        c8208.m13731();
    }

    private void startRunPlugin() {
        PluginManager.loadPlugin(this, this.pluginInfo);
    }

    private void stopRunPlugin() {
        PluginManager.stopPlugin(this.pluginInfo);
    }

    public void bindPluginInfoData(PluginInfo pluginInfo) {
        this.pluginInfo = pluginInfo;
        setPluginNameText(pluginInfo.getPluginName());
        setPluginVersionText(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜呜呜呜呜喵喵~呜呜呜呜喵喵呜喵~呜喵喵喵呜呜呜喵~呜呜呜呜呜喵喵呜~呜呜喵喵喵喵喵喵~喵呜喵呜呜喵呜呜") + pluginInfo.getPluginVersion());
        setAuthorText(AbstractC8405.m13973("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵喵喵~呜呜呜喵喵呜呜喵~呜喵喵喵喵喵喵喵~呜呜呜喵喵呜喵呜~呜呜呜喵呜喵喵呜~喵呜喵呜呜喵呜呜") + pluginInfo.getPluginAuthor() + AbstractC8405.m13972(744) + pluginInfo.getDate());
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜喵喵喵呜呜呜呜~呜呜喵喵呜喵喵喵~呜呜喵呜喵喵呜喵~喵呜喵呜呜喵呜呜"));
        sb.append(pluginInfo.getTags());
        setTagsText(sb.toString());
        setDescText(pluginInfo.getPluginDesc());
        setPluginIdText(AbstractC8405.m13973("喵喵呜呜呜喵呜喵~喵喵呜呜喵喵喵呜~喵呜喵喵喵喵喵喵") + pluginInfo.getPluginID());
        this.progressBar.setOnClickListener(new ViewOnClickListenerC5533(2));
        this.autoLoadCheckbox.setChecked(AutoLoadPlugin.isAutoLoading(pluginInfo));
        int i = 0;
        this.autoLoadCheckbox.setOnCheckedChangeListener(new C5538(pluginInfo, i));
        this.pluginSwitch.setChecked(PluginManager.isRunning(pluginInfo.getPluginID()));
        this.pluginSwitch.setOnCheckedChangeListener(new C5538(this, 1));
        this.infoView.setVisibility(8);
        setOnLongClickListener(this);
        setOnClickListener(this);
        TextView textView = (TextView) this.infoView.findViewById(R.id.plugin_desc);
        textView.setOnClickListener(this);
        textView.setOnLongClickListener(new ViewOnLongClickListenerC5545(this, i, pluginInfo));
        String iconPath = pluginInfo.getIconPath();
        C3013 c3013 = C3013.f9582;
        if (iconPath != null) {
            ((C3062) ((C3062) ((C3062) ComponentCallbacks2C3058.m6764(this).m6799(new File(pluginInfo.getIconPath())).m6620(new C7976(Long.valueOf(System.currentTimeMillis())))).m6616(c3013)).m6620(new C7976(pluginInfo.getIconPath()))).m6789(this.iconView);
        }
        if (pluginInfo.getPreviewPaths() == null || pluginInfo.getPreviewPaths().isEmpty()) {
            this.previewLayout.setVisibility(8);
            return;
        }
        Iterator<String> it = pluginInfo.getPreviewPaths().iterator();
        while (it.hasNext()) {
            File file = new File(it.next());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) getContext().getResources().getDimension(R.dimen.preview_image_width), -1);
            layoutParams.setMarginEnd((int) getContext().getResources().getDimension(R.dimen.preview_image_spacing));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.ic_plugin_icon);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ((C3062) ((C3062) ((C3062) ((C3062) ((C3062) ComponentCallbacks2C3058.m6764(imageView).m6799(file).m6625(R.drawable.ic_downloading)).m6615(R.drawable.ic_error)).m6620(new C7976(Long.valueOf(System.currentTimeMillis())))).m6616(c3013)).m6624()).m6789(imageView);
            imageView.setOnClickListener(new ViewOnClickListenerC5544(this, pluginInfo, file, i));
            this.previewLayout.addView(imageView, layoutParams);
        }
        this.previewLayout.setVisibility(0);
    }

    public void notificationError() {
        PluginDialog.PluginLoadCallback pluginLoadCallback = this.loadCallback;
        if (pluginLoadCallback != null) {
            pluginLoadCallback.notificationError();
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC5539(this, 3));
    }

    public void notificationLoad(final boolean z) {
        PluginDialog.PluginLoadCallback pluginLoadCallback = this.loadCallback;
        if (pluginLoadCallback != null) {
            pluginLoadCallback.notificationLoad(z);
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世哲兰苏
            @Override // java.lang.Runnable
            public final void run() {
                this.f15292.lambda$notificationLoad$10(z);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.animating) {
            return;
        }
        final int i = 1;
        this.animating = true;
        boolean z = this.isShowing;
        RelativeLayout relativeLayout = this.infoView;
        final int i2 = 0;
        if (z) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(relativeLayout.getHeight(), 0);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏兰世哲

                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                public final /* synthetic */ PluginItemView f15305;

                {
                    this.f15305 = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    PluginItemView pluginItemView = this.f15305;
                    switch (i3) {
                        case 0:
                            pluginItemView.lambda$onClick$8(valueAnimator);
                            break;
                        default:
                            pluginItemView.lambda$onClick$9(valueAnimator);
                            break;
                    }
                }
            });
            valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: lin.xposed.hook.javaplugin.view.PluginItemView.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    PluginItemView.this.infoView.setVisibility(8);
                    PluginItemView.this.animating = false;
                }
            });
            valueAnimatorOfInt.start();
            this.isShowing = false;
            return;
        }
        relativeLayout.setVisibility(0);
        this.infoView.measure(-1, -2);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, this.infoView.getMeasuredHeight());
        valueAnimatorOfInt2.setDuration(300L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏兰世哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ PluginItemView f15305;

            {
                this.f15305 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i;
                PluginItemView pluginItemView = this.f15305;
                switch (i3) {
                    case 0:
                        pluginItemView.lambda$onClick$8(valueAnimator);
                        break;
                    default:
                        pluginItemView.lambda$onClick$9(valueAnimator);
                        break;
                }
            }
        });
        valueAnimatorOfInt2.addListener(new AnimatorListenerAdapter() { // from class: lin.xposed.hook.javaplugin.view.PluginItemView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewGroup.LayoutParams layoutParams = PluginItemView.this.infoView.getLayoutParams();
                layoutParams.height = -2;
                PluginItemView.this.infoView.setLayoutParams(layoutParams);
                PluginItemView.this.animating = false;
            }
        });
        valueAnimatorOfInt2.start();
        this.isShowing = true;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        C8205 c8205M13718 = C8205.m13718();
        c8205M13718.f22614 = AbstractC8405.m13972(745) + this.pluginInfo.getPluginName();
        c8205M13718.m13727();
        c8205M13718.m13728(new String[]{AbstractC8405.m13973("呜喵喵呜喵呜呜呜~呜呜喵喵呜呜喵呜~呜呜呜呜喵喵喵喵~呜喵喵喵呜呜喵喵~呜呜喵呜呜喵喵呜~呜呜喵喵呜呜喵喵"), AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"), AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵")});
        c8205M13718.f22608 = new C2358(this, 6);
        c8205M13718.m13731();
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        notificationLoad(true);
        startRunPlugin();
        notificationLoad(false);
    }

    public void setAuthorText(CharSequence charSequence) {
        ((TextView) this.infoView.findViewById(R.id.plugin_author)).setText(charSequence);
    }

    public void setDescText(CharSequence charSequence) {
        ((TextView) this.infoView.findViewById(R.id.plugin_desc)).setText(charSequence);
    }

    public void setPluginDialog(PluginDialog pluginDialog) {
        this.pluginDialog = pluginDialog;
    }

    public void setPluginIdText(CharSequence charSequence) {
        ((TextView) this.infoView.findViewById(R.id.plugin_id)).setText(charSequence);
    }

    public void setPluginLoadCallback(PluginDialog.PluginLoadCallback pluginLoadCallback) {
        this.loadCallback = pluginLoadCallback;
    }

    public void setPluginNameText(CharSequence charSequence) {
        ((TextView) findViewById(R.id.plugin_name)).setText(charSequence);
    }

    public void setPluginVersionText(CharSequence charSequence) {
        ((TextView) findViewById(R.id.plugin_version)).setText(charSequence);
    }

    public void setTagsText(CharSequence charSequence) {
        ((TextView) this.infoView.findViewById(R.id.plugin_tags)).setText(charSequence);
    }
}
