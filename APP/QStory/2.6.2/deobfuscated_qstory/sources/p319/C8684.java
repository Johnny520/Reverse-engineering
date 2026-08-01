package p319;

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
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.load.engine.C3004;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import io.ktor.util.C4206;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5143;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5543;
import net.bytebuddy.utility.JavaConstant;
import p007.AbstractC6136;
import p116.C7341;
import p144.C7546;
import p192.C7807;
import p193.C7827;
import p216.C7958;
import p217.AbstractC7968;
import p230.C8048;
import p253.AbstractC8189;
import p257.C8226;
import p257.C8239;
import p257.RunnableC8233;
import p323.C8733;
import p323.C8734;
import p323.C8736;
import p324.C8738;
import p324.C8745;
import p324.C8746;
import p341.C8816;
import p343.C8831;
import p352.C8881;
import p385.C9088;
import p385.C9090;
import p385.ViewOnClickListenerC9091;
import p392.AbstractC9124;
import top.suzhelan.plugin.sdk.online.presenter.C5804;
import top.suzhelan.plugin.sdk.online.presenter.C5806;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;
import top.suzhelan.qstory.ui.views.CustomMaterialCheckBox;
import top.suzhelan.qstory.ui.views.CustomMaterialSwitch;
import top.suzhelan.qstory.ui.views.CustomRecycleView;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;
import top.suzhelan.qstory.ui.views.FollowRecycleViewLinearLayout;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.net.StickerUrlResolver;
import top.suzhelan.sticker.sdk.presenter.C5979;
import top.suzhelan.sticker.sdk.widget.CustomChipGroup;
import top.suzhelan.sticker.sdk.widget.FollowLinearLayout;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8684 extends AbstractC3748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24489 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8684(C8881 c8881) {
        super(R.layout.dialog_troop_select);
        this.f24488 = c8881;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3748
    public final void onBind(Object obj, View view) throws IOException {
        String str;
        String string;
        int i = this.f24489;
        int i2 = 14;
        int i3 = 3;
        final int i4 = 2;
        final int i5 = 1;
        Object obj2 = this.f24488;
        AttributeSet attributeSet = null;
        final int i6 = 0;
        switch (i) {
            case 0:
                C8239 c8239 = (C8239) obj;
                "dialog";
                c8239.getClass();
                "v";
                view.getClass();
                C8703 c8703 = (C8703) obj2;
                FollowRecycleViewLinearLayout followRecycleViewLinearLayout = (FollowRecycleViewLinearLayout) view;
                C8734 c8734 = c8703.f24543;
                View viewFindViewById = followRecycleViewLinearLayout.findViewById(R.id.rv_sticker_image);
                "findViewById(...)";
                viewFindViewById.getClass();
                DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) viewFindViewById;
                c8703.f24542 = dialogXRecycleView;
                followRecycleViewLinearLayout.setFollowRecycleView(dialogXRecycleView);
                followRecycleViewLinearLayout.getContext();
                dialogXRecycleView.setLayoutManager(new GridLayoutManager());
                dialogXRecycleView.m4721(new C8733(AbstractC2904.m6267(followRecycleViewLinearLayout.getContext(), 8.0f), 0));
                C8736 c8736 = c8703.f24544;
                dialogXRecycleView.setAdapter(c8736);
                c8736.f22044 = new C0679(c8703, 6, c8239);
                c8736.f22043 = new C7546(13);
                View viewFindViewById2 = followRecycleViewLinearLayout.findViewById(R.id.rv_sticker_dir);
                "findViewById(...)";
                viewFindViewById2.getClass();
                CustomRecycleView customRecycleView = (CustomRecycleView) viewFindViewById2;
                c8703.f24541 = customRecycleView;
                customRecycleView.setOnTouchTouchCallback(new C8048(followRecycleViewLinearLayout, i2));
                followRecycleViewLinearLayout.getContext();
                customRecycleView.setLayoutManager(new LinearLayoutManager(0));
                AbstractC2536 itemAnimator = customRecycleView.getItemAnimator();
                C2505 c2505 = itemAnimator instanceof C2505 ? (C2505) itemAnimator : null;
                if (c2505 != null) {
                    c2505.f7505 = false;
                }
                C8738.f24639.getClass();
                c8734.m14402(C8738.m14411());
                c8734.f22043 = new C8688(c8703);
                c8734.f22044 = new C8688(c8703);
                customRecycleView.setAdapter(c8734);
                DialogXRecycleView dialogXRecycleView2 = c8703.f24542;
                if (dialogXRecycleView2 != null) {
                    dialogXRecycleView2.post(new RunnableC8689(c8703, i4));
                }
                CustomRecycleView customRecycleView2 = c8703.f24541;
                if (customRecycleView2 != null) {
                    customRecycleView2.post(new RunnableC8689(c8703, i3));
                    return;
                }
                return;
            case 1:
                final C8239 c82392 = (C8239) obj;
                "dialog";
                c82392.getClass();
                "v";
                view.getClass();
                View viewFindViewById3 = view.findViewById(R.id.tv_confirm);
                "findViewById(...)";
                viewFindViewById3.getClass();
                TextView textView = (TextView) viewFindViewById3;
                C8746.f24650.getClass();
                C8738 c8738 = C8738.f24639;
                String strM6668 = "dirSortMode";
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode = StickerPanelSettingsConfig$SortMode.NAME_ASC;
                String key = stickerPanelSettingsConfig$SortMode.getKey();
                c8738.getClass();
                String strM14408 = C8738.m14408(strM6668, key);
                StickerPanelSettingsConfig$SortMode.Companion.getClass();
                final StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortModeM14412 = C8745.m14412(strM14408);
                final StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortModeM14414 = C8746.m14414();
                C8690 c8690 = new C8690((LinearLayout) AbstractC6136.m11537(view, R.id.cb_dir_name_asc, -3937691541079066023L), (CustomMaterialCheckBox) AbstractC6136.m11537(view, R.id.cb_dir_name_asc_box, -3937691541079066023L), stickerPanelSettingsConfig$SortMode);
                LinearLayout linearLayout = (LinearLayout) AbstractC6136.m11537(view, R.id.cb_dir_name_desc, -3937691541079066023L);
                CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) AbstractC6136.m11537(view, R.id.cb_dir_name_desc_box, -3937691541079066023L);
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode2 = StickerPanelSettingsConfig$SortMode.NAME_DESC;
                C8690 c86902 = new C8690(linearLayout, customMaterialCheckBox, stickerPanelSettingsConfig$SortMode2);
                LinearLayout linearLayout2 = (LinearLayout) AbstractC6136.m11537(view, R.id.cb_dir_time_asc, -3937691541079066023L);
                CustomMaterialCheckBox customMaterialCheckBox2 = (CustomMaterialCheckBox) AbstractC6136.m11537(view, R.id.cb_dir_time_asc_box, -3937691541079066023L);
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode3 = StickerPanelSettingsConfig$SortMode.TIME_ASC;
                C8690 c86903 = new C8690(linearLayout2, customMaterialCheckBox2, stickerPanelSettingsConfig$SortMode3);
                LinearLayout linearLayout3 = (LinearLayout) AbstractC6136.m11537(view, R.id.cb_dir_time_desc, -3937691541079066023L);
                CustomMaterialCheckBox customMaterialCheckBox3 = (CustomMaterialCheckBox) AbstractC6136.m11537(view, R.id.cb_dir_time_desc_box, -3937691541079066023L);
                StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode4 = StickerPanelSettingsConfig$SortMode.TIME_DESC;
                final List listM13659 = AbstractC8189.m13659(c8690, c86902, c86903, new C8690(linearLayout3, customMaterialCheckBox3, stickerPanelSettingsConfig$SortMode4));
                final List listM136592 = AbstractC8189.m13659(new C8690((LinearLayout) AbstractC6136.m11537(view, R.id.cb_file_recent_usage, -3937691541079066023L), (CustomMaterialCheckBox) AbstractC6136.m11537(view, R.id.cb_file_recent_usage_box, -3937691541079066023L), StickerPanelSettingsConfig$SortMode.RECENT_USAGE), new C8690((LinearLayout) AbstractC6136.m11537(view, R.id.cb_file_name_asc, -3937691541079066023L), (CustomMaterialCheckBox) AbstractC6136.m11537(view, R.id.cb_file_name_asc_box, -3937691541079066023L), stickerPanelSettingsConfig$SortMode), new C8690((LinearLayout) AbstractC6136.m11537(view, R.id.cb_file_name_desc, -3937691541079066023L), (CustomMaterialCheckBox) AbstractC6136.m11537(view, R.id.cb_file_name_desc_box, -3937691541079066023L), stickerPanelSettingsConfig$SortMode2), new C8690((LinearLayout) AbstractC6136.m11537(view, R.id.cb_file_time_asc, -3937691541079066023L), (CustomMaterialCheckBox) AbstractC6136.m11537(view, R.id.cb_file_time_asc_box, -3937691541079066023L), stickerPanelSettingsConfig$SortMode3), new C8690((LinearLayout) AbstractC6136.m11537(view, R.id.cb_file_time_desc, -3937691541079066023L), (CustomMaterialCheckBox) AbstractC6136.m11537(view, R.id.cb_file_time_desc_box, -3937691541079066023L), stickerPanelSettingsConfig$SortMode4));
                C8692.m14379(listM13659, stickerPanelSettingsConfig$SortModeM14412);
                C8692.m14379(listM136592, stickerPanelSettingsConfig$SortModeM14414);
                final CustomMaterialSwitch customMaterialSwitch = (CustomMaterialSwitch) AbstractC6136.m11537(view, R.id.switch_keep_open, -3937691541079066023L);
                LinearLayout linearLayout4 = (LinearLayout) AbstractC6136.m11537(view, R.id.ll_keep_open, -3937691541079066023L);
                customMaterialSwitch.setCheckedImmediate(C8746.m14413());
                linearLayout4.setOnClickListener(new ViewOnClickListenerC8694(customMaterialSwitch, 0));
                View viewFindViewById4 = view.findViewById(R.id.btn_organize_stickers);
                "findViewById(...)";
                viewFindViewById4.getClass();
                ((Button) viewFindViewById4).setOnClickListener(new ViewOnClickListenerC3182(c82392, 19));
                final C8687 c8687 = (C8687) obj2;
                textView.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪兰苏哲世
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object obj3;
                        Object next;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode5;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode6;
                        boolean z;
                        Iterator it = listM13659.iterator();
                        while (true) {
                            obj3 = null;
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (((C8690) next).f24499.isChecked) {
                                    break;
                                }
                            }
                        }
                        C8690 c86904 = (C8690) next;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode7 = stickerPanelSettingsConfig$SortModeM14412;
                        if (c86904 == null || (stickerPanelSettingsConfig$SortMode5 = c86904.f24498) == null) {
                            stickerPanelSettingsConfig$SortMode5 = stickerPanelSettingsConfig$SortMode7;
                        }
                        Iterator it2 = listM136592.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            if (((C8690) next2).f24499.isChecked) {
                                obj3 = next2;
                                break;
                            }
                        }
                        C8690 c86905 = (C8690) obj3;
                        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode8 = stickerPanelSettingsConfig$SortModeM14414;
                        if (c86905 == null || (stickerPanelSettingsConfig$SortMode6 = c86905.f24498) == null) {
                            stickerPanelSettingsConfig$SortMode6 = stickerPanelSettingsConfig$SortMode8;
                        }
                        boolean z2 = customMaterialSwitch.isChecked;
                        boolean z3 = true;
                        if (stickerPanelSettingsConfig$SortMode5 != stickerPanelSettingsConfig$SortMode7) {
                            C8746.f24650.getClass();
                            "mode";
                            stickerPanelSettingsConfig$SortMode5.getClass();
                            C8738 c87382 = C8738.f24639;
                            String strM66682 = "dirSortMode";
                            String key2 = stickerPanelSettingsConfig$SortMode5.getKey();
                            c87382.getClass();
                            C8738.m14410(strM66682, key2);
                            z = true;
                        } else {
                            z = false;
                        }
                        if (stickerPanelSettingsConfig$SortMode6 != stickerPanelSettingsConfig$SortMode8) {
                            C8746.f24650.getClass();
                            "mode";
                            stickerPanelSettingsConfig$SortMode6.getClass();
                            C8738 c87383 = C8738.f24639;
                            String strM66683 = "fileSortMode";
                            String key3 = stickerPanelSettingsConfig$SortMode6.getKey();
                            c87383.getClass();
                            C8738.m14410(strM66683, key3);
                            z = true;
                        }
                        C8746.f24650.getClass();
                        if (z2 != C8746.m14413()) {
                            C8738 c87384 = C8738.f24639;
                            String strM66684 = "keepOpenAfterSend";
                            String strValueOf = String.valueOf(z2);
                            c87384.getClass();
                            C8738.m14410(strM66684, strValueOf);
                        } else {
                            z3 = z;
                        }
                        c82392.m13747();
                        if (z3) {
                            c8687.invoke();
                        }
                    }
                });
                return;
            case 2:
                ((C8239) obj).getClass();
                view.getClass();
                C3004 c3004 = (C3004) obj2;
                FollowLinearLayout followLinearLayout = (FollowLinearLayout) view;
                c3004.f9532 = followLinearLayout;
                View viewFindViewById5 = followLinearLayout.findViewById(R.id.cg_tags);
                viewFindViewById5.getClass();
                c3004.f9531 = (CustomChipGroup) viewFindViewById5;
                FollowLinearLayout followLinearLayout2 = (FollowLinearLayout) c3004.f9532;
                if (followLinearLayout2 == null) {
                    AbstractC4394.m8918("rootView");
                    throw null;
                }
                View viewFindViewById6 = followLinearLayout2.findViewById(R.id.pb_loading);
                viewFindViewById6.getClass();
                c3004.f9534 = (ProgressBar) viewFindViewById6;
                FollowLinearLayout followLinearLayout3 = (FollowLinearLayout) c3004.f9532;
                if (followLinearLayout3 == null) {
                    AbstractC4394.m8918("rootView");
                    throw null;
                }
                FrameLayout frameLayout = (FrameLayout) followLinearLayout3.findViewById(R.id.box);
                C2549 c2549 = new C2549((Activity) c3004.f9537);
                c3004.f9533 = c2549;
                frameLayout.addView(c2549, new ViewGroup.LayoutParams(-1, -1));
                C2549 c25492 = (C2549) c3004.f9533;
                if (c25492 == null) {
                    AbstractC4394.m8918("viewPager");
                    throw null;
                }
                ((ArrayList) c25492.f7689.f7664).add(new C2543(c3004, i5));
                ((C5979) c3004.f9536).m11302();
                ProgressBar progressBar = (ProgressBar) c3004.f9534;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                } else {
                    AbstractC4394.m8918("isLoading");
                    throw null;
                }
            case 3:
                C8239 c82393 = (C8239) obj;
                c82393.getClass();
                view.getClass();
                C7827 c7827 = (C7827) obj2;
                C7807 c7807 = new C7807((Context) c7827.f21371, R.style.AppTheme);
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_detail_cover);
                ProgressBar progressBar2 = (ProgressBar) view.findViewById(R.id.pb_detail_cover_loading);
                OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) c7827.f21369;
                String strResolveAssetUrl = StickerUrlResolver.resolveAssetUrl(onlineStickerInfo.getCoverUrl());
                imageView.getClass();
                progressBar2.getClass();
                C7827.m13162(imageView, progressBar2, strResolveAssetUrl);
                ((TextView) view.findViewById(R.id.tv_detail_title)).setText(onlineStickerInfo.getTitle());
                TextView textView2 = (TextView) view.findViewById(R.id.tv_detail_author);
                ListBuilder listBuilderM13685 = AbstractC8189.m13685();
                String author = onlineStickerInfo.getAuthor();
                if (author != null && (string = AbstractC5143.m10150(author).toString()) != null) {
                    if (string.length() <= 0) {
                        string = null;
                    }
                    if (string != null) {
                        listBuilderM13685.add("作者: ".concat(string));
                    }
                }
                String nickname = onlineStickerInfo.getNickname();
                String uin = onlineStickerInfo.getUin();
                String string2 = nickname != null ? AbstractC5143.m10150(nickname).toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                String string3 = uin != null ? AbstractC5143.m10150(uin).toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                if (string2.length() > 0 && string3.length() > 0) {
                    string2 = string2 + "(" + string3 + ")";
                } else if (string2.length() <= 0) {
                    string2 = string3.length() > 0 ? string3 : null;
                }
                if (string2 != null) {
                    listBuilderM13685.add("上传者: ".concat(string2));
                }
                String strM8813 = AbstractC4343.m8813(listBuilderM13685.build(), "\n", null, null, null, 62);
                int i7 = 8;
                if (strM8813.length() == 0) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(strM8813);
                    textView2.setVisibility(0);
                }
                TextView textView3 = (TextView) view.findViewById(R.id.tv_detail_description);
                String description = onlineStickerInfo.getDescription();
                if (description != null && !AbstractC5143.m10164(description)) {
                    textView3.setText(onlineStickerInfo.getDescription());
                    textView3.setVisibility(0);
                }
                CustomChipGroup customChipGroup = (CustomChipGroup) view.findViewById(R.id.cg_detail_tags);
                customChipGroup.removeAllViews();
                for (String str2 : onlineStickerInfo.getTags()) {
                    Chip chip = new Chip(c7807, attributeSet);
                    chip.setText(str2);
                    chip.setClickable(false);
                    chip.setTextAppearance(R.style.TextAppearance_Material3_LabelSmall);
                    customChipGroup.addView(chip);
                    attributeSet = null;
                }
                ((TextView) view.findViewById(R.id.tv_detail_sticker_count)).setText(onlineStickerInfo.getStickerCount() + "张表情");
                ((TextView) view.findViewById(R.id.tv_detail_size)).setText(AbstractC4921.m9892(onlineStickerInfo.getArchiveFileSize()));
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
                    C7827.m13162(imageView2, progressBar3, strResolveAssetUrl2);
                    linearLayout5.addView(frameLayout2);
                }
                ((TextView) view.findViewById(R.id.btn_download)).setOnClickListener(new ViewOnClickListenerC5543(c7827, new Regex("[\\\\/:*?\"<>|]").replace(onlineStickerInfo.getTitle(), JavaConstant.Dynamic.DEFAULT_NAME), c82393, i7));
                return;
            case 4:
                "v";
                view.getClass();
                final C8881 c8881 = (C8881) obj2;
                view.getContext();
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_troop_list);
                Button button = (Button) view.findViewById(R.id.btn_select_all);
                Button button2 = (Button) view.findViewById(R.id.btn_select_all_none);
                Button button3 = (Button) view.findViewById(R.id.btn_select_all_invert);
                button.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪苏世兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i8 = i6;
                        C8881 c88812 = c8881;
                        switch (i8) {
                            case 0:
                                c88812.f25031.m14474(true);
                                break;
                            case 1:
                                c88812.f25031.m14474(false);
                                break;
                            default:
                                C8831 c8831 = c88812.f25031;
                                for (GroupInfo groupInfo : c8831.f22045) {
                                    ((LinkedHashMap) c8831.f24839).put(groupInfo.GroupUin, Boolean.valueOf(!AbstractC4394.m8917(r2.get(r1), Boolean.TRUE)));
                                }
                                c8831.m4781();
                                break;
                        }
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪苏世兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i8 = i5;
                        C8881 c88812 = c8881;
                        switch (i8) {
                            case 0:
                                c88812.f25031.m14474(true);
                                break;
                            case 1:
                                c88812.f25031.m14474(false);
                                break;
                            default:
                                C8831 c8831 = c88812.f25031;
                                for (GroupInfo groupInfo : c8831.f22045) {
                                    ((LinkedHashMap) c8831.f24839).put(groupInfo.GroupUin, Boolean.valueOf(!AbstractC4394.m8917(r2.get(r1), Boolean.TRUE)));
                                }
                                c8831.m4781();
                                break;
                        }
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪苏世兰哲
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i8 = i4;
                        C8881 c88812 = c8881;
                        switch (i8) {
                            case 0:
                                c88812.f25031.m14474(true);
                                break;
                            case 1:
                                c88812.f25031.m14474(false);
                                break;
                            default:
                                C8831 c8831 = c88812.f25031;
                                for (GroupInfo groupInfo : c8831.f22045) {
                                    ((LinkedHashMap) c8831.f24839).put(groupInfo.GroupUin, Boolean.valueOf(!AbstractC4394.m8917(r2.get(r1), Boolean.TRUE)));
                                }
                                c8831.m4781();
                                break;
                        }
                    }
                });
                ArrayList arrayListM14671 = AbstractC9124.m14671();
                C8831 c8831 = c8881.f25031;
                AbstractC7968.m13430(c8831, arrayListM14671);
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAdapter(c8831);
                return;
            case 5:
                ((C8239) obj).getClass();
                view.getClass();
                C1251 c1251 = (C1251) obj2;
                c1251.f3626 = (top.suzhelan.plugin.sdk.online.widget.FollowLinearLayout) view;
                C8239 c82394 = (C8239) c1251.f3627;
                AbstractC3748 abstractC3748 = c82394.f22765;
                View viewFindViewById7 = (abstractC3748 == null ? null : abstractC3748.getCustomView()).findViewById(R.id.rv_comment_list);
                viewFindViewById7.getClass();
                c1251.f3633 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) viewFindViewById7;
                AbstractC3748 abstractC37482 = c82394.f22765;
                View viewFindViewById8 = (abstractC37482 == null ? null : abstractC37482.getCustomView()).findViewById(R.id.pb_loading);
                viewFindViewById8.getClass();
                c1251.f3632 = (ProgressBar) viewFindViewById8;
                top.suzhelan.plugin.sdk.online.widget.FollowLinearLayout followLinearLayout4 = (top.suzhelan.plugin.sdk.online.widget.FollowLinearLayout) c1251.f3626;
                if (followLinearLayout4 == null) {
                    AbstractC4394.m8918("rootView");
                    throw null;
                }
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView3 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) c1251.f3633;
                if (customRecycleView3 == null) {
                    AbstractC4394.m8918("rvCommentList");
                    throw null;
                }
                followLinearLayout4.setFollowRecycleView(customRecycleView3);
                AbstractC3748 abstractC37483 = c82394.f22765;
                View viewFindViewById9 = (abstractC37483 == null ? null : abstractC37483.getCustomView()).findViewById(R.id.et_comment_content);
                viewFindViewById9.getClass();
                c1251.f3635 = (EditText) viewFindViewById9;
                AbstractC3748 abstractC37484 = c82394.f22765;
                View viewFindViewById10 = (abstractC37484 == null ? null : abstractC37484.getCustomView()).findViewById(R.id.btn_send_comment);
                viewFindViewById10.getClass();
                c1251.f3636 = (Button) viewFindViewById10;
                AbstractC3748 abstractC37485 = c82394.f22765;
                View viewFindViewById11 = (abstractC37485 == null ? null : abstractC37485.getCustomView()).findViewById(R.id.tv_comment_title);
                viewFindViewById11.getClass();
                c1251.f3634 = (TextView) viewFindViewById11;
                ((C5806) c1251.f3628).m11165((String) c1251.f3629, new C4206(i2));
                return;
            case 6:
                ((C8226) obj).getClass();
                view.getClass();
                final C9088 c9088 = (C9088) obj2;
                c9088.f25379 = view;
                View viewFindViewById12 = view.findViewById(R.id.rv_message_list);
                viewFindViewById12.getClass();
                c9088.f25378 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) viewFindViewById12;
                View view2 = c9088.f25379;
                if (view2 == null) {
                    AbstractC4394.m8918("rootView");
                    throw null;
                }
                View viewFindViewById13 = view2.findViewById(R.id.pb_loading);
                viewFindViewById13.getClass();
                c9088.f25377 = (ProgressBar) viewFindViewById13;
                View view3 = c9088.f25379;
                if (view3 == null) {
                    AbstractC4394.m8918("rootView");
                    throw null;
                }
                View viewFindViewById14 = view3.findViewById(R.id.tv_message_title);
                viewFindViewById14.getClass();
                c9088.f25390 = (TextView) viewFindViewById14;
                View view4 = c9088.f25379;
                if (view4 == null) {
                    AbstractC4394.m8918("rootView");
                    throw null;
                }
                View viewFindViewById15 = view4.findViewById(R.id.btn_mark_all_read);
                viewFindViewById15.getClass();
                c9088.f25389 = (TextView) viewFindViewById15;
                View view5 = c9088.f25379;
                if (view5 == null) {
                    AbstractC4394.m8918("rootView");
                    throw null;
                }
                View viewFindViewById16 = view5.findViewById(R.id.btn_back);
                viewFindViewById16.getClass();
                ((TextView) viewFindViewById16).setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世哲苏兰
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        int i8 = i6;
                        C9088 c90882 = c9088;
                        switch (i8) {
                            case 0:
                                C8226 c8226 = c90882.f25381;
                                c8226.getClass();
                                AbstractC3737.m8043(new RunnableC8233(c8226, 1));
                                break;
                            default:
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = c90882.f25388;
                                long j2 = 5 - ((jCurrentTimeMillis - j) / 1000);
                                if (j <= 0 || j2 <= 0) {
                                    c90882.f25388 = System.currentTimeMillis();
                                    c90882.f25380.m11163(new C7341(c90882, 8));
                                }
                                break;
                        }
                    }
                });
                TextView textView5 = c9088.f25389;
                if (textView5 == null) {
                    AbstractC4394.m8918("btnMarkAllRead");
                    throw null;
                }
                textView5.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世哲苏兰
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        int i8 = i5;
                        C9088 c90882 = c9088;
                        switch (i8) {
                            case 0:
                                C8226 c8226 = c90882.f25381;
                                c8226.getClass();
                                AbstractC3737.m8043(new RunnableC8233(c8226, 1));
                                break;
                            default:
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = c90882.f25388;
                                long j2 = 5 - ((jCurrentTimeMillis - j) / 1000);
                                if (j <= 0 || j2 <= 0) {
                                    c90882.f25388 = System.currentTimeMillis();
                                    c90882.f25380.m11163(new C7341(c90882, 8));
                                }
                                break;
                        }
                    }
                });
                C8816 c8816 = new C8816(new C9090(c9088, i4), new C9090(c9088, i3));
                c9088.f25393 = c8816;
                C2494 c2494 = C2494.f7465;
                c2494.getClass();
                C8048 c8048 = new C8048(c9088, 16);
                C7958 c7958 = new C7958();
                c7958.f22031 = c8048;
                c9088.f25394 = new C4870(c8816, c7958, c2494);
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView4 = c9088.f25378;
                if (customRecycleView4 == null) {
                    AbstractC4394.m8918("rvMessageList");
                    throw null;
                }
                customRecycleView4.setLayoutManager(new LinearLayoutManager(1));
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView5 = c9088.f25378;
                if (customRecycleView5 == null) {
                    AbstractC4394.m8918("rvMessageList");
                    throw null;
                }
                C4870 c4870 = c9088.f25394;
                if (c4870 == null) {
                    AbstractC4394.m8918("helper");
                    throw null;
                }
                customRecycleView5.setAdapter((C2493) c4870.f14161);
                ProgressBar progressBar4 = c9088.f25377;
                if (progressBar4 == null) {
                    AbstractC4394.m8918("isLoading");
                    throw null;
                }
                progressBar4.setVisibility(0);
                c9088.f25391 = 1;
                c9088.f25380.m11164(1, c9088.f25384, new C9090(c9088, i6), new C9090(c9088, i5));
                return;
            default:
                ((C8226) obj).getClass();
                view.getClass();
                C3004 c30042 = (C3004) obj2;
                c30042.f9532 = view;
                View viewFindViewById17 = view.findViewById(R.id.cg_tags);
                viewFindViewById17.getClass();
                c30042.f9531 = (top.suzhelan.plugin.sdk.online.widget.CustomChipGroup) viewFindViewById17;
                View view6 = (View) c30042.f9532;
                if (view6 == null) {
                    AbstractC4394.m8918("rootView");
                    throw null;
                }
                View viewFindViewById18 = view6.findViewById(R.id.pb_loading);
                viewFindViewById18.getClass();
                c30042.f9534 = (ProgressBar) viewFindViewById18;
                View view7 = (View) c30042.f9532;
                if (view7 == null) {
                    AbstractC4394.m8918("rootView");
                    throw null;
                }
                ((TextView) view7.findViewById(R.id.btn_back)).setOnClickListener(new ViewOnClickListenerC9091(c30042, i5));
                View view8 = (View) c30042.f9532;
                if (view8 == null) {
                    AbstractC4394.m8918("rootView");
                    throw null;
                }
                FrameLayout frameLayout3 = (FrameLayout) view8.findViewById(R.id.box);
                C2549 c25493 = new C2549((Activity) c30042.f9537);
                c30042.f9533 = c25493;
                frameLayout3.addView(c25493, new ViewGroup.LayoutParams(-1, -1));
                C2549 c25494 = (C2549) c30042.f9533;
                if (c25494 == null) {
                    AbstractC4394.m8918("viewPager");
                    throw null;
                }
                ((ArrayList) c25494.f7689.f7664).add(new C2543(c30042, i4));
                ((C5804) c30042.f9536).m11159();
                ProgressBar progressBar5 = (ProgressBar) c30042.f9534;
                if (progressBar5 != null) {
                    progressBar5.setVisibility(0);
                    return;
                } else {
                    AbstractC4394.m8918("isLoading");
                    throw null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8684(C7827 c7827) {
        super(R.layout.dialog_sticker_detail);
        this.f24488 = c7827;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8684(View view, C8687 c8687) {
        super(view);
        this.f24488 = c8687;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8684(C3004 c3004, byte b) {
        super(R.layout.dialog_plugin_pager);
        this.f24488 = c3004;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8684(C1251 c1251) {
        super(R.layout.dialog_comments);
        this.f24488 = c1251;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8684(C3004 c3004) {
        super(R.layout.dialog_online_sticker);
        this.f24488 = c3004;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8684(C8703 c8703) {
        super(R.layout.layout_sticker_panel_dialog);
        this.f24488 = c8703;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8684(C9088 c9088) {
        super(R.layout.dialog_messages);
        this.f24488 = c9088;
    }
}
