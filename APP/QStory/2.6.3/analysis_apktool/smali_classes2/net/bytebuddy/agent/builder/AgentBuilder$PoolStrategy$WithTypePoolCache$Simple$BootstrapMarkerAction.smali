.class public final enum Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BootstrapMarkerAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;",
        ">;",
        "Ljava/security/PrivilegedAction<",
        "Ljava/lang/ClassLoader;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;

.field public static final enum INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public run()Ljava/lang/ClassLoader;
    .locals 2

    .line 1
    new-instance p0, Ljava/net/URLClassLoader;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    new-array v0, v0, [Ljava/net/URL;

    .line 5
    .line 6
    sget-object v1, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->BOOTSTRAP_LOADER:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    invoke-direct {p0, v0, v1}, Ljava/net/URLClassLoader;-><init>([Ljava/net/URL;Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public bridge synthetic run()Ljava/lang/Object;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple$BootstrapMarkerAction;->run()Ljava/lang/ClassLoader;

    move-result-object p0

    return-object p0
.end method
