.class public final Lx8/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4, p5}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lx8/u;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lx8/u;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lx8/u;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p4, p0, Lx8/u;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p5, p0, Lx8/u;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p6, p0, Lx8/u;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput p7, p0, Lx8/u;->g:I

    .line 23
    .line 24
    return-void
.end method

.method public static a(Lx8/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lx8/u;
    .locals 8

    .line 1
    iget-object v2, p0, Lx8/u;->b:Ljava/lang/String;

    .line 2
    .line 3
    and-int/lit8 v0, p6, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Lx8/u;->c:Ljava/lang/String;

    .line 8
    .line 9
    :cond_0
    move-object v3, p2

    .line 10
    and-int/lit8 p2, p6, 0x8

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iget-object p3, p0, Lx8/u;->d:Ljava/lang/String;

    .line 15
    .line 16
    :cond_1
    move-object v4, p3

    .line 17
    and-int/lit8 p2, p6, 0x10

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    iget-object p4, p0, Lx8/u;->e:Ljava/lang/String;

    .line 22
    .line 23
    :cond_2
    move-object v5, p4

    .line 24
    iget-object v6, p0, Lx8/u;->f:Ljava/lang/String;

    .line 25
    .line 26
    and-int/lit8 p2, p6, 0x40

    .line 27
    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    iget p5, p0, Lx8/u;->g:I

    .line 31
    .line 32
    :cond_3
    move v7, p5

    .line 33
    invoke-static {p1, v2, v3, v4, v5}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v0, Lx8/u;

    .line 40
    .line 41
    move-object v1, p1

    .line 42
    invoke-direct/range {v0 .. v7}, Lx8/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method


# virtual methods
.method public final b()Lx8/u;
    .locals 8

    .line 1
    iget-object v0, p0, Lx8/u;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v0, "\u9ed8\u8ba4\u914d\u7f6e"

    .line 18
    .line 19
    :cond_0
    move-object v2, v0

    .line 20
    iget-object v0, p0, Lx8/u;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const-string v0, "https://api.siliconflow.cn/v1"

    .line 37
    .line 38
    :cond_1
    move-object v3, v0

    .line 39
    iget-object v0, p0, Lx8/u;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    const-string v0, "/chat/completions"

    .line 56
    .line 57
    :cond_2
    move-object v4, v0

    .line 58
    iget-object v0, p0, Lx8/u;->e:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    const-string v0, "deepseek-ai/DeepSeek-V3"

    .line 75
    .line 76
    :cond_3
    move-object v5, v0

    .line 77
    const/4 v0, 0x0

    .line 78
    const/16 v1, 0x32

    .line 79
    .line 80
    iget v6, p0, Lx8/u;->g:I

    .line 81
    .line 82
    invoke-static {v6, v0, v1}, Lr9/e0;->r(III)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    const/16 v7, 0x22

    .line 87
    .line 88
    move-object v1, p0

    .line 89
    invoke-static/range {v1 .. v7}, Lx8/u;->a(Lx8/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lx8/u;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    return-object v0
.end method

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
    instance-of v1, p1, Lx8/u;

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
    check-cast p1, Lx8/u;

    .line 12
    .line 13
    iget-object v1, p0, Lx8/u;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lx8/u;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lx8/u;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lx8/u;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lx8/u;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lx8/u;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lx8/u;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lx8/u;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lx8/u;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lx8/u;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lx8/u;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lx8/u;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget v1, p0, Lx8/u;->g:I

    .line 80
    .line 81
    iget p1, p1, Lx8/u;->g:I

    .line 82
    .line 83
    if-eq v1, p1, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lx8/u;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lx8/u;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lx8/u;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lx8/u;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lx8/u;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lx8/u;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v1, p0, Lx8/u;->g:I

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", apiKey="

    .line 2
    .line 3
    const-string v1, ", apiBaseUrl="

    .line 4
    .line 5
    const-string v2, "AutoReplyZhiliaConfig(name="

    .line 6
    .line 7
    iget-object v3, p0, Lx8/u;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lx8/u;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", apiPath="

    .line 16
    .line 17
    const-string v2, ", model="

    .line 18
    .line 19
    iget-object v3, p0, Lx8/u;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lx8/u;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", systemPrompt="

    .line 27
    .line 28
    const-string v2, ", contextLimit="

    .line 29
    .line 30
    iget-object v3, p0, Lx8/u;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lx8/u;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ")"

    .line 38
    .line 39
    iget v2, p0, Lx8/u;->g:I

    .line 40
    .line 41
    invoke-static {v0, v2, v1}, Lj8/b;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
