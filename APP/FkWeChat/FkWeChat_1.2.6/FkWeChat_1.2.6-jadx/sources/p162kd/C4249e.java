package p162kd;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cd.C1517b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import okhttp3.internal.url._UrlKt;
import p068ed.AbstractC2212a;
import p315vd.AbstractC8927g;

/* JADX INFO: renamed from: kd.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C4249e extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public Method f12432e;

    /* JADX INFO: renamed from: f */
    public Field f12433f;

    /* JADX INFO: renamed from: g */
    public Field f12434g;

    public C4249e() {
        this.f6040c = "ChatIdShowHook";
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m16733p(TextView textView, CharSequence charSequence, View view) {
        try {
            CharSequence text = textView.getText();
            if (text.equals("点击显示") || text.equals(charSequence)) {
                return true;
            }
            ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("account", text));
            AbstractC8927g.m34278c("已复制");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m16734t(InterfaceC5154i interfaceC5154i) {
        final TextView textView;
        try {
            if (m7973i() && (textView = (TextView) AbstractC5161p.getObjectField(interfaceC5154i.getThisObject(), this.f12433f.getName())) != null) {
                final CharSequence charSequence = (CharSequence) interfaceC5154i.getArgs()[0];
                textView.setVisibility(0);
                textView.setTextSize(12.0f);
                textView.setText("正在刷新");
                textView.setTextColor(-6710887);
                textView.postDelayed(new Runnable() { // from class: kd.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12423q.m16737s(textView, charSequence);
                    }
                }, 300L);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        Method method = C1517b.findMethod().pkg("com.tencent.mm.ui.").notPkg("com.tencent.mm.ui.chatting.").params("java.lang.CharSequence").returnType("void").modifiers(1).usingNumbers(0, Float.valueOf(18.0f), Float.valueOf(14.0f), 1).get();
        this.f12432e = method;
        if (method == null) {
            return false;
        }
        this.f12433f = C1517b.findField().modifiers(1).inClass(this.f12432e.getDeclaringClass()).type("android.widget.TextView").get(4);
        this.f12434g = C1517b.findField().modifiers(1).inClass("com.tencent.mm.pluginsdk.ui.chat.ChatFooter").type("java.lang.String").name("d").get();
        return true;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookAfter(this.f12432e, new InterfaceC5156k() { // from class: kd.a
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f12422a.m16734t(interfaceC5154i);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final View m16735q(String str, View view) {
        if (view == null) {
            return null;
        }
        try {
            if (view.getClass().getName().contains(str)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View viewM16735q = m16735q(str, viewGroup.getChildAt(i10));
                    if (viewM16735q != null) {
                        return viewM16735q;
                    }
                }
            }
        } catch (Throwable th) {
            m7965a("findView error", th);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m16736r(TextView textView, String str, CharSequence charSequence, View view) {
        try {
            boolean zM7967c = m7967c("show_wxid_mode", false);
            m7975l("show_wxid_mode", !zM7967c);
            if (!zM7967c) {
                textView.setText(str);
                textView.setTextColor(-553698);
                return;
            }
            if (charSequence == null || charSequence.length() == 0) {
                charSequence = "点击显示";
            }
            textView.setText(charSequence);
            textView.setTextColor(-14575885);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m16737s(final TextView textView, final CharSequence charSequence) {
        View viewM16735q;
        try {
            final String str = _UrlKt.FRAGMENT_ENCODE_SET;
            View rootView = textView.getRootView();
            if ((rootView instanceof ViewGroup) && (viewM16735q = m16735q("ChatFooter", rootView)) != null) {
                str = (String) AbstractC5161p.getObjectField(viewM16735q, this.f12434g.getName());
            }
            boolean zM7967c = m7967c("show_wxid_mode", false);
            textView.setTag("ChatIdShowHook");
            textView.setOnClickListener(new View.OnClickListener() { // from class: kd.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12426a.m16736r(textView, str, charSequence, view);
                }
            });
            textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: kd.d
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return C4249e.m16733p(textView, charSequence, view);
                }
            });
            if (zM7967c) {
                textView.setText(str);
                textView.setTextColor(-553698);
                return;
            }
            if (charSequence == null || charSequence.length() == 0) {
                charSequence = "点击显示";
            }
            textView.setText(charSequence);
            textView.setTextColor(-14575885);
        } catch (Throwable unused) {
        }
    }
}
