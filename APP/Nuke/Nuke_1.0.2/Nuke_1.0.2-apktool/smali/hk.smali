.class public final synthetic Lhk;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lin0;

.field public final synthetic j:Luh1;

.field public final synthetic k:Z

.field public final synthetic l:Z

.field public final synthetic m:Lm13;

.field public final synthetic n:Lm51;

.field public final synthetic o:Lk51;

.field public final synthetic p:Z

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Lwb3;

.field public final synthetic t:Lin0;

.field public final synthetic u:Lft2;

.field public final synthetic v:Lkw;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lin0;Luh1;ZZLm13;Lm51;Lk51;ZIILwb3;Lin0;Lft2;Lkw;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhk;->h:Ljava/lang/String;

    iput-object p2, p0, Lhk;->i:Lin0;

    iput-object p3, p0, Lhk;->j:Luh1;

    iput-boolean p4, p0, Lhk;->k:Z

    iput-boolean p5, p0, Lhk;->l:Z

    iput-object p6, p0, Lhk;->m:Lm13;

    iput-object p7, p0, Lhk;->n:Lm51;

    iput-object p8, p0, Lhk;->o:Lk51;

    iput-boolean p9, p0, Lhk;->p:Z

    iput p10, p0, Lhk;->q:I

    iput p11, p0, Lhk;->r:I

    iput-object p12, p0, Lhk;->s:Lwb3;

    iput-object p13, p0, Lhk;->t:Lin0;

    iput-object p14, p0, Lhk;->u:Lft2;

    iput-object p15, p0, Lhk;->v:Lkw;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    check-cast v15, Lpx;

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
    const/4 v1, 0x1

    .line 15
    invoke-static {v1}, Lpp0;->N(I)I

    .line 16
    .line 17
    .line 18
    move-result v16

    .line 19
    iget-object v1, v0, Lhk;->h:Ljava/lang/String;

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    iget-object v1, v0, Lhk;->i:Lin0;

    .line 23
    .line 24
    move-object v3, v2

    .line 25
    iget-object v2, v0, Lhk;->j:Luh1;

    .line 26
    .line 27
    move-object v4, v3

    .line 28
    iget-boolean v3, v0, Lhk;->k:Z

    .line 29
    .line 30
    move-object v5, v4

    .line 31
    iget-boolean v4, v0, Lhk;->l:Z

    .line 32
    .line 33
    move-object v6, v5

    .line 34
    iget-object v5, v0, Lhk;->m:Lm13;

    .line 35
    .line 36
    move-object v7, v6

    .line 37
    iget-object v6, v0, Lhk;->n:Lm51;

    .line 38
    .line 39
    move-object v8, v7

    .line 40
    iget-object v7, v0, Lhk;->o:Lk51;

    .line 41
    .line 42
    move-object v9, v8

    .line 43
    iget-boolean v8, v0, Lhk;->p:Z

    .line 44
    .line 45
    move-object v10, v9

    .line 46
    iget v9, v0, Lhk;->q:I

    .line 47
    .line 48
    move-object v11, v10

    .line 49
    iget v10, v0, Lhk;->r:I

    .line 50
    .line 51
    move-object v12, v11

    .line 52
    iget-object v11, v0, Lhk;->s:Lwb3;

    .line 53
    .line 54
    move-object v13, v12

    .line 55
    iget-object v12, v0, Lhk;->t:Lin0;

    .line 56
    .line 57
    move-object v14, v13

    .line 58
    iget-object v13, v0, Lhk;->u:Lft2;

    .line 59
    .line 60
    iget-object v0, v0, Lhk;->v:Lkw;

    .line 61
    .line 62
    move-object/from16 v17, v14

    .line 63
    .line 64
    move-object v14, v0

    .line 65
    move-object/from16 v0, v17

    .line 66
    .line 67
    invoke-static/range {v0 .. v16}, Lik;->a(Ljava/lang/String;Lin0;Luh1;ZZLm13;Lm51;Lk51;ZIILwb3;Lin0;Lft2;Lkw;Lpx;I)V

    .line 68
    .line 69
    .line 70
    sget-object v0, La83;->a:La83;

    .line 71
    .line 72
    return-object v0
.end method
