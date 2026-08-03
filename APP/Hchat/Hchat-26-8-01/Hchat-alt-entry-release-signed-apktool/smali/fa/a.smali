.class public final Lfa/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final f:Ljava/util/HashSet;


# instance fields
.field public e:Lea/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfa/a;->f:Ljava/util/HashSet;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "skip_global_mini_program_splash_ads"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Laa/g;

    .line 5
    .line 6
    const-string v0, "\u963b\u6b62\u6240\u6709\u5c0f\u7a0b\u5e8f\u5c55\u793a\u542f\u52a8\u5f00\u5c4f\u5e7f\u544a"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "skip_global_mini_program_splash_ads"

    .line 11
    .line 12
    const-string v3, "\u8df3\u8fc7\u5168\u5c40\u5c0f\u7a0b\u5e8f\u5f00\u5c4f\u5e7f\u544a"

    .line 13
    .line 14
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g(Lr8/g;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lea/c;

    .line 5
    .line 6
    new-instance v1, Lab/b;

    .line 7
    .line 8
    const-class v2, Lfa/a;

    .line 9
    .line 10
    invoke-static {v2}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const/4 v8, 0x0

    .line 15
    const/16 v9, 0xc

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const-string v5, "logFeatureError"

    .line 19
    .line 20
    const-string v6, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v3, p0

    .line 24
    invoke-direct/range {v1 .. v9}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, p1, v1, v2}, Lea/c;-><init>(Lr8/g;Lab/b;Z)V

    .line 29
    .line 30
    .line 31
    iput-object v0, v3, Lfa/a;->e:Lea/c;

    .line 32
    .line 33
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 34
    .line 35
    new-instance p1, Lab/a;

    .line 36
    .line 37
    const/16 v0, 0x14

    .line 38
    .line 39
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    const/16 v0, -0x64

    .line 43
    .line 44
    const-string v1, "skip_global_mini_program_splash_ads"

    .line 45
    .line 46
    const-string v2, "\u8df3\u8fc7\u5168\u5c40\u5c0f\u7a0b\u5e8f\u5f00\u5c4f\u5e7f\u544a"

    .line 47
    .line 48
    sget-object v4, Lr8/c;->i:Lr8/c;

    .line 49
    .line 50
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->e(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u8df3\u8fc7\u5168\u5c40\u5c0f\u7a0b\u5e8f\u5f00\u5c4f\u5e7f\u544a"

    .line 2
    .line 3
    return-object v0
.end method
