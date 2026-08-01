.class public abstract Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    aget-object v0, v0, v1

    .line 20
    .line 21
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Type;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪兰苏哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Type;

    .line 33
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪兰苏哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰楪世;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
