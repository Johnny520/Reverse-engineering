.class public final enum Lqe/l;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum g:Lqe/l;

.field public static final enum h:Lqe/l;

.field public static final enum i:Lqe/l;

.field public static final enum j:Lqe/l;

.field public static final enum k:Lqe/l;

.field public static final enum l:Lqe/l;

.field public static final enum m:Lqe/l;

.field public static final enum n:Lqe/l;

.field public static final synthetic o:[Lqe/l;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lqe/l;

    .line 2
    .line 3
    const-string v1, "EQUAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lqe/l;->g:Lqe/l;

    .line 10
    .line 11
    new-instance v1, Lqe/l;

    .line 12
    .line 13
    const-string v2, "NARROW"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lqe/l;->h:Lqe/l;

    .line 20
    .line 21
    new-instance v2, Lqe/l;

    .line 22
    .line 23
    const-string v3, "NARROW_BY_GENERIC"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lqe/l;->i:Lqe/l;

    .line 30
    .line 31
    new-instance v3, Lqe/l;

    .line 32
    .line 33
    const-string v4, "WIDER"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lqe/l;->j:Lqe/l;

    .line 40
    .line 41
    new-instance v4, Lqe/l;

    .line 42
    .line 43
    const-string v5, "WIDER_BY_GENERIC"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lqe/l;->k:Lqe/l;

    .line 50
    .line 51
    new-instance v5, Lqe/l;

    .line 52
    .line 53
    const-string v6, "CONFLICT"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lqe/l;->l:Lqe/l;

    .line 60
    .line 61
    new-instance v6, Lqe/l;

    .line 62
    .line 63
    const-string v7, "CONFLICT_BY_GENERIC"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v6, Lqe/l;->m:Lqe/l;

    .line 70
    .line 71
    new-instance v7, Lqe/l;

    .line 72
    .line 73
    const-string v8, "UNKNOWN"

    .line 74
    .line 75
    const/4 v9, 0x7

    .line 76
    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v7, Lqe/l;->n:Lqe/l;

    .line 80
    .line 81
    filled-new-array/range {v0 .. v7}, [Lqe/l;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lqe/l;->o:[Lqe/l;

    .line 86
    .line 87
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqe/l;
    .locals 1

    .line 1
    const-class v0, Lqe/l;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqe/l;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lqe/l;
    .locals 1

    .line 1
    sget-object v0, Lqe/l;->o:[Lqe/l;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lqe/l;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lqe/l;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()Lqe/l;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object v0, Lqe/l;->i:Lqe/l;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    sget-object v0, Lqe/l;->h:Lqe/l;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_2
    sget-object v0, Lqe/l;->k:Lqe/l;

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_3
    sget-object v0, Lqe/l;->j:Lqe/l;

    .line 28
    .line 29
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    sget-object v0, Lqe/l;->g:Lqe/l;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    sget-object v0, Lqe/l;->h:Lqe/l;

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lqe/l;->i:Lqe/l;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    sget-object v0, Lqe/l;->j:Lqe/l;

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lqe/l;->k:Lqe/l;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method
