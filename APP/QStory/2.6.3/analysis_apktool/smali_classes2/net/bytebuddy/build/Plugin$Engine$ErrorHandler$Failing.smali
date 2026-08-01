.class public abstract enum Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Failing"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;",
        ">;",
        "Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

.field public static final enum FAIL_AFTER_TYPE:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

.field public static final enum FAIL_FAST:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

.field public static final enum FAIL_LAST:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing$1;

    .line 2
    .line 3
    const-string v1, "FAIL_FAST"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;->FAIL_FAST:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing$2;

    .line 12
    .line 13
    const-string v3, "FAIL_AFTER_TYPE"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;->FAIL_AFTER_TYPE:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

    .line 20
    .line 21
    new-instance v3, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing$3;

    .line 22
    .line 23
    const-string v5, "FAIL_LAST"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;->FAIL_LAST:Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

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
    sput-object v5, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;->$VALUES:[Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/build/Plugin$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;->$VALUES:[Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler$Failing;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public onError(Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Failed to close plugin "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public onLiveInitializer(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onManifest(Ljava/util/jar/Manifest;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onResource(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onUnresolved(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method
