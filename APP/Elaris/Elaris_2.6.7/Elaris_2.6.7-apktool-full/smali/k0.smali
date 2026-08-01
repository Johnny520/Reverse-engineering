.class public final Lk0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final g:J

.field public final h:J


# direct methods
.method public constructor <init>(ILjava/lang/String;JJJLjava/lang/String;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lk0;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lk0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lk0;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, Lk0;->d:J

    .line 11
    .line 12
    iput-wide p7, p0, Lk0;->e:J

    .line 13
    .line 14
    iput-object p9, p0, Lk0;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-wide p10, p0, Lk0;->g:J

    .line 17
    .line 18
    iput-wide p12, p0, Lk0;->h:J

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 6

    .line 1
    iget v0, p0, Lk0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-ne v0, v2, :cond_2

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lk0;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_2

    .line 16
    .line 17
    iget-wide v2, p0, Lk0;->c:J

    .line 18
    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    cmp-long v0, v2, v4

    .line 22
    .line 23
    if-gtz v0, :cond_1

    .line 24
    .line 25
    iget-wide v2, p0, Lk0;->d:J

    .line 26
    .line 27
    cmp-long v0, v2, v4

    .line 28
    .line 29
    if-gtz v0, :cond_1

    .line 30
    .line 31
    iget-wide v2, p0, Lk0;->e:J

    .line 32
    .line 33
    cmp-long p0, v2, v4

    .line 34
    .line 35
    if-lez p0, :cond_2

    .line 36
    .line 37
    :cond_1
    return v1

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return p0
.end method
