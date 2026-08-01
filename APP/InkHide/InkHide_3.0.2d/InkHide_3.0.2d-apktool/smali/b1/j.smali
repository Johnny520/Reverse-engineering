.class public final Lb1/j;
.super LJ/b;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:LE0/f;

.field public final e:LE0/f;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LJ/b;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p5, p0, Lb1/j;->b:I

    .line 5
    .line 6
    iput-object p6, p0, Lb1/j;->c:Ljava/lang/String;

    .line 7
    .line 8
    new-instance p4, LF0/a;

    .line 9
    .line 10
    const/16 p5, 0x8

    .line 11
    .line 12
    invoke-direct {p4, p5, p0}, LF0/a;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance p5, LE0/f;

    .line 16
    .line 17
    invoke-direct {p5, p4}, LE0/f;-><init>(LM0/a;)V

    .line 18
    .line 19
    .line 20
    iput-object p5, p0, Lb1/j;->d:LE0/f;

    .line 21
    .line 22
    new-instance p4, Lb1/i;

    .line 23
    .line 24
    invoke-direct {p4, p1, p0, p3, p2}, Lb1/i;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lb1/j;II)V

    .line 25
    .line 26
    .line 27
    new-instance p1, LE0/f;

    .line 28
    .line 29
    invoke-direct {p1, p4}, LE0/f;-><init>(LM0/a;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lb1/j;->e:LE0/f;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final b()Lf1/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lb1/j;->d:LE0/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LE0/f;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lf1/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb1/j;->b()Lf1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lf1/d;->e:LE0/f;

    .line 6
    .line 7
    invoke-virtual {v0}, LE0/f;->a()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    return-object v0
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
    instance-of v1, p1, Lb1/j;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lb1/j;

    .line 10
    .line 11
    iget-object p1, p1, Lb1/j;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lb1/j;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lb1/j;->c:Ljava/lang/String;

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
    const-string v1, " "

    .line 7
    .line 8
    iget v2, p0, Lb1/j;->b:I

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
    invoke-virtual {p0}, Lb1/j;->b()Lf1/d;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v2, v2, Lf1/d;->d:Ljava/lang/String;

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
    invoke-virtual {p0}, Lb1/j;->b()Lf1/d;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Lf1/d;->a:Ljava/lang/String;

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
    invoke-virtual {p0}, Lb1/j;->b()Lf1/d;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, Lf1/d;->b:Ljava/lang/String;

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
    invoke-virtual {p0}, Lb1/j;->b()Lf1/d;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v2, v1, Lf1/d;->c:Ljava/util/ArrayList;

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    const-string v3, ", "

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    const/16 v7, 0x3e

    .line 86
    .line 87
    invoke-static/range {v2 .. v7}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ")"

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 104
    .line 105
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object v0
.end method
