.class public final synthetic Lwg;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lzg;


# direct methods
.method public synthetic constructor <init>(Lzg;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwg;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lwg;->ζ:Lzg;

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
    .locals 7

    .line 1
    iget v0, p0, Lwg;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const-string v2, "clean_misc_dialog"

    .line 6
    .line 7
    const-string v3, "clean_misc_control_"

    .line 8
    .line 9
    iget-object p0, p0, Lwg;->ζ:Lzg;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object p0, p0, Lzg;->α:Lbh;

    .line 21
    .line 22
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v0, p0, Lbh;->ε:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, "_follow_restore"

    .line 35
    .line 36
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {v4, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lbh;->ε:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v3, p0, v0}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object p1, Lug;->α:Ltg;

    .line 53
    .line 54
    invoke-static {p0, v2}, Ltg;->Ω(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iget-object p0, p0, Lzg;->α:Lbh;

    .line 65
    .line 66
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v0, p0, Lbh;->ε:Ljava/lang/String;

    .line 69
    .line 70
    const-string v4, "_alpha"

    .line 71
    .line 72
    invoke-static {v3, v0, v4}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const/4 v5, 0x0

    .line 77
    const/16 v6, 0x64

    .line 78
    .line 79
    invoke-static {p1, v5, v6}, Lj81;->μ(III)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-static {v0, p1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lbh;->ε:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v3, p0, v4}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    sget-object p1, Lug;->α:Ltg;

    .line 93
    .line 94
    invoke-static {p0, v2}, Ltg;->Ω(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object v1

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
