.class public final Lji0;
.super Lsj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final i:I

.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:I

.field public final m:Lhx2;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lsj;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lji0;->i:I

    .line 5
    .line 6
    iput p5, p0, Lji0;->j:I

    .line 7
    .line 8
    iput-object p6, p0, Lji0;->k:Ljava/lang/String;

    .line 9
    .line 10
    iput p7, p0, Lji0;->l:I

    .line 11
    .line 12
    new-instance p4, Lea;

    .line 13
    .line 14
    const/16 p5, 0x9

    .line 15
    .line 16
    invoke-direct {p4, p5, p0}, Lea;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance p5, Lhx2;

    .line 20
    .line 21
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 22
    .line 23
    .line 24
    iput-object p5, p0, Lji0;->m:Lhx2;

    .line 25
    .line 26
    new-instance p4, Lii0;

    .line 27
    .line 28
    const/4 p5, 0x0

    .line 29
    invoke-direct {p4, p1, p0, p3, p5}, Lii0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lji0;II)V

    .line 30
    .line 31
    .line 32
    new-instance p5, Lhx2;

    .line 33
    .line 34
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 35
    .line 36
    .line 37
    new-instance p4, Lii0;

    .line 38
    .line 39
    const/4 p5, 0x1

    .line 40
    invoke-direct {p4, p1, p0, p3, p5}, Lii0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lji0;II)V

    .line 41
    .line 42
    .line 43
    new-instance p5, Lhx2;

    .line 44
    .line 45
    invoke-direct {p5, p4}, Lhx2;-><init>(Lxm0;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lss;

    .line 49
    .line 50
    const/4 v5, 0x1

    .line 51
    move-object v2, p0

    .line 52
    move-object v1, p1

    .line 53
    move v4, p2

    .line 54
    move v3, p3

    .line 55
    invoke-direct/range {v0 .. v5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 56
    .line 57
    .line 58
    move-object p2, v2

    .line 59
    move p4, v4

    .line 60
    new-instance p0, Lhx2;

    .line 61
    .line 62
    invoke-direct {p0, v0}, Lhx2;-><init>(Lxm0;)V

    .line 63
    .line 64
    .line 65
    new-instance p0, Lss;

    .line 66
    .line 67
    const/4 p5, 0x2

    .line 68
    invoke-direct/range {p0 .. p5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 69
    .line 70
    .line 71
    new-instance p5, Lhx2;

    .line 72
    .line 73
    invoke-direct {p5, p0}, Lhx2;-><init>(Lxm0;)V

    .line 74
    .line 75
    .line 76
    new-instance p0, Lss;

    .line 77
    .line 78
    const/4 p5, 0x3

    .line 79
    invoke-direct/range {p0 .. p5}, Lss;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V

    .line 80
    .line 81
    .line 82
    new-instance p1, Lhx2;

    .line 83
    .line 84
    invoke-direct {p1, p0}, Lhx2;-><init>(Lxm0;)V

    .line 85
    .line 86
    .line 87
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
    instance-of v1, p1, Lji0;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lji0;

    .line 10
    .line 11
    iget-object p1, p1, Lji0;->k:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, Lji0;->k:Ljava/lang/String;

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
    iget-object p0, p0, Lji0;->k:Ljava/lang/String;

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

.method public final k()Ly70;
    .locals 0

    .line 1
    iget-object p0, p0, Lji0;->m:Lhx2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ly70;

    .line 8
    .line 9
    return-object p0
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
    iget v2, p0, Lji0;->j:I

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
    invoke-virtual {p0}, Lji0;->k()Ly70;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v2, v2, Ly70;->c:Ljava/lang/String;

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
    invoke-virtual {p0}, Lji0;->k()Ly70;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Ly70;->a:Ljava/lang/String;

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
    invoke-virtual {p0}, Lji0;->k()Ly70;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object p0, p0, Ly70;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method
