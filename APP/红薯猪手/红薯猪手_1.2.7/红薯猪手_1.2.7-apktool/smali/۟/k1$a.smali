.class public final L۟/k1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements L۟/n4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/k1;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "L\u06df/g4;",
        ">;",
        "L\u06df/n4;"
    }
.end annotation


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۠:L۟/g4;

.field public ۥ۟ۡ:I

.field public final synthetic ۥ۟ۢ:L۟/k1;


# direct methods
.method public constructor <init>(L۟/k1;)V
    .locals 4

    .line 1
    iput-object p1, p0, L۟/k1$a;->ۥ۟ۢ:L۟/k1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, L۟/k1$a;->ۥ:I

    .line 8
    .line 9
    iget v0, p1, L۟/k1;->ۥ۟:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object p1, p1, L۟/k1;->ۥ:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-ltz p1, :cond_2

    .line 19
    .line 20
    if-gez v0, :cond_0

    .line 21
    .line 22
    move v0, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-le v0, p1, :cond_1

    .line 25
    .line 26
    move v0, p1

    .line 27
    :cond_1
    :goto_0
    iput v0, p0, L۟/k1$a;->ۥ۟:I

    .line 28
    .line 29
    iput v0, p0, L۟/k1$a;->ۥ۟۟:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v3, "Cannot coerce value to an empty range: maximum "

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p1, " is less than minimum "

    .line 48
    .line 49
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const/16 p1, 0x2e

    .line 56
    .line 57
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, L۟/k1$a;->ۥ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, L۟/k1$a;->ۥ()V

    :cond_0
    iget v0, p0, L۟/k1$a;->ۥ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, L۟/k1$a;->ۥ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, L۟/k1$a;->ۥ()V

    :cond_0
    iget v0, p0, L۟/k1$a;->ۥ:I

    if-eqz v0, :cond_1

    iget-object v0, p0, L۟/k1$a;->ۥ۟۠:L۟/g4;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v2, v0}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    iput-object v2, p0, L۟/k1$a;->ۥ۟۠:L۟/g4;

    iput v1, p0, L۟/k1$a;->ۥ:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ()V
    .locals 7

    .line 1
    iget v0, p0, L۟/k1$a;->ۥ۟۟:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    iput v1, p0, L۟/k1$a;->ۥ:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, L۟/k1$a;->ۥ۟۠:L۟/g4;

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, L۟/k1$a;->ۥ۟ۢ:L۟/k1;

    .line 14
    .line 15
    iget v3, v2, L۟/k1;->ۥ۟۟:I

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-lez v3, :cond_1

    .line 19
    .line 20
    iget v5, p0, L۟/k1$a;->ۥ۟ۡ:I

    .line 21
    .line 22
    add-int/2addr v5, v4

    .line 23
    iput v5, p0, L۟/k1$a;->ۥ۟ۡ:I

    .line 24
    .line 25
    if-ge v5, v3, :cond_2

    .line 26
    .line 27
    :cond_1
    iget-object v2, v2, L۟/k1;->ۥ:Ljava/lang/CharSequence;

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-le v0, v2, :cond_3

    .line 34
    .line 35
    :cond_2
    new-instance v0, L۟/g4;

    .line 36
    .line 37
    iget v1, p0, L۟/k1$a;->ۥ۟:I

    .line 38
    .line 39
    iget-object v2, p0, L۟/k1$a;->ۥ۟ۢ:L۟/k1;

    .line 40
    .line 41
    iget-object v2, v2, L۟/k1;->ۥ:Ljava/lang/CharSequence;

    .line 42
    .line 43
    invoke-static {v2}, L۟/va;->ۥۡ۠(Ljava/lang/CharSequence;)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-direct {v0, v1, v2}, L۟/g4;-><init>(II)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    iget-object v0, p0, L۟/k1$a;->ۥ۟ۢ:L۟/k1;

    .line 52
    .line 53
    iget-object v2, v0, L۟/k1;->ۥ۟۠:L۟/h3;

    .line 54
    .line 55
    iget-object v0, v0, L۟/k1;->ۥ:Ljava/lang/CharSequence;

    .line 56
    .line 57
    iget v3, p0, L۟/k1$a;->ۥ۟۟:I

    .line 58
    .line 59
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v2, v0, v3}, L۟/h3;->ۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, L۟/q7;

    .line 68
    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    new-instance v0, L۟/g4;

    .line 72
    .line 73
    iget v1, p0, L۟/k1$a;->ۥ۟:I

    .line 74
    .line 75
    iget-object v2, p0, L۟/k1$a;->ۥ۟ۢ:L۟/k1;

    .line 76
    .line 77
    iget-object v2, v2, L۟/k1;->ۥ:Ljava/lang/CharSequence;

    .line 78
    .line 79
    invoke-static {v2}, L۟/va;->ۥۡ۠(Ljava/lang/CharSequence;)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-direct {v0, v1, v2}, L۟/g4;-><init>(II)V

    .line 84
    .line 85
    .line 86
    :goto_0
    iput-object v0, p0, L۟/k1$a;->ۥ۟۠:L۟/g4;

    .line 87
    .line 88
    const/4 v0, -0x1

    .line 89
    iput v0, p0, L۟/k1$a;->ۥ۟۟:I

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    iget-object v2, v0, L۟/q7;->ۥ:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    iget-object v0, v0, L۟/q7;->ۥ۟:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget v3, p0, L۟/k1$a;->ۥ۟:I

    .line 109
    .line 110
    const/high16 v5, -0x80000000

    .line 111
    .line 112
    if-gt v2, v5, :cond_5

    .line 113
    .line 114
    sget-object v3, L۟/g4;->ۥ۟۠:L۟/g4;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    new-instance v5, L۟/g4;

    .line 118
    .line 119
    add-int/lit8 v6, v2, -0x1

    .line 120
    .line 121
    invoke-direct {v5, v3, v6}, L۟/g4;-><init>(II)V

    .line 122
    .line 123
    .line 124
    move-object v3, v5

    .line 125
    :goto_1
    iput-object v3, p0, L۟/k1$a;->ۥ۟۠:L۟/g4;

    .line 126
    .line 127
    add-int/2addr v2, v0

    .line 128
    iput v2, p0, L۟/k1$a;->ۥ۟:I

    .line 129
    .line 130
    if-nez v0, :cond_6

    .line 131
    .line 132
    move v1, v4

    .line 133
    :cond_6
    add-int/2addr v2, v1

    .line 134
    iput v2, p0, L۟/k1$a;->ۥ۟۟:I

    .line 135
    .line 136
    :goto_2
    iput v4, p0, L۟/k1$a;->ۥ:I

    .line 137
    .line 138
    :goto_3
    return-void
.end method
