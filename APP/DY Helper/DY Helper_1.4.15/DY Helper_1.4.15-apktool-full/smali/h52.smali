.class public final synthetic Lh52;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:I

.field public final synthetic θ:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;III)V
    .locals 0

    .line 1
    iput p4, p0, Lh52;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lh52;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lh52;->η:I

    .line 6
    .line 7
    iput p3, p0, Lh52;->θ:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lh52;->ε:I

    .line 2
    .line 3
    const-string v1, "\u8df3\u8fc7\u9690\u85cf\u9876\u680f\u9875\u5f02\u5e38: "

    .line 4
    .line 5
    const-string v2, " -> "

    .line 6
    .line 7
    const-string v3, "\u8df3\u8fc7\u9690\u85cf\u9876\u680f\u9875: "

    .line 8
    .line 9
    sget-object v4, Ls62;->α:Ls62;

    .line 10
    .line 11
    iget v5, p0, Lh52;->θ:I

    .line 12
    .line 13
    iget v6, p0, Lh52;->η:I

    .line 14
    .line 15
    iget-object p0, p0, Lh52;->ζ:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p0, Ldg0;

    .line 21
    .line 22
    :try_start_0
    iget-object v0, p0, Ldg0;->Γ:Llg0;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v6, v5, v1}, Llg0;->ξ(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    sget-object v1, Lsz;->θ:Lsz;

    .line 31
    .line 32
    invoke-virtual {p0, v1, v1, v0}, Ldg0;->δ(Lsz;Lsz;Ljava/io/IOException;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-object v4

    .line 36
    :pswitch_0
    const-string v0, "ra3f49bce40b36580"

    .line 37
    .line 38
    :try_start_1
    sget-object v7, Ll52;->α:Ll52;

    .line 39
    .line 40
    invoke-static {p0}, Ll52;->λ(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eq v7, v6, :cond_0

    .line 45
    .line 46
    invoke-static {v6, p0}, Ll52;->υ(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_2

    .line 52
    :cond_0
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v1, v2, v0, p0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :goto_3
    return-object v4

    .line 82
    :pswitch_1
    const-string v0, "r14983b95b84acb5"

    .line 83
    .line 84
    :try_start_2
    sget-object v7, Lm52;->α:Lm52;

    .line 85
    .line 86
    invoke-static {p0}, Lm52;->λ(Ljava/lang/Object;)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eq v7, v6, :cond_1

    .line 91
    .line 92
    invoke-static {v6, p0}, Lm52;->υ(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :catchall_1
    move-exception p0

    .line 97
    goto :goto_5

    .line 98
    :cond_1
    :goto_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 117
    .line 118
    .line 119
    goto :goto_6

    .line 120
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v1, v2, v0, p0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    :goto_6
    return-object v4

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
