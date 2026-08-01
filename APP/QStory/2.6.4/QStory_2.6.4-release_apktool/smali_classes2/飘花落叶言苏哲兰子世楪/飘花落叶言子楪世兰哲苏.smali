.class public abstract L飘花落叶言苏哲兰子世楪/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method private static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x4ba

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v1, v0, 0x2

    .line 6
    .line 7
    new-array v2, v1, [B

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v4, v0, :cond_0

    .line 12
    .line 13
    div-int/lit8 v5, v4, 0x2

    .line 14
    .line 15
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    const/16 v7, 0x10

    .line 20
    .line 21
    invoke-static {v6, v7}, Ljava/lang/Character;->digit(CI)I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    shl-int/lit8 v6, v6, 0x4

    .line 26
    .line 27
    add-int/lit8 v8, v4, 0x1

    .line 28
    .line 29
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    invoke-static {v8, v7}, Ljava/lang/Character;->digit(CI)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    add-int/2addr v7, v6

    .line 38
    int-to-byte v6, v7

    .line 39
    aput-byte v6, v2, v5

    .line 40
    .line 41
    add-int/lit8 v4, v4, 0x2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-array v0, v1, [B

    .line 51
    .line 52
    :goto_1
    if-ge v3, v1, :cond_1

    .line 53
    .line 54
    aget-byte v4, v2, v3

    .line 55
    .line 56
    array-length v5, p1

    .line 57
    rem-int v5, v3, v5

    .line 58
    .line 59
    aget-byte v5, p1, v5

    .line 60
    .line 61
    xor-int/2addr v4, v5

    .line 62
    int-to-byte v4, v4

    .line 63
    aput-byte v4, v0, v3

    .line 64
    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 69
    .line 70
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 71
    .line 72
    invoke-direct {p1, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 73
    .line 74
    .line 75
    const-string v0, "\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c\u545c"

    .line 76
    .line 77
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    invoke-virtual {p1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const/16 v0, 0x4b9

    .line 106
    .line 107
    invoke-static {p1, p0, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const/4 p0, 0x0

    .line 115
    return-object p0
.end method
