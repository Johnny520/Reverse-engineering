.class public final synthetic LYue/ۥۡۤۨۨ;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;


# instance fields
.field public final synthetic ۥ:Ljava/lang/Class;

.field public final synthetic ۥ۟:LYue/ۥ۟ۤۧ۠;

.field public final synthetic ۥ۟۟:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۤۨۨ;->ۥ:Ljava/lang/Class;

    iput-object p2, p0, LYue/ۥۡۤۨۨ;->ۥ۟:LYue/ۥ۟ۤۧ۠;

    iput-object p3, p0, LYue/ۥۡۤۨۨ;->ۥ۟۟:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    return-void
.end method


# virtual methods
.method public final onClick(Lcom/kongzue/dialogx/interfaces/BaseDialog;Landroid/view/View;)Z
    .locals 3

    iget-object v0, p0, LYue/ۥۡۤۨۨ;->ۥ:Ljava/lang/Class;

    iget-object v1, p0, LYue/ۥۡۤۨۨ;->ۥ۟:LYue/ۥ۟ۤۧ۠;

    iget-object v2, p0, LYue/ۥۡۤۨۨ;->ۥ۟۟:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    check-cast p1, Lcom/kongzue/dialogx/dialogs/MessageDialog;

    invoke-static {v0, v1, v2, p1, p2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟۠;->ۥ(Ljava/lang/Class;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
