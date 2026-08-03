.class public final enum Lv7/b;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum h:Lv7/b;

.field public static final i:[Lv7/b;

.field public static final synthetic j:[Lv7/b;


# instance fields
.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lv7/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x1000000

    .line 5
    .line 6
    const-string v3, "FORMATS"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lv7/b;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lv7/b;->h:Lv7/b;

    .line 12
    .line 13
    new-instance v1, Lv7/b;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const v3, 0x1000001

    .line 17
    .line 18
    .line 19
    const-string v4, "MIN"

    .line 20
    .line 21
    invoke-direct {v1, v4, v2, v3}, Lv7/b;-><init>(Ljava/lang/String;II)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lv7/b;

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    const v4, 0x1000002

    .line 28
    .line 29
    .line 30
    const-string v5, "MAX"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, Lv7/b;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Lv7/b;

    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    const v5, 0x1000003

    .line 39
    .line 40
    .line 41
    const-string v6, "L10N"

    .line 42
    .line 43
    invoke-direct {v3, v6, v4, v5}, Lv7/b;-><init>(Ljava/lang/String;II)V

    .line 44
    .line 45
    .line 46
    new-instance v4, Lv7/b;

    .line 47
    .line 48
    const/4 v5, 0x4

    .line 49
    const v6, 0x1000004

    .line 50
    .line 51
    .line 52
    const-string v7, "OTHER"

    .line 53
    .line 54
    invoke-direct {v4, v7, v5, v6}, Lv7/b;-><init>(Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    new-instance v5, Lv7/b;

    .line 58
    .line 59
    const/4 v6, 0x5

    .line 60
    const v7, 0x1000005

    .line 61
    .line 62
    .line 63
    const-string v8, "ZERO"

    .line 64
    .line 65
    invoke-direct {v5, v8, v6, v7}, Lv7/b;-><init>(Ljava/lang/String;II)V

    .line 66
    .line 67
    .line 68
    new-instance v6, Lv7/b;

    .line 69
    .line 70
    const/4 v7, 0x6

    .line 71
    const v8, 0x1000006

    .line 72
    .line 73
    .line 74
    const-string v9, "ONE"

    .line 75
    .line 76
    invoke-direct {v6, v9, v7, v8}, Lv7/b;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    new-instance v7, Lv7/b;

    .line 80
    .line 81
    const/4 v8, 0x7

    .line 82
    const v9, 0x1000007

    .line 83
    .line 84
    .line 85
    const-string v10, "TWO"

    .line 86
    .line 87
    invoke-direct {v7, v10, v8, v9}, Lv7/b;-><init>(Ljava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    new-instance v8, Lv7/b;

    .line 91
    .line 92
    const/16 v9, 0x8

    .line 93
    .line 94
    const v10, 0x1000008

    .line 95
    .line 96
    .line 97
    const-string v11, "FEW"

    .line 98
    .line 99
    invoke-direct {v8, v11, v9, v10}, Lv7/b;-><init>(Ljava/lang/String;II)V

    .line 100
    .line 101
    .line 102
    new-instance v9, Lv7/b;

    .line 103
    .line 104
    const/16 v10, 0x9

    .line 105
    .line 106
    const v11, 0x1000009

    .line 107
    .line 108
    .line 109
    const-string v12, "MANY"

    .line 110
    .line 111
    invoke-direct {v9, v12, v10, v11}, Lv7/b;-><init>(Ljava/lang/String;II)V

    .line 112
    .line 113
    .line 114
    filled-new-array/range {v0 .. v9}, [Lv7/b;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sput-object v0, Lv7/b;->j:[Lv7/b;

    .line 119
    .line 120
    invoke-static {}, Lv7/b;->values()[Lv7/b;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sput-object v0, Lv7/b;->i:[Lv7/b;

    .line 125
    .line 126
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lv7/b;->g:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lv7/b;
    .locals 1

    .line 1
    const-class v0, Lv7/b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv7/b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lv7/b;
    .locals 1

    .line 1
    sget-object v0, Lv7/b;->j:[Lv7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lv7/b;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lv7/b;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ly7/a;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
