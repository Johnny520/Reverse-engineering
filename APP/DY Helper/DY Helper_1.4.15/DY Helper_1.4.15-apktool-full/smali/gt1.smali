.class public final synthetic Lgt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:I

.field public final synthetic θ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;[Ljava/lang/String;ILandroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p5, p0, Lgt1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lgt1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput p3, p0, Lgt1;->η:I

    .line 6
    .line 7
    iput-object p4, p0, Lgt1;->θ:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lgt1;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget-object v2, p0, Lgt1;->θ:Landroid/content/Context;

    .line 6
    .line 7
    iget v3, p0, Lgt1;->η:I

    .line 8
    .line 9
    iget-object p0, p0, Lgt1;->ζ:Landroid/app/Activity;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Lkn0;->ε:[Ljava/lang/String;

    .line 15
    .line 16
    check-cast p1, La80;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v4, Lbv1;->α:Lbv1;

    .line 22
    .line 23
    new-instance v4, Lot1;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-direct {v4, v2, p1, v0, v5}, Lot1;-><init>(Landroid/content/Context;La80;[Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    const-string p1, "\u9009\u62e9\u66ff\u6362\u65b9\u5f0f"

    .line 30
    .line 31
    invoke-static {p0, p1, v0, v3, v4}, Lbv1;->Ω(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILa80;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_0
    sget-object v0, Lkn0;->δ:[Ljava/lang/String;

    .line 36
    .line 37
    check-cast p1, La80;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object v4, Lbv1;->α:Lbv1;

    .line 43
    .line 44
    new-instance v4, Lot1;

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    invoke-direct {v4, v2, p1, v0, v5}, Lot1;-><init>(Landroid/content/Context;La80;[Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    const-string p1, "\u9009\u62e9\u4f5c\u7528\u8303\u56f4"

    .line 51
    .line 52
    invoke-static {p0, p1, v0, v3, v4}, Lbv1;->Ω(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILa80;)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
