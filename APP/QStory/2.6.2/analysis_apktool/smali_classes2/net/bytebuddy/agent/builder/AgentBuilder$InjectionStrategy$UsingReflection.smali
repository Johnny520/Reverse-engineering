.class public final enum Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "UsingReflection"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;

.field public static final enum INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public resolve(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/loading/ClassInjector;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->isAvailable()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;

    .line 11
    .line 12
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;-><init>(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p1, "Reflection-based injection is not available on the current VM"

    .line 17
    .line 18
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    const-string p1, "Cannot inject auxiliary class into bootstrap loader using reflection"

    .line 23
    .line 24
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method
