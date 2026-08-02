.class public final Lnuke/module/wechat/ai/AIChatRequest;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation build Lz41;
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final maxTokens:I

.field private final messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/AIChatMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final temperature:F


# direct methods
.method public constructor <init>(Ljava/util/List;FI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/AIChatMessage;",
            ">;FI)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lnuke/module/wechat/ai/AIChatRequest;->messages:Ljava/util/List;

    .line 20
    iput p2, p0, Lnuke/module/wechat/ai/AIChatRequest;->temperature:F

    .line 21
    iput p3, p0, Lnuke/module/wechat/ai/AIChatRequest;->maxTokens:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;FIILc50;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const p2, 0x3f333333    # 0.7f

    .line 6
    .line 7
    .line 8
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    const/16 p3, 0x200

    .line 13
    .line 14
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lnuke/module/wechat/ai/AIChatRequest;-><init>(Ljava/util/List;FI)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic copy$default(Lnuke/module/wechat/ai/AIChatRequest;Ljava/util/List;FIILjava/lang/Object;)Lnuke/module/wechat/ai/AIChatRequest;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lnuke/module/wechat/ai/AIChatRequest;->messages:Ljava/util/List;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget p2, p0, Lnuke/module/wechat/ai/AIChatRequest;->temperature:F

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget p3, p0, Lnuke/module/wechat/ai/AIChatRequest;->maxTokens:I

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lnuke/module/wechat/ai/AIChatRequest;->copy(Ljava/util/List;FI)Lnuke/module/wechat/ai/AIChatRequest;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/AIChatMessage;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatRequest;->messages:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()F
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/AIChatRequest;->temperature:F

    .line 2
    .line 3
    return p0
.end method

.method public final component3()I
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/AIChatRequest;->maxTokens:I

    .line 2
    .line 3
    return p0
.end method

.method public final copy(Ljava/util/List;FI)Lnuke/module/wechat/ai/AIChatRequest;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnuke/module/wechat/ai/AIChatMessage;",
            ">;FI)",
            "Lnuke/module/wechat/ai/AIChatRequest;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lnuke/module/wechat/ai/AIChatRequest;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3}, Lnuke/module/wechat/ai/AIChatRequest;-><init>(Ljava/util/List;FI)V

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
    instance-of v1, p1, Lnuke/module/wechat/ai/AIChatRequest;

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
    check-cast p1, Lnuke/module/wechat/ai/AIChatRequest;

    .line 12
    .line 13
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatRequest;->messages:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatRequest;->messages:Ljava/util/List;

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
    iget v1, p0, Lnuke/module/wechat/ai/AIChatRequest;->temperature:F

    .line 25
    .line 26
    iget v3, p1, Lnuke/module/wechat/ai/AIChatRequest;->temperature:F

    .line 27
    .line 28
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget p0, p0, Lnuke/module/wechat/ai/AIChatRequest;->maxTokens:I

    .line 36
    .line 37
    iget p1, p1, Lnuke/module/wechat/ai/AIChatRequest;->maxTokens:I

    .line 38
    .line 39
    if-eq p0, p1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    return v0
.end method

.method public final getMaxTokens()I
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/AIChatRequest;->maxTokens:I

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
            "Lnuke/module/wechat/ai/AIChatMessage;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatRequest;->messages:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTemperature()F
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/AIChatRequest;->temperature:F

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatRequest;->messages:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget v2, p0, Lnuke/module/wechat/ai/AIChatRequest;->temperature:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lvi0;->c(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget p0, p0, Lnuke/module/wechat/ai/AIChatRequest;->maxTokens:I

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatRequest;->messages:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p0, Lnuke/module/wechat/ai/AIChatRequest;->temperature:F

    .line 4
    .line 5
    iget p0, p0, Lnuke/module/wechat/ai/AIChatRequest;->maxTokens:I

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "AIChatRequest(messages="

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", temperature="

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", maxTokens="

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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
