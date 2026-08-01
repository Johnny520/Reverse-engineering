.class public final enum Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum ACORN_RISCOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum AMIGA:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum ATARI_TOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum CPM:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum FAT:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum HPFS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum MACINTOSH:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum NTFS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum QDOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum TOPS_20:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum UNIX:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum UNKNOWN:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum VMS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum VM_CMS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

.field public static final enum Z_SYSTEM:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;


# instance fields
.field private final type:I


# direct methods
.method private static synthetic $values()[Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;
    .locals 15

    .line 1
    sget-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->ACORN_RISCOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->AMIGA:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 4
    .line 5
    sget-object v2, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->ATARI_TOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 6
    .line 7
    sget-object v3, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->CPM:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 8
    .line 9
    sget-object v4, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->FAT:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 10
    .line 11
    sget-object v5, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->HPFS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 12
    .line 13
    sget-object v6, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->MACINTOSH:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 14
    .line 15
    sget-object v7, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->NTFS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 16
    .line 17
    sget-object v8, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->QDOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 18
    .line 19
    sget-object v9, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->TOPS_20:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 20
    .line 21
    sget-object v10, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->UNIX:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 22
    .line 23
    sget-object v11, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->UNKNOWN:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 24
    .line 25
    sget-object v12, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->VM_CMS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 26
    .line 27
    sget-object v13, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->VMS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 28
    .line 29
    sget-object v14, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->Z_SYSTEM:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 30
    .line 31
    filled-new-array/range {v0 .. v14}, [Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 2
    .line 3
    const-string v1, "ACORN_RISCOS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xd

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->ACORN_RISCOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 12
    .line 13
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 14
    .line 15
    const-string v1, "AMIGA"

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v0, v1, v4, v4}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->AMIGA:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 22
    .line 23
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 24
    .line 25
    const-string v1, "ATARI_TOS"

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    const/4 v5, 0x5

    .line 29
    invoke-direct {v0, v1, v4, v5}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->ATARI_TOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 33
    .line 34
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 35
    .line 36
    const-string v1, "CPM"

    .line 37
    .line 38
    const/4 v6, 0x3

    .line 39
    const/16 v7, 0x9

    .line 40
    .line 41
    invoke-direct {v0, v1, v6, v7}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->CPM:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 45
    .line 46
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 47
    .line 48
    const-string v1, "FAT"

    .line 49
    .line 50
    const/4 v8, 0x4

    .line 51
    invoke-direct {v0, v1, v8, v2}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->FAT:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 55
    .line 56
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 57
    .line 58
    const-string v1, "HPFS"

    .line 59
    .line 60
    const/4 v2, 0x6

    .line 61
    invoke-direct {v0, v1, v5, v2}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->HPFS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 65
    .line 66
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 67
    .line 68
    const-string v1, "MACINTOSH"

    .line 69
    .line 70
    const/4 v5, 0x7

    .line 71
    invoke-direct {v0, v1, v2, v5}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->MACINTOSH:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 75
    .line 76
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 77
    .line 78
    const-string v1, "NTFS"

    .line 79
    .line 80
    const/16 v2, 0xb

    .line 81
    .line 82
    invoke-direct {v0, v1, v5, v2}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 83
    .line 84
    .line 85
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->NTFS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 86
    .line 87
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 88
    .line 89
    const-string v1, "QDOS"

    .line 90
    .line 91
    const/16 v5, 0x8

    .line 92
    .line 93
    const/16 v9, 0xc

    .line 94
    .line 95
    invoke-direct {v0, v1, v5, v9}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 96
    .line 97
    .line 98
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->QDOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 99
    .line 100
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 101
    .line 102
    const-string v1, "TOPS_20"

    .line 103
    .line 104
    const/16 v10, 0xa

    .line 105
    .line 106
    invoke-direct {v0, v1, v7, v10}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 107
    .line 108
    .line 109
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->TOPS_20:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 110
    .line 111
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 112
    .line 113
    const-string v1, "UNIX"

    .line 114
    .line 115
    invoke-direct {v0, v1, v10, v6}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 116
    .line 117
    .line 118
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->UNIX:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 119
    .line 120
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 121
    .line 122
    const-string v1, "UNKNOWN"

    .line 123
    .line 124
    const/16 v6, 0xff

    .line 125
    .line 126
    invoke-direct {v0, v1, v2, v6}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 127
    .line 128
    .line 129
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->UNKNOWN:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 130
    .line 131
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 132
    .line 133
    const-string v1, "VM_CMS"

    .line 134
    .line 135
    invoke-direct {v0, v1, v9, v8}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 136
    .line 137
    .line 138
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->VM_CMS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 139
    .line 140
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 141
    .line 142
    const-string v1, "VMS"

    .line 143
    .line 144
    invoke-direct {v0, v1, v3, v4}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 145
    .line 146
    .line 147
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->VMS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 148
    .line 149
    new-instance v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 150
    .line 151
    const-string v1, "Z_SYSTEM"

    .line 152
    .line 153
    const/16 v2, 0xe

    .line 154
    .line 155
    invoke-direct {v0, v1, v2, v5}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;-><init>(Ljava/lang/String;II)V

    .line 156
    .line 157
    .line 158
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->Z_SYSTEM:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 159
    .line 160
    invoke-static {}, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->$values()[Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    sput-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->$VALUES:[Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 165
    .line 166
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->type:I

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000(Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;)I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->type:I

    .line 2
    .line 3
    return p0
.end method

.method public static from(I)Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;
    .locals 1

    .line 1
    const/16 v0, 0xff

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->UNKNOWN:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->ACORN_RISCOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_1
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->QDOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_2
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->NTFS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_3
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->TOPS_20:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_4
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->CPM:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_5
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->Z_SYSTEM:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_6
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->MACINTOSH:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_7
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->HPFS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_8
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->ATARI_TOS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_9
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->VM_CMS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_a
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->UNIX:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_b
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->VMS:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_c
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->AMIGA:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_d
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->FAT:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_0
    sget-object p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->UNKNOWN:Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 54
    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->$VALUES:[Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public type()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/compress/compressors/gzip/GzipParameters$OS;->type:I

    .line 2
    .line 3
    return p0
.end method
