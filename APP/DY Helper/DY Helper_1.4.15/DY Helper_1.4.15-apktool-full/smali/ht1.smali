.class public final synthetic Lht1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;II)V
    .locals 0

    .line 1
    iput p3, p0, Lht1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lht1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput p2, p0, Lht1;->η:I

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
    .locals 9

    .line 1
    iget v0, p0, Lht1;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget v2, p0, Lht1;->η:I

    .line 6
    .line 7
    check-cast p1, La80;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lbv1;->α:Lbv1;

    .line 16
    .line 17
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    new-instance v8, Lhu;

    .line 22
    .line 23
    const/16 v0, 0x14

    .line 24
    .line 25
    iget-object v3, p0, Lht1;->ζ:Landroid/app/Activity;

    .line 26
    .line 27
    invoke-direct {v8, v3, p1, v0}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 28
    .line 29
    .line 30
    const-string v4, "\u8bbe\u7f6e\u706b\u82b1/\u706b\u661f\u542f\u52a8\u5ef6\u8fdf"

    .line 31
    .line 32
    const-string v5, "\u5efa\u8bae 10~60 \u79d2\uff0c\u8ba9\u79c1\u4fe1\u6570\u636e\u6709\u65f6\u95f4\u52a0\u8f7d"

    .line 33
    .line 34
    const/4 v7, 0x2

    .line 35
    invoke-static/range {v3 .. v8}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object v0, Lbv1;->α:Lbv1;

    .line 43
    .line 44
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    new-instance v8, Lhu;

    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    iget-object v3, p0, Lht1;->ζ:Landroid/app/Activity;

    .line 53
    .line 54
    invoke-direct {v8, v3, p1, v0}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 55
    .line 56
    .line 57
    const-string v4, "\u8bbe\u7f6e\u8425\u5730\u64cd\u4f5c\u95f4\u9694"

    .line 58
    .line 59
    const-string v5, "\u8f93\u5165 0~60 \u79d2"

    .line 60
    .line 61
    const/4 v7, 0x2

    .line 62
    invoke-static/range {v3 .. v8}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    sget-object v0, Lbv1;->α:Lbv1;

    .line 70
    .line 71
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    new-instance v8, Lhu;

    .line 76
    .line 77
    const/4 v0, 0x6

    .line 78
    iget-object v3, p0, Lht1;->ζ:Landroid/app/Activity;

    .line 79
    .line 80
    invoke-direct {v8, v3, p1, v0}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 81
    .line 82
    .line 83
    const-string v4, "\u8bbe\u7f6e\u6bcf\u65e5\u79cd\u690d\u9650\u989d"

    .line 84
    .line 85
    const-string v5, "\u8f93\u5165 0~100\uff1b0 \u8868\u793a\u4e0d\u9650\u5236"

    .line 86
    .line 87
    const/4 v7, 0x2

    .line 88
    invoke-static/range {v3 .. v8}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 89
    .line 90
    .line 91
    return-object v1

    .line 92
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    sget-object v0, Lbv1;->α:Lbv1;

    .line 96
    .line 97
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    new-instance v8, Lhu;

    .line 102
    .line 103
    const/16 v0, 0xe

    .line 104
    .line 105
    iget-object v3, p0, Lht1;->ζ:Landroid/app/Activity;

    .line 106
    .line 107
    invoke-direct {v8, v3, p1, v0}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 108
    .line 109
    .line 110
    const-string v4, "\u8bbe\u7f6e\u6bcf\u65e5\u6536\u83b7\u9650\u989d"

    .line 111
    .line 112
    const-string v5, "\u8f93\u5165 0~100\uff1b0 \u8868\u793a\u4e0d\u9650\u5236"

    .line 113
    .line 114
    const/4 v7, 0x2

    .line 115
    invoke-static/range {v3 .. v8}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 116
    .line 117
    .line 118
    return-object v1

    .line 119
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    sget-object v0, Lbv1;->α:Lbv1;

    .line 123
    .line 124
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    new-instance v8, Lhu;

    .line 129
    .line 130
    const/16 v0, 0xf

    .line 131
    .line 132
    iget-object v3, p0, Lht1;->ζ:Landroid/app/Activity;

    .line 133
    .line 134
    invoke-direct {v8, v3, p1, v0}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 135
    .line 136
    .line 137
    const-string v4, "\u8bbe\u7f6e\u8425\u5730\u542f\u52a8\u5ef6\u8fdf"

    .line 138
    .line 139
    const-string v5, "\u8f93\u5165 0~300 \u79d2\uff1b\u4f1a\u8bdd\u5c1a\u672a\u52a0\u8f7d\u5b8c\u6210\u65f6\u4f1a\u7ee7\u7eed\u7b49\u5f85\uff0c\u4e0d\u4f1a\u8df3\u8fc7\u672c\u6b21\u6267\u884c"

    .line 140
    .line 141
    const/4 v7, 0x2

    .line 142
    invoke-static/range {v3 .. v8}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 143
    .line 144
    .line 145
    return-object v1

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
