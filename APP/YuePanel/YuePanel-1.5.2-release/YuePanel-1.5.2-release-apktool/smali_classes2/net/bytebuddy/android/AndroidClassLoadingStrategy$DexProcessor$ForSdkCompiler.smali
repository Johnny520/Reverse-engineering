.class public Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForSdkCompiler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;,
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;
    }
.end annotation


# static fields
.field private static final CLASS_FILE_EXTENSION:Ljava/lang/String; = ".class"

.field private static final DEX_COMPATIBLE_API_VERSION:I = 0xd

.field private static final DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;

.field private static final NOT_VERBOSE:Z

.field private static final NO_PRINT_OUTPUT:Ljava/io/Writer;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field private final dexCompilerOptions:Lcom/android/dx/dex/cf/CfOptions;

.field private final dexFileOptions:Lcom/android/dx/dex/DexOptions;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    const-class v0, Lcom/android/dx/dex/file/DexFile;

    const-class v1, Lcom/android/dx/dex/cf/CfOptions;

    const-class v2, [B

    const-class v3, Lcom/android/dx/cf/direct/DirectClassFile;

    const-string v4, "translate"

    const-class v5, Lcom/android/dx/dex/cf/CfTranslator;

    const-class v6, Lcom/android/dx/dex/DexOptions;

    const/4 v7, 0x0

    :try_start_0
    const-class v14, Lcom/android/dx/command/dexer/DxContext;

    new-instance v15, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm;

    const-class v9, Lcom/android/dx/cf/direct/DirectClassFile;

    const-class v10, [B

    const-class v11, Lcom/android/dx/dex/cf/CfOptions;

    const-class v12, Lcom/android/dx/dex/DexOptions;

    const-class v13, Lcom/android/dx/dex/file/DexFile;

    move-object v8, v14

    filled-new-array/range {v8 .. v13}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v5, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v14, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-direct {v15, v8, v9}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Constructor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    :try_start_1
    new-instance v15, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm;

    filled-new-array {v3, v2, v1, v6, v0}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v5, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const-string v9, "minSdkVersion"

    invoke-virtual {v6, v9}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    invoke-direct {v15, v8, v9}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    :try_start_2
    new-instance v15, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm;

    filled-new-array {v3, v2, v1, v6, v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v5, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v1, "targetApiLevel"

    invoke-virtual {v6, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-direct {v15, v0, v1}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    new-instance v15, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$Unavailable;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v15, v0}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    :goto_0
    sput-object v15, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;

    sput-object v7, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->NO_PRINT_OUTPUT:Ljava/io/Writer;

    return-void
.end method

.method public constructor <init>(Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/cf/CfOptions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->dexFileOptions:Lcom/android/dx/dex/DexOptions;

    iput-object p2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->dexCompilerOptions:Lcom/android/dx/dex/cf/CfOptions;

    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;)Lcom/android/dx/dex/cf/CfOptions;
    .locals 0

    iget-object p0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->dexCompilerOptions:Lcom/android/dx/dex/cf/CfOptions;

    return-object p0
.end method

.method public static synthetic access$100(Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;)Lcom/android/dx/dex/DexOptions;
    .locals 0

    iget-object p0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->dexFileOptions:Lcom/android/dx/dex/DexOptions;

    return-object p0
.end method

.method public static synthetic access$200()Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;
    .locals 1

    sget-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;

    return-object v0
.end method

.method public static synthetic access$300()Ljava/io/Writer;
    .locals 1

    sget-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->NO_PRINT_OUTPUT:Ljava/io/Writer;

    return-object v0
.end method

.method public static makeDefault()Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;
    .locals 3

    new-instance v0, Lcom/android/dx/dex/DexOptions;

    invoke-direct {v0}, Lcom/android/dx/dex/DexOptions;-><init>()V

    sget-object v1, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;

    const/16 v2, 0xd

    invoke-interface {v1, v0, v2}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;->setTargetApi(Lcom/android/dx/dex/DexOptions;I)V

    new-instance v1, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;

    new-instance v2, Lcom/android/dx/dex/cf/CfOptions;

    invoke-direct {v2}, Lcom/android/dx/dex/cf/CfOptions;-><init>()V

    invoke-direct {v1, v0, v2}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;-><init>(Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/cf/CfOptions;)V

    return-object v1
.end method


# virtual methods
.method public create()Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$Conversion;
    .locals 3

    new-instance v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;

    new-instance v1, Lcom/android/dx/dex/file/DexFile;

    iget-object v2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->dexFileOptions:Lcom/android/dx/dex/DexOptions;

    invoke-direct {v1, v2}, Lcom/android/dx/dex/file/DexFile;-><init>(Lcom/android/dx/dex/DexOptions;)V

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;-><init>(Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;Lcom/android/dx/dex/file/DexFile;)V

    return-object v0
.end method
