.class public final L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世兰哲;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    invoke-interface {p0, p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    invoke-interface {p0, p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
