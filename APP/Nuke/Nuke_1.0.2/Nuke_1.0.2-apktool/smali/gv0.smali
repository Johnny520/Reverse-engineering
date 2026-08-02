.class public final Lgv0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lfr2;


# instance fields
.field public final h:Ltm0;

.field public i:Z

.field public final synthetic j:Liv0;


# direct methods
.method public constructor <init>(Liv0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgv0;->j:Liv0;

    .line 5
    .line 6
    new-instance v0, Ltm0;

    .line 7
    .line 8
    iget-object p1, p1, Liv0;->c:Lb5;

    .line 9
    .line 10
    iget-object p1, p1, Lb5;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ln52;

    .line 13
    .line 14
    iget-object p1, p1, Ln52;->h:Lfr2;

    .line 15
    .line 16
    invoke-interface {p1}, Lfr2;->a()Lo23;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Ltm0;-><init>(Lo23;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lgv0;->h:Ltm0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()Lo23;
    .locals 0

    .line 1
    iget-object p0, p0, Lgv0;->h:Ltm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lgv0;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lgv0;->i:Z

    .line 8
    .line 9
    iget-object v0, p0, Lgv0;->h:Ltm0;

    .line 10
    .line 11
    iget-object v1, v0, Ltm0;->e:Lo23;

    .line 12
    .line 13
    sget-object v2, Lo23;->d:Ln23;

    .line 14
    .line 15
    iput-object v2, v0, Ltm0;->e:Lo23;

    .line 16
    .line 17
    invoke-virtual {v1}, Lo23;->a()Lo23;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lo23;->b()Lo23;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    iget-object p0, p0, Lgv0;->j:Liv0;

    .line 25
    .line 26
    iput v0, p0, Liv0;->d:I

    .line 27
    .line 28
    return-void
.end method

.method public final d(Lfn;J)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lgv0;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p1, Lfn;->i:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    move-wide v5, p2

    .line 10
    invoke-static/range {v1 .. v6}, Lug3;->a(JJJ)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lgv0;->j:Liv0;

    .line 14
    .line 15
    iget-object p0, p0, Liv0;->c:Lb5;

    .line 16
    .line 17
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ln52;

    .line 20
    .line 21
    invoke-virtual {p0, p1, v5, v6}, Ln52;->d(Lfn;J)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "closed"

    .line 26
    .line 27
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lgv0;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Lgv0;->j:Liv0;

    .line 7
    .line 8
    iget-object p0, p0, Liv0;->c:Lb5;

    .line 9
    .line 10
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ln52;

    .line 13
    .line 14
    invoke-virtual {p0}, Ln52;->flush()V

    .line 15
    .line 16
    .line 17
    return-void
.end method
