.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏兰世哲;
.super Lde/robv/android/xposed/XC_MethodReplacement;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 3
    .line 4
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodReplacement;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲楪苏兰;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 8
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodReplacement;-><init>()V

    return-void
.end method


# virtual methods
.method public final replaceHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const-wide v0, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
