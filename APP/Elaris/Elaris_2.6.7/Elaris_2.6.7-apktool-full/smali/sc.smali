.class public final Lsc;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Method;

.field public final synthetic b:Ljava/lang/reflect/Field;

.field public final synthetic c:Ljava/lang/reflect/Method;

.field public final synthetic d:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsc;->a:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iput-object p2, p0, Lsc;->b:Ljava/lang/reflect/Field;

    .line 4
    .line 5
    iput-object p3, p0, Lsc;->c:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    iput-object p4, p0, Lsc;->d:Ljava/lang/reflect/Field;

    .line 8
    .line 9
    const/16 p1, -0x2710

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Lsc;->d:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lvc;->a(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Field;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lvc;->b()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    invoke-static {}, Lvc;->b()V

    .line 12
    .line 13
    .line 14
    throw p0
.end method

.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lsc;->a:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object v1, p0, Lsc;->b:Ljava/lang/reflect/Field;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    :try_start_0
    iget-object v3, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {v3, v0, v1, p1}, Lzc;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :catchall_0
    :cond_0
    const/4 p1, 0x1

    .line 17
    iget-object p0, p0, Lsc;->c:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    invoke-static {v2, p0, p1}, Lvc;->c(Ljava/lang/Object;Ljava/lang/reflect/Method;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
