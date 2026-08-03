.class public final synthetic Lsh/n0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly0/o;

.field public final synthetic h:Ls0/d;

.field public final synthetic i:Lfg/p;

.field public final synthetic j:Lfg/p;

.field public final synthetic k:I

.field public final synthetic l:Lfg/p;

.field public final synthetic m:I

.field public final synthetic n:Lfg/p;

.field public final synthetic o:Lfg/p;

.field public final synthetic p:J

.field public final synthetic q:Lp/r1;

.field public final synthetic r:Ls0/d;


# direct methods
.method public synthetic constructor <init>(Ly0/o;Ls0/d;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lfg/p;JLp/r1;Ls0/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/n0;->g:Ly0/o;

    .line 5
    .line 6
    iput-object p2, p0, Lsh/n0;->h:Ls0/d;

    .line 7
    .line 8
    iput-object p3, p0, Lsh/n0;->i:Lfg/p;

    .line 9
    .line 10
    iput-object p4, p0, Lsh/n0;->j:Lfg/p;

    .line 11
    .line 12
    iput p5, p0, Lsh/n0;->k:I

    .line 13
    .line 14
    iput-object p6, p0, Lsh/n0;->l:Lfg/p;

    .line 15
    .line 16
    iput p7, p0, Lsh/n0;->m:I

    .line 17
    .line 18
    iput-object p8, p0, Lsh/n0;->n:Lfg/p;

    .line 19
    .line 20
    iput-object p9, p0, Lsh/n0;->o:Lfg/p;

    .line 21
    .line 22
    iput-wide p10, p0, Lsh/n0;->p:J

    .line 23
    .line 24
    iput-object p12, p0, Lsh/n0;->q:Lp/r1;

    .line 25
    .line 26
    iput-object p13, p0, Lsh/n0;->r:Ls0/d;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    check-cast v14, Li0/h0;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x1b1

    .line 15
    .line 16
    invoke-static {v1}, Li0/r;->C(I)I

    .line 17
    .line 18
    .line 19
    move-result v15

    .line 20
    iget-object v1, v0, Lsh/n0;->g:Ly0/o;

    .line 21
    .line 22
    iget-object v2, v0, Lsh/n0;->h:Ls0/d;

    .line 23
    .line 24
    iget-object v3, v0, Lsh/n0;->i:Lfg/p;

    .line 25
    .line 26
    iget-object v4, v0, Lsh/n0;->j:Lfg/p;

    .line 27
    .line 28
    iget v5, v0, Lsh/n0;->k:I

    .line 29
    .line 30
    iget-object v6, v0, Lsh/n0;->l:Lfg/p;

    .line 31
    .line 32
    iget v7, v0, Lsh/n0;->m:I

    .line 33
    .line 34
    iget-object v8, v0, Lsh/n0;->n:Lfg/p;

    .line 35
    .line 36
    iget-object v9, v0, Lsh/n0;->o:Lfg/p;

    .line 37
    .line 38
    iget-wide v10, v0, Lsh/n0;->p:J

    .line 39
    .line 40
    iget-object v12, v0, Lsh/n0;->q:Lp/r1;

    .line 41
    .line 42
    iget-object v13, v0, Lsh/n0;->r:Ls0/d;

    .line 43
    .line 44
    invoke-static/range {v1 .. v15}, Lsh/p0;->a(Ly0/o;Ls0/d;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lfg/p;JLp/r1;Ls0/d;Li0/h0;I)V

    .line 45
    .line 46
    .line 47
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 48
    .line 49
    return-object v1
.end method
