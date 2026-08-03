.class public final synthetic Lwb/af;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/af;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/af;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/af;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/af;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/af;->k:Li0/a1;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/af;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/af;->k:Li0/a1;

    .line 7
    .line 8
    const/16 v1, 0x1388

    .line 9
    .line 10
    iget-object v2, p0, Lwb/af;->h:Li0/a1;

    .line 11
    .line 12
    iget-object v3, p0, Lwb/af;->i:Li0/a1;

    .line 13
    .line 14
    iget-object v4, p0, Lwb/af;->j:Li0/a1;

    .line 15
    .line 16
    invoke-static {v2, v3, v4, v0, v1}, Lwb/y2;->s(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lwb/af;->k:Li0/a1;

    .line 23
    .line 24
    const/16 v1, -0x1388

    .line 25
    .line 26
    iget-object v2, p0, Lwb/af;->h:Li0/a1;

    .line 27
    .line 28
    iget-object v3, p0, Lwb/af;->i:Li0/a1;

    .line 29
    .line 30
    iget-object v4, p0, Lwb/af;->j:Li0/a1;

    .line 31
    .line 32
    invoke-static {v2, v3, v4, v0, v1}, Lwb/y2;->s(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_1
    new-instance v1, Lwb/v0;

    .line 37
    .line 38
    iget-object v0, p0, Lwb/af;->h:Li0/a1;

    .line 39
    .line 40
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v3, 0x1

    .line 51
    if-ne v2, v3, :cond_0

    .line 52
    .line 53
    const-string v2, "\u9009\u62e9\u767d\u540d\u5355"

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    const-string v2, "\u9009\u62e9\u9ed1\u540d\u5355"

    .line 57
    .line 58
    :goto_1
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    iget-object v5, p0, Lwb/af;->i:Li0/a1;

    .line 69
    .line 70
    iget-object v6, p0, Lwb/af;->j:Li0/a1;

    .line 71
    .line 72
    if-ne v4, v3, :cond_1

    .line 73
    .line 74
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Ljava/lang/String;

    .line 79
    .line 80
    :goto_2
    move-object v4, v6

    .line 81
    goto :goto_3

    .line 82
    :cond_1
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Ljava/lang/String;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :goto_3
    new-instance v6, Lwb/ad;

    .line 90
    .line 91
    const/4 v7, 0x1

    .line 92
    invoke-direct {v6, v0, v5, v4, v7}, Lwb/ad;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 93
    .line 94
    .line 95
    const/16 v8, 0xc0

    .line 96
    .line 97
    move-object v5, v3

    .line 98
    sget-object v3, Lwb/u0;->i:Lwb/u0;

    .line 99
    .line 100
    const/4 v4, 0x1

    .line 101
    invoke-direct/range {v1 .. v8}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lwb/af;->k:Li0/a1;

    .line 105
    .line 106
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
