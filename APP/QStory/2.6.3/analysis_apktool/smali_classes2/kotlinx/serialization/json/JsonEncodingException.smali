.class public final Lkotlinx/serialization/json/JsonEncodingException;
.super Lkotlinx/serialization/json/JsonException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B)\u0008@\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u00020\u0003X\u0096\u0084\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u0084\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0084\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlinx/serialization/json/JsonEncodingException;",
        "Lkotlinx/serialization/json/JsonException;",
        "shortMessage",
        "",
        "classSerialName",
        "hint",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getShortMessage",
        "()Ljava/lang/String;",
        "getClassSerialName",
        "getHint",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final classSerialName:Ljava/lang/String;

.field private final hint:Ljava/lang/String;

.field private final shortMessage:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_1

    .line 5
    .line 6
    invoke-static {p3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲兰世楪(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v0, "\n"

    .line 14
    .line 15
    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const-string v0, ""

    .line 21
    .line 22
    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {p0, v0, v1}, Lkotlinx/serialization/json/JsonException;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lkotlinx/serialization/json/JsonEncodingException;->shortMessage:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p2, p0, Lkotlinx/serialization/json/JsonEncodingException;->classSerialName:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p3, p0, Lkotlinx/serialization/json/JsonEncodingException;->hint:Ljava/lang/String;

    .line 35
    .line 36
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 37
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lkotlinx/serialization/json/JsonEncodingException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getClassSerialName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/serialization/json/JsonEncodingException;->classSerialName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHint()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/serialization/json/JsonEncodingException;->hint:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getShortMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/serialization/json/JsonEncodingException;->shortMessage:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
