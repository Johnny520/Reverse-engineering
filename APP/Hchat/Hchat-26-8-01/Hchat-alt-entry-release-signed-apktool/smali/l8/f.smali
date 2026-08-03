.class public final Ll8/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:Lh/Hchat/hooks/api/model/WeChatMessage;


# direct methods
.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILh/Hchat/hooks/api/model/WeChatMessage;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ll8/f;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Ll8/f;->b:J

    .line 7
    .line 8
    const-string p1, ""

    .line 9
    .line 10
    if-eqz p5, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p5, p1

    .line 14
    :goto_0
    iput-object p5, p0, Ll8/f;->c:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz p6, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object p6, p1

    .line 20
    :goto_1
    iput-object p6, p0, Ll8/f;->d:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz p7, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    move-object p7, p1

    .line 26
    :goto_2
    iput-object p7, p0, Ll8/f;->e:Ljava/lang/String;

    .line 27
    .line 28
    iput-wide p8, p0, Ll8/f;->f:J

    .line 29
    .line 30
    if-eqz p10, :cond_3

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_3
    move-object p10, p1

    .line 34
    :goto_3
    iput-object p10, p0, Ll8/f;->g:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p11, :cond_4

    .line 37
    .line 38
    goto :goto_4

    .line 39
    :cond_4
    move-object p11, p1

    .line 40
    :goto_4
    iput-object p11, p0, Ll8/f;->h:Ljava/lang/String;

    .line 41
    .line 42
    iput p12, p0, Ll8/f;->i:I

    .line 43
    .line 44
    iput-object p13, p0, Ll8/f;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    .line 1
    iget-object v0, p0, Ll8/f;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-lez v2, :cond_0

    .line 12
    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-wide v0, p0, Ll8/f;->f:J

    .line 15
    .line 16
    return-wide v0
.end method
