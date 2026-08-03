package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f736b;

    public /* synthetic */ j(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f735a = r2
            r0.f736b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f735a
            switch(r0) {
                case 0: goto Le3;
                case 1: goto Ld8;
                case 2: goto Lcd;
                case 3: goto Lc4;
                case 4: goto Lbb;
                case 5: goto Lb2;
                case 6: goto La9;
                case 7: goto La0;
                case 8: goto L97;
                case 9: goto L8c;
                case 10: goto L58;
                case 11: goto L47;
                case 12: goto L3c;
                case 13: goto L31;
                case 14: goto L1d;
                case 15: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f736b
            nb.a r0 = (nb.a) r0
            java.lang.Object r4 = r0.invoke(r4)
            java.util.List r4 = (java.util.List) r4
            return r4
        L10:
            java.lang.Object r0 = r3.f736b
            java.util.Map r0 = (java.util.Map) r0
            be.a r4 = (be.a) r4
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L1d:
            java.lang.Object r0 = r3.f736b
            java.util.function.Function r0 = (java.util.function.Function) r0
            if (r4 != 0) goto L2b
            r4 = 0
            java.lang.Object r0 = r0.apply(r4)
            be.a r0 = (be.a) r0
            throw r4
        L2b:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        L31:
            java.lang.Object r0 = r3.f736b
            nb.a r0 = (nb.a) r0
            java.lang.Object r4 = r0.invoke(r4)
            wb.yt r4 = (wb.yt) r4
            return r4
        L3c:
            java.lang.Object r0 = r3.f736b
            ca.s r0 = (ca.s) r0
            java.lang.Object r4 = r0.invoke(r4)
            r8.d r4 = (r8.d) r4
            return r4
        L47:
            java.lang.Object r0 = r3.f736b
            java.util.List r0 = (java.util.List) r0
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r4 = r0.get(r4)
            qd.j r4 = (qd.j) r4
            return r4
        L58:
            java.lang.Object r0 = r3.f736b
            ff.a r0 = (ff.a) r0
            java.io.File r4 = (java.io.File) r4
            r0.getClass()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L72
            r1.<init>(r4)     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L74
            java.util.List r0 = r0.c(r4, r1, r2)     // Catch: java.lang.Throwable -> L74
            r1.close()     // Catch: java.lang.Exception -> L72
            goto L8b
        L72:
            r0 = move-exception
            goto L7e
        L74:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L79
            goto L7d
        L79:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L72
        L7d:
            throw r0     // Catch: java.lang.Exception -> L72
        L7e:
            mh.b r1 = ff.a.f3923c
            java.lang.String r2 = "File open error: {}"
            java.lang.String r4 = r4.getAbsolutePath()
            r1.n(r4, r2, r0)
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L8b:
            return r0
        L8c:
            java.lang.Object r0 = r3.f736b
            fb.g0 r0 = (fb.g0) r0
            java.lang.Object r4 = r0.invoke(r4)
            java.util.concurrent.locks.ReentrantLock r4 = (java.util.concurrent.locks.ReentrantLock) r4
            return r4
        L97:
            java.lang.Object r0 = r3.f736b
            fb.g0 r0 = (fb.g0) r0
            java.lang.Object r4 = r0.invoke(r4)
            return r4
        La0:
            java.lang.Object r0 = r3.f736b
            fb.g0 r0 = (fb.g0) r0
            java.lang.Object r4 = r0.invoke(r4)
            return r4
        La9:
            java.lang.Object r0 = r3.f736b
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.Object r4 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.b(r0, r4)
            return r4
        Lb2:
            java.lang.Object r0 = r3.f736b
            com.alibaba.fastjson2.reader.ObjectReaderImplList r0 = (com.alibaba.fastjson2.reader.ObjectReaderImplList) r0
            java.lang.Object r4 = com.alibaba.fastjson2.reader.ObjectReaderImplList.a(r0, r4)
            return r4
        Lbb:
            java.lang.Object r0 = r3.f736b
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            java.lang.Object r4 = com.alibaba.fastjson2.reader.ObjectReaderImplList.d(r0, r4)
            return r4
        Lc4:
            java.lang.Object r0 = r3.f736b
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Object r4 = com.alibaba.fastjson2.reader.ObjectReaderCreator.a(r4, r0)
            return r4
        Lcd:
            java.lang.Object r0 = r3.f736b
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = bsh.StringUtil.b(r0, r4)
            return r4
        Ld8:
            java.lang.Object r0 = r3.f736b
            bsh.NameSpace r0 = (bsh.NameSpace) r0
            java.lang.String r4 = (java.lang.String) r4
            bsh.Variable r4 = bsh.Reflect.e(r0, r4)
            return r4
        Le3:
            java.lang.Object r0 = r3.f736b
            bc.k r0 = (bc.k) r0
            ud.e r4 = (ud.e) r4
            bc.l r4 = r0.b(r4)
            return r4
    }
}
