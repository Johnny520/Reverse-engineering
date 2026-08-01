.class public final synthetic Lkh;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lmh;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lkh;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkh;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lkh;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lkh;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iput p4, p0, Lkh;->f:I

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lo70;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 16
    const/4 p5, 0x1

    iput p5, p0, Lkh;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkh;->h:Ljava/lang/Object;

    iput-object p2, p0, Lkh;->e:Ljava/lang/Object;

    iput p3, p0, Lkh;->f:I

    iput-object p4, p0, Lkh;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lww0;Ljava/lang/Object;Lmh;II)V
    .locals 0

    .line 17
    iput p5, p0, Lkh;->d:I

    iput-object p1, p0, Lkh;->g:Ljava/lang/Object;

    iput-object p2, p0, Lkh;->e:Ljava/lang/Object;

    iput-object p3, p0, Lkh;->h:Ljava/lang/Object;

    iput p4, p0, Lkh;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lkh;->d:I

    .line 2
    .line 3
    iget v1, p0, Lkh;->f:I

    .line 4
    .line 5
    iget-object v2, p0, Lkh;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lkh;->g:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v4, Lna1;->a:Lna1;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object v6, p0, Lkh;->h:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v3, Lyw0;

    .line 18
    .line 19
    check-cast v6, Lmh;

    .line 20
    .line 21
    check-cast p1, Lji;

    .line 22
    .line 23
    check-cast p2, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    or-int/lit8 p0, v1, 0x1

    .line 29
    .line 30
    invoke-static {p0}, Lj50;->A(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-virtual {v3, v2, v6, p1, p0}, Lyw0;->e(Ljava/lang/Object;Lmh;Lji;I)V

    .line 35
    .line 36
    .line 37
    return-object v4

    .line 38
    :pswitch_0
    check-cast v3, Lf90;

    .line 39
    .line 40
    check-cast v6, Lmh;

    .line 41
    .line 42
    check-cast p1, Lji;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    or-int/lit8 p0, v1, 0x1

    .line 50
    .line 51
    invoke-static {p0}, Lj50;->A(I)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {v3, v2, v6, p1, p0}, Lf90;->e(Ljava/lang/Object;Lmh;Lji;I)V

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :pswitch_1
    move-object v7, v6

    .line 60
    check-cast v7, Lo70;

    .line 61
    .line 62
    move-object v11, p1

    .line 63
    check-cast v11, Lji;

    .line 64
    .line 65
    check-cast p2, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {v5}, Lj50;->A(I)I

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    iget-object v8, p0, Lkh;->e:Ljava/lang/Object;

    .line 75
    .line 76
    iget v9, p0, Lkh;->f:I

    .line 77
    .line 78
    iget-object v10, p0, Lkh;->g:Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static/range {v7 .. v12}, Lv50;->c(Lo70;Ljava/lang/Object;ILjava/lang/Object;Lji;I)V

    .line 81
    .line 82
    .line 83
    return-object v4

    .line 84
    :pswitch_2
    check-cast v6, Lmh;

    .line 85
    .line 86
    check-cast p1, Lji;

    .line 87
    .line 88
    check-cast p2, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lj50;->A(I)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    or-int/2addr p0, v5

    .line 98
    invoke-virtual {v6, v2, v3, p1, p0}, Lmh;->e(Ljava/lang/Object;Ljava/lang/Object;Lji;I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    return-object v4

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
