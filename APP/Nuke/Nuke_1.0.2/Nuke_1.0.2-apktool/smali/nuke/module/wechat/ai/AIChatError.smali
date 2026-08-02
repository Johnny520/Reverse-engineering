.class public final Lnuke/module/wechat/ai/AIChatError;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation build Lz41;
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final code:La1;

.field private final httpCode:Ljava/lang/Integer;

.field private final message:Ljava/lang/String;


# direct methods
.method public constructor <init>(La1;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

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
    iput-object p1, p0, Lnuke/module/wechat/ai/AIChatError;->code:La1;

    .line 11
    .line 12
    iput-object p2, p0, Lnuke/module/wechat/ai/AIChatError;->message:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lnuke/module/wechat/ai/AIChatError;->httpCode:Ljava/lang/Integer;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 17
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lnuke/module/wechat/ai/AIChatError;La1;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lnuke/module/wechat/ai/AIChatError;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lnuke/module/wechat/ai/AIChatError;->code:La1;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lnuke/module/wechat/ai/AIChatError;->message:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lnuke/module/wechat/ai/AIChatError;->httpCode:Ljava/lang/Integer;

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lnuke/module/wechat/ai/AIChatError;->copy(La1;Ljava/lang/String;Ljava/lang/Integer;)Lnuke/module/wechat/ai/AIChatError;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()La1;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatError;->code:La1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatError;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatError;->httpCode:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(La1;Ljava/lang/String;Ljava/lang/Integer;)Lnuke/module/wechat/ai/AIChatError;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lnuke/module/wechat/ai/AIChatError;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;)V

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
    instance-of v1, p1, Lnuke/module/wechat/ai/AIChatError;

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
    check-cast p1, Lnuke/module/wechat/ai/AIChatError;

    .line 12
    .line 13
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatError;->code:La1;

    .line 14
    .line 15
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatError;->code:La1;

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatError;->message:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatError;->message:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatError;->httpCode:Ljava/lang/Integer;

    .line 32
    .line 33
    iget-object p1, p1, Lnuke/module/wechat/ai/AIChatError;->httpCode:Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    return v0
.end method

.method public final getCode()La1;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatError;->code:La1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getHttpCode()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatError;->httpCode:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatError;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatError;->code:La1;

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
    iget-object v2, p0, Lnuke/module/wechat/ai/AIChatError;->message:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatError;->httpCode:Ljava/lang/Integer;

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    :goto_0
    add-int/2addr v0, p0

    .line 27
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatError;->code:La1;

    .line 2
    .line 3
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatError;->message:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatError;->httpCode:Ljava/lang/Integer;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "AIChatError(code="

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
    const-string v0, ", message="

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", httpCode="

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
