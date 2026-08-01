.class Lcom/mr/elaris/xposedcompat/XC_MethodReplacement$2;
.super Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;->returnConstant(ILjava/lang/Object;)Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement$2;->val$result:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public replaceHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement$2;->val$result:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method
