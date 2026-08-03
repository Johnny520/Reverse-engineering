.class public final synthetic Lxh/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li/c;


# direct methods
.method public synthetic constructor <init>(Li/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxh/a;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lxh/a;->h:Li/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lxh/a;->g:I

    .line 2
    .line 3
    check-cast p1, Lf1/d0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lxh/a;->h:Li/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-interface {p1, v0}, Lf1/d0;->n(F)V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lxh/a;->h:Li/c;

    .line 33
    .line 34
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const v1, 0x3e4ccccd    # 0.2f

    .line 45
    .line 46
    .line 47
    mul-float/2addr v0, v1

    .line 48
    const/high16 v1, 0x3f800000    # 1.0f

    .line 49
    .line 50
    sub-float/2addr v1, v0

    .line 51
    invoke-interface {p1, v1}, Lf1/d0;->q(F)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, v1}, Lf1/d0;->i(F)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
