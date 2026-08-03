.class public final synthetic LYue/ۥۡۥ۟۟;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;


# instance fields
.field public final synthetic ۥ:Ljava/lang/Object;

.field public final synthetic ۥ۟:Ljava/lang/reflect/Method;

.field public final synthetic ۥ۟۟:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۥ۟۟;->ۥ:Ljava/lang/Object;

    iput-object p2, p0, LYue/ۥۡۥ۟۟;->ۥ۟:Ljava/lang/reflect/Method;

    iput-object p3, p0, LYue/ۥۡۥ۟۟;->ۥ۟۟:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    return-void
.end method


# virtual methods
.method public final onClick(Lcom/kongzue/dialogx/interfaces/BaseDialog;Landroid/view/View;)Z
    .locals 3

    iget-object v0, p0, LYue/ۥۡۥ۟۟;->ۥ:Ljava/lang/Object;

    iget-object v1, p0, LYue/ۥۡۥ۟۟;->ۥ۟:Ljava/lang/reflect/Method;

    iget-object v2, p0, LYue/ۥۡۥ۟۟;->ۥ۟۟:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    check-cast p1, Lcom/kongzue/dialogx/dialogs/MessageDialog;

    invoke-static {v0, v1, v2, p1, p2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۢ;->ۥ(Ljava/lang/Object;Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
