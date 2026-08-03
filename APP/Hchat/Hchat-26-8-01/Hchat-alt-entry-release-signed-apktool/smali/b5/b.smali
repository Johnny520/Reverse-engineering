.class public final Lb5/b;
.super Lb5/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Lb5/f;

.field public final j:Lb5/f;

.field public final k:Lb5/f;


# direct methods
.method public constructor <init>(La5/a;Lb5/h;ILjava/lang/String;III)V
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lb5/j;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lb5/b;->h:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v0, Lb5/f;

    .line 7
    .line 8
    const-string v1, "try_start_"

    .line 9
    .line 10
    invoke-direct {v0, p1, p5, v1}, Lb5/f;-><init>(La5/a;ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, v0}, Lb5/h;->b(Lb5/f;)Lb5/f;

    .line 14
    .line 15
    .line 16
    move-result-object p5

    .line 17
    iput-object p5, p0, Lb5/b;->i:Lb5/f;

    .line 18
    .line 19
    new-instance p5, Lb5/e;

    .line 20
    .line 21
    const-string v0, "try_end_"

    .line 22
    .line 23
    invoke-direct {p5, p1, p3, v0}, Lb5/f;-><init>(La5/a;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput p6, p5, Lb5/e;->i:I

    .line 27
    .line 28
    invoke-virtual {p2, p5}, Lb5/h;->b(Lb5/f;)Lb5/f;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    iput-object p3, p0, Lb5/b;->j:Lb5/f;

    .line 33
    .line 34
    if-nez p4, :cond_0

    .line 35
    .line 36
    new-instance p3, Lb5/f;

    .line 37
    .line 38
    const-string p4, "catchall_"

    .line 39
    .line 40
    invoke-direct {p3, p1, p7, p4}, Lb5/f;-><init>(La5/a;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, p3}, Lb5/h;->b(Lb5/f;)Lb5/f;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lb5/b;->k:Lb5/f;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    new-instance p3, Lb5/f;

    .line 51
    .line 52
    const-string p4, "catch_"

    .line 53
    .line 54
    invoke-direct {p3, p1, p7, p4}, Lb5/f;-><init>(La5/a;ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, p3}, Lb5/h;->b(Lb5/f;)Lb5/f;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, Lb5/b;->k:Lb5/f;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final b()D
    .locals 2

    .line 1
    const-wide v0, 0x4059800000000000L    # 102.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public final c(Le5/a;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/b;->h:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ".catchall"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v1, ".catch "

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lq5/a;->write(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    const-string v0, " {"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lb5/b;->i:Lb5/f;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lb5/f;->c(Le5/a;)Z

    .line 27
    .line 28
    .line 29
    const-string v0, " .. "

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lb5/b;->j:Lb5/f;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lb5/f;->c(Le5/a;)Z

    .line 37
    .line 38
    .line 39
    const-string v0, "} "

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lb5/b;->k:Lb5/f;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lb5/f;->c(Le5/a;)Z

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    return p1
.end method
