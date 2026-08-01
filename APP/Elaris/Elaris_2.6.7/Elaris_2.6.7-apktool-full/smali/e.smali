.class public final Le;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/Class;

.field public final synthetic b:[Ljava/lang/Class;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le;->a:Ljava/lang/Class;

    .line 2
    .line 3
    iput-object p2, p0, Le;->b:[Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p3, p0, Le;->c:Ljava/lang/Object;

    .line 6
    .line 7
    const/16 p1, 0x50

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
    .locals 2

    .line 1
    iget-object v0, p0, Le;->a:Ljava/lang/Class;

    .line 2
    .line 3
    iget-object v1, p0, Le;->b:[Ljava/lang/Class;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lh;->b(Ljava/lang/Class;[Ljava/lang/Class;)I

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Le;->c:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
