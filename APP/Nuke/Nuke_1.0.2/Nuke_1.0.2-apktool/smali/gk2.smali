.class public final synthetic Lgk2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:Lqf2;

.field public final synthetic i:Luq1;

.field public final synthetic j:Lxk1;

.field public final synthetic k:Lj20;

.field public final synthetic l:Landroid/content/Context;

.field public final synthetic m:Lxk1;

.field public final synthetic n:Lxk1;

.field public final synthetic o:Lxk1;

.field public final synthetic p:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lqf2;Luq1;Lxk1;Lj20;Landroid/content/Context;Lxk1;Lxk1;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgk2;->h:Lqf2;

    .line 5
    .line 6
    iput-object p2, p0, Lgk2;->i:Luq1;

    .line 7
    .line 8
    iput-object p3, p0, Lgk2;->j:Lxk1;

    .line 9
    .line 10
    iput-object p4, p0, Lgk2;->k:Lj20;

    .line 11
    .line 12
    iput-object p5, p0, Lgk2;->l:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p6, p0, Lgk2;->m:Lxk1;

    .line 15
    .line 16
    iput-object p7, p0, Lgk2;->n:Lxk1;

    .line 17
    .line 18
    iput-object p8, p0, Lgk2;->o:Lxk1;

    .line 19
    .line 20
    iput-object p9, p0, Lgk2;->p:Lxk1;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lo71;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Lpx;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v1, v3, 0x11

    .line 23
    .line 24
    const/16 v4, 0x10

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-eq v1, v4, :cond_0

    .line 28
    .line 29
    move v1, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    and-int/2addr v3, v5

    .line 33
    move-object v7, v2

    .line 34
    check-cast v7, Lgo0;

    .line 35
    .line 36
    invoke-virtual {v7, v3, v1}, Lgo0;->O(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v9, v0, Lgk2;->h:Lqf2;

    .line 43
    .line 44
    iget-object v5, v9, Lqf2;->b:Ljava/lang/String;

    .line 45
    .line 46
    new-instance v8, Lhk2;

    .line 47
    .line 48
    iget-object v10, v0, Lgk2;->i:Luq1;

    .line 49
    .line 50
    iget-object v11, v0, Lgk2;->j:Lxk1;

    .line 51
    .line 52
    iget-object v12, v0, Lgk2;->k:Lj20;

    .line 53
    .line 54
    iget-object v13, v0, Lgk2;->l:Landroid/content/Context;

    .line 55
    .line 56
    iget-object v14, v0, Lgk2;->m:Lxk1;

    .line 57
    .line 58
    iget-object v15, v0, Lgk2;->n:Lxk1;

    .line 59
    .line 60
    iget-object v1, v0, Lgk2;->o:Lxk1;

    .line 61
    .line 62
    iget-object v0, v0, Lgk2;->p:Lxk1;

    .line 63
    .line 64
    move-object/from16 v17, v0

    .line 65
    .line 66
    move-object/from16 v16, v1

    .line 67
    .line 68
    invoke-direct/range {v8 .. v17}, Lhk2;-><init>(Lqf2;Luq1;Lxk1;Lj20;Landroid/content/Context;Lxk1;Lxk1;Lxk1;Lxk1;)V

    .line 69
    .line 70
    .line 71
    const v0, -0x1843d741

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v8, v7}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const/16 v8, 0x180

    .line 79
    .line 80
    const/4 v9, 0x1

    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static/range {v4 .. v9}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {v7}, Lgo0;->R()V

    .line 87
    .line 88
    .line 89
    :goto_1
    sget-object v0, La83;->a:La83;

    .line 90
    .line 91
    return-object v0
.end method
