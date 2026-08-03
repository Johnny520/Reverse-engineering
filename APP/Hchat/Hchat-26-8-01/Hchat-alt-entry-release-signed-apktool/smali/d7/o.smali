.class public final Ld7/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final j:Ld7/o;

.field public static final k:Ld7/o;

.field public static final l:Ld7/o;

.field public static final m:Ld7/o;

.field public static final n:Ld7/o;

.field public static final o:Ld7/o;

.field public static final p:[Ld7/o;


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Ld7/o;

    .line 2
    .line 3
    const-string v1, "V2"

    .line 4
    .line 5
    const v2, 0x7109871a

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v0, v1, v2, v3}, Ld7/o;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Ld7/o;->j:Ld7/o;

    .line 13
    .line 14
    new-instance v1, Ld7/o;

    .line 15
    .line 16
    const v2, -0xfac9740

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    const-string v5, "V3"

    .line 21
    .line 22
    invoke-direct {v1, v5, v2, v4}, Ld7/o;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Ld7/o;->k:Ld7/o;

    .line 26
    .line 27
    new-instance v2, Ld7/o;

    .line 28
    .line 29
    const v4, 0x1b93ad61

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    const-string v6, "V31"

    .line 34
    .line 35
    invoke-direct {v2, v6, v4, v5}, Ld7/o;-><init>(Ljava/lang/String;II)V

    .line 36
    .line 37
    .line 38
    sput-object v2, Ld7/o;->l:Ld7/o;

    .line 39
    .line 40
    move v4, v3

    .line 41
    new-instance v3, Ld7/o;

    .line 42
    .line 43
    const v5, 0x2b09189e

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x3

    .line 47
    const-string v7, "STAMP_V1"

    .line 48
    .line 49
    invoke-direct {v3, v7, v5, v6}, Ld7/o;-><init>(Ljava/lang/String;II)V

    .line 50
    .line 51
    .line 52
    sput-object v3, Ld7/o;->m:Ld7/o;

    .line 53
    .line 54
    move v5, v4

    .line 55
    new-instance v4, Ld7/o;

    .line 56
    .line 57
    const v6, 0x6dff800d

    .line 58
    .line 59
    .line 60
    const/4 v7, 0x4

    .line 61
    const-string v8, "STAMP_V2"

    .line 62
    .line 63
    invoke-direct {v4, v8, v6, v7}, Ld7/o;-><init>(Ljava/lang/String;II)V

    .line 64
    .line 65
    .line 66
    sput-object v4, Ld7/o;->n:Ld7/o;

    .line 67
    .line 68
    move v6, v5

    .line 69
    new-instance v5, Ld7/o;

    .line 70
    .line 71
    const v7, 0x42726577

    .line 72
    .line 73
    .line 74
    const/16 v8, 0x270f

    .line 75
    .line 76
    const-string v9, "PADDING"

    .line 77
    .line 78
    invoke-direct {v5, v9, v7, v8}, Ld7/o;-><init>(Ljava/lang/String;II)V

    .line 79
    .line 80
    .line 81
    sput-object v5, Ld7/o;->o:Ld7/o;

    .line 82
    .line 83
    move v7, v6

    .line 84
    new-instance v6, Ld7/o;

    .line 85
    .line 86
    const-string v8, "NULL"

    .line 87
    .line 88
    const/16 v9, 0x3e7

    .line 89
    .line 90
    invoke-direct {v6, v8, v7, v9}, Ld7/o;-><init>(Ljava/lang/String;II)V

    .line 91
    .line 92
    .line 93
    filled-new-array/range {v0 .. v6}, [Ld7/o;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sput-object v0, Ld7/o;->p:[Ld7/o;

    .line 98
    .line 99
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld7/o;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Ld7/o;->h:I

    .line 7
    .line 8
    iput p3, p0, Ld7/o;->i:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Ld7/o;

    .line 2
    .line 3
    iget v0, p0, Ld7/o;->i:I

    .line 4
    .line 5
    iget p1, p1, Ld7/o;->i:I

    .line 6
    .line 7
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Ld7/o;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Ld7/o;

    .line 18
    .line 19
    iget v2, p0, Ld7/o;->h:I

    .line 20
    .line 21
    iget p1, p1, Ld7/o;->h:I

    .line 22
    .line 23
    if-ne v2, p1, :cond_2

    .line 24
    .line 25
    return v0

    .line 26
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Ld7/o;->h:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Ld7/o;->g:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "UNKNOWN("

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget v1, p0, Ld7/o;->h:I

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    invoke-static {v1, v2}, Ly7/a;->k(II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ")"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method
