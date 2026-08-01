.class public final synthetic Lnb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Landroid/widget/Button;

.field public final synthetic ι:Landroid/widget/Button;

.field public final synthetic κ:Lum1;


# direct methods
.method public synthetic constructor <init>(Lum1;Landroid/widget/Button;Lum1;Lum1;Landroid/widget/Button;)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lnb1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb1;->ζ:Lum1;

    iput-object p2, p0, Lnb1;->θ:Landroid/widget/Button;

    iput-object p3, p0, Lnb1;->η:Lum1;

    iput-object p4, p0, Lnb1;->κ:Lum1;

    iput-object p5, p0, Lnb1;->ι:Landroid/widget/Button;

    return-void
.end method

.method public synthetic constructor <init>(Lum1;Lum1;Landroid/widget/Button;Landroid/widget/Button;Lum1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lnb1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lnb1;->ζ:Lum1;

    .line 8
    .line 9
    iput-object p2, p0, Lnb1;->η:Lum1;

    .line 10
    .line 11
    iput-object p3, p0, Lnb1;->θ:Landroid/widget/Button;

    .line 12
    .line 13
    iput-object p4, p0, Lnb1;->ι:Landroid/widget/Button;

    .line 14
    .line 15
    iput-object p5, p0, Lnb1;->κ:Lum1;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lnb1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lvd1;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lvd1;->α:Ltd;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Ltd;->ε:Ltd;

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lnb1;->ζ:Lum1;

    .line 18
    .line 19
    iput-object v0, v1, Lum1;->ε:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p1, p1, Lvd1;->β:Ljava/lang/Integer;

    .line 22
    .line 23
    sget-object v2, Ltd;->η:Ltd;

    .line 24
    .line 25
    if-ne v0, v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    :goto_0
    iget-object v0, p0, Lnb1;->η:Lum1;

    .line 30
    .line 31
    iput-object p1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object p1, p0, Lnb1;->θ:Landroid/widget/Button;

    .line 34
    .line 35
    iget-object v2, p0, Lnb1;->ι:Landroid/widget/Button;

    .line 36
    .line 37
    iget-object p0, p0, Lnb1;->κ:Lum1;

    .line 38
    .line 39
    invoke-static {v1, v0, p1, v2, p0}, Lxn0;->Д(Lum1;Lum1;Landroid/widget/Button;Landroid/widget/Button;Lum1;)V

    .line 40
    .line 41
    .line 42
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    check-cast p1, Ljava/util/Set;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lnb1;->ζ:Lum1;

    .line 51
    .line 52
    iput-object p1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object p1, p0, Lnb1;->η:Lum1;

    .line 55
    .line 56
    iget-object v1, p0, Lnb1;->κ:Lum1;

    .line 57
    .line 58
    iget-object v2, p0, Lnb1;->θ:Landroid/widget/Button;

    .line 59
    .line 60
    iget-object p0, p0, Lnb1;->ι:Landroid/widget/Button;

    .line 61
    .line 62
    invoke-static {p1, v1, v2, p0, v0}, Lxn0;->Д(Lum1;Lum1;Landroid/widget/Button;Landroid/widget/Button;Lum1;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
