.class public final enum Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Disabled"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

.field public static final enum INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Ljava/lang/instrument/Instrumentation;Ljava/lang/instrument/ClassFileTransformer;)V
    .locals 0

    .line 1
    return-void
.end method

.method public resolve()Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;
    .locals 0

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer$Suffixing;->withRandomSuffix()Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
