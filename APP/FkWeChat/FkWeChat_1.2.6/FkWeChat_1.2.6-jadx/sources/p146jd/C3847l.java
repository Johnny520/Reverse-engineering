package p146jd;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import me.yun.fkwechat.core.config.AppConfig;
import okhttp3.internal.url._UrlKt;
import p053dd.C1951c;
import p068ed.InterfaceC2214c;
import p084fd.AbstractC2427g;
import p315vd.AbstractC8921a;
import p315vd.AbstractC8924d;
import p315vd.AbstractC8925e;
import sd.C7632rb;

/* JADX INFO: renamed from: jd.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3847l implements InterfaceC2214c {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15279e(C1951c c1951c, String str, View view) {
        int i10 = c1951c.type;
        if (i10 == 1) {
            AbstractC2427g.m8774l(c1951c.talker, str);
        } else if (i10 == 822083633 || i10 == 1040187441 || i10 == 1090519089) {
            AbstractC2427g.m8765c(c1951c.talker, str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m15280f(C1951c c1951c, View view) {
        int i10 = c1951c.type;
        Activity activityM34259a = AbstractC8921a.m34259a();
        if (activityM34259a == null) {
            return true;
        }
        C7632rb.m29510d(activityM34259a, c1951c);
        return true;
    }

    @Override // p068ed.InterfaceC2214c
    /* JADX INFO: renamed from: b */
    public void mo7977b(View view, C1951c c1951c) {
        int i10;
        try {
            boolean z10 = getBoolean("msg_plus_one_repeat", false);
            View viewM7978c = m7978c("ChattingImgMvvmView", view);
            if (viewM7978c == null) {
                viewM7978c = m7978c("ChattingVideoMvvmView", view);
            }
            if (viewM7978c == null) {
                viewM7978c = m7978c("ChattingEmojiMvvmView", view);
            }
            if (viewM7978c == null) {
                viewM7978c = m7978c("RoundCornerRelativeLayout", view);
            }
            if (viewM7978c == null) {
                viewM7978c = m7978c("ChattingNewFileMvvmView", view);
            }
            if (viewM7978c == null) {
                viewM7978c = m7978c("MMNeat7extView", view);
            }
            if (viewM7978c != null) {
                ViewParent parent = viewM7978c.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    View viewFindViewWithTag = viewGroup.findViewWithTag("my_added_icon");
                    if (z10 && ((i10 = c1951c.type) == 822083633 || i10 == 1 || i10 == 3 || i10 == 43 || i10 == 47 || i10 == 1040187441 || i10 == 1090519089)) {
                        if (viewFindViewWithTag instanceof ImageView) {
                            ImageView imageView = (ImageView) viewFindViewWithTag;
                            imageView.setVisibility(0);
                            m15281g(imageView, c1951c);
                            return;
                        }
                        ImageView imageView2 = new ImageView(viewM7978c.getContext());
                        imageView2.setTag("my_added_icon");
                        view.getContext();
                        imageView2.setImageBitmap(AbstractC8925e.m34273b(AppConfig.hostMediaPath + "/FkWeChat/Resource/", "+1.png", "assets.zip"));
                        int iM7979d = m7979d(view, 23.0f);
                        if (viewGroup instanceof LinearLayout) {
                            LinearLayout linearLayout = (LinearLayout) viewGroup;
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM7979d, iM7979d);
                            layoutParams.gravity = 80;
                            layoutParams.bottomMargin = m7979d(view, 8.0f);
                            if (c1951c.isSend == 0) {
                                layoutParams.leftMargin = m7979d(view, 10.0f);
                                linearLayout.addView(imageView2, linearLayout.indexOfChild(viewM7978c) + 1);
                            } else {
                                layoutParams.rightMargin = m7979d(view, 10.0f);
                                if (c1951c.type == 1) {
                                    linearLayout.setOrientation(0);
                                    linearLayout.addView(imageView2, linearLayout.indexOfChild(viewM7978c));
                                } else {
                                    linearLayout.addView(imageView2, linearLayout.indexOfChild(viewM7978c) - 1);
                                }
                            }
                            imageView2.setLayoutParams(layoutParams);
                        } else if (viewGroup instanceof RelativeLayout) {
                            RelativeLayout relativeLayout = (RelativeLayout) viewGroup;
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iM7979d, iM7979d);
                            layoutParams2.bottomMargin = m7979d(view, 8.0f);
                            if (c1951c.isSend == 0) {
                                layoutParams2.leftMargin = m7979d(view, 10.0f);
                                layoutParams2.addRule(1, viewM7978c.getId());
                                layoutParams2.addRule(8, viewM7978c.getId());
                                imageView2.setLayoutParams(layoutParams2);
                                relativeLayout.addView(imageView2);
                            }
                        }
                        m15281g(imageView2, c1951c);
                        return;
                    }
                    if (viewFindViewWithTag != null) {
                        viewGroup.removeView(viewFindViewWithTag);
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC8924d.m34265e("RepeatHandler", th);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15281g(ImageView imageView, final C1951c c1951c) {
        final String strReplaceAll = c1951c.content.replaceAll("^[^:]+:\n", _UrlKt.FRAGMENT_ENCODE_SET);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: jd.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3847l.m15279e(c1951c, strReplaceAll, view);
            }
        });
        imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: jd.k
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C3847l.m15280f(c1951c, view);
            }
        });
    }
}
