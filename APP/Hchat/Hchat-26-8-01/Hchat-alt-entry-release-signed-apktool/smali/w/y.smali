.class public final synthetic Lw/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ln2/s;

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ly0/o;

.field public final synthetic j:Li2/n0;

.field public final synthetic k:Lj8/o;

.field public final synthetic l:Lfg/l;

.field public final synthetic m:Lf1/s;

.field public final synthetic n:Z

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:Ln2/j;

.field public final synthetic r:Lw/o0;

.field public final synthetic s:Z

.field public final synthetic t:Lfg/q;

.field public final synthetic u:I

.field public final synthetic v:I


# direct methods
.method public synthetic constructor <init>(Ln2/s;Lfg/l;Ly0/o;Li2/n0;Lj8/o;Lfg/l;Lf1/s;ZIILn2/j;Lw/o0;ZLfg/q;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/y;->g:Ln2/s;

    .line 5
    .line 6
    iput-object p2, p0, Lw/y;->h:Lfg/l;

    .line 7
    .line 8
    iput-object p3, p0, Lw/y;->i:Ly0/o;

    .line 9
    .line 10
    iput-object p4, p0, Lw/y;->j:Li2/n0;

    .line 11
    .line 12
    iput-object p5, p0, Lw/y;->k:Lj8/o;

    .line 13
    .line 14
    iput-object p6, p0, Lw/y;->l:Lfg/l;

    .line 15
    .line 16
    iput-object p7, p0, Lw/y;->m:Lf1/s;

    .line 17
    .line 18
    iput-boolean p8, p0, Lw/y;->n:Z

    .line 19
    .line 20
    iput p9, p0, Lw/y;->o:I

    .line 21
    .line 22
    iput p10, p0, Lw/y;->p:I

    .line 23
    .line 24
    iput-object p11, p0, Lw/y;->q:Ln2/j;

    .line 25
    .line 26
    iput-object p12, p0, Lw/y;->r:Lw/o0;

    .line 27
    .line 28
    iput-boolean p13, p0, Lw/y;->s:Z

    .line 29
    .line 30
    iput-object p14, p0, Lw/y;->t:Lfg/q;

    .line 31
    .line 32
    iput p15, p0, Lw/y;->u:I

    .line 33
    .line 34
    move/from16 p1, p16

    .line 35
    .line 36
    iput p1, p0, Lw/y;->v:I

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    check-cast v15, Li0/h0;

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
    iget v1, v0, Lw/y;->u:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v16

    .line 22
    iget v1, v0, Lw/y;->v:I

    .line 23
    .line 24
    invoke-static {v1}, Li0/r;->C(I)I

    .line 25
    .line 26
    .line 27
    move-result v17

    .line 28
    iget-object v1, v0, Lw/y;->g:Ln2/s;

    .line 29
    .line 30
    iget-object v2, v0, Lw/y;->h:Lfg/l;

    .line 31
    .line 32
    iget-object v3, v0, Lw/y;->i:Ly0/o;

    .line 33
    .line 34
    iget-object v4, v0, Lw/y;->j:Li2/n0;

    .line 35
    .line 36
    iget-object v5, v0, Lw/y;->k:Lj8/o;

    .line 37
    .line 38
    iget-object v6, v0, Lw/y;->l:Lfg/l;

    .line 39
    .line 40
    iget-object v7, v0, Lw/y;->m:Lf1/s;

    .line 41
    .line 42
    iget-boolean v8, v0, Lw/y;->n:Z

    .line 43
    .line 44
    iget v9, v0, Lw/y;->o:I

    .line 45
    .line 46
    iget v10, v0, Lw/y;->p:I

    .line 47
    .line 48
    iget-object v11, v0, Lw/y;->q:Ln2/j;

    .line 49
    .line 50
    iget-object v12, v0, Lw/y;->r:Lw/o0;

    .line 51
    .line 52
    iget-boolean v13, v0, Lw/y;->s:Z

    .line 53
    .line 54
    iget-object v14, v0, Lw/y;->t:Lfg/q;

    .line 55
    .line 56
    invoke-static/range {v1 .. v17}, Lw/s;->f(Ln2/s;Lfg/l;Ly0/o;Li2/n0;Lj8/o;Lfg/l;Lf1/s;ZIILn2/j;Lw/o0;ZLfg/q;Li0/h0;II)V

    .line 57
    .line 58
    .line 59
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    return-object v1
.end method
