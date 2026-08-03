.class public final Lhh/o;
.super Lf1/n0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:I

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:I

.field public final l:Ljava/util/ArrayList;

.field public final m:Lsf/i;

.field public final n:Lsf/i;

.field public final o:Lsf/i;

.field public final p:Lsf/i;

.field public final q:Lsf/i;

.field public final r:Lsf/i;

.field public final s:Lsf/i;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lf1/n0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lhh/o;->h:I

    .line 5
    .line 6
    iput p5, p0, Lhh/o;->i:I

    .line 7
    .line 8
    iput-object p6, p0, Lhh/o;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput p7, p0, Lhh/o;->k:I

    .line 11
    .line 12
    iput-object p8, p0, Lhh/o;->l:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance p4, Ld1/c0;

    .line 15
    .line 16
    const/4 p5, 0x6

    .line 17
    invoke-direct {p4, p0, p5}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    new-instance p5, Lsf/i;

    .line 21
    .line 22
    invoke-direct {p5, p4}, Lsf/i;-><init>(Lfg/a;)V

    .line 23
    .line 24
    .line 25
    iput-object p5, p0, Lhh/o;->m:Lsf/i;

    .line 26
    .line 27
    new-instance p4, Lhh/n;

    .line 28
    .line 29
    const/4 p5, 0x0

    .line 30
    invoke-direct {p4, p1, p0, p3, p5}, Lhh/n;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/o;II)V

    .line 31
    .line 32
    .line 33
    new-instance p5, Lsf/i;

    .line 34
    .line 35
    invoke-direct {p5, p4}, Lsf/i;-><init>(Lfg/a;)V

    .line 36
    .line 37
    .line 38
    new-instance p4, Lhh/n;

    .line 39
    .line 40
    const/4 p5, 0x2

    .line 41
    invoke-direct {p4, p1, p0, p3, p5}, Lhh/n;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/o;II)V

    .line 42
    .line 43
    .line 44
    new-instance p5, Lsf/i;

    .line 45
    .line 46
    invoke-direct {p5, p4}, Lsf/i;-><init>(Lfg/a;)V

    .line 47
    .line 48
    .line 49
    new-instance p4, Lhh/n;

    .line 50
    .line 51
    const/4 p5, 0x1

    .line 52
    invoke-direct {p4, p1, p0, p3, p5}, Lhh/n;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/o;II)V

    .line 53
    .line 54
    .line 55
    new-instance p5, Lsf/i;

    .line 56
    .line 57
    invoke-direct {p5, p4}, Lsf/i;-><init>(Lfg/a;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lhh/f;

    .line 61
    .line 62
    const/16 v5, 0x9

    .line 63
    .line 64
    move-object v2, p0

    .line 65
    move-object v1, p1

    .line 66
    move v4, p2

    .line 67
    move v3, p3

    .line 68
    invoke-direct/range {v0 .. v5}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 69
    .line 70
    .line 71
    move-object p2, v1

    .line 72
    move p4, v3

    .line 73
    move p5, v4

    .line 74
    new-instance p1, Lsf/i;

    .line 75
    .line 76
    invoke-direct {p1, v0}, Lsf/i;-><init>(Lfg/a;)V

    .line 77
    .line 78
    .line 79
    new-instance p1, Lhh/f;

    .line 80
    .line 81
    const/4 p6, 0x4

    .line 82
    move-object p3, p0

    .line 83
    invoke-direct/range {p1 .. p6}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 84
    .line 85
    .line 86
    new-instance p6, Lsf/i;

    .line 87
    .line 88
    invoke-direct {p6, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 89
    .line 90
    .line 91
    iput-object p6, p3, Lhh/o;->n:Lsf/i;

    .line 92
    .line 93
    new-instance p1, Lhh/f;

    .line 94
    .line 95
    const/16 p6, 0x8

    .line 96
    .line 97
    invoke-direct/range {p1 .. p6}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 98
    .line 99
    .line 100
    new-instance p3, Lsf/i;

    .line 101
    .line 102
    invoke-direct {p3, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, Lhh/f;

    .line 106
    .line 107
    const/4 p6, 0x7

    .line 108
    move-object p3, p0

    .line 109
    invoke-direct/range {p1 .. p6}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 110
    .line 111
    .line 112
    new-instance p6, Lsf/i;

    .line 113
    .line 114
    invoke-direct {p6, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 115
    .line 116
    .line 117
    iput-object p6, p3, Lhh/o;->o:Lsf/i;

    .line 118
    .line 119
    new-instance p1, Lhh/f;

    .line 120
    .line 121
    const/4 p6, 0x5

    .line 122
    invoke-direct/range {p1 .. p6}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 123
    .line 124
    .line 125
    new-instance p6, Lsf/i;

    .line 126
    .line 127
    invoke-direct {p6, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 128
    .line 129
    .line 130
    iput-object p6, p3, Lhh/o;->p:Lsf/i;

    .line 131
    .line 132
    new-instance p1, Lhh/f;

    .line 133
    .line 134
    const/4 p6, 0x6

    .line 135
    invoke-direct/range {p1 .. p6}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 136
    .line 137
    .line 138
    new-instance p6, Lsf/i;

    .line 139
    .line 140
    invoke-direct {p6, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 141
    .line 142
    .line 143
    iput-object p6, p3, Lhh/o;->q:Lsf/i;

    .line 144
    .line 145
    new-instance p1, Lhh/f;

    .line 146
    .line 147
    const/16 p6, 0xb

    .line 148
    .line 149
    invoke-direct/range {p1 .. p6}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 150
    .line 151
    .line 152
    new-instance p6, Lsf/i;

    .line 153
    .line 154
    invoke-direct {p6, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 155
    .line 156
    .line 157
    iput-object p6, p3, Lhh/o;->r:Lsf/i;

    .line 158
    .line 159
    new-instance p1, Lhh/f;

    .line 160
    .line 161
    const/16 p6, 0xa

    .line 162
    .line 163
    invoke-direct/range {p1 .. p6}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 164
    .line 165
    .line 166
    new-instance p2, Lsf/i;

    .line 167
    .line 168
    invoke-direct {p2, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 169
    .line 170
    .line 171
    iput-object p2, p3, Lhh/o;->s:Lsf/i;

    .line 172
    .line 173
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
    instance-of v1, p1, Lhh/o;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lhh/o;

    .line 10
    .line 11
    iget-object p1, p1, Lhh/o;->j:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lhh/o;->j:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lhh/o;->j:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final p()Llh/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lhh/o;->m:Lsf/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Llh/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public final q()Lhh/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lhh/o;->q:Lsf/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lhh/p;

    .line 8
    .line 9
    return-object v0
.end method

.method public final r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final s()Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object v0, p0, Lhh/o;->o:Lsf/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-ltz v2, :cond_0

    .line 39
    .line 40
    sget-object v3, Lkh/d;->a:[Ljava/lang/String;

    .line 41
    .line 42
    const/16 v4, 0x100

    .line 43
    .line 44
    if-ge v2, v4, :cond_1

    .line 45
    .line 46
    aget-object v2, v3, v2

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    sget-object v0, Lkh/d;->a:[Ljava/lang/String;

    .line 53
    .line 54
    :cond_1
    const/16 v0, 0x10

    .line 55
    .line 56
    invoke-static {v0}, La/a;->w(I)V

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const-string v1, "opcode: "

    .line 67
    .line 68
    const-string v2, " is out of range"

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, Lbsh/j;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    return-object v0

    .line 75
    :cond_2
    return-object v1
.end method

.method public final t()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Llh/d;->h:Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "<init>"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

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
    iget v2, p0, Lhh/o;->i:I

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
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v2, v2, Llh/d;->j:Ljava/lang/String;

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
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Llh/d;->g:Ljava/lang/String;

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
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, Llh/d;->h:Ljava/lang/String;

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
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v2, v1, Llh/d;->i:Ljava/util/ArrayList;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    const/16 v7, 0x3e

    .line 82
    .line 83
    const-string v3, ", "

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    invoke-static/range {v2 .. v7}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v2, ")"

    .line 92
    .line 93
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0
.end method
