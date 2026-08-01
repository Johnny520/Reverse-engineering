.class public abstract Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final DO_NOTHING:Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;->DO_NOTHING:Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    return-void
.end method

.method public static returnConstant(ILjava/lang/Object;)Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;
    .locals 1

    .line 8
    new-instance v0, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement$2;

    invoke-direct {v0, p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement$2;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public static returnConstant(Ljava/lang/Object;)Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;
    .locals 1

    .line 1
    const/16 v0, 0x32

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;->returnConstant(ILjava/lang/Object;)Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodReplacement;->replaceHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract replaceHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
.end method
