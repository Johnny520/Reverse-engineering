.class public final Lr0/U0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/Y0;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lr0/Y0;Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;I)V
    .locals 0

    .line 1
    iput p5, p0, Lr0/U0;->a:I

    iput-object p1, p0, Lr0/U0;->b:Lr0/Y0;

    iput-object p2, p0, Lr0/U0;->c:Landroid/content/Context;

    iput-object p3, p0, Lr0/U0;->d:Ljava/lang/Class;

    iput-object p4, p0, Lr0/U0;->e:Ljava/lang/Class;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget v0, p0, Lr0/U0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lr0/U0;->b:Lr0/Y0;

    .line 20
    .line 21
    iput-object p1, v0, Lr0/Y0;->k:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v0, p0, Lr0/U0;->b:Lr0/Y0;

    .line 24
    .line 25
    iget-object v1, p0, Lr0/U0;->c:Landroid/content/Context;

    .line 26
    .line 27
    iget-object v2, p0, Lr0/U0;->d:Ljava/lang/Class;

    .line 28
    .line 29
    iget-object v3, p0, Lr0/U0;->e:Ljava/lang/Class;

    .line 30
    .line 31
    invoke-virtual {v0, v1, p1, v2, v3}, Lr0/Y0;->k(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lr0/U0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lr0/U0;->b:Lr0/Y0;

    .line 13
    .line 14
    iget-boolean v0, v0, Lr0/Y0;->l:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lr0/U0;->b:Lr0/Y0;

    .line 20
    .line 21
    iget-object v1, p0, Lr0/U0;->c:Landroid/content/Context;

    .line 22
    .line 23
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v3, p0, Lr0/U0;->d:Ljava/lang/Class;

    .line 26
    .line 27
    iget-object v4, p0, Lr0/U0;->e:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2, v3, v4}, Lr0/Y0;->k(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "notifyDataSetChanged"

    .line 42
    .line 43
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lr0/U0;->b:Lr0/Y0;

    .line 54
    .line 55
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Lr0/Y0;->G(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_0
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
