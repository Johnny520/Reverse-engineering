.class public final Lr0/a0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/d0;

.field public final synthetic c:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;Ljava/lang/Class;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/a0;->a:I

    iput-object p1, p0, Lr0/a0;->b:Lr0/d0;

    iput-object p2, p0, Lr0/a0;->c:Ljava/lang/Class;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    iget v0, p0, Lr0/a0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "param"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 12
    .line 13
    const-string v0, "args"

    .line 14
    .line 15
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {v0, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    instance-of v0, p1, Landroid/view/View;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    check-cast p1, Landroid/view/View;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    if-nez p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object v0, p0, Lr0/a0;->c:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, ".performItemClick"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lr0/a0;->b:Lr0/d0;

    .line 47
    .line 48
    invoke-static {v1, p1, v0}, Lr0/d0;->c(Lr0/d0;Landroid/view/View;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    return-void

    .line 52
    :pswitch_0
    const-string v0, "param"

    .line 53
    .line 54
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 58
    .line 59
    instance-of v0, p1, Landroid/view/View;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    check-cast p1, Landroid/view/View;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const/4 p1, 0x0

    .line 67
    :goto_2
    if-nez p1, :cond_3

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    iget-object v0, p0, Lr0/a0;->c:Ljava/lang/Class;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, ".performClick"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v1, p0, Lr0/a0;->b:Lr0/d0;

    .line 83
    .line 84
    invoke-static {v1, p1, v0}, Lr0/d0;->c(Lr0/d0;Landroid/view/View;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :goto_3
    return-void

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
