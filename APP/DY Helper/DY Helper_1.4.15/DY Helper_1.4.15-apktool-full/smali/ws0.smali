.class public final synthetic Lws0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Lr01;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lr01;II)V
    .locals 0

    .line 1
    iput p4, p0, Lws0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lws0;->ζ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lws0;->η:Lr01;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lws0;->ε:I

    .line 2
    .line 3
    check-cast p1, Lv80;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const/16 p2, 0x31

    .line 14
    .line 15
    invoke-static {p2}, Lv81;->σ(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object v0, p0, Lws0;->ζ:Ljava/lang/String;

    .line 20
    .line 21
    iget-object p0, p0, Lws0;->η:Lr01;

    .line 22
    .line 23
    invoke-static {v0, p0, p1, p2}, Lpt0;->α(Ljava/lang/String;Lr01;Lv80;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    const/16 p2, 0x31

    .line 30
    .line 31
    invoke-static {p2}, Lv81;->σ(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object v0, p0, Lws0;->ζ:Ljava/lang/String;

    .line 36
    .line 37
    iget-object p0, p0, Lws0;->η:Lr01;

    .line 38
    .line 39
    invoke-static {v0, p0, p1, p2}, Lpt0;->α(Ljava/lang/String;Lr01;Lv80;I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_1
    const/16 p2, 0x31

    .line 44
    .line 45
    invoke-static {p2}, Lv81;->σ(I)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    iget-object v0, p0, Lws0;->ζ:Ljava/lang/String;

    .line 50
    .line 51
    iget-object p0, p0, Lws0;->η:Lr01;

    .line 52
    .line 53
    invoke-static {v0, p0, p1, p2}, Ljx0;->δ(Ljava/lang/String;Lr01;Lv80;I)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_2
    const/16 p2, 0x31

    .line 58
    .line 59
    invoke-static {p2}, Lv81;->σ(I)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    iget-object v0, p0, Lws0;->ζ:Ljava/lang/String;

    .line 64
    .line 65
    iget-object p0, p0, Lws0;->η:Lr01;

    .line 66
    .line 67
    invoke-static {v0, p0, p1, p2}, Ljx0;->δ(Ljava/lang/String;Lr01;Lv80;I)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
