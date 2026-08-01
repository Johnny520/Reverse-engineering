package top.suzhelan.qstory.hook.item.chat;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.jvm.internal.AbstractC4394;
import p010.AbstractC6154;
import p027.DialogC6300;
import p028.C6301;
import p343.C8825;
import p385.C9087;
import p385.C9092;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5830 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15964;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15965;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ View f15966;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15967;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f15968;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15969;

    public /* synthetic */ ViewOnClickListenerC5830(Object obj, KeyEvent.Callback callback, Object obj2, Object obj3, View view, int i) {
        this.f15969 = i;
        this.f15967 = obj;
        this.f15968 = callback;
        this.f15965 = obj2;
        this.f15964 = obj3;
        this.f15966 = view;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuItem menuItemFindItem;
        int i = this.f15969;
        final int i2 = 1;
        View view2 = this.f15966;
        Object obj = this.f15964;
        Object obj2 = this.f15965;
        KeyEvent.Callback callback = this.f15968;
        Object obj3 = this.f15967;
        switch (i) {
            case 0:
                DialogC6300 dialogC6300 = (DialogC6300) callback;
                C5841 c5841 = (C5841) obj2;
                Context context = (Context) obj;
                CheckBox checkBox = (CheckBox) view2;
                String string = ((EditText) obj3).getText().toString();
                if (string.length() != 0) {
                    int i3 = Integer.parseInt(string);
                    c5841.f15996 = AbstractC2904.m6267(context, i3);
                    boolean zIsChecked = checkBox.isChecked();
                    C6301 c6301 = c5841.f16000;
                    c6301.getClass();
                    c6301.m11808(Integer.valueOf(i3), "size");
                    C6301 c63012 = c5841.f16000;
                    c63012.getClass();
                    c63012.m11808(Boolean.valueOf(zIsChecked), "doubleClick");
                    C6301 c63013 = c5841.f16000;
                    c63013.getClass();
                    c63013.mo11807();
                    AbstractC6154.m11561("\u5df2\u4fdd\u5b58");
                    dialogC6300.dismiss();
                } else {
                    AbstractC6154.m11561("\u672a\u586b\u5199\u5927\u5c0f");
                    dialogC6300.dismiss();
                }
                break;
            case 1:
                final C8825 c8825 = (C8825) obj3;
                final TextView textView = (TextView) callback;
                final String str = (String) obj2;
                final CustomRecycleView customRecycleView = (CustomRecycleView) obj;
                final ProgressBar progressBar = (ProgressBar) view2;
                PopupMenu popupMenu = new PopupMenu(textView.getContext(), textView);
                popupMenu.getMenuInflater().inflate(R.menu.sort_menu, popupMenu.getMenu());
                String str2 = c8825.f24816;
                if (AbstractC4394.m8917(str2, "latest")) {
                    MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.menu_sort_by_latest);
                    if (menuItemFindItem2 != null) {
                        menuItemFindItem2.setChecked(true);
                    }
                } else if (AbstractC4394.m8917(str2, "popular") && (menuItemFindItem = popupMenu.getMenu().findItem(R.id.menu_sort_by_popular)) != null) {
                    menuItemFindItem.setChecked(true);
                }
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: 飘花落叶言苏哲世楪子兰.飘花落叶言子楪世哲兰苏
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        String str3;
                        int itemId = menuItem.getItemId();
                        if (itemId == R.id.menu_sort_by_latest) {
                            str3 = "latest";
                        } else {
                            if (itemId != R.id.menu_sort_by_popular) {
                                return false;
                            }
                            str3 = "popular";
                        }
                        C8825 c88252 = c8825;
                        if (AbstractC4394.m8917(c88252.f24816, str3)) {
                            return true;
                        }
                        c88252.f24816 = str3;
                        TextView textView2 = (TextView) textView;
                        String str4 = "最新发布";
                        if (!AbstractC4394.m8917(str3, "latest") && AbstractC4394.m8917(str3, "popular")) {
                            str4 = "最多下载";
                        }
                        textView2.setText(str4);
                        c88252.m14473(str, customRecycleView, progressBar);
                        return true;
                    }
                });
                popupMenu.show();
                break;
            default:
                C9092 c9092 = (C9092) obj3;
                TextView textView2 = (TextView) callback;
                String str3 = (String) obj2;
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView2 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) obj;
                ProgressBar progressBar2 = (ProgressBar) view2;
                View viewInflate = LayoutInflater.from(textView2.getContext()).inflate(R.layout.popup_sort_menu, (ViewGroup) null);
                viewInflate.getClass();
                ViewGroup viewGroup = (ViewGroup) viewInflate;
                PopupWindow popupWindow = new PopupWindow((View) viewGroup, -2, -2, true);
                popupWindow.setOutsideTouchable(true);
                final TextView textView3 = (TextView) viewGroup.findViewById(R.id.sort_time);
                final TextView textView4 = (TextView) viewGroup.findViewById(R.id.sort_download_desc);
                final TextView textView5 = (TextView) viewGroup.findViewById(R.id.sort_download_asc);
                final TextView textView6 = (TextView) viewGroup.findViewById(R.id.sort_random);
                String str4 = c9092.f25403;
                switch (str4.hashCode()) {
                    case -938285885:
                        if (str4.equals("random")) {
                            textView6.getClass();
                            C9092.m14597(textView3, textView4, textView5, textView6, textView6);
                        }
                        break;
                    case 3560141:
                        if (str4.equals("time")) {
                            textView3.getClass();
                            C9092.m14597(textView3, textView4, textView5, textView6, textView3);
                        }
                        break;
                    case 31392744:
                        if (str4.equals("download_desc")) {
                            textView4.getClass();
                            C9092.m14597(textView3, textView4, textView5, textView6, textView4);
                        }
                        break;
                    case 1109388858:
                        if (str4.equals("download_asc")) {
                            textView5.getClass();
                            C9092.m14597(textView3, textView4, textView5, textView6, textView5);
                        }
                        break;
                }
                final C9087 c9087 = new C9087(c9092, textView2, str3, customRecycleView2, progressBar2, popupWindow);
                final int i4 = 0;
                textView3.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世兰哲苏
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i5 = i4;
                        TextView textView7 = textView3;
                        C9087 c90872 = c9087;
                        switch (i5) {
                            case 0:
                                textView7.getClass();
                                c90872.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c90872.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c90872.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c90872.invoke("random", textView7);
                                break;
                        }
                    }
                });
                textView4.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世兰哲苏
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i5 = i2;
                        TextView textView7 = textView4;
                        C9087 c90872 = c9087;
                        switch (i5) {
                            case 0:
                                textView7.getClass();
                                c90872.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c90872.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c90872.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c90872.invoke("random", textView7);
                                break;
                        }
                    }
                });
                final int i5 = 2;
                textView5.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世兰哲苏
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i52 = i5;
                        TextView textView7 = textView5;
                        C9087 c90872 = c9087;
                        switch (i52) {
                            case 0:
                                textView7.getClass();
                                c90872.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c90872.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c90872.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c90872.invoke("random", textView7);
                                break;
                        }
                    }
                });
                final int i6 = 3;
                textView6.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世兰哲苏
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i52 = i6;
                        TextView textView7 = textView6;
                        C9087 c90872 = c9087;
                        switch (i52) {
                            case 0:
                                textView7.getClass();
                                c90872.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c90872.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c90872.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c90872.invoke("random", textView7);
                                break;
                        }
                    }
                });
                popupWindow.showAsDropDown(textView2, 0, 8, 8388613);
                break;
        }
    }
}
