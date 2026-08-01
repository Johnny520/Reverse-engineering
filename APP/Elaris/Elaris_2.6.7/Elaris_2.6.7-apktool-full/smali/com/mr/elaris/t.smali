.class public final Lcom/mr/elaris/t;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Method;

.field public final synthetic b:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/mr/elaris/t;->a:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/mr/elaris/t;->b:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    const/16 p1, 0x46

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x3

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    aget-object v0, v0, v1

    .line 14
    .line 15
    instance-of v1, v0, Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const v1, 0xe1a515

    .line 26
    .line 27
    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    const-wide/16 v2, 0x28a

    .line 36
    .line 37
    add-long/2addr v0, v2

    .line 38
    sput-wide v0, Lfc;->o:J

    .line 39
    .line 40
    iget-object v0, p0, Lcom/mr/elaris/t;->a:Ljava/lang/reflect/Method;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lfc;->e(Ljava/lang/Class;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lfc;->f()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    aget-object v0, v0, v1

    .line 64
    .line 65
    instance-of v1, v0, Landroid/content/Context;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    check-cast v0, Landroid/content/Context;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    :goto_0
    const-string v1, "repeater legacy long press menu clicked"

    .line 77
    .line 78
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    invoke-static {v1, v1}, Lfc;->b(Landroid/view/View;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, Lcom/mr/elaris/t;->b:Ljava/lang/ClassLoader;

    .line 86
    .line 87
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 88
    .line 89
    const/4 v1, 0x2

    .line 90
    aget-object p1, p1, v1

    .line 91
    .line 92
    invoke-static {p0, v0, p1}, Lcom/mr/elaris/MessageRepeater;->repeatFromLongPressMenu(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    :goto_1
    return-void
.end method
