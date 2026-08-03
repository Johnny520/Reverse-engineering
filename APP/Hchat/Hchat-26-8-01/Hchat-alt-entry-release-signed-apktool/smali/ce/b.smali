.class public final synthetic Lce/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lce/b;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lce/b;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget v0, p0, Lce/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lce/b;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Lfg/l;

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    aget-object v4, v0, v3

    .line 16
    .line 17
    invoke-interface {v4, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Ljava/lang/Comparable;

    .line 22
    .line 23
    invoke-interface {v4, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Ljava/lang/Comparable;

    .line 28
    .line 29
    invoke-static {v5, v4}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    move v2, v4

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    :goto_1
    return v2

    .line 41
    :pswitch_0
    iget-object v0, p0, Lce/b;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    check-cast p1, Lud/a;

    .line 46
    .line 47
    check-cast p2, Lud/a;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lud/a;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v1}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    const/4 p1, -0x1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p1, p2}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    const/4 p1, 0x0

    .line 78
    :goto_2
    return p1

    .line 79
    :pswitch_1
    iget-object v0, p0, Lce/b;->h:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lfg/p;

    .line 82
    .line 83
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    return p1

    .line 94
    :pswitch_2
    iget-object v0, p0, Lce/b;->h:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ljava/util/Comparator;

    .line 97
    .line 98
    check-cast p1, Lod/a;

    .line 99
    .line 100
    check-cast p2, Lod/a;

    .line 101
    .line 102
    iget-object v1, p1, Lod/a;->g:Lqd/j;

    .line 103
    .line 104
    iget-object v2, p2, Lod/a;->g:Lqd/j;

    .line 105
    .line 106
    invoke-interface {v0, v1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v1, -0x2

    .line 111
    if-ne v0, v1, :cond_4

    .line 112
    .line 113
    invoke-virtual {p1, p2}, Lod/a;->b(Lod/a;)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    :cond_4
    return v0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
