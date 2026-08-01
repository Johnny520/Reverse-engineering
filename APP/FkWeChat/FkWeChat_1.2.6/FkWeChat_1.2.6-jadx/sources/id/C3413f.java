package id;

import android.R;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import cd.C1517b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.core.config.AppConfig;
import me.yun.fkwechat.loader.api.HookEngine;
import p068ed.AbstractC2212a;
import p315vd.AbstractC8921a;
import p315vd.AbstractC8925e;
import sd.C7783za;
import ye.C9797a;
import ye.C9805i;

/* JADX INFO: renamed from: id.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3413f extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public Method f9403e;

    /* JADX INFO: renamed from: f */
    public Method f9404f;

    /* JADX INFO: renamed from: g */
    public Field f9405g;

    /* JADX INFO: renamed from: h */
    public Field f9406h;

    /* JADX INFO: renamed from: i */
    public Field f9407i;

    /* JADX INFO: renamed from: id.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements ListAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ListAdapter f9408a;

        public a(ListAdapter listAdapter) {
            this.f9408a = listAdapter;
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return this.f9408a.areAllItemsEnabled();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f9408a.getCount() + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return i10 == 0 ? "自定义按钮" : this.f9408a.getItem(i10 - 1);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            ListAdapter listAdapter = this.f9408a;
            return i10 == 0 ? listAdapter.getItemViewType(0) : listAdapter.getItemViewType(i10 - 1);
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            ListAdapter listAdapter = this.f9408a;
            if (i10 != 0) {
                return listAdapter.getView(i10 - 1, view, viewGroup);
            }
            View view2 = listAdapter.getView(0, view, viewGroup);
            TextView textViewM12767u = C3413f.this.m12767u(view2);
            if (textViewM12767u != null) {
                textViewM12767u.setText("插件管理");
            }
            ImageView imageViewM12766t = C3413f.this.m12766t(view2);
            if (imageViewM12766t != null) {
                try {
                    String strConcat = AppConfig.hostMediaPath + "/FkWeChat/Resource";
                    if (!strConcat.endsWith("/")) {
                        strConcat = strConcat.concat("/");
                    }
                    imageViewM12766t.setImageBitmap(AbstractC8925e.m34273b(strConcat, "icon.png", "assets.zip"));
                    imageViewM12766t.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    return view2;
                } catch (Exception unused) {
                    imageViewM12766t.setImageResource(R.drawable.ic_menu_add);
                }
            }
            return view2;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return this.f9408a.getViewTypeCount();
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            return false;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return this.f9408a.isEmpty();
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f9408a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f9408a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m12758n(C9805i c9805i) {
        c9805i.m38121e(1);
        c9805i.m38125k(C9797a.m38100h().m38111n("android.widget.PopupWindow"));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m12759o(C9805i c9805i) {
        c9805i.m38121e(1);
        c9805i.m38125k(C9797a.m38100h().m38111n("android.widget.ListView"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m12764v(InterfaceC5154i interfaceC5154i) {
        try {
            ListAdapter listAdapter = (ListAdapter) interfaceC5154i.getArgs()[0];
            if (listAdapter == null) {
                return;
            }
            interfaceC5154i.setArg(0, new a(listAdapter));
        } catch (Throwable th) {
            m7965a("setAdapter error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m12765x(InterfaceC5154i interfaceC5154i) {
        try {
            final Object thisObject = interfaceC5154i.getThisObject();
            Object obj = this.f9405g.get(thisObject);
            if (obj == null) {
                return;
            }
            obj.getClass().getMethod("setOnItemClickListener", AdapterView.OnItemClickListener.class).invoke(obj, new AdapterView.OnItemClickListener() { // from class: id.e
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                    this.f9401a.m12768w(thisObject, adapterView, view, i10, j10);
                }
            });
        } catch (Throwable th) {
            m7965a("showMethod after hook error", th);
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        this.f9403e = C1517b.findMethod().inClass("com.tencent.mm.ui.base.MMListPopupWindow").returnType("void").params("android.widget.ListAdapter").get();
        Method method = C1517b.findMethod().inClass("com.tencent.mm.ui.base.MMListPopupWindow").usingNumbers(17, 53, 1073741824).paramCount(0).returnType("void").get();
        this.f9404f = method;
        if (method == null) {
            return false;
        }
        String name = method.getDeclaringClass().getName();
        this.f9405g = C1517b.findField().inClass(name).matcher(new Consumer() { // from class: id.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C3413f.m12759o((C9805i) obj);
            }
        }).get();
        this.f9406h = C1517b.findField().inClass(name).modifiers(1).type("android.widget.AdapterView$OnItemClickListener").get();
        this.f9407i = C1517b.findField().inClass(name).matcher(new Consumer() { // from class: id.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C3413f.m12758n((C9805i) obj);
            }
        }).get();
        return true;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookBefore(this.f9403e, new InterfaceC5156k() { // from class: id.c
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f9399a.m12764v(interfaceC5154i);
            }
        });
        Method method = this.f9404f;
        if (method == null) {
            return;
        }
        HookEngine.hookAfter(method, new InterfaceC5156k() { // from class: id.d
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f9400a.m12765x(interfaceC5154i);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final ImageView m12766t(View view) {
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            ImageView imageViewM12766t = m12766t(viewGroup.getChildAt(i10));
            if (imageViewM12766t != null) {
                return imageViewM12766t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final TextView m12767u(View view) {
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            TextView textViewM12767u = m12767u(viewGroup.getChildAt(i10));
            if (textViewM12767u != null) {
                return textViewM12767u;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m12768w(Object obj, AdapterView adapterView, View view, int i10, long j10) {
        try {
            if (i10 == 0) {
                C7783za.m30210b(AbstractC8921a.m34259a());
                Object obj2 = this.f9407i.get(obj);
                obj2.getClass().getMethod("dismiss", null).invoke(obj2, null);
            } else {
                AdapterView.OnItemClickListener onItemClickListener = (AdapterView.OnItemClickListener) this.f9406h.get(obj);
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(adapterView, view, i10 - 1, j10);
                }
            }
        } catch (Throwable th) {
            m7965a("showMethod click intercept", th);
        }
    }
}
