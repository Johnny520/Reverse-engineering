.class public final enum Lc7/g;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum h:Lc7/g;

.field public static final enum i:Lc7/g;

.field public static final enum j:Lc7/g;

.field public static final enum k:Lc7/g;

.field public static final enum l:Lc7/g;

.field public static final enum m:Lc7/g;

.field public static final n:[Lc7/g;

.field public static final synthetic o:[Lc7/g;


# instance fields
.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lc7/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x2014b50

    .line 5
    .line 6
    .line 7
    const-string v3, "CENTRAL_FILE"

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lc7/g;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lc7/g;->h:Lc7/g;

    .line 13
    .line 14
    new-instance v1, Lc7/g;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const v3, 0x4034b50

    .line 18
    .line 19
    .line 20
    const-string v4, "LOCAL_FILE"

    .line 21
    .line 22
    invoke-direct {v1, v4, v2, v3}, Lc7/g;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lc7/g;->i:Lc7/g;

    .line 26
    .line 27
    new-instance v2, Lc7/g;

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    const v4, 0x8074b50

    .line 31
    .line 32
    .line 33
    const-string v5, "DATA_DESCRIPTOR"

    .line 34
    .line 35
    invoke-direct {v2, v5, v3, v4}, Lc7/g;-><init>(Ljava/lang/String;II)V

    .line 36
    .line 37
    .line 38
    sput-object v2, Lc7/g;->j:Lc7/g;

    .line 39
    .line 40
    new-instance v3, Lc7/g;

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    const v5, 0x6064b50

    .line 44
    .line 45
    .line 46
    const-string v6, "ZIP64_RECORD"

    .line 47
    .line 48
    invoke-direct {v3, v6, v4, v5}, Lc7/g;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    sput-object v3, Lc7/g;->k:Lc7/g;

    .line 52
    .line 53
    new-instance v4, Lc7/g;

    .line 54
    .line 55
    const/4 v5, 0x4

    .line 56
    const v6, 0x7064b50

    .line 57
    .line 58
    .line 59
    const-string v7, "ZIP64_LOCATOR"

    .line 60
    .line 61
    invoke-direct {v4, v7, v5, v6}, Lc7/g;-><init>(Ljava/lang/String;II)V

    .line 62
    .line 63
    .line 64
    sput-object v4, Lc7/g;->l:Lc7/g;

    .line 65
    .line 66
    new-instance v5, Lc7/g;

    .line 67
    .line 68
    const/4 v6, 0x5

    .line 69
    const v7, 0x6054b50

    .line 70
    .line 71
    .line 72
    const-string v8, "END_RECORD"

    .line 73
    .line 74
    invoke-direct {v5, v8, v6, v7}, Lc7/g;-><init>(Ljava/lang/String;II)V

    .line 75
    .line 76
    .line 77
    sput-object v5, Lc7/g;->m:Lc7/g;

    .line 78
    .line 79
    filled-new-array/range {v0 .. v5}, [Lc7/g;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Lc7/g;->o:[Lc7/g;

    .line 84
    .line 85
    invoke-static {}, Lc7/g;->values()[Lc7/g;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lc7/g;->n:[Lc7/g;

    .line 90
    .line 91
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lc7/g;->g:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc7/g;
    .locals 1

    .line 1
    const-class v0, Lc7/g;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lc7/g;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lc7/g;
    .locals 1

    .line 1
    sget-object v0, Lc7/g;->o:[Lc7/g;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lc7/g;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lc7/g;

    .line 8
    .line 9
    return-object v0
.end method
