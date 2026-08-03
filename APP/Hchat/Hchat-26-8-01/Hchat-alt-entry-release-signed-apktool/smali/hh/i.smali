.class public final Lhh/i;
.super Lf1/n0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/Integer;

.field public final l:Ljava/util/ArrayList;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;

.field public final o:Lsf/i;

.field public final p:Lsf/i;

.field public final q:Lsf/i;

.field public final r:Lsf/i;

.field public final s:Lsf/i;

.field public final t:Lsf/i;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-direct/range {p0 .. p3}, Lf1/n0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lhh/i;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput p5, p0, Lhh/i;->i:I

    .line 7
    .line 8
    iput-object p6, p0, Lhh/i;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p7, p0, Lhh/i;->k:Ljava/lang/Integer;

    .line 11
    .line 12
    iput-object p8, p0, Lhh/i;->l:Ljava/util/ArrayList;

    .line 13
    .line 14
    iput-object p9, p0, Lhh/i;->m:Ljava/util/ArrayList;

    .line 15
    .line 16
    iput-object p10, p0, Lhh/i;->n:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v2, Ld1/c0;

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    invoke-direct {v2, p0, v3}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Lsf/i;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Lsf/i;-><init>(Lfg/a;)V

    .line 27
    .line 28
    .line 29
    iput-object v3, p0, Lhh/i;->o:Lsf/i;

    .line 30
    .line 31
    new-instance v2, Lhh/g;

    .line 32
    .line 33
    invoke-direct {v2, p0, p1, p3}, Lhh/g;-><init>(Lhh/i;Lorg/luckypray/dexkit/DexKitBridge;I)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lsf/i;

    .line 37
    .line 38
    invoke-direct {v3, v2}, Lsf/i;-><init>(Lfg/a;)V

    .line 39
    .line 40
    .line 41
    iput-object v3, p0, Lhh/i;->p:Lsf/i;

    .line 42
    .line 43
    new-instance v2, Lhh/g;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-direct {v2, p1, p0, p3, v3}, Lhh/g;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/i;II)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lsf/i;

    .line 50
    .line 51
    invoke-direct {v3, v2}, Lsf/i;-><init>(Lfg/a;)V

    .line 52
    .line 53
    .line 54
    iput-object v3, p0, Lhh/i;->q:Lsf/i;

    .line 55
    .line 56
    new-instance v2, Lhh/g;

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    invoke-direct {v2, p1, p0, p3, v3}, Lhh/g;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/i;II)V

    .line 60
    .line 61
    .line 62
    new-instance v3, Lsf/i;

    .line 63
    .line 64
    invoke-direct {v3, v2}, Lsf/i;-><init>(Lfg/a;)V

    .line 65
    .line 66
    .line 67
    iput-object v3, p0, Lhh/i;->r:Lsf/i;

    .line 68
    .line 69
    new-instance v2, Lhh/g;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-direct {v2, p1, p0, p3, v3}, Lhh/g;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/i;II)V

    .line 73
    .line 74
    .line 75
    new-instance v3, Lsf/i;

    .line 76
    .line 77
    invoke-direct {v3, v2}, Lsf/i;-><init>(Lfg/a;)V

    .line 78
    .line 79
    .line 80
    iput-object v3, p0, Lhh/i;->s:Lsf/i;

    .line 81
    .line 82
    new-instance v2, Lhh/f;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    move-object p6, p0

    .line 86
    move-object p5, p1

    .line 87
    move p8, p2

    .line 88
    move p7, p3

    .line 89
    move-object p4, v2

    .line 90
    move p9, v3

    .line 91
    invoke-direct/range {p4 .. p9}, Lhh/f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lf1/n0;III)V

    .line 92
    .line 93
    .line 94
    move-object v0, p4

    .line 95
    new-instance v1, Lsf/i;

    .line 96
    .line 97
    invoke-direct {v1, v0}, Lsf/i;-><init>(Lfg/a;)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Lhh/i;->t:Lsf/i;

    .line 101
    .line 102
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
    instance-of v1, p1, Lhh/i;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lhh/i;

    .line 10
    .line 11
    iget-object p1, p1, Lhh/i;->j:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lhh/i;->j:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lhh/i;->j:Ljava/lang/String;

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

.method public final p()Llh/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lhh/i;->o:Lsf/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Llh/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public final q(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lhh/i;->p()Llh/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Llh/a;->g:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lac/p;->u(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
    iget v1, p0, Lhh/i;->i:I

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
    invoke-virtual {p0}, Lhh/i;->p()Llh/a;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, Llh/a;->g:Ljava/lang/String;

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
    iget-object v1, p0, Lhh/i;->p:Lsf/i;

    .line 58
    .line 59
    invoke-virtual {v1}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lhh/i;

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
    invoke-virtual {v1}, Lhh/i;->p()Llh/a;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v1, v1, Llh/a;->g:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v1, p0, Lhh/i;->l:Ljava/util/ArrayList;

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
    iget-object v1, p0, Lhh/i;->q:Lsf/i;

    .line 95
    .line 96
    invoke-virtual {v1}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v2, v1

    .line 101
    check-cast v2, Lhh/j;

    .line 102
    .line 103
    sget-object v6, Lhh/h;->g:Lhh/h;

    .line 104
    .line 105
    const/16 v7, 0x1e

    .line 106
    .line 107
    const-string v3, ", "

    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    const/4 v5, 0x0

    .line 111
    invoke-static/range {v2 .. v7}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

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
    return-object v0
.end method
