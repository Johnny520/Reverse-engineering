.class public final synthetic Lu03;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Luh1;

.field public final synthetic j:J

.field public final synthetic k:J

.field public final synthetic l:Lim0;

.field public final synthetic m:J

.field public final synthetic n:J

.field public final synthetic o:I

.field public final synthetic p:Z

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Lm13;

.field public final synthetic t:I

.field public final synthetic u:I

.field public final synthetic v:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Luh1;JJLim0;JJIZIILm13;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu03;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lu03;->i:Luh1;

    .line 7
    .line 8
    iput-wide p3, p0, Lu03;->j:J

    .line 9
    .line 10
    iput-wide p5, p0, Lu03;->k:J

    .line 11
    .line 12
    iput-object p7, p0, Lu03;->l:Lim0;

    .line 13
    .line 14
    iput-wide p8, p0, Lu03;->m:J

    .line 15
    .line 16
    iput-wide p10, p0, Lu03;->n:J

    .line 17
    .line 18
    iput p12, p0, Lu03;->o:I

    .line 19
    .line 20
    iput-boolean p13, p0, Lu03;->p:Z

    .line 21
    .line 22
    iput p14, p0, Lu03;->q:I

    .line 23
    .line 24
    iput p15, p0, Lu03;->r:I

    .line 25
    .line 26
    move-object/from16 p1, p16

    .line 27
    .line 28
    iput-object p1, p0, Lu03;->s:Lm13;

    .line 29
    .line 30
    move/from16 p1, p17

    .line 31
    .line 32
    iput p1, p0, Lu03;->t:I

    .line 33
    .line 34
    move/from16 p1, p18

    .line 35
    .line 36
    iput p1, p0, Lu03;->u:I

    .line 37
    .line 38
    move/from16 p1, p19

    .line 39
    .line 40
    iput p1, p0, Lu03;->v:I

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v16, p1

    .line 4
    .line 5
    check-cast v16, Lpx;

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
    iget v1, v0, Lu03;->t:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Lpp0;->N(I)I

    .line 19
    .line 20
    .line 21
    move-result v17

    .line 22
    iget v1, v0, Lu03;->u:I

    .line 23
    .line 24
    invoke-static {v1}, Lpp0;->N(I)I

    .line 25
    .line 26
    .line 27
    move-result v18

    .line 28
    iget-object v1, v0, Lu03;->h:Ljava/lang/String;

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    iget-object v1, v0, Lu03;->i:Luh1;

    .line 32
    .line 33
    move-object v4, v2

    .line 34
    iget-wide v2, v0, Lu03;->j:J

    .line 35
    .line 36
    move-object v6, v4

    .line 37
    iget-wide v4, v0, Lu03;->k:J

    .line 38
    .line 39
    move-object v7, v6

    .line 40
    iget-object v6, v0, Lu03;->l:Lim0;

    .line 41
    .line 42
    move-object v9, v7

    .line 43
    iget-wide v7, v0, Lu03;->m:J

    .line 44
    .line 45
    move-object v11, v9

    .line 46
    iget-wide v9, v0, Lu03;->n:J

    .line 47
    .line 48
    move-object v12, v11

    .line 49
    iget v11, v0, Lu03;->o:I

    .line 50
    .line 51
    move-object v13, v12

    .line 52
    iget-boolean v12, v0, Lu03;->p:Z

    .line 53
    .line 54
    move-object v14, v13

    .line 55
    iget v13, v0, Lu03;->q:I

    .line 56
    .line 57
    move-object v15, v14

    .line 58
    iget v14, v0, Lu03;->r:I

    .line 59
    .line 60
    move-object/from16 v19, v15

    .line 61
    .line 62
    iget-object v15, v0, Lu03;->s:Lm13;

    .line 63
    .line 64
    iget v0, v0, Lu03;->v:I

    .line 65
    .line 66
    move-object/from16 v20, v19

    .line 67
    .line 68
    move/from16 v19, v0

    .line 69
    .line 70
    move-object/from16 v0, v20

    .line 71
    .line 72
    invoke-static/range {v0 .. v19}, Lv03;->b(Ljava/lang/String;Luh1;JJLim0;JJIZIILm13;Lpx;III)V

    .line 73
    .line 74
    .line 75
    sget-object v0, La83;->a:La83;

    .line 76
    .line 77
    return-object v0
.end method
