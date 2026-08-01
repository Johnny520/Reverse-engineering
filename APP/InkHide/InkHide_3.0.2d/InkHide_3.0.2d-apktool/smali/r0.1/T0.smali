.class public final Lr0/T0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/Y0;

.field public final synthetic c:Ljava/lang/Class;

.field public final synthetic d:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lr0/Y0;Ljava/lang/Class;Ljava/lang/Class;I)V
    .locals 0

    .line 1
    iput p4, p0, Lr0/T0;->a:I

    iput-object p1, p0, Lr0/T0;->b:Lr0/Y0;

    iput-object p2, p0, Lr0/T0;->c:Ljava/lang/Class;

    iput-object p3, p0, Lr0/T0;->d:Ljava/lang/Class;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/T0;->b:Lr0/Y0;

    .line 2
    .line 3
    iget-object v1, p0, Lr0/T0;->d:Ljava/lang/Class;

    .line 4
    .line 5
    iget-object v2, p0, Lr0/T0;->c:Ljava/lang/Class;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "param"

    .line 9
    .line 10
    iget v5, p0, Lr0/T0;->a:I

    .line 11
    .line 12
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    packed-switch v5, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 19
    .line 20
    const-string v5, "args"

    .line 21
    .line 22
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-static {v5, v4}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 40
    .line 41
    instance-of v4, p1, Landroid/app/Activity;

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    move-object v3, p1

    .line 46
    check-cast v3, Landroid/app/Activity;

    .line 47
    .line 48
    :cond_1
    if-nez v3, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {v0, v3, v2, v1}, Lr0/Y0;->b(Lr0/Y0;Landroid/app/Activity;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void

    .line 55
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 56
    .line 57
    instance-of v4, p1, Landroid/app/Activity;

    .line 58
    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    move-object v3, p1

    .line 62
    check-cast v3, Landroid/app/Activity;

    .line 63
    .line 64
    :cond_3
    if-nez v3, :cond_4

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    sget-boolean v4, Lz0/i;->a:Z

    .line 76
    .line 77
    invoke-static {}, Lz0/g;->A()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    const-string v5, "enabled="

    .line 82
    .line 83
    invoke-static {v5, v4}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const-string v5, "self sns detail resumed"

    .line 88
    .line 89
    filled-new-array {v5, p1, v4}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v3, v2, v1}, Lr0/Y0;->b(Lr0/Y0;Landroid/app/Activity;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
