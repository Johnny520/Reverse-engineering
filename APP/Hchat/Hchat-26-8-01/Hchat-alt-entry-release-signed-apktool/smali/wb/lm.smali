.class public final synthetic Lwb/lm;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Ls0/d;

.field public final synthetic h:F


# direct methods
.method public synthetic constructor <init>(Ls0/d;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/lm;->g:Ls0/d;

    .line 5
    .line 6
    iput p2, p0, Lwb/lm;->h:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lp/x0;

    .line 2
    .line 3
    check-cast p2, Li0/h0;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    and-int/lit8 v0, p3, 0x6

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x2

    .line 27
    :goto_0
    or-int/2addr p3, v0

    .line 28
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 29
    .line 30
    const/16 v1, 0x12

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eq v0, v1, :cond_2

    .line 35
    .line 36
    move v0, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v0, v2

    .line 39
    :goto_1
    and-int/2addr p3, v3

    .line 40
    invoke-virtual {p2, p3, v0}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_3

    .line 45
    .line 46
    invoke-interface {p1}, Lp/x0;->c()F

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    invoke-interface {p1}, Lp/x0;->a()F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget v0, p0, Lwb/lm;->h:F

    .line 55
    .line 56
    add-float/2addr p1, v0

    .line 57
    const/4 v0, 0x5

    .line 58
    invoke-static {p3, p1, v0}, Lp/d;->b(FFI)Lp/z0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    iget-object v0, p0, Lwb/lm;->g:Ls0/d;

    .line 67
    .line 68
    invoke-virtual {v0, p1, p2, p3}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 73
    .line 74
    .line 75
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 76
    .line 77
    return-object p1
.end method
