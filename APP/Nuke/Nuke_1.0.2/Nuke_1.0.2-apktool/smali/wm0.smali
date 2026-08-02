.class public final enum Lwm0;
.super Ljava/lang/Enum;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final enum i:Lwm0;

.field public static final enum j:Lwm0;

.field public static final enum k:Lwm0;

.field public static final enum l:Lwm0;

.field public static final enum m:Lwm0;

.field public static final enum n:Lwm0;

.field public static final enum o:Lwm0;

.field public static final synthetic p:[Lwm0;

.field public static final synthetic q:Lyf0;


# instance fields
.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lwm0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x790b0121

    .line 5
    .line 6
    .line 7
    const-string v3, "CHAT"

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lwm0;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lwm0;->i:Lwm0;

    .line 13
    .line 14
    new-instance v1, Lwm0;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const v3, 0x790b0122

    .line 18
    .line 19
    .line 20
    const-string v4, "CONTACT"

    .line 21
    .line 22
    invoke-direct {v1, v4, v2, v3}, Lwm0;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lwm0;->j:Lwm0;

    .line 26
    .line 27
    new-instance v2, Lwm0;

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    const v4, 0x790b0135

    .line 31
    .line 32
    .line 33
    const-string v5, "EXPLORE"

    .line 34
    .line 35
    invoke-direct {v2, v5, v3, v4}, Lwm0;-><init>(Ljava/lang/String;II)V

    .line 36
    .line 37
    .line 38
    sput-object v2, Lwm0;->k:Lwm0;

    .line 39
    .line 40
    new-instance v3, Lwm0;

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    const v5, 0x790b0120

    .line 44
    .line 45
    .line 46
    const-string v6, "BEAUTIFY"

    .line 47
    .line 48
    invoke-direct {v3, v6, v4, v5}, Lwm0;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    sput-object v3, Lwm0;->l:Lwm0;

    .line 52
    .line 53
    new-instance v4, Lwm0;

    .line 54
    .line 55
    const/4 v5, 0x4

    .line 56
    const v6, 0x790b0137

    .line 57
    .line 58
    .line 59
    const-string v7, "SIMPLIFY"

    .line 60
    .line 61
    invoke-direct {v4, v7, v5, v6}, Lwm0;-><init>(Ljava/lang/String;II)V

    .line 62
    .line 63
    .line 64
    new-instance v5, Lwm0;

    .line 65
    .line 66
    const/4 v6, 0x5

    .line 67
    const v7, 0x790b0133

    .line 68
    .line 69
    .line 70
    const-string v8, "ENTERTAIN"

    .line 71
    .line 72
    invoke-direct {v5, v8, v6, v7}, Lwm0;-><init>(Ljava/lang/String;II)V

    .line 73
    .line 74
    .line 75
    sput-object v5, Lwm0;->m:Lwm0;

    .line 76
    .line 77
    new-instance v6, Lwm0;

    .line 78
    .line 79
    const/4 v7, 0x6

    .line 80
    const v8, 0x790b0134

    .line 81
    .line 82
    .line 83
    const-string v9, "EXPERIMENTAL"

    .line 84
    .line 85
    invoke-direct {v6, v9, v7, v8}, Lwm0;-><init>(Ljava/lang/String;II)V

    .line 86
    .line 87
    .line 88
    sput-object v6, Lwm0;->n:Lwm0;

    .line 89
    .line 90
    new-instance v7, Lwm0;

    .line 91
    .line 92
    const/4 v8, 0x7

    .line 93
    const v9, 0x790b0136

    .line 94
    .line 95
    .line 96
    const-string v10, "MODULE_SETTINGS_AND_DEBUG"

    .line 97
    .line 98
    invoke-direct {v7, v10, v8, v9}, Lwm0;-><init>(Ljava/lang/String;II)V

    .line 99
    .line 100
    .line 101
    sput-object v7, Lwm0;->o:Lwm0;

    .line 102
    .line 103
    filled-new-array/range {v0 .. v7}, [Lwm0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lwm0;->p:[Lwm0;

    .line 108
    .line 109
    new-instance v1, Lyf0;

    .line 110
    .line 111
    invoke-direct {v1, v0}, Lyf0;-><init>([Ljava/lang/Enum;)V

    .line 112
    .line 113
    .line 114
    sput-object v1, Lwm0;->q:Lyf0;

    .line 115
    .line 116
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lwm0;->h:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwm0;
    .locals 1

    .line 1
    const-class v0, Lwm0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwm0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lwm0;
    .locals 1

    .line 1
    sget-object v0, Lwm0;->p:[Lwm0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lwm0;

    .line 8
    .line 9
    return-object v0
.end method
