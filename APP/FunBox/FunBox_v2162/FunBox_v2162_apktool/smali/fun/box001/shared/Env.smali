.class public Lfun/box001/shared/Env;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final API_TYPE_LEGACY:I = 0x4

.field public static final API_TYPE_LSP_100:I = 0x1

.field public static final API_TYPE_LSP_101:I = 0x2

.field public static final API_TYPE_UNKNOWN:I = 0x0

.field public static final API_TYPE_sHooker:I = 0x3

.field public static final LOAD_TYPE_FPA:I = 0x3

.field public static final LOAD_TYPE_LSPATCH:I = 0x2

.field public static final LOAD_TYPE_LSPOSED:I = 0x1

.field public static final LOAD_TYPE_OTHER:I = 0x0

.field public static final LOAD_TYPE_ZYGISK:I = 0x4

.field public static api_type:I

.field public static app_classloader:Ljava/lang/ClassLoader;

.field public static app_context:Landroid/content/Context;

.field public static app_path:Ljava/lang/String;

.field public static data_dir:Ljava/lang/String;

.field public static first_classloader:Ljava/lang/ClassLoader;

.field public static isHotLoading:Z

.field public static load_type:I

.field public static module_classloader:Ljava/lang/ClassLoader;

.field public static module_core_path:Ljava/lang/String;

.field public static module_path:Ljava/lang/String;

.field public static package_name:Ljava/lang/String;

.field public static process_name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
