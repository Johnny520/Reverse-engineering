.class public final Lga;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj20;


# instance fields
.field public final h:Landroid/view/View;

.field public final i:Lo03;

.field public final j:Lj20;

.field public final k:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Landroid/view/View;Lo03;Lj20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lga;->h:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lga;->i:Lo03;

    .line 7
    .line 8
    iput-object p3, p0, Lga;->j:Lj20;

    .line 9
    .line 10
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lga;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lu91;Lu00;)V
    .locals 7

    .line 1
    instance-of v0, p2, Lda;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lda;

    .line 7
    .line 8
    iget v1, v0, Lda;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lda;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lda;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lda;-><init>(Lga;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lda;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lda;->m:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move p2, v2

    .line 48
    new-instance v2, Lfa;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {v2, v1, p1, p0}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v4, La2;

    .line 55
    .line 56
    const/4 p1, 0x4

    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-direct {v4, p0, v5, p1}, La2;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 59
    .line 60
    .line 61
    iput p2, v0, Lda;->m:I

    .line 62
    .line 63
    new-instance v1, Lk9;

    .line 64
    .line 65
    const/16 v6, 0x8

    .line 66
    .line 67
    iget-object v3, p0, Lga;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 68
    .line 69
    invoke-direct/range {v1 .. v6}, Lk9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v0}, Lte;->u(Lmn0;Lt00;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    sget-object p1, Lk20;->h:Lk20;

    .line 77
    .line 78
    if-ne p0, p1, :cond_3

    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    :goto_1
    invoke-static {}, Ls;->b()V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final g()La20;
    .locals 0

    .line 1
    iget-object p0, p0, Lga;->j:Lj20;

    .line 2
    .line 3
    invoke-interface {p0}, Lj20;->g()La20;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
