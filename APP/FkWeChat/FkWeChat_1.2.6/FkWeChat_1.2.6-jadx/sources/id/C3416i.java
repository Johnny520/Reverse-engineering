package id;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p068ed.AbstractC2212a;

/* JADX INFO: renamed from: id.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3416i extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public static boolean f9412e;

    /* JADX INFO: renamed from: id.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ View f9413q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ View f9414r;

        public a(View view, View view2) {
            this.f9413q = view;
            this.f9414r = view2;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            TextView textViewM12773q = C3416i.this.m12773q(this.f9413q);
            if (textViewM12773q == null) {
                return true;
            }
            String string = textViewM12773q.getText().toString();
            if (string.contains("账号") || string.contains("帐号") || string.contains("Account")) {
                if (this.f9414r.getVisibility() == 0) {
                    return true;
                }
                this.f9414r.setVisibility(0);
                return true;
            }
            if (this.f9414r.getVisibility() == 8) {
                return true;
            }
            this.f9414r.setVisibility(8);
            return true;
        }
    }

    /* JADX INFO: renamed from: p */
    private ImageView m12772p(View view) {
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            ImageView imageViewM12772p = m12772p(viewGroup.getChildAt(i10));
            if (imageViewM12772p != null) {
                return imageViewM12772p;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public TextView m12773q(View view) {
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            TextView textViewM12773q = m12773q(viewGroup.getChildAt(i10));
            if (textViewM12773q != null) {
                return textViewM12773q;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m12774r(InterfaceC5154i interfaceC5154i) {
        if (f9412e) {
            return;
        }
        int iIntValue = ((Integer) interfaceC5154i.getArgs()[0]).intValue();
        View view = (View) interfaceC5154i.getResult();
        if (view != null && iIntValue == 2131498281) {
            final Context context = view.getContext();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            linearLayout.setLayoutParams(layoutParams != null ? new LinearLayout.LayoutParams(layoutParams.width, -2) : new LinearLayout.LayoutParams(-1, -2));
            f9412e = true;
            View viewInflate = LayoutInflater.from(context).inflate(2131498281, (ViewGroup) linearLayout, false);
            f9412e = false;
            TextView textViewM12773q = m12773q(viewInflate);
            if (textViewM12773q != null) {
                textViewM12773q.setText("插件管理");
            }
            ImageView imageViewM12772p = m12772p(viewInflate);
            if (imageViewM12772p != null) {
                imageViewM12772p.setVisibility(0);
            }
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: id.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Toast.makeText(context, "点击了", 0).show();
                }
            });
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView(view, layoutParams2);
            linearLayout.addView(viewInflate, layoutParams2);
            viewInflate.setVisibility(8);
            linearLayout.getViewTreeObserver().addOnPreDrawListener(new a(view, viewInflate));
            interfaceC5154i.setResult(linearLayout);
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        return true;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookAfter(AbstractC5161p.findMethodExact(LayoutInflater.class, "inflate", Integer.TYPE, ViewGroup.class, Boolean.TYPE), new InterfaceC5156k() { // from class: id.g
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f9410a.m12774r(interfaceC5154i);
            }
        });
    }
}
