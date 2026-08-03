.class public final Lea/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final f:La2/a;

.field public static volatile g:Z


# instance fields
.field public e:Lea/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La2/a;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, La2/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lea/a;->f:La2/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "fake_mini_program_base_lib"

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
    const-string v0, "\u4f2a\u88c5\u542f\u52a8\u57fa\u7840\u5e93\u7248\u672c\u5e76\u963b\u6b62\u5b98\u65b9\u5347\u7ea7\u9875"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "fake_mini_program_base_lib"

    .line 11
    .line 12
    const-string v3, "\u517c\u5bb9\u4f4e\u7248\u672c\u5c0f\u7a0b\u5e8f"

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
    const-class v2, Lea/a;

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
    const/16 v9, 0xa

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
    invoke-direct {v0, p1, v1}, Lea/c;-><init>(Lr8/g;Lab/b;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v3, Lea/a;->e:Lea/c;

    .line 31
    .line 32
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 33
    .line 34
    new-instance p1, Lab/a;

    .line 35
    .line 36
    const/16 v0, 0xe

    .line 37
    .line 38
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    const/16 v0, 0x8

    .line 42
    .line 43
    const-string v1, "fake_mini_program_base_lib"

    .line 44
    .line 45
    const-string v2, "\u517c\u5bb9\u4f4e\u7248\u672c\u5c0f\u7a0b\u5e8f"

    .line 46
    .line 47
    sget-object v4, Lr8/c;->i:Lr8/c;

    .line 48
    .line 49
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u517c\u5bb9\u4f4e\u7248\u672c\u5c0f\u7a0b\u5e8f"

    .line 2
    .line 3
    return-object v0
.end method
