.class public final synthetic Lss0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:La80;

.field public final synthetic η:Lxt0;


# direct methods
.method public synthetic constructor <init>(La80;Lxt0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lss0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lss0;->ζ:La80;

    .line 4
    .line 5
    iput-object p2, p0, Lss0;->η:Lxt0;

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
    .locals 1

    .line 1
    iget v0, p0, Lss0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lss0;->η:Lxt0;

    .line 7
    .line 8
    iget-object v0, v0, Lxt0;->α:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, Lss0;->ζ:La80;

    .line 11
    .line 12
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object v0, p0, Lss0;->η:Lxt0;

    .line 19
    .line 20
    iget-object v0, v0, Lxt0;->α:Ljava/lang/String;

    .line 21
    .line 22
    iget-object p0, p0, Lss0;->ζ:La80;

    .line 23
    .line 24
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_1
    iget-object v0, p0, Lss0;->η:Lxt0;

    .line 29
    .line 30
    iget-object v0, v0, Lxt0;->α:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p0, p0, Lss0;->ζ:La80;

    .line 33
    .line 34
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_2
    iget-object v0, p0, Lss0;->η:Lxt0;

    .line 39
    .line 40
    iget-object v0, v0, Lxt0;->α:Ljava/lang/String;

    .line 41
    .line 42
    iget-object p0, p0, Lss0;->ζ:La80;

    .line 43
    .line 44
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
