.class public final synthetic Ld9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/JFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;


# direct methods
.method public synthetic constructor <init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V
    .locals 0

    iput p2, p0, Ld9;->a:I

    iput-object p1, p0, Ld9;->b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final __call(Lparty/iroiro/luajava/Lua;)I
    .locals 1

    iget v0, p0, Ld9;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld9;->b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/HookAPI;->i(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Ld9;->b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/HookAPI;->j(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_1
    iget-object v0, p0, Ld9;->b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->J(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_2
    iget-object v0, p0, Ld9;->b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->e(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_3
    iget-object v0, p0, Ld9;->b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->T(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
