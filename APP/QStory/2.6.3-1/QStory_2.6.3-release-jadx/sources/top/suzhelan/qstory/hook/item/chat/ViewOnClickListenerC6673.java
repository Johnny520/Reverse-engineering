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
import com.davemorrissey.labs.subscaleview.C0328R;
import kotlin.jvm.internal.AbstractC5227;
import p026.AbstractC7014;
import p034.AbstractC7082;
import p044.DialogC7148;
import p045.C7149;
import p303.AbstractC9234;
import p358.C9640;
import p402.C9903;
import p402.C9908;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6673 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16344;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16345;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ View f16346;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16347;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f16348;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16349;

    public /* synthetic */ ViewOnClickListenerC6673(Object obj, KeyEvent.Callback callback, Object obj2, Object obj3, View view, int i) {
        this.f16349 = i;
        this.f16347 = obj;
        this.f16348 = callback;
        this.f16345 = obj2;
        this.f16344 = obj3;
        this.f16346 = view;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuItem menuItemFindItem;
        int i = this.f16349;
        final int i2 = 1;
        View view2 = this.f16346;
        Object obj = this.f16344;
        Object obj2 = this.f16345;
        KeyEvent.Callback callback = this.f16348;
        Object obj3 = this.f16347;
        switch (i) {
            case 0:
                DialogC7148 dialogC7148 = (DialogC7148) callback;
                C6672 c6672 = (C6672) obj2;
                Context context = (Context) obj;
                CheckBox checkBox = (CheckBox) view2;
                String string = ((EditText) obj3).getText().toString();
                if (string.length() != 0) {
                    int i3 = Integer.parseInt(string);
                    c6672.f16339 = AbstractC7082.m12313(context, i3);
                    boolean zIsChecked = checkBox.isChecked();
                    C7149 c7149 = c6672.f16343;
                    c7149.getClass();
                    c7149.m12395(Integer.valueOf(i3), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜"));
                    C7149 c71492 = c6672.f16343;
                    c71492.getClass();
                    c71492.m12395(Boolean.valueOf(zIsChecked), AbstractC9234.m14531(2206));
                    C7149 c71493 = c6672.f16343;
                    c71493.getClass();
                    c71493.mo12394();
                    AbstractC7014.m12151(AbstractC9234.m14531(516));
                    dialogC7148.dismiss();
                } else {
                    AbstractC7014.m12151(AbstractC9234.m14531(2217));
                    dialogC7148.dismiss();
                }
                break;
            case 1:
                final C9640 c9640 = (C9640) obj3;
                final TextView textView = (TextView) callback;
                final String str = (String) obj2;
                final CustomRecycleView customRecycleView = (CustomRecycleView) obj;
                final ProgressBar progressBar = (ProgressBar) view2;
                PopupMenu popupMenu = new PopupMenu(textView.getContext(), textView);
                popupMenu.getMenuInflater().inflate(C0328R.menu.sort_menu, popupMenu.getMenu());
                String str2 = c9640.f25142;
                if (AbstractC5227.m9466(str2, "latest")) {
                    MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(C0328R.id.menu_sort_by_latest);
                    if (menuItemFindItem2 != null) {
                        menuItemFindItem2.setChecked(true);
                    }
                } else if (AbstractC5227.m9466(str2, "popular") && (menuItemFindItem = popupMenu.getMenu().findItem(C0328R.id.menu_sort_by_popular)) != null) {
                    menuItemFindItem.setChecked(true);
                }
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪世哲兰苏
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        String str3;
                        int itemId = menuItem.getItemId();
                        if (itemId == C0328R.id.menu_sort_by_latest) {
                            str3 = "latest";
                        } else {
                            if (itemId != C0328R.id.menu_sort_by_popular) {
                                return false;
                            }
                            str3 = "popular";
                        }
                        C9640 c96402 = c9640;
                        if (AbstractC5227.m9466(c96402.f25142, str3)) {
                            return true;
                        }
                        c96402.f25142 = str3;
                        TextView textView2 = (TextView) textView;
                        String str4 = "最新发布";
                        if (!AbstractC5227.m9466(str3, "latest") && AbstractC5227.m9466(str3, "popular")) {
                            str4 = "最多下载";
                        }
                        textView2.setText(str4);
                        c96402.m15043(str, customRecycleView, progressBar);
                        return true;
                    }
                });
                popupMenu.show();
                break;
            default:
                C9908 c9908 = (C9908) obj3;
                TextView textView2 = (TextView) callback;
                String str3 = (String) obj2;
                top.suzhelan.plugin.sdk.online.widget.CustomRecycleView customRecycleView2 = (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) obj;
                ProgressBar progressBar2 = (ProgressBar) view2;
                View viewInflate = LayoutInflater.from(textView2.getContext()).inflate(C0328R.layout.popup_sort_menu, (ViewGroup) null);
                viewInflate.getClass();
                ViewGroup viewGroup = (ViewGroup) viewInflate;
                PopupWindow popupWindow = new PopupWindow((View) viewGroup, -2, -2, true);
                popupWindow.setOutsideTouchable(true);
                final TextView textView3 = (TextView) viewGroup.findViewById(C0328R.id.sort_time);
                final TextView textView4 = (TextView) viewGroup.findViewById(C0328R.id.sort_download_desc);
                final TextView textView5 = (TextView) viewGroup.findViewById(C0328R.id.sort_download_asc);
                final TextView textView6 = (TextView) viewGroup.findViewById(C0328R.id.sort_random);
                String str4 = c9908.f25798;
                switch (str4.hashCode()) {
                    case -938285885:
                        if (str4.equals("random")) {
                            textView6.getClass();
                            C9908.m15213(textView3, textView4, textView5, textView6, textView6);
                        }
                        break;
                    case 3560141:
                        if (str4.equals("time")) {
                            textView3.getClass();
                            C9908.m15213(textView3, textView4, textView5, textView6, textView3);
                        }
                        break;
                    case 31392744:
                        if (str4.equals("download_desc")) {
                            textView4.getClass();
                            C9908.m15213(textView3, textView4, textView5, textView6, textView4);
                        }
                        break;
                    case 1109388858:
                        if (str4.equals("download_asc")) {
                            textView5.getClass();
                            C9908.m15213(textView3, textView4, textView5, textView6, textView5);
                        }
                        break;
                }
                final C9903 c9903 = new C9903(c9908, textView2, str3, customRecycleView2, progressBar2, popupWindow);
                final int i4 = 0;
                textView3.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世兰哲苏
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i5 = i4;
                        TextView textView7 = textView3;
                        C9903 c99032 = c9903;
                        switch (i5) {
                            case 0:
                                textView7.getClass();
                                c99032.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c99032.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c99032.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c99032.invoke("random", textView7);
                                break;
                        }
                    }
                });
                textView4.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世兰哲苏
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i5 = i2;
                        TextView textView7 = textView4;
                        C9903 c99032 = c9903;
                        switch (i5) {
                            case 0:
                                textView7.getClass();
                                c99032.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c99032.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c99032.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c99032.invoke("random", textView7);
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
                        C9903 c99032 = c9903;
                        switch (i52) {
                            case 0:
                                textView7.getClass();
                                c99032.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c99032.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c99032.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c99032.invoke("random", textView7);
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
                        C9903 c99032 = c9903;
                        switch (i52) {
                            case 0:
                                textView7.getClass();
                                c99032.invoke("time", textView7);
                                break;
                            case 1:
                                textView7.getClass();
                                c99032.invoke("download_desc", textView7);
                                break;
                            case 2:
                                textView7.getClass();
                                c99032.invoke("download_asc", textView7);
                                break;
                            default:
                                textView7.getClass();
                                c99032.invoke("random", textView7);
                                break;
                        }
                    }
                });
                popupWindow.showAsDropDown(textView2, 0, 8, 8388613);
                break;
        }
    }
}
