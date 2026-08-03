.class public final Li0/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lwf/f;


# static fields
.field public static final h:Lg1/d;

.field public static final synthetic i:Li0/e;

.field public static final j:Li0/e;

.field public static final k:Li0/e;

.field public static final l:Li0/e;

.field public static final m:Li0/e;


# instance fields
.field public final synthetic g:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lg1/d;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg1/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Li0/e;->h:Lg1/d;

    .line 9
    .line 10
    new-instance v0, Li0/e;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1}, Li0/e;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Li0/e;->i:Li0/e;

    .line 17
    .line 18
    new-instance v0, Li0/e;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-direct {v0, v1}, Li0/e;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Li0/e;->j:Li0/e;

    .line 25
    .line 26
    new-instance v0, Li0/e;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, v1}, Li0/e;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Li0/e;->k:Li0/e;

    .line 33
    .line 34
    new-instance v0, Li0/e;

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    invoke-direct {v0, v1}, Li0/e;-><init>(I)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Li0/e;->l:Li0/e;

    .line 41
    .line 42
    new-instance v0, Li0/e;

    .line 43
    .line 44
    const/4 v1, 0x5

    .line 45
    invoke-direct {v0, v1}, Li0/e;-><init>(I)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Li0/e;->m:Li0/e;

    .line 49
    .line 50
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Li0/e;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final a(Li0/e;)V
    .locals 8

    .line 1
    sget-object v0, Li0/y1;->z:Ltg/b0;

    .line 2
    .line 3
    :cond_0
    sget-object v0, Li0/y1;->z:Ltg/b0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ltg/b0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lq0/b;

    .line 10
    .line 11
    iget-object v2, v1, Lq0/b;->i:Lp0/b;

    .line 12
    .line 13
    invoke-virtual {v2, p0}, Lp0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lq0/a;

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    move-object v3, v1

    .line 22
    goto :goto_3

    .line 23
    :cond_1
    iget-object v4, v3, Lq0/a;->a:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v3, v3, Lq0/a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v5, v2, Lp0/b;->g:Lp0/j;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move v7, v6

    .line 38
    :goto_0
    invoke-virtual {v5, v7, v6, p0}, Lp0/j;->v(IILjava/lang/Object;)Lp0/j;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-ne v5, v6, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    if-nez v6, :cond_4

    .line 46
    .line 47
    sget-object v2, Lp0/b;->i:Lp0/b;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    new-instance v5, Lp0/b;

    .line 51
    .line 52
    iget v2, v2, Lp0/b;->h:I

    .line 53
    .line 54
    add-int/lit8 v2, v2, -0x1

    .line 55
    .line 56
    invoke-direct {v5, v6, v2}, Lp0/b;-><init>(Lp0/j;I)V

    .line 57
    .line 58
    .line 59
    move-object v2, v5

    .line 60
    :goto_1
    sget-object v5, Lr0/b;->a:Lr0/b;

    .line 61
    .line 62
    if-eq v4, v5, :cond_5

    .line 63
    .line 64
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast v6, Lq0/a;

    .line 72
    .line 73
    new-instance v7, Lq0/a;

    .line 74
    .line 75
    iget-object v6, v6, Lq0/a;->a:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-direct {v7, v6, v3}, Lq0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4, v7}, Lp0/b;->a(Ljava/lang/Object;Lq0/a;)Lp0/b;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    :cond_5
    if-eq v3, v5, :cond_6

    .line 85
    .line 86
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    check-cast v6, Lq0/a;

    .line 94
    .line 95
    new-instance v7, Lq0/a;

    .line 96
    .line 97
    iget-object v6, v6, Lq0/a;->b:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-direct {v7, v4, v6}, Lq0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v3, v7}, Lp0/b;->a(Ljava/lang/Object;Lq0/a;)Lp0/b;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :cond_6
    if-eq v4, v5, :cond_7

    .line 107
    .line 108
    iget-object v6, v1, Lq0/b;->g:Ljava/lang/Object;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    move-object v6, v3

    .line 112
    :goto_2
    if-eq v3, v5, :cond_8

    .line 113
    .line 114
    iget-object v4, v1, Lq0/b;->h:Ljava/lang/Object;

    .line 115
    .line 116
    :cond_8
    new-instance v3, Lq0/b;

    .line 117
    .line 118
    invoke-direct {v3, v6, v4, v2}, Lq0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lp0/b;)V

    .line 119
    .line 120
    .line 121
    :goto_3
    if-eq v1, v3, :cond_a

    .line 122
    .line 123
    sget-object v2, Lug/c;->b:Ll3/q;

    .line 124
    .line 125
    if-nez v1, :cond_9

    .line 126
    .line 127
    move-object v1, v2

    .line 128
    :cond_9
    invoke-virtual {v0, v1, v3}, Ltg/b0;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_0

    .line 133
    .line 134
    :cond_a
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Li0/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    return p1

    .line 17
    :pswitch_1
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Li0/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_1
    const-string v0, "Empty"

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_2
    const-string v0, "StructuralEqualityPolicy"

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_3
    const-string v0, "ReferentialEqualityPolicy"

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_4
    const-string v0, "NeverEqualPolicy"

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
