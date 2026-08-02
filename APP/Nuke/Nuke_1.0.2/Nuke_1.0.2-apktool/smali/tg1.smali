.class public final Ltg1;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic k:Lug1;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lug1;II)V
    .locals 0

    .line 1
    iput p4, p0, Ltg1;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Ltg1;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput-object p2, p0, Ltg1;->k:Lug1;

    .line 6
    .line 7
    iput p3, p0, Ltg1;->l:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ltg1;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget v4, p0, Ltg1;->l:I

    .line 7
    .line 8
    iget-object v5, p0, Ltg1;->k:Lug1;

    .line 9
    .line 10
    iget-object p0, p0, Ltg1;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget v0, v5, Lug1;->l:I

    .line 16
    .line 17
    invoke-static {v4, v0}, Lsj;->f(II)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    new-array v0, v3, [J

    .line 22
    .line 23
    aput-wide v4, v0, v2

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->D([J)Lws;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0}, Ltj;->first()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_0
    check-cast v1, Lus;

    .line 41
    .line 42
    return-object v1

    .line 43
    :pswitch_0
    iget-object v0, v5, Lug1;->m:Ljava/util/ArrayList;

    .line 44
    .line 45
    new-instance v1, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 v2, 0xa

    .line 48
    .line 49
    invoke-static {v0, v2}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-static {v4, v2}, Lsj;->f(II)J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-static {v1}, Ldu;->G0(Ljava/util/ArrayList;)[J

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->D([J)Lws;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_1
    iget v0, v5, Lug1;->i:I

    .line 98
    .line 99
    invoke-static {v4, v0}, Lsj;->f(II)J

    .line 100
    .line 101
    .line 102
    move-result-wide v4

    .line 103
    new-array v0, v3, [J

    .line 104
    .line 105
    aput-wide v4, v0, v2

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->D([J)Lws;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_2
    invoke-virtual {p0}, Ltj;->first()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    :goto_2
    check-cast v1, Lus;

    .line 123
    .line 124
    return-object v1

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
