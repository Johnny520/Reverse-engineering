package io.github.cherrywechat.lua.api;

import android.annotation.SuppressLint;
import android.content.Context;
import io.github.cherrywechat.lua.dev.CherryDevServer;
import java.util.List;
import p000.AbstractC0295Gu;
import p000.C2402q8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"StaticFieldLeak"})
public final class CherryDevAPI {
    public static final CherryDevAPI INSTANCE = null;
    private static final String TAG = null;

    static {
        TAG = AbstractC0295Gu.m625r(-552538952693813L);
        INSTANCE = new CherryDevAPI();
    }

    private CherryDevAPI() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3056a(Lua r0) {
        return register$lambda$2(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3057b(Lua r0) {
        return register$lambda$4(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3058c(Lua r0) {
        return register$lambda$5(r0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3059d(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3060e(Lua r0) {
        return register$lambda$3(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3061f(Lua r0) {
        return register$lambda$0(r0);
    }

    private static final int register$lambda$0(Lua r4) {
        AbstractC0295Gu.m625r(-552191060342837L);
        if (r4.getTop() <= 0) goto L5;
        int r0 = (int) r4.toNumber(1);
    L6:
        Context r2 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r2 == null) goto L9;
        r4.push(CherryDevServer.INSTANCE.start(r2, r0));
    L10:
        return 1;
    L9:
        AbstractC0295Gu.m625r(-552199650277429L);
        AbstractC0295Gu.m625r(-552805240666165L);
        r4.push(false);
        goto L10
    L5:
        r0 = 9527;
        goto L6
    }

    private static final int register$lambda$1(Lua r2) {
        AbstractC0295Gu.m625r(-552895434979381L);
        CherryDevServer.INSTANCE.stop();
        return 0;
    }

    private static final int register$lambda$2(Lua r2) {
        AbstractC0295Gu.m625r(-552904024913973L);
        String r0 = CherryDevServer.INSTANCE.getServerUrl();
        if (r0 == null) goto L5;
        r2.push(r0);
        return 1;
    L5:
        r2.pushNil();
        return 1;
    }

    private static final int register$lambda$3(Lua r2) {
        AbstractC0295Gu.m625r(-552912614848565L);
        r2.push(CherryDevServer.INSTANCE.isRunning());
        return 1;
    }

    private static final int register$lambda$4(Lua r4) {
        AbstractC0295Gu.m625r(-552921204783157L);
        String r0 = r4.toString(1);
        if (r0 != null) goto L5;
        r0 = AbstractC0295Gu.m625r(-552929794717749L);
    L5:
        String r1 = r4.toString(2);
        if (r1 != null) goto L8;
        r1 = AbstractC0295Gu.m625r(-552951269554229L);
    L8:
        String r42 = r4.toString(3);
        if (r42 != null) goto L11;
        r42 = AbstractC0295Gu.m625r(-552994219227189L);
    L11:
        CherryDevServer.INSTANCE.broadcastLog(r0, r1, r42);
        return 0;
    }

    private static final int register$lambda$5(Lua r4) {
        AbstractC0295Gu.m625r(-552998514194485L);
        String r0 = r4.toString(1);
        if (r0 != null) goto L5;
        r0 = AbstractC0295Gu.m625r(-553007104129077L);
    L5:
        String r42 = r4.toString(2);
        if (r42 != null) goto L8;
        r42 = AbstractC0295Gu.m625r(-553041463867445L);
    L8:
        CherryDevServer.INSTANCE.broadcastLog(r0, AbstractC0295Gu.m625r(-553045758834741L), r42);
        return 0;
    }

    public final void cleanup() {
        CherryDevServer.INSTANCE.stop();
    }

    public final void register(Lua r4, List<? extends ClassLoader> r5) {
        AbstractC0295Gu.m625r(-552328499296309L);
        AbstractC0295Gu.m625r(-552345679165493L);
        r4.createTable(0, 6);
        r4.push(new C2402q8(16));
        r4.setField(-2, AbstractC0295Gu.m625r(-552401513740341L));
        r4.push(new C2402q8(17));
        r4.setField(-2, AbstractC0295Gu.m625r(-552427283544117L));
        r4.push(new C2402q8(18));
        r4.setField(-2, AbstractC0295Gu.m625r(-552448758380597L));
        r4.push(new C2402q8(19));
        r4.setField(-2, AbstractC0295Gu.m625r(-552478823151669L));
        r4.push(new C2402q8(20));
        r4.setField(-2, AbstractC0295Gu.m625r(-551972017010741L));
        r4.push(new C2402q8(21));
        r4.setField(-2, AbstractC0295Gu.m625r(-551989196879925L));
        AbstractC0295Gu.m625r(-552032146552885L);
        AbstractC0295Gu.m625r(-552087981127733L);
    }
}
