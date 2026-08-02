.class final Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation build Lz41;
.end annotation


# instance fields
.field private final choices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;",
            ">;"
        }
    .end annotation
.end field

.field private final model:Ljava/lang/String;

.field private final usage:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 26
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;ILc50;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;",
            ">;",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->model:Ljava/lang/String;

    .line 24
    iput-object p2, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->choices:Ljava/util/List;

    .line 25
    iput-object p3, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->usage:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;ILc50;)V
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    sget-object p2, Lbe0;->h:Lbe0;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    move-object p3, v0

    .line 18
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static synthetic copy$default(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;Ljava/lang/String;Ljava/util/List;Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;ILjava/lang/Object;)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->model:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->choices:Ljava/util/List;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->usage:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->copy(Ljava/lang/String;Ljava/util/List;Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->model:Ljava/lang/String;

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
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->choices:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->usage:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;",
            ">;",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;",
            ")",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;)V

    .line 7
    .line 8
    .line 9
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
    instance-of v1, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;

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
    check-cast p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;

    .line 12
    .line 13
    iget-object v1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->model:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->model:Ljava/lang/String;

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
    iget-object v1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->choices:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->choices:Ljava/util/List;

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
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->usage:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    .line 36
    .line 37
    iget-object p1, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->usage:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final getChoices()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->choices:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getModel()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->model:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUsage()Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->usage:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->model:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->choices:Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-int/2addr v2, v0

    .line 21
    mul-int/lit8 v2, v2, 0x1f

    .line 22
    .line 23
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->usage:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    .line 24
    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {p0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    :goto_1
    add-int/2addr v2, v1

    .line 33
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->model:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->choices:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->usage:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "OpenAIResponse(model="

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", choices="

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", usage="

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ")"

    .line 34
    .line 35
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
