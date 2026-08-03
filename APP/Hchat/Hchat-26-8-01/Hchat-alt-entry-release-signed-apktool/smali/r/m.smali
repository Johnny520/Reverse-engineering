.class public final synthetic Lr/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly0/o;

.field public final synthetic h:Lr/z;

.field public final synthetic i:Lp/x0;

.field public final synthetic j:Z

.field public final synthetic k:Lm/p;

.field public final synthetic l:Z

.field public final synthetic m:Lk/k1;

.field public final synthetic n:Ly0/e;

.field public final synthetic o:Lp/i;

.field public final synthetic p:Ly0/f;

.field public final synthetic q:Lp/g;

.field public final synthetic r:Lfg/l;

.field public final synthetic s:I

.field public final synthetic t:I

.field public final synthetic u:I


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lr/z;Lp/x0;ZLm/p;ZLk/k1;Ly0/e;Lp/i;Ly0/f;Lp/g;Lfg/l;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/m;->g:Ly0/o;

    .line 5
    .line 6
    iput-object p2, p0, Lr/m;->h:Lr/z;

    .line 7
    .line 8
    iput-object p3, p0, Lr/m;->i:Lp/x0;

    .line 9
    .line 10
    iput-boolean p4, p0, Lr/m;->j:Z

    .line 11
    .line 12
    iput-object p5, p0, Lr/m;->k:Lm/p;

    .line 13
    .line 14
    iput-boolean p6, p0, Lr/m;->l:Z

    .line 15
    .line 16
    iput-object p7, p0, Lr/m;->m:Lk/k1;

    .line 17
    .line 18
    iput-object p8, p0, Lr/m;->n:Ly0/e;

    .line 19
    .line 20
    iput-object p9, p0, Lr/m;->o:Lp/i;

    .line 21
    .line 22
    iput-object p10, p0, Lr/m;->p:Ly0/f;

    .line 23
    .line 24
    iput-object p11, p0, Lr/m;->q:Lp/g;

    .line 25
    .line 26
    iput-object p12, p0, Lr/m;->r:Lfg/l;

    .line 27
    .line 28
    iput p13, p0, Lr/m;->s:I

    .line 29
    .line 30
    iput p14, p0, Lr/m;->t:I

    .line 31
    .line 32
    iput p15, p0, Lr/m;->u:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    check-cast v13, Li0/h0;

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
    iget v1, v0, Lr/m;->s:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v14

    .line 22
    iget v1, v0, Lr/m;->t:I

    .line 23
    .line 24
    invoke-static {v1}, Li0/r;->C(I)I

    .line 25
    .line 26
    .line 27
    move-result v15

    .line 28
    iget-object v1, v0, Lr/m;->g:Ly0/o;

    .line 29
    .line 30
    iget-object v2, v0, Lr/m;->h:Lr/z;

    .line 31
    .line 32
    iget-object v3, v0, Lr/m;->i:Lp/x0;

    .line 33
    .line 34
    iget-boolean v4, v0, Lr/m;->j:Z

    .line 35
    .line 36
    iget-object v5, v0, Lr/m;->k:Lm/p;

    .line 37
    .line 38
    iget-boolean v6, v0, Lr/m;->l:Z

    .line 39
    .line 40
    iget-object v7, v0, Lr/m;->m:Lk/k1;

    .line 41
    .line 42
    iget-object v8, v0, Lr/m;->n:Ly0/e;

    .line 43
    .line 44
    iget-object v9, v0, Lr/m;->o:Lp/i;

    .line 45
    .line 46
    iget-object v10, v0, Lr/m;->p:Ly0/f;

    .line 47
    .line 48
    iget-object v11, v0, Lr/m;->q:Lp/g;

    .line 49
    .line 50
    iget-object v12, v0, Lr/m;->r:Lfg/l;

    .line 51
    .line 52
    move-object/from16 v16, v1

    .line 53
    .line 54
    iget v1, v0, Lr/m;->u:I

    .line 55
    .line 56
    move-object/from16 v17, v16

    .line 57
    .line 58
    move/from16 v16, v1

    .line 59
    .line 60
    move-object/from16 v1, v17

    .line 61
    .line 62
    invoke-static/range {v1 .. v16}, La7/a;->a(Ly0/o;Lr/z;Lp/x0;ZLm/p;ZLk/k1;Ly0/e;Lp/i;Ly0/f;Lp/g;Lfg/l;Li0/h0;III)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 66
    .line 67
    return-object v1
.end method
