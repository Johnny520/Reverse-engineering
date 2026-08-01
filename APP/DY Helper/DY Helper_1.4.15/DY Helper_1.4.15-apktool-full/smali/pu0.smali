.class public final Lpu0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lpu0;

.field public static volatile β:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lpu0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpu0;->α:Lpu0;

    .line 7
    .line 8
    return-void
.end method

.method public static final Α(Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p2}, Lpu0;->Λ(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_2
    :goto_0
    return-void
.end method

.method public static Β(Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "tplv-dy-kuchen-v1-water"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/16 v0, 0x320

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v1

    .line 26
    :goto_0
    const-string v2, "water:"

    .line 27
    .line 28
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    add-int/lit16 v0, v0, 0x1f4

    .line 35
    .line 36
    :cond_1
    const-string v2, "watermark"

    .line 37
    .line 38
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    add-int/lit16 v0, v0, 0x1f4

    .line 45
    .line 46
    :cond_2
    const-string v2, "water_mark"

    .line 47
    .line 48
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    add-int/lit16 v0, v0, 0x1f4

    .line 55
    .line 56
    :cond_3
    const-string v2, "/water/"

    .line 57
    .line 58
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    add-int/lit16 v0, v0, 0x12c

    .line 65
    .line 66
    :cond_4
    const-string v2, "logo"

    .line 67
    .line 68
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_5

    .line 73
    .line 74
    add-int/lit16 v0, v0, 0xc8

    .line 75
    .line 76
    :cond_5
    return v0
.end method

.method public static Γ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, "bytevc1"

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, "bytevc2"

    .line 20
    .line 21
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, "bytevc"

    .line 28
    .line 29
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    const-string v0, "h265"

    .line 36
    .line 37
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    const-string v0, "hevc"

    .line 44
    .line 45
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    const-string v0, "hvc1"

    .line 52
    .line 53
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return v1

    .line 61
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 62
    return p0
.end method

.method public static Δ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, ".m3u8"

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, "m3u8"

    .line 20
    .line 21
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, ".mpd"

    .line 28
    .line 29
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    const-string v0, "mpegurl"

    .line 36
    .line 37
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    const-string v0, "dash"

    .line 44
    .line 45
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    const-string v0, ".m4s"

    .line 52
    .line 53
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return v1

    .line 61
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 62
    return p0
.end method

.method public static Ε(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "http://"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "https://"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    return v1
.end method

.method public static Ζ(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x5

    .line 14
    const/4 v2, 0x0

    .line 15
    if-lt v0, v1, :cond_2

    .line 16
    .line 17
    move v0, v2

    .line 18
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge v0, v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_2
    :goto_1
    return v2
.end method

.method public static Η(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lpu0;->Τ(Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const/16 v0, 0x64

    .line 9
    .line 10
    if-lt p0, v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public static Θ(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "DYHelper: [LivePhoto] "

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "DYHelper_LivePhoto"

    .line 11
    .line 12
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static Ι(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 11
    .line 12
    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    new-instance v0, Leo1;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p0, v0

    .line 37
    :goto_0
    instance-of v0, p0, Leo1;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const-string p0, ""

    .line 42
    .line 43
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 44
    .line 45
    const-string v0, "music"

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const-string v0, "audio"

    .line 55
    .line 56
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_1

    .line 61
    .line 62
    const-string p0, "/music/"

    .line 63
    .line 64
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_1

    .line 69
    .line 70
    const-string p0, "/audio/"

    .line 71
    .line 72
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_1

    .line 77
    .line 78
    const-string p0, "mime=audio"

    .line 79
    .line 80
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_1

    .line 85
    .line 86
    const-string p0, "mime_type=audio"

    .line 87
    .line 88
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-nez p0, :cond_1

    .line 93
    .line 94
    const-string p0, "audio/mpeg"

    .line 95
    .line 96
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_1

    .line 101
    .line 102
    const-string p0, "audio_mp4"

    .line 103
    .line 104
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_1

    .line 109
    .line 110
    const-string p0, ".mp3"

    .line 111
    .line 112
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_1

    .line 117
    .line 118
    const-string p0, ".m4a"

    .line 119
    .line 120
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_1

    .line 125
    .line 126
    const-string p0, ".aac"

    .line 127
    .line 128
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_1

    .line 133
    .line 134
    const-string p0, ".ogg"

    .line 135
    .line 136
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-nez p0, :cond_1

    .line 141
    .line 142
    const-string p0, ".wav"

    .line 143
    .line 144
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-nez p0, :cond_1

    .line 149
    .line 150
    const-string p0, ".flac"

    .line 151
    .line 152
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-eqz p0, :cond_2

    .line 157
    .line 158
    :cond_1
    const/4 v2, 0x1

    .line 159
    :cond_2
    return v2
.end method

.method public static Κ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lpu0;->Μ(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, ".jpg"

    .line 19
    .line 20
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_2

    .line 25
    .line 26
    const-string p0, ".jpeg"

    .line 27
    .line 28
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    const-string p0, ".png"

    .line 35
    .line 36
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-nez p0, :cond_2

    .line 41
    .line 42
    const-string p0, ".webp"

    .line 43
    .line 44
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_2

    .line 49
    .line 50
    const-string p0, ".heic"

    .line 51
    .line 52
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_2

    .line 57
    .line 58
    const-string p0, ".heif"

    .line 59
    .line 60
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_2

    .line 65
    .line 66
    const-string p0, "mime_type=image"

    .line 67
    .line 68
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_2

    .line 73
    .line 74
    const-string p0, "image_type=image"

    .line 75
    .line 76
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_2

    .line 81
    .line 82
    const-string p0, "image/"

    .line 83
    .line 84
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_2

    .line 89
    .line 90
    const-string p0, "tplv-dy-kuchen"

    .line 91
    .line 92
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_2

    .line 97
    .line 98
    const-string p0, "tplv-dy-aweme-images"

    .line 99
    .line 100
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    :goto_0
    return v1

    .line 108
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 109
    return p0
.end method

.method public static Λ(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v1, "imageurlstruct"

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v1, "image"

    .line 30
    .line 31
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const-string v0, "urlList"

    .line 38
    .line 39
    const-string v1, "_urlList"

    .line 40
    .line 41
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const-string v0, "downloadUrlList"

    .line 53
    .line 54
    const-string v1, "_downloadUrlList"

    .line 55
    .line 56
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    :goto_0
    return v3

    .line 67
    :cond_2
    invoke-static {p0}, Lpu0;->τ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-nez p0, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-static {p0}, Lpu0;->κ(Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Lpu0;->Ρ(Ljava/util/List;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    return v3

    .line 85
    :cond_4
    :goto_1
    return v2
.end method

.method public static Μ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, ".mp4"

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, ".m3u8"

    .line 20
    .line 21
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, "video_mp4"

    .line 28
    .line 29
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    const-string v0, "mime_type=video"

    .line 36
    .line 37
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    const-string v0, "/video/"

    .line 44
    .line 45
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    const-string v0, "/play/"

    .line 52
    .line 53
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    const-string v0, "playaddr"

    .line 60
    .line 61
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    const-string v0, "play_addr"

    .line 68
    .line 69
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    return v1

    .line 77
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 78
    return p0
.end method

.method public static Ο(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 8

    .line 1
    const-string v0, "awemeTypeP"

    .line 2
    .line 3
    const-string v1, "awemeType"

    .line 4
    .line 5
    const-string v2, "aweme_type"

    .line 6
    .line 7
    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, v0}, Lpu0;->υ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    const-string v0, "getAwemeTypeP"

    .line 27
    .line 28
    const-string v1, "getAweme_type"

    .line 29
    .line 30
    const-string v3, "getAwemeType"

    .line 31
    .line 32
    filled-new-array {v3, v0, v1}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p0, v0}, Lpu0;->ζ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lpu0;->δ(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lpu0;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const-string v3, "type"

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ljava/lang/reflect/Field;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_2

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 100
    .line 101
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const-string v6, "awemetype"

    .line 109
    .line 110
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-nez v6, :cond_3

    .line 115
    .line 116
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-nez v6, :cond_3

    .line 121
    .line 122
    const-string v6, "awemetypep"

    .line 123
    .line 124
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-nez v6, :cond_3

    .line 129
    .line 130
    const-string v6, "aweme"

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    invoke-static {v5, v6, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    if-eqz v6, :cond_2

    .line 138
    .line 139
    invoke-static {v5, v3, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_2

    .line 144
    .line 145
    :cond_3
    const/4 v3, 0x1

    .line 146
    :try_start_0
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    goto :goto_0

    .line 154
    :catchall_0
    move-exception v1

    .line 155
    new-instance v3, Leo1;

    .line 156
    .line 157
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    move-object v1, v3

    .line 161
    :goto_0
    instance-of v3, v1, Leo1;

    .line 162
    .line 163
    if-eqz v3, :cond_4

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_4
    move-object v4, v1

    .line 167
    :goto_1
    invoke-static {v4}, Lpu0;->δ(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-eqz v1, :cond_2

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :cond_5
    filled-new-array {v3}, [Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {p0, v0}, Lpu0;->υ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    if-eqz p0, :cond_6

    .line 191
    .line 192
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :cond_6
    return-object v4
.end method

.method public static Π(Ljava/util/List;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Luh0;

    .line 17
    .line 18
    const/16 v1, 0xc

    .line 19
    .line 20
    invoke-direct {v0, v1}, Luh0;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lye;

    .line 24
    .line 25
    const/16 v2, 0x16

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Lye;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lye;

    .line 31
    .line 32
    const/16 v2, 0x15

    .line 33
    .line 34
    invoke-direct {v0, v2, v1}, Lye;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v2, v1

    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v2}, Lpu0;->Β(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    const/16 v3, 0x64

    .line 71
    .line 72
    if-lt v2, v3, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_3

    .line 84
    .line 85
    invoke-static {v0}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Ljava/lang/String;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 93
    return-object p0
.end method

.method public static Ρ(Ljava/util/List;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    invoke-static {p0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    move-object v2, v1

    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v2}, Lpu0;->Ε(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v2, v1

    .line 69
    check-cast v2, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v2}, Lpu0;->Κ(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_3

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v2, v1

    .line 101
    check-cast v2, Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v2}, Lpu0;->Δ(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_5

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_8

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    move-object v2, v1

    .line 133
    check-cast v2, Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v2}, Lpu0;->Ι(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_9

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_9
    new-instance v0, Luh0;

    .line 153
    .line 154
    const/16 v1, 0xd

    .line 155
    .line 156
    invoke-direct {v0, v1}, Luh0;-><init>(I)V

    .line 157
    .line 158
    .line 159
    new-instance v1, Lye;

    .line 160
    .line 161
    const/16 v2, 0x17

    .line 162
    .line 163
    invoke-direct {v1, v2, v0}, Lye;-><init>(ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    new-instance v0, Lye;

    .line 167
    .line 168
    const/16 v2, 0x19

    .line 169
    .line 170
    invoke-direct {v0, v2, v1}, Lye;-><init>(ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    new-instance v1, Lye;

    .line 174
    .line 175
    const/16 v2, 0x18

    .line 176
    .line 177
    invoke-direct {v1, v2, v0}, Lye;-><init>(ILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-static {p0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    new-instance v0, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    :cond_a
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_b

    .line 198
    .line 199
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    move-object v2, v1

    .line 204
    check-cast v2, Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v2}, Lpu0;->Η(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-nez v2, :cond_a

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-nez p0, :cond_c

    .line 221
    .line 222
    invoke-static {v0}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    check-cast p0, Ljava/lang/String;

    .line 227
    .line 228
    return-object p0

    .line 229
    :cond_c
    :goto_5
    const/4 p0, 0x0

    .line 230
    return-object p0
.end method

.method public static Τ(Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "/logo/"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v2, 0x1f4

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v0, v1

    .line 27
    :goto_0
    const-string v3, "mps/logo"

    .line 28
    .line 29
    invoke-static {p0, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    add-int/lit16 v0, v0, 0x1f4

    .line 36
    .line 37
    :cond_1
    const-string v3, "logo_type="

    .line 38
    .line 39
    invoke-static {p0, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    add-int/lit16 v0, v0, 0x1f4

    .line 46
    .line 47
    :cond_2
    const-string v3, "aweme_search_suffix"

    .line 48
    .line 49
    invoke-static {p0, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    add-int/lit16 v0, v0, 0x12c

    .line 56
    .line 57
    :cond_3
    const-string v3, "watermark"

    .line 58
    .line 59
    invoke-static {p0, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    add-int/lit16 v0, v0, 0x1f4

    .line 66
    .line 67
    :cond_4
    const-string v3, "water_mark"

    .line 68
    .line 69
    invoke-static {p0, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_5

    .line 74
    .line 75
    add-int/lit16 v0, v0, 0x1f4

    .line 76
    .line 77
    :cond_5
    const-string v3, "playwm"

    .line 78
    .line 79
    invoke-static {p0, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_6

    .line 84
    .line 85
    add-int/lit16 v0, v0, 0x1f4

    .line 86
    .line 87
    :cond_6
    const-string v3, "wm_"

    .line 88
    .line 89
    invoke-static {p0, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_7

    .line 94
    .line 95
    add-int/lit16 v0, v0, 0xc8

    .line 96
    .line 97
    :cond_7
    const-string v3, "/wm/"

    .line 98
    .line 99
    invoke-static {p0, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_8

    .line 104
    .line 105
    add-int/lit16 v0, v0, 0x12c

    .line 106
    .line 107
    :cond_8
    const-string v3, "has_watermark=1"

    .line 108
    .line 109
    invoke-static {p0, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_9

    .line 114
    .line 115
    add-int/lit16 v0, v0, 0x1f4

    .line 116
    .line 117
    :cond_9
    const-string v3, "is_watermarked=1"

    .line 118
    .line 119
    invoke-static {p0, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_a

    .line 124
    .line 125
    add-int/2addr v0, v2

    .line 126
    :cond_a
    return v0
.end method

.method public static Υ(Ljava/io/OutputStream;[B)V
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, 0x2

    .line 3
    .line 4
    const v1, 0xffff

    .line 5
    .line 6
    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0xff

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 12
    .line 13
    .line 14
    const/16 v2, 0xe1

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V

    .line 17
    .line 18
    .line 19
    shr-int/lit8 v2, v0, 0x8

    .line 20
    .line 21
    and-int/2addr v2, v1

    .line 22
    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V

    .line 23
    .line 24
    .line 25
    and-int/2addr v0, v1

    .line 26
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance p0, Ljava/lang/Exception;

    .line 34
    .line 35
    const-string p1, "APP1 \u5143\u6570\u636e\u8fc7\u5927\uff0c\u65e0\u6cd5\u5199\u5165 JPEG"

    .line 36
    .line 37
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p0
.end method

.method public static Φ(Ljava/io/File;Ljava/io/File;Ljava/io/OutputStream;Lnu0;)V
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v1, v1, Lnu0;->α:Lou0;

    .line 6
    .line 7
    invoke-static/range {p1 .. p1}, Lpu0;->ψ(Ljava/io/File;)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v7

    .line 19
    cmp-long v2, v7, v3

    .line 20
    .line 21
    if-lez v2, :cond_0

    .line 22
    .line 23
    const-wide/16 v9, 0x2

    .line 24
    .line 25
    div-long/2addr v7, v9

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-wide/16 v7, -0x1

    .line 28
    .line 29
    :goto_0
    invoke-static/range {p0 .. p0}, Ls30;->й(Ljava/io/File;)[B

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    array-length v9, v2

    .line 34
    const/4 v10, 0x2

    .line 35
    if-lt v9, v10, :cond_c

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    aget-byte v11, v2, v9

    .line 39
    .line 40
    const/4 v12, -0x1

    .line 41
    if-ne v11, v12, :cond_c

    .line 42
    .line 43
    const/4 v11, 0x1

    .line 44
    aget-byte v12, v2, v11

    .line 45
    .line 46
    const/16 v13, -0x28

    .line 47
    .line 48
    if-ne v12, v13, :cond_c

    .line 49
    .line 50
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    .line 51
    .line 52
    .line 53
    move-result-wide v12

    .line 54
    cmp-long v14, v12, v3

    .line 55
    .line 56
    if-lez v14, :cond_b

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result v14

    .line 62
    if-eqz v14, :cond_3

    .line 63
    .line 64
    const-string v15, "Exif\u0000\u0000"

    .line 65
    .line 66
    move-wide/from16 v16, v3

    .line 67
    .line 68
    const/4 v4, 0x4

    .line 69
    const/16 v3, 0x8

    .line 70
    .line 71
    if-eq v14, v11, :cond_2

    .line 72
    .line 73
    if-ne v14, v10, :cond_1

    .line 74
    .line 75
    const-string v14, "{\"oplustag\":8388608}"

    .line 76
    .line 77
    sget-object v6, Lmf;->α:Ljava/nio/charset/Charset;

    .line 78
    .line 79
    invoke-virtual {v14, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v14, Ljava/io/ByteArrayOutputStream;

    .line 87
    .line 88
    invoke-direct {v14}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 89
    .line 90
    .line 91
    :try_start_0
    const-string v10, "ASCII\u0000\u0000\u0000"

    .line 92
    .line 93
    sget-object v5, Lmf;->β:Ljava/nio/charset/Charset;

    .line 94
    .line 95
    invoke-virtual {v10, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v14, v10}, Ljava/io/OutputStream;->write([B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v14, v6}, Ljava/io/OutputStream;->write([B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v14, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v14}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 112
    .line 113
    .line 114
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 115
    invoke-virtual {v14}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 116
    .line 117
    .line 118
    new-instance v14, Ljava/io/ByteArrayOutputStream;

    .line 119
    .line 120
    invoke-direct {v14}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 121
    .line 122
    .line 123
    new-array v9, v4, [B

    .line 124
    .line 125
    fill-array-data v9, :array_0

    .line 126
    .line 127
    .line 128
    invoke-virtual {v14, v9}, Ljava/io/OutputStream;->write([B)V

    .line 129
    .line 130
    .line 131
    invoke-static {v14, v3}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 132
    .line 133
    .line 134
    array-length v3, v6

    .line 135
    add-int/lit8 v9, v3, 0x1

    .line 136
    .line 137
    add-int/lit8 v3, v3, 0x39

    .line 138
    .line 139
    array-length v4, v10

    .line 140
    invoke-static {v14, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 141
    .line 142
    .line 143
    const v11, 0x8769

    .line 144
    .line 145
    .line 146
    invoke-static {v14, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 147
    .line 148
    .line 149
    const/4 v11, 0x4

    .line 150
    invoke-static {v14, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 151
    .line 152
    .line 153
    const/4 v11, 0x1

    .line 154
    invoke-static {v14, v11}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 155
    .line 156
    .line 157
    const/16 v11, 0x1a

    .line 158
    .line 159
    invoke-static {v14, v11}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 160
    .line 161
    .line 162
    const/4 v11, 0x0

    .line 163
    invoke-static {v14, v11}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 164
    .line 165
    .line 166
    const/4 v11, 0x2

    .line 167
    invoke-static {v14, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 168
    .line 169
    .line 170
    const v11, 0x927c

    .line 171
    .line 172
    .line 173
    invoke-static {v14, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 174
    .line 175
    .line 176
    const/4 v11, 0x7

    .line 177
    invoke-static {v14, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 178
    .line 179
    .line 180
    invoke-static {v14, v9}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 181
    .line 182
    .line 183
    const/16 v9, 0x38

    .line 184
    .line 185
    invoke-static {v14, v9}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 186
    .line 187
    .line 188
    const v9, 0x9286

    .line 189
    .line 190
    .line 191
    invoke-static {v14, v9}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 192
    .line 193
    .line 194
    invoke-static {v14, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 195
    .line 196
    .line 197
    invoke-static {v14, v4}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 198
    .line 199
    .line 200
    invoke-static {v14, v3}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 201
    .line 202
    .line 203
    const/4 v11, 0x0

    .line 204
    invoke-static {v14, v11}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v14, v6}, Ljava/io/OutputStream;->write([B)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v14, v11}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v14, v10}, Ljava/io/OutputStream;->write([B)V

    .line 214
    .line 215
    .line 216
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 217
    .line 218
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 219
    .line 220
    .line 221
    :try_start_1
    invoke-virtual {v15, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3, v4}, Ljava/io/OutputStream;->write([B)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v14}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v3, v4}, Ljava/io/OutputStream;->write([B)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 239
    .line 240
    .line 241
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 242
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    goto/16 :goto_1

    .line 249
    .line 250
    :catchall_0
    move-exception v0

    .line 251
    move-object v1, v0

    .line 252
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 253
    :catchall_1
    move-exception v0

    .line 254
    invoke-static {v3, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :catchall_2
    move-exception v0

    .line 259
    move-object v1, v0

    .line 260
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 261
    :catchall_3
    move-exception v0

    .line 262
    invoke-static {v14, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    throw v0

    .line 266
    :cond_1
    invoke-static {}, Lγ;->κ()V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_2
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 271
    .line 272
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 273
    .line 274
    .line 275
    const/4 v11, 0x4

    .line 276
    new-array v5, v11, [B

    .line 277
    .line 278
    fill-array-data v5, :array_1

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write([B)V

    .line 282
    .line 283
    .line 284
    invoke-static {v4, v3}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 285
    .line 286
    .line 287
    const-string v3, "FXIAOMI_CUSTOMIZE {\"9a01\":\"1\",\"8897\":\"1\",\"88b0\":\"0\",\"version\":\"32\"}"

    .line 288
    .line 289
    sget-object v5, Lmf;->α:Ljava/nio/charset/Charset;

    .line 290
    .line 291
    invoke-virtual {v3, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    array-length v5, v3

    .line 299
    const/4 v11, 0x1

    .line 300
    add-int/2addr v5, v11

    .line 301
    invoke-static {v4, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 302
    .line 303
    .line 304
    const v6, 0x8769

    .line 305
    .line 306
    .line 307
    invoke-static {v4, v6}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 308
    .line 309
    .line 310
    const/4 v6, 0x4

    .line 311
    invoke-static {v4, v6}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 312
    .line 313
    .line 314
    invoke-static {v4, v11}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 315
    .line 316
    .line 317
    const/16 v6, 0x1a

    .line 318
    .line 319
    invoke-static {v4, v6}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 320
    .line 321
    .line 322
    const/4 v6, 0x0

    .line 323
    invoke-static {v4, v6}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 324
    .line 325
    .line 326
    invoke-static {v4, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 327
    .line 328
    .line 329
    const v11, 0x927c

    .line 330
    .line 331
    .line 332
    invoke-static {v4, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 333
    .line 334
    .line 335
    const/4 v11, 0x7

    .line 336
    invoke-static {v4, v11}, Lpu0;->Χ(Ljava/io/ByteArrayOutputStream;I)V

    .line 337
    .line 338
    .line 339
    invoke-static {v4, v5}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 340
    .line 341
    .line 342
    const/16 v5, 0x2c

    .line 343
    .line 344
    invoke-static {v4, v5}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 345
    .line 346
    .line 347
    invoke-static {v4, v6}, Lpu0;->Ψ(Ljava/io/ByteArrayOutputStream;I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v4, v3}, Ljava/io/OutputStream;->write([B)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v4, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 354
    .line 355
    .line 356
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 357
    .line 358
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 359
    .line 360
    .line 361
    :try_start_4
    sget-object v5, Lmf;->β:Ljava/nio/charset/Charset;

    .line 362
    .line 363
    invoke-virtual {v15, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v3, v5}, Ljava/io/OutputStream;->write([B)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v3, v4}, Ljava/io/OutputStream;->write([B)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 381
    .line 382
    .line 383
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 384
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    goto :goto_1

    .line 391
    :catchall_4
    move-exception v0

    .line 392
    move-object v1, v0

    .line 393
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 394
    :catchall_5
    move-exception v0

    .line 395
    invoke-static {v3, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 396
    .line 397
    .line 398
    throw v0

    .line 399
    :cond_3
    move-wide/from16 v16, v3

    .line 400
    .line 401
    const/4 v4, 0x0

    .line 402
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    const-string v3, "\"\n                      Item:Padding=\"0\"/>\n                  </rdf:li>\n                </rdf:Seq>\n              </Container:Directory>\n            </rdf:Description>\n          </rdf:RDF>\n        </x:xmpmeta>\n        <?xpacket end=\"w\"?>\n    "

    .line 407
    .line 408
    if-eqz v1, :cond_8

    .line 409
    .line 410
    const/4 v11, 0x1

    .line 411
    if-eq v1, v11, :cond_6

    .line 412
    .line 413
    const/4 v11, 0x2

    .line 414
    if-ne v1, v11, :cond_5

    .line 415
    .line 416
    cmp-long v1, v7, v16

    .line 417
    .line 418
    if-ltz v1, :cond_4

    .line 419
    .line 420
    move-wide v5, v7

    .line 421
    goto :goto_2

    .line 422
    :cond_4
    const-wide/16 v5, -0x1

    .line 423
    .line 424
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    const-string v7, "\n        <?xpacket begin=\"\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n        <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"DYHelper\">\n          <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n            <rdf:Description rdf:about=\"\"\n              xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\"\n              xmlns:Container=\"http://ns.google.com/photos/1.0/container/\"\n              xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\"\n              xmlns:OpCamera=\"http://ns.oplus.com/photos/1.0/camera/\"\n              GCamera:MotionPhoto=\"1\"\n              GCamera:MotionPhotoVersion=\"1\"\n              GCamera:MotionPhotoPresentationTimestampUs=\""

    .line 427
    .line 428
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    const-string v7, "\"\n              GCamera:MicroVideo=\"1\"\n              GCamera:MicroVideoVersion=\"1\"\n              GCamera:MicroVideoOffset=\""

    .line 435
    .line 436
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    const-string v7, "\"\n              GCamera:MicroVideoPresentationTimestampUs=\""

    .line 443
    .line 444
    const-string v8, "\"\n              OpCamera:MotionPhotoOwner=\"oplus\"\n              OpCamera:MotionPhoto=\"1\"\n              OpCamera:MotionPhotoVersion=\"1\"\n              OpCamera:OLivePhotoVersion=\"2\"\n              OpCamera:VideoLength=\""

    .line 445
    .line 446
    invoke-static {v1, v7, v5, v6, v8}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    const-string v7, "\"\n              OpCamera:VideoOffset=\""

    .line 453
    .line 454
    const-string v8, "\"\n              OpCamera:MotionPhotoPrimaryPresentationTimestampUs=\""

    .line 455
    .line 456
    invoke-static {v1, v7, v12, v13, v8}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    const-string v5, "\">\n\n              <Container:Directory>\n                <rdf:Seq>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"image/jpeg\"\n                      Item:Semantic=\"Primary\"\n                      Item:Length=\"0\"\n                      Item:Padding=\"0\"/>\n                  </rdf:li>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"video/mp4\"\n                      Item:Semantic=\"MotionPhoto\"\n                      Item:Length=\""

    .line 463
    .line 464
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-static {v1}, Lr02;->Ε(Ljava/lang/String;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    goto :goto_5

    .line 482
    :cond_5
    invoke-static {}, Lγ;->κ()V

    .line 483
    .line 484
    .line 485
    return-void

    .line 486
    :cond_6
    cmp-long v1, v7, v16

    .line 487
    .line 488
    if-ltz v1, :cond_7

    .line 489
    .line 490
    move-wide v5, v7

    .line 491
    goto :goto_3

    .line 492
    :cond_7
    const-wide/16 v5, -0x1

    .line 493
    .line 494
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 495
    .line 496
    const-string v7, "\n        <?xpacket begin=\"\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n        <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"DYHelper\">\n          <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n            <rdf:Description rdf:about=\"\"\n              xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\"\n              xmlns:Container=\"http://ns.google.com/photos/1.0/container/\"\n              xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\"\n              GCamera:MotionPhoto=\"1\"\n              GCamera:MotionPhotoVersion=\"1\"\n              GCamera:MotionPhotoPresentationTimestampUs=\""

    .line 497
    .line 498
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    const-string v5, "\">\n              <Container:Directory>\n                <rdf:Seq>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"image/jpeg\"\n                      Item:Semantic=\"Primary\"\n                      Item:Length=\"0\"\n                      Item:Padding=\"0\"/>\n                  </rdf:li>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"video/mp4\"\n                      Item:Semantic=\"MotionPhoto\"\n                      Item:Length=\""

    .line 505
    .line 506
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    invoke-static {v1}, Lr02;->Ε(Ljava/lang/String;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    goto :goto_5

    .line 524
    :cond_8
    cmp-long v1, v7, v16

    .line 525
    .line 526
    if-ltz v1, :cond_9

    .line 527
    .line 528
    move-wide v5, v7

    .line 529
    goto :goto_4

    .line 530
    :cond_9
    const-wide/16 v5, -0x1

    .line 531
    .line 532
    :goto_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 533
    .line 534
    const-string v7, "\n        <?xpacket begin=\"\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n        <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"DYHelper\">\n          <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n            <rdf:Description rdf:about=\"\"\n              xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\"\n              xmlns:Container=\"http://ns.google.com/photos/1.0/container/\"\n              xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\"\n              xmlns:MiCamera=\"http://ns.xiaomi.com/photos/1.0/camera/\"\n              xmlns:OpCamera=\"http://ns.oplus.com/photos/1.0/camera/\">\n\n              <GCamera:MotionPhoto>1</GCamera:MotionPhoto>\n              <GCamera:MotionPhotoVersion>1</GCamera:MotionPhotoVersion>\n              <GCamera:MotionPhotoPresentationTimestampUs>"

    .line 535
    .line 536
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    const-string v7, "</GCamera:MotionPhotoPresentationTimestampUs>\n\n              <GCamera:MicroVideo>1</GCamera:MicroVideo>\n              <GCamera:MicroVideoVersion>1</GCamera:MicroVideoVersion>\n              <GCamera:MicroVideoOffset>"

    .line 543
    .line 544
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    const-string v7, "</GCamera:MicroVideoOffset>\n              <GCamera:MicroVideoPresentationTimestampUs>"

    .line 551
    .line 552
    const-string v8, "</GCamera:MicroVideoPresentationTimestampUs>\n\n              <MiCamera:MicroVideo>1</MiCamera:MicroVideo>\n              <MiCamera:MicroVideoVersion>1</MiCamera:MicroVideoVersion>\n              <MiCamera:MicroVideoOffset>"

    .line 553
    .line 554
    invoke-static {v1, v7, v5, v6, v8}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    const-string v7, "</MiCamera:MicroVideoOffset>\n              <MiCamera:MicroVideoPresentationTimestampUs>"

    .line 561
    .line 562
    const-string v8, "</MiCamera:MicroVideoPresentationTimestampUs>\n\n              <OpCamera:MotionPhotoOwner>oplus</OpCamera:MotionPhotoOwner>\n              <OpCamera:OLivePhotoVersion>2</OpCamera:OLivePhotoVersion>\n              <OpCamera:VideoLength>"

    .line 563
    .line 564
    invoke-static {v1, v7, v5, v6, v8}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    const-string v7, "</OpCamera:VideoLength>\n              <OpCamera:MotionPhotoPrimaryPresentationTimestampUs>"

    .line 571
    .line 572
    const-string v8, "</OpCamera:MotionPhotoPrimaryPresentationTimestampUs>\n\n              <Container:Directory>\n                <rdf:Seq>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"image/jpeg\"\n                      Item:Semantic=\"Primary\"\n                      Item:Length=\"0\"\n                      Item:Padding=\"0\"/>\n                  </rdf:li>\n                  <rdf:li rdf:parseType=\"Resource\">\n                    <Container:Item\n                      Item:Mime=\"video/mp4\"\n                      Item:Semantic=\"MotionPhoto\"\n                      Item:Length=\""

    .line 573
    .line 574
    invoke-static {v1, v7, v5, v6, v8}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    invoke-static {v1}, Lr02;->Ε(Ljava/lang/String;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    :goto_5
    sget-object v3, Lmf;->α:Ljava/nio/charset/Charset;

    .line 592
    .line 593
    const-string v5, "http://ns.adobe.com/xap/1.0/\u0000"

    .line 594
    .line 595
    invoke-virtual {v5, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 596
    .line 597
    .line 598
    move-result-object v5

    .line 599
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 610
    .line 611
    array-length v6, v5

    .line 612
    array-length v7, v1

    .line 613
    add-int/2addr v6, v7

    .line 614
    invoke-direct {v3, v6}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 615
    .line 616
    .line 617
    :try_start_6
    invoke-virtual {v3, v5}, Ljava/io/OutputStream;->write([B)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write([B)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 624
    .line 625
    .line 626
    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    .line 627
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    const/4 v3, 0x2

    .line 634
    const/4 v11, 0x0

    .line 635
    invoke-virtual {v0, v2, v11, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 636
    .line 637
    .line 638
    if-eqz v4, :cond_a

    .line 639
    .line 640
    invoke-static {v0, v4}, Lpu0;->Υ(Ljava/io/OutputStream;[B)V

    .line 641
    .line 642
    .line 643
    :cond_a
    invoke-static {v0, v1}, Lpu0;->Υ(Ljava/io/OutputStream;[B)V

    .line 644
    .line 645
    .line 646
    array-length v1, v2

    .line 647
    sub-int/2addr v1, v3

    .line 648
    invoke-virtual {v0, v2, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 649
    .line 650
    .line 651
    new-instance v1, Ljava/io/FileInputStream;

    .line 652
    .line 653
    move-object/from16 v2, p1

    .line 654
    .line 655
    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 656
    .line 657
    .line 658
    const/16 v2, 0x2000

    .line 659
    .line 660
    :try_start_7
    invoke-static {v1, v0, v2}, Lh62;->Δ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 661
    .line 662
    .line 663
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 667
    .line 668
    .line 669
    return-void

    .line 670
    :catchall_6
    move-exception v0

    .line 671
    move-object v2, v0

    .line 672
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 673
    :catchall_7
    move-exception v0

    .line 674
    invoke-static {v1, v2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 675
    .line 676
    .line 677
    throw v0

    .line 678
    :catchall_8
    move-exception v0

    .line 679
    move-object v1, v0

    .line 680
    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 681
    :catchall_9
    move-exception v0

    .line 682
    invoke-static {v3, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 683
    .line 684
    .line 685
    throw v0

    .line 686
    :cond_b
    new-instance v0, Ljava/lang/Exception;

    .line 687
    .line 688
    const-string v1, "\u89c6\u9891\u5185\u5bb9\u4e3a\u7a7a\uff0c\u65e0\u6cd5\u751f\u6210 Motion Photo"

    .line 689
    .line 690
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    throw v0

    .line 694
    :cond_c
    new-instance v0, Ljava/lang/Exception;

    .line 695
    .line 696
    const-string v1, "\u4e3b\u56fe\u4e0d\u662f\u6709\u6548 JPEG"

    .line 697
    .line 698
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    throw v0

    .line 702
    nop

    .line 703
    :array_0
    .array-data 1
        0x4dt
        0x4dt
        0x0t
        0x2at
    .end array-data

    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    :array_1
    .array-data 1
        0x4dt
        0x4dt
        0x0t
        0x2at
    .end array-data
.end method

.method public static Χ(Ljava/io/ByteArrayOutputStream;I)V
    .locals 1

    .line 1
    shr-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    and-int/lit16 p1, p1, 0xff

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static Ψ(Ljava/io/ByteArrayOutputStream;I)V
    .locals 1

    .line 1
    shr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    shr-int/lit8 v0, p1, 0x10

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 13
    .line 14
    .line 15
    shr-int/lit8 v0, p1, 0x8

    .line 16
    .line 17
    and-int/lit16 v0, v0, 0xff

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 20
    .line 21
    .line 22
    and-int/lit16 p1, p1, 0xff

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static final α(Ljava/lang/String;)I
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, "1920"

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x12c

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    const-string v2, "1440"

    .line 24
    .line 25
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    add-int/lit16 v0, v0, 0x12c

    .line 32
    .line 33
    :cond_1
    const-string v2, "1080"

    .line 34
    .line 35
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    add-int/lit16 v0, v0, 0xc8

    .line 42
    .line 43
    :cond_2
    const-string v2, "origin"

    .line 44
    .line 45
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x64

    .line 52
    .line 53
    :cond_3
    const-string v2, ".webp"

    .line 54
    .line 55
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x32

    .line 62
    .line 63
    :cond_4
    const-string v2, ".jpeg"

    .line 64
    .line 65
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x28

    .line 72
    .line 73
    :cond_5
    const-string v2, ".jpg"

    .line 74
    .line 75
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_6

    .line 80
    .line 81
    add-int/lit8 v0, v0, 0x28

    .line 82
    .line 83
    :cond_6
    const-string v2, ".png"

    .line 84
    .line 85
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_7

    .line 90
    .line 91
    add-int/lit8 v0, v0, 0x28

    .line 92
    .line 93
    :cond_7
    return v0
.end method

.method public static final β(Ljava/lang/String;)I
    .locals 7

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lpu0;->Δ(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/16 v2, -0x1388

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, v3

    .line 21
    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-string v5, "h264"

    .line 29
    .line 30
    invoke-static {v4, v5, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const-string v6, "video_mp4"

    .line 35
    .line 36
    if-nez v5, :cond_1

    .line 37
    .line 38
    const-string v5, "avc1"

    .line 39
    .line 40
    invoke-static {v4, v5, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    const-string v5, "avc"

    .line 47
    .line 48
    invoke-static {v4, v5, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    const-string v5, "play_addr_h264"

    .line 55
    .line 56
    invoke-static {v4, v5, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_1

    .line 61
    .line 62
    invoke-static {v4, v6, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    :cond_1
    add-int/lit16 v2, v2, 0x4b0

    .line 69
    .line 70
    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    const-string v4, ".mp4"

    .line 78
    .line 79
    invoke-static {v0, v4, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    const-string v5, "main.mp4"

    .line 84
    .line 85
    if-nez v4, :cond_3

    .line 86
    .line 87
    const-string v4, "format=mp4"

    .line 88
    .line 89
    invoke-static {v0, v4, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-nez v4, :cond_3

    .line 94
    .line 95
    const-string v4, "mime=video/mp4"

    .line 96
    .line 97
    invoke-static {v0, v4, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-nez v4, :cond_3

    .line 102
    .line 103
    const-string v4, "mime_type=video"

    .line 104
    .line 105
    invoke-static {v0, v4, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-nez v4, :cond_3

    .line 110
    .line 111
    invoke-static {v0, v6, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-nez v4, :cond_3

    .line 116
    .line 117
    invoke-static {v0, v5, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    :cond_3
    add-int/lit16 v2, v2, 0x258

    .line 124
    .line 125
    :cond_4
    invoke-static {p0}, Lpu0;->Γ(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-eqz p0, :cond_5

    .line 130
    .line 131
    add-int/lit16 v2, v2, -0x1f4

    .line 132
    .line 133
    :cond_5
    const-string p0, "1080"

    .line 134
    .line 135
    invoke-static {v1, p0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_6

    .line 140
    .line 141
    add-int/lit16 v2, v2, 0x12c

    .line 142
    .line 143
    :cond_6
    const-string p0, "720"

    .line 144
    .line 145
    invoke-static {v1, p0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-eqz p0, :cond_7

    .line 150
    .line 151
    add-int/lit16 v2, v2, 0xc8

    .line 152
    .line 153
    :cond_7
    const-string p0, "540"

    .line 154
    .line 155
    invoke-static {v1, p0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    if-eqz p0, :cond_8

    .line 160
    .line 161
    add-int/lit8 v2, v2, 0x64

    .line 162
    .line 163
    :cond_8
    invoke-static {v1, v5, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_9

    .line 168
    .line 169
    add-int/lit8 v2, v2, 0x50

    .line 170
    .line 171
    :cond_9
    const-string p0, "definition=1080p"

    .line 172
    .line 173
    invoke-static {v1, p0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    if-eqz p0, :cond_a

    .line 178
    .line 179
    add-int/lit16 v2, v2, 0x12c

    .line 180
    .line 181
    :cond_a
    const-string p0, "definition=720p"

    .line 182
    .line 183
    invoke-static {v1, p0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-eqz p0, :cond_b

    .line 188
    .line 189
    add-int/lit16 v2, v2, 0xc8

    .line 190
    .line 191
    :cond_b
    const-string p0, "download_addr"

    .line 192
    .line 193
    invoke-static {v1, p0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-eqz p0, :cond_c

    .line 198
    .line 199
    add-int/lit8 v2, v2, -0x78

    .line 200
    .line 201
    :cond_c
    const-string p0, "new_download_addr"

    .line 202
    .line 203
    invoke-static {v1, p0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-eqz p0, :cond_d

    .line 208
    .line 209
    add-int/lit8 v2, v2, -0x78

    .line 210
    .line 211
    :cond_d
    const-string p0, "/download/"

    .line 212
    .line 213
    invoke-static {v1, p0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    if-eqz p0, :cond_e

    .line 218
    .line 219
    add-int/lit8 v2, v2, -0x78

    .line 220
    .line 221
    :cond_e
    const-string p0, "download"

    .line 222
    .line 223
    invoke-static {v1, p0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    if-eqz p0, :cond_f

    .line 228
    .line 229
    const-string p0, "play"

    .line 230
    .line 231
    invoke-static {v1, p0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    if-nez p0, :cond_f

    .line 236
    .line 237
    add-int/lit8 v2, v2, -0x50

    .line 238
    .line 239
    :cond_f
    return v2
.end method

.method public static γ(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0, v0}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object v0
.end method

.method public static δ(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Long;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    long-to-int p0, v0

    .line 19
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    instance-of v0, p0, Ljava/lang/Short;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    check-cast p0, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    instance-of v0, p0, Ljava/lang/Byte;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    check-cast p0, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    instance-of v0, p0, Ljava/lang/Number;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    check-cast p0, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_4
    instance-of v0, p0, Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    check-cast p0, Ljava/lang/String;

    .line 74
    .line 75
    const/16 v0, 0xa

    .line 76
    .line 77
    invoke-static {p0, v0}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_5
    const/4 p0, 0x0

    .line 83
    return-object p0
.end method

.method public static ε(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "[\\\\/:*?\"<>|\\s]+"

    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v1, "_"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    new-array v1, v0, [C

    .line 28
    .line 29
    const/16 v2, 0x5f

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    aput-char v2, v1, v3

    .line 33
    .line 34
    invoke-static {p0, v1}, Lq02;->В(Ljava/lang/String;[C)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/16 v1, 0x5c

    .line 39
    .line 40
    invoke-static {p0, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    const-string p0, "livephoto_"

    .line 55
    .line 56
    invoke-static {v1, v2, p0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :cond_0
    const-string v1, "MP"

    .line 61
    .line 62
    invoke-static {p0, v1, v0}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const-string v0, "_MP"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    :goto_0
    const-string v0, ".jpg"

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.method public static varargs ζ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_4

    .line 5
    :cond_0
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_5

    .line 8
    .line 9
    aget-object v3, p1, v2

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    :goto_1
    if-eqz v4, :cond_4

    .line 16
    .line 17
    const-class v5, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-nez v5, :cond_4

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {v4, v3, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_2

    .line 30
    :catchall_0
    move-exception v5

    .line 31
    new-instance v6, Leo1;

    .line 32
    .line 33
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v5, v6

    .line 37
    :goto_2
    instance-of v6, v5, Leo1;

    .line 38
    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    move-object v5, v0

    .line 42
    :cond_1
    check-cast v5, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    :try_start_1
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    goto :goto_3

    .line 55
    :catchall_1
    move-exception v5

    .line 56
    new-instance v6, Leo1;

    .line 57
    .line 58
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object v5, v6

    .line 62
    :goto_3
    instance-of v6, v5, Leo1;

    .line 63
    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    move-object v5, v0

    .line 67
    :cond_2
    if-eqz v5, :cond_3

    .line 68
    .line 69
    return-object v5

    .line 70
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    :goto_4
    return-object v0
.end method

.method public static η(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/HashSet;)V
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x50

    .line 10
    .line 11
    if-lt v0, v1, :cond_1

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_1
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lpu0;->Ε(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_10

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    instance-of v0, p0, Ljava/lang/Iterable;

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    check-cast p0, Ljava/lang/Iterable;

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_10

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0, p1, p2, p3}, Lpu0;->η(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/HashSet;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-lt v0, v1, :cond_3

    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :cond_4
    instance-of v0, p0, Ljava/util/Map;

    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    check-cast p0, Ljava/util/Map;

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_10

    .line 83
    .line 84
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v0, p1, p2, p3}, Lpu0;->η(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/HashSet;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-lt v0, v1, :cond_5

    .line 96
    .line 97
    goto/16 :goto_2

    .line 98
    .line 99
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const/4 v2, 0x0

    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    :goto_0
    if-ge v2, v0, :cond_10

    .line 115
    .line 116
    invoke-static {p0, v2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v3, p1, p2, p3}, Lpu0;->η(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/HashSet;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-lt v3, v1, :cond_7

    .line 128
    .line 129
    goto/16 :goto_2

    .line 130
    .line 131
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_8
    if-gtz p2, :cond_9

    .line 135
    .line 136
    goto/16 :goto_2

    .line 137
    .line 138
    :cond_9
    instance-of v0, p0, Ljava/lang/Number;

    .line 139
    .line 140
    if-nez v0, :cond_10

    .line 141
    .line 142
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 143
    .line 144
    if-nez v0, :cond_10

    .line 145
    .line 146
    instance-of v0, p0, Ljava/lang/Enum;

    .line 147
    .line 148
    if-nez v0, :cond_10

    .line 149
    .line 150
    instance-of v0, p0, Ljava/lang/Class;

    .line 151
    .line 152
    if-eqz v0, :cond_a

    .line 153
    .line 154
    return-void

    .line 155
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const-string v3, "java."

    .line 164
    .line 165
    invoke-static {v0, v3, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-nez v3, :cond_10

    .line 170
    .line 171
    const-string v3, "android."

    .line 172
    .line 173
    invoke-static {v0, v3, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-nez v3, :cond_10

    .line 178
    .line 179
    const-string v3, "kotlin."

    .line 180
    .line 181
    invoke-static {v0, v3, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_b

    .line 186
    .line 187
    goto/16 :goto_2

    .line 188
    .line 189
    :cond_b
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {p3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_c

    .line 202
    .line 203
    goto/16 :goto_2

    .line 204
    .line 205
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v0}, Lpu0;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_10

    .line 222
    .line 223
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    check-cast v3, Ljava/lang/reflect/Field;

    .line 228
    .line 229
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-nez v4, :cond_d

    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 247
    .line 248
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    const-string v5, "url"

    .line 256
    .line 257
    invoke-static {v4, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-nez v5, :cond_e

    .line 262
    .line 263
    const-string v5, "uri"

    .line 264
    .line 265
    invoke-static {v4, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    if-nez v5, :cond_e

    .line 270
    .line 271
    const-string v5, "addr"

    .line 272
    .line 273
    invoke-static {v4, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-nez v5, :cond_e

    .line 278
    .line 279
    const-string v5, "play"

    .line 280
    .line 281
    invoke-static {v4, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-nez v5, :cond_e

    .line 286
    .line 287
    const-string v5, "download"

    .line 288
    .line 289
    invoke-static {v4, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-nez v5, :cond_e

    .line 294
    .line 295
    const-string v5, "cover"

    .line 296
    .line 297
    invoke-static {v4, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-nez v5, :cond_e

    .line 302
    .line 303
    const-string v5, "video"

    .line 304
    .line 305
    invoke-static {v4, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    if-nez v5, :cond_e

    .line 310
    .line 311
    const-string v5, "image"

    .line 312
    .line 313
    invoke-static {v4, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-nez v5, :cond_e

    .line 318
    .line 319
    const-string v5, "photo"

    .line 320
    .line 321
    invoke-static {v4, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-eqz v4, :cond_d

    .line 326
    .line 327
    :cond_e
    const/4 v4, 0x1

    .line 328
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 335
    goto :goto_1

    .line 336
    :catchall_0
    move-exception v3

    .line 337
    new-instance v5, Leo1;

    .line 338
    .line 339
    invoke-direct {v5, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 340
    .line 341
    .line 342
    move-object v3, v5

    .line 343
    :goto_1
    instance-of v5, v3, Leo1;

    .line 344
    .line 345
    if-eqz v5, :cond_f

    .line 346
    .line 347
    const/4 v3, 0x0

    .line 348
    :cond_f
    add-int/lit8 v4, p2, -0x1

    .line 349
    .line 350
    invoke-static {v3, p1, v4, p3}, Lpu0;->η(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/HashSet;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    if-lt v3, v1, :cond_d

    .line 358
    .line 359
    :cond_10
    :goto_2
    return-void
.end method

.method public static θ(Ljava/lang/Object;)Ljava/util/List;
    .locals 10

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljz;->ε:Ljz;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string v0, "urlList"

    .line 7
    .line 8
    const-string v1, "_urlList"

    .line 9
    .line 10
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v0, "downloadUrlList"

    .line 19
    .line 20
    const-string v2, "_downloadUrlList"

    .line 21
    .line 22
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v0, "originUrlList"

    .line 31
    .line 32
    const-string v3, "_originUrlList"

    .line 33
    .line 34
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const-string v0, "displayImage"

    .line 43
    .line 44
    const-string v4, "_displayImage"

    .line 45
    .line 46
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v0, "thumbnail"

    .line 55
    .line 56
    const-string v5, "_thumbnail"

    .line 57
    .line 58
    filled-new-array {v0, v5}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const-string v0, "cover"

    .line 67
    .line 68
    const-string v6, "_cover"

    .line 69
    .line 70
    filled-new-array {v0, v6}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const-string v0, "originCover"

    .line 79
    .line 80
    const-string v7, "_originCover"

    .line 81
    .line 82
    filled-new-array {v0, v7}, [Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    const-string v0, "uri"

    .line 91
    .line 92
    const-string v8, "_uri"

    .line 93
    .line 94
    filled-new-array {v0, v8}, [Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    move-object v9, p0

    .line 103
    filled-new-array/range {v1 .. v9}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lpu0;->ι([Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_2

    .line 125
    .line 126
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    move-object v2, v1

    .line 131
    check-cast v2, Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v2}, Lpu0;->Μ(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-nez v2, :cond_1

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_2
    return-object v0
.end method

.method public static varargs ι([Ljava/lang/Object;)Ljava/util/List;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_3

    .line 9
    .line 10
    aget-object v3, p0, v2

    .line 11
    .line 12
    if-eqz v3, :cond_2

    .line 13
    .line 14
    new-instance v4, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v5, Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v6, 0x6

    .line 25
    invoke-static {v3, v4, v6, v5}, Lpu0;->η(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/HashSet;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v4}, Lpu0;->Ε(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const/16 v5, 0x50

    .line 58
    .line 59
    if-lt v4, v5, :cond_0

    .line 60
    .line 61
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public static κ(Ljava/lang/Object;)Ljava/util/List;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljz;->ε:Ljz;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v1, "_h264PlayAddr"

    .line 9
    .line 10
    const-string v2, "_playAddrH264"

    .line 11
    .line 12
    const-string v3, "playAddrH264"

    .line 13
    .line 14
    const-string v4, "h264PlayAddr"

    .line 15
    .line 16
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v1, "playAddr"

    .line 25
    .line 26
    const-string v3, "_playAddr"

    .line 27
    .line 28
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v1, "playAddrLowbr"

    .line 37
    .line 38
    const-string v4, "_playAddrLowbr"

    .line 39
    .line 40
    filled-new-array {v1, v4}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v1, "downloadAddr"

    .line 49
    .line 50
    const-string v5, "_downloadAddr"

    .line 51
    .line 52
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const-string v1, "newDownloadAddr"

    .line 61
    .line 62
    const-string v6, "_newDownloadAddr"

    .line 63
    .line 64
    filled-new-array {v1, v6}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const-string v1, "bitRate"

    .line 73
    .line 74
    filled-new-array {v1}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    const-string v1, "bitRateList"

    .line 83
    .line 84
    filled-new-array {v1}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    const-string v1, "playAddrH265"

    .line 93
    .line 94
    const-string v9, "_playAddrH265"

    .line 95
    .line 96
    filled-new-array {v1, v9}, [Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    const-string v1, "playAddrBytevc1"

    .line 105
    .line 106
    const-string v10, "_playAddrBytevc1"

    .line 107
    .line 108
    filled-new-array {v1, v10}, [Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    const-string v1, "urlList"

    .line 117
    .line 118
    const-string v11, "_urlList"

    .line 119
    .line 120
    filled-new-array {v1, v11}, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    const-string v1, "downUrlList"

    .line 129
    .line 130
    const-string v12, "_downUrlList"

    .line 131
    .line 132
    filled-new-array {v1, v12}, [Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    const-string v1, "downloadUrlList"

    .line 141
    .line 142
    const-string v13, "_downloadUrlList"

    .line 143
    .line 144
    filled-new-array {v1, v13}, [Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    const-string v1, "liveVideo"

    .line 153
    .line 154
    const-string v14, "_liveVideo"

    .line 155
    .line 156
    filled-new-array {v1, v14}, [Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v14

    .line 164
    const-string v1, "dashVideoInfo"

    .line 165
    .line 166
    const-string v15, "_dashVideoInfo"

    .line 167
    .line 168
    filled-new-array {v1, v15}, [Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-static {v0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v15

    .line 176
    const-string v1, "getDownUrlList"

    .line 177
    .line 178
    move-object/from16 v16, v2

    .line 179
    .line 180
    const-string v2, "getDownloadUrlList"

    .line 181
    .line 182
    move-object/from16 v17, v3

    .line 183
    .line 184
    const-string v3, "getUrlList"

    .line 185
    .line 186
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-static {v0, v1}, Lpu0;->ζ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    const-string v2, "getLiveVideo"

    .line 195
    .line 196
    filled-new-array {v2}, [Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v0, v2}, Lpu0;->ζ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const-string v3, "getDashVideoInfo"

    .line 205
    .line 206
    filled-new-array {v3}, [Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-static {v0, v3}, Lpu0;->ζ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v18

    .line 214
    move-object/from16 v3, v17

    .line 215
    .line 216
    move-object/from16 v17, v2

    .line 217
    .line 218
    move-object/from16 v2, v16

    .line 219
    .line 220
    move-object/from16 v16, v1

    .line 221
    .line 222
    filled-new-array/range {v2 .. v18}, [Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-static {v1}, Lyh;->г([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    const/4 v0, 0x0

    .line 234
    new-array v2, v0, [Ljava/lang/Object;

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    array-length v2, v1

    .line 241
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {v1}, Lpu0;->ι([Ljava/lang/Object;)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    new-instance v2, Lf7;

    .line 250
    .line 251
    const/4 v3, 0x1

    .line 252
    invoke-direct {v2, v3, v1}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    new-instance v1, Lgp0;

    .line 256
    .line 257
    const/16 v3, 0x9

    .line 258
    .line 259
    invoke-direct {v1, v3}, Lgp0;-><init>(I)V

    .line 260
    .line 261
    .line 262
    new-instance v3, Ly30;

    .line 263
    .line 264
    const/4 v4, 0x1

    .line 265
    invoke-direct {v3, v2, v4, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 266
    .line 267
    .line 268
    new-instance v1, Lgp0;

    .line 269
    .line 270
    const/16 v2, 0xa

    .line 271
    .line 272
    invoke-direct {v1, v2}, Lgp0;-><init>(I)V

    .line 273
    .line 274
    .line 275
    new-instance v2, Ly30;

    .line 276
    .line 277
    invoke-direct {v2, v3, v4, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 278
    .line 279
    .line 280
    new-instance v1, Lgp0;

    .line 281
    .line 282
    const/16 v3, 0xb

    .line 283
    .line 284
    invoke-direct {v1, v3}, Lgp0;-><init>(I)V

    .line 285
    .line 286
    .line 287
    new-instance v3, Ly30;

    .line 288
    .line 289
    invoke-direct {v3, v2, v0, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 290
    .line 291
    .line 292
    new-instance v1, Lgp0;

    .line 293
    .line 294
    const/16 v2, 0xc

    .line 295
    .line 296
    invoke-direct {v1, v2}, Lgp0;-><init>(I)V

    .line 297
    .line 298
    .line 299
    new-instance v2, Ly30;

    .line 300
    .line 301
    invoke-direct {v2, v3, v0, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 302
    .line 303
    .line 304
    new-instance v1, Lgp0;

    .line 305
    .line 306
    const/16 v3, 0xd

    .line 307
    .line 308
    invoke-direct {v1, v3}, Lgp0;-><init>(I)V

    .line 309
    .line 310
    .line 311
    new-instance v3, Ly30;

    .line 312
    .line 313
    invoke-direct {v3, v2, v0, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v3}, Lus1;->υ(Lss1;)Lcu;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-static {v0}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    return-object v0
.end method

.method public static λ(Landroid/media/MediaExtractor;ILandroid/media/MediaMuxer;IJ)I
    .locals 11

    .line 1
    invoke-virtual/range {p0 .. p1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "max-input-size"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :catchall_0
    :cond_0
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/high16 v0, 0x100000

    .line 33
    .line 34
    :goto_0
    add-int/lit16 v0, v0, 0x4000

    .line 35
    .line 36
    const/high16 v1, 0x40000

    .line 37
    .line 38
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Landroid/media/MediaCodec$BufferInfo;

    .line 47
    .line 48
    invoke-direct {v1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual/range {p0 .. p1}, Landroid/media/MediaExtractor;->selectTrack(I)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    const-wide/16 v7, 0x0

    .line 56
    .line 57
    :try_start_1
    invoke-virtual {p0, v7, v8, v2}, Landroid/media/MediaExtractor;->seekTo(JI)V

    .line 58
    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    move v10, v9

    .line 62
    :goto_1
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->getSampleTrackIndex()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-ltz v2, :cond_5

    .line 67
    .line 68
    if-eq v2, p1, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->advance()Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_1
    move-exception v0

    .line 75
    move-object p2, v0

    .line 76
    goto :goto_4

    .line 77
    :cond_2
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->getSampleTime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    cmp-long v4, v2, v7

    .line 82
    .line 83
    if-ltz v4, :cond_5

    .line 84
    .line 85
    cmp-long v5, p4, v7

    .line 86
    .line 87
    if-lez v5, :cond_3

    .line 88
    .line 89
    const-wide v5, 0x7fffffffffffffffL

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    cmp-long v5, p4, v5

    .line 95
    .line 96
    if-eqz v5, :cond_3

    .line 97
    .line 98
    cmp-long v5, v2, p4

    .line 99
    .line 100
    if-lez v5, :cond_3

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 104
    .line 105
    .line 106
    move-wide v5, v2

    .line 107
    invoke-virtual {p0, v0, v9}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-ltz v3, :cond_5

    .line 112
    .line 113
    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 117
    .line 118
    .line 119
    if-gez v4, :cond_4

    .line 120
    .line 121
    move-wide v4, v7

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    move-wide v4, v5

    .line 124
    :goto_2
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->getSampleFlags()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-virtual/range {v1 .. v6}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, p3, v0, v1}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 133
    .line 134
    .line 135
    add-int/lit8 v10, v10, 0x1

    .line 136
    .line 137
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->advance()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_5
    :goto_3
    :try_start_2
    invoke-virtual/range {p0 .. p1}, Landroid/media/MediaExtractor;->unselectTrack(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 142
    .line 143
    .line 144
    :catchall_2
    return v10

    .line 145
    :goto_4
    :try_start_3
    invoke-virtual/range {p0 .. p1}, Landroid/media/MediaExtractor;->unselectTrack(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 146
    .line 147
    .line 148
    :catchall_3
    throw p2
.end method

.method public static ν(Ljava/lang/Object;)Ljava/util/List;
    .locals 13

    .line 1
    const-string v0, "imagePostInfo"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "image_post_info"

    .line 12
    .line 13
    filled-new-array {v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {p0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    move v2, v1

    .line 27
    :goto_0
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x2

    .line 29
    if-ge v2, v4, :cond_1

    .line 30
    .line 31
    aget-object v4, v0, v2

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v4, v3

    .line 40
    :goto_1
    const-string v0, "imageList"

    .line 41
    .line 42
    const-string v2, "image_list"

    .line 43
    .line 44
    const-string v5, "images"

    .line 45
    .line 46
    filled-new-array {v5, v0, v2}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v4, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    filled-new-array {v5}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    const-string v0, "imageInfos"

    .line 63
    .line 64
    filled-new-array {v0}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const-string v0, "imageUrlStructList"

    .line 73
    .line 74
    filled-new-array {v0}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    const-string v0, "imageUrlStructs"

    .line 83
    .line 84
    filled-new-array {v0}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    const-string v0, "awemeImageInfos"

    .line 93
    .line 94
    filled-new-array {v0}, [Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    const-string v0, "imageUrlStruct"

    .line 103
    .line 104
    filled-new-array {v0}, [Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {p0, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    filled-new-array/range {v6 .. v12}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_7

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    if-nez v2, :cond_3

    .line 135
    .line 136
    sget-object v2, Ljz;->ε:Ljz;

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    new-instance v5, Ljava/util/HashSet;

    .line 145
    .line 146
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 147
    .line 148
    .line 149
    instance-of v6, v2, Ljava/lang/Iterable;

    .line 150
    .line 151
    if-eqz v6, :cond_4

    .line 152
    .line 153
    check-cast v2, Ljava/lang/Iterable;

    .line 154
    .line 155
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-eqz v6, :cond_5

    .line 164
    .line 165
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-static {v5, v4, v6}, Lpu0;->Α(Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_6

    .line 182
    .line 183
    invoke-static {v2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    move v7, v1

    .line 188
    :goto_3
    if-ge v7, v6, :cond_5

    .line 189
    .line 190
    invoke-static {v2, v7}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-static {v5, v4, v8}, Lpu0;->Α(Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    add-int/lit8 v7, v7, 0x1

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_5
    :goto_4
    move-object v2, v4

    .line 201
    goto :goto_5

    .line 202
    :cond_6
    invoke-static {v5, v4, v2}, Lpu0;->Α(Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :goto_5
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-nez v4, :cond_2

    .line 211
    .line 212
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    new-instance v0, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const-string v1, "findAllImageStructs \u4f7f\u7528\u4e3b\u56fe\u6587\u5217\u8868\uff0ccount="

    .line 219
    .line 220
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-static {p0}, Lpu0;->Θ(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return-object v2

    .line 234
    :cond_7
    new-instance v2, Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 237
    .line 238
    .line 239
    new-instance v4, Ljava/util/HashSet;

    .line 240
    .line 241
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-static {v0}, Lpu0;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    :cond_8
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_e

    .line 261
    .line 262
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    check-cast v0, Ljava/lang/reflect/Field;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 276
    .line 277
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    const-string v7, "image"

    .line 285
    .line 286
    invoke-static {v6, v7, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    if-nez v7, :cond_9

    .line 291
    .line 292
    const-string v7, "photo"

    .line 293
    .line 294
    invoke-static {v6, v7, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    if-eqz v6, :cond_8

    .line 299
    .line 300
    :cond_9
    const/4 v6, 0x1

    .line 301
    :try_start_0
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 308
    goto :goto_7

    .line 309
    :catchall_0
    move-exception v0

    .line 310
    new-instance v6, Leo1;

    .line 311
    .line 312
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    move-object v0, v6

    .line 316
    :goto_7
    instance-of v6, v0, Leo1;

    .line 317
    .line 318
    if-eqz v6, :cond_a

    .line 319
    .line 320
    move-object v0, v3

    .line 321
    :cond_a
    if-nez v0, :cond_b

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :cond_b
    instance-of v6, v0, Ljava/lang/Iterable;

    .line 325
    .line 326
    if-eqz v6, :cond_c

    .line 327
    .line 328
    check-cast v0, Ljava/lang/Iterable;

    .line 329
    .line 330
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    if-eqz v6, :cond_8

    .line 339
    .line 340
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    invoke-static {v4, v2, v6}, Lpu0;->ξ(Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    if-eqz v6, :cond_d

    .line 357
    .line 358
    invoke-static {v0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    move v7, v1

    .line 363
    :goto_9
    if-ge v7, v6, :cond_8

    .line 364
    .line 365
    invoke-static {v0, v7}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    invoke-static {v4, v2, v8}, Lpu0;->ξ(Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    add-int/lit8 v7, v7, 0x1

    .line 373
    .line 374
    goto :goto_9

    .line 375
    :cond_d
    invoke-static {v4, v2, v0}, Lpu0;->ξ(Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 380
    .line 381
    .line 382
    move-result p0

    .line 383
    new-instance v0, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    const-string v1, "findAllImageStructs \u4f7f\u7528\u515c\u5e95\u626b\u63cf\uff0ccount="

    .line 386
    .line 387
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    invoke-static {p0}, Lpu0;->Θ(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    return-object v2
.end method

.method public static final ξ(Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p2}, Lpu0;->Λ(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_2
    :goto_0
    return-void
.end method

.method public static ο(Landroid/media/MediaExtractor;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->getTrackCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    :try_start_0
    const-string v3, "mime"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_1

    .line 22
    :catchall_0
    move-exception v2

    .line 23
    new-instance v3, Leo1;

    .line 24
    .line 25
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object v2, v3

    .line 29
    :goto_1
    instance-of v3, v2, Leo1;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    :cond_0
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    const-string v3, "audio/"

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const-string v3, "audio/mp4a-latm"

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    const-string v3, "audio/aac"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    const-string v3, "audio/3gpp"

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v3, :cond_2

    .line 80
    .line 81
    const-string v3, "audio/amr-wb"

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    :cond_2
    return v1

    .line 90
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    const/4 p0, -0x1

    .line 94
    return p0
.end method

.method public static π(Landroid/media/MediaExtractor;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->getTrackCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    :try_start_0
    const-string v3, "mime"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_1

    .line 22
    :catchall_0
    move-exception v2

    .line 23
    new-instance v3, Leo1;

    .line 24
    .line 25
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object v2, v3

    .line 29
    :goto_1
    instance-of v3, v2, Leo1;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    :cond_0
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    const-string v3, "video/"

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    return v1

    .line 49
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 p0, -0x1

    .line 53
    return p0
.end method

.method public static varargs ρ([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_2

    .line 4
    .line 5
    aget-object v2, p0, v1

    .line 6
    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    return-object v2

    .line 17
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public static varargs σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_5

    .line 5
    :cond_0
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_5

    .line 8
    .line 9
    aget-object v3, p1, v2

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    :goto_1
    const/4 v5, 0x1

    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    const-class v6, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-nez v6, :cond_1

    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v4, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-virtual {v6, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :catchall_0
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v6, v0

    .line 40
    :goto_2
    if-nez v6, :cond_2

    .line 41
    .line 42
    goto :goto_4

    .line 43
    :cond_2
    :try_start_1
    invoke-virtual {v6, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    goto :goto_3

    .line 51
    :catchall_1
    move-exception v3

    .line 52
    new-instance v4, Leo1;

    .line 53
    .line 54
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object v3, v4

    .line 58
    :goto_3
    instance-of v4, v3, Leo1;

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    move-object v3, v0

    .line 63
    :cond_3
    if-eqz v3, :cond_4

    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_4
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    :goto_5
    return-object v0
.end method

.method public static τ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const-string v1, "video"

    .line 6
    .line 7
    filled-new-array {v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p0, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "livePhotoVideo"

    .line 16
    .line 17
    filled-new-array {v2}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {p0, v2}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "livePhoto"

    .line 26
    .line 27
    filled-new-array {v3}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {p0, v3}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    filled-new-array {v1, v2, p0}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const/4 v1, 0x0

    .line 40
    :goto_0
    const/4 v2, 0x3

    .line 41
    if-ge v1, v2, :cond_2

    .line 42
    .line 43
    aget-object v2, p0, v1

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v0
.end method

.method public static varargs υ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, [Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p0, p1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of p1, p0, Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    check-cast p0, Ljava/lang/Integer;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    instance-of p1, p0, Ljava/lang/Long;

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    check-cast p0, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    long-to-int p0, p0

    .line 33
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    instance-of p1, p0, Ljava/lang/Short;

    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    check-cast p0, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_3
    instance-of p1, p0, Ljava/lang/Byte;

    .line 54
    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    check-cast p0, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_4
    instance-of p1, p0, Ljava/lang/Number;

    .line 69
    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    check-cast p0, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_5
    instance-of p1, p0, Ljava/lang/String;

    .line 84
    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    check-cast p0, Ljava/lang/String;

    .line 88
    .line 89
    const/16 p1, 0xa

    .line 90
    .line 91
    invoke-static {p0, p1}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_6
    :goto_0
    const/4 p0, 0x0

    .line 97
    return-object p0
.end method

.method public static varargs φ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Long;
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, [Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p0, p1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of p1, p0, Ljava/lang/Long;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    check-cast p0, Ljava/lang/Long;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    instance-of p1, p0, Ljava/lang/Integer;

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    check-cast p0, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    int-to-long p0, p0

    .line 33
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    instance-of p1, p0, Ljava/lang/Short;

    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    check-cast p0, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    int-to-long p0, p0

    .line 49
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    instance-of p1, p0, Ljava/lang/Byte;

    .line 55
    .line 56
    if-eqz p1, :cond_4

    .line 57
    .line 58
    check-cast p0, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    int-to-long p0, p0

    .line 65
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_4
    instance-of p1, p0, Ljava/lang/Number;

    .line 71
    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    check-cast p0, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide p0

    .line 80
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_5
    instance-of p1, p0, Ljava/lang/String;

    .line 86
    .line 87
    if-eqz p1, :cond_6

    .line 88
    .line 89
    check-cast p0, Ljava/lang/String;

    .line 90
    .line 91
    const/16 p1, 0xa

    .line 92
    .line 93
    invoke-static {p0, p1}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_6
    :goto_0
    const/4 p0, 0x0

    .line 99
    return-object p0
.end method

.method public static varargs χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, [Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p0, p1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p0, p1

    .line 31
    :goto_0
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    instance-of v0, p0, Ljava/lang/Number;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_4

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_4
    :goto_1
    return-object p1
.end method

.method public static ψ(Ljava/io/File;)Ljava/lang/Long;
    .locals 6

    .line 1
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/16 p0, 0x9

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    const/16 v2, 0xa

    .line 23
    .line 24
    invoke-static {p0, v2}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    cmp-long p0, v2, v4

    .line 37
    .line 38
    if-lez p0, :cond_0

    .line 39
    .line 40
    const-wide/16 v4, 0x3e8

    .line 41
    .line 42
    mul-long/2addr v2, v4

    .line 43
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    :catchall_0
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :try_start_2
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    .line 54
    :catchall_1
    :goto_0
    return-object v1
.end method

.method public static ω(Ljava/io/File;)I
    .locals 3

    .line 1
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/16 p0, 0x18

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const/16 v2, 0xa

    .line 23
    .line 24
    invoke-static {p0, v2}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move p0, v1

    .line 36
    :goto_0
    const/16 v2, 0x5a

    .line 37
    .line 38
    if-eq p0, v2, :cond_1

    .line 39
    .line 40
    const/16 v2, 0xb4

    .line 41
    .line 42
    if-eq p0, v2, :cond_1

    .line 43
    .line 44
    const/16 v2, 0x10e

    .line 45
    .line 46
    if-eq p0, v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v1, p0

    .line 50
    :catchall_0
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    .line 53
    :catchall_1
    return v1
.end method


# virtual methods
.method public final Ν(Ljava/io/File;Ljava/io/File;Ljava/io/File;)Ljava/io/File;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    const-string v4, "MUX-AUDIO-SKIP "

    .line 8
    .line 9
    const-string v5, "MUX-FAIL "

    .line 10
    .line 11
    const-string v6, "\u97f3\u89c6\u9891\u5408\u5e76\u5931\u8d25: "

    .line 12
    .line 13
    const-string v0, "\u97f3\u9891\u4e0d\u662f MP4 \u53ef\u5c01\u88c5\u683c\u5f0f\uff0cfile="

    .line 14
    .line 15
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    if-eqz v7, :cond_19

    .line 20
    .line 21
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->length()J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    const-wide/16 v9, 0x0

    .line 26
    .line 27
    cmp-long v7, v7, v9

    .line 28
    .line 29
    if-gtz v7, :cond_0

    .line 30
    .line 31
    goto/16 :goto_15

    .line 32
    .line 33
    :cond_0
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    :try_start_0
    new-instance v9, Landroid/media/MediaExtractor;

    .line 36
    .line 37
    invoke-direct {v9}, Landroid/media/MediaExtractor;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-virtual {v9, v10}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V
    :try_end_0
    .catch Lku0; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_c

    .line 45
    .line 46
    .line 47
    :try_start_1
    new-instance v15, Landroid/media/MediaExtractor;

    .line 48
    .line 49
    invoke-direct {v15}, Landroid/media/MediaExtractor;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    invoke-virtual {v15, v10}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V
    :try_end_1
    .catch Lku0; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_b

    .line 57
    .line 58
    .line 59
    :try_start_2
    invoke-static {v9}, Lpu0;->π(Landroid/media/MediaExtractor;)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-ltz v10, :cond_9

    .line 64
    .line 65
    invoke-static {v15}, Lpu0;->ο(Landroid/media/MediaExtractor;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    if-ltz v11, :cond_8

    .line 70
    .line 71
    invoke-virtual {v9, v10}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v15, v11}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 79
    .line 80
    .line 81
    move-result-object v12

    .line 82
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const-string v13, "durationUs"
    :try_end_2
    .catch Lku0; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_a

    .line 86
    .line 87
    :try_start_3
    invoke-virtual {v0, v13}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    if-eqz v14, :cond_1

    .line 92
    .line 93
    invoke-virtual {v0, v13}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v13

    .line 97
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 101
    goto :goto_0

    .line 102
    :catchall_0
    :cond_1
    move-object v13, v8

    .line 103
    :goto_0
    if-eqz v13, :cond_2

    .line 104
    .line 105
    :goto_1
    :try_start_4
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v13
    :try_end_4
    .catch Lku0; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 109
    :goto_2
    move-wide/from16 v16, v13

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :catchall_1
    move-exception v0

    .line 113
    move/from16 v18, v7

    .line 114
    .line 115
    move-object v13, v8

    .line 116
    goto/16 :goto_f

    .line 117
    .line 118
    :catch_0
    move-exception v0

    .line 119
    move/from16 v18, v7

    .line 120
    .line 121
    move-object v13, v8

    .line 122
    goto/16 :goto_12

    .line 123
    .line 124
    :cond_2
    :try_start_5
    invoke-static {v2}, Lpu0;->ψ(Ljava/io/File;)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v13
    :try_end_5
    .catch Lku0; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_a

    .line 128
    if-eqz v13, :cond_3

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    const-wide v13, 0x7fffffffffffffffL

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :goto_3
    :try_start_6
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    invoke-static {v13, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    if-nez v13, :cond_4

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 152
    .line 153
    .line 154
    :catchall_2
    :cond_4
    :try_start_7
    new-instance v13, Landroid/media/MediaMuxer;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    invoke-direct {v13, v14, v7}, Landroid/media/MediaMuxer;-><init>(Ljava/lang/String;I)V
    :try_end_7
    .catch Lku0; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_a

    .line 161
    .line 162
    .line 163
    :try_start_8
    invoke-static {v2}, Lpu0;->ω(Ljava/io/File;)I

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    const/16 v7, 0x5a

    .line 168
    .line 169
    if-eq v14, v7, :cond_5

    .line 170
    .line 171
    const/16 v7, 0xb4

    .line 172
    .line 173
    if-eq v14, v7, :cond_5

    .line 174
    .line 175
    const/16 v7, 0x10e

    .line 176
    .line 177
    if-eq v14, v7, :cond_5

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_5
    invoke-virtual {v13, v14}, Landroid/media/MediaMuxer;->setOrientationHint(I)V

    .line 181
    .line 182
    .line 183
    :goto_4
    invoke-virtual {v13, v0}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-virtual {v13, v12}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    invoke-virtual {v13}, Landroid/media/MediaMuxer;->start()V
    :try_end_8
    .catch Lku0; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    .line 192
    .line 193
    .line 194
    move v12, v11

    .line 195
    move-object v11, v13

    .line 196
    const-wide v13, 0x7fffffffffffffffL

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    const/16 v19, 0x1

    .line 202
    .line 203
    move/from16 v20, v12

    .line 204
    .line 205
    move v12, v0

    .line 206
    move/from16 v0, v20

    .line 207
    .line 208
    :try_start_9
    invoke-static/range {v9 .. v14}, Lpu0;->λ(Landroid/media/MediaExtractor;ILandroid/media/MediaMuxer;IJ)I

    .line 209
    .line 210
    .line 211
    move-result v10
    :try_end_9
    .catch Lku0; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 212
    move v12, v0

    .line 213
    move v14, v7

    .line 214
    move-object v13, v11

    .line 215
    move-object v11, v15

    .line 216
    move-wide/from16 v15, v16

    .line 217
    .line 218
    :try_start_a
    invoke-static/range {v11 .. v16}, Lpu0;->λ(Landroid/media/MediaExtractor;ILandroid/media/MediaMuxer;IJ)I

    .line 219
    .line 220
    .line 221
    move-result v0
    :try_end_a
    .catch Lku0; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 222
    move-object v15, v11

    .line 223
    move-object v11, v13

    .line 224
    if-lez v10, :cond_7

    .line 225
    .line 226
    if-lez v0, :cond_6

    .line 227
    .line 228
    :try_start_b
    invoke-virtual {v11}, Landroid/media/MediaMuxer;->stop()V
    :try_end_b
    .catch Lku0; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 229
    .line 230
    .line 231
    :try_start_c
    invoke-virtual {v11}, Landroid/media/MediaMuxer;->release()V
    :try_end_c
    .catch Lku0; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 232
    .line 233
    .line 234
    :try_start_d
    const-string v0, "muxed-audio-video"

    .line 235
    .line 236
    invoke-virtual {v1, v3, v0}, Lpu0;->Σ(Ljava/io/File;Ljava/lang/String;)V
    :try_end_d
    .catch Lku0; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 237
    .line 238
    .line 239
    :try_start_e
    invoke-virtual {v9}, Landroid/media/MediaExtractor;->release()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 240
    .line 241
    .line 242
    :catchall_3
    :try_start_f
    invoke-virtual {v15}, Landroid/media/MediaExtractor;->release()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 243
    .line 244
    .line 245
    :catchall_4
    move-object v0, v8

    .line 246
    move-object v8, v3

    .line 247
    goto/16 :goto_13

    .line 248
    .line 249
    :catchall_5
    move-exception v0

    .line 250
    move-object v13, v8

    .line 251
    :goto_5
    move/from16 v7, v19

    .line 252
    .line 253
    move/from16 v18, v7

    .line 254
    .line 255
    goto/16 :goto_f

    .line 256
    .line 257
    :catch_1
    move-exception v0

    .line 258
    move-object v13, v8

    .line 259
    :goto_6
    move/from16 v7, v19

    .line 260
    .line 261
    move/from16 v18, v7

    .line 262
    .line 263
    goto/16 :goto_12

    .line 264
    .line 265
    :catchall_6
    move-exception v0

    .line 266
    move-object v13, v11

    .line 267
    goto :goto_5

    .line 268
    :catch_2
    move-exception v0

    .line 269
    move-object v13, v11

    .line 270
    goto :goto_6

    .line 271
    :catchall_7
    move-exception v0

    .line 272
    move-object v13, v11

    .line 273
    :goto_7
    move/from16 v7, v19

    .line 274
    .line 275
    :goto_8
    const/16 v18, 0x0

    .line 276
    .line 277
    goto/16 :goto_f

    .line 278
    .line 279
    :catch_3
    move-exception v0

    .line 280
    move-object v13, v11

    .line 281
    :goto_9
    move/from16 v7, v19

    .line 282
    .line 283
    :goto_a
    const/16 v18, 0x0

    .line 284
    .line 285
    goto/16 :goto_12

    .line 286
    .line 287
    :cond_6
    :try_start_10
    new-instance v0, Lku0;

    .line 288
    .line 289
    const-string v7, "\u97f3\u9891\u8f68\u6ca1\u6709\u53ef\u5199\u5165\u6837\u672c"

    .line 290
    .line 291
    invoke-direct {v0, v7}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v0

    .line 295
    :cond_7
    new-instance v0, Ljava/lang/Exception;

    .line 296
    .line 297
    const-string v7, "\u89c6\u9891\u8f68\u6ca1\u6709\u53ef\u5199\u5165\u6837\u672c"

    .line 298
    .line 299
    invoke-direct {v0, v7}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw v0
    :try_end_10
    .catch Lku0; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 303
    :catchall_8
    move-exception v0

    .line 304
    move-object v15, v11

    .line 305
    move-object v11, v13

    .line 306
    goto :goto_7

    .line 307
    :catch_4
    move-exception v0

    .line 308
    move-object v15, v11

    .line 309
    move-object v11, v13

    .line 310
    goto :goto_9

    .line 311
    :catchall_9
    move-exception v0

    .line 312
    move-object v11, v13

    .line 313
    :goto_b
    const/4 v7, 0x0

    .line 314
    goto :goto_8

    .line 315
    :catch_5
    move-exception v0

    .line 316
    move-object v11, v13

    .line 317
    :goto_c
    const/4 v7, 0x0

    .line 318
    goto :goto_a

    .line 319
    :catchall_a
    move-exception v0

    .line 320
    move-object v13, v8

    .line 321
    goto :goto_b

    .line 322
    :catch_6
    move-exception v0

    .line 323
    move-object v13, v8

    .line 324
    goto :goto_c

    .line 325
    :cond_8
    :try_start_11
    new-instance v7, Lku0;

    .line 326
    .line 327
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v10

    .line 331
    new-instance v11, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-direct {v7, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw v7

    .line 347
    :cond_9
    new-instance v0, Ljava/lang/Exception;

    .line 348
    .line 349
    const-string v7, "\u539f\u89c6\u9891\u6ca1\u6709\u89c6\u9891\u8f68"

    .line 350
    .line 351
    invoke-direct {v0, v7}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0
    :try_end_11
    .catch Lku0; {:try_start_11 .. :try_end_11} :catch_6
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 355
    :catchall_b
    move-exception v0

    .line 356
    move-object v13, v8

    .line 357
    :goto_d
    move-object v15, v13

    .line 358
    goto :goto_b

    .line 359
    :catch_7
    move-exception v0

    .line 360
    move-object v13, v8

    .line 361
    :goto_e
    move-object v15, v13

    .line 362
    goto :goto_c

    .line 363
    :catchall_c
    move-exception v0

    .line 364
    move-object v9, v8

    .line 365
    move-object v13, v9

    .line 366
    goto :goto_d

    .line 367
    :catch_8
    move-exception v0

    .line 368
    move-object v9, v8

    .line 369
    move-object v13, v9

    .line 370
    goto :goto_e

    .line 371
    :goto_f
    :try_start_12
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    if-nez v4, :cond_a

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    goto :goto_10

    .line 386
    :catchall_d
    move-exception v0

    .line 387
    goto :goto_14

    .line 388
    :cond_a
    :goto_10
    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    invoke-static {v4}, Lpu0;->Θ(Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    .line 397
    .line 398
    .line 399
    if-eqz v7, :cond_b

    .line 400
    .line 401
    if-nez v18, :cond_b

    .line 402
    .line 403
    if-eqz v13, :cond_b

    .line 404
    .line 405
    :try_start_13
    invoke-virtual {v13}, Landroid/media/MediaMuxer;->stop()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_e

    .line 406
    .line 407
    .line 408
    :catchall_e
    :cond_b
    if-eqz v13, :cond_c

    .line 409
    .line 410
    :try_start_14
    invoke-virtual {v13}, Landroid/media/MediaMuxer;->release()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_f

    .line 411
    .line 412
    .line 413
    :catchall_f
    :cond_c
    if-eqz v9, :cond_d

    .line 414
    .line 415
    :try_start_15
    invoke-virtual {v9}, Landroid/media/MediaExtractor;->release()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_10

    .line 416
    .line 417
    .line 418
    :catchall_10
    :cond_d
    if-eqz v15, :cond_12

    .line 419
    .line 420
    :goto_11
    :try_start_16
    invoke-virtual {v15}, Landroid/media/MediaExtractor;->release()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_14

    .line 421
    .line 422
    .line 423
    goto :goto_13

    .line 424
    :goto_12
    :try_start_17
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    if-nez v0, :cond_e

    .line 429
    .line 430
    const-string v0, "\u97f3\u9891\u4e0d\u53ef\u7528"

    .line 431
    .line 432
    :cond_e
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    invoke-static {v4}, Lpu0;->Θ(Ljava/lang/String;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    .line 437
    .line 438
    .line 439
    if-eqz v7, :cond_f

    .line 440
    .line 441
    if-nez v18, :cond_f

    .line 442
    .line 443
    if-eqz v13, :cond_f

    .line 444
    .line 445
    :try_start_18
    invoke-virtual {v13}, Landroid/media/MediaMuxer;->stop()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_11

    .line 446
    .line 447
    .line 448
    :catchall_11
    :cond_f
    if-eqz v13, :cond_10

    .line 449
    .line 450
    :try_start_19
    invoke-virtual {v13}, Landroid/media/MediaMuxer;->release()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_12

    .line 451
    .line 452
    .line 453
    :catchall_12
    :cond_10
    if-eqz v9, :cond_11

    .line 454
    .line 455
    :try_start_1a
    invoke-virtual {v9}, Landroid/media/MediaExtractor;->release()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_13

    .line 456
    .line 457
    .line 458
    :catchall_13
    :cond_11
    if-eqz v15, :cond_12

    .line 459
    .line 460
    goto :goto_11

    .line 461
    :catchall_14
    :cond_12
    :goto_13
    if-eqz v8, :cond_13

    .line 462
    .line 463
    return-object v8

    .line 464
    :cond_13
    if-nez v0, :cond_14

    .line 465
    .line 466
    const-string v0, "\u672a\u77e5\u97f3\u9891\u5408\u5e76\u95ee\u9898"

    .line 467
    .line 468
    :cond_14
    invoke-virtual {v1, v2, v3, v0}, Lpu0;->μ(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    return-object v0

    .line 473
    :goto_14
    if-eqz v7, :cond_15

    .line 474
    .line 475
    if-nez v18, :cond_15

    .line 476
    .line 477
    if-eqz v13, :cond_15

    .line 478
    .line 479
    :try_start_1b
    invoke-virtual {v13}, Landroid/media/MediaMuxer;->stop()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_15

    .line 480
    .line 481
    .line 482
    :catchall_15
    :cond_15
    if-eqz v13, :cond_16

    .line 483
    .line 484
    :try_start_1c
    invoke-virtual {v13}, Landroid/media/MediaMuxer;->release()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_16

    .line 485
    .line 486
    .line 487
    :catchall_16
    :cond_16
    if-eqz v9, :cond_17

    .line 488
    .line 489
    :try_start_1d
    invoke-virtual {v9}, Landroid/media/MediaExtractor;->release()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_17

    .line 490
    .line 491
    .line 492
    :catchall_17
    :cond_17
    if-eqz v15, :cond_18

    .line 493
    .line 494
    :try_start_1e
    invoke-virtual {v15}, Landroid/media/MediaExtractor;->release()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_18

    .line 495
    .line 496
    .line 497
    :catchall_18
    :cond_18
    throw v0

    .line 498
    :cond_19
    :goto_15
    const-string v0, "\u97f3\u9891\u6587\u4ef6\u4e0d\u5b58\u5728\u6216\u4e3a\u7a7a"

    .line 499
    .line 500
    invoke-virtual {v1, v2, v3, v0}, Lpu0;->μ(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    return-object v0
.end method

.method public final Ξ(Ljava/lang/Object;)Llu0;
    .locals 29

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "uniqueId"

    .line 4
    .line 5
    const-string v2, "id"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v3

    .line 11
    :cond_0
    :try_start_0
    invoke-static {v0}, Lpu0;->Ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    :goto_0
    move v6, v4

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto/16 :goto_17

    .line 25
    .line 26
    :cond_1
    const/4 v4, -0x1

    .line 27
    goto :goto_0

    .line 28
    :goto_1
    invoke-static {v0}, Lpu0;->ν(Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_5

    .line 41
    .line 42
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-static {v7}, Lpu0;->τ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    if-nez v9, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    invoke-static {v9}, Lpu0;->κ(Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-static {v9}, Lpu0;->Ρ(Ljava/util/List;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    if-eqz v9, :cond_4

    .line 62
    .line 63
    const/4 v9, 0x1

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    :goto_2
    const/4 v9, 0x0

    .line 66
    :goto_3
    if-eqz v9, :cond_2

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_5
    move-object v7, v3

    .line 70
    :goto_4
    if-nez v7, :cond_6

    .line 71
    .line 72
    invoke-static {v4}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    :cond_6
    new-instance v5, Lf7;

    .line 77
    .line 78
    const/4 v9, 0x1

    .line 79
    invoke-direct {v5, v9, v4}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance v9, Lgp0;

    .line 83
    .line 84
    move-object/from16 v10, p0

    .line 85
    .line 86
    invoke-direct {v9, v10}, Lgp0;-><init>(Lpu0;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v5, v9}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static {v5}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    const/16 v9, 0x3b

    .line 98
    .line 99
    if-ne v6, v9, :cond_7

    .line 100
    .line 101
    const-string v5, "awemeType=59"

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_7
    if-eqz v5, :cond_2b

    .line 105
    .line 106
    new-instance v5, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v10, "awemeType="

    .line 112
    .line 113
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v10, " + ImageUrlStruct.video"

    .line 120
    .line 121
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    :goto_5
    const-string v10, "desc"

    .line 129
    .line 130
    const-string v11, "description"

    .line 131
    .line 132
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-static {v0, v10}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    const-string v11, ""

    .line 141
    .line 142
    if-nez v10, :cond_8

    .line 143
    .line 144
    move-object v10, v11

    .line 145
    :cond_8
    :try_start_1
    const-string v12, "aid"

    .line 146
    .line 147
    filled-new-array {v12}, [Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    invoke-static {v0, v12}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    const-string v13, "awemeId"

    .line 156
    .line 157
    filled-new-array {v13}, [Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    invoke-static {v0, v13}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    filled-new-array {v2}, [Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    invoke-static {v0, v14}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v14

    .line 173
    const-string v15, "groupId"

    .line 174
    .line 175
    filled-new-array {v15}, [Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    invoke-static {v0, v15}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    const-string v16, "itemId"

    .line 184
    .line 185
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-static {v0, v3}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    filled-new-array {v12, v13, v14, v15, v3}, [Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-static {v3}, Lpu0;->ρ([Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    if-nez v3, :cond_9

    .line 202
    .line 203
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    new-instance v12, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v13, "_"

    .line 216
    .line 217
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    const-string v12, "MD5"

    .line 228
    .line 229
    invoke-static {v12}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    sget-object v13, Lmf;->α:Ljava/nio/charset/Charset;

    .line 234
    .line 235
    invoke-virtual {v3, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v3}, Ljava/security/MessageDigest;->digest([B)[B

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    new-instance v12, Lgp0;

    .line 250
    .line 251
    const/16 v13, 0xe

    .line 252
    .line 253
    invoke-direct {v12, v13}, Lgp0;-><init>(I)V

    .line 254
    .line 255
    .line 256
    invoke-static {v3, v12}, Lg7;->ж([BLa80;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    const/16 v12, 0x10

    .line 261
    .line 262
    invoke-static {v3, v12}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    :cond_9
    const-string v12, "author"

    .line 267
    .line 268
    filled-new-array {v12}, [Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v12

    .line 272
    invoke-static {v0, v12}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v12

    .line 276
    const-string v13, "authorUserId"

    .line 277
    .line 278
    filled-new-array {v13}, [Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v13

    .line 282
    invoke-static {v0, v13}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    const-string v14, "uid"

    .line 287
    .line 288
    filled-new-array {v14}, [Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    invoke-static {v12, v14}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v14

    .line 296
    filled-new-array {v2}, [Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    invoke-static {v12, v2}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    filled-new-array {v13, v14, v2}, [Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-static {v2}, Lpu0;->ρ([Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    if-eqz v2, :cond_b

    .line 313
    .line 314
    invoke-static {v2}, Lpu0;->Ζ(Ljava/lang/String;)Z

    .line 315
    .line 316
    .line 317
    move-result v13

    .line 318
    if-eqz v13, :cond_a

    .line 319
    .line 320
    move-object v13, v2

    .line 321
    goto :goto_6

    .line 322
    :cond_a
    const/4 v13, 0x0

    .line 323
    :goto_6
    if-nez v13, :cond_c

    .line 324
    .line 325
    :cond_b
    move-object v13, v11

    .line 326
    :cond_c
    const-string v14, "secUid"

    .line 327
    .line 328
    filled-new-array {v14}, [Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v14

    .line 332
    invoke-static {v12, v14}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v14

    .line 336
    if-eqz v2, :cond_d

    .line 337
    .line 338
    invoke-static {v2}, Lpu0;->Ζ(Ljava/lang/String;)Z

    .line 339
    .line 340
    .line 341
    move-result v15

    .line 342
    if-nez v15, :cond_d

    .line 343
    .line 344
    goto :goto_7

    .line 345
    :cond_d
    const/4 v2, 0x0

    .line 346
    :goto_7
    filled-new-array {v1}, [Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v15

    .line 350
    invoke-static {v12, v15}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v15

    .line 354
    filled-new-array {v14, v2, v15}, [Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    invoke-static {v2}, Lpu0;->ρ([Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    if-nez v2, :cond_e

    .line 363
    .line 364
    move-object v2, v11

    .line 365
    :cond_e
    const-string v14, "nickname"

    .line 366
    .line 367
    filled-new-array {v14}, [Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v14

    .line 371
    invoke-static {v12, v14}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v14

    .line 375
    const-string v15, "nickName"

    .line 376
    .line 377
    filled-new-array {v15}, [Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v15

    .line 381
    invoke-static {v12, v15}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v15

    .line 385
    filled-new-array {v1}, [Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-static {v12, v1}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    const-string v16, "shortId"

    .line 394
    .line 395
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    invoke-static {v12, v8}, Lpu0;->χ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    filled-new-array {v14, v15, v1, v8}, [Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-static {v1}, Lpu0;->ρ([Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    if-nez v1, :cond_f

    .line 412
    .line 413
    move-object v12, v11

    .line 414
    goto :goto_8

    .line 415
    :cond_f
    move-object v12, v1

    .line 416
    :goto_8
    const-string v1, "createTime"

    .line 417
    .line 418
    const-string v8, "createTimeStamp"

    .line 419
    .line 420
    filled-new-array {v1, v8}, [Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-static {v0, v1}, Lpu0;->φ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Long;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    const-wide/16 v14, 0x0

    .line 429
    .line 430
    if-eqz v1, :cond_10

    .line 431
    .line 432
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 433
    .line 434
    .line 435
    move-result-wide v18

    .line 436
    goto :goto_9

    .line 437
    :cond_10
    move-wide/from16 v18, v14

    .line 438
    .line 439
    :goto_9
    const-string v1, "duration"

    .line 440
    .line 441
    filled-new-array {v1}, [Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-static {v0, v1}, Lpu0;->φ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Long;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    if-eqz v1, :cond_11

    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 452
    .line 453
    .line 454
    move-result-wide v14

    .line 455
    :cond_11
    move-wide v15, v14

    .line 456
    new-instance v1, Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 459
    .line 460
    .line 461
    new-instance v8, Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 464
    .line 465
    .line 466
    new-instance v11, Ljava/util/ArrayList;

    .line 467
    .line 468
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 469
    .line 470
    .line 471
    new-instance v14, Ljava/util/ArrayList;

    .line 472
    .line 473
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 474
    .line 475
    .line 476
    new-instance v9, Ljava/util/ArrayList;

    .line 477
    .line 478
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 479
    .line 480
    .line 481
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    const/16 v21, 0x0

    .line 486
    .line 487
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 488
    .line 489
    .line 490
    move-result v17

    .line 491
    move-object/from16 v27, v2

    .line 492
    .line 493
    if-eqz v17, :cond_19

    .line 494
    .line 495
    add-int/lit8 v17, v21, 0x1

    .line 496
    .line 497
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v20

    .line 501
    invoke-static/range {v20 .. v20}, Lpu0;->τ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v22

    .line 505
    sget-object v23, Ljz;->ε:Ljz;

    .line 506
    .line 507
    if-eqz v22, :cond_14

    .line 508
    .line 509
    invoke-static/range {v22 .. v22}, Lpu0;->κ(Ljava/lang/Object;)Ljava/util/List;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    invoke-static {v11, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 514
    .line 515
    .line 516
    move-object/from16 v22, v2

    .line 517
    .line 518
    invoke-static/range {v22 .. v22}, Lpu0;->Ρ(Ljava/util/List;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    if-eqz v2, :cond_13

    .line 523
    .line 524
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 525
    .line 526
    .line 527
    move-result v23

    .line 528
    if-eqz v23, :cond_12

    .line 529
    .line 530
    goto :goto_b

    .line 531
    :cond_12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    :cond_13
    :goto_b
    move-object/from16 v23, v22

    .line 535
    .line 536
    move-object/from16 v22, v2

    .line 537
    .line 538
    goto :goto_c

    .line 539
    :cond_14
    const/16 v22, 0x0

    .line 540
    .line 541
    :goto_c
    invoke-static/range {v20 .. v20}, Lpu0;->θ(Ljava/lang/Object;)Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-static {v14, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 546
    .line 547
    .line 548
    move-object/from16 v20, v2

    .line 549
    .line 550
    invoke-static/range {v20 .. v20}, Lpu0;->Π(Ljava/util/List;)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    if-eqz v2, :cond_16

    .line 555
    .line 556
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 557
    .line 558
    .line 559
    move-result v25

    .line 560
    if-eqz v25, :cond_15

    .line 561
    .line 562
    goto :goto_d

    .line 563
    :cond_15
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    :cond_16
    :goto_d
    if-eqz v22, :cond_17

    .line 567
    .line 568
    invoke-static/range {v22 .. v22}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 569
    .line 570
    .line 571
    move-result v25

    .line 572
    if-eqz v25, :cond_18

    .line 573
    .line 574
    :cond_17
    move-object/from16 v28, v3

    .line 575
    .line 576
    goto :goto_e

    .line 577
    :cond_18
    move-object/from16 v25, v20

    .line 578
    .line 579
    new-instance v20, Lmu0;

    .line 580
    .line 581
    invoke-static/range {v23 .. v23}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 582
    .line 583
    .line 584
    move-result-object v23

    .line 585
    move-object/from16 v26, v2

    .line 586
    .line 587
    invoke-static/range {v23 .. v23}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    move-object/from16 v28, v3

    .line 592
    .line 593
    const/16 v3, 0x1e

    .line 594
    .line 595
    invoke-static {v2, v3}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-static/range {v25 .. v25}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 600
    .line 601
    .line 602
    move-result-object v23

    .line 603
    move-object/from16 v25, v2

    .line 604
    .line 605
    invoke-static/range {v23 .. v23}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    invoke-static {v2, v3}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    move-object/from16 v24, v26

    .line 614
    .line 615
    move-object/from16 v23, v26

    .line 616
    .line 617
    move-object/from16 v26, v2

    .line 618
    .line 619
    invoke-direct/range {v20 .. v26}, Lmu0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 620
    .line 621
    .line 622
    move-object/from16 v2, v20

    .line 623
    .line 624
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    :goto_e
    move/from16 v21, v17

    .line 628
    .line 629
    move-object/from16 v2, v27

    .line 630
    .line 631
    move-object/from16 v3, v28

    .line 632
    .line 633
    goto/16 :goto_a

    .line 634
    .line 635
    :cond_19
    move-object/from16 v28, v3

    .line 636
    .line 637
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    if-eqz v2, :cond_1b

    .line 642
    .line 643
    const/16 v2, 0x3b

    .line 644
    .line 645
    if-ne v6, v2, :cond_1b

    .line 646
    .line 647
    const-string v2, "video"

    .line 648
    .line 649
    filled-new-array {v2}, [Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    invoke-static {v0, v2}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    invoke-static {v2}, Lpu0;->κ(Ljava/lang/Object;)Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    invoke-static {v11, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 662
    .line 663
    .line 664
    invoke-static {v2}, Lpu0;->Ρ(Ljava/util/List;)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    if-eqz v2, :cond_1b

    .line 669
    .line 670
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    if-eqz v3, :cond_1a

    .line 675
    .line 676
    goto :goto_f

    .line 677
    :cond_1a
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    :cond_1b
    :goto_f
    invoke-static {v11}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    invoke-static {v14}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 685
    .line 686
    .line 687
    move-result-object v3

    .line 688
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    :cond_1c
    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 693
    .line 694
    .line 695
    move-result v11

    .line 696
    if-eqz v11, :cond_1d

    .line 697
    .line 698
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v11

    .line 702
    move-object v14, v11

    .line 703
    check-cast v14, Lmu0;

    .line 704
    .line 705
    iget-object v14, v14, Lmu0;->β:Ljava/lang/String;

    .line 706
    .line 707
    if-eqz v14, :cond_1c

    .line 708
    .line 709
    invoke-static {v14}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 710
    .line 711
    .line 712
    move-result v14

    .line 713
    if-eqz v14, :cond_1e

    .line 714
    .line 715
    goto :goto_10

    .line 716
    :cond_1d
    const/4 v11, 0x0

    .line 717
    :cond_1e
    check-cast v11, Lmu0;

    .line 718
    .line 719
    if-eqz v11, :cond_20

    .line 720
    .line 721
    iget-object v4, v11, Lmu0;->β:Ljava/lang/String;

    .line 722
    .line 723
    if-nez v4, :cond_1f

    .line 724
    .line 725
    goto :goto_12

    .line 726
    :cond_1f
    :goto_11
    move-object/from16 v17, v4

    .line 727
    .line 728
    goto :goto_13

    .line 729
    :cond_20
    :goto_12
    invoke-static {v1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v4

    .line 733
    check-cast v4, Ljava/lang/String;

    .line 734
    .line 735
    if-nez v4, :cond_1f

    .line 736
    .line 737
    invoke-static {v2}, Lpu0;->Ρ(Ljava/util/List;)Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    goto :goto_11

    .line 742
    :goto_13
    if-eqz v11, :cond_21

    .line 743
    .line 744
    iget-object v4, v11, Lmu0;->γ:Ljava/lang/String;

    .line 745
    .line 746
    if-nez v4, :cond_22

    .line 747
    .line 748
    :cond_21
    invoke-static {v8}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    check-cast v4, Ljava/lang/String;

    .line 753
    .line 754
    if-nez v4, :cond_22

    .line 755
    .line 756
    invoke-static {v3}, Lpu0;->Π(Ljava/util/List;)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    :cond_22
    const-string v14, "cover"

    .line 761
    .line 762
    const-string v0, "_cover"

    .line 763
    .line 764
    filled-new-array {v14, v0}, [Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    invoke-static {v7, v0}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    const-string v14, "originCover"

    .line 773
    .line 774
    move-object/from16 p0, v1

    .line 775
    .line 776
    const-string v1, "_originCover"

    .line 777
    .line 778
    filled-new-array {v14, v1}, [Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    invoke-static {v7, v1}, Lpu0;->σ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    invoke-static {v0}, Lpu0;->ι([Ljava/lang/Object;)Ljava/util/List;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    new-instance v1, Ljava/util/ArrayList;

    .line 795
    .line 796
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 797
    .line 798
    .line 799
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    :cond_23
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 804
    .line 805
    .line 806
    move-result v14

    .line 807
    if-eqz v14, :cond_24

    .line 808
    .line 809
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v14

    .line 813
    move-object/from16 v20, v14

    .line 814
    .line 815
    check-cast v20, Ljava/lang/String;

    .line 816
    .line 817
    invoke-static/range {v20 .. v20}, Lpu0;->Μ(Ljava/lang/String;)Z

    .line 818
    .line 819
    .line 820
    move-result v20

    .line 821
    if-nez v20, :cond_23

    .line 822
    .line 823
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    goto :goto_14

    .line 827
    :cond_24
    if-eqz v11, :cond_25

    .line 828
    .line 829
    iget-object v0, v11, Lmu0;->δ:Ljava/lang/String;

    .line 830
    .line 831
    if-nez v0, :cond_26

    .line 832
    .line 833
    :cond_25
    invoke-static {v1}, Lpu0;->Π(Ljava/util/List;)Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    if-nez v0, :cond_26

    .line 838
    .line 839
    move-object v0, v4

    .line 840
    :cond_26
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v20

    .line 848
    if-eqz v7, :cond_27

    .line 849
    .line 850
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    move-object/from16 v21, v1

    .line 859
    .line 860
    goto :goto_15

    .line 861
    :cond_27
    const/16 v21, 0x0

    .line 862
    .line 863
    :goto_15
    invoke-static/range {p0 .. p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    invoke-static {v1, v2}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    invoke-static {v1}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    const/16 v2, 0x1e

    .line 880
    .line 881
    invoke-static {v1, v2}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 882
    .line 883
    .line 884
    move-result-object v22

    .line 885
    invoke-static {v8}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    invoke-static {v1, v3}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 890
    .line 891
    .line 892
    move-result-object v1

    .line 893
    invoke-static {v1}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 894
    .line 895
    .line 896
    move-result-object v1

    .line 897
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 898
    .line 899
    .line 900
    move-result-object v1

    .line 901
    invoke-static {v1, v2}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 902
    .line 903
    .line 904
    move-result-object v23

    .line 905
    invoke-static/range {p0 .. p0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 910
    .line 911
    .line 912
    move-result-object v24

    .line 913
    invoke-static {v8}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 914
    .line 915
    .line 916
    move-result-object v1

    .line 917
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 918
    .line 919
    .line 920
    move-result-object v25

    .line 921
    new-instance v1, Ljava/util/HashSet;

    .line 922
    .line 923
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 924
    .line 925
    .line 926
    new-instance v2, Ljava/util/ArrayList;

    .line 927
    .line 928
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    :cond_28
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 936
    .line 937
    .line 938
    move-result v7

    .line 939
    if-eqz v7, :cond_2a

    .line 940
    .line 941
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v7

    .line 945
    move-object v8, v7

    .line 946
    check-cast v8, Lmu0;

    .line 947
    .line 948
    iget-object v9, v8, Lmu0;->β:Ljava/lang/String;

    .line 949
    .line 950
    if-nez v9, :cond_29

    .line 951
    .line 952
    iget-object v9, v8, Lmu0;->ε:Ljava/util/List;

    .line 953
    .line 954
    invoke-static {v9}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v9

    .line 958
    check-cast v9, Ljava/lang/String;

    .line 959
    .line 960
    if-nez v9, :cond_29

    .line 961
    .line 962
    iget v8, v8, Lmu0;->α:I

    .line 963
    .line 964
    new-instance v9, Ljava/lang/StringBuilder;

    .line 965
    .line 966
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 967
    .line 968
    .line 969
    const-string v11, "page_"

    .line 970
    .line 971
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v9

    .line 981
    :cond_29
    invoke-virtual {v1, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 982
    .line 983
    .line 984
    move-result v8

    .line 985
    if-eqz v8, :cond_28

    .line 986
    .line 987
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 988
    .line 989
    .line 990
    goto :goto_16

    .line 991
    :cond_2a
    move-object v7, v5

    .line 992
    new-instance v5, Llu0;

    .line 993
    .line 994
    move-object/from16 v26, v2

    .line 995
    .line 996
    move-object v9, v10

    .line 997
    move-object v10, v13

    .line 998
    move-wide/from16 v13, v18

    .line 999
    .line 1000
    move-object/from16 v11, v27

    .line 1001
    .line 1002
    move-object/from16 v8, v28

    .line 1003
    .line 1004
    move-object/from16 v19, v0

    .line 1005
    .line 1006
    move-object/from16 v18, v4

    .line 1007
    .line 1008
    invoke-direct/range {v5 .. v26}, Llu0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1009
    .line 1010
    .line 1011
    goto :goto_18

    .line 1012
    :cond_2b
    const/4 v5, 0x0

    .line 1013
    goto :goto_18

    .line 1014
    :goto_17
    new-instance v5, Leo1;

    .line 1015
    .line 1016
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1017
    .line 1018
    .line 1019
    :goto_18
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    if-nez v0, :cond_2c

    .line 1024
    .line 1025
    move-object v3, v5

    .line 1026
    goto :goto_19

    .line 1027
    :cond_2c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1032
    .line 1033
    const-string v2, "parseAweme \u5931\u8d25: "

    .line 1034
    .line 1035
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    invoke-static {v0}, Lpu0;->Θ(Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    const/4 v3, 0x0

    .line 1049
    :goto_19
    check-cast v3, Llu0;

    .line 1050
    .line 1051
    return-object v3
.end method

.method public final Σ(Ljava/io/File;Ljava/lang/String;)V
    .locals 18

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    const-string v2, "\u89c6\u9891\u53ef\u64ad\u653e\u6821\u9a8c\u5931\u8d25: "

    .line 4
    .line 5
    const-string v0, "\u89c6\u9891\u65e0\u6709\u6548\u5c3a\u5bf8 width="

    .line 6
    .line 7
    const-string v3, "VIDEO-VALID ok, mime="

    .line 8
    .line 9
    const-string v4, "\u65e0\u6cd5\u89e3\u7801\u89c6\u9891\u9996\u5e27: "

    .line 10
    .line 11
    const-string v5, "\u89c6\u9891\u65e0\u6709\u6548\u65f6\u957f duration="

    .line 12
    .line 13
    const-string v6, "\u6587\u4ef6\u4e0d\u662f\u89c6\u9891 mime="

    .line 14
    .line 15
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    if-eqz v7, :cond_f

    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    const-wide/16 v9, 0x0

    .line 26
    .line 27
    cmp-long v7, v7, v9

    .line 28
    .line 29
    if-lez v7, :cond_f

    .line 30
    .line 31
    new-instance v7, Landroid/media/MediaMetadataRetriever;

    .line 32
    .line 33
    invoke-direct {v7}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-virtual {v7, v8}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/16 v8, 0xc

    .line 44
    .line 45
    invoke-virtual {v7, v8}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    const/16 v11, 0x9

    .line 50
    .line 51
    invoke-virtual {v7, v11}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    const/16 v12, 0xa

    .line 56
    .line 57
    if-eqz v11, :cond_0

    .line 58
    .line 59
    invoke-static {v11, v12}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    if-eqz v11, :cond_0

    .line 64
    .line 65
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 66
    .line 67
    .line 68
    move-result-wide v13

    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto/16 :goto_a

    .line 72
    .line 73
    :cond_0
    move-wide v13, v9

    .line 74
    :goto_0
    const/16 v11, 0x12

    .line 75
    .line 76
    invoke-virtual {v7, v11}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    const/4 v15, 0x0

    .line 81
    if-eqz v11, :cond_1

    .line 82
    .line 83
    invoke-static {v11, v12}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    if-eqz v11, :cond_1

    .line 88
    .line 89
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    :goto_1
    move-wide/from16 v16, v9

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_1
    move v11, v15

    .line 97
    goto :goto_1

    .line 98
    :goto_2
    const/16 v9, 0x13

    .line 99
    .line 100
    invoke-virtual {v7, v9}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    if-eqz v9, :cond_2

    .line 105
    .line 106
    invoke-static {v9, v12}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    if-eqz v9, :cond_2

    .line 111
    .line 112
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    goto :goto_3

    .line 117
    :cond_2
    move v9, v15

    .line 118
    :goto_3
    if-eqz v8, :cond_5

    .line 119
    .line 120
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    if-eqz v10, :cond_3

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_3
    const-string v10, "video/"

    .line 128
    .line 129
    invoke-static {v8, v10, v15}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-eqz v10, :cond_4

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_4
    new-instance v0, Ljava/lang/Exception;

    .line 137
    .line 138
    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    :cond_5
    :goto_4
    cmp-long v6, v13, v16

    .line 147
    .line 148
    if-lez v6, :cond_e

    .line 149
    .line 150
    if-lez v11, :cond_d

    .line 151
    .line 152
    if-lez v9, :cond_d

    .line 153
    .line 154
    const/4 v0, 0x2

    .line 155
    move-wide/from16 v5, v16

    .line 156
    .line 157
    :try_start_1
    invoke-virtual {v7, v5, v6, v0}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 158
    .line 159
    .line 160
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 161
    goto :goto_5

    .line 162
    :catchall_1
    move-exception v0

    .line 163
    :try_start_2
    new-instance v5, Leo1;

    .line 164
    .line 165
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    move-object v0, v5

    .line 169
    :goto_5
    instance-of v5, v0, Leo1;

    .line 170
    .line 171
    if-eqz v5, :cond_6

    .line 172
    .line 173
    const/4 v0, 0x0

    .line 174
    :cond_6
    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 175
    .line 176
    if-nez v0, :cond_8

    .line 177
    .line 178
    const-wide/32 v5, 0x493e0

    .line 179
    .line 180
    .line 181
    const/4 v0, 0x3

    .line 182
    :try_start_3
    invoke-virtual {v7, v5, v6, v0}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 183
    .line 184
    .line 185
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 186
    goto :goto_6

    .line 187
    :catchall_2
    move-exception v0

    .line 188
    :try_start_4
    new-instance v5, Leo1;

    .line 189
    .line 190
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    move-object v0, v5

    .line 194
    :goto_6
    instance-of v5, v0, Leo1;

    .line 195
    .line 196
    if-eqz v5, :cond_7

    .line 197
    .line 198
    const/4 v6, 0x0

    .line 199
    goto :goto_7

    .line 200
    :cond_7
    move-object v6, v0

    .line 201
    :goto_7
    move-object v0, v6

    .line 202
    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 203
    .line 204
    :cond_8
    const-string v5, "..."

    .line 205
    .line 206
    const/16 v6, 0x8c

    .line 207
    .line 208
    if-eqz v0, :cond_b

    .line 209
    .line 210
    :try_start_5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-nez v4, :cond_9

    .line 215
    .line 216
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 217
    .line 218
    .line 219
    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-gt v0, v6, :cond_a

    .line 224
    .line 225
    move-object v0, v1

    .line 226
    goto :goto_8

    .line 227
    :cond_a
    invoke-static {v1, v6}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    :goto_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v3, ", duration="

    .line 244
    .line 245
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v3, "ms, size="

    .line 252
    .line 253
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-string v3, "x"

    .line 260
    .line 261
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string v3, ", url="

    .line 268
    .line 269
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v0}, Lpu0;->Θ(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 280
    .line 281
    .line 282
    :try_start_6
    invoke-virtual {v7}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 283
    .line 284
    .line 285
    :catchall_3
    return-void

    .line 286
    :cond_b
    :try_start_7
    new-instance v0, Ljava/lang/Exception;

    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    if-gt v3, v6, :cond_c

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_c
    invoke-static {v1, v6}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    :goto_9
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :cond_d
    new-instance v1, Ljava/lang/Exception;

    .line 312
    .line 313
    new-instance v3, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    const-string v0, " height="

    .line 322
    .line 323
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw v1

    .line 337
    :cond_e
    new-instance v0, Ljava/lang/Exception;

    .line 338
    .line 339
    new-instance v1, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 355
    :goto_a
    :try_start_8
    new-instance v1, Ljava/lang/Exception;

    .line 356
    .line 357
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    new-instance v3, Ljava/lang/StringBuilder;

    .line 362
    .line 363
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 377
    :catchall_4
    move-exception v0

    .line 378
    :try_start_9
    invoke-virtual {v7}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 379
    .line 380
    .line 381
    :catchall_5
    throw v0

    .line 382
    :cond_f
    new-instance v0, Ljava/lang/Exception;

    .line 383
    .line 384
    const-string v1, "\u89c6\u9891\u6587\u4ef6\u4e3a\u7a7a"

    .line 385
    .line 386
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v0
.end method

.method public final μ(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MUX-FALLBACK "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p3, "\uff0c\u6539\u7528\u65e0\u97f3\u9891\u89c6\u9891\u5408\u6210\u52a8\u56fe"

    .line 12
    .line 13
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-static {p3}, Lpu0;->Θ(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {p3, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-nez p3, :cond_0

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :catchall_0
    :cond_0
    :try_start_1
    const-string p2, "no-audio-fallback"

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Lpu0;->Σ(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_1
    move-exception p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance p1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string p2, "MUX-FALLBACK-FAIL \u539f\u89c6\u9891\u4e0d\u53ef\u7528\uff0c\u65e0\u6cd5\u65e0\u97f3\u9891\u515c\u5e95: "

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, Lpu0;->Θ(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    :goto_0
    return-object p1
.end method
