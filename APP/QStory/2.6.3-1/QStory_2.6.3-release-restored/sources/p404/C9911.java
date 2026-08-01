package p404;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC3317;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.chip.Chip;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import lin.xposed.hook.javaplugin.view.C6380;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC6375;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p034.AbstractC7082;
import p068.InterfaceC7372;
import p144.AbstractC8308;
import p144.C8296;
import p208.C8637;
import p233.AbstractC8798;
import p273.C9037;
import p273.C9041;
import p331.C9492;
import p338.C9532;
import p352.C9620;
import p401.C9895;
import p403.AbstractC9910;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.presenter.C6635;
import top.suzhelan.plugin.sdk.online.widget.CustomChipGroup;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9911 extends AbstractC8798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f25801 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6635 f25802;

    public C9911(C6635 c6635) {
        c6635.getClass();
        this.f25802 = c6635;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m15218(TextView textView, LinearLayout linearLayout) {
        C8296 c8296 = new C8296();
        c8296.mo13231(300L);
        ViewParent parent = textView.getParent();
        parent.getClass();
        AbstractC8308.m13256((ViewGroup) parent, c8296);
        Object tag = textView.getTag();
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        if (zBooleanValue) {
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize(null);
            Object tag2 = linearLayout.getTag();
            if (AbstractC5227.m9466(tag2 instanceof Boolean ? (Boolean) tag2 : null, Boolean.TRUE)) {
                linearLayout.setVisibility(0);
            }
        } else {
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.setVisibility(8);
        }
        textView.setTag(Boolean.valueOf(!zBooleanValue));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m15219(String str, String str2, InterfaceC7372 interfaceC7372) {
        C9037 c9037 = new C9037();
        c9037.f22959 = str;
        c9037.mo14280();
        c9037.f22971 = str2;
        c9037.mo14280();
        C9620 c9620 = new C9620(12);
        c9037.f11942 = c9620;
        if (c9037.f11929) {
            c9620.mo8627(c9037);
        }
        c9037.mo14278("复制", new C9532(interfaceC7372, 5));
        C6380 c6380 = new C6380(7);
        c9037.f22974 = "取消";
        c9037.f22967 = c6380;
        c9037.mo14280();
        c9037.m14290();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m15220(Context context, String str) {
        try {
            Object systemService = context.getSystemService("clipboard");
            systemService.getClass();
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", str));
        } catch (Exception e) {
            C9041.m14296("复制失败：" + e);
        }
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC3317 mo14014(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = AbstractC7082.m12309(context).inflate(C0328R.layout.item_online_plugin, viewGroup, false);
        viewInflate.getClass();
        return new C9492(viewInflate);
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo14016(AbstractC3317 abstractC3317, int i, Object obj) {
        C9492 c9492 = (C9492) abstractC3317;
        C9895 c9895 = (C9895) obj;
        if (c9895 == null) {
            C6755.m11870("Check failed.");
            return;
        }
        C8637 c8637 = new C8637(m14018(), C0328R.style.AppTheme);
        TextView textView = (TextView) c9492.m14919(C0328R.id.pluginName);
        textView.setText(c9895.getPluginInfo().getName() + " v" + c9895.getPluginInfo().getVersion());
        TextView textView2 = (TextView) c9492.m14919(C0328R.id.pluginAuthor);
        textView2.setText("作者: " + c9895.getPluginInfo().getAuthor());
        final TextView textView3 = (TextView) c9492.m14919(C0328R.id.pluginDescription);
        textView3.setText(c9895.getPluginInfo().getDescription());
        textView3.setMaxLines(2);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTag(Boolean.TRUE);
        c9492.m14918(C0328R.id.downloadCount, "下载: " + c9895.getDownloadCount());
        int i2 = AbstractC9910.f25800;
        c9492.m14918(C0328R.id.tv_date, AbstractC9910.m15217(c9895.getUpdatedAt()));
        CustomChipGroup customChipGroup = (CustomChipGroup) c9492.m14919(C0328R.id.pluginTags);
        customChipGroup.removeAllViews();
        for (String str : c9895.getPluginInfo().getTags()) {
            Chip chip = new Chip(c8637, null);
            chip.setText(str);
            chip.setClickable(false);
            chip.setTextAppearance(C0328R.style.TextAppearance_Material3_LabelSmall);
            customChipGroup.addView(chip);
        }
        final LinearLayout linearLayout = (LinearLayout) c9492.m14919(C0328R.id.previewsContainer);
        linearLayout.removeAllViews();
        boolean z = c9895.getPluginInfo().getImages().getPreviewStatus() == 1 && !c9895.getPluginInfo().getImages().getPreviewFilename().isEmpty();
        linearLayout.setTag(Boolean.valueOf(z));
        if (z) {
            Iterator it = c9895.getPluginInfo().getImages().getPreviewFilename().iterator();
            while (it.hasNext()) {
                String strM10696 = AbstractC5971.m10696(AbstractC5971.m10696(PluginSdkConfig.IMAGE_URL, "{cloudId}", c9895.getCloudId()), "{filename}", (String) it.next());
                ImageView imageView = new ImageView(c9492.itemView.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) imageView.getResources().getDimension(C0328R.dimen.preview_image_width), -1);
                layoutParams.setMarginEnd((int) imageView.getResources().getDimension(C0328R.dimen.preview_image_spacing));
                imageView.setLayoutParams(layoutParams);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setOnClickListener(new ViewOnClickListenerC6375(c9492, c9895, strM10696, 10));
                ((C3894) ((C3894) ComponentCallbacks2C3890.m7324(imageView).m7356(strM10696).m7185(C0328R.drawable.ic_downloading)).m7175(C0328R.drawable.ic_error)).m7349(imageView);
                linearLayout.addView(imageView);
            }
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(8);
        }
        ImageView imageView2 = (ImageView) c9492.m14919(C0328R.id.pluginIcon);
        if (c9895.getPluginInfo().getImages().getIconStatus() == 1) {
            ((C3894) ComponentCallbacks2C3890.m7324(imageView2).m7356(AbstractC5971.m10696(AbstractC5971.m10696(PluginSdkConfig.IMAGE_URL, "{cloudId}", c9895.getCloudId()), "{filename}", c9895.getPluginInfo().getImages().getIconFilename())).m7185(C0328R.drawable.ic_plugin_icon)).m7349(imageView2);
        } else {
            imageView2.setImageResource(C0328R.drawable.ic_plugin_icon);
        }
        final int i3 = 0;
        c9492.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世苏兰哲
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                LinearLayout linearLayout2 = linearLayout;
                TextView textView4 = textView3;
                switch (i4) {
                    case 0:
                        C9911.m15218(textView4, linearLayout2);
                        break;
                    default:
                        C9911.m15218(textView4, linearLayout2);
                        break;
                }
            }
        });
        textView.setOnLongClickListener(new ViewOnLongClickListenerC9912(this, c9492, c9895, i3));
        final int i4 = 1;
        textView2.setOnLongClickListener(new ViewOnLongClickListenerC9912(this, c9492, c9895, i4));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世苏兰哲
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                LinearLayout linearLayout2 = linearLayout;
                TextView textView4 = textView3;
                switch (i42) {
                    case 0:
                        C9911.m15218(textView4, linearLayout2);
                        break;
                    default:
                        C9911.m15218(textView4, linearLayout2);
                        break;
                }
            }
        });
        textView3.setOnLongClickListener(new ViewOnLongClickListenerC9912(this, c9492, c9895, 2));
        ((TextView) c9492.m14919(C0328R.id.installButton)).setOnClickListener(new ViewOnClickListenerC6392(c9895, 23, this));
        TextView textView4 = (TextView) c9492.m14919(C0328R.id.commentButton);
        textView4.setText("评论(" + c9895.getCommentCount() + ")");
        textView4.setOnClickListener(new ViewOnClickListenerC6392(c9492, 24, c9895));
    }
}
