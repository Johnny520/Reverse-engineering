.class public final Lx1/l0;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Lx1/n0;

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:Lx1/v1;


# direct methods
.method public constructor <init>(Lx1/n0;JJLx1/v1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/l0;->g:Lx1/n0;

    .line 2
    .line 3
    iput-wide p2, p0, Lx1/l0;->h:J

    .line 4
    .line 5
    iput-wide p4, p0, Lx1/l0;->i:J

    .line 6
    .line 7
    iput-object p6, p0, Lx1/l0;->j:Lx1/v1;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/l0;->g:Lx1/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/n0;->c1()Lx1/k0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    iput-boolean v2, v1, Lx1/k0;->g:Z

    .line 9
    .line 10
    invoke-virtual {v0}, Lx1/n0;->c1()Lx1/k0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-wide v2, p0, Lx1/l0;->h:J

    .line 15
    .line 16
    iput-wide v2, v1, Lx1/k0;->h:J

    .line 17
    .line 18
    invoke-virtual {v0}, Lx1/n0;->c1()Lx1/k0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-wide v2, p0, Lx1/l0;->i:J

    .line 23
    .line 24
    iput-wide v2, v1, Lx1/k0;->i:J

    .line 25
    .line 26
    iget-object v1, p0, Lx1/l0;->j:Lx1/v1;

    .line 27
    .line 28
    iget-object v1, v1, Lx1/v1;->g:Lv1/o0;

    .line 29
    .line 30
    invoke-interface {v1}, Lv1/o0;->i()Lfg/l;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Lx1/n0;->c1()Lx1/k0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    return-object v0
.end method
