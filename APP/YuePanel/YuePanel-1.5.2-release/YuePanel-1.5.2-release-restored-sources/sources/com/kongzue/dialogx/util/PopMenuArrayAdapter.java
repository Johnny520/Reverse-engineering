package com.kongzue.dialogx.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.dialogs.PopMenu;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.MenuIconAdapter;
import com.kongzue.dialogx.wrapper.ModuleUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PopMenuArrayAdapter extends BaseAdapter {
    public Context context;
    LayoutInflater mInflater;
    public List<CharSequence> menuList;
    private PopMenu popMenu;

    public class ViewHolder {
        LinearLayout boxItem;
        ImageView imgDialogxMenuIcon;
        Space spaceDialogxRightPadding;
        TextView txtDialogxMenuText;

        public ViewHolder() {
        }
    }

    public PopMenuArrayAdapter(PopMenu popMenu, Context context, List<CharSequence> list) {
        this.popMenu = popMenu;
        this.menuList = list;
        this.context = context;
        this.mInflater = ModuleUtil.getLayoutInflater(context);
    }

    private boolean isHaveProperties(int i, int i2) {
        return (i & i2) == i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.menuList == null) {
            this.menuList = new ArrayList();
        }
        return this.menuList.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.menuList.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public List<CharSequence> getMenuList() {
        return this.menuList;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        Space space;
        int iOverrideMenuItemLayoutRes;
        if (view == null) {
            ViewHolder viewHolder2 = new ViewHolder();
            int i2 = C2413R.layout.item_dialogx_material_context_menu_normal_text;
            if (this.popMenu.getStyle().popMenuSettings() != null && (iOverrideMenuItemLayoutRes = this.popMenu.getStyle().popMenuSettings().overrideMenuItemLayoutRes(this.popMenu.isLightTheme())) != 0) {
                i2 = iOverrideMenuItemLayoutRes;
            }
            View viewInflate = this.mInflater.inflate(i2, (ViewGroup) null);
            viewHolder2.boxItem = (LinearLayout) viewInflate.findViewById(C2413R.id.box_item);
            viewHolder2.imgDialogxMenuIcon = (ImageView) viewInflate.findViewById(C2413R.id.img_dialogx_menu_icon);
            viewHolder2.txtDialogxMenuText = (TextView) viewInflate.findViewById(C2413R.id.txt_dialogx_menu_text);
            viewHolder2.spaceDialogxRightPadding = (Space) viewInflate.findViewById(C2413R.id.space_dialogx_right_padding);
            viewInflate.setTag(viewHolder2);
            viewHolder = viewHolder2;
            view = viewInflate;
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (this.popMenu.isMenuItemEnable(i)) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(0.4f);
        }
        int iOverrideMenuItemBackgroundRes = this.popMenu.getStyle().popMenuSettings() == null ? 0 : this.popMenu.getStyle().popMenuSettings().overrideMenuItemBackgroundRes(this.popMenu.isLightTheme(), i, getCount(), false);
        if (iOverrideMenuItemBackgroundRes != 0) {
            view.setBackgroundResource(iOverrideMenuItemBackgroundRes);
        }
        if (viewHolder.boxItem != null) {
            if (this.popMenu.getPressedIndex() == i) {
                viewHolder.boxItem.setBackgroundResource(this.popMenu.isLightTheme() ? C2413R.color.black5 : C2413R.color.white5);
            } else {
                viewHolder.boxItem.setBackgroundResource(C2413R.color.empty);
            }
        }
        viewHolder.imgDialogxMenuIcon.setVisibility(8);
        viewHolder.txtDialogxMenuText.setText(this.menuList.get(i));
        if (this.popMenu.getStyle().popMenuSettings() != null && this.popMenu.getStyle().popMenuSettings().paddingVertical() != 0) {
            if (i == 0) {
                view.setPadding(0, this.popMenu.getStyle().popMenuSettings().paddingVertical(), 0, 0);
            } else if (i == getCount() - 1) {
                view.setPadding(0, 0, 0, this.popMenu.getStyle().popMenuSettings().paddingVertical());
            } else {
                view.setPadding(0, 0, 0, 0);
            }
        }
        int i3 = this.popMenu.isLightTheme() ? C2413R.color.black90 : C2413R.color.white90;
        viewHolder.txtDialogxMenuText.setTextColor(this.context.getResources().getColor(i3));
        if (this.popMenu.getMenuTextInfo() != null) {
            BaseDialog.useTextInfo(viewHolder.txtDialogxMenuText, this.popMenu.getMenuTextInfo());
        }
        if (this.popMenu.getOnIconChangeCallBack() != null) {
            if (this.popMenu.getOnIconChangeCallBack() instanceof MenuIconAdapter) {
                boolean zApplyIcon = ((MenuIconAdapter) this.popMenu.getOnIconChangeCallBack()).applyIcon(this.popMenu, i, this.menuList.get(i).toString(), viewHolder.imgDialogxMenuIcon);
                boolean zIsAutoTintIconInLightOrDarkMode = this.popMenu.getOnIconChangeCallBack().isAutoTintIconInLightOrDarkMode() == null ? this.popMenu.isAutoTintIconInLightOrDarkMode() : this.popMenu.getOnIconChangeCallBack().isAutoTintIconInLightOrDarkMode().booleanValue();
                viewHolder.imgDialogxMenuIcon.setVisibility(zApplyIcon ? 0 : 8);
                if (zApplyIcon) {
                    if (zIsAutoTintIconInLightOrDarkMode) {
                        viewHolder.imgDialogxMenuIcon.setImageTintList(ColorStateList.valueOf(this.context.getResources().getColor(i3)));
                    }
                    Space space2 = viewHolder.spaceDialogxRightPadding;
                    if (space2 != null) {
                        space2.setVisibility(0);
                    }
                } else {
                    Space space3 = viewHolder.spaceDialogxRightPadding;
                    if (space3 != null) {
                        space3.setVisibility(8);
                    }
                }
            } else {
                int icon = this.popMenu.getOnIconChangeCallBack().getIcon(this.popMenu, i, this.menuList.get(i).toString());
                boolean zIsAutoTintIconInLightOrDarkMode2 = this.popMenu.getOnIconChangeCallBack().isAutoTintIconInLightOrDarkMode() == null ? this.popMenu.isAutoTintIconInLightOrDarkMode() : this.popMenu.getOnIconChangeCallBack().isAutoTintIconInLightOrDarkMode().booleanValue();
                if (icon != 0) {
                    viewHolder.imgDialogxMenuIcon.setVisibility(0);
                    viewHolder.imgDialogxMenuIcon.setImageResource(icon);
                    if ((isHaveProperties(viewHolder.txtDialogxMenuText.getGravity(), 17) || isHaveProperties(viewHolder.txtDialogxMenuText.getGravity(), 1)) && (space = viewHolder.spaceDialogxRightPadding) != null) {
                        space.setVisibility(0);
                    }
                    if (zIsAutoTintIconInLightOrDarkMode2) {
                        viewHolder.imgDialogxMenuIcon.setImageTintList(ColorStateList.valueOf(this.context.getResources().getColor(i3)));
                    }
                } else {
                    viewHolder.imgDialogxMenuIcon.setVisibility(8);
                    Space space4 = viewHolder.spaceDialogxRightPadding;
                    if (space4 != null) {
                        space4.setVisibility(8);
                    }
                }
            }
        } else if (this.popMenu.getIconResIds() != null) {
            int iconResIds = this.popMenu.getIconResIds(i);
            boolean zIsAutoTintIconInLightOrDarkMode3 = this.popMenu.isAutoTintIconInLightOrDarkMode();
            if (iconResIds != 0) {
                viewHolder.imgDialogxMenuIcon.setVisibility(0);
                viewHolder.imgDialogxMenuIcon.setImageResource(iconResIds);
                Space space5 = viewHolder.spaceDialogxRightPadding;
                if (space5 != null) {
                    space5.setVisibility(0);
                }
                if (zIsAutoTintIconInLightOrDarkMode3) {
                    viewHolder.imgDialogxMenuIcon.setImageTintList(ColorStateList.valueOf(this.context.getResources().getColor(i3)));
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
        if (this.popMenu.getMenuMenuItemLayoutRefreshCallback() != null) {
            this.popMenu.getMenuMenuItemLayoutRefreshCallback().getView(this.popMenu, i, view, viewGroup);
        }
        return view;
    }
}
