.class public final synthetic Lv00;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Z

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lv00;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lv00;->η:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lv00;->ζ:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lv00;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget-boolean v2, p0, Lv00;->ζ:Z

    .line 6
    .line 7
    iget-object p0, p0, Lv00;->η:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lum1;

    .line 13
    .line 14
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Landroid/view/View;

    .line 17
    .line 18
    if-eqz p0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 24
    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const/high16 v0, 0x3f800000    # 1.0f

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    .line 32
    .line 33
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 34
    .line 35
    .line 36
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    check-cast p0, Landroid/view/ViewGroup;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 p0, 0x0

    .line 44
    :goto_1
    if-nez p0, :cond_2

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v3, 0x0

    .line 52
    :goto_2
    if-ge v3, v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v4, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    :goto_3
    return-object v1

    .line 65
    :pswitch_0
    check-cast p0, Ljava/lang/ClassLoader;

    .line 66
    .line 67
    sget-object v0, Lx00;->α:Lx00;

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    invoke-static {p0, v2, v0}, Lx00;->ι(Ljava/lang/ClassLoader;ZZ)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
