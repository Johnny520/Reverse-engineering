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
import androidx.fragment.app.C3191;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.engine.C3845;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.File;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.AutoLoadPlugin;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.dialog.PluginDialog;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import lin.xposed.hook.javaplugin.online.upload.UploadPlugin;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p237.C8805;
import p273.C9034;
import p273.C9037;
import p339.C9548;

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
        LayoutInflater.from(context).inflate(C0328R.layout.plugin_item_view, this);
        this.infoView = (RelativeLayout) findViewById(C0328R.id.plugin_info_layout);
        this.pluginSwitch = (Switch) findViewById(C0328R.id.plugin_switch);
        this.autoLoadCheckbox = (CheckBox) findViewById(C0328R.id.plugin_auto_load);
        this.progressBar = (ProgressBar) findViewById(C0328R.id.plugin_progress_bar);
        this.previewLayout = (LinearLayout) findViewById(C0328R.id.previewsContainer);
        this.iconView = (ImageView) findViewById(C0328R.id.pluginIcon);
    }

    private void copyTextToClipboard(String str) {
        try {
            ((ClipboardManager) getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Plugin Description", str));
        } catch (Exception e) {
            String strM14531 = "复制文本失败";
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            AbstractC7014.m12151("复制失败");
        }
    }

    private String getUploadInfo() {
        return "----------------\n名称: " + this.pluginInfo.getPluginName() + "\n版本: " + this.pluginInfo.getPluginVersion() + "\n作者: " + this.pluginInfo.getPluginAuthor() + "\n----------------\n\n上传须知:\n• 请勿上传不属于自己的脚本\n• 请勿上传给一堆朋友点赞的脚本\n• 请勿上传恶意脚本(查q/炸群/恶搞等)\n• 请勿上传高度加密的脚本\n• 请勿上传不加开关的脚本\n• 请勿频繁上传\n• 上传审核通过会出现在在线脚本\n\n脚本交流群(QQ): 979938489\n脚本交流群(TG): https://t.me/QStoryPluginBackupChat";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$bindPluginInfoData$1(View view) {
        AbstractC7014.m12151("正在加载中......");
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
                AbstractC7014.m12151("请勿频繁点击开关");
                new Handler(Looper.getMainLooper()).post(new RunnableC6370(this, i));
            } else {
                this.isCooldown = true;
                new Thread(this).start();
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC6370(this, i2), 3000L);
            }
        } catch (Exception e) {
            AbstractC7014.m12151(Log.getStackTraceString(e));
            String strM14531 = "load plugin";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
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
        String strM14531 = "预览图";
        String str = "来自：" + pluginInfo.getPluginName();
        file.getClass();
        ImageView imageView = new ImageView(context);
        int i = (int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
        imageView.setPadding(i, 0, i, 0);
        ((C3894) ComponentCallbacks2C3890.m7324(imageView).m7359(file).m7174()).m7349(imageView);
        C9037 c9037M14288 = C9037.m14288(str, strM14531);
        c9037M14288.f22961 = new C9548(imageView, 3);
        c9037M14288.mo14280();
        c9037M14288.mo14278("确定", new C6380(5));
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
    public /* synthetic */ boolean lambda$onLongClick$11(C9034 c9034, CharSequence charSequence, int i) {
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
    public /* synthetic */ boolean lambda$showCopyDialog$16(String str, C9037 c9037, View view) {
        copyTextToClipboard(str);
        AbstractC7014.m12151("已复制到剪贴板");
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
    public /* synthetic */ boolean lambda$showDeleteDialog$14(C9037 c9037, View view) {
        PluginManager.stopPlugin(this.pluginInfo);
        AbstractC5894.m10611(new File(this.pluginInfo.getPluginLocalPath()));
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC6370(this, 2), 300L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showDeleteDialog$15(C9037 c9037, View view) {
        AbstractC7014.m12151("对嘛 还是要考虑考虑的");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showUploadDialog$12(C9037 c9037, View view) {
        new UploadPlugin().upload(this.pluginInfo);
        return false;
    }

    private void showCopyDialog(String str) {
        C9037 c9037 = new C9037();
        c9037.f22959 = "描述内容";
        c9037.mo14280();
        c9037.f22971 = str;
        c9037.mo14280();
        c9037.mo14278("复制", new C6378(this, 0, str));
        c9037.f22974 = "关闭";
        c9037.mo14280();
        c9037.m14290();
    }

    private void showDeleteDialog() {
        C9037 c9037 = new C9037();
        c9037.f22959 = "确认删除";
        c9037.mo14280();
        c9037.f22971 = "确认删除脚本 " + this.pluginInfo.getPluginName() + "？\n这将无法恢复";
        c9037.mo14280();
        int i = 0;
        c9037.mo14278("确定", new C6379(this, i));
        String strM14532 = "取消";
        C6380 c6380 = new C6380(i);
        c9037.f22974 = strM14532;
        c9037.f22967 = c6380;
        c9037.mo14280();
        c9037.m14290();
    }

    private void showUploadDialog() {
        C9037 c9037 = new C9037();
        c9037.f22959 = "上传脚本";
        c9037.mo14280();
        c9037.f22971 = getUploadInfo();
        c9037.mo14280();
        c9037.mo14278("确定", new C6379(this, 1));
        c9037.f22974 = "取消";
        c9037.mo14280();
        c9037.m14290();
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
        setPluginVersionText("版本:" + pluginInfo.getPluginVersion());
        setAuthorText("作者:" + pluginInfo.getPluginAuthor() + "\n时间:" + pluginInfo.getDate());
        StringBuilder sb = new StringBuilder();
        sb.append("标签:");
        sb.append(pluginInfo.getTags());
        setTagsText(sb.toString());
        setDescText(pluginInfo.getPluginDesc());
        setPluginIdText("ID:" + pluginInfo.getPluginID());
        this.progressBar.setOnClickListener(new ViewOnClickListenerC6365(2));
        this.autoLoadCheckbox.setChecked(AutoLoadPlugin.isAutoLoading(pluginInfo));
        int i = 0;
        this.autoLoadCheckbox.setOnCheckedChangeListener(new C6369(pluginInfo, i));
        this.pluginSwitch.setChecked(PluginManager.isRunning(pluginInfo.getPluginID()));
        this.pluginSwitch.setOnCheckedChangeListener(new C6369(this, 1));
        this.infoView.setVisibility(8);
        setOnLongClickListener(this);
        setOnClickListener(this);
        TextView textView = (TextView) this.infoView.findViewById(C0328R.id.plugin_desc);
        textView.setOnClickListener(this);
        textView.setOnLongClickListener(new ViewOnLongClickListenerC6376(this, i, pluginInfo));
        String iconPath = pluginInfo.getIconPath();
        C3845 c3845 = C3845.f9927;
        if (iconPath != null) {
            ((C3894) ((C3894) ((C3894) ComponentCallbacks2C3890.m7324(this).m7359(new File(pluginInfo.getIconPath())).m7180(new C8805(Long.valueOf(System.currentTimeMillis())))).m7176(c3845)).m7180(new C8805(pluginInfo.getIconPath()))).m7349(this.iconView);
        }
        if (pluginInfo.getPreviewPaths() == null || pluginInfo.getPreviewPaths().isEmpty()) {
            this.previewLayout.setVisibility(8);
            return;
        }
        Iterator<String> it = pluginInfo.getPreviewPaths().iterator();
        while (it.hasNext()) {
            File file = new File(it.next());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) getContext().getResources().getDimension(C0328R.dimen.preview_image_width), -1);
            layoutParams.setMarginEnd((int) getContext().getResources().getDimension(C0328R.dimen.preview_image_spacing));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(C0328R.drawable.ic_plugin_icon);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ((C3894) ((C3894) ((C3894) ((C3894) ((C3894) ComponentCallbacks2C3890.m7324(imageView).m7359(file).m7185(C0328R.drawable.ic_downloading)).m7175(C0328R.drawable.ic_error)).m7180(new C8805(Long.valueOf(System.currentTimeMillis())))).m7176(c3845)).m7184()).m7349(imageView);
            imageView.setOnClickListener(new ViewOnClickListenerC6375(this, pluginInfo, file, i));
            this.previewLayout.addView(imageView, layoutParams);
        }
        this.previewLayout.setVisibility(0);
    }

    public void notificationError() {
        PluginDialog.PluginLoadCallback pluginLoadCallback = this.loadCallback;
        if (pluginLoadCallback != null) {
            pluginLoadCallback.notificationError();
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC6370(this, 3));
    }

    public void notificationLoad(final boolean z) {
        PluginDialog.PluginLoadCallback pluginLoadCallback = this.loadCallback;
        if (pluginLoadCallback != null) {
            pluginLoadCallback.notificationLoad(z);
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世哲兰苏
            @Override // java.lang.Runnable
            public final void run() {
                this.f15637.lambda$notificationLoad$10(z);
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
                public final /* synthetic */ PluginItemView f15650;

                {
                    this.f15650 = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    PluginItemView pluginItemView = this.f15650;
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
            public final /* synthetic */ PluginItemView f15650;

            {
                this.f15650 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i;
                PluginItemView pluginItemView = this.f15650;
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
        C9034 c9034M14277 = C9034.m14277();
        c9034M14277.f22959 = "操作 - " + this.pluginInfo.getPluginName();
        c9034M14277.m14286();
        c9034M14277.m14287(new String[]{"上传", "删除", "取消"});
        c9034M14277.f22953 = new C3191(this, 6);
        c9034M14277.m14290();
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        notificationLoad(true);
        startRunPlugin();
        notificationLoad(false);
    }

    public void setAuthorText(CharSequence charSequence) {
        ((TextView) this.infoView.findViewById(C0328R.id.plugin_author)).setText(charSequence);
    }

    public void setDescText(CharSequence charSequence) {
        ((TextView) this.infoView.findViewById(C0328R.id.plugin_desc)).setText(charSequence);
    }

    public void setPluginDialog(PluginDialog pluginDialog) {
        this.pluginDialog = pluginDialog;
    }

    public void setPluginIdText(CharSequence charSequence) {
        ((TextView) this.infoView.findViewById(C0328R.id.plugin_id)).setText(charSequence);
    }

    public void setPluginLoadCallback(PluginDialog.PluginLoadCallback pluginLoadCallback) {
        this.loadCallback = pluginLoadCallback;
    }

    public void setPluginNameText(CharSequence charSequence) {
        ((TextView) findViewById(C0328R.id.plugin_name)).setText(charSequence);
    }

    public void setPluginVersionText(CharSequence charSequence) {
        ((TextView) findViewById(C0328R.id.plugin_version)).setText(charSequence);
    }

    public void setTagsText(CharSequence charSequence) {
        ((TextView) this.infoView.findViewById(C0328R.id.plugin_tags)).setText(charSequence);
    }
}
