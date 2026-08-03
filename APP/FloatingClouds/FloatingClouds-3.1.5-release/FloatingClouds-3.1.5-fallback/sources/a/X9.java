package a;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"La/X9;", "Landroidx/fragment/app/b;", "<init>", "()V", "a", "b", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class X9 extends androidx.fragment.app.b {
    public top.mmjz.floatingclouds.databinding.FragmentMainBinding V;

    public static abstract class a {

        /* JADX INFO: renamed from: a.X9$a$a, reason: collision with other inner class name */
        public static final class C0000a extends a.X9.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final java.lang.String f338a;
            public final java.lang.String b;
            public final a.A3 c;

            public C0000a(java.lang.String r2, a.A3 r3) {
                    r1 = this;
                    java.lang.String r0 = "desc"
                    a.C0193i9.e(r2, r0)
                    r1.<init>()
                    java.lang.String r0 = "立即扫描适配"
                    r1.f338a = r0
                    r1.b = r2
                    r1.c = r3
                    return
            }

            public final boolean equals(java.lang.Object r3) {
                    r2 = this;
                    if (r2 != r3) goto L3
                    goto L2c
                L3:
                    boolean r0 = r3 instanceof a.X9.a.C0000a
                    if (r0 != 0) goto L8
                    goto L2a
                L8:
                    a.X9$a$a r3 = (a.X9.a.C0000a) r3
                    java.lang.String r0 = r3.f338a
                    java.lang.String r1 = r2.f338a
                    boolean r0 = a.C0193i9.a(r1, r0)
                    if (r0 != 0) goto L15
                    goto L2a
                L15:
                    java.lang.String r0 = r2.b
                    java.lang.String r1 = r3.b
                    boolean r0 = a.C0193i9.a(r0, r1)
                    if (r0 != 0) goto L20
                    goto L2a
                L20:
                    a.A3 r0 = r2.c
                    a.A3 r3 = r3.c
                    boolean r3 = a.C0193i9.a(r0, r3)
                    if (r3 != 0) goto L2c
                L2a:
                    r3 = 0
                    return r3
                L2c:
                    r3 = 1
                    return r3
            }

            public final int hashCode() {
                    r3 = this;
                    java.lang.String r0 = r3.f338a
                    int r0 = r0.hashCode()
                    r1 = 31
                    int r0 = r0 * r1
                    java.lang.String r2 = r3.b
                    int r0 = a.C0487z.b(r2, r0, r1)
                    a.A3 r1 = r3.c
                    int r1 = r1.hashCode()
                    int r1 = r1 + r0
                    return r1
            }

            public final java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "Button(title="
                    r0.<init>(r1)
                    java.lang.String r1 = r2.f338a
                    r0.append(r1)
                    java.lang.String r1 = ", desc="
                    r0.append(r1)
                    java.lang.String r1 = r2.b
                    r0.append(r1)
                    java.lang.String r1 = ", onClick="
                    r0.append(r1)
                    a.A3 r1 = r2.c
                    r0.append(r1)
                    java.lang.String r1 = ")"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public static final class b extends a.X9.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final java.lang.String f339a;
            public final java.lang.String b;
            public final boolean c;
            public final a.C0241l4 d;

            public b(boolean r2, a.C0241l4 r3) {
                    r1 = this;
                    r1.<init>()
                    java.lang.String r0 = "隐藏密友消息通知"
                    r1.f339a = r0
                    java.lang.String r0 = "密友被隐藏后自动设置微信原生免打扰，临时解除后恢复提醒"
                    r1.b = r0
                    r1.c = r2
                    r1.d = r3
                    return
            }

            public final boolean equals(java.lang.Object r3) {
                    r2 = this;
                    if (r2 != r3) goto L3
                    goto L33
                L3:
                    boolean r0 = r3 instanceof a.X9.a.b
                    if (r0 != 0) goto L8
                    goto L31
                L8:
                    a.X9$a$b r3 = (a.X9.a.b) r3
                    java.lang.String r0 = r3.f339a
                    java.lang.String r1 = r2.f339a
                    boolean r0 = a.C0193i9.a(r1, r0)
                    if (r0 != 0) goto L15
                    goto L31
                L15:
                    java.lang.String r0 = r2.b
                    java.lang.String r1 = r3.b
                    boolean r0 = a.C0193i9.a(r0, r1)
                    if (r0 != 0) goto L20
                    goto L31
                L20:
                    boolean r0 = r2.c
                    boolean r1 = r3.c
                    if (r0 == r1) goto L27
                    goto L31
                L27:
                    a.l4 r0 = r2.d
                    a.l4 r3 = r3.d
                    boolean r3 = a.C0193i9.a(r0, r3)
                    if (r3 != 0) goto L33
                L31:
                    r3 = 0
                    return r3
                L33:
                    r3 = 1
                    return r3
            }

            public final int hashCode() {
                    r3 = this;
                    java.lang.String r0 = r3.f339a
                    int r0 = r0.hashCode()
                    r1 = 31
                    int r0 = r0 * r1
                    java.lang.String r2 = r3.b
                    int r0 = a.C0487z.b(r2, r0, r1)
                    boolean r2 = r3.c
                    int r2 = java.lang.Boolean.hashCode(r2)
                    int r2 = r2 + r0
                    int r2 = r2 * r1
                    a.l4 r0 = r3.d
                    int r0 = r0.hashCode()
                    int r0 = r0 + r2
                    return r0
            }

            public final java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "Switch(title="
                    r0.<init>(r1)
                    java.lang.String r1 = r2.f339a
                    r0.append(r1)
                    java.lang.String r1 = ", desc="
                    r0.append(r1)
                    java.lang.String r1 = r2.b
                    r0.append(r1)
                    java.lang.String r1 = ", checked="
                    r0.append(r1)
                    boolean r1 = r2.c
                    r0.append(r1)
                    java.lang.String r1 = ", onCheckedChange="
                    r0.append(r1)
                    a.l4 r1 = r2.d
                    r0.append(r1)
                    java.lang.String r1 = ")"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class b extends androidx.recyclerview.widget.RecyclerView.d<androidx.recyclerview.widget.RecyclerView.A> {
        public final java.util.ArrayList d;

        public static final class a extends androidx.recyclerview.widget.RecyclerView.A {
            public final android.widget.TextView u;
            public final android.widget.TextView v;

            public a(android.view.View r3) {
                    r2 = this;
                    r2.<init>(r3)
                    int r0 = top.mmjz.floatingclouds.R.id.tvTitle
                    android.view.View r0 = r3.findViewById(r0)
                    java.lang.String r1 = "findViewById(...)"
                    a.C0193i9.d(r0, r1)
                    android.widget.TextView r0 = (android.widget.TextView) r0
                    r2.u = r0
                    int r0 = top.mmjz.floatingclouds.R.id.tvDesc
                    android.view.View r3 = r3.findViewById(r0)
                    a.C0193i9.d(r3, r1)
                    android.widget.TextView r3 = (android.widget.TextView) r3
                    r2.v = r3
                    return
            }
        }

        /* JADX INFO: renamed from: a.X9$b$b, reason: collision with other inner class name */
        public static final class C0001b extends androidx.recyclerview.widget.RecyclerView.A {
            public final android.widget.TextView u;
            public final android.widget.TextView v;
            public final androidx.appcompat.widget.SwitchCompat w;

            public C0001b(android.view.View r3) {
                    r2 = this;
                    r2.<init>(r3)
                    int r0 = top.mmjz.floatingclouds.R.id.tvTitle
                    android.view.View r0 = r3.findViewById(r0)
                    java.lang.String r1 = "findViewById(...)"
                    a.C0193i9.d(r0, r1)
                    android.widget.TextView r0 = (android.widget.TextView) r0
                    r2.u = r0
                    int r0 = top.mmjz.floatingclouds.R.id.tvDesc
                    android.view.View r0 = r3.findViewById(r0)
                    a.C0193i9.d(r0, r1)
                    android.widget.TextView r0 = (android.widget.TextView) r0
                    r2.v = r0
                    int r0 = top.mmjz.floatingclouds.R.id.switchCompat
                    android.view.View r3 = r3.findViewById(r0)
                    a.C0193i9.d(r3, r1)
                    androidx.appcompat.widget.SwitchCompat r3 = (androidx.appcompat.widget.SwitchCompat) r3
                    r2.w = r3
                    return
            }
        }

        public b(java.util.ArrayList r1) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.d
        public final int a() {
                r1 = this;
                java.util.ArrayList r0 = r1.d
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.d
        public final int c(int r2) {
                r1 = this;
                java.util.ArrayList r0 = r1.d
                java.lang.Object r2 = r0.get(r2)
                a.X9$a r2 = (a.X9.a) r2
                boolean r0 = r2 instanceof a.X9.a.b
                if (r0 == 0) goto Le
                r2 = 1
                return r2
            Le:
                boolean r2 = r2 instanceof a.X9.a.C0000a
                if (r2 == 0) goto L14
                r2 = 2
                return r2
            L14:
                a.Ob r2 = new a.Ob
                r2.<init>()
                throw r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView.d
        public final void d(androidx.recyclerview.widget.RecyclerView.A r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.d
                java.lang.Object r4 = r0.get(r4)
                a.X9$a r4 = (a.X9.a) r4
                boolean r0 = r4 instanceof a.X9.a.b
                java.lang.String r1 = "item"
                if (r0 == 0) goto L36
                a.X9$b$b r3 = (a.X9.b.C0001b) r3
                a.X9$a$b r4 = (a.X9.a.b) r4
                a.C0193i9.e(r4, r1)
                android.widget.TextView r0 = r3.u
                java.lang.String r1 = r4.f339a
                r0.setText(r1)
                android.widget.TextView r0 = r3.v
                java.lang.String r1 = r4.b
                r0.setText(r1)
                androidx.appcompat.widget.SwitchCompat r0 = r3.w
                boolean r1 = r4.c
                r0.setChecked(r1)
                a.Y9 r0 = new a.Y9
                r1 = 0
                r0.<init>(r4, r1, r3)
                android.view.View r3 = r3.f963a
                r3.setOnClickListener(r0)
                return
            L36:
                boolean r0 = r4 instanceof a.X9.a.C0000a
                if (r0 == 0) goto L5b
                a.X9$b$a r3 = (a.X9.b.a) r3
                a.X9$a$a r4 = (a.X9.a.C0000a) r4
                a.C0193i9.e(r4, r1)
                android.widget.TextView r0 = r3.u
                java.lang.String r1 = r4.f338a
                r0.setText(r1)
                android.widget.TextView r0 = r3.v
                java.lang.String r1 = r4.b
                r0.setText(r1)
                a.h3 r0 = new a.h3
                r1 = 2
                r0.<init>(r1, r4)
                android.view.View r3 = r3.f963a
                r3.setOnClickListener(r0)
                return
            L5b:
                a.Ob r3 = new a.Ob
                r3.<init>()
                throw r3
        }

        @Override // androidx.recyclerview.widget.RecyclerView.d
        public final androidx.recyclerview.widget.RecyclerView.A e(android.view.ViewGroup r4, int r5) {
                r3 = this;
                java.lang.String r0 = "parent"
                a.C0193i9.e(r4, r0)
                android.content.Context r0 = r4.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 1
                r2 = 0
                if (r5 != r1) goto L20
                int r5 = top.mmjz.floatingclouds.R.layout.item_setting_switch
                android.view.View r4 = r0.inflate(r5, r4, r2)
                a.X9$b$b r5 = new a.X9$b$b
                a.C0193i9.b(r4)
                r5.<init>(r4)
                return r5
            L20:
                int r5 = top.mmjz.floatingclouds.R.layout.item_setting_button
                android.view.View r4 = r0.inflate(r5, r4, r2)
                a.X9$b$a r5 = new a.X9$b$a
                a.C0193i9.b(r4)
                r5.<init>(r4)
                return r5
        }
    }

    public X9() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void F() {
            r6 = this;
            java.lang.String r0 = "Floatingclouds"
            java.lang.String r1 = "MainFragment refreshAdapter start"
            android.util.Log.i(r0, r1)
            a.K3$a r1 = a.K3.f148a
            r1.getClass()
            a.jc r1 = a.K3.a.i()
            boolean r2 = r1.r
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "MainFragment opt loaded hideMaskedMessageNotification="
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.i(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            a.X9$a$b r2 = new a.X9$a$b
            boolean r3 = r1.r
            a.l4 r4 = new a.l4
            r5 = 5
            r4.<init>(r6, r5, r1)
            r2.<init>(r3, r4)
            r0.add(r2)
            java.lang.String r1 = a.B1.a.a()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L41
            goto L43
        L41:
            java.lang.String r1 = "未知"
        L43:
            a.X9$a$a r2 = new a.X9$a$a
            java.lang.String r3 = "当前微信版本："
            java.lang.String r1 = r3.concat(r1)
            a.A3 r3 = new a.A3
            r4 = 3
            r3.<init>(r4, r6)
            r2.<init>(r1, r3)
            r0.add(r2)
            top.mmjz.floatingclouds.databinding.FragmentMainBinding r1 = r6.V
            a.C0193i9.b(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r1.settingsList
            a.X9$b r2 = new a.X9$b
            r2.<init>(r0)
            r1.setAdapter(r2)
            return
    }

    @Override // androidx.fragment.app.b
    public final android.view.View p(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            java.lang.String r3 = "inflater"
            a.C0193i9.e(r1, r3)
            r3 = 0
            top.mmjz.floatingclouds.databinding.FragmentMainBinding r1 = top.mmjz.floatingclouds.databinding.FragmentMainBinding.inflate(r1, r2, r3)
            r0.V = r1
            a.C0193i9.b(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r1.m0getRoot()
            return r1
    }

    @Override // androidx.fragment.app.b
    public final void q() {
            r1 = this;
            r0 = 1
            r1.E = r0
            r0 = 0
            r1.V = r0
            return
    }

    @Override // androidx.fragment.app.b
    public final void w(android.view.View r5) {
            r4 = this;
            java.lang.String r0 = "view"
            a.C0193i9.e(r5, r0)
            java.lang.String r5 = "Floatingclouds"
            java.lang.String r0 = "MainFragment onViewCreated"
            android.util.Log.i(r5, r0)
            android.content.Context r0 = r4.A()
            java.lang.String r1 = "Floatingclouds 设置页已加载"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            top.mmjz.floatingclouds.databinding.FragmentMainBinding r0 = r4.V
            a.C0193i9.b(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r0.settingsList
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.A()
            r2 = 1
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            r4.F()     // Catch: java.lang.Throwable -> L33
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L33
            goto L38
        L33:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L38:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L60
            java.lang.String r1 = "MainFragment refreshAdapter failed"
            android.util.Log.e(r5, r1, r0)
            android.content.Context r5 = r4.A()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "设置页加载失败: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r2)
            r5.show()
        L60:
            return
    }
}
