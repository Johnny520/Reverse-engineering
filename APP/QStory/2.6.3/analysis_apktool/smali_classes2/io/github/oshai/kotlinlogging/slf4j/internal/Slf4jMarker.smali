.class public final Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lorg/slf4j/Marker;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010)\n\u0002\u0010(\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u0008\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0096\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ \u0010\u000c\u001a\u00020\u000b2\u000e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00020\u0002H\u0096\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\u0005J \u0010\u000e\u001a\u00020\r2\u000e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00020\u0002H\u0096\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0097\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\rH\u0096\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J4\u0010\u0015\u001a&\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002 \u0007*\u0012\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00140\u0013H\u0096\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\r2\u000e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00020\u0002H\u0096\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u000fJ \u0010\u0017\u001a\u00020\r2\u000e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0096\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;",
        "",
        "Lorg/slf4j/Marker;",
        "marker",
        "<init>",
        "(Lorg/slf4j/Marker;)V",
        "",
        "kotlin.jvm.PlatformType",
        "getName",
        "()Ljava/lang/String;",
        "p0",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "add",
        "",
        "remove",
        "(Lorg/slf4j/Marker;)Z",
        "hasChildren",
        "()Z",
        "hasReferences",
        "",
        "",
        "iterator",
        "()Ljava/util/Iterator;",
        "contains",
        "(Ljava/lang/String;)Z",
        "Lorg/slf4j/Marker;",
        "getMarker",
        "()Lorg/slf4j/Marker;",
        "kotlin-logging_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final marker:Lorg/slf4j/Marker;


# direct methods
.method public constructor <init>(Lorg/slf4j/Marker;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;->marker:Lorg/slf4j/Marker;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public add(Lorg/slf4j/Marker;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;->marker:Lorg/slf4j/Marker;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lorg/slf4j/Marker;->add(Lorg/slf4j/Marker;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public contains(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;->marker:Lorg/slf4j/Marker;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lorg/slf4j/Marker;->contains(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public contains(Lorg/slf4j/Marker;)Z
    .locals 0

    .line 8
    iget-object p0, p0, Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;->marker:Lorg/slf4j/Marker;

    invoke-interface {p0, p1}, Lorg/slf4j/Marker;->contains(Lorg/slf4j/Marker;)Z

    move-result p0

    return p0
.end method

.method public final getMarker()Lorg/slf4j/Marker;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;->marker:Lorg/slf4j/Marker;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;->marker:Lorg/slf4j/Marker;

    .line 2
    .line 3
    invoke-interface {p0}, Lorg/slf4j/Marker;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public hasChildren()Z
    .locals 0
    .annotation runtime Lkotlin/飘花落叶言子楪世哲兰苏;
    .end annotation

    .line 1
    iget-object p0, p0, Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;->marker:Lorg/slf4j/Marker;

    .line 2
    .line 3
    invoke-interface {p0}, Lorg/slf4j/Marker;->hasChildren()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public hasReferences()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;->marker:Lorg/slf4j/Marker;

    .line 2
    .line 3
    invoke-interface {p0}, Lorg/slf4j/Marker;->hasReferences()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lorg/slf4j/Marker;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;->marker:Lorg/slf4j/Marker;

    .line 2
    .line 3
    invoke-interface {p0}, Lorg/slf4j/Marker;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public remove(Lorg/slf4j/Marker;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;->marker:Lorg/slf4j/Marker;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lorg/slf4j/Marker;->remove(Lorg/slf4j/Marker;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
