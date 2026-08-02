.class public final Lus;
.super Lsj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/Integer;

.field public final l:Ljava/util/ArrayList;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;

.field public final o:Lhx2;

.field public final p:Lhx2;

.field public final q:Lhx2;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIILjava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lsj;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lus;->i:I

    .line 5
    .line 6
    iput-object p5, p0, Lus;->j:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p6, p0, Lus;->k:Ljava/lang/Integer;

    .line 9
    .line 10
    iput-object p7, p0, Lus;->l:Ljava/util/ArrayList;

    .line 11
    .line 12
    iput-object p8, p0, Lus;->m:Ljava/util/ArrayList;

    .line 13
    .line 14
    iput-object p9, p0, Lus;->n:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p4, Lea;

    .line 17
    .line 18
    const/4 p5, 0x5

    .line 19
    invoke-direct {p4, p5, p0}, Lea;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance p5, Lhx2;

    .line 23
    .line 24
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 25
    .line 26
    .line 27
    iput-object p5, p0, Lus;->o:Lhx2;

    .line 28
    .line 29
    new-instance p4, Lts;

    .line 30
    .line 31
    invoke-direct {p4, p0, p1, p3}, Lts;-><init>(Lus;Lorg/luckypray/dexkit/DexKitBridge;I)V

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
    iput-object p5, p0, Lus;->p:Lhx2;

    .line 40
    .line 41
    new-instance p4, Lts;

    .line 42
    .line 43
    const/4 p5, 0x1

    .line 44
    invoke-direct {p4, p1, p0, p3, p5}, Lts;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lus;II)V

    .line 45
    .line 46
    .line 47
    new-instance p5, Lhx2;

    .line 48
    .line 49
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 50
    .line 51
    .line 52
    iput-object p5, p0, Lus;->q:Lhx2;

    .line 53
    .line 54
    new-instance p4, Lts;

    .line 55
    .line 56
    const/4 p5, 0x2

    .line 57
    invoke-direct {p4, p1, p0, p3, p5}, Lts;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lus;II)V

    .line 58
    .line 59
    .line 60
    new-instance p5, Lhx2;

    .line 61
    .line 62
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 63
    .line 64
    .line 65
    new-instance p4, Lts;

    .line 66
    .line 67
    const/4 p5, 0x0

    .line 68
    invoke-direct {p4, p1, p0, p3, p5}, Lts;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lus;II)V

    .line 69
    .line 70
    .line 71
    new-instance p5, Lhx2;

    .line 72
    .line 73
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Lss;

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    move-object v2, p0

    .line 80
    move-object v1, p1

    .line 81
    move v4, p2

    .line 82
    move v3, p3

    .line 83
    invoke-direct/range {v0 .. v5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 84
    .line 85
    .line 86
    new-instance p0, Lhx2;

    .line 87
    .line 88
    invoke-direct {p0, v0}, Lhx2;-><init>(Lxm0;)V

    .line 89
    .line 90
    .line 91
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
    instance-of v1, p1, Lus;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lus;

    .line 10
    .line 11
    iget-object p1, p1, Lus;->j:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, Lus;->j:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lus;->j:Ljava/lang/String;

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

.method public final k()Lu70;
    .locals 0

    .line 1
    iget-object p0, p0, Lus;->o:Lhx2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lu70;

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
    iget v1, p0, Lus;->i:I

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
    invoke-virtual {p0}, Lus;->k()Lu70;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, Lu70;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lus;->p:Lhx2;

    .line 58
    .line 59
    invoke-virtual {v1}, Lhx2;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lus;

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
    invoke-virtual {v1}, Lus;->k()Lu70;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v1, v1, Lu70;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v1, p0, Lus;->l:Ljava/util/ArrayList;

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
    iget-object p0, p0, Lus;->q:Lhx2;

    .line 95
    .line 96
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    move-object v1, p0

    .line 101
    check-cast v1, Lws;

    .line 102
    .line 103
    sget-object v5, Lv6;->x:Lv6;

    .line 104
    .line 105
    const/16 v6, 0x1e

    .line 106
    .line 107
    const-string v2, ", "

    .line 108
    .line 109
    const/4 v3, 0x0

    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-static/range {v1 .. v6}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0
.end method
