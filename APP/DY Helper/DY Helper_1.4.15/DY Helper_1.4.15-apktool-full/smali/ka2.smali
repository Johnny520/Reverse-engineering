.class public final synthetic Lka2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lka2;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lka2;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lka2;->η:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lka2;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lka2;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lhd2;

    .line 9
    .line 10
    iget-object p0, p0, Lka2;->η:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljr0;

    .line 13
    .line 14
    iget-boolean v1, v0, Lhd2;->η:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iput-object p0, v0, Lhd2;->θ:Ljr0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljr0;->α(Lgr0;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, Lka2;->ζ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lgc;

    .line 27
    .line 28
    iget-object p0, p0, Lka2;->η:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lcb2;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lgc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    iget-object v0, p0, Lka2;->ζ:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Landroid/content/Context;

    .line 39
    .line 40
    iget-object p0, p0, Lka2;->η:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Ljava/lang/Throwable;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v2, "\u8bed\u97f3\u66ff\u6362\u5931\u8d25: "

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_2
    iget-object v0, p0, Lka2;->ζ:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lla2;

    .line 74
    .line 75
    iget-object p0, p0, Lka2;->η:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Lqa2;

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Lla2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
