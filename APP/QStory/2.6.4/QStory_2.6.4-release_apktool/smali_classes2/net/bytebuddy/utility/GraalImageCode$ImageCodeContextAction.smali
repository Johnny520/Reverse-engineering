.class public final enum Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/GraalImageCode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ImageCodeContextAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;",
        ">;",
        "Ljava/security/PrivilegedAction<",
        "Lnet/bytebuddy/utility/GraalImageCode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;

.field public static final enum INSTANCE:Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;->INSTANCE:Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;->$VALUES:[Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;->$VALUES:[Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bridge synthetic run()Ljava/lang/Object;
    .locals 0

    .line 64
    invoke-virtual {p0}, Lnet/bytebuddy/utility/GraalImageCode$ImageCodeContextAction;->run()Lnet/bytebuddy/utility/GraalImageCode;

    move-result-object p0

    return-object p0
.end method

.method public run()Lnet/bytebuddy/utility/GraalImageCode;
    .locals 3

    .line 1
    :try_start_0
    const-string p0, "java.lang.management.ManagementFactory"

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "getRuntimeMXBean"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "getInputArguments"

    .line 19
    .line 20
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    const-string v1, "-agentlib:native-image-agent"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    sget-object p0, Lnet/bytebuddy/utility/GraalImageCode;->AGENT:Lnet/bytebuddy/utility/GraalImageCode;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    return-object p0

    .line 61
    :catchall_0
    :cond_1
    sget-object p0, Lnet/bytebuddy/utility/GraalImageCode;->NONE:Lnet/bytebuddy/utility/GraalImageCode;

    .line 62
    .line 63
    return-object p0
.end method
