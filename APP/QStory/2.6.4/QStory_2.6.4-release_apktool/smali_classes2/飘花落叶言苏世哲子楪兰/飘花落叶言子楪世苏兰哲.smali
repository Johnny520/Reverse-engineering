.class public final L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/InjectHook;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/InjectHook;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/InjectHook;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/InjectHook;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Ltop/suzhelan/qstory/hook/InjectHook;->access$injectOnce(Ltop/suzhelan/qstory/hook/InjectHook;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-static {p0, p1}, Ltop/suzhelan/qstory/hook/InjectHook;->access$injectOnce(Ltop/suzhelan/qstory/hook/InjectHook;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
