.class public final Ly1/d1;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly1/f1;

.field public final synthetic i:Ly1/t;

.field public final synthetic j:Lfg/p;


# direct methods
.method public constructor <init>(Ly1/f1;Ly1/t;Lfg/p;I)V
    .locals 0

    const/4 p4, 0x1

    iput p4, p0, Ly1/d1;->g:I

    .line 15
    iput-object p1, p0, Ly1/d1;->h:Ly1/f1;

    iput-object p2, p0, Ly1/d1;->i:Ly1/t;

    iput-object p3, p0, Ly1/d1;->j:Lfg/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ly1/t;Ly1/f1;Lfg/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ly1/d1;->g:I

    .line 3
    .line 4
    iput-object p1, p0, Ly1/d1;->i:Ly1/t;

    .line 5
    .line 6
    iput-object p2, p0, Ly1/d1;->h:Ly1/f1;

    .line 7
    .line 8
    iput-object p3, p0, Ly1/d1;->j:Lfg/p;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ly1/d1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li0/h0;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-static {p2}, Li0/r;->C(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v0, p0, Ly1/d1;->h:Ly1/f1;

    .line 19
    .line 20
    iget-object v1, p0, Ly1/d1;->i:Ly1/t;

    .line 21
    .line 22
    iget-object v2, p0, Ly1/d1;->j:Lfg/p;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, p1, p2}, Ly1/f1;->a(Ly1/t;Lfg/p;Li0/h0;I)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_0
    check-cast p1, Li0/h0;

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
    const/4 v1, 0x2

    .line 41
    const/4 v2, 0x1

    .line 42
    const/4 v3, 0x0

    .line 43
    if-eq v0, v1, :cond_0

    .line 44
    .line 45
    move v0, v2

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v0, v3

    .line 48
    :goto_0
    and-int/2addr p2, v2

    .line 49
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_1

    .line 54
    .line 55
    const p2, 0x33a80f5b

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, Ly1/d1;->h:Ly1/f1;

    .line 62
    .line 63
    iget-object p2, p2, Ly1/f1;->k:Ly1/p0;

    .line 64
    .line 65
    iget-object v0, p0, Ly1/d1;->j:Lfg/p;

    .line 66
    .line 67
    iget-object v1, p0, Ly1/d1;->i:Ly1/t;

    .line 68
    .line 69
    invoke-static {v1, p2, v0, p1, v3}, Ly1/h1;->a(Lx1/r1;Ly1/p0;Lfg/p;Li0/h0;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 77
    .line 78
    .line 79
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 80
    .line 81
    return-object p1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
