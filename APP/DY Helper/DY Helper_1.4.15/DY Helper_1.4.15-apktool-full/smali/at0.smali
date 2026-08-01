.class public final synthetic Lat0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lps0;

.field public final synthetic η:La80;


# direct methods
.method public synthetic constructor <init>(Lps0;La80;I)V
    .locals 0

    .line 1
    iput p3, p0, Lat0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lat0;->ζ:Lps0;

    .line 4
    .line 5
    iput-object p2, p0, Lat0;->η:La80;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lat0;->ε:I

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
    iget-object v0, p0, Lat0;->ζ:Lps0;

    .line 13
    .line 14
    iget-object v0, v0, Lps0;->α:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {p1, v0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lxt0;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p1, Lxt0;->α:Ljava/lang/String;

    .line 25
    .line 26
    iget-object p0, p0, Lat0;->η:La80;

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
    iget-object v0, p0, Lat0;->ζ:Lps0;

    .line 35
    .line 36
    iget-object v0, v0, Lps0;->α:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {p1, v0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lxt0;

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p1, Lxt0;->α:Ljava/lang/String;

    .line 47
    .line 48
    iget-object p0, p0, Lat0;->η:La80;

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
