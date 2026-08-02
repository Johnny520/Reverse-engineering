.class final Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation build Lz41;
.end annotation


# instance fields
.field private final data:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 13
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;-><init>(Ljava/util/List;ILc50;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelInfo;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;->data:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILc50;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, Lbe0;->h:Lbe0;

    .line 6
    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic copy$default(Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;Ljava/util/List;ILjava/lang/Object;)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;->data:Ljava/util/List;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;->copy(Ljava/util/List;)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;->data:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/util/List;)Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelInfo;",
            ">;)",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;-><init>(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;

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
    check-cast p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;

    .line 12
    .line 13
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;->data:Ljava/util/List;

    .line 14
    .line 15
    iget-object p1, p1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;->data:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final getData()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;->data:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;->data:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;->data:Ljava/util/List;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "OpenAIModelsResponse(data="

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ")"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
