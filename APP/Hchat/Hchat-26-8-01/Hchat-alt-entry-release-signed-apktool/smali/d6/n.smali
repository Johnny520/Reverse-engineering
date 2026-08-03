.class public abstract Ld6/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ld6/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ld6/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ld6/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ld6/n;->a:Ld6/m;

    .line 8
    .line 9
    return-void
.end method

.method public static a(II)V
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "bad utf-8 byte "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    new-array v3, v2, [C

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    move v5, v4

    .line 15
    :goto_0
    const/16 v6, 0x10

    .line 16
    .line 17
    if-ge v5, v2, :cond_0

    .line 18
    .line 19
    rsub-int/lit8 v7, v5, 0x1

    .line 20
    .line 21
    and-int/lit8 v8, p0, 0xf

    .line 22
    .line 23
    invoke-static {v8, v6}, Ljava/lang/Character;->forDigit(II)C

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    aput-char v6, v3, v7

    .line 28
    .line 29
    shr-int/lit8 p0, p0, 0x4

    .line 30
    .line 31
    add-int/lit8 v5, v5, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 35
    .line 36
    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, " at offset "

    .line 43
    .line 44
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const/16 p0, 0x8

    .line 48
    .line 49
    new-array v2, p0, [C

    .line 50
    .line 51
    :goto_1
    if-ge v4, p0, :cond_1

    .line 52
    .line 53
    rsub-int/lit8 v3, v4, 0x7

    .line 54
    .line 55
    and-int/lit8 v5, p1, 0xf

    .line 56
    .line 57
    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    aput-char v5, v2, v3

    .line 62
    .line 63
    shr-int/lit8 p1, p1, 0x4

    .line 64
    .line 65
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 69
    .line 70
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method
