.class final Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation build Lz41;
.end annotation


# instance fields
.field private final finishReason:Ljava/lang/String;
    .annotation runtime Lfp2;
        value = "finish_reason"
    .end annotation
.end field

.field private final message:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 19
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;-><init>(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;Ljava/lang/String;ILc50;)V

    return-void
.end method

.method public constructor <init>(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->message:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;

    .line 18
    iput-object p2, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->finishReason:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;Ljava/lang/String;ILc50;)V
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;-><init>(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic copy$default(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;Ljava/lang/String;ILjava/lang/Object;)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->message:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->finishReason:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->copy(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;Ljava/lang/String;)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final component1()Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->message:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->finishReason:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;Ljava/lang/String;)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;
    .locals 0

    .line 1
    new-instance p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;-><init>(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
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
    instance-of v1, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;

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
    check-cast p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;

    .line 12
    .line 13
    iget-object v1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->message:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;

    .line 14
    .line 15
    iget-object v3, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->message:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;

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
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->finishReason:Ljava/lang/String;

    .line 25
    .line 26
    iget-object p1, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->finishReason:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final getFinishReason()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->finishReason:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMessage()Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->message:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->message:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;

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
    invoke-virtual {v0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->finishReason:Ljava/lang/String;

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    :goto_1
    add-int/2addr v0, v1

    .line 24
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->message:Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;

    .line 2
    .line 3
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->finishReason:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v2, "OpenAIChoice(message="

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v0, ", finishReason="

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ")"

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
