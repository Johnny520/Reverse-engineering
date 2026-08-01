.class public final synthetic Lwb0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ldc0;


# direct methods
.method public synthetic constructor <init>(Ldc0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb0;->ζ:Ldc0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object p0, p0, Lwb0;->ζ:Ldc0;

    .line 8
    .line 9
    iput-boolean v0, p0, Ldc0;->υ:Z

    .line 10
    .line 11
    const-string v0, "\u7fa4\u7533\u8bf7\u4efb\u52a1\u6b63\u5728\u6267\u884c\uff0c\u8bf7\u7a0d\u540e\u5237\u65b0"

    .line 12
    .line 13
    iput-object v0, p0, Ldc0;->ψ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p0}, Ldc0;->η()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Ls62;->α:Ls62;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    iget-object p0, p0, Lwb0;->ζ:Ldc0;

    .line 22
    .line 23
    iget-object p0, p0, Ldc0;->ο:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    const-string v0, "\u5ba1\u6279\u5df2\u63d0\u4ea4\uff0c\u6b63\u5728\u540c\u6b65\u670d\u52a1\u7aef\u72b6\u6001"

    .line 35
    .line 36
    iget-object p0, p0, Lwb0;->ζ:Ldc0;

    .line 37
    .line 38
    iput-object v0, p0, Ldc0;->χ:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0}, Ldc0;->η()V

    .line 41
    .line 42
    .line 43
    sget-object p0, Ls62;->α:Ls62;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_2
    iget-object p0, p0, Lwb0;->ζ:Ldc0;

    .line 47
    .line 48
    iget-object p0, p0, Ldc0;->ο:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_3
    iget-object p0, p0, Lwb0;->ζ:Ldc0;

    .line 60
    .line 61
    iget-object p0, p0, Ldc0;->ο:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :pswitch_4
    const/4 v0, 0x0

    .line 73
    iget-object p0, p0, Lwb0;->ζ:Ldc0;

    .line 74
    .line 75
    iput-boolean v0, p0, Ldc0;->φ:Z

    .line 76
    .line 77
    const-string v0, "\u7fa4\u7533\u8bf7\u4efb\u52a1\u6b63\u5728\u6267\u884c\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 78
    .line 79
    iput-object v0, p0, Ldc0;->ψ:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p0}, Ldc0;->η()V

    .line 82
    .line 83
    .line 84
    sget-object p0, Ls62;->α:Ls62;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
