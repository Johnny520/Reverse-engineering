.class public final synthetic Lqr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lin0;

.field public final synthetic j:Luh1;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lmn0;

.field public final synthetic m:Lmn0;

.field public final synthetic n:Z

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:Z

.field public final synthetic r:Z

.field public final synthetic s:Lwb3;

.field public final synthetic t:Lm51;

.field public final synthetic u:Lk51;

.field public final synthetic v:I

.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqr1;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lqr1;->i:Lin0;

    .line 7
    .line 8
    iput-object p3, p0, Lqr1;->j:Luh1;

    .line 9
    .line 10
    iput-object p4, p0, Lqr1;->k:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lqr1;->l:Lmn0;

    .line 13
    .line 14
    iput-object p6, p0, Lqr1;->m:Lmn0;

    .line 15
    .line 16
    iput-boolean p7, p0, Lqr1;->n:Z

    .line 17
    .line 18
    iput p8, p0, Lqr1;->o:I

    .line 19
    .line 20
    iput p9, p0, Lqr1;->p:I

    .line 21
    .line 22
    iput-boolean p10, p0, Lqr1;->q:Z

    .line 23
    .line 24
    iput-boolean p11, p0, Lqr1;->r:Z

    .line 25
    .line 26
    iput-object p12, p0, Lqr1;->s:Lwb3;

    .line 27
    .line 28
    iput-object p13, p0, Lqr1;->t:Lm51;

    .line 29
    .line 30
    iput-object p14, p0, Lqr1;->u:Lk51;

    .line 31
    .line 32
    iput p15, p0, Lqr1;->v:I

    .line 33
    .line 34
    move/from16 p1, p16

    .line 35
    .line 36
    iput p1, p0, Lqr1;->w:I

    .line 37
    .line 38
    move/from16 p1, p17

    .line 39
    .line 40
    iput p1, p0, Lqr1;->x:I

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    check-cast v14, Lpx;

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
    iget v1, v0, Lqr1;->v:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Lpp0;->N(I)I

    .line 19
    .line 20
    .line 21
    move-result v15

    .line 22
    iget v1, v0, Lqr1;->w:I

    .line 23
    .line 24
    invoke-static {v1}, Lpp0;->N(I)I

    .line 25
    .line 26
    .line 27
    move-result v16

    .line 28
    iget-object v1, v0, Lqr1;->h:Ljava/lang/String;

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    iget-object v1, v0, Lqr1;->i:Lin0;

    .line 32
    .line 33
    move-object v3, v2

    .line 34
    iget-object v2, v0, Lqr1;->j:Luh1;

    .line 35
    .line 36
    move-object v4, v3

    .line 37
    iget-object v3, v0, Lqr1;->k:Ljava/lang/String;

    .line 38
    .line 39
    move-object v5, v4

    .line 40
    iget-object v4, v0, Lqr1;->l:Lmn0;

    .line 41
    .line 42
    move-object v6, v5

    .line 43
    iget-object v5, v0, Lqr1;->m:Lmn0;

    .line 44
    .line 45
    move-object v7, v6

    .line 46
    iget-boolean v6, v0, Lqr1;->n:Z

    .line 47
    .line 48
    move-object v8, v7

    .line 49
    iget v7, v0, Lqr1;->o:I

    .line 50
    .line 51
    move-object v9, v8

    .line 52
    iget v8, v0, Lqr1;->p:I

    .line 53
    .line 54
    move-object v10, v9

    .line 55
    iget-boolean v9, v0, Lqr1;->q:Z

    .line 56
    .line 57
    move-object v11, v10

    .line 58
    iget-boolean v10, v0, Lqr1;->r:Z

    .line 59
    .line 60
    move-object v12, v11

    .line 61
    iget-object v11, v0, Lqr1;->s:Lwb3;

    .line 62
    .line 63
    move-object v13, v12

    .line 64
    iget-object v12, v0, Lqr1;->t:Lm51;

    .line 65
    .line 66
    move-object/from16 v17, v13

    .line 67
    .line 68
    iget-object v13, v0, Lqr1;->u:Lk51;

    .line 69
    .line 70
    iget v0, v0, Lqr1;->x:I

    .line 71
    .line 72
    move-object/from16 v18, v17

    .line 73
    .line 74
    move/from16 v17, v0

    .line 75
    .line 76
    move-object/from16 v0, v18

    .line 77
    .line 78
    invoke-static/range {v0 .. v17}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 79
    .line 80
    .line 81
    sget-object v0, La83;->a:La83;

    .line 82
    .line 83
    return-object v0
.end method
