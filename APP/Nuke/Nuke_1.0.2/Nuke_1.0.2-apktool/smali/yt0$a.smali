.class public final synthetic Lyt0$a;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyt0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lqo0;"
    }
.end annotation

.annotation runtime Lj70;
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lyt0$a;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyt0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lyt0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyt0$a;->INSTANCE:Lyt0$a;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.data.model.HookerDebugRecord"

    .line 11
    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "hookerId"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "hookerClassName"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "phase"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "reason"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "throwableClassName"

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "throwableMessage"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "stackTrace"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "timestamp"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    sput-object v1, Lyt0$a;->descriptor:Lyo2;

    .line 60
    .line 61
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ly40;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyt0$a;->f(Ly40;)Lyt0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final b()[Lw41;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lw41;"
        }
    .end annotation

    .line 1
    sget-object p0, Lnv2;->a:Lnv2;

    .line 2
    .line 3
    invoke-static {p0}, Lse;->D(Lw41;)Lw41;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Lse;->D(Lw41;)Lw41;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p0}, Lse;->D(Lw41;)Lw41;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/16 v3, 0x8

    .line 16
    .line 17
    new-array v3, v3, [Lw41;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    aput-object p0, v3, v4

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    aput-object p0, v3, v4

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    aput-object p0, v3, v4

    .line 27
    .line 28
    const/4 v4, 0x3

    .line 29
    aput-object p0, v3, v4

    .line 30
    .line 31
    const/4 p0, 0x4

    .line 32
    aput-object v0, v3, p0

    .line 33
    .line 34
    const/4 p0, 0x5

    .line 35
    aput-object v1, v3, p0

    .line 36
    .line 37
    const/4 p0, 0x6

    .line 38
    aput-object v2, v3, p0

    .line 39
    .line 40
    sget-object p0, Led1;->a:Led1;

    .line 41
    .line 42
    const/4 v0, 0x7

    .line 43
    aput-object p0, v3, v0

    .line 44
    .line 45
    return-object v3
.end method

.method public bridge c()[Lw41;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lw41;"
        }
    .end annotation

    .line 1
    sget-object p0, Lp40;->l:[Lw41;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic d(Lve0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lyt0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyt0$a;->g(Lve0;Lyt0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lyt0$a;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Ly40;)Lyt0;
    .locals 19

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lyt0$a;->descriptor:Lyo2;

    .line 5
    .line 6
    move-object/from16 v1, p1

    .line 7
    .line 8
    invoke-interface {v1, v0}, Ly40;->b(Lyo2;)Lvx;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const-wide/16 v5, 0x0

    .line 16
    .line 17
    move v8, v3

    .line 18
    move-object v9, v4

    .line 19
    move-object v10, v9

    .line 20
    move-object v11, v10

    .line 21
    move-object v12, v11

    .line 22
    move-object v13, v12

    .line 23
    move-object v14, v13

    .line 24
    move-object v15, v14

    .line 25
    move-wide/from16 v16, v5

    .line 26
    .line 27
    move v4, v2

    .line 28
    :goto_0
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-interface {v1, v0}, Lvx;->j(Lyo2;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    packed-switch v5, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    new-instance v0, Le83;

    .line 38
    .line 39
    invoke-direct {v0, v5}, Le83;-><init>(I)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :pswitch_0
    const/4 v5, 0x7

    .line 44
    invoke-interface {v1, v0, v5}, Lvx;->z(Lyo2;I)J

    .line 45
    .line 46
    .line 47
    move-result-wide v16

    .line 48
    or-int/lit16 v8, v8, 0x80

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_1
    sget-object v5, Lnv2;->a:Lnv2;

    .line 52
    .line 53
    const/4 v5, 0x6

    .line 54
    invoke-interface {v1, v0, v5, v15}, Lvx;->x(Lyo2;ILjava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    move-object v15, v5

    .line 59
    check-cast v15, Ljava/lang/String;

    .line 60
    .line 61
    or-int/lit8 v8, v8, 0x40

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_2
    sget-object v5, Lnv2;->a:Lnv2;

    .line 65
    .line 66
    const/4 v5, 0x5

    .line 67
    invoke-interface {v1, v0, v5, v14}, Lvx;->x(Lyo2;ILjava/lang/String;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    move-object v14, v5

    .line 72
    check-cast v14, Ljava/lang/String;

    .line 73
    .line 74
    or-int/lit8 v8, v8, 0x20

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_3
    sget-object v5, Lnv2;->a:Lnv2;

    .line 78
    .line 79
    const/4 v5, 0x4

    .line 80
    invoke-interface {v1, v0, v5, v13}, Lvx;->x(Lyo2;ILjava/lang/String;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    move-object v13, v5

    .line 85
    check-cast v13, Ljava/lang/String;

    .line 86
    .line 87
    or-int/lit8 v8, v8, 0x10

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_4
    const/4 v5, 0x3

    .line 91
    invoke-interface {v1, v0, v5}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    or-int/lit8 v8, v8, 0x8

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :pswitch_5
    const/4 v5, 0x2

    .line 99
    invoke-interface {v1, v0, v5}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    or-int/lit8 v8, v8, 0x4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :pswitch_6
    invoke-interface {v1, v0, v2}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    or-int/lit8 v8, v8, 0x2

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_7
    invoke-interface {v1, v0, v3}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    or-int/lit8 v8, v8, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :pswitch_8
    move v4, v3

    .line 121
    goto :goto_0

    .line 122
    :cond_0
    invoke-interface {v1, v0}, Lvx;->a(Lyo2;)V

    .line 123
    .line 124
    .line 125
    new-instance v7, Lyt0;

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    invoke-direct/range {v7 .. v18}, Lyt0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLdp2;)V

    .line 130
    .line 131
    .line 132
    return-object v7

    .line 133
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lve0;Lyt0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lyt0$a;->descriptor:Lyo2;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lve0;->b(Lyo2;)Lwx;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2, p1, p0}, Lyt0;->s(Lyt0;Lwx;Lyo2;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, Lwx;->a(Lyo2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
