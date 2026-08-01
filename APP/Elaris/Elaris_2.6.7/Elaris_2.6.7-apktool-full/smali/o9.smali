.class public final Lo9;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lo9;->a:I

    .line 2
    .line 3
    const/16 p1, 0x3c

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget p0, p0, Lo9;->a:I

    .line 7
    .line 8
    if-ltz p0, :cond_1

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    if-ge p0, v1, :cond_1

    .line 12
    .line 13
    aget-object v1, v0, p0

    .line 14
    .line 15
    instance-of v1, v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    aput-object p1, v0, p0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    :goto_0
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 26
    .line 27
    array-length v1, v0

    .line 28
    if-ge p0, v1, :cond_3

    .line 29
    .line 30
    aget-object v1, v0, p0

    .line 31
    .line 32
    instance-of v1, v1, Ljava/lang/Boolean;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 37
    .line 38
    aput-object v1, v0, p0

    .line 39
    .line 40
    :cond_2
    add-int/lit8 p0, p0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_1
    return-void
.end method
