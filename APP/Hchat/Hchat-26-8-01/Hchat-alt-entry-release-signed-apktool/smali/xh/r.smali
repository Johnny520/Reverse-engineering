.class public final synthetic Lxh/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly0/o;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:J

.field public final synthetic j:J

.field public final synthetic k:J

.field public final synthetic l:Z

.field public final synthetic m:Lfg/a;

.field public final synthetic n:J

.field public final synthetic o:J

.field public final synthetic p:Z

.field public final synthetic q:Ls0/d;

.field public final synthetic r:I

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxh/r;->g:Ly0/o;

    .line 5
    .line 6
    iput-object p2, p0, Lxh/r;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lxh/r;->i:J

    .line 9
    .line 10
    iput-wide p5, p0, Lxh/r;->j:J

    .line 11
    .line 12
    iput-wide p7, p0, Lxh/r;->k:J

    .line 13
    .line 14
    iput-boolean p9, p0, Lxh/r;->l:Z

    .line 15
    .line 16
    iput-object p10, p0, Lxh/r;->m:Lfg/a;

    .line 17
    .line 18
    iput-wide p11, p0, Lxh/r;->n:J

    .line 19
    .line 20
    iput-wide p13, p0, Lxh/r;->o:J

    .line 21
    .line 22
    iput-boolean p15, p0, Lxh/r;->p:Z

    .line 23
    .line 24
    move-object/from16 p1, p16

    .line 25
    .line 26
    iput-object p1, p0, Lxh/r;->q:Ls0/d;

    .line 27
    .line 28
    move/from16 p1, p17

    .line 29
    .line 30
    iput p1, p0, Lxh/r;->r:I

    .line 31
    .line 32
    move/from16 p1, p18

    .line 33
    .line 34
    iput p1, p0, Lxh/r;->s:I

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v17, p1

    .line 4
    .line 5
    check-cast v17, Li0/h0;

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
    iget v1, v0, Lxh/r;->r:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v18

    .line 22
    iget v1, v0, Lxh/r;->s:I

    .line 23
    .line 24
    invoke-static {v1}, Li0/r;->C(I)I

    .line 25
    .line 26
    .line 27
    move-result v19

    .line 28
    iget-object v1, v0, Lxh/r;->g:Ly0/o;

    .line 29
    .line 30
    iget-object v2, v0, Lxh/r;->h:Ljava/lang/String;

    .line 31
    .line 32
    iget-wide v3, v0, Lxh/r;->i:J

    .line 33
    .line 34
    iget-wide v5, v0, Lxh/r;->j:J

    .line 35
    .line 36
    iget-wide v7, v0, Lxh/r;->k:J

    .line 37
    .line 38
    iget-boolean v9, v0, Lxh/r;->l:Z

    .line 39
    .line 40
    iget-object v10, v0, Lxh/r;->m:Lfg/a;

    .line 41
    .line 42
    iget-wide v11, v0, Lxh/r;->n:J

    .line 43
    .line 44
    iget-wide v13, v0, Lxh/r;->o:J

    .line 45
    .line 46
    iget-boolean v15, v0, Lxh/r;->p:Z

    .line 47
    .line 48
    move-object/from16 v16, v1

    .line 49
    .line 50
    iget-object v1, v0, Lxh/r;->q:Ls0/d;

    .line 51
    .line 52
    move-object/from16 v20, v16

    .line 53
    .line 54
    move-object/from16 v16, v1

    .line 55
    .line 56
    move-object/from16 v1, v20

    .line 57
    .line 58
    invoke-static/range {v1 .. v19}, Loh/h;->d(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;Li0/h0;II)V

    .line 59
    .line 60
    .line 61
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 62
    .line 63
    return-object v1
.end method
