.class public abstract enum Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Strategy"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$ClassResettingTransformer;,
        Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$ClassRedefinitionTransformer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

.field private static final NO_REDEFINITION:[B
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field private static final REDEFINE_CLASSES:Z = true

.field public static final enum REDEFINITION:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

.field public static final enum RETRANSFORMATION:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;


# instance fields
.field private final redefinition:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$1;

    .line 2
    .line 3
    const-string v1, "REDEFINITION"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$1;-><init>(Ljava/lang/String;IZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->REDEFINITION:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$2;

    .line 13
    .line 14
    const-string v4, "RETRANSFORMATION"

    .line 15
    .line 16
    invoke-direct {v1, v4, v3, v2}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy$2;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->RETRANSFORMATION:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    new-array v4, v4, [Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 23
    .line 24
    aput-object v0, v4, v2

    .line 25
    .line 26
    aput-object v1, v4, v3

    .line 27
    .line 28
    sput-object v4, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->NO_REDEFINITION:[B

    .line 32
    .line 33
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->redefinition:Z

    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IZLnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;-><init>(Ljava/lang/String;IZ)V

    return-void
.end method

.method public static synthetic access$100()[B
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->NO_REDEFINITION:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract apply(Ljava/lang/instrument/Instrumentation;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/instrument/ClassDefinition;",
            ">;)V"
        }
    .end annotation
.end method

.method public isRedefinition()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->redefinition:Z

    .line 2
    .line 3
    return p0
.end method

.method public abstract reset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation
.end method

.method public abstract validate(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;
.end method
