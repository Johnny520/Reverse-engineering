.class public final synthetic Lxb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/ClassLoader;

.field public final synthetic η:Lvc1;

.field public final synthetic θ:Llc1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Lvc1;Llc1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lxb1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxb1;->ζ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    iput-object p2, p0, Lxb1;->η:Lvc1;

    .line 6
    .line 7
    iput-object p3, p0, Lxb1;->θ:Llc1;

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
    .locals 6

    .line 1
    iget v0, p0, Lxb1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxb1;->ζ:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    iget-object v1, p0, Lxb1;->η:Lvc1;

    .line 9
    .line 10
    iget-object p0, p0, Lxb1;->θ:Llc1;

    .line 11
    .line 12
    iget-object p0, p0, Llc1;->α:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    const-string v2, "POST"

    .line 24
    .line 25
    const-string v3, "https://vassets-backend.douyin.com/gameplay/farm/water_crops"

    .line 26
    .line 27
    const-string v4, "decorate_uuid"

    .line 28
    .line 29
    new-instance v5, Ll91;

    .line 30
    .line 31
    invoke-direct {v5, v4, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v5}, Lex0;->Λ(Ll91;)Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {v0, v1, v2, v3, p0}, Li81;->ω(Ljava/lang/ClassLoader;Lvc1;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lza1;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Li81;->υ(Lza1;)Lkc1;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-string p0, "decorateUuid \u4e0d\u80fd\u4e3a\u7a7a"

    .line 48
    .line 49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    new-instance v0, Leo1;

    .line 57
    .line 58
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object p0, v0

    .line 62
    :goto_0
    new-instance v0, Lfo1;

    .line 63
    .line 64
    invoke-direct {v0, p0}, Lfo1;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_0
    iget-object v0, p0, Lxb1;->ζ:Ljava/lang/ClassLoader;

    .line 69
    .line 70
    iget-object v1, p0, Lxb1;->η:Lvc1;

    .line 71
    .line 72
    iget-object p0, p0, Lxb1;->θ:Llc1;

    .line 73
    .line 74
    iget-object p0, p0, Llc1;->α:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    :try_start_1
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-nez v2, :cond_1

    .line 84
    .line 85
    const-string v2, "POST"

    .line 86
    .line 87
    const-string v3, "https://vassets-backend.douyin.com/gameplay/farm/harvest_crops"

    .line 88
    .line 89
    const-string v4, "decorate_uuid"

    .line 90
    .line 91
    new-instance v5, Ll91;

    .line 92
    .line 93
    invoke-direct {v5, v4, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v5}, Lex0;->Λ(Ll91;)Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {v0, v1, v2, v3, p0}, Li81;->ω(Ljava/lang/ClassLoader;Lvc1;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lza1;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Li81;->υ(Lza1;)Lkc1;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    goto :goto_1

    .line 109
    :cond_1
    const-string p0, "decorateUuid \u4e0d\u80fd\u4e3a\u7a7a"

    .line 110
    .line 111
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 112
    .line 113
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    :catchall_1
    move-exception p0

    .line 118
    new-instance v0, Leo1;

    .line 119
    .line 120
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    move-object p0, v0

    .line 124
    :goto_1
    new-instance v0, Lfo1;

    .line 125
    .line 126
    invoke-direct {v0, p0}, Lfo1;-><init>(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
