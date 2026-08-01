.class public final Lik0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lik0;

.field private static final b:[I

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lik0;

    .line 2
    .line 3
    invoke-direct {v0}, Lik0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lik0;->a:Lik0;

    .line 7
    .line 8
    const/16 v0, 0x70

    .line 9
    .line 10
    const/16 v1, 0x31

    .line 11
    .line 12
    const/16 v2, 0x4b

    .line 13
    .line 14
    const/16 v3, 0x78

    .line 15
    .line 16
    filled-new-array {v2, v3, v0, v1}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lik0;->b:[I

    .line 21
    .line 22
    const/16 v0, 0x8

    .line 23
    .line 24
    sput v0, Lik0;->c:I

    .line 25
    .line 26
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final varargs a([I)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    array-length v0, p1

    .line 7
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    array-length v0, p1

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v2, v0, :cond_0

    .line 15
    .line 16
    aget v4, p1, v2

    .line 17
    .line 18
    add-int/lit8 v5, v3, 0x1

    .line 19
    .line 20
    sget-object v6, Lik0;->b:[I

    .line 21
    .line 22
    array-length v7, v6

    .line 23
    rem-int/2addr v3, v7

    .line 24
    aget v3, v6, v3

    .line 25
    .line 26
    xor-int/2addr v3, v4

    .line 27
    int-to-char v3, v3

    .line 28
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {p0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    move v3, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    new-array p1, p1, [C

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/Character;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    add-int/lit8 v2, v1, 0x1

    .line 66
    .line 67
    aput-char v0, p1, v1

    .line 68
    .line 69
    move v1, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 72
    .line 73
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    .line 74
    .line 75
    .line 76
    return-object p0
.end method
