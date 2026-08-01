.class public final Lq0/e;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq0/f;


# direct methods
.method public synthetic constructor <init>(Lq0/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq0/e;->a:I

    iput-object p1, p0, Lq0/e;->b:Lq0/f;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    iget v0, p0, Lq0/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget-object v0, v0, v1

    .line 10
    .line 11
    check-cast v0, Landroid/content/Intent;

    .line 12
    .line 13
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroid/app/Activity;

    .line 16
    .line 17
    iget-object v1, p0, Lq0/e;->b:Lq0/f;

    .line 18
    .line 19
    invoke-static {v1, p1, v0}, Lq0/f;->a(Lq0/f;Landroid/app/Activity;Landroid/content/Intent;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Landroid/app/Activity;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lq0/e;->b:Lq0/f;

    .line 32
    .line 33
    invoke-static {v1, p1, v0}, Lq0/f;->a(Lq0/f;Landroid/app/Activity;Landroid/content/Intent;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
