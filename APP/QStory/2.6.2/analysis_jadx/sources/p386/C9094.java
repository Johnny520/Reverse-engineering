package p386;

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
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import lin.xposed.hook.javaplugin.view.C5548;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5543;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p052.InterfaceC6542;
import p053.AbstractC6560;
import p128.AbstractC7478;
import p128.C7466;
import p192.C7807;
import p217.AbstractC7968;
import p257.C8207;
import p257.C8211;
import p315.C8671;
import p319.C8700;
import p330.C8796;
import p387.AbstractC9098;
import p388.C9099;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.presenter.C5804;
import top.suzhelan.plugin.sdk.online.widget.CustomChipGroup;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9094 extends AbstractC7968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f25405 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5804 f25406;

    public C9094(C5804 c5804) {
        c5804.getClass();
        this.f25406 = c5804;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m14601(TextView textView, LinearLayout linearLayout) {
        C7466 c7466 = new C7466();
        c7466.mo12645(300L);
        ViewParent parent = textView.getParent();
        parent.getClass();
        AbstractC7478.m12668((ViewGroup) parent, c7466);
        Object tag = textView.getTag();
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        if (zBooleanValue) {
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize(null);
            Object tag2 = linearLayout.getTag();
            if (AbstractC4394.m8917(tag2 instanceof Boolean ? (Boolean) tag2 : null, Boolean.TRUE)) {
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
    public static void m14602(String str, String str2, InterfaceC6542 interfaceC6542) {
        C8207 c8207 = new C8207();
        c8207.f22615 = str;
        c8207.mo13704();
        c8207.f22627 = str2;
        c8207.mo13704();
        C8796 c8796 = new C8796(11);
        c8207.f11592 = c8796;
        if (c8207.f11579) {
            c8796.mo8081(c8207);
        }
        c8207.mo13702("复制", new C8700(interfaceC6542, 5));
        C5548 c5548 = new C5548(7);
        c8207.f22630 = "取消";
        c8207.f22623 = c5548;
        c8207.mo13704();
        c8207.m13714();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m14603(Context context, String str) {
        try {
            Object systemService = context.getSystemService("clipboard");
            systemService.getClass();
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", str));
        } catch (Exception e) {
            C8211.m13720("复制失败：" + e);
        }
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13427(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = AbstractC6560.m12028(context).inflate(R.layout.item_online_plugin, viewGroup, false);
        viewInflate.getClass();
        return new C8671(viewInflate);
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13429(AbstractC2484 abstractC2484, int i, Object obj) {
        C8671 c8671 = (C8671) abstractC2484;
        C9099 c9099 = (C9099) obj;
        if (c9099 == null) {
            C5919.m11250("Check failed.");
            return;
        }
        C7807 c7807 = new C7807(m13431(), R.style.AppTheme);
        TextView textView = (TextView) c8671.m14342(R.id.pluginName);
        textView.setText(c9099.getPluginInfo().getName() + " v" + c9099.getPluginInfo().getVersion());
        TextView textView2 = (TextView) c8671.m14342(R.id.pluginAuthor);
        textView2.setText("作者: " + c9099.getPluginInfo().getAuthor());
        final TextView textView3 = (TextView) c8671.m14342(R.id.pluginDescription);
        textView3.setText(c9099.getPluginInfo().getDescription());
        textView3.setMaxLines(2);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTag(Boolean.TRUE);
        c8671.m14341(R.id.downloadCount, "下载: " + c9099.getDownloadCount());
        int i2 = AbstractC9098.f25417;
        c8671.m14341(R.id.tv_date, AbstractC9098.m14604(c9099.getUpdatedAt()));
        CustomChipGroup customChipGroup = (CustomChipGroup) c8671.m14342(R.id.pluginTags);
        customChipGroup.removeAllViews();
        for (String str : c9099.getPluginInfo().getTags()) {
            Chip chip = new Chip(c7807, null);
            chip.setText(str);
            chip.setClickable(false);
            chip.setTextAppearance(R.style.TextAppearance_Material3_LabelSmall);
            customChipGroup.addView(chip);
        }
        final LinearLayout linearLayout = (LinearLayout) c8671.m14342(R.id.previewsContainer);
        linearLayout.removeAllViews();
        boolean z = c9099.getPluginInfo().getImages().getPreviewStatus() == 1 && !c9099.getPluginInfo().getImages().getPreviewFilename().isEmpty();
        linearLayout.setTag(Boolean.valueOf(z));
        if (z) {
            Iterator it = c9099.getPluginInfo().getImages().getPreviewFilename().iterator();
            while (it.hasNext()) {
                String strM10128 = AbstractC5138.m10128(AbstractC5138.m10128(PluginSdkConfig.IMAGE_URL, "{cloudId}", c9099.getCloudId()), "{filename}", (String) it.next());
                ImageView imageView = new ImageView(c8671.itemView.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) imageView.getResources().getDimension(R.dimen.preview_image_width), -1);
                layoutParams.setMarginEnd((int) imageView.getResources().getDimension(R.dimen.preview_image_spacing));
                imageView.setLayoutParams(layoutParams);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setOnClickListener(new ViewOnClickListenerC5543(c8671, c9099, strM10128, 10));
                ((C3061) ((C3061) ComponentCallbacks2C3057.m6719(imageView).m6751(strM10128).m6565(R.drawable.ic_downloading)).m6555(R.drawable.ic_error)).m6744(imageView);
                linearLayout.addView(imageView);
            }
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(8);
        }
        ImageView imageView2 = (ImageView) c8671.m14342(R.id.pluginIcon);
        if (c9099.getPluginInfo().getImages().getIconStatus() == 1) {
            ((C3061) ComponentCallbacks2C3057.m6719(imageView2).m6751(AbstractC5138.m10128(AbstractC5138.m10128(PluginSdkConfig.IMAGE_URL, "{cloudId}", c9099.getCloudId()), "{filename}", c9099.getPluginInfo().getImages().getIconFilename())).m6565(R.drawable.ic_plugin_icon)).m6744(imageView2);
        } else {
            imageView2.setImageResource(R.drawable.ic_plugin_icon);
        }
        final int i3 = 0;
        c8671.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世苏兰哲
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                LinearLayout linearLayout2 = linearLayout;
                TextView textView4 = textView3;
                switch (i4) {
                    case 0:
                        C9094.m14601(textView4, linearLayout2);
                        break;
                    default:
                        C9094.m14601(textView4, linearLayout2);
                        break;
                }
            }
        });
        textView.setOnLongClickListener(new ViewOnLongClickListenerC9095(this, c8671, c9099, i3));
        final int i4 = 1;
        textView2.setOnLongClickListener(new ViewOnLongClickListenerC9095(this, c8671, c9099, i4));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世苏兰哲
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                LinearLayout linearLayout2 = linearLayout;
                TextView textView4 = textView3;
                switch (i42) {
                    case 0:
                        C9094.m14601(textView4, linearLayout2);
                        break;
                    default:
                        C9094.m14601(textView4, linearLayout2);
                        break;
                }
            }
        });
        textView3.setOnLongClickListener(new ViewOnLongClickListenerC9095(this, c8671, c9099, 2));
        ((TextView) c8671.m14342(R.id.installButton)).setOnClickListener(new ViewOnClickListenerC5561(c9099, 23, this));
        TextView textView4 = (TextView) c8671.m14342(R.id.commentButton);
        textView4.setText("评论(" + c9099.getCommentCount() + ")");
        textView4.setOnClickListener(new ViewOnClickListenerC5561(c8671, 24, c9099));
    }
}
