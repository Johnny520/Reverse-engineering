.class public final Lio/ktor/client/call/ReceivePipelineException;
.super Ljava/lang/IllegalStateException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\r\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0008\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/ktor/client/call/ReceivePipelineException;",
        "Ljava/lang/IllegalStateException;",
        "Lkotlin/IllegalStateException;",
        "Lio/ktor/client/call/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "request",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u82cf\u54f2\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "info",
        "",
        "cause",
        "<init>",
        "(Lio/ktor/client/call/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u82cf\u54f2\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;Ljava/lang/Throwable;)V",
        "Lio/ktor/client/call/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "getRequest",
        "()Lio/ktor/client/call/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u82cf\u54f2\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "getInfo",
        "()L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u82cf\u54f2\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "Ljava/lang/Throwable;",
        "getCause",
        "()Ljava/lang/Throwable;",
        "ktor-client-core"
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
.field private final cause:Ljava/lang/Throwable;

.field private final info:L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

.field private final request:Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Fail to run receive pipeline: "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lio/ktor/client/call/ReceivePipelineException;->request:Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    iput-object p2, p0, Lio/ktor/client/call/ReceivePipelineException;->info:L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    iput-object p3, p0, Lio/ktor/client/call/ReceivePipelineException;->cause:Ljava/lang/Throwable;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/client/call/ReceivePipelineException;->cause:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInfo()L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/client/call/ReceivePipelineException;->info:L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRequest()Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/client/call/ReceivePipelineException;->request:Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method
