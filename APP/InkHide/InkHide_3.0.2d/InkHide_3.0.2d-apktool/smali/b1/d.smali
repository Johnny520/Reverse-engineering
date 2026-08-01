.class public final Lb1/d;
.super LJ/b;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:LE0/f;

.field public final h:LE0/f;

.field public final i:LE0/f;

.field public final j:LE0/f;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIILjava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LJ/b;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lb1/d;->b:I

    .line 5
    .line 6
    iput-object p5, p0, Lb1/d;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p6, p0, Lb1/d;->d:Ljava/lang/Integer;

    .line 9
    .line 10
    iput-object p7, p0, Lb1/d;->e:Ljava/util/ArrayList;

    .line 11
    .line 12
    iput-object p9, p0, Lb1/d;->f:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance p2, LF0/a;

    .line 15
    .line 16
    const/4 p4, 0x6

    .line 17
    invoke-direct {p2, p4, p0}, LF0/a;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance p4, LE0/f;

    .line 21
    .line 22
    invoke-direct {p4, p2}, LE0/f;-><init>(LM0/a;)V

    .line 23
    .line 24
    .line 25
    iput-object p4, p0, Lb1/d;->g:LE0/f;

    .line 26
    .line 27
    new-instance p2, Lb1/b;

    .line 28
    .line 29
    invoke-direct {p2, p0, p1, p3}, Lb1/b;-><init>(Lb1/d;Lorg/luckypray/dexkit/DexKitBridge;I)V

    .line 30
    .line 31
    .line 32
    new-instance p4, LE0/f;

    .line 33
    .line 34
    invoke-direct {p4, p2}, LE0/f;-><init>(LM0/a;)V

    .line 35
    .line 36
    .line 37
    iput-object p4, p0, Lb1/d;->h:LE0/f;

    .line 38
    .line 39
    new-instance p2, Lb1/b;

    .line 40
    .line 41
    const/4 p4, 0x1

    .line 42
    invoke-direct {p2, p1, p0, p3, p4}, Lb1/b;-><init>(Lorg/luckypray/dexkit/DexKitBridge;LJ/b;II)V

    .line 43
    .line 44
    .line 45
    new-instance p4, LE0/f;

    .line 46
    .line 47
    invoke-direct {p4, p2}, LE0/f;-><init>(LM0/a;)V

    .line 48
    .line 49
    .line 50
    iput-object p4, p0, Lb1/d;->i:LE0/f;

    .line 51
    .line 52
    new-instance p2, Lb1/b;

    .line 53
    .line 54
    const/4 p4, 0x0

    .line 55
    invoke-direct {p2, p1, p0, p3, p4}, Lb1/b;-><init>(Lorg/luckypray/dexkit/DexKitBridge;LJ/b;II)V

    .line 56
    .line 57
    .line 58
    new-instance p1, LE0/f;

    .line 59
    .line 60
    invoke-direct {p1, p2}, LE0/f;-><init>(LM0/a;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lb1/d;->j:LE0/f;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final b()Lf1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lb1/d;->g:LE0/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LE0/f;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lf1/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 2

    .line 1
    const-string v0, "classLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lb1/d;->b()Lf1/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget v1, Le1/b;->a:I

    .line 14
    .line 15
    iget-object v0, v0, Lf1/a;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p1, v0}, Le1/b;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

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
    instance-of v1, p1, Lb1/d;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lb1/d;

    .line 10
    .line 11
    iget-object p1, p1, Lb1/d;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lb1/d;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lb1/d;->c:Ljava/lang/String;

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
    iget v1, p0, Lb1/d;->b:I

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " "

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Lb1/d;->b()Lf1/a;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, Lf1/a;->a:Ljava/lang/String;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v3, "class "

    .line 43
    .line 44
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lb1/d;->h:LE0/f;

    .line 58
    .line 59
    invoke-virtual {v1}, LE0/f;->a()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lb1/d;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    const-string v2, " extends "

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lb1/d;->b()Lf1/a;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v1, v1, Lf1/a;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v1, p0, Lb1/d;->e:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-lez v1, :cond_2

    .line 88
    .line 89
    const-string v1, " implements "

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lb1/d;->i:LE0/f;

    .line 95
    .line 96
    invoke-virtual {v1}, LE0/f;->a()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v2, v1

    .line 101
    check-cast v2, Lb1/e;

    .line 102
    .line 103
    sget-object v6, Lb1/c;->a:Lb1/c;

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    const/4 v5, 0x0

    .line 107
    const-string v3, ", "

    .line 108
    .line 109
    const/16 v7, 0x1e

    .line 110
    .line 111
    invoke-static/range {v2 .. v7}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 123
    .line 124
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object v0
.end method
