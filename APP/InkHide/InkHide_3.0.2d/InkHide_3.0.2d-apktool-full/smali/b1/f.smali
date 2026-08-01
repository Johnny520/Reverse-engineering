.class public final Lb1/f;
.super LJ/b;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:LE0/f;

.field public final f:LE0/f;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LJ/b;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p5, p0, Lb1/f;->b:I

    .line 5
    .line 6
    iput-object p6, p0, Lb1/f;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput p7, p0, Lb1/f;->d:I

    .line 9
    .line 10
    new-instance p2, LF0/a;

    .line 11
    .line 12
    const/4 p4, 0x7

    .line 13
    invoke-direct {p2, p4, p0}, LF0/a;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance p4, LE0/f;

    .line 17
    .line 18
    invoke-direct {p4, p2}, LE0/f;-><init>(LM0/a;)V

    .line 19
    .line 20
    .line 21
    iput-object p4, p0, Lb1/f;->e:LE0/f;

    .line 22
    .line 23
    new-instance p2, Lb1/b;

    .line 24
    .line 25
    const/4 p4, 0x3

    .line 26
    invoke-direct {p2, p1, p0, p3, p4}, Lb1/b;-><init>(Lorg/luckypray/dexkit/DexKitBridge;LJ/b;II)V

    .line 27
    .line 28
    .line 29
    new-instance p1, LE0/f;

    .line 30
    .line 31
    invoke-direct {p1, p2}, LE0/f;-><init>(LM0/a;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lb1/f;->f:LE0/f;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final b()Lf1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lb1/f;->e:LE0/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LE0/f;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lf1/b;

    .line 8
    .line 9
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
    instance-of v1, p1, Lb1/f;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lb1/f;

    .line 10
    .line 11
    iget-object p1, p1, Lb1/f;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lb1/f;->c:Ljava/lang/String;

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
    iget-object v0, p0, Lb1/f;->c:Ljava/lang/String;

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
    .locals 4

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
    iget v2, p0, Lb1/f;->b:I

    .line 9
    .line 10
    if-lez v2, :cond_0

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
    invoke-virtual {p0}, Lb1/f;->b()Lf1/b;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v2, v2, Lf1/b;->c:Ljava/lang/String;

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
    invoke-virtual {p0}, Lb1/f;->b()Lf1/b;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Lf1/b;->a:Ljava/lang/String;

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
    invoke-virtual {p0}, Lb1/f;->b()Lf1/b;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, Lf1/b;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 74
    .line 75
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v0
.end method
