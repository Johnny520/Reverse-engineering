.class public final Lretrofit2/飘花落叶言子世楪兰苏哲;
.super Lretrofit2/飘花落叶言子楪兰哲世苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Lretrofit2/飘花落叶言子楪哲世兰苏;

.field public final 飘花落叶言子楪世兰苏哲:I

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;ILretrofit2/飘花落叶言子楪哲世兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput p2, p0, Lretrofit2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰苏哲:I

    .line 7
    .line 8
    iput-object p3, p0, Lretrofit2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰哲苏:Lretrofit2/飘花落叶言子楪哲世兰苏;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lretrofit2/飘花落叶言子世哲兰楪苏;Ljava/lang/Object;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, Lretrofit2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰苏哲:I

    .line 3
    .line 4
    iget-object v2, p0, Lretrofit2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    :try_start_0
    iget-object p0, p0, Lretrofit2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰哲苏:Lretrofit2/飘花落叶言子楪哲世兰苏;

    .line 9
    .line 10
    invoke-interface {p0, p2}, Lretrofit2/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    iput-object p0, p1, Lretrofit2/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰世哲:L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;

    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p0

    .line 20
    new-instance p1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "Unable to convert "

    .line 23
    .line 24
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p2, " to RequestBody"

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-array p2, v0, [Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {v2, p0, v1, p1, p2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    throw p0

    .line 46
    :cond_0
    const-string p0, "Body parameter value must not be null."

    .line 47
    .line 48
    new-array p1, v0, [Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v2, v1, p0, p1}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    throw p0
.end method
