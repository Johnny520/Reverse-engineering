.class public final Lhh/a;
.super Lf1/n0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:Ljava/util/ArrayList;

.field public final k:Lsf/i;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;ILjava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, v0, v0}, Lf1/n0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lhh/a;->h:Ljava/lang/String;

    .line 6
    .line 7
    iput p3, p0, Lhh/a;->i:I

    .line 8
    .line 9
    iput-object p4, p0, Lhh/a;->j:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance p1, Ld1/c0;

    .line 12
    .line 13
    const/4 p2, 0x3

    .line 14
    invoke-direct {p1, p0, p2}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lsf/i;

    .line 18
    .line 19
    invoke-direct {p2, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lhh/a;->k:Lsf/i;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lhh/a;->h:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Lkh/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "@"

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, "("

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lhh/a;->j:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    add-int/lit8 v4, v2, 0x1

    .line 44
    .line 45
    if-ltz v2, :cond_1

    .line 46
    .line 47
    check-cast v3, Lhh/b;

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    const-string v2, ", "

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    move v2, v4

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-static {}, La/a;->Q0()V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    throw v0

    .line 66
    :cond_2
    const-string v1, ")"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method
