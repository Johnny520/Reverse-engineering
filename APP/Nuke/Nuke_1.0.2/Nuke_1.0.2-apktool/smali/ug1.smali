.class public final Lug1;
.super Lsj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final i:I

.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:I

.field public final m:Ljava/util/ArrayList;

.field public final n:Lhx2;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lsj;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lug1;->i:I

    .line 5
    .line 6
    iput p5, p0, Lug1;->j:I

    .line 7
    .line 8
    iput-object p6, p0, Lug1;->k:Ljava/lang/String;

    .line 9
    .line 10
    iput p7, p0, Lug1;->l:I

    .line 11
    .line 12
    iput-object p8, p0, Lug1;->m:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance p4, Lea;

    .line 15
    .line 16
    const/16 p5, 0xf

    .line 17
    .line 18
    invoke-direct {p4, p5, p0}, Lea;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance p5, Lhx2;

    .line 22
    .line 23
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 24
    .line 25
    .line 26
    iput-object p5, p0, Lug1;->n:Lhx2;

    .line 27
    .line 28
    new-instance p4, Ltg1;

    .line 29
    .line 30
    const/4 p5, 0x0

    .line 31
    invoke-direct {p4, p1, p0, p3, p5}, Ltg1;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lug1;II)V

    .line 32
    .line 33
    .line 34
    new-instance p5, Lhx2;

    .line 35
    .line 36
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 37
    .line 38
    .line 39
    new-instance p4, Ltg1;

    .line 40
    .line 41
    const/4 p5, 0x2

    .line 42
    invoke-direct {p4, p1, p0, p3, p5}, Ltg1;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lug1;II)V

    .line 43
    .line 44
    .line 45
    new-instance p5, Lhx2;

    .line 46
    .line 47
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 48
    .line 49
    .line 50
    new-instance p4, Ltg1;

    .line 51
    .line 52
    const/4 p5, 0x1

    .line 53
    invoke-direct {p4, p1, p0, p3, p5}, Ltg1;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lug1;II)V

    .line 54
    .line 55
    .line 56
    new-instance p5, Lhx2;

    .line 57
    .line 58
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Lss;

    .line 62
    .line 63
    const/16 v5, 0x9

    .line 64
    .line 65
    move-object v2, p0

    .line 66
    move-object v1, p1

    .line 67
    move v4, p2

    .line 68
    move v3, p3

    .line 69
    invoke-direct/range {v0 .. v5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 70
    .line 71
    .line 72
    move-object p2, v2

    .line 73
    move p4, v4

    .line 74
    new-instance p0, Lhx2;

    .line 75
    .line 76
    invoke-direct {p0, v0}, Lhx2;-><init>(Lxm0;)V

    .line 77
    .line 78
    .line 79
    new-instance p0, Lss;

    .line 80
    .line 81
    const/4 p5, 0x4

    .line 82
    invoke-direct/range {p0 .. p5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 83
    .line 84
    .line 85
    new-instance p5, Lhx2;

    .line 86
    .line 87
    invoke-direct {p5, p0}, Lhx2;-><init>(Lxm0;)V

    .line 88
    .line 89
    .line 90
    new-instance p0, Lss;

    .line 91
    .line 92
    const/16 p5, 0x8

    .line 93
    .line 94
    invoke-direct/range {p0 .. p5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 95
    .line 96
    .line 97
    new-instance p5, Lhx2;

    .line 98
    .line 99
    invoke-direct {p5, p0}, Lhx2;-><init>(Lxm0;)V

    .line 100
    .line 101
    .line 102
    new-instance p0, Lss;

    .line 103
    .line 104
    const/4 p5, 0x7

    .line 105
    invoke-direct/range {p0 .. p5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 106
    .line 107
    .line 108
    new-instance p5, Lhx2;

    .line 109
    .line 110
    invoke-direct {p5, p0}, Lhx2;-><init>(Lxm0;)V

    .line 111
    .line 112
    .line 113
    new-instance p0, Lss;

    .line 114
    .line 115
    const/4 p5, 0x5

    .line 116
    invoke-direct/range {p0 .. p5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 117
    .line 118
    .line 119
    new-instance p5, Lhx2;

    .line 120
    .line 121
    invoke-direct {p5, p0}, Lhx2;-><init>(Lxm0;)V

    .line 122
    .line 123
    .line 124
    new-instance p0, Lss;

    .line 125
    .line 126
    const/4 p5, 0x6

    .line 127
    invoke-direct/range {p0 .. p5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 128
    .line 129
    .line 130
    new-instance p5, Lhx2;

    .line 131
    .line 132
    invoke-direct {p5, p0}, Lhx2;-><init>(Lxm0;)V

    .line 133
    .line 134
    .line 135
    new-instance p0, Lss;

    .line 136
    .line 137
    const/16 p5, 0xb

    .line 138
    .line 139
    invoke-direct/range {p0 .. p5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 140
    .line 141
    .line 142
    new-instance p5, Lhx2;

    .line 143
    .line 144
    invoke-direct {p5, p0}, Lhx2;-><init>(Lxm0;)V

    .line 145
    .line 146
    .line 147
    new-instance p0, Lss;

    .line 148
    .line 149
    const/16 p5, 0xa

    .line 150
    .line 151
    invoke-direct/range {p0 .. p5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 152
    .line 153
    .line 154
    new-instance p1, Lhx2;

    .line 155
    .line 156
    invoke-direct {p1, p0}, Lhx2;-><init>(Lxm0;)V

    .line 157
    .line 158
    .line 159
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lug1;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lug1;

    .line 10
    .line 11
    iget-object p1, p1, Lug1;->k:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, Lug1;->k:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lug1;->k:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final k()Lg80;
    .locals 0

    .line 1
    iget-object p0, p0, Lug1;->n:Lhx2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lg80;

    .line 8
    .line 9
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, " "

    .line 7
    .line 8
    iget v2, p0, Lug1;->j:I

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Lug1;->k()Lg80;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v2, v2, Lg80;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lug1;->k()Lg80;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Lg80;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, "."

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lug1;->k()Lg80;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, Lg80;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, "("

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lug1;->k()Lg80;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-object v1, p0, Lg80;->c:Ljava/util/ArrayList;

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    const/16 v6, 0x3e

    .line 82
    .line 83
    const-string v2, ", "

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-static/range {v1 .. v6}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const-string v1, ")"

    .line 92
    .line 93
    invoke-static {v0, p0, v1}, Lhk1;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method
