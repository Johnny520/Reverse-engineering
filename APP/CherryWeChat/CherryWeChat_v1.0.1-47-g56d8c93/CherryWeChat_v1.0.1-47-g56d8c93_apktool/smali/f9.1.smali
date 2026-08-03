.class public final synthetic Lf9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:I

.field public final synthetic d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V
    .locals 0

    iput p4, p0, Lf9;->a:I

    iput-object p1, p0, Lf9;->b:Lparty/iroiro/luajava/Lua;

    iput p2, p0, Lf9;->c:I

    iput-object p3, p0, Lf9;->d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lf9;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lf9;->c:I

    iget-object v1, p0, Lf9;->d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v2, p0, Lf9;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->c(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, Lf9;->c:I

    iget-object v1, p0, Lf9;->d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v2, p0, Lf9;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->b(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget v0, p0, Lf9;->c:I

    iget-object v1, p0, Lf9;->d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v2, p0, Lf9;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;->a(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget v0, p0, Lf9;->c:I

    iget-object v1, p0, Lf9;->d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v2, p0, Lf9;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createReplaceCallback$1;->a(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget v0, p0, Lf9;->c:I

    iget-object v1, p0, Lf9;->d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v2, p0, Lf9;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createMethodCallback$1;->b(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget v0, p0, Lf9;->c:I

    iget-object v1, p0, Lf9;->d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v2, p0, Lf9;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createMethodCallback$1;->c(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget v0, p0, Lf9;->c:I

    iget-object v1, p0, Lf9;->d:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v2, p0, Lf9;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createMethodCallback$1;->a(Lparty/iroiro/luajava/Lua;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)LTC;

    move-result-object v0

    return-object v0

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
