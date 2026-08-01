.class public final Lkotlinx/serialization/json/JsonDecodingException;
.super Lkotlinx/serialization/json/JsonException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B?\u0008A\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0015\u0010\u0004\u001a\u00020\u0003X\u0096\u0084\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0015\u0010\u0005\u001a\u00020\u0006X\u0086\u0084\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u0084\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\rR\u0017\u0010\u0008\u001a\u0004\u0018\u00010\u0003X\u0086\u0084\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\rR\u0017\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0084\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "Lkotlinx/serialization/json/JsonDecodingException;",
        "Lkotlinx/serialization/json/JsonException;",
        "fullMessage",
        "",
        "shortMessage",
        "offset",
        "",
        "path",
        "input",
        "hint",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getShortMessage",
        "()Ljava/lang/String;",
        "getOffset",
        "()I",
        "getPath",
        "getInput",
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
.field private final hint:Ljava/lang/String;

.field private final input:Ljava/lang/String;

.field private final offset:I

.field private final path:Ljava/lang/String;

.field private final shortMessage:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lkotlin/飘花落叶言子楪世哲兰苏;
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, v0}, Lkotlinx/serialization/json/JsonException;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lkotlinx/serialization/json/JsonDecodingException;->shortMessage:Ljava/lang/String;

    .line 12
    .line 13
    iput p3, p0, Lkotlinx/serialization/json/JsonDecodingException;->offset:I

    .line 14
    .line 15
    iput-object p4, p0, Lkotlinx/serialization/json/JsonDecodingException;->path:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p5, p0, Lkotlinx/serialization/json/JsonDecodingException;->input:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p6, p0, Lkotlinx/serialization/json/JsonDecodingException;->hint:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public getHint()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/serialization/json/JsonDecodingException;->hint:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInput()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/serialization/json/JsonDecodingException;->input:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOffset()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlinx/serialization/json/JsonDecodingException;->offset:I

    .line 2
    .line 3
    return p0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/serialization/json/JsonDecodingException;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getShortMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/serialization/json/JsonDecodingException;->shortMessage:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
