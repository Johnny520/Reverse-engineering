.class public final Lcs;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lcs;

.field public static final e:I

.field public static final f:Z

.field public static final g:Lwm0;

.field public static final h:Z

.field public static final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcs;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcs;->d:Lcs;

    .line 8
    .line 9
    const v0, 0x790b00e1

    .line 10
    .line 11
    .line 12
    sput v0, Lcs;->e:I

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    sput-boolean v0, Lcs;->f:Z

    .line 16
    .line 17
    sget-object v1, Lwm0;->m:Lwm0;

    .line 18
    .line 19
    sput-object v1, Lcs;->g:Lwm0;

    .line 20
    .line 21
    sput-boolean v0, Lcs;->h:Z

    .line 22
    .line 23
    const-string v0, "ChatAvatarRotator"

    .line 24
    .line 25
    sput-object v0, Lcs;->i:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method

.method public static q()Lbs;
    .locals 4

    .line 1
    sget-object v0, Lpp1;->a:Lpp1;

    .line 2
    .line 3
    invoke-static {}, Lpp1;->c()Lop1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lbs;

    .line 8
    .line 9
    invoke-direct {v1}, Lbs;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lbs;->Companion:Las;

    .line 13
    .line 14
    invoke-virtual {v2}, Las;->serializer()Lw41;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Lse;->D(Lw41;)Lw41;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "ChatAvatarRotator/config"

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1, v3}, Lop1;->b(Lw41;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lbs;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Lbs;

    .line 33
    .line 34
    invoke-direct {v0}, Lbs;-><init>()V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lcs;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    sget-boolean p0, Lcs;->h:Z

    .line 2
    .line 3
    return p0
.end method

.method public final g()V
    .locals 7

    .line 1
    const-string p0, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView"

    .line 2
    .line 3
    invoke-static {p0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v0, p0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_0

    .line 17
    .line 18
    aget-object v2, p0, v1

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v3, Lw;

    .line 24
    .line 25
    const/16 v4, 0x1c

    .line 26
    .line 27
    invoke-direct {v3, v4}, Lw;-><init>(I)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Lkg3;

    .line 31
    .line 32
    sget-object v5, Lcs;->d:Lcs;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-direct {v4, v5, v6, v3}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v4}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-void
.end method

.method public final h(Lvb1;)V
    .locals 0

    .line 1
    invoke-static {}, Lcs;->q()Lbs;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final j(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcs;->q()Lbs;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-wide v0, p0, Lbs;->a:J

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const v0, 0x790b00e6

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public final l()Z
    .locals 0

    .line 1
    sget-boolean p0, Lcs;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lcs;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lcs;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p(Landroid/view/View;Lxm0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :goto_0
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    instance-of p1, p0, Landroid/app/Activity;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    check-cast p0, Landroid/app/Activity;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    :goto_1
    if-nez p0, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-static {}, Lcs;->q()Lbs;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-wide v0, p1, Lbs;->a:J

    .line 44
    .line 45
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v0, Lx;

    .line 50
    .line 51
    const/4 v1, 0x7

    .line 52
    invoke-direct {v0, v1, p1, p2}, Lx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lkw;

    .line 56
    .line 57
    const p2, -0x32ebe17b

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    invoke-direct {p1, p2, v1, v0}, Lkw;-><init>(IZLun0;)V

    .line 62
    .line 63
    .line 64
    new-instance p2, Lt7;

    .line 65
    .line 66
    const/4 v0, 0x4

    .line 67
    invoke-direct {p2, v0, p0, p1}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method
