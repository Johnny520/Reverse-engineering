.class final Lcom/mr/elaris/InAppSettingsCategoryText;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static summaryOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "groupfile"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "\u6587\u4ef6\u4fdd\u5b58\u3001\u7fa4\u7ba1\u4e0e\u7fa4\u901a\u77e5"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "chat_message"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string p0, "\u672a\u8bfb\u6570\u91cf\u3001\u6d88\u606f\u65f6\u95f4\u3001\u64a4\u56de\u4e0e\u56de\u590d\u624b\u52bf"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string v0, "repeater"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const-string p0, "\u590d\u8bfb\u65b9\u5f0f\u3001\u6309\u94ae\u663e\u793a\u4e0e\u81ea\u5b9a\u4e49\u56fe\u6807"

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    const-string v0, "picture"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const-string p0, "\u539f\u56fe\u3001\u95ea\u7167\u3001\u8868\u60c5\u4e0e\u56fe\u7247\u5916\u663e"

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    const-string v0, "cleanse"

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    const-string p0, "\u4e3b\u9898\u3001\u754c\u9762\u3001\u8d44\u6599\u5361\u3001QQ \u79c0\u4e0e\u5934\u50cf\u6302\u4ef6"

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    const-string v0, "misc"

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    const-string p0, "\u626b\u7801\u3001\u7f51\u9875\u3001\u8c03\u8bd5\u3001\u8bbe\u5907\u4e0e\u6a21\u5757\u914d\u7f6e"

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    const-string v0, "feedback"

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_6

    .line 74
    .line 75
    const-string p0, "TG \u9891\u9053"

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_6
    const-string p0, "Elaris \u8bbe\u7f6e"

    .line 79
    .line 80
    return-object p0
.end method

.method public static titleOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "groupfile"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "\u7fa4\u804a"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "chat_message"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string p0, "\u6d88\u606f"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string v0, "repeater"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const-string p0, "\u590d\u8bfb"

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    const-string v0, "picture"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const-string p0, "\u56fe\u7247"

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    const-string v0, "cleanse"

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    const-string p0, "\u51c0\u5316"

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    const-string v0, "misc"

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    const-string p0, "\u6742\u9879"

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    const-string v0, "feedback"

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_6

    .line 74
    .line 75
    const-string p0, "\u4ea4\u6d41\u4e0e\u53cd\u9988"

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_6
    const-string p0, "Elaris"

    .line 79
    .line 80
    return-object p0
.end method
