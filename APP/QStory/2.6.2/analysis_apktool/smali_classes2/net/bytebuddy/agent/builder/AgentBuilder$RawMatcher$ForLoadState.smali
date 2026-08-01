.class public final enum Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ForLoadState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

.field public static final enum LOADED:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

.field public static final enum UNLOADED:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;


# instance fields
.field private final unloaded:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

    .line 2
    .line 3
    const-string v1, "LOADED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;-><init>(Ljava/lang/String;IZ)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;->LOADED:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

    .line 12
    .line 13
    const-string v2, "UNLOADED"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;->UNLOADED:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

    .line 26
    .line 27
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
    iput-boolean p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;->unloaded:Z

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z
    .locals 0
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/ClassLoader;",
            "Lnet/bytebuddy/utility/JavaModule;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            ")Z"
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 p2, 0x1

    .line 3
    if-nez p4, :cond_0

    .line 4
    .line 5
    move p3, p2

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move p3, p1

    .line 8
    :goto_0
    iget-boolean p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForLoadState;->unloaded:Z

    .line 9
    .line 10
    if-ne p3, p0, :cond_1

    .line 11
    .line 12
    return p2

    .line 13
    :cond_1
    return p1
.end method
