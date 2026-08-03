package p000a;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.ComponentCallbacksC1100b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import p000a.C0021B1;
import p000a.C0186K3;
import top.mmjz.floatingclouds.C1329R;
import top.mmjz.floatingclouds.databinding.FragmentMainBinding;

/* JADX INFO: renamed from: a.X9 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3303d2 = {"La/X9;", "Landroidx/fragment/app/b;", "<init>", "()V", "a", "b", "app_release"}, m3304k = 1, m3305mv = {2, 0, 0}, m3307xi = 48)
public final class C0425X9 extends ComponentCallbacksC1100b {

    /* JADX INFO: renamed from: V */
    public FragmentMainBinding f1591V;

    /* JADX INFO: renamed from: a.X9$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a.X9$a$a, reason: collision with other inner class name */
        public static final class C1333a extends a {

            /* JADX INFO: renamed from: a */
            public final String f1592a;

            /* JADX INFO: renamed from: b */
            public final String f1593b;

            /* JADX INFO: renamed from: c */
            public final C0004A3 f1594c;

            public C1333a(String str, C0004A3 c0004a3) {
                C0631i9.m1482e(str, "desc");
                this.f1592a = "立即扫描适配";
                this.f1593b = str;
                this.f1594c = c0004a3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1333a)) {
                    return false;
                }
                C1333a c1333a = (C1333a) obj;
                return C0631i9.m1478a(this.f1592a, c1333a.f1592a) && C0631i9.m1478a(this.f1593b, c1333a.f1593b) && C0631i9.m1478a(this.f1594c, c1333a.f1594c);
            }

            public final int hashCode() {
                return this.f1594c.hashCode() + C0944z.m2222b(this.f1593b, this.f1592a.hashCode() * 31, 31);
            }

            public final String toString() {
                return "Button(title=" + this.f1592a + ", desc=" + this.f1593b + ", onClick=" + this.f1594c + ")";
            }
        }

        /* JADX INFO: renamed from: a.X9$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public final String f1595a = "隐藏密友消息通知";

            /* JADX INFO: renamed from: b */
            public final String f1596b = "密友被隐藏后自动设置微信原生免打扰，临时解除后恢复提醒";

            /* JADX INFO: renamed from: c */
            public final boolean f1597c;

            /* JADX INFO: renamed from: d */
            public final C0683l4 f1598d;

            public b(boolean z, C0683l4 c0683l4) {
                this.f1597c = z;
                this.f1598d = c0683l4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C0631i9.m1478a(this.f1595a, bVar.f1595a) && C0631i9.m1478a(this.f1596b, bVar.f1596b) && this.f1597c == bVar.f1597c && C0631i9.m1478a(this.f1598d, bVar.f1598d);
            }

            public final int hashCode() {
                return this.f1598d.hashCode() + ((Boolean.hashCode(this.f1597c) + C0944z.m2222b(this.f1596b, this.f1595a.hashCode() * 31, 31)) * 31);
            }

            public final String toString() {
                return "Switch(title=" + this.f1595a + ", desc=" + this.f1596b + ", checked=" + this.f1597c + ", onCheckedChange=" + this.f1598d + ")";
            }
        }
    }

    /* JADX INFO: renamed from: a.X9$b */
    public static final class b extends RecyclerView.AbstractC1167d<RecyclerView.AbstractC1163A> {

        /* JADX INFO: renamed from: d */
        public final ArrayList f1599d;

        /* JADX INFO: renamed from: a.X9$b$a */
        public static final class a extends RecyclerView.AbstractC1163A {

            /* JADX INFO: renamed from: u */
            public final TextView f1600u;

            /* JADX INFO: renamed from: v */
            public final TextView f1601v;

            public a(View view) {
                super(view);
                View viewFindViewById = view.findViewById(C1329R.id.tvTitle);
                C0631i9.m1481d(viewFindViewById, "findViewById(...)");
                this.f1600u = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(C1329R.id.tvDesc);
                C0631i9.m1481d(viewFindViewById2, "findViewById(...)");
                this.f1601v = (TextView) viewFindViewById2;
            }
        }

        /* JADX INFO: renamed from: a.X9$b$b, reason: collision with other inner class name */
        public static final class C1334b extends RecyclerView.AbstractC1163A {

            /* JADX INFO: renamed from: u */
            public final TextView f1602u;

            /* JADX INFO: renamed from: v */
            public final TextView f1603v;

            /* JADX INFO: renamed from: w */
            public final SwitchCompat f1604w;

            public C1334b(View view) {
                super(view);
                View viewFindViewById = view.findViewById(C1329R.id.tvTitle);
                C0631i9.m1481d(viewFindViewById, "findViewById(...)");
                this.f1602u = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(C1329R.id.tvDesc);
                C0631i9.m1481d(viewFindViewById2, "findViewById(...)");
                this.f1603v = (TextView) viewFindViewById2;
                View viewFindViewById3 = view.findViewById(C1329R.id.switchCompat);
                C0631i9.m1481d(viewFindViewById3, "findViewById(...)");
                this.f1604w = (SwitchCompat) viewFindViewById3;
            }
        }

        public b(ArrayList arrayList) {
            this.f1599d = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
        /* JADX INFO: renamed from: a */
        public final int mo109a() {
            return this.f1599d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
        /* JADX INFO: renamed from: c */
        public final int mo1072c(int i) {
            a aVar = (a) this.f1599d.get(i);
            if (aVar instanceof a.b) {
                return 1;
            }
            if (aVar instanceof a.C1333a) {
                return 2;
            }
            throw new C0266Ob();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
        /* JADX INFO: renamed from: d */
        public final void mo110d(RecyclerView.AbstractC1163A abstractC1163A, int i) {
            a aVar = (a) this.f1599d.get(i);
            if (aVar instanceof a.b) {
                C1334b c1334b = (C1334b) abstractC1163A;
                a.b bVar = (a.b) aVar;
                C0631i9.m1482e(bVar, "item");
                c1334b.f1602u.setText(bVar.f1595a);
                c1334b.f1603v.setText(bVar.f1596b);
                c1334b.f1604w.setChecked(bVar.f1597c);
                c1334b.f4891a.setOnClickListener(new ViewOnClickListenerC0443Y9(bVar, 0, c1334b));
                return;
            }
            if (!(aVar instanceof a.C1333a)) {
                throw new C0266Ob();
            }
            a aVar2 = (a) abstractC1163A;
            a.C1333a c1333a = (a.C1333a) aVar;
            C0631i9.m1482e(c1333a, "item");
            aVar2.f1600u.setText(c1333a.f1592a);
            aVar2.f1601v.setText(c1333a.f1593b);
            aVar2.f4891a.setOnClickListener(new ViewOnClickListenerC0606h3(2, c1333a));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
        /* JADX INFO: renamed from: e */
        public final RecyclerView.AbstractC1163A mo111e(ViewGroup viewGroup, int i) {
            C0631i9.m1482e(viewGroup, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            if (i == 1) {
                View viewInflate = layoutInflaterFrom.inflate(C1329R.layout.item_setting_switch, viewGroup, false);
                C0631i9.m1479b(viewInflate);
                return new C1334b(viewInflate);
            }
            View viewInflate2 = layoutInflaterFrom.inflate(C1329R.layout.item_setting_button, viewGroup, false);
            C0631i9.m1479b(viewInflate2);
            return new a(viewInflate2);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m1069F() {
        String strValueOf;
        Log.i("Floatingclouds", "MainFragment refreshAdapter start");
        C0186K3.f638a.getClass();
        C0653jc c0653jcM508i = C0186K3.a.m508i();
        Log.i("Floatingclouds", "MainFragment opt loaded hideMaskedMessageNotification=" + c0653jcM508i.f2448r);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a.b(c0653jcM508i.f2448r, new C0683l4(this, 5, c0653jcM508i)));
        try {
            strValueOf = String.valueOf(C0021B1.a.m54a());
        } catch (Exception unused) {
            strValueOf = "未知";
        }
        arrayList.add(new a.C1333a("当前微信版本：".concat(strValueOf), new C0004A3(3, this)));
        FragmentMainBinding fragmentMainBinding = this.f1591V;
        C0631i9.m1479b(fragmentMainBinding);
        fragmentMainBinding.settingsList.setAdapter(new b(arrayList));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: p */
    public final View mo995p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0631i9.m1482e(layoutInflater, "inflater");
        FragmentMainBinding fragmentMainBindingInflate = FragmentMainBinding.inflate(layoutInflater, viewGroup, false);
        this.f1591V = fragmentMainBindingInflate;
        C0631i9.m1479b(fragmentMainBindingInflate);
        return fragmentMainBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: q */
    public final void mo1070q() {
        this.f4541E = true;
        this.f1591V = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: w */
    public final void mo1071w(View view) {
        Object objM2206a;
        C0631i9.m1482e(view, "view");
        Log.i("Floatingclouds", "MainFragment onViewCreated");
        Toast.makeText(m2524A(), "Floatingclouds 设置页已加载", 0).show();
        FragmentMainBinding fragmentMainBinding = this.f1591V;
        C0631i9.m1479b(fragmentMainBinding);
        RecyclerView recyclerView = fragmentMainBinding.settingsList;
        m2524A();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        try {
            m1069F();
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            Log.e("Floatingclouds", "MainFragment refreshAdapter failed", thM2189a);
            Toast.makeText(m2524A(), "设置页加载失败: " + thM2189a.getMessage(), 1).show();
        }
    }
}
