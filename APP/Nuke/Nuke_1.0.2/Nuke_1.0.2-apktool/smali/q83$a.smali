.class public final synthetic Lq83$a;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq83;
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

.field public static final INSTANCE:Lq83$a;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lq83$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lq83$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq83$a;->INSTANCE:Lq83$a;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.data.model.Update"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "lastVersion"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "limitVersion"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "updateTime"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "message"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "downloadUrl"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "isFocusUpdate"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lq83$a;->descriptor:Lyo2;

    .line 48
    .line 49
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
    invoke-virtual {p0, p1}, Lq83$a;->f(Ly40;)Lq83;

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
    const/4 p0, 0x6

    .line 2
    new-array p0, p0, [Lw41;

    .line 3
    .line 4
    sget-object v0, Lnv2;->a:Lnv2;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aput-object v0, p0, v1

    .line 11
    .line 12
    sget-object v1, Led1;->a:Led1;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    aput-object v1, p0, v2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    aput-object v0, p0, v1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    aput-object v0, p0, v1

    .line 22
    .line 23
    sget-object v0, Lll;->a:Lll;

    .line 24
    .line 25
    const/4 v1, 0x5

    .line 26
    aput-object v0, p0, v1

    .line 27
    .line 28
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
    check-cast p2, Lq83;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lq83$a;->g(Lve0;Lq83;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lq83$a;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Ly40;)Lq83;
    .locals 17

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lq83$a;->descriptor:Lyo2;

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
    move v15, v8

    .line 19
    move-object v9, v4

    .line 20
    move-object v10, v9

    .line 21
    move-object v13, v10

    .line 22
    move-object v14, v13

    .line 23
    move-wide v11, v5

    .line 24
    move v4, v2

    .line 25
    :goto_0
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-interface {v1, v0}, Lvx;->j(Lyo2;)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    packed-switch v5, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    new-instance v0, Le83;

    .line 35
    .line 36
    invoke-direct {v0, v5}, Le83;-><init>(I)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :pswitch_0
    const/4 v5, 0x5

    .line 41
    invoke-interface {v1, v0, v5}, Lvx;->q(Lyo2;I)Z

    .line 42
    .line 43
    .line 44
    move-result v15

    .line 45
    or-int/lit8 v8, v8, 0x20

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_1
    const/4 v5, 0x4

    .line 49
    invoke-interface {v1, v0, v5}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v14

    .line 53
    or-int/lit8 v8, v8, 0x10

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_2
    const/4 v5, 0x3

    .line 57
    invoke-interface {v1, v0, v5}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    or-int/lit8 v8, v8, 0x8

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_3
    const/4 v5, 0x2

    .line 65
    invoke-interface {v1, v0, v5}, Lvx;->z(Lyo2;I)J

    .line 66
    .line 67
    .line 68
    move-result-wide v11

    .line 69
    or-int/lit8 v8, v8, 0x4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_4
    invoke-interface {v1, v0, v2}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    or-int/lit8 v8, v8, 0x2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_5
    invoke-interface {v1, v0, v3}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    or-int/lit8 v8, v8, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_6
    move v4, v3

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-interface {v1, v0}, Lvx;->a(Lyo2;)V

    .line 89
    .line 90
    .line 91
    new-instance v7, Lq83;

    .line 92
    .line 93
    const/16 v16, 0x0

    .line 94
    .line 95
    invoke-direct/range {v7 .. v16}, Lq83;-><init>(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLdp2;)V

    .line 96
    .line 97
    .line 98
    return-object v7

    .line 99
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lve0;Lq83;)V
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
    sget-object p0, Lq83$a;->descriptor:Lyo2;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lve0;->b(Lyo2;)Lwx;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2, p1, p0}, Lq83;->o(Lq83;Lwx;Lyo2;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, Lwx;->a(Lyo2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
