.class public abstract enum Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

.field public static final enum DECORATE:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

.field public static final enum REBASE:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

.field public static final enum REDEFINE:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

.field public static final enum REDEFINE_FROZEN:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default$1;

    .line 2
    .line 3
    const-string v1, "REBASE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;->REBASE:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default$2;

    .line 12
    .line 13
    const-string v3, "REDEFINE"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;->REDEFINE:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    .line 20
    .line 21
    new-instance v3, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default$3;

    .line 22
    .line 23
    const-string v5, "REDEFINE_FROZEN"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;->REDEFINE_FROZEN:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    .line 30
    .line 31
    new-instance v5, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default$4;

    .line 32
    .line 33
    const-string v7, "DECORATE"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default$4;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;->DECORATE:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    new-array v7, v7, [Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    .line 43
    .line 44
    aput-object v0, v7, v2

    .line 45
    .line 46
    aput-object v1, v7, v4

    .line 47
    .line 48
    aput-object v3, v7, v6

    .line 49
    .line 50
    aput-object v5, v7, v8

    .line 51
    .line 52
    sput-object v7, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    .line 53
    .line 54
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

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/agent/builder/AgentBuilder$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    .line 8
    .line 9
    return-object v0
.end method
