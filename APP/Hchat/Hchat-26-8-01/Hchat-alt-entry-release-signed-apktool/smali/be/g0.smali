.class public final synthetic Lbe/g0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lud/e;


# direct methods
.method public synthetic constructor <init>(Lud/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbe/g0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lbe/g0;->h:Lud/e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    iget v0, p0, Lbe/g0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/Map$Entry;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lud/l;

    .line 13
    .line 14
    instance-of v0, p1, Lud/g;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p1, Lud/g;

    .line 19
    .line 20
    iget-object p1, p1, Lud/g;->k:Lud/e;

    .line 21
    .line 22
    iget-object v0, p0, Lbe/g0;->h:Lud/e;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    return p1

    .line 31
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v0, p0, Lbe/g0;->h:Lud/e;

    .line 34
    .line 35
    invoke-virtual {v0}, Lud/e;->Z()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :pswitch_1
    check-cast p1, Lud/g;

    .line 45
    .line 46
    iget-object v0, p1, Lud/g;->m:Lb5/k;

    .line 47
    .line 48
    const/16 v1, 0x8

    .line 49
    .line 50
    const/16 v2, 0x10

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    filled-new-array {v3, v1, v2}, [I

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    move v4, v2

    .line 62
    :goto_1
    const/4 v5, 0x3

    .line 63
    if-ge v4, v5, :cond_2

    .line 64
    .line 65
    aget v5, v1, v4

    .line 66
    .line 67
    iget v6, v0, Lb5/k;->b:I

    .line 68
    .line 69
    and-int/2addr v5, v6

    .line 70
    if-nez v5, :cond_1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    iget-object p1, p1, Lud/g;->l:Lod/c;

    .line 77
    .line 78
    iget-object p1, p1, Lod/c;->i:Lqd/j;

    .line 79
    .line 80
    iget-object v0, p0, Lbe/g0;->h:Lud/e;

    .line 81
    .line 82
    iget-object v0, v0, Lud/e;->m:Lod/a;

    .line 83
    .line 84
    iget-object v0, v0, Lod/a;->g:Lqd/j;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    :goto_2
    move v3, v2

    .line 94
    :goto_3
    return v3

    .line 95
    :pswitch_2
    check-cast p1, Lud/r;

    .line 96
    .line 97
    invoke-virtual {p1}, Lud/r;->W()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    iget-object p1, p1, Lud/r;->l:Lud/e;

    .line 104
    .line 105
    iget-object v0, p0, Lbe/g0;->h:Lud/e;

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    goto :goto_4

    .line 115
    :cond_4
    const/4 p1, 0x0

    .line 116
    :goto_4
    return p1

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
