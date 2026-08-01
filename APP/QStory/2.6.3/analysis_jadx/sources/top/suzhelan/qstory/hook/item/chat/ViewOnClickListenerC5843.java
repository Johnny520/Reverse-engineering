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
import com.davemorrissey.labs.subscaleview.R;
import kotlin.jvm.internal.AbstractC4395;
import p010.AbstractC6185;
import p018.AbstractC6253;
import p028.DialogC6319;
import p029.C6320;
import p287.AbstractC8405;
import p342.C8811;
import p386.C9074;
import p386.C9079;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5843 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15999;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16000;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ View f16001;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16002;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f16003;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16004;

    public /* synthetic */ ViewOnClickListenerC5843(Object obj, KeyEvent.Callback callback, Object obj2, Object obj3, View view, int i) {
        this.f16004 = i;
        this.f16002 = obj;
        this.f16003 = callback;
        this.f16000 = obj2;
        this.f15999 = obj3;
        this.f16001 = view;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuItem menuItemFindItem;
        int i = this.f16004;
        final int i2 = 1;
        View view2 = this.f16001;
        Object obj = this.f15999;
        Object obj2 = this.f16000;
        KeyEvent.Callback callback = this.f16003;
        Object obj3 = this.f16002;
        switch (i) {
            case 0:
                DialogC6319 dialogC6319 = (DialogC6319) callback;
                C5842 c5842 = (C5842) obj2;
                Context context = (Context) obj;
                CheckBox checkBox = (CheckBox) view2;
                String string = ((EditText) obj3).getText().toString();
                if (string.length() != 0) {
                    int i3 = Integer.parseInt(string);
                    c5842.f15994 = AbstractC6253.m11754(context, i3);
                    boolean zIsChecked = checkBox.isChecked();
                    C6320 c6320 = c5842.f15998;
                    c6320.getClass();
                    c6320.m11836(Integer.valueOf(i3), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜"));
                    C6320 c63202 = c5842.f15998;
                    c63202.getClass();
                    c63202.m11836(Boolean.valueOf(zIsChecked), AbstractC8405.m13972(2206));
                    C6320 c63203 = c5842.f15998;
                    c63203.getClass();
                    c63203.mo11835();
                    AbstractC6185.m11592(AbstractC8405.m13972(516));
                    dialogC6319.dismiss();
                } else {
                    AbstractC6185.m11592(AbstractC8405.m13972(2217));
                    dialogC6319.dismiss();
                }
                break;
            case 1:
                final C8811 c8811 = (C8811) obj3;
                final TextView textView = (TextView) callback;
                final String str = (String) obj2;
                final CustomRecycleView customRecycleView = (CustomRecycleView) obj;
                final ProgressBar progressBar = (ProgressBar) view2;
                PopupMenu popupMenu = new PopupMenu(textView.getContext(), textView);
                popupMenu.getMenuInflater().inflate(R.menu.sort_menu, popupMenu.getMenu());
                String str2 = c8811.f24797;
                if (AbstractC4395.m8907(str2, "latest")) {
                    MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.menu_sort_by_latest);
                    if (menuItemFindItem2 != null) {
                        menuItemFindItem2.setChecked(true);
                    }
                } else if (AbstractC4395.m8907(str2, "popular") && (menuItemFindItem = popupMenu.getMenu().findItem(R.id.menu_sort_by_popular)) != null) {
                    menuItemFindItem.setChecked(true);
                }
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪世哲兰苏
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
                        C8811 c88112 = c8811;
                        if (AbstractC4395.m8907(c88112.f24797, str3)) {
                            return true;
                        }
                        c88112.f24797 = str3;
                        TextView textView2 = (TextView) textView;
                        String str4 = "最新发布";
                        if (!AbstractC4395.m8907(str3, "latest") && AbstractC4395.m8907(str3, "popular")) {
                            str4 = "最多下载";
                        }
                        textView2.setText(str4);
                        c88112.m14484(str, customRecycleView, progressBar);
                        return true;
                    }
                });
                popupMenu.show();
                break;
            default:
                C9079 c9079 = (C9079) obj3;
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
                String str4 = c9079.f25453;
                switch (str4.hashCode()) {
                    case -938285885:
                        if (str4.equals("random")) {
                            textView6.getClass();
                            C9079.m14654(textView3, textView4, textView5, textView6, textView6);
                        }
                        break;
                    case 3560141:
                        if (str4.equals("time")) {
                            textView3.getClass();
                            C9079.m14654(textView3, textView4, textView5, textView6, textView3);
                        }
                        break;
                    case 31392744:
                        if (str4.equals("download_desc")) {
                            textView4.getClass();
                            C9079.m14654(textView3, textView4, textView5, textView6, textView4);
                        }
                        break;
                    case 1109388858:
                        if (str4.equals("download_asc")) {
                            textView5.getClass();
                            C9079.m14654(textView3, textView4, textView5, textView6, textView5);
                        }
                        break;
                }
                final C9074 c9074 = new C9074(c9079, textView2, str3, customRecycleView2, progressBar2, popupWindow);
                final int i4 = 0;
                textView3.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世兰哲苏
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i5 = i4;
                        TextView textView7 = textView3;
                        C9074 c90742 = c9074;
                        switch (i5) {
                            case 0:
                                textView7.getClass();
                                c90742.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c90742.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c90742.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c90742.invoke("random", textView7);
                                break;
                        }
                    }
                });
                textView4.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世兰哲苏
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i5 = i2;
                        TextView textView7 = textView4;
                        C9074 c90742 = c9074;
                        switch (i5) {
                            case 0:
                                textView7.getClass();
                                c90742.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c90742.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c90742.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c90742.invoke("random", textView7);
                                break;
                        }
                    }
                });
                final int i5 = 2;
                textView5.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世兰哲苏
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i52 = i5;
                        TextView textView7 = textView5;
                        C9074 c90742 = c9074;
                        switch (i52) {
                            case 0:
                                textView7.getClass();
                                c90742.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c90742.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c90742.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c90742.invoke("random", textView7);
                                break;
                        }
                    }
                });
                final int i6 = 3;
                textView6.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世兰哲苏
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i52 = i6;
                        TextView textView7 = textView6;
                        C9074 c90742 = c9074;
                        switch (i52) {
                            case 0:
                                textView7.getClass();
                                c90742.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c90742.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c90742.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c90742.invoke("random", textView7);
                                break;
                        }
                    }
                });
                popupWindow.showAsDropDown(textView2, 0, 8, 8388613);
                break;
        }
    }
}
