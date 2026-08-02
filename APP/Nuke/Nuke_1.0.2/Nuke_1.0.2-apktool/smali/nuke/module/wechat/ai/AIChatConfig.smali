.class public final Lnuke/module/wechat/ai/AIChatConfig;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation build Lz41;
.end annotation


# static fields
.field private static final $childSerializers:[Lj71;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj71;"
        }
    .end annotation
.end field

.field public static final $stable:I = 0x8

.field public static final Companion:Le0;

.field public static final DefaultBaseUrl:Ljava/lang/String; = "https://api.openai.com/v1"

.field public static final DefaultContextRounds:I = 0x6

.field public static final DefaultMaxTokens:I = 0x200

.field public static final DefaultTemperature:F = 0.7f

.field public static final MaxContextRounds:I = 0x14

.field public static final MaxOutputTokens:I = 0x8000

.field public static final MaxReplyDelayMs:J = 0xea60L


# instance fields
.field private final apiKey:Ljava/lang/String;

.field private final baseUrl:Ljava/lang/String;

.field private final contextRounds:I

.field private final listMode:Lc1;

.field private final maxTokens:I

.field private final model:Ljava/lang/String;

.field private final replyDelayMs:J

.field private final systemPrompt:Ljava/lang/String;

.field private final targetIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final temperature:F


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Le0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnuke/module/wechat/ai/AIChatConfig;->Companion:Le0;

    .line 7
    .line 8
    new-instance v0, Lc0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Li91;->h:Li91;

    .line 15
    .line 16
    invoke-static {v2, v0}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v3, Lc0;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-direct {v3, v4}, Lc0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/16 v3, 0xa

    .line 31
    .line 32
    new-array v3, v3, [Lj71;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    aput-object v5, v3, v1

    .line 36
    .line 37
    aput-object v5, v3, v4

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    aput-object v5, v3, v1

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    aput-object v5, v3, v1

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    aput-object v5, v3, v1

    .line 47
    .line 48
    const/4 v1, 0x5

    .line 49
    aput-object v5, v3, v1

    .line 50
    .line 51
    const/4 v1, 0x6

    .line 52
    aput-object v5, v3, v1

    .line 53
    .line 54
    const/4 v1, 0x7

    .line 55
    aput-object v5, v3, v1

    .line 56
    .line 57
    const/16 v1, 0x8

    .line 58
    .line 59
    aput-object v0, v3, v1

    .line 60
    .line 61
    const/16 v0, 0x9

    .line 62
    .line 63
    aput-object v2, v3, v0

    .line 64
    .line 65
    sput-object v3, Lnuke/module/wechat/ai/AIChatConfig;->$childSerializers:[Lj71;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 107
    const/16 v12, 0x3ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lnuke/module/wechat/ai/AIChatConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;ILc50;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;Ldp2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p13, p1, 0x1

    .line 5
    .line 6
    if-nez p13, :cond_0

    .line 7
    .line 8
    const-string p2, "https://api.openai.com/v1"

    .line 9
    .line 10
    :cond_0
    iput-object p2, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

    .line 11
    .line 12
    and-int/lit8 p2, p1, 0x2

    .line 13
    .line 14
    const-string p13, ""

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    iput-object p13, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iput-object p3, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 22
    .line 23
    :goto_0
    and-int/lit8 p2, p1, 0x4

    .line 24
    .line 25
    if-nez p2, :cond_2

    .line 26
    .line 27
    iput-object p13, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    iput-object p4, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 31
    .line 32
    :goto_1
    and-int/lit8 p2, p1, 0x8

    .line 33
    .line 34
    if-nez p2, :cond_3

    .line 35
    .line 36
    iput-object p13, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    iput-object p5, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 40
    .line 41
    :goto_2
    and-int/lit8 p2, p1, 0x10

    .line 42
    .line 43
    if-nez p2, :cond_4

    .line 44
    .line 45
    const p2, 0x3f333333    # 0.7f

    .line 46
    .line 47
    .line 48
    iput p2, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_4
    iput p6, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 52
    .line 53
    :goto_3
    and-int/lit8 p2, p1, 0x20

    .line 54
    .line 55
    const/16 p3, 0x200

    .line 56
    .line 57
    if-nez p2, :cond_5

    .line 58
    .line 59
    iput p3, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iput p7, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 63
    .line 64
    :goto_4
    and-int/lit8 p2, p1, 0x40

    .line 65
    .line 66
    if-nez p2, :cond_6

    .line 67
    .line 68
    const/4 p2, 0x6

    .line 69
    iput p2, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_6
    iput p8, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 73
    .line 74
    :goto_5
    and-int/lit16 p2, p1, 0x80

    .line 75
    .line 76
    if-nez p2, :cond_7

    .line 77
    .line 78
    const-wide/16 p4, 0x0

    .line 79
    .line 80
    iput-wide p4, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 81
    .line 82
    goto :goto_6

    .line 83
    :cond_7
    iput-wide p9, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 84
    .line 85
    :goto_6
    and-int/lit16 p2, p1, 0x100

    .line 86
    .line 87
    if-nez p2, :cond_8

    .line 88
    .line 89
    sget-object p2, Lc1;->j:Lc1;

    .line 90
    .line 91
    iput-object p2, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 92
    .line 93
    goto :goto_7

    .line 94
    :cond_8
    iput-object p11, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 95
    .line 96
    :goto_7
    and-int/2addr p1, p3

    .line 97
    if-nez p1, :cond_9

    .line 98
    .line 99
    sget-object p1, Lfe0;->h:Lfe0;

    .line 100
    .line 101
    iput-object p1, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 102
    .line 103
    return-void

    .line 104
    :cond_9
    iput-object p12, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 105
    .line 106
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "FIIJ",
            "Lc1;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-object p1, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

    .line 110
    iput-object p2, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 111
    iput-object p3, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 112
    iput-object p4, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 113
    iput p5, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 114
    iput p6, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 115
    iput p7, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 116
    iput-wide p8, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 117
    iput-object p10, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 118
    iput-object p11, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;ILc50;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    .line 119
    const-string p1, "https://api.openai.com/v1"

    :cond_0
    and-int/lit8 p13, p12, 0x2

    .line 120
    const-string v0, ""

    if-eqz p13, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    const p5, 0x3f333333    # 0.7f

    :cond_4
    and-int/lit8 p13, p12, 0x20

    const/16 v0, 0x200

    if-eqz p13, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    const/4 p7, 0x6

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    const-wide/16 p8, 0x0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    .line 121
    sget-object p10, Lc1;->j:Lc1;

    :cond_8
    and-int/2addr p12, v0

    if-eqz p12, :cond_9

    .line 122
    sget-object p11, Lfe0;->h:Lfe0;

    :cond_9
    move-object p12, p10

    move-object p13, p11

    move-wide p10, p8

    move p8, p6

    move p9, p7

    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 123
    invoke-direct/range {p2 .. p13}, Lnuke/module/wechat/ai/AIChatConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lw41;
    .locals 1

    .line 1
    sget-object v0, Lc1;->Companion:Lb1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb1;->serializer()Lw41;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lw41;
    .locals 2

    .line 1
    new-instance v0, Lcg;

    .line 2
    .line 3
    sget-object v1, Lnv2;->a:Lnv2;

    .line 4
    .line 5
    invoke-direct {v0}, Lcg;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static synthetic a()Lw41;
    .locals 1

    .line 1
    invoke-static {}, Lnuke/module/wechat/ai/AIChatConfig;->_childSerializers$_anonymous_$0()Lw41;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lj71;
    .locals 1

    .line 1
    sget-object v0, Lnuke/module/wechat/ai/AIChatConfig;->$childSerializers:[Lj71;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()Lw41;
    .locals 1

    .line 1
    invoke-static {}, Lnuke/module/wechat/ai/AIChatConfig;->_childSerializers$_anonymous_()Lw41;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic copy$default(Lnuke/module/wechat/ai/AIChatConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;ILjava/lang/Object;)Lnuke/module/wechat/ai/AIChatConfig;
    .locals 0

    .line 1
    and-int/lit8 p13, p12, 0x1

    .line 2
    .line 3
    if-eqz p13, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p13, p12, 0x2

    .line 8
    .line 9
    if-eqz p13, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p13, p12, 0x4

    .line 14
    .line 15
    if-eqz p13, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p13, p12, 0x8

    .line 20
    .line 21
    if-eqz p13, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p13, p12, 0x10

    .line 26
    .line 27
    if-eqz p13, :cond_4

    .line 28
    .line 29
    iget p5, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p13, p12, 0x20

    .line 32
    .line 33
    if-eqz p13, :cond_5

    .line 34
    .line 35
    iget p6, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p13, p12, 0x40

    .line 38
    .line 39
    if-eqz p13, :cond_6

    .line 40
    .line 41
    iget p7, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 42
    .line 43
    :cond_6
    and-int/lit16 p13, p12, 0x80

    .line 44
    .line 45
    if-eqz p13, :cond_7

    .line 46
    .line 47
    iget-wide p8, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 48
    .line 49
    :cond_7
    and-int/lit16 p13, p12, 0x100

    .line 50
    .line 51
    if-eqz p13, :cond_8

    .line 52
    .line 53
    iget-object p10, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 54
    .line 55
    :cond_8
    and-int/lit16 p12, p12, 0x200

    .line 56
    .line 57
    if-eqz p12, :cond_9

    .line 58
    .line 59
    iget-object p11, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 60
    .line 61
    :cond_9
    move-object p12, p10

    .line 62
    move-object p13, p11

    .line 63
    move-wide p10, p8

    .line 64
    move p8, p6

    .line 65
    move p9, p7

    .line 66
    move-object p6, p4

    .line 67
    move p7, p5

    .line 68
    move-object p4, p2

    .line 69
    move-object p5, p3

    .line 70
    move-object p2, p0

    .line 71
    move-object p3, p1

    .line 72
    invoke-virtual/range {p2 .. p13}, Lnuke/module/wechat/ai/AIChatConfig;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;)Lnuke/module/wechat/ai/AIChatConfig;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public static final write$Self$app(Lnuke/module/wechat/ai/AIChatConfig;Lwx;Lyo2;)V
    .locals 5

    .line 1
    sget-object v0, Lnuke/module/wechat/ai/AIChatConfig;->$childSerializers:[Lj71;

    .line 2
    .line 3
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

    .line 11
    .line 12
    const-string v2, "https://api.openai.com/v1"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    :goto_0
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

    .line 21
    .line 22
    move-object v2, p1

    .line 23
    check-cast v2, Ldv2;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v2, p2, v3, v1}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const-string v2, ""

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    :goto_1
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 47
    .line 48
    move-object v3, p1

    .line 49
    check-cast v3, Ldv2;

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    invoke-virtual {v3, p2, v4, v1}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v1, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_5

    .line 69
    .line 70
    :goto_2
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 71
    .line 72
    move-object v3, p1

    .line 73
    check-cast v3, Ldv2;

    .line 74
    .line 75
    const/4 v4, 0x2

    .line 76
    invoke-virtual {v3, p2, v4, v1}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_6

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v1, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_7

    .line 93
    .line 94
    :goto_3
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 95
    .line 96
    move-object v2, p1

    .line 97
    check-cast v2, Ldv2;

    .line 98
    .line 99
    const/4 v3, 0x3

    .line 100
    invoke-virtual {v2, p2, v3, v1}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_7
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    iget v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 111
    .line 112
    const v2, 0x3f333333    # 0.7f

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_9

    .line 120
    .line 121
    :goto_4
    iget v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 122
    .line 123
    move-object v2, p1

    .line 124
    check-cast v2, Ldv2;

    .line 125
    .line 126
    const/4 v3, 0x4

    .line 127
    invoke-virtual {v2, p2, v3}, Ldv2;->s(Lyo2;I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v1}, Ldv2;->m(F)V

    .line 131
    .line 132
    .line 133
    :cond_9
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_a

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_a
    iget v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 141
    .line 142
    const/16 v2, 0x200

    .line 143
    .line 144
    if-eq v1, v2, :cond_b

    .line 145
    .line 146
    :goto_5
    iget v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 147
    .line 148
    move-object v2, p1

    .line 149
    check-cast v2, Ldv2;

    .line 150
    .line 151
    const/4 v3, 0x5

    .line 152
    invoke-virtual {v2, v3, v1, p2}, Ldv2;->u(IILyo2;)V

    .line 153
    .line 154
    .line 155
    :cond_b
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    const/4 v2, 0x6

    .line 160
    if-eqz v1, :cond_c

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_c
    iget v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 164
    .line 165
    if-eq v1, v2, :cond_d

    .line 166
    .line 167
    :goto_6
    iget v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 168
    .line 169
    move-object v3, p1

    .line 170
    check-cast v3, Ldv2;

    .line 171
    .line 172
    invoke-virtual {v3, v2, v1, p2}, Ldv2;->u(IILyo2;)V

    .line 173
    .line 174
    .line 175
    :cond_d
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_e

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_e
    iget-wide v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 183
    .line 184
    const-wide/16 v3, 0x0

    .line 185
    .line 186
    cmp-long v1, v1, v3

    .line 187
    .line 188
    if-eqz v1, :cond_f

    .line 189
    .line 190
    :goto_7
    iget-wide v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 191
    .line 192
    move-object v3, p1

    .line 193
    check-cast v3, Ldv2;

    .line 194
    .line 195
    const/4 v4, 0x7

    .line 196
    invoke-virtual {v3, p2, v4, v1, v2}, Ldv2;->v(Lyo2;IJ)V

    .line 197
    .line 198
    .line 199
    :cond_f
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_10

    .line 204
    .line 205
    goto :goto_8

    .line 206
    :cond_10
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 207
    .line 208
    sget-object v2, Lc1;->j:Lc1;

    .line 209
    .line 210
    if-eq v1, v2, :cond_11

    .line 211
    .line 212
    :goto_8
    const/16 v1, 0x8

    .line 213
    .line 214
    aget-object v2, v0, v1

    .line 215
    .line 216
    invoke-interface {v2}, Lj71;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, Lw41;

    .line 221
    .line 222
    iget-object v3, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 223
    .line 224
    move-object v4, p1

    .line 225
    check-cast v4, Ldv2;

    .line 226
    .line 227
    invoke-virtual {v4, p2, v1, v2, v3}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    :cond_11
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_12

    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_12
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 238
    .line 239
    sget-object v2, Lfe0;->h:Lfe0;

    .line 240
    .line 241
    invoke-static {v1, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    if-nez v1, :cond_13

    .line 246
    .line 247
    :goto_9
    const/16 v1, 0x9

    .line 248
    .line 249
    aget-object v0, v0, v1

    .line 250
    .line 251
    invoke-interface {v0}, Lj71;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, Lw41;

    .line 256
    .line 257
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 258
    .line 259
    check-cast p1, Ldv2;

    .line 260
    .line 261
    invoke-virtual {p1, p2, v1, v0, p0}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_13
    return-void
.end method


# virtual methods
.method public final allowsTalker(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-static {}, Lc80;->s()V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    return v2

    .line 36
    :cond_2
    return v1
.end method

.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component10()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()F
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 2
    .line 3
    return p0
.end method

.method public final component6()I
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 2
    .line 3
    return p0
.end method

.method public final component7()I
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 2
    .line 3
    return p0
.end method

.method public final component8()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component9()Lc1;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;)Lnuke/module/wechat/ai/AIChatConfig;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "FIIJ",
            "Lc1;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lnuke/module/wechat/ai/AIChatConfig;"
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p0, Lnuke/module/wechat/ai/AIChatConfig;

    .line 20
    .line 21
    invoke-direct/range {p0 .. p11}, Lnuke/module/wechat/ai/AIChatConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnuke/module/wechat/ai/AIChatConfig;

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
    check-cast p1, Lnuke/module/wechat/ai/AIChatConfig;

    .line 12
    .line 13
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

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
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

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
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

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
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

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
    iget v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 58
    .line 59
    iget v3, p1, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 60
    .line 61
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 69
    .line 70
    iget v3, p1, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 71
    .line 72
    if-eq v1, v3, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 76
    .line 77
    iget v3, p1, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 78
    .line 79
    if-eq v1, v3, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-wide v3, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 83
    .line 84
    iget-wide v5, p1, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 85
    .line 86
    cmp-long v1, v3, v5

    .line 87
    .line 88
    if-eqz v1, :cond_9

    .line 89
    .line 90
    return v2

    .line 91
    :cond_9
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 92
    .line 93
    iget-object v3, p1, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 94
    .line 95
    if-eq v1, v3, :cond_a

    .line 96
    .line 97
    return v2

    .line 98
    :cond_a
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 99
    .line 100
    iget-object p1, p1, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 101
    .line 102
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_b

    .line 107
    .line 108
    return v2

    .line 109
    :cond_b
    return v0
.end method

.method public final getApiKey()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getBaseUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getContextRounds()I
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 2
    .line 3
    return p0
.end method

.method public final getListMode()Lc1;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMaxTokens()I
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 2
    .line 3
    return p0
.end method

.method public final getModel()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReplyDelayMs()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getSystemPrompt()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTargetIds()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTemperature()F
    .locals 0

    .line 1
    iget p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

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
    iget-object v2, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lvi0;->c(FII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/2addr v2, v0

    .line 59
    mul-int/2addr v2, v1

    .line 60
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    add-int/2addr p0, v2

    .line 67
    return p0
.end method

.method public final isReady()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    .line 1
    iget-object v0, p0, Lnuke/module/wechat/ai/AIChatConfig;->baseUrl:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lnuke/module/wechat/ai/AIChatConfig;->apiKey:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lnuke/module/wechat/ai/AIChatConfig;->model:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lnuke/module/wechat/ai/AIChatConfig;->systemPrompt:Ljava/lang/String;

    .line 8
    .line 9
    iget v4, p0, Lnuke/module/wechat/ai/AIChatConfig;->temperature:F

    .line 10
    .line 11
    iget v5, p0, Lnuke/module/wechat/ai/AIChatConfig;->maxTokens:I

    .line 12
    .line 13
    iget v6, p0, Lnuke/module/wechat/ai/AIChatConfig;->contextRounds:I

    .line 14
    .line 15
    iget-wide v7, p0, Lnuke/module/wechat/ai/AIChatConfig;->replyDelayMs:J

    .line 16
    .line 17
    iget-object v9, p0, Lnuke/module/wechat/ai/AIChatConfig;->listMode:Lc1;

    .line 18
    .line 19
    iget-object p0, p0, Lnuke/module/wechat/ai/AIChatConfig;->targetIds:Ljava/util/Set;

    .line 20
    .line 21
    const-string v10, ", apiKey="

    .line 22
    .line 23
    const-string v11, ", model="

    .line 24
    .line 25
    const-string v12, "AIChatConfig(baseUrl="

    .line 26
    .line 27
    invoke-static {v12, v0, v10, v1, v11}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, ", systemPrompt="

    .line 32
    .line 33
    const-string v10, ", temperature="

    .line 34
    .line 35
    invoke-static {v0, v2, v1, v3, v10}, Lhk1;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", maxTokens="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, ", contextRounds="

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", replyDelayMs="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", listMode="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", targetIds="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p0, ")"

    .line 82
    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method
