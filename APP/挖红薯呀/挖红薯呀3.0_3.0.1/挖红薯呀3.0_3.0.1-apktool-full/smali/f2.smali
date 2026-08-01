.class public final synthetic Lf2;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lww;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lww;II)V
    .locals 0

    .line 1
    iput p6, p0, Lf2;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lf2;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lf2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lf2;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lf2;->i:Lww;

    .line 10
    .line 11
    iput p5, p0, Lf2;->e:I

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lf2;->d:I

    .line 4
    .line 5
    sget-object v2, Lna1;->a:Lna1;

    .line 6
    .line 7
    iget v3, v0, Lf2;->e:I

    .line 8
    .line 9
    iget-object v4, v0, Lf2;->h:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lf2;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lf2;->f:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v7, v6

    .line 19
    check-cast v7, Llf;

    .line 20
    .line 21
    move-object v8, v5

    .line 22
    check-cast v8, Lb11;

    .line 23
    .line 24
    move-object v9, v4

    .line 25
    check-cast v9, Lda1;

    .line 26
    .line 27
    move-object/from16 v11, p1

    .line 28
    .line 29
    check-cast v11, Lji;

    .line 30
    .line 31
    move-object/from16 v1, p2

    .line 32
    .line 33
    check-cast v1, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    or-int/lit8 v1, v3, 0x1

    .line 39
    .line 40
    invoke-static {v1}, Lj50;->A(I)I

    .line 41
    .line 42
    .line 43
    move-result v12

    .line 44
    iget-object v10, v0, Lf2;->i:Lww;

    .line 45
    .line 46
    invoke-static/range {v7 .. v12}, Lqd0;->b(Llf;Lb11;Lda1;Lww;Lji;I)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :pswitch_0
    move-object v13, v6

    .line 51
    check-cast v13, Lhw;

    .line 52
    .line 53
    move-object v14, v5

    .line 54
    check-cast v14, Lpe0;

    .line 55
    .line 56
    move-object v15, v4

    .line 57
    check-cast v15, Lxn;

    .line 58
    .line 59
    iget-object v0, v0, Lf2;->i:Lww;

    .line 60
    .line 61
    move-object/from16 v16, v0

    .line 62
    .line 63
    check-cast v16, Lmh;

    .line 64
    .line 65
    move-object/from16 v17, p1

    .line 66
    .line 67
    check-cast v17, Lji;

    .line 68
    .line 69
    move-object/from16 v0, p2

    .line 70
    .line 71
    check-cast v0, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    or-int/lit8 v0, v3, 0x1

    .line 77
    .line 78
    invoke-static {v0}, Lj50;->A(I)I

    .line 79
    .line 80
    .line 81
    move-result v18

    .line 82
    invoke-static/range {v13 .. v18}, Lm2;->d(Lhw;Lpe0;Lxn;Lmh;Lji;I)V

    .line 83
    .line 84
    .line 85
    return-object v2

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
