.class public final Lio/modelcontextprotocol/kotlin/sdk/McpError;
.super Ljava/lang/Exception;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/modelcontextprotocol/kotlin/sdk/McpError;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "",
        "code",
        "",
        "message",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u54f2\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
        "data",
        "<init>",
        "(ILjava/lang/String;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u54f2\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;)V",
        "I",
        "getCode",
        "()I",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u54f2\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
        "getData",
        "()L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u54f2\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "kotlin-sdk"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final code:I

.field private final data:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

.field private final message:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 8
    .line 9
    .line 10
    iput p1, p0, Lio/modelcontextprotocol/kotlin/sdk/McpError;->code:I

    .line 11
    .line 12
    iput-object p3, p0, Lio/modelcontextprotocol/kotlin/sdk/McpError;->data:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 13
    .line 14
    new-instance p3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v0, "MCP error "

    .line 17
    .line 18
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, ": "

    .line 25
    .line 26
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/McpError;->message:Ljava/lang/String;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 39
    sget-object p3, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 40
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/modelcontextprotocol/kotlin/sdk/McpError;-><init>(ILjava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;)V

    return-void
.end method


# virtual methods
.method public final getCode()I
    .locals 0

    .line 1
    iget p0, p0, Lio/modelcontextprotocol/kotlin/sdk/McpError;->code:I

    .line 2
    .line 3
    return p0
.end method

.method public final getData()L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/modelcontextprotocol/kotlin/sdk/McpError;->data:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/modelcontextprotocol/kotlin/sdk/McpError;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
