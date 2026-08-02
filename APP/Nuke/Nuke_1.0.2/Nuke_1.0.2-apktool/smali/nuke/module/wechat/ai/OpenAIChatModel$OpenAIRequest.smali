.class final Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation build Lz41;
.end annotation


# instance fields
.field private final maxTokens:I
    .annotation runtime Lfp2;
        value = "max_tokens"
    .end annotation
.end field

.field private final messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final model:Ljava/lang/String;

.field private final temperature:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;FI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIMessage;",
            ">;FI)V"
        }
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->model:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->messages:Ljava/util/List;

    .line 13
    .line 14
    iput p3, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->temperature:F

    .line 15
    .line 16
    iput p4, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->maxTokens:I

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic copy$default(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;Ljava/lang/String;Ljava/util/List;FIILjava/lang/Object;)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->model:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->messages:Ljava/util/List;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    iget p3, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->temperature:F

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget p4, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->maxTokens:I

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->copy(Ljava/lang/String;Ljava/util/List;FI)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->model:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIMessage;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->messages:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()F
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->temperature:F

    .line 2
    .line 3
    return p0
.end method

.method public final component4()I
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->maxTokens:I

    .line 2
    .line 3
    return p0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;FI)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIMessage;",
            ">;FI)",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;"
        }
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
    new-instance p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;-><init>(Ljava/lang/String;Ljava/util/List;FI)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;

    .line 12
    .line 13
    iget-object v1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->model:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->model:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->messages:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->messages:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget v1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->temperature:F

    .line 36
    .line 37
    iget v3, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->temperature:F

    .line 38
    .line 39
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->maxTokens:I

    .line 47
    .line 48
    iget p1, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->maxTokens:I

    .line 49
    .line 50
    if-eq p0, p1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    return v0
.end method

.method public final getMaxTokens()I
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->maxTokens:I

    .line 2
    .line 3
    return p0
.end method

.method public final getMessages()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIMessage;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->messages:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getModel()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->model:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTemperature()F
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->temperature:F

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->model:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->messages:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget v0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->temperature:F

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Lvi0;->c(FII)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->maxTokens:I

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v0

    .line 31
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->model:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->messages:Ljava/util/List;

    .line 4
    .line 5
    iget v2, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->temperature:F

    .line 6
    .line 7
    iget p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIRequest;->maxTokens:I

    .line 8
    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v4, "OpenAIRequest(model="

    .line 12
    .line 13
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, ", messages="

    .line 20
    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", temperature="

    .line 28
    .line 29
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", maxTokens="

    .line 36
    .line 37
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ")"

    .line 44
    .line 45
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
