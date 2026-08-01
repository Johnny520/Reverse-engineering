.class public final Lg7;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;

.field public final synthetic b:Ly7;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Ly7;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg7;->a:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    iput-object p2, p0, Lg7;->b:Ly7;

    .line 4
    .line 5
    iput-object p3, p0, Lg7;->c:Ljava/lang/String;

    .line 6
    .line 7
    const/16 p1, 0x78

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    array-length v0, p1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    aget-object p1, p1, v0

    .line 10
    .line 11
    instance-of v0, p1, Landroid/app/Application;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Landroid/app/Application;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    iget-object v0, p0, Lg7;->c:Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "Instrumentation.callApplicationOnCreate"

    .line 22
    .line 23
    iget-object v2, p0, Lg7;->a:Ljava/lang/ClassLoader;

    .line 24
    .line 25
    iget-object p0, p0, Lg7;->b:Ly7;

    .line 26
    .line 27
    invoke-static {p1, v2, p0, v0, v1}, Lcom/mr/elaris/HookEntry;->g(Landroid/app/Application;Ljava/lang/ClassLoader;Ly7;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader;

    .line 28
    .line 29
    .line 30
    return-void
.end method
