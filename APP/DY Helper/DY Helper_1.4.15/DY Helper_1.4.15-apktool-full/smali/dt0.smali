.class public final synthetic Ldt0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lgt0;


# direct methods
.method public synthetic constructor <init>(Lgt0;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldt0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ldt0;->ζ:Lgt0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Ldt0;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lv80;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    and-int/lit8 v0, p2, 0x3

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v3, 0x1

    .line 20
    if-eq v0, v2, :cond_0

    .line 21
    .line 22
    move v0, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    and-int/2addr p2, v3

    .line 26
    invoke-virtual {p1, p2, v0}, Lv80;->Ξ(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_5

    .line 31
    .line 32
    iget-object v4, p0, Ldt0;->ζ:Lgt0;

    .line 33
    .line 34
    iget-object p0, v4, Lgt0;->ε:Lx91;

    .line 35
    .line 36
    invoke-virtual {p0}, Lx91;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lps0;

    .line 41
    .line 42
    invoke-virtual {p1, v4}, Lv80;->η(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p1}, Lv80;->Λ()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-object v10, Lqn;->α:Li2;

    .line 51
    .line 52
    if-nez p2, :cond_1

    .line 53
    .line 54
    if-ne v0, v10, :cond_2

    .line 55
    .line 56
    :cond_1
    new-instance v2, Lng;

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const/16 v9, 0x1a

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    const-class v5, Lgt0;

    .line 63
    .line 64
    const-string v6, "handleTabClick"

    .line 65
    .line 66
    const-string v7, "handleTabClick(Ljava/lang/String;)V"

    .line 67
    .line 68
    invoke-direct/range {v2 .. v9}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v2}, Lv80;->е(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move-object v0, v2

    .line 75
    :cond_2
    check-cast v0, Lko0;

    .line 76
    .line 77
    check-cast v0, La80;

    .line 78
    .line 79
    invoke-virtual {p1, v4}, Lv80;->η(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    invoke-virtual {p1}, Lv80;->Λ()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-nez p2, :cond_3

    .line 88
    .line 89
    if-ne v2, v10, :cond_4

    .line 90
    .line 91
    :cond_3
    new-instance v2, Lng;

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    const/16 v9, 0x1b

    .line 95
    .line 96
    const/4 v3, 0x1

    .line 97
    const-class v5, Lgt0;

    .line 98
    .line 99
    const-string v6, "handleTabLongClick"

    .line 100
    .line 101
    const-string v7, "handleTabLongClick(Ljava/lang/String;)V"

    .line 102
    .line 103
    invoke-direct/range {v2 .. v9}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v2}, Lv80;->е(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    check-cast v2, Lko0;

    .line 110
    .line 111
    check-cast v2, La80;

    .line 112
    .line 113
    sget-object p2, Lps0;->ζ:Lps0;

    .line 114
    .line 115
    const/16 p2, 0x8

    .line 116
    .line 117
    invoke-static {p0, v0, v2, p1, p2}, Ljx0;->β(Lps0;La80;La80;Lv80;I)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_5
    invoke-virtual {p1}, Lv80;->Ρ()V

    .line 122
    .line 123
    .line 124
    :goto_1
    return-object v1

    .line 125
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 126
    .line 127
    check-cast p2, Ljava/lang/Throwable;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    const-string v0, "backdrop:"

    .line 136
    .line 137
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string v0, "\u6355\u83b7\u5bbf\u4e3b\u5e95\u680f\u80cc\u666f\u5931\u8d25\uff0c\u5c06\u7ee7\u7eed\u4f7f\u7528\u964d\u7ea7\u6750\u8d28"

    .line 142
    .line 143
    iget-object p0, p0, Ldt0;->ζ:Lgt0;

    .line 144
    .line 145
    invoke-virtual {p0, p1, v0, p2}, Lgt0;->β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    return-object v1

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
