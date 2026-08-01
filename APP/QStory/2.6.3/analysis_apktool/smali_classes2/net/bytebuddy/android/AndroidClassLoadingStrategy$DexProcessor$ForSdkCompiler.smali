.class public Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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

.field private static final NOT_VERBOSE:Z = false

.field private static final NO_PRINT_OUTPUT:Ljava/io/Writer;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field private final dexCompilerOptions:Lcom/android/dx/dex/cf/CfOptions;

.field private final dexFileOptions:Lcom/android/dx/dex/DexOptions;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    const-class v0, Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    const-class v1, Lcom/android/dx/dex/cf/CfOptions;

    .line 4
    .line 5
    const-class v2, [B

    .line 6
    .line 7
    const-class v3, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 8
    .line 9
    const-string v4, "translate"

    .line 10
    .line 11
    const-class v5, Lcom/android/dx/dex/cf/CfTranslator;

    .line 12
    .line 13
    const-class v6, Lcom/android/dx/dex/DexOptions;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    :try_start_0
    const-class v8, Lcom/android/dx/command/dexer/DxContext;

    .line 17
    .line 18
    new-instance v14, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm;

    .line 19
    .line 20
    const-class v9, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 21
    .line 22
    const-class v10, [B

    .line 23
    .line 24
    const-class v11, Lcom/android/dx/dex/cf/CfOptions;

    .line 25
    .line 26
    const-class v12, Lcom/android/dx/dex/DexOptions;

    .line 27
    .line 28
    const-class v13, Lcom/android/dx/dex/file/DexFile;

    .line 29
    .line 30
    filled-new-array/range {v8 .. v13}, [Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    invoke-virtual {v5, v4, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    invoke-virtual {v8, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-direct {v14, v9, v8}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForApi26LevelCompatibleVm;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Constructor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    :try_start_1
    new-instance v14, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm;

    .line 47
    .line 48
    filled-new-array {v3, v2, v1, v6, v0}, [Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-virtual {v5, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    const-string v9, "minSdkVersion"

    .line 57
    .line 58
    invoke-virtual {v6, v9}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-direct {v14, v8, v9}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_1
    :try_start_2
    new-instance v14, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm;

    .line 67
    .line 68
    filled-new-array {v3, v2, v1, v6, v0}, [Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v5, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "targetApiLevel"

    .line 77
    .line 78
    invoke-virtual {v6, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-direct {v14, v0, v1}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$ForLegacyVm;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_2
    move-exception v0

    .line 87
    new-instance v14, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$Unavailable;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-direct {v14, v0}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    sput-object v14, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;

    .line 97
    .line 98
    sput-object v7, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->NO_PRINT_OUTPUT:Ljava/io/Writer;

    .line 99
    .line 100
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/cf/CfOptions;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->dexFileOptions:Lcom/android/dx/dex/DexOptions;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->dexCompilerOptions:Lcom/android/dx/dex/cf/CfOptions;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;)Lcom/android/dx/dex/cf/CfOptions;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->dexCompilerOptions:Lcom/android/dx/dex/cf/CfOptions;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;)Lcom/android/dx/dex/DexOptions;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->dexFileOptions:Lcom/android/dx/dex/DexOptions;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200()Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$300()Ljava/io/Writer;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->NO_PRINT_OUTPUT:Ljava/io/Writer;

    .line 2
    .line 3
    return-object v0
.end method

.method public static makeDefault()Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/dex/DexOptions;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/dex/DexOptions;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->DISPATCHER:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;

    .line 7
    .line 8
    const/16 v2, 0xd

    .line 9
    .line 10
    invoke-interface {v1, v0, v2}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Dispatcher;->setTargetApi(Lcom/android/dx/dex/DexOptions;I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;

    .line 14
    .line 15
    new-instance v2, Lcom/android/dx/dex/cf/CfOptions;

    .line 16
    .line 17
    invoke-direct {v2}, Lcom/android/dx/dex/cf/CfOptions;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v0, v2}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;-><init>(Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/cf/CfOptions;)V

    .line 21
    .line 22
    .line 23
    return-object v1
.end method


# virtual methods
.method public create()Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$Conversion;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;

    .line 2
    .line 3
    new-instance v1, Lcom/android/dx/dex/file/DexFile;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;->dexFileOptions:Lcom/android/dx/dex/DexOptions;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcom/android/dx/dex/file/DexFile;-><init>(Lcom/android/dx/dex/DexOptions;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler$Conversion;-><init>(Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$ForSdkCompiler;Lcom/android/dx/dex/file/DexFile;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
