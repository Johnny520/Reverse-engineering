.class public final synthetic Lvp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Luh1;

.field public final synthetic i:Lkr1;

.field public final synthetic j:J

.field public final synthetic k:J

.field public final synthetic l:F

.field public final synthetic m:J

.field public final synthetic n:F

.field public final synthetic o:Ljw1;

.field public final synthetic p:Lr5;

.field public final synthetic q:Lkw;

.field public final synthetic r:I

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Luh1;Lkr1;JJFJFLjw1;Lr5;Lkw;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvp1;->h:Luh1;

    .line 5
    .line 6
    iput-object p2, p0, Lvp1;->i:Lkr1;

    .line 7
    .line 8
    iput-wide p3, p0, Lvp1;->j:J

    .line 9
    .line 10
    iput-wide p5, p0, Lvp1;->k:J

    .line 11
    .line 12
    iput p7, p0, Lvp1;->l:F

    .line 13
    .line 14
    iput-wide p8, p0, Lvp1;->m:J

    .line 15
    .line 16
    iput p10, p0, Lvp1;->n:F

    .line 17
    .line 18
    iput-object p11, p0, Lvp1;->o:Ljw1;

    .line 19
    .line 20
    iput-object p12, p0, Lvp1;->p:Lr5;

    .line 21
    .line 22
    iput-object p13, p0, Lvp1;->q:Lkw;

    .line 23
    .line 24
    iput p14, p0, Lvp1;->r:I

    .line 25
    .line 26
    iput p15, p0, Lvp1;->s:I

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    check-cast v13, Lpx;

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
    iget v1, v0, Lvp1;->r:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Lpp0;->N(I)I

    .line 19
    .line 20
    .line 21
    move-result v14

    .line 22
    iget-object v1, v0, Lvp1;->h:Luh1;

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    iget-object v1, v0, Lvp1;->i:Lkr1;

    .line 26
    .line 27
    move-object v4, v2

    .line 28
    iget-wide v2, v0, Lvp1;->j:J

    .line 29
    .line 30
    move-object v6, v4

    .line 31
    iget-wide v4, v0, Lvp1;->k:J

    .line 32
    .line 33
    move-object v7, v6

    .line 34
    iget v6, v0, Lvp1;->l:F

    .line 35
    .line 36
    move-object v9, v7

    .line 37
    iget-wide v7, v0, Lvp1;->m:J

    .line 38
    .line 39
    move-object v10, v9

    .line 40
    iget v9, v0, Lvp1;->n:F

    .line 41
    .line 42
    move-object v11, v10

    .line 43
    iget-object v10, v0, Lvp1;->o:Ljw1;

    .line 44
    .line 45
    move-object v12, v11

    .line 46
    iget-object v11, v0, Lvp1;->p:Lr5;

    .line 47
    .line 48
    move-object v15, v12

    .line 49
    iget-object v12, v0, Lvp1;->q:Lkw;

    .line 50
    .line 51
    iget v0, v0, Lvp1;->s:I

    .line 52
    .line 53
    move-object/from16 v16, v15

    .line 54
    .line 55
    move v15, v0

    .line 56
    move-object/from16 v0, v16

    .line 57
    .line 58
    invoke-static/range {v0 .. v15}, Lci0;->h(Luh1;Lkr1;JJFJFLjw1;Lr5;Lkw;Lpx;II)V

    .line 59
    .line 60
    .line 61
    sget-object v0, La83;->a:La83;

    .line 62
    .line 63
    return-object v0
.end method
