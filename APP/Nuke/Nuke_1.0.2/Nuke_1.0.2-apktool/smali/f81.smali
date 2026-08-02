.class public final synthetic Lf81;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lkw;

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILg81;Lkw;I)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lf81;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf81;->l:Ljava/lang/Object;

    iput p2, p0, Lf81;->j:I

    iput-object p3, p0, Lf81;->m:Ljava/lang/Object;

    iput-object p4, p0, Lf81;->i:Lkw;

    iput p5, p0, Lf81;->k:I

    return-void
.end method

.method public synthetic constructor <init>(Luh1;Ljava/lang/String;Lkw;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lf81;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lf81;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lf81;->m:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lf81;->i:Lkw;

    .line 12
    .line 13
    iput p4, p0, Lf81;->j:I

    .line 14
    .line 15
    iput p5, p0, Lf81;->k:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lf81;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    iget-object v3, v0, Lf81;->m:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lf81;->l:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, v1

    .line 15
    check-cast v4, Luh1;

    .line 16
    .line 17
    move-object v5, v3

    .line 18
    check-cast v5, Ljava/lang/String;

    .line 19
    .line 20
    move-object/from16 v7, p1

    .line 21
    .line 22
    check-cast v7, Lpx;

    .line 23
    .line 24
    move-object/from16 v1, p2

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget v1, v0, Lf81;->j:I

    .line 32
    .line 33
    or-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    invoke-static {v1}, Lpp0;->N(I)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    iget-object v6, v0, Lf81;->i:Lkw;

    .line 40
    .line 41
    iget v9, v0, Lf81;->k:I

    .line 42
    .line 43
    invoke-static/range {v4 .. v9}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :pswitch_0
    move-object v12, v3

    .line 48
    check-cast v12, Lg81;

    .line 49
    .line 50
    move-object/from16 v14, p1

    .line 51
    .line 52
    check-cast v14, Lpx;

    .line 53
    .line 54
    move-object/from16 v1, p2

    .line 55
    .line 56
    check-cast v1, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget v1, v0, Lf81;->k:I

    .line 62
    .line 63
    or-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    invoke-static {v1}, Lpp0;->N(I)I

    .line 66
    .line 67
    .line 68
    move-result v15

    .line 69
    iget-object v10, v0, Lf81;->l:Ljava/lang/Object;

    .line 70
    .line 71
    iget v11, v0, Lf81;->j:I

    .line 72
    .line 73
    iget-object v13, v0, Lf81;->i:Lkw;

    .line 74
    .line 75
    invoke-static/range {v10 .. v15}, Lp40;->a(Ljava/lang/Object;ILg81;Lkw;Lpx;I)V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
