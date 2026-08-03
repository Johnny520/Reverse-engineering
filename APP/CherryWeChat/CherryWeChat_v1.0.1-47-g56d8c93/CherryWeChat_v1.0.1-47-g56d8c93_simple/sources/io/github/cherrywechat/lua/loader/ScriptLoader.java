package io.github.cherrywechat.lua.loader;

import android.content.Context;
import io.github.cherrywechat.lua.LuaContext;
import io.github.cherrywechat.lua.LuaEngine;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.AbstractC0085Bz;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC1406fG;
import p000.AbstractC2453ra;
import p000.AbstractC2539ta;
import p000.AbstractC2564tz;
import p000.AbstractC2659w7;
import p000.AbstractC2675wh;
import p000.C0297Gw;
import p000.C0340Hw;
import p000.C0452Kf;
import p000.C2390px;

/* JADX INFO: loaded from: classes.dex */
public final class ScriptLoader {
    private static final String ASSETS_DIR = null;
    public static final ScriptLoader INSTANCE = null;
    private static final String SCRIPTS_DIR = null;
    private static final String TAG = null;

    static {
        TAG = AbstractC0295Gu.m625r(-376213365323829L);
        SCRIPTS_DIR = AbstractC0295Gu.m625r(-376269199898677L);
        ASSETS_DIR = AbstractC0295Gu.m625r(-376870495320117L);
        INSTANCE = new ScriptLoader();
    }

    private ScriptLoader() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m3531a(File r0) {
        return listScripts$lambda$2(r0);
    }

    /* JADX INFO: renamed from: executeString-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m5468executeString0E7RQCE$default(ScriptLoader r0, LuaContext r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = AbstractC0295Gu.m625r(-326211356063797L);
    L6:
        return r0.m5473executeString0E7RQCE(r1, r2, r3);
    }

    private static final boolean listScripts$lambda$2(File r3) {
        if (r3.isFile() == false) goto L11;
        String r32 = r3.getName();
        int r0 = AbstractC2564tz.m5061V(r32, '.');
        if (r0 != (-1)) goto L7;
        String r33 = "";
    L9:
        if (r33.equals(AbstractC0295Gu.m625r(-376196185454645L)) == false) goto L13;
        return true;
    L13:
        return false;
    L7:
        r33 = r32.substring(r0 + 1, r32.length());
        goto L9
    L11:
        return false;
    }

    /* JADX INFO: renamed from: copyAssetScript-gIAlu-s, reason: not valid java name */
    public final Object m5469copyAssetScriptgIAlus(Context r4, String r5) {
        AbstractC0295Gu.m625r(-377845452896309L);
        AbstractC0295Gu.m625r(-377879812634677L);
        String r0 = AbstractC0295Gu.m625r(-377922762307637L).concat(r5);     // Catch: Exception -> L7
        InputStream r02 = r4.getAssets().open(r0);     // Catch: Exception -> L7
        AbstractC0295Gu.m625r(-377944237144117L);     // Catch: Exception -> L7
        BufferedReader r03 = new BufferedReader(new InputStreamReader(r02, AbstractC2659w7.f9201a), 8192);     // Catch: Exception -> L7
        String r1 = AbstractC1406fG.m2708h0(r03);     // Catch: Throwable -> L9
        r03.close();     // Catch: Exception -> L7
        return m5475saveScript0E7RQCE(r4, r5, r1);
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        AbstractC0585Nj.m1138f(r03, th);     // Catch: Exception -> L7
        throw th;     // Catch: Exception -> L7
    L7:
        e = move-exception;
        return new C0297Gw(e);
    }

