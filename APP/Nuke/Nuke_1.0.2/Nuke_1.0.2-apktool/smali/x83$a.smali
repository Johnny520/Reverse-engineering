.class public final synthetic Lx83$a;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx83;
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

.field public static final INSTANCE:Lx83$a;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx83$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lx83$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx83$a;->INSTANCE:Lx83$a;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.data.model.User"

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "premium"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "deviceInfo"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "hostInfo"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "loginUin"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "nickname"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "lastLoginTime"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "config"

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "cookies"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "avatarFilePath"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    sput-object v1, Lx83$a;->descriptor:Lyo2;

    .line 65
    .line 66
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
    invoke-virtual {p0, p1}, Lx83$a;->f(Ly40;)Lx83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final b()[Lw41;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lw41;"
        }
    .end annotation

    .line 1
    const/16 p0, 0x9

    .line 2
    .line 3
    new-array p0, p0, [Lw41;

    .line 4
    .line 5
    sget-object v0, Lt22$a;->INSTANCE:Lt22$a;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aput-object v0, p0, v1

    .line 9
    .line 10
    sget-object v0, Lo70$a;->INSTANCE:Lo70$a;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    aput-object v0, p0, v1

    .line 14
    .line 15
    sget-object v0, Lnu0$a;->INSTANCE:Lnu0$a;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    aput-object v0, p0, v1

    .line 19
    .line 20
    sget-object v0, Lnv2;->a:Lnv2;

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    aput-object v0, p0, v1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    aput-object v0, p0, v1

    .line 27
    .line 28
    sget-object v1, Led1;->a:Led1;

    .line 29
    .line 30
    const/4 v2, 0x5

    .line 31
    aput-object v1, p0, v2

    .line 32
    .line 33
    const/4 v1, 0x6

    .line 34
    aput-object v0, p0, v1

    .line 35
    .line 36
    const/4 v1, 0x7

    .line 37
    aput-object v0, p0, v1

    .line 38
    .line 39
    const/16 v1, 0x8

    .line 40
    .line 41
    aput-object v0, p0, v1

    .line 42
    .line 43
    return-object p0
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
    check-cast p2, Lx83;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lx83$a;->g(Lve0;Lx83;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lx83$a;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Ly40;)Lx83;
    .locals 20

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lx83$a;->descriptor:Lyo2;

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
    move-object/from16 v16, v13

    .line 24
    .line 25
    move-object/from16 v17, v16

    .line 26
    .line 27
    move-object/from16 v18, v17

    .line 28
    .line 29
    move-wide v14, v5

    .line 30
    move v4, v2

    .line 31
    :goto_0
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-interface {v1, v0}, Lvx;->j(Lyo2;)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    packed-switch v5, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    new-instance v0, Le83;

    .line 41
    .line 42
    invoke-direct {v0, v5}, Le83;-><init>(I)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :pswitch_0
    const/16 v5, 0x8

    .line 47
    .line 48
    invoke-interface {v1, v0, v5}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v18

    .line 52
    or-int/lit16 v8, v8, 0x100

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_1
    const/4 v5, 0x7

    .line 56
    invoke-interface {v1, v0, v5}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v17

    .line 60
    or-int/lit16 v8, v8, 0x80

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_2
    const/4 v5, 0x6

    .line 64
    invoke-interface {v1, v0, v5}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v16

    .line 68
    or-int/lit8 v8, v8, 0x40

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_3
    const/4 v5, 0x5

    .line 72
    invoke-interface {v1, v0, v5}, Lvx;->z(Lyo2;I)J

    .line 73
    .line 74
    .line 75
    move-result-wide v14

    .line 76
    or-int/lit8 v8, v8, 0x20

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_4
    const/4 v5, 0x4

    .line 80
    invoke-interface {v1, v0, v5}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v13

    .line 84
    or-int/lit8 v8, v8, 0x10

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_5
    const/4 v5, 0x3

    .line 88
    invoke-interface {v1, v0, v5}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    or-int/lit8 v8, v8, 0x8

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_6
    sget-object v5, Lnu0$a;->INSTANCE:Lnu0$a;

    .line 96
    .line 97
    const/4 v6, 0x2

    .line 98
    invoke-interface {v1, v0, v6, v5, v11}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    move-object v11, v5

    .line 103
    check-cast v11, Lnu0;

    .line 104
    .line 105
    or-int/lit8 v8, v8, 0x4

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :pswitch_7
    sget-object v5, Lo70$a;->INSTANCE:Lo70$a;

    .line 109
    .line 110
    invoke-interface {v1, v0, v2, v5, v10}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    move-object v10, v5

    .line 115
    check-cast v10, Lo70;

    .line 116
    .line 117
    or-int/lit8 v8, v8, 0x2

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :pswitch_8
    sget-object v5, Lt22$a;->INSTANCE:Lt22$a;

    .line 121
    .line 122
    invoke-interface {v1, v0, v3, v5, v9}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    move-object v9, v5

    .line 127
    check-cast v9, Lt22;

    .line 128
    .line 129
    or-int/lit8 v8, v8, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :pswitch_9
    move v4, v3

    .line 133
    goto :goto_0

    .line 134
    :cond_0
    invoke-interface {v1, v0}, Lvx;->a(Lyo2;)V

    .line 135
    .line 136
    .line 137
    new-instance v7, Lx83;

    .line 138
    .line 139
    const/16 v19, 0x0

    .line 140
    .line 141
    invoke-direct/range {v7 .. v19}, Lx83;-><init>(ILt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldp2;)V

    .line 142
    .line 143
    .line 144
    return-object v7

    .line 145
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
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

.method public final g(Lve0;Lx83;)V
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
    sget-object p0, Lx83$a;->descriptor:Lyo2;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lve0;->b(Lyo2;)Lwx;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2, p1, p0}, Lx83;->u(Lx83;Lwx;Lyo2;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, Lwx;->a(Lyo2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
