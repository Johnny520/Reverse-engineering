.class public Lretrofit2/HttpException;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final code:I

.field private final message:Ljava/lang/String;

.field private final transient response:Lretrofit2/飘花落叶言子世兰楪哲苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lretrofit2/飘花落叶言子世兰楪哲苏;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lretrofit2/HttpException;->getMessage(Lretrofit2/飘花落叶言子世兰楪哲苏;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;

    .line 9
    .line 10
    iget v1, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    iput v1, p0, Lretrofit2/HttpException;->code:I

    .line 13
    .line 14
    iget-object v0, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lretrofit2/HttpException;->message:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p1, p0, Lretrofit2/HttpException;->response:Lretrofit2/飘花落叶言子世兰楪哲苏;

    .line 19
    .line 20
    return-void
.end method

.method private static getMessage(Lretrofit2/飘花落叶言子世兰楪哲苏;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const-string v0, "response == null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "HTTP "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;

    .line 14
    .line 15
    iget v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰世苏哲:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, " "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method


# virtual methods
.method public code()I
    .locals 0

    .line 1
    iget p0, p0, Lretrofit2/HttpException;->code:I

    .line 2
    .line 3
    return p0
.end method

.method public message()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/HttpException;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public response()Lretrofit2/飘花落叶言子世兰楪哲苏;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf<",
            "*>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 1
    iget-object p0, p0, Lretrofit2/HttpException;->response:Lretrofit2/飘花落叶言子世兰楪哲苏;

    .line 2
    .line 3
    return-object p0
.end method
