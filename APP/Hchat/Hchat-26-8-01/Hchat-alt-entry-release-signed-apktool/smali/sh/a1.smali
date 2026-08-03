.class public final synthetic Lsh/a1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lf1/r0;

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:J

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:Lfg/a;

.field public final synthetic n:Llg/a;

.field public final synthetic o:Z

.field public final synthetic p:Z

.field public final synthetic q:[F

.field public final synthetic r:Lfg/a;

.field public final synthetic s:Z

.field public final synthetic t:Ly0/o;

.field public final synthetic u:I

.field public final synthetic v:I


# direct methods
.method public synthetic constructor <init>(Lf1/r0;JJJJJLfg/a;Llg/a;ZZ[FLfg/a;ZLy0/o;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/a1;->g:Lf1/r0;

    .line 5
    .line 6
    iput-wide p2, p0, Lsh/a1;->h:J

    .line 7
    .line 8
    iput-wide p4, p0, Lsh/a1;->i:J

    .line 9
    .line 10
    iput-wide p6, p0, Lsh/a1;->j:J

    .line 11
    .line 12
    iput-wide p8, p0, Lsh/a1;->k:J

    .line 13
    .line 14
    iput-wide p10, p0, Lsh/a1;->l:J

    .line 15
    .line 16
    iput-object p12, p0, Lsh/a1;->m:Lfg/a;

    .line 17
    .line 18
    iput-object p13, p0, Lsh/a1;->n:Llg/a;

    .line 19
    .line 20
    iput-boolean p14, p0, Lsh/a1;->o:Z

    .line 21
    .line 22
    iput-boolean p15, p0, Lsh/a1;->p:Z

    .line 23
    .line 24
    move-object/from16 p1, p16

    .line 25
    .line 26
    iput-object p1, p0, Lsh/a1;->q:[F

    .line 27
    .line 28
    move-object/from16 p1, p17

    .line 29
    .line 30
    iput-object p1, p0, Lsh/a1;->r:Lfg/a;

    .line 31
    .line 32
    move/from16 p1, p18

    .line 33
    .line 34
    iput-boolean p1, p0, Lsh/a1;->s:Z

    .line 35
    .line 36
    move-object/from16 p1, p19

    .line 37
    .line 38
    iput-object p1, p0, Lsh/a1;->t:Ly0/o;

    .line 39
    .line 40
    move/from16 p1, p20

    .line 41
    .line 42
    iput p1, p0, Lsh/a1;->u:I

    .line 43
    .line 44
    move/from16 p1, p21

    .line 45
    .line 46
    iput p1, p0, Lsh/a1;->v:I

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v20, p1

    .line 4
    .line 5
    check-cast v20, Li0/h0;

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
    iget v1, v0, Lsh/a1;->u:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v21

    .line 22
    iget v1, v0, Lsh/a1;->v:I

    .line 23
    .line 24
    invoke-static {v1}, Li0/r;->C(I)I

    .line 25
    .line 26
    .line 27
    move-result v22

    .line 28
    iget-object v1, v0, Lsh/a1;->g:Lf1/r0;

    .line 29
    .line 30
    iget-wide v2, v0, Lsh/a1;->h:J

    .line 31
    .line 32
    iget-wide v4, v0, Lsh/a1;->i:J

    .line 33
    .line 34
    iget-wide v6, v0, Lsh/a1;->j:J

    .line 35
    .line 36
    iget-wide v8, v0, Lsh/a1;->k:J

    .line 37
    .line 38
    iget-wide v10, v0, Lsh/a1;->l:J

    .line 39
    .line 40
    iget-object v12, v0, Lsh/a1;->m:Lfg/a;

    .line 41
    .line 42
    iget-object v13, v0, Lsh/a1;->n:Llg/a;

    .line 43
    .line 44
    iget-boolean v14, v0, Lsh/a1;->o:Z

    .line 45
    .line 46
    iget-boolean v15, v0, Lsh/a1;->p:Z

    .line 47
    .line 48
    move-object/from16 v16, v1

    .line 49
    .line 50
    iget-object v1, v0, Lsh/a1;->q:[F

    .line 51
    .line 52
    move-object/from16 v17, v1

    .line 53
    .line 54
    iget-object v1, v0, Lsh/a1;->r:Lfg/a;

    .line 55
    .line 56
    move-object/from16 v18, v1

    .line 57
    .line 58
    iget-boolean v1, v0, Lsh/a1;->s:Z

    .line 59
    .line 60
    move/from16 v19, v1

    .line 61
    .line 62
    iget-object v1, v0, Lsh/a1;->t:Ly0/o;

    .line 63
    .line 64
    move/from16 v23, v19

    .line 65
    .line 66
    move-object/from16 v19, v1

    .line 67
    .line 68
    move-object/from16 v1, v16

    .line 69
    .line 70
    move-object/from16 v16, v17

    .line 71
    .line 72
    move-object/from16 v17, v18

    .line 73
    .line 74
    move/from16 v18, v23

    .line 75
    .line 76
    invoke-static/range {v1 .. v22}, Lsh/f1;->b(Lf1/r0;JJJJJLfg/a;Llg/a;ZZ[FLfg/a;ZLy0/o;Li0/h0;II)V

    .line 77
    .line 78
    .line 79
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 80
    .line 81
    return-object v1
.end method
