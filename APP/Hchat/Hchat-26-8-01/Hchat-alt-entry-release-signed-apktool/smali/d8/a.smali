.class public final synthetic Ld8/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lh/Hchat/ModuleEntry;

.field public final synthetic i:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;


# direct methods
.method public synthetic constructor <init>(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;I)V
    .locals 0

    .line 1
    iput p5, p0, Ld8/a;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ld8/a;->h:Lh/Hchat/ModuleEntry;

    .line 4
    .line 5
    iput-object p2, p0, Ld8/a;->i:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 6
    .line 7
    iput-object p3, p0, Ld8/a;->j:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p4, p0, Ld8/a;->k:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Ld8/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld8/a;->j:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v1, p0, Ld8/a;->k:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 9
    .line 10
    iget-object v2, p0, Ld8/a;->h:Lh/Hchat/ModuleEntry;

    .line 11
    .line 12
    iget-object v3, p0, Ld8/a;->i:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 13
    .line 14
    invoke-static {v2, v3, v0, v1}, Lh/Hchat/ModuleEntry;->a(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Ld8/a;->j:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v1, p0, Ld8/a;->k:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 21
    .line 22
    iget-object v2, p0, Ld8/a;->h:Lh/Hchat/ModuleEntry;

    .line 23
    .line 24
    iget-object v3, p0, Ld8/a;->i:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 25
    .line 26
    invoke-static {v2, v3, v0, v1}, Lh/Hchat/ModuleEntry;->e(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
