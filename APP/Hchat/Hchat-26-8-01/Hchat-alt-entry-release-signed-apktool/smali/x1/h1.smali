.class public final Lx1/h1;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Lx1/i1;

.field public final synthetic h:Ly0/n;

.field public final synthetic i:Lx1/e1;

.field public final synthetic j:J

.field public final synthetic k:Lx1/p;

.field public final synthetic l:I

.field public final synthetic m:Z

.field public final synthetic n:F


# direct methods
.method public constructor <init>(Lx1/i1;Ly0/n;Lx1/e1;JLx1/p;IZF)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/h1;->g:Lx1/i1;

    .line 2
    .line 3
    iput-object p2, p0, Lx1/h1;->h:Ly0/n;

    .line 4
    .line 5
    iput-object p3, p0, Lx1/h1;->i:Lx1/e1;

    .line 6
    .line 7
    iput-wide p4, p0, Lx1/h1;->j:J

    .line 8
    .line 9
    iput-object p6, p0, Lx1/h1;->k:Lx1/p;

    .line 10
    .line 11
    iput p7, p0, Lx1/h1;->l:I

    .line 12
    .line 13
    iput-boolean p8, p0, Lx1/h1;->m:Z

    .line 14
    .line 15
    iput p9, p0, Lx1/h1;->n:F

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lx1/h1;->i:Lx1/e1;

    .line 2
    .line 3
    invoke-interface {v0}, Lx1/e1;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lx1/h1;->h:Ly0/n;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lx1/k;->d(Lx1/i;I)Ly0/n;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget v10, p0, Lx1/h1;->n:F

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    iget-object v2, p0, Lx1/h1;->g:Lx1/i1;

    .line 17
    .line 18
    iget-object v4, p0, Lx1/h1;->i:Lx1/e1;

    .line 19
    .line 20
    iget-wide v5, p0, Lx1/h1;->j:J

    .line 21
    .line 22
    iget-object v7, p0, Lx1/h1;->k:Lx1/p;

    .line 23
    .line 24
    iget v8, p0, Lx1/h1;->l:I

    .line 25
    .line 26
    iget-boolean v9, p0, Lx1/h1;->m:Z

    .line 27
    .line 28
    invoke-virtual/range {v2 .. v11}, Lx1/i1;->F1(Ly0/n;Lx1/e1;JLx1/p;IZFZ)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    return-object v0
.end method
