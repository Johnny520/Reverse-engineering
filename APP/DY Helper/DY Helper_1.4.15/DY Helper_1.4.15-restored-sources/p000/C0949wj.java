package p000;

/* JADX INFO: renamed from: wj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0949wj implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11742;

    public /* synthetic */ C0949wj(int r1) {
            r0 = this;
            r0.f11742 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r6 = r6.f11742
            java.lang.Class<android.widget.ImageView> r0 = android.widget.ImageView.class
            r1 = 11
            java.lang.Class<android.widget.TextView> r2 = android.widget.TextView.class
            r3 = 1
            r4 = 0
            s62 r5 = p000.s62.f9751
            switch(r6) {
                case 0: goto L3bb;
                case 1: goto L39b;
                case 2: goto L389;
                case 3: goto L377;
                case 4: goto L344;
                case 5: goto L335;
                case 6: goto L32e;
                case 7: goto L31e;
                case 8: goto L30e;
                case 9: goto L2eb;
                case 10: goto L2cb;
                case 11: goto L2c2;
                case 12: goto L2aa;
                case 13: goto L292;
                case 14: goto L266;
                case 15: goto L24a;
                case 16: goto L238;
                case 17: goto L22c;
                case 18: goto L225;
                case 19: goto L219;
                case 20: goto L1d5;
                case 21: goto L1b1;
                case 22: goto L16b;
                case 23: goto L164;
                case 24: goto L144;
                case 25: goto L139;
                case 26: goto L129;
                case 27: goto L38;
                case 28: goto L1d;
                default: goto Lf;
            }
        Lf:
            org.luckypray.dexkit.query.FindMethod r7 = (org.luckypray.dexkit.query.FindMethod) r7
            r7.getClass()
            ul r6 = new ul
            r6.<init>(r3)
            r7.matcher(r6)
            return r5
        L1d:
            org.luckypray.dexkit.query.matchers.MethodMatcher r7 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r7
            r7.getClass()
            java.lang.String r6 = "void"
            r7.setReturnType(r6)
            java.lang.String r6 = "int"
            java.lang.String r0 = "java.lang.String"
            java.lang.String r1 = "boolean"
            java.lang.String r2 = "android.view.View"
            r3 = 0
            java.lang.String[] r6 = new java.lang.String[]{r1, r2, r3, r6, r0}
            r7.paramTypes(r6)
            return r5
        L38:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.getClass()
            int r6 = r7.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L49
            goto L123
        L49:
            java.lang.Class[] r6 = r7.getParameterTypes()
            r6.getClass()
            int r6 = r6.length
            if (r6 != 0) goto L123
            java.lang.String r6 = r7.getName()
            if (r6 == 0) goto L86
            int r0 = r6.hashCode()
            switch(r0) {
                case -1776922004: goto L7c;
                case -1295482945: goto L73;
                case 147696667: goto L6a;
                case 1950568386: goto L61;
                default: goto L60;
            }
        L60:
            goto L86
        L61:
            java.lang.String r0 = "getClass"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L123
            goto L86
        L6a:
            java.lang.String r0 = "hashCode"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L123
            goto L86
        L73:
            java.lang.String r0 = "equals"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L123
            goto L86
        L7c:
            java.lang.String r0 = "toString"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L86
            goto L123
        L86:
            java.lang.Class r7 = r7.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r7, r0)
            if (r0 == 0) goto L94
            goto L123
        L94:
            boolean r0 = r7.isPrimitive()
            if (r0 == 0) goto L9c
            goto L123
        L9c:
            r6.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = p000.AbstractC0602nx.m4134(r0, r6, r0)
            java.lang.String r1 = r7.getName()
            java.lang.String r0 = r1.toLowerCase(r0)
            r0.getClass()
            java.lang.String r1 = "get"
            boolean r1 = p000.x02.m6485(r6, r1, r4)
            if (r1 != 0) goto Lcb
            java.lang.String r1 = "is"
            boolean r1 = p000.x02.m6485(r6, r1, r4)
            if (r1 != 0) goto Lcb
            java.lang.String r1 = "liz"
            boolean r6 = p000.x02.m6485(r6, r1, r4)
            if (r6 == 0) goto Lc9
            goto Lcb
        Lc9:
            r6 = r4
            goto Lcc
        Lcb:
            r6 = r3
        Lcc:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L11d
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            boolean r1 = r1.isAssignableFrom(r7)
            if (r1 != 0) goto L11d
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r1 = r1.isAssignableFrom(r7)
            if (r1 != 0) goto L11d
            boolean r7 = r7.isArray()
            if (r7 != 0) goto L11d
            java.lang.String r7 = "emoji"
            boolean r7 = p000.q02.m4654(r0, r7, r4)
            if (r7 != 0) goto L11d
            java.lang.String r7 = "url"
            boolean r7 = p000.q02.m4654(r0, r7, r4)
            if (r7 != 0) goto L11d
            java.lang.String r7 = "image"
            boolean r7 = p000.q02.m4654(r0, r7, r4)
            if (r7 != 0) goto L11d
            java.lang.String r7 = "icon"
            boolean r7 = p000.q02.m4654(r0, r7, r4)
            if (r7 != 0) goto L11d
            java.lang.String r7 = "model"
            boolean r7 = p000.q02.m4654(r0, r7, r4)
            if (r7 != 0) goto L11d
            java.lang.String r7 = "x."
            boolean r7 = p000.x02.m6485(r0, r7, r4)
            if (r7 == 0) goto L11b
            goto L11d
        L11b:
            r7 = r4
            goto L11e
        L11d:
            r7 = r3
        L11e:
            if (r6 == 0) goto L123
            if (r7 == 0) goto L123
            goto L124
        L123:
            r3 = r4
        L124:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L129:
            org.luckypray.dexkit.query.FindMethod r7 = (org.luckypray.dexkit.query.FindMethod) r7
            r7.getClass()
            wj r6 = new wj
            r0 = 28
            r6.<init>(r0)
            r7.matcher(r6)
            return r5
        L139:
            java.lang.ClassLoader r7 = (java.lang.ClassLoader) r7
            r7.getClass()
            ql r6 = p000.C0728ql.f9031
            p000.C0728ql.m4896(r7)
            return r5
        L144:
            java.lang.ClassLoader r7 = (java.lang.ClassLoader) r7
            r7.getClass()
            qx r6 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6219
            java.lang.String r0 = p000.C0666ox.m4320(r0, r7)
            cb r1 = new cb
            r2 = 19
            r1.<init>(r7, r2)
            java.lang.String r7 = "定位评论相似表情入口方法"
            r6.<init>(r0, r7, r1)
            java.util.List r6 = p000.AbstractC1021yh.m6896(r6)
            return r6
        L164:
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r6 = r7.getName()
            return r6
        L16b:
            java.lang.Class r7 = (java.lang.Class) r7
            r7.getClass()
            java.lang.String r6 = r7.getName()
            java.lang.String r0 = "mention"
            boolean r6 = p000.q02.m4654(r6, r0, r3)
            if (r6 != 0) goto L1ac
            java.lang.reflect.Method[] r6 = r7.getMethods()
            r6.getClass()
            int r7 = r6.length
            r0 = r4
        L185:
            if (r0 >= r7) goto L1ab
            r1 = r6[r0]
            java.lang.Class[] r2 = r1.getParameterTypes()
            r2.getClass()
            int r2 = r2.length
            if (r2 != 0) goto L1a8
            java.lang.Class r1 = r1.getReturnType()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943129D06B299C122F389D8E0B4BD36388D018B3D8B8988"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1a8
            goto L1ac
        L1a8:
            int r0 = r0 + 1
            goto L185
        L1ab:
            r3 = r4
        L1ac:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L1b1:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            ll r6 = p000.C0516ll.f6699
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L1ca
            p000.C0516ll.m3589()
            goto L1d4
        L1ca:
            android.os.Handler r6 = p000.C0516ll.f6700
            s0 r7 = new s0
            r7.<init>(r1)
            r6.post(r7)
        L1d4:
            return r5
        L1d5:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.lang.String r6 = "*"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L1fa
            java.lang.String r6 = "comment_control_custom_enabled"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L1fa
            java.lang.String r6 = "comment_content_color_skip_mention"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L1fa
            java.lang.String r6 = "comment_control_"
            boolean r6 = p000.x02.m6485(r7, r6, r4)
            if (r6 == 0) goto L218
        L1fa:
            ll r6 = p000.C0516ll.f6699
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L20e
            p000.C0516ll.m3589()
            goto L218
        L20e:
            android.os.Handler r6 = p000.C0516ll.f6700
            s0 r7 = new s0
            r7.<init>(r1)
            r6.post(r7)
        L218:
            return r5
        L219:
            fk r7 = (p000.C0288fk) r7
            r7.getClass()
            java.lang.Class r6 = r7.f3972
            java.lang.String r6 = r6.getSimpleName()
            return r6
        L225:
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r6 = r7.getName()
            return r6
        L22c:
            ik r7 = (p000.C0398ik) r7
            r7.getClass()
            java.lang.Class r6 = r7.f5099
            java.lang.String r6 = r6.getSimpleName()
            return r6
        L238:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            java.lang.Class r6 = r7.getType()
            boolean r6 = r2.isAssignableFrom(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L24a:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            java.lang.Class r6 = r7.getType()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "~79504AF3D2914B0617A99E1CFF7630F352162A9DD9ED0E0697077C8BEF44AF3C8C111F9FECBA549AE7343AC47496E6BC9D"
            java.lang.String r7 = p000.jf0.m2957(r7)
            boolean r6 = r6.equals(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L266:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            java.lang.Class r6 = r7.getType()
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = ".BuryView"
            boolean r6 = p000.x02.m6479(r6, r0, r4)
            if (r6 != 0) goto L28d
            java.lang.Class r6 = r7.getType()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = ".BuryView2"
            boolean r6 = p000.x02.m6479(r6, r7, r4)
            if (r6 == 0) goto L28c
            goto L28d
        L28c:
            r3 = r4
        L28d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L292:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            java.lang.Class r6 = r7.getType()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = ".DiggNewView"
            boolean r6 = p000.x02.m6479(r6, r7, r4)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L2aa:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            java.lang.Class r6 = r7.getType()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = ".DiggOldView"
            boolean r6 = p000.x02.m6479(r6, r7, r4)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L2c2:
            java.lang.ClassLoader r7 = (java.lang.ClassLoader) r7
            r7.getClass()
            p000.AbstractC0081bl.m977(r7)
            return r5
        L2cb:
            java.lang.ClassLoader r7 = (java.lang.ClassLoader) r7
            r7.getClass()
            qx r6 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6145
            java.lang.String r0 = p000.C0666ox.m4306(r0, r7)
            cb r1 = new cb
            r2 = 18
            r1.<init>(r7, r2)
            java.lang.String r7 = "定位评论旧式 ViewHolder"
            r6.<init>(r0, r7, r1)
            java.util.List r6 = p000.AbstractC1021yh.m6896(r6)
            return r6
        L2eb:
            org.luckypray.dexkit.query.matchers.FieldsMatcher r7 = (org.luckypray.dexkit.query.matchers.FieldsMatcher) r7
            r7.getClass()
            uj r6 = new uj
            r0 = 17
            r6.<init>(r0)
            r7.add(r6)
            uj r6 = new uj
            r0 = 27
            r6.<init>(r0)
            r7.add(r6)
            wj r6 = new wj
            r0 = 5
            r6.<init>(r0)
            r7.add(r6)
            return r5
        L30e:
            org.luckypray.dexkit.query.matchers.ClassMatcher r7 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r7
            r7.getClass()
            wj r6 = new wj
            r0 = 9
            r6.<init>(r0)
            r7.fields(r6)
            return r5
        L31e:
            org.luckypray.dexkit.query.FindClass r7 = (org.luckypray.dexkit.query.FindClass) r7
            r7.getClass()
            wj r6 = new wj
            r0 = 8
            r6.<init>(r0)
            r7.matcher(r6)
            return r5
        L32e:
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r6 = r7.getName()
            return r6
        L335:
            org.luckypray.dexkit.query.matchers.FieldMatcher r7 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r7
            r7.getClass()
            java.lang.String r6 = "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A6499963BE1D3A49484E8BEB0B611570272AC88E18D"
            java.lang.String r6 = p000.jf0.m2957(r6)
            r7.setType(r6)
            return r5
        L344:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            java.lang.Class r6 = r7.getType()
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = "~79380C0D9D92A341B10DD9D9D717B6FACDF8DA2405C1D35872475FB38843A3806391E9448AD9C33A9B847F"
            java.lang.String r1 = p000.jf0.m2957(r0)
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L372
            kk r6 = p000.C0472kk.f5953
            java.lang.Class r6 = r7.getType()
            r6.getClass()
            java.lang.String r7 = p000.jf0.m2957(r0)
            boolean r6 = p000.C0472kk.m3291(r6, r7)
            if (r6 == 0) goto L371
            goto L372
        L371:
            r3 = r4
        L372:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L377:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            java.lang.Class r6 = r7.getType()
            boolean r6 = r2.isAssignableFrom(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L389:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            java.lang.Class r6 = r7.getType()
            boolean r6 = r0.isAssignableFrom(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L39b:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            int r6 = r7.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L3b5
            java.lang.Class r6 = r7.getType()
            boolean r6 = r0.isAssignableFrom(r6)
            if (r6 == 0) goto L3b5
            goto L3b6
        L3b5:
            r3 = r4
        L3b6:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L3bb:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            int r6 = r7.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L3d5
            java.lang.Class r6 = r7.getType()
            boolean r6 = r2.isAssignableFrom(r6)
            if (r6 == 0) goto L3d5
            goto L3d6
        L3d5:
            r3 = r4
        L3d6:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
    }
}
