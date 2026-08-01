.class Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/command/dexer/Main$Arguments;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ArgumentsParser"
.end annotation


# instance fields
.field private final arguments:[Ljava/lang/String;

.field private current:Ljava/lang/String;

.field private index:I

.field private lastValue:Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->arguments:[Ljava/lang/String;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 8
    .line 9
    return-void
.end method

.method private getNextValue()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->arguments:[Ljava/lang/String;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-lt v0, v2, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_0
    aget-object v1, v1, v0

    .line 11
    .line 12
    iput-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    add-int/2addr v0, v1

    .line 16
    iput v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 17
    .line 18
    return v1
.end method


# virtual methods
.method public getCurrent()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLastValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->lastValue:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNext()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->arguments:[Ljava/lang/String;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-lt v0, v2, :cond_0

    .line 8
    .line 9
    return v3

    .line 10
    :cond_0
    aget-object v0, v1, v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "--"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    add-int/2addr v0, v1

    .line 35
    iput v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 36
    .line 37
    return v1

    .line 38
    :cond_2
    :goto_0
    return v3
.end method

.method public getRemaining()[Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->arguments:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget p0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 5
    .line 6
    sub-int/2addr v1, p0

    .line 7
    new-array v2, v1, [Ljava/lang/String;

    .line 8
    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v0, p0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object v2
.end method

.method public isArg(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_3

    .line 6
    .line 7
    add-int/lit8 v1, v0, -0x1

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/16 v3, 0x3d

    .line 14
    .line 15
    if-ne v2, v3, :cond_3

    .line 16
    .line 17
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x1

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->lastValue:Ljava/lang/String;

    .line 33
    .line 34
    return v3

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getNextValue()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->lastValue:Ljava/lang/String;

    .line 57
    .line 58
    return v3

    .line 59
    :cond_1
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 60
    .line 61
    const-string v0, "Missing value after parameter "

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 71
    .line 72
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 73
    .line 74
    .line 75
    throw p0

    .line 76
    :cond_2
    return v0

    .line 77
    :cond_3
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    return p0
.end method
