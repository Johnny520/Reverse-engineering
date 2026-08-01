.class public abstract enum Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Target"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;

.field public static final enum BOOTSTRAP:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;

.field public static final enum SYSTEM:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;


# instance fields
.field private final classLoader:Ljava/lang/ClassLoader;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "BOOTSTRAP"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v2, v3, v1}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target$1;-><init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;->BOOTSTRAP:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target$2;

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v4, "SYSTEM"

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    invoke-direct {v1, v4, v5, v2}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target$2;-><init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;->SYSTEM:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    new-array v2, v2, [Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;

    .line 28
    .line 29
    aput-object v0, v2, v3

    .line 30
    .line 31
    aput-object v1, v2, v5

    .line 32
    .line 33
    sput-object v2, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;

    .line 34
    .line 35
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;->classLoader:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassInjector$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;-><init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getClassLoader()Ljava/lang/ClassLoader;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation$Target;->classLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract inject(Ljava/lang/instrument/Instrumentation;Ljava/util/jar/JarFile;)V
.end method
