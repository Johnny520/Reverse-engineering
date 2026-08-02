.class public final synthetic Lhq1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Luk2;
.implements Lsq2;


# instance fields
.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhq1;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lhq1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lhq1;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp22;

    .line 4
    .line 5
    iget-object p0, p0, Lhq1;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lui;

    .line 8
    .line 9
    iget-boolean v1, v0, Lp22;->x:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lp22;->h()V

    .line 14
    .line 15
    .line 16
    iget-wide v1, v0, Lp22;->v:J

    .line 17
    .line 18
    iget-wide v3, p0, Lui;->a:J

    .line 19
    .line 20
    invoke-static {v1, v2, v3, v4}, Lui;->a(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    iput-wide v1, p0, Lui;->a:J

    .line 25
    .line 26
    iget-wide v3, v0, Lp22;->u:J

    .line 27
    .line 28
    iget-wide v5, p0, Lui;->b:J

    .line 29
    .line 30
    add-long/2addr v1, v5

    .line 31
    invoke-virtual {v0, v3, v4, v1, v2}, Lp22;->g(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    xor-int/lit8 p0, p0, 0x1

    .line 36
    .line 37
    iput-boolean p0, v0, Lp22;->x:Z

    .line 38
    .line 39
    :cond_0
    iget-boolean p0, v0, Lp22;->x:Z

    .line 40
    .line 41
    return p0
.end method

.method public d(Lth2;)Lvk2;
    .locals 2

    .line 1
    iget-object v0, p0, Lhq1;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Liz;

    .line 4
    .line 5
    iget-object p0, p0, Lhq1;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Liz;->d(Lth2;)Lvk2;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, Lth2;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    :goto_0
    iget-object p1, v0, Lvk2;->a:Ljava/io/File;

    .line 24
    .line 25
    iget-object v0, v0, Lvk2;->b:Ljava/io/File;

    .line 26
    .line 27
    new-instance v1, Lvk2;

    .line 28
    .line 29
    invoke-direct {v1, p1, v0, p0}, Lvk2;-><init>(Ljava/io/File;Ljava/io/File;Ljava/io/File;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method
