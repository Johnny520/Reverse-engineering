// =====================================================================
// 批量退群工具 - 加载器 (v1.8.0)
// 通过 DexClassLoader 加载 core.dex 解密 core.dat 执行核心逻辑
// 核心代码已加密保护，不在明文中暴露
// =====================================================================

// ====== 查找插件目录 ======
String pluginDir = null;

// 策略1: 通过 context.getExternalMediaDirs() 查找 Hchat 目录
if (pluginDir == null && context != null) {
    try {
        java.io.File[] mediaDirs = context.getExternalMediaDirs();
        if (mediaDirs != null) {
            for (int i = 0; i < mediaDirs.length; i++) {
                if (mediaDirs[i] == null) continue;
                // mediaDirs[i] = /storage/emulated/0/Android/media/com.tencent.mm/
                java.io.File hchatDir = new java.io.File(mediaDirs[i], "Hchat");
                if (!hchatDir.exists()) hchatDir = new java.io.File(mediaDirs[i], "hchat");
                if (!hchatDir.exists()) continue;

                // 搜索 Hchat/脚本插件/ 下的子目录
                java.io.File scriptsDir = new java.io.File(hchatDir, "脚本插件");
                if (!scriptsDir.exists()) scriptsDir = new java.io.File(hchatDir, "plugins");
                if (!scriptsDir.isDirectory()) continue;

                String[] subs = scriptsDir.list();
                if (subs == null) continue;
                for (int j = 0; j < subs.length; j++) {
                    java.io.File sub = new java.io.File(scriptsDir, subs[j]);
                    if (sub.isDirectory()) {
                        java.io.File test = new java.io.File(sub, "core.dex");
                        if (test.exists()) {
                            pluginDir = sub.getAbsolutePath();
                            break;
                        }
                        // 也检查嵌套子目录
                        String[] subs2 = sub.list();
                        if (subs2 != null) {
                            for (int k = 0; k < subs2.length; k++) {
                                java.io.File sub2 = new java.io.File(sub, subs2[k]);
                                if (sub2.isDirectory()) {
                                    test = new java.io.File(sub2, "core.dex");
                                    if (test.exists()) {
                                        pluginDir = sub2.getAbsolutePath();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (pluginDir != null) break;
            }
        }
    } catch (Throwable e) {}
}

// 策略2: 动态扫描所有存储路径（兼容多开微信）
if (pluginDir == null) {
    // 微信包名变体（多开/分身应用可能使用不同包名）
    String[] wxPackages = {
        "com.tencent.mm",
        "com.tencent.mm.rweb",
        "com.tencent.mm.androidx",
        "com.tencent.mm.rdeploy",
        "com.tencent.mm.rtest"
    };
    // Hchat 可能的目录名
    String[] hchatNames = {"Hchat", "hchat"};
    // 插件子目录名
    String[] subDirs = {"脚本插件", "plugins", "plugin", "脚本", "scripts"};

    // 构建 base 路径列表
    java.util.List bases = new java.util.ArrayList();

    // 2a: 扫描 /storage/emulated/*/Android/media/<包名>/Hchat
    java.io.File storageRoot = new java.io.File("/storage/emulated");
    if (storageRoot.isDirectory()) {
        String[] emuIds = storageRoot.list();
        if (emuIds != null) {
            for (int e = 0; e < emuIds.length; e++) {
                String emuId = emuIds[e];
                for (int p = 0; p < wxPackages.length; p++) {
                    for (int h = 0; h < hchatNames.length; h++) {
                        bases.add("/storage/emulated/" + emuId + "/Android/media/" + wxPackages[p] + "/" + hchatNames[h]);
                    }
                }
            }
        }
    }

    // 2b: 扫描 /storage/emulated/*/Hchat
    if (storageRoot.isDirectory()) {
        String[] emuIds = storageRoot.list();
        if (emuIds != null) {
            for (int e = 0; e < emuIds.length; e++) {
                for (int h = 0; h < hchatNames.length; h++) {
                    bases.add("/storage/emulated/" + emuIds[e] + "/" + hchatNames[h]);
                }
            }
        }
    }

    // 2c: /sdcard 等固定路径
    for (int p = 0; p < wxPackages.length; p++) {
        for (int h = 0; h < hchatNames.length; h++) {
            bases.add("/sdcard/Android/media/" + wxPackages[p] + "/" + hchatNames[h]);
        }
    }
    for (int h = 0; h < hchatNames.length; h++) {
        bases.add("/sdcard/" + hchatNames[h]);
    }
    bases.add("/data/data/com.hchat/files");

    for (int i = 0; i < bases.size() && pluginDir == null; i++) {
        String basePath = (String) bases.get(i);
        java.io.File base = new java.io.File(basePath);
        if (!base.isDirectory()) continue;

        // 先检查 base 目录本身
        java.io.File test = new java.io.File(base, "core.dex");
        if (test.exists()) {
            pluginDir = base.getAbsolutePath();
            break;
        }

        // 检查子目录
        for (int j = 0; j < subDirs.length; j++) {
            java.io.File subBase = new java.io.File(base, subDirs[j]);
            if (!subBase.isDirectory()) continue;

            test = new java.io.File(subBase, "core.dex");
            if (test.exists()) {
                pluginDir = subBase.getAbsolutePath();
                break;
            }

            // 搜索子目录的子目录
            String[] subs = subBase.list();
            if (subs == null) continue;
            for (int k = 0; k < subs.length; k++) {
                java.io.File sub = new java.io.File(subBase, subs[k]);
                if (!sub.isDirectory()) continue;
                test = new java.io.File(sub, "core.dex");
                if (test.exists()) {
                    pluginDir = sub.getAbsolutePath();
                    break;
                }
                // 再深一层
                String[] subs2 = sub.list();
                if (subs2 != null) {
                    for (int m = 0; m < subs2.length; m++) {
                        java.io.File sub2 = new java.io.File(sub, subs2[m]);
                        if (!sub2.isDirectory()) continue;
                        test = new java.io.File(sub2, "core.dex");
                        if (test.exists()) {
                            pluginDir = sub2.getAbsolutePath();
                            break;
                        }
                    }
                }
                if (pluginDir != null) break;
            }
            if (pluginDir != null) break;
        }
    }
}

// 策略3: 通过 context 的各种目录查找
if (pluginDir == null && context != null) {
    String[] ctxMethods = {"getFilesDir", "getExternalFilesDir", "getCacheDir", "getCodeCacheDir", "getDataDir"};
    for (int i = 0; i < ctxMethods.length && pluginDir == null; i++) {
        try {
            java.lang.reflect.Method m = context.getClass().getMethod(ctxMethods[i], new Class[0]);
            java.io.File dir = (java.io.File) m.invoke(context);
            if (dir == null) continue;
            // 检查目录本身
            java.io.File test = new java.io.File(dir, "core.dex");
            if (test.exists()) {
                pluginDir = dir.getAbsolutePath();
                break;
            }
            // 检查子目录
            String[] subs = dir.list();
            if (subs == null) continue;
            for (int j = 0; j < subs.length; j++) {
                java.io.File sub = new java.io.File(dir, subs[j]);
                if (!sub.isDirectory()) continue;
                test = new java.io.File(sub, "core.dex");
                if (test.exists()) {
                    pluginDir = sub.getAbsolutePath();
                    break;
                }
            }
        } catch (Throwable e) {}
    }
}

// 策略4: 通过 user.dir 和相对路径
if (pluginDir == null) {
    try {
        java.io.File test = new java.io.File("core.dex");
        if (test.exists()) {
            pluginDir = test.getParent();
            if (pluginDir == null) pluginDir = ".";
        }
    } catch (Throwable e) {}
}
if (pluginDir == null) {
    String wd = System.getProperty("user.dir", "");
    if (wd.length() > 0) {
        java.io.File test = new java.io.File(wd, "core.dex");
        if (test.exists()) pluginDir = wd;
    }
}

// 策略5: 通过 apis 获取插件路径
if (pluginDir == null && apis != null) {
    String[] apiMethods = {"getPluginDir", "getScriptDir", "getPluginPath", "getScriptPath",
        "getPluginDirectory", "getScriptDirectory", "getDir", "getPath", "getCurrentDir"};
    for (int i = 0; i < apiMethods.length && pluginDir == null; i++) {
        try {
            java.lang.reflect.Method m = apis.getClass().getMethod(apiMethods[i], new Class[0]);
            Object result = m.invoke(apis);
            if (result != null) {
                String path = result.toString();
                java.io.File test = new java.io.File(path, "core.dex");
                if (test.exists()) {
                    pluginDir = path;
                }
            }
        } catch (Throwable e) {}
    }
}

// ====== 加载核心逻辑 ======

if (pluginDir == null) {
    log("加载器: 错误 - 无法找到插件目录 (core.dex 不在已知路径中)");
    log("加载器: 已尝试: context.getExternalMediaDirs, 已知路径, context目录, user.dir, apis方法");
    return;
}

String dexPath = new java.io.File(pluginDir, "core.dex").getAbsolutePath();
String datPath = new java.io.File(pluginDir, "core.dat").getAbsolutePath();

java.io.File dexFile = new java.io.File(dexPath);
java.io.File datFile = new java.io.File(datPath);

if (!dexFile.exists()) {
    log("加载器: 找到插件目录 " + pluginDir + " 但 core.dex 不存在");
    return;
}
if (!datFile.exists()) {
    log("加载器: 找到插件目录 " + pluginDir + " 但 core.dat 不存在");
    return;
}

log("加载器: 插件目录 -> " + pluginDir);
log("加载器: core.dex -> " + dexPath);
log("加载器: core.dat -> " + datPath);

try {
    // 获取 DEX 优化输出目录
    String cacheDir = null;
    if (context != null) {
        try {
            cacheDir = context.getCodeCacheDir().getAbsolutePath();
        } catch (Throwable e) {
            try {
                cacheDir = context.getCacheDir().getAbsolutePath();
            } catch (Throwable e2) {
                cacheDir = "/data/local/tmp";
            }
        }
    } else {
        cacheDir = System.getProperty("java.io.tmpdir", "/data/local/tmp");
    }

    // 通过反射创建 DexClassLoader (BeanShell 兼容)
    ClassLoader parentLoader = Thread.currentThread().getContextClassLoader();
    if (parentLoader == null) parentLoader = ClassLoader.getSystemClassLoader();

    Class dclClass = Class.forName("dalvik.system.DexClassLoader");
    java.lang.reflect.Constructor dclCon = dclClass.getConstructor(
        new Class[]{String.class, String.class, String.class, ClassLoader.class});
    Object dcl = dclCon.newInstance(new Object[]{dexPath, cacheDir, null, parentLoader});

    // 加载 CoreLoader 类
    java.lang.reflect.Method loadClassMethod = ClassLoader.class.getDeclaredMethod(
        "loadClass", new Class[]{String.class});
    loadClassMethod.setAccessible(true);
    Class coreLoaderClass = (Class) loadClassMethod.invoke(dcl, new Object[]{"CoreLoader"});

    if (coreLoaderClass == null) {
        log("加载器: 无法加载 CoreLoader 类");
        return;
    }

    log("加载器: CoreLoader 类加载成功 -> " + coreLoaderClass.getName());

    // 调用 CoreLoader.load(datPath) 解密
    java.lang.reflect.Method loadMethod = coreLoaderClass.getMethod("load", new Class[]{String.class});
    String source = (String) loadMethod.invoke(null, new Object[]{datPath});

    if (source == null) {
        // 回退: 手动读取文件，通过 InputStream 解密
        log("加载器: load(path) 返回 null，尝试 loadStream...");
        byte[] encData = null;
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream(datFile);
            java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
            byte[] buf = new byte[8192];
            int n;
            while ((n = fis.read(buf)) > 0) baos.write(buf, 0, n);
            fis.close();
            encData = baos.toByteArray();
        } catch (Throwable e) {}

        if (encData != null) {
            java.lang.reflect.Method loadStreamMethod = coreLoaderClass.getMethod(
                "loadStream", new Class[]{java.io.InputStream.class});
            source = (String) loadStreamMethod.invoke(null,
                new Object[]{new java.io.ByteArrayInputStream(encData)});
        }
    }

    if (source != null && source.length() > 0) {
        log("加载器: 解密成功 (" + source.length() + " 字符)，开始执行核心逻辑...");
        // 执行解密后的源码
        this.interpreter.eval(source);
    } else {
        log("加载器: 解密失败，core.dat 可能已损坏");
    }

} catch (Throwable e) {
    log("加载器: 异常: " + e);
    e.printStackTrace();
}
