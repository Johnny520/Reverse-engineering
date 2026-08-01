.class public final synthetic Lot1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/content/Context;

.field public final synthetic η:La80;

.field public final synthetic θ:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;La80;[Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lot1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lot1;->ζ:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lot1;->η:La80;

    .line 6
    .line 7
    iput-object p3, p0, Lot1;->θ:[Ljava/lang/String;

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
    .locals 2

    .line 1
    iget v0, p0, Lot1;->ε:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-string v0, "voice_replace_scope"

    .line 13
    .line 14
    iget-object v1, p0, Lot1;->ζ:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {p1, v1, v0}, Lbv1;->Ι(ILandroid/content/Context;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lot1;->θ:[Ljava/lang/String;

    .line 23
    .line 24
    aget-object p1, v0, p1

    .line 25
    .line 26
    iget-object p0, p0, Lot1;->η:La80;

    .line 27
    .line 28
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    const-string v0, "voice_replace_mode"

    .line 35
    .line 36
    iget-object v1, p0, Lot1;->ζ:Landroid/content/Context;

    .line 37
    .line 38
    invoke-static {p1, v1, v0}, Lbv1;->Ι(ILandroid/content/Context;Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lot1;->θ:[Ljava/lang/String;

    .line 45
    .line 46
    aget-object p1, v0, p1

    .line 47
    .line 48
    iget-object p0, p0, Lot1;->η:La80;

    .line 49
    .line 50
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 54
    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
