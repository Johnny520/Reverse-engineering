.class public final synthetic Lzr0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lj11;


# instance fields
.field public final synthetic d:Lbs0;

.field public final synthetic e:Lm9;


# direct methods
.method public synthetic constructor <init>(Lbs0;Lm9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzr0;->d:Lbs0;

    .line 5
    .line 6
    iput-object p2, p0, Lzr0;->e:Lm9;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lzr0;->d:Lbs0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lbs0;->q:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lbs0;->j()V

    .line 8
    .line 9
    .line 10
    iget-wide v1, v0, Lbs0;->o:J

    .line 11
    .line 12
    iget-object p0, p0, Lzr0;->e:Lm9;

    .line 13
    .line 14
    iget-wide v3, p0, Lm9;->a:J

    .line 15
    .line 16
    invoke-static {v1, v2, v3, v4}, Lm9;->a(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iput-wide v1, p0, Lm9;->a:J

    .line 21
    .line 22
    iget-wide v3, v0, Lbs0;->n:J

    .line 23
    .line 24
    iget-wide v5, p0, Lm9;->b:J

    .line 25
    .line 26
    add-long/2addr v1, v5

    .line 27
    invoke-virtual {v0, v3, v4, v1, v2}, Lbs0;->i(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    xor-int/lit8 p0, p0, 0x1

    .line 32
    .line 33
    iput-boolean p0, v0, Lbs0;->q:Z

    .line 34
    .line 35
    :cond_0
    iget-boolean p0, v0, Lbs0;->q:Z

    .line 36
    .line 37
    return p0
.end method
