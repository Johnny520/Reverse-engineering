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
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.AbstractC0085Bz;
import p000.AbstractC0295Gu;
import p000.AbstractC0671Pj;
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
    private static final String TAG = AbstractC0295Gu.m625r(-376213365323829L);
    private static final String SCRIPTS_DIR = AbstractC0295Gu.m625r(-376269199898677L);
    private static final String ASSETS_DIR = AbstractC0295Gu.m625r(-376870495320117L);
    public static final ScriptLoader INSTANCE = new ScriptLoader();

    private ScriptLoader() {
    }

    /* JADX INFO: renamed from: executeString-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m5468executeString0E7RQCE$default(ScriptLoader scriptLoader, LuaContext luaContext, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = AbstractC0295Gu.m625r(-326211356063797L);
        }
        return scriptLoader.m5473executeString0E7RQCE(luaContext, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listScripts$lambda$2(File file) {
        if (!file.isFile()) {
            return false;
        }
        String name = file.getName();
        int iM5061V = AbstractC2564tz.m5061V(name, '.');
        return (iM5061V == -1 ? "" : name.substring(iM5061V + 1, name.length())).equals(AbstractC0295Gu.m625r(-376196185454645L));
    }

    /* JADX INFO: renamed from: copyAssetScript-gIAlu-s, reason: not valid java name */
    public final Object m5469copyAssetScriptgIAlus(Context context, String str) {
        AbstractC0295Gu.m625r(-377845452896309L);
        AbstractC0295Gu.m625r(-377879812634677L);
        try {
            InputStream inputStreamOpen = context.getAssets().open(AbstractC0295Gu.m625r(-377922762307637L).concat(str));
            AbstractC0295Gu.m625r(-377944237144117L);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, AbstractC2659w7.f9201a), 8192);
            try {
                String strM2708h0 = AbstractC1406fG.m2708h0(bufferedReader);
                bufferedReader.close();
                return m5475saveScript0E7RQCE(context, str, strM2708h0);
            } finally {
            }
        } catch (Exception e) {
            return new C0297Gw(e);
        }
    }

    public final boolean deleteScript(Context context, String str) {
        AbstractC0295Gu.m625r(-378167575443509L);
        AbstractC0295Gu.m625r(-378201935181877L);
        if (!AbstractC0085Bz.m132J(str, false, AbstractC0295Gu.m625r(-378223410018357L))) {
            str = str.concat(AbstractC0295Gu.m625r(-377695129040949L));
        }
        File file = new File(getScriptsDir(context), str);
        if (!file.exists()) {
            return false;
        }
        boolean zDelete = file.delete();
        if (zDelete) {
            AbstractC0295Gu.m625r(-377716603877429L);
            AbstractC0295Gu.m625r(-377772438452277L);
        }
        return zDelete;
    }

    /* JADX INFO: renamed from: executeAsset-0E7RQCE, reason: not valid java name */
    public final Object m5470executeAsset0E7RQCE(Context context, LuaContext luaContext, String str) {
        AbstractC0295Gu.m625r(-325610060642357L);
        AbstractC0295Gu.m625r(-325644420380725L);
        AbstractC0295Gu.m625r(-325691665020981L);
        try {
            InputStream inputStreamOpen = context.getAssets().open(str.startsWith(AbstractC0295Gu.m625r(-326284370507829L)) ? str : AbstractC0295Gu.m625r(-326301550377013L).concat(str));
            AbstractC0295Gu.m625r(-326323025213493L);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, AbstractC2659w7.f9201a), 8192);
            try {
                String strM2708h0 = AbstractC1406fG.m2708h0(bufferedReader);
                bufferedReader.close();
                return m5473executeString0E7RQCE(luaContext, strM2708h0, str);
            } finally {
            }
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-326365974886453L);
            AbstractC0295Gu.m625r(-326421809461301L);
            return new C0297Gw(e);
        }
    }

    /* JADX INFO: renamed from: executeFile-IoAF18A, reason: not valid java name */
    public final Object m5471executeFileIoAF18A(String str) {
        AbstractC0295Gu.m625r(-325506981427253L);
        File file = new File(str);
        return !file.exists() ? new C0297Gw(new FileNotFoundException(AbstractC0295Gu.m625r(-325528456263733L).concat(str))) : LuaEngine.INSTANCE.m5465executeIoAF18A(AbstractC2675wh.m5244g0(file));
    }

    /* JADX INFO: renamed from: executeFile-gIAlu-s, reason: not valid java name */
    public final Object m5472executeFilegIAlus(LuaContext luaContext, String str) {
        AbstractC0295Gu.m625r(-325863463712821L);
        AbstractC0295Gu.m625r(-325897823451189L);
        File file = new File(str);
        if (!file.exists()) {
            return new C0297Gw(new FileNotFoundException(AbstractC0295Gu.m625r(-325919298287669L).concat(str)));
        }
        String strM5244g0 = AbstractC2675wh.m5244g0(file);
        String name = file.getName();
        AbstractC0295Gu.m625r(-326000902666293L);
        return m5473executeString0E7RQCE(luaContext, strM5244g0, name);
    }

    /* JADX INFO: renamed from: executeString-0E7RQCE, reason: not valid java name */
    public final Object m5473executeString0E7RQCE(LuaContext luaContext, String str, String str2) {
        AbstractC0295Gu.m625r(-326520593709109L);
        AbstractC0295Gu.m625r(-326554953447477L);
        AbstractC0295Gu.m625r(-326026672470069L);
        AbstractC0295Gu.m625r(-326073917110325L);
        AbstractC0295Gu.m625r(-326129751685173L);
        return luaContext.m5463executeIoAF18A(str);
    }

    public final File getScriptsDir(Context context) {
        AbstractC0295Gu.m625r(-325777564366901L);
        File file = new File(context.getFilesDir(), AbstractC0295Gu.m625r(-325811924105269L));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final void initBuiltinScripts(Context context) {
        AbstractC0295Gu.m625r(-376337919375413L);
        List<String> listListAssetScripts = listAssetScripts(context);
        List<ScriptInfo> listListScripts = listScripts(context);
        ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listListScripts, 10));
        Iterator<T> it = listListScripts.iterator();
        while (it.hasNext()) {
            arrayList.add(((ScriptInfo) it.next()).getName() + AbstractC0295Gu.m625r(-376372279113781L));
        }
        Set setM4909s0 = AbstractC2453ra.m4909s0(arrayList);
        for (String str : listListAssetScripts) {
            if (!setM4909s0.contains(str)) {
                Object objM5469copyAssetScriptgIAlus = INSTANCE.m5469copyAssetScriptgIAlus(context, str);
                if (!(objM5469copyAssetScriptgIAlus instanceof C0297Gw)) {
                    AbstractC0295Gu.m625r(-376393753950261L);
                    AbstractC0295Gu.m625r(-376449588525109L);
                }
                if (C0340Hw.m726a(objM5469copyAssetScriptgIAlus) != null) {
                    AbstractC0295Gu.m625r(-376552667740213L);
                    AbstractC0295Gu.m625r(-376058746501173L);
                }
            }
        }
    }

    public final List<String> listAssetScripts(Context context) {
        AbstractC0295Gu.m625r(-377501855512629L);
        try {
            String[] list = context.getAssets().list(AbstractC0295Gu.m625r(-377536215250997L));
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (AbstractC0085Bz.m132J(str, false, AbstractC0295Gu.m625r(-377553395120181L))) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return C0452Kf.f1484a;
    }

    public final List<ScriptInfo> listScripts(Context context) {
        AbstractC0295Gu.m625r(-326250010769461L);
        File[] fileArrListFiles = getScriptsDir(context).listFiles(new C2390px(0));
        if (fileArrListFiles == null) {
            return C0452Kf.f1484a;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            String strM5240c0 = AbstractC2675wh.m5240c0(file);
            String absolutePath = file.getAbsolutePath();
            AbstractC0295Gu.m625r(-377411661199413L);
            arrayList.add(new ScriptInfo(strM5240c0, absolutePath, file.length(), file.lastModified()));
        }
        return AbstractC2453ra.m4904n0(arrayList, new Comparator() { // from class: io.github.cherrywechat.lua.loader.ScriptLoader$listScripts$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC0671Pj.m1346d(Long.valueOf(((ScriptInfo) t2).getLastModified()), Long.valueOf(((ScriptInfo) t).getLastModified()));
            }
        });
    }

    /* JADX INFO: renamed from: readScript-gIAlu-s, reason: not valid java name */
    public final Object m5474readScriptgIAlus(Context context, String str) {
        AbstractC0295Gu.m625r(-377987186817077L);
        AbstractC0295Gu.m625r(-378021546555445L);
        try {
            File file = new File(getScriptsDir(context), AbstractC0085Bz.m132J(str, false, AbstractC0295Gu.m625r(-378043021391925L)) ? str : str.concat(AbstractC0295Gu.m625r(-378064496228405L)));
            return !file.exists() ? new C0297Gw(new FileNotFoundException(AbstractC0295Gu.m625r(-378085971064885L).concat(str))) : AbstractC2675wh.m5244g0(file);
        } catch (Exception e) {
            return new C0297Gw(e);
        }
    }

    /* JADX INFO: renamed from: saveScript-0E7RQCE, reason: not valid java name */
    public final Object m5475saveScript0E7RQCE(Context context, String str, String str2) {
        AbstractC0295Gu.m625r(-377574869956661L);
        AbstractC0295Gu.m625r(-377609229695029L);
        AbstractC0295Gu.m625r(-377630704531509L);
        try {
            if (!AbstractC0085Bz.m132J(str, false, AbstractC0295Gu.m625r(-377665064269877L))) {
                str = str.concat(AbstractC0295Gu.m625r(-377136783292469L));
            }
            File file = new File(getScriptsDir(context), str);
            AbstractC2675wh.m5246i0(file, str2);
            AbstractC0295Gu.m625r(-377158258128949L);
            AbstractC0295Gu.m625r(-377214092703797L);
            file.getAbsolutePath();
            return file;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-377278517213237L);
            AbstractC0295Gu.m625r(-377334351788085L);
            return new C0297Gw(e);
        }
    }
}
