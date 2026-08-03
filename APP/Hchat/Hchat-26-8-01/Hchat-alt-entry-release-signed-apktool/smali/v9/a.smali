.class public final Lv9/a;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Luf/d;

.field public final synthetic c:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(Luf/d;Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 1
    iput p3, p0, Lv9/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lv9/a;->b:Luf/d;

    .line 4
    .line 5
    iput-object p2, p0, Lv9/a;->c:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    iget v0, p0, Lv9/a;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lv9/a;->b:Luf/d;

    .line 10
    .line 11
    iget-object v1, p0, Lv9/a;->c:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    invoke-static {v0, v1}, Luf/d;->a(Luf/d;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, Lv9/a;->b:Luf/d;

    .line 22
    .line 23
    iget-object v1, p0, Lv9/a;->c:Ljava/lang/reflect/Method;

    .line 24
    .line 25
    invoke-static {v0, v1}, Luf/d;->a(Luf/d;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    iget-object v0, p0, Lv9/a;->b:Luf/d;

    .line 34
    .line 35
    iget-object v1, p0, Lv9/a;->c:Ljava/lang/reflect/Method;

    .line 36
    .line 37
    invoke-static {v0, v1}, Luf/d;->a(Luf/d;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2
    iget-object v0, p0, Lv9/a;->b:Luf/d;

    .line 46
    .line 47
    iget-object v1, p0, Lv9/a;->c:Ljava/lang/reflect/Method;

    .line 48
    .line 49
    invoke-static {v0, v1}, Luf/d;->a(Luf/d;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
