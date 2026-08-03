.class public final synthetic Lu9/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lu9/h;


# direct methods
.method public synthetic constructor <init>(Lu9/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu9/d;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lu9/d;->h:Lu9/h;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lu9/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu9/d;->h:Lu9/h;

    .line 7
    .line 8
    iget-object v0, v0, Lu9/h;->k:Lsf/i;

    .line 9
    .line 10
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Class;

    .line 15
    .line 16
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "setBottomBlurAreaHeight"

    .line 26
    .line 27
    invoke-static {v0, v2, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_0
    iget-object v0, p0, Lu9/d;->h:Lu9/h;

    .line 33
    .line 34
    iget-object v0, v0, Lu9/h;->k:Lsf/i;

    .line 35
    .line 36
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/Class;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    new-array v1, v1, [Ljava/lang/Class;

    .line 44
    .line 45
    const-string v2, "getBottomBlurAreaHeight"

    .line 46
    .line 47
    invoke-static {v0, v2, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :pswitch_1
    const-string v0, "com.tencent.mm.ui.FrostedContentView"

    .line 53
    .line 54
    iget-object v1, p0, Lu9/d;->h:Lu9/h;

    .line 55
    .line 56
    iget-object v1, v1, Lu9/h;->b:Ljava/lang/ClassLoader;

    .line 57
    .line 58
    invoke-static {v0, v1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
