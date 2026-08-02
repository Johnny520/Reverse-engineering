.class public final Lzl2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public l:I

.field public final synthetic m:Lam2;

.field public final synthetic n:F

.field public final synthetic o:F


# direct methods
.method public constructor <init>(Lam2;FFLt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzl2;->m:Lam2;

    .line 2
    .line 3
    iput p2, p0, Lzl2;->n:F

    .line 4
    .line 5
    iput p3, p0, Lzl2;->o:F

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ltw2;-><init>(ILt00;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lj20;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lzl2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lzl2;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lzl2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 2

    .line 1
    new-instance p2, Lzl2;

    .line 2
    .line 3
    iget v0, p0, Lzl2;->n:F

    .line 4
    .line 5
    iget v1, p0, Lzl2;->o:F

    .line 6
    .line 7
    iget-object p0, p0, Lzl2;->m:Lam2;

    .line 8
    .line 9
    invoke-direct {p2, p0, v0, v1, p1}, Lzl2;-><init>(Lam2;FFLt00;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lzl2;->l:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lzl2;->m:Lam2;

    .line 23
    .line 24
    iget-object p1, p1, Lam2;->U:Lim2;

    .line 25
    .line 26
    iget v0, p0, Lzl2;->n:F

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    int-to-long v2, v0

    .line 33
    iget v0, p0, Lzl2;->o:F

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-long v4, v0

    .line 40
    const/16 v0, 0x20

    .line 41
    .line 42
    shl-long/2addr v2, v0

    .line 43
    const-wide v6, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v4, v6

    .line 49
    or-long/2addr v2, v4

    .line 50
    iput v1, p0, Lzl2;->l:I

    .line 51
    .line 52
    invoke-static {p1, v2, v3, p0}, Lul2;->a(Lim2;JLu00;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    sget-object p1, Lk20;->h:Lk20;

    .line 57
    .line 58
    if-ne p0, p1, :cond_2

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 62
    .line 63
    return-object p0
.end method
