.class public final enum Lha/t;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum h:Lha/t;

.field public static final enum i:Lha/t;

.field public static final enum j:Lha/t;

.field public static final enum k:Lha/t;

.field public static final enum l:Lha/t;

.field public static final synthetic m:[Lha/t;


# instance fields
.field public final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lha/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "\u6587\u5b57"

    .line 5
    .line 6
    const-string v3, "TEXT"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lha/t;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lha/t;->h:Lha/t;

    .line 12
    .line 13
    new-instance v1, Lha/t;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "\u56fe\u7247"

    .line 17
    .line 18
    const-string v4, "IMAGE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lha/t;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lha/t;->i:Lha/t;

    .line 24
    .line 25
    new-instance v2, Lha/t;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v4, "\u89c6\u9891"

    .line 29
    .line 30
    const-string v5, "VIDEO"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, Lha/t;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lha/t;->j:Lha/t;

    .line 36
    .line 37
    new-instance v3, Lha/t;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-string v5, "\u5b9e\u51b5"

    .line 41
    .line 42
    const-string v6, "LIVE_PHOTO"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, Lha/t;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v3, Lha/t;->k:Lha/t;

    .line 48
    .line 49
    new-instance v4, Lha/t;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    const-string v6, "\u672a\u77e5"

    .line 53
    .line 54
    const-string v7, "UNKNOWN"

    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v6}, Lha/t;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v4, Lha/t;->l:Lha/t;

    .line 60
    .line 61
    filled-new-array {v0, v1, v2, v3, v4}, [Lha/t;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lha/t;->m:[Lha/t;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lha/t;->g:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lha/t;
    .locals 1

    .line 1
    const-class v0, Lha/t;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lj8/b;->g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lha/t;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lha/t;
    .locals 1

    .line 1
    sget-object v0, Lha/t;->m:[Lha/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lha/t;

    .line 8
    .line 9
    return-object v0
.end method
