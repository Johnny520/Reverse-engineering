package p339;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.foundation.lazy.layout.C1520;
import androidx.compose.runtime.internal.C2086;
import androidx.recyclerview.widget.AbstractC3369;
import androidx.recyclerview.widget.C3326;
import androidx.recyclerview.widget.C3327;
import androidx.recyclerview.widget.C3338;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C3376;
import androidx.viewpager2.widget.C3382;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.load.engine.C3837;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import io.ktor.util.C5039;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC6375;
import net.bytebuddy.utility.JavaConstant;
import p025.AbstractC7012;
import p034.AbstractC7082;
import p050.AbstractC7176;
import p069.AbstractC7390;
import p132.C8171;
import p160.C8376;
import p208.C8637;
import p209.C8657;
import p232.C8788;
import p233.AbstractC8798;
import p246.C8878;
import p273.C9056;
import p273.C9069;
import p337.C9517;
import p337.C9524;
import p337.C9525;
import p340.C9565;
import p340.C9566;
import p340.C9568;
import p358.C9646;
import p359.C9648;
import p371.C9727;
import p402.C9904;
import p402.C9906;
import p402.ViewOnClickListenerC9907;
import top.suzhelan.plugin.sdk.online.presenter.C6635;
import top.suzhelan.plugin.sdk.online.presenter.C6637;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;
import top.suzhelan.qstory.p015ui.views.CustomMaterialCheckBox;
import top.suzhelan.qstory.p015ui.views.CustomMaterialSwitch;
import top.suzhelan.qstory.p015ui.views.CustomRecycleView;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;
import top.suzhelan.qstory.p015ui.views.FollowRecycleViewLinearLayout;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.net.StickerUrlResolver;
import top.suzhelan.sticker.sdk.presenter.C6815;
import top.suzhelan.sticker.sdk.widget.CustomChipGroup;
import top.suzhelan.sticker.sdk.widget.FollowLinearLayout;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9536 extends AbstractC4581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24881 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9536(C9727 c9727) {
        super(C0328R.layout.dialog_troop_select);
        this.f24880 = c9727;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4581
    public final void onBind(Object obj, View view) throws IOException {
        String str;
        String string;
        int i = this.f24881;
        int i2 = 3;
        final int i3 = 2;
        AttributeSet attributeSet = null;
        final int i4 = 1;
        Object obj2 = this.f24880;
        final int i5 = 0;
        switch (i) {
            case 0:
                C9069 c9069 = (C9069) obj;
                "dialog";
                c9069.getClass();
                "v";
                view.getClass();
                C9555 c9555 = (C9555) obj2;
                FollowRecycleViewLinearLayout followRecycleViewLinearLayout = (FollowRecycleViewLinearLayout) view;
                C9566 c9566 = c9555.f24938;
                View viewFindViewById = followRecycleViewLinearLayout.findViewById(C0328R.id.rv_sticker_image);
                "findViewById(...)";
                viewFindViewById.getClass();
                DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) viewFindViewById;
                c9555.f24937 = dialogXRecycleView;
                followRecycleViewLinearLayout.setFollowRecycleView(dialogXRecycleView);
                followRecycleViewLinearLayout.getContext();
                dialogXRecycleView.setLayoutManager(new GridLayoutManager());
                dialogXRecycleView.m5291(new C9565(AbstractC7082.m12313(followRecycleViewLinearLayout.getContext(), 8.0f), 0));
                C9568 c9568 = c9555.f24939;
                dialogXRecycleView.setAdapter(c9568);
                c9568.f22386 = new C1520(c9555, 5, c9069);
                c9568.f22385 = new C8376(20);
                View viewFindViewById2 = followRecycleViewLinearLayout.findViewById(C0328R.id.rv_sticker_dir);
                "findViewById(...)";
                viewFindViewById2.getClass();
                CustomRecycleView customRecycleView = (CustomRecycleView) viewFindViewById2;
                c9555.f24936 = customRecycleView;
                customRecycleView.setOnTouchTouchCallback(new C8878(followRecycleViewLinearLayout, 14));
                followRecycleViewLinearLayout.getContext();
                customRecycleView.setLayoutManager(new LinearLayoutManager(0));
                AbstractC3369 itemAnimator = customRecycleView.getItemAnimator();
                C3338 c3338 = itemAnimator instanceof C3338 ? (C3338) itemAnimator : null;
                if (c3338 != null) {
                    c3338.f7851 = false;
                }
                C9517.f24851.getClass();
                c9566.m14995(C9517.m14975());
                c9566.f22385 = new C9540(c9555);
                c9566.f22386 = new C9540(c9555);
                customRecycleView.setAdapter(c9566);
                DialogXRecycleView dialogXRecycleView2 = c9555.f24937;
                if (dialogXRecycleView2 != null) {
                    dialogXRecycleView2.post(new RunnableC9541(c9555, i3));
                }
                CustomRecycleView customRecycleView2 = c9555.f24936;
                if (customRecycleView2 != null) {
                    customRecycleView2.post(new RunnableC9541(c9555, i2));
                    return;
                }
                return;
            case 1:
                final C9069 c90692 = (C9069) obj;
                "dialog";
                c90692.getClass();
                "v";
                view.getClass();
                View viewFindViewById3 = view.findViewById(C0328R.id.tv_confirm);
                "findViewById(...)";
                viewFindViewById3.getClass();
                TextView textView = (TextView) viewFindViewById3;
                C9525.f24862.getClass();
                C9517 c9517 = C9517.f24851;
                String strM14531 = "dirSortMode";
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode = StickerPanelSettingsConfig$SortMode.NAME_ASC;
                String key = stickerPanelSettingsConfig$SortMode.getKey();
                c9517.getClass();
                String strM14972 = C9517.m14972(strM14531, key);
                StickerPanelSettingsConfig$SortMode.Companion.getClass();
                final StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortModeM14976 = C9524.m14976(strM14972);
                final StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortModeM14978 = C9525.m14978();
                C9543 c9543 = new C9543((LinearLayout) AbstractC7012.m12129(view, C0328R.id.cb_dir_name_asc, 1280), (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_dir_name_asc_box, 1280), stickerPanelSettingsConfig$SortMode);
                LinearLayout linearLayout = (LinearLayout) AbstractC7012.m12129(view, C0328R.id.cb_dir_name_desc, 1280);
                CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_dir_name_desc_box, 1280);
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode2 = StickerPanelSettingsConfig$SortMode.NAME_DESC;
                C9543 c95432 = new C9543(linearLayout, customMaterialCheckBox, stickerPanelSettingsConfig$SortMode2);
                LinearLayout linearLayout2 = (LinearLayout) AbstractC7012.m12129(view, C0328R.id.cb_dir_time_asc, 1280);
                CustomMaterialCheckBox customMaterialCheckBox2 = (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_dir_time_asc_box, 1280);
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode3 = StickerPanelSettingsConfig$SortMode.TIME_ASC;
                C9543 c95433 = new C9543(linearLayout2, customMaterialCheckBox2, stickerPanelSettingsConfig$SortMode3);
                LinearLayout linearLayout3 = (LinearLayout) AbstractC7012.m12129(view, C0328R.id.cb_dir_time_desc, 1280);
                CustomMaterialCheckBox customMaterialCheckBox3 = (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_dir_time_desc_box, 1280);
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode4 = StickerPanelSettingsConfig$SortMode.TIME_DESC;
                final List listM12490 = AbstractC7176.m12490(c9543, c95432, c95433, new C9543(linearLayout3, customMaterialCheckBox3, stickerPanelSettingsConfig$SortMode4));
                final List listM124902 = AbstractC7176.m12490(new C9543((LinearLayout) AbstractC7012.m12129(view, C0328R.id.cb_file_recent_usage, 1280), (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_file_recent_usage_box, 1280), StickerPanelSettingsConfig$SortMode.RECENT_USAGE), new C9543((LinearLayout) AbstractC7012.m12129(view, C0328R.id.cb_file_name_asc, 1280), (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_file_name_asc_box, 1280), stickerPanelSettingsConfig$SortMode), new C9543((LinearLayout) AbstractC7012.m12129(view, C0328R.id.cb_file_name_desc, 1280), (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_file_name_desc_box, 1280), stickerPanelSettingsConfig$SortMode2), new C9543((LinearLayout) AbstractC7012.m12129(view, C0328R.id.cb_file_time_asc, 1280), (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_file_time_asc_box, 1280), stickerPanelSettingsConfig$SortMode3), new C9543((LinearLayout) AbstractC7012.m12129(view, C0328R.id.cb_file_time_desc, 1280), (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_file_time_desc_box, 1280), stickerPanelSettingsConfig$SortMode4));
                C9547.m14986(listM12490, stickerPanelSettingsConfig$SortModeM14976);
                C9547.m14986(listM124902, stickerPanelSettingsConfig$SortModeM14978);
                final CustomMaterialSwitch customMaterialSwitch = (CustomMaterialSwitch) AbstractC7012.m12129(view, C0328R.id.switch_keep_open, 1280);
                LinearLayout linearLayout4 = (LinearLayout) AbstractC7012.m12129(view, C0328R.id.ll_keep_open, 1280);
                customMaterialSwitch.setCheckedImmediate(C9525.m14977());
                linearLayout4.setOnClickListener(new ViewOnClickListenerC9542(customMaterialSwitch, 0));
                View viewFindViewById4 = view.findViewById(C0328R.id.btn_organize_stickers);
                "findViewById(...)";
                viewFindViewById4.getClass();
                ((Button) viewFindViewById4).setOnClickListener(new ViewOnClickListenerC4015(c90692, 24));
                final C9539 c9539 = (C9539) obj2;
                textView.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰苏世哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object obj3;
                        Object next;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode5;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode6;
                        boolean z;
                        Iterator it = listM12490.iterator();
                        while (true) {
                            obj3 = null;
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (((C9543) next).f24893.isChecked) {
                                    break;
                                }
                            }
                        }
                        C9543 c95434 = (C9543) next;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode7 = stickerPanelSettingsConfig$SortModeM14976;
                        if (c95434 == null || (stickerPanelSettingsConfig$SortMode5 = c95434.f24892) == null) {
                            stickerPanelSettingsConfig$SortMode5 = stickerPanelSettingsConfig$SortMode7;
                        }
                        Iterator it2 = listM124902.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            if (((C9543) next2).f24893.isChecked) {
                                obj3 = next2;
                                break;
                            }
                        }
                        C9543 c95435 = (C9543) obj3;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode8 = stickerPanelSettingsConfig$SortModeM14978;
                        if (c95435 == null || (stickerPanelSettingsConfig$SortMode6 = c95435.f24892) == null) {
                            stickerPanelSettingsConfig$SortMode6 = stickerPanelSettingsConfig$SortMode8;
                        }
                        boolean z2 = customMaterialSwitch.isChecked;
                        boolean z3 = true;
                        if (stickerPanelSettingsConfig$SortMode5 != stickerPanelSettingsConfig$SortMode7) {
                            C9525.f24862.getClass();
                            "mode";
                            stickerPanelSettingsConfig$SortMode5.getClass();
                            C9517 c95172 = C9517.f24851;
                            String strM145312 = "dirSortMode";
                            String key2 = stickerPanelSettingsConfig$SortMode5.getKey();
                            c95172.getClass();
                            C9517.m14974(strM145312, key2);
                            z = true;
                        } else {
                            z = false;
                        }
                        if (stickerPanelSettingsConfig$SortMode6 != stickerPanelSettingsConfig$SortMode8) {
                            C9525.f24862.getClass();
                            "mode";
                            stickerPanelSettingsConfig$SortMode6.getClass();
                            C9517 c95173 = C9517.f24851;
                            String strM145313 = "fileSortMode";
                            String key3 = stickerPanelSettingsConfig$SortMode6.getKey();
                            c95173.getClass();
                            C9517.m14974(strM145313, key3);
                            z = true;
                        }
                        C9525.f24862.getClass();
                        if (z2 != C9525.m14977()) {
                            C9517 c95174 = C9517.f24851;
                            String strM145314 = "keepOpenAfterSend";
                            String strValueOf = String.valueOf(z2);
                            c95174.getClass();
                            C9517.m14974(strM145314, strValueOf);
                        } else {
                            z3 = z;
                        }
                        c90692.m14323();
                        if (z3) {
                            c9539.invoke();
                        }
                    }
                });
                return;
            case 2:
                ((C9069) obj).getClass();
                view.getClass();
                C3837 c3837 = (C3837) obj2;
                FollowLinearLayout followLinearLayout = (FollowLinearLayout) view;
                c3837.f9879 = followLinearLayout;
                View viewFindViewById5 = followLinearLayout.findViewById(C0328R.id.cg_tags);
                viewFindViewById5.getClass();
                c3837.f9878 = (CustomChipGroup) viewFindViewById5;
                FollowLinearLayout followLinearLayout2 = (FollowLinearLayout) c3837.f9879;
                if (followLinearLayout2 == null) {
                    AbstractC5227.m9467("rootView");
                    throw null;
                }
                View viewFindViewById6 = followLinearLayout2.findViewById(C0328R.id.pb_loading);
                viewFindViewById6.getClass();
                c3837.f9881 = (ProgressBar) viewFindViewById6;
                FollowLinearLayout followLinearLayout3 = (FollowLinearLayout) c3837.f9879;
                if (followLinearLayout3 == null) {
                    AbstractC5227.m9467("rootView");
                    throw null;
                }
                FrameLayout frameLayout = (FrameLayout) followLinearLayout3.findViewById(C0328R.id.box);
                C3382 c3382 = new C3382((Activity) c3837.f9884);
                c3837.f9880 = c3382;
                frameLayout.addView(c3382, new ViewGroup.LayoutParams(-1, -1));
                C3382 c33822 = (C3382) c3837.f9880;
                if (c33822 == null) {
                    AbstractC5227.m9467("viewPager");
                    throw null;
                }
                ((ArrayList) c33822.f8035.f8010).add(new C3376(c3837, i4));
                ((C6815) c3837.f9883).m11921();
                ProgressBar progressBar = (ProgressBar) c3837.f9881;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                } else {
                    AbstractC5227.m9467("isLoading");
                    throw null;
                }
            case 3:
                C9069 c90693 = (C9069) obj;
                c90693.getClass();
                view.getClass();
                C8657 c8657 = (C8657) obj2;
                C8637 c8637 = new C8637((Context) c8657.f21713, C0328R.style.AppTheme);
                ImageView imageView = (ImageView) view.findViewById(C0328R.id.iv_detail_cover);
                ProgressBar progressBar2 = (ProgressBar) view.findViewById(C0328R.id.pb_detail_cover_loading);
                OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) c8657.f21711;
                String strResolveAssetUrl = StickerUrlResolver.resolveAssetUrl(onlineStickerInfo.getCoverUrl());
                imageView.getClass();
                progressBar2.getClass();
                C8657.m13749(imageView, progressBar2, strResolveAssetUrl);
                ((TextView) view.findViewById(C0328R.id.tv_detail_title)).setText(onlineStickerInfo.getTitle());
                TextView textView2 = (TextView) view.findViewById(C0328R.id.tv_detail_author);
                ListBuilder listBuilderM12470 = AbstractC7176.m12470();
                String author = onlineStickerInfo.getAuthor();
                if (author != null && (string = AbstractC5976.m10714(author).toString()) != null) {
                    if (string.length() <= 0) {
                        string = null;
                    }
                    if (string != null) {
                        listBuilderM12470.add("作者: ".concat(string));
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
                if (string2 != null) {
                    listBuilderM12470.add("上传者: ".concat(string2));
                }
                String strM9369 = AbstractC5176.m9369(listBuilderM12470.build(), "\n", null, null, null, 62);
                int i6 = 8;
                if (strM9369.length() == 0) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(strM9369);
                    textView2.setVisibility(0);
                }
                TextView textView3 = (TextView) view.findViewById(C0328R.id.tv_detail_description);
                String description = onlineStickerInfo.getDescription();
                if (description != null && !AbstractC5976.m10731(description)) {
                    textView3.setText(onlineStickerInfo.getDescription());
                    textView3.setVisibility(0);
                }
                CustomChipGroup customChipGroup = (CustomChipGroup) view.findViewById(C0328R.id.cg_detail_tags);
                customChipGroup.removeAllViews();
                for (String str2 : onlineStickerInfo.getTags()) {
                    Chip chip = new Chip(c8637, attributeSet);
                    chip.setText(str2);
                    chip.setClickable(false);
                    chip.setTextAppearance(C0328R.style.TextAppearance_Material3_LabelSmall);
                    customChipGroup.addView(chip);
                    attributeSet = null;
                }
                ((TextView) view.findViewById(C0328R.id.tv_detail_sticker_count)).setText(onlineStickerInfo.getStickerCount() + "张表情");
                ((TextView) view.findViewById(C0328R.id.tv_detail_size)).setText(AbstractC3897.m7395(onlineStickerInfo.getArchiveFileSize()));
                ((TextView) view.findViewById(C0328R.id.tv_detail_downloads)).setText("下载" + onlineStickerInfo.getDownloadCount() + "次");
                TextView textView4 = (TextView) view.findViewById(C0328R.id.tv_detail_date);
                String createdAt = onlineStickerInfo.getCreatedAt();
                createdAt.getClass();
                Instant instant = Instant.parse(createdAt);
                long jBetween = ChronoUnit.SECONDS.between(instant, Instant.now());
                if (jBetween < 60) {
                    str = jBetween + "秒前";
                } else if (jBetween < 3600) {
                    str = (jBetween / 60) + "分钟前";
                } else if (jBetween < 86400) {
                    str = (jBetween / 3600) + "小时前";
                } else {
                    LocalDate localDateNow = LocalDate.now();
                    LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
                    long jBetween2 = ChronoUnit.DAYS.between(localDate, localDateNow);
                    if (jBetween2 == 1) {
                        str = "昨天";
                    } else if (jBetween2 == 2) {
                        str = "前天";
                    } else {
                        str = localDate.getYear() + "-" + localDate.getMonthValue() + "-" + localDate.getDayOfMonth();
                    }
                }
                textView4.setText(str);
                LinearLayout linearLayout5 = (LinearLayout) view.findViewById(C0328R.id.ll_thumbnails);
                linearLayout5.removeAllViews();
                Iterator<T> it = onlineStickerInfo.getThumbnails().iterator();
                while (it.hasNext()) {
                    String strResolveAssetUrl2 = StickerUrlResolver.resolveAssetUrl((String) it.next());
                    FrameLayout frameLayout2 = new FrameLayout(linearLayout5.getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) frameLayout2.getResources().getDimension(C0328R.dimen.sticker_thumbnail_size), (int) frameLayout2.getResources().getDimension(C0328R.dimen.sticker_thumbnail_size));
                    layoutParams.setMarginEnd((int) frameLayout2.getResources().getDimension(C0328R.dimen.sticker_thumbnail_spacing));
                    frameLayout2.setLayoutParams(layoutParams);
                    ImageView imageView2 = new ImageView(linearLayout5.getContext());
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    ProgressBar progressBar3 = new ProgressBar(linearLayout5.getContext());
                    progressBar3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                    progressBar3.setIndeterminate(true);
                    frameLayout2.addView(imageView2);
                    frameLayout2.addView(progressBar3);
                    C8657.m13749(imageView2, progressBar3, strResolveAssetUrl2);
                    linearLayout5.addView(frameLayout2);
                }
                ((TextView) view.findViewById(C0328R.id.btn_download)).setOnClickListener(new ViewOnClickListenerC6375(c8657, new Regex("[\\\\/:*?\"<>|]").replace(onlineStickerInfo.getTitle(), JavaConstant.Dynamic.DEFAULT_NAME), c90693, i6));
                return;
            case 4:
                "v";
                view.getClass();
                final C9727 c9727 = (C9727) obj2;
                view.getContext();
                RecyclerView recyclerView = (RecyclerView) view.findViewById(C0328R.id.rv_troop_list);
                Button button = (Button) view.findViewById(C0328R.id.btn_select_all);
                Button button2 = (Button) view.findViewById(C0328R.id.btn_select_all_none);
                Button button3 = (Button) view.findViewById(C0328R.id.btn_select_all_invert);
                button.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏世兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i7 = i5;
                        C9727 c97272 = c9727;
                        switch (i7) {
                            case 0:
                                c97272.f25427.m15044(true);
                                break;
                            case 1:
                                c97272.f25427.m15044(false);
                                break;
                            default:
                                C9646 c9646 = c97272.f25427;
                                for (GroupInfo groupInfo : c9646.f22387) {
                                    ((LinkedHashMap) c9646.f25165).put(groupInfo.GroupUin, Boolean.valueOf(!AbstractC5227.m9466(r2.get(r1), Boolean.TRUE)));
                                }
                                c9646.m5351();
                                break;
                        }
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏世兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i7 = i4;
                        C9727 c97272 = c9727;
                        switch (i7) {
                            case 0:
                                c97272.f25427.m15044(true);
                                break;
                            case 1:
                                c97272.f25427.m15044(false);
                                break;
                            default:
                                C9646 c9646 = c97272.f25427;
                                for (GroupInfo groupInfo : c9646.f22387) {
                                    ((LinkedHashMap) c9646.f25165).put(groupInfo.GroupUin, Boolean.valueOf(!AbstractC5227.m9466(r2.get(r1), Boolean.TRUE)));
                                }
                                c9646.m5351();
                                break;
                        }
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏世兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i7 = i3;
                        C9727 c97272 = c9727;
                        switch (i7) {
                            case 0:
                                c97272.f25427.m15044(true);
                                break;
                            case 1:
                                c97272.f25427.m15044(false);
                                break;
                            default:
                                C9646 c9646 = c97272.f25427;
                                for (GroupInfo groupInfo : c9646.f22387) {
                                    ((LinkedHashMap) c9646.f25165).put(groupInfo.GroupUin, Boolean.valueOf(!AbstractC5227.m9466(r2.get(r1), Boolean.TRUE)));
                                }
                                c9646.m5351();
                                break;
                        }
                    }
                });
                ArrayList arrayListM12606 = AbstractC7390.m12606();
                C9646 c9646 = c9727.f25427;
                AbstractC8798.m14017(c9646, arrayListM12606);
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAdapter(c9646);
                return;
            case 5:
                ((C9069) obj).getClass();
                view.getClass();
                C2086 c2086 = (C2086) obj2;
                c2086.f3972 = (top.suzhelan.plugin.sdk.online.widget.FollowLinearLayout) view;
                C9069 c90694 = (C9069) c2086.f3973;
                AbstractC4581 abstractC4581 = c90694.f23109;
                View viewFindViewById7 = (abstractC4581 == null ? null : abstractC4581.getCustomView()).findViewById(C0328R.id.rv_comment_list);
                viewFindViewById7.getClass();
                c2086.f3979 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) viewFindViewById7;
                AbstractC4581 abstractC45812 = c90694.f23109;
                View viewFindViewById8 = (abstractC45812 == null ? null : abstractC45812.getCustomView()).findViewById(C0328R.id.pb_loading);
                viewFindViewById8.getClass();
                c2086.f3978 = (ProgressBar) viewFindViewById8;
                top.suzhelan.plugin.sdk.online.widget.FollowLinearLayout followLinearLayout4 = (top.suzhelan.plugin.sdk.online.widget.FollowLinearLayout) c2086.f3972;
                if (followLinearLayout4 == null) {
                    AbstractC5227.m9467("rootView");
                    throw null;
                }
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView3 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) c2086.f3979;
                if (customRecycleView3 == null) {
                    AbstractC5227.m9467("rvCommentList");
                    throw null;
                }
                followLinearLayout4.setFollowRecycleView(customRecycleView3);
                AbstractC4581 abstractC45813 = c90694.f23109;
                View viewFindViewById9 = (abstractC45813 == null ? null : abstractC45813.getCustomView()).findViewById(C0328R.id.et_comment_content);
                viewFindViewById9.getClass();
                c2086.f3981 = (EditText) viewFindViewById9;
                AbstractC4581 abstractC45814 = c90694.f23109;
                View viewFindViewById10 = (abstractC45814 == null ? null : abstractC45814.getCustomView()).findViewById(C0328R.id.btn_send_comment);
                viewFindViewById10.getClass();
                c2086.f3982 = (Button) viewFindViewById10;
                AbstractC4581 abstractC45815 = c90694.f23109;
                View viewFindViewById11 = (abstractC45815 == null ? null : abstractC45815.getCustomView()).findViewById(C0328R.id.tv_comment_title);
                viewFindViewById11.getClass();
                c2086.f3980 = (TextView) viewFindViewById11;
                ((C6637) c2086.f3974).m11781((String) c2086.f3975, new C5039(14));
                return;
            case 6:
                ((C9069) obj).getClass();
                view.getClass();
                final C9904 c9904 = (C9904) obj2;
                c9904.f25774 = view;
                View viewFindViewById12 = view.findViewById(C0328R.id.rv_message_list);
                viewFindViewById12.getClass();
                c9904.f25773 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) viewFindViewById12;
                View view2 = c9904.f25774;
                if (view2 == null) {
                    AbstractC5227.m9467("rootView");
                    throw null;
                }
                View viewFindViewById13 = view2.findViewById(C0328R.id.pb_loading);
                viewFindViewById13.getClass();
                c9904.f25772 = (ProgressBar) viewFindViewById13;
                View view3 = c9904.f25774;
                if (view3 == null) {
                    AbstractC5227.m9467("rootView");
                    throw null;
                }
                View viewFindViewById14 = view3.findViewById(C0328R.id.tv_message_title);
                viewFindViewById14.getClass();
                c9904.f25785 = (TextView) viewFindViewById14;
                View view4 = c9904.f25774;
                if (view4 == null) {
                    AbstractC5227.m9467("rootView");
                    throw null;
                }
                View viewFindViewById15 = view4.findViewById(C0328R.id.btn_mark_all_read);
                viewFindViewById15.getClass();
                c9904.f25784 = (TextView) viewFindViewById15;
                View view5 = c9904.f25774;
                if (view5 == null) {
                    AbstractC5227.m9467("rootView");
                    throw null;
                }
                View viewFindViewById16 = view5.findViewById(C0328R.id.btn_back);
                viewFindViewById16.getClass();
                ((TextView) viewFindViewById16).setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世哲苏兰
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        int i7 = i5;
                        C9904 c99042 = c9904;
                        switch (i7) {
                            case 0:
                                c99042.f25776.m14323();
                                break;
                            default:
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = c99042.f25783;
                                long j2 = 5 - ((jCurrentTimeMillis - j) / 1000);
                                if (j <= 0 || j2 <= 0) {
                                    c99042.f25783 = System.currentTimeMillis();
                                    c99042.f25775.m11779(new C8171(c99042, 8));
                                }
                                break;
                        }
                    }
                });
                TextView textView5 = c9904.f25784;
                if (textView5 == null) {
                    AbstractC5227.m9467("btnMarkAllRead");
                    throw null;
                }
                textView5.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世哲苏兰
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        int i7 = i4;
                        C9904 c99042 = c9904;
                        switch (i7) {
                            case 0:
                                c99042.f25776.m14323();
                                break;
                            default:
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = c99042.f25783;
                                long j2 = 5 - ((jCurrentTimeMillis - j) / 1000);
                                if (j <= 0 || j2 <= 0) {
                                    c99042.f25783 = System.currentTimeMillis();
                                    c99042.f25775.m11779(new C8171(c99042, 8));
                                }
                                break;
                        }
                    }
                });
                C9648 c9648 = new C9648(new C9906(c9904, i3), new C9906(c9904, i2));
                c9904.f25788 = c9648;
                C3327 c3327 = C3327.f7811;
                c3327.getClass();
                C8878 c8878 = new C8878(c9904, 17);
                C8788 c8788 = new C8788();
                c8788.f22373 = c8878;
                c9904.f25789 = new C5703(c9648, c8788, c3327);
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView4 = c9904.f25773;
                if (customRecycleView4 == null) {
                    AbstractC5227.m9467("rvMessageList");
                    throw null;
                }
                customRecycleView4.setLayoutManager(new LinearLayoutManager(1));
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView5 = c9904.f25773;
                if (customRecycleView5 == null) {
                    AbstractC5227.m9467("rvMessageList");
                    throw null;
                }
                C5703 c5703 = c9904.f25789;
                if (c5703 == null) {
                    AbstractC5227.m9467("helper");
                    throw null;
                }
                customRecycleView5.setAdapter((C3326) c5703.f14510);
                ProgressBar progressBar4 = c9904.f25772;
                if (progressBar4 == null) {
                    AbstractC5227.m9467("isLoading");
                    throw null;
                }
                progressBar4.setVisibility(0);
                c9904.f25786 = 1;
                c9904.f25775.m11780(1, c9904.f25779, new C9906(c9904, i5), new C9906(c9904, i4));
                return;
            default:
                ((C9056) obj).getClass();
                view.getClass();
                C3837 c38372 = (C3837) obj2;
                c38372.f9879 = view;
                View viewFindViewById17 = view.findViewById(C0328R.id.cg_tags);
                viewFindViewById17.getClass();
                c38372.f9878 = (top.suzhelan.plugin.sdk.online.widget.CustomChipGroup) viewFindViewById17;
                View view6 = (View) c38372.f9879;
                if (view6 == null) {
                    AbstractC5227.m9467("rootView");
                    throw null;
                }
                View viewFindViewById18 = view6.findViewById(C0328R.id.pb_loading);
                viewFindViewById18.getClass();
                c38372.f9881 = (ProgressBar) viewFindViewById18;
                View view7 = (View) c38372.f9879;
                if (view7 == null) {
                    AbstractC5227.m9467("rootView");
                    throw null;
                }
                ((TextView) view7.findViewById(C0328R.id.btn_back)).setOnClickListener(new ViewOnClickListenerC9907(c38372, i4));
                View view8 = (View) c38372.f9879;
                if (view8 == null) {
                    AbstractC5227.m9467("rootView");
                    throw null;
                }
                FrameLayout frameLayout3 = (FrameLayout) view8.findViewById(C0328R.id.box);
                C3382 c33823 = new C3382((Activity) c38372.f9884);
                c38372.f9880 = c33823;
                frameLayout3.addView(c33823, new ViewGroup.LayoutParams(-1, -1));
                C3382 c33824 = (C3382) c38372.f9880;
                if (c33824 == null) {
                    AbstractC5227.m9467("viewPager");
                    throw null;
                }
                ((ArrayList) c33824.f8035.f8010).add(new C3376(c38372, i3));
                ((C6635) c38372.f9883).m11775();
                ProgressBar progressBar5 = (ProgressBar) c38372.f9881;
                if (progressBar5 != null) {
                    progressBar5.setVisibility(0);
                    return;
                } else {
                    AbstractC5227.m9467("isLoading");
                    throw null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9536(C8657 c8657) {
        super(C0328R.layout.dialog_sticker_detail);
        this.f24880 = c8657;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9536(View view, C9539 c9539) {
        super(view);
        this.f24880 = c9539;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9536(C3837 c3837, byte b) {
        super(C0328R.layout.dialog_plugin_pager);
        this.f24880 = c3837;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9536(C2086 c2086) {
        super(C0328R.layout.dialog_comments);
        this.f24880 = c2086;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9536(C3837 c3837) {
        super(C0328R.layout.dialog_online_sticker);
        this.f24880 = c3837;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9536(C9555 c9555) {
        super(C0328R.layout.layout_sticker_panel_dialog);
        this.f24880 = c9555;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9536(C9904 c9904) {
        super(C0328R.layout.dialog_messages);
        this.f24880 = c9904;
    }
}
