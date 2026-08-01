package p323;

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
import androidx.compose.foundation.lazy.layout.C0679;
import androidx.compose.runtime.internal.C1251;
import androidx.recyclerview.widget.AbstractC2536;
import androidx.recyclerview.widget.C2493;
import androidx.recyclerview.widget.C2494;
import androidx.recyclerview.widget.C2505;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C2543;
import androidx.viewpager2.widget.C2549;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.load.engine.C3005;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import io.ktor.util.C4207;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import kotlin.text.AbstractC5144;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5544;
import net.bytebuddy.utility.JavaConstant;
import p009.AbstractC6183;
import p018.AbstractC6253;
import p034.AbstractC6347;
import p053.AbstractC6561;
import p116.C7342;
import p144.C7547;
import p192.C7808;
import p193.C7828;
import p216.C7959;
import p217.AbstractC7969;
import p230.C8049;
import p257.C8227;
import p257.C8240;
import p287.AbstractC8405;
import p321.C8688;
import p321.C8695;
import p321.C8696;
import p324.C8736;
import p324.C8737;
import p324.C8739;
import p342.C8817;
import p343.C8819;
import p355.C8898;
import p386.C9075;
import p386.C9077;
import p386.ViewOnClickListenerC9078;
import top.suzhelan.plugin.sdk.online.presenter.C5805;
import top.suzhelan.plugin.sdk.online.presenter.C5807;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;
import top.suzhelan.qstory.ui.views.CustomMaterialCheckBox;
import top.suzhelan.qstory.ui.views.CustomMaterialSwitch;
import top.suzhelan.qstory.ui.views.CustomRecycleView;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;
import top.suzhelan.qstory.ui.views.FollowRecycleViewLinearLayout;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.net.StickerUrlResolver;
import top.suzhelan.sticker.sdk.presenter.C5985;
import top.suzhelan.sticker.sdk.widget.CustomChipGroup;
import top.suzhelan.sticker.sdk.widget.FollowLinearLayout;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8707 extends AbstractC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24536 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8707(C8898 c8898) {
        super(R.layout.dialog_troop_select);
        this.f24535 = c8898;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3749
    public final void onBind(Object obj, View view) throws IOException {
        String str;
        String string;
        int i = this.f24536;
        int i2 = 3;
        final int i3 = 2;
        AttributeSet attributeSet = null;
        final int i4 = 1;
        Object obj2 = this.f24535;
        final int i5 = 0;
        switch (i) {
            case 0:
                C8240 c8240 = (C8240) obj;
                AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                c8240.getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜喵呜");
                view.getClass();
                C8726 c8726 = (C8726) obj2;
                FollowRecycleViewLinearLayout followRecycleViewLinearLayout = (FollowRecycleViewLinearLayout) view;
                C8737 c8737 = c8726.f24593;
                View viewFindViewById = followRecycleViewLinearLayout.findViewById(R.id.rv_sticker_image);
                AbstractC8405.m13972(1280);
                viewFindViewById.getClass();
                DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) viewFindViewById;
                c8726.f24592 = dialogXRecycleView;
                followRecycleViewLinearLayout.setFollowRecycleView(dialogXRecycleView);
                followRecycleViewLinearLayout.getContext();
                dialogXRecycleView.setLayoutManager(new GridLayoutManager());
                dialogXRecycleView.m4731(new C8736(AbstractC6253.m11754(followRecycleViewLinearLayout.getContext(), 8.0f), 0));
                C8739 c8739 = c8726.f24594;
                dialogXRecycleView.setAdapter(c8739);
                c8739.f22041 = new C0679(c8726, 5, c8240);
                c8739.f22040 = new C7547(20);
                View viewFindViewById2 = followRecycleViewLinearLayout.findViewById(R.id.rv_sticker_dir);
                AbstractC8405.m13972(1280);
                viewFindViewById2.getClass();
                CustomRecycleView customRecycleView = (CustomRecycleView) viewFindViewById2;
                c8726.f24591 = customRecycleView;
                customRecycleView.setOnTouchTouchCallback(new C8049(followRecycleViewLinearLayout, 14));
                followRecycleViewLinearLayout.getContext();
                customRecycleView.setLayoutManager(new LinearLayoutManager(0));
                AbstractC2536 itemAnimator = customRecycleView.getItemAnimator();
                C2505 c2505 = itemAnimator instanceof C2505 ? (C2505) itemAnimator : null;
                if (c2505 != null) {
                    c2505.f7506 = false;
                }
                C8688.f24506.getClass();
                c8737.m14436(C8688.m14416());
                c8737.f22040 = new C8711(c8726);
                c8737.f22041 = new C8711(c8726);
                customRecycleView.setAdapter(c8737);
                DialogXRecycleView dialogXRecycleView2 = c8726.f24592;
                if (dialogXRecycleView2 != null) {
                    dialogXRecycleView2.post(new RunnableC8712(c8726, i3));
                }
                CustomRecycleView customRecycleView2 = c8726.f24591;
                if (customRecycleView2 != null) {
                    customRecycleView2.post(new RunnableC8712(c8726, i2));
                    return;
                }
                return;
            case 1:
                final C8240 c82402 = (C8240) obj;
                AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                c82402.getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜喵呜");
                view.getClass();
                View viewFindViewById3 = view.findViewById(R.id.tv_confirm);
                AbstractC8405.m13972(1280);
                viewFindViewById3.getClass();
                TextView textView = (TextView) viewFindViewById3;
                C8696.f24517.getClass();
                C8688 c8688 = C8688.f24506;
                String strM13972 = AbstractC8405.m13972(2703);
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode = StickerPanelSettingsConfig$SortMode.NAME_ASC;
                String key = stickerPanelSettingsConfig$SortMode.getKey();
                c8688.getClass();
                String strM14413 = C8688.m14413(strM13972, key);
                StickerPanelSettingsConfig$SortMode.Companion.getClass();
                final StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortModeM14417 = C8695.m14417(strM14413);
                final StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortModeM14419 = C8696.m14419();
                C8714 c8714 = new C8714((LinearLayout) AbstractC6183.m11570(view, R.id.cb_dir_name_asc, 1280), (CustomMaterialCheckBox) AbstractC6183.m11570(view, R.id.cb_dir_name_asc_box, 1280), stickerPanelSettingsConfig$SortMode);
                LinearLayout linearLayout = (LinearLayout) AbstractC6183.m11570(view, R.id.cb_dir_name_desc, 1280);
                CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) AbstractC6183.m11570(view, R.id.cb_dir_name_desc_box, 1280);
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode2 = StickerPanelSettingsConfig$SortMode.NAME_DESC;
                C8714 c87142 = new C8714(linearLayout, customMaterialCheckBox, stickerPanelSettingsConfig$SortMode2);
                LinearLayout linearLayout2 = (LinearLayout) AbstractC6183.m11570(view, R.id.cb_dir_time_asc, 1280);
                CustomMaterialCheckBox customMaterialCheckBox2 = (CustomMaterialCheckBox) AbstractC6183.m11570(view, R.id.cb_dir_time_asc_box, 1280);
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode3 = StickerPanelSettingsConfig$SortMode.TIME_ASC;
                C8714 c87143 = new C8714(linearLayout2, customMaterialCheckBox2, stickerPanelSettingsConfig$SortMode3);
                LinearLayout linearLayout3 = (LinearLayout) AbstractC6183.m11570(view, R.id.cb_dir_time_desc, 1280);
                CustomMaterialCheckBox customMaterialCheckBox3 = (CustomMaterialCheckBox) AbstractC6183.m11570(view, R.id.cb_dir_time_desc_box, 1280);
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode4 = StickerPanelSettingsConfig$SortMode.TIME_DESC;
                final List listM11931 = AbstractC6347.m11931(c8714, c87142, c87143, new C8714(linearLayout3, customMaterialCheckBox3, stickerPanelSettingsConfig$SortMode4));
                final List listM119312 = AbstractC6347.m11931(new C8714((LinearLayout) AbstractC6183.m11570(view, R.id.cb_file_recent_usage, 1280), (CustomMaterialCheckBox) AbstractC6183.m11570(view, R.id.cb_file_recent_usage_box, 1280), StickerPanelSettingsConfig$SortMode.RECENT_USAGE), new C8714((LinearLayout) AbstractC6183.m11570(view, R.id.cb_file_name_asc, 1280), (CustomMaterialCheckBox) AbstractC6183.m11570(view, R.id.cb_file_name_asc_box, 1280), stickerPanelSettingsConfig$SortMode), new C8714((LinearLayout) AbstractC6183.m11570(view, R.id.cb_file_name_desc, 1280), (CustomMaterialCheckBox) AbstractC6183.m11570(view, R.id.cb_file_name_desc_box, 1280), stickerPanelSettingsConfig$SortMode2), new C8714((LinearLayout) AbstractC6183.m11570(view, R.id.cb_file_time_asc, 1280), (CustomMaterialCheckBox) AbstractC6183.m11570(view, R.id.cb_file_time_asc_box, 1280), stickerPanelSettingsConfig$SortMode3), new C8714((LinearLayout) AbstractC6183.m11570(view, R.id.cb_file_time_desc, 1280), (CustomMaterialCheckBox) AbstractC6183.m11570(view, R.id.cb_file_time_desc_box, 1280), stickerPanelSettingsConfig$SortMode4));
                C8718.m14427(listM11931, stickerPanelSettingsConfig$SortModeM14417);
                C8718.m14427(listM119312, stickerPanelSettingsConfig$SortModeM14419);
                final CustomMaterialSwitch customMaterialSwitch = (CustomMaterialSwitch) AbstractC6183.m11570(view, R.id.switch_keep_open, 1280);
                LinearLayout linearLayout4 = (LinearLayout) AbstractC6183.m11570(view, R.id.ll_keep_open, 1280);
                customMaterialSwitch.setCheckedImmediate(C8696.m14418());
                linearLayout4.setOnClickListener(new ViewOnClickListenerC8713(customMaterialSwitch, 0));
                View viewFindViewById4 = view.findViewById(R.id.btn_organize_stickers);
                AbstractC8405.m13972(1280);
                viewFindViewById4.getClass();
                ((Button) viewFindViewById4).setOnClickListener(new ViewOnClickListenerC3183(c82402, 24));
                final C8710 c8710 = (C8710) obj2;
                textView.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰苏世哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object obj3;
                        Object next;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode5;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode6;
                        boolean z;
                        Iterator it = listM11931.iterator();
                        while (true) {
                            obj3 = null;
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (((C8714) next).f24548.isChecked) {
                                    break;
                                }
                            }
                        }
                        C8714 c87144 = (C8714) next;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode7 = stickerPanelSettingsConfig$SortModeM14417;
                        if (c87144 == null || (stickerPanelSettingsConfig$SortMode5 = c87144.f24547) == null) {
                            stickerPanelSettingsConfig$SortMode5 = stickerPanelSettingsConfig$SortMode7;
                        }
                        Iterator it2 = listM119312.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            if (((C8714) next2).f24548.isChecked) {
                                obj3 = next2;
                                break;
                            }
                        }
                        C8714 c87145 = (C8714) obj3;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode8 = stickerPanelSettingsConfig$SortModeM14419;
                        if (c87145 == null || (stickerPanelSettingsConfig$SortMode6 = c87145.f24547) == null) {
                            stickerPanelSettingsConfig$SortMode6 = stickerPanelSettingsConfig$SortMode8;
                        }
                        boolean z2 = customMaterialSwitch.isChecked;
                        boolean z3 = true;
                        if (stickerPanelSettingsConfig$SortMode5 != stickerPanelSettingsConfig$SortMode7) {
                            C8696.f24517.getClass();
                            AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜");
                            stickerPanelSettingsConfig$SortMode5.getClass();
                            C8688 c86882 = C8688.f24506;
                            String strM139722 = AbstractC8405.m13972(2703);
                            String key2 = stickerPanelSettingsConfig$SortMode5.getKey();
                            c86882.getClass();
                            C8688.m14415(strM139722, key2);
                            z = true;
                        } else {
                            z = false;
                        }
                        if (stickerPanelSettingsConfig$SortMode6 != stickerPanelSettingsConfig$SortMode8) {
                            C8696.f24517.getClass();
                            AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜");
                            stickerPanelSettingsConfig$SortMode6.getClass();
                            C8688 c86883 = C8688.f24506;
                            String strM139723 = AbstractC8405.m13972(2704);
                            String key3 = stickerPanelSettingsConfig$SortMode6.getKey();
                            c86883.getClass();
                            C8688.m14415(strM139723, key3);
                            z = true;
                        }
                        C8696.f24517.getClass();
                        if (z2 != C8696.m14418()) {
                            C8688 c86884 = C8688.f24506;
                            String strM139724 = AbstractC8405.m13972(2705);
                            String strValueOf = String.valueOf(z2);
                            c86884.getClass();
                            C8688.m14415(strM139724, strValueOf);
                        } else {
                            z3 = z;
                        }
                        c82402.m13764();
                        if (z3) {
                            c8710.invoke();
                        }
                    }
                });
                return;
            case 2:
                ((C8240) obj).getClass();
                view.getClass();
                C3005 c3005 = (C3005) obj2;
                FollowLinearLayout followLinearLayout = (FollowLinearLayout) view;
                c3005.f9534 = followLinearLayout;
                View viewFindViewById5 = followLinearLayout.findViewById(R.id.cg_tags);
                viewFindViewById5.getClass();
                c3005.f9533 = (CustomChipGroup) viewFindViewById5;
                FollowLinearLayout followLinearLayout2 = (FollowLinearLayout) c3005.f9534;
                if (followLinearLayout2 == null) {
                    AbstractC4395.m8908("rootView");
                    throw null;
                }
                View viewFindViewById6 = followLinearLayout2.findViewById(R.id.pb_loading);
                viewFindViewById6.getClass();
                c3005.f9536 = (ProgressBar) viewFindViewById6;
                FollowLinearLayout followLinearLayout3 = (FollowLinearLayout) c3005.f9534;
                if (followLinearLayout3 == null) {
                    AbstractC4395.m8908("rootView");
                    throw null;
                }
                FrameLayout frameLayout = (FrameLayout) followLinearLayout3.findViewById(R.id.box);
                C2549 c2549 = new C2549((Activity) c3005.f9539);
                c3005.f9535 = c2549;
                frameLayout.addView(c2549, new ViewGroup.LayoutParams(-1, -1));
                C2549 c25492 = (C2549) c3005.f9535;
                if (c25492 == null) {
                    AbstractC4395.m8908("viewPager");
                    throw null;
                }
                ((ArrayList) c25492.f7690.f7665).add(new C2543(c3005, i4));
                ((C5985) c3005.f9538).m11362();
                ProgressBar progressBar = (ProgressBar) c3005.f9536;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                } else {
                    AbstractC4395.m8908("isLoading");
                    throw null;
                }
            case 3:
                C8240 c82403 = (C8240) obj;
                c82403.getClass();
                view.getClass();
                C7828 c7828 = (C7828) obj2;
                C7808 c7808 = new C7808((Context) c7828.f21368, R.style.AppTheme);
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_detail_cover);
                ProgressBar progressBar2 = (ProgressBar) view.findViewById(R.id.pb_detail_cover_loading);
                OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) c7828.f21366;
                String strResolveAssetUrl = StickerUrlResolver.resolveAssetUrl(onlineStickerInfo.getCoverUrl());
                imageView.getClass();
                progressBar2.getClass();
                C7828.m13190(imageView, progressBar2, strResolveAssetUrl);
                ((TextView) view.findViewById(R.id.tv_detail_title)).setText(onlineStickerInfo.getTitle());
                TextView textView2 = (TextView) view.findViewById(R.id.tv_detail_author);
                ListBuilder listBuilderM11911 = AbstractC6347.m11911();
                String author = onlineStickerInfo.getAuthor();
                if (author != null && (string = AbstractC5144.m10155(author).toString()) != null) {
                    if (string.length() <= 0) {
                        string = null;
                    }
                    if (string != null) {
                        listBuilderM11911.add("作者: ".concat(string));
                    }
                }
                String nickname = onlineStickerInfo.getNickname();
                String uin = onlineStickerInfo.getUin();
                String string2 = nickname != null ? AbstractC5144.m10155(nickname).toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                String string3 = uin != null ? AbstractC5144.m10155(uin).toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                if (string2.length() > 0 && string3.length() > 0) {
                    string2 = string2 + "(" + string3 + ")";
                } else if (string2.length() <= 0) {
                    string2 = string3.length() > 0 ? string3 : null;
                }
                if (string2 != null) {
                    listBuilderM11911.add("上传者: ".concat(string2));
                }
                String strM8810 = AbstractC4344.m8810(listBuilderM11911.build(), "\n", null, null, null, 62);
                int i6 = 8;
                if (strM8810.length() == 0) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(strM8810);
                    textView2.setVisibility(0);
                }
                TextView textView3 = (TextView) view.findViewById(R.id.tv_detail_description);
                String description = onlineStickerInfo.getDescription();
                if (description != null && !AbstractC5144.m10172(description)) {
                    textView3.setText(onlineStickerInfo.getDescription());
                    textView3.setVisibility(0);
                }
                CustomChipGroup customChipGroup = (CustomChipGroup) view.findViewById(R.id.cg_detail_tags);
                customChipGroup.removeAllViews();
                for (String str2 : onlineStickerInfo.getTags()) {
                    Chip chip = new Chip(c7808, attributeSet);
                    chip.setText(str2);
                    chip.setClickable(false);
                    chip.setTextAppearance(R.style.TextAppearance_Material3_LabelSmall);
                    customChipGroup.addView(chip);
                    attributeSet = null;
                }
                ((TextView) view.findViewById(R.id.tv_detail_sticker_count)).setText(onlineStickerInfo.getStickerCount() + "张表情");
                ((TextView) view.findViewById(R.id.tv_detail_size)).setText(AbstractC3065.m6835(onlineStickerInfo.getArchiveFileSize()));
                ((TextView) view.findViewById(R.id.tv_detail_downloads)).setText("下载" + onlineStickerInfo.getDownloadCount() + "次");
                TextView textView4 = (TextView) view.findViewById(R.id.tv_detail_date);
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
                LinearLayout linearLayout5 = (LinearLayout) view.findViewById(R.id.ll_thumbnails);
                linearLayout5.removeAllViews();
                Iterator<T> it = onlineStickerInfo.getThumbnails().iterator();
                while (it.hasNext()) {
                    String strResolveAssetUrl2 = StickerUrlResolver.resolveAssetUrl((String) it.next());
                    FrameLayout frameLayout2 = new FrameLayout(linearLayout5.getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) frameLayout2.getResources().getDimension(R.dimen.sticker_thumbnail_size), (int) frameLayout2.getResources().getDimension(R.dimen.sticker_thumbnail_size));
                    layoutParams.setMarginEnd((int) frameLayout2.getResources().getDimension(R.dimen.sticker_thumbnail_spacing));
                    frameLayout2.setLayoutParams(layoutParams);
                    ImageView imageView2 = new ImageView(linearLayout5.getContext());
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    ProgressBar progressBar3 = new ProgressBar(linearLayout5.getContext());
                    progressBar3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                    progressBar3.setIndeterminate(true);
                    frameLayout2.addView(imageView2);
                    frameLayout2.addView(progressBar3);
                    C7828.m13190(imageView2, progressBar3, strResolveAssetUrl2);
                    linearLayout5.addView(frameLayout2);
                }
                ((TextView) view.findViewById(R.id.btn_download)).setOnClickListener(new ViewOnClickListenerC5544(c7828, new Regex("[\\\\/:*?\"<>|]").replace(onlineStickerInfo.getTitle(), JavaConstant.Dynamic.DEFAULT_NAME), c82403, i6));
                return;
            case 4:
                AbstractC8405.m13973("喵喵喵喵喵呜喵呜");
                view.getClass();
                final C8898 c8898 = (C8898) obj2;
                view.getContext();
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_troop_list);
                Button button = (Button) view.findViewById(R.id.btn_select_all);
                Button button2 = (Button) view.findViewById(R.id.btn_select_all_none);
                Button button3 = (Button) view.findViewById(R.id.btn_select_all_invert);
                button.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏世兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i7 = i5;
                        C8898 c88982 = c8898;
                        switch (i7) {
                            case 0:
                                c88982.f25082.m14485(true);
                                break;
                            case 1:
                                c88982.f25082.m14485(false);
                                break;
                            default:
                                C8817 c8817 = c88982.f25082;
                                for (GroupInfo groupInfo : c8817.f22042) {
                                    ((LinkedHashMap) c8817.f24820).put(groupInfo.GroupUin, Boolean.valueOf(!AbstractC4395.m8907(r2.get(r1), Boolean.TRUE)));
                                }
                                c8817.m4791();
                                break;
                        }
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏世兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i7 = i4;
                        C8898 c88982 = c8898;
                        switch (i7) {
                            case 0:
                                c88982.f25082.m14485(true);
                                break;
                            case 1:
                                c88982.f25082.m14485(false);
                                break;
                            default:
                                C8817 c8817 = c88982.f25082;
                                for (GroupInfo groupInfo : c8817.f22042) {
                                    ((LinkedHashMap) c8817.f24820).put(groupInfo.GroupUin, Boolean.valueOf(!AbstractC4395.m8907(r2.get(r1), Boolean.TRUE)));
                                }
                                c8817.m4791();
                                break;
                        }
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏世兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i7 = i3;
                        C8898 c88982 = c8898;
                        switch (i7) {
                            case 0:
                                c88982.f25082.m14485(true);
                                break;
                            case 1:
                                c88982.f25082.m14485(false);
                                break;
                            default:
                                C8817 c8817 = c88982.f25082;
                                for (GroupInfo groupInfo : c8817.f22042) {
                                    ((LinkedHashMap) c8817.f24820).put(groupInfo.GroupUin, Boolean.valueOf(!AbstractC4395.m8907(r2.get(r1), Boolean.TRUE)));
                                }
                                c8817.m4791();
                                break;
                        }
                    }
                });
                ArrayList arrayListM12047 = AbstractC6561.m12047();
                C8817 c8817 = c8898.f25082;
                AbstractC7969.m13458(c8817, arrayListM12047);
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAdapter(c8817);
                return;
            case 5:
                ((C8240) obj).getClass();
                view.getClass();
                C1251 c1251 = (C1251) obj2;
                c1251.f3627 = (top.suzhelan.plugin.sdk.online.widget.FollowLinearLayout) view;
                C8240 c82404 = (C8240) c1251.f3628;
                AbstractC3749 abstractC3749 = c82404.f22764;
                View viewFindViewById7 = (abstractC3749 == null ? null : abstractC3749.getCustomView()).findViewById(R.id.rv_comment_list);
                viewFindViewById7.getClass();
                c1251.f3634 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) viewFindViewById7;
                AbstractC3749 abstractC37492 = c82404.f22764;
                View viewFindViewById8 = (abstractC37492 == null ? null : abstractC37492.getCustomView()).findViewById(R.id.pb_loading);
                viewFindViewById8.getClass();
                c1251.f3633 = (ProgressBar) viewFindViewById8;
                top.suzhelan.plugin.sdk.online.widget.FollowLinearLayout followLinearLayout4 = (top.suzhelan.plugin.sdk.online.widget.FollowLinearLayout) c1251.f3627;
                if (followLinearLayout4 == null) {
                    AbstractC4395.m8908("rootView");
                    throw null;
                }
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView3 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) c1251.f3634;
                if (customRecycleView3 == null) {
                    AbstractC4395.m8908("rvCommentList");
                    throw null;
                }
                followLinearLayout4.setFollowRecycleView(customRecycleView3);
                AbstractC3749 abstractC37493 = c82404.f22764;
                View viewFindViewById9 = (abstractC37493 == null ? null : abstractC37493.getCustomView()).findViewById(R.id.et_comment_content);
                viewFindViewById9.getClass();
                c1251.f3636 = (EditText) viewFindViewById9;
                AbstractC3749 abstractC37494 = c82404.f22764;
                View viewFindViewById10 = (abstractC37494 == null ? null : abstractC37494.getCustomView()).findViewById(R.id.btn_send_comment);
                viewFindViewById10.getClass();
                c1251.f3637 = (Button) viewFindViewById10;
                AbstractC3749 abstractC37495 = c82404.f22764;
                View viewFindViewById11 = (abstractC37495 == null ? null : abstractC37495.getCustomView()).findViewById(R.id.tv_comment_title);
                viewFindViewById11.getClass();
                c1251.f3635 = (TextView) viewFindViewById11;
                ((C5807) c1251.f3629).m11222((String) c1251.f3630, new C4207(14));
                return;
            case 6:
                ((C8240) obj).getClass();
                view.getClass();
                final C9075 c9075 = (C9075) obj2;
                c9075.f25429 = view;
                View viewFindViewById12 = view.findViewById(R.id.rv_message_list);
                viewFindViewById12.getClass();
                c9075.f25428 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) viewFindViewById12;
                View view2 = c9075.f25429;
                if (view2 == null) {
                    AbstractC4395.m8908("rootView");
                    throw null;
                }
                View viewFindViewById13 = view2.findViewById(R.id.pb_loading);
                viewFindViewById13.getClass();
                c9075.f25427 = (ProgressBar) viewFindViewById13;
                View view3 = c9075.f25429;
                if (view3 == null) {
                    AbstractC4395.m8908("rootView");
                    throw null;
                }
                View viewFindViewById14 = view3.findViewById(R.id.tv_message_title);
                viewFindViewById14.getClass();
                c9075.f25440 = (TextView) viewFindViewById14;
                View view4 = c9075.f25429;
                if (view4 == null) {
                    AbstractC4395.m8908("rootView");
                    throw null;
                }
                View viewFindViewById15 = view4.findViewById(R.id.btn_mark_all_read);
                viewFindViewById15.getClass();
                c9075.f25439 = (TextView) viewFindViewById15;
                View view5 = c9075.f25429;
                if (view5 == null) {
                    AbstractC4395.m8908("rootView");
                    throw null;
                }
                View viewFindViewById16 = view5.findViewById(R.id.btn_back);
                viewFindViewById16.getClass();
                ((TextView) viewFindViewById16).setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世哲苏兰
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        int i7 = i5;
                        C9075 c90752 = c9075;
                        switch (i7) {
                            case 0:
                                c90752.f25431.m13764();
                                break;
                            default:
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = c90752.f25438;
                                long j2 = 5 - ((jCurrentTimeMillis - j) / 1000);
                                if (j <= 0 || j2 <= 0) {
                                    c90752.f25438 = System.currentTimeMillis();
                                    c90752.f25430.m11220(new C7342(c90752, 8));
                                }
                                break;
                        }
                    }
                });
                TextView textView5 = c9075.f25439;
                if (textView5 == null) {
                    AbstractC4395.m8908("btnMarkAllRead");
                    throw null;
                }
                textView5.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世哲苏兰
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        int i7 = i4;
                        C9075 c90752 = c9075;
                        switch (i7) {
                            case 0:
                                c90752.f25431.m13764();
                                break;
                            default:
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = c90752.f25438;
                                long j2 = 5 - ((jCurrentTimeMillis - j) / 1000);
                                if (j <= 0 || j2 <= 0) {
                                    c90752.f25438 = System.currentTimeMillis();
                                    c90752.f25430.m11220(new C7342(c90752, 8));
                                }
                                break;
                        }
                    }
                });
                C8819 c8819 = new C8819(new C9077(c9075, i3), new C9077(c9075, i2));
                c9075.f25443 = c8819;
                C2494 c2494 = C2494.f7466;
                c2494.getClass();
                C8049 c8049 = new C8049(c9075, 17);
                C7959 c7959 = new C7959();
                c7959.f22028 = c8049;
                c9075.f25444 = new C4871(c8819, c7959, c2494);
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView4 = c9075.f25428;
                if (customRecycleView4 == null) {
                    AbstractC4395.m8908("rvMessageList");
                    throw null;
                }
                customRecycleView4.setLayoutManager(new LinearLayoutManager(1));
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView5 = c9075.f25428;
                if (customRecycleView5 == null) {
                    AbstractC4395.m8908("rvMessageList");
                    throw null;
                }
                C4871 c4871 = c9075.f25444;
                if (c4871 == null) {
                    AbstractC4395.m8908("helper");
                    throw null;
                }
                customRecycleView5.setAdapter((C2493) c4871.f14165);
                ProgressBar progressBar4 = c9075.f25427;
                if (progressBar4 == null) {
                    AbstractC4395.m8908("isLoading");
                    throw null;
                }
                progressBar4.setVisibility(0);
                c9075.f25441 = 1;
                c9075.f25430.m11221(1, c9075.f25434, new C9077(c9075, i5), new C9077(c9075, i4));
                return;
            default:
                ((C8227) obj).getClass();
                view.getClass();
                C3005 c30052 = (C3005) obj2;
                c30052.f9534 = view;
                View viewFindViewById17 = view.findViewById(R.id.cg_tags);
                viewFindViewById17.getClass();
                c30052.f9533 = (top.suzhelan.plugin.sdk.online.widget.CustomChipGroup) viewFindViewById17;
                View view6 = (View) c30052.f9534;
                if (view6 == null) {
                    AbstractC4395.m8908("rootView");
                    throw null;
                }
                View viewFindViewById18 = view6.findViewById(R.id.pb_loading);
                viewFindViewById18.getClass();
                c30052.f9536 = (ProgressBar) viewFindViewById18;
                View view7 = (View) c30052.f9534;
                if (view7 == null) {
                    AbstractC4395.m8908("rootView");
                    throw null;
                }
                ((TextView) view7.findViewById(R.id.btn_back)).setOnClickListener(new ViewOnClickListenerC9078(c30052, i4));
                View view8 = (View) c30052.f9534;
                if (view8 == null) {
                    AbstractC4395.m8908("rootView");
                    throw null;
                }
                FrameLayout frameLayout3 = (FrameLayout) view8.findViewById(R.id.box);
                C2549 c25493 = new C2549((Activity) c30052.f9539);
                c30052.f9535 = c25493;
                frameLayout3.addView(c25493, new ViewGroup.LayoutParams(-1, -1));
                C2549 c25494 = (C2549) c30052.f9535;
                if (c25494 == null) {
                    AbstractC4395.m8908("viewPager");
                    throw null;
                }
                ((ArrayList) c25494.f7690.f7665).add(new C2543(c30052, i3));
                ((C5805) c30052.f9538).m11216();
                ProgressBar progressBar5 = (ProgressBar) c30052.f9536;
                if (progressBar5 != null) {
                    progressBar5.setVisibility(0);
                    return;
                } else {
                    AbstractC4395.m8908("isLoading");
                    throw null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8707(C7828 c7828) {
        super(R.layout.dialog_sticker_detail);
        this.f24535 = c7828;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8707(View view, C8710 c8710) {
        super(view);
        this.f24535 = c8710;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8707(C3005 c3005, byte b) {
        super(R.layout.dialog_plugin_pager);
        this.f24535 = c3005;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8707(C1251 c1251) {
        super(R.layout.dialog_comments);
        this.f24535 = c1251;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8707(C3005 c3005) {
        super(R.layout.dialog_online_sticker);
        this.f24535 = c3005;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8707(C8726 c8726) {
        super(R.layout.layout_sticker_panel_dialog);
        this.f24535 = c8726;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8707(C9075 c9075) {
        super(R.layout.dialog_messages);
        this.f24535 = c9075;
    }
}
