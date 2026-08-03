.class public final enum Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "NoOp"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;

.field public static final enum INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;

    filled-new-array {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;
    .locals 1

    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;
    .locals 1

    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;

    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;

    return-object v0
.end method


# virtual methods
.method public onAfterRegistration(Ljava/lang/instrument/Instrumentation;)V
    .locals 0

    return-void
.end method

.method public onBeforeRegistration(Ljava/lang/instrument/Instrumentation;)V
    .locals 0

    return-void
.end method

.method public onRegistration(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
