.class public final enum Ls6/a;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final h:Ll3/w;

.field public static final synthetic i:[Ls6/a;

.field public static final synthetic j:Lzf/b;


# instance fields
.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Ls6/a;

    .line 2
    .line 3
    const-string v1, "PUBLIC"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ls6/a;

    .line 11
    .line 12
    const-string v2, "PRIVATE"

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    invoke-direct {v1, v2, v3, v4}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Ls6/a;

    .line 19
    .line 20
    const-string v3, "PROTECTED"

    .line 21
    .line 22
    const/4 v5, 0x4

    .line 23
    invoke-direct {v2, v3, v4, v5}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Ls6/a;

    .line 27
    .line 28
    const-string v4, "STATIC"

    .line 29
    .line 30
    const/4 v6, 0x3

    .line 31
    const/16 v7, 0x8

    .line 32
    .line 33
    invoke-direct {v3, v4, v6, v7}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 34
    .line 35
    .line 36
    new-instance v4, Ls6/a;

    .line 37
    .line 38
    const-string v6, "FINAL"

    .line 39
    .line 40
    const/16 v8, 0x10

    .line 41
    .line 42
    invoke-direct {v4, v6, v5, v8}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    new-instance v5, Ls6/a;

    .line 46
    .line 47
    const/4 v6, 0x5

    .line 48
    const/16 v8, 0x20

    .line 49
    .line 50
    const-string v9, "SYNCHRONIZED"

    .line 51
    .line 52
    invoke-direct {v5, v9, v6, v8}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 53
    .line 54
    .line 55
    new-instance v6, Ls6/a;

    .line 56
    .line 57
    const/4 v8, 0x6

    .line 58
    const/16 v9, 0x40

    .line 59
    .line 60
    const-string v10, "VOLATILE"

    .line 61
    .line 62
    invoke-direct {v6, v10, v8, v9}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 63
    .line 64
    .line 65
    move v8, v7

    .line 66
    new-instance v7, Ls6/a;

    .line 67
    .line 68
    const/4 v9, 0x7

    .line 69
    const/16 v10, 0x80

    .line 70
    .line 71
    const-string v11, "TRANSIENT"

    .line 72
    .line 73
    invoke-direct {v7, v11, v9, v10}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 74
    .line 75
    .line 76
    move v9, v8

    .line 77
    new-instance v8, Ls6/a;

    .line 78
    .line 79
    const-string v10, "NATIVE"

    .line 80
    .line 81
    const/16 v11, 0x100

    .line 82
    .line 83
    invoke-direct {v8, v10, v9, v11}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 84
    .line 85
    .line 86
    new-instance v9, Ls6/a;

    .line 87
    .line 88
    const/16 v10, 0x9

    .line 89
    .line 90
    const/16 v11, 0x200

    .line 91
    .line 92
    const-string v12, "INTERFACE"

    .line 93
    .line 94
    invoke-direct {v9, v12, v10, v11}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 95
    .line 96
    .line 97
    new-instance v10, Ls6/a;

    .line 98
    .line 99
    const/16 v11, 0xa

    .line 100
    .line 101
    const/16 v12, 0x400

    .line 102
    .line 103
    const-string v13, "ABSTRACT"

    .line 104
    .line 105
    invoke-direct {v10, v13, v11, v12}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 106
    .line 107
    .line 108
    new-instance v11, Ls6/a;

    .line 109
    .line 110
    const/16 v12, 0xb

    .line 111
    .line 112
    const/16 v13, 0x800

    .line 113
    .line 114
    const-string v14, "STRICT"

    .line 115
    .line 116
    invoke-direct {v11, v14, v12, v13}, Ls6/a;-><init>(Ljava/lang/String;II)V

    .line 117
    .line 118
    .line 119
    filled-new-array/range {v0 .. v11}, [Ls6/a;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    sput-object v0, Ls6/a;->i:[Ls6/a;

    .line 124
    .line 125
    new-instance v1, Lzf/b;

    .line 126
    .line 127
    invoke-direct {v1, v0}, Lzf/b;-><init>([Ljava/lang/Enum;)V

    .line 128
    .line 129
    .line 130
    sput-object v1, Ls6/a;->j:Lzf/b;

    .line 131
    .line 132
    new-instance v0, Ll3/w;

    .line 133
    .line 134
    const/16 v1, 0x16

    .line 135
    .line 136
    invoke-direct {v0, v1}, Ll3/w;-><init>(I)V

    .line 137
    .line 138
    .line 139
    sput-object v0, Ls6/a;->h:Ll3/w;

    .line 140
    .line 141
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Ls6/a;->g:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ls6/a;
    .locals 1

    .line 1
    const-class v0, Ls6/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ls6/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ls6/a;
    .locals 1

    .line 1
    sget-object v0, Ls6/a;->i:[Ls6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ls6/a;

    .line 8
    .line 9
    return-object v0
.end method
