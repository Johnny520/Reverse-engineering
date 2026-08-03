.class public final synthetic Lr/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILfg/l;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput p2, p0, Lr/i;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lr/i;->h:I

    .line 8
    .line 9
    iput-object p3, p0, Lr/i;->i:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lr/k;I)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lr/i;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/i;->i:Ljava/lang/Object;

    iput p2, p0, Lr/i;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lr/i;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr/i;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfg/l;

    .line 9
    .line 10
    check-cast p1, Li0/h0;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/16 p2, 0x187

    .line 18
    .line 19
    invoke-static {p2}, Li0/r;->C(I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iget v1, p0, Lr/i;->h:I

    .line 24
    .line 25
    invoke-static {v1, v0, p1, p2}, Lwb/ho;->Y0(ILfg/l;Li0/h0;I)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_0
    iget-object v0, p0, Lr/i;->i:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lr/k;

    .line 34
    .line 35
    check-cast p1, Li0/h0;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    and-int/lit8 v1, p2, 0x3

    .line 44
    .line 45
    const/4 v2, 0x2

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x1

    .line 48
    if-eq v1, v2, :cond_0

    .line 49
    .line 50
    move v1, v4

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v1, v3

    .line 53
    :goto_0
    and-int/2addr p2, v4

    .line 54
    invoke-virtual {p1, p2, v1}, Li0/h0;->S(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    iget-object p2, v0, Lr/k;->b:Lr/h;

    .line 61
    .line 62
    iget-object p2, p2, Lr/h;->a:Lac/k;

    .line 63
    .line 64
    iget v1, p0, Lr/i;->h:I

    .line 65
    .line 66
    invoke-virtual {p2, v1}, Lac/k;->l(I)Ls/i;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iget v2, p2, Ls/i;->a:I

    .line 71
    .line 72
    sub-int/2addr v1, v2

    .line 73
    iget-object p2, p2, Ls/i;->c:Lb5/c;

    .line 74
    .line 75
    iget-object p2, p2, Lb5/c;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p2, Ls0/d;

    .line 78
    .line 79
    iget-object v0, v0, Lr/k;->c:Lr/d;

    .line 80
    .line 81
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {p2, v0, v1, p1, v2}, Ls0/d;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
