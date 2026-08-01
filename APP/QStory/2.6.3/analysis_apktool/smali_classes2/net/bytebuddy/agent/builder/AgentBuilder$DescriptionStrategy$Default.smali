.class public abstract enum Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

.field public static final enum HYBRID:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

.field public static final enum POOL_FIRST:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

.field public static final enum POOL_ONLY:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;


# instance fields
.field private final loadedFirst:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default$1;

    .line 2
    .line 3
    const-string v1, "HYBRID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default$1;-><init>(Ljava/lang/String;IZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;->HYBRID:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default$2;

    .line 13
    .line 14
    const-string v4, "POOL_ONLY"

    .line 15
    .line 16
    invoke-direct {v1, v4, v3, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default$2;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;->POOL_ONLY:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

    .line 20
    .line 21
    new-instance v4, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default$3;

    .line 22
    .line 23
    const-string v5, "POOL_FIRST"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v4, v5, v6, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default$3;-><init>(Ljava/lang/String;IZ)V

    .line 27
    .line 28
    .line 29
    sput-object v4, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;->POOL_FIRST:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

    .line 33
    .line 34
    aput-object v0, v5, v2

    .line 35
    .line 36
    aput-object v1, v5, v3

    .line 37
    .line 38
    aput-object v4, v5, v6

    .line 39
    .line 40
    sput-object v5, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

    .line 41
    .line 42
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
    iput-boolean p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;->loadedFirst:Z

    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IZLnet/bytebuddy/agent/builder/AgentBuilder$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;-><init>(Ljava/lang/String;IZ)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isLoadedFirst()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;->loadedFirst:Z

    .line 2
    .line 3
    return p0
.end method

.method public withSuperTypeLoading()Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$SuperTypeLoading;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$SuperTypeLoading;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public withSuperTypeLoading(Ljava/util/concurrent/ExecutorService;)Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;
    .locals 1

    .line 7
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$SuperTypeLoading$Asynchronous;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$SuperTypeLoading$Asynchronous;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Ljava/util/concurrent/ExecutorService;)V

    return-object v0
.end method
