.class public final Ln9;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Landroid/net/Uri;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:J

.field public final h:Z


# direct methods
.method public constructor <init>(Ljava/io/File;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln9;->a:Ljava/io/File;

    .line 5
    .line 6
    iput-object p2, p0, Ln9;->b:Landroid/net/Uri;

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    :cond_0
    const-string p3, "\u672a\u547d\u540d"

    .line 17
    .line 18
    :cond_1
    iput-object p3, p0, Ln9;->c:Ljava/lang/String;

    .line 19
    .line 20
    const-string p1, ""

    .line 21
    .line 22
    if-nez p4, :cond_2

    .line 23
    .line 24
    move-object p4, p1

    .line 25
    :cond_2
    iput-object p4, p0, Ln9;->d:Ljava/lang/String;

    .line 26
    .line 27
    if-nez p5, :cond_3

    .line 28
    .line 29
    move-object p5, p1

    .line 30
    :cond_3
    iput-object p5, p0, Ln9;->e:Ljava/lang/String;

    .line 31
    .line 32
    const-wide/16 p1, 0x0

    .line 33
    .line 34
    invoke-static {p1, p2, p6, p7}, Ljava/lang/Math;->max(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide p3

    .line 38
    iput-wide p3, p0, Ln9;->f:J

    .line 39
    .line 40
    invoke-static {p1, p2, p8, p9}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iput-wide p1, p0, Ln9;->g:J

    .line 45
    .line 46
    iput-boolean p10, p0, Ln9;->h:Z

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln9;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ln9;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Ln9;->e:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, p0}, Lcom/mr/elaris/w;->d0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method
