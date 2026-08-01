.class public final synthetic LA0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA0/s;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    iget p2, p0, LA0/s;->b:I

    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p2, Lz0/d;->a:Lz0/c;

    .line 8
    .line 9
    const/4 p2, 0x4

    .line 10
    const-string v0, "app"

    .line 11
    .line 12
    const-string v1, "getSharedPreferences(...)"

    .line 13
    .line 14
    invoke-static {v0, p2, v1}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "startReloadIfChangedUnexpectedly"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    :catchall_0
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    const-string v0, "check_app_update_on_enter"

    .line 41
    .line 42
    invoke-interface {p2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 47
    .line 48
    .line 49
    :pswitch_0
    return-void

    .line 50
    :pswitch_1
    sget-object p2, LA0/y;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_2
    :try_start_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_1
    move-exception p1

    .line 65
    const-string p2, "\u7edf\u4e00\u626b\u63cf\u91cd\u542f\u5931\u8d25"

    .line 66
    .line 67
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
