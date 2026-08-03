.class public final synthetic LYue/ۥۡۡۢۧ;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;


# instance fields
.field public final synthetic ۥ:Ljava/lang/String;

.field public final synthetic ۥ۟:Lcom/kongzue/dialogx/dialogs/MessageDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x171

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/MessageDialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡۢۧ;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۡۡۢۧ;->ۥ۟:Lcom/kongzue/dialogx/dialogs/MessageDialog;

    return-void
.end method


# virtual methods
.method public final native onClick(Lcom/kongzue/dialogx/interfaces/BaseDialog;Landroid/view/View;)Z
.end method
