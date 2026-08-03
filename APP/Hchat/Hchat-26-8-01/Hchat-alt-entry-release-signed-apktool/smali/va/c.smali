.class public final Lva/c;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final e:Luf/d;

.field public static final f:[Ljava/lang/String;

.field public static volatile g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Luf/d;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Luf/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lva/c;->e:Luf/d;

    .line 8
    .line 9
    const-string v0, "see_room_member"

    .line 10
    .line 11
    const-string v1, "room_name"

    .line 12
    .line 13
    const-string v2, "expand_room_member"

    .line 14
    .line 15
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lva/c;->f:[Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "profile_id"

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
    new-instance p1, Ls8/d;

    .line 5
    .line 6
    const-string v0, "\u5728\u597d\u53cb\u548c\u7fa4\u804a\u8d44\u6599\u9875\u663e\u793a\u53ef\u590d\u5236\u7684\u5fae\u4fe1 ID"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "profile_id"

    .line 11
    .line 12
    const-string v3, "\u8d44\u6599\u9875\u663e\u793aID"

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
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lva/c;->e:Luf/d;

    .line 5
    .line 6
    iget-object v1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 7
    .line 8
    iget-object p1, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    if-eqz p1, :cond_3

    .line 11
    .line 12
    sget-boolean v2, Lva/c;->g:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    monitor-enter v0

    .line 18
    :try_start_0
    sget-boolean v2, Lva/c;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :cond_1
    :try_start_1
    const-string v2, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"

    .line 25
    .line 26
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    const-string v2, "[Hchat:ProfileId] \u672a\u627e\u5230\u597d\u53cb\u8d44\u6599\u9875\u7c7b"

    .line 33
    .line 34
    invoke-static {v2}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 v3, 0x0

    .line 39
    new-array v3, v3, [Ljava/lang/Class;

    .line 40
    .line 41
    new-instance v4, Lfb/f1;

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    invoke-direct {v4, v1, v5}, Lfb/f1;-><init>(Landroid/content/Context;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3, v4}, Luf/d;->r(Ljava/lang/Class;[Ljava/lang/Class;Lfg/l;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-static {v1, p1}, Luf/d;->s(Landroid/content/Context;Ljava/lang/ClassLoader;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    sput-boolean p1, Lva/c;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    monitor-exit v0

    .line 60
    throw p1

    .line 61
    :cond_3
    :goto_1
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u8d44\u6599\u9875\u663e\u793aID"

    .line 2
    .line 3
    return-object v0
.end method
