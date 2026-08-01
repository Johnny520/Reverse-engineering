.class public final enum Lzu;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum λ:Lzu;

.field public static final synthetic μ:[Lzu;


# instance fields
.field public final ε:Ljava/lang/String;

.field public final ζ:Ljava/lang/String;

.field public final η:Ljava/lang/String;

.field public final θ:Ljava/lang/String;

.field public final ι:Ljava/lang/String;

.field public final κ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lzu;

    .line 2
    .line 3
    const-string v7, "download_path"

    .line 4
    .line 5
    const-string v8, "\u7559\u7a7a\u65f6\u4f7f\u7528\u7cfb\u7edf\u9ed8\u8ba4\u4e0b\u8f7d\u76ee\u5f55"

    .line 6
    .line 7
    const-string v1, "GENERAL"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const-string v3, "\u901a\u7528\u4e0b\u8f7d\u8def\u5f84"

    .line 11
    .line 12
    const-string v4, "\u901a\u7528"

    .line 13
    .line 14
    const-string v5, "download_path_template"

    .line 15
    .line 16
    const-string v6, "download_uri"

    .line 17
    .line 18
    invoke-direct/range {v0 .. v8}, Lzu;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lzu;->λ:Lzu;

    .line 22
    .line 23
    new-instance v1, Lzu;

    .line 24
    .line 25
    const-string v8, "download_path"

    .line 26
    .line 27
    const-string v9, "\u7559\u7a7a\u65f6\u8ddf\u968f\u901a\u7528\u4e0b\u8f7d\u8def\u5f84\u6a21\u677f"

    .line 28
    .line 29
    const-string v2, "VIDEO"

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const-string v4, "\u89c6\u9891\u4e0b\u8f7d\u8def\u5f84"

    .line 33
    .line 34
    const-string v5, "\u89c6\u9891"

    .line 35
    .line 36
    const-string v6, "video_download_path_template"

    .line 37
    .line 38
    const-string v7, "video_download_tree_uri"

    .line 39
    .line 40
    invoke-direct/range {v1 .. v9}, Lzu;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lzu;

    .line 44
    .line 45
    const-string v9, "download_path"

    .line 46
    .line 47
    const-string v10, "\u7559\u7a7a\u65f6\u8ddf\u968f\u901a\u7528\u4e0b\u8f7d\u8def\u5f84\u6a21\u677f"

    .line 48
    .line 49
    const-string v3, "IMAGE"

    .line 50
    .line 51
    const/4 v4, 0x2

    .line 52
    const-string v5, "\u56fe\u7247\u4e0b\u8f7d\u8def\u5f84"

    .line 53
    .line 54
    const-string v6, "\u56fe\u7247"

    .line 55
    .line 56
    const-string v7, "image_download_path_template"

    .line 57
    .line 58
    const-string v8, "image_download_tree_uri"

    .line 59
    .line 60
    invoke-direct/range {v2 .. v10}, Lzu;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Lzu;

    .line 64
    .line 65
    const-string v10, "download_path"

    .line 66
    .line 67
    const-string v11, "\u7559\u7a7a\u65f6\u8ddf\u968f\u901a\u7528\u4e0b\u8f7d\u8def\u5f84\u6a21\u677f"

    .line 68
    .line 69
    const-string v4, "ANIMATED"

    .line 70
    .line 71
    const/4 v5, 0x3

    .line 72
    const-string v6, "\u52a8\u56fe\u4e0b\u8f7d\u8def\u5f84"

    .line 73
    .line 74
    const-string v7, "\u52a8\u56fe"

    .line 75
    .line 76
    const-string v8, "animated_download_path_template"

    .line 77
    .line 78
    const-string v9, "animated_download_tree_uri"

    .line 79
    .line 80
    invoke-direct/range {v3 .. v11}, Lzu;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance v4, Lzu;

    .line 84
    .line 85
    const-string v11, "download_path"

    .line 86
    .line 87
    const-string v12, "\u7559\u7a7a\u65f6\u8ddf\u968f\u901a\u7528\u4e0b\u8f7d\u8def\u5f84\u6a21\u677f"

    .line 88
    .line 89
    const-string v5, "LIVE_PHOTO"

    .line 90
    .line 91
    const/4 v6, 0x4

    .line 92
    const-string v7, "LivePhoto \u4e0b\u8f7d\u8def\u5f84"

    .line 93
    .line 94
    const-string v8, "Live"

    .line 95
    .line 96
    const-string v9, "live_photo_download_path_template"

    .line 97
    .line 98
    const-string v10, "live_photo_download_tree_uri"

    .line 99
    .line 100
    invoke-direct/range {v4 .. v12}, Lzu;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    new-instance v5, Lzu;

    .line 104
    .line 105
    const-string v12, "audio_download_path"

    .line 106
    .line 107
    const-string v13, "\u7559\u7a7a\u65f6\u8ddf\u968f\u901a\u7528\u4e0b\u8f7d\u8def\u5f84\u6a21\u677f"

    .line 108
    .line 109
    const-string v6, "AUDIO"

    .line 110
    .line 111
    const/4 v7, 0x5

    .line 112
    const-string v8, "\u97f3\u4e50\u4e0b\u8f7d\u8def\u5f84"

    .line 113
    .line 114
    const-string v9, "\u97f3\u4e50"

    .line 115
    .line 116
    const-string v10, "audio_download_path_template"

    .line 117
    .line 118
    const-string v11, "audio_download_uri"

    .line 119
    .line 120
    invoke-direct/range {v5 .. v13}, Lzu;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    new-instance v6, Lzu;

    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const-string v14, "\u7559\u7a7a\u65f6\u8ddf\u968f\u901a\u7528\u4e0b\u8f7d\u8def\u5f84\u6a21\u677f"

    .line 127
    .line 128
    const-string v7, "EMOJI"

    .line 129
    .line 130
    const/4 v8, 0x6

    .line 131
    const-string v9, "\u8868\u60c5\u5305\u4e0b\u8f7d\u8def\u5f84"

    .line 132
    .line 133
    const-string v10, "\u8868\u60c5"

    .line 134
    .line 135
    const-string v11, "emoji_download_path_template"

    .line 136
    .line 137
    const-string v12, "emoji_download_tree_uri"

    .line 138
    .line 139
    invoke-direct/range {v6 .. v14}, Lzu;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    filled-new-array/range {v0 .. v6}, [Lzu;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sput-object v0, Lzu;->μ:[Lzu;

    .line 147
    .line 148
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lzu;->ε:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lzu;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p5, p0, Lzu;->η:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p6, p0, Lzu;->θ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p7, p0, Lzu;->ι:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p8, p0, Lzu;->κ:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lzu;
    .locals 1

    .line 1
    const-class v0, Lzu;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzu;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lzu;
    .locals 1

    .line 1
    sget-object v0, Lzu;->μ:[Lzu;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lzu;

    .line 8
    .line 9
    return-object v0
.end method
