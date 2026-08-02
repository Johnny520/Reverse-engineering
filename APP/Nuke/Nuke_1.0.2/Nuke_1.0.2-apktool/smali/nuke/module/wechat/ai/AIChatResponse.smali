.class public final Lnuke/module/wechat/ai/AIChatResponse;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation build Lz41;
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final completionTokens:Ljava/lang/Integer;

.field private final content:Ljava/lang/String;

.field private final finishReason:Ljava/lang/String;

.field private final model:Ljava/lang/String;

.field private final promptTokens:Ljava/lang/Integer;

.field private final totalTokens:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lnuke/module/wechat/ai/AIChatResponse;->content:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lnuke/module/wechat/ai/AIChatResponse;->model:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lnuke/module/wechat/ai/AIChatResponse;->finishReason:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lnuke/module/wechat/ai/AIChatResponse;->promptTokens:Ljava/lang/Integer;

    .line 14
    .line 15
    iput-object p5, p0, Lnuke/module/wechat/ai/AIChatResponse;->completionTokens:Ljava/lang/Integer;

    .line 16
    .line 17
    iput-object p6, p0, Lnuke/module/wechat/ai/AIChatResponse;->totalTokens:Ljava/lang/Integer;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic copy$default(Lnuke/module/wechat/ai/AIChatResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lnuke/module/wechat/ai/AIChatResponse;
    .locals 0

    .line 1
    and-int/lit8 p8, p7, 0x1

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lnuke/module/wechat/ai/AIChatResponse;->content:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lnuke/module/wechat/ai/AIChatResponse;->model:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 14
    .line 15
    if-eqz p8, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lnuke/module/wechat/ai/AIChatResponse;->finishReason:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 20
    .line 21
    if-eqz p8, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lnuke/module/wechat/ai/AIChatResponse;->promptTokens:Ljava/lang/Integer;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 26
    .line 27
    if-eqz p8, :cond_4

    .line 28
    .line 29
    iget-object p5, p0, Lnuke/module/wechat/ai/AIChatResponse;->completionTokens:Ljava/lang/Integer;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 32
    .line 33
    if-eqz p7, :cond_5

    .line 34
    .line 35
    iget-object p6, p0, Lnuke/module/wechat/ai/AIChatResponse;->totalTokens:Ljava/lang/Integer;

    .line 36
    .line 37
    :cond_5
    move-object p7, p5

    .line 38
    move-object p8, p6

    .line 39
    move-object p5, p3

    .line 40
    move-object p6, p4

    .line 41
    move-object p3, p1

    .line 42
    move-object p4, p2

    .line 43
    move-object p2, p0

    .line 44
    invoke-virtual/range {p2 .. p8}, Lnuke/module/wechat/ai/AIChatResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lnuke/module/wechat/ai/AIChatResponse;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->model:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->finishReason:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->promptTokens:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->completionTokens:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->totalTokens:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lnuke/module/wechat/ai/AIChatResponse;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lnuke/module/wechat/ai/AIChatResponse;

    .line 5
    .line 6
    invoke-direct/range {p0 .. p6}, Lnuke/module/wechat/ai/AIChatResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

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
    instance-of v1, p1, Lnuke/module/wechat/ai/AIChatResponse;

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
    check-cast p1, Lnuke/module/wechat/ai/AIChatResponse;

    .line 12
    .line 13
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatResponse;->content:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatResponse;->content:Ljava/lang/String;

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
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatResponse;->model:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatResponse;->model:Ljava/lang/String;

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
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatResponse;->finishReason:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatResponse;->finishReason:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatResponse;->promptTokens:Ljava/lang/Integer;

    .line 47
    .line 48
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatResponse;->promptTokens:Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatResponse;->completionTokens:Ljava/lang/Integer;

    .line 58
    .line 59
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatResponse;->completionTokens:Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->totalTokens:Ljava/lang/Integer;

    .line 69
    .line 70
    iget-object p1, p1, Lnuke/module/wechat/ai/AIChatResponse;->totalTokens:Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    return v0
.end method

.method public final getCompletionTokens()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->completionTokens:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFinishReason()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->finishReason:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getModel()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->model:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPromptTokens()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->promptTokens:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTotalTokens()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->totalTokens:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatResponse;->content:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatResponse;->model:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatResponse;->finishReason:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    move v1, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :goto_1
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatResponse;->promptTokens:Ljava/lang/Integer;

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    move v1, v2

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    :goto_2
    add-int/2addr v0, v1

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatResponse;->completionTokens:Ljava/lang/Integer;

    .line 50
    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    move v1, v2

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    :goto_3
    add-int/2addr v0, v1

    .line 60
    mul-int/lit8 v0, v0, 0x1f

    .line 61
    .line 62
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->totalTokens:Ljava/lang/Integer;

    .line 63
    .line 64
    if-nez p0, :cond_4

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    :goto_4
    add-int/2addr v0, v2

    .line 72
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatResponse;->content:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatResponse;->model:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lnuke/module/wechat/ai/AIChatResponse;->finishReason:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lnuke/module/wechat/ai/AIChatResponse;->promptTokens:Ljava/lang/Integer;

    .line 8
    .line 9
    iget-object v4, p0, Lnuke/module/wechat/ai/AIChatResponse;->completionTokens:Ljava/lang/Integer;

    .line 10
    .line 11
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatResponse;->totalTokens:Ljava/lang/Integer;

    .line 12
    .line 13
    const-string v5, ", model="

    .line 14
    .line 15
    const-string v6, ", finishReason="

    .line 16
    .line 17
    const-string v7, "AIChatResponse(content="

    .line 18
    .line 19
    invoke-static {v7, v0, v5, v1, v6}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", promptTokens="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", completionTokens="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", totalTokens="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, ")"

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method
