.class public final Lf1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:LE0/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, LF0/a;

    .line 10
    .line 11
    const/16 v1, 0x9

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, LF0/a;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, LE0/f;

    .line 17
    .line 18
    invoke-direct {v1, v0}, LE0/f;-><init>(LM0/a;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lf1/b;->d:LE0/f;

    .line 22
    .line 23
    const/4 v0, 0x6

    .line 24
    const-string v1, "->"

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {p1, v1, v2, v2, v0}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v1, v0, 0x1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    const-string v4, ":"

    .line 35
    .line 36
    invoke-static {p1, v4, v1, v2, v3}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v3, -0x1

    .line 41
    if-eq v0, v3, :cond_0

    .line 42
    .line 43
    if-eq v1, v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    .line 50
    .line 51
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, Le1/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iput-object v2, p0, Lf1/b;->a:Ljava/lang/String;

    .line 59
    .line 60
    add-int/lit8 v0, v0, 0x2

    .line 61
    .line 62
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lf1/b;->b:Ljava/lang/String;

    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v0, "(this as java.lang.String).substring(startIndex)"

    .line 78
    .line 79
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Le1/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lf1/b;->c:Ljava/lang/String;

    .line 87
    .line 88
    return-void

    .line 89
    :cond_0
    new-instance v0, Ljava/lang/IllegalAccessError;

    .line 90
    .line 91
    const-string v1, "not field descriptor: "

    .line 92
    .line 93
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {v0, p1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lf1/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lf1/b;

    .line 12
    .line 13
    iget-object v1, p1, Lf1/b;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Lf1/b;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lf1/b;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p1, Lf1/b;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lf1/b;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object p1, p1, Lf1/b;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lf1/b;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    mul-int/lit8 v1, v1, 0x1f

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iget-object v0, p0, Lf1/b;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lf1/b;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Le1/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "->"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lf1/b;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ":"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lf1/b;->d:LE0/f;

    .line 31
    .line 32
    invoke-virtual {v1}, LE0/f;->a()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 46
    .line 47
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method
