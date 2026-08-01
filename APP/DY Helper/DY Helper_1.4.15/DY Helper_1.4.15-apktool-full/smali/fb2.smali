.class public final Lfb2;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lfb2;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Lm01;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 8

    .line 1
    iget p0, p0, Lfb2;->α:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p0, Lyl;->α:Lyl;

    .line 11
    .line 12
    invoke-static {}, Lyl;->ζ()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    invoke-static {}, Lyl;->ξ()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    instance-of p1, p0, Landroid/view/View;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    move-object v1, p0

    .line 36
    check-cast v1, Landroid/view/View;

    .line 37
    .line 38
    :cond_1
    move-object v6, v1

    .line 39
    if-nez v6, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-string p0, "panel.onViewCreated"

    .line 43
    .line 44
    invoke-static {v6, p0}, Lyl;->α(Landroid/view/View;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v5, Lul;

    .line 48
    .line 49
    const/4 p0, 0x7

    .line 50
    invoke-direct {v5, p0}, Lul;-><init>(I)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lsm1;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    const/16 v3, 0x100

    .line 60
    .line 61
    const/16 v4, 0xc

    .line 62
    .line 63
    invoke-static/range {v2 .. v7}, Lyl;->ο(Lsm1;IILa80;Landroid/view/View;I)V

    .line 64
    .line 65
    .line 66
    :goto_0
    return-void

    .line 67
    :pswitch_0
    sget-object p0, Lhb2;->α:Lhb2;

    .line 68
    .line 69
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 70
    .line 71
    if-nez p0, :cond_3

    .line 72
    .line 73
    goto/16 :goto_5

    .line 74
    .line 75
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Lhb2;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_7

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/reflect/Field;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_4

    .line 108
    .line 109
    const/4 v2, 0x1

    .line 110
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    goto :goto_2

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    new-instance v2, Leo1;

    .line 120
    .line 121
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    move-object v0, v2

    .line 125
    :goto_2
    instance-of v2, v0, Leo1;

    .line 126
    .line 127
    if-eqz v2, :cond_5

    .line 128
    .line 129
    move-object v2, v1

    .line 130
    goto :goto_3

    .line 131
    :cond_5
    move-object v2, v0

    .line 132
    :goto_3
    if-nez v2, :cond_6

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_6
    sget-object v0, Lhb2;->α:Lhb2;

    .line 136
    .line 137
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, Lhb2;->δ(Ljava/lang/Class;)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 149
    goto :goto_4

    .line 150
    :catchall_1
    move-exception v0

    .line 151
    new-instance v3, Leo1;

    .line 152
    .line 153
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    move-object v0, v3

    .line 157
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const-string v3, "39.6+ \u79c1\u4fe1 Helper \u8fd0\u884c\u65f6\u89e3\u6790\u5931\u8d25 type="

    .line 172
    .line 173
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const-string v3, "re4b6c41332ef57c6"

    .line 178
    .line 179
    invoke-static {v3, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_7
    :goto_5
    return-void

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
