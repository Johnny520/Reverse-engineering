.class public final Lio/ktor/server/plugins/CannotTransformContentToTypeException;
.super Lio/ktor/server/plugins/ContentTransformationException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lio/ktor/server/plugins/CannotTransformContentToTypeException;",
        "Lio/ktor/server/plugins/ContentTransformationException;",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u4e16\u54f2;",
        "Lkotlin/reflect/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
        "type",
        "<init>",
        "(Lkotlin/reflect/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;)V",
        "createCopy",
        "()Lio/ktor/server/plugins/CannotTransformContentToTypeException;",
        "Lkotlin/reflect/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
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
.field private final type:Lkotlin/reflect/飘花落叶言子世楪苏兰哲;


# direct methods
.method public constructor <init>(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "Cannot transform this request\'s content to "

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, v0}, Lio/ktor/server/plugins/ContentTransformationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lio/ktor/server/plugins/CannotTransformContentToTypeException;->type:Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public createCopy()Lio/ktor/server/plugins/CannotTransformContentToTypeException;
    .locals 2

    .line 1
    new-instance v0, Lio/ktor/server/plugins/CannotTransformContentToTypeException;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/server/plugins/CannotTransformContentToTypeException;->type:Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/ktor/server/plugins/CannotTransformContentToTypeException;-><init>(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V

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
    invoke-virtual {p0}, Lio/ktor/server/plugins/CannotTransformContentToTypeException;->createCopy()Lio/ktor/server/plugins/CannotTransformContentToTypeException;

    move-result-object p0

    return-object p0
.end method
