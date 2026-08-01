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
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.engine.C3012;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.AutoLoadPlugin;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.dialog.PluginDialog;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import lin.xposed.hook.javaplugin.online.upload.UploadPlugin;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p221.C7975;
import p257.C8204;
import p257.C8207;
import p319.C8696;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            ((ClipboardManager) getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Plugin Description", str));
        } catch (Exception e) {
            String strM6668 = "\u590d\u5236\u6587\u672c\u5931\u8d25";
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            AbstractC6154.m11561("\u590d\u5236\u5931\u8d25");
        }
    }

    private String getUploadInfo() {
        return "----------------\n\u540d\u79f0: " + this.pluginInfo.getPluginName() + "\n\u7248\u672c: " + this.pluginInfo.getPluginVersion() + "\n\u4f5c\u8005: " + this.pluginInfo.getPluginAuthor() + "\n----------------\n\n\u4e0a\u4f20\u987b\u77e5:\n\u2022 \u8bf7\u52ff\u4e0a\u4f20\u4e0d\u5c5e\u4e8e\u81ea\u5df1\u7684\u811a\u672c\n\u2022 \u8bf7\u52ff\u4e0a\u4f20\u7ed9\u4e00\u5806\u670b\u53cb\u70b9\u8d5e\u7684\u811a\u672c\n\u2022 \u8bf7\u52ff\u4e0a\u4f20\u6076\u610f\u811a\u672c(\u67e5q/\u70b8\u7fa4/\u6076\u641e\u7b49)\n\u2022 \u8bf7\u52ff\u4e0a\u4f20\u9ad8\u5ea6\u52a0\u5bc6\u7684\u811a\u672c\n\u2022 \u8bf7\u52ff\u4e0a\u4f20\u4e0d\u52a0\u5f00\u5173\u7684\u811a\u672c\n\u2022 \u8bf7\u52ff\u9891\u7e41\u4e0a\u4f20\n\u2022 \u4e0a\u4f20\u5ba1\u6838\u901a\u8fc7\u4f1a\u51fa\u73b0\u5728\u5728\u7ebf\u811a\u672c\n\n\u811a\u672c\u4ea4\u6d41\u7fa4(QQ): 979938489\n\u811a\u672c\u4ea4\u6d41\u7fa4(TG): https://t.me/QStoryPluginBackupChat";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$bindPluginInfoData$1(View view) {
        AbstractC6154.m11561("\u6b63\u5728\u52a0\u8f7d\u4e2d......");
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
                AbstractC6154.m11561("\u8bf7\u52ff\u9891\u7e41\u70b9\u51fb\u5f00\u5173");
                new Handler(Looper.getMainLooper()).post(new RunnableC5538(this, i));
            } else {
                this.isCooldown = true;
                new Thread(this).start();
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC5538(this, i2), 3000L);
            }
        } catch (Exception e) {
            AbstractC6154.m11561(Log.getStackTraceString(e));
            String strM6668 = "load plugin";
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
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
        String strM6668 = "\u9884\u89c8\u56fe";
        String str = "\u6765\u81ea\uff1a" + pluginInfo.getPluginName();
        file.getClass();
        ImageView imageView = new ImageView(context);
        int i = (int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
        imageView.setPadding(i, 0, i, 0);
        ((C3061) ComponentCallbacks2C3057.m6719(imageView).m6754(file).m6554()).m6744(imageView);
        C8207 c8207M13712 = C8207.m13712(str, strM6668);
        c8207M13712.f22617 = new C8696(imageView, 3);
        c8207M13712.mo13704();
        c8207M13712.mo13702("确定", new C5548(5));
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
    public /* synthetic */ boolean lambda$onLongClick$11(C8204 c8204, CharSequence charSequence, int i) {
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
    public /* synthetic */ boolean lambda$showCopyDialog$16(String str, C8207 c8207, View view) {
        copyTextToClipboard(str);
        AbstractC6154.m11561("\u5df2\u590d\u5236\u5230\u526a\u8d34\u677f");
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
    public /* synthetic */ boolean lambda$showDeleteDialog$14(C8207 c8207, View view) {
        PluginManager.stopPlugin(this.pluginInfo);
        AbstractC0455.m1161(new File(this.pluginInfo.getPluginLocalPath()));
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC5538(this, 2), 300L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showDeleteDialog$15(C8207 c8207, View view) {
        AbstractC6154.m11561("\u5bf9\u561b \u8fd8\u662f\u8981\u8003\u8651\u8003\u8651\u7684");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showUploadDialog$12(C8207 c8207, View view) {
        new UploadPlugin().upload(this.pluginInfo);
        return false;
    }

    private void showCopyDialog(String str) {
        C8207 c8207 = new C8207();
        c8207.f22615 = "\u63cf\u8ff0\u5185\u5bb9";
        c8207.mo13704();
        c8207.f22627 = str;
        c8207.mo13704();
        c8207.mo13702("\u590d\u5236", new C5546(this, 0, str));
        c8207.f22630 = "\u5173\u95ed";
        c8207.mo13704();
        c8207.m13714();
    }

    private void showDeleteDialog() {
        C8207 c8207 = new C8207();
        c8207.f22615 = "\u786e\u8ba4\u5220\u9664";
        c8207.mo13704();
        c8207.f22627 = "\u786e\u8ba4\u5220\u9664\u811a\u672c " + this.pluginInfo.getPluginName() + "\uff1f\n\u8fd9\u5c06\u65e0\u6cd5\u6062\u590d";
        c8207.mo13704();
        int i = 0;
        c8207.mo13702("\u786e\u5b9a", new C5547(this, i));
        String strM6668 = "\u53d6\u6d88";
        C5548 c5548 = new C5548(i);
        c8207.f22630 = strM6668;
        c8207.f22623 = c5548;
        c8207.mo13704();
        c8207.m13714();
    }

    private void showUploadDialog() {
        C8207 c8207 = new C8207();
        c8207.f22615 = "\u4e0a\u4f20\u811a\u672c";
        c8207.mo13704();
        c8207.f22627 = getUploadInfo();
        c8207.mo13704();
        c8207.mo13702("\u786e\u5b9a", new C5547(this, 1));
        c8207.f22630 = "\u53d6\u6d88";
        c8207.mo13704();
        c8207.m13714();
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
        setPluginVersionText("\u7248\u672c:" + pluginInfo.getPluginVersion());
        setAuthorText("\u4f5c\u8005:" + pluginInfo.getPluginAuthor() + "\n\u65f6\u95f4:" + pluginInfo.getDate());
        StringBuilder sb = new StringBuilder();
        sb.append("\u6807\u7b7e:");
        sb.append(pluginInfo.getTags());
        setTagsText(sb.toString());
        setDescText(pluginInfo.getPluginDesc());
        setPluginIdText("ID:" + pluginInfo.getPluginID());
        this.progressBar.setOnClickListener(new ViewOnClickListenerC5532(2));
        this.autoLoadCheckbox.setChecked(AutoLoadPlugin.isAutoLoading(pluginInfo));
        int i = 0;
        this.autoLoadCheckbox.setOnCheckedChangeListener(new C5537(pluginInfo, i));
        this.pluginSwitch.setChecked(PluginManager.isRunning(pluginInfo.getPluginID()));
        this.pluginSwitch.setOnCheckedChangeListener(new C5537(this, 1));
        this.infoView.setVisibility(8);
        setOnLongClickListener(this);
        setOnClickListener(this);
        TextView textView = (TextView) this.infoView.findViewById(R.id.plugin_desc);
        textView.setOnClickListener(this);
        textView.setOnLongClickListener(new ViewOnLongClickListenerC5544(this, i, pluginInfo));
        String iconPath = pluginInfo.getIconPath();
        C3012 c3012 = C3012.f9580;
        if (iconPath != null) {
            ((C3061) ((C3061) ((C3061) ComponentCallbacks2C3057.m6719(this).m6754(new File(pluginInfo.getIconPath())).m6560(new C7975(Long.valueOf(System.currentTimeMillis())))).m6556(c3012)).m6560(new C7975(pluginInfo.getIconPath()))).m6744(this.iconView);
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
            ((C3061) ((C3061) ((C3061) ((C3061) ((C3061) ComponentCallbacks2C3057.m6719(imageView).m6754(file).m6565(R.drawable.ic_downloading)).m6555(R.drawable.ic_error)).m6560(new C7975(Long.valueOf(System.currentTimeMillis())))).m6556(c3012)).m6564()).m6744(imageView);
            imageView.setOnClickListener(new ViewOnClickListenerC5543(this, pluginInfo, file, i));
            this.previewLayout.addView(imageView, layoutParams);
        }
        this.previewLayout.setVisibility(0);
    }

    public void notificationError() {
        PluginDialog.PluginLoadCallback pluginLoadCallback = this.loadCallback;
        if (pluginLoadCallback != null) {
            pluginLoadCallback.notificationError();
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC5538(this, 3));
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
        C8204 c8204M13701 = C8204.m13701();
        c8204M13701.f22615 = "\u64cd\u4f5c - " + this.pluginInfo.getPluginName();
        c8204M13701.m13710();
        c8204M13701.m13711(new String[]{"\u4e0a\u4f20", "\u5220\u9664", "\u53d6\u6d88"});
        c8204M13701.f22609 = new C2358(this, 6);
        c8204M13701.m13714();
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
