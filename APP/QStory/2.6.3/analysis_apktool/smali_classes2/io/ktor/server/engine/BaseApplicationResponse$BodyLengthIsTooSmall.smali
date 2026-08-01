.class public final Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;
.super Ljava/lang/IllegalStateException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/IllegalStateException;",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u4e16\u54f2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0008\u0018\u00002\u00060\u0001j\u0002`\u00022\u0008\u0012\u0004\u0012\u00020\u00040\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000cR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "io/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall",
        "Ljava/lang/IllegalStateException;",
        "Lkotlin/IllegalStateException;",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u4e16\u54f2;",
        "Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;",
        "",
        "expected",
        "actual",
        "<init>",
        "(JJ)V",
        "createCopy",
        "()Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;",
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
.field private final actual:J

.field private final expected:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Body.size is too small. Body: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ", Content-Length: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-wide p1, p0, Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;->expected:J

    .line 27
    .line 28
    iput-wide p3, p0, Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;->actual:J

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public createCopy()Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;
    .locals 5

    .line 1
    new-instance v0, Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;->expected:J

    .line 4
    .line 5
    iget-wide v3, p0, Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;->actual:J

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, v4}, Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;-><init>(JJ)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public bridge synthetic createCopy()Ljava/lang/Throwable;
    .locals 0

    .line 14
    invoke-virtual {p0}, Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;->createCopy()Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;

    move-result-object p0

    return-object p0
.end method
