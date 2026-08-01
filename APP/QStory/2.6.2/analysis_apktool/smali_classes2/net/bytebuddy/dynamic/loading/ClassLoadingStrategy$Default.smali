.class public final enum Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$WrappingDispatcher;,
        Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$InjectionDispatcher;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;",
        ">;",
        "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable<",
        "Ljava/lang/ClassLoader;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

.field public static final enum CHILD_FIRST:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

.field public static final enum CHILD_FIRST_PERSISTENT:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

.field private static final DEFAULT_FORBID_EXISTING:Z = true

.field public static final enum INJECTION:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

.field public static final enum WRAPPER:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

.field public static final enum WRAPPER_PERSISTENT:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;


# instance fields
.field private final dispatcher:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable<",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$WrappingDispatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->LATENT:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v1, v2, v3}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$WrappingDispatcher;-><init>(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Z)V

    .line 9
    .line 10
    .line 11
    const-string v4, "WRAPPER"

    .line 12
    .line 13
    invoke-direct {v0, v4, v3, v1}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->WRAPPER:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 17
    .line 18
    new-instance v1, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 19
    .line 20
    new-instance v4, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$WrappingDispatcher;

    .line 21
    .line 22
    sget-object v5, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->MANIFEST:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    .line 23
    .line 24
    invoke-direct {v4, v5, v3}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$WrappingDispatcher;-><init>(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Z)V

    .line 25
    .line 26
    .line 27
    const-string v3, "WRAPPER_PERSISTENT"

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    invoke-direct {v1, v3, v6, v4}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;)V

    .line 31
    .line 32
    .line 33
    sput-object v1, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->WRAPPER_PERSISTENT:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 34
    .line 35
    new-instance v3, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 36
    .line 37
    new-instance v4, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$WrappingDispatcher;

    .line 38
    .line 39
    invoke-direct {v4, v2, v6}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$WrappingDispatcher;-><init>(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Z)V

    .line 40
    .line 41
    .line 42
    const-string v2, "CHILD_FIRST"

    .line 43
    .line 44
    const/4 v7, 0x2

    .line 45
    invoke-direct {v3, v2, v7, v4}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;)V

    .line 46
    .line 47
    .line 48
    sput-object v3, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->CHILD_FIRST:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 49
    .line 50
    new-instance v2, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 51
    .line 52
    new-instance v4, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$WrappingDispatcher;

    .line 53
    .line 54
    invoke-direct {v4, v5, v6}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$WrappingDispatcher;-><init>(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Z)V

    .line 55
    .line 56
    .line 57
    const-string v5, "CHILD_FIRST_PERSISTENT"

    .line 58
    .line 59
    const/4 v6, 0x3

    .line 60
    invoke-direct {v2, v5, v6, v4}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;)V

    .line 61
    .line 62
    .line 63
    sput-object v2, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->CHILD_FIRST_PERSISTENT:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 64
    .line 65
    new-instance v4, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 66
    .line 67
    new-instance v5, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$InjectionDispatcher;

    .line 68
    .line 69
    invoke-direct {v5}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default$InjectionDispatcher;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v6, "INJECTION"

    .line 73
    .line 74
    const/4 v7, 0x4

    .line 75
    invoke-direct {v4, v6, v7, v5}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;)V

    .line 76
    .line 77
    .line 78
    sput-object v4, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->INJECTION:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 79
    .line 80
    filled-new-array {v0, v1, v3, v2, v4}, [Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 85
    .line 86
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable<",
            "Ljava/lang/ClassLoader;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public allowExistingTypes()Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable<",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;->allowExistingTypes()Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public load(Ljava/lang/ClassLoader;Ljava/util/Map;)Ljava/util/Map;
    .locals 0
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B>;)",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->load(Ljava/lang/ClassLoader;Ljava/util/Map;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public opened()Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable<",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;->opened()Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public with(Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/security/ProtectionDomain;",
            ")",
            "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable<",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;->with(Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public with(Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;)Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;",
            ")",
            "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable<",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation

    .line 9
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;->with(Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;)Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;)Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;",
            ")",
            "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable<",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation

    .line 8
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->dispatcher:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;->with(Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;)Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    move-result-object p0

    return-object p0
.end method
