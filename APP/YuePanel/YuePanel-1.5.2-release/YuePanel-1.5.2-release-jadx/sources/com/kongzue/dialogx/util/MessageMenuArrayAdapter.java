package com.kongzue.dialogx.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.MenuIconAdapter;
import com.kongzue.dialogx.interfaces.SELECT_MODE;
import com.kongzue.dialogx.wrapper.ModuleUtil;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MessageMenuArrayAdapter extends BaseAdapter {
    public Context context;
    TextInfo defaultMenuTextInfo;
    private MessageMenu messageMenu;
    public List<CharSequence> objects;

    public class ViewHolder {
        ImageView imgDialogxMenuIcon;
        ImageView imgDialogxMenuSelection;
        Space spaceDialogxRightPadding;
        TextView txtDialogxMenuText;

        public ViewHolder() {
        }
    }

    public MessageMenuArrayAdapter(MessageMenu messageMenu, Context context, List<CharSequence> list) {
        this.objects = list;
        this.context = context;
        this.messageMenu = messageMenu;
    }

    private int px2dip(float f) {
        return (int) ((f / this.context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.objects.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            ViewHolder viewHolder2 = new ViewHolder();
            LayoutInflater layoutInflater = ModuleUtil.getLayoutInflater(this.context);
            int iOverrideMenuItemLayout = C2413R.layout.item_dialogx_material_bottom_menu_normal_text;
            if (this.messageMenu.getStyle().overrideBottomDialogRes() != null) {
                iOverrideMenuItemLayout = this.messageMenu.getStyle().overrideBottomDialogRes().overrideMenuItemLayout(this.messageMenu.isLightTheme(), i, getCount(), false);
                if (iOverrideMenuItemLayout == 0) {
                    iOverrideMenuItemLayout = C2413R.layout.item_dialogx_material_bottom_menu_normal_text;
                } else if ((!BaseDialog.isNull(this.messageMenu.getTitle()) || !BaseDialog.isNull(this.messageMenu.getMessage()) || this.messageMenu.getCustomView() != null) && i == 0) {
                    iOverrideMenuItemLayout = this.messageMenu.getStyle().overrideBottomDialogRes().overrideMenuItemLayout(this.messageMenu.isLightTheme(), i, getCount(), true);
                }
            }
            View viewInflate = layoutInflater.inflate(iOverrideMenuItemLayout, (ViewGroup) null);
            viewHolder2.imgDialogxMenuIcon = (ImageView) viewInflate.findViewById(C2413R.id.img_dialogx_menu_icon);
            viewHolder2.imgDialogxMenuSelection = (ImageView) viewInflate.findViewById(C2413R.id.img_dialogx_menu_selection);
            viewHolder2.txtDialogxMenuText = (TextView) viewInflate.findViewById(C2413R.id.txt_dialogx_menu_text);
            viewHolder2.spaceDialogxRightPadding = (Space) viewInflate.findViewById(C2413R.id.space_dialogx_right_padding);
            viewInflate.setTag(viewHolder2);
            viewHolder = viewHolder2;
            view = viewInflate;
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (this.messageMenu.isMenuItemEnable(i)) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(0.4f);
        }
        if (this.messageMenu.getSelectMode() == SELECT_MODE.SINGLE) {
            if (viewHolder.imgDialogxMenuSelection != null) {
                if (this.messageMenu.getSelection() == i) {
                    viewHolder.imgDialogxMenuSelection.setVisibility(0);
                    int iOverrideSelectionImage = this.messageMenu.getStyle().overrideBottomDialogRes().overrideSelectionImage(this.messageMenu.isLightTheme(), true);
                    if (iOverrideSelectionImage != 0) {
                        viewHolder.imgDialogxMenuSelection.setImageResource(iOverrideSelectionImage);
                    }
                } else {
                    int iOverrideSelectionImage2 = this.messageMenu.getStyle().overrideBottomDialogRes().overrideSelectionImage(this.messageMenu.isLightTheme(), false);
                    if (iOverrideSelectionImage2 != 0) {
                        viewHolder.imgDialogxMenuSelection.setVisibility(0);
                        viewHolder.imgDialogxMenuSelection.setImageResource(iOverrideSelectionImage2);
                    } else {
                        viewHolder.imgDialogxMenuSelection.setVisibility(4);
                    }
                }
            }
        } else if (this.messageMenu.getSelectMode() != SELECT_MODE.MULTIPLE) {
            viewHolder.imgDialogxMenuSelection.setVisibility(8);
        } else if (viewHolder.imgDialogxMenuSelection != null) {
            if (this.messageMenu.getSelectionList().contains(Integer.valueOf(i))) {
                viewHolder.imgDialogxMenuSelection.setVisibility(0);
                int iOverrideMultiSelectionImage = this.messageMenu.getStyle().overrideBottomDialogRes().overrideMultiSelectionImage(this.messageMenu.isLightTheme(), true);
                if (iOverrideMultiSelectionImage != 0) {
                    viewHolder.imgDialogxMenuSelection.setImageResource(iOverrideMultiSelectionImage);
                }
            } else {
                int iOverrideMultiSelectionImage2 = this.messageMenu.getStyle().overrideBottomDialogRes().overrideMultiSelectionImage(this.messageMenu.isLightTheme(), false);
                if (iOverrideMultiSelectionImage2 != 0) {
                    viewHolder.imgDialogxMenuSelection.setVisibility(0);
                    viewHolder.imgDialogxMenuSelection.setImageResource(iOverrideMultiSelectionImage2);
                } else {
                    viewHolder.imgDialogxMenuSelection.setVisibility(4);
                }
            }
        }
        int iOverrideSelectionMenuBackgroundColor = this.messageMenu.getStyle().overrideBottomDialogRes() != null ? this.messageMenu.getStyle().overrideBottomDialogRes().overrideSelectionMenuBackgroundColor(this.messageMenu.isLightTheme()) : 0;
        if (this.messageMenu.getSelection() == i && iOverrideSelectionMenuBackgroundColor != 0) {
            view.setBackgroundTintList(ColorStateList.valueOf(this.context.getResources().getColor(iOverrideSelectionMenuBackgroundColor)));
        }
        CharSequence charSequence = this.objects.get(i);
        int iOverrideMenuTextColor = this.messageMenu.isLightTheme() ? C2413R.color.black90 : C2413R.color.white90;
        if (this.messageMenu.getStyle().overrideBottomDialogRes() != null && this.messageMenu.getStyle().overrideBottomDialogRes().overrideMenuTextColor(this.messageMenu.isLightTheme()) != 0) {
            iOverrideMenuTextColor = this.messageMenu.getStyle().overrideBottomDialogRes().overrideMenuTextColor(this.messageMenu.isLightTheme());
        }
        if (charSequence != null) {
            if (this.defaultMenuTextInfo == null) {
                this.defaultMenuTextInfo = new TextInfo().setShowEllipsis(viewHolder.txtDialogxMenuText.getEllipsize() == TextUtils.TruncateAt.END).setFontColor(viewHolder.txtDialogxMenuText.getTextColors().getDefaultColor()).setBold(viewHolder.txtDialogxMenuText.getPaint().isFakeBoldText()).setFontSize(px2dip(viewHolder.txtDialogxMenuText.getTextSize())).setGravity(viewHolder.txtDialogxMenuText.getGravity()).setMaxLines(viewHolder.txtDialogxMenuText.getMaxLines());
            }
            viewHolder.txtDialogxMenuText.setText(charSequence);
            viewHolder.txtDialogxMenuText.setTextColor(this.context.getResources().getColor(iOverrideMenuTextColor));
            if (this.messageMenu.getMenuItemTextInfoInterceptor() != null) {
                TextInfo textInfoMenuItemTextInfo = this.messageMenu.getMenuItemTextInfoInterceptor().menuItemTextInfo(this.messageMenu, i, charSequence.toString());
                if (textInfoMenuItemTextInfo != null) {
                    BaseDialog.useTextInfo(viewHolder.txtDialogxMenuText, textInfoMenuItemTextInfo);
                } else if (this.messageMenu.getMenuTextInfo() != null) {
                    BaseDialog.useTextInfo(viewHolder.txtDialogxMenuText, this.messageMenu.getMenuTextInfo());
                } else {
                    BaseDialog.useTextInfo(viewHolder.txtDialogxMenuText, this.defaultMenuTextInfo);
                }
            } else if (this.messageMenu.getMenuTextInfo() != null) {
                BaseDialog.useTextInfo(viewHolder.txtDialogxMenuText, this.messageMenu.getMenuTextInfo());
            }
            if (viewHolder.imgDialogxMenuSelection != null) {
                if (this.messageMenu.getStyle().overrideBottomDialogRes() == null || !this.messageMenu.getStyle().overrideBottomDialogRes().selectionImageTint(this.messageMenu.isLightTheme())) {
                    viewHolder.imgDialogxMenuSelection.setImageTintList(null);
                } else {
                    viewHolder.imgDialogxMenuSelection.setImageTintList(ColorStateList.valueOf(this.context.getResources().getColor(iOverrideMenuTextColor)));
                }
            }
            if (this.messageMenu.getOnIconChangeCallBack() != null) {
                if (this.messageMenu.getOnIconChangeCallBack() instanceof MenuIconAdapter) {
                    boolean zApplyIcon = ((MenuIconAdapter) this.messageMenu.getOnIconChangeCallBack()).applyIcon(this.messageMenu, i, charSequence.toString(), viewHolder.imgDialogxMenuIcon);
                    boolean zIsAutoTintIconInLightOrDarkMode = this.messageMenu.getOnIconChangeCallBack().isAutoTintIconInLightOrDarkMode() == null ? this.messageMenu.isAutoTintIconInLightOrDarkMode() : this.messageMenu.getOnIconChangeCallBack().isAutoTintIconInLightOrDarkMode().booleanValue();
                    viewHolder.imgDialogxMenuIcon.setVisibility(zApplyIcon ? 0 : 8);
                    if (zApplyIcon) {
                        if (zIsAutoTintIconInLightOrDarkMode) {
                            viewHolder.imgDialogxMenuIcon.setImageTintList(ColorStateList.valueOf(this.context.getResources().getColor(iOverrideMenuTextColor)));
                        }
                        Space space = viewHolder.spaceDialogxRightPadding;
                        if (space != null) {
                            space.setVisibility(0);
                        }
                    } else {
                        Space space2 = viewHolder.spaceDialogxRightPadding;
                        if (space2 != null) {
                            space2.setVisibility(8);
                        }
                    }
                } else {
                    int icon = this.messageMenu.getOnIconChangeCallBack().getIcon(this.messageMenu, i, charSequence.toString());
                    boolean zIsAutoTintIconInLightOrDarkMode2 = this.messageMenu.getOnIconChangeCallBack().isAutoTintIconInLightOrDarkMode() == null ? this.messageMenu.isAutoTintIconInLightOrDarkMode() : this.messageMenu.getOnIconChangeCallBack().isAutoTintIconInLightOrDarkMode().booleanValue();
                    if (icon != 0) {
                        viewHolder.imgDialogxMenuIcon.setVisibility(0);
                        viewHolder.imgDialogxMenuIcon.setImageResource(icon);
                        Space space3 = viewHolder.spaceDialogxRightPadding;
                        if (space3 != null) {
                            space3.setVisibility(0);
                        }
                        if (zIsAutoTintIconInLightOrDarkMode2) {
                            viewHolder.imgDialogxMenuIcon.setImageTintList(ColorStateList.valueOf(this.context.getResources().getColor(iOverrideMenuTextColor)));
                        }
                    } else {
                        viewHolder.imgDialogxMenuIcon.setVisibility(8);
                        Space space4 = viewHolder.spaceDialogxRightPadding;
                        if (space4 != null) {
                            space4.setVisibility(8);
                        }
                    }
                }
            } else if (this.messageMenu.getIconResIds() != null) {
                int iconResIds = this.messageMenu.getIconResIds(i);
                boolean zIsAutoTintIconInLightOrDarkMode3 = this.messageMenu.isAutoTintIconInLightOrDarkMode();
                if (iconResIds != 0) {
                    viewHolder.imgDialogxMenuIcon.setVisibility(0);
                    viewHolder.imgDialogxMenuIcon.setImageResource(iconResIds);
                    Space space5 = viewHolder.spaceDialogxRightPadding;
                    if (space5 != null) {
                        space5.setVisibility(0);
                    }
                    if (zIsAutoTintIconInLightOrDarkMode3) {
                        viewHolder.imgDialogxMenuIcon.setImageTintList(ColorStateList.valueOf(this.context.getResources().getColor(iOverrideMenuTextColor)));
                    }
                } else {
                    viewHolder.imgDialogxMenuIcon.setVisibility(8);
                    Space space6 = viewHolder.spaceDialogxRightPadding;
                    if (space6 != null) {
                        space6.setVisibility(8);
                    }
                }
            } else {
                viewHolder.imgDialogxMenuIcon.setVisibility(8);
                Space space7 = viewHolder.spaceDialogxRightPadding;
                if (space7 != null) {
                    space7.setVisibility(8);
                }
            }
        }
        if (this.messageMenu.getMenuMenuItemLayoutRefreshCallback() != null) {
            this.messageMenu.getMenuMenuItemLayoutRefreshCallback().getView(this.messageMenu, i, view, viewGroup);
        }
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    public CharSequence getItem(int i) {
        return this.objects.get(i);
    }
}
