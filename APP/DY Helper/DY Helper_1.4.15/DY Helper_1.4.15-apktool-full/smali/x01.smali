.class public final Lx01;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lx01;

.field public static volatile β:Ljava/lang/String;

.field public static volatile γ:Landroid/content/res/Resources;

.field public static volatile δ:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lx01;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx01;->α:Lx01;

    .line 7
    .line 8
    const-class v0, Lx01;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lx01;->δ:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    return-void
.end method

.method public static ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v1, "id"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, v1, p1, v2}, Lx01;->ζ(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v1, v3}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    if-eqz p2, :cond_1

    .line 32
    .line 33
    if-eq p2, v0, :cond_1

    .line 34
    .line 35
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v3}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-static {v1}, Lyh;->μ(Lzt0;)Lzt0;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1, v2}, Lzt0;->listIterator(I)Ljava/util/ListIterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const/4 v2, 0x0

    .line 51
    :goto_0
    move-object v3, v1

    .line 52
    check-cast v3, Lle0;

    .line 53
    .line 54
    invoke-virtual {v3}, Lle0;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_5

    .line 59
    .line 60
    invoke-virtual {v3}, Lle0;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {p3, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    invoke-virtual {p3, v3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Landroid/view/View;

    .line 88
    .line 89
    if-eqz p0, :cond_3

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_3
    const-string p0, "\u6a21\u5757\u63a7\u4ef6\u8f6c\u6362\u5931\u8d25: id/"

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const/4 p0, 0x0

    .line 102
    return-object p0

    .line 103
    :cond_4
    move-object v2, v3

    .line 104
    goto :goto_0

    .line 105
    :cond_5
    if-eqz v2, :cond_6

    .line 106
    .line 107
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    const-string v0, ", expected="

    .line 122
    .line 123
    const-string v1, ", actual="

    .line 124
    .line 125
    const-string v2, "\u6a21\u5757\u63a7\u4ef6\u7c7b\u578b\u4e0d\u5339\u914d: id/"

    .line 126
    .line 127
    invoke-static {v2, p1, v0, p2, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p0

    .line 142
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 143
    .line 144
    const/16 p3, 0x10

    .line 145
    .line 146
    invoke-static {p3}, Ljx0;->λ(I)V

    .line 147
    .line 148
    .line 149
    int-to-long v0, v0

    .line 150
    const-wide v2, 0xffffffffL

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    and-long/2addr v0, v2

    .line 156
    invoke-static {v0, v1}, Lv71;->υ(J)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {p3}, Ljx0;->λ(I)V

    .line 161
    .line 162
    .line 163
    int-to-long p2, p2

    .line 164
    and-long/2addr p2, v2

    .line 165
    invoke-static {p2, p3}, Lv71;->υ(J)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    const-string p3, ", runtimeId=0x"

    .line 170
    .line 171
    const-string v1, ", fallbackId=0x"

    .line 172
    .line 173
    const-string v2, "\u6a21\u5757\u5e03\u5c40\u7f3a\u5c11\u5fc5\u9700\u63a7\u4ef6: id/"

    .line 174
    .line 175
    invoke-static {v2, p1, p3, v0, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p0
.end method

.method public static ζ(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "com.example.dyhelper"

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    new-instance p1, Leo1;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    move-object p0, p1

    .line 19
    :goto_0
    const/4 p1, 0x0

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    instance-of p2, p0, Leo1;

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    move-object p0, p1

    .line 29
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 p1, 0x0

    .line 43
    :goto_1
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    :cond_2
    return p3
.end method


# virtual methods
.method public final α(Landroid/content/Context;)Lw01;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    const-string v0, "com.example.dyhelper"

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/Context;->getPackageResourcePath()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    :try_start_2
    new-instance v3, Leo1;

    .line 32
    .line 33
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v3

    .line 37
    :goto_0
    instance-of v3, v0, Leo1;

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    :cond_0
    check-cast v0, Ljava/lang/ClassLoader;

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    sget-object v0, Lx01;->δ:Ljava/lang/ClassLoader;

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    const-class v0, Lx01;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_1

    .line 57
    :catchall_1
    move-exception v0

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    :goto_1
    new-instance v3, Lw01;

    .line 60
    .line 61
    invoke-direct {v3, p1, v1, v2, v0}, Lw01;-><init>(Landroid/content/Context;Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "DYHelper: createPackageContext \u5931\u8d25\uff0c\u6539\u7528 modulePath \u52a0\u8f7d\u8d44\u6e90: "

    .line 70
    .line 71
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sget-object v0, Lx01;->β:Ljava/lang/String;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    sget-object v1, Lx01;->γ:Landroid/content/res/Resources;

    .line 79
    .line 80
    if-nez v1, :cond_3

    .line 81
    .line 82
    monitor-enter p0

    .line 83
    :try_start_3
    sget-object v1, Lx01;->γ:Landroid/content/res/Resources;

    .line 84
    .line 85
    if-nez v1, :cond_2

    .line 86
    .line 87
    invoke-static {p1, v0}, Lpd2;->ξ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sput-object v1, Lx01;->γ:Landroid/content/res/Resources;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :catchall_2
    move-exception p1

    .line 95
    goto :goto_4

    .line 96
    :cond_2
    :goto_3
    monitor-exit p0

    .line 97
    goto :goto_5

    .line 98
    :goto_4
    monitor-exit p0

    .line 99
    throw p1

    .line 100
    :cond_3
    :goto_5
    sget-object p0, Lx01;->δ:Ljava/lang/ClassLoader;

    .line 101
    .line 102
    if-nez p0, :cond_4

    .line 103
    .line 104
    const-class p0, Lx01;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    :cond_4
    new-instance v2, Lw01;

    .line 111
    .line 112
    invoke-direct {v2, p1, v1, v0, p0}, Lw01;-><init>(Landroid/content/Context;Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 113
    .line 114
    .line 115
    return-object v2

    .line 116
    :cond_5
    const-string p0, "modulePath \u4e3a\u7a7a\uff0c\u8bf7\u786e\u8ba4 MainHook \u5df2\u5b8c\u6210 libxposed onModuleLoaded \u521d\u59cb\u5316"

    .line 117
    .line 118
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x0

    .line 122
    return-object p0
.end method

.method public final β(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lx01;->α(Landroid/content/Context;)Lw01;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0, p2}, Lln0;->Κ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance p1, Leo1;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, p1

    .line 20
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/16 v0, 0x10

    .line 27
    .line 28
    invoke-static {v0}, Ljx0;->λ(I)V

    .line 29
    .line 30
    .line 31
    int-to-long v0, p2

    .line 32
    const-wide v2, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v0, v2

    .line 38
    invoke-static {v0, v1}, Lv71;->υ(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const-string v0, "\u6a21\u5757 Drawable \u52a0\u8f7d\u5931\u8d25: id=0x"

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const-string v0, "DYHelper"

    .line 49
    .line 50
    invoke-static {v0, p2, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    instance-of p1, p0, Leo1;

    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    :cond_1
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    return-object p0
.end method

.method public final γ(ILandroid/content/Context;Ljava/lang/String;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lx01;->α(Landroid/content/Context;)Lw01;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p2, p0, Lw01;->α:Landroid/content/res/Resources;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "layout"

    .line 14
    .line 15
    invoke-static {p2, v0, p3, p1}, Lx01;->ζ(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    const-string p2, "layout_inflater"

    .line 22
    .line 23
    invoke-virtual {p0, p2}, Lw01;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of p2, p0, Landroid/view/LayoutInflater;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    check-cast p0, Landroid/view/LayoutInflater;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object p0, v0

    .line 36
    :goto_0
    if-eqz p0, :cond_1

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-virtual {p0, p1, v0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_1
    const-string p0, "\u6a21\u5757\u5e03\u5c40\u52a0\u8f7d\u5668\u4e0d\u53ef\u7528: layout/"

    .line 48
    .line 49
    invoke-virtual {p0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    :cond_2
    const-string p0, "\u6a21\u5757\u5e03\u5c40\u8d44\u6e90\u4e0d\u5b58\u5728: layout/"

    .line 59
    .line 60
    invoke-virtual {p0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method

.method public final δ(Landroid/content/Context;)Landroid/view/LayoutInflater;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lx01;->α(Landroid/content/Context;)Lw01;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string p1, "layout_inflater"

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lw01;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast p0, Landroid/view/LayoutInflater;

    .line 18
    .line 19
    return-object p0
.end method

.method public final varargs η(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lx01;->α(Landroid/content/Context;)Lw01;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, Lw01;->α:Landroid/content/res/Resources;

    .line 9
    .line 10
    array-length p1, p3

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    array-length p1, p3

    .line 22
    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p2, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    return-object p0
.end method
