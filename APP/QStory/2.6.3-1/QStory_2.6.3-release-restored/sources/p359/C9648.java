package p359;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC3317;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC6376;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p034.AbstractC7082;
import p068.InterfaceC7387;
import p208.C8637;
import p233.AbstractC8798;
import p331.C9492;
import p402.C9906;
import p403.AbstractC9910;
import top.suzhelan.plugin.sdk.online.entity.Message;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.net.StickerUrlResolver;
import top.suzhelan.sticker.sdk.presenter.C6815;
import top.suzhelan.sticker.sdk.widget.CustomChipGroup;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9648 extends AbstractC8798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC7387 f25167;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f25168 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC7387 f25169;

    public C9648(C9906 c9906, C9906 c99062) {
        this.f25169 = c9906;
        this.f25167 = c99062;
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC3317 mo14014(Context context, ViewGroup viewGroup, int i) {
        switch (this.f25168) {
            case 0:
                View viewInflate = AbstractC7082.m12309(context).inflate(C0328R.layout.item_online_sticker, viewGroup, false);
                viewInflate.getClass();
                return new C9492(viewInflate);
            default:
                View viewInflate2 = AbstractC7082.m12309(context).inflate(C0328R.layout.item_message, viewGroup, false);
                viewInflate2.getClass();
                return new C9492(viewInflate2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo14016(AbstractC3317 abstractC3317, int i, Object obj) {
        String strConcat;
        String string;
        int i2 = 5;
        switch (this.f25168) {
            case 0:
                C9492 c9492 = (C9492) abstractC3317;
                OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) obj;
                if (onlineStickerInfo != null) {
                    C8637 c8637 = new C8637(m14018(), C0328R.style.AppTheme);
                    ImageView imageView = (ImageView) c9492.m14919(C0328R.id.iv_cover);
                    ((C3894) ((C3894) ComponentCallbacks2C3890.m7324(imageView).m7356(StickerUrlResolver.resolveAssetUrl(onlineStickerInfo.getCoverUrl())).m7185(C0328R.drawable.ic_sticker_default)).m7175(C0328R.drawable.ic_sticker_default)).m7349(imageView);
                    c9492.m14918(C0328R.id.tv_title, onlineStickerInfo.getTitle());
                    String author = onlineStickerInfo.getAuthor();
                    if (author == null || (string = AbstractC5976.m10714(author).toString()) == null) {
                        strConcat = null;
                    } else {
                        if (string.length() <= 0) {
                            string = null;
                        }
                        if (string != null) {
                            strConcat = "作者: ".concat(string);
                        }
                    }
                    String nickname = onlineStickerInfo.getNickname();
                    String uin = onlineStickerInfo.getUin();
                    String string2 = nickname != null ? AbstractC5976.m10714(nickname).toString() : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                    String string3 = uin != null ? AbstractC5976.m10714(uin).toString() : null;
                    if (string3 == null) {
                        string3 = "";
                    }
                    if (string2.length() > 0 && string3.length() > 0) {
                        string2 = string2 + "(" + string3 + ")";
                    } else if (string2.length() <= 0) {
                        string2 = string3.length() > 0 ? string3 : null;
                    }
                    ArrayList arrayListM9385 = AbstractC5179.m9385(new String[]{strConcat, string2 != null ? "上传者: ".concat(string2) : null});
                    TextView textView = (TextView) c9492.m14919(C0328R.id.tv_author);
                    if (arrayListM9385.isEmpty()) {
                        textView.setVisibility(8);
                        textView.setText("");
                    } else {
                        textView.setVisibility(0);
                        textView.setText(AbstractC5176.m9369(arrayListM9385, " · ", null, null, null, 62));
                    }
                    CustomChipGroup customChipGroup = (CustomChipGroup) c9492.m14919(C0328R.id.cg_tags);
                    customChipGroup.removeAllViews();
                    for (String str : AbstractC5176.m9358(3, onlineStickerInfo.getTags())) {
                        Chip chip = new Chip(c8637, null);
                        chip.setText(str);
                        chip.setClickable(false);
                        chip.setTextAppearance(C0328R.style.TextAppearance_Material3_LabelSmall);
                        customChipGroup.addView(chip);
                    }
                    c9492.m14918(C0328R.id.tv_count, onlineStickerInfo.getStickerCount() + "张");
                    c9492.m14918(C0328R.id.tv_download_count, "下载" + onlineStickerInfo.getDownloadCount());
                    c9492.itemView.setOnClickListener(new ViewOnClickListenerC6392(this, 16, onlineStickerInfo));
                    c9492.itemView.setOnLongClickListener(new ViewOnLongClickListenerC6376(this, i2, onlineStickerInfo));
                } else {
                    C6755.m11870("Check failed.");
                }
                break;
            default:
                C9492 c94922 = (C9492) abstractC3317;
                Message message = (Message) obj;
                if (message != null) {
                    ImageView imageView2 = (ImageView) c94922.m14919(C0328R.id.iv_message_type_icon);
                    int type = message.getType();
                    imageView2.setImageResource(type != 1 ? type != 2 ? type != 3 ? type != 4 ? type != 5 ? C0328R.drawable.ic_message_notification : C0328R.drawable.ic_message_comment : C0328R.drawable.ic_message_reply : C0328R.drawable.ic_message_close : C0328R.drawable.ic_message_check : C0328R.drawable.ic_message_upload);
                    c94922.m14918(C0328R.id.tv_message_type, message.m11770());
                    c94922.m14918(C0328R.id.tv_message_title, message.getTitle());
                    ((TextView) c94922.m14919(C0328R.id.tv_message_content)).setText(message.getContent());
                    int i3 = AbstractC9910.f25800;
                    c94922.m14918(C0328R.id.tv_message_time, AbstractC9910.m15217(message.getCreatedAt()));
                    ImageView imageView3 = (ImageView) c94922.m14919(C0328R.id.iv_unread_indicator);
                    View viewM14919 = c94922.m14919(C0328R.id.message_card);
                    if (message.getIsRead()) {
                        imageView3.setVisibility(8);
                        viewM14919.setBackgroundColor(c94922.itemView.getContext().getColor(C0328R.color.online_plugin_card_bg));
                    } else {
                        imageView3.setVisibility(0);
                        viewM14919.setBackgroundColor(Color.parseColor("#4000BFFF"));
                    }
                    c94922.itemView.setOnClickListener(new ViewOnClickListenerC6392(this, 22, message));
                    c94922.itemView.setOnLongClickListener(new ViewOnLongClickListenerC6376(this, 6, message));
                } else {
                    C6755.m11870("Check failed.");
                }
                break;
        }
    }

    public C9648(C6815 c6815) {
        c6815.getClass();
    }
}
