.class public abstract enum Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "PatchMode"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

.field public static final enum GAP:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

.field public static final enum OVERLAP:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

.field public static final enum SUBSTITUTE:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$1;

    .line 2
    .line 3
    const-string v1, "GAP"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->GAP:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$2;

    .line 12
    .line 13
    const-string v3, "OVERLAP"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->OVERLAP:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 20
    .line 21
    new-instance v3, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$3;

    .line 22
    .line 23
    const-string v5, "SUBSTITUTE"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->SUBSTITUTE:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 33
    .line 34
    aput-object v0, v5, v2

    .line 35
    .line 36
    aput-object v1, v5, v4

    .line 37
    .line 38
    aput-object v3, v5, v6

    .line 39
    .line 40
    sput-object v5, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 41
    .line 42
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
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static of(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;
    .locals 0

    .line 1
    instance-of p0, p0, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->SUBSTITUTE:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->OVERLAP:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 9
    .line 10
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract toHandler(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;
.end method
