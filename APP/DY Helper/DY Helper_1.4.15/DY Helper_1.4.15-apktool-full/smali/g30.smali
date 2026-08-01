.class public final enum Lg30;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic θ:[Lg30;


# instance fields
.field public final ε:Lkx;

.field public final ζ:Ljava/lang/String;

.field public final η:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lg30;

    .line 2
    .line 3
    const-string v6, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"

    .line 4
    .line 5
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    const-string v1, "PLAY_H264"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    sget-object v3, Lkx;->И:Lkx;

    .line 13
    .line 14
    const-string v4, "play_addr_h264"

    .line 15
    .line 16
    invoke-direct/range {v0 .. v5}, Lg30;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lg30;

    .line 20
    .line 21
    const-string v11, "play_addr"

    .line 22
    .line 23
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v12

    .line 27
    const-string v8, "PLAY"

    .line 28
    .line 29
    const/4 v9, 0x1

    .line 30
    sget-object v10, Lkx;->К:Lkx;

    .line 31
    .line 32
    move-object v7, v1

    .line 33
    invoke-direct/range {v7 .. v12}, Lg30;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lg30;

    .line 37
    .line 38
    const-string v11, "play_addr_265"

    .line 39
    .line 40
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    const-string v8, "PLAY_H265"

    .line 45
    .line 46
    const/4 v9, 0x2

    .line 47
    sget-object v10, Lkx;->Л:Lkx;

    .line 48
    .line 49
    move-object v7, v2

    .line 50
    invoke-direct/range {v7 .. v12}, Lg30;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v3, Lg30;

    .line 54
    .line 55
    const-string v9, "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"

    .line 56
    .line 57
    invoke-static {v9}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    const-string v4, "PLAY_LOWBR"

    .line 62
    .line 63
    const/4 v5, 0x3

    .line 64
    sget-object v6, Lkx;->М:Lkx;

    .line 65
    .line 66
    const-string v7, "play_addr_lowbr"

    .line 67
    .line 68
    invoke-direct/range {v3 .. v8}, Lg30;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v4, Lg30;

    .line 72
    .line 73
    const-string v14, "bit_rate"

    .line 74
    .line 75
    const-string v15, "java.util.List"

    .line 76
    .line 77
    const-string v11, "BIT_RATE"

    .line 78
    .line 79
    const/4 v12, 0x4

    .line 80
    sget-object v13, Lkx;->Н:Lkx;

    .line 81
    .line 82
    move-object v10, v4

    .line 83
    invoke-direct/range {v10 .. v15}, Lg30;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance v5, Lg30;

    .line 87
    .line 88
    const-string v14, "download_addr"

    .line 89
    .line 90
    invoke-static {v9}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v15

    .line 94
    const-string v11, "DOWNLOAD"

    .line 95
    .line 96
    const/4 v12, 0x5

    .line 97
    sget-object v13, Lkx;->О:Lkx;

    .line 98
    .line 99
    move-object v10, v5

    .line 100
    invoke-direct/range {v10 .. v15}, Lg30;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    new-instance v6, Lg30;

    .line 104
    .line 105
    const-string v14, "new_download_addr"

    .line 106
    .line 107
    invoke-static {v9}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v15

    .line 111
    const-string v11, "NEW_DOWNLOAD"

    .line 112
    .line 113
    const/4 v12, 0x6

    .line 114
    sget-object v13, Lkx;->П:Lkx;

    .line 115
    .line 116
    move-object v10, v6

    .line 117
    invoke-direct/range {v10 .. v15}, Lg30;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v7, Lg30;

    .line 121
    .line 122
    const-string v11, "has_watermark"

    .line 123
    .line 124
    const-string v12, "boolean"

    .line 125
    .line 126
    const-string v8, "HAS_WATERMARK"

    .line 127
    .line 128
    const/4 v9, 0x7

    .line 129
    sget-object v10, Lkx;->Р:Lkx;

    .line 130
    .line 131
    invoke-direct/range {v7 .. v12}, Lg30;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    filled-new-array/range {v0 .. v7}, [Lg30;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sput-object v0, Lg30;->θ:[Lg30;

    .line 139
    .line 140
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILkx;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lg30;->ε:Lkx;

    .line 5
    .line 6
    iput-object p4, p0, Lg30;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p5, p0, Lg30;->η:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lg30;
    .locals 1

    .line 1
    const-class v0, Lg30;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lg30;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lg30;
    .locals 1

    .line 1
    sget-object v0, Lg30;->θ:[Lg30;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lg30;

    .line 8
    .line 9
    return-object v0
.end method
