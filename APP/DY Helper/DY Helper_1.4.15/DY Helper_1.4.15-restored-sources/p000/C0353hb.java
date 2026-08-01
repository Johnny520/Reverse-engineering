package p000;

/* JADX INFO: renamed from: hb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0353hb implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4672;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f4673;

    public /* synthetic */ C0353hb(android.view.View r1, int r2) {
            r0 = this;
            r0.f4672 = r2
            r0.f4673 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r10 = this;
            int r0 = r10.f4672
            r1 = 2131606035(0x7f0dba13, float:1.883873E38)
            r2 = 2131606034(0x7f0dba12, float:1.8838728E38)
            r3 = 2131606041(0x7f0dba19, float:1.8838742E38)
            r4 = 8
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r7 = 0
            r8 = 0
            s62 r9 = p000.s62.f9751
            android.view.View r10 = r10.f4673
            switch(r0) {
                case 0: goto L19e;
                case 1: goto L19a;
                case 2: goto L191;
                case 3: goto L164;
                case 4: goto L129;
                case 5: goto Ld6;
                case 6: goto L5f;
                case 7: goto L4e;
                case 8: goto L4a;
                case 9: goto L44;
                case 10: goto L40;
                case 11: goto L3b;
                case 12: goto L32;
                case 13: goto L25;
                case 14: goto L1f;
                default: goto L19;
            }
        L19:
            q71 r0 = p000.q71.f8896
            p000.q71.m4794(r10)
            return r9
        L1f:
            com.example.dyhelper.hook.γ r0 = com.example.dyhelper.hook.C0157.f2411
            r0.m1524(r10)
            return r9
        L25:
            r10.setVisibility(r4)
            r10.setAlpha(r7)
            r10.setClickable(r8)
            r10.setFocusable(r8)
            return r9
        L32:
            jb r0 = new jb
            r0.<init>(r10, r8)
            r10.post(r0)
            return r9
        L3b:
            r0 = 3
            p000.C0792sb.m5407(r10, r0)
            return r9
        L40:
            p000.C0792sb.m5415(r10)
            return r9
        L44:
            sb r0 = p000.C0792sb.f9786
            p000.C0792sb.m5405(r10)
            return r9
        L4a:
            p000.C0792sb.m5416(r10)
            return r9
        L4e:
            sb r0 = p000.C0792sb.f9786     // Catch: java.lang.Throwable -> L54
            p000.C0792sb.m5417(r10)     // Catch: java.lang.Throwable -> L54
            goto L5e
        L54:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "rba3364bb45bf3577"
            p000.AbstractC0602nx.m4142(r0, r10)
        L5e:
            return r9
        L5f:
            java.lang.Object r0 = r10.getTag(r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            boolean r0 = p000.ln0.m3626(r0, r1)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L6d
            goto Ld5
        L6d:
            sb r0 = p000.C0792sb.f9786     // Catch: java.lang.Throwable -> L8c
            p000.C0792sb.m5397(r10)     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r10.getTag(r2)     // Catch: java.lang.Throwable -> L8c
            boolean r0 = p000.ln0.m3626(r0, r1)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8e
            r10.setTag(r2, r6)     // Catch: java.lang.Throwable -> L8c
            float r0 = r10.getAlpha()     // Catch: java.lang.Throwable -> L8c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L88
            goto L8e
        L88:
            r10.setAlpha(r5)     // Catch: java.lang.Throwable -> L8c
            goto L8e
        L8c:
            r10 = move-exception
            goto Lcc
        L8e:
            java.lang.Object r0 = r10.getTag(r3)     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L99
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L8c
            goto L9a
        L99:
            r0 = r6
        L9a:
            if (r0 == 0) goto Ld5
            r10.setTag(r3, r6)     // Catch: java.lang.Throwable -> L8c
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto Lb6
            int r2 = r1.height     // Catch: java.lang.Throwable -> L8c
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L8c
            if (r2 == r3) goto Lb6
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L8c
            r1.height = r0     // Catch: java.lang.Throwable -> L8c
            r10.setLayoutParams(r1)     // Catch: java.lang.Throwable -> L8c
        Lb6:
            int r0 = r10.getVisibility()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto Lbf
            r10.setVisibility(r8)     // Catch: java.lang.Throwable -> L8c
        Lbf:
            float r0 = r10.getAlpha()     // Catch: java.lang.Throwable -> L8c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto Lc8
            goto Ld5
        Lc8:
            r10.setAlpha(r5)     // Catch: java.lang.Throwable -> L8c
            goto Ld5
        Lcc:
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "rdfda5c987517c87b"
            p000.AbstractC0602nx.m4142(r0, r10)
        Ld5:
            return r9
        Ld6:
            android.view.ViewPropertyAnimator r0 = r10.animate()     // Catch: java.lang.Throwable -> Ldf
            if (r0 == 0) goto Ldf
            r0.cancel()     // Catch: java.lang.Throwable -> Ldf
        Ldf:
            r10.clearAnimation()     // Catch: java.lang.Throwable -> Le2
        Le2:
            r10.setBackground(r6)     // Catch: java.lang.Throwable -> Lfe
            r10.setMinimumHeight(r8)     // Catch: java.lang.Throwable -> Lfe
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()     // Catch: java.lang.Throwable -> Lfe
            if (r0 == 0) goto L109
            java.lang.Object r1 = r10.getTag(r3)     // Catch: java.lang.Throwable -> Lfe
            if (r1 != 0) goto L100
            int r1 = r0.height     // Catch: java.lang.Throwable -> Lfe
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lfe
            r10.setTag(r3, r1)     // Catch: java.lang.Throwable -> Lfe
            goto L100
        Lfe:
            r10 = move-exception
            goto L11f
        L100:
            int r1 = r0.height     // Catch: java.lang.Throwable -> Lfe
            if (r1 == 0) goto L109
            r0.height = r8     // Catch: java.lang.Throwable -> Lfe
            r10.setLayoutParams(r0)     // Catch: java.lang.Throwable -> Lfe
        L109:
            int r0 = r10.getVisibility()     // Catch: java.lang.Throwable -> Lfe
            if (r0 == r4) goto L112
            r10.setVisibility(r4)     // Catch: java.lang.Throwable -> Lfe
        L112:
            float r0 = r10.getAlpha()     // Catch: java.lang.Throwable -> Lfe
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L11b
            goto L128
        L11b:
            r10.setAlpha(r7)     // Catch: java.lang.Throwable -> Lfe
            goto L128
        L11f:
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "r45fab6f41990f933"
            p000.AbstractC0602nx.m4142(r0, r10)
        L128:
            return r9
        L129:
            android.view.ViewPropertyAnimator r0 = r10.animate()     // Catch: java.lang.Throwable -> L132
            if (r0 == 0) goto L132
            r0.cancel()     // Catch: java.lang.Throwable -> L132
        L132:
            r10.clearAnimation()     // Catch: java.lang.Throwable -> L135
        L135:
            float r0 = r10.getTranslationY()     // Catch: java.lang.Throwable -> L14b
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L13e
            goto L141
        L13e:
            r10.setTranslationY(r7)     // Catch: java.lang.Throwable -> L14b
        L141:
            int r0 = r10.getVisibility()     // Catch: java.lang.Throwable -> L14b
            if (r0 == 0) goto L14d
            r10.setVisibility(r8)     // Catch: java.lang.Throwable -> L14b
            goto L14d
        L14b:
            r10 = move-exception
            goto L15a
        L14d:
            float r0 = r10.getAlpha()     // Catch: java.lang.Throwable -> L14b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L156
            goto L163
        L156:
            r10.setAlpha(r5)     // Catch: java.lang.Throwable -> L14b
            goto L163
        L15a:
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "rc9e97d46da0d1275"
            p000.AbstractC0602nx.m4142(r0, r10)
        L163:
            return r9
        L164:
            sb r0 = p000.C0792sb.f9786
            p000.C0792sb.m5398(r10)     // Catch: java.lang.Throwable -> L186
            boolean r0 = r10 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L186
            if (r0 == 0) goto L190
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L186
            int r0 = r0.getChildCount()     // Catch: java.lang.Throwable -> L186
        L174:
            if (r8 >= r0) goto L190
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> L186
            android.view.View r1 = r1.getChildAt(r8)     // Catch: java.lang.Throwable -> L186
            r1.getClass()     // Catch: java.lang.Throwable -> L186
            p000.C0792sb.m5399(r1)     // Catch: java.lang.Throwable -> L186
            int r8 = r8 + 1
            goto L174
        L186:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "r56cb17b1bb811424"
            p000.AbstractC0602nx.m4142(r0, r10)
        L190:
            return r9
        L191:
            sb r0 = p000.C0792sb.f9786
            p000.C0792sb.m5426(r10)
            p000.C0792sb.m5404()
            return r9
        L19a:
            p000.C0792sb.m5403(r10)
            return r9
        L19e:
            sb r0 = p000.C0792sb.f9786
            java.lang.Object r0 = r10.getTag(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L1af
            p000.C0792sb.m5398(r10)
        L1af:
            p000.C0792sb.m5397(r10)
            java.lang.Object r0 = r10.getTag(r2)
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L1da
            r10.setTag(r2, r6)
            r0 = 2131606043(0x7f0dba1b, float:1.8838746E38)
            java.lang.Object r1 = r10.getTag(r0)
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L1cd
            java.lang.Float r1 = (java.lang.Float) r1
            goto L1ce
        L1cd:
            r1 = r6
        L1ce:
            r10.setTag(r0, r6)
            if (r1 == 0) goto L1d7
            float r5 = r1.floatValue()
        L1d7:
            r10.setAlpha(r5)
        L1da:
            return r9
    }
}
