.class public final Li9;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lak0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li9;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Li9;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Li9;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object p0, p0, Li9;->i:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    check-cast p0, Lgi1;

    .line 17
    .line 18
    iget-object p0, p0, Lgi1;->j:Ljx1;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljx1;->h(F)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :pswitch_0
    check-cast p1, Ldj;

    .line 25
    .line 26
    check-cast p0, Lep1;

    .line 27
    .line 28
    iget p1, p1, Ldj;->c:F

    .line 29
    .line 30
    iget-object v0, p0, Lep1;->f:Lfp1;

    .line 31
    .line 32
    sget-object v2, Lfp1;->j:Lfp1;

    .line 33
    .line 34
    if-eq v0, v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    const/high16 v1, 0x3f800000    # 1.0f

    .line 39
    .line 40
    invoke-static {p1, v0, v1}, Lci0;->C(FFF)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    sub-float/2addr v1, p1

    .line 45
    iget-object p1, p0, Lep1;->b:Lsc;

    .line 46
    .line 47
    iget p0, p0, Lep1;->g:F

    .line 48
    .line 49
    mul-float/2addr p0, v1

    .line 50
    new-instance v0, Ljava/lang/Float;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Ljava/lang/Float;-><init>(F)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2, v0}, Lsc;->e(Lt00;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_0
    return-object v1

    .line 60
    :pswitch_1
    check-cast p1, La83;

    .line 61
    .line 62
    check-cast p0, Lsz0;

    .line 63
    .line 64
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    const/16 p2, 0x22

    .line 67
    .line 68
    if-lt p1, p2, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0}, Lsz0;->F()Landroid/view/inputmethod/InputMethodManager;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object p0, p0, Lsz0;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Landroid/view/View;

    .line 77
    .line 78
    invoke-static {p1, p0}, Ld4;->n(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    return-object v1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
