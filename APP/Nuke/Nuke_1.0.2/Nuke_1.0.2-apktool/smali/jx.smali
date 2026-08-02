.class public final Ljx;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Llx;

.field public final synthetic k:Lb7;

.field public final synthetic l:Lmn0;


# direct methods
.method public constructor <init>(Lb7;Llx;Lmn0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ljx;->i:I

    .line 3
    .line 4
    iput-object p1, p0, Ljx;->k:Lb7;

    .line 5
    .line 6
    iput-object p2, p0, Ljx;->j:Llx;

    .line 7
    .line 8
    iput-object p3, p0, Ljx;->l:Lmn0;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Llx;Lb7;Lmn0;I)V
    .locals 0

    const/4 p4, 0x1

    iput p4, p0, Ljx;->i:I

    .line 15
    iput-object p1, p0, Ljx;->j:Llx;

    iput-object p2, p0, Ljx;->k:Lb7;

    iput-object p3, p0, Ljx;->l:Lmn0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ljx;->i:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Ljx;->l:Lmn0;

    .line 7
    .line 8
    iget-object v4, p0, Ljx;->k:Lb7;

    .line 9
    .line 10
    iget-object p0, p0, Ljx;->j:Llx;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lpx;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lpp0;->N(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-virtual {p0, v4, v3, p1, p2}, Llx;->a(Lb7;Lmn0;Lpx;I)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    check-cast p1, Lpx;

    .line 31
    .line 32
    check-cast p2, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    and-int/lit8 v0, p2, 0x3

    .line 39
    .line 40
    const/4 v5, 0x2

    .line 41
    const/4 v6, 0x0

    .line 42
    if-eq v0, v5, :cond_0

    .line 43
    .line 44
    move v0, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v0, v6

    .line 47
    :goto_0
    and-int/2addr p2, v2

    .line 48
    check-cast p1, Lgo0;

    .line 49
    .line 50
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    const p2, 0x33a80f5b

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Lgo0;->W(I)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Llx;->k:Lz8;

    .line 63
    .line 64
    invoke-static {v4, p0, v3, p1, v6}, Lly;->a(Lzv1;Lz8;Lmn0;Lpx;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v6}, Lgo0;->p(Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {p1}, Lgo0;->R()V

    .line 72
    .line 73
    .line 74
    :goto_1
    return-object v1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
