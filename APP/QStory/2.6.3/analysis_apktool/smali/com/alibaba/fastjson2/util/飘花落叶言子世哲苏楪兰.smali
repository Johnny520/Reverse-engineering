.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/reflect/ParameterizedType;


# annotations
.annotation runtime L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;
    typeName = "java.lang.reflect.ParameterizedType"
.end annotation


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

.field public final 飘花落叶言子楪哲苏兰世:[Ljava/lang/reflect/Type;


# direct methods
.method public varargs constructor <init>(Ljava/lang/Class;[Ljava/lang/reflect/Type;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:[Ljava/lang/reflect/Type;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_3

    .line 6
    .line 7
    const-class v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:[Ljava/lang/reflect/Type;

    .line 19
    .line 20
    iget-object v1, p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:[Ljava/lang/reflect/Type;

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

    .line 32
    .line 33
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public final getActualTypeArguments()[Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOwnerType()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getRawType()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit16 v0, v0, 0x3c1

    .line 8
    .line 9
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Type;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, p0

    .line 20
    return v0
.end method
