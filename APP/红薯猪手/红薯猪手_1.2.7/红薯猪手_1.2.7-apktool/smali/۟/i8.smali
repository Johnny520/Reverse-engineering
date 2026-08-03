.class public abstract L۟/i8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/i8$a;
    }
.end annotation


# static fields
.field public static final ۥ:L۟/i8$a;

.field public static final ۥ۟:L۟/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L۟/i8$a;

    .line 2
    .line 3
    invoke-direct {v0}, L۟/i8$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L۟/i8;->ۥ:L۟/i8$a;

    .line 7
    .line 8
    sget-object v0, L۟/d8;->ۥ:L۟/m4;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, L۟/m4$a;->ۥ:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x22

    .line 22
    .line 23
    if-lt v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 29
    :goto_1
    if-eqz v0, :cond_2

    .line 30
    .line 31
    new-instance v0, L۟/e8;

    .line 32
    .line 33
    invoke-direct {v0}, L۟/e8;-><init>()V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    new-instance v0, L۟/s2;

    .line 38
    .line 39
    invoke-direct {v0}, L۟/s2;-><init>()V

    .line 40
    .line 41
    .line 42
    :goto_2
    sput-object v0, L۟/i8;->ۥ۟:L۟/e;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract ۥ(I)I
.end method

.method public abstract ۥ۟()I
.end method

.method public ۥ۟۟(II)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-le p2, p1, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    if-eqz v2, :cond_5

    .line 9
    .line 10
    sub-int v2, p2, p1

    .line 11
    .line 12
    if-gtz v2, :cond_3

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    if-ne v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    invoke-virtual {p0}, L۟/i8;->ۥ۟()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-gt p1, v2, :cond_2

    .line 24
    .line 25
    if-ge v2, p2, :cond_2

    .line 26
    .line 27
    move v3, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move v3, v0

    .line 30
    :goto_1
    if-eqz v3, :cond_1

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    :goto_2
    neg-int p2, v2

    .line 34
    and-int/2addr p2, v2

    .line 35
    if-ne p2, v2, :cond_4

    .line 36
    .line 37
    invoke-static {v2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    rsub-int/lit8 p2, p2, 0x1f

    .line 42
    .line 43
    invoke-virtual {p0, p2}, L۟/i8;->ۥ(I)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    goto :goto_3

    .line 48
    :cond_4
    invoke-virtual {p0}, L۟/i8;->ۥ۟()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    ushr-int/2addr p2, v1

    .line 53
    rem-int v0, p2, v2

    .line 54
    .line 55
    sub-int/2addr p2, v0

    .line 56
    add-int/lit8 v3, v2, -0x1

    .line 57
    .line 58
    add-int/2addr v3, p2

    .line 59
    if-ltz v3, :cond_4

    .line 60
    .line 61
    move p2, v0

    .line 62
    :goto_3
    add-int/2addr p1, p2

    .line 63
    return p1

    .line 64
    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    const-string v0, "from"

    .line 73
    .line 74
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const-string v0, "until"

    .line 78
    .line 79
    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v1, "Random range is empty: ["

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p1, ", "

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p1, ")."

    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p2
.end method
