.class public final synthetic Lju0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lkw;

.field public final synthetic j:Lo72;

.field public final synthetic k:Landroid/view/ViewGroup;

.field public final synthetic l:Ly62;

.field public final synthetic m:Ll80;


# direct methods
.method public synthetic constructor <init>(Lkw;Lo72;Landroid/view/ViewGroup;Ly62;Ll80;I)V
    .locals 0

    .line 1
    iput p6, p0, Lju0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lju0;->i:Lkw;

    .line 4
    .line 5
    iput-object p2, p0, Lju0;->j:Lo72;

    .line 6
    .line 7
    iput-object p3, p0, Lju0;->k:Landroid/view/ViewGroup;

    .line 8
    .line 9
    iput-object p4, p0, Lju0;->l:Ly62;

    .line 10
    .line 11
    iput-object p5, p0, Lju0;->m:Ll80;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lju0;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    check-cast p1, Lpx;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    and-int/lit8 v0, p2, 0x3

    .line 20
    .line 21
    if-eq v0, v2, :cond_0

    .line 22
    .line 23
    move v0, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v4

    .line 26
    :goto_0
    and-int/2addr p2, v3

    .line 27
    check-cast p1, Lgo0;

    .line 28
    .line 29
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    new-instance p2, Llu0;

    .line 36
    .line 37
    iget-object v0, p0, Lju0;->j:Lo72;

    .line 38
    .line 39
    iget-object v2, p0, Lju0;->k:Landroid/view/ViewGroup;

    .line 40
    .line 41
    iget-object v3, p0, Lju0;->l:Ly62;

    .line 42
    .line 43
    iget-object v5, p0, Lju0;->m:Ll80;

    .line 44
    .line 45
    invoke-direct {p2, v0, v2, v3, v5}, Llu0;-><init>(Lo72;Landroid/view/ViewGroup;Ly62;Ll80;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object p0, p0, Lju0;->i:Lkw;

    .line 53
    .line 54
    invoke-virtual {p0, p2, p1, v0}, Lkw;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {p1}, Lgo0;->R()V

    .line 59
    .line 60
    .line 61
    :goto_1
    return-object v1

    .line 62
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 63
    .line 64
    if-eq v0, v2, :cond_2

    .line 65
    .line 66
    move v4, v3

    .line 67
    :cond_2
    and-int/2addr p2, v3

    .line 68
    check-cast p1, Lgo0;

    .line 69
    .line 70
    invoke-virtual {p1, p2, v4}, Lgo0;->O(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    new-instance v2, Lju0;

    .line 77
    .line 78
    const/4 v8, 0x1

    .line 79
    iget-object v3, p0, Lju0;->i:Lkw;

    .line 80
    .line 81
    iget-object v4, p0, Lju0;->j:Lo72;

    .line 82
    .line 83
    iget-object v5, p0, Lju0;->k:Landroid/view/ViewGroup;

    .line 84
    .line 85
    iget-object v6, p0, Lju0;->l:Ly62;

    .line 86
    .line 87
    iget-object v7, p0, Lju0;->m:Ll80;

    .line 88
    .line 89
    invoke-direct/range {v2 .. v8}, Lju0;-><init>(Lkw;Lo72;Landroid/view/ViewGroup;Ly62;Ll80;I)V

    .line 90
    .line 91
    .line 92
    const p0, 0x145d042c

    .line 93
    .line 94
    .line 95
    invoke-static {p0, v2, p1}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    const/16 p2, 0x30

    .line 100
    .line 101
    invoke-static {p0, p1, p2}, Lpp0;->d(Lkw;Lpx;I)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    invoke-virtual {p1}, Lgo0;->R()V

    .line 106
    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
