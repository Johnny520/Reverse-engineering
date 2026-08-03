.class public final synthetic Lsh/x0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:F

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ly0/o;

.field public final synthetic j:Z

.field public final synthetic k:Llg/a;

.field public final synthetic l:I

.field public final synthetic m:Lfg/a;

.field public final synthetic n:F

.field public final synthetic o:Lsh/r0;

.field public final synthetic p:Lsh/s0;

.field public final synthetic q:Z

.field public final synthetic r:Ljava/util/List;

.field public final synthetic s:F

.field public final synthetic t:I

.field public final synthetic u:I


# direct methods
.method public synthetic constructor <init>(FLfg/l;Ly0/o;ZLlg/a;ILfg/a;FLsh/r0;Lsh/s0;ZLjava/util/List;FII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lsh/x0;->g:F

    .line 5
    .line 6
    iput-object p2, p0, Lsh/x0;->h:Lfg/l;

    .line 7
    .line 8
    iput-object p3, p0, Lsh/x0;->i:Ly0/o;

    .line 9
    .line 10
    iput-boolean p4, p0, Lsh/x0;->j:Z

    .line 11
    .line 12
    iput-object p5, p0, Lsh/x0;->k:Llg/a;

    .line 13
    .line 14
    iput p6, p0, Lsh/x0;->l:I

    .line 15
    .line 16
    iput-object p7, p0, Lsh/x0;->m:Lfg/a;

    .line 17
    .line 18
    iput p8, p0, Lsh/x0;->n:F

    .line 19
    .line 20
    iput-object p9, p0, Lsh/x0;->o:Lsh/r0;

    .line 21
    .line 22
    iput-object p10, p0, Lsh/x0;->p:Lsh/s0;

    .line 23
    .line 24
    iput-boolean p11, p0, Lsh/x0;->q:Z

    .line 25
    .line 26
    iput-object p12, p0, Lsh/x0;->r:Ljava/util/List;

    .line 27
    .line 28
    iput p13, p0, Lsh/x0;->s:F

    .line 29
    .line 30
    iput p14, p0, Lsh/x0;->t:I

    .line 31
    .line 32
    iput p15, p0, Lsh/x0;->u:I

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
    iget v1, v0, Lsh/x0;->t:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v15

    .line 22
    iget v1, v0, Lsh/x0;->g:F

    .line 23
    .line 24
    iget-object v2, v0, Lsh/x0;->h:Lfg/l;

    .line 25
    .line 26
    iget-object v3, v0, Lsh/x0;->i:Ly0/o;

    .line 27
    .line 28
    iget-boolean v4, v0, Lsh/x0;->j:Z

    .line 29
    .line 30
    iget-object v5, v0, Lsh/x0;->k:Llg/a;

    .line 31
    .line 32
    iget v6, v0, Lsh/x0;->l:I

    .line 33
    .line 34
    iget-object v7, v0, Lsh/x0;->m:Lfg/a;

    .line 35
    .line 36
    iget v8, v0, Lsh/x0;->n:F

    .line 37
    .line 38
    iget-object v9, v0, Lsh/x0;->o:Lsh/r0;

    .line 39
    .line 40
    iget-object v10, v0, Lsh/x0;->p:Lsh/s0;

    .line 41
    .line 42
    iget-boolean v11, v0, Lsh/x0;->q:Z

    .line 43
    .line 44
    iget-object v12, v0, Lsh/x0;->r:Ljava/util/List;

    .line 45
    .line 46
    iget v13, v0, Lsh/x0;->s:F

    .line 47
    .line 48
    move/from16 v16, v1

    .line 49
    .line 50
    iget v1, v0, Lsh/x0;->u:I

    .line 51
    .line 52
    move/from16 v17, v16

    .line 53
    .line 54
    move/from16 v16, v1

    .line 55
    .line 56
    move/from16 v1, v17

    .line 57
    .line 58
    invoke-static/range {v1 .. v16}, Lsh/f1;->a(FLfg/l;Ly0/o;ZLlg/a;ILfg/a;FLsh/r0;Lsh/s0;ZLjava/util/List;FLi0/h0;II)V

    .line 59
    .line 60
    .line 61
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 62
    .line 63
    return-object v1
.end method
