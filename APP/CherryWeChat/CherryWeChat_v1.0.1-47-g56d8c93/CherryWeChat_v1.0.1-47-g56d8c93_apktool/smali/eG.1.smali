.class public final LeG;
.super Lde/robv/android/xposed/XC_MethodHook;
.source ""


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LeG;->a:I

    iput-object p2, p0, LeG;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    iget v0, p0, LeG;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x20dabfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    iget-object v0, p0, LeG;->b:Ljava/lang/Object;

    check-cast v0, LiG;

    iget-object v0, v0, LiG;->i:Lfj;

    if-eqz v0, :cond_0

    new-instance v1, LhG;

    new-instance v2, Lqs;

    invoke-direct {v2, p1}, Lqs;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-direct {v1, v2}, LhG;-><init>(Lqs;)V

    invoke-interface {v0, v1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void

    :pswitch_0
    const-wide v0, -0x20fd0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    iget-object v0, p0, LeG;->b:Ljava/lang/Object;

    check-cast v0, Lqs;

    iget-object v0, v0, Lqs;->d:Ljava/lang/Object;

    check-cast v0, Lfj;

    if-eqz v0, :cond_1

    new-instance v1, LhG;

    new-instance v2, Lqs;

    invoke-direct {v2, p1}, Lqs;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-direct {v1, v2}, LhG;-><init>(Lqs;)V

    invoke-interface {v0, v1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    iget v0, p0, LeG;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x20da5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    iget-object v0, p0, LeG;->b:Ljava/lang/Object;

    check-cast v0, LiG;

    iget-object v0, v0, LiG;->h:Lfj;

    if-eqz v0, :cond_0

    new-instance v1, LhG;

    new-instance v2, Lqs;

    invoke-direct {v2, p1}, Lqs;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-direct {v1, v2}, LhG;-><init>(Lqs;)V

    invoke-interface {v0, v1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void

    :pswitch_0
    const-wide v0, -0x20fcafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    iget-object v0, p0, LeG;->b:Ljava/lang/Object;

    check-cast v0, Lqs;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, Lb;

    if-eqz v0, :cond_1

    new-instance v1, LhG;

    new-instance v2, Lqs;

    invoke-direct {v2, p1}, Lqs;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-direct {v1, v2}, LhG;-><init>(Lqs;)V

    invoke-virtual {v0, v1}, Lb;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
