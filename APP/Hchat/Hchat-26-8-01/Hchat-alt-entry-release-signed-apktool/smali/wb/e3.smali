.class public final synthetic Lwb/e3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Li/c;

.field public final synthetic h:F

.field public final synthetic i:Li0/f1;


# direct methods
.method public synthetic constructor <init>(Li/c;FLi0/f1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/e3;->g:Li/c;

    .line 5
    .line 6
    iput p2, p0, Lwb/e3;->h:F

    .line 7
    .line 8
    iput-object p3, p0, Lwb/e3;->i:Li0/f1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lwb/e3;->i:Li0/f1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/f1;->g()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    cmpg-float v1, v1, v2

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, p0, Lwb/e3;->g:Li/c;

    .line 14
    .line 15
    invoke-virtual {v1}, Li/c;->d()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0}, Li0/f1;->g()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    div-float/2addr v1, v0

    .line 30
    const/high16 v0, -0x40800000    # -1.0f

    .line 31
    .line 32
    cmpg-float v2, v1, v0

    .line 33
    .line 34
    if-gez v2, :cond_1

    .line 35
    .line 36
    move v1, v0

    .line 37
    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 38
    .line 39
    cmpl-float v2, v1, v0

    .line 40
    .line 41
    if-lez v2, :cond_2

    .line 42
    .line 43
    move v1, v0

    .line 44
    :cond_2
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v2, p0, Lwb/e3;->h:F

    .line 49
    .line 50
    mul-float/2addr v0, v2

    .line 51
    sget-object v2, Li/w;->a:Li/s;

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {v2, v1}, Li/s;->b(F)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    mul-float v2, v1, v0

    .line 62
    .line 63
    :goto_0
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0
.end method
