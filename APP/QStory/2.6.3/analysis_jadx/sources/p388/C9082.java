package p388;

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
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import lin.xposed.hook.javaplugin.view.C5549;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5544;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p018.AbstractC6253;
import p052.InterfaceC6543;
import p128.AbstractC7479;
import p128.C7467;
import p192.C7808;
import p217.AbstractC7969;
import p257.C8208;
import p257.C8212;
import p315.C8663;
import p322.C8703;
import p336.C8791;
import p385.C9066;
import p387.AbstractC9081;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.presenter.C5805;
import top.suzhelan.plugin.sdk.online.widget.CustomChipGroup;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9082 extends AbstractC7969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f25456 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5805 f25457;

    public C9082(C5805 c5805) {
        c5805.getClass();
        this.f25457 = c5805;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m14659(TextView textView, LinearLayout linearLayout) {
        C7467 c7467 = new C7467();
        c7467.mo12672(300L);
        ViewParent parent = textView.getParent();
        parent.getClass();
        AbstractC7479.m12697((ViewGroup) parent, c7467);
        Object tag = textView.getTag();
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        if (zBooleanValue) {
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize(null);
            Object tag2 = linearLayout.getTag();
            if (AbstractC4395.m8907(tag2 instanceof Boolean ? (Boolean) tag2 : null, Boolean.TRUE)) {
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
    public static void m14660(String str, String str2, InterfaceC6543 interfaceC6543) {
        C8208 c8208 = new C8208();
        c8208.f22614 = str;
        c8208.mo13721();
        c8208.f22626 = str2;
        c8208.mo13721();
        C8791 c8791 = new C8791(12);
        c8208.f11597 = c8791;
        if (c8208.f11584) {
            c8791.mo8068(c8208);
        }
        c8208.mo13719("复制", new C8703(interfaceC6543, 5));
        C5549 c5549 = new C5549(7);
        c8208.f22629 = "取消";
        c8208.f22622 = c5549;
        c8208.mo13721();
        c8208.m13731();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m14661(Context context, String str) {
        try {
            Object systemService = context.getSystemService("clipboard");
            systemService.getClass();
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", str));
        } catch (Exception e) {
            C8212.m13737("复制失败：" + e);
        }
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13455(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = AbstractC6253.m11750(context).inflate(R.layout.item_online_plugin, viewGroup, false);
        viewInflate.getClass();
        return new C8663(viewInflate);
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13457(AbstractC2484 abstractC2484, int i, Object obj) {
        C8663 c8663 = (C8663) abstractC2484;
        C9066 c9066 = (C9066) obj;
        if (c9066 == null) {
            C5925.m11311("Check failed.");
            return;
        }
        C7808 c7808 = new C7808(m13459(), R.style.AppTheme);
        TextView textView = (TextView) c8663.m14360(R.id.pluginName);
        textView.setText(c9066.getPluginInfo().getName() + " v" + c9066.getPluginInfo().getVersion());
        TextView textView2 = (TextView) c8663.m14360(R.id.pluginAuthor);
        textView2.setText("作者: " + c9066.getPluginInfo().getAuthor());
        final TextView textView3 = (TextView) c8663.m14360(R.id.pluginDescription);
        textView3.setText(c9066.getPluginInfo().getDescription());
        textView3.setMaxLines(2);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTag(Boolean.TRUE);
        c8663.m14359(R.id.downloadCount, "下载: " + c9066.getDownloadCount());
        int i2 = AbstractC9081.f25455;
        c8663.m14359(R.id.tv_date, AbstractC9081.m14658(c9066.getUpdatedAt()));
        CustomChipGroup customChipGroup = (CustomChipGroup) c8663.m14360(R.id.pluginTags);
        customChipGroup.removeAllViews();
        for (String str : c9066.getPluginInfo().getTags()) {
            Chip chip = new Chip(c7808, null);
            chip.setText(str);
            chip.setClickable(false);
            chip.setTextAppearance(R.style.TextAppearance_Material3_LabelSmall);
            customChipGroup.addView(chip);
        }
        final LinearLayout linearLayout = (LinearLayout) c8663.m14360(R.id.previewsContainer);
        linearLayout.removeAllViews();
        boolean z = c9066.getPluginInfo().getImages().getPreviewStatus() == 1 && !c9066.getPluginInfo().getImages().getPreviewFilename().isEmpty();
        linearLayout.setTag(Boolean.valueOf(z));
        if (z) {
            Iterator it = c9066.getPluginInfo().getImages().getPreviewFilename().iterator();
            while (it.hasNext()) {
                String strM10137 = AbstractC5139.m10137(AbstractC5139.m10137(PluginSdkConfig.IMAGE_URL, "{cloudId}", c9066.getCloudId()), "{filename}", (String) it.next());
                ImageView imageView = new ImageView(c8663.itemView.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) imageView.getResources().getDimension(R.dimen.preview_image_width), -1);
                layoutParams.setMarginEnd((int) imageView.getResources().getDimension(R.dimen.preview_image_spacing));
                imageView.setLayoutParams(layoutParams);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setOnClickListener(new ViewOnClickListenerC5544(c8663, c9066, strM10137, 10));
                ((C3062) ((C3062) ComponentCallbacks2C3058.m6764(imageView).m6796(strM10137).m6625(R.drawable.ic_downloading)).m6615(R.drawable.ic_error)).m6789(imageView);
                linearLayout.addView(imageView);
            }
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(8);
        }
        ImageView imageView2 = (ImageView) c8663.m14360(R.id.pluginIcon);
        if (c9066.getPluginInfo().getImages().getIconStatus() == 1) {
            ((C3062) ComponentCallbacks2C3058.m6764(imageView2).m6796(AbstractC5139.m10137(AbstractC5139.m10137(PluginSdkConfig.IMAGE_URL, "{cloudId}", c9066.getCloudId()), "{filename}", c9066.getPluginInfo().getImages().getIconFilename())).m6625(R.drawable.ic_plugin_icon)).m6789(imageView2);
        } else {
            imageView2.setImageResource(R.drawable.ic_plugin_icon);
        }
        final int i3 = 0;
        c8663.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世苏兰哲
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                LinearLayout linearLayout2 = linearLayout;
                TextView textView4 = textView3;
                switch (i4) {
                    case 0:
                        C9082.m14659(textView4, linearLayout2);
                        break;
                    default:
                        C9082.m14659(textView4, linearLayout2);
                        break;
                }
            }
        });
        textView.setOnLongClickListener(new ViewOnLongClickListenerC9083(this, c8663, c9066, i3));
        final int i4 = 1;
        textView2.setOnLongClickListener(new ViewOnLongClickListenerC9083(this, c8663, c9066, i4));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世苏兰哲
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                LinearLayout linearLayout2 = linearLayout;
                TextView textView4 = textView3;
                switch (i42) {
                    case 0:
                        C9082.m14659(textView4, linearLayout2);
                        break;
                    default:
                        C9082.m14659(textView4, linearLayout2);
                        break;
                }
            }
        });
        textView3.setOnLongClickListener(new ViewOnLongClickListenerC9083(this, c8663, c9066, 2));
        ((TextView) c8663.m14360(R.id.installButton)).setOnClickListener(new ViewOnClickListenerC5562(c9066, 23, this));
        TextView textView4 = (TextView) c8663.m14360(R.id.commentButton);
        textView4.setText("评论(" + c9066.getCommentCount() + ")");
        textView4.setOnClickListener(new ViewOnClickListenerC5562(c8663, 24, c9066));
    }
}
