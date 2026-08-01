.class public final synthetic Ln00;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lpe0;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lpe0;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p6, p0, Ln00;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Ln00;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ln00;->e:Lpe0;

    .line 6
    .line 7
    iput-object p3, p0, Ln00;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Ln00;->h:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ln00;->d:I

    .line 4
    .line 5
    sget-object v2, Lna1;->a:Lna1;

    .line 6
    .line 7
    iget-object v3, v0, Ln00;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Ln00;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Ln00;->f:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v6, v5

    .line 17
    check-cast v6, Lhw;

    .line 18
    .line 19
    move-object v8, v4

    .line 20
    check-cast v8, Ld80;

    .line 21
    .line 22
    move-object v9, v3

    .line 23
    check-cast v9, Lr70;

    .line 24
    .line 25
    move-object/from16 v10, p1

    .line 26
    .line 27
    check-cast v10, Lji;

    .line 28
    .line 29
    move-object/from16 v1, p2

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-static {v1}, Lj50;->A(I)I

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    iget-object v7, v0, Ln00;->e:Lpe0;

    .line 42
    .line 43
    invoke-static/range {v6 .. v11}, Lr60;->b(Lhw;Lpe0;Ld80;Lr70;Lji;I)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :pswitch_0
    move-object v12, v5

    .line 48
    check-cast v12, Lro0;

    .line 49
    .line 50
    move-object v14, v4

    .line 51
    check-cast v14, Lha;

    .line 52
    .line 53
    move-object v15, v3

    .line 54
    check-cast v15, Lr3;

    .line 55
    .line 56
    move-object/from16 v16, p1

    .line 57
    .line 58
    check-cast v16, Lji;

    .line 59
    .line 60
    move-object/from16 v1, p2

    .line 61
    .line 62
    check-cast v1, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const/16 v1, 0x1b9

    .line 68
    .line 69
    invoke-static {v1}, Lj50;->A(I)I

    .line 70
    .line 71
    .line 72
    move-result v17

    .line 73
    iget-object v13, v0, Ln00;->e:Lpe0;

    .line 74
    .line 75
    invoke-static/range {v12 .. v17}, Lo30;->f(Lro0;Lpe0;Lha;Lr3;Lji;I)V

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
