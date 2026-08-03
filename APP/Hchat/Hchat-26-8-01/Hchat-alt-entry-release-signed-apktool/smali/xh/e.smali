.class public final synthetic Lxh/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Li/c;

.field public final synthetic h:Z

.field public final synthetic i:F


# direct methods
.method public synthetic constructor <init>(Li/c;ZF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxh/e;->g:Li/c;

    .line 5
    .line 6
    iput-boolean p2, p0, Lxh/e;->h:Z

    .line 7
    .line 8
    iput p3, p0, Lxh/e;->i:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lf1/d0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxh/e;->g:Li/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-boolean v1, p0, Lxh/e;->h:Z

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const v1, 0x3e4ccccd    # 0.2f

    .line 23
    .line 24
    .line 25
    mul-float/2addr v1, v0

    .line 26
    const v2, 0x3f4ccccd    # 0.8f

    .line 27
    .line 28
    .line 29
    add-float/2addr v1, v2

    .line 30
    invoke-interface {p1, v1}, Lf1/d0;->q(F)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v1}, Lf1/d0;->i(F)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, v0}, Lf1/d0;->n(F)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    .line 41
    .line 42
    sub-float v0, v1, v0

    .line 43
    .line 44
    iget v2, p0, Lxh/e;->i:F

    .line 45
    .line 46
    mul-float/2addr v0, v2

    .line 47
    invoke-interface {p1, v0}, Lf1/d0;->g(F)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v1}, Lf1/d0;->n(F)V

    .line 51
    .line 52
    .line 53
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 54
    .line 55
    return-object p1
.end method
