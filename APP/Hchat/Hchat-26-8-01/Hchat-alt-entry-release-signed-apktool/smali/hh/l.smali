.class public final Lhh/l;
.super Lf1/n0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:I

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:I

.field public final l:Lsf/i;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lf1/n0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lhh/l;->h:I

    .line 5
    .line 6
    iput p5, p0, Lhh/l;->i:I

    .line 7
    .line 8
    iput-object p6, p0, Lhh/l;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput p7, p0, Lhh/l;->k:I

    .line 11
    .line 12
    new-instance p4, Ld1/c0;

    .line 13
    .line 14
    const/4 p5, 0x5

    .line 15
    invoke-direct {p4, p0, p5}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    new-instance p5, Lsf/i;

    .line 19
    .line 20
    invoke-direct {p5, p4}, Lsf/i;-><init>(Lfg/a;)V

    .line 21
    .line 22
    .line 23
    iput-object p5, p0, Lhh/l;->l:Lsf/i;

    .line 24
    .line 25
    new-instance p4, Lhh/k;

    .line 26
    .line 27
    const/4 p5, 0x0

    .line 28
    invoke-direct {p4, p1, p0, p3, p5}, Lhh/k;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/l;II)V

    .line 29
    .line 30
    .line 31
    new-instance p5, Lsf/i;

    .line 32
    .line 33
    invoke-direct {p5, p4}, Lsf/i;-><init>(Lfg/a;)V

    .line 34
    .line 35
    .line 36
    new-instance p4, Lhh/k;

    .line 37
    .line 38
    const/4 p5, 0x1

    .line 39
    invoke-direct {p4, p1, p0, p3, p5}, Lhh/k;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/l;II)V

    .line 40
    .line 41
    .line 42
    new-instance p5, Lsf/i;

    .line 43
    .line 44
    invoke-direct {p5, p4}, Lsf/i;-><init>(Lfg/a;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lhh/f;

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    move-object v2, p0

    .line 51
    move-object v1, p1

    .line 52
    move v4, p2

    .line 53
    move v3, p3

    .line 54
    invoke-direct/range {v0 .. v5}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 55
    .line 56
    .line 57
    move-object p2, v1

    .line 58
    move p4, v3

    .line 59
    move p5, v4

    .line 60
    new-instance p1, Lsf/i;

    .line 61
    .line 62
    invoke-direct {p1, v0}, Lsf/i;-><init>(Lfg/a;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lhh/f;

    .line 66
    .line 67
    const/4 p6, 0x2

    .line 68
    move-object p3, p0

    .line 69
    invoke-direct/range {p1 .. p6}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 70
    .line 71
    .line 72
    new-instance p3, Lsf/i;

    .line 73
    .line 74
    invoke-direct {p3, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Lhh/f;

    .line 78
    .line 79
    const/4 p6, 0x3

    .line 80
    move-object p3, p0

    .line 81
    invoke-direct/range {p1 .. p6}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 82
    .line 83
    .line 84
    new-instance p2, Lsf/i;

    .line 85
    .line 86
    invoke-direct {p2, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 87
    .line 88
    .line 89
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
    instance-of v1, p1, Lhh/l;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lhh/l;

    .line 10
    .line 11
    iget-object p1, p1, Lhh/l;->j:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lhh/l;->j:Ljava/lang/String;

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
    iget-object v0, p0, Lhh/l;->j:Ljava/lang/String;

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

.method public final p()Llh/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lhh/l;->l:Lsf/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Llh/b;

    .line 8
    .line 9
    return-object v0
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
    iget v2, p0, Lhh/l;->i:I

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
    invoke-virtual {p0}, Lhh/l;->p()Llh/b;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v2, v2, Llh/b;->i:Ljava/lang/String;

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
    invoke-virtual {p0}, Lhh/l;->p()Llh/b;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Llh/b;->g:Ljava/lang/String;

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
    invoke-virtual {p0}, Lhh/l;->p()Llh/b;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, Llh/b;->h:Ljava/lang/String;

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
    return-object v0
.end method
