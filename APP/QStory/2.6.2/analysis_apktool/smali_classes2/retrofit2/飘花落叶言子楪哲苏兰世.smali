.class public final Lretrofit2/飘花落叶言子楪哲苏兰世;
.super Lretrofit2/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/飘花落叶言子楪苏世哲兰;
    .locals 3

    .line 1
    invoke-static {p1}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 17
    .line 18
    invoke-static {v0, p1}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-class v0, Lretrofit2/飘花落叶言子世兰苏哲楪;

    .line 23
    .line 24
    invoke-static {p2, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏兰哲世([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v2, p0, Lretrofit2/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    :goto_0
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    invoke-direct {p0, p1, p2, v2}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    const-string p0, "Call return type must be parameterized as Call<Foo> or Call<? extends Foo>"

    .line 41
    .line 42
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v2
.end method
