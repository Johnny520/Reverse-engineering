.class public final Lyw;
.super Lv3;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final j:Lj20;

.field public k:Lmn0;

.field public l:Ljn;

.field public m:Lzt2;

.field public n:Z


# direct methods
.method public constructor <init>(Lj20;Lm22;)V
    .locals 2

    .line 1
    invoke-direct {p0, p2}, Lv3;-><init>(Lt11;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyw;->j:Lj20;

    .line 5
    .line 6
    new-instance p1, Lsb;

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    const/4 v0, 0x4

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, p2, v1, v0}, Lsb;-><init>(ILt00;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lyw;->k:Lmn0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyw;->l:Ljn;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Ljava/util/concurrent/CancellationException;

    .line 6
    .line 7
    const-string v2, "onBack cancelled"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, v2}, Ljn;->g(Ljava/lang/Throwable;Z)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lyw;->m:Lzt2;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lr21;->c(Ljava/util/concurrent/CancellationException;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iput-object v1, p0, Lyw;->l:Ljn;

    .line 25
    .line 26
    iput-object v1, p0, Lyw;->m:Lzt2;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lyw;->n:Z

    .line 30
    .line 31
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyw;->l:Ljn;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lyw;->n:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lyw;->e()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lyw;->l:Ljn;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iput-boolean v2, p0, Lyw;->n:Z

    .line 19
    .line 20
    sget-object v0, Lhn;->h:Lhn;

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    const/4 v4, -0x2

    .line 24
    invoke-static {v4, v3, v0}, Lfg1;->a(IILhn;)Ljn;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lyw;->l:Ljn;

    .line 29
    .line 30
    new-instance v0, La2;

    .line 31
    .line 32
    const/16 v3, 0xa

    .line 33
    .line 34
    invoke-direct {v0, p0, v1, v3}, La2;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    iget-object v4, p0, Lyw;->j:Lj20;

    .line 39
    .line 40
    invoke-static {v4, v1, v0, v3}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lyw;->m:Lzt2;

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Lyw;->l:Ljn;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Ljn;->g(Ljava/lang/Throwable;Z)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    iput-boolean v2, p0, Lyw;->n:Z

    .line 54
    .line 55
    return-void
.end method

.method public final g(Ldj;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyw;->l:Ljn;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyw;->e()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lv3;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lyw;->n:Z

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    const/4 v1, -0x2

    .line 15
    sget-object v2, Lhn;->h:Lhn;

    .line 16
    .line 17
    invoke-static {v1, v0, v2}, Lfg1;->a(IILhn;)Ljn;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lyw;->l:Ljn;

    .line 22
    .line 23
    new-instance v0, La2;

    .line 24
    .line 25
    const/16 v1, 0xa

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, p0, v2, v1}, La2;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    iget-object v3, p0, Lyw;->j:Lj20;

    .line 33
    .line 34
    invoke-static {v3, v2, v0, v1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lyw;->m:Lzt2;

    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final j(Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0}, Lv3;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lyw;->m:Lzt2;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lr21;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lyw;->e()V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-super {p0, p1}, Lv3;->j(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
