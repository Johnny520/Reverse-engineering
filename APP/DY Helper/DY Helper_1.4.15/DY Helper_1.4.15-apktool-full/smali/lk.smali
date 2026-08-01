.class public abstract Llk;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lmk;

    .line 2
    .line 3
    const/4 v3, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    const-string v1, "avatar"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const-string v4, "\u5934\u50cf"

    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lmk;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    const/4 v6, 0x1

    .line 17
    const-string v2, "name"

    .line 18
    .line 19
    const-string v5, "\u6635\u79f0"

    .line 20
    .line 21
    invoke-direct/range {v1 .. v6}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lmk;

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    const/4 v7, 0x1

    .line 28
    const-string v3, "content"

    .line 29
    .line 30
    const-string v6, "\u5185\u5bb9"

    .line 31
    .line 32
    invoke-direct/range {v2 .. v7}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Lmk;

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v8, 0x1

    .line 39
    const-string v4, "reply"

    .line 40
    .line 41
    const-string v7, "\u56de\u590d\u6309\u94ae"

    .line 42
    .line 43
    invoke-direct/range {v3 .. v8}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    new-instance v4, Lmk;

    .line 47
    .line 48
    const/4 v7, 0x1

    .line 49
    const/4 v9, 0x1

    .line 50
    const-string v5, "time"

    .line 51
    .line 52
    const-string v8, "\u53d1\u5e03\u65f6\u95f4"

    .line 53
    .line 54
    invoke-direct/range {v4 .. v9}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    new-instance v5, Lmk;

    .line 58
    .line 59
    const/4 v8, 0x1

    .line 60
    const/4 v10, 0x1

    .line 61
    const-string v6, "ip_region"

    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    const-string v9, "IP \u5c5e\u5730"

    .line 65
    .line 66
    invoke-direct/range {v5 .. v10}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    new-instance v6, Lmk;

    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    const/4 v11, 0x1

    .line 73
    const-string v7, "expand_comments"

    .line 74
    .line 75
    const/4 v8, 0x0

    .line 76
    const-string v10, "\u5c55\u5f00\u8bc4\u8bba"

    .line 77
    .line 78
    invoke-direct/range {v6 .. v11}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 79
    .line 80
    .line 81
    new-instance v7, Lmk;

    .line 82
    .line 83
    const/4 v10, 0x1

    .line 84
    const/4 v12, 0x0

    .line 85
    const-string v8, "like_area"

    .line 86
    .line 87
    const/4 v9, 0x1

    .line 88
    const-string v11, "\u70b9\u8d5e\u533a\u57df"

    .line 89
    .line 90
    invoke-direct/range {v7 .. v12}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    new-instance v8, Lmk;

    .line 94
    .line 95
    const/4 v11, 0x1

    .line 96
    const/4 v13, 0x1

    .line 97
    const-string v9, "like_icon"

    .line 98
    .line 99
    const-string v12, "\u70b9\u8d5e\u56fe\u6807"

    .line 100
    .line 101
    invoke-direct/range {v8 .. v13}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    new-instance v9, Lmk;

    .line 105
    .line 106
    const/4 v12, 0x1

    .line 107
    const/4 v14, 0x1

    .line 108
    const-string v10, "like_count"

    .line 109
    .line 110
    const-string v13, "\u70b9\u8d5e\u6570\u91cf"

    .line 111
    .line 112
    invoke-direct/range {v9 .. v14}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    new-instance v10, Lmk;

    .line 116
    .line 117
    const/4 v13, 0x1

    .line 118
    const/4 v15, 0x1

    .line 119
    const-string v11, "bury"

    .line 120
    .line 121
    const-string v14, "\u8e29\u6309\u94ae"

    .line 122
    .line 123
    invoke-direct/range {v10 .. v15}, Lmk;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 124
    .line 125
    .line 126
    filled-new-array/range {v0 .. v10}, [Lmk;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sput-object v0, Llk;->α:Ljava/util/List;

    .line 135
    .line 136
    return-void
.end method
