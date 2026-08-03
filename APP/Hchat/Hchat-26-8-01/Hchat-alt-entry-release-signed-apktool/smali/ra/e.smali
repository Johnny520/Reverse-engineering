.class public final Lra/e;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lra/h;


# direct methods
.method public synthetic constructor <init>(Lra/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lra/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lra/e;->b:Lra/h;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget v0, p0, Lra/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 7
    .line 8
    instance-of v0, p1, Landroid/app/Activity;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lra/e;->b:Lra/h;

    .line 13
    .line 14
    check-cast p1, Landroid/app/Activity;

    .line 15
    .line 16
    invoke-static {v0, p1}, Lra/h;->b(Lra/h;Landroid/app/Activity;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 21
    .line 22
    instance-of v0, p1, Landroid/app/Activity;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lra/e;->b:Lra/h;

    .line 27
    .line 28
    check-cast p1, Landroid/app/Activity;

    .line 29
    .line 30
    invoke-static {v0, p1}, Lra/h;->b(Lra/h;Landroid/app/Activity;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 35
    .line 36
    instance-of v0, p1, Landroid/app/Activity;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v0, p0, Lra/e;->b:Lra/h;

    .line 41
    .line 42
    iget-object v0, v0, Lra/h;->g:Ljava/util/WeakHashMap;

    .line 43
    .line 44
    check-cast p1, Landroid/app/Activity;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void

    .line 50
    :pswitch_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 51
    .line 52
    const-string v0, "onSceneEnd"

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    iget-object v2, p0, Lra/e;->b:Lra/h;

    .line 56
    .line 57
    invoke-static {v2, p1, v0, v1}, Lra/h;->a(Lra/h;Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_3
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 62
    .line 63
    const-string v0, "onResume"

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    iget-object v2, p0, Lra/e;->b:Lra/h;

    .line 67
    .line 68
    invoke-static {v2, p1, v0, v1}, Lra/h;->a(Lra/h;Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_4
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 73
    .line 74
    const-string v0, "onCreate"

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    iget-object v2, p0, Lra/e;->b:Lra/h;

    .line 78
    .line 79
    invoke-static {v2, p1, v0, v1}, Lra/h;->a(Lra/h;Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_5
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 84
    .line 85
    const-string v0, "initView"

    .line 86
    .line 87
    const/4 v1, 0x1

    .line 88
    iget-object v2, p0, Lra/e;->b:Lra/h;

    .line 89
    .line 90
    invoke-static {v2, p1, v0, v1}, Lra/h;->a(Lra/h;Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
