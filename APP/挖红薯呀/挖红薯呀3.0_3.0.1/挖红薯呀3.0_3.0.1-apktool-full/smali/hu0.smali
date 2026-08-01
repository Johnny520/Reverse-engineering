.class public final Lhu0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:I

.field public final b:Lh81;

.field public c:F


# direct methods
.method public constructor <init>(ILh81;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lhu0;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lhu0;->b:Lh81;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(FLjk;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lgu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lgu0;

    .line 7
    .line 8
    iget v1, v0, Lgu0;->i:I

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
    iput v1, v0, Lgu0;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lgu0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lgu0;-><init>(Lhu0;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lgu0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lgu0;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p2, Ljava/lang/Float;

    .line 49
    .line 50
    invoke-direct {p2, p1}, Ljava/lang/Float;-><init>(F)V

    .line 51
    .line 52
    .line 53
    iput v2, v0, Lgu0;->i:I

    .line 54
    .line 55
    iget-object p1, p0, Lhu0;->b:Lh81;

    .line 56
    .line 57
    invoke-virtual {p1, p2, v0}, Lh81;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    sget-object p1, Lzk;->d:Lzk;

    .line 62
    .line 63
    if-ne p2, p1, :cond_3

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iget p2, p0, Lhu0;->c:F

    .line 73
    .line 74
    add-float/2addr p2, p1

    .line 75
    iput p2, p0, Lhu0;->c:F

    .line 76
    .line 77
    sget-object p0, Lna1;->a:Lna1;

    .line 78
    .line 79
    return-object p0
.end method
