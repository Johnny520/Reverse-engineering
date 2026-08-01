.class public final Lr0/K0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/L0;

.field public final synthetic c:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(Lr0/L0;Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/K0;->a:I

    iput-object p1, p0, Lr0/K0;->b:Lr0/L0;

    iput-object p2, p0, Lr0/K0;->c:Ljava/lang/reflect/Method;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget v0, p0, Lr0/K0;->a:I

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
    iget-object v0, p0, Lr0/K0;->b:Lr0/L0;

    .line 12
    .line 13
    invoke-static {v0}, Lr0/L0;->d(Lr0/L0;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Lr0/L0;->n()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v2, p0, Lr0/K0;->c:Ljava/lang/reflect/Method;

    .line 32
    .line 33
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, p1, v1}, Lr0/L0;->b(Lr0/L0;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/util/Set;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :pswitch_0
    const-string v0, "param"

    .line 41
    .line 42
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lr0/K0;->b:Lr0/L0;

    .line 46
    .line 47
    invoke-static {v0}, Lr0/L0;->d(Lr0/L0;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {v0}, Lr0/L0;->n()Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    iget-object v2, p0, Lr0/K0;->c:Ljava/lang/reflect/Method;

    .line 66
    .line 67
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0, p1, v1}, Lr0/L0;->b(Lr0/L0;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/util/Set;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {v0, p1, v1}, Lr0/L0;->c(Lr0/L0;Ljava/lang/Object;Ljava/util/Set;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
