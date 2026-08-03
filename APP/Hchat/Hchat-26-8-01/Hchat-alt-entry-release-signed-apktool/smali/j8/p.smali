.class public final Lj8/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lj8/n;

.field public final b:Lj8/y;

.field public final c:Lbb/b;

.field public final d:Lj8/f;

.field public final e:Landroidx/lifecycle/x;

.field public final f:Lj8/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lq8/o;Li8/f;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v4, Lj8/n;

    .line 5
    .line 6
    new-instance v0, Li8/f;

    .line 7
    .line 8
    const/16 v3, 0x1a

    .line 9
    .line 10
    invoke-direct {v0, p6, v3}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v4, p1, p2, v0}, Lj8/n;-><init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Li8/f;)V

    .line 14
    .line 15
    .line 16
    iput-object v4, p0, Lj8/p;->a:Lj8/n;

    .line 17
    .line 18
    new-instance v0, Lj8/y;

    .line 19
    .line 20
    new-instance v3, Li8/f;

    .line 21
    .line 22
    const/16 v5, 0x1b

    .line 23
    .line 24
    invoke-direct {v3, p6, v5}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p1, p2, v3}, Lj8/y;-><init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Li8/f;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lj8/p;->b:Lj8/y;

    .line 31
    .line 32
    new-instance v0, Lbb/b;

    .line 33
    .line 34
    new-instance v5, Li8/f;

    .line 35
    .line 36
    const/16 v3, 0x1c

    .line 37
    .line 38
    invoke-direct {v5, p6, v3}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    move-object v1, p1

    .line 42
    move-object v2, p2

    .line 43
    move-object v3, p5

    .line 44
    invoke-direct/range {v0 .. v5}, Lbb/b;-><init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Lq8/o;Lj8/n;Li8/f;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lj8/p;->c:Lbb/b;

    .line 48
    .line 49
    new-instance v0, Lj8/f;

    .line 50
    .line 51
    new-instance v3, Li8/f;

    .line 52
    .line 53
    const/16 v4, 0x1d

    .line 54
    .line 55
    invoke-direct {v3, p6, v4}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, p1, p2, v3}, Lj8/f;-><init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Li8/f;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lj8/p;->d:Lj8/f;

    .line 62
    .line 63
    new-instance v0, Landroidx/lifecycle/x;

    .line 64
    .line 65
    new-instance v3, Lj8/o;

    .line 66
    .line 67
    invoke-direct {v3, p6}, Lj8/o;-><init>(Li8/f;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, p2, v3}, Landroidx/lifecycle/x;-><init>(Lh/Hchat/dexkit/DexFinder;Lj8/o;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 74
    .line 75
    new-instance v0, Lj8/h;

    .line 76
    .line 77
    new-instance v3, Lj8/o;

    .line 78
    .line 79
    invoke-direct {v3, p6}, Lj8/o;-><init>(Li8/f;)V

    .line 80
    .line 81
    .line 82
    move-object v4, p4

    .line 83
    move-object v5, p5

    .line 84
    move-object v6, v3

    .line 85
    move-object v3, p3

    .line 86
    invoke-direct/range {v0 .. v6}, Lj8/h;-><init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lq8/o;Lj8/o;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lj8/p;->f:Lj8/h;

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lj8/p;->a:Lj8/n;

    .line 5
    .line 6
    invoke-virtual {v2, p1, p2, v0, v1}, Lj8/n;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v2, "/0/page-frame.html"

    .line 11
    .line 12
    const-string v3, "https://servicewechat.com/"

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p4}, Landroidx/lifecycle/x;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :goto_0
    move-object v7, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p4}, Landroidx/lifecycle/x;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const-string v1, "https://weixin.qq.com/"

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :goto_1
    const-string v8, "miniprogramType"

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    const-string v2, "userName"

    .line 74
    .line 75
    const-string v4, "path"

    .line 76
    .line 77
    const-string v6, "webpageUrl"

    .line 78
    .line 79
    move-object v3, p4

    .line 80
    move-object v5, p5

    .line 81
    filled-new-array/range {v2 .. v9}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    invoke-static {p4}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    const-string v4, "description"

    .line 90
    .line 91
    const-string v6, "thumbData"

    .line 92
    .line 93
    const-string v2, "title"

    .line 94
    .line 95
    move-object v3, p2

    .line 96
    move-object v5, p3

    .line 97
    move-object/from16 v7, p6

    .line 98
    .line 99
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p2}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    const-string p3, "com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject"

    .line 108
    .line 109
    invoke-virtual {v0, p3, p4, p2}, Landroidx/lifecycle/x;->D(Ljava/lang/String;[[Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    if-eqz p2, :cond_2

    .line 114
    .line 115
    move-object/from16 p3, p7

    .line 116
    .line 117
    invoke-virtual {v0, p2, p1, p3}, Landroidx/lifecycle/x;->U(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_2

    .line 122
    .line 123
    const/4 p1, 0x1

    .line 124
    return p1

    .line 125
    :cond_2
    return v1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z
    .locals 7

    .line 1
    const-string v0, "webpageUrl"

    .line 2
    .line 3
    filled-new-array {v0, p4}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p4

    .line 7
    iget-object v0, p0, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p4}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    const-string v3, "description"

    .line 17
    .line 18
    const-string v5, "thumbData"

    .line 19
    .line 20
    const-string v1, "title"

    .line 21
    .line 22
    move-object v2, p2

    .line 23
    move-object v4, p3

    .line 24
    move-object v6, p5

    .line 25
    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p2}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const-string p3, "com.tencent.mm.opensdk.modelmsg.WXWebpageObject"

    .line 34
    .line 35
    invoke-virtual {v0, p3, p4, p2}, Landroidx/lifecycle/x;->D(Ljava/lang/String;[[Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, p2, p1, p6}, Landroidx/lifecycle/x;->U(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    return p1

    .line 49
    :cond_0
    const/4 p1, 0x0

    .line 50
    return p1
.end method
