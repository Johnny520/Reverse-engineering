.class public final Lio/ktor/server/plugins/PayloadTooLargeException;
.super Lio/ktor/server/plugins/ContentTransformationException;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/ktor/server/plugins/ContentTransformationException;",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u4e16\u54f2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lio/ktor/server/plugins/PayloadTooLargeException;",
        "Lio/ktor/server/plugins/ContentTransformationException;",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u4e16\u54f2;",
        "",
        "sizeLimit",
        "<init>",
        "(J)V",
        "createCopy",
        "()Lio/ktor/server/plugins/PayloadTooLargeException;",
        "J",
        "ktor-server-core"
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
.field private final sizeLimit:J


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Request is larger than the limit of "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " bytes"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, v0}, Lio/ktor/server/plugins/ContentTransformationException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Lio/ktor/server/plugins/PayloadTooLargeException;->sizeLimit:J

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public createCopy()Lio/ktor/server/plugins/PayloadTooLargeException;
    .locals 3

    .line 1
    new-instance v0, Lio/ktor/server/plugins/PayloadTooLargeException;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/ktor/server/plugins/PayloadTooLargeException;->sizeLimit:J

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, Lio/ktor/server/plugins/PayloadTooLargeException;-><init>(J)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public bridge synthetic createCopy()Ljava/lang/Throwable;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lio/ktor/server/plugins/PayloadTooLargeException;->createCopy()Lio/ktor/server/plugins/PayloadTooLargeException;

    move-result-object p0

    return-object p0
.end method
