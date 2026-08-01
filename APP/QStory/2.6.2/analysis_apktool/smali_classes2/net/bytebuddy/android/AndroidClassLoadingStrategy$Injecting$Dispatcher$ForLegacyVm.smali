.class public final enum Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ForLegacyVm"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;",
        ">;",
        "Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

.field private static final EXTENSION:Ljava/lang/String; = ".data"

.field public static final enum INSTANCE:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

.field private static final NO_FLAGS:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;->INSTANCE:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;->$VALUES:[Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;->$VALUES:[Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting$Dispatcher$ForLegacyVm;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public loadClass(Ldalvik/system/DexFile;Ljava/lang/ClassLoader;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Class;
    .locals 0
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldalvik/system/DexFile;",
            "Ljava/lang/ClassLoader;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-interface {p3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0, p2}, Ldalvik/system/DexFile;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public loadDex(Ljava/io/File;Ljava/io/File;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/RandomString;)Ldalvik/system/DexFile;
    .locals 0
    .param p3    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance p2, Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance p3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p4}, Lnet/bytebuddy/utility/RandomString;->nextString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p4

    .line 20
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p4, ".data"

    .line 24
    .line 25
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-direct {p2, p1, p3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-static {p0, p1, p2}, Ldalvik/system/DexFile;->loadDex(Ljava/lang/String;Ljava/lang/String;I)Ldalvik/system/DexFile;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
