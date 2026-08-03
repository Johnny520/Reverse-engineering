package fun.box001.shared;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class Env {
    public static final int API_TYPE_LEGACY = 4;
    public static final int API_TYPE_LSP_100 = 1;
    public static final int API_TYPE_LSP_101 = 2;
    public static final int API_TYPE_UNKNOWN = 0;
    public static final int API_TYPE_sHooker = 3;
    public static final int LOAD_TYPE_FPA = 3;
    public static final int LOAD_TYPE_LSPATCH = 2;
    public static final int LOAD_TYPE_LSPOSED = 1;
    public static final int LOAD_TYPE_OTHER = 0;
    public static final int LOAD_TYPE_ZYGISK = 4;
    public static int api_type;
    public static ClassLoader app_classloader;
    public static Context app_context;
    public static String app_path;
    public static String data_dir;
    public static ClassLoader first_classloader;
    public static boolean isHotLoading;
    public static int load_type;
    public static ClassLoader module_classloader;
    public static String module_core_path;
    public static String module_path;
    public static String package_name;
    public static String process_name;
}
