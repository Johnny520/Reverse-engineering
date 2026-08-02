.class public final synthetic Ldz0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lgu2;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcq1;Lxk1;Lxk1;Lxk1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldz0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldz0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ldz0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ldz0;->k:Lgu2;

    .line 12
    .line 13
    iput-object p4, p0, Ldz0;->l:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Float;Laz0;Ljava/lang/Float;Lzy0;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Ldz0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldz0;->i:Ljava/lang/Object;

    iput-object p2, p0, Ldz0;->k:Lgu2;

    iput-object p3, p0, Ldz0;->j:Ljava/lang/Object;

    iput-object p4, p0, Ldz0;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Ldz0;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Ldz0;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Ldz0;->k:Lgu2;

    .line 9
    .line 10
    iget-object v5, p0, Ldz0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Ldz0;->i:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Lcq1;

    .line 18
    .line 19
    check-cast v5, Lxk1;

    .line 20
    .line 21
    check-cast v4, Lxk1;

    .line 22
    .line 23
    check-cast v3, Lxk1;

    .line 24
    .line 25
    iget-boolean v0, p0, Lcq1;->k:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {v5, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Lvy1;

    .line 34
    .line 35
    iget-object v5, p0, Lcq1;->a:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v6, p0, Lcq1;->b:Ljava/lang/String;

    .line 38
    .line 39
    iget-object p0, p0, Lcq1;->j:Ljava/util/List;

    .line 40
    .line 41
    invoke-direct {v0, v5, v6, p0, v2}, Lvy1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v4, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    const/4 p0, 0x0

    .line 48
    invoke-interface {v3, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :pswitch_0
    move-object v7, p0

    .line 53
    check-cast v7, Ljava/lang/Float;

    .line 54
    .line 55
    move-object p0, v4

    .line 56
    check-cast p0, Laz0;

    .line 57
    .line 58
    move-object v8, v5

    .line 59
    check-cast v8, Ljava/lang/Float;

    .line 60
    .line 61
    move-object v5, v3

    .line 62
    check-cast v5, Lzy0;

    .line 63
    .line 64
    iget-object v0, p0, Laz0;->h:Ljava/lang/Float;

    .line 65
    .line 66
    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    iget-object v0, p0, Laz0;->i:Ljava/lang/Float;

    .line 73
    .line 74
    invoke-virtual {v8, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    :cond_1
    iput-object v7, p0, Laz0;->h:Ljava/lang/Float;

    .line 81
    .line 82
    iput-object v8, p0, Laz0;->i:Ljava/lang/Float;

    .line 83
    .line 84
    new-instance v4, Lcy2;

    .line 85
    .line 86
    const/4 v9, 0x0

    .line 87
    sget-object v6, Lrg3;->n:Ln43;

    .line 88
    .line 89
    invoke-direct/range {v4 .. v9}, Lcy2;-><init>(Lhd;Ln43;Ljava/lang/Object;Ljava/lang/Object;Lnd;)V

    .line 90
    .line 91
    .line 92
    iput-object v4, p0, Laz0;->k:Lcy2;

    .line 93
    .line 94
    iget-object v0, p0, Laz0;->o:Lcz0;

    .line 95
    .line 96
    iget-object v0, v0, Lcz0;->b:Lnx1;

    .line 97
    .line 98
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v0, v3}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iput-boolean v2, p0, Laz0;->l:Z

    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    iput-boolean v0, p0, Laz0;->m:Z

    .line 107
    .line 108
    :cond_2
    return-object v1

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
