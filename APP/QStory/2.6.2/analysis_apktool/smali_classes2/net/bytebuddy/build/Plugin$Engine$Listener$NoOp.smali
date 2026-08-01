.class public final enum Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Listener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "NoOp"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;",
        ">;",
        "Lnet/bytebuddy/build/Plugin$Engine$Listener;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

.field public static final enum INSTANCE:Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;->INSTANCE:Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;->$VALUES:[Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;->$VALUES:[Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public onComplete(Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onDiscovery(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onError(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public onError(Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    return-void
.end method

.method public onError(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 3
    return-void
.end method

.method public onError(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V
    .locals 0

    .line 4
    return-void
.end method

.method public onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin;",
            ">;)V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;)V
    .locals 0

    .line 2
    return-void
.end method

.method public onLiveInitializer(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onManifest(Ljava/util/jar/Manifest;)V
    .locals 0
    .param p1    # Ljava/util/jar/Manifest;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    return-void
.end method

.method public onResource(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onTransformation(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin;",
            ">;)V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public onTransformation(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;)V
    .locals 0

    .line 2
    return-void
.end method

.method public onUnresolved(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method
