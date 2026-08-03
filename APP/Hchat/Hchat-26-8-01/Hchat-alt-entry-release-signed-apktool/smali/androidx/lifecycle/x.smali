.class public Landroidx/lifecycle/x;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lz7/s;
.implements Li/q1;
.implements Lu4/a;
.implements Lj8/l;
.implements Ly2/b0;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FF)V
    .locals 2

    const/16 v0, 0x14

    iput v0, p0, Landroidx/lifecycle/x;->g:I

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    new-instance v0, Li/a0;

    const v1, 0x3c23d70a    # 0.01f

    .line 156
    invoke-direct {v0, p1, p2, v1}, Li/a0;-><init>(FFF)V

    .line 157
    iput-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(FFLi/q;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Landroidx/lifecycle/x;->g:I

    .line 145
    sget-object v0, Li/o1;->a:[I

    if-eqz p3, :cond_0

    .line 146
    new-instance v0, Landroidx/lifecycle/x;

    invoke-direct {v0, p3, p1, p2}, Landroidx/lifecycle/x;-><init>(Li/q;FF)V

    goto :goto_0

    .line 147
    :cond_0
    new-instance v0, Landroidx/lifecycle/x;

    invoke-direct {v0, p1, p2}, Landroidx/lifecycle/x;-><init>(FF)V

    .line 148
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    new-instance p1, Lhb/c;

    invoke-direct {p1, v0}, Lhb/c;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Landroidx/lifecycle/x;->g:I

    sparse-switch p1, :sswitch_data_0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    new-instance p1, Lz7/c;

    const/4 v0, 0x0

    .line 120
    invoke-direct {p1, v0}, Lz7/c;-><init>(I)V

    .line 121
    iput-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void

    .line 122
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    new-instance p1, Lh3/h;

    invoke-direct {p1, p0}, Lh3/h;-><init>(Landroidx/lifecycle/x;)V

    iput-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void

    .line 124
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void

    .line 126
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    new-instance p1, Landroid/graphics/Region;

    invoke-direct {p1}, Landroid/graphics/Region;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void

    .line 128
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_3
        0xb -> :sswitch_2
        0xc -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 132
    iput p1, p0, Landroidx/lifecycle/x;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/16 v0, 0xe

    iput v0, p0, Landroidx/lifecycle/x;->g:I

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 140
    new-instance v0, Lg3/j;

    const/16 v1, 0xd

    .line 141
    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 142
    iput-object p1, v0, Lg3/j;->i:Landroid/view/View;

    .line 143
    iput-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    goto :goto_0

    .line 144
    :cond_0
    new-instance v0, Landroidx/lifecycle/x;

    const/16 v1, 0xd

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lf6/e;)V
    .locals 3

    const/4 v0, 0x6

    iput v0, p0, Landroidx/lifecycle/x;->g:I

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    const/4 v0, 0x0

    move v1, v0

    .line 135
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 136
    iget-object v2, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    check-cast v2, [I

    aput v1, v2, v0

    .line 137
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt5/d;

    invoke-interface {v2}, Lt5/d;->c()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lh/Hchat/dexkit/DexFinder;Lj8/o;)V
    .locals 0

    const/16 p2, 0x1a

    iput p2, p0, Landroidx/lifecycle/x;->g:I

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    iput-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li/q;FF)V
    .locals 5

    const/16 v0, 0x13

    iput v0, p0, Landroidx/lifecycle/x;->g:I

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    invoke-virtual {p1}, Li/q;->b()I

    move-result v0

    new-array v1, v0, [Li/a0;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 152
    new-instance v3, Li/a0;

    invoke-virtual {p1, v2}, Li/q;->a(I)F

    move-result v4

    invoke-direct {v3, p2, p3, v4}, Li/a0;-><init>(FFF)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 153
    :cond_0
    iput-object v1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 111
    iput p2, p0, Landroidx/lifecycle/x;->g:I

    iput-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lr8/g;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Landroidx/lifecycle/x;->g:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu2/c;)V
    .locals 2

    const/16 v0, 0xf

    iput v0, p0, Landroidx/lifecycle/x;->g:I

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    new-instance v0, Lh/v0;

    .line 116
    sget v1, Lh/g1;->a:F

    .line 117
    invoke-direct {v0, v1, p1}, Lh/v0;-><init>(FLu2/c;)V

    iput-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([I[F[[F)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    iput v2, v0, Landroidx/lifecycle/x;->g:I

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    array-length v2, v1

    .line 13
    const/4 v3, 0x1

    .line 14
    sub-int/2addr v2, v3

    .line 15
    new-array v4, v2, [[Li/r;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    move v7, v3

    .line 19
    move v8, v7

    .line 20
    move v6, v5

    .line 21
    :goto_0
    if-ge v6, v2, :cond_5

    .line 22
    .line 23
    aget v9, p1, v6

    .line 24
    .line 25
    const/4 v10, 0x3

    .line 26
    const/4 v11, 0x2

    .line 27
    if-eqz v9, :cond_0

    .line 28
    .line 29
    if-eq v9, v3, :cond_3

    .line 30
    .line 31
    if-eq v9, v11, :cond_2

    .line 32
    .line 33
    if-eq v9, v10, :cond_1

    .line 34
    .line 35
    const/4 v10, 0x4

    .line 36
    if-eq v9, v10, :cond_0

    .line 37
    .line 38
    const/4 v10, 0x5

    .line 39
    if-eq v9, v10, :cond_0

    .line 40
    .line 41
    move v13, v8

    .line 42
    goto :goto_3

    .line 43
    :cond_0
    move v13, v10

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    if-ne v7, v3, :cond_3

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :goto_1
    move v13, v7

    .line 49
    goto :goto_3

    .line 50
    :cond_2
    :goto_2
    move v7, v11

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move v7, v3

    .line 53
    goto :goto_1

    .line 54
    :goto_3
    aget-object v8, p3, v6

    .line 55
    .line 56
    add-int/lit8 v9, v6, 0x1

    .line 57
    .line 58
    aget-object v10, p3, v9

    .line 59
    .line 60
    aget v14, v1, v6

    .line 61
    .line 62
    aget v15, v1, v9

    .line 63
    .line 64
    array-length v12, v8

    .line 65
    div-int/2addr v12, v11

    .line 66
    array-length v3, v8

    .line 67
    rem-int/2addr v3, v11

    .line 68
    add-int/2addr v3, v12

    .line 69
    new-array v11, v3, [Li/r;

    .line 70
    .line 71
    move v12, v5

    .line 72
    :goto_4
    if-ge v12, v3, :cond_4

    .line 73
    .line 74
    mul-int/lit8 v16, v12, 0x2

    .line 75
    .line 76
    move/from16 v17, v12

    .line 77
    .line 78
    new-instance v12, Li/r;

    .line 79
    .line 80
    move/from16 v18, v16

    .line 81
    .line 82
    aget v16, v8, v18

    .line 83
    .line 84
    add-int/lit8 v19, v18, 0x1

    .line 85
    .line 86
    move/from16 v20, v17

    .line 87
    .line 88
    aget v17, v8, v19

    .line 89
    .line 90
    aget v18, v10, v18

    .line 91
    .line 92
    aget v19, v10, v19

    .line 93
    .line 94
    invoke-direct/range {v12 .. v19}, Li/r;-><init>(IFFFFFF)V

    .line 95
    .line 96
    .line 97
    aput-object v12, v11, v20

    .line 98
    .line 99
    add-int/lit8 v12, v20, 0x1

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_4
    aput-object v11, v4, v6

    .line 103
    .line 104
    move v6, v9

    .line 105
    move v8, v13

    .line 106
    const/4 v3, 0x1

    .line 107
    goto :goto_0

    .line 108
    :cond_5
    iput-object v4, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 109
    .line 110
    return-void
.end method

.method public static A(Landroid/app/Activity;Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "\u5206\u4eab\u6d88\u606f"

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    new-instance p1, Lsf/f;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object p0, p1

    .line 23
    :goto_0
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const-string p0, "\u6ca1\u6709\u53ef\u7528\u7684\u5206\u4eab\u5e94\u7528"

    .line 31
    .line 32
    :goto_1
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    return-object p0
.end method

.method public static C(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "attachment"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    const-string v0, "appattach"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    const-string v0, "app_attach"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 40
    return p0

    .line 41
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0
.end method

.method public static R(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "@app"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    const/4 v1, 0x4

    .line 24
    invoke-static {v1, v0, p0}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :cond_1
    return-object p0
.end method

.method public static X(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1, p0, p2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :catchall_0
    :goto_0
    return-void
.end method

.method public static a0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    new-instance p2, Landroid/content/Intent;

    .line 9
    .line 10
    const-string v0, "android.intent.action.SEND"

    .line 11
    .line 12
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "text/plain"

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    const-string v0, "android.intent.extra.TEXT"

    .line 21
    .line 22
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p2}, Landroidx/lifecycle/x;->A(Landroid/app/Activity;Landroid/content/Intent;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static h(Ljava/lang/Object;[[Ljava/lang/Object;)V
    .locals 7

    .line 1
    if-eqz p0, :cond_8

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_5

    .line 6
    :cond_0
    array-length v0, p1

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_8

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    if-eqz v3, :cond_7

    .line 14
    .line 15
    array-length v4, v3

    .line 16
    const/4 v5, 0x2

    .line 17
    if-ge v4, v5, :cond_1

    .line 18
    .line 19
    goto :goto_4

    .line 20
    :cond_1
    aget-object v4, v3, v1

    .line 21
    .line 22
    instance-of v5, v4, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    check-cast v4, Ljava/lang/String;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const/4 v4, 0x0

    .line 30
    :goto_1
    const/4 v5, 0x1

    .line 31
    aget-object v3, v3, v5

    .line 32
    .line 33
    sget-object v5, Lj8/j;->g:Lj8/j;

    .line 34
    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    :goto_2
    move-object v3, v5

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    instance-of v6, v3, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v6, :cond_4

    .line 42
    .line 43
    move-object v6, v3

    .line 44
    check-cast v6, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    instance-of v6, v3, [B

    .line 54
    .line 55
    if-eqz v6, :cond_5

    .line 56
    .line 57
    move-object v6, v3

    .line 58
    check-cast v6, [B

    .line 59
    .line 60
    array-length v6, v6

    .line 61
    if-nez v6, :cond_5

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    :goto_3
    if-eqz v4, :cond_7

    .line 65
    .line 66
    if-ne v3, v5, :cond_6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-static {p0, v4, v3}, Landroidx/lifecycle/x;->X(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_7
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_8
    :goto_5
    return-void
.end method

.method public static k(Ljava/lang/String;Lr7/u;)[Landroidx/lifecycle/x;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v1, v0, 0x1

    .line 6
    .line 7
    new-array v2, v1, [Landroidx/lifecycle/x;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v4, v0, :cond_0

    .line 12
    .line 13
    new-instance v5, Landroidx/lifecycle/x;

    .line 14
    .line 15
    const/4 v6, 0x4

    .line 16
    invoke-direct {v5, v6}, Landroidx/lifecycle/x;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    new-instance v7, Lb8/g;

    .line 24
    .line 25
    const/4 v8, 0x2

    .line 26
    const/4 v9, 0x0

    .line 27
    invoke-direct {v7, v8, v6, v9}, Lb8/g;-><init>(ICLb8/b;)V

    .line 28
    .line 29
    .line 30
    iget-object v6, v5, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, Lz7/c;

    .line 33
    .line 34
    invoke-virtual {v6, v7}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    aput-object v5, v2, v4

    .line 38
    .line 39
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p0, Landroidx/lifecycle/x;

    .line 43
    .line 44
    const/4 v4, 0x4

    .line 45
    invoke-direct {p0, v4}, Landroidx/lifecycle/x;-><init>(I)V

    .line 46
    .line 47
    .line 48
    aput-object p0, v2, v0

    .line 49
    .line 50
    invoke-virtual {p1}, Lr7/u;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lb8/b;

    .line 65
    .line 66
    invoke-interface {p1}, Lb8/b;->f()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-lt v0, v1, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-interface {p1}, Lb8/b;->e()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-lt v4, v1, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    aget-object v5, v2, v0

    .line 81
    .line 82
    if-lt v0, v4, :cond_3

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v0, Lb8/g;

    .line 88
    .line 89
    invoke-direct {v0, v3, v3, p1}, Lb8/g;-><init>(ICLb8/b;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, v5, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Lz7/c;

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v0, Lb8/g;

    .line 104
    .line 105
    const/4 v6, 0x1

    .line 106
    invoke-direct {v0, v6, v3, p1}, Lb8/g;-><init>(ICLb8/b;)V

    .line 107
    .line 108
    .line 109
    iget-object v5, v5, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v5, Lz7/c;

    .line 112
    .line 113
    invoke-virtual {v5, v0}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    aget-object v0, v2, v4

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v4, Lb8/g;

    .line 122
    .line 123
    const/4 v5, 0x3

    .line 124
    invoke-direct {v4, v5, v3, p1}, Lb8/g;-><init>(ICLb8/b;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, Lz7/c;

    .line 130
    .line 131
    invoke-virtual {p1, v4}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    return-object v2
.end method

.method public static p(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string v0, "/"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static varargs q([Ljava/lang/Object;)[[Ljava/lang/Object;
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const-class v1, Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-array p0, v3, [I

    .line 10
    .line 11
    aput v4, p0, v2

    .line 12
    .line 13
    aput v4, p0, v4

    .line 14
    .line 15
    invoke-static {v1, p0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, [[Ljava/lang/Object;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    array-length v0, p0

    .line 23
    div-int/2addr v0, v3

    .line 24
    filled-new-array {v0, v3}, [I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v1, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, [[Ljava/lang/Object;

    .line 33
    .line 34
    move v3, v4

    .line 35
    :goto_0
    if-ge v3, v0, :cond_1

    .line 36
    .line 37
    aget-object v5, v1, v3

    .line 38
    .line 39
    mul-int/lit8 v6, v3, 0x2

    .line 40
    .line 41
    aget-object v7, p0, v6

    .line 42
    .line 43
    aput-object v7, v5, v4

    .line 44
    .line 45
    aget-object v5, v1, v3

    .line 46
    .line 47
    add-int/2addr v6, v2

    .line 48
    aget-object v6, p0, v6

    .line 49
    .line 50
    aput-object v6, v5, v2

    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return-object v1
.end method


# virtual methods
.method public B(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[WeChatFileApi] "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public D(Ljava/lang/String;[[Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "\u521b\u5efa\u5a92\u4f53\u6d88\u606f\u5931\u8d25: \u6784\u9020mediaObject\u5931\u8d25 "

    .line 2
    .line 3
    const-string v1, "\u521b\u5efa\u5a92\u4f53\u6d88\u606f\u5931\u8d25: \u672a\u627e\u5230 "

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lh/Hchat/dexkit/DexFinder;

    .line 8
    .line 9
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->sendFileMethod:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    const-string p1, "\u521b\u5efa\u5a92\u4f53\u6d88\u606f\u5931\u8d25: sendFileMethod\u672a\u5c31\u7eea"

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v3

    .line 20
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {p1, v4}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v3

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    new-array v5, v1, [Ljava/lang/Class;

    .line 46
    .line 47
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    new-array v6, v1, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-static {v5, v6}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-nez v5, :cond_2

    .line 58
    .line 59
    new-array v1, v1, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-static {v4, v1}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    :cond_2
    if-nez v5, :cond_3

    .line 66
    .line 67
    move-object v5, v3

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-static {v5, p2}, Landroidx/lifecycle/x;->h(Ljava/lang/Object;[[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    if-nez v5, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v3

    .line 82
    :cond_4
    invoke-virtual {p0, v2, v5, p3}, Landroidx/lifecycle/x;->G(Ljava/lang/reflect/Method;Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    return-object p1

    .line 87
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string p3, "\u521b\u5efa\u5a92\u4f53\u6d88\u606f\u5f02\u5e38: "

    .line 90
    .line 91
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object v3
.end method

.method public E(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    return-object p1

    .line 20
    :catchall_0
    const/4 v0, 0x0

    .line 21
    :try_start_1
    new-array v1, v0, [Ljava/lang/Class;

    .line 22
    .line 23
    invoke-static {p1, v1}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-array v0, v0, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "filePath"

    .line 34
    .line 35
    invoke-static {p1, v0, p2}, Landroidx/lifecycle/x;->X(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :catchall_1
    move-exception p1

    .line 40
    new-instance p2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v0, "\u521b\u5efaWXFileObject\u5f02\u5e38: "

    .line 43
    .line 44
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    return-object p1
.end method

.method public F(Ljava/lang/reflect/Method;Ljava/io/File;Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v3, 0x0

    .line 17
    aget-object p1, p1, v3

    .line 18
    .line 19
    const-string v4, "com.tencent.mm.opensdk.modelmsg.WXFileObject"

    .line 20
    .line 21
    invoke-static {v4, v2}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {p0, v2, v4}, Landroidx/lifecycle/x;->E(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_3

    .line 49
    .line 50
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Ljava/lang/reflect/Constructor;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    array-length v8, v7

    .line 61
    const/4 v9, 0x1

    .line 62
    if-ne v8, v9, :cond_1

    .line 63
    .line 64
    aget-object v7, v7, v3

    .line 65
    .line 66
    invoke-virtual {v7, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-nez v7, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v6, v2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_4

    .line 84
    :cond_3
    move-object v2, v1

    .line 85
    :goto_1
    if-nez v2, :cond_4

    .line 86
    .line 87
    new-array v2, v3, [Ljava/lang/Class;

    .line 88
    .line 89
    invoke-static {p1, v2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-array v2, v3, [Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {p1, v2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const-string p1, "mediaObject"

    .line 100
    .line 101
    invoke-static {v2, p1, v4}, Landroidx/lifecycle/x;->X(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-nez p1, :cond_5

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    :goto_2
    const-string p1, "title"

    .line 116
    .line 117
    if-eqz p3, :cond_7

    .line 118
    .line 119
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    const/16 v4, 0x200

    .line 124
    .line 125
    if-gt p2, v4, :cond_6

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    invoke-virtual {p3, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    :cond_7
    :goto_3
    invoke-static {v2, p1, p3}, Landroidx/lifecycle/x;->X(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_8

    .line 140
    .line 141
    const-string p1, "description"

    .line 142
    .line 143
    invoke-static {v2, p1, v0}, Landroidx/lifecycle/x;->X(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    .line 146
    :cond_8
    return-object v2

    .line 147
    :goto_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string p3, "\u521b\u5efaWXMediaMessage\u5f02\u5e38: "

    .line 150
    .line 151
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-object v1
.end method

.method public G(Ljava/lang/reflect/Method;Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v1, 0x0

    .line 9
    aget-object p1, p1, v1

    .line 10
    .line 11
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    array-length v5, v4

    .line 36
    const/4 v6, 0x1

    .line 37
    if-ne v5, v6, :cond_0

    .line 38
    .line 39
    aget-object v4, v4, v1

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v3, v2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move-object v2, v0

    .line 64
    :goto_1
    if-nez v2, :cond_3

    .line 65
    .line 66
    new-array v2, v1, [Ljava/lang/Class;

    .line 67
    .line 68
    invoke-static {p1, v2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-array v1, v1, [Ljava/lang/Object;

    .line 73
    .line 74
    invoke-static {p1, v1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string p1, "mediaObject"

    .line 79
    .line 80
    invoke-static {v2, p1, p2}, Landroidx/lifecycle/x;->X(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-static {v2, p3}, Landroidx/lifecycle/x;->h(Ljava/lang/Object;[[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    return-object v2

    .line 87
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string p3, "\u6784\u9020WXMediaMessage\u5931\u8d25: "

    .line 90
    .line 91
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    return-object v0
.end method

.method public H(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public I(Ljava/lang/reflect/Method;Ljava/io/File;)Ljava/io/File;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0, v1}, Landroidx/lifecycle/x;->o(Ljava/lang/Class;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, ""

    .line 31
    .line 32
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/16 v5, 0x2f

    .line 40
    .line 41
    invoke-virtual {v3, v5}, Ljava/lang/String;->lastIndexOf(I)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    const/16 v6, 0x5c

    .line 46
    .line 47
    invoke-virtual {v3, v6}, Ljava/lang/String;->lastIndexOf(I)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const/16 v6, 0x2e

    .line 56
    .line 57
    invoke-virtual {v3, v6}, Ljava/lang/String;->lastIndexOf(I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-le v6, v5, :cond_3

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    add-int/lit8 v5, v5, -0x1

    .line 68
    .line 69
    if-lt v6, v5, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    :cond_3
    :goto_0
    invoke-virtual {p0, p1, v1, v2, v4}, Landroidx/lifecycle/x;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, Landroidx/lifecycle/x;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception p1

    .line 113
    goto :goto_4

    .line 114
    :cond_4
    :goto_1
    new-instance v1, Ljava/io/File;

    .line 115
    .line 116
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    .line 119
    :try_start_1
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    goto :goto_2

    .line 132
    :catchall_1
    :try_start_2
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    :goto_2
    if-eqz p1, :cond_5

    .line 145
    .line 146
    :goto_3
    return-object p2

    .line 147
    :cond_5
    invoke-virtual {p0, p2, v1}, Landroidx/lifecycle/x;->j(Ljava/io/File;Ljava/io/File;)Z

    .line 148
    .line 149
    .line 150
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    if-nez p1, :cond_6

    .line 152
    .line 153
    return-object v0

    .line 154
    :cond_6
    return-object v1

    .line 155
    :goto_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v1, "\u51c6\u5907\u9644\u4ef6\u5f02\u5e38: "

    .line 158
    .line 159
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-object v0
.end method

.method public J(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    aget-byte v1, v0, p1

    .line 6
    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    aget-byte v2, v0, v2

    .line 12
    .line 13
    and-int/lit16 v2, v2, 0xff

    .line 14
    .line 15
    shl-int/lit8 v2, v2, 0x8

    .line 16
    .line 17
    or-int/2addr v1, v2

    .line 18
    add-int/lit8 v2, p1, 0x2

    .line 19
    .line 20
    aget-byte v2, v0, v2

    .line 21
    .line 22
    and-int/lit16 v2, v2, 0xff

    .line 23
    .line 24
    shl-int/lit8 v2, v2, 0x10

    .line 25
    .line 26
    or-int/2addr v1, v2

    .line 27
    add-int/lit8 p1, p1, 0x3

    .line 28
    .line 29
    aget-byte p1, v0, p1

    .line 30
    .line 31
    shl-int/lit8 p1, p1, 0x18

    .line 32
    .line 33
    or-int/2addr p1, v1

    .line 34
    return p1
.end method

.method public K(I)J
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    aget-byte v1, v0, p1

    .line 6
    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    aget-byte v2, v0, v2

    .line 12
    .line 13
    and-int/lit16 v2, v2, 0xff

    .line 14
    .line 15
    shl-int/lit8 v2, v2, 0x8

    .line 16
    .line 17
    or-int/2addr v1, v2

    .line 18
    add-int/lit8 v2, p1, 0x2

    .line 19
    .line 20
    aget-byte v2, v0, v2

    .line 21
    .line 22
    and-int/lit16 v2, v2, 0xff

    .line 23
    .line 24
    shl-int/lit8 v2, v2, 0x10

    .line 25
    .line 26
    or-int/2addr v1, v2

    .line 27
    int-to-long v1, v1

    .line 28
    add-int/lit8 v3, p1, 0x3

    .line 29
    .line 30
    aget-byte v3, v0, v3

    .line 31
    .line 32
    int-to-long v3, v3

    .line 33
    const-wide/16 v5, 0xff

    .line 34
    .line 35
    and-long/2addr v3, v5

    .line 36
    const/16 v7, 0x18

    .line 37
    .line 38
    shl-long/2addr v3, v7

    .line 39
    or-long/2addr v1, v3

    .line 40
    add-int/lit8 v3, p1, 0x4

    .line 41
    .line 42
    aget-byte v3, v0, v3

    .line 43
    .line 44
    int-to-long v3, v3

    .line 45
    and-long/2addr v3, v5

    .line 46
    const/16 v7, 0x20

    .line 47
    .line 48
    shl-long/2addr v3, v7

    .line 49
    or-long/2addr v1, v3

    .line 50
    add-int/lit8 v3, p1, 0x5

    .line 51
    .line 52
    aget-byte v3, v0, v3

    .line 53
    .line 54
    int-to-long v3, v3

    .line 55
    and-long/2addr v3, v5

    .line 56
    const/16 v7, 0x28

    .line 57
    .line 58
    shl-long/2addr v3, v7

    .line 59
    or-long/2addr v1, v3

    .line 60
    add-int/lit8 v3, p1, 0x6

    .line 61
    .line 62
    aget-byte v3, v0, v3

    .line 63
    .line 64
    int-to-long v3, v3

    .line 65
    and-long/2addr v3, v5

    .line 66
    const/16 v5, 0x30

    .line 67
    .line 68
    shl-long/2addr v3, v5

    .line 69
    or-long/2addr v1, v3

    .line 70
    add-int/lit8 p1, p1, 0x7

    .line 71
    .line 72
    aget-byte p1, v0, p1

    .line 73
    .line 74
    int-to-long v3, p1

    .line 75
    const/16 p1, 0x38

    .line 76
    .line 77
    shl-long/2addr v3, p1

    .line 78
    or-long v0, v1, v3

    .line 79
    .line 80
    return-wide v0
.end method

.method public L(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    aget-byte v1, v0, p1

    .line 6
    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    aget-byte v2, v0, v2

    .line 12
    .line 13
    and-int/lit16 v2, v2, 0xff

    .line 14
    .line 15
    shl-int/lit8 v2, v2, 0x8

    .line 16
    .line 17
    or-int/2addr v1, v2

    .line 18
    add-int/lit8 v2, p1, 0x2

    .line 19
    .line 20
    aget-byte v2, v0, v2

    .line 21
    .line 22
    and-int/lit16 v2, v2, 0xff

    .line 23
    .line 24
    shl-int/lit8 v2, v2, 0x10

    .line 25
    .line 26
    or-int/2addr v1, v2

    .line 27
    add-int/lit8 v2, p1, 0x3

    .line 28
    .line 29
    aget-byte v0, v0, v2

    .line 30
    .line 31
    shl-int/lit8 v0, v0, 0x18

    .line 32
    .line 33
    or-int/2addr v0, v1

    .line 34
    const/4 v1, -0x1

    .line 35
    if-lt v0, v1, :cond_0

    .line 36
    .line 37
    return v0

    .line 38
    :cond_0
    new-instance v0, Ld6/f;

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v1, 0x0

    .line 49
    const-string v2, "Encountered optional uint that is out of range at offset 0x%x"

    .line 50
    .line 51
    invoke-direct {v0, v1, v2, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public M(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    aget-byte v1, v0, p1

    .line 6
    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    aget-byte p1, v0, p1

    .line 12
    .line 13
    shl-int/lit8 p1, p1, 0x8

    .line 14
    .line 15
    or-int/2addr p1, v1

    .line 16
    return p1
.end method

.method public N(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    aget-byte v1, v0, p1

    .line 6
    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    aget-byte v2, v0, v2

    .line 12
    .line 13
    and-int/lit16 v2, v2, 0xff

    .line 14
    .line 15
    shl-int/lit8 v2, v2, 0x8

    .line 16
    .line 17
    or-int/2addr v1, v2

    .line 18
    add-int/lit8 v2, p1, 0x2

    .line 19
    .line 20
    aget-byte v2, v0, v2

    .line 21
    .line 22
    and-int/lit16 v2, v2, 0xff

    .line 23
    .line 24
    shl-int/lit8 v2, v2, 0x10

    .line 25
    .line 26
    or-int/2addr v1, v2

    .line 27
    add-int/lit8 v2, p1, 0x3

    .line 28
    .line 29
    aget-byte v0, v0, v2

    .line 30
    .line 31
    shl-int/lit8 v0, v0, 0x18

    .line 32
    .line 33
    or-int/2addr v0, v1

    .line 34
    if-ltz v0, :cond_0

    .line 35
    .line 36
    return v0

    .line 37
    :cond_0
    new-instance v0, Ld6/f;

    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v1, 0x0

    .line 48
    const-string v2, "Encountered small uint that is out of range at offset 0x%x"

    .line 49
    .line 50
    invoke-direct {v0, v1, v2, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

.method public O(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    aget-byte p1, v0, p1

    .line 6
    .line 7
    and-int/lit16 p1, p1, 0xff

    .line 8
    .line 9
    return p1
.end method

.method public P(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    aget-byte v1, v0, p1

    .line 6
    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    aget-byte p1, v0, p1

    .line 12
    .line 13
    and-int/lit16 p1, p1, 0xff

    .line 14
    .line 15
    shl-int/lit8 p1, p1, 0x8

    .line 16
    .line 17
    or-int/2addr p1, v1

    .line 18
    return p1
.end method

.method public Q(Lsg/g;Lfg/a;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lf1/n0;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v2, "Called runAndWatch on a manager that has been disposed of"

    .line 13
    .line 14
    invoke-static {v2}, Li0/n1;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iget-object v2, v1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lf1/n0;

    .line 20
    .line 21
    instance-of v3, v2, Li0/f2;

    .line 22
    .line 23
    if-eqz v3, :cond_7

    .line 24
    .line 25
    check-cast v2, Li0/f2;

    .line 26
    .line 27
    iget-object v3, v2, Li0/f2;->l:Lsg/p;

    .line 28
    .line 29
    if-eqz v3, :cond_7

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_7

    .line 36
    .line 37
    new-instance v3, Li0/z0;

    .line 38
    .line 39
    invoke-direct {v3}, Li0/z0;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v4, v2, Li0/f2;->l:Lsg/p;

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string v5, "promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second"

    .line 48
    .line 49
    invoke-static {v5}, Li0/n1;->b(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget-object v5, v2, Li0/f2;->j:Lf/l0;

    .line 53
    .line 54
    iget-object v6, v3, Li0/z0;->i:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    iget-object v5, v2, Li0/f2;->h:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v7, Li0/w0;

    .line 64
    .line 65
    invoke-direct {v7, v5, v4}, Li0/w0;-><init>(Ljava/lang/Object;Lsg/p;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_2
    iget-object v7, v5, Lf/l0;->b:[Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v5, v5, Lf/l0;->a:[J

    .line 75
    .line 76
    array-length v8, v5

    .line 77
    add-int/lit8 v8, v8, -0x2

    .line 78
    .line 79
    if-ltz v8, :cond_6

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    :goto_2
    aget-wide v11, v5, v10

    .line 83
    .line 84
    not-long v13, v11

    .line 85
    const/4 v15, 0x7

    .line 86
    shl-long/2addr v13, v15

    .line 87
    and-long/2addr v13, v11

    .line 88
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    and-long/2addr v13, v15

    .line 94
    cmp-long v13, v13, v15

    .line 95
    .line 96
    if-eqz v13, :cond_5

    .line 97
    .line 98
    sub-int v13, v10, v8

    .line 99
    .line 100
    not-int v13, v13

    .line 101
    ushr-int/lit8 v13, v13, 0x1f

    .line 102
    .line 103
    const/16 v14, 0x8

    .line 104
    .line 105
    rsub-int/lit8 v13, v13, 0x8

    .line 106
    .line 107
    const/4 v15, 0x0

    .line 108
    :goto_3
    if-ge v15, v13, :cond_4

    .line 109
    .line 110
    const-wide/16 v16, 0xff

    .line 111
    .line 112
    and-long v16, v11, v16

    .line 113
    .line 114
    const-wide/16 v18, 0x80

    .line 115
    .line 116
    cmp-long v16, v16, v18

    .line 117
    .line 118
    if-gez v16, :cond_3

    .line 119
    .line 120
    shl-int/lit8 v16, v10, 0x3

    .line 121
    .line 122
    add-int v16, v16, v15

    .line 123
    .line 124
    aget-object v9, v7, v16

    .line 125
    .line 126
    move/from16 v16, v14

    .line 127
    .line 128
    new-instance v14, Li0/w0;

    .line 129
    .line 130
    invoke-direct {v14, v9, v4}, Li0/w0;-><init>(Ljava/lang/Object;Lsg/p;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_3
    move/from16 v16, v14

    .line 138
    .line 139
    :goto_4
    shr-long v11, v11, v16

    .line 140
    .line 141
    add-int/lit8 v15, v15, 0x1

    .line 142
    .line 143
    move/from16 v14, v16

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_4
    move v9, v14

    .line 147
    if-ne v13, v9, :cond_6

    .line 148
    .line 149
    :cond_5
    if-eq v10, v8, :cond_6

    .line 150
    .line 151
    add-int/lit8 v10, v10, 0x1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    :goto_5
    invoke-virtual {v3}, Li0/z0;->h()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Li0/f2;->j()V

    .line 158
    .line 159
    .line 160
    iput-object v3, v1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 161
    .line 162
    :cond_7
    iget-object v2, v1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v2, Lf1/n0;

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v0}, Lf1/n0;->n(Lsg/p;)Lfg/l;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {}, Lw0/m;->j()Lw0/f;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v4, v3}, Lw0/f;->u(Lfg/l;)Lw0/f;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v2, v0}, Lf1/n0;->g(Lsg/p;)V

    .line 182
    .line 183
    .line 184
    :try_start_0
    invoke-virtual {v3}, Lw0/f;->j()Lw0/f;

    .line 185
    .line 186
    .line 187
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    :try_start_1
    invoke-interface/range {p2 .. p2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 192
    :try_start_2
    invoke-static {v4}, Lw0/f;->q(Lw0/f;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3}, Lw0/f;->c()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Lf1/n0;->h()V

    .line 199
    .line 200
    .line 201
    return-object v0

    .line 202
    :catchall_0
    move-exception v0

    .line 203
    goto :goto_6

    .line 204
    :catchall_1
    move-exception v0

    .line 205
    :try_start_3
    invoke-static {v4}, Lw0/f;->q(Lw0/f;)V

    .line 206
    .line 207
    .line 208
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 209
    :goto_6
    invoke-virtual {v3}, Lw0/f;->c()V

    .line 210
    .line 211
    .line 212
    throw v0
.end method

.method public S(FFJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb5/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x20

    .line 10
    .line 11
    shr-long v1, p3, v1

    .line 12
    .line 13
    long-to-int v1, v1

    .line 14
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const-wide v3, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p3, v3

    .line 24
    long-to-int p3, p3

    .line 25
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    invoke-interface {v0, v2, p4}, Lf1/u;->m(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, p1, p2}, Lf1/u;->b(FF)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    neg-float p1, p1

    .line 40
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    neg-float p2, p2

    .line 45
    invoke-interface {v0, p1, p2}, Lf1/u;->m(FF)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    .line 1
    const-string v0, "\u53d1\u9001\u6587\u4ef6\u5931\u8d25: AppMsgLogic\u8fd4\u56de "

    .line 2
    .line 3
    const-string v1, "Hchat_file_"

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_7

    .line 11
    .line 12
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    new-instance v2, Ljava/io/File;

    .line 21
    .line 22
    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string p3, "\u53d1\u9001\u6587\u4ef6\u5931\u8d25: \u6587\u4ef6\u4e0d\u5b58\u5728 "

    .line 34
    .line 35
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return v3

    .line 49
    :cond_1
    iget-object p2, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, Lh/Hchat/dexkit/DexFinder;

    .line 52
    .line 53
    iget-object p2, p2, Lh/Hchat/dexkit/DexFinder;->sendFileMethod:Ljava/lang/reflect/Method;

    .line 54
    .line 55
    if-eqz p2, :cond_6

    .line 56
    .line 57
    :try_start_0
    invoke-virtual {p0, p2, v2}, Landroidx/lifecycle/x;->I(Ljava/lang/reflect/Method;Ljava/io/File;)Ljava/io/File;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {p0, p2, v2, p3}, Landroidx/lifecycle/x;->F(Ljava/lang/reflect/Method;Ljava/io/File;Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    if-nez v5, :cond_3

    .line 75
    .line 76
    const-string p1, "\u53d1\u9001\u6587\u4ef6\u5931\u8d25: WXMediaMessage\u521b\u5efa\u5931\u8d25"

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return v3

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    move-object p1, v0

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    new-instance p3, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 91
    .line 92
    .line 93
    move-result-wide v6

    .line 94
    invoke-virtual {p3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    const-string v6, "wx4310bbd51be7d979"

    .line 102
    .line 103
    const-string v7, "WeChat"

    .line 104
    .line 105
    const/4 p3, 0x2

    .line 106
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    move-object v8, p1

    .line 111
    filled-new-array/range {v5 .. v10}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const/4 p3, 0x0

    .line 116
    invoke-static {p2, p3, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    instance-of p2, p1, Ljava/lang/Number;

    .line 121
    .line 122
    if-eqz p2, :cond_4

    .line 123
    .line 124
    move-object p2, p1

    .line 125
    check-cast p2, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-gez p2, :cond_4

    .line 132
    .line 133
    new-instance p2, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string p1, " talker="

    .line 142
    .line 143
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string p1, " size="

    .line 150
    .line 151
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 155
    .line 156
    .line 157
    move-result-wide v0

    .line 158
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string p1, " attach="

    .line 162
    .line 163
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return v3

    .line 181
    :cond_4
    const/4 p1, 0x1

    .line 182
    return p1

    .line 183
    :cond_5
    :goto_0
    const-string p1, "\u53d1\u9001\u6587\u4ef6\u5931\u8d25: \u51c6\u5907\u9644\u4ef6\u5931\u8d25"

    .line 184
    .line 185
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    .line 187
    .line 188
    return v3

    .line 189
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string p3, "\u53d1\u9001\u6587\u4ef6\u5f02\u5e38: "

    .line 192
    .line 193
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return v3

    .line 211
    :cond_6
    const-string p1, "\u53d1\u9001\u6587\u4ef6\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 212
    .line 213
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return v3

    .line 217
    :cond_7
    :goto_2
    const-string p1, "\u53d1\u9001\u6587\u4ef6\u5931\u8d25: talker/filePath\u4e3a\u7a7a"

    .line 218
    .line 219
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return v3
.end method

.method public U(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    .line 1
    const-string v0, "\u53d1\u9001\u5a92\u4f53\u6d88\u606f\u5931\u8d25: AppMsgLogic\u8fd4\u56de "

    .line 2
    .line 3
    const-string v1, "Hchat_media_"

    .line 4
    .line 5
    const-string v2, "\u53d1\u9001\u5a92\u4f53\u6d88\u606f\u5931\u8d25: mediaMessage\u7c7b\u578b\u4e0d\u5339\u914d "

    .line 6
    .line 7
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_5

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    iget-object v3, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lh/Hchat/dexkit/DexFinder;

    .line 21
    .line 22
    iget-object v3, v3, Lh/Hchat/dexkit/DexFinder;->sendFileMethod:Ljava/lang/reflect/Method;

    .line 23
    .line 24
    if-eqz v3, :cond_4

    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    aget-object v5, v5, v4

    .line 31
    .line 32
    invoke-virtual {v5, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return v4

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    const-string p3, "wx4310bbd51be7d979"

    .line 64
    .line 65
    :cond_2
    move-object v6, p3

    .line 66
    new-instance p3, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    invoke-virtual {p3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    const-string v7, "WeChat"

    .line 83
    .line 84
    const/4 p3, 0x2

    .line 85
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    move-object v5, p1

    .line 90
    move-object v8, p2

    .line 91
    filled-new-array/range {v5 .. v10}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/4 p2, 0x0

    .line 96
    invoke-static {v3, p2, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    instance-of p2, p1, Ljava/lang/Number;

    .line 101
    .line 102
    if-eqz p2, :cond_3

    .line 103
    .line 104
    move-object p2, p1

    .line 105
    check-cast p2, Ljava/lang/Number;

    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-gez p2, :cond_3

    .line 112
    .line 113
    new-instance p2, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, " talker="

    .line 122
    .line 123
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    .line 136
    return v4

    .line 137
    :cond_3
    const/4 p1, 0x1

    .line 138
    return p1

    .line 139
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string p3, "\u53d1\u9001\u5a92\u4f53\u6d88\u606f\u5f02\u5e38: "

    .line 142
    .line 143
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return v4

    .line 161
    :cond_4
    const-string p1, "\u53d1\u9001\u5a92\u4f53\u6d88\u606f\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 162
    .line 163
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return v4

    .line 167
    :cond_5
    :goto_1
    const-string p1, "\u53d1\u9001\u5a92\u4f53\u6d88\u606f\u5931\u8d25: talker/mediaMessage\u4e3a\u7a7a"

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    return v4
.end method

.method public V(Lb5/c;)V
    .locals 9

    .line 1
    iget-object v0, p1, Lb5/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb8/e;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lz7/c;

    .line 8
    .line 9
    sget-object v2, Ly7/a;->a:Lr4/m;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lz7/c;->sort(Ljava/util/Comparator;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, v2, :cond_c

    .line 20
    .line 21
    iget-object v4, v1, Lz7/c;->g:[Ljava/lang/Object;

    .line 22
    .line 23
    aget-object v4, v4, v3

    .line 24
    .line 25
    check-cast v4, Lb8/g;

    .line 26
    .line 27
    iget-object v5, v4, Lb8/g;->i:Lb8/b;

    .line 28
    .line 29
    iget v6, v4, Lb8/g;->g:I

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    if-ne v6, v7, :cond_4

    .line 33
    .line 34
    iget-char v4, v4, Lb8/g;->h:C

    .line 35
    .line 36
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget-object v5, p1, Lb5/c;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, Lb8/h;

    .line 43
    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    iget-object v5, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v5, Lb8/f;

    .line 49
    .line 50
    if-nez v5, :cond_0

    .line 51
    .line 52
    move-object v5, v0

    .line 53
    :cond_0
    invoke-virtual {v5}, Lb8/k;->o()Lb8/h;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iput-object v5, p1, Lb5/c;->c:Ljava/lang/Object;

    .line 58
    .line 59
    :cond_1
    if-nez v4, :cond_2

    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_2
    iget-object v6, v5, Lb8/h;->h:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_3

    .line 70
    .line 71
    iput-object v4, v5, Lb8/h;->h:Ljava/lang/String;

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    iget-object v6, v5, Lb8/h;->h:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iput-object v4, v5, Lb8/h;->h:Ljava/lang/String;

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    :cond_4
    const/4 v4, 0x0

    .line 86
    if-nez v6, :cond_7

    .line 87
    .line 88
    invoke-interface {v5}, Lb8/b;->l()Lb8/f;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    iget-object v6, v5, Lb8/f;->l:Ljava/lang/String;

    .line 93
    .line 94
    iput-object v4, p1, Lb5/c;->c:Ljava/lang/Object;

    .line 95
    .line 96
    iget-object v4, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Lb8/f;

    .line 99
    .line 100
    if-nez v4, :cond_5

    .line 101
    .line 102
    move-object v4, v0

    .line 103
    :cond_5
    invoke-virtual {v4}, Lb8/k;->n()Lb8/f;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4, v6}, Lb8/f;->t(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iput-object v4, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 111
    .line 112
    new-instance v4, Lz7/l;

    .line 113
    .line 114
    new-instance v7, Landroidx/lifecycle/x;

    .line 115
    .line 116
    const/4 v8, 0x3

    .line 117
    invoke-direct {v7, v5, v8}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v4, v7}, Lz7/l;-><init>(Lz7/s;)V

    .line 121
    .line 122
    .line 123
    :goto_1
    invoke-virtual {v4}, Lz7/l;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_6

    .line 128
    .line 129
    invoke-virtual {v4}, Lz7/l;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, Lb8/d;

    .line 134
    .line 135
    invoke-virtual {v5, p1}, Lb8/d;->o(Lb5/c;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_6
    invoke-virtual {p1, v6}, Lb5/c;->j(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_7
    const/4 v7, 0x1

    .line 144
    if-ne v6, v7, :cond_9

    .line 145
    .line 146
    invoke-interface {v5}, Lb8/b;->l()Lb8/f;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    iget-object v6, v5, Lb8/f;->l:Ljava/lang/String;

    .line 151
    .line 152
    iput-object v4, p1, Lb5/c;->c:Ljava/lang/Object;

    .line 153
    .line 154
    iget-object v4, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v4, Lb8/f;

    .line 157
    .line 158
    if-nez v4, :cond_8

    .line 159
    .line 160
    move-object v4, v0

    .line 161
    :cond_8
    invoke-virtual {v4}, Lb8/k;->n()Lb8/f;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {v4, v6}, Lb8/f;->t(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iput-object v4, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 169
    .line 170
    new-instance v4, Lz7/l;

    .line 171
    .line 172
    new-instance v6, Landroidx/lifecycle/x;

    .line 173
    .line 174
    const/4 v7, 0x3

    .line 175
    invoke-direct {v6, v5, v7}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 176
    .line 177
    .line 178
    invoke-direct {v4, v6}, Lz7/l;-><init>(Lz7/s;)V

    .line 179
    .line 180
    .line 181
    :goto_2
    invoke-virtual {v4}, Lz7/l;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-eqz v5, :cond_a

    .line 186
    .line 187
    invoke-virtual {v4}, Lz7/l;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    check-cast v5, Lb8/d;

    .line 192
    .line 193
    invoke-virtual {v5, p1}, Lb8/d;->o(Lb5/c;)V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_9
    const/4 v4, 0x3

    .line 198
    if-ne v6, v4, :cond_b

    .line 199
    .line 200
    invoke-interface {v5}, Lb8/b;->getTagName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-virtual {p1, v4}, Lb5/c;->j(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :cond_a
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_b
    const-string p1, "Unknown span event: "

    .line 212
    .line 213
    invoke-static {v6, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_c
    return-void
.end method

.method public W(Lu2/k;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Region;

    .line 4
    .line 5
    iget v1, p1, Lu2/k;->a:I

    .line 6
    .line 7
    iget v2, p1, Lu2/k;->b:I

    .line 8
    .line 9
    iget v3, p1, Lu2/k;->c:I

    .line 10
    .line 11
    iget p1, p1, Lu2/k;->d:I

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/Region;->set(IIII)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public Y(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "\u5206\u4eab\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/io/File;

    .line 34
    .line 35
    iget-object v3, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Lr8/g;

    .line 38
    .line 39
    iget-object v3, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 40
    .line 41
    const-string v4, "android.support.v4.content.FileProvider"

    .line 42
    .line 43
    invoke-static {v4, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const/4 v4, 0x0

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    const-class v5, Ljava/lang/String;

    .line 51
    .line 52
    const-class v6, Ljava/io/File;

    .line 53
    .line 54
    const-class v7, Landroid/content/Context;

    .line 55
    .line 56
    filled-new-array {v7, v5, v6}, [Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const-string v6, "getUriForFile"

    .line 61
    .line 62
    invoke-static {v3, v6, v5}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const-string v6, ".external.fileprovider"

    .line 73
    .line 74
    invoke-static {v5, v6}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    filled-new-array {p1, v5, v2}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v3, v4, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    instance-of v3, v2, Landroid/net/Uri;

    .line 87
    .line 88
    if-eqz v3, :cond_1

    .line 89
    .line 90
    move-object v4, v2

    .line 91
    check-cast v4, Landroid/net/Uri;

    .line 92
    .line 93
    :cond_1
    if-eqz v4, :cond_2

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    const-string p1, "\u65e0\u6cd5\u751f\u6210\u5206\u4eab\u6587\u4ef6\u5730\u5740"

    .line 100
    .line 101
    return-object p1

    .line 102
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/4 v2, 0x1

    .line 107
    if-le v1, v2, :cond_4

    .line 108
    .line 109
    move v1, v2

    .line 110
    goto :goto_1

    .line 111
    :cond_4
    const/4 v1, 0x0

    .line 112
    :goto_1
    new-instance v3, Landroid/content/Intent;

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    const-string v4, "android.intent.action.SEND_MULTIPLE"

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    const-string v4, "android.intent.action.SEND"

    .line 120
    .line 121
    :goto_2
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, p3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    const-string p3, "android.intent.extra.STREAM"

    .line 128
    .line 129
    if-eqz v1, :cond_6

    .line 130
    .line 131
    new-instance v1, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, p3, v1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    invoke-static {v0}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Landroid/os/Parcelable;

    .line 145
    .line 146
    invoke-virtual {v3, p3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    :goto_3
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result p3

    .line 153
    if-nez p3, :cond_7

    .line 154
    .line 155
    const-string p3, "android.intent.extra.TEXT"

    .line 156
    .line 157
    invoke-virtual {v3, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 158
    .line 159
    .line 160
    :cond_7
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    invoke-static {p2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    check-cast p2, Ljava/io/File;

    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-static {v0}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p4

    .line 178
    check-cast p4, Landroid/net/Uri;

    .line 179
    .line 180
    invoke-static {p3, p2, p4}, Landroid/content/ClipData;->newUri(Landroid/content/ContentResolver;Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 185
    .line 186
    .line 187
    move-result p3

    .line 188
    move p4, v2

    .line 189
    :goto_4
    if-lt p4, p3, :cond_8

    .line 190
    .line 191
    invoke-virtual {v3, p2}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 195
    .line 196
    .line 197
    invoke-static {p1, v3}, Landroidx/lifecycle/x;->A(Landroid/app/Activity;Landroid/content/Intent;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    return-object p1

    .line 202
    :cond_8
    new-instance v1, Landroid/content/ClipData$Item;

    .line 203
    .line 204
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    check-cast v4, Landroid/net/Uri;

    .line 209
    .line 210
    invoke-direct {v1, v4}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p2, v1}, Landroid/content/ClipData;->addItem(Landroid/content/ClipData$Item;)V

    .line 214
    .line 215
    .line 216
    add-int/lit8 p4, p4, 0x1

    .line 217
    .line 218
    goto :goto_4
.end method

.method public Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z
    .locals 8

    .line 1
    const-string v4, "songLyric"

    .line 2
    .line 3
    const-string v6, "songAlbumUrl"

    .line 4
    .line 5
    const-string v0, "musicUrl"

    .line 6
    .line 7
    const-string v2, "musicDataUrl"

    .line 8
    .line 9
    move-object v1, p4

    .line 10
    move-object v3, p5

    .line 11
    move-object v5, p6

    .line 12
    move-object v7, p7

    .line 13
    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    invoke-static {p4}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    const-string v2, "description"

    .line 22
    .line 23
    const-string v4, "thumbData"

    .line 24
    .line 25
    const-string v0, "title"

    .line 26
    .line 27
    move-object v1, p2

    .line 28
    move-object v3, p3

    .line 29
    move-object/from16 v5, p8

    .line 30
    .line 31
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p2}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const-string p3, "com.tencent.mm.opensdk.modelmsg.WXMusicObject"

    .line 40
    .line 41
    invoke-virtual {p0, p3, p4, p2}, Landroidx/lifecycle/x;->D(Ljava/lang/String;[[Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    move-object/from16 p3, p9

    .line 48
    .line 49
    invoke-virtual {p0, p2, p1, p3}, Landroidx/lifecycle/x;->U(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_0
    const/4 p1, 0x0

    .line 58
    return p1
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lhb/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public b(Li/q;Li/q;Li/q;)J
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lhb/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lhb/c;->b(Li/q;Li/q;Li/q;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
.end method

.method public b0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 31
    .line 32
    .line 33
    move-object v1, v0

    .line 34
    :goto_1
    if-nez v1, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const v1, 0x1020002

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :cond_3
    if-eqz v1, :cond_4

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/View;->hasWindowFocus()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    new-instance v0, Lg3/g;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-direct {v0, v1, v2}, Lg3/g;-><init>(Landroid/view/View;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_2
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj8/q;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lj8/q;->c(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c0(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb5/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1, p2}, Lf1/u;->m(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public d(Lu4/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/g;

    .line 4
    .line 5
    iget p1, p1, Lu4/b;->a:I

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lz4/g;->l(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(Lu2/k;JLu2/m;J)J
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfg/a;

    .line 4
    .line 5
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lu2/j;

    .line 10
    .line 11
    iget-wide v0, v0, Lu2/j;->a:J

    .line 12
    .line 13
    iget v2, p1, Lu2/k;->a:I

    .line 14
    .line 15
    const/16 v3, 0x20

    .line 16
    .line 17
    shr-long v4, v0, v3

    .line 18
    .line 19
    long-to-int v4, v4

    .line 20
    add-int/2addr v2, v4

    .line 21
    shr-long v4, p5, v3

    .line 22
    .line 23
    long-to-int v4, v4

    .line 24
    shr-long v5, p2, v3

    .line 25
    .line 26
    long-to-int v5, v5

    .line 27
    sget-object v6, Lu2/m;->g:Lu2/m;

    .line 28
    .line 29
    const/4 v7, 0x1

    .line 30
    if-ne p4, v6, :cond_0

    .line 31
    .line 32
    move p4, v7

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p4, 0x0

    .line 35
    :goto_0
    invoke-static {v2, v4, v5, p4}, Ll/c;->a(IIIZ)I

    .line 36
    .line 37
    .line 38
    move-result p4

    .line 39
    iget p1, p1, Lu2/k;->b:I

    .line 40
    .line 41
    const-wide v4, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v0, v4

    .line 47
    long-to-int v0, v0

    .line 48
    add-int/2addr p1, v0

    .line 49
    and-long/2addr p5, v4

    .line 50
    long-to-int p5, p5

    .line 51
    and-long/2addr p2, v4

    .line 52
    long-to-int p2, p2

    .line 53
    invoke-static {p1, p5, p2, v7}, Ll/c;->a(IIIZ)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    int-to-long p2, p4

    .line 58
    shl-long/2addr p2, v3

    .line 59
    int-to-long p4, p1

    .line 60
    and-long/2addr p4, v4

    .line 61
    or-long p1, p2, p4

    .line 62
    .line 63
    return-wide p1
.end method

.method public f(ILh3/g;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(Li/q;Li/q;Li/q;)Li/q;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lhb/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lhb/c;->g(Li/q;Li/q;Li/q;)Li/q;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb8/f;

    .line 4
    .line 5
    iget-object v0, v0, Lb8/f;->k:Lz7/c;

    .line 6
    .line 7
    iget-object v0, v0, Lz7/c;->g:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    check-cast p1, Lb8/d;

    .line 12
    .line 13
    return-object p1
.end method

.method public i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->sendFileAttachPathMethod:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, ""

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    invoke-static {p2}, Landroidx/lifecycle/x;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    filled-new-array {v3, p3, p4}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v0, v1, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v3, v0, Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    :cond_1
    :goto_0
    move-object v0, v2

    .line 33
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    :try_start_1
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_6

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 74
    const-class v5, Ljava/lang/String;

    .line 75
    .line 76
    if-ne v4, v5, :cond_3

    .line 77
    .line 78
    :try_start_2
    array-length v4, v3

    .line 79
    const/4 v6, 0x3

    .line 80
    if-ne v4, v6, :cond_3

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    aget-object v4, v3, v4

    .line 84
    .line 85
    if-ne v4, v5, :cond_3

    .line 86
    .line 87
    const/4 v4, 0x1

    .line 88
    aget-object v4, v3, v4

    .line 89
    .line 90
    if-ne v4, v5, :cond_3

    .line 91
    .line 92
    const/4 v4, 0x2

    .line 93
    aget-object v3, v3, v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 94
    .line 95
    if-eq v3, v5, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    :try_start_3
    invoke-static {p2}, Landroidx/lifecycle/x;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    filled-new-array {v3, p3, p4}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-static {v0, v1, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    instance-of v3, v0, Ljava/lang/String;

    .line 111
    .line 112
    if-eqz v3, :cond_5

    .line 113
    .line 114
    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :catchall_1
    :cond_5
    move-object v0, v2

    .line 118
    :goto_3
    :try_start_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    return-object v0

    .line 125
    :catchall_2
    :cond_6
    return-object v2
.end method

.method public j(Ljava/io/File;Ljava/io/File;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :catchall_0
    move-exception p1

    .line 24
    move-object p2, v1

    .line 25
    goto :goto_3

    .line 26
    :cond_0
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/io/File;->length()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    cmp-long v2, v2, v4

    .line 41
    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    new-instance v2, Ljava/io/FileInputStream;

    .line 46
    .line 47
    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :try_start_1
    new-instance p1, Ljava/io/FileOutputStream;

    .line 51
    .line 52
    invoke-direct {p1, p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 53
    .line 54
    .line 55
    const/16 p2, 0x2000

    .line 56
    .line 57
    :try_start_2
    new-array p2, p2, [B

    .line 58
    .line 59
    :goto_0
    invoke-virtual {v2, p2}, Ljava/io/FileInputStream;->read([B)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-lez v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p1, p2, v0, v1}, Ljava/io/FileOutputStream;->write([BII)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_1
    move-exception p2

    .line 70
    move-object v1, p2

    .line 71
    move-object p2, p1

    .line 72
    move-object p1, v1

    .line 73
    :goto_1
    move-object v1, v2

    .line 74
    goto :goto_3

    .line 75
    :cond_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 76
    .line 77
    .line 78
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 79
    .line 80
    .line 81
    :catchall_2
    :try_start_4
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 82
    .line 83
    .line 84
    :catchall_3
    :goto_2
    const/4 p1, 0x1

    .line 85
    return p1

    .line 86
    :catchall_4
    move-exception p1

    .line 87
    move-object p2, v1

    .line 88
    goto :goto_1

    .line 89
    :goto_3
    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v3, "\u590d\u5236\u9644\u4ef6\u5f02\u5e38: "

    .line 95
    .line 96
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->B(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 111
    .line 112
    .line 113
    if-eqz v1, :cond_3

    .line 114
    .line 115
    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 116
    .line 117
    .line 118
    :catchall_5
    :cond_3
    if-eqz p2, :cond_4

    .line 119
    .line 120
    :try_start_7
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 121
    .line 122
    .line 123
    :catchall_6
    :cond_4
    :goto_4
    return v0

    .line 124
    :catchall_7
    move-exception p1

    .line 125
    if-eqz v1, :cond_5

    .line 126
    .line 127
    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 128
    .line 129
    .line 130
    :catchall_8
    :cond_5
    if-eqz p2, :cond_6

    .line 131
    .line 132
    :try_start_9
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 133
    .line 134
    .line 135
    :catchall_9
    :cond_6
    throw p1
.end method

.method public l(I)Lh3/g;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public m()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public n(JLi/q;Li/q;Li/q;)Li/q;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lhb/c;

    .line 5
    .line 6
    move-wide v2, p1

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object v6, p5

    .line 10
    invoke-virtual/range {v1 .. v6}, Lhb/c;->n(JLi/q;Li/q;Li/q;)Li/q;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public o(Ljava/lang/Class;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->sendFileAttachDirMethod:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    new-array v4, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v0, v2, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v4, v0, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    :cond_1
    :goto_0
    move-object v0, v3

    .line 28
    :goto_1
    invoke-static {v0}, Landroidx/lifecycle/x;->C(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    invoke-static {v0}, Landroidx/lifecycle/x;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_2
    :try_start_1
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_6

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/reflect/Method;

    .line 58
    .line 59
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    const-class v5, Ljava/lang/String;

    .line 70
    .line 71
    if-ne v4, v5, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    array-length v4, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 78
    if-eqz v4, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :try_start_2
    new-array v4, v1, [Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v0, v2, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    instance-of v4, v0, Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v4, :cond_5

    .line 90
    .line 91
    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :catchall_1
    :cond_5
    move-object v0, v3

    .line 95
    :goto_3
    :try_start_3
    invoke-static {v0}, Landroidx/lifecycle/x;->C(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_3

    .line 100
    .line 101
    invoke-static {v0}, Landroidx/lifecycle/x;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 105
    return-object p1

    .line 106
    :catchall_2
    :cond_6
    return-object v3
.end method

.method public onSuccess(Ljava/io/File;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj8/q;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lj8/q;->onSuccess(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public r(I)Lh3/g;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb8/f;

    .line 4
    .line 5
    iget-object v0, v0, Lb8/f;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public t(I)Li/z;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/lifecycle/x;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Li/z;

    .line 9
    .line 10
    return-object p1

    .line 11
    :pswitch_0
    iget-object p1, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Li/a0;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, [Li/a0;

    .line 19
    .line 20
    aget-object p1, v0, p1

    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public u(I)I
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, [I

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    if-ge p1, v1, :cond_0

    .line 9
    .line 10
    aget p1, v0, p1

    .line 11
    .line 12
    return p1

    .line 13
    :cond_0
    new-instance v0, Lc6/a;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x0

    .line 24
    const-string v2, "Instruction index out of bounds: %d"

    .line 25
    .line 26
    invoke-direct {v0, v1, v2, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method public w(JLi/q;Li/q;Li/q;)Li/q;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lhb/c;

    .line 5
    .line 6
    move-wide v2, p1

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object v6, p5

    .line 10
    invoke-virtual/range {v1 .. v6}, Lhb/c;->w(JLi/q;Li/q;Li/q;)Li/q;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public x(IZ)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gez v0, :cond_1

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    not-int p1, v0

    .line 14
    add-int/lit8 p1, p1, -0x1

    .line 15
    .line 16
    return p1

    .line 17
    :cond_0
    new-instance p2, Lc6/b;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v0, 0x0

    .line 28
    const-string v1, "No instruction at offset %d"

    .line 29
    .line 30
    invoke-direct {p2, v0, v1, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    throw p2

    .line 34
    :cond_1
    return v0
.end method

.method public y()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "input_method"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public z(FFFF)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb5/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lb5/c;->v()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const/16 v4, 0x20

    .line 14
    .line 15
    shr-long/2addr v2, v4

    .line 16
    long-to-int v2, v2

    .line 17
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-float/2addr p3, p1

    .line 22
    sub-float/2addr v2, p3

    .line 23
    invoke-virtual {v0}, Lb5/c;->v()J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    const-wide v7, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v5, v7

    .line 33
    long-to-int p3, v5

    .line 34
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    add-float/2addr p4, p2

    .line 39
    sub-float/2addr p3, p4

    .line 40
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result p4

    .line 44
    int-to-long v2, p4

    .line 45
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    int-to-long p3, p3

    .line 50
    shl-long/2addr v2, v4

    .line 51
    and-long/2addr p3, v7

    .line 52
    or-long/2addr p3, v2

    .line 53
    shr-long v2, p3, v4

    .line 54
    .line 55
    long-to-int v2, v2

    .line 56
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v3, 0x0

    .line 61
    cmpl-float v2, v2, v3

    .line 62
    .line 63
    if-ltz v2, :cond_0

    .line 64
    .line 65
    and-long v4, p3, v7

    .line 66
    .line 67
    long-to-int v2, v4

    .line 68
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    cmpl-float v2, v2, v3

    .line 73
    .line 74
    if-ltz v2, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string v2, "Width and height must be greater than or equal to zero"

    .line 78
    .line 79
    invoke-static {v2}, Lf1/g0;->a(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-virtual {v0, p3, p4}, Lb5/c;->U(J)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v1, p1, p2}, Lf1/u;->m(FF)V

    .line 86
    .line 87
    .line 88
    return-void
.end method
