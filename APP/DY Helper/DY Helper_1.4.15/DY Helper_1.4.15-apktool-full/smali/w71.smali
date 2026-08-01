.class public abstract Lw71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "copy_link"

    .line 2
    .line 3
    const-string v1, "open_author"

    .line 4
    .line 5
    const-string v2, "download_default"

    .line 6
    .line 7
    const-string v3, "work_bookmark"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lw71;->α:Ljava/util/List;

    .line 18
    .line 19
    return-void
.end method

.method public static α(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    goto/16 :goto_0

    .line 9
    .line 10
    :sswitch_0
    const-string v0, "\u4e0b\u8f7d\u56fe\u7247\u548c\u52a8\u56fe"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :sswitch_1
    const-string v0, "\u53d6\u6d88\u4f5c\u54c1\u4e66\u7b7e"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :cond_0
    const-string p0, "\u5df2\u6536\u85cf"

    .line 31
    .line 32
    return-object p0

    .line 33
    :sswitch_2
    const-string v0, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string p0, "\u4f5c\u8005"

    .line 43
    .line 44
    return-object p0

    .line 45
    :sswitch_3
    const-string v0, "\u4e0b\u8f7d\u89c6\u9891"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :sswitch_4
    const-string v0, "\u4e0b\u8f7d\u56fe\u7247"

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :sswitch_5
    const-string v0, "\u4e0b\u8f7d\u52a8\u56fe"

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const-string p0, "\u4e0b\u8f7d"

    .line 73
    .line 74
    return-object p0

    .line 75
    :sswitch_6
    const-string v0, "\u4f5c\u54c1\u4e66\u7b7e"

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    const-string p0, "\u6536\u85cf"

    .line 85
    .line 86
    return-object p0

    .line 87
    :sswitch_7
    const-string v0, "\u6062\u590d\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_4

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    const-string p0, "\u6062\u590d\u9690\u85cf"

    .line 97
    .line 98
    return-object p0

    .line 99
    :sswitch_8
    const-string v0, "\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e"

    .line 100
    .line 101
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    const-string p0, "\u6536\u85cf\u4f5c\u8005"

    .line 109
    .line 110
    return-object p0

    .line 111
    :sswitch_9
    const-string v0, "\u53d6\u6d88\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e"

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_6

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_6
    const-string p0, "\u5df2\u6536\u85cf\u4f5c\u8005"

    .line 121
    .line 122
    return-object p0

    .line 123
    :sswitch_a
    const-string v0, "\u4e34\u65f6\u663e\u793a\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_7

    .line 130
    .line 131
    :goto_0
    return-object p0

    .line 132
    :cond_7
    const-string p0, "\u663e\u793a\u8054\u7cfb\u4eba"

    .line 133
    .line 134
    return-object p0

    .line 135
    :sswitch_data_0
    .sparse-switch
        -0x6e0022ea -> :sswitch_a
        -0x68fa1c73 -> :sswitch_9
        -0x624c1365 -> :sswitch_8
        0x1450c4c9 -> :sswitch_7
        0x255b457d -> :sswitch_6
        0x259eefa8 -> :sswitch_5
        0x259f915b -> :sswitch_4
        0x25a5dddd -> :sswitch_3
        0x2945c010 -> :sswitch_2
        0x3c4250ef -> :sswitch_1
        0x455be7a7 -> :sswitch_0
    .end sparse-switch
.end method

.method public static β(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :sswitch_0
    const-string v0, "copy_link"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "\u590d\u5236\u94fe\u63a5"

    .line 19
    .line 20
    return-object p0

    .line 21
    :sswitch_1
    const-string v0, "author_bookmark"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    const-string p0, "\u6536\u85cf\u4f5c\u8005"

    .line 31
    .line 32
    return-object p0

    .line 33
    :sswitch_2
    const-string v0, "hidden_contact_toggle"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-string p0, "\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 43
    .line 44
    return-object p0

    .line 45
    :sswitch_3
    const-string v0, "work_bookmark"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const-string p0, "\u6536\u85cf"

    .line 55
    .line 56
    return-object p0

    .line 57
    :sswitch_4
    const-string v0, "open_author"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    const-string p0, "\u4f5c\u8005"

    .line 67
    .line 68
    return-object p0

    .line 69
    :sswitch_5
    const-string v0, "download_default"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_6

    .line 76
    .line 77
    :goto_0
    const-string v0, "action:"

    .line 78
    .line 79
    invoke-static {p0, v0}, Lq02;->н(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    const-string p0, "\u672a\u914d\u7f6e"

    .line 90
    .line 91
    :cond_5
    return-object p0

    .line 92
    :cond_6
    const-string p0, "\u4e0b\u8f7d"

    .line 93
    .line 94
    return-object p0

    .line 95
    :sswitch_data_0
    .sparse-switch
        -0x412ec276 -> :sswitch_5
        -0x2156cee0 -> :sswitch_4
        0x1a6572a4 -> :sswitch_3
        0x46ba3788 -> :sswitch_2
        0x4ed5416a -> :sswitch_1
        0x59bb1a84 -> :sswitch_0
    .end sparse-switch
.end method

.method public static γ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    goto/16 :goto_1

    .line 9
    .line 10
    :sswitch_0
    const-string v0, "\u4e0b\u8f7d\u56fe\u7247\u548c\u52a8\u56fe"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_5

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :sswitch_1
    const-string v0, "\u53d6\u6d88\u4f5c\u54c1\u4e66\u7b7e"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_3

    .line 26
    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :sswitch_2
    const-string v0, "\u590d\u5236\u94fe\u63a5"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_0
    const-string p0, "copy_link"

    .line 40
    .line 41
    return-object p0

    .line 42
    :sswitch_3
    const-string v0, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "open_author"

    .line 52
    .line 53
    return-object p0

    .line 54
    :sswitch_4
    const-string v0, "\u4e0b\u8f7d\u89c6\u9891"

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :sswitch_5
    const-string v0, "\u4e0b\u8f7d\u56fe\u7247"

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :sswitch_6
    const-string v0, "\u4e0b\u8f7d\u52a8\u56fe"

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :sswitch_7
    const-string v0, "\u4e0b\u8f7d\u4f5c\u54c1"

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    :goto_0
    const-string p0, "download_default"

    .line 91
    .line 92
    return-object p0

    .line 93
    :sswitch_8
    const-string v0, "\u4f5c\u54c1\u4e66\u7b7e"

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    const-string p0, "work_bookmark"

    .line 103
    .line 104
    return-object p0

    .line 105
    :sswitch_9
    const-string v0, "\u6062\u590d\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :sswitch_a
    const-string v0, "\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e"

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_4

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :sswitch_b
    const-string v0, "\u53d6\u6d88\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e"

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_4

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    const-string p0, "author_bookmark"

    .line 133
    .line 134
    return-object p0

    .line 135
    :sswitch_c
    const-string v0, "\u4e34\u65f6\u663e\u793a\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 136
    .line 137
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_6

    .line 142
    .line 143
    :cond_5
    :goto_1
    const-string v0, "action:"

    .line 144
    .line 145
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :cond_6
    const-string p0, "hidden_contact_toggle"

    .line 151
    .line 152
    return-object p0

    .line 153
    :sswitch_data_0
    .sparse-switch
        -0x6e0022ea -> :sswitch_c
        -0x68fa1c73 -> :sswitch_b
        -0x624c1365 -> :sswitch_a
        0x1450c4c9 -> :sswitch_9
        0x255b457d -> :sswitch_8
        0x259e8737 -> :sswitch_7
        0x259eefa8 -> :sswitch_6
        0x259f915b -> :sswitch_5
        0x25a5dddd -> :sswitch_4
        0x2945c010 -> :sswitch_3
        0x29c1faf0 -> :sswitch_2
        0x3c4250ef -> :sswitch_1
        0x455be7a7 -> :sswitch_0
    .end sparse-switch
.end method