    public final boolean deleteScript(Context r5, String r6) {
        AbstractC0295Gu.m625r(-378167575443509L);
        AbstractC0295Gu.m625r(-378201935181877L);
        if (AbstractC0085Bz.m132J(r6, false, AbstractC0295Gu.m625r(-378223410018357L)) == true) goto L6;
        r6 = r6.concat(AbstractC0295Gu.m625r(-377695129040949L));
    L6:
        File r0 = new File(getScriptsDir(r5), r6);
        if (r0.exists() == false) goto L12;
        boolean r52 = r0.delete();
        if (r52 == false) goto L11;
        AbstractC0295Gu.m625r(-377716603877429L);
        AbstractC0295Gu.m625r(-377772438452277L);
    L11:
        return r52;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: executeAsset-0E7RQCE, reason: not valid java name */
    public final Object m5470executeAsset0E7RQCE(Context r3, LuaContext r4, String r5) {
        AbstractC0295Gu.m625r(-325610060642357L);
        AbstractC0295Gu.m625r(-325644420380725L);
        AbstractC0295Gu.m625r(-325691665020981L);
    L11:
        e = move-exception;
        AbstractC0295Gu.m625r(-326365974886453L);
        AbstractC0295Gu.m625r(-326421809461301L);
        return new C0297Gw(e);
    L4:
        if (r5.startsWith(AbstractC0295Gu.m625r(-326284370507829L)) == false) goto L6;
        String r0 = r5;
    L7:
        InputStream r32 = r3.getAssets().open(r0);     // Catch: Exception -> L11
        AbstractC0295Gu.m625r(-326323025213493L);     // Catch: Exception -> L11
        BufferedReader r33 = new BufferedReader(new InputStreamReader(r32, AbstractC2659w7.f9201a), 8192);     // Catch: Exception -> L11
        String r02 = AbstractC1406fG.m2708h0(r33);     // Catch: Throwable -> L13
        r33.close();     // Catch: Exception -> L11
        return m5473executeString0E7RQCE(r4, r02, r5);
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        AbstractC0585Nj.m1138f(r33, th);     // Catch: Exception -> L11
        throw th;     // Catch: Exception -> L11
    L6:
        r0 = AbstractC0295Gu.m625r(-326301550377013L).concat(r5);     // Catch: Exception -> L11
        goto L7
    }

    /* JADX INFO: renamed from: executeFile-IoAF18A, reason: not valid java name */
    public final Object m5471executeFileIoAF18A(String r4) {
        AbstractC0295Gu.m625r(-325506981427253L);
        File r0 = new File(r4);
        if (r0.exists() == true) goto L7;
        return new C0297Gw(new FileNotFoundException(AbstractC0295Gu.m625r(-325528456263733L).concat(r4)));
    L7:
        return LuaEngine.INSTANCE.m5465executeIoAF18A(AbstractC2675wh.m5244g0(r0));
    }

    /* JADX INFO: renamed from: executeFile-gIAlu-s, reason: not valid java name */
    public final Object m5472executeFilegIAlus(LuaContext r4, String r5) {
        AbstractC0295Gu.m625r(-325863463712821L);
        AbstractC0295Gu.m625r(-325897823451189L);
        File r0 = new File(r5);
        if (r0.exists() == false) goto L5;
        String r52 = AbstractC2675wh.m5244g0(r0);
        String r02 = r0.getName();
        AbstractC0295Gu.m625r(-326000902666293L);
        return m5473executeString0E7RQCE(r4, r52, r02);
    L5:
        return new C0297Gw(new FileNotFoundException(AbstractC0295Gu.m625r(-325919298287669L).concat(r5)));
    }

    /* JADX INFO: renamed from: executeString-0E7RQCE, reason: not valid java name */
    public final Object m5473executeString0E7RQCE(LuaContext r3, String r4, String r5) {
        AbstractC0295Gu.m625r(-326520593709109L);
        AbstractC0295Gu.m625r(-326554953447477L);
        AbstractC0295Gu.m625r(-326026672470069L);
        AbstractC0295Gu.m625r(-326073917110325L);
        AbstractC0295Gu.m625r(-326129751685173L);
        return r3.m5463executeIoAF18A(r4);
    }

    public final File getScriptsDir(Context r4) {
        AbstractC0295Gu.m625r(-325777564366901L);
        File r0 = new File(r4.getFilesDir(), AbstractC0295Gu.m625r(-325811924105269L));
        if (r0.exists() == true) goto L5;
        r0.mkdirs();
    L5:
        return r0;
    }

    public final void initBuiltinScripts(Context r8) {
        AbstractC0295Gu.m625r(-376337919375413L);
        List<String> r0 = listAssetScripts(r8);
        List<ScriptInfo> r1 = listScripts(r8);
        ArrayList r2 = new ArrayList(AbstractC2539ta.m5019d0(r1, 10));
        Iterator<T> r12 = r1.iterator();
    L4:
        if (r12.hasNext() == false) goto L6;
        r2.add(((ScriptInfo) r12.next()).getName() + AbstractC0295Gu.m625r(-376372279113781L));
        goto L4
    L6:
        Set r13 = AbstractC2453ra.m4909s0(r2);
        Iterator<T> r02 = r0.iterator();
    L8:
        if (r02.hasNext() == false) goto L17;
        String r22 = (String) r02.next();
        if (r13.contains(r22) == true) goto L8;
        Object r23 = INSTANCE.m5469copyAssetScriptgIAlus(r8, r22);
        if ((r23 instanceof C0297Gw) == true) goto L15;
        File r3 = (File) r23;
        AbstractC0295Gu.m625r(-376393753950261L);
        AbstractC0295Gu.m625r(-376449588525109L);
    L15:
        if (C0340Hw.m726a(r23) == null) goto L8;
        AbstractC0295Gu.m625r(-376552667740213L);
        AbstractC0295Gu.m625r(-376058746501173L);
        goto L8
    }

    public final List<String> listAssetScripts(Context r8) {
        AbstractC0295Gu.m625r(-377501855512629L);
        String[] r82 = r8.getAssets().list(AbstractC0295Gu.m625r(-377536215250997L));     // Catch: Exception -> L14
        if (r82 == null) goto L13;
        ArrayList r0 = new ArrayList();     // Catch: Exception -> L14
        int r1 = r82.length;     // Catch: Exception -> L14
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L11;
        String r4 = r82[r3];     // Catch: Exception -> L14
        if (AbstractC0085Bz.m132J(r4, false, AbstractC0295Gu.m625r(-377553395120181L)) == false) goto L10;
        r0.add(r4);     // Catch: Exception -> L14
    L10:
        r3 = r3 + 1;
        goto L6
    L11:
        return r0;
    L13:
        return C0452Kf.f1484a;
    }

    public final List<ScriptInfo> listScripts(Context r12) {
        AbstractC0295Gu.m625r(-326250010769461L);
        File[] r122 = getScriptsDir(r12).listFiles(new C2390px(0));
        if (r122 == null) goto L10;
        ArrayList r0 = new ArrayList(r122.length);
        int r1 = r122.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L8;
        File r3 = r122[r2];
        String r5 = AbstractC2675wh.m5240c0(r3);
        String r6 = r3.getAbsolutePath();
        AbstractC0295Gu.m625r(-377411661199413L);
        r0.add(new ScriptInfo(r5, r6, r3.length(), r3.lastModified()));
        r2 = r2 + 1;
        goto L5
    L8:
        return AbstractC2453ra.m4904n0(r0, new ScriptLoader$listScripts$$inlined$sortedByDescending$1());
    L10:
        return C0452Kf.f1484a;
    }

    /* JADX INFO: renamed from: readScript-gIAlu-s, reason: not valid java name */
    public final Object m5474readScriptgIAlus(Context r3, String r4) {
        AbstractC0295Gu.m625r(-377987186817077L);
        AbstractC0295Gu.m625r(-378021546555445L);
    L11:
        e = move-exception;
        return new C0297Gw(e);
    L4:
        if (AbstractC0085Bz.m132J(r4, false, AbstractC0295Gu.m625r(-378043021391925L)) == false) goto L6;
        String r0 = r4;
    L7:
        File r1 = new File(getScriptsDir(r3), r0);     // Catch: Exception -> L11
        if (r1.exists() == true) goto L14;
        return new C0297Gw(new FileNotFoundException(AbstractC0295Gu.m625r(-378085971064885L).concat(r4)));
    L14:
        return AbstractC2675wh.m5244g0(r1);
    L6:
        r0 = r4.concat(AbstractC0295Gu.m625r(-378064496228405L));     // Catch: Exception -> L11
        goto L7
    }

    /* JADX INFO: renamed from: saveScript-0E7RQCE, reason: not valid java name */
    public final Object m5475saveScript0E7RQCE(Context r3, String r4, String r5) {
        AbstractC0295Gu.m625r(-377574869956661L);
        AbstractC0295Gu.m625r(-377609229695029L);
        AbstractC0295Gu.m625r(-377630704531509L);
    L9:
        e = move-exception;
        AbstractC0295Gu.m625r(-377278517213237L);
        AbstractC0295Gu.m625r(-377334351788085L);
        return new C0297Gw(e);
    L4:
        if (AbstractC0085Bz.m132J(r4, false, AbstractC0295Gu.m625r(-377665064269877L)) == true) goto L7;
        r4 = r4.concat(AbstractC0295Gu.m625r(-377136783292469L));     // Catch: Exception -> L9
    L7:
        File r0 = new File(getScriptsDir(r3), r4);     // Catch: Exception -> L9
        AbstractC2675wh.m5246i0(r0, r5);     // Catch: Exception -> L9
        AbstractC0295Gu.m625r(-377158258128949L);     // Catch: Exception -> L9
        AbstractC0295Gu.m625r(-377214092703797L);     // Catch: Exception -> L9
        r0.getAbsolutePath();     // Catch: Exception -> L9
        return r0;
    }
}
